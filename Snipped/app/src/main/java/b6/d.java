package B6;

import C.I;
import J.t;
import J.u;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.a;
import androidx.camera.video.n;
import androidx.camera.video.q;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.C0540f;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.TransactionExecutor;
import com.google.android.material.datepicker.y;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.fragments.loans.LoansFragment;
import com.luminary.mobile.R;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f402c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f400a = i;
        this.f401b = obj;
        this.f402c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture<?> scheduledFuture;
        EncoderImpl encoderImpl;
        J.j jVar;
        Executor executor;
        switch (this.f400a) {
            case 0:
                F0.f fVar = ((BaseActivity) this.f401b).f11453m;
                if (fVar == null) {
                    fVar = null;
                }
                ((FrameLayout) fVar.f1148d).removeView((View) ((Ref$ObjectRef) this.f402c).f23179a);
                return;
            case 1:
                Recorder recorder = (Recorder) this.f401b;
                VideoOutput.SourceState sourceState = recorder.W;
                VideoOutput.SourceState sourceState2 = (VideoOutput.SourceState) this.f402c;
                recorder.W = sourceState2;
                if (sourceState == sourceState2) {
                    Logger.d("Recorder", "Video source transitions to the same state: " + sourceState2);
                    return;
                }
                Logger.d("Recorder", "Video source has transitioned to state: " + sourceState2);
                if (sourceState2 != VideoOutput.SourceState.f5569c) {
                    if (sourceState2 != VideoOutput.SourceState.f5568b || (scheduledFuture = recorder.X) == null || !scheduledFuture.cancel(false) || (encoderImpl = recorder.f5464C) == null) {
                        return;
                    }
                    Recorder.p(encoderImpl);
                    return;
                }
                if (recorder.f5505y == null) {
                    recorder.s(false);
                    return;
                }
                recorder.Y = true;
                Recorder.f fVar2 = recorder.f5494n;
                if (fVar2 == null || fVar2.E()) {
                    return;
                }
                recorder.q(recorder.f5494n, 4, null);
                return;
            case 2:
                Recorder recorder2 = (Recorder) this.f401b;
                recorder2.getClass();
                recorder2.f5484c.execute(new B2.d((androidx.camera.video.internal.encoder.a) this.f402c, 1));
                return;
            case 3:
                ((Recorder.f) this.f401b).p().accept((q) this.f402c);
                return;
            case 4:
                n nVar = (n) this.f401b;
                if (((DeferrableSurface) this.f402c) == nVar.f5778a) {
                    nVar.d();
                    return;
                }
                return;
            case 5:
                I i = (I) this.f401b;
                i.getClass();
                ((SessionConfig.Builder) this.f402c).removeCameraCaptureCallback(i);
                return;
            case 6:
                ((VideoEncoderSession) this.f401b).f5556h.a((Surface) this.f402c);
                return;
            case 7:
                Recorder.c cVar = (Recorder.c) ((AudioSource.c) this.f401b);
                cVar.getClass();
                Throwable th = (Throwable) this.f402c;
                Logger.e("Recorder", "Error occurred after audio source started.", th);
                if (th instanceof AudioSourceAccessException) {
                    cVar.f5527a.accept(th);
                    return;
                }
                return;
            case 8:
                AudioSource audioSource = (AudioSource) this.f401b;
                int ordinal = audioSource.f5622g.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                BufferProvider<? extends t> bufferProvider = audioSource.f5626l;
                BufferProvider<? extends t> bufferProvider2 = (BufferProvider) this.f402c;
                if (bufferProvider != bufferProvider2) {
                    audioSource.b(bufferProvider2);
                    return;
                }
                return;
            case 9:
                Recorder.this.f5483b0 = ((AudioSource) this.f401b).f5634t;
                return;
            case 10:
                LoansFragment loansFragment = (LoansFragment) this.f402c;
                float T = loansFragment.u0().f29140w.getThumb().getBounds().left - D9.b.T(10);
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.f401b;
                ref$FloatRef.f23176a = T;
                loansFragment.u0().f29141x.setX(ref$FloatRef.f23176a);
                loansFragment.u0().f29141x.setVisibility(0);
                return;
            case 11:
                ((EncoderImpl) this.f401b).f5704m.remove((u) this.f402c);
                return;
            case 12:
                ((EncoderImpl) this.f401b).f5703l.remove((CallbackToFutureAdapter.a) this.f402c);
                return;
            case 13:
                ((Observable.Observer) ((Map.Entry) this.f401b).getKey()).onNewData((BufferProvider.State) this.f402c);
                return;
            case 14:
                LinkedHashMap linkedHashMap = ((EncoderImpl.b) this.f401b).f5727a;
                Observable.Observer observer = (Observable.Observer) this.f402c;
                observer.getClass();
                linkedHashMap.remove(observer);
                return;
            case 15:
                ((Observable.Observer) this.f401b).onNewData((BufferProvider.State) this.f402c);
                return;
            case 16:
                EncoderImpl encoderImpl2 = ((EncoderImpl.c) this.f401b).f5739j;
                switch (encoderImpl2.f5711t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f402c;
                        encoderImpl2.c(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl2.f5711t);
                }
            case 17:
                EncoderImpl.c cVar2 = (EncoderImpl.c) this.f401b;
                MediaFormat mediaFormat = (MediaFormat) this.f402c;
                if (cVar2.i) {
                    Logger.w(cVar2.f5739j.f5693a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (cVar2.f5739j.f5711t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (cVar2.f5739j.f5694b) {
                            EncoderImpl encoderImpl3 = cVar2.f5739j;
                            jVar = encoderImpl3.f5709r;
                            executor = encoderImpl3.f5710s;
                        }
                        try {
                            executor.execute(new d(18, jVar, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e10) {
                            Logger.e(cVar2.f5739j.f5693a, "Unable to post to the supplied executor.", e10);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: " + cVar2.f5739j.f5711t);
                }
            case 18:
                ((J.j) this.f401b).a(new A0.b((MediaFormat) this.f402c, 11));
                return;
            case 19:
                ((J.j) this.f401b).d((J.i) this.f402c);
                return;
            case 20:
                ((a.c.InterfaceC0066a) this.f401b).a((Surface) this.f402c);
                return;
            case 21:
                PreviewView.this.f5817k.onSurfaceRequested((SurfaceRequest) this.f402c);
                return;
            case 22:
                androidx.camera.view.e eVar = (androidx.camera.view.e) this.f401b;
                SurfaceRequest surfaceRequest = eVar.f5864h;
                if (surfaceRequest != null && surfaceRequest == ((SurfaceRequest) this.f402c)) {
                    eVar.f5864h = null;
                    eVar.f5863g = null;
                }
                c.a aVar = eVar.f5867l;
                if (aVar != null) {
                    ((M.b) aVar).b();
                    eVar.f5867l = null;
                    return;
                }
                return;
            case 23:
                String str = "Policy violation with PENALTY_DEATH in " + ((String) this.f401b);
                Violation violation = (Violation) this.f402c;
                Log.e("FragmentStrictMode", str, violation);
                throw violation;
            case 24:
                Threads.lambda$runOnMainSync$0((Runnable) this.f401b, (CountDownLatch) this.f402c);
                return;
            case 25:
                C0540f c0540f = (C0540f) this.f401b;
                if (!c0540f.f7085d.offer((Runnable) this.f402c)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                c0540f.b();
                return;
            case 26:
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0((MultiInstanceInvalidationClient) this.f401b, (String[]) this.f402c);
                return;
            case 27:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) this.f401b, (TransactionExecutor) this.f402c);
                return;
            case 28:
                ((ComponentActivity) this.f401b).addObserverForBackInvoker((androidx.activity.a) this.f402c);
                return;
            default:
                com.google.android.material.datepicker.b bVar = (com.google.android.material.datepicker.b) this.f401b;
                TextInputLayout textInputLayout = bVar.f9420a;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) this.f402c).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), bVar.f9422c.format(new Date(y.f().getTimeInMillis())).replace(' ', (char) 160)));
                bVar.a();
                return;
        }
    }
}
