package C;

import a3.InterfaceFutureC0509a;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.view.c;
import androidx.camera.view.d;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.room.QueryInterceptorDatabase;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import io.sentry.SentryLevel;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.C1124b;
import qb.g;
import t.C1257i;
import u.C1495b;
import u.f;
import u9.C1531b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f590d;

    public /* synthetic */ y(J.j jVar, int i, String str, Throwable th) {
        this.f587a = 5;
        this.f588b = jVar;
        this.f589c = str;
        this.f590d = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f587a) {
            case 0:
                Recorder recorder = (Recorder) this.f588b;
                SurfaceRequest surfaceRequest = recorder.f5502v;
                if (surfaceRequest != null && !surfaceRequest.isServiced()) {
                    recorder.f5502v.willNotProvideSurface();
                }
                SurfaceRequest surfaceRequest2 = (SurfaceRequest) this.f589c;
                recorder.f5502v = surfaceRequest2;
                Timebase timebase = (Timebase) this.f590d;
                recorder.f5503w = timebase;
                recorder.f(surfaceRequest2, timebase);
                return;
            case 1:
                C1124b.q(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
                ((AtomicBoolean) this.f588b).set(true);
                ((SessionConfig.Builder) this.f589c).removeCameraCaptureCallback((CameraCaptureCallback) this.f590d);
                return;
            case 2:
                AudioSource audioSource = (AudioSource) this.f588b;
                int ordinal = audioSource.f5622g.ordinal();
                if (ordinal == 0) {
                    audioSource.f5624j = (Executor) this.f589c;
                    audioSource.f5625k = (AudioSource.c) this.f590d;
                    return;
                } else {
                    if (ordinal == 1 || ordinal == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 3:
                ((androidx.camera.video.internal.audio.f) this.f588b).f5672g.a((AudioStream.a) this.f589c, (Executor) this.f590d);
                return;
            case 4:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f588b;
                d.i iVar = (d.i) this.f589c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f590d;
                bVar.getClass();
                try {
                    androidx.emoji2.text.g a10 = androidx.emoji2.text.a.a(bVar.f6543a);
                    if (a10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g.b bVar2 = (g.b) a10.f6560a;
                    synchronized (bVar2.f6585d) {
                        bVar2.f6587f = threadPoolExecutor;
                    }
                    a10.f6560a.a(new androidx.emoji2.text.e(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    iVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 5:
                ((J.j) this.f588b).b(new EncodeException((String) this.f589c, (Throwable) this.f590d));
                return;
            case 6:
                EncoderImpl.b bVar3 = (EncoderImpl.b) this.f588b;
                LinkedHashMap linkedHashMap = bVar3.f5727a;
                Observable.Observer observer = (Observable.Observer) this.f589c;
                observer.getClass();
                Executor executor = (Executor) this.f590d;
                executor.getClass();
                linkedHashMap.put(observer, executor);
                executor.execute(new B6.d(15, observer, bVar3.f5728b));
                return;
            case 7:
                d.b bVar4 = ((androidx.camera.view.d) this.f588b).f5852f;
                bVar4.a();
                boolean z10 = bVar4.f5859g;
                SurfaceRequest surfaceRequest3 = (SurfaceRequest) this.f589c;
                if (z10) {
                    bVar4.f5859g = false;
                    surfaceRequest3.invalidate();
                    return;
                }
                bVar4.f5854b = surfaceRequest3;
                bVar4.f5856d = (c.a) this.f590d;
                Size resolution = surfaceRequest3.getResolution();
                bVar4.f5853a = resolution;
                bVar4.f5858f = false;
                if (bVar4.b()) {
                    return;
                }
                Logger.d("SurfaceViewImpl", "Wait for new Surface creation.");
                androidx.camera.view.d.this.f5851e.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
                return;
            case 8:
                ((DefaultSurfaceProcessor) this.f588b).lambda$executeSafely$11((Runnable) this.f589c, (Runnable) this.f590d);
                return;
            case 9:
                ((InternalImageProcessor) this.f588b).lambda$safeProcess$0((ImageProcessor.Request) this.f589c, (CallbackToFutureAdapter.a) this.f590d);
                return;
            case 10:
                ((SurfaceProcessorNode) this.f588b).lambda$sendSurfaceOutputs$0((SurfaceEdge) this.f589c, (Map.Entry) this.f590d);
                return;
            case 11:
                ((ViewGroup) this.f588b).endViewTransition((View) this.f589c);
                DefaultSpecialEffectsController.a aVar = (DefaultSpecialEffectsController.a) this.f590d;
                aVar.f6653c.f6670a.c(aVar);
                return;
            case 12:
                Fragment fragment = ((SpecialEffectsController.Operation) this.f588b).f6817c;
                Fragment fragment2 = ((SpecialEffectsController.Operation) this.f589c).f6817c;
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.f590d;
                androidx.fragment.app.x.a(fragment, fragment2, transitionEffect.f6640o, transitionEffect.f6639n);
                return;
            case 13:
                ((androidx.fragment.app.C) this.f588b).getClass();
                androidx.fragment.app.C.j((View) this.f589c, (Rect) this.f590d);
                return;
            case 14:
                QueryInterceptorDatabase.query$lambda$7((QueryInterceptorDatabase) this.f588b, (String) this.f589c, (Object[]) this.f590d);
                return;
            case 15:
                QueryInterceptorDatabase.execSQL$lambda$12((QueryInterceptorDatabase) this.f588b, (String) this.f589c, (List) this.f590d);
                return;
            case 16:
                CameraX.a((InterfaceFutureC0509a) this.f588b, (CameraX) this.f589c, (androidx.lifecycle.r) this.f590d);
                return;
            case 17:
                g.b bVar5 = g.b.this;
                boolean isCanceled = bVar5.f25947b.isCanceled();
                qb.d dVar = (qb.d) this.f589c;
                if (isCanceled) {
                    dVar.onFailure(bVar5, new IOException("Canceled"));
                    return;
                } else {
                    dVar.onResponse(bVar5, (qb.q) this.f590d);
                    return;
                }
            case 18:
                ((qb.d) this.f589c).onFailure(g.b.this, (Throwable) this.f590d);
                return;
            case 19:
                C1257i.a aVar2 = ((C1257i) this.f588b).f27265w;
                HashSet hashSet = aVar2.f27266a;
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) this.f590d;
                hashSet.add(cameraCaptureCallback);
                aVar2.f27267b.put(cameraCaptureCallback, (Executor) this.f589c);
                return;
            case 20:
                C1495b.a(((f.c) this.f588b).f30040a, (CameraCaptureSession) this.f589c, (Surface) this.f590d);
                return;
            default:
                Runnable runnable = (Runnable) this.f589c;
                C1531b c1531b = (C1531b) this.f588b;
                c1531b.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    String str = (String) this.f590d;
                    if (str != null) {
                        c1531b.f30389b.getLogger().h(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i) {
        this.f587a = i;
        this.f588b = obj;
        this.f589c = obj2;
        this.f590d = obj3;
    }
}
