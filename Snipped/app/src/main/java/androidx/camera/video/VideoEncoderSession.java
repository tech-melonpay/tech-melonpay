package androidx.camera.video;

import C.v;
import a3.InterfaceFutureC0509a;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class VideoEncoderSession {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5549a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5550b;

    /* renamed from: c, reason: collision with root package name */
    public final v f5551c;

    /* renamed from: d, reason: collision with root package name */
    public EncoderImpl f5552d = null;

    /* renamed from: e, reason: collision with root package name */
    public Surface f5553e = null;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceRequest f5554f = null;

    /* renamed from: g, reason: collision with root package name */
    public Executor f5555g = null;

    /* renamed from: h, reason: collision with root package name */
    public a.c.InterfaceC0066a f5556h = null;
    public VideoEncoderState i = VideoEncoderState.f5561a;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceFutureC0509a<Void> f5557j = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f5558k = null;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceFutureC0509a<androidx.camera.video.internal.encoder.a> f5559l = Futures.immediateFailedFuture(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m, reason: collision with root package name */
    public CallbackToFutureAdapter.a<androidx.camera.video.internal.encoder.a> f5560m = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VideoEncoderState {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoEncoderState f5561a;

        /* renamed from: b, reason: collision with root package name */
        public static final VideoEncoderState f5562b;

        /* renamed from: c, reason: collision with root package name */
        public static final VideoEncoderState f5563c;

        /* renamed from: d, reason: collision with root package name */
        public static final VideoEncoderState f5564d;

        /* renamed from: e, reason: collision with root package name */
        public static final VideoEncoderState f5565e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ VideoEncoderState[] f5566f;

        static {
            VideoEncoderState videoEncoderState = new VideoEncoderState("NOT_INITIALIZED", 0);
            f5561a = videoEncoderState;
            VideoEncoderState videoEncoderState2 = new VideoEncoderState("INITIALIZING", 1);
            f5562b = videoEncoderState2;
            VideoEncoderState videoEncoderState3 = new VideoEncoderState("PENDING_RELEASE", 2);
            f5563c = videoEncoderState3;
            VideoEncoderState videoEncoderState4 = new VideoEncoderState("READY", 3);
            f5564d = videoEncoderState4;
            VideoEncoderState videoEncoderState5 = new VideoEncoderState("RELEASED", 4);
            f5565e = videoEncoderState5;
            f5566f = new VideoEncoderState[]{videoEncoderState, videoEncoderState2, videoEncoderState3, videoEncoderState4, videoEncoderState5};
        }

        public VideoEncoderState() {
            throw null;
        }

        public static VideoEncoderState valueOf(String str) {
            return (VideoEncoderState) Enum.valueOf(VideoEncoderState.class, str);
        }

        public static VideoEncoderState[] values() {
            return (VideoEncoderState[]) f5566f.clone();
        }
    }

    public VideoEncoderSession(v vVar, Executor executor, Executor executor2) {
        this.f5549a = executor2;
        this.f5550b = executor;
        this.f5551c = vVar;
    }

    public final void a() {
        int ordinal = this.i.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            b();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            Logger.d("VideoEncoderSession", "closeInternal in " + this.i + " state");
            this.i = VideoEncoderState.f5563c;
            return;
        }
        if (ordinal == 4) {
            Logger.d("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.i + " is not handled");
    }

    public final void b() {
        int ordinal = this.i.ordinal();
        VideoEncoderState videoEncoderState = VideoEncoderState.f5565e;
        if (ordinal == 0) {
            this.i = videoEncoderState;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal != 4) {
                throw new IllegalStateException("State " + this.i + " is not handled");
            }
            Logger.d("VideoEncoderSession", "terminateNow in " + this.i + ", No-op");
            return;
        }
        this.i = videoEncoderState;
        this.f5560m.b(this.f5552d);
        this.f5554f = null;
        if (this.f5552d == null) {
            Logger.w("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f5558k.b(null);
            return;
        }
        Logger.d("VideoEncoderSession", "VideoEncoder is releasing: " + this.f5552d);
        this.f5552d.g();
        this.f5552d.i.addListener(new B2.d(this, 3), this.f5550b);
        this.f5552d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f5554f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
