package com.luminary.business.domain.entity.company;

import C.v;
import P9.AbstractC0500b;
import P9.m;
import java.util.ArrayList;
import java.util.List;
import ka.C0969n;
import ka.C0970o;
import kotlin.jvm.internal.f;

/* compiled from: CorporateDetailsDomain.kt */
/* loaded from: classes.dex */
public final class CorporateDetailsDomain {

    /* renamed from: a, reason: collision with root package name */
    public final a f10804a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f10805b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f10806c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10807d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10808e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f10809f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f10810g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10811h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f10812j = m.q("", "", "", "", "");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorporateDetailsDomain.kt */
    public static final class CompanySourceOfWealth {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10813b;

        /* renamed from: c, reason: collision with root package name */
        public static final CompanySourceOfWealth f10814c;

        /* renamed from: d, reason: collision with root package name */
        public static final CompanySourceOfWealth f10815d;

        /* renamed from: e, reason: collision with root package name */
        public static final CompanySourceOfWealth f10816e;

        /* renamed from: f, reason: collision with root package name */
        public static final CompanySourceOfWealth f10817f;

        /* renamed from: g, reason: collision with root package name */
        public static final CompanySourceOfWealth f10818g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ CompanySourceOfWealth[] f10819h;
        public static final /* synthetic */ W9.a i;

        /* renamed from: a, reason: collision with root package name */
        public final String f10820a;

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class a {
        }

        static {
            CompanySourceOfWealth companySourceOfWealth = new CompanySourceOfWealth("BUSINESS_PROFIT", 0, "Business Profit");
            f10814c = companySourceOfWealth;
            CompanySourceOfWealth companySourceOfWealth2 = new CompanySourceOfWealth("RENTAL_INCOME", 1, "Rental Income");
            f10815d = companySourceOfWealth2;
            CompanySourceOfWealth companySourceOfWealth3 = new CompanySourceOfWealth("LOAN", 2, "Loan");
            f10816e = companySourceOfWealth3;
            CompanySourceOfWealth companySourceOfWealth4 = new CompanySourceOfWealth("COMMISSION_INCOME", 3, "Commission Income");
            f10817f = companySourceOfWealth4;
            CompanySourceOfWealth companySourceOfWealth5 = new CompanySourceOfWealth("OTHER", 4, "Other");
            f10818g = companySourceOfWealth5;
            CompanySourceOfWealth[] companySourceOfWealthArr = {companySourceOfWealth, companySourceOfWealth2, companySourceOfWealth3, companySourceOfWealth4, companySourceOfWealth5};
            f10819h = companySourceOfWealthArr;
            i = kotlin.enums.a.a(companySourceOfWealthArr);
            f10813b = new a();
        }

        public CompanySourceOfWealth(String str, int i9, String str2) {
            this.f10820a = str2;
        }

        public static CompanySourceOfWealth valueOf(String str) {
            return (CompanySourceOfWealth) Enum.valueOf(CompanySourceOfWealth.class, str);
        }

        public static CompanySourceOfWealth[] values() {
            return (CompanySourceOfWealth[]) f10819h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorporateDetailsDomain.kt */
    public static final class CompanyTypes {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10821b;

        /* renamed from: c, reason: collision with root package name */
        public static final CompanyTypes f10822c;

        /* renamed from: d, reason: collision with root package name */
        public static final CompanyTypes f10823d;

        /* renamed from: e, reason: collision with root package name */
        public static final CompanyTypes f10824e;

        /* renamed from: f, reason: collision with root package name */
        public static final CompanyTypes f10825f;

        /* renamed from: g, reason: collision with root package name */
        public static final CompanyTypes f10826g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ CompanyTypes[] f10827h;
        public static final /* synthetic */ W9.a i;

        /* renamed from: a, reason: collision with root package name */
        public final String f10828a;

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class a {
        }

        static {
            CompanyTypes companyTypes = new CompanyTypes("LIMITED_LIABILITY_COMPANIES", 0, "Limited Liability Companies");
            f10822c = companyTypes;
            CompanyTypes companyTypes2 = new CompanyTypes("PARTNERSHIPS", 1, "Partnerships");
            f10823d = companyTypes2;
            CompanyTypes companyTypes3 = new CompanyTypes("PUBLIC_COMPANIES", 2, "Public companies");
            f10824e = companyTypes3;
            CompanyTypes companyTypes4 = new CompanyTypes("TRUST_FOUNDATION", 3, "Trust foundation");
            f10825f = companyTypes4;
            CompanyTypes companyTypes5 = new CompanyTypes("OTHER", 4, "Other");
            f10826g = companyTypes5;
            CompanyTypes[] companyTypesArr = {companyTypes, companyTypes2, companyTypes3, companyTypes4, companyTypes5};
            f10827h = companyTypesArr;
            i = kotlin.enums.a.a(companyTypesArr);
            f10821b = new a();
        }

        public CompanyTypes(String str, int i9, String str2) {
            this.f10828a = str2;
        }

        public static CompanyTypes valueOf(String str) {
            return (CompanyTypes) Enum.valueOf(CompanyTypes.class, str);
        }

        public static CompanyTypes[] values() {
            return (CompanyTypes[]) f10827h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorporateDetailsDomain.kt */
    public static final class EmployeeCount {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10829b;

        /* renamed from: c, reason: collision with root package name */
        public static final EmployeeCount f10830c;

        /* renamed from: d, reason: collision with root package name */
        public static final EmployeeCount f10831d;

        /* renamed from: e, reason: collision with root package name */
        public static final EmployeeCount f10832e;

        /* renamed from: f, reason: collision with root package name */
        public static final EmployeeCount f10833f;

        /* renamed from: g, reason: collision with root package name */
        public static final EmployeeCount f10834g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EmployeeCount[] f10835h;
        public static final /* synthetic */ W9.a i;

        /* renamed from: a, reason: collision with root package name */
        public final String f10836a;

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class a {
        }

        static {
            EmployeeCount employeeCount = new EmployeeCount("ONE_FIVE", 0, "1-5");
            f10830c = employeeCount;
            EmployeeCount employeeCount2 = new EmployeeCount("FIVE_TWENTY", 1, "5-20");
            f10831d = employeeCount2;
            EmployeeCount employeeCount3 = new EmployeeCount("TWENTY_FIFTY", 2, "20-50");
            f10832e = employeeCount3;
            EmployeeCount employeeCount4 = new EmployeeCount("FIFTY_TWO_HUNDRED_FIFTY", 3, "50-250");
            f10833f = employeeCount4;
            EmployeeCount employeeCount5 = new EmployeeCount("OVER_TWO_HUNDRED_FIFTY", 4, "250+");
            f10834g = employeeCount5;
            EmployeeCount[] employeeCountArr = {employeeCount, employeeCount2, employeeCount3, employeeCount4, employeeCount5};
            f10835h = employeeCountArr;
            i = kotlin.enums.a.a(employeeCountArr);
            f10829b = new a();
        }

        public EmployeeCount(String str, int i9, String str2) {
            this.f10836a = str2;
        }

        public static EmployeeCount valueOf(String str) {
            return (EmployeeCount) Enum.valueOf(EmployeeCount.class, str);
        }

        public static EmployeeCount[] values() {
            return (EmployeeCount[]) f10835h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorporateDetailsDomain.kt */
    public static final class SourceOfFunds {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10837b;

        /* renamed from: c, reason: collision with root package name */
        public static final SourceOfFunds f10838c;

        /* renamed from: d, reason: collision with root package name */
        public static final SourceOfFunds f10839d;

        /* renamed from: e, reason: collision with root package name */
        public static final SourceOfFunds f10840e;

        /* renamed from: f, reason: collision with root package name */
        public static final SourceOfFunds f10841f;

        /* renamed from: g, reason: collision with root package name */
        public static final SourceOfFunds f10842g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ SourceOfFunds[] f10843h;
        public static final /* synthetic */ W9.a i;

        /* renamed from: a, reason: collision with root package name */
        public final String f10844a;

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class a {
        }

        static {
            SourceOfFunds sourceOfFunds = new SourceOfFunds("REVENUE_GENERATED_FROM_BUSINESS_ACTIVITY", 0, "Revenue generated from business activity");
            f10838c = sourceOfFunds;
            SourceOfFunds sourceOfFunds2 = new SourceOfFunds("COMMISSION_REVENUE", 1, "Commission revenue");
            f10839d = sourceOfFunds2;
            SourceOfFunds sourceOfFunds3 = new SourceOfFunds("INVESTMENTS_CAPITAL", 2, "Investments/Capital");
            f10840e = sourceOfFunds3;
            SourceOfFunds sourceOfFunds4 = new SourceOfFunds("DIVIDENDS", 3, "Dividends");
            f10841f = sourceOfFunds4;
            SourceOfFunds sourceOfFunds5 = new SourceOfFunds("OTHER", 4, "Other");
            f10842g = sourceOfFunds5;
            SourceOfFunds[] sourceOfFundsArr = {sourceOfFunds, sourceOfFunds2, sourceOfFunds3, sourceOfFunds4, sourceOfFunds5};
            f10843h = sourceOfFundsArr;
            i = kotlin.enums.a.a(sourceOfFundsArr);
            f10837b = new a();
        }

        public SourceOfFunds(String str, int i9, String str2) {
            this.f10844a = str2;
        }

        public static SourceOfFunds valueOf(String str) {
            return (SourceOfFunds) Enum.valueOf(SourceOfFunds.class, str);
        }

        public static SourceOfFunds[] values() {
            return (SourceOfFunds[]) f10843h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorporateDetailsDomain.kt */
    public static final class SourceofWealth {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10845b;

        /* renamed from: c, reason: collision with root package name */
        public static final SourceofWealth f10846c;

        /* renamed from: d, reason: collision with root package name */
        public static final SourceofWealth f10847d;

        /* renamed from: e, reason: collision with root package name */
        public static final SourceofWealth f10848e;

        /* renamed from: f, reason: collision with root package name */
        public static final SourceofWealth f10849f;

        /* renamed from: g, reason: collision with root package name */
        public static final SourceofWealth f10850g;

        /* renamed from: h, reason: collision with root package name */
        public static final SourceofWealth f10851h;
        public static final /* synthetic */ SourceofWealth[] i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ W9.a f10852j;

        /* renamed from: a, reason: collision with root package name */
        public final String f10853a;

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class a {
            public static SourceofWealth a(String str) {
                Object obj;
                AbstractC0500b abstractC0500b = (AbstractC0500b) SourceofWealth.f10852j;
                abstractC0500b.getClass();
                AbstractC0500b.C0038b c0038b = new AbstractC0500b.C0038b();
                while (true) {
                    if (!c0038b.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = c0038b.next();
                    if (f.b(((SourceofWealth) obj).f10853a, str)) {
                        break;
                    }
                }
                return (SourceofWealth) obj;
            }
        }

        static {
            SourceofWealth sourceofWealth = new SourceofWealth("EMPLOYMENT_INCOME", 0, "Employment Income");
            f10846c = sourceofWealth;
            SourceofWealth sourceofWealth2 = new SourceofWealth("DIVIDENDS", 1, "Dividends");
            f10847d = sourceofWealth2;
            SourceofWealth sourceofWealth3 = new SourceofWealth("FX_TRADING", 2, "FX Trading");
            f10848e = sourceofWealth3;
            SourceofWealth sourceofWealth4 = new SourceofWealth("SAVINGS", 3, "Savings");
            f10849f = sourceofWealth4;
            SourceofWealth sourceofWealth5 = new SourceofWealth("SALES_OF_SHARES", 4, "Sales of Shares");
            f10850g = sourceofWealth5;
            SourceofWealth sourceofWealth6 = new SourceofWealth("MATURED_INVESTMENT", 5, "Matured Investment");
            f10851h = sourceofWealth6;
            SourceofWealth[] sourceofWealthArr = {sourceofWealth, sourceofWealth2, sourceofWealth3, sourceofWealth4, sourceofWealth5, sourceofWealth6};
            i = sourceofWealthArr;
            f10852j = kotlin.enums.a.a(sourceofWealthArr);
            f10845b = new a();
        }

        public SourceofWealth(String str, int i9, String str2) {
            this.f10853a = str2;
        }

        public static SourceofWealth valueOf(String str) {
            return (SourceofWealth) Enum.valueOf(SourceofWealth.class, str);
        }

        public static SourceofWealth[] values() {
            return (SourceofWealth[]) i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CorporateDetailsDomain.kt */
    public static final class StatusIdentification {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10854a;

        /* renamed from: b, reason: collision with root package name */
        public static final StatusIdentification f10855b;

        /* renamed from: c, reason: collision with root package name */
        public static final StatusIdentification f10856c;

        /* renamed from: d, reason: collision with root package name */
        public static final StatusIdentification f10857d;

        /* renamed from: e, reason: collision with root package name */
        public static final StatusIdentification f10858e;

        /* renamed from: f, reason: collision with root package name */
        public static final StatusIdentification f10859f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ StatusIdentification[] f10860g;

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class a {
        }

        static {
            StatusIdentification statusIdentification = new StatusIdentification("APPROVED_VERIFIED", 0);
            f10855b = statusIdentification;
            StatusIdentification statusIdentification2 = new StatusIdentification("REQUESTED", 1);
            f10856c = statusIdentification2;
            StatusIdentification statusIdentification3 = new StatusIdentification("RETRY", 2);
            f10857d = statusIdentification3;
            StatusIdentification statusIdentification4 = new StatusIdentification("NOT_INITIATED", 3);
            f10858e = statusIdentification4;
            StatusIdentification statusIdentification5 = new StatusIdentification("REJECTED", 4);
            f10859f = statusIdentification5;
            f10860g = new StatusIdentification[]{statusIdentification, statusIdentification2, statusIdentification3, statusIdentification4, statusIdentification5};
            f10854a = new a();
        }

        public StatusIdentification() {
            throw null;
        }

        public static StatusIdentification valueOf(String str) {
            return (StatusIdentification) Enum.valueOf(StatusIdentification.class, str);
        }

        public static StatusIdentification[] values() {
            return (StatusIdentification[]) f10860g.clone();
        }
    }

    /* compiled from: CorporateDetailsDomain.kt */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        public final String f10861A;

        /* renamed from: A0, reason: collision with root package name */
        public final SourceofWealth f10862A0;

        /* renamed from: B, reason: collision with root package name */
        public final String f10863B;

        /* renamed from: B0, reason: collision with root package name */
        public final String f10864B0;

        /* renamed from: C, reason: collision with root package name */
        public final String f10865C;

        /* renamed from: C0, reason: collision with root package name */
        public final String f10866C0;

        /* renamed from: D, reason: collision with root package name */
        public final String f10867D;

        /* renamed from: D0, reason: collision with root package name */
        public final String f10868D0;

        /* renamed from: E, reason: collision with root package name */
        public final String f10869E;

        /* renamed from: E0, reason: collision with root package name */
        public final String f10870E0;

        /* renamed from: F, reason: collision with root package name */
        public final Integer f10871F;

        /* renamed from: F0, reason: collision with root package name */
        public final String f10872F0;

        /* renamed from: G, reason: collision with root package name */
        public final String f10873G;

        /* renamed from: G0, reason: collision with root package name */
        public final String f10874G0;

        /* renamed from: H, reason: collision with root package name */
        public final String f10875H;

        /* renamed from: H0, reason: collision with root package name */
        public final Double f10876H0;

        /* renamed from: I, reason: collision with root package name */
        public final String f10877I;

        /* renamed from: I0, reason: collision with root package name */
        public final Boolean f10878I0;

        /* renamed from: J, reason: collision with root package name */
        public final String f10879J;

        /* renamed from: J0, reason: collision with root package name */
        public String f10880J0;

        /* renamed from: K, reason: collision with root package name */
        public final String f10881K;

        /* renamed from: L, reason: collision with root package name */
        public final String f10882L;

        /* renamed from: M, reason: collision with root package name */
        public final String f10883M;

        /* renamed from: N, reason: collision with root package name */
        public final String f10884N;

        /* renamed from: O, reason: collision with root package name */
        public final String f10885O;

        /* renamed from: P, reason: collision with root package name */
        public final Long f10886P;

        /* renamed from: Q, reason: collision with root package name */
        public final Boolean f10887Q;
        public final Boolean R;
        public final String S;
        public final String T;
        public final String U;
        public final String V;
        public final String W;
        public final String X;
        public final String Y;

        /* renamed from: Z, reason: collision with root package name */
        public final String f10888Z;

        /* renamed from: a, reason: collision with root package name */
        public final Integer f10889a;

        /* renamed from: a0, reason: collision with root package name */
        public final String f10890a0;

        /* renamed from: b, reason: collision with root package name */
        public final String f10891b;

        /* renamed from: b0, reason: collision with root package name */
        public final String f10892b0;

        /* renamed from: c, reason: collision with root package name */
        public final String f10893c;

        /* renamed from: c0, reason: collision with root package name */
        public final Object f10894c0;

        /* renamed from: d, reason: collision with root package name */
        public final Boolean f10895d;

        /* renamed from: d0, reason: collision with root package name */
        public final StatusIdentification f10896d0;

        /* renamed from: e, reason: collision with root package name */
        public final String f10897e;

        /* renamed from: e0, reason: collision with root package name */
        public final float f10898e0;

        /* renamed from: f, reason: collision with root package name */
        public final String f10899f;

        /* renamed from: f0, reason: collision with root package name */
        public final boolean f10900f0;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f10901g;

        /* renamed from: g0, reason: collision with root package name */
        public final Integer f10902g0;

        /* renamed from: h, reason: collision with root package name */
        public final String f10903h;

        /* renamed from: h0, reason: collision with root package name */
        public final Integer f10904h0;
        public final String i;

        /* renamed from: i0, reason: collision with root package name */
        public final List<C0113a> f10905i0;

        /* renamed from: j, reason: collision with root package name */
        public final String f10906j;

        /* renamed from: j0, reason: collision with root package name */
        public final List<b> f10907j0;

        /* renamed from: k, reason: collision with root package name */
        public final String f10908k;

        /* renamed from: k0, reason: collision with root package name */
        public final List<b> f10909k0;

        /* renamed from: l, reason: collision with root package name */
        public final String f10910l;

        /* renamed from: l0, reason: collision with root package name */
        public final Boolean f10911l0;

        /* renamed from: m, reason: collision with root package name */
        public final String f10912m;

        /* renamed from: m0, reason: collision with root package name */
        public final Boolean f10913m0;

        /* renamed from: n, reason: collision with root package name */
        public final String f10914n;

        /* renamed from: n0, reason: collision with root package name */
        public final String f10915n0;

        /* renamed from: o, reason: collision with root package name */
        public final String f10916o;

        /* renamed from: o0, reason: collision with root package name */
        public final EmployeeCount f10917o0;

        /* renamed from: p, reason: collision with root package name */
        public final String f10918p;

        /* renamed from: p0, reason: collision with root package name */
        public final Boolean f10919p0;

        /* renamed from: q, reason: collision with root package name */
        public final String f10920q;

        /* renamed from: q0, reason: collision with root package name */
        public final Float f10921q0;

        /* renamed from: r, reason: collision with root package name */
        public final String f10922r;

        /* renamed from: r0, reason: collision with root package name */
        public final Float f10923r0;

        /* renamed from: s, reason: collision with root package name */
        public final String f10924s;
        public final Integer s0;

        /* renamed from: t, reason: collision with root package name */
        public final String f10925t;

        /* renamed from: t0, reason: collision with root package name */
        public final Integer f10926t0;

        /* renamed from: u, reason: collision with root package name */
        public final String f10927u;

        /* renamed from: u0, reason: collision with root package name */
        public final List<String> f10928u0;

        /* renamed from: v, reason: collision with root package name */
        public final String f10929v;

        /* renamed from: v0, reason: collision with root package name */
        public final List<String> f10930v0;

        /* renamed from: w, reason: collision with root package name */
        public final String f10931w;

        /* renamed from: w0, reason: collision with root package name */
        public final List<String> f10932w0;

        /* renamed from: x, reason: collision with root package name */
        public final String f10933x;

        /* renamed from: x0, reason: collision with root package name */
        public final List<String> f10934x0;

        /* renamed from: y, reason: collision with root package name */
        public final String f10935y;

        /* renamed from: y0, reason: collision with root package name */
        public final List<String> f10936y0;

        /* renamed from: z, reason: collision with root package name */
        public final String f10937z;

        /* renamed from: z0, reason: collision with root package name */
        public final List<String> f10938z0;

        /* compiled from: CorporateDetailsDomain.kt */
        /* renamed from: com.luminary.business.domain.entity.company.CorporateDetailsDomain$a$a, reason: collision with other inner class name */
        public static final class C0113a {

            /* renamed from: a, reason: collision with root package name */
            public final String f10939a;

            /* renamed from: b, reason: collision with root package name */
            public final String f10940b;

            /* renamed from: c, reason: collision with root package name */
            public final String f10941c;

            public C0113a(String str, String str2, String str3) {
                this.f10939a = str;
                this.f10940b = str2;
                this.f10941c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0113a)) {
                    return false;
                }
                C0113a c0113a = (C0113a) obj;
                return f.b(this.f10939a, c0113a.f10939a) && f.b(this.f10940b, c0113a.f10940b) && f.b(this.f10941c, c0113a.f10941c);
            }

            public final int hashCode() {
                String str = this.f10939a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f10940b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f10941c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BankOutsideDomain(name=");
                sb2.append(this.f10939a);
                sb2.append(", country=");
                sb2.append(this.f10940b);
                sb2.append(", info=");
                return androidx.camera.core.impl.utils.a.n(sb2, this.f10941c, ")");
            }
        }

        /* compiled from: CorporateDetailsDomain.kt */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f10942a;

            /* renamed from: b, reason: collision with root package name */
            public final String f10943b;

            /* renamed from: c, reason: collision with root package name */
            public final String f10944c;

            /* renamed from: d, reason: collision with root package name */
            public final String f10945d;

            public b(String str, String str2, String str3, String str4) {
                this.f10942a = str;
                this.f10943b = str2;
                this.f10944c = str3;
                this.f10945d = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return f.b(this.f10942a, bVar.f10942a) && f.b(this.f10943b, bVar.f10943b) && f.b(this.f10944c, bVar.f10944c) && f.b(this.f10945d, bVar.f10945d);
            }

            public final int hashCode() {
                String str = this.f10942a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f10943b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f10944c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f10945d;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ContractorsDomain(name=");
                sb2.append(this.f10942a);
                sb2.append(", countryIncorporation=");
                sb2.append(this.f10943b);
                sb2.append(", businessDescription=");
                sb2.append(this.f10944c);
                sb2.append(", info=");
                return androidx.camera.core.impl.utils.a.n(sb2, this.f10945d, ")");
            }
        }

        public a(Integer num, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, Integer num2, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, Long l10, Boolean bool3, Boolean bool4, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, Object obj, StatusIdentification statusIdentification, float f10, boolean z10, Integer num3, Integer num4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Boolean bool5, Boolean bool6, String str48, EmployeeCount employeeCount, Boolean bool7, Float f11, Float f12, Integer num5, Integer num6, List list, List list2, List list3, List list4, List list5, List list6, SourceofWealth sourceofWealth, String str49, String str50, String str51, String str52, String str53, String str54, Double d10, Boolean bool8) {
            this.f10889a = num;
            this.f10891b = str;
            this.f10893c = str2;
            this.f10895d = bool;
            this.f10897e = str3;
            this.f10899f = str4;
            this.f10901g = bool2;
            this.f10903h = str5;
            this.i = str6;
            this.f10906j = str7;
            this.f10908k = str8;
            this.f10910l = str9;
            this.f10912m = str10;
            this.f10914n = str11;
            this.f10916o = str12;
            this.f10918p = str13;
            this.f10920q = str14;
            this.f10922r = str15;
            this.f10924s = str16;
            this.f10925t = str17;
            this.f10927u = str18;
            this.f10929v = str19;
            this.f10931w = str20;
            this.f10933x = str21;
            this.f10935y = str22;
            this.f10937z = str23;
            this.f10861A = str24;
            this.f10863B = str25;
            this.f10865C = str26;
            this.f10867D = str27;
            this.f10869E = str28;
            this.f10871F = num2;
            this.f10873G = str29;
            this.f10875H = str30;
            this.f10877I = str31;
            this.f10879J = str32;
            this.f10881K = str33;
            this.f10882L = str34;
            this.f10883M = str35;
            this.f10884N = str36;
            this.f10885O = str37;
            this.f10886P = l10;
            this.f10887Q = bool3;
            this.R = bool4;
            this.S = str38;
            this.T = str39;
            this.U = str40;
            this.V = str41;
            this.W = str42;
            this.X = str43;
            this.Y = str44;
            this.f10888Z = str45;
            this.f10890a0 = str46;
            this.f10892b0 = str47;
            this.f10894c0 = obj;
            this.f10896d0 = statusIdentification;
            this.f10898e0 = f10;
            this.f10900f0 = z10;
            this.f10902g0 = num3;
            this.f10904h0 = num4;
            this.f10905i0 = arrayList;
            this.f10907j0 = arrayList2;
            this.f10909k0 = arrayList3;
            this.f10911l0 = bool5;
            this.f10913m0 = bool6;
            this.f10915n0 = str48;
            this.f10917o0 = employeeCount;
            this.f10919p0 = bool7;
            this.f10921q0 = f11;
            this.f10923r0 = f12;
            this.s0 = num5;
            this.f10926t0 = num6;
            this.f10928u0 = list;
            this.f10930v0 = list2;
            this.f10932w0 = list3;
            this.f10934x0 = list4;
            this.f10936y0 = list5;
            this.f10938z0 = list6;
            this.f10862A0 = sourceofWealth;
            this.f10864B0 = str49;
            this.f10866C0 = str50;
            this.f10868D0 = str51;
            this.f10870E0 = str52;
            this.f10872F0 = str53;
            this.f10874G0 = str54;
            this.f10876H0 = d10;
            this.f10878I0 = bool8;
        }

        public final String a() {
            String str = "";
            String str2 = this.f10881K;
            if (str2 != null && C0969n.u0(str2).toString().length() > 0) {
                str = str2.concat("\n");
            }
            String str3 = this.f10879J;
            if (str3 != null && C0969n.u0(str3).toString().length() > 0) {
                str = ((Object) str) + str3 + "\n";
            }
            String str4 = this.f10885O;
            if (str4 != null && C0969n.u0(str4).toString().length() > 0) {
                str = ((Object) str) + str4 + "\n";
            }
            String str5 = this.f10882L;
            if (str5 != null && C0969n.u0(str5).toString().length() > 0) {
                str = ((Object) str) + str5 + "\n";
            }
            String str6 = this.f10883M;
            if (str6 != null && C0969n.u0(str6).toString().length() > 0) {
                str = ((Object) str) + str6 + "\n";
            }
            String str7 = this.f10880J0;
            if (str7 != null && C0969n.u0(str7).toString().length() > 0) {
                str = ((Object) str) + str7 + "\n";
            }
            return C0970o.x0(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f10889a, aVar.f10889a) && f.b(this.f10891b, aVar.f10891b) && f.b(this.f10893c, aVar.f10893c) && f.b(this.f10895d, aVar.f10895d) && f.b(this.f10897e, aVar.f10897e) && f.b(this.f10899f, aVar.f10899f) && f.b(this.f10901g, aVar.f10901g) && f.b(this.f10903h, aVar.f10903h) && f.b(this.i, aVar.i) && f.b(this.f10906j, aVar.f10906j) && f.b(this.f10908k, aVar.f10908k) && f.b(this.f10910l, aVar.f10910l) && f.b(this.f10912m, aVar.f10912m) && f.b(this.f10914n, aVar.f10914n) && f.b(this.f10916o, aVar.f10916o) && f.b(this.f10918p, aVar.f10918p) && f.b(this.f10920q, aVar.f10920q) && f.b(this.f10922r, aVar.f10922r) && f.b(this.f10924s, aVar.f10924s) && f.b(this.f10925t, aVar.f10925t) && f.b(this.f10927u, aVar.f10927u) && f.b(this.f10929v, aVar.f10929v) && f.b(this.f10931w, aVar.f10931w) && f.b(this.f10933x, aVar.f10933x) && f.b(this.f10935y, aVar.f10935y) && f.b(this.f10937z, aVar.f10937z) && f.b(this.f10861A, aVar.f10861A) && f.b(this.f10863B, aVar.f10863B) && f.b(this.f10865C, aVar.f10865C) && f.b(this.f10867D, aVar.f10867D) && f.b(this.f10869E, aVar.f10869E) && f.b(this.f10871F, aVar.f10871F) && f.b(this.f10873G, aVar.f10873G) && f.b(this.f10875H, aVar.f10875H) && f.b(this.f10877I, aVar.f10877I) && f.b(this.f10879J, aVar.f10879J) && f.b(this.f10881K, aVar.f10881K) && f.b(this.f10882L, aVar.f10882L) && f.b(this.f10883M, aVar.f10883M) && f.b(this.f10884N, aVar.f10884N) && f.b(this.f10885O, aVar.f10885O) && f.b(this.f10886P, aVar.f10886P) && f.b(this.f10887Q, aVar.f10887Q) && f.b(this.R, aVar.R) && f.b(this.S, aVar.S) && f.b(this.T, aVar.T) && f.b(this.U, aVar.U) && f.b(this.V, aVar.V) && f.b(this.W, aVar.W) && f.b(this.X, aVar.X) && f.b(this.Y, aVar.Y) && f.b(this.f10888Z, aVar.f10888Z) && f.b(this.f10890a0, aVar.f10890a0) && f.b(this.f10892b0, aVar.f10892b0) && f.b(this.f10894c0, aVar.f10894c0) && this.f10896d0 == aVar.f10896d0 && Float.compare(this.f10898e0, aVar.f10898e0) == 0 && this.f10900f0 == aVar.f10900f0 && f.b(this.f10902g0, aVar.f10902g0) && f.b(this.f10904h0, aVar.f10904h0) && f.b(this.f10905i0, aVar.f10905i0) && f.b(this.f10907j0, aVar.f10907j0) && f.b(this.f10909k0, aVar.f10909k0) && f.b(this.f10911l0, aVar.f10911l0) && f.b(this.f10913m0, aVar.f10913m0) && f.b(this.f10915n0, aVar.f10915n0) && this.f10917o0 == aVar.f10917o0 && f.b(this.f10919p0, aVar.f10919p0) && f.b(this.f10921q0, aVar.f10921q0) && f.b(this.f10923r0, aVar.f10923r0) && f.b(this.s0, aVar.s0) && f.b(this.f10926t0, aVar.f10926t0) && f.b(this.f10928u0, aVar.f10928u0) && f.b(this.f10930v0, aVar.f10930v0) && f.b(this.f10932w0, aVar.f10932w0) && f.b(this.f10934x0, aVar.f10934x0) && f.b(this.f10936y0, aVar.f10936y0) && f.b(this.f10938z0, aVar.f10938z0) && this.f10862A0 == aVar.f10862A0 && f.b(this.f10864B0, aVar.f10864B0) && f.b(this.f10866C0, aVar.f10866C0) && f.b(this.f10868D0, aVar.f10868D0) && f.b(this.f10870E0, aVar.f10870E0) && f.b(this.f10872F0, aVar.f10872F0) && f.b(this.f10874G0, aVar.f10874G0) && f.b(this.f10876H0, aVar.f10876H0) && f.b(this.f10878I0, aVar.f10878I0);
        }

        public final int hashCode() {
            Integer num = this.f10889a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f10891b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10893c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f10895d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.f10897e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f10899f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool2 = this.f10901g;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.f10903h;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f10906j;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f10908k;
            int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f10910l;
            int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f10912m;
            int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f10914n;
            int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f10916o;
            int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f10918p;
            int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f10920q;
            int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f10922r;
            int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f10924s;
            int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.f10925t;
            int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.f10927u;
            int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.f10929v;
            int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.f10931w;
            int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.f10933x;
            int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.f10935y;
            int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.f10937z;
            int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.f10861A;
            int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.f10863B;
            int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.f10865C;
            int hashCode29 = (hashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.f10867D;
            int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
            String str28 = this.f10869E;
            int hashCode31 = (hashCode30 + (str28 == null ? 0 : str28.hashCode())) * 31;
            Integer num2 = this.f10871F;
            int hashCode32 = (hashCode31 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str29 = this.f10873G;
            int hashCode33 = (hashCode32 + (str29 == null ? 0 : str29.hashCode())) * 31;
            String str30 = this.f10875H;
            int hashCode34 = (hashCode33 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.f10877I;
            int hashCode35 = (hashCode34 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.f10879J;
            int hashCode36 = (hashCode35 + (str32 == null ? 0 : str32.hashCode())) * 31;
            String str33 = this.f10881K;
            int hashCode37 = (hashCode36 + (str33 == null ? 0 : str33.hashCode())) * 31;
            String str34 = this.f10882L;
            int hashCode38 = (hashCode37 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.f10883M;
            int hashCode39 = (hashCode38 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.f10884N;
            int hashCode40 = (hashCode39 + (str36 == null ? 0 : str36.hashCode())) * 31;
            String str37 = this.f10885O;
            int hashCode41 = (hashCode40 + (str37 == null ? 0 : str37.hashCode())) * 31;
            Long l10 = this.f10886P;
            int hashCode42 = (hashCode41 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Boolean bool3 = this.f10887Q;
            int hashCode43 = (hashCode42 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.R;
            int hashCode44 = (hashCode43 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str38 = this.S;
            int hashCode45 = (hashCode44 + (str38 == null ? 0 : str38.hashCode())) * 31;
            String str39 = this.T;
            int hashCode46 = (hashCode45 + (str39 == null ? 0 : str39.hashCode())) * 31;
            String str40 = this.U;
            int hashCode47 = (hashCode46 + (str40 == null ? 0 : str40.hashCode())) * 31;
            String str41 = this.V;
            int hashCode48 = (hashCode47 + (str41 == null ? 0 : str41.hashCode())) * 31;
            String str42 = this.W;
            int hashCode49 = (hashCode48 + (str42 == null ? 0 : str42.hashCode())) * 31;
            String str43 = this.X;
            int hashCode50 = (hashCode49 + (str43 == null ? 0 : str43.hashCode())) * 31;
            String str44 = this.Y;
            int hashCode51 = (hashCode50 + (str44 == null ? 0 : str44.hashCode())) * 31;
            String str45 = this.f10888Z;
            int hashCode52 = (hashCode51 + (str45 == null ? 0 : str45.hashCode())) * 31;
            String str46 = this.f10890a0;
            int hashCode53 = (hashCode52 + (str46 == null ? 0 : str46.hashCode())) * 31;
            String str47 = this.f10892b0;
            int hashCode54 = (hashCode53 + (str47 == null ? 0 : str47.hashCode())) * 31;
            Object obj = this.f10894c0;
            int d10 = v.d(v.a((this.f10896d0.hashCode() + ((hashCode54 + (obj == null ? 0 : obj.hashCode())) * 31)) * 31, this.f10898e0, 31), 31, this.f10900f0);
            Integer num3 = this.f10902g0;
            int hashCode55 = (d10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f10904h0;
            int f10 = v.f(this.f10905i0, (hashCode55 + (num4 == null ? 0 : num4.hashCode())) * 31, 31);
            List<b> list = this.f10907j0;
            int hashCode56 = (f10 + (list == null ? 0 : list.hashCode())) * 31;
            List<b> list2 = this.f10909k0;
            int hashCode57 = (hashCode56 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool5 = this.f10911l0;
            int hashCode58 = (hashCode57 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.f10913m0;
            int hashCode59 = (hashCode58 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str48 = this.f10915n0;
            int hashCode60 = (hashCode59 + (str48 == null ? 0 : str48.hashCode())) * 31;
            EmployeeCount employeeCount = this.f10917o0;
            int hashCode61 = (hashCode60 + (employeeCount == null ? 0 : employeeCount.hashCode())) * 31;
            Boolean bool7 = this.f10919p0;
            int hashCode62 = (hashCode61 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Float f11 = this.f10921q0;
            int hashCode63 = (hashCode62 + (f11 == null ? 0 : f11.hashCode())) * 31;
            Float f12 = this.f10923r0;
            int hashCode64 = (hashCode63 + (f12 == null ? 0 : f12.hashCode())) * 31;
            Integer num5 = this.s0;
            int hashCode65 = (hashCode64 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f10926t0;
            int hashCode66 = (hashCode65 + (num6 == null ? 0 : num6.hashCode())) * 31;
            List<String> list3 = this.f10928u0;
            int hashCode67 = (hashCode66 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.f10930v0;
            int hashCode68 = (hashCode67 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<String> list5 = this.f10932w0;
            int hashCode69 = (hashCode68 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<String> list6 = this.f10934x0;
            int hashCode70 = (hashCode69 + (list6 == null ? 0 : list6.hashCode())) * 31;
            List<String> list7 = this.f10936y0;
            int hashCode71 = (hashCode70 + (list7 == null ? 0 : list7.hashCode())) * 31;
            List<String> list8 = this.f10938z0;
            int hashCode72 = (hashCode71 + (list8 == null ? 0 : list8.hashCode())) * 31;
            SourceofWealth sourceofWealth = this.f10862A0;
            int hashCode73 = (hashCode72 + (sourceofWealth == null ? 0 : sourceofWealth.hashCode())) * 31;
            String str49 = this.f10864B0;
            int hashCode74 = (hashCode73 + (str49 == null ? 0 : str49.hashCode())) * 31;
            String str50 = this.f10866C0;
            int hashCode75 = (hashCode74 + (str50 == null ? 0 : str50.hashCode())) * 31;
            String str51 = this.f10868D0;
            int hashCode76 = (hashCode75 + (str51 == null ? 0 : str51.hashCode())) * 31;
            String str52 = this.f10870E0;
            int hashCode77 = (hashCode76 + (str52 == null ? 0 : str52.hashCode())) * 31;
            String str53 = this.f10872F0;
            int hashCode78 = (hashCode77 + (str53 == null ? 0 : str53.hashCode())) * 31;
            String str54 = this.f10874G0;
            int hashCode79 = (hashCode78 + (str54 == null ? 0 : str54.hashCode())) * 31;
            Double d11 = this.f10876H0;
            int hashCode80 = (hashCode79 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Boolean bool8 = this.f10878I0;
            return hashCode80 + (bool8 != null ? bool8.hashCode() : 0);
        }

        public final String toString() {
            return "CompanyDomain(id=" + this.f10889a + ", uuid=" + this.f10891b + ", email=" + this.f10893c + ", emailValidated=" + this.f10895d + ", phoneAreaCode=" + this.f10897e + ", phone=" + this.f10899f + ", phoneValidated=" + this.f10901g + ", title=" + this.f10903h + ", firstName=" + this.i + ", lastName=" + this.f10906j + ", apartment=" + this.f10908k + ", house=" + this.f10910l + ", street=" + this.f10912m + ", city=" + this.f10914n + ", region=" + this.f10916o + ", country=" + this.f10918p + ", postcode=" + this.f10920q + ", birthday=" + this.f10922r + ", income=" + this.f10924s + ", incomeCurrency=" + this.f10925t + ", incomeFrequency=" + this.f10927u + ", residentialStatus=" + this.f10929v + ", numberOfDependants=" + this.f10931w + ", monthlyOtherHouseholdIncome=" + this.f10933x + ", monthlyHousingExpenses=" + this.f10935y + ", companyName=" + this.f10937z + ", companyNumber=" + this.f10861A + ", companyType=" + this.f10863B + ", otherCompanyType=" + this.f10865C + ", taxIdNumber=" + this.f10867D + ", website=" + this.f10869E + ", turnover=" + this.f10871F + ", countryOperation=" + this.f10873G + ", businessSectorType=" + this.f10875H + ", businessSector=" + this.f10877I + ", companyHouse=" + this.f10879J + ", companyStreet=" + this.f10881K + ", companyCity=" + this.f10882L + ", companyRegion=" + this.f10883M + ", countryRegistration=" + this.f10884N + ", companyPostcode=" + this.f10885O + ", registrationDate=" + this.f10886P + ", vatRegistered=" + this.f10887Q + ", vatRegisteredOver3months=" + this.R + ", vatNumber=" + this.S + ", role=" + this.T + ", state=" + this.U + ", kycState=" + this.V + ", avatarUri=" + this.W + ", appId=" + this.X + ", trustLevel=" + this.Y + ", applicationType=" + this.f10888Z + ", applicationVersion=" + this.f10890a0 + ", applicationInfo=" + this.f10892b0 + ", privacyPolicy=" + this.f10894c0 + ", statusIdentification=" + this.f10896d0 + ", singleValue=" + this.f10898e0 + ", needLicense=" + this.f10900f0 + ", monthIncoming=" + this.f10902g0 + ", monthOutgoing=" + this.f10904h0 + ", bankAccountsOutside=" + this.f10905i0 + ", contractorsIncoming=" + this.f10907j0 + ", contractorsOutgoing=" + this.f10909k0 + ", isPep=" + this.f10911l0 + ", isUs=" + this.f10913m0 + ", countryCitizenship=" + this.f10915n0 + ", employeesCount=" + this.f10917o0 + ", needsCryptoOperations=" + this.f10919p0 + ", cryptoTxSingleValue=" + this.f10921q0 + ", cryptoTurnoverMonthly=" + this.f10923r0 + ", cryptoTxsInMonthlyCount=" + this.s0 + ", cryptoTxsOutMonthlyCount=" + this.f10926t0 + ", paymentsInCountries=" + this.f10928u0 + ", paymentsOutCountries=" + this.f10930v0 + ", useOfCurrencies=" + this.f10932w0 + ", cryptoPaymentsInCountries=" + this.f10934x0 + ", cryptoPaymentsOutCountries=" + this.f10936y0 + ", cryptoUseOfCurrencies=" + this.f10938z0 + ", sourceOfWealth=" + this.f10862A0 + ", shortDescription=" + this.f10864B0 + ", link=" + this.f10866C0 + ", sourceOfFunds=" + this.f10868D0 + ", otherSourceOfFunds=" + this.f10870E0 + ", companySourceOfWealth=" + this.f10872F0 + ", companyOtherSourceOfWealth=" + this.f10874G0 + ", amount=" + this.f10876H0 + ", companyDomiciliary=" + this.f10878I0 + ")";
        }
    }

    /* compiled from: CorporateDetailsDomain.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f10946a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10947b;

        /* renamed from: c, reason: collision with root package name */
        public final Float f10948c;

        /* renamed from: d, reason: collision with root package name */
        public final String f10949d;

        /* renamed from: e, reason: collision with root package name */
        public final a f10950e;

        /* renamed from: f, reason: collision with root package name */
        public final Boolean f10951f;

        public b(List<String> list, String str, Float f10, String str2, a aVar, Boolean bool) {
            this.f10946a = list;
            this.f10947b = str;
            this.f10948c = f10;
            this.f10949d = str2;
            this.f10950e = aVar;
            this.f10951f = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return f.b(this.f10946a, bVar.f10946a) && f.b(this.f10947b, bVar.f10947b) && f.b(this.f10948c, bVar.f10948c) && f.b(this.f10949d, bVar.f10949d) && f.b(this.f10950e, bVar.f10950e) && f.b(this.f10951f, bVar.f10951f);
        }

        public final int hashCode() {
            List<String> list = this.f10946a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f10947b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f10 = this.f10948c;
            int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str2 = this.f10949d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.f10950e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Boolean bool = this.f10951f;
            return hashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "TeamMemberDomain(positions=" + this.f10946a + ", beneficiaryType=" + this.f10947b + ", sharesAmount=" + this.f10948c + ", memberRole=" + this.f10949d + ", member=" + this.f10950e + ", isCreator=" + this.f10951f + ")";
        }
    }

    public CorporateDetailsDomain(a aVar, List<b> list, List<String> list2, String str, String str2, Boolean bool, Float f10, String str3) {
        this.f10804a = aVar;
        this.f10805b = list;
        this.f10806c = list2;
        this.f10807d = str;
        this.f10808e = str2;
        this.f10809f = bool;
        this.f10810g = f10;
        this.f10811h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorporateDetailsDomain)) {
            return false;
        }
        CorporateDetailsDomain corporateDetailsDomain = (CorporateDetailsDomain) obj;
        return f.b(this.f10804a, corporateDetailsDomain.f10804a) && f.b(this.f10805b, corporateDetailsDomain.f10805b) && f.b(this.f10806c, corporateDetailsDomain.f10806c) && f.b(this.f10807d, corporateDetailsDomain.f10807d) && f.b(this.f10808e, corporateDetailsDomain.f10808e) && f.b(this.f10809f, corporateDetailsDomain.f10809f) && f.b(this.f10810g, corporateDetailsDomain.f10810g) && f.b(this.f10811h, corporateDetailsDomain.f10811h);
    }

    public final int hashCode() {
        a aVar = this.f10804a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        List<b> list = this.f10805b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f10806c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f10807d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10808e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f10809f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f10 = this.f10810g;
        int hashCode7 = (hashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str3 = this.f10811h;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CorporateDetailsDomain(company=" + this.f10804a + ", teamMembers=" + this.f10805b + ", myPositions=" + this.f10806c + ", myBeneficiaryType=" + this.f10807d + ", myRole=" + this.f10808e + ", isCreator=" + this.f10809f + ", mySharesAmount=" + this.f10810g + ", enrolledAt=" + this.f10811h + ")";
    }
}
