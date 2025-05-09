package org.bouncycastle.pqc.crypto.gmss;

import C.v;
import androidx.camera.core.impl.utils.a;
import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.encoders.Hex;
import s3.b;

/* loaded from: classes3.dex */
public class GMSSRootCalc {
    private byte[][] AuthPath;

    /* renamed from: K, reason: collision with root package name */
    private int f25373K;
    private GMSSDigestProvider digestProvider;
    private int heightOfNextSeed;
    private Vector heightOfNodes;
    private int heightOfTree;
    private int[] index;
    private int indexForNextSeed;
    private boolean isFinished;
    private boolean isInitialized;
    private int mdLength;
    private Digest messDigestTree;
    private Vector[] retain;
    private byte[] root;
    private Vector tailStack;
    private Treehash[] treehash;

    public GMSSRootCalc(int i, int i9, GMSSDigestProvider gMSSDigestProvider) {
        this.heightOfTree = i;
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        int digestSize = digest.getDigestSize();
        this.mdLength = digestSize;
        this.f25373K = i9;
        this.index = new int[i];
        int[] iArr = {i, digestSize};
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iArr);
        this.root = new byte[this.mdLength];
        this.retain = new Vector[this.f25373K - 1];
        for (int i10 = 0; i10 < i9 - 1; i10++) {
            this.retain[i10] = new Vector();
        }
    }

    public byte[][] getAuthPath() {
        return GMSSUtils.clone(this.AuthPath);
    }

    public Vector[] getRetain() {
        return GMSSUtils.clone(this.retain);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.root);
    }

    public Vector getStack() {
        Vector vector = new Vector();
        Enumeration elements = this.tailStack.elements();
        while (elements.hasMoreElements()) {
            vector.addElement(elements.nextElement());
        }
        return vector;
    }

    public byte[][] getStatByte() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.heightOfTree + 1 + size, 64);
        bArr[0] = this.root;
        int i = 0;
        while (i < this.heightOfTree) {
            int i9 = i + 1;
            bArr[i9] = this.AuthPath[i];
            i = i9;
        }
        for (int i10 = 0; i10 < size; i10++) {
            bArr[this.heightOfTree + 1 + i10] = (byte[]) this.tailStack.elementAt(i10);
        }
        return bArr;
    }

    public int[] getStatInt() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        int i = this.heightOfTree;
        int[] iArr = new int[i + 8 + size];
        iArr[0] = i;
        iArr[1] = this.mdLength;
        iArr[2] = this.f25373K;
        iArr[3] = this.indexForNextSeed;
        iArr[4] = this.heightOfNextSeed;
        if (this.isFinished) {
            iArr[5] = 1;
        } else {
            iArr[5] = 0;
        }
        if (this.isInitialized) {
            iArr[6] = 1;
        } else {
            iArr[6] = 0;
        }
        iArr[7] = size;
        for (int i9 = 0; i9 < this.heightOfTree; i9++) {
            iArr[i9 + 8] = this.index[i9];
        }
        for (int i10 = 0; i10 < size; i10++) {
            iArr[this.heightOfTree + 8 + i10] = ((Integer) this.heightOfNodes.elementAt(i10)).intValue();
        }
        return iArr;
    }

    public Treehash[] getTreehash() {
        return GMSSUtils.clone(this.treehash);
    }

    public void initialize(Vector vector) {
        int i;
        this.treehash = new Treehash[this.heightOfTree - this.f25373K];
        int i9 = 0;
        while (true) {
            i = this.heightOfTree;
            if (i9 >= i - this.f25373K) {
                break;
            }
            this.treehash[i9] = new Treehash(vector, i9, this.digestProvider.get());
            i9++;
        }
        this.index = new int[i];
        this.AuthPath = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i, this.mdLength);
        this.root = new byte[this.mdLength];
        this.tailStack = new Vector();
        this.heightOfNodes = new Vector();
        this.isInitialized = true;
        this.isFinished = false;
        for (int i10 = 0; i10 < this.heightOfTree; i10++) {
            this.index[i10] = -1;
        }
        this.retain = new Vector[this.f25373K - 1];
        for (int i11 = 0; i11 < this.f25373K - 1; i11++) {
            this.retain[i11] = new Vector();
        }
        this.indexForNextSeed = 3;
        this.heightOfNextSeed = 0;
    }

    public void initializeTreehashSeed(byte[] bArr, int i) {
        this.treehash[i].initializeSeed(bArr);
    }

    public String toString() {
        Vector vector = this.tailStack;
        int size = vector == null ? 0 : vector.size();
        String str = "";
        for (int i = 0; i < this.heightOfTree + 8 + size; i++) {
            str = b.m(v.s(str), getStatInt()[i], " ");
        }
        for (int i9 = 0; i9 < this.heightOfTree + 1 + size; i9++) {
            str = a.n(v.s(str), new String(Hex.encode(getStatByte()[i9])), " ");
        }
        StringBuilder r8 = a.r(str, "  ");
        r8.append(this.digestProvider.get().getDigestSize());
        return r8.toString();
    }

    public void update(byte[] bArr) {
        if (this.isFinished) {
            System.out.print("Too much updates for Tree!!");
            return;
        }
        if (!this.isInitialized) {
            System.err.println("GMSSRootCalc not initialized!");
            return;
        }
        int[] iArr = this.index;
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == 1) {
            System.arraycopy(bArr, 0, this.AuthPath[0], 0, this.mdLength);
        } else if (i == 3 && this.heightOfTree > this.f25373K) {
            this.treehash[0].setFirstNode(bArr);
        }
        int i9 = this.index[0];
        if ((i9 - 3) % 2 == 0 && i9 >= 3 && this.heightOfTree == this.f25373K) {
            this.retain[0].insertElementAt(bArr, 0);
        }
        if (this.index[0] == 0) {
            this.tailStack.addElement(bArr);
            this.heightOfNodes.addElement(Integers.valueOf(0));
            return;
        }
        int i10 = this.mdLength;
        byte[] bArr2 = new byte[i10];
        int i11 = i10 << 1;
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int i12 = 0;
        while (this.tailStack.size() > 0 && i12 == ((Integer) this.heightOfNodes.lastElement()).intValue()) {
            System.arraycopy(this.tailStack.lastElement(), 0, bArr3, 0, this.mdLength);
            Vector vector = this.tailStack;
            vector.removeElementAt(vector.size() - 1);
            Vector vector2 = this.heightOfNodes;
            vector2.removeElementAt(vector2.size() - 1);
            int i13 = this.mdLength;
            System.arraycopy(bArr2, 0, bArr3, i13, i13);
            this.messDigestTree.update(bArr3, 0, i11);
            bArr2 = new byte[this.messDigestTree.getDigestSize()];
            this.messDigestTree.doFinal(bArr2, 0);
            i12++;
            if (i12 < this.heightOfTree) {
                int[] iArr2 = this.index;
                int i14 = iArr2[i12] + 1;
                iArr2[i12] = i14;
                if (i14 == 1) {
                    System.arraycopy(bArr2, 0, this.AuthPath[i12], 0, this.mdLength);
                }
                if (i12 >= this.heightOfTree - this.f25373K) {
                    if (i12 == 0) {
                        System.out.println("M���P");
                    }
                    int i15 = this.index[i12];
                    if ((i15 - 3) % 2 == 0 && i15 >= 3) {
                        this.retain[i12 - (this.heightOfTree - this.f25373K)].insertElementAt(bArr2, 0);
                    }
                } else if (this.index[i12] == 3) {
                    this.treehash[i12].setFirstNode(bArr2);
                }
            }
        }
        this.tailStack.addElement(bArr2);
        this.heightOfNodes.addElement(Integers.valueOf(i12));
        if (i12 == this.heightOfTree) {
            this.isFinished = true;
            this.isInitialized = false;
            this.root = (byte[]) this.tailStack.lastElement();
        }
    }

    public boolean wasFinished() {
        return this.isFinished;
    }

    public boolean wasInitialized() {
        return this.isInitialized;
    }

    public void update(byte[] bArr, byte[] bArr2) {
        int i = this.heightOfNextSeed;
        if (i < this.heightOfTree - this.f25373K && this.indexForNextSeed - 2 == this.index[0]) {
            initializeTreehashSeed(bArr, i);
            this.heightOfNextSeed++;
            this.indexForNextSeed *= 2;
        }
        update(bArr2);
    }
}
