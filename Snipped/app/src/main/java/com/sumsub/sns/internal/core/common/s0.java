package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class s0 {
    public static final void a(ImageView imageView, Bitmap bitmap, boolean z10) {
        Bitmap bitmap2;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap2 = ((BitmapDrawable) drawable).getBitmap()) != null) {
            if (!z10) {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
        }
        imageView.setImageBitmap(bitmap);
    }
}
