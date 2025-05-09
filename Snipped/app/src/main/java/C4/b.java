package c4;

import kotlin.jvm.internal.f;

/* compiled from: CreateExchangeRequestRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("source_currency")
    private String f8526a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("destination_currency")
    private String f8527b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("source_amount")
    private String f8528c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("crypto_account_wallet_id")
    private Long f8529d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("crypto_account_wallet_extra_id")
    private Long f8530e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("source_bankaccount_id")
    private Integer f8531f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("destination_bankaccount_id")
    private Integer f8532g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("external_account")
    private Boolean f8533h;

    @l3.b("external_account_requisites")
    private a i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("external_account_country")
    private String f8534j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("save_template")
    private Boolean f8535k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("template_name")
    private String f8536l;

    /* compiled from: CreateExchangeRequestRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("account")
        private String f8537a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("iban")
        private String f8538b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("to_name")
        private String f8539c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("benef_type")
        private String f8540d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("bic_swift")
        private String f8541e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("bank_name")
        private String f8542f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("address")
        private String f8543g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("sort_code")
        private String f8544h;

        @l3.b("bank_address")
        private String i;

        /* renamed from: j, reason: collision with root package name */
        @l3.b("to_reference")
        private String f8545j;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("bank_city")
        private String f8546k;

        /* renamed from: l, reason: collision with root package name */
        @l3.b("bank_country")
        private String f8547l;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f8537a = str;
            this.f8538b = str2;
            this.f8539c = str3;
            this.f8540d = str4;
            this.f8541e = str5;
            this.f8542f = str6;
            this.f8543g = str7;
            this.f8544h = str8;
            this.i = str9;
            this.f8545j = str10;
            this.f8546k = str11;
            this.f8547l = str12;
        }

        public final String a() {
            return this.f8537a;
        }

        public final String b() {
            return this.f8543g;
        }

        public final String c() {
            return this.i;
        }

        public final String d() {
            return this.f8546k;
        }

        public final String e() {
            return this.f8547l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f8537a, aVar.f8537a) && f.b(this.f8538b, aVar.f8538b) && f.b(this.f8539c, aVar.f8539c) && f.b(this.f8540d, aVar.f8540d) && f.b(this.f8541e, aVar.f8541e) && f.b(this.f8542f, aVar.f8542f) && f.b(this.f8543g, aVar.f8543g) && f.b(this.f8544h, aVar.f8544h) && f.b(this.i, aVar.i) && f.b(this.f8545j, aVar.f8545j) && f.b(this.f8546k, aVar.f8546k) && f.b(this.f8547l, aVar.f8547l);
        }

        public final String f() {
            return this.f8542f;
        }

        public final String g() {
            return this.f8540d;
        }

        public final String h() {
            return this.f8541e;
        }

        public final int hashCode() {
            String str = this.f8537a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f8538b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f8539c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8540d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f8541e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f8542f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f8543g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f8544h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f8545j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f8546k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f8547l;
            return hashCode11 + (str12 != null ? str12.hashCode() : 0);
        }

        public final String i() {
            return this.f8538b;
        }

        public final String j() {
            return this.f8545j;
        }

        public final String k() {
            return this.f8544h;
        }

        public final String l() {
            return this.f8539c;
        }

        public final String toString() {
            String str = this.f8537a;
            String str2 = this.f8538b;
            String str3 = this.f8539c;
            String str4 = this.f8540d;
            String str5 = this.f8541e;
            String str6 = this.f8542f;
            String str7 = this.f8543g;
            String str8 = this.f8544h;
            String str9 = this.i;
            String str10 = this.f8545j;
            String str11 = this.f8546k;
            String str12 = this.f8547l;
            StringBuilder p10 = s3.b.p("ExternalAccountRequisitesRaw(account=", str, ", iban=", str2, ", toName=");
            androidx.camera.core.impl.utils.a.u(p10, str3, ", benefType=", str4, ", bicSwift=");
            androidx.camera.core.impl.utils.a.u(p10, str5, ", bankName=", str6, ", address=");
            androidx.camera.core.impl.utils.a.u(p10, str7, ", sortCode=", str8, ", bankAddress=");
            androidx.camera.core.impl.utils.a.u(p10, str9, ", reference=", str10, ", bankCity=");
            return s3.b.o(p10, str11, ", bankCountry=", str12, ")");
        }
    }

    public b(String str, String str2, String str3, Long l10, Long l11, Integer num, Integer num2, Boolean bool, a aVar, String str4, Boolean bool2, String str5) {
        this.f8526a = str;
        this.f8527b = str2;
        this.f8528c = str3;
        this.f8529d = l10;
        this.f8530e = l11;
        this.f8531f = num;
        this.f8532g = num2;
        this.f8533h = bool;
        this.i = aVar;
        this.f8534j = str4;
        this.f8535k = bool2;
        this.f8536l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f8526a, bVar.f8526a) && f.b(this.f8527b, bVar.f8527b) && f.b(this.f8528c, bVar.f8528c) && f.b(this.f8529d, bVar.f8529d) && f.b(this.f8530e, bVar.f8530e) && f.b(this.f8531f, bVar.f8531f) && f.b(this.f8532g, bVar.f8532g) && f.b(this.f8533h, bVar.f8533h) && f.b(this.i, bVar.i) && f.b(this.f8534j, bVar.f8534j) && f.b(this.f8535k, bVar.f8535k) && f.b(this.f8536l, bVar.f8536l);
    }

    public final int hashCode() {
        String str = this.f8526a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8527b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8528c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f8529d;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f8530e;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f8531f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f8532g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f8533h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.i;
        int hashCode9 = (hashCode8 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.f8534j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.f8535k;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.f8536l;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f8526a;
        String str2 = this.f8527b;
        String str3 = this.f8528c;
        Long l10 = this.f8529d;
        Long l11 = this.f8530e;
        Integer num = this.f8531f;
        Integer num2 = this.f8532g;
        Boolean bool = this.f8533h;
        a aVar = this.i;
        String str4 = this.f8534j;
        Boolean bool2 = this.f8535k;
        String str5 = this.f8536l;
        StringBuilder p10 = s3.b.p("CreateExchangeRequestRaw(sourceCurrency=", str, ", destionationCurrency=", str2, ", sourceAmount=");
        p10.append(str3);
        p10.append(", cryptoWalletId=");
        p10.append(l10);
        p10.append(", cryptoAccountWalletExtraId=");
        p10.append(l11);
        p10.append(", sourceBankAccountId=");
        p10.append(num);
        p10.append(", destinationBankAccountId=");
        p10.append(num2);
        p10.append(", externalAccount=");
        p10.append(bool);
        p10.append(", externalAccountRequisites=");
        p10.append(aVar);
        p10.append(", externalAccountCountry=");
        p10.append(str4);
        p10.append(", saveTemplate=");
        p10.append(bool2);
        p10.append(", templateName=");
        p10.append(str5);
        p10.append(")");
        return p10.toString();
    }
}
