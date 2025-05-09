package e4;

import C.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.l;
import kotlin.jvm.internal.f;

/* compiled from: SystemVariablesRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f20517a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("type")
    private final String f20518b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("value_float")
    private final float f20519c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("value_integer")
    private final int f20520d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("value_json")
    private final l f20521e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("value_string")
    private final String f20522f;

    public final String a() {
        return this.f20517a;
    }

    public final l b() {
        return this.f20521e;
    }

    public final String c() {
        return this.f20522f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f20517a, cVar.f20517a) && f.b(this.f20518b, cVar.f20518b) && Float.compare(this.f20519c, cVar.f20519c) == 0 && this.f20520d == cVar.f20520d && f.b(this.f20521e, cVar.f20521e) && f.b(this.f20522f, cVar.f20522f);
    }

    public final int hashCode() {
        return this.f20522f.hashCode() + ((this.f20521e.hashCode() + v.b(this.f20520d, v.a(v.c(this.f20517a.hashCode() * 31, 31, this.f20518b), this.f20519c, 31), 31)) * 31);
    }

    public final String toString() {
        String str = this.f20517a;
        String str2 = this.f20518b;
        float f10 = this.f20519c;
        int i = this.f20520d;
        l lVar = this.f20521e;
        String str3 = this.f20522f;
        StringBuilder p10 = s3.b.p("SystemVariablesRaw(name=", str, ", type=", str2, ", value_float=");
        p10.append(f10);
        p10.append(", value_integer=");
        p10.append(i);
        p10.append(", value_json=");
        p10.append(lVar);
        p10.append(", value_string=");
        p10.append(str3);
        p10.append(")");
        return p10.toString();
    }
}
