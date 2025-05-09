package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class StreamInfo {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5543a = new e(0, StreamState.f5547b, null);

    /* renamed from: b, reason: collision with root package name */
    public static final Set<Integer> f5544b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c, reason: collision with root package name */
    public static final Observable<StreamInfo> f5545c = ConstantObservable.withValue(new e(0, StreamState.f5546a, null));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StreamState {

        /* renamed from: a, reason: collision with root package name */
        public static final StreamState f5546a;

        /* renamed from: b, reason: collision with root package name */
        public static final StreamState f5547b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ StreamState[] f5548c;

        static {
            StreamState streamState = new StreamState("ACTIVE", 0);
            f5546a = streamState;
            StreamState streamState2 = new StreamState("INACTIVE", 1);
            f5547b = streamState2;
            f5548c = new StreamState[]{streamState, streamState2};
        }

        public StreamState() {
            throw null;
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) f5548c.clone();
        }
    }

    public abstract int a();

    public abstract SurfaceRequest.TransformationInfo b();

    public abstract StreamState c();
}
