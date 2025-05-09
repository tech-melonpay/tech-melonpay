package w4;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.f;

/* compiled from: VersionRaw.kt */
/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1571c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("min")
    private final String f30823a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("current")
    private final String f30824b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(ImagesContract.URL)
    private final String f30825c;

    public final String a() {
        return this.f30824b;
    }

    public final String b() {
        return this.f30823a;
    }

    public final String c() {
        return this.f30825c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571c)) {
            return false;
        }
        C1571c c1571c = (C1571c) obj;
        return f.b(this.f30823a, c1571c.f30823a) && f.b(this.f30824b, c1571c.f30824b) && f.b(this.f30825c, c1571c.f30825c);
    }

    public final int hashCode() {
        String str = this.f30823a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30824b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30825c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30823a;
        String str2 = this.f30824b;
        return androidx.camera.core.impl.utils.a.n(s3.b.p("VersionRaw(min=", str, ", current=", str2, ", url="), this.f30825c, ")");
    }
}
