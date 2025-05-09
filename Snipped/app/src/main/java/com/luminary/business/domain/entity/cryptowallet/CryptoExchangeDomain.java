package com.luminary.business.domain.entity.cryptowallet;

import C.v;
import P9.s;
import androidx.camera.core.n;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.f;
import s3.b;
import w5.C1572a;

/* compiled from: CryptoExchangeDomain.kt */
/* loaded from: classes.dex */
public final class CryptoExchangeDomain implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    public final ExchangeStatus f11008A;

    /* renamed from: B, reason: collision with root package name */
    public String f11009B;

    /* renamed from: C, reason: collision with root package name */
    public final String f11010C;

    /* renamed from: D, reason: collision with root package name */
    public final String f11011D;

    /* renamed from: E, reason: collision with root package name */
    public final Double f11012E;

    /* renamed from: F, reason: collision with root package name */
    public final String f11013F;

    /* renamed from: G, reason: collision with root package name */
    public final String f11014G;

    /* renamed from: H, reason: collision with root package name */
    public final String f11015H;

    /* renamed from: I, reason: collision with root package name */
    public final String f11016I;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f11017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11018b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f11019c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f11020d;

    /* renamed from: e, reason: collision with root package name */
    public final CryptoAccountDomain f11021e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f11022f;

    /* renamed from: g, reason: collision with root package name */
    public final MovementType f11023g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11024h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final Double f11025j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11026k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11027l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11028m;

    /* renamed from: n, reason: collision with root package name */
    public final Double f11029n;

    /* renamed from: o, reason: collision with root package name */
    public Double f11030o;

    /* renamed from: p, reason: collision with root package name */
    public final Double f11031p;

    /* renamed from: q, reason: collision with root package name */
    public final Date f11032q;

    /* renamed from: r, reason: collision with root package name */
    public final Date f11033r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11034s;

    /* renamed from: t, reason: collision with root package name */
    public final String f11035t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11036u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11037v;

    /* renamed from: w, reason: collision with root package name */
    public final String f11038w;

    /* renamed from: x, reason: collision with root package name */
    public final String f11039x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f11040y;

    /* renamed from: z, reason: collision with root package name */
    public final Map<String, a> f11041z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoExchangeDomain.kt */
    public static final class ExchangeStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11042a;

        /* renamed from: b, reason: collision with root package name */
        public static final ExchangeStatus f11043b;

        /* renamed from: c, reason: collision with root package name */
        public static final ExchangeStatus f11044c;

        /* renamed from: d, reason: collision with root package name */
        public static final ExchangeStatus f11045d;

        /* renamed from: e, reason: collision with root package name */
        public static final ExchangeStatus f11046e;

        /* renamed from: f, reason: collision with root package name */
        public static final ExchangeStatus f11047f;

        /* renamed from: g, reason: collision with root package name */
        public static final ExchangeStatus f11048g;

        /* renamed from: h, reason: collision with root package name */
        public static final ExchangeStatus f11049h;
        public static final ExchangeStatus i;

        /* renamed from: j, reason: collision with root package name */
        public static final ExchangeStatus f11050j;

        /* renamed from: k, reason: collision with root package name */
        public static final ExchangeStatus f11051k;

        /* renamed from: l, reason: collision with root package name */
        public static final ExchangeStatus f11052l;

        /* renamed from: m, reason: collision with root package name */
        public static final ExchangeStatus f11053m;

        /* renamed from: n, reason: collision with root package name */
        public static final ExchangeStatus f11054n;

        /* renamed from: o, reason: collision with root package name */
        public static final ExchangeStatus f11055o;

        /* renamed from: p, reason: collision with root package name */
        public static final ExchangeStatus f11056p;

        /* renamed from: q, reason: collision with root package name */
        public static final ExchangeStatus f11057q;

        /* renamed from: r, reason: collision with root package name */
        public static final ExchangeStatus f11058r;

        /* renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ ExchangeStatus[] f11059s;

        /* compiled from: CryptoExchangeDomain.kt */
        public static final class a {
        }

        static {
            ExchangeStatus exchangeStatus = new ExchangeStatus("NEW", 0);
            f11043b = exchangeStatus;
            ExchangeStatus exchangeStatus2 = new ExchangeStatus("READY", 1);
            f11044c = exchangeStatus2;
            ExchangeStatus exchangeStatus3 = new ExchangeStatus("SUBMITTED", 2);
            f11045d = exchangeStatus3;
            ExchangeStatus exchangeStatus4 = new ExchangeStatus("SUCCESS", 3);
            f11046e = exchangeStatus4;
            ExchangeStatus exchangeStatus5 = new ExchangeStatus("CLEARED", 4);
            f11047f = exchangeStatus5;
            ExchangeStatus exchangeStatus6 = new ExchangeStatus("FAILED", 5);
            f11048g = exchangeStatus6;
            ExchangeStatus exchangeStatus7 = new ExchangeStatus("ASSETS_SENT", 6);
            f11049h = exchangeStatus7;
            ExchangeStatus exchangeStatus8 = new ExchangeStatus("ASSETS_RECEIVED", 7);
            i = exchangeStatus8;
            ExchangeStatus exchangeStatus9 = new ExchangeStatus("SIGNED", 8);
            f11050j = exchangeStatus9;
            ExchangeStatus exchangeStatus10 = new ExchangeStatus("REFUND_REQUESTED", 9);
            f11051k = exchangeStatus10;
            ExchangeStatus exchangeStatus11 = new ExchangeStatus("REFUNDED", 10);
            f11052l = exchangeStatus11;
            ExchangeStatus exchangeStatus12 = new ExchangeStatus("PENDING_WITHDRAW", 11);
            f11053m = exchangeStatus12;
            ExchangeStatus exchangeStatus13 = new ExchangeStatus("AWAITING_FUNDS", 12);
            f11054n = exchangeStatus13;
            ExchangeStatus exchangeStatus14 = new ExchangeStatus("AWAITING_SETTLEMENT", 13);
            f11055o = exchangeStatus14;
            ExchangeStatus exchangeStatus15 = new ExchangeStatus("COMPLETED", 14);
            f11056p = exchangeStatus15;
            ExchangeStatus exchangeStatus16 = new ExchangeStatus("IN_PROGRESS", 15);
            f11057q = exchangeStatus16;
            ExchangeStatus exchangeStatus17 = new ExchangeStatus("REJECTED", 16);
            f11058r = exchangeStatus17;
            f11059s = new ExchangeStatus[]{exchangeStatus, exchangeStatus2, exchangeStatus3, exchangeStatus4, exchangeStatus5, exchangeStatus6, exchangeStatus7, exchangeStatus8, exchangeStatus9, exchangeStatus10, exchangeStatus11, exchangeStatus12, exchangeStatus13, exchangeStatus14, exchangeStatus15, exchangeStatus16, exchangeStatus17};
            f11042a = new a();
        }

        public ExchangeStatus() {
            throw null;
        }

        public static ExchangeStatus valueOf(String str) {
            return (ExchangeStatus) Enum.valueOf(ExchangeStatus.class, str);
        }

        public static ExchangeStatus[] values() {
            return (ExchangeStatus[]) f11059s.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoExchangeDomain.kt */
    public static final class MovementType {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11060a;

        /* renamed from: b, reason: collision with root package name */
        public static final MovementType f11061b;

        /* renamed from: c, reason: collision with root package name */
        public static final MovementType f11062c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MovementType[] f11063d;

        /* compiled from: CryptoExchangeDomain.kt */
        public static final class a {
        }

        static {
            MovementType movementType = new MovementType("DEPOSIT", 0);
            f11061b = movementType;
            MovementType movementType2 = new MovementType("WITHDRAW", 1);
            f11062c = movementType2;
            f11063d = new MovementType[]{movementType, movementType2};
            f11060a = new a();
        }

        public MovementType() {
            throw null;
        }

        public static MovementType valueOf(String str) {
            return (MovementType) Enum.valueOf(MovementType.class, str);
        }

        public static MovementType[] values() {
            return (MovementType[]) f11063d.clone();
        }
    }

    /* compiled from: CryptoExchangeDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f11064a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11065b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11066c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11067d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11068e;

        /* renamed from: f, reason: collision with root package name */
        public final String f11069f;

        /* renamed from: g, reason: collision with root package name */
        public final String f11070g;

        /* renamed from: h, reason: collision with root package name */
        public final String f11071h;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f11064a = str;
            this.f11065b = str2;
            this.f11066c = str3;
            this.f11067d = str4;
            this.f11068e = str5;
            this.f11069f = str6;
            this.f11070g = str7;
            this.f11071h = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f11064a, aVar.f11064a) && f.b(this.f11065b, aVar.f11065b) && f.b(this.f11066c, aVar.f11066c) && f.b(this.f11067d, aVar.f11067d) && f.b(this.f11068e, aVar.f11068e) && f.b(this.f11069f, aVar.f11069f) && f.b(this.f11070g, aVar.f11070g) && f.b(this.f11071h, aVar.f11071h);
        }

        public final int hashCode() {
            String str = this.f11064a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f11065b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11066c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11067d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f11068e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f11069f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f11070g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f11071h;
            return hashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CryptoRequisitesDomain(account=");
            sb2.append(this.f11064a);
            sb2.append(", iban=");
            sb2.append(this.f11065b);
            sb2.append(", fullName=");
            sb2.append(this.f11066c);
            sb2.append(", beneficaryType=");
            sb2.append(this.f11067d);
            sb2.append(", bicSwift=");
            sb2.append(this.f11068e);
            sb2.append(", bankName=");
            sb2.append(this.f11069f);
            sb2.append(", sortCode=");
            sb2.append(this.f11070g);
            sb2.append(", reference=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f11071h, ")");
        }
    }

    public CryptoExchangeDomain(Integer num, String str, Integer num2, Integer num3, CryptoAccountDomain cryptoAccountDomain, Integer num4, MovementType movementType, String str2, String str3, Double d10, String str4, String str5, String str6, Double d11, Double d12, Double d13, Date date, Date date2, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, LinkedHashMap linkedHashMap, ExchangeStatus exchangeStatus, String str13, String str14, String str15, Double d14, String str16, String str17, String str18, String str19) {
        this.f11017a = num;
        this.f11018b = str;
        this.f11019c = num2;
        this.f11020d = num3;
        this.f11021e = cryptoAccountDomain;
        this.f11022f = num4;
        this.f11023g = movementType;
        this.f11024h = str2;
        this.i = str3;
        this.f11025j = d10;
        this.f11026k = str4;
        this.f11027l = str5;
        this.f11028m = str6;
        this.f11029n = d11;
        this.f11030o = d12;
        this.f11031p = d13;
        this.f11032q = date;
        this.f11033r = date2;
        this.f11034s = str7;
        this.f11035t = str8;
        this.f11036u = str9;
        this.f11037v = str10;
        this.f11038w = str11;
        this.f11039x = str12;
        this.f11040y = bool;
        this.f11041z = linkedHashMap;
        this.f11008A = exchangeStatus;
        this.f11009B = str13;
        this.f11010C = str14;
        this.f11011D = str15;
        this.f11012E = d14;
        this.f11013F = str16;
        this.f11014G = str17;
        this.f11015H = str18;
        this.f11016I = str19;
    }

    public static String b(int i, String str) {
        return str.length() >= i ? str.substring(0, i) : v.n(str, C0967l.W(i - str.length(), "0"));
    }

    public final String a(boolean z10, C1572a c1572a) {
        Integer num;
        Integer num2;
        Double d10 = z10 ? this.f11029n : this.f11030o;
        String str = z10 ? this.f11027l : this.f11028m;
        if (d10 == null) {
            return "";
        }
        String plainString = new BigDecimal(String.valueOf(d10.doubleValue())).toPlainString();
        if (plainString == null) {
            return ".00";
        }
        String str2 = (String) s.R(C0969n.r0(plainString, new String[]{"."}));
        String str3 = str2 != null ? str2 : "";
        int i = 2;
        if (str3.length() != 0) {
            if (K3.a.c(str)) {
                return str3.length() == 1 ? n.a(".", str3, "0") : b.j(".", b(2, str3));
            }
            return b.j(".", b((c1572a == null || (num = c1572a.f30832g) == null) ? 0 : num.intValue(), str3));
        }
        if (K3.a.c(str)) {
            return ".00";
        }
        if (c1572a != null && (num2 = c1572a.f30832g) != null) {
            i = num2.intValue();
        }
        return b.j(".", C0967l.W(i, "0"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0038, code lost:
    
        if (r4.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(w5.C1572a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "0"
            java.lang.Double r2 = r8.f11031p
            java.lang.String r3 = ""
            if (r2 != 0) goto Lc
            r4 = r3
            goto L3b
        Lc:
            java.math.BigDecimal r4 = new java.math.BigDecimal
            double r5 = r2.doubleValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.<init>(r5)
            java.lang.String r4 = r4.toPlainString()
            if (r4 == 0) goto L3a
            java.lang.String[] r5 = new java.lang.String[]{r0}
            java.util.List r4 = ka.C0969n.r0(r4, r5)
            java.lang.Object r4 = P9.s.L(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L30
            r4 = r3
        L30:
            java.lang.String r4 = D9.b.p(r4)
            int r5 = r4.length()
            if (r5 != 0) goto L3b
        L3a:
            r4 = r1
        L3b:
            if (r2 != 0) goto L3f
            goto Lb9
        L3f:
            java.math.BigDecimal r5 = new java.math.BigDecimal
            double r6 = r2.doubleValue()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r5.<init>(r2)
            java.lang.String r2 = r5.toPlainString()
            java.lang.String r5 = ".00"
            if (r2 == 0) goto L75
            java.lang.String[] r6 = new java.lang.String[]{r0}
            java.util.List r2 = ka.C0969n.r0(r2, r6)
            java.lang.Object r2 = P9.s.R(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L65
            goto L66
        L65:
            r3 = r2
        L66:
            int r2 = r3.length()
            java.lang.String r6 = r8.f11010C
            r7 = 2
            if (r2 != 0) goto L8a
            boolean r2 = K3.a.c(r6)
            if (r2 == 0) goto L77
        L75:
            r3 = r5
            goto Lb9
        L77:
            if (r9 == 0) goto L81
            java.lang.Integer r9 = r9.f30832g
            if (r9 == 0) goto L81
            int r7 = r9.intValue()
        L81:
            java.lang.String r9 = ka.C0967l.W(r7, r1)
            java.lang.String r3 = s3.b.j(r0, r9)
            goto Lb9
        L8a:
            boolean r2 = K3.a.c(r6)
            if (r2 == 0) goto La5
            int r9 = r3.length()
            r2 = 1
            if (r9 != r2) goto L9c
            java.lang.String r3 = androidx.camera.core.n.a(r0, r3, r1)
            goto Lb9
        L9c:
            java.lang.String r9 = b(r7, r3)
            java.lang.String r3 = s3.b.j(r0, r9)
            goto Lb9
        La5:
            if (r9 == 0) goto Lb0
            java.lang.Integer r9 = r9.f30832g
            if (r9 == 0) goto Lb0
            int r9 = r9.intValue()
            goto Lb1
        Lb0:
            r9 = 0
        Lb1:
            java.lang.String r9 = b(r9, r3)
            java.lang.String r3 = s3.b.j(r0, r9)
        Lb9:
            java.lang.String r9 = C.v.n(r4, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain.c(w5.a):java.lang.String");
    }

    public final boolean d() {
        return this.f11008A == ExchangeStatus.i;
    }

    public final boolean e() {
        return this.f11008A == ExchangeStatus.f11058r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoExchangeDomain)) {
            return false;
        }
        CryptoExchangeDomain cryptoExchangeDomain = (CryptoExchangeDomain) obj;
        return f.b(this.f11017a, cryptoExchangeDomain.f11017a) && f.b(this.f11018b, cryptoExchangeDomain.f11018b) && f.b(this.f11019c, cryptoExchangeDomain.f11019c) && f.b(this.f11020d, cryptoExchangeDomain.f11020d) && f.b(this.f11021e, cryptoExchangeDomain.f11021e) && f.b(this.f11022f, cryptoExchangeDomain.f11022f) && this.f11023g == cryptoExchangeDomain.f11023g && f.b(this.f11024h, cryptoExchangeDomain.f11024h) && f.b(this.i, cryptoExchangeDomain.i) && f.b(this.f11025j, cryptoExchangeDomain.f11025j) && f.b(this.f11026k, cryptoExchangeDomain.f11026k) && f.b(this.f11027l, cryptoExchangeDomain.f11027l) && f.b(this.f11028m, cryptoExchangeDomain.f11028m) && f.b(this.f11029n, cryptoExchangeDomain.f11029n) && f.b(this.f11030o, cryptoExchangeDomain.f11030o) && f.b(this.f11031p, cryptoExchangeDomain.f11031p) && f.b(this.f11032q, cryptoExchangeDomain.f11032q) && f.b(this.f11033r, cryptoExchangeDomain.f11033r) && f.b(this.f11034s, cryptoExchangeDomain.f11034s) && f.b(this.f11035t, cryptoExchangeDomain.f11035t) && f.b(this.f11036u, cryptoExchangeDomain.f11036u) && f.b(this.f11037v, cryptoExchangeDomain.f11037v) && f.b(this.f11038w, cryptoExchangeDomain.f11038w) && f.b(this.f11039x, cryptoExchangeDomain.f11039x) && f.b(this.f11040y, cryptoExchangeDomain.f11040y) && f.b(this.f11041z, cryptoExchangeDomain.f11041z) && this.f11008A == cryptoExchangeDomain.f11008A && f.b(this.f11009B, cryptoExchangeDomain.f11009B) && f.b(this.f11010C, cryptoExchangeDomain.f11010C) && f.b(this.f11011D, cryptoExchangeDomain.f11011D) && f.b(this.f11012E, cryptoExchangeDomain.f11012E) && f.b(this.f11013F, cryptoExchangeDomain.f11013F) && f.b(this.f11014G, cryptoExchangeDomain.f11014G) && f.b(this.f11015H, cryptoExchangeDomain.f11015H) && f.b(this.f11016I, cryptoExchangeDomain.f11016I);
    }

    public final boolean f() {
        return this.f11008A == ExchangeStatus.f11057q;
    }

    public final int hashCode() {
        Integer num = this.f11017a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f11018b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f11019c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f11020d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        CryptoAccountDomain cryptoAccountDomain = this.f11021e;
        int hashCode5 = (hashCode4 + (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode())) * 31;
        Integer num4 = this.f11022f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MovementType movementType = this.f11023g;
        int hashCode7 = (hashCode6 + (movementType == null ? 0 : movementType.hashCode())) * 31;
        String str2 = this.f11024h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.f11025j;
        int hashCode10 = (hashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str4 = this.f11026k;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11027l;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11028m;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d11 = this.f11029n;
        int hashCode14 = (hashCode13 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f11030o;
        int hashCode15 = (hashCode14 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f11031p;
        int hashCode16 = (hashCode15 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Date date = this.f11032q;
        int hashCode17 = (hashCode16 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f11033r;
        int hashCode18 = (hashCode17 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str7 = this.f11034s;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11035t;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f11036u;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f11037v;
        int hashCode22 = (hashCode21 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11038w;
        int hashCode23 = (hashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f11039x;
        int hashCode24 = (hashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.f11040y;
        int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, a> map = this.f11041z;
        int hashCode26 = (this.f11008A.hashCode() + ((hashCode25 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        String str13 = this.f11009B;
        int hashCode27 = (hashCode26 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f11010C;
        int hashCode28 = (hashCode27 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f11011D;
        int hashCode29 = (hashCode28 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Double d14 = this.f11012E;
        int hashCode30 = (hashCode29 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str16 = this.f11013F;
        int hashCode31 = (hashCode30 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f11014G;
        int hashCode32 = (hashCode31 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f11015H;
        int hashCode33 = (hashCode32 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f11016I;
        return hashCode33 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String toString() {
        Double d10 = this.f11030o;
        String str = this.f11009B;
        StringBuilder sb2 = new StringBuilder("CryptoExchangeDomain(id=");
        sb2.append(this.f11017a);
        sb2.append(", reference=");
        sb2.append(this.f11018b);
        sb2.append(", clientId=");
        sb2.append(this.f11019c);
        sb2.append(", accountId=");
        sb2.append(this.f11020d);
        sb2.append(", cryptoAccount=");
        sb2.append(this.f11021e);
        sb2.append(", walletId=");
        sb2.append(this.f11022f);
        sb2.append(", movementType=");
        sb2.append(this.f11023g);
        sb2.append(", fiat=");
        sb2.append(this.f11024h);
        sb2.append(", token=");
        sb2.append(this.i);
        sb2.append(", rate=");
        sb2.append(this.f11025j);
        sb2.append(", direction=");
        sb2.append(this.f11026k);
        sb2.append(", sourceCurrency=");
        sb2.append(this.f11027l);
        sb2.append(", destinationCurrency=");
        sb2.append(this.f11028m);
        sb2.append(", sourceAmount=");
        com.google.android.gms.measurement.internal.a.r(sb2, this.f11029n, ", destinationAmount=", d10, ", comissionAmount=");
        sb2.append(this.f11031p);
        sb2.append(", createdAt=");
        sb2.append(this.f11032q);
        sb2.append(", updatedAt=");
        sb2.append(this.f11033r);
        sb2.append(", account=");
        sb2.append(this.f11034s);
        sb2.append(", iban=");
        sb2.append(this.f11035t);
        sb2.append(", toName=");
        sb2.append(this.f11036u);
        sb2.append(", beneficaryType=");
        sb2.append(this.f11037v);
        sb2.append(", bicSwift=");
        sb2.append(this.f11038w);
        sb2.append(", bankName=");
        sb2.append(this.f11039x);
        sb2.append(", externalAccount=");
        sb2.append(this.f11040y);
        sb2.append(", requisitesDomain=");
        sb2.append(this.f11041z);
        sb2.append(", status=");
        sb2.append(this.f11008A);
        sb2.append(", externalAccountCountry=");
        sb2.append(str);
        sb2.append(", comissionCurrency=");
        sb2.append(this.f11010C);
        sb2.append(", blockchainTxId=");
        sb2.append(this.f11011D);
        sb2.append(", comissionDisplayAmount=");
        sb2.append(this.f11012E);
        sb2.append(", comissionType=");
        sb2.append(this.f11013F);
        sb2.append(", sourceNetwork=");
        sb2.append(this.f11014G);
        sb2.append(", fromAddress=");
        sb2.append(this.f11015H);
        sb2.append(", toAddress=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f11016I, ")");
    }
}
