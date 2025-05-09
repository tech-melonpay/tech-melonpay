package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f23089a;

    /* renamed from: b, reason: collision with root package name */
    public final B f23090b;

    public Pair(A a10, B b9) {
        this.f23089a = a10;
        this.f23090b = b9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return f.b(this.f23089a, pair.f23089a) && f.b(this.f23090b, pair.f23090b);
    }

    public final int hashCode() {
        A a10 = this.f23089a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b9 = this.f23090b;
        return hashCode + (b9 != null ? b9.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f23089a + ", " + this.f23090b + ')';
    }
}
