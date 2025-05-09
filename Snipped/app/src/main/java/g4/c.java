package g4;

import e4.C0715a;
import kotlin.jvm.internal.f;

/* compiled from: CvvPanRaw.kt */
/* loaded from: classes.dex */
public final class c extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("pan")
    private final String f20794b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("cvv")
    private final String f20795c;

    public final String b() {
        return this.f20795c;
    }

    public final String c() {
        return this.f20794b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f20794b, cVar.f20794b) && f.b(this.f20795c, cVar.f20795c);
    }

    public final int hashCode() {
        String str = this.f20794b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20795c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return s3.b.l("CvvPanRaw(pan=", this.f20794b, ", cvv=", this.f20795c, ")");
    }
}
