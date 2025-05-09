package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public final class XMSSMTParameters {
    private static final Map<Integer, XMSSMTParameters> paramsLookupTable;
    private final int height;
    private final int layers;
    private final XMSSOid oid;
    private final XMSSParameters xmssParams;

    static {
        HashMap hashMap = new HashMap();
        Integer valueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        hashMap.put(valueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        a.u(20, 4, aSN1ObjectIdentifier, hashMap, Integers.valueOf(2));
        a.u(40, 2, aSN1ObjectIdentifier, hashMap, Integers.valueOf(3));
        a.u(40, 4, aSN1ObjectIdentifier, hashMap, Integers.valueOf(4));
        a.u(40, 8, aSN1ObjectIdentifier, hashMap, Integers.valueOf(5));
        a.u(60, 3, aSN1ObjectIdentifier, hashMap, Integers.valueOf(6));
        a.u(60, 6, aSN1ObjectIdentifier, hashMap, Integers.valueOf(7));
        a.u(60, 12, aSN1ObjectIdentifier, hashMap, Integers.valueOf(8));
        Integer valueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        hashMap.put(valueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        a.u(20, 4, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(10));
        a.u(40, 2, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(11));
        a.u(40, 4, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(12));
        a.u(40, 8, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(13));
        a.u(60, 3, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(14));
        a.u(60, 6, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(15));
        a.u(60, 12, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(16));
        Integer valueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        hashMap.put(valueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        a.u(20, 4, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(18));
        a.u(40, 2, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(19));
        a.u(40, 4, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(20));
        a.u(40, 8, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(21));
        a.u(60, 3, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(22));
        a.u(60, 6, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(23));
        a.u(60, 12, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(24));
        Integer valueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        hashMap.put(valueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        a.u(20, 4, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(26));
        a.u(40, 2, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(27));
        a.u(40, 4, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(28));
        a.u(40, 8, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(29));
        a.u(60, 3, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(30));
        a.u(60, 6, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(31));
        a.u(60, 12, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(32));
        paramsLookupTable = Collections.unmodifiableMap(hashMap);
    }

    public XMSSMTParameters(int i, int i9, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.height = i;
        this.layers = i9;
        this.xmssParams = new XMSSParameters(xmssTreeHeight(i, i9), aSN1ObjectIdentifier);
        this.oid = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i9);
    }

    public static XMSSMTParameters lookupByOID(int i) {
        return paramsLookupTable.get(Integers.valueOf(i));
    }

    private static int xmssTreeHeight(int i, int i9) {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i9 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i10 = i / i9;
        if (i10 != 1) {
            return i10;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public int getLen() {
        return this.xmssParams.getLen();
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    public WOTSPlus getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    public int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    public XMSSParameters getXMSSParameters() {
        return this.xmssParams;
    }

    public XMSSMTParameters(int i, int i9, Digest digest) {
        this(i, i9, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }
}
