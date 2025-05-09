package ka;

import ha.C0806e;

/* compiled from: Regex.kt */
/* renamed from: ka.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0959d {

    /* renamed from: a, reason: collision with root package name */
    public final String f23072a;

    /* renamed from: b, reason: collision with root package name */
    public final C0806e f23073b;

    public C0959d(String str, C0806e c0806e) {
        this.f23072a = str;
        this.f23073b = c0806e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0959d)) {
            return false;
        }
        C0959d c0959d = (C0959d) obj;
        return kotlin.jvm.internal.f.b(this.f23072a, c0959d.f23072a) && kotlin.jvm.internal.f.b(this.f23073b, c0959d.f23073b);
    }

    public final int hashCode() {
        return this.f23073b.hashCode() + (this.f23072a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f23072a + ", range=" + this.f23073b + ')';
    }
}
