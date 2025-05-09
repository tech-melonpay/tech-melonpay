package h4;

import com.luminary.business.domain.entity.account.BankAccountDomain;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ProgramDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f21118a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21120c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21121d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21122e;

    /* renamed from: f, reason: collision with root package name */
    public final List<BankAccountDomain> f21123f;

    public i(int i, String str, String str2, String str3, String str4, ArrayList arrayList) {
        this.f21118a = i;
        this.f21119b = str;
        this.f21120c = str2;
        this.f21121d = str3;
        this.f21122e = str4;
        this.f21123f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f21118a == iVar.f21118a && kotlin.jvm.internal.f.b(this.f21119b, iVar.f21119b) && kotlin.jvm.internal.f.b(this.f21120c, iVar.f21120c) && kotlin.jvm.internal.f.b(this.f21121d, iVar.f21121d) && kotlin.jvm.internal.f.b(this.f21122e, iVar.f21122e) && kotlin.jvm.internal.f.b(this.f21123f, iVar.f21123f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f21118a) * 31;
        String str = this.f21119b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21120c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21121d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21122e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BankAccountDomain> list = this.f21123f;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ProgramDomain(id=" + this.f21118a + ", name=" + this.f21119b + ", type=" + this.f21120c + ", description=" + this.f21121d + ", typeDescription=" + this.f21122e + ", bankAccounts=" + this.f21123f + ")";
    }
}
