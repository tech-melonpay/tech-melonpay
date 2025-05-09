package B5;

/* compiled from: CounterpartyByEmailDomain.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f302a;

    /* renamed from: b, reason: collision with root package name */
    public final String f303b;

    public c(String str, Integer num) {
        this.f302a = num;
        this.f303b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f302a, cVar.f302a) && kotlin.jvm.internal.f.b(this.f303b, cVar.f303b);
    }

    public final int hashCode() {
        Integer num = this.f302a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f303b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CounterpartyByEmailDomain(accountId=" + this.f302a + ", clientName=" + this.f303b + ")";
    }
}
