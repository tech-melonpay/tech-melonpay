package androidx.camera.core;

import android.content.Context;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.b, ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5310b;
    public final /* synthetic */ Object i;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f5309a = i;
        this.f5310b = obj;
        this.i = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        Object lambda$initInternal$0;
        Object lambda$initialSurfaceRecreationCompleter$6;
        switch (this.f5309a) {
            case 0:
                lambda$initInternal$0 = ((CameraX) this.f5310b).lambda$initInternal$0((Context) this.i, aVar);
                return lambda$initInternal$0;
            default:
                lambda$initialSurfaceRecreationCompleter$6 = ((SurfaceRequest) this.f5310b).lambda$initialSurfaceRecreationCompleter$6((AtomicReference) this.i, aVar);
                return lambda$initialSurfaceRecreationCompleter$6;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ((SafeCloseImageReaderProxy) this.f5310b).lambda$setOnImageAvailableListener$1((ImageReaderProxy.OnImageAvailableListener) this.i, imageReaderProxy);
    }
}
