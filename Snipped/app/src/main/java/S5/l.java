package s5;

/* compiled from: AccountDomain.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f26645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26646b;

    public l(String str, String str2) {
        this.f26645a = str;
        this.f26646b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.f.b(this.f26645a, lVar.f26645a) && kotlin.jvm.internal.f.b(this.f26646b, lVar.f26646b);
    }

    public final int hashCode() {
        String str = this.f26645a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26646b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProviderRequestDomain(bankCode=");
        sb2.append(this.f26645a);
        sb2.append(", bankAccountNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f26646b, ")");
    }
}
