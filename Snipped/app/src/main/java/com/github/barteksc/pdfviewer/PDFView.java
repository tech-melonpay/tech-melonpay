package com.github.barteksc.pdfviewer;

import C.N;
import X1.c;
import X1.d;
import X1.e;
import a2.C0508a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import b2.InterfaceC0585a;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.SnapEdge;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PDFView extends RelativeLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f8804A;

    /* renamed from: B, reason: collision with root package name */
    public final PdfiumCore f8805B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8806C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8807D;

    /* renamed from: E, reason: collision with root package name */
    public final PaintFlagsDrawFilter f8808E;

    /* renamed from: F, reason: collision with root package name */
    public int f8809F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8810G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8811H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f8812I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8813J;

    /* renamed from: K, reason: collision with root package name */
    public a f8814K;

    /* renamed from: a, reason: collision with root package name */
    public float f8815a;

    /* renamed from: b, reason: collision with root package name */
    public float f8816b;

    /* renamed from: c, reason: collision with root package name */
    public float f8817c;

    /* renamed from: d, reason: collision with root package name */
    public final X1.b f8818d;

    /* renamed from: e, reason: collision with root package name */
    public final X1.a f8819e;

    /* renamed from: f, reason: collision with root package name */
    public final c f8820f;

    /* renamed from: g, reason: collision with root package name */
    public e f8821g;

    /* renamed from: h, reason: collision with root package name */
    public int f8822h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f8823j;

    /* renamed from: k, reason: collision with root package name */
    public float f8824k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8825l;

    /* renamed from: m, reason: collision with root package name */
    public State f8826m;

    /* renamed from: n, reason: collision with root package name */
    public com.github.barteksc.pdfviewer.a f8827n;

    /* renamed from: o, reason: collision with root package name */
    public HandlerThread f8828o;

    /* renamed from: p, reason: collision with root package name */
    public b f8829p;

    /* renamed from: q, reason: collision with root package name */
    public final d f8830q;

    /* renamed from: r, reason: collision with root package name */
    public N f8831r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f8832s;

    /* renamed from: t, reason: collision with root package name */
    public FitPolicy f8833t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8834u;

    /* renamed from: v, reason: collision with root package name */
    public int f8835v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8836w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8837x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8838y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8839z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f8840a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f8841b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f8842c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f8843d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f8844e;

        static {
            State state = new State("DEFAULT", 0);
            f8840a = state;
            State state2 = new State("LOADED", 1);
            f8841b = state2;
            State state3 = new State("SHOWN", 2);
            f8842c = state3;
            State state4 = new State("ERROR", 3);
            f8843d = state4;
            f8844e = new State[]{state, state2, state3, state4};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f8844e.clone();
        }
    }

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final N f8845a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f8846b = null;

        /* renamed from: c, reason: collision with root package name */
        public final Y1.a f8847c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8848d;

        /* renamed from: e, reason: collision with root package name */
        public final FitPolicy f8849e;

        public a(N n10) {
            Y1.a aVar = new Y1.a();
            aVar.f4097a = PDFView.this;
            this.f8847c = aVar;
            this.f8848d = true;
            this.f8849e = FitPolicy.f8876a;
            this.f8845a = n10;
        }

        public final void a() {
            PDFView pDFView = PDFView.this;
            if (!pDFView.f8813J) {
                pDFView.f8814K = this;
                return;
            }
            pDFView.q();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.getClass();
            pDFView.f8831r.f535b = this.f8847c;
            pDFView.setSwipeEnabled(true);
            pDFView.setNightMode(false);
            pDFView.f8838y = true;
            pDFView.setDefaultPage(0);
            pDFView.setSwipeVertical(true);
            pDFView.f8806C = false;
            pDFView.setScrollHandle(null);
            pDFView.f8807D = this.f8848d;
            pDFView.setSpacing(0);
            pDFView.setAutoSpacing(false);
            pDFView.setPageFitPolicy(this.f8849e);
            pDFView.setFitEachPage(false);
            pDFView.setPageSnap(false);
            pDFView.setPageFling(false);
            int[] iArr = this.f8846b;
            N n10 = this.f8845a;
            if (iArr != null) {
                pDFView.l(n10, iArr);
            } else {
                pDFView.l(n10, null);
            }
        }
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8815a = 1.0f;
        this.f8816b = 1.75f;
        this.f8817c = 3.0f;
        this.i = 0.0f;
        this.f8823j = 0.0f;
        this.f8824k = 1.0f;
        this.f8825l = true;
        this.f8826m = State.f8840a;
        this.f8831r = new N(9, (char) 0);
        this.f8833t = FitPolicy.f8876a;
        this.f8834u = false;
        this.f8835v = 0;
        this.f8836w = true;
        this.f8837x = true;
        this.f8838y = true;
        this.f8839z = false;
        this.f8804A = true;
        this.f8806C = false;
        this.f8807D = true;
        this.f8808E = new PaintFlagsDrawFilter(0, 3);
        this.f8809F = 0;
        this.f8810G = false;
        this.f8811H = true;
        this.f8812I = new ArrayList(10);
        this.f8813J = false;
        this.f8828o = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f8818d = new X1.b();
        X1.a aVar = new X1.a();
        aVar.f3894d = false;
        aVar.f3895e = false;
        aVar.f3891a = this;
        aVar.f3893c = new OverScroller(getContext());
        this.f8819e = aVar;
        c cVar = new c();
        cVar.f3909e = false;
        cVar.f3910f = false;
        cVar.f3911g = false;
        cVar.f3905a = this;
        cVar.f3906b = aVar;
        cVar.f3907c = new GestureDetector(getContext(), cVar);
        cVar.f3908d = new ScaleGestureDetector(getContext(), cVar);
        setOnTouchListener(cVar);
        this.f8820f = cVar;
        this.f8830q = new d(this);
        this.f8832s = new Paint();
        new Paint().setStyle(Paint.Style.STROKE);
        PdfiumCore pdfiumCore = new PdfiumCore();
        pdfiumCore.f13354a = context.getResources().getDisplayMetrics().densityDpi;
        Log.d("com.shockwave.pdfium.PdfiumCore", "Starting PdfiumAndroid 1.9.0");
        this.f8805B = pdfiumCore;
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z10) {
        this.f8810G = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i) {
        this.f8835v = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z10) {
        this.f8834u = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(FitPolicy fitPolicy) {
        this.f8833t = fitPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i) {
        this.f8809F = (int) TypedValue.applyDimension(1, i, getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z10) {
        this.f8836w = z10;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        e eVar = this.f8821g;
        if (eVar == null) {
            return true;
        }
        if (this.f8836w) {
            if (i < 0 && this.i < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (eVar.b().f13357a * this.f8824k) + this.i > ((float) getWidth());
            }
            return false;
        }
        if (i < 0 && this.i < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (eVar.f3944p * this.f8824k) + this.i > ((float) getWidth());
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        e eVar = this.f8821g;
        if (eVar == null) {
            return true;
        }
        if (!this.f8836w) {
            if (i < 0 && this.f8823j < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (eVar.b().f13358b * this.f8824k) + this.f8823j > ((float) getHeight());
            }
            return false;
        }
        if (i < 0 && this.f8823j < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (eVar.f3944p * this.f8824k) + this.f8823j > ((float) getHeight());
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        X1.a aVar = this.f8819e;
        boolean computeScrollOffset = aVar.f3893c.computeScrollOffset();
        PDFView pDFView = aVar.f3891a;
        if (computeScrollOffset) {
            pDFView.o(r1.getCurrX(), r1.getCurrY());
            pDFView.m();
        } else if (aVar.f3894d) {
            aVar.f3894d = false;
            pDFView.n();
            aVar.a();
            pDFView.p();
        }
    }

    public int getCurrentPage() {
        return this.f8822h;
    }

    public float getCurrentXOffset() {
        return this.i;
    }

    public float getCurrentYOffset() {
        return this.f8823j;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument;
        e eVar = this.f8821g;
        if (eVar == null || (pdfDocument = eVar.f3930a) == null) {
            return null;
        }
        return eVar.f3931b.b(pdfDocument);
    }

    public float getMaxZoom() {
        return this.f8817c;
    }

    public float getMidZoom() {
        return this.f8816b;
    }

    public float getMinZoom() {
        return this.f8815a;
    }

    public int getPageCount() {
        e eVar = this.f8821g;
        if (eVar == null) {
            return 0;
        }
        return eVar.f3932c;
    }

    public FitPolicy getPageFitPolicy() {
        return this.f8833t;
    }

    public float getPositionOffset() {
        float f10;
        float f11;
        int width;
        if (this.f8836w) {
            f10 = -this.f8823j;
            f11 = this.f8821g.f3944p * this.f8824k;
            width = getHeight();
        } else {
            f10 = -this.i;
            f11 = this.f8821g.f3944p * this.f8824k;
            width = getWidth();
        }
        float f12 = f10 / (f11 - width);
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            f13 = 1.0f;
            if (f12 < 1.0f) {
                return f12;
            }
        }
        return f13;
    }

    public InterfaceC0585a getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.f8809F;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        e eVar = this.f8821g;
        if (eVar == null) {
            return Collections.emptyList();
        }
        PdfDocument pdfDocument = eVar.f3930a;
        return pdfDocument == null ? new ArrayList() : eVar.f3931b.f(pdfDocument);
    }

    public float getZoom() {
        return this.f8824k;
    }

    public final void h(Canvas canvas, C0508a c0508a) {
        float e10;
        float f10;
        RectF rectF = c0508a.f4250c;
        Bitmap bitmap = c0508a.f4249b;
        if (bitmap.isRecycled()) {
            return;
        }
        e eVar = this.f8821g;
        int i = c0508a.f4248a;
        SizeF f11 = eVar.f(i);
        if (this.f8836w) {
            f10 = this.f8821g.e(i, this.f8824k);
            e10 = ((this.f8821g.b().f13357a - f11.f13357a) * this.f8824k) / 2.0f;
        } else {
            e10 = this.f8821g.e(i, this.f8824k);
            f10 = ((this.f8821g.b().f13358b - f11.f13358b) * this.f8824k) / 2.0f;
        }
        canvas.translate(e10, f10);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float f12 = rectF.left * f11.f13357a;
        float f13 = this.f8824k;
        float f14 = f12 * f13;
        float f15 = rectF.top * f11.f13358b * f13;
        RectF rectF2 = new RectF((int) f14, (int) f15, (int) (f14 + (rectF.width() * f11.f13357a * this.f8824k)), (int) (f15 + (rectF.height() * r8 * this.f8824k)));
        float f16 = this.i + e10;
        float f17 = this.f8823j + f10;
        if (rectF2.left + f16 >= getWidth() || f16 + rectF2.right <= 0.0f || rectF2.top + f17 >= getHeight() || f17 + rectF2.bottom <= 0.0f) {
            canvas.translate(-e10, -f10);
        } else {
            canvas.drawBitmap(bitmap, rect, rectF2, this.f8832s);
            canvas.translate(-e10, -f10);
        }
    }

    public final int i(float f10, float f11) {
        boolean z10 = this.f8836w;
        if (z10) {
            f10 = f11;
        }
        float height = z10 ? getHeight() : getWidth();
        if (f10 > -1.0f) {
            return 0;
        }
        e eVar = this.f8821g;
        float f12 = this.f8824k;
        return f10 < ((-(eVar.f3944p * f12)) + height) + 1.0f ? eVar.f3932c - 1 : eVar.c(-(f10 - (height / 2.0f)), f12);
    }

    public final SnapEdge j(int i) {
        boolean z10 = this.f8804A;
        SnapEdge snapEdge = SnapEdge.f8881d;
        if (z10 && i >= 0) {
            float f10 = this.f8836w ? this.f8823j : this.i;
            float f11 = -this.f8821g.e(i, this.f8824k);
            int height = this.f8836w ? getHeight() : getWidth();
            float d10 = this.f8821g.d(i, this.f8824k);
            float f12 = height;
            if (f12 >= d10) {
                return SnapEdge.f8879b;
            }
            if (f10 >= f11) {
                return SnapEdge.f8878a;
            }
            if (f11 - d10 > f10 - f12) {
                return SnapEdge.f8880c;
            }
        }
        return snapEdge;
    }

    public final void k(int i) {
        e eVar = this.f8821g;
        if (eVar == null) {
            return;
        }
        int i9 = 0;
        if (i <= 0) {
            i = 0;
        } else {
            int[] iArr = eVar.f3947s;
            if (iArr == null) {
                int i10 = eVar.f3932c;
                if (i >= i10) {
                    i = i10 - 1;
                }
            } else if (i >= iArr.length) {
                i = iArr.length - 1;
            }
        }
        float f10 = i == 0 ? 0.0f : -eVar.e(i, this.f8824k);
        if (this.f8836w) {
            o(this.i, f10);
        } else {
            o(f10, this.f8823j);
        }
        if (this.f8825l) {
            return;
        }
        e eVar2 = this.f8821g;
        if (i <= 0) {
            eVar2.getClass();
        } else {
            int[] iArr2 = eVar2.f3947s;
            if (iArr2 != null) {
                if (i >= iArr2.length) {
                    i9 = iArr2.length - 1;
                }
                i9 = i;
            } else {
                int i11 = eVar2.f3932c;
                if (i >= i11) {
                    i9 = i11 - 1;
                }
                i9 = i;
            }
        }
        this.f8822h = i9;
        n();
        N n10 = this.f8831r;
        int i12 = this.f8821g.f3932c;
        n10.getClass();
    }

    public final void l(N n10, int[] iArr) {
        if (!this.f8825l) {
            throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
        }
        this.f8825l = false;
        com.github.barteksc.pdfviewer.a aVar = new com.github.barteksc.pdfviewer.a();
        aVar.f8855e = n10;
        aVar.f8856f = iArr;
        aVar.f8851a = false;
        aVar.f8852b = new WeakReference<>(this);
        aVar.f8854d = null;
        aVar.f8853c = this.f8805B;
        this.f8827n = aVar;
        aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void m() {
        float f10;
        int width;
        if (this.f8821g.f3932c == 0) {
            return;
        }
        if (this.f8836w) {
            f10 = this.f8823j;
            width = getHeight();
        } else {
            f10 = this.i;
            width = getWidth();
        }
        int c2 = this.f8821g.c(-(f10 - (width / 2.0f)), this.f8824k);
        if (c2 < 0 || c2 > this.f8821g.f3932c - 1 || c2 == getCurrentPage()) {
            n();
            return;
        }
        if (this.f8825l) {
            return;
        }
        e eVar = this.f8821g;
        if (c2 <= 0) {
            eVar.getClass();
            c2 = 0;
        } else {
            int[] iArr = eVar.f3947s;
            if (iArr == null) {
                int i = eVar.f3932c;
                if (c2 >= i) {
                    c2 = i - 1;
                }
            } else if (c2 >= iArr.length) {
                c2 = iArr.length - 1;
            }
        }
        this.f8822h = c2;
        n();
        N n10 = this.f8831r;
        int i9 = this.f8821g.f3932c;
        n10.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(float r6, float r7) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.o(float, float):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        q();
        HandlerThread handlerThread = this.f8828o;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f8828o = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (isInEditMode()) {
            return;
        }
        if (this.f8807D) {
            canvas.setDrawFilter(this.f8808E);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.f8839z ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f8825l && this.f8826m == State.f8842c) {
            float f10 = this.i;
            float f11 = this.f8823j;
            canvas.translate(f10, f11);
            X1.b bVar = this.f8818d;
            synchronized (bVar.f3903c) {
                arrayList = bVar.f3903c;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h(canvas, (C0508a) it.next());
            }
            X1.b bVar2 = this.f8818d;
            synchronized (bVar2.f3904d) {
                arrayList2 = new ArrayList(bVar2.f3901a);
                arrayList2.addAll(bVar2.f3902b);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                h(canvas, (C0508a) it2.next());
                this.f8831r.getClass();
            }
            Iterator it3 = this.f8812I.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).getClass();
                this.f8831r.getClass();
            }
            this.f8812I.clear();
            this.f8831r.getClass();
            canvas.translate(-f10, -f11);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        float f10;
        float f11;
        this.f8813J = true;
        a aVar = this.f8814K;
        if (aVar != null) {
            aVar.a();
        }
        if (isInEditMode() || this.f8826m != State.f8842c) {
            return;
        }
        float f12 = (i10 * 0.5f) + (-this.i);
        float f13 = (i11 * 0.5f) + (-this.f8823j);
        if (this.f8836w) {
            f10 = f12 / this.f8821g.b().f13357a;
            f11 = this.f8821g.f3944p * this.f8824k;
        } else {
            e eVar = this.f8821g;
            f10 = f12 / (eVar.f3944p * this.f8824k);
            f11 = eVar.b().f13358b;
        }
        float f14 = f13 / f11;
        this.f8819e.e();
        this.f8821g.i(new Size(i, i9));
        if (this.f8836w) {
            this.i = (i * 0.5f) + ((-f10) * this.f8821g.b().f13357a);
            this.f8823j = (i9 * 0.5f) + (this.f8821g.f3944p * this.f8824k * (-f14));
        } else {
            e eVar2 = this.f8821g;
            this.i = (i * 0.5f) + (eVar2.f3944p * this.f8824k * (-f10));
            this.f8823j = (i9 * 0.5f) + ((-f14) * eVar2.b().f13358b);
        }
        o(this.i, this.f8823j);
        m();
    }

    public final void p() {
        e eVar;
        int i;
        SnapEdge j10;
        if (!this.f8804A || (eVar = this.f8821g) == null || eVar.f3932c == 0 || (j10 = j((i = i(this.i, this.f8823j)))) == SnapEdge.f8881d) {
            return;
        }
        float r8 = r(i, j10);
        boolean z10 = this.f8836w;
        X1.a aVar = this.f8819e;
        if (z10) {
            aVar.c(this.f8823j, -r8);
        } else {
            aVar.b(this.i, -r8);
        }
    }

    public final void q() {
        PdfDocument pdfDocument;
        this.f8814K = null;
        this.f8819e.e();
        this.f8820f.f3911g = false;
        b bVar = this.f8829p;
        if (bVar != null) {
            bVar.f8862e = false;
            bVar.removeMessages(1);
        }
        com.github.barteksc.pdfviewer.a aVar = this.f8827n;
        if (aVar != null) {
            aVar.cancel(true);
        }
        X1.b bVar2 = this.f8818d;
        synchronized (bVar2.f3904d) {
            try {
                Iterator<C0508a> it = bVar2.f3901a.iterator();
                while (it.hasNext()) {
                    it.next().f4249b.recycle();
                }
                bVar2.f3901a.clear();
                Iterator<C0508a> it2 = bVar2.f3902b.iterator();
                while (it2.hasNext()) {
                    it2.next().f4249b.recycle();
                }
                bVar2.f3902b.clear();
            } finally {
            }
        }
        synchronized (bVar2.f3903c) {
            try {
                Iterator it3 = bVar2.f3903c.iterator();
                while (it3.hasNext()) {
                    ((C0508a) it3.next()).f4249b.recycle();
                }
                bVar2.f3903c.clear();
            } finally {
            }
        }
        e eVar = this.f8821g;
        if (eVar != null) {
            PdfiumCore pdfiumCore = eVar.f3931b;
            if (pdfiumCore != null && (pdfDocument = eVar.f3930a) != null) {
                pdfiumCore.a(pdfDocument);
            }
            eVar.f3930a = null;
            eVar.f3947s = null;
            this.f8821g = null;
        }
        this.f8829p = null;
        this.f8823j = 0.0f;
        this.i = 0.0f;
        this.f8824k = 1.0f;
        this.f8825l = true;
        this.f8831r = new N(9, (char) 0);
        this.f8826m = State.f8840a;
    }

    public final float r(int i, SnapEdge snapEdge) {
        float e10 = this.f8821g.e(i, this.f8824k);
        float height = this.f8836w ? getHeight() : getWidth();
        float d10 = this.f8821g.d(i, this.f8824k);
        return snapEdge == SnapEdge.f8879b ? (e10 - (height / 2.0f)) + (d10 / 2.0f) : snapEdge == SnapEdge.f8880c ? (e10 - height) + d10 : e10;
    }

    public final void s(float f10, PointF pointF) {
        float f11 = f10 / this.f8824k;
        this.f8824k = f10;
        float f12 = this.i * f11;
        float f13 = this.f8823j * f11;
        float f14 = pointF.x;
        float f15 = (f14 - (f14 * f11)) + f12;
        float f16 = pointF.y;
        o(f15, (f16 - (f11 * f16)) + f13);
    }

    public void setMaxZoom(float f10) {
        this.f8817c = f10;
    }

    public void setMidZoom(float f10) {
        this.f8816b = f10;
    }

    public void setMinZoom(float f10) {
        this.f8815a = f10;
    }

    public void setNightMode(boolean z10) {
        this.f8839z = z10;
        Paint paint = this.f8832s;
        if (z10) {
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        } else {
            paint.setColorFilter(null);
        }
    }

    public void setPageFling(boolean z10) {
        this.f8811H = z10;
    }

    public void setPageSnap(boolean z10) {
        this.f8804A = z10;
    }

    public void setPositionOffset(float f10) {
        if (this.f8836w) {
            o(this.i, ((-(this.f8821g.f3944p * this.f8824k)) + getHeight()) * f10);
        } else {
            o(((-(this.f8821g.f3944p * this.f8824k)) + getWidth()) * f10, this.f8823j);
        }
        m();
    }

    public void setSwipeEnabled(boolean z10) {
        this.f8837x = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(InterfaceC0585a interfaceC0585a) {
    }
}
