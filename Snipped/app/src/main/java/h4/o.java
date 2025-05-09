package h4;

import java.util.ArrayList;

/* compiled from: TopUpResponseDomain.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f21140a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f21141b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f21142c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21143d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21144e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f21145f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21146g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f21147h;
    public final Double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21148j;

    /* renamed from: k, reason: collision with root package name */
    public final String f21149k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21150l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<Object> f21151m;

    /* renamed from: n, reason: collision with root package name */
    public final String f21152n;

    /* renamed from: o, reason: collision with root package name */
    public final String f21153o;

    public o(Integer num, Integer num2, Integer num3, String str, String str2, Integer num4, String str3, Double d10, Double d11, String str4, String str5, String str6, ArrayList<Object> arrayList, String str7, String str8) {
        this.f21140a = num;
        this.f21141b = num2;
        this.f21142c = num3;
        this.f21143d = str;
        this.f21144e = str2;
        this.f21145f = num4;
        this.f21146g = str3;
        this.f21147h = d10;
        this.i = d11;
        this.f21148j = str4;
        this.f21149k = str5;
        this.f21150l = str6;
        this.f21151m = arrayList;
        this.f21152n = str7;
        this.f21153o = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.f.b(this.f21140a, oVar.f21140a) && kotlin.jvm.internal.f.b(this.f21141b, oVar.f21141b) && kotlin.jvm.internal.f.b(this.f21142c, oVar.f21142c) && kotlin.jvm.internal.f.b(this.f21143d, oVar.f21143d) && kotlin.jvm.internal.f.b(this.f21144e, oVar.f21144e) && kotlin.jvm.internal.f.b(this.f21145f, oVar.f21145f) && kotlin.jvm.internal.f.b(this.f21146g, oVar.f21146g) && kotlin.jvm.internal.f.b(this.f21147h, oVar.f21147h) && kotlin.jvm.internal.f.b(this.i, oVar.i) && kotlin.jvm.internal.f.b(this.f21148j, oVar.f21148j) && kotlin.jvm.internal.f.b(this.f21149k, oVar.f21149k) && kotlin.jvm.internal.f.b(this.f21150l, oVar.f21150l) && kotlin.jvm.internal.f.b(this.f21151m, oVar.f21151m) && kotlin.jvm.internal.f.b(this.f21152n, oVar.f21152n) && kotlin.jvm.internal.f.b(this.f21153o, oVar.f21153o);
    }

    public final int hashCode() {
        Integer num = this.f21140a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21141b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21142c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f21143d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21144e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.f21145f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f21146g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.f21147h;
        int hashCode8 = (hashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.i;
        int hashCode9 = (hashCode8 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str4 = this.f21148j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21149k;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21150l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<Object> arrayList = this.f21151m;
        int hashCode13 = (hashCode12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str7 = this.f21152n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f21153o;
        return hashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TopUpResponseDomain(id=");
        sb2.append(this.f21140a);
        sb2.append(", clientId=");
        sb2.append(this.f21141b);
        sb2.append(", fromBankAccountId=");
        sb2.append(this.f21142c);
        sb2.append(", fromCardAccountId=");
        sb2.append(this.f21143d);
        sb2.append(", toBankAccountId=");
        sb2.append(this.f21144e);
        sb2.append(", toCardAccountId=");
        sb2.append(this.f21145f);
        sb2.append(", currency=");
        sb2.append(this.f21146g);
        sb2.append(", amount=");
        sb2.append(this.f21147h);
        sb2.append(", commissionAmount=");
        sb2.append(this.i);
        sb2.append(", status=");
        sb2.append(this.f21148j);
        sb2.append(", type=");
        sb2.append(this.f21149k);
        sb2.append(", ledgerTxId=");
        sb2.append(this.f21150l);
        sb2.append(", statusHistory=");
        sb2.append(this.f21151m);
        sb2.append(", createdAt=");
        sb2.append(this.f21152n);
        sb2.append(", updatedAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f21153o, ")");
    }

    public o() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, new ArrayList(), null, null);
    }
}
