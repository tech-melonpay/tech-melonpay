package com.luminary.business.presentation.entity.company;

import android.os.Parcel;
import android.os.Parcelable;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;

/* compiled from: CompanyDetailsUI.kt */
/* loaded from: classes2.dex */
public final class CompanyDetailsUI implements Parcelable {
    public static final Parcelable.Creator<CompanyDetailsUI> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final CompanyUI f11192a;

    /* renamed from: b, reason: collision with root package name */
    public final List<TeamMemberUI> f11193b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f11194c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11195d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11196e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f11197f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f11198g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11199h;

    /* compiled from: CompanyDetailsUI.kt */
    public static final class CompanyUI implements Parcelable {
        public static final Parcelable.Creator<CompanyUI> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name */
        public final String f11200A;

        /* renamed from: B, reason: collision with root package name */
        public final String f11201B;

        /* renamed from: C, reason: collision with root package name */
        public final String f11202C;

        /* renamed from: D, reason: collision with root package name */
        public final String f11203D;

        /* renamed from: E, reason: collision with root package name */
        public Integer f11204E;

        /* renamed from: F, reason: collision with root package name */
        public final String f11205F;

        /* renamed from: G, reason: collision with root package name */
        public final String f11206G;

        /* renamed from: H, reason: collision with root package name */
        public final String f11207H;

        /* renamed from: I, reason: collision with root package name */
        public final String f11208I;

        /* renamed from: J, reason: collision with root package name */
        public final String f11209J;

        /* renamed from: K, reason: collision with root package name */
        public final String f11210K;

        /* renamed from: L, reason: collision with root package name */
        public final String f11211L;

        /* renamed from: M, reason: collision with root package name */
        public final String f11212M;

        /* renamed from: N, reason: collision with root package name */
        public final String f11213N;

        /* renamed from: O, reason: collision with root package name */
        public final Long f11214O;

        /* renamed from: P, reason: collision with root package name */
        public final Boolean f11215P;

        /* renamed from: Q, reason: collision with root package name */
        public final Boolean f11216Q;
        public final String R;
        public final String S;
        public final String T;
        public final String U;
        public final String V;
        public final String W;
        public final String X;
        public final String Y;

        /* renamed from: Z, reason: collision with root package name */
        public final String f11217Z;

        /* renamed from: a, reason: collision with root package name */
        public final Integer f11218a;

        /* renamed from: a0, reason: collision with root package name */
        public final String f11219a0;

        /* renamed from: b, reason: collision with root package name */
        public final String f11220b;

        /* renamed from: b0, reason: collision with root package name */
        public final CorporateDetailsDomain.StatusIdentification f11221b0;

        /* renamed from: c, reason: collision with root package name */
        public final String f11222c;

        /* renamed from: c0, reason: collision with root package name */
        public Long f11223c0;

        /* renamed from: d, reason: collision with root package name */
        public final Boolean f11224d;

        /* renamed from: d0, reason: collision with root package name */
        public BigDecimal f11225d0;

        /* renamed from: e, reason: collision with root package name */
        public final String f11226e;

        /* renamed from: f, reason: collision with root package name */
        public final String f11227f;

        /* renamed from: f0, reason: collision with root package name */
        public BigDecimal f11228f0;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f11229g;

        /* renamed from: g0, reason: collision with root package name */
        public final String f11230g0;

        /* renamed from: h, reason: collision with root package name */
        public final String f11231h;

        /* renamed from: h0, reason: collision with root package name */
        public Boolean f11232h0;
        public final String i;

        /* renamed from: i0, reason: collision with root package name */
        public final CorporateDetailsDomain.EmployeeCount f11233i0;

        /* renamed from: j, reason: collision with root package name */
        public final String f11234j;

        /* renamed from: j0, reason: collision with root package name */
        public List<String> f11235j0;

        /* renamed from: k, reason: collision with root package name */
        public final String f11236k;

        /* renamed from: k0, reason: collision with root package name */
        public List<String> f11237k0;

        /* renamed from: l, reason: collision with root package name */
        public final String f11238l;

        /* renamed from: l0, reason: collision with root package name */
        public List<String> f11239l0;

        /* renamed from: m, reason: collision with root package name */
        public final String f11240m;

        /* renamed from: m0, reason: collision with root package name */
        public ArrayList<BankAccountOutside> f11241m0;

        /* renamed from: n, reason: collision with root package name */
        public final String f11242n;

        /* renamed from: n0, reason: collision with root package name */
        public Map<Integer, CreateCompanyUI.ContractorUI> f11243n0;

        /* renamed from: o, reason: collision with root package name */
        public final String f11244o;

        /* renamed from: o0, reason: collision with root package name */
        public Map<Integer, CreateCompanyUI.ContractorUI> f11245o0;

        /* renamed from: p, reason: collision with root package name */
        public final String f11246p;

        /* renamed from: p0, reason: collision with root package name */
        public Boolean f11247p0;

        /* renamed from: q, reason: collision with root package name */
        public final String f11248q;

        /* renamed from: q0, reason: collision with root package name */
        public Long f11249q0;

        /* renamed from: r, reason: collision with root package name */
        public final String f11250r;

        /* renamed from: r0, reason: collision with root package name */
        public Long f11251r0;

        /* renamed from: s, reason: collision with root package name */
        public final String f11252s;
        public BigDecimal s0;

        /* renamed from: t, reason: collision with root package name */
        public final String f11253t;

        /* renamed from: t0, reason: collision with root package name */
        public BigDecimal f11254t0;

        /* renamed from: u, reason: collision with root package name */
        public final String f11255u;

        /* renamed from: u0, reason: collision with root package name */
        public List<String> f11256u0;

        /* renamed from: v, reason: collision with root package name */
        public final String f11257v;

        /* renamed from: v0, reason: collision with root package name */
        public List<String> f11258v0;

        /* renamed from: w, reason: collision with root package name */
        public final String f11259w;

        /* renamed from: w0, reason: collision with root package name */
        public List<String> f11260w0;

        /* renamed from: x, reason: collision with root package name */
        public final String f11261x;

        /* renamed from: y, reason: collision with root package name */
        public final String f11262y;

        /* renamed from: z, reason: collision with root package name */
        public final String f11263z;

        /* compiled from: CompanyDetailsUI.kt */
        public static final class a implements Parcelable.Creator<CompanyUI> {
            @Override // android.os.Parcelable.Creator
            public final CompanyUI createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                ArrayList arrayList;
                ArrayList arrayList2;
                String str;
                LinkedHashMap linkedHashMap;
                String str2;
                CreateCompanyUI.ContractorUI createFromParcel;
                LinkedHashMap linkedHashMap2;
                LinkedHashMap linkedHashMap3;
                LinkedHashMap linkedHashMap4;
                CreateCompanyUI.ContractorUI createFromParcel2;
                Boolean valueOf6;
                Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
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
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                String readString24 = parcel.readString();
                String readString25 = parcel.readString();
                String readString26 = parcel.readString();
                String readString27 = parcel.readString();
                Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString28 = parcel.readString();
                String readString29 = parcel.readString();
                String readString30 = parcel.readString();
                String readString31 = parcel.readString();
                String readString32 = parcel.readString();
                String readString33 = parcel.readString();
                String readString34 = parcel.readString();
                String readString35 = parcel.readString();
                String readString36 = parcel.readString();
                Long valueOf9 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString37 = parcel.readString();
                String readString38 = parcel.readString();
                String readString39 = parcel.readString();
                String readString40 = parcel.readString();
                String readString41 = parcel.readString();
                String readString42 = parcel.readString();
                String readString43 = parcel.readString();
                String readString44 = parcel.readString();
                String readString45 = parcel.readString();
                String readString46 = parcel.readString();
                CorporateDetailsDomain.StatusIdentification valueOf10 = CorporateDetailsDomain.StatusIdentification.valueOf(parcel.readString());
                Long valueOf11 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                String readString47 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                CorporateDetailsDomain.EmployeeCount valueOf12 = parcel.readInt() == 0 ? null : CorporateDetailsDomain.EmployeeCount.valueOf(parcel.readString());
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        arrayList3.add(parcel.readSerializable());
                        i++;
                        readInt = readInt;
                    }
                    arrayList = arrayList3;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = arrayList;
                    str = readString9;
                    linkedHashMap = null;
                } else {
                    int readInt2 = parcel.readInt();
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt2);
                    arrayList2 = arrayList;
                    int i9 = 0;
                    while (i9 != readInt2) {
                        int i10 = readInt2;
                        Integer valueOf13 = Integer.valueOf(parcel.readInt());
                        if (parcel.readInt() == 0) {
                            str2 = readString9;
                            createFromParcel = null;
                        } else {
                            str2 = readString9;
                            createFromParcel = CreateCompanyUI.ContractorUI.CREATOR.createFromParcel(parcel);
                        }
                        linkedHashMap5.put(valueOf13, createFromParcel);
                        i9++;
                        readString9 = str2;
                        readInt2 = i10;
                    }
                    str = readString9;
                    linkedHashMap = linkedHashMap5;
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = linkedHashMap;
                    linkedHashMap3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt3);
                    int i11 = 0;
                    while (i11 != readInt3) {
                        int i12 = readInt3;
                        Integer valueOf14 = Integer.valueOf(parcel.readInt());
                        if (parcel.readInt() == 0) {
                            linkedHashMap4 = linkedHashMap;
                            createFromParcel2 = null;
                        } else {
                            linkedHashMap4 = linkedHashMap;
                            createFromParcel2 = CreateCompanyUI.ContractorUI.CREATOR.createFromParcel(parcel);
                        }
                        linkedHashMap6.put(valueOf14, createFromParcel2);
                        i11++;
                        linkedHashMap = linkedHashMap4;
                        readInt3 = i12;
                    }
                    linkedHashMap2 = linkedHashMap;
                    linkedHashMap3 = linkedHashMap6;
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CompanyUI(valueOf7, readString, readString2, valueOf, readString3, readString4, valueOf2, readString5, readString6, readString7, readString8, str, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, valueOf8, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, valueOf9, valueOf3, valueOf4, readString37, readString38, readString39, readString40, readString41, readString42, readString43, readString44, readString45, readString46, valueOf10, valueOf11, bigDecimal, bigDecimal2, readString47, valueOf5, valueOf12, createStringArrayList, createStringArrayList2, createStringArrayList3, arrayList2, linkedHashMap2, linkedHashMap3, valueOf6, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final CompanyUI[] newArray(int i) {
                return new CompanyUI[i];
            }
        }

        public CompanyUI(Integer num, String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num2, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, Long l10, Boolean bool3, Boolean bool4, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, CorporateDetailsDomain.StatusIdentification statusIdentification, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str47, Boolean bool5, CorporateDetailsDomain.EmployeeCount employeeCount, List list, List list2, List list3, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Boolean bool6, Long l12, Long l13, BigDecimal bigDecimal3, BigDecimal bigDecimal4, List list4, List list5, List list6) {
            this.f11218a = num;
            this.f11220b = str;
            this.f11222c = str2;
            this.f11224d = bool;
            this.f11226e = str3;
            this.f11227f = str4;
            this.f11229g = bool2;
            this.f11231h = str5;
            this.i = str6;
            this.f11234j = str7;
            this.f11236k = str8;
            this.f11238l = str9;
            this.f11240m = str10;
            this.f11242n = str11;
            this.f11244o = str12;
            this.f11246p = str13;
            this.f11248q = str14;
            this.f11250r = str15;
            this.f11252s = str16;
            this.f11253t = str17;
            this.f11255u = str18;
            this.f11257v = str19;
            this.f11259w = str20;
            this.f11261x = str21;
            this.f11262y = str22;
            this.f11263z = str23;
            this.f11200A = str24;
            this.f11201B = str25;
            this.f11202C = str26;
            this.f11203D = str27;
            this.f11204E = num2;
            this.f11205F = str28;
            this.f11206G = str29;
            this.f11207H = str30;
            this.f11208I = str31;
            this.f11209J = str32;
            this.f11210K = str33;
            this.f11211L = str34;
            this.f11212M = str35;
            this.f11213N = str36;
            this.f11214O = l10;
            this.f11215P = bool3;
            this.f11216Q = bool4;
            this.R = str37;
            this.S = str38;
            this.T = str39;
            this.U = str40;
            this.V = str41;
            this.W = str42;
            this.X = str43;
            this.Y = str44;
            this.f11217Z = str45;
            this.f11219a0 = str46;
            this.f11221b0 = statusIdentification;
            this.f11223c0 = l11;
            this.f11225d0 = bigDecimal;
            this.f11228f0 = bigDecimal2;
            this.f11230g0 = str47;
            this.f11232h0 = bool5;
            this.f11233i0 = employeeCount;
            this.f11235j0 = list;
            this.f11237k0 = list2;
            this.f11239l0 = list3;
            this.f11241m0 = arrayList;
            this.f11243n0 = linkedHashMap;
            this.f11245o0 = linkedHashMap2;
            this.f11247p0 = bool6;
            this.f11249q0 = l12;
            this.f11251r0 = l13;
            this.s0 = bigDecimal3;
            this.f11254t0 = bigDecimal4;
            this.f11256u0 = list4;
            this.f11258v0 = list5;
            this.f11260w0 = list6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompanyUI)) {
                return false;
            }
            CompanyUI companyUI = (CompanyUI) obj;
            return f.b(this.f11218a, companyUI.f11218a) && f.b(this.f11220b, companyUI.f11220b) && f.b(this.f11222c, companyUI.f11222c) && f.b(this.f11224d, companyUI.f11224d) && f.b(this.f11226e, companyUI.f11226e) && f.b(this.f11227f, companyUI.f11227f) && f.b(this.f11229g, companyUI.f11229g) && f.b(this.f11231h, companyUI.f11231h) && f.b(this.i, companyUI.i) && f.b(this.f11234j, companyUI.f11234j) && f.b(this.f11236k, companyUI.f11236k) && f.b(this.f11238l, companyUI.f11238l) && f.b(this.f11240m, companyUI.f11240m) && f.b(this.f11242n, companyUI.f11242n) && f.b(this.f11244o, companyUI.f11244o) && f.b(this.f11246p, companyUI.f11246p) && f.b(this.f11248q, companyUI.f11248q) && f.b(this.f11250r, companyUI.f11250r) && f.b(this.f11252s, companyUI.f11252s) && f.b(this.f11253t, companyUI.f11253t) && f.b(this.f11255u, companyUI.f11255u) && f.b(this.f11257v, companyUI.f11257v) && f.b(this.f11259w, companyUI.f11259w) && f.b(this.f11261x, companyUI.f11261x) && f.b(this.f11262y, companyUI.f11262y) && f.b(this.f11263z, companyUI.f11263z) && f.b(this.f11200A, companyUI.f11200A) && f.b(this.f11201B, companyUI.f11201B) && f.b(this.f11202C, companyUI.f11202C) && f.b(this.f11203D, companyUI.f11203D) && f.b(this.f11204E, companyUI.f11204E) && f.b(this.f11205F, companyUI.f11205F) && f.b(this.f11206G, companyUI.f11206G) && f.b(this.f11207H, companyUI.f11207H) && f.b(this.f11208I, companyUI.f11208I) && f.b(this.f11209J, companyUI.f11209J) && f.b(this.f11210K, companyUI.f11210K) && f.b(this.f11211L, companyUI.f11211L) && f.b(this.f11212M, companyUI.f11212M) && f.b(this.f11213N, companyUI.f11213N) && f.b(this.f11214O, companyUI.f11214O) && f.b(this.f11215P, companyUI.f11215P) && f.b(this.f11216Q, companyUI.f11216Q) && f.b(this.R, companyUI.R) && f.b(this.S, companyUI.S) && f.b(this.T, companyUI.T) && f.b(this.U, companyUI.U) && f.b(this.V, companyUI.V) && f.b(this.W, companyUI.W) && f.b(this.X, companyUI.X) && f.b(this.Y, companyUI.Y) && f.b(this.f11217Z, companyUI.f11217Z) && f.b(this.f11219a0, companyUI.f11219a0) && this.f11221b0 == companyUI.f11221b0 && f.b(this.f11223c0, companyUI.f11223c0) && f.b(this.f11225d0, companyUI.f11225d0) && f.b(this.f11228f0, companyUI.f11228f0) && f.b(this.f11230g0, companyUI.f11230g0) && f.b(this.f11232h0, companyUI.f11232h0) && this.f11233i0 == companyUI.f11233i0 && f.b(this.f11235j0, companyUI.f11235j0) && f.b(this.f11237k0, companyUI.f11237k0) && f.b(this.f11239l0, companyUI.f11239l0) && f.b(this.f11241m0, companyUI.f11241m0) && f.b(this.f11243n0, companyUI.f11243n0) && f.b(this.f11245o0, companyUI.f11245o0) && f.b(this.f11247p0, companyUI.f11247p0) && f.b(this.f11249q0, companyUI.f11249q0) && f.b(this.f11251r0, companyUI.f11251r0) && f.b(this.s0, companyUI.s0) && f.b(this.f11254t0, companyUI.f11254t0) && f.b(this.f11256u0, companyUI.f11256u0) && f.b(this.f11258v0, companyUI.f11258v0) && f.b(this.f11260w0, companyUI.f11260w0);
        }

        public final int hashCode() {
            Integer num = this.f11218a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f11220b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11222c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f11224d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.f11226e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11227f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool2 = this.f11229g;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str5 = this.f11231h;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f11234j;
            int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f11236k;
            int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f11238l;
            int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f11240m;
            int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f11242n;
            int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f11244o;
            int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f11246p;
            int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f11248q;
            int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f11250r;
            int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f11252s;
            int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.f11253t;
            int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.f11255u;
            int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
            String str19 = this.f11257v;
            int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
            String str20 = this.f11259w;
            int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
            String str21 = this.f11261x;
            int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
            String str22 = this.f11262y;
            int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
            String str23 = this.f11263z;
            int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
            String str24 = this.f11200A;
            int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
            String str25 = this.f11201B;
            int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
            String str26 = this.f11202C;
            int hashCode29 = (hashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
            String str27 = this.f11203D;
            int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
            Integer num2 = this.f11204E;
            int hashCode31 = (hashCode30 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str28 = this.f11205F;
            int hashCode32 = (hashCode31 + (str28 == null ? 0 : str28.hashCode())) * 31;
            String str29 = this.f11206G;
            int hashCode33 = (hashCode32 + (str29 == null ? 0 : str29.hashCode())) * 31;
            String str30 = this.f11207H;
            int hashCode34 = (hashCode33 + (str30 == null ? 0 : str30.hashCode())) * 31;
            String str31 = this.f11208I;
            int hashCode35 = (hashCode34 + (str31 == null ? 0 : str31.hashCode())) * 31;
            String str32 = this.f11209J;
            int hashCode36 = (hashCode35 + (str32 == null ? 0 : str32.hashCode())) * 31;
            String str33 = this.f11210K;
            int hashCode37 = (hashCode36 + (str33 == null ? 0 : str33.hashCode())) * 31;
            String str34 = this.f11211L;
            int hashCode38 = (hashCode37 + (str34 == null ? 0 : str34.hashCode())) * 31;
            String str35 = this.f11212M;
            int hashCode39 = (hashCode38 + (str35 == null ? 0 : str35.hashCode())) * 31;
            String str36 = this.f11213N;
            int hashCode40 = (hashCode39 + (str36 == null ? 0 : str36.hashCode())) * 31;
            Long l10 = this.f11214O;
            int hashCode41 = (hashCode40 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Boolean bool3 = this.f11215P;
            int hashCode42 = (hashCode41 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f11216Q;
            int hashCode43 = (hashCode42 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str37 = this.R;
            int hashCode44 = (hashCode43 + (str37 == null ? 0 : str37.hashCode())) * 31;
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
            String str45 = this.f11217Z;
            int hashCode52 = (hashCode51 + (str45 == null ? 0 : str45.hashCode())) * 31;
            String str46 = this.f11219a0;
            int hashCode53 = (this.f11221b0.hashCode() + ((hashCode52 + (str46 == null ? 0 : str46.hashCode())) * 31)) * 31;
            Long l11 = this.f11223c0;
            int hashCode54 = (hashCode53 + (l11 == null ? 0 : l11.hashCode())) * 31;
            BigDecimal bigDecimal = this.f11225d0;
            int hashCode55 = (hashCode54 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.f11228f0;
            int hashCode56 = (hashCode55 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            String str47 = this.f11230g0;
            int hashCode57 = (hashCode56 + (str47 == null ? 0 : str47.hashCode())) * 31;
            Boolean bool5 = this.f11232h0;
            int hashCode58 = (hashCode57 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            CorporateDetailsDomain.EmployeeCount employeeCount = this.f11233i0;
            int hashCode59 = (hashCode58 + (employeeCount == null ? 0 : employeeCount.hashCode())) * 31;
            List<String> list = this.f11235j0;
            int hashCode60 = (hashCode59 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.f11237k0;
            int hashCode61 = (hashCode60 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<String> list3 = this.f11239l0;
            int hashCode62 = (hashCode61 + (list3 == null ? 0 : list3.hashCode())) * 31;
            ArrayList<BankAccountOutside> arrayList = this.f11241m0;
            int hashCode63 = (hashCode62 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            Map<Integer, CreateCompanyUI.ContractorUI> map = this.f11243n0;
            int hashCode64 = (hashCode63 + (map == null ? 0 : map.hashCode())) * 31;
            Map<Integer, CreateCompanyUI.ContractorUI> map2 = this.f11245o0;
            int hashCode65 = (hashCode64 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Boolean bool6 = this.f11247p0;
            int hashCode66 = (hashCode65 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Long l12 = this.f11249q0;
            int hashCode67 = (hashCode66 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f11251r0;
            int hashCode68 = (hashCode67 + (l13 == null ? 0 : l13.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.s0;
            int hashCode69 = (hashCode68 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.f11254t0;
            int hashCode70 = (hashCode69 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            List<String> list4 = this.f11256u0;
            int hashCode71 = (hashCode70 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<String> list5 = this.f11258v0;
            int hashCode72 = (hashCode71 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<String> list6 = this.f11260w0;
            return hashCode72 + (list6 != null ? list6.hashCode() : 0);
        }

        public final String toString() {
            return "CompanyUI(id=" + this.f11218a + ", uuid=" + this.f11220b + ", email=" + this.f11222c + ", emailValidated=" + this.f11224d + ", phoneAreaCode=" + this.f11226e + ", phone=" + this.f11227f + ", phoneValidated=" + this.f11229g + ", title=" + this.f11231h + ", firstName=" + this.i + ", lastName=" + this.f11234j + ", apartment=" + this.f11236k + ", house=" + this.f11238l + ", street=" + this.f11240m + ", city=" + this.f11242n + ", region=" + this.f11244o + ", country=" + this.f11246p + ", postcode=" + this.f11248q + ", birthday=" + this.f11250r + ", income=" + this.f11252s + ", incomeCurrency=" + this.f11253t + ", incomeFrequency=" + this.f11255u + ", residentialStatus=" + this.f11257v + ", numberOfDependants=" + this.f11259w + ", monthlyOtherHouseholdIncome=" + this.f11261x + ", monthlyHousingExpenses=" + this.f11262y + ", companyName=" + this.f11263z + ", companyNumber=" + this.f11200A + ", companyType=" + this.f11201B + ", taxIdNumber=" + this.f11202C + ", website=" + this.f11203D + ", turnover=" + this.f11204E + ", countryOperation=" + this.f11205F + ", businessSectorType=" + this.f11206G + ", businessSector=" + this.f11207H + ", companyHouse=" + this.f11208I + ", companyStreet=" + this.f11209J + ", companyCity=" + this.f11210K + ", companyRegion=" + this.f11211L + ", countryRegistration=" + this.f11212M + ", companyPostcode=" + this.f11213N + ", registrationDate=" + this.f11214O + ", vatRegistered=" + this.f11215P + ", vatRegisteredOver3months=" + this.f11216Q + ", vatNumber=" + this.R + ", role=" + this.S + ", state=" + this.T + ", kycState=" + this.U + ", avatarUri=" + this.V + ", appId=" + this.W + ", trustLevel=" + this.X + ", applicationType=" + this.Y + ", applicationVersion=" + this.f11217Z + ", applicationInfo=" + this.f11219a0 + ", statusIdentification=" + this.f11221b0 + ", txSingleValue=" + this.f11223c0 + ", txsInMonthlyCount=" + this.f11225d0 + ", txsOutMonthlyCount=" + this.f11228f0 + ", businessDescription=" + this.f11230g0 + ", needsLicense=" + this.f11232h0 + ", employeesCount=" + this.f11233i0 + ", paymentsInCountries=" + this.f11235j0 + ", paymentsOutCountries=" + this.f11237k0 + ", useOfCurrencies=" + this.f11239l0 + ", bankAccountOutside=" + this.f11241m0 + ", contractorsIncoming=" + this.f11243n0 + ", contractorsOutgoing=" + this.f11245o0 + ", needsCryptoOperations=" + this.f11247p0 + ", txCryptoSingleValue=" + this.f11249q0 + ", txCryptoTurnover=" + this.f11251r0 + ", txCryptoIncomingCount=" + this.s0 + ", txCryptoOutgoingCount=" + this.f11254t0 + ", cryptoPaymentsInCountries=" + this.f11256u0 + ", cryptoPaymentsOutCountries=" + this.f11258v0 + ", cryptoUseOfCurrencies=" + this.f11260w0 + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Integer num = this.f11218a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.f11220b);
            parcel.writeString(this.f11222c);
            Boolean bool = this.f11224d;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.f11226e);
            parcel.writeString(this.f11227f);
            Boolean bool2 = this.f11229g;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.f11231h);
            parcel.writeString(this.i);
            parcel.writeString(this.f11234j);
            parcel.writeString(this.f11236k);
            parcel.writeString(this.f11238l);
            parcel.writeString(this.f11240m);
            parcel.writeString(this.f11242n);
            parcel.writeString(this.f11244o);
            parcel.writeString(this.f11246p);
            parcel.writeString(this.f11248q);
            parcel.writeString(this.f11250r);
            parcel.writeString(this.f11252s);
            parcel.writeString(this.f11253t);
            parcel.writeString(this.f11255u);
            parcel.writeString(this.f11257v);
            parcel.writeString(this.f11259w);
            parcel.writeString(this.f11261x);
            parcel.writeString(this.f11262y);
            parcel.writeString(this.f11263z);
            parcel.writeString(this.f11200A);
            parcel.writeString(this.f11201B);
            parcel.writeString(this.f11202C);
            parcel.writeString(this.f11203D);
            Integer num2 = this.f11204E;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.f11205F);
            parcel.writeString(this.f11206G);
            parcel.writeString(this.f11207H);
            parcel.writeString(this.f11208I);
            parcel.writeString(this.f11209J);
            parcel.writeString(this.f11210K);
            parcel.writeString(this.f11211L);
            parcel.writeString(this.f11212M);
            parcel.writeString(this.f11213N);
            Long l10 = this.f11214O;
            if (l10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l10.longValue());
            }
            Boolean bool3 = this.f11215P;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Boolean bool4 = this.f11216Q;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.R);
            parcel.writeString(this.S);
            parcel.writeString(this.T);
            parcel.writeString(this.U);
            parcel.writeString(this.V);
            parcel.writeString(this.W);
            parcel.writeString(this.X);
            parcel.writeString(this.Y);
            parcel.writeString(this.f11217Z);
            parcel.writeString(this.f11219a0);
            parcel.writeString(this.f11221b0.name());
            Long l11 = this.f11223c0;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeSerializable(this.f11225d0);
            parcel.writeSerializable(this.f11228f0);
            parcel.writeString(this.f11230g0);
            Boolean bool5 = this.f11232h0;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool5.booleanValue() ? 1 : 0);
            }
            CorporateDetailsDomain.EmployeeCount employeeCount = this.f11233i0;
            if (employeeCount == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(employeeCount.name());
            }
            parcel.writeStringList(this.f11235j0);
            parcel.writeStringList(this.f11237k0);
            parcel.writeStringList(this.f11239l0);
            ArrayList<BankAccountOutside> arrayList = this.f11241m0;
            if (arrayList == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(arrayList.size());
                Iterator<BankAccountOutside> it = arrayList.iterator();
                while (it.hasNext()) {
                    parcel.writeSerializable(it.next());
                }
            }
            Map<Integer, CreateCompanyUI.ContractorUI> map = this.f11243n0;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<Integer, CreateCompanyUI.ContractorUI> entry : map.entrySet()) {
                    parcel.writeInt(entry.getKey().intValue());
                    CreateCompanyUI.ContractorUI value = entry.getValue();
                    if (value == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        value.writeToParcel(parcel, i);
                    }
                }
            }
            Map<Integer, CreateCompanyUI.ContractorUI> map2 = this.f11245o0;
            if (map2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map2.size());
                for (Map.Entry<Integer, CreateCompanyUI.ContractorUI> entry2 : map2.entrySet()) {
                    parcel.writeInt(entry2.getKey().intValue());
                    CreateCompanyUI.ContractorUI value2 = entry2.getValue();
                    if (value2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        value2.writeToParcel(parcel, i);
                    }
                }
            }
            Boolean bool6 = this.f11247p0;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool6.booleanValue() ? 1 : 0);
            }
            Long l12 = this.f11249q0;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l12.longValue());
            }
            Long l13 = this.f11251r0;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l13.longValue());
            }
            parcel.writeSerializable(this.s0);
            parcel.writeSerializable(this.f11254t0);
            parcel.writeStringList(this.f11256u0);
            parcel.writeStringList(this.f11258v0);
            parcel.writeStringList(this.f11260w0);
        }
    }

    /* compiled from: CompanyDetailsUI.kt */
    public static final class a implements Parcelable.Creator<CompanyDetailsUI> {
        @Override // android.os.Parcelable.Creator
        public final CompanyDetailsUI createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            CompanyUI createFromParcel = parcel.readInt() == 0 ? null : CompanyUI.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(TeamMemberUI.CREATOR.createFromParcel(parcel));
                }
            }
            return new CompanyDetailsUI(createFromParcel, arrayList, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CompanyDetailsUI[] newArray(int i) {
            return new CompanyDetailsUI[i];
        }
    }

    public CompanyDetailsUI(CompanyUI companyUI, ArrayList arrayList, List list, String str, String str2, Boolean bool, Float f10, String str3) {
        this.f11192a = companyUI;
        this.f11193b = arrayList;
        this.f11194c = list;
        this.f11195d = str;
        this.f11196e = str2;
        this.f11197f = bool;
        this.f11198g = f10;
        this.f11199h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyDetailsUI)) {
            return false;
        }
        CompanyDetailsUI companyDetailsUI = (CompanyDetailsUI) obj;
        return f.b(this.f11192a, companyDetailsUI.f11192a) && f.b(this.f11193b, companyDetailsUI.f11193b) && f.b(this.f11194c, companyDetailsUI.f11194c) && f.b(this.f11195d, companyDetailsUI.f11195d) && f.b(this.f11196e, companyDetailsUI.f11196e) && f.b(this.f11197f, companyDetailsUI.f11197f) && f.b(this.f11198g, companyDetailsUI.f11198g) && f.b(this.f11199h, companyDetailsUI.f11199h);
    }

    public final int hashCode() {
        CompanyUI companyUI = this.f11192a;
        int hashCode = (companyUI == null ? 0 : companyUI.hashCode()) * 31;
        List<TeamMemberUI> list = this.f11193b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f11194c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f11195d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11196e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f11197f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f10 = this.f11198g;
        int hashCode7 = (hashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str3 = this.f11199h;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CompanyDetailsUI(company=" + this.f11192a + ", teamMembers=" + this.f11193b + ", myPositions=" + this.f11194c + ", myBeneficiaryType=" + this.f11195d + ", myRole=" + this.f11196e + ", isCreator=" + this.f11197f + ", mySharesAmount=" + this.f11198g + ", enrolledAt=" + this.f11199h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CompanyUI companyUI = this.f11192a;
        if (companyUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            companyUI.writeToParcel(parcel, i);
        }
        List<TeamMemberUI> list = this.f11193b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TeamMemberUI> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.f11194c);
        parcel.writeString(this.f11195d);
        parcel.writeString(this.f11196e);
        Boolean bool = this.f11197f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f10 = this.f11198g;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        parcel.writeString(this.f11199h);
    }
}
