package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    private static final int MAX_WIDTH = 16;
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static void configureBasepoint(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        final int min = Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3);
        curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == min) {
                    wNafPreCompInfo.setPromotionCountdown(0);
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                wNafPreCompInfo2.setPromotionCountdown(0);
                wNafPreCompInfo2.setConfWidth(min);
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                    wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                    wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                    wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
                }
                return wNafPreCompInfo2;
            }
        });
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i = bitLength >> 1;
        int[] iArr = new int[i];
        BigInteger xor = add.xor(bigInteger);
        int i9 = bitLength - 1;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < i9) {
            if (xor.testBit(i11)) {
                iArr[i10] = i12 | ((bigInteger.testBit(i11) ? -1 : 1) << 16);
                i11++;
                i12 = 1;
                i10++;
            } else {
                i12++;
            }
            i11++;
        }
        int i13 = i10 + 1;
        iArr[i10] = 65536 | i12;
        return i > i13 ? trim(iArr, i13) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i, BigInteger bigInteger) {
        if (i == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int bitLength = (bigInteger.bitLength() / i) + 1;
        int[] iArr = new int[bitLength];
        int i9 = 1 << i;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i12 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i12) == z10) {
                i12++;
            } else {
                bigInteger = bigInteger.shiftRight(i12);
                int intValue = bigInteger.intValue() & i10;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i11) != 0;
                if (z10) {
                    intValue -= i9;
                }
                if (i13 > 0) {
                    i12--;
                }
                iArr[i13] = i12 | (intValue << 16);
                i12 = i;
                i13++;
            }
        }
        return bitLength > i13 ? trim(iArr, i13) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int max = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if ((i | i9) == 0 && bigInteger3.bitLength() <= i10 && bigInteger4.bitLength() <= i10) {
                break;
            }
            int intValue = (bigInteger3.intValue() >>> i10) + i;
            int i12 = intValue & 7;
            int intValue2 = (bigInteger4.intValue() >>> i10) + i9;
            int i13 = intValue2 & 7;
            int i14 = intValue & 1;
            if (i14 != 0) {
                i14 -= intValue & 2;
                if (i12 + i14 == 4 && (intValue2 & 3) == 2) {
                    i14 = -i14;
                }
            }
            int i15 = intValue2 & 1;
            if (i15 != 0) {
                i15 -= intValue2 & 2;
                if (i13 + i15 == 4 && (intValue & 3) == 2) {
                    i15 = -i15;
                }
            }
            if ((i << 1) == i14 + 1) {
                i ^= 1;
            }
            if ((i9 << 1) == i15 + 1) {
                i9 ^= 1;
            }
            i10++;
            if (i10 == 30) {
                bigInteger3 = bigInteger3.shiftRight(30);
                bigInteger4 = bigInteger4.shiftRight(30);
                i10 = 0;
            }
            bArr[i11] = (byte) ((i15 & 15) | (i14 << 4));
            i11++;
        }
        return max > i11 ? trim(bArr, i11) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i = bitLength - 1;
        byte[] bArr = new byte[i];
        BigInteger xor = add.xor(bigInteger);
        int i9 = 1;
        while (i9 < i) {
            if (xor.testBit(i9)) {
                bArr[i9 - 1] = (byte) (bigInteger.testBit(i9) ? -1 : 1);
                i9++;
            }
            i9++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i, BigInteger bigInteger) {
        if (i == 2) {
            return generateNaf(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i9 = 1 << i;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i12 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i12) == z10) {
                i12++;
            } else {
                bigInteger = bigInteger.shiftRight(i12);
                int intValue = bigInteger.intValue() & i10;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i11) != 0;
                if (z10) {
                    intValue -= i9;
                }
                if (i13 > 0) {
                    i12--;
                }
                int i14 = i13 + i12;
                bArr[i14] = (byte) intValue;
                i13 = i14 + 1;
                i12 = i;
            }
        }
        return bitLength > i13 ? trim(bArr, i13) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getWindowSize(int i) {
        return getWindowSize(i, DEFAULT_WINDOW_SIZE_CUTOFFS, 16);
    }

    public static WNafPreCompInfo precompute(final ECPoint eCPoint, final int i, final boolean z10) {
        final ECCurve curve = eCPoint.getCurve();
        return (WNafPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.2
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo, int i9, int i10, boolean z11) {
                return wNafPreCompInfo != null && wNafPreCompInfo.getWidth() >= Math.max(wNafPreCompInfo.getConfWidth(), i9) && checkTable(wNafPreCompInfo.getPreComp(), i10) && (!z11 || checkTable(wNafPreCompInfo.getPreCompNeg(), i10));
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i9) {
                return eCPointArr != null && eCPointArr.length >= i9;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[LOOP:0: B:42:0x00f0->B:43:0x00f2, LOOP_END] */
            @Override // org.bouncycastle.math.ec.PreCompCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo r14) {
                /*
                    Method dump skipped, instructions count: 301
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.ec.WNafUtil.AnonymousClass2.precompute(org.bouncycastle.math.ec.PreCompInfo):org.bouncycastle.math.ec.PreCompInfo");
            }
        });
    }

    public static WNafPreCompInfo precomputeWithPointMap(ECPoint eCPoint, final ECPointMap eCPointMap, final WNafPreCompInfo wNafPreCompInfo, final boolean z10) {
        return (WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.3
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo2, int i, int i9, boolean z11) {
                return wNafPreCompInfo2 != null && wNafPreCompInfo2.getWidth() >= i && checkTable(wNafPreCompInfo2.getPreComp(), i9) && (!z11 || checkTable(wNafPreCompInfo2.getPreCompNeg(), i9));
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i) {
                return eCPointArr != null && eCPointArr.length >= i;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo2 = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int width = WNafPreCompInfo.this.getWidth();
                if (checkExisting(wNafPreCompInfo2, width, WNafPreCompInfo.this.getPreComp().length, z10)) {
                    wNafPreCompInfo2.decrementPromotionCountdown();
                    return wNafPreCompInfo2;
                }
                WNafPreCompInfo wNafPreCompInfo3 = new WNafPreCompInfo();
                wNafPreCompInfo3.setPromotionCountdown(WNafPreCompInfo.this.getPromotionCountdown());
                ECPoint twice = WNafPreCompInfo.this.getTwice();
                if (twice != null) {
                    wNafPreCompInfo3.setTwice(eCPointMap.map(twice));
                }
                ECPoint[] preComp = WNafPreCompInfo.this.getPreComp();
                int length = preComp.length;
                ECPoint[] eCPointArr = new ECPoint[length];
                for (int i = 0; i < preComp.length; i++) {
                    eCPointArr[i] = eCPointMap.map(preComp[i]);
                }
                wNafPreCompInfo3.setPreComp(eCPointArr);
                wNafPreCompInfo3.setWidth(width);
                if (z10) {
                    ECPoint[] eCPointArr2 = new ECPoint[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        eCPointArr2[i9] = eCPointArr[i9].negate();
                    }
                    wNafPreCompInfo3.setPreCompNeg(eCPointArr2);
                }
                return wNafPreCompInfo3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i) {
        ECPoint[] eCPointArr2 = new ECPoint[i];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WNafPreCompInfo) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getWindowSize(int i, int i9) {
        return getWindowSize(i, DEFAULT_WINDOW_SIZE_CUTOFFS, i9);
    }

    private static int[] trim(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static int getWindowSize(int i, int[] iArr) {
        return getWindowSize(i, iArr, 16);
    }

    public static int getWindowSize(int i, int[] iArr, int i9) {
        int i10 = 0;
        while (i10 < iArr.length && i >= iArr[i10]) {
            i10++;
        }
        return Math.max(2, Math.min(i9, i10 + 2));
    }
}
