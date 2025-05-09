package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class BitmapPoolAdapter implements BitmapPool {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public Bitmap get(int i, int i9, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i9, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public Bitmap getDirty(int i, int i9, Bitmap.Config config) {
        return get(i, i9, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return 0L;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void put(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void setSizeMultiplier(float f10) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void trimMemory(int i) {
    }
}
