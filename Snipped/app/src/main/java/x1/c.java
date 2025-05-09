package X1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.SizeF;
import java.util.Iterator;

/* compiled from: DragPinchManager.java */
/* loaded from: classes.dex */
public final class c implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public PDFView f3905a;

    /* renamed from: b, reason: collision with root package name */
    public a f3906b;

    /* renamed from: c, reason: collision with root package name */
    public GestureDetector f3907c;

    /* renamed from: d, reason: collision with root package name */
    public ScaleGestureDetector f3908d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3909e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3910f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3911g;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        PDFView pDFView = this.f3905a;
        if (!pDFView.f8838y) {
            return false;
        }
        if (pDFView.getZoom() < pDFView.getMidZoom()) {
            pDFView.f8819e.d(motionEvent.getX(), motionEvent.getY(), pDFView.f8824k, pDFView.getMidZoom());
            return true;
        }
        if (pDFView.getZoom() < pDFView.getMaxZoom()) {
            pDFView.f8819e.d(motionEvent.getX(), motionEvent.getY(), pDFView.f8824k, pDFView.getMaxZoom());
            return true;
        }
        pDFView.f8819e.d(pDFView.getWidth() / 2, pDFView.getHeight() / 2, pDFView.f8824k, pDFView.f8815a);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        a aVar = this.f3906b;
        aVar.f3894d = false;
        aVar.f3893c.forceFinished(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r7 < (r8 - r3.getHeight())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r11 = (int) r3.getCurrentXOffset();
        r12 = (int) r3.getCurrentYOffset();
        r4 = r3.f8821g;
        r5 = -r4.e(r3.getCurrentPage(), r3.getZoom());
        r7 = r5 - r4.d(r3.getCurrentPage(), r3.getZoom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r3.f8836w == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        r4 = -((r4.b().f13357a * r3.f8824k) - r3.getWidth());
        r7 = r7 + r3.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        r4 = r20.f3906b;
        r4.e();
        r4.f3894d = true;
        r4.f3893c.fling(r11, r12, (int) r23, (int) r24, (int) r4, (int) r9, (int) r7, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        r7 = r7 + r3.getWidth();
        r3 = -((r4.b().f13358b * r3.f8824k) - r3.getHeight());
        r4 = r7;
        r7 = r3;
        r9 = r5;
        r5 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004e, code lost:
    
        if (r7 < (r8 - r3.getWidth())) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onFling(android.view.MotionEvent r21, android.view.MotionEvent r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.c.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f3905a.f8831r.getClass();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        PDFView pDFView = this.f3905a;
        float zoom = pDFView.getZoom() * scaleFactor;
        float min = Math.min(1.0f, pDFView.getMinZoom());
        float min2 = Math.min(10.0f, pDFView.getMaxZoom());
        if (zoom < min) {
            scaleFactor = min / pDFView.getZoom();
        } else if (zoom > min2) {
            scaleFactor = min2 / pDFView.getZoom();
        }
        pDFView.s(pDFView.f8824k * scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f3910f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f3905a.n();
        this.f3905a.getScrollHandle();
        this.f3910f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f3909e = true;
        PDFView pDFView = this.f3905a;
        if (pDFView.f8824k != pDFView.f8815a || pDFView.f8837x) {
            pDFView.o(pDFView.i + (-f10), pDFView.f8823j + (-f11));
        }
        if (!this.f3910f) {
            pDFView.m();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int h9;
        int e10;
        PDFView pDFView;
        PDFView pDFView2 = this.f3905a;
        pDFView2.f8831r.getClass();
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        e eVar = pDFView2.f8821g;
        if (eVar != null) {
            float f10 = (-pDFView2.getCurrentXOffset()) + x9;
            float f11 = (-pDFView2.getCurrentYOffset()) + y10;
            int c2 = eVar.c(pDFView2.f8836w ? f11 : f10, pDFView2.getZoom());
            SizeF g10 = eVar.g(c2, pDFView2.getZoom());
            if (pDFView2.f8836w) {
                e10 = (int) eVar.h(c2, pDFView2.getZoom());
                h9 = (int) eVar.e(c2, pDFView2.getZoom());
            } else {
                h9 = (int) eVar.h(c2, pDFView2.getZoom());
                e10 = (int) eVar.e(c2, pDFView2.getZoom());
            }
            int a10 = eVar.a(c2);
            PdfDocument pdfDocument = eVar.f3930a;
            PdfiumCore pdfiumCore = eVar.f3931b;
            Iterator it = pdfiumCore.d(pdfDocument, a10).iterator();
            while (it.hasNext()) {
                PdfDocument.Link link = (PdfDocument.Link) it.next();
                int i = (int) g10.f13357a;
                int i9 = (int) g10.f13358b;
                RectF rectF = link.f13349a;
                int a11 = eVar.a(c2);
                PdfDocument pdfDocument2 = eVar.f3930a;
                int i10 = c2;
                e eVar2 = eVar;
                PDFView pDFView3 = pDFView2;
                SizeF sizeF = g10;
                int i11 = e10;
                int i12 = h9;
                PdfiumCore pdfiumCore2 = pdfiumCore;
                Point g11 = pdfiumCore.g(pdfDocument2, a11, i11, i12, i, i9, rectF.left, rectF.top);
                Point g12 = pdfiumCore2.g(pdfDocument2, a11, i11, i12, i, i9, rectF.right, rectF.bottom);
                RectF rectF2 = new RectF(g11.x, g11.y, g12.x, g12.y);
                rectF2.sort();
                if (rectF2.contains(f10, f11)) {
                    pDFView = pDFView3;
                    Y1.b bVar = (Y1.b) pDFView.f8831r.f535b;
                    if (bVar != null) {
                        String str = link.f13351c;
                        PDFView pDFView4 = ((Y1.a) bVar).f4097a;
                        if (str == null || str.isEmpty()) {
                            Integer num = link.f13350b;
                            if (num != null) {
                                pDFView4.k(num.intValue());
                            }
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                            Context context = pDFView4.getContext();
                            if (intent.resolveActivity(context.getPackageManager()) != null) {
                                context.startActivity(intent);
                            } else {
                                Log.w("a", "No activity found for URI: ".concat(str));
                            }
                        }
                    }
                    pDFView.performClick();
                    return true;
                }
                eVar = eVar2;
                c2 = i10;
                pDFView2 = pDFView3;
                g10 = sizeF;
                pdfiumCore = pdfiumCore2;
            }
        }
        pDFView = pDFView2;
        pDFView.getScrollHandle();
        pDFView.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f3911g) {
            return false;
        }
        boolean z10 = this.f3907c.onTouchEvent(motionEvent) || this.f3908d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.f3909e) {
            this.f3909e = false;
            PDFView pDFView = this.f3905a;
            pDFView.n();
            this.f3905a.getScrollHandle();
            a aVar = this.f3906b;
            if (!aVar.f3894d && !aVar.f3895e) {
                pDFView.p();
            }
        }
        return z10;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
