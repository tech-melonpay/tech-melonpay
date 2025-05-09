package androidx.camera.view;

import C.u;
import C.y;
import a3.InterfaceFutureC0509a;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.c;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import k0.C0913a;

/* compiled from: SurfaceViewImplementation.java */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public SurfaceView f5851e;

    /* renamed from: f, reason: collision with root package name */
    public final b f5852f;

    /* compiled from: SurfaceViewImplementation.java */
    public static class a {
        public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* compiled from: SurfaceViewImplementation.java */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: a, reason: collision with root package name */
        public Size f5853a;

        /* renamed from: b, reason: collision with root package name */
        public SurfaceRequest f5854b;

        /* renamed from: c, reason: collision with root package name */
        public SurfaceRequest f5855c;

        /* renamed from: d, reason: collision with root package name */
        public c.a f5856d;

        /* renamed from: e, reason: collision with root package name */
        public Size f5857e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5858f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f5859g = false;

        public b() {
        }

        public final void a() {
            if (this.f5854b != null) {
                Logger.d("SurfaceViewImpl", "Request canceled: " + this.f5854b);
                this.f5854b.willNotProvideSurface();
            }
        }

        public final boolean b() {
            d dVar = d.this;
            Surface surface = dVar.f5851e.getHolder().getSurface();
            if (this.f5858f || this.f5854b == null || !Objects.equals(this.f5853a, this.f5857e)) {
                return false;
            }
            Logger.d("SurfaceViewImpl", "Surface set on Preview.");
            c.a aVar = this.f5856d;
            SurfaceRequest surfaceRequest = this.f5854b;
            Objects.requireNonNull(surfaceRequest);
            surfaceRequest.provideSurface(surface, C0913a.getMainExecutor(dVar.f5851e.getContext()), new u(aVar, 2));
            this.f5858f = true;
            dVar.f5850d = true;
            dVar.f();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i9, int i10) {
            Logger.d("SurfaceViewImpl", "Surface changed. Size: " + i9 + "x" + i10);
            this.f5857e = new Size(i9, i10);
            b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            Logger.d("SurfaceViewImpl", "Surface created.");
            if (!this.f5859g || (surfaceRequest = this.f5855c) == null) {
                return;
            }
            surfaceRequest.invalidate();
            this.f5855c = null;
            this.f5859g = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.d("SurfaceViewImpl", "Surface destroyed.");
            if (!this.f5858f) {
                a();
            } else if (this.f5854b != null) {
                Logger.d("SurfaceViewImpl", "Surface closed " + this.f5854b);
                this.f5854b.getDeferrableSurface().close();
            }
            this.f5859g = true;
            SurfaceRequest surfaceRequest = this.f5854b;
            if (surfaceRequest != null) {
                this.f5855c = surfaceRequest;
            }
            this.f5858f = false;
            this.f5854b = null;
            this.f5856d = null;
            this.f5857e = null;
            this.f5853a = null;
        }
    }

    public d(PreviewView previewView, androidx.camera.view.b bVar) {
        super(previewView, bVar);
        this.f5852f = new b();
    }

    @Override // androidx.camera.view.c
    public final View a() {
        return this.f5851e;
    }

    @Override // androidx.camera.view.c
    public final Bitmap b() {
        SurfaceView surfaceView = this.f5851e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f5851e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.f5851e.getWidth(), this.f5851e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        a.a(this.f5851e, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: M.f
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    Logger.d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    Logger.e("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    Logger.e("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e10) {
                Logger.e("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e10);
            }
            return createBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.c
    public final void e(SurfaceRequest surfaceRequest, M.b bVar) {
        SurfaceView surfaceView = this.f5851e;
        boolean equals = Objects.equals(this.f5847a, surfaceRequest.getResolution());
        if (surfaceView == null || !equals) {
            this.f5847a = surfaceRequest.getResolution();
            FrameLayout frameLayout = this.f5848b;
            frameLayout.getClass();
            this.f5847a.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f5851e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f5847a.getWidth(), this.f5847a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f5851e);
            this.f5851e.getHolder().addCallback(this.f5852f);
        }
        surfaceRequest.addRequestCancellationListener(C0913a.getMainExecutor(this.f5851e.getContext()), new B2.d(bVar, 11));
        this.f5851e.post(new y(this, surfaceRequest, bVar, 7));
    }

    @Override // androidx.camera.view.c
    public final InterfaceFutureC0509a<Void> g() {
        return Futures.immediateFuture(null);
    }

    @Override // androidx.camera.view.c
    public final void c() {
    }

    @Override // androidx.camera.view.c
    public final void d() {
    }
}
