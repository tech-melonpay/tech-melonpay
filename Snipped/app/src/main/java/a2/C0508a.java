package a2;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: PagePart.java */
/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4248a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f4249b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f4250c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4251d;

    /* renamed from: e, reason: collision with root package name */
    public int f4252e;

    public C0508a(int i, Bitmap bitmap, RectF rectF, boolean z10, int i9) {
        this.f4248a = i;
        this.f4249b = bitmap;
        this.f4250c = rectF;
        this.f4251d = z10;
        this.f4252e = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0508a)) {
            return false;
        }
        C0508a c0508a = (C0508a) obj;
        if (c0508a.f4248a != this.f4248a) {
            return false;
        }
        RectF rectF = c0508a.f4250c;
        float f10 = rectF.left;
        RectF rectF2 = this.f4250c;
        return f10 == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom;
    }
}
