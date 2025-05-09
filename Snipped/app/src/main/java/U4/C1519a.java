package u4;

import c4.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.util.HashMap;
import kotlin.jvm.internal.f;

/* compiled from: CheckRequisitesRaw.kt */
/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("country")
    private final String f30161b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f30162c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("allow_outgoing_payments")
    private final Boolean f30163d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("allow_incoming_payments")
    private final Boolean f30164e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("payment_requisites")
    private final HashMap<String, b.a> f30165f;

    public final Boolean b() {
        return this.f30164e;
    }

    public final Boolean c() {
        return this.f30163d;
    }

    public final String d() {
        return this.f30161b;
    }

    public final String e() {
        return this.f30162c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1519a)) {
            return false;
        }
        C1519a c1519a = (C1519a) obj;
        return f.b(this.f30161b, c1519a.f30161b) && f.b(this.f30162c, c1519a.f30162c) && f.b(this.f30163d, c1519a.f30163d) && f.b(this.f30164e, c1519a.f30164e) && f.b(this.f30165f, c1519a.f30165f);
    }

    public final HashMap<String, b.a> f() {
        return this.f30165f;
    }

    public final int hashCode() {
        String str = this.f30161b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30162c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f30163d;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f30164e;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HashMap<String, b.a> hashMap = this.f30165f;
        return hashCode4 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f30161b;
        String str2 = this.f30162c;
        Boolean bool = this.f30163d;
        Boolean bool2 = this.f30164e;
        HashMap<String, b.a> hashMap = this.f30165f;
        StringBuilder p10 = s3.b.p("CheckRequisitesRaw(country=", str, ", currency=", str2, ", allowOutgoingPayments=");
        p10.append(bool);
        p10.append(", allowIncomingPayments=");
        p10.append(bool2);
        p10.append(", paymentRequisites=");
        p10.append(hashMap);
        p10.append(")");
        return p10.toString();
    }
}
