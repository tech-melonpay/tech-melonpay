package com.luminary.business.domain.entity.cryptowallet;

import androidx.camera.core.impl.utils.a;
import java.io.Serializable;
import kotlin.jvm.internal.f;
import s3.b;

/* compiled from: CryptoExchangeCreateDomain.kt */
/* loaded from: classes.dex */
public final class CryptoExchangeCreateRequestDomain implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f10986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10987b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10988c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f10989d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10990e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f10991f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f10992g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f10993h;
    public final ExternalAccountRequisitesDomain i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10994j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f10995k;

    /* renamed from: l, reason: collision with root package name */
    public final String f10996l;

    /* compiled from: CryptoExchangeCreateDomain.kt */
    public static final class ExternalAccountRequisitesDomain implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public String f10997a;

        /* renamed from: b, reason: collision with root package name */
        public String f10998b;

        /* renamed from: c, reason: collision with root package name */
        public String f10999c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11000d;

        /* renamed from: e, reason: collision with root package name */
        public String f11001e;

        /* renamed from: f, reason: collision with root package name */
        public String f11002f;

        /* renamed from: g, reason: collision with root package name */
        public final String f11003g;

        /* renamed from: h, reason: collision with root package name */
        public String f11004h;
        public String i;

        /* renamed from: j, reason: collision with root package name */
        public String f11005j;

        /* renamed from: k, reason: collision with root package name */
        public final String f11006k;

        /* renamed from: l, reason: collision with root package name */
        public String f11007l;

        public ExternalAccountRequisitesDomain() {
            this(null, 4095);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExternalAccountRequisitesDomain)) {
                return false;
            }
            ExternalAccountRequisitesDomain externalAccountRequisitesDomain = (ExternalAccountRequisitesDomain) obj;
            return f.b(this.f10997a, externalAccountRequisitesDomain.f10997a) && f.b(this.f10998b, externalAccountRequisitesDomain.f10998b) && f.b(this.f10999c, externalAccountRequisitesDomain.f10999c) && f.b(this.f11000d, externalAccountRequisitesDomain.f11000d) && f.b(this.f11001e, externalAccountRequisitesDomain.f11001e) && f.b(this.f11002f, externalAccountRequisitesDomain.f11002f) && f.b(this.f11003g, externalAccountRequisitesDomain.f11003g) && f.b(this.f11004h, externalAccountRequisitesDomain.f11004h) && f.b(this.i, externalAccountRequisitesDomain.i) && f.b(this.f11005j, externalAccountRequisitesDomain.f11005j) && f.b(this.f11006k, externalAccountRequisitesDomain.f11006k) && f.b(this.f11007l, externalAccountRequisitesDomain.f11007l);
        }

        public final int hashCode() {
            String str = this.f10997a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f10998b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f10999c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11000d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f11001e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f11002f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f11003g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f11004h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f11005j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f11006k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f11007l;
            return hashCode11 + (str12 != null ? str12.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f10997a;
            String str2 = this.f10998b;
            String str3 = this.f10999c;
            String str4 = this.f11001e;
            String str5 = this.f11002f;
            String str6 = this.f11004h;
            String str7 = this.i;
            String str8 = this.f11005j;
            String str9 = this.f11007l;
            StringBuilder p10 = b.p("ExternalAccountRequisitesDomain(account=", str, ", iban=", str2, ", toName=");
            p10.append(str3);
            p10.append(", benefType=");
            a.u(p10, this.f11000d, ", bicSwift=", str4, ", bankName=");
            p10.append(str5);
            p10.append(", address=");
            a.u(p10, this.f11003g, ", sortCode=", str6, ", bankAddress=");
            a.u(p10, str7, ", toReference=", str8, ", bankCity=");
            return b.o(p10, this.f11006k, ", bankCountry=", str9, ")");
        }

        public /* synthetic */ ExternalAccountRequisitesDomain(String str, int i) {
            this(null, null, null, (i & 8) != 0 ? null : str, null, null, null, null, null, null, null, null);
        }

        public ExternalAccountRequisitesDomain(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f10997a = str;
            this.f10998b = str2;
            this.f10999c = str3;
            this.f11000d = str4;
            this.f11001e = str5;
            this.f11002f = str6;
            this.f11003g = str7;
            this.f11004h = str8;
            this.i = str9;
            this.f11005j = str10;
            this.f11006k = str11;
            this.f11007l = str12;
        }
    }

    public CryptoExchangeCreateRequestDomain(String str, String str2, String str3, Long l10, Long l11, Integer num, Integer num2, Boolean bool, ExternalAccountRequisitesDomain externalAccountRequisitesDomain, String str4, Boolean bool2, String str5) {
        this.f10986a = str;
        this.f10987b = str2;
        this.f10988c = str3;
        this.f10989d = l10;
        this.f10990e = l11;
        this.f10991f = num;
        this.f10992g = num2;
        this.f10993h = bool;
        this.i = externalAccountRequisitesDomain;
        this.f10994j = str4;
        this.f10995k = bool2;
        this.f10996l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoExchangeCreateRequestDomain)) {
            return false;
        }
        CryptoExchangeCreateRequestDomain cryptoExchangeCreateRequestDomain = (CryptoExchangeCreateRequestDomain) obj;
        return f.b(this.f10986a, cryptoExchangeCreateRequestDomain.f10986a) && f.b(this.f10987b, cryptoExchangeCreateRequestDomain.f10987b) && f.b(this.f10988c, cryptoExchangeCreateRequestDomain.f10988c) && f.b(this.f10989d, cryptoExchangeCreateRequestDomain.f10989d) && f.b(this.f10990e, cryptoExchangeCreateRequestDomain.f10990e) && f.b(this.f10991f, cryptoExchangeCreateRequestDomain.f10991f) && f.b(this.f10992g, cryptoExchangeCreateRequestDomain.f10992g) && f.b(this.f10993h, cryptoExchangeCreateRequestDomain.f10993h) && f.b(this.i, cryptoExchangeCreateRequestDomain.i) && f.b(this.f10994j, cryptoExchangeCreateRequestDomain.f10994j) && f.b(this.f10995k, cryptoExchangeCreateRequestDomain.f10995k) && f.b(this.f10996l, cryptoExchangeCreateRequestDomain.f10996l);
    }

    public final int hashCode() {
        String str = this.f10986a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10987b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10988c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f10989d;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f10990e;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f10991f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10992g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f10993h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        ExternalAccountRequisitesDomain externalAccountRequisitesDomain = this.i;
        int hashCode9 = (hashCode8 + (externalAccountRequisitesDomain == null ? 0 : externalAccountRequisitesDomain.hashCode())) * 31;
        String str4 = this.f10994j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f10995k;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.f10996l;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CryptoExchangeCreateRequestDomain(sourceCurrency=");
        sb2.append(this.f10986a);
        sb2.append(", destinationCurrency=");
        sb2.append(this.f10987b);
        sb2.append(", sourceAmount=");
        sb2.append(this.f10988c);
        sb2.append(", walletId=");
        sb2.append(this.f10989d);
        sb2.append(", accountWalletExtraId=");
        sb2.append(this.f10990e);
        sb2.append(", sourceBankAccountId=");
        sb2.append(this.f10991f);
        sb2.append(", destinationBankAccountId=");
        sb2.append(this.f10992g);
        sb2.append(", externalAccount=");
        sb2.append(this.f10993h);
        sb2.append(", externalAccountRequisites=");
        sb2.append(this.i);
        sb2.append(", externalAccountCountry=");
        sb2.append(this.f10994j);
        sb2.append(", saveTemplate=");
        sb2.append(this.f10995k);
        sb2.append(", templateName=");
        return a.n(sb2, this.f10996l, ")");
    }
}
