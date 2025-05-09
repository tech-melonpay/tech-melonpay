package org.bouncycastle.crypto.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes2.dex */
public class JournaledAlgorithm implements Encodable, Serializable {
    private transient AlgorithmIdentifier algID;
    private transient JournalingSecureRandom journaling;

    public JournaledAlgorithm(AlgorithmIdentifier algorithmIdentifier, JournalingSecureRandom journalingSecureRandom) {
        if (algorithmIdentifier == null) {
            throw new NullPointerException("AlgorithmIdentifier passed to JournaledAlgorithm is null");
        }
        if (journalingSecureRandom == null) {
            throw new NullPointerException("JournalingSecureRandom passed to JournaledAlgorithm is null");
        }
        this.journaling = journalingSecureRandom;
        this.algID = algorithmIdentifier;
    }

    public static JournaledAlgorithm getState(File file, SecureRandom secureRandom) {
        if (file == null) {
            throw new NullPointerException("File for loading is null in JournaledAlgorithm");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            return new JournaledAlgorithm(Streams.readAll(bufferedInputStream), secureRandom);
        } finally {
            bufferedInputStream.close();
        }
    }

    private void initFromEncoding(byte[] bArr, SecureRandom secureRandom) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
        this.algID = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.journaling = new JournalingSecureRandom(a.C(aSN1Sequence, 1), secureRandom);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        initFromEncoding((byte[]) objectInputStream.readObject(), CryptoServicesRegistrar.getSecureRandom());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algID;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.algID);
        aSN1EncodableVector.add(new DEROctetString(this.journaling.getFullTranscript()));
        return new DERSequence(aSN1EncodableVector).getEncoded();
    }

    public JournalingSecureRandom getJournalingSecureRandom() {
        return this.journaling;
    }

    public void storeState(File file) {
        if (file == null) {
            throw new NullPointerException("file for storage is null in JournaledAlgorithm");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            storeState(fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    public JournaledAlgorithm(byte[] bArr) {
        this(bArr, CryptoServicesRegistrar.getSecureRandom());
    }

    public static JournaledAlgorithm getState(InputStream inputStream, SecureRandom secureRandom) {
        if (inputStream == null) {
            throw new NullPointerException("stream for loading is null in JournaledAlgorithm");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            return new JournaledAlgorithm(Streams.readAll(bufferedInputStream), secureRandom);
        } finally {
            bufferedInputStream.close();
        }
    }

    public void storeState(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException("output stream for storage is null in JournaledAlgorithm");
        }
        outputStream.write(getEncoded());
    }

    public JournaledAlgorithm(byte[] bArr, SecureRandom secureRandom) {
        if (bArr == null) {
            throw new NullPointerException("encoding passed to JournaledAlgorithm is null");
        }
        if (secureRandom == null) {
            throw new NullPointerException("random passed to JournaledAlgorithm is null");
        }
        initFromEncoding(bArr, secureRandom);
    }
}
