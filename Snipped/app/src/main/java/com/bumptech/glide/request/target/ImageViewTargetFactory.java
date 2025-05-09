package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.camera.core.impl.utils.a;

/* loaded from: classes.dex */
public class ImageViewTargetFactory {
    public <Z> ViewTarget<ImageView, Z> buildTarget(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new BitmapImageViewTarget(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new DrawableImageViewTarget(imageView);
        }
        throw new IllegalArgumentException(a.l("Unhandled class: ", cls, ", try .as*(Class).transcode(ResourceTranscoder)"));
    }
}
