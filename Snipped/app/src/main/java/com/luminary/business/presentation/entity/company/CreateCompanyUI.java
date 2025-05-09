package com.luminary.business.presentation.entity.company;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;
import s3.b;

/* compiled from: CreateCompanyUI.kt */
/* loaded from: classes2.dex */
public final class CreateCompanyUI implements Parcelable {
    public static final Parcelable.Creator<CreateCompanyUI> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public String f11264A;

    /* renamed from: B, reason: collision with root package name */
    public Double f11265B;

    /* renamed from: C, reason: collision with root package name */
    public Boolean f11266C;

    /* renamed from: a, reason: collision with root package name */
    public String f11267a;

    /* renamed from: b, reason: collision with root package name */
    public String f11268b;

    /* renamed from: c, reason: collision with root package name */
    public String f11269c;

    /* renamed from: d, reason: collision with root package name */
    public String f11270d;

    /* renamed from: e, reason: collision with root package name */
    public String f11271e;

    /* renamed from: f, reason: collision with root package name */
    public String f11272f;

    /* renamed from: g, reason: collision with root package name */
    public String f11273g;

    /* renamed from: h, reason: collision with root package name */
    public String f11274h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f11275j;

    /* renamed from: k, reason: collision with root package name */
    public String f11276k;

    /* renamed from: l, reason: collision with root package name */
    public String f11277l;

    /* renamed from: m, reason: collision with root package name */
    public String f11278m;

    /* renamed from: n, reason: collision with root package name */
    public String f11279n;

    /* renamed from: o, reason: collision with root package name */
    public String f11280o;

    /* renamed from: p, reason: collision with root package name */
    public String f11281p;

    /* renamed from: q, reason: collision with root package name */
    public String f11282q;

    /* renamed from: r, reason: collision with root package name */
    public String f11283r;

    /* renamed from: s, reason: collision with root package name */
    public String f11284s;

    /* renamed from: t, reason: collision with root package name */
    public String f11285t;

    /* renamed from: u, reason: collision with root package name */
    public String f11286u;

    /* renamed from: v, reason: collision with root package name */
    public List<String> f11287v;

    /* renamed from: w, reason: collision with root package name */
    public String f11288w;

    /* renamed from: x, reason: collision with root package name */
    public String f11289x;

    /* renamed from: y, reason: collision with root package name */
    public String f11290y;

    /* renamed from: z, reason: collision with root package name */
    public String f11291z;

    /* compiled from: CreateCompanyUI.kt */
    public static final class ContractorUI implements Parcelable {
        public static final Parcelable.Creator<ContractorUI> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f11292a;

        /* renamed from: b, reason: collision with root package name */
        public String f11293b;

        /* renamed from: c, reason: collision with root package name */
        public String f11294c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11295d;

        /* compiled from: CreateCompanyUI.kt */
        public static final class a implements Parcelable.Creator<ContractorUI> {
            @Override // android.os.Parcelable.Creator
            public final ContractorUI createFromParcel(Parcel parcel) {
                return new ContractorUI(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ContractorUI[] newArray(int i) {
                return new ContractorUI[i];
            }
        }

        public ContractorUI(String str, String str2, String str3, String str4) {
            this.f11292a = str;
            this.f11293b = str2;
            this.f11294c = str3;
            this.f11295d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContractorUI)) {
                return false;
            }
            ContractorUI contractorUI = (ContractorUI) obj;
            return f.b(this.f11292a, contractorUI.f11292a) && f.b(this.f11293b, contractorUI.f11293b) && f.b(this.f11294c, contractorUI.f11294c) && f.b(this.f11295d, contractorUI.f11295d);
        }

        public final int hashCode() {
            String str = this.f11292a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f11293b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11294c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11295d;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f11292a;
            String str2 = this.f11293b;
            String str3 = this.f11294c;
            StringBuilder p10 = b.p("ContractorUI(name=", str, ", countryIncorporation=", str2, ", businessDescription=");
            p10.append(str3);
            p10.append(", info=");
            return androidx.camera.core.impl.utils.a.n(p10, this.f11295d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11292a);
            parcel.writeString(this.f11293b);
            parcel.writeString(this.f11294c);
            parcel.writeString(this.f11295d);
        }
    }

    /* compiled from: CreateCompanyUI.kt */
    public static final class a implements Parcelable.Creator<CreateCompanyUI> {
        @Override // android.os.Parcelable.Creator
        public final CreateCompanyUI createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CreateCompanyUI(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, createStringArrayList, readString22, readString23, readString24, readString25, readString26, valueOf2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CreateCompanyUI[] newArray(int i) {
            return new CreateCompanyUI[i];
        }
    }

    public CreateCompanyUI() {
        this(536870911, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCompanyUI)) {
            return false;
        }
        CreateCompanyUI createCompanyUI = (CreateCompanyUI) obj;
        return f.b(this.f11267a, createCompanyUI.f11267a) && f.b(this.f11268b, createCompanyUI.f11268b) && f.b(this.f11269c, createCompanyUI.f11269c) && f.b(this.f11270d, createCompanyUI.f11270d) && f.b(this.f11271e, createCompanyUI.f11271e) && f.b(this.f11272f, createCompanyUI.f11272f) && f.b(this.f11273g, createCompanyUI.f11273g) && f.b(this.f11274h, createCompanyUI.f11274h) && f.b(this.i, createCompanyUI.i) && f.b(this.f11275j, createCompanyUI.f11275j) && f.b(this.f11276k, createCompanyUI.f11276k) && f.b(this.f11277l, createCompanyUI.f11277l) && f.b(this.f11278m, createCompanyUI.f11278m) && f.b(this.f11279n, createCompanyUI.f11279n) && f.b(this.f11280o, createCompanyUI.f11280o) && f.b(this.f11281p, createCompanyUI.f11281p) && f.b(this.f11282q, createCompanyUI.f11282q) && f.b(this.f11283r, createCompanyUI.f11283r) && f.b(this.f11284s, createCompanyUI.f11284s) && f.b(this.f11285t, createCompanyUI.f11285t) && f.b(this.f11286u, createCompanyUI.f11286u) && f.b(this.f11287v, createCompanyUI.f11287v) && f.b(this.f11288w, createCompanyUI.f11288w) && f.b(this.f11289x, createCompanyUI.f11289x) && f.b(this.f11290y, createCompanyUI.f11290y) && f.b(this.f11291z, createCompanyUI.f11291z) && f.b(this.f11264A, createCompanyUI.f11264A) && f.b(this.f11265B, createCompanyUI.f11265B) && f.b(this.f11266C, createCompanyUI.f11266C);
    }

    public final int hashCode() {
        String str = this.f11267a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11268b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11269c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11270d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11271e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11272f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11273g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11274h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f11275j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11276k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f11277l;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f11278m;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f11279n;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f11280o;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f11281p;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f11282q;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f11283r;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f11284s;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f11285t;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f11286u;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        List<String> list = this.f11287v;
        int hashCode22 = (hashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        String str22 = this.f11288w;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f11289x;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f11290y;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f11291z;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f11264A;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Double d10 = this.f11265B;
        int hashCode28 = (hashCode27 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool = this.f11266C;
        return hashCode28 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f11267a;
        String str2 = this.f11268b;
        String str3 = this.f11269c;
        String str4 = this.f11270d;
        String str5 = this.f11271e;
        String str6 = this.f11272f;
        String str7 = this.f11273g;
        String str8 = this.f11274h;
        String str9 = this.i;
        String str10 = this.f11275j;
        String str11 = this.f11276k;
        String str12 = this.f11277l;
        String str13 = this.f11278m;
        String str14 = this.f11279n;
        String str15 = this.f11280o;
        String str16 = this.f11281p;
        String str17 = this.f11282q;
        String str18 = this.f11283r;
        String str19 = this.f11284s;
        String str20 = this.f11285t;
        String str21 = this.f11286u;
        List<String> list = this.f11287v;
        String str22 = this.f11288w;
        String str23 = this.f11289x;
        String str24 = this.f11290y;
        String str25 = this.f11291z;
        String str26 = this.f11264A;
        Double d10 = this.f11265B;
        Boolean bool = this.f11266C;
        StringBuilder p10 = b.p("CreateCompanyUI(myBeneficiaryType=", str, ", countryRegistration=", str2, ", countryName=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", email=", str4, ", phoneAreaCode=");
        androidx.camera.core.impl.utils.a.u(p10, str5, ", phone=", str6, ", companyName=");
        androidx.camera.core.impl.utils.a.u(p10, str7, ", companyNumber=", str8, ", taxIdNumber=");
        androidx.camera.core.impl.utils.a.u(p10, str9, ", companyType=", str10, ", companyTypeOther=");
        androidx.camera.core.impl.utils.a.u(p10, str11, ", businessSector=", str12, ", businessSectorType=");
        androidx.camera.core.impl.utils.a.u(p10, str13, ", website=", str14, ", companyStreet=");
        androidx.camera.core.impl.utils.a.u(p10, str15, ", companyHouse=", str16, ", companyCity=");
        androidx.camera.core.impl.utils.a.u(p10, str17, ", companyRegion=", str18, ", companyPostcode=");
        androidx.camera.core.impl.utils.a.u(p10, str19, ", companyPremises=", str20, ", mySharesAmount=");
        p10.append(str21);
        p10.append(", myPositions=");
        p10.append(list);
        p10.append(", employeeCount=");
        androidx.camera.core.impl.utils.a.u(p10, str22, ", sourceOfFunds=", str23, ", otherSourceOfFunds=");
        androidx.camera.core.impl.utils.a.u(p10, str24, ", companySourceOfWealth=", str25, ", companyOtherSourceOfWealth=");
        p10.append(str26);
        p10.append(", amount=");
        p10.append(d10);
        p10.append(", domiciliaryCompany=");
        p10.append(bool);
        p10.append(")");
        return p10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11267a);
        parcel.writeString(this.f11268b);
        parcel.writeString(this.f11269c);
        parcel.writeString(this.f11270d);
        parcel.writeString(this.f11271e);
        parcel.writeString(this.f11272f);
        parcel.writeString(this.f11273g);
        parcel.writeString(this.f11274h);
        parcel.writeString(this.i);
        parcel.writeString(this.f11275j);
        parcel.writeString(this.f11276k);
        parcel.writeString(this.f11277l);
        parcel.writeString(this.f11278m);
        parcel.writeString(this.f11279n);
        parcel.writeString(this.f11280o);
        parcel.writeString(this.f11281p);
        parcel.writeString(this.f11282q);
        parcel.writeString(this.f11283r);
        parcel.writeString(this.f11284s);
        parcel.writeString(this.f11285t);
        parcel.writeString(this.f11286u);
        parcel.writeStringList(this.f11287v);
        parcel.writeString(this.f11288w);
        parcel.writeString(this.f11289x);
        parcel.writeString(this.f11290y);
        parcel.writeString(this.f11291z);
        parcel.writeString(this.f11264A);
        Double d10 = this.f11265B;
        if (d10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d10.doubleValue());
        }
        Boolean bool = this.f11266C;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ CreateCompanyUI(int i, Double d10) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (i & 134217728) != 0 ? null : d10, null);
    }

    public CreateCompanyUI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List<String> list, String str22, String str23, String str24, String str25, String str26, Double d10, Boolean bool) {
        this.f11267a = str;
        this.f11268b = str2;
        this.f11269c = str3;
        this.f11270d = str4;
        this.f11271e = str5;
        this.f11272f = str6;
        this.f11273g = str7;
        this.f11274h = str8;
        this.i = str9;
        this.f11275j = str10;
        this.f11276k = str11;
        this.f11277l = str12;
        this.f11278m = str13;
        this.f11279n = str14;
        this.f11280o = str15;
        this.f11281p = str16;
        this.f11282q = str17;
        this.f11283r = str18;
        this.f11284s = str19;
        this.f11285t = str20;
        this.f11286u = str21;
        this.f11287v = list;
        this.f11288w = str22;
        this.f11289x = str23;
        this.f11290y = str24;
        this.f11291z = str25;
        this.f11264A = str26;
        this.f11265B = d10;
        this.f11266C = bool;
        f.b(str2, "gb");
    }
}
