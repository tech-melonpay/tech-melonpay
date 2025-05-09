package org.bouncycastle.asn1;

import java.io.InputStream;

/* loaded from: classes2.dex */
public interface ASN1BitStringParser extends ASN1Encodable, InMemoryRepresentable {
    InputStream getBitStream();

    InputStream getOctetStream();

    int getPadBits();
}
