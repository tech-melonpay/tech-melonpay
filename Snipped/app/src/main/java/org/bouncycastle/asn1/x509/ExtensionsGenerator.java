package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class ExtensionsGenerator {
    private static final Set dupsAllowed;
    private Hashtable extensions = new Hashtable();
    private Vector extOrdering = new Vector();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(Extension.subjectAlternativeName);
        hashSet.add(Extension.issuerAlternativeName);
        hashSet.add(Extension.subjectDirectoryAttributes);
        hashSet.add(Extension.certificateIssuer);
        dupsAllowed = Collections.unmodifiableSet(hashSet);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        addExtension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public Extensions generate() {
        Extension[] extensionArr = new Extension[this.extOrdering.size()];
        for (int i = 0; i != this.extOrdering.size(); i++) {
            extensionArr[i] = (Extension) this.extensions.get(this.extOrdering.elementAt(i));
        }
        return new Extensions(extensionArr);
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.extensions.get(aSN1ObjectIdentifier);
    }

    public boolean hasExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.extensions.containsKey(aSN1ObjectIdentifier);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void removeExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (!this.extensions.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(a.g("extension ", aSN1ObjectIdentifier, " not present"));
        }
        this.extOrdering.removeElement(aSN1ObjectIdentifier);
        this.extensions.remove(aSN1ObjectIdentifier);
    }

    public void replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        replaceExtension(aSN1ObjectIdentifier, z10, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        if (!this.extensions.containsKey(aSN1ObjectIdentifier)) {
            this.extOrdering.addElement(aSN1ObjectIdentifier);
            this.extensions.put(aSN1ObjectIdentifier, new Extension(aSN1ObjectIdentifier, z10, new DEROctetString(Arrays.clone(bArr))));
            return;
        }
        if (!dupsAllowed.contains(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(a.g("extension ", aSN1ObjectIdentifier, " already added"));
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(((Extension) this.extensions.get(aSN1ObjectIdentifier)).getExtnValue()).getOctets());
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(bArr);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(aSN1Sequence2.size() + aSN1Sequence.size());
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
        }
        Enumeration objects2 = aSN1Sequence2.getObjects();
        while (objects2.hasMoreElements()) {
            aSN1EncodableVector.add((ASN1Encodable) objects2.nextElement());
        }
        try {
            this.extensions.put(aSN1ObjectIdentifier, new Extension(aSN1ObjectIdentifier, z10, new DERSequence(aSN1EncodableVector).getEncoded()));
        } catch (IOException e10) {
            throw new ASN1ParsingException(e10.getMessage(), e10);
        }
    }

    public void replaceExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        replaceExtension(new Extension(aSN1ObjectIdentifier, z10, bArr));
    }

    public void replaceExtension(Extension extension) {
        if (this.extensions.containsKey(extension.getExtnId())) {
            this.extensions.put(extension.getExtnId(), extension);
            return;
        }
        throw new IllegalArgumentException("extension " + extension.getExtnId() + " not present");
    }

    public void addExtension(Extension extension) {
        if (!this.extensions.containsKey(extension.getExtnId())) {
            this.extOrdering.addElement(extension.getExtnId());
            this.extensions.put(extension.getExtnId(), extension);
        } else {
            throw new IllegalArgumentException("extension " + extension.getExtnId() + " already added");
        }
    }

    public void addExtension(Extensions extensions) {
        ASN1ObjectIdentifier[] extensionOIDs = extensions.getExtensionOIDs();
        for (int i = 0; i != extensionOIDs.length; i++) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = extensionOIDs[i];
            Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
            addExtension(ASN1ObjectIdentifier.getInstance(aSN1ObjectIdentifier), extension.isCritical(), extension.getExtnValue().getOctets());
        }
    }
}
