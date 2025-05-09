package h4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.util.ArrayList;

/* compiled from: TopUpResponseRaw.kt */
/* loaded from: classes.dex */
public final class p extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private Integer f21154b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private Integer f21155c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("from_bank_account_id")
    private Integer f21156d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("from_card_account_id")
    private String f21157e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("to_bank_account_id")
    private String f21158f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("to_card_account_id")
    private Integer f21159g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private String f21160h;

    @l3.b("amount")
    private Double i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("commission_amount")
    private Double f21161j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("status")
    private String f21162k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("type")
    private String f21163l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("ledger_tx_id")
    private String f21164m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("status_history")
    private ArrayList<Object> f21165n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("created_at")
    private String f21166o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("updated_at")
    private String f21167p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p() {
        super(0);
        ArrayList<Object> arrayList = new ArrayList<>();
        this.f21154b = null;
        this.f21155c = null;
        this.f21156d = null;
        this.f21157e = null;
        this.f21158f = null;
        this.f21159g = null;
        this.f21160h = null;
        this.i = null;
        this.f21161j = null;
        this.f21162k = null;
        this.f21163l = null;
        this.f21164m = null;
        this.f21165n = arrayList;
        this.f21166o = null;
        this.f21167p = null;
    }

    public final Double b() {
        return this.i;
    }

    public final Integer c() {
        return this.f21155c;
    }

    public final Double d() {
        return this.f21161j;
    }

    public final String e() {
        return this.f21166o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.f.b(this.f21154b, pVar.f21154b) && kotlin.jvm.internal.f.b(this.f21155c, pVar.f21155c) && kotlin.jvm.internal.f.b(this.f21156d, pVar.f21156d) && kotlin.jvm.internal.f.b(this.f21157e, pVar.f21157e) && kotlin.jvm.internal.f.b(this.f21158f, pVar.f21158f) && kotlin.jvm.internal.f.b(this.f21159g, pVar.f21159g) && kotlin.jvm.internal.f.b(this.f21160h, pVar.f21160h) && kotlin.jvm.internal.f.b(this.i, pVar.i) && kotlin.jvm.internal.f.b(this.f21161j, pVar.f21161j) && kotlin.jvm.internal.f.b(this.f21162k, pVar.f21162k) && kotlin.jvm.internal.f.b(this.f21163l, pVar.f21163l) && kotlin.jvm.internal.f.b(this.f21164m, pVar.f21164m) && kotlin.jvm.internal.f.b(this.f21165n, pVar.f21165n) && kotlin.jvm.internal.f.b(this.f21166o, pVar.f21166o) && kotlin.jvm.internal.f.b(this.f21167p, pVar.f21167p);
    }

    public final String f() {
        return this.f21160h;
    }

    public final Integer g() {
        return this.f21156d;
    }

    public final String h() {
        return this.f21157e;
    }

    public final int hashCode() {
        Integer num = this.f21154b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21155c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21156d;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f21157e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21158f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.f21159g;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f21160h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.i;
        int hashCode8 = (hashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f21161j;
        int hashCode9 = (hashCode8 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str4 = this.f21162k;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21163l;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21164m;
        int hashCode12 = (this.f21165n.hashCode() + ((hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
        String str7 = this.f21166o;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f21167p;
        return hashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    public final Integer i() {
        return this.f21154b;
    }

    public final String j() {
        return this.f21164m;
    }

    public final String k() {
        return this.f21162k;
    }

    public final String l() {
        return this.f21158f;
    }

    public final Integer m() {
        return this.f21159g;
    }

    public final String n() {
        return this.f21163l;
    }

    public final String o() {
        return this.f21167p;
    }

    public final String toString() {
        Integer num = this.f21154b;
        Integer num2 = this.f21155c;
        Integer num3 = this.f21156d;
        String str = this.f21157e;
        String str2 = this.f21158f;
        Integer num4 = this.f21159g;
        String str3 = this.f21160h;
        Double d10 = this.i;
        Double d11 = this.f21161j;
        String str4 = this.f21162k;
        String str5 = this.f21163l;
        String str6 = this.f21164m;
        ArrayList<Object> arrayList = this.f21165n;
        String str7 = this.f21166o;
        String str8 = this.f21167p;
        StringBuilder sb2 = new StringBuilder("TopUpResponseRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", fromBankAccountId=");
        sb2.append(num3);
        sb2.append(", fromCardAccountId=");
        sb2.append(str);
        sb2.append(", toBankAccountId=");
        sb2.append(str2);
        sb2.append(", toCardAccountId=");
        sb2.append(num4);
        sb2.append(", currency=");
        sb2.append(str3);
        sb2.append(", amount=");
        sb2.append(d10);
        sb2.append(", commissionAmount=");
        sb2.append(d11);
        sb2.append(", status=");
        sb2.append(str4);
        sb2.append(", type=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", ledgerTxId=", str6, ", statusHistory=");
        sb2.append(arrayList);
        sb2.append(", createdAt=");
        sb2.append(str7);
        sb2.append(", updatedAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, str8, ")");
    }
}
