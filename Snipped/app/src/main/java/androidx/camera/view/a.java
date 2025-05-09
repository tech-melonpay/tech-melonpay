package androidx.camera.view;

import Fa.h;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C0559z;
import java.util.ArrayList;

/* compiled from: PreviewStreamStateObserver.java */
/* loaded from: classes.dex */
public final class a implements Observable.Observer<CameraInternal.State> {

    /* renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f5833a;

    /* renamed from: b, reason: collision with root package name */
    public final C0559z<PreviewView.StreamState> f5834b;

    /* renamed from: c, reason: collision with root package name */
    public PreviewView.StreamState f5835c;

    /* renamed from: d, reason: collision with root package name */
    public final c f5836d;

    /* renamed from: e, reason: collision with root package name */
    public FutureChain f5837e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5838f = false;

    public a(CameraInfoInternal cameraInfoInternal, C0559z<PreviewView.StreamState> c0559z, c cVar) {
        this.f5833a = cameraInfoInternal;
        this.f5834b = c0559z;
        this.f5836d = cVar;
        synchronized (this) {
            this.f5835c = c0559z.getValue();
        }
    }

    public final void a(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.f5835c.equals(streamState)) {
                    return;
                }
                this.f5835c = streamState;
                Logger.d("StreamStateObserver", "Update Preview stream state to " + streamState);
                this.f5834b.postValue(streamState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(Throwable th) {
        FutureChain futureChain = this.f5837e;
        if (futureChain != null) {
            futureChain.cancel(false);
            this.f5837e = null;
        }
        a(PreviewView.StreamState.f5827a);
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onNewData(CameraInternal.State state) {
        CameraInternal.State state2 = state;
        CameraInternal.State state3 = CameraInternal.State.CLOSING;
        PreviewView.StreamState streamState = PreviewView.StreamState.f5827a;
        if (state2 == state3 || state2 == CameraInternal.State.CLOSED || state2 == CameraInternal.State.RELEASING || state2 == CameraInternal.State.RELEASED) {
            a(streamState);
            if (this.f5838f) {
                this.f5838f = false;
                FutureChain futureChain = this.f5837e;
                if (futureChain != null) {
                    futureChain.cancel(false);
                    this.f5837e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((state2 == CameraInternal.State.OPENING || state2 == CameraInternal.State.OPEN || state2 == CameraInternal.State.PENDING_OPEN) && !this.f5838f) {
            a(streamState);
            ArrayList arrayList = new ArrayList();
            CameraInfoInternal cameraInfoInternal = this.f5833a;
            FutureChain transform = FutureChain.from(CallbackToFutureAdapter.a(new M.b(this, cameraInfoInternal, arrayList, 0))).transformAsync(new A0.b(this, 13), CameraXExecutors.directExecutor()).transform(new B.d(this, 1), CameraXExecutors.directExecutor());
            this.f5837e = transform;
            Futures.addCallback(transform, new h(this, arrayList, cameraInfoInternal), CameraXExecutors.directExecutor());
            this.f5838f = true;
        }
    }
}
