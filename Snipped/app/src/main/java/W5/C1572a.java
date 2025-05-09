package w5;

import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: CurrencyDomain.kt */
/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f30826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30827b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30828c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<String> f30829d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30830e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30831f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f30832g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30833h;
    public final Boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30834j;

    /* renamed from: k, reason: collision with root package name */
    public final String f30835k;

    /* renamed from: l, reason: collision with root package name */
    public final String f30836l;

    public C1572a(Integer num, String str, String str2, ArrayList<String> arrayList, String str3, String str4, Integer num2, String str5, Boolean bool, String str6, String str7, String str8) {
        this.f30826a = num;
        this.f30827b = str;
        this.f30828c = str2;
        this.f30829d = arrayList;
        this.f30830e = str3;
        this.f30831f = str4;
        this.f30832g = num2;
        this.f30833h = str5;
        this.i = bool;
        this.f30834j = str6;
        this.f30835k = str7;
        this.f30836l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572a)) {
            return false;
        }
        C1572a c1572a = (C1572a) obj;
        return f.b(this.f30826a, c1572a.f30826a) && f.b(this.f30827b, c1572a.f30827b) && f.b(this.f30828c, c1572a.f30828c) && f.b(this.f30829d, c1572a.f30829d) && f.b(this.f30830e, c1572a.f30830e) && f.b(this.f30831f, c1572a.f30831f) && f.b(this.f30832g, c1572a.f30832g) && f.b(this.f30833h, c1572a.f30833h) && f.b(this.i, c1572a.i) && f.b(this.f30834j, c1572a.f30834j) && f.b(this.f30835k, c1572a.f30835k) && f.b(this.f30836l, c1572a.f30836l);
    }

    public final int hashCode() {
        Integer num = this.f30826a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f30827b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30828c;
        int hashCode3 = (this.f30829d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f30830e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30831f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f30832g;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.f30833h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.f30834j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f30835k;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f30836l;
        return hashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.f30832g;
        StringBuilder sb2 = new StringBuilder("CurrencyDomain(id=");
        sb2.append(this.f30826a);
        sb2.append(", name=");
        sb2.append(this.f30827b);
        sb2.append(", type=");
        sb2.append(this.f30828c);
        sb2.append(", networks=");
        sb2.append(this.f30829d);
        sb2.append(", prettyName=");
        sb2.append(this.f30830e);
        sb2.append(", case=");
        sb2.append(this.f30831f);
        sb2.append(", decimalPlaces=");
        sb2.append(num);
        sb2.append(", riskLevel=");
        sb2.append(this.f30833h);
        sb2.append(", enabled=");
        sb2.append(this.i);
        sb2.append(", subtype=");
        sb2.append(this.f30834j);
        sb2.append(", createdAt=");
        sb2.append(this.f30835k);
        sb2.append(", updatedAt=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30836l, ")");
    }

    public C1572a() {
        this(null, null, null, new ArrayList(), null, null, null, null, null, null, null, null);
    }
}
