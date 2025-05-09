package com.github.barteksc.pdfviewer;

import C.N;
import X1.e;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.util.Log;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;

/* compiled from: DecodingAsyncTask.java */
/* loaded from: classes.dex */
public final class a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8851a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<PDFView> f8852b;

    /* renamed from: c, reason: collision with root package name */
    public PdfiumCore f8853c;

    /* renamed from: d, reason: collision with root package name */
    public String f8854d;

    /* renamed from: e, reason: collision with root package name */
    public N f8855e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f8856f;

    /* renamed from: g, reason: collision with root package name */
    public e f8857g;

    @Override // android.os.AsyncTask
    public final Throwable doInBackground(Void[] voidArr) {
        try {
            PDFView pDFView = this.f8852b.get();
            if (pDFView != null) {
                this.f8857g = new e(this.f8853c, this.f8855e.e(pDFView.getContext(), this.f8853c, this.f8854d), pDFView.getPageFitPolicy(), new Size(pDFView.getWidth(), pDFView.getHeight()), this.f8856f, pDFView.f8836w, pDFView.getSpacingPx(), pDFView.f8810G, pDFView.f8834u);
                th = null;
            } else {
                th = new NullPointerException("pdfView == null");
            }
        } catch (Throwable th) {
            th = th;
        }
        return th;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.f8851a = true;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Throwable th) {
        Throwable th2 = th;
        PDFView pDFView = this.f8852b.get();
        if (pDFView != null) {
            if (th2 != null) {
                pDFView.f8826m = PDFView.State.f8843d;
                pDFView.f8831r.getClass();
                pDFView.q();
                pDFView.invalidate();
                Log.e("PDFView", "load pdf error", th2);
                return;
            }
            if (this.f8851a) {
                return;
            }
            e eVar = this.f8857g;
            pDFView.f8826m = PDFView.State.f8841b;
            pDFView.f8821g = eVar;
            if (!pDFView.f8828o.isAlive()) {
                pDFView.f8828o.start();
            }
            b bVar = new b(pDFView.f8828o.getLooper());
            bVar.f8859b = new RectF();
            bVar.f8860c = new Rect();
            bVar.f8861d = new Matrix();
            bVar.f8858a = pDFView;
            pDFView.f8829p = bVar;
            bVar.f8862e = true;
            pDFView.f8820f.f3911g = true;
            N n10 = pDFView.f8831r;
            int i = eVar.f3932c;
            n10.getClass();
            pDFView.k(pDFView.f8835v);
        }
    }
}
