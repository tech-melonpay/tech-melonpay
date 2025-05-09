package org.bouncycastle.tls;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class TrustedAuthority {
    protected Object identifier;
    protected short identifierType;

    public TrustedAuthority(short s10, Object obj) {
        if (!isCorrectType(s10, obj)) {
            throw new IllegalArgumentException("'identifier' is not an instance of the correct type");
        }
        this.identifierType = s10;
        this.identifier = obj;
    }

    public static boolean isCorrectType(short s10, Object obj) {
        if (s10 == 0) {
            return obj == null;
        }
        if (s10 != 1) {
            if (s10 == 2) {
                return obj instanceof X500Name;
            }
            if (s10 != 3) {
                throw new IllegalArgumentException("'identifierType' is an unsupported IdentifierType");
            }
        }
        return isSHA1Hash(obj);
    }

    public static boolean isSHA1Hash(Object obj) {
        return (obj instanceof byte[]) && ((byte[]) obj).length == 20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        if (r0 == 3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.bouncycastle.tls.TrustedAuthority parse(java.io.InputStream r3) {
        /*
            short r0 = org.bouncycastle.tls.TlsUtils.readUint8(r3)
            if (r0 == 0) goto L2a
            r1 = 1
            if (r0 == r1) goto L23
            r2 = 2
            if (r0 == r2) goto L10
            r1 = 3
            if (r0 != r1) goto L1b
            goto L23
        L10:
            byte[] r3 = org.bouncycastle.tls.TlsUtils.readOpaque16(r3, r1)
            org.bouncycastle.asn1.ASN1Primitive r3 = org.bouncycastle.tls.TlsUtils.readDERObject(r3)
            org.bouncycastle.asn1.x500.X500Name.getInstance(r3)
        L1b:
            org.bouncycastle.tls.TlsFatalAlert r3 = new org.bouncycastle.tls.TlsFatalAlert
            r0 = 50
            r3.<init>(r0)
            throw r3
        L23:
            r1 = 20
            byte[] r3 = org.bouncycastle.tls.TlsUtils.readFully(r1, r3)
            goto L2b
        L2a:
            r3 = 0
        L2b:
            org.bouncycastle.tls.TrustedAuthority r1 = new org.bouncycastle.tls.TrustedAuthority
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.tls.TrustedAuthority.parse(java.io.InputStream):org.bouncycastle.tls.TrustedAuthority");
    }

    public void checkCorrectType(short s10) {
        if (this.identifierType == s10 && isCorrectType(s10, this.identifier)) {
            return;
        }
        throw new IllegalStateException("TrustedAuthority is not of type " + IdentifierType.getName(s10));
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.identifierType, outputStream);
        short s10 = this.identifierType;
        if (s10 != 0) {
            if (s10 != 1) {
                if (s10 == 2) {
                    TlsUtils.writeOpaque16(((X500Name) this.identifier).getEncoded(ASN1Encoding.DER), outputStream);
                    return;
                } else if (s10 != 3) {
                    throw new TlsFatalAlert((short) 80);
                }
            }
            outputStream.write((byte[]) this.identifier);
        }
    }

    public byte[] getCertSHA1Hash() {
        return Arrays.clone((byte[]) this.identifier);
    }

    public Object getIdentifier() {
        return this.identifier;
    }

    public short getIdentifierType() {
        return this.identifierType;
    }

    public byte[] getKeySHA1Hash() {
        return Arrays.clone((byte[]) this.identifier);
    }

    public X500Name getX509Name() {
        checkCorrectType((short) 2);
        return (X500Name) this.identifier;
    }
}
