package X1;

import android.util.SparseBooleanArray;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PdfFile.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f3929t = new Object();

    /* renamed from: a, reason: collision with root package name */
    public PdfDocument f3930a;

    /* renamed from: b, reason: collision with root package name */
    public final PdfiumCore f3931b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3932c;

    /* renamed from: g, reason: collision with root package name */
    public final Size f3936g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f3937h;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3939k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3940l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3941m;

    /* renamed from: q, reason: collision with root package name */
    public final FitPolicy f3945q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3946r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f3947s;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3933d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3934e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final SparseBooleanArray f3935f = new SparseBooleanArray();
    public SizeF i = new SizeF(0.0f, 0.0f);

    /* renamed from: j, reason: collision with root package name */
    public SizeF f3938j = new SizeF(0.0f, 0.0f);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3942n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3943o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public float f3944p = 0.0f;

    public e(PdfiumCore pdfiumCore, PdfDocument pdfDocument, FitPolicy fitPolicy, Size size, int[] iArr, boolean z10, int i, boolean z11, boolean z12) {
        this.f3932c = 0;
        this.f3936g = new Size(0, 0);
        this.f3937h = new Size(0, 0);
        this.f3931b = pdfiumCore;
        this.f3930a = pdfDocument;
        this.f3945q = fitPolicy;
        this.f3947s = iArr;
        this.f3939k = z10;
        this.f3940l = i;
        this.f3941m = z11;
        this.f3946r = z12;
        if (iArr != null) {
            this.f3932c = iArr.length;
        } else {
            this.f3932c = pdfiumCore.c(pdfDocument);
        }
        for (int i9 = 0; i9 < this.f3932c; i9++) {
            Size e10 = pdfiumCore.e(this.f3930a, a(i9));
            if (e10.f13355a > this.f3936g.f13355a) {
                this.f3936g = e10;
            }
            if (e10.f13356b > this.f3937h.f13356b) {
                this.f3937h = e10;
            }
            this.f3933d.add(e10);
        }
        i(size);
    }

    public final int a(int i) {
        int i9;
        int[] iArr = this.f3947s;
        if (iArr == null) {
            i9 = i;
        } else {
            if (i < 0 || i >= iArr.length) {
                return -1;
            }
            i9 = iArr[i];
        }
        if (i9 < 0 || i >= this.f3932c) {
            return -1;
        }
        return i9;
    }

    public final SizeF b() {
        return this.f3939k ? this.f3938j : this.i;
    }

    public final int c(float f10, float f11) {
        int i = 0;
        for (int i9 = 0; i9 < this.f3932c; i9++) {
            if ((((Float) this.f3942n.get(i9)).floatValue() * f11) - (((this.f3941m ? ((Float) this.f3943o.get(i9)).floatValue() : this.f3940l) * f11) / 2.0f) >= f10) {
                break;
            }
            i++;
        }
        int i10 = i - 1;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public final float d(int i, float f10) {
        SizeF f11 = f(i);
        return (this.f3939k ? f11.f13358b : f11.f13357a) * f10;
    }

    public final float e(int i, float f10) {
        if (a(i) < 0) {
            return 0.0f;
        }
        return ((Float) this.f3942n.get(i)).floatValue() * f10;
    }

    public final SizeF f(int i) {
        return a(i) < 0 ? new SizeF(0.0f, 0.0f) : (SizeF) this.f3934e.get(i);
    }

    public final SizeF g(int i, float f10) {
        SizeF f11 = f(i);
        return new SizeF(f11.f13357a * f10, f11.f13358b * f10);
    }

    public final float h(int i, float f10) {
        float f11;
        float f12;
        SizeF f13 = f(i);
        if (this.f3939k) {
            f11 = b().f13357a;
            f12 = f13.f13357a;
        } else {
            f11 = b().f13358b;
            f12 = f13.f13358b;
        }
        return ((f11 - f12) * f10) / 2.0f;
    }

    public final void i(Size size) {
        float f10;
        float f11;
        float f12;
        SizeF sizeF;
        int i;
        ArrayList arrayList = this.f3934e;
        arrayList.clear();
        d2.a aVar = new d2.a(this.f3945q, this.f3936g, this.f3937h, size, this.f3946r);
        this.f3938j = aVar.f20410c;
        this.i = aVar.f20411d;
        Iterator it = this.f3933d.iterator();
        while (true) {
            f10 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Size size2 = (Size) it.next();
            int i9 = size2.f13355a;
            if (i9 <= 0 || (i = size2.f13356b) <= 0) {
                sizeF = new SizeF(0.0f, 0.0f);
            } else {
                boolean z10 = aVar.f20414g;
                Size size3 = aVar.f20409b;
                float f13 = z10 ? size3.f13355a : i9 * aVar.f20412e;
                float f14 = z10 ? size3.f13356b : i * aVar.f20413f;
                int ordinal = aVar.f20408a.ordinal();
                sizeF = ordinal != 1 ? ordinal != 2 ? d2.a.c(size2, f13) : d2.a.a(size2, f13, f14) : d2.a.b(size2, f14);
            }
            arrayList.add(sizeF);
        }
        int i10 = this.f3940l;
        boolean z11 = this.f3939k;
        ArrayList arrayList2 = this.f3943o;
        boolean z12 = this.f3941m;
        if (z12) {
            arrayList2.clear();
            for (int i11 = 0; i11 < this.f3932c; i11++) {
                SizeF sizeF2 = (SizeF) arrayList.get(i11);
                if (z11) {
                    f11 = size.f13356b;
                    f12 = sizeF2.f13358b;
                } else {
                    f11 = size.f13355a;
                    f12 = sizeF2.f13357a;
                }
                float max = Math.max(0.0f, f11 - f12);
                if (i11 < this.f3932c - 1) {
                    max += i10;
                }
                arrayList2.add(Float.valueOf(max));
            }
        }
        float f15 = 0.0f;
        for (int i12 = 0; i12 < this.f3932c; i12++) {
            SizeF sizeF3 = (SizeF) arrayList.get(i12);
            f15 += z11 ? sizeF3.f13358b : sizeF3.f13357a;
            if (z12) {
                f15 = ((Float) arrayList2.get(i12)).floatValue() + f15;
            } else if (i12 < this.f3932c - 1) {
                f15 += i10;
            }
        }
        this.f3944p = f15;
        ArrayList arrayList3 = this.f3942n;
        arrayList3.clear();
        for (int i13 = 0; i13 < this.f3932c; i13++) {
            SizeF sizeF4 = (SizeF) arrayList.get(i13);
            float f16 = z11 ? sizeF4.f13358b : sizeF4.f13357a;
            if (z12) {
                float floatValue = (((Float) arrayList2.get(i13)).floatValue() / 2.0f) + f10;
                if (i13 == 0) {
                    floatValue -= i10 / 2.0f;
                } else if (i13 == this.f3932c - 1) {
                    floatValue += i10 / 2.0f;
                }
                arrayList3.add(Float.valueOf(floatValue));
                f10 = (((Float) arrayList2.get(i13)).floatValue() / 2.0f) + f16 + floatValue;
            } else {
                arrayList3.add(Float.valueOf(f10));
                f10 = f16 + i10 + f10;
            }
        }
    }
}
