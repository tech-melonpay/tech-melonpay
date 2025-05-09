package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.luminary.mobile.R;
import g.C0756a;
import y0.C1596C;

/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020w extends r {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f23806d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f23807e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f23808f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f23809g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23810h;
    public boolean i;

    public C1020w(SeekBar seekBar) {
        super(seekBar);
        this.f23808f = null;
        this.f23809g = null;
        this.f23810h = false;
        this.i = false;
        this.f23806d = seekBar;
    }

    @Override // m.r
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f23806d;
        Context context = seekBar.getContext();
        int[] iArr = C0756a.f20735g;
        Z f10 = Z.f(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        C1596C.n(seekBar, seekBar.getContext(), iArr, attributeSet, f10.f23728b, R.attr.seekBarStyle);
        Drawable c2 = f10.c(0);
        if (c2 != null) {
            seekBar.setThumb(c2);
        }
        Drawable b9 = f10.b(1);
        Drawable drawable = this.f23807e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f23807e = b9;
        if (b9 != null) {
            b9.setCallback(seekBar);
            b9.setLayoutDirection(seekBar.getLayoutDirection());
            if (b9.isStateful()) {
                b9.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        TypedArray typedArray = f10.f23728b;
        if (typedArray.hasValue(3)) {
            this.f23809g = C0996F.b(typedArray.getInt(3, -1), this.f23809g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f23808f = f10.a(2);
            this.f23810h = true;
        }
        f10.g();
        c();
    }

    public final void c() {
        Drawable drawable = this.f23807e;
        if (drawable != null) {
            if (this.f23810h || this.i) {
                Drawable mutate = drawable.mutate();
                this.f23807e = mutate;
                if (this.f23810h) {
                    mutate.setTintList(this.f23808f);
                }
                if (this.i) {
                    this.f23807e.setTintMode(this.f23809g);
                }
                if (this.f23807e.isStateful()) {
                    this.f23807e.setState(this.f23806d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f23807e != null) {
            int max = this.f23806d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f23807e.getIntrinsicWidth();
                int intrinsicHeight = this.f23807e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f23807e.setBounds(-i, -i9, i, i9);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f23807e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
