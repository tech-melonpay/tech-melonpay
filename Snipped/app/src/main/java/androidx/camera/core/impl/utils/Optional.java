package androidx.camera.core.impl.utils;

import java.io.Serializable;
import x0.f;

/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(T t3) {
        return t3 == null ? absent() : new Present(t3);
    }

    public static <T> Optional<T> of(T t3) {
        t3.getClass();
        return new Present(t3);
    }

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(T t3);

    public abstract T or(f<? extends T> fVar);

    public abstract T orNull();

    public abstract String toString();
}
