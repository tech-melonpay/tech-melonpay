package androidx.camera.video;

import C.E;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes.dex */
public interface VideoOutput {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SourceState {

        /* renamed from: a, reason: collision with root package name */
        public static final SourceState f5567a;

        /* renamed from: b, reason: collision with root package name */
        public static final SourceState f5568b;

        /* renamed from: c, reason: collision with root package name */
        public static final SourceState f5569c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SourceState[] f5570d;

        static {
            SourceState sourceState = new SourceState("ACTIVE_STREAMING", 0);
            f5567a = sourceState;
            SourceState sourceState2 = new SourceState("ACTIVE_NON_STREAMING", 1);
            f5568b = sourceState2;
            SourceState sourceState3 = new SourceState("INACTIVE", 2);
            f5569c = sourceState3;
            f5570d = new SourceState[]{sourceState, sourceState2, sourceState3};
        }

        public SourceState() {
            throw null;
        }

        public static SourceState valueOf(String str) {
            return (SourceState) Enum.valueOf(SourceState.class, str);
        }

        public static SourceState[] values() {
            return (SourceState[]) f5570d.clone();
        }
    }

    default void a(SurfaceRequest surfaceRequest, Timebase timebase) {
        onSurfaceRequested(surfaceRequest);
    }

    default E b(CameraInfo cameraInfo) {
        return E.f504a;
    }

    default Observable<g> c() {
        return ConstantObservable.withValue(null);
    }

    default Observable<StreamInfo> d() {
        return StreamInfo.f5545c;
    }

    void onSurfaceRequested(SurfaceRequest surfaceRequest);

    default void e(SourceState sourceState) {
    }
}
