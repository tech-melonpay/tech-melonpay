package X1;

import android.graphics.RectF;
import android.util.TypedValue;
import com.github.barteksc.pdfviewer.PDFView;

/* compiled from: PagesLoader.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final PDFView f3912a;

    /* renamed from: b, reason: collision with root package name */
    public int f3913b;

    /* renamed from: c, reason: collision with root package name */
    public float f3914c;

    /* renamed from: d, reason: collision with root package name */
    public float f3915d;

    /* renamed from: e, reason: collision with root package name */
    public float f3916e;

    /* renamed from: f, reason: collision with root package name */
    public float f3917f;

    /* renamed from: g, reason: collision with root package name */
    public float f3918g;

    /* renamed from: h, reason: collision with root package name */
    public float f3919h;
    public final RectF i = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: j, reason: collision with root package name */
    public final int f3920j;

    /* compiled from: PagesLoader.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3921a;

        /* renamed from: b, reason: collision with root package name */
        public int f3922b;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GridSize{rows=");
            sb2.append(this.f3921a);
            sb2.append(", cols=");
            return androidx.camera.core.impl.utils.a.m(sb2, this.f3922b, '}');
        }
    }

    /* compiled from: PagesLoader.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3923a;

        /* renamed from: b, reason: collision with root package name */
        public int f3924b;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Holder{row=");
            sb2.append(this.f3923a);
            sb2.append(", col=");
            return androidx.camera.core.impl.utils.a.m(sb2, this.f3924b, '}');
        }
    }

    /* compiled from: PagesLoader.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f3925a;

        /* renamed from: b, reason: collision with root package name */
        public a f3926b;

        /* renamed from: c, reason: collision with root package name */
        public b f3927c;

        /* renamed from: d, reason: collision with root package name */
        public b f3928d;

        public final String toString() {
            return "RenderRange{page=" + this.f3925a + ", gridSize=" + this.f3926b + ", leftTop=" + this.f3927c + ", rightBottom=" + this.f3928d + '}';
        }
    }

    public d(PDFView pDFView) {
        this.f3912a = pDFView;
        this.f3920j = (int) TypedValue.applyDimension(1, 20, pDFView.getContext().getResources().getDisplayMetrics());
    }
}
