package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: ImageViewAction.java */
/* loaded from: classes2.dex */
public final class h extends a<ImageView> {
    @Override // com.squareup.picasso.a
    public final void a() {
        this.f13405l = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.a
    public final void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        ImageView imageView = (ImageView) this.f13397c.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.f13395a;
        Context context = picasso.f13375d;
        boolean z10 = picasso.f13382l;
        Paint paint = i.f13455h;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new i(context, bitmap, drawable, loadedFrom, this.f13398d, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.picasso.a
    public final void c() {
        ImageView imageView = (ImageView) this.f13397c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i = this.f13401g;
        if (i != 0) {
            imageView.setImageResource(i);
            return;
        }
        Drawable drawable2 = this.f13402h;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
        }
    }
}
