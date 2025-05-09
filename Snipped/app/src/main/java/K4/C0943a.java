package k4;

import e4.C0715a;
import u4.C1520b;

/* compiled from: CreateExchangeRaw.kt */
/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("exchange_request")
    private final f f22940b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("transaction")
    private final C1520b f22941c;

    public final f b() {
        return this.f22940b;
    }

    public final C1520b c() {
        return this.f22941c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0943a)) {
            return false;
        }
        C0943a c0943a = (C0943a) obj;
        return kotlin.jvm.internal.f.b(this.f22940b, c0943a.f22940b) && kotlin.jvm.internal.f.b(this.f22941c, c0943a.f22941c);
    }

    public final int hashCode() {
        f fVar = this.f22940b;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        C1520b c1520b = this.f22941c;
        return hashCode + (c1520b != null ? c1520b.hashCode() : 0);
    }

    public final String toString() {
        return "CreateExchangeRaw(exchangeRequest=" + this.f22940b + ", transaction=" + this.f22941c + ")";
    }
}
