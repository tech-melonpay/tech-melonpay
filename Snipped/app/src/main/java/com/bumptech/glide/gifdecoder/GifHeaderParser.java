package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.camera.core.impl.utils.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GifHeaderParser {
    static final int DEFAULT_FRAME_DELAY = 10;
    private static final int DESCRIPTOR_MASK_INTERLACE_FLAG = 64;
    private static final int DESCRIPTOR_MASK_LCT_FLAG = 128;
    private static final int DESCRIPTOR_MASK_LCT_SIZE = 7;
    private static final int EXTENSION_INTRODUCER = 33;
    private static final int GCE_DISPOSAL_METHOD_SHIFT = 2;
    private static final int GCE_MASK_DISPOSAL_METHOD = 28;
    private static final int GCE_MASK_TRANSPARENT_COLOR_FLAG = 1;
    private static final int IMAGE_SEPARATOR = 44;
    private static final int LABEL_APPLICATION_EXTENSION = 255;
    private static final int LABEL_COMMENT_EXTENSION = 254;
    private static final int LABEL_GRAPHIC_CONTROL_EXTENSION = 249;
    private static final int LABEL_PLAIN_TEXT_EXTENSION = 1;
    private static final int LSD_MASK_GCT_FLAG = 128;
    private static final int LSD_MASK_GCT_SIZE = 7;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_BLOCK_SIZE = 256;
    static final int MIN_FRAME_DELAY = 2;
    private static final String TAG = "GifHeaderParser";
    private static final int TRAILER = 59;
    private final byte[] block = new byte[256];
    private int blockSize = 0;
    private GifHeader header;
    private ByteBuffer rawData;

    private boolean err() {
        return this.header.status != 0;
    }

    private int read() {
        try {
            return this.rawData.get() & 255;
        } catch (Exception unused) {
            this.header.status = 1;
            return 0;
        }
    }

    private void readBitmap() {
        this.header.currentFrame.ix = readShort();
        this.header.currentFrame.iy = readShort();
        this.header.currentFrame.iw = readShort();
        this.header.currentFrame.ih = readShort();
        int read = read();
        boolean z10 = (read & 128) != 0;
        int pow = (int) Math.pow(2.0d, (read & 7) + 1);
        GifFrame gifFrame = this.header.currentFrame;
        gifFrame.interlace = (read & 64) != 0;
        if (z10) {
            gifFrame.lct = readColorTable(pow);
        } else {
            gifFrame.lct = null;
        }
        this.header.currentFrame.bufferFrameStart = this.rawData.position();
        skipImageData();
        if (err()) {
            return;
        }
        GifHeader gifHeader = this.header;
        gifHeader.frameCount++;
        gifHeader.frames.add(gifHeader.currentFrame);
    }

    private void readBlock() {
        int read = read();
        this.blockSize = read;
        if (read <= 0) {
            return;
        }
        int i = 0;
        int i9 = 0;
        while (true) {
            try {
                i9 = this.blockSize;
                if (i >= i9) {
                    return;
                }
                i9 -= i;
                this.rawData.get(this.block, i, i9);
                i += i9;
            } catch (Exception e10) {
                if (Log.isLoggable(TAG, 3)) {
                    StringBuilder q10 = a.q(i, i9, "Error Reading Block n: ", " count: ", " blockSize: ");
                    q10.append(this.blockSize);
                    Log.d(TAG, q10.toString(), e10);
                }
                this.header.status = 1;
                return;
            }
        }
    }

    private int[] readColorTable(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.rawData.get(bArr);
            iArr = new int[256];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i) {
                int i11 = bArr[i10] & 255;
                int i12 = i10 + 2;
                int i13 = bArr[i10 + 1] & 255;
                i10 += 3;
                int i14 = i9 + 1;
                iArr[i9] = (i13 << 8) | (i11 << 16) | (-16777216) | (bArr[i12] & 255);
                i9 = i14;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Format Error Reading Color Table", e10);
            }
            this.header.status = 1;
        }
        return iArr;
    }

    private void readContents() {
        readContents(Integer.MAX_VALUE);
    }

    private void readGraphicControlExt() {
        read();
        int read = read();
        GifFrame gifFrame = this.header.currentFrame;
        int i = (read & 28) >> 2;
        gifFrame.dispose = i;
        if (i == 0) {
            gifFrame.dispose = 1;
        }
        gifFrame.transparency = (read & 1) != 0;
        int readShort = readShort();
        if (readShort < 2) {
            readShort = 10;
        }
        GifFrame gifFrame2 = this.header.currentFrame;
        gifFrame2.delay = readShort * 10;
        gifFrame2.transIndex = read();
        read();
    }

    private void readHeader() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb2.append((char) read());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.header.status = 1;
            return;
        }
        readLSD();
        if (!this.header.gctFlag || err()) {
            return;
        }
        GifHeader gifHeader = this.header;
        gifHeader.gct = readColorTable(gifHeader.gctSize);
        GifHeader gifHeader2 = this.header;
        gifHeader2.bgColor = gifHeader2.gct[gifHeader2.bgIndex];
    }

    private void readLSD() {
        this.header.width = readShort();
        this.header.height = readShort();
        int read = read();
        GifHeader gifHeader = this.header;
        gifHeader.gctFlag = (read & 128) != 0;
        gifHeader.gctSize = (int) Math.pow(2.0d, (read & 7) + 1);
        this.header.bgIndex = read();
        this.header.pixelAspect = read();
    }

    private void readNetscapeExt() {
        do {
            readBlock();
            byte[] bArr = this.block;
            if (bArr[0] == 1) {
                this.header.loopCount = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.blockSize <= 0) {
                return;
            }
        } while (!err());
    }

    private int readShort() {
        return this.rawData.getShort();
    }

    private void reset() {
        this.rawData = null;
        Arrays.fill(this.block, (byte) 0);
        this.header = new GifHeader();
        this.blockSize = 0;
    }

    private void skip() {
        int read;
        do {
            read = read();
            this.rawData.position(Math.min(this.rawData.position() + read, this.rawData.limit()));
        } while (read > 0);
    }

    private void skipImageData() {
        read();
        skip();
    }

    public void clear() {
        this.rawData = null;
        this.header = null;
    }

    public boolean isAnimated() {
        readHeader();
        if (!err()) {
            readContents(2);
        }
        return this.header.frameCount > 1;
    }

    public GifHeader parseHeader() {
        if (this.rawData == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (err()) {
            return this.header;
        }
        readHeader();
        if (!err()) {
            readContents();
            GifHeader gifHeader = this.header;
            if (gifHeader.frameCount < 0) {
                gifHeader.status = 1;
            }
        }
        return this.header;
    }

    public GifHeaderParser setData(ByteBuffer byteBuffer) {
        reset();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.rawData = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.rawData.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private void readContents(int i) {
        boolean z10 = false;
        while (!z10 && !err() && this.header.frameCount <= i) {
            int read = read();
            if (read == 33) {
                int read2 = read();
                if (read2 == 1) {
                    skip();
                } else if (read2 == LABEL_GRAPHIC_CONTROL_EXTENSION) {
                    this.header.currentFrame = new GifFrame();
                    readGraphicControlExt();
                } else if (read2 == 254) {
                    skip();
                } else if (read2 != 255) {
                    skip();
                } else {
                    readBlock();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i9 = 0; i9 < 11; i9++) {
                        sb2.append((char) this.block[i9]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        readNetscapeExt();
                    } else {
                        skip();
                    }
                }
            } else if (read == 44) {
                GifHeader gifHeader = this.header;
                if (gifHeader.currentFrame == null) {
                    gifHeader.currentFrame = new GifFrame();
                }
                readBitmap();
            } else if (read != 59) {
                this.header.status = 1;
            } else {
                z10 = true;
            }
        }
    }

    public GifHeaderParser setData(byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
        } else {
            this.rawData = null;
            this.header.status = 2;
        }
        return this;
    }
}
