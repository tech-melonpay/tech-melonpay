package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

/* loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    private static final String TAG = "BitmapEncoder";
    private final ArrayPool arrayPool;
    public static final Option<Integer> COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final Option<Bitmap.CompressFormat> COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    public BitmapEncoder(ArrayPool arrayPool) {
        this.arrayPool = arrayPool;
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap, Options options) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) options.get(COMPRESSION_FORMAT);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public EncodeStrategy getEncodeStrategy(Options options) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #3 {all -> 0x0058, blocks: (B:3:0x0023, B:14:0x0054, B:17:0x0072, B:19:0x0078, B:45:0x00bf, B:43:0x00c2, B:37:0x006d), top: B:2:0x0023 }] */
    @Override // com.bumptech.glide.load.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean encode(com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.Options r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r2 = r8.getFormat(r9, r11)
            int r3 = r9.getWidth()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r9.getHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.GlideTrace.beginSectionFormat(r5, r3, r4, r2)
            long r3 = com.bumptech.glide.util.LogTime.getLogTime()     // Catch: java.lang.Throwable -> L58
            com.bumptech.glide.load.Option<java.lang.Integer> r5 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_QUALITY     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r11.get(r5)     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L58
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L58
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r10 = r8.arrayPool     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            if (r10 == 0) goto L4d
            com.bumptech.glide.load.data.BufferedOutputStream r10 = new com.bumptech.glide.load.data.BufferedOutputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r8.arrayPool     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L4a
            r6 = r10
            goto L4e
        L46:
            r9 = move-exception
            r6 = r7
            goto Lbd
        L4a:
            r10 = move-exception
            r6 = r7
            goto L5f
        L4d:
            r6 = r7
        L4e:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            goto L5a
        L58:
            r9 = move-exception
            goto Lc3
        L5a:
            r10 = 1
            goto L71
        L5c:
            r9 = move-exception
            goto Lbd
        L5e:
            r10 = move-exception
        L5f:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L6b
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L5c
        L6b:
            if (r6 == 0) goto L70
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L70
        L70:
            r10 = 0
        L71:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto Lb9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L58
            r5.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = " of size "
            r5.append(r1)     // Catch: java.lang.Throwable -> L58
            int r1 = com.bumptech.glide.util.Util.getBitmapByteSize(r9)     // Catch: java.lang.Throwable -> L58
            r5.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = " in "
            r5.append(r1)     // Catch: java.lang.Throwable -> L58
            double r1 = com.bumptech.glide.util.LogTime.getElapsedMillis(r3)     // Catch: java.lang.Throwable -> L58
            r5.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = ", options format: "
            r5.append(r1)     // Catch: java.lang.Throwable -> L58
            com.bumptech.glide.load.Option<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.BitmapEncoder.COMPRESSION_FORMAT     // Catch: java.lang.Throwable -> L58
            java.lang.Object r11 = r11.get(r1)     // Catch: java.lang.Throwable -> L58
            r5.append(r11)     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)     // Catch: java.lang.Throwable -> L58
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> L58
            r5.append(r9)     // Catch: java.lang.Throwable -> L58
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L58
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> L58
        Lb9:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            return r10
        Lbd:
            if (r6 == 0) goto Lc2
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> Lc2
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> L58
        Lc3:
            com.bumptech.glide.util.pool.GlideTrace.endSection()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.BitmapEncoder.encode(com.bumptech.glide.load.engine.Resource, java.io.File, com.bumptech.glide.load.Options):boolean");
    }

    @Deprecated
    public BitmapEncoder() {
        this.arrayPool = null;
    }
}
