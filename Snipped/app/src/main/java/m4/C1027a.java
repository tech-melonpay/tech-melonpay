package m4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e4.C0715a;
import kotlin.jvm.internal.f;
import l3.b;

/* compiled from: IndustryRaw.kt */
/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @b("id")
    private final Integer f23923b;

    /* renamed from: c, reason: collision with root package name */
    @b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f23924c;

    public final Integer b() {
        return this.f23923b;
    }

    public final String c() {
        return this.f23924c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1027a)) {
            return false;
        }
        C1027a c1027a = (C1027a) obj;
        return f.b(this.f23923b, c1027a.f23923b) && f.b(this.f23924c, c1027a.f23924c);
    }

    public final int hashCode() {
        Integer num = this.f23923b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f23924c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "IndustryRaw(id=" + this.f23923b + ", name=" + this.f23924c + ")";
    }
}
