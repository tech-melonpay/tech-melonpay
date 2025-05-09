package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5364c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.f5362a = i;
        this.f5364c = obj;
        this.f5363b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5362a) {
            case 0:
                ((LiveDataObservable) this.f5364c).lambda$removeObserver$3((LiveDataObservable.LiveDataObserverAdapter) this.f5363b);
                break;
            case 1:
                ((LiveDataObservable.LiveDataObserverAdapter) this.f5363b).lambda$onChanged$0((LiveDataObservable.Result) this.f5364c);
                break;
            case 2:
                ((CameraRepository) this.f5364c).lambda$deinit$1((CameraInternal) this.f5363b);
                break;
            case 3:
                ((ConstantObservable) this.f5364c).lambda$addObserver$0((Observable.Observer) this.f5363b);
                break;
            case 4:
                ((DeferrableSurface) this.f5364c).lambda$new$2((String) this.f5363b);
                break;
            default:
                ((LiveDataObservable) this.f5364c).lambda$fetchData$0((CallbackToFutureAdapter.a) this.f5363b);
                break;
        }
    }

    public /* synthetic */ g(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.f5362a = 1;
        this.f5363b = liveDataObserverAdapter;
        this.f5364c = result;
    }
}
