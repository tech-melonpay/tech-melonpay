package w6;

import C.v;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import kotlin.jvm.internal.f;

/* compiled from: TransferUI.kt */
/* renamed from: w6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1573a {

    /* renamed from: a, reason: collision with root package name */
    public BankAccountDomain f30837a;

    /* renamed from: b, reason: collision with root package name */
    public BankAccountDomain f30838b;

    /* renamed from: c, reason: collision with root package name */
    public String f30839c;

    /* renamed from: d, reason: collision with root package name */
    public String f30840d;

    /* renamed from: e, reason: collision with root package name */
    public float f30841e;

    /* renamed from: f, reason: collision with root package name */
    public String f30842f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573a)) {
            return false;
        }
        C1573a c1573a = (C1573a) obj;
        return f.b(this.f30837a, c1573a.f30837a) && f.b(this.f30838b, c1573a.f30838b) && f.b(this.f30839c, c1573a.f30839c) && f.b(this.f30840d, c1573a.f30840d) && Float.compare(this.f30841e, c1573a.f30841e) == 0 && f.b(this.f30842f, c1573a.f30842f);
    }

    public final int hashCode() {
        BankAccountDomain bankAccountDomain = this.f30837a;
        int hashCode = (bankAccountDomain == null ? 0 : bankAccountDomain.hashCode()) * 31;
        BankAccountDomain bankAccountDomain2 = this.f30838b;
        return this.f30842f.hashCode() + v.a(v.c(v.c((hashCode + (bankAccountDomain2 != null ? bankAccountDomain2.hashCode() : 0)) * 31, 31, this.f30839c), 31, this.f30840d), this.f30841e, 31);
    }

    public final String toString() {
        BankAccountDomain bankAccountDomain = this.f30837a;
        BankAccountDomain bankAccountDomain2 = this.f30838b;
        String str = this.f30839c;
        String str2 = this.f30840d;
        float f10 = this.f30841e;
        String str3 = this.f30842f;
        StringBuilder sb2 = new StringBuilder("TransferUI(accountFrom=");
        sb2.append(bankAccountDomain);
        sb2.append(", accountTo=");
        sb2.append(bankAccountDomain2);
        sb2.append(", reference=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", amount=", str2, ", fee=");
        sb2.append(f10);
        sb2.append(", feeText=");
        sb2.append(str3);
        sb2.append(")");
        return sb2.toString();
    }
}
