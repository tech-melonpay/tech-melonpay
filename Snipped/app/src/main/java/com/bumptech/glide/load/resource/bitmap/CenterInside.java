package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class CenterInside extends BitmapTransformation {
    private static final String ID = "com.bumptech.glide.load.resource.bitmap.CenterInside";
    private static final byte[] ID_BYTES = ID.getBytes(Key.CHARSET);

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return obj instanceof CenterInside;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i, int i9) {
        return TransformationUtils.centerInside(bitmapPool, bitmap, i, i9);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }
}
