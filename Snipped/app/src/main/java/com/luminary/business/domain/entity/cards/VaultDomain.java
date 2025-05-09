package com.luminary.business.domain.entity.cards;

import C.v;
import androidx.camera.core.impl.utils.a;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: VaultDomain.kt */
/* loaded from: classes.dex */
public final class VaultDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f10778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10779b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10780c;

    /* renamed from: d, reason: collision with root package name */
    public String f10781d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10782e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10783f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10784g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10785h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10786j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10787k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10788l;

    /* renamed from: m, reason: collision with root package name */
    public final BankAccountDomain.ProviderRequisiteDomain f10789m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10790n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10791o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10792p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f10793q;

    /* renamed from: r, reason: collision with root package name */
    public final String f10794r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10795s;

    /* renamed from: t, reason: collision with root package name */
    public final String f10796t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10797u;

    /* renamed from: v, reason: collision with root package name */
    public final Boolean f10798v;

    /* renamed from: w, reason: collision with root package name */
    public final String f10799w;

    public VaultDomain(int i, int i9, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, BankAccountDomain.ProviderRequisiteDomain providerRequisiteDomain, String str11, String str12, String str13, Integer num, String str14, String str15, String str16, String str17, Boolean bool, String str18) {
        this.f10778a = i;
        this.f10779b = i9;
        this.f10780c = str;
        this.f10781d = str2;
        this.f10782e = str3;
        this.f10783f = str4;
        this.f10784g = str5;
        this.f10785h = str6;
        this.i = str7;
        this.f10786j = str8;
        this.f10787k = str9;
        this.f10788l = str10;
        this.f10789m = providerRequisiteDomain;
        this.f10790n = str11;
        this.f10791o = str12;
        this.f10792p = str13;
        this.f10793q = num;
        this.f10794r = str14;
        this.f10795s = str15;
        this.f10796t = str16;
        this.f10797u = str17;
        this.f10798v = bool;
        this.f10799w = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VaultDomain)) {
            return false;
        }
        VaultDomain vaultDomain = (VaultDomain) obj;
        return this.f10778a == vaultDomain.f10778a && this.f10779b == vaultDomain.f10779b && f.b(this.f10780c, vaultDomain.f10780c) && f.b(this.f10781d, vaultDomain.f10781d) && f.b(this.f10782e, vaultDomain.f10782e) && f.b(this.f10783f, vaultDomain.f10783f) && f.b(this.f10784g, vaultDomain.f10784g) && f.b(this.f10785h, vaultDomain.f10785h) && f.b(this.i, vaultDomain.i) && f.b(this.f10786j, vaultDomain.f10786j) && f.b(this.f10787k, vaultDomain.f10787k) && f.b(this.f10788l, vaultDomain.f10788l) && f.b(this.f10789m, vaultDomain.f10789m) && f.b(this.f10790n, vaultDomain.f10790n) && f.b(this.f10791o, vaultDomain.f10791o) && f.b(this.f10792p, vaultDomain.f10792p) && f.b(this.f10793q, vaultDomain.f10793q) && f.b(this.f10794r, vaultDomain.f10794r) && f.b(this.f10795s, vaultDomain.f10795s) && f.b(this.f10796t, vaultDomain.f10796t) && f.b(this.f10797u, vaultDomain.f10797u) && f.b(this.f10798v, vaultDomain.f10798v) && f.b(this.f10799w, vaultDomain.f10799w);
    }

    public final int hashCode() {
        int b9 = v.b(this.f10779b, Integer.hashCode(this.f10778a) * 31, 31);
        String str = this.f10780c;
        int hashCode = (b9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10781d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10782e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10783f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10784g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10785h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10786j;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10787k;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10788l;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BankAccountDomain.ProviderRequisiteDomain providerRequisiteDomain = this.f10789m;
        int hashCode11 = (hashCode10 + (providerRequisiteDomain == null ? 0 : providerRequisiteDomain.hashCode())) * 31;
        String str11 = this.f10790n;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f10791o;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f10792p;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.f10793q;
        int hashCode15 = (hashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str14 = this.f10794r;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f10795s;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f10796t;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f10797u;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool = this.f10798v;
        int hashCode20 = (hashCode19 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str18 = this.f10799w;
        return hashCode20 + (str18 != null ? str18.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f10781d;
        StringBuilder sb2 = new StringBuilder("VaultDomain(id=");
        sb2.append(this.f10778a);
        sb2.append(", clientId=");
        sb2.append(this.f10779b);
        sb2.append(", clientName=");
        a.u(sb2, this.f10780c, ", prettyName=", str, ", currency=");
        sb2.append(this.f10782e);
        sb2.append(", assetType=");
        sb2.append(this.f10783f);
        sb2.append(", balance=");
        sb2.append(this.f10784g);
        sb2.append(", balanceAvailable=");
        sb2.append(this.f10785h);
        sb2.append(", balanceBlocked=");
        sb2.append(this.i);
        sb2.append(", number=");
        sb2.append(this.f10786j);
        sb2.append(", iban=");
        sb2.append(this.f10787k);
        sb2.append(", bicSwift=");
        sb2.append(this.f10788l);
        sb2.append(", providerRequisites=");
        sb2.append(this.f10789m);
        sb2.append(", textLine1=");
        sb2.append(this.f10790n);
        sb2.append(", textLine2=");
        sb2.append(this.f10791o);
        sb2.append(", cardsCount=");
        sb2.append(this.f10792p);
        sb2.append(", cardProgramId=");
        sb2.append(this.f10793q);
        sb2.append(", accountReference=");
        sb2.append(this.f10794r);
        sb2.append(", topUpAccountId=");
        sb2.append(this.f10795s);
        sb2.append(", topupAccountPname=");
        sb2.append(this.f10796t);
        sb2.append(", status=");
        sb2.append(this.f10797u);
        sb2.append(", isDefault=");
        sb2.append(this.f10798v);
        sb2.append(", createdAt=");
        return a.n(sb2, this.f10799w, ")");
    }
}
