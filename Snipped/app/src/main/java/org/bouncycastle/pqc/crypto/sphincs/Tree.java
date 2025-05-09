package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes3.dex */
class Tree {

    public static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    public static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i9);
        l_tree(hashFunctions, bArr, i, bArr5, 0, bArr2, i9);
    }

    public static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i9, byte[] bArr3, int i10) {
        int i11;
        int i12 = 67;
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = 0;
            while (true) {
                i11 = i12 >>> 1;
                if (i14 >= i11) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, (i14 * 32) + i9, bArr2, (i14 * 64) + i9, bArr3, (i13 * 64) + i10);
                i14++;
            }
            if ((i12 & 1) != 0) {
                System.arraycopy(bArr2, ((i12 - 1) * 32) + i9, bArr2, (i11 * 32) + i9, 32);
                i11++;
            }
            i12 = i11;
        }
        System.arraycopy(bArr2, i9, bArr, i, 32);
    }

    public static void treehash(HashFunctions hashFunctions, byte[] bArr, int i, int i9, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i10) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i11 = i9 + 1;
        byte[] bArr4 = new byte[i11 * 32];
        int[] iArr = new int[i11];
        int i12 = 1;
        int i13 = (int) (leafaddrVar2.subleaf + (1 << i9));
        int i14 = 0;
        while (leafaddrVar2.subleaf < i13) {
            gen_leaf_wots(hashFunctions, bArr4, i14 * 32, bArr3, i10, bArr2, leafaddrVar2);
            iArr[i14] = 0;
            int i15 = i14 + i12;
            while (i15 > i12) {
                int i16 = iArr[i15 - 1];
                int i17 = i15 - 2;
                if (i16 == iArr[i17]) {
                    int i18 = i17 * 32;
                    int i19 = i12;
                    int[] iArr2 = iArr;
                    hashFunctions.hash_2n_n_mask(bArr4, i18, bArr4, i18, bArr3, i10 + ((i16 + 7) * 64));
                    iArr2[i17] = iArr2[i17] + i19;
                    i15--;
                    i12 = i19;
                    i13 = i13;
                    iArr = iArr2;
                }
            }
            leafaddrVar2.subleaf++;
            i14 = i15;
            i12 = i12;
            i13 = i13;
            iArr = iArr;
        }
        for (int i20 = 0; i20 < 32; i20++) {
            bArr[i + i20] = bArr4[i20];
        }
    }
}
