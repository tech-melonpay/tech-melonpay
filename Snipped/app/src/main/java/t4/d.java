package t4;

import kotlin.jvm.internal.f;

/* compiled from: SignerRaw.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("@id")
    private final String f27512a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("@status")
    private final String f27513b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("devicelink")
    private final String f27514c;

    public final String a() {
        return this.f27514c;
    }

    public final String b() {
        return this.f27512a;
    }

    public final String c() {
        return this.f27513b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f27512a, dVar.f27512a) && f.b(this.f27513b, dVar.f27513b) && f.b(this.f27514c, dVar.f27514c);
    }

    public final int hashCode() {
        String str = this.f27512a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27513b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27514c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f27512a;
        String str2 = this.f27513b;
        return androidx.camera.core.impl.utils.a.n(s3.b.p("SignerRaw(id=", str, ", status=", str2, ", devicelink="), this.f27514c, ")");
    }
}
