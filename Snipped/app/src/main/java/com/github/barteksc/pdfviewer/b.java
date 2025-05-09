package com.github.barteksc.pdfviewer;

import C.N;
import X1.e;
import a2.C0508a;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RenderingHandler.java */
/* loaded from: classes.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public PDFView f8858a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f8859b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f8860c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f8861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8862e;

    /* compiled from: RenderingHandler.java */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0508a f8863a;

        public a(C0508a c0508a) {
            this.f8863a = c0508a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFView pDFView = b.this.f8858a;
            C0508a c0508a = this.f8863a;
            if (pDFView.f8826m == PDFView.State.f8841b) {
                pDFView.f8826m = PDFView.State.f8842c;
                N n10 = pDFView.f8831r;
                int i = pDFView.f8821g.f3932c;
                n10.getClass();
            }
            if (c0508a.f4251d) {
                X1.b bVar = pDFView.f8818d;
                synchronized (bVar.f3903c) {
                    while (bVar.f3903c.size() >= 8) {
                        try {
                            ((C0508a) bVar.f3903c.remove(0)).f4249b.recycle();
                        } finally {
                        }
                    }
                    ArrayList arrayList = bVar.f3903c;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList.add(c0508a);
                            break;
                        } else if (((C0508a) it.next()).equals(c0508a)) {
                            c0508a.f4249b.recycle();
                            break;
                        }
                    }
                }
            } else {
                X1.b bVar2 = pDFView.f8818d;
                synchronized (bVar2.f3904d) {
                    bVar2.a();
                    bVar2.f3902b.offer(c0508a);
                }
            }
            pDFView.invalidate();
        }
    }

    /* compiled from: RenderingHandler.java */
    /* renamed from: com.github.barteksc.pdfviewer.b$b, reason: collision with other inner class name */
    public class RunnableC0100b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PageRenderingException f8865a;

        public RunnableC0100b(PageRenderingException pageRenderingException) {
            this.f8865a = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            N n10 = b.this.f8858a.f8831r;
            PageRenderingException pageRenderingException = this.f8865a;
            pageRenderingException.getClass();
            pageRenderingException.getCause();
            n10.getClass();
            Log.e("PDFView", "Cannot open page " + pageRenderingException.f8875a, pageRenderingException.getCause());
        }
    }

    /* compiled from: RenderingHandler.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public float f8867a;

        /* renamed from: b, reason: collision with root package name */
        public float f8868b;

        /* renamed from: c, reason: collision with root package name */
        public RectF f8869c;

        /* renamed from: d, reason: collision with root package name */
        public int f8870d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f8871e;

        /* renamed from: f, reason: collision with root package name */
        public int f8872f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8873g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8874h;
    }

    public final void a(int i, float f10, float f11, RectF rectF, boolean z10, int i9, boolean z11) {
        c cVar = new c();
        cVar.f8870d = i;
        cVar.f8867a = f10;
        cVar.f8868b = f11;
        cVar.f8869c = rectF;
        cVar.f8871e = z10;
        cVar.f8872f = i9;
        cVar.f8873g = false;
        cVar.f8874h = z11;
        sendMessage(obtainMessage(1, cVar));
    }

    public final C0508a b(c cVar) {
        e eVar = this.f8858a.f8821g;
        int i = cVar.f8870d;
        int a10 = eVar.a(i);
        if (a10 >= 0) {
            synchronized (e.f3929t) {
                try {
                    if (eVar.f3935f.indexOfKey(a10) < 0) {
                        try {
                            eVar.f3931b.i(eVar.f3930a, a10);
                            eVar.f3935f.put(a10, true);
                        } catch (Exception e10) {
                            eVar.f3935f.put(a10, false);
                            throw new PageRenderingException(i, e10);
                        }
                    }
                } finally {
                }
            }
        }
        int round = Math.round(cVar.f8867a);
        int round2 = Math.round(cVar.f8868b);
        if (round != 0 && round2 != 0) {
            if (!(true ^ eVar.f3935f.get(eVar.a(cVar.f8870d), false))) {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(round, round2, cVar.f8873g ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                    RectF rectF = cVar.f8869c;
                    Matrix matrix = this.f8861d;
                    matrix.reset();
                    float f10 = round;
                    float f11 = round2;
                    matrix.postTranslate((-rectF.left) * f10, (-rectF.top) * f11);
                    matrix.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
                    RectF rectF2 = this.f8859b;
                    rectF2.set(0.0f, 0.0f, f10, f11);
                    matrix.mapRect(rectF2);
                    rectF2.round(this.f8860c);
                    int i9 = cVar.f8870d;
                    Rect rect = this.f8860c;
                    eVar.f3931b.k(eVar.f3930a, createBitmap, eVar.a(i9), rect.left, rect.top, rect.width(), rect.height(), cVar.f8874h);
                    return new C0508a(cVar.f8870d, createBitmap, cVar.f8869c, cVar.f8871e, cVar.f8872f);
                } catch (IllegalArgumentException e11) {
                    Log.e("com.github.barteksc.pdfviewer.b", "Cannot create bitmap", e11);
                }
            }
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PDFView pDFView = this.f8858a;
        try {
            C0508a b9 = b((c) message.obj);
            if (b9 != null) {
                if (this.f8862e) {
                    pDFView.post(new a(b9));
                } else {
                    b9.f4249b.recycle();
                }
            }
        } catch (PageRenderingException e10) {
            pDFView.post(new RunnableC0100b(e10));
        }
    }
}
