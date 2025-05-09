package com.luminary.business.presentation.entity.company;

import android.os.Parcel;
import android.os.Parcelable;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: TeamMemberUI.kt */
/* loaded from: classes2.dex */
public final class TeamMemberUI implements Parcelable {
    public static final Parcelable.Creator<TeamMemberUI> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f11296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11297b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f11298c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11299d;

    /* renamed from: e, reason: collision with root package name */
    public final MemberUI f11300e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11301f;

    /* compiled from: TeamMemberUI.kt */
    public static final class MemberUI implements Parcelable {
        public static final Parcelable.Creator<MemberUI> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Integer f11302a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11303b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11304c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11305d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11306e;

        /* renamed from: f, reason: collision with root package name */
        public final String f11307f;

        /* renamed from: g, reason: collision with root package name */
        public final String f11308g;

        /* renamed from: h, reason: collision with root package name */
        public final String f11309h;
        public final String i;

        /* renamed from: j, reason: collision with root package name */
        public final Boolean f11310j;

        /* renamed from: k, reason: collision with root package name */
        public final Boolean f11311k;

        /* renamed from: l, reason: collision with root package name */
        public final CorporateDetailsDomain.SourceofWealth f11312l;

        /* renamed from: m, reason: collision with root package name */
        public final String f11313m;

        /* renamed from: n, reason: collision with root package name */
        public final String f11314n;

        /* compiled from: TeamMemberUI.kt */
        public static final class a implements Parcelable.Creator<MemberUI> {
            @Override // android.os.Parcelable.Creator
            public final MemberUI createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MemberUI(valueOf3, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, valueOf, valueOf2, parcel.readInt() == 0 ? null : CorporateDetailsDomain.SourceofWealth.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MemberUI[] newArray(int i) {
                return new MemberUI[i];
            }
        }

        public MemberUI(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, CorporateDetailsDomain.SourceofWealth sourceofWealth, String str9, String str10) {
            this.f11302a = num;
            this.f11303b = str;
            this.f11304c = str2;
            this.f11305d = str3;
            this.f11306e = str4;
            this.f11307f = str5;
            this.f11308g = str6;
            this.f11309h = str7;
            this.i = str8;
            this.f11310j = bool;
            this.f11311k = bool2;
            this.f11312l = sourceofWealth;
            this.f11313m = str9;
            this.f11314n = str10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemberUI)) {
                return false;
            }
            MemberUI memberUI = (MemberUI) obj;
            return f.b(this.f11302a, memberUI.f11302a) && f.b(this.f11303b, memberUI.f11303b) && f.b(this.f11304c, memberUI.f11304c) && f.b(this.f11305d, memberUI.f11305d) && f.b(this.f11306e, memberUI.f11306e) && f.b(this.f11307f, memberUI.f11307f) && f.b(this.f11308g, memberUI.f11308g) && f.b(this.f11309h, memberUI.f11309h) && f.b(this.i, memberUI.i) && f.b(this.f11310j, memberUI.f11310j) && f.b(this.f11311k, memberUI.f11311k) && this.f11312l == memberUI.f11312l && f.b(this.f11313m, memberUI.f11313m) && f.b(this.f11314n, memberUI.f11314n);
        }

        public final int hashCode() {
            Integer num = this.f11302a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f11303b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11304c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11305d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11306e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f11307f;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f11308g;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f11309h;
            int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.i;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool = this.f11310j;
            int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f11311k;
            int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            CorporateDetailsDomain.SourceofWealth sourceofWealth = this.f11312l;
            int hashCode12 = (hashCode11 + (sourceofWealth == null ? 0 : sourceofWealth.hashCode())) * 31;
            String str9 = this.f11313m;
            int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f11314n;
            return hashCode13 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MemberUI(id=");
            sb2.append(this.f11302a);
            sb2.append(", email=");
            sb2.append(this.f11303b);
            sb2.append(", firstName=");
            sb2.append(this.f11304c);
            sb2.append(", lastName=");
            sb2.append(this.f11305d);
            sb2.append(", companyName=");
            sb2.append(this.f11306e);
            sb2.append(", companyNumber=");
            sb2.append(this.f11307f);
            sb2.append(", countryOperation=");
            sb2.append(this.f11308g);
            sb2.append(", countryCitizenship=");
            sb2.append(this.f11309h);
            sb2.append(", countryOfResidence=");
            sb2.append(this.i);
            sb2.append(", isPep=");
            sb2.append(this.f11310j);
            sb2.append(", isUs=");
            sb2.append(this.f11311k);
            sb2.append(", sourceOfWealth=");
            sb2.append(this.f11312l);
            sb2.append(", shortDescription=");
            sb2.append(this.f11313m);
            sb2.append(", link=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f11314n, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Integer num = this.f11302a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.f11303b);
            parcel.writeString(this.f11304c);
            parcel.writeString(this.f11305d);
            parcel.writeString(this.f11306e);
            parcel.writeString(this.f11307f);
            parcel.writeString(this.f11308g);
            parcel.writeString(this.f11309h);
            parcel.writeString(this.i);
            Boolean bool = this.f11310j;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.f11311k;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            CorporateDetailsDomain.SourceofWealth sourceofWealth = this.f11312l;
            if (sourceofWealth == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sourceofWealth.name());
            }
            parcel.writeString(this.f11313m);
            parcel.writeString(this.f11314n);
        }
    }

    /* compiled from: TeamMemberUI.kt */
    public static final class a implements Parcelable.Creator<TeamMemberUI> {
        @Override // android.os.Parcelable.Creator
        public final TeamMemberUI createFromParcel(Parcel parcel) {
            return new TeamMemberUI(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt() != 0 ? MemberUI.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TeamMemberUI[] newArray(int i) {
            return new TeamMemberUI[i];
        }
    }

    public TeamMemberUI(List<String> list, String str, Float f10, String str2, MemberUI memberUI, boolean z10) {
        this.f11296a = list;
        this.f11297b = str;
        this.f11298c = f10;
        this.f11299d = str2;
        this.f11300e = memberUI;
        this.f11301f = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamMemberUI)) {
            return false;
        }
        TeamMemberUI teamMemberUI = (TeamMemberUI) obj;
        return f.b(this.f11296a, teamMemberUI.f11296a) && f.b(this.f11297b, teamMemberUI.f11297b) && f.b(this.f11298c, teamMemberUI.f11298c) && f.b(this.f11299d, teamMemberUI.f11299d) && f.b(this.f11300e, teamMemberUI.f11300e) && this.f11301f == teamMemberUI.f11301f;
    }

    public final int hashCode() {
        List<String> list = this.f11296a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f11297b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f10 = this.f11298c;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str2 = this.f11299d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MemberUI memberUI = this.f11300e;
        return Boolean.hashCode(this.f11301f) + ((hashCode4 + (memberUI != null ? memberUI.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TeamMemberUI(positions=" + this.f11296a + ", beneficiaryType=" + this.f11297b + ", sharesAmount=" + this.f11298c + ", memberRole=" + this.f11299d + ", member=" + this.f11300e + ", isActive=" + this.f11301f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f11296a);
        parcel.writeString(this.f11297b);
        Float f10 = this.f11298c;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        parcel.writeString(this.f11299d);
        MemberUI memberUI = this.f11300e;
        if (memberUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memberUI.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f11301f ? 1 : 0);
    }
}
