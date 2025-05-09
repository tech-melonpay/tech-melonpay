package p4;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: PaymentRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.METHOD)
    private final String f25622a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("qrcode")
    private final f f25623b;

    public final String a() {
        return this.f25622a;
    }

    public final f b() {
        return this.f25623b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f25622a, bVar.f25622a) && kotlin.jvm.internal.f.b(this.f25623b, bVar.f25623b);
    }

    public final int hashCode() {
        String str = this.f25622a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.f25623b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "ConfirmationRaw(method=" + this.f25622a + ", qrcode=" + this.f25623b + ")";
    }
}
