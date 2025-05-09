package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class Result<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23091a;

    /* compiled from: Result.kt */
    public static final class Failure implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f23092a;

        public Failure(Throwable th) {
            this.f23092a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                if (f.b(this.f23092a, ((Failure) obj).f23092a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f23092a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f23092a + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f23092a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return f.b(this.f23091a, ((Result) obj).f23091a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f23091a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f23091a;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
