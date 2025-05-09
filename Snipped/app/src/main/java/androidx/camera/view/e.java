package androidx.camera.view;

import M.g;
import M.h;
import a3.InterfaceFutureC0509a;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0913a;

/* compiled from: TextureViewImplementation.java */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public TextureView f5861e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f5862f;

    /* renamed from: g, reason: collision with root package name */
    public CallbackToFutureAdapter.c f5863g;

    /* renamed from: h, reason: collision with root package name */
    public SurfaceRequest f5864h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f5865j;

    /* renamed from: k, reason: collision with root package name */
    public AtomicReference<CallbackToFutureAdapter.a<Void>> f5866k;

    /* renamed from: l, reason: collision with root package name */
    public c.a f5867l;

    @Override // androidx.camera.view.c
    public final View a() {
        return this.f5861e;
    }

    @Override // androidx.camera.view.c
    public final Bitmap b() {
        TextureView textureView = this.f5861e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f5861e.getBitmap();
    }

    @Override // androidx.camera.view.c
    public final void c() {
        if (!this.i || this.f5865j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f5861e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f5865j;
        if (surfaceTexture != surfaceTexture2) {
            this.f5861e.setSurfaceTexture(surfaceTexture2);
            this.f5865j = null;
            this.i = false;
        }
    }

    @Override // androidx.camera.view.c
    public final void d() {
        this.i = true;
    }

    @Override // androidx.camera.view.c
    public final void e(SurfaceRequest surfaceRequest, M.b bVar) {
        this.f5847a = surfaceRequest.getResolution();
        this.f5867l = bVar;
        FrameLayout frameLayout = this.f5848b;
        frameLayout.getClass();
        this.f5847a.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f5861e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f5847a.getWidth(), this.f5847a.getHeight()));
        this.f5861e.setSurfaceTextureListener(new h(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f5861e);
        SurfaceRequest surfaceRequest2 = this.f5864h;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.f5864h = surfaceRequest;
        surfaceRequest.addRequestCancellationListener(C0913a.getMainExecutor(this.f5861e.getContext()), new B6.d(22, this, surfaceRequest));
        h();
    }

    @Override // androidx.camera.view.c
    public final InterfaceFutureC0509a<Void> g() {
        return CallbackToFutureAdapter.a(new A0.b(this, 14));
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f5847a;
        if (size == null || (surfaceTexture = this.f5862f) == null || this.f5864h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f5847a.getHeight());
        Surface surface = new Surface(this.f5862f);
        SurfaceRequest surfaceRequest = this.f5864h;
        CallbackToFutureAdapter.c a10 = CallbackToFutureAdapter.a(new B.e(3, this, surface));
        this.f5863g = a10;
        a10.f5933b.addListener(new g(this, surface, a10, surfaceRequest, 0), C0913a.getMainExecutor(this.f5861e.getContext()));
        this.f5850d = true;
        f();
    }
}
