package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.squareup.picasso.Picasso;

/* compiled from: PicassoDrawable.java */
/* loaded from: classes2.dex */
public final class i extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    public static final Paint f13455h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13456a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13457b;

    /* renamed from: c, reason: collision with root package name */
    public final Picasso.LoadedFrom f13458c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f13459d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13460e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13461f;

    /* renamed from: g, reason: collision with root package name */
    public int f13462g;

    public i(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z10, boolean z11) {
        super(context.getResources(), bitmap);
        this.f13462g = 255;
        this.f13456a = z11;
        this.f13457b = context.getResources().getDisplayMetrics().density;
        this.f13458c = loadedFrom;
        if (loadedFrom == Picasso.LoadedFrom.MEMORY || z10) {
            return;
        }
        this.f13459d = drawable;
        this.f13461f = true;
        this.f13460e = SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f13461f) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.f13460e) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f13461f = false;
                this.f13459d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f13459d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f13462g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f13462g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f13456a) {
            Paint paint = f13455h;
            paint.setColor(-1);
            float f10 = this.f13457b;
            Path path = new Path();
            float f11 = 0;
            path.moveTo(f11, f11);
            float f12 = (int) (16.0f * f10);
            path.lineTo(f12, f11);
            path.lineTo(f11, f12);
            canvas.drawPath(path, paint);
            paint.setColor(this.f13458c.f13388a);
            Path path2 = new Path();
            path2.moveTo(f11, f11);
            float f13 = (int) (f10 * 15.0f);
            path2.lineTo(f13, f11);
            path2.lineTo(f11, f13);
            canvas.drawPath(path2, paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13459d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f13462g = i;
        Drawable drawable = this.f13459d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13459d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
