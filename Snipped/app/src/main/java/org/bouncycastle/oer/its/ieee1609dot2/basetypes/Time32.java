package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: classes3.dex */
public class Time32 extends UINT32 {
    public static long etsiEpochMillis = 1072915200000L;

    public Time32(long j10) {
        super(j10);
    }

    public static Time32 getInstance(Object obj) {
        if (obj instanceof UINT32) {
            return new Time32((UINT32) obj);
        }
        if (obj != null) {
            return new Time32(ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public static Time32 now() {
        return ofUnixMillis(System.currentTimeMillis());
    }

    public static Time32 ofUnixMillis(long j10) {
        return new Time32((j10 - etsiEpochMillis) / 1000);
    }

    public String toString() {
        return new Date(toUnixMillis()).toString();
    }

    public long toUnixMillis() {
        return (getValue().longValue() * 1000) + etsiEpochMillis;
    }

    public Time32(BigInteger bigInteger) {
        super(bigInteger);
    }

    public Time32(UINT32 uint32) {
        this(uint32.getValue());
    }
}
