package com.luminary.business.domain.entity.account;

import D5.a;
import D5.b;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: AccountDomain.kt */
/* loaded from: classes.dex */
public final class CardsDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10724a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10725b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10726c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10727d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10728e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f10729f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10730g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10731h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10732j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10733k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10734l;

    /* renamed from: m, reason: collision with root package name */
    public final b f10735m;

    /* renamed from: n, reason: collision with root package name */
    public final a f10736n;

    public CardsDomain(Integer num, Integer num2, Integer num3, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, b bVar, a aVar) {
        this.f10724a = num;
        this.f10725b = num2;
        this.f10726c = num3;
        this.f10727d = str;
        this.f10728e = str2;
        this.f10729f = bool;
        this.f10730g = str3;
        this.f10731h = str4;
        this.i = str5;
        this.f10732j = str6;
        this.f10733k = str7;
        this.f10734l = str8;
        this.f10735m = bVar;
        this.f10736n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsDomain)) {
            return false;
        }
        CardsDomain cardsDomain = (CardsDomain) obj;
        return f.b(this.f10724a, cardsDomain.f10724a) && f.b(this.f10725b, cardsDomain.f10725b) && f.b(this.f10726c, cardsDomain.f10726c) && f.b(this.f10727d, cardsDomain.f10727d) && f.b(this.f10728e, cardsDomain.f10728e) && f.b(this.f10729f, cardsDomain.f10729f) && f.b(this.f10730g, cardsDomain.f10730g) && f.b(this.f10731h, cardsDomain.f10731h) && f.b(this.i, cardsDomain.i) && f.b(this.f10732j, cardsDomain.f10732j) && f.b(this.f10733k, cardsDomain.f10733k) && f.b(this.f10734l, cardsDomain.f10734l) && f.b(this.f10735m, cardsDomain.f10735m) && f.b(this.f10736n, cardsDomain.f10736n);
    }

    public final int hashCode() {
        Integer num = this.f10724a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10725b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10726c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f10727d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10728e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f10729f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f10730g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10731h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10732j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10733k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10734l;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        b bVar = this.f10735m;
        int hashCode13 = (hashCode12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.f10736n;
        return hashCode13 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.i;
        StringBuilder sb2 = new StringBuilder("CardsDomain(id=");
        sb2.append(this.f10724a);
        sb2.append(", clientId=");
        sb2.append(this.f10725b);
        sb2.append(", vaultId=");
        sb2.append(this.f10726c);
        sb2.append(", prettyName=");
        sb2.append(this.f10727d);
        sb2.append(", currency=");
        sb2.append(this.f10728e);
        sb2.append(", isVirtual=");
        sb2.append(this.f10729f);
        sb2.append(", cardNumber=");
        sb2.append(this.f10730g);
        sb2.append(", expirationDate=");
        androidx.camera.core.impl.utils.a.u(sb2, this.f10731h, ", status=", str, ", createdAt=");
        sb2.append(this.f10732j);
        sb2.append(", cvv=");
        sb2.append(this.f10733k);
        sb2.append(", pin=");
        sb2.append(this.f10734l);
        sb2.append(", securityLimitsInfo=");
        sb2.append(this.f10735m);
        sb2.append(", securityLimitsValue=");
        sb2.append(this.f10736n);
        sb2.append(")");
        return sb2.toString();
    }
}
