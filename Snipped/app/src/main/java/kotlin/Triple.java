package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: Tuples.kt */
/* loaded from: classes2.dex */
public final class Triple<A, B, C> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final A f23099a;

    /* renamed from: b, reason: collision with root package name */
    public final B f23100b;

    /* renamed from: c, reason: collision with root package name */
    public final C f23101c;

    public Triple(A a10, B b9, C c2) {
        this.f23099a = a10;
        this.f23100b = b9;
        this.f23101c = c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return f.b(this.f23099a, triple.f23099a) && f.b(this.f23100b, triple.f23100b) && f.b(this.f23101c, triple.f23101c);
    }

    public final int hashCode() {
        A a10 = this.f23099a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b9 = this.f23100b;
        int hashCode2 = (hashCode + (b9 == null ? 0 : b9.hashCode())) * 31;
        C c2 = this.f23101c;
        return hashCode2 + (c2 != null ? c2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f23099a + ", " + this.f23100b + ", " + this.f23101c + ')';
    }
}
