package a4;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: FindCounterpartyByEmailRequestRaw.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("receiver_legal_type")
    private final String f4353a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("receiver_email")
    private final String f4354b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4355c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("sender_account_id")
    private final int f4356d;

    public p(int i, String str, String str2, String str3) {
        this.f4353a = str;
        this.f4354b = str2;
        this.f4355c = str3;
        this.f4356d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.f.b(this.f4353a, pVar.f4353a) && kotlin.jvm.internal.f.b(this.f4354b, pVar.f4354b) && kotlin.jvm.internal.f.b(this.f4355c, pVar.f4355c) && this.f4356d == pVar.f4356d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4356d) + C.v.c(C.v.c(this.f4353a.hashCode() * 31, 31, this.f4354b), 31, this.f4355c);
    }

    public final String toString() {
        String str = this.f4353a;
        String str2 = this.f4354b;
        String str3 = this.f4355c;
        int i = this.f4356d;
        StringBuilder p10 = s3.b.p("FindCounterpartyByEmailRequestRaw(receiverLegalType=", str, ", receiverEmail=", str2, ", currency=");
        p10.append(str3);
        p10.append(", senderAccountId=");
        p10.append(i);
        p10.append(")");
        return p10.toString();
    }
}
