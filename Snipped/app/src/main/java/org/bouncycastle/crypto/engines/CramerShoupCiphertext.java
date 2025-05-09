package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class CramerShoupCiphertext {

    /* renamed from: e, reason: collision with root package name */
    BigInteger f24953e;

    /* renamed from: u1, reason: collision with root package name */
    BigInteger f24954u1;

    /* renamed from: u2, reason: collision with root package name */
    BigInteger f24955u2;

    /* renamed from: v, reason: collision with root package name */
    BigInteger f24956v;

    public CramerShoupCiphertext() {
    }

    public BigInteger getE() {
        return this.f24953e;
    }

    public BigInteger getU1() {
        return this.f24954u1;
    }

    public BigInteger getU2() {
        return this.f24955u2;
    }

    public BigInteger getV() {
        return this.f24956v;
    }

    public void setE(BigInteger bigInteger) {
        this.f24953e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f24954u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f24955u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f24956v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f24954u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f24955u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f24953e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f24956v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i, length2);
        int i9 = i + length2;
        Pack.intToBigEndian(length3, bArr, i9);
        int i10 = i9 + 4;
        System.arraycopy(byteArray3, 0, bArr, i10, length3);
        int i11 = i10 + length3;
        Pack.intToBigEndian(length4, bArr, i11);
        System.arraycopy(byteArray4, 0, bArr, i11 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.f24954u1.toString());
        stringBuffer.append("\nu2: " + this.f24955u2.toString());
        stringBuffer.append("\ne: " + this.f24953e.toString());
        stringBuffer.append("\nv: " + this.f24956v.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f24954u1 = bigInteger;
        this.f24955u2 = bigInteger2;
        this.f24953e = bigInteger3;
        this.f24956v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i = 4 + bigEndianToInt;
        this.f24954u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i));
        int i9 = bigEndianToInt + 8;
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i) + i9;
        this.f24955u2 = new BigInteger(Arrays.copyOfRange(bArr, i9, bigEndianToInt2));
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, bigEndianToInt2);
        int i10 = bigEndianToInt2 + 4;
        int i11 = bigEndianToInt3 + i10;
        this.f24953e = new BigInteger(Arrays.copyOfRange(bArr, i10, i11));
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i11);
        int i12 = i11 + 4;
        this.f24956v = new BigInteger(Arrays.copyOfRange(bArr, i12, bigEndianToInt4 + i12));
    }
}
