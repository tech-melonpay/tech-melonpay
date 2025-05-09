package org.bouncycastle.crypto.generators;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class Argon2BytesGenerator {
    private static final int ARGON2_ADDRESSES_IN_BLOCK = 128;
    private static final int ARGON2_BLOCK_SIZE = 1024;
    private static final int ARGON2_PREHASH_DIGEST_LENGTH = 64;
    private static final int ARGON2_PREHASH_SEED_LENGTH = 72;
    private static final int ARGON2_QWORDS_IN_BLOCK = 128;
    private static final int ARGON2_SYNC_POINTS = 4;
    private static final long M32L = 4294967295L;
    private static final int MAX_PARALLELISM = 16777216;
    private static final int MIN_ITERATIONS = 1;
    private static final int MIN_OUTLEN = 4;
    private static final int MIN_PARALLELISM = 1;
    private static final byte[] ZERO_BYTES = new byte[4];
    private int laneLength;
    private Block[] memory;
    private Argon2Parameters parameters;
    private int segmentLength;

    public static class Block {
        private static final int SIZE = 128;

        /* renamed from: v, reason: collision with root package name */
        private final long[] f24991v;

        private Block() {
            this.f24991v = new long[128];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void copyBlock(Block block) {
            System.arraycopy(block.f24991v, 0, this.f24991v, 0, 128);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xor(Block block, Block block2) {
            long[] jArr = this.f24991v;
            long[] jArr2 = block.f24991v;
            long[] jArr3 = block2.f24991v;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr2[i] ^ jArr3[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block) {
            long[] jArr = this.f24991v;
            long[] jArr2 = block.f24991v;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ jArr2[i];
            }
        }

        public Block clear() {
            Arrays.fill(this.f24991v, 0L);
            return this;
        }

        public void fromBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("input shorter than blocksize");
            }
            Pack.littleEndianToLong(bArr, 0, this.f24991v);
        }

        public void toBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("output shorter than blocksize");
            }
            Pack.longToLittleEndian(this.f24991v, bArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block, Block block2) {
            long[] jArr = this.f24991v;
            long[] jArr2 = block.f24991v;
            long[] jArr3 = block2.f24991v;
            for (int i = 0; i < 128; i++) {
                jArr[i] = jArr[i] ^ (jArr2[i] ^ jArr3[i]);
            }
        }
    }

    public static class FillBlock {
        Block R;

        /* renamed from: Z, reason: collision with root package name */
        Block f24992Z;
        Block addressBlock;
        Block inputBlock;

        private FillBlock() {
            this.R = new Block();
            this.f24992Z = new Block();
            this.addressBlock = new Block();
            this.inputBlock = new Block();
        }

        private void applyBlake() {
            for (int i = 0; i < 8; i++) {
                int i9 = i * 16;
                Argon2BytesGenerator.roundFunction(this.f24992Z, i9, i9 + 1, i9 + 2, i9 + 3, i9 + 4, i9 + 5, i9 + 6, i9 + 7, i9 + 8, i9 + 9, i9 + 10, i9 + 11, i9 + 12, i9 + 13, i9 + 14, i9 + 15);
            }
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = i10 * 2;
                Argon2BytesGenerator.roundFunction(this.f24992Z, i11, i11 + 1, i11 + 16, i11 + 17, i11 + 32, i11 + 33, i11 + 48, i11 + 49, i11 + 64, i11 + 65, i11 + 80, i11 + 81, i11 + 96, i11 + 97, i11 + 112, i11 + 113);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2) {
            this.f24992Z.copyBlock(block);
            applyBlake();
            block2.xor(block, this.f24992Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlockWithXor(Block block, Block block2, Block block3) {
            this.R.xor(block, block2);
            this.f24992Z.copyBlock(this.R);
            applyBlake();
            block3.xorWith(this.R, this.f24992Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2, Block block3) {
            this.R.xor(block, block2);
            this.f24992Z.copyBlock(this.R);
            applyBlake();
            block3.xor(this.R, this.f24992Z);
        }
    }

    public static class Position {
        int lane;
        int pass;
        int slice;
    }

    private static void F(long[] jArr, int i, int i9, int i10, int i11) {
        quarterRound(jArr, i, i9, i11, 32);
        quarterRound(jArr, i10, i11, i9, 24);
        quarterRound(jArr, i, i9, i11, 16);
        quarterRound(jArr, i10, i11, i9, 63);
    }

    private static void addByteString(byte[] bArr, Digest digest, byte[] bArr2) {
        if (bArr2 == null) {
            digest.update(ZERO_BYTES, 0, 4);
            return;
        }
        Pack.intToLittleEndian(bArr2.length, bArr, 0);
        digest.update(bArr, 0, 4);
        digest.update(bArr2, 0, bArr2.length);
    }

    private void digest(byte[] bArr, byte[] bArr2, int i, int i9) {
        Block block = this.memory[this.laneLength - 1];
        for (int i10 = 1; i10 < this.parameters.getLanes(); i10++) {
            int i11 = this.laneLength;
            block.xorWith(this.memory[(i11 - 1) + (i10 * i11)]);
        }
        block.toBytes(bArr);
        hash(bArr, bArr2, i, i9);
    }

    private void doInit(Argon2Parameters argon2Parameters) {
        int memory = argon2Parameters.getMemory();
        if (memory < argon2Parameters.getLanes() * 8) {
            memory = argon2Parameters.getLanes() * 8;
        }
        int lanes = memory / (argon2Parameters.getLanes() * 4);
        this.segmentLength = lanes;
        this.laneLength = lanes * 4;
        initMemory(argon2Parameters.getLanes() * 4 * lanes);
    }

    private void fillFirstBlocks(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[72];
        System.arraycopy(bArr2, 0, bArr3, 0, 64);
        bArr3[64] = 1;
        for (int i = 0; i < this.parameters.getLanes(); i++) {
            Pack.intToLittleEndian(i, bArr2, 68);
            Pack.intToLittleEndian(i, bArr3, 68);
            hash(bArr2, bArr, 0, 1024);
            this.memory[this.laneLength * i].fromBytes(bArr);
            hash(bArr3, bArr, 0, 1024);
            this.memory[(this.laneLength * i) + 1].fromBytes(bArr);
        }
    }

    private void fillMemoryBlocks() {
        FillBlock fillBlock = new FillBlock();
        Position position = new Position();
        for (int i = 0; i < this.parameters.getIterations(); i++) {
            position.pass = i;
            for (int i9 = 0; i9 < 4; i9++) {
                position.slice = i9;
                for (int i10 = 0; i10 < this.parameters.getLanes(); i10++) {
                    position.lane = i10;
                    fillSegment(fillBlock, position);
                }
            }
        }
    }

    private void fillSegment(FillBlock fillBlock, Position position) {
        Block block;
        Block block2;
        boolean isDataIndependentAddressing = isDataIndependentAddressing(position);
        int startingIndex = getStartingIndex(position);
        int i = (position.slice * this.segmentLength) + (position.lane * this.laneLength) + startingIndex;
        int prevOffset = getPrevOffset(i);
        if (isDataIndependentAddressing) {
            Block clear = fillBlock.addressBlock.clear();
            Block clear2 = fillBlock.inputBlock.clear();
            initAddressBlocks(fillBlock, position, clear2, clear);
            block = clear;
            block2 = clear2;
        } else {
            block = null;
            block2 = null;
        }
        boolean isWithXor = isWithXor(position);
        int i9 = startingIndex;
        int i10 = prevOffset;
        while (true) {
            int i11 = i;
            if (i9 >= this.segmentLength) {
                return;
            }
            long pseudoRandom = getPseudoRandom(fillBlock, i9, block, block2, i10, isDataIndependentAddressing);
            int refLane = getRefLane(position, pseudoRandom);
            int refColumn = getRefColumn(position, i9, pseudoRandom, refLane == position.lane);
            Block[] blockArr = this.memory;
            Block block3 = blockArr[i10];
            Block block4 = blockArr[(this.laneLength * refLane) + refColumn];
            Block block5 = blockArr[i11];
            if (isWithXor) {
                fillBlock.fillBlockWithXor(block3, block4, block5);
            } else {
                fillBlock.fillBlock(block3, block4, block5);
            }
            i = i11 + 1;
            i9++;
            i10 = i11;
        }
    }

    private int getPrevOffset(int i) {
        return i % this.laneLength == 0 ? (i + r0) - 1 : i - 1;
    }

    private long getPseudoRandom(FillBlock fillBlock, int i, Block block, Block block2, int i9, boolean z10) {
        if (!z10) {
            return this.memory[i9].f24991v[0];
        }
        int i10 = i % 128;
        if (i10 == 0) {
            nextAddresses(fillBlock, block2, block);
        }
        return block.f24991v[i10];
    }

    private int getRefColumn(Position position, int i, long j10, boolean z10) {
        int i9;
        int i10;
        int i11 = position.pass;
        int i12 = 0;
        int i13 = position.slice;
        if (i11 != 0) {
            int i14 = this.segmentLength;
            int i15 = this.laneLength;
            int i16 = ((i13 + 1) * i14) % i15;
            int i17 = i15 - i14;
            if (z10) {
                i9 = (i17 + i) - 1;
            } else {
                i9 = i17 + (i != 0 ? 0 : -1);
            }
            i12 = i16;
            i10 = i9;
        } else if (z10) {
            i10 = ((i13 * this.segmentLength) + i) - 1;
        } else {
            i10 = (i13 * this.segmentLength) + (i != 0 ? 0 : -1);
        }
        long j11 = j10 & 4294967295L;
        return ((int) (i12 + ((i10 - 1) - ((i10 * ((j11 * j11) >>> 32)) >>> 32)))) % this.laneLength;
    }

    private int getRefLane(Position position, long j10) {
        int lanes = (int) ((j10 >>> 32) % this.parameters.getLanes());
        return (position.pass == 0 && position.slice == 0) ? position.lane : lanes;
    }

    private static int getStartingIndex(Position position) {
        return (position.pass == 0 && position.slice == 0) ? 2 : 0;
    }

    private void hash(byte[] bArr, byte[] bArr2, int i, int i9) {
        byte[] bArr3 = new byte[4];
        Pack.intToLittleEndian(i9, bArr3, 0);
        if (i9 <= 64) {
            Blake2bDigest blake2bDigest = new Blake2bDigest(i9 * 8);
            blake2bDigest.update(bArr3, 0, 4);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, i);
            return;
        }
        Blake2bDigest blake2bDigest2 = new Blake2bDigest(512);
        byte[] bArr4 = new byte[64];
        blake2bDigest2.update(bArr3, 0, 4);
        blake2bDigest2.update(bArr, 0, bArr.length);
        blake2bDigest2.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, i, 32);
        int i10 = i + 32;
        int i11 = 2;
        int i12 = ((i9 + 31) / 32) - 2;
        while (i11 <= i12) {
            blake2bDigest2.update(bArr4, 0, 64);
            blake2bDigest2.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i10, 32);
            i11++;
            i10 += 32;
        }
        Blake2bDigest blake2bDigest3 = new Blake2bDigest((i9 - (i12 * 32)) * 8);
        blake2bDigest3.update(bArr4, 0, 64);
        blake2bDigest3.doFinal(bArr2, i10);
    }

    private void initAddressBlocks(FillBlock fillBlock, Position position, Block block, Block block2) {
        block.f24991v[0] = intToLong(position.pass);
        block.f24991v[1] = intToLong(position.lane);
        block.f24991v[2] = intToLong(position.slice);
        block.f24991v[3] = intToLong(this.memory.length);
        block.f24991v[4] = intToLong(this.parameters.getIterations());
        block.f24991v[5] = intToLong(this.parameters.getType());
        if (position.pass == 0 && position.slice == 0) {
            nextAddresses(fillBlock, block, block2);
        }
    }

    private void initMemory(int i) {
        this.memory = new Block[i];
        int i9 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i9 >= blockArr.length) {
                return;
            }
            blockArr[i9] = new Block();
            i9++;
        }
    }

    private void initialize(byte[] bArr, byte[] bArr2, int i) {
        Blake2bDigest blake2bDigest = new Blake2bDigest(512);
        Pack.intToLittleEndian(new int[]{this.parameters.getLanes(), i, this.parameters.getMemory(), this.parameters.getIterations(), this.parameters.getVersion(), this.parameters.getType()}, bArr, 0);
        blake2bDigest.update(bArr, 0, 24);
        addByteString(bArr, blake2bDigest, bArr2);
        addByteString(bArr, blake2bDigest, this.parameters.getSalt());
        addByteString(bArr, blake2bDigest, this.parameters.getSecret());
        addByteString(bArr, blake2bDigest, this.parameters.getAdditional());
        byte[] bArr3 = new byte[72];
        blake2bDigest.doFinal(bArr3, 0);
        fillFirstBlocks(bArr, bArr3);
    }

    private long intToLong(int i) {
        return i & 4294967295L;
    }

    private boolean isDataIndependentAddressing(Position position) {
        if (this.parameters.getType() != 1) {
            return this.parameters.getType() == 2 && position.pass == 0 && position.slice < 2;
        }
        return true;
    }

    private boolean isWithXor(Position position) {
        return (position.pass == 0 || this.parameters.getVersion() == 16) ? false : true;
    }

    private void nextAddresses(FillBlock fillBlock, Block block, Block block2) {
        long[] jArr = block.f24991v;
        jArr[6] = jArr[6] + 1;
        fillBlock.fillBlock(block, block2);
        fillBlock.fillBlock(block2, block2);
    }

    private static void quarterRound(long[] jArr, int i, int i9, int i10, int i11) {
        long j10 = jArr[i];
        long j11 = jArr[i9];
        long j12 = jArr[i10];
        long a10 = a.a((j10 & 4294967295L) * 2, j11 & 4294967295L, j11, j10);
        long rotateRight = Longs.rotateRight(j12 ^ a10, i11);
        jArr[i] = a10;
        jArr[i10] = rotateRight;
    }

    private void reset() {
        if (this.memory == null) {
            return;
        }
        int i = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i >= blockArr.length) {
                return;
            }
            Block block = blockArr[i];
            if (block != null) {
                block.clear();
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void roundFunction(Block block, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23) {
        long[] jArr = block.f24991v;
        F(jArr, i, i12, i16, i20);
        F(jArr, i9, i13, i17, i21);
        F(jArr, i10, i14, i18, i22);
        F(jArr, i11, i15, i19, i23);
        F(jArr, i, i13, i18, i23);
        F(jArr, i9, i14, i19, i20);
        F(jArr, i10, i15, i16, i21);
        F(jArr, i11, i12, i17, i22);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    public void init(Argon2Parameters argon2Parameters) {
        this.parameters = argon2Parameters;
        if (argon2Parameters.getLanes() < 1) {
            throw new IllegalStateException("lanes must be greater than 1");
        }
        if (argon2Parameters.getLanes() > MAX_PARALLELISM) {
            throw new IllegalStateException("lanes must be less than 16777216");
        }
        if (argon2Parameters.getMemory() >= argon2Parameters.getLanes() * 2) {
            if (argon2Parameters.getIterations() < 1) {
                throw new IllegalStateException("iterations is less than: 1");
            }
            doInit(argon2Parameters);
        } else {
            throw new IllegalStateException("memory is less than: " + (argon2Parameters.getLanes() * 2) + " expected " + (argon2Parameters.getLanes() * 2));
        }
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i, int i9) {
        if (i9 < 4) {
            throw new IllegalStateException("output length less than 4");
        }
        byte[] bArr3 = new byte[1024];
        initialize(bArr3, bArr, i9);
        fillMemoryBlocks();
        digest(bArr3, bArr2, i, i9);
        reset();
        return i9;
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i, int i9) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr, i, i9);
    }
}
