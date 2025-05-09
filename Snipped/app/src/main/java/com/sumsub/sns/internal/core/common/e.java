package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f15077a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f15078b;

    public e(Bitmap.Config config) {
        this.f15077a = config;
    }

    public final synchronized Bitmap a(int i, int i9) {
        Bitmap bitmap;
        try {
            bitmap = this.f15078b;
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.getWidth() == i) {
                        if (bitmap.getHeight() != i9) {
                        }
                        this.f15078b = bitmap;
                    }
                }
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
            bitmap = Bitmap.createBitmap(i, i9, this.f15077a);
            this.f15078b = bitmap;
        } catch (Throwable th) {
            throw th;
        }
        return bitmap;
    }

    public final synchronized void a() {
        try {
            Bitmap bitmap = this.f15078b;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f15078b = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
