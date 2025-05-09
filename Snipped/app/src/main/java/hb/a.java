package hb;

import kotlin.jvm.internal.f;

/* compiled from: StringQualifier.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21238a;

    public a(String str) {
        this.f21238a = str;
    }

    public final String a() {
        return this.f21238a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return f.b(this.f21238a, ((a) obj).f21238a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21238a.hashCode();
    }

    public final String toString() {
        return this.f21238a;
    }
}
