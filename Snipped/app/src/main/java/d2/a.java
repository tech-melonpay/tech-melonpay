package d2;

import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* compiled from: PageSizeCalculator.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final FitPolicy f20408a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f20409b;

    /* renamed from: c, reason: collision with root package name */
    public final SizeF f20410c;

    /* renamed from: d, reason: collision with root package name */
    public final SizeF f20411d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20412e;

    /* renamed from: f, reason: collision with root package name */
    public final float f20413f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20414g;

    public a(FitPolicy fitPolicy, Size size, Size size2, Size size3, boolean z10) {
        this.f20408a = fitPolicy;
        this.f20409b = size3;
        this.f20414g = z10;
        int ordinal = fitPolicy.ordinal();
        int i = size3.f13356b;
        if (ordinal == 1) {
            SizeF b9 = b(size2, i);
            this.f20411d = b9;
            float f10 = b9.f13358b / size2.f13356b;
            this.f20413f = f10;
            this.f20410c = b(size, size.f13356b * f10);
            return;
        }
        int i9 = size3.f13355a;
        if (ordinal != 2) {
            SizeF c2 = c(size, i9);
            this.f20410c = c2;
            float f11 = c2.f13357a / size.f13355a;
            this.f20412e = f11;
            this.f20411d = c(size2, size2.f13355a * f11);
            return;
        }
        float f12 = i;
        SizeF a10 = a(size, i9, f12);
        float f13 = size.f13355a;
        SizeF a11 = a(size2, size2.f13355a * (a10.f13357a / f13), f12);
        this.f20411d = a11;
        float f14 = a11.f13358b / size2.f13356b;
        this.f20413f = f14;
        SizeF a12 = a(size, i9, size.f13356b * f14);
        this.f20410c = a12;
        this.f20412e = a12.f13357a / f13;
    }

    public static SizeF a(Size size, float f10, float f11) {
        float f12 = size.f13355a / size.f13356b;
        float floor = (float) Math.floor(f10 / f12);
        if (floor > f11) {
            f10 = (float) Math.floor(f12 * f11);
        } else {
            f11 = floor;
        }
        return new SizeF(f10, f11);
    }

    public static SizeF b(Size size, float f10) {
        return new SizeF((float) Math.floor(f10 / (size.f13356b / size.f13355a)), f10);
    }

    public static SizeF c(Size size, float f10) {
        return new SizeF(f10, (float) Math.floor(f10 / (size.f13355a / size.f13356b)));
    }
}
