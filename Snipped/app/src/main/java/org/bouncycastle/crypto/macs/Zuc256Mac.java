package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.Zuc128CoreEngine;
import org.bouncycastle.crypto.engines.Zuc256CoreEngine;

/* loaded from: classes2.dex */
public final class Zuc256Mac implements Mac {
    private static final int TOPBIT = 128;
    private int theByteIndex;
    private final InternalZuc256Engine theEngine;
    private final int[] theKeyStream;
    private final int[] theMac;
    private final int theMacLength;
    private Zuc256CoreEngine theState;
    private int theWordIndex;

    public static class InternalZuc256Engine extends Zuc256CoreEngine {
        public InternalZuc256Engine(int i) {
            super(i);
        }

        public int createKeyStreamWord() {
            return super.makeKeyStreamWord();
        }
    }

    public Zuc256Mac(int i) {
        this.theEngine = new InternalZuc256Engine(i);
        this.theMacLength = i;
        int i9 = i / 32;
        this.theMac = new int[i9];
        this.theKeyStream = new int[i9 + 1];
    }

    private int getKeyStreamWord(int i, int i9) {
        int[] iArr = this.theKeyStream;
        int i10 = this.theWordIndex;
        int i11 = iArr[(i10 + i) % iArr.length];
        if (i9 == 0) {
            return i11;
        }
        int i12 = iArr[((i10 + i) + 1) % iArr.length];
        return (i12 >>> (32 - i9)) | (i11 << i9);
    }

    private void initKeyStream() {
        int i = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.theMac;
            if (i9 >= iArr.length) {
                break;
            }
            iArr[i9] = this.theEngine.createKeyStreamWord();
            i9++;
        }
        while (true) {
            int[] iArr2 = this.theKeyStream;
            if (i >= iArr2.length - 1) {
                this.theWordIndex = iArr2.length - 1;
                this.theByteIndex = 3;
                return;
            } else {
                iArr2[i] = this.theEngine.createKeyStreamWord();
                i++;
            }
        }
    }

    private void shift4Final() {
        int i = (this.theByteIndex + 1) % 4;
        this.theByteIndex = i;
        if (i == 0) {
            this.theWordIndex = (this.theWordIndex + 1) % this.theKeyStream.length;
        }
    }

    private void shift4NextByte() {
        int i = (this.theByteIndex + 1) % 4;
        this.theByteIndex = i;
        if (i == 0) {
            this.theKeyStream[this.theWordIndex] = this.theEngine.createKeyStreamWord();
            this.theWordIndex = (this.theWordIndex + 1) % this.theKeyStream.length;
        }
    }

    private void updateMac(int i) {
        int i9 = 0;
        while (true) {
            int[] iArr = this.theMac;
            if (i9 >= iArr.length) {
                return;
            }
            iArr[i9] = iArr[i9] ^ getKeyStreamWord(i9, i);
            i9++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        shift4Final();
        updateMac(this.theByteIndex * 8);
        int i9 = 0;
        while (true) {
            int[] iArr = this.theMac;
            if (i9 >= iArr.length) {
                reset();
                return getMacSize();
            }
            Zuc128CoreEngine.encode32be(iArr[i9], bArr, (i9 * 4) + i);
            i9++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.theMacLength;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.theMacLength / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        this.theEngine.init(true, cipherParameters);
        this.theState = (Zuc256CoreEngine) this.theEngine.copy();
        initKeyStream();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Zuc256CoreEngine zuc256CoreEngine = this.theState;
        if (zuc256CoreEngine != null) {
            this.theEngine.reset(zuc256CoreEngine);
        }
        initKeyStream();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b9) {
        shift4NextByte();
        int i = this.theByteIndex * 8;
        int i9 = 128;
        int i10 = 0;
        while (i9 > 0) {
            if ((b9 & i9) != 0) {
                updateMac(i + i10);
            }
            i9 >>= 1;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            update(bArr[i + i10]);
        }
    }
}
