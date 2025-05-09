package M;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import k0.C0913a;
import pa.C1124b;

/* compiled from: TextureViewImplementation.java */
/* loaded from: classes.dex */
public final class h implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.view.e f2517a;

    /* compiled from: TextureViewImplementation.java */
    public class a implements FutureCallback<SurfaceRequest.Result> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f2518a;

        public a(SurfaceTexture surfaceTexture) {
            this.f2518a = surfaceTexture;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(SurfaceRequest.Result result) {
            C1124b.q(result.getResultCode() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
            Logger.d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.f2518a.release();
            androidx.camera.view.e eVar = h.this.f2517a;
            if (eVar.f5865j != null) {
                eVar.f5865j = null;
            }
        }
    }

    public h(androidx.camera.view.e eVar) {
        this.f2517a = eVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i9) {
        Logger.d("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i9);
        androidx.camera.view.e eVar = this.f2517a;
        eVar.f5862f = surfaceTexture;
        if (eVar.f5863g == null) {
            eVar.h();
            return;
        }
        eVar.f5864h.getClass();
        Logger.d("TextureViewImpl", "Surface invalidated " + eVar.f5864h);
        eVar.f5864h.getDeferrableSurface().close();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        androidx.camera.view.e eVar = this.f2517a;
        eVar.f5862f = null;
        CallbackToFutureAdapter.c cVar = eVar.f5863g;
        if (cVar == null) {
            Logger.d("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        Futures.addCallback(cVar, new a(surfaceTexture), C0913a.getMainExecutor(eVar.f5861e.getContext()));
        eVar.f5865j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i9) {
        Logger.d("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        CallbackToFutureAdapter.a<Void> andSet = this.f2517a.f5866k.getAndSet(null);
        if (andSet != null) {
            andSet.b(null);
        }
    }
}
