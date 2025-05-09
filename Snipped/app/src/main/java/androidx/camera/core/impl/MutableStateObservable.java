package androidx.camera.core.impl;

/* loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(Object obj, boolean z10) {
        super(obj, z10);
    }

    public static <T> MutableStateObservable<T> withInitialError(Throwable th) {
        return new MutableStateObservable<>(th, true);
    }

    public static <T> MutableStateObservable<T> withInitialState(T t3) {
        return new MutableStateObservable<>(t3, false);
    }

    public void setError(Throwable th) {
        updateStateAsError(th);
    }

    public void setState(T t3) {
        updateState(t3);
    }
}
