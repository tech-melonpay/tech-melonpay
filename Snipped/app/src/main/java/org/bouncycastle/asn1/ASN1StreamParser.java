package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z10) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z10);
        }
    }

    public ASN1Encodable implParseObject(int i) {
        set00Check(false);
        int readTagNumber = ASN1InputStream.readTagNumber(this._in, i);
        int readLength = ASN1InputStream.readLength(this._in, this._limit, readTagNumber == 3 || readTagNumber == 4 || readTagNumber == 16 || readTagNumber == 17 || readTagNumber == 8);
        if (readLength < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit, this.tmpBuffers);
            int i9 = i & 192;
            return i9 != 0 ? 64 == i9 ? new BERApplicationSpecificParser(readTagNumber, aSN1StreamParser) : new BERTaggedObjectParser(i9, readTagNumber, aSN1StreamParser) : aSN1StreamParser.parseImplicitConstructedIL(readTagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, readLength, this._limit);
        if ((i & BERTags.FLAGS) == 0) {
            return parseImplicitPrimitive(readTagNumber, definiteLengthInputStream);
        }
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getLimit(), this.tmpBuffers);
        int i10 = i & 192;
        if (i10 == 0) {
            return aSN1StreamParser2.parseImplicitConstructedDL(readTagNumber);
        }
        boolean z10 = (i & 32) != 0;
        return 64 == i10 ? (DLApplicationSpecific) aSN1StreamParser2.loadTaggedDL(i10, readTagNumber, z10) : new DLTaggedObjectParser(i10, readTagNumber, z10, aSN1StreamParser2);
    }

    public ASN1Primitive loadTaggedDL(int i, int i9, boolean z10) {
        return !z10 ? ASN1TaggedObject.createPrimitive(i, i9, ((DefiniteLengthInputStream) this._in).toByteArray()) : ASN1TaggedObject.createConstructedDL(i, i9, readVector());
    }

    public ASN1Primitive loadTaggedIL(int i, int i9) {
        return ASN1TaggedObject.createConstructedIL(i, i9, readVector());
    }

    public ASN1Encodable parseImplicitConstructedDL(int i) {
        if (i == 3) {
            return new BERBitStringParser(this);
        }
        if (i == 4) {
            return new BEROctetStringParser(this);
        }
        if (i == 8) {
            return new DERExternalParser(this);
        }
        if (i == 16) {
            return new DLSequenceParser(this);
        }
        if (i == 17) {
            return new DLSetParser(this);
        }
        throw new ASN1Exception(androidx.camera.core.impl.utils.a.g(i, new StringBuilder("unknown DL object encountered: 0x")));
    }

    public ASN1Encodable parseImplicitConstructedIL(int i) {
        if (i == 3) {
            return new BERBitStringParser(this);
        }
        if (i == 4) {
            return new BEROctetStringParser(this);
        }
        if (i == 8) {
            return new DERExternalParser(this);
        }
        if (i == 16) {
            return new BERSequenceParser(this);
        }
        if (i == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception(androidx.camera.core.impl.utils.a.g(i, new StringBuilder("unknown BER object encountered: 0x")));
    }

    public ASN1Encodable parseImplicitPrimitive(int i) {
        return parseImplicitPrimitive(i, (DefiniteLengthInputStream) this._in);
    }

    public ASN1Encodable parseObject(int i) {
        if (i < 0 || i > 30) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "invalid universal tag number: "));
        }
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        if ((read & (-33)) == i) {
            return implParseObject(read);
        }
        throw new IOException(com.google.android.gms.measurement.internal.a.g(read, "unexpected identifier encountered: "));
    }

    public ASN1TaggedObjectParser parseTaggedObject() {
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        if ((read & 192) != 0) {
            return (ASN1TaggedObjectParser) implParseObject(read);
        }
        throw new ASN1Exception("no tagged object found");
    }

    public ASN1Encodable readObject() {
        int read = this._in.read();
        if (read < 0) {
            return null;
        }
        return implParseObject(read);
    }

    public ASN1EncodableVector readVector() {
        int read = this._in.read();
        if (read < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable implParseObject = implParseObject(read);
            aSN1EncodableVector.add(implParseObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) implParseObject).getLoadedObject() : implParseObject.toASN1Primitive());
            read = this._in.read();
        } while (read >= 0);
        return aSN1EncodableVector;
    }

    public ASN1StreamParser(InputStream inputStream, int i) {
        this(inputStream, i, new byte[11][]);
    }

    public ASN1Encodable parseImplicitPrimitive(int i, DefiniteLengthInputStream definiteLengthInputStream) {
        if (i == 3) {
            return new DLBitStringParser(definiteLengthInputStream);
        }
        if (i == 4) {
            return new DEROctetStringParser(definiteLengthInputStream);
        }
        if (i == 8) {
            throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i == 16) {
            throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i == 17) {
            throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return ASN1InputStream.createPrimitiveDERObject(i, definiteLengthInputStream, this.tmpBuffers);
        } catch (IllegalArgumentException e10) {
            throw new ASN1Exception("corrupted stream detected", e10);
        }
    }

    public ASN1StreamParser(InputStream inputStream, int i, byte[][] bArr) {
        this._in = inputStream;
        this._limit = i;
        this.tmpBuffers = bArr;
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
