package a4;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: CreateNewAccountRequestRaw.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4306a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f4307b;

    public i(String str, String str2) {
        this.f4306a = str;
        this.f4307b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f4306a, iVar.f4306a) && kotlin.jvm.internal.f.b(this.f4307b, iVar.f4307b);
    }

    public final int hashCode() {
        return this.f4307b.hashCode() + (this.f4306a.hashCode() * 31);
    }

    public final String toString() {
        return s3.b.l("CreateNewAccountRequestRaw(currency=", this.f4306a, ", prettyName=", this.f4307b, ")");
    }
}
