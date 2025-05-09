package p4;

import e4.C0715a;

/* compiled from: FindCounterpartyByEmailResponseRaw.kt */
/* loaded from: classes.dex */
public final class c extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("account_id")
    private final Integer f25624b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_name")
    private final String f25625c;

    public final Integer b() {
        return this.f25624b;
    }

    public final String c() {
        return this.f25625c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f25624b, cVar.f25624b) && kotlin.jvm.internal.f.b(this.f25625c, cVar.f25625c);
    }

    public final int hashCode() {
        Integer num = this.f25624b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f25625c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FindCounterpartyByEmailResponseRaw(accountId=" + this.f25624b + ", clientName=" + this.f25625c + ")";
    }
}
