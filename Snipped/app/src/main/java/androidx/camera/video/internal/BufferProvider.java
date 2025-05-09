package androidx.camera.video.internal;

import androidx.camera.core.impl.Observable;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f5613a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f5614b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f5615c;

        static {
            State state = new State("ACTIVE", 0);
            f5613a = state;
            State state2 = new State("INACTIVE", 1);
            f5614b = state2;
            f5615c = new State[]{state, state2};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f5615c.clone();
        }
    }

    CallbackToFutureAdapter.c b();
}
