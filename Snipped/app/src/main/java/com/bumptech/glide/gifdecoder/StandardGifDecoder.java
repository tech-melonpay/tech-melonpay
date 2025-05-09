package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class StandardGifDecoder implements GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;
    private static final int COLOR_TRANSPARENT_BLACK = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    private static final String TAG = "StandardGifDecoder";
    private int[] act;
    private Bitmap.Config bitmapConfig;
    private final GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;
    private Boolean isFirstFrameTransparent;
    private byte[] mainPixels;
    private int[] mainScratch;
    private GifHeaderParser parser;
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    private int averageColorsNear(int i, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = i; i16 < this.sampleSize + i; i16++) {
            byte[] bArr = this.mainPixels;
            if (i16 >= bArr.length || i16 >= i9) {
                break;
            }
            int i17 = this.act[bArr[i16] & 255];
            if (i17 != 0) {
                i11 += (i17 >> 24) & 255;
                i12 += (i17 >> 16) & 255;
                i13 += (i17 >> 8) & 255;
                i14 += i17 & 255;
                i15++;
            }
        }
        int i18 = i + i10;
        for (int i19 = i18; i19 < this.sampleSize + i18; i19++) {
            byte[] bArr2 = this.mainPixels;
            if (i19 >= bArr2.length || i19 >= i9) {
                break;
            }
            int i20 = this.act[bArr2[i19] & 255];
            if (i20 != 0) {
                i11 += (i20 >> 24) & 255;
                i12 += (i20 >> 16) & 255;
                i13 += (i20 >> 8) & 255;
                i14 += i20 & 255;
                i15++;
            }
        }
        if (i15 == 0) {
            return 0;
        }
        return ((i11 / i15) << 24) | ((i12 / i15) << 16) | ((i13 / i15) << 8) | (i14 / i15);
    }

    private void copyCopyIntoScratchRobust(GifFrame gifFrame) {
        int i;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.mainScratch;
        int i13 = gifFrame.ih;
        int i14 = this.sampleSize;
        int i15 = i13 / i14;
        int i16 = gifFrame.iy / i14;
        int i17 = gifFrame.iw / i14;
        int i18 = gifFrame.ix / i14;
        boolean z10 = this.framePointer == 0;
        int i19 = this.downsampledWidth;
        int i20 = this.downsampledHeight;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        Boolean bool = this.isFirstFrameTransparent;
        int i21 = 8;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1;
        while (i23 < i15) {
            Boolean bool2 = bool;
            if (gifFrame.interlace) {
                if (i22 >= i15) {
                    int i25 = i24 + 1;
                    i = i15;
                    if (i25 == 2) {
                        i22 = 4;
                    } else if (i25 == 3) {
                        i21 = 4;
                        i24 = i25;
                        i22 = 2;
                    } else if (i25 == 4) {
                        i24 = i25;
                        i22 = 1;
                        i21 = 2;
                    }
                    i24 = i25;
                } else {
                    i = i15;
                }
                i9 = i22 + i21;
            } else {
                i = i15;
                i9 = i22;
                i22 = i23;
            }
            int i26 = i22 + i16;
            boolean z11 = i14 == 1;
            if (i26 < i20) {
                int i27 = i26 * i19;
                int i28 = i27 + i18;
                int i29 = i28 + i17;
                int i30 = i27 + i19;
                if (i30 < i29) {
                    i29 = i30;
                }
                i10 = i9;
                int i31 = i23 * i14 * gifFrame.iw;
                if (z11) {
                    int i32 = i28;
                    while (i32 < i29) {
                        int i33 = i16;
                        int i34 = iArr2[bArr[i31] & 255];
                        if (i34 != 0) {
                            iArr[i32] = i34;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i31 += i14;
                        i32++;
                        i16 = i33;
                    }
                } else {
                    i12 = i16;
                    int i35 = ((i29 - i28) * i14) + i31;
                    int i36 = i28;
                    while (true) {
                        i11 = i17;
                        if (i36 >= i29) {
                            break;
                        }
                        int averageColorsNear = averageColorsNear(i31, i35, gifFrame.iw);
                        if (averageColorsNear != 0) {
                            iArr[i36] = averageColorsNear;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i31 += i14;
                        i36++;
                        i17 = i11;
                    }
                    bool = bool2;
                    i23++;
                    i16 = i12;
                    i15 = i;
                    i17 = i11;
                    i22 = i10;
                }
            } else {
                i10 = i9;
            }
            i12 = i16;
            i11 = i17;
            bool = bool2;
            i23++;
            i16 = i12;
            i15 = i;
            i17 = i11;
            i22 = i10;
        }
        Boolean bool3 = bool;
        if (this.isFirstFrameTransparent == null) {
            this.isFirstFrameTransparent = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void copyIntoScratchFast(GifFrame gifFrame) {
        GifFrame gifFrame2 = gifFrame;
        int[] iArr = this.mainScratch;
        int i = gifFrame2.ih;
        int i9 = gifFrame2.iy;
        int i10 = gifFrame2.iw;
        int i11 = gifFrame2.ix;
        boolean z10 = this.framePointer == 0;
        int i12 = this.downsampledWidth;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        int i13 = 0;
        byte b9 = -1;
        while (i13 < i) {
            int i14 = (i13 + i9) * i12;
            int i15 = i14 + i11;
            int i16 = i15 + i10;
            int i17 = i14 + i12;
            if (i17 < i16) {
                i16 = i17;
            }
            int i18 = gifFrame2.iw * i13;
            int i19 = i15;
            while (i19 < i16) {
                byte b10 = bArr[i18];
                int i20 = i;
                int i21 = b10 & 255;
                if (i21 != b9) {
                    int i22 = iArr2[i21];
                    if (i22 != 0) {
                        iArr[i19] = i22;
                    } else {
                        b9 = b10;
                    }
                }
                i18++;
                i19++;
                i = i20;
            }
            i13++;
            gifFrame2 = gifFrame;
        }
        Boolean bool = this.isFirstFrameTransparent;
        this.isFirstFrameTransparent = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.isFirstFrameTransparent == null && z10 && b9 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void decodeBitmapData(GifFrame gifFrame) {
        int i;
        int i9;
        short s10;
        StandardGifDecoder standardGifDecoder = this;
        if (gifFrame != null) {
            standardGifDecoder.rawData.position(gifFrame.bufferFrameStart);
        }
        if (gifFrame == null) {
            GifHeader gifHeader = standardGifDecoder.header;
            i = gifHeader.width;
            i9 = gifHeader.height;
        } else {
            i = gifFrame.iw;
            i9 = gifFrame.ih;
        }
        int i10 = i * i9;
        byte[] bArr = standardGifDecoder.mainPixels;
        if (bArr == null || bArr.length < i10) {
            standardGifDecoder.mainPixels = standardGifDecoder.bitmapProvider.obtainByteArray(i10);
        }
        byte[] bArr2 = standardGifDecoder.mainPixels;
        if (standardGifDecoder.prefix == null) {
            standardGifDecoder.prefix = new short[4096];
        }
        short[] sArr = standardGifDecoder.prefix;
        if (standardGifDecoder.suffix == null) {
            standardGifDecoder.suffix = new byte[4096];
        }
        byte[] bArr3 = standardGifDecoder.suffix;
        if (standardGifDecoder.pixelStack == null) {
            standardGifDecoder.pixelStack = new byte[4097];
        }
        byte[] bArr4 = standardGifDecoder.pixelStack;
        int readByte = readByte();
        int i11 = 1 << readByte;
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = readByte + 1;
        int i15 = (1 << i14) - 1;
        int i16 = 0;
        for (int i17 = 0; i17 < i11; i17++) {
            sArr[i17] = 0;
            bArr3[i17] = (byte) i17;
        }
        byte[] bArr5 = standardGifDecoder.block;
        int i18 = i14;
        int i19 = i13;
        int i20 = i15;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        while (true) {
            if (i16 >= i10) {
                break;
            }
            if (i21 == 0) {
                i21 = readBlock();
                if (i21 <= 0) {
                    standardGifDecoder.status = 3;
                    break;
                }
                i22 = 0;
            }
            i24 += (bArr5[i22] & 255) << i23;
            i22++;
            i21--;
            int i29 = i23 + 8;
            int i30 = i19;
            int i31 = i18;
            int i32 = i28;
            int i33 = i14;
            int i34 = i26;
            while (true) {
                if (i29 < i31) {
                    i28 = i32;
                    i19 = i30;
                    i23 = i29;
                    standardGifDecoder = this;
                    i26 = i34;
                    i14 = i33;
                    i18 = i31;
                    break;
                }
                int i35 = i13;
                int i36 = i24 & i20;
                i24 >>= i31;
                i29 -= i31;
                if (i36 == i11) {
                    i20 = i15;
                    i31 = i33;
                    i30 = i35;
                    i13 = i30;
                    i32 = -1;
                } else {
                    if (i36 == i12) {
                        i23 = i29;
                        i26 = i34;
                        i19 = i30;
                        i14 = i33;
                        i13 = i35;
                        i28 = i32;
                        i18 = i31;
                        standardGifDecoder = this;
                        break;
                    }
                    if (i32 == -1) {
                        bArr2[i25] = bArr3[i36];
                        i25++;
                        i16++;
                        i32 = i36;
                        i34 = i32;
                        i13 = i35;
                        i29 = i29;
                    } else {
                        if (i36 >= i30) {
                            bArr4[i27] = (byte) i34;
                            i27++;
                            s10 = i32;
                        } else {
                            s10 = i36;
                        }
                        while (s10 >= i11) {
                            bArr4[i27] = bArr3[s10];
                            i27++;
                            s10 = sArr[s10];
                        }
                        i34 = bArr3[s10] & 255;
                        byte b9 = (byte) i34;
                        bArr2[i25] = b9;
                        while (true) {
                            i25++;
                            i16++;
                            if (i27 <= 0) {
                                break;
                            }
                            i27--;
                            bArr2[i25] = bArr4[i27];
                        }
                        byte[] bArr6 = bArr4;
                        if (i30 < 4096) {
                            sArr[i30] = (short) i32;
                            bArr3[i30] = b9;
                            i30++;
                            if ((i30 & i20) == 0 && i30 < 4096) {
                                i31++;
                                i20 += i30;
                            }
                        }
                        i32 = i36;
                        i13 = i35;
                        i29 = i29;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i25, i10, (byte) 0);
    }

    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    private Bitmap getNextBitmap() {
        Boolean bool = this.isFirstFrameTransparent;
        Bitmap obtain = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.bitmapConfig);
        obtain.setHasAlpha(true);
        return obtain;
    }

    private int readBlock() {
        int readByte = readByte();
        if (readByte <= 0) {
            return readByte;
        }
        ByteBuffer byteBuffer = this.rawData;
        byteBuffer.get(this.block, 0, Math.min(readByte, byteBuffer.remaining()));
        return readByte;
    }

    private int readByte() {
        return this.rawData.get() & 255;
    }

    private Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        int i;
        int i9;
        Bitmap bitmap;
        int[] iArr = this.mainScratch;
        int i10 = 0;
        if (gifFrame2 == null) {
            Bitmap bitmap2 = this.previousImage;
            if (bitmap2 != null) {
                this.bitmapProvider.release(bitmap2);
            }
            this.previousImage = null;
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose == 3 && this.previousImage == null) {
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && (i9 = gifFrame2.dispose) > 0) {
            if (i9 == 2) {
                if (!gifFrame.transparency) {
                    GifHeader gifHeader = this.header;
                    int i11 = gifHeader.bgColor;
                    if (gifFrame.lct == null || gifHeader.bgIndex != gifFrame.transIndex) {
                        i10 = i11;
                    }
                }
                int i12 = gifFrame2.ih;
                int i13 = this.sampleSize;
                int i14 = i12 / i13;
                int i15 = gifFrame2.iy / i13;
                int i16 = gifFrame2.iw / i13;
                int i17 = gifFrame2.ix / i13;
                int i18 = this.downsampledWidth;
                int i19 = (i15 * i18) + i17;
                int i20 = (i14 * i18) + i19;
                while (i19 < i20) {
                    int i21 = i19 + i16;
                    for (int i22 = i19; i22 < i21; i22++) {
                        iArr[i22] = i10;
                    }
                    i19 += this.downsampledWidth;
                }
            } else if (i9 == 3 && (bitmap = this.previousImage) != null) {
                int i23 = this.downsampledWidth;
                bitmap.getPixels(iArr, 0, i23, 0, 0, i23, this.downsampledHeight);
            }
        }
        decodeBitmapData(gifFrame);
        if (gifFrame.interlace || this.sampleSize != 1) {
            copyCopyIntoScratchRobust(gifFrame);
        } else {
            copyIntoScratchFast(gifFrame);
        }
        if (this.savePrevious && ((i = gifFrame.dispose) == 0 || i == 1)) {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            Bitmap bitmap3 = this.previousImage;
            int i24 = this.downsampledWidth;
            bitmap3.setPixels(iArr, 0, i24, 0, 0, i24, this.downsampledHeight);
        }
        Bitmap nextBitmap = getNextBitmap();
        int i25 = this.downsampledWidth;
        nextBitmap.setPixels(iArr, 0, i25, 0, 0, i25, this.downsampledHeight);
        return nextBitmap;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.framePointer = (this.framePointer + 1) % this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.header = null;
        byte[] bArr = this.mainPixels;
        if (bArr != null) {
            this.bitmapProvider.release(bArr);
        }
        int[] iArr = this.mainScratch;
        if (iArr != null) {
            this.bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.previousImage;
        if (bitmap != null) {
            this.bitmapProvider.release(bitmap);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = null;
        byte[] bArr2 = this.block;
        if (bArr2 != null) {
            this.bitmapProvider.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return (this.mainScratch.length * 4) + this.rawData.limit() + this.mainPixels.length;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public ByteBuffer getData() {
        return this.rawData;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i) {
        if (i >= 0) {
            GifHeader gifHeader = this.header;
            if (i < gifHeader.frameCount) {
                return gifHeader.frames.get(i).delay;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.header.height;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        int i = this.header.loopCount;
        if (i == -1) {
            return 1;
        }
        return i;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i;
        if (this.header.frameCount <= 0 || (i = this.framePointer) < 0) {
            return 0;
        }
        return getDelay(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x003e, B:14:0x0048, B:16:0x004f, B:17:0x0059, B:19:0x006a, B:20:0x0076, B:23:0x007f, B:25:0x0083, B:27:0x008b, B:28:0x009c, B:32:0x00a0, B:34:0x00a4, B:36:0x00b6, B:38:0x00ba, B:39:0x00be, B:42:0x007b, B:44:0x00c4, B:46:0x00cc, B:49:0x0017, B:51:0x001f, B:52:0x003c), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x003e, B:14:0x0048, B:16:0x004f, B:17:0x0059, B:19:0x006a, B:20:0x0076, B:23:0x007f, B:25:0x0083, B:27:0x008b, B:28:0x009c, B:32:0x00a0, B:34:0x00a4, B:36:0x00b6, B:38:0x00ba, B:39:0x00be, B:42:0x007b, B:44:0x00c4, B:46:0x00cc, B:49:0x0017, B:51:0x001f, B:52:0x003c), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x003e, B:14:0x0048, B:16:0x004f, B:17:0x0059, B:19:0x006a, B:20:0x0076, B:23:0x007f, B:25:0x0083, B:27:0x008b, B:28:0x009c, B:32:0x00a0, B:34:0x00a4, B:36:0x00b6, B:38:0x00ba, B:39:0x00be, B:42:0x007b, B:44:0x00c4, B:46:0x00cc, B:49:0x0017, B:51:0x001f, B:52:0x003c), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x003e, B:14:0x0048, B:16:0x004f, B:17:0x0059, B:19:0x006a, B:20:0x0076, B:23:0x007f, B:25:0x0083, B:27:0x008b, B:28:0x009c, B:32:0x00a0, B:34:0x00a4, B:36:0x00b6, B:38:0x00ba, B:39:0x00be, B:42:0x007b, B:44:0x00c4, B:46:0x00cc, B:49:0x0017, B:51:0x001f, B:52:0x003c), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x003e, B:14:0x0048, B:16:0x004f, B:17:0x0059, B:19:0x006a, B:20:0x0076, B:23:0x007f, B:25:0x0083, B:27:0x008b, B:28:0x009c, B:32:0x00a0, B:34:0x00a4, B:36:0x00b6, B:38:0x00ba, B:39:0x00be, B:42:0x007b, B:44:0x00c4, B:46:0x00cc, B:49:0x0017, B:51:0x001f, B:52:0x003c), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x003e, B:14:0x0048, B:16:0x004f, B:17:0x0059, B:19:0x006a, B:20:0x0076, B:23:0x007f, B:25:0x0083, B:27:0x008b, B:28:0x009c, B:32:0x00a0, B:34:0x00a4, B:36:0x00b6, B:38:0x00ba, B:39:0x00be, B:42:0x007b, B:44:0x00c4, B:46:0x00cc, B:49:0x0017, B:51:0x001f, B:52:0x003c), top: B:3:0x0007 }] */
    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.graphics.Bitmap getNextFrame() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.StandardGifDecoder.getNextFrame():android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        int i = this.header.loopCount;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.header.width;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(InputStream inputStream, int i) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i > 0 ? i + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e10) {
                Log.w(TAG, "Error reading data from stream", e10);
            }
        } else {
            this.status = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e11) {
                Log.w(TAG, "Error closing stream", e11);
            }
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.bitmapConfig = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider) {
        this.pct = new int[256];
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.bitmapProvider = bitmapProvider;
        this.header = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer, int i) {
        try {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.status = 0;
                this.header = gifHeader;
                this.framePointer = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.rawData = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.rawData.order(ByteOrder.LITTLE_ENDIAN);
                this.savePrevious = false;
                Iterator<GifFrame> it = gifHeader.frames.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().dispose == 3) {
                        this.savePrevious = true;
                        break;
                    }
                }
                this.sampleSize = highestOneBit;
                int i9 = gifHeader.width;
                this.downsampledWidth = i9 / highestOneBit;
                int i10 = gifHeader.height;
                this.downsampledHeight = i10 / highestOneBit;
                this.mainPixels = this.bitmapProvider.obtainByteArray(i9 * i10);
                this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(byte[] bArr) {
        try {
            GifHeader parseHeader = getHeaderParser().setData(bArr).parseHeader();
            this.header = parseHeader;
            if (bArr != null) {
                setData(parseHeader, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.status;
    }
}
