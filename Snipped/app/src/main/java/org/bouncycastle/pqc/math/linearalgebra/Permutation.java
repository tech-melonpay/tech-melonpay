package org.bouncycastle.pqc.math.linearalgebra;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class Permutation {
    private int[] perm;

    public Permutation(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i];
        for (int i9 = i - 1; i9 >= 0; i9--) {
            this.perm[i9] = i9;
        }
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i : iArr) {
            if (i < 0 || i >= length || zArr[i]) {
                return false;
            }
            zArr[i] = true;
        }
        return true;
    }

    public Permutation computeInverse() {
        Permutation permutation = new Permutation(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            permutation.perm[this.perm[length]] = length;
        }
        return permutation;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Permutation) {
            return IntUtils.equals(this.perm, ((Permutation) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int ceilLog256 = IntegerFunctions.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * ceilLog256) + 4];
        LittleEndianConversions.I2OSP(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            LittleEndianConversions.I2OSP(this.perm[i], bArr, (i * ceilLog256) + 4, ceilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return IntUtils.clone(this.perm);
    }

    public int hashCode() {
        return Arrays.hashCode(this.perm);
    }

    public Permutation rightMultiply(Permutation permutation) {
        int length = permutation.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            throw new IllegalArgumentException("length mismatch");
        }
        Permutation permutation2 = new Permutation(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            permutation2.perm[length2] = this.perm[permutation.perm[length2]];
        }
        return permutation2;
    }

    public String toString() {
        String str = "[" + this.perm[0];
        for (int i = 1; i < this.perm.length; i++) {
            StringBuilder r8 = a.r(str, ", ");
            r8.append(this.perm[i]);
            str = r8.toString();
        }
        return v.n(str, "]");
    }

    public Permutation(int i, SecureRandom secureRandom) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i];
        int[] iArr = new int[i];
        for (int i9 = 0; i9 < i; i9++) {
            iArr[i9] = i9;
        }
        int i10 = i;
        for (int i11 = 0; i11 < i; i11++) {
            int nextInt = RandUtils.nextInt(secureRandom, i10);
            i10--;
            this.perm[i11] = iArr[nextInt];
            iArr[nextInt] = iArr[i10];
        }
    }

    public Permutation(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int OS2IP = LittleEndianConversions.OS2IP(bArr, 0);
        int ceilLog256 = IntegerFunctions.ceilLog256(OS2IP - 1);
        if (bArr.length != (OS2IP * ceilLog256) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.perm = new int[OS2IP];
        for (int i = 0; i < OS2IP; i++) {
            this.perm[i] = LittleEndianConversions.OS2IP(bArr, (i * ceilLog256) + 4, ceilLog256);
        }
        if (!isPermutation(this.perm)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public Permutation(int[] iArr) {
        if (!isPermutation(iArr)) {
            throw new IllegalArgumentException("array is not a permutation vector");
        }
        this.perm = IntUtils.clone(iArr);
    }
}
