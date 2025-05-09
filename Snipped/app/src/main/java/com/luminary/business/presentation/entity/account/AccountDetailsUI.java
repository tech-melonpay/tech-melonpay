package com.luminary.business.presentation.entity.account;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f;

/* compiled from: AccountDetailsUI.kt */
/* loaded from: classes2.dex */
public final class AccountDetailsUI implements Parcelable {
    public static final Parcelable.Creator<AccountDetailsUI> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f11164a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11165b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11166c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11167d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f11168e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, ProviderRequisiteUI> f11169f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11170g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11171h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f11172j;

    /* renamed from: k, reason: collision with root package name */
    public final Date f11173k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f11174l;

    /* renamed from: m, reason: collision with root package name */
    public String f11175m;

    /* compiled from: AccountDetailsUI.kt */
    public static final class ProviderRequisiteUI implements Parcelable {
        public static final Parcelable.Creator<ProviderRequisiteUI> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f11176a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11177b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11178c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11179d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11180e;

        /* renamed from: f, reason: collision with root package name */
        public final String f11181f;

        /* renamed from: g, reason: collision with root package name */
        public final String f11182g;

        /* renamed from: h, reason: collision with root package name */
        public final String f11183h;
        public final String i;

        /* renamed from: j, reason: collision with root package name */
        public final String f11184j;

        /* renamed from: k, reason: collision with root package name */
        public final String f11185k;

        /* renamed from: l, reason: collision with root package name */
        public final String f11186l;

        /* renamed from: m, reason: collision with root package name */
        public final String f11187m;

        /* compiled from: AccountDetailsUI.kt */
        public static final class a implements Parcelable.Creator<ProviderRequisiteUI> {
            @Override // android.os.Parcelable.Creator
            public final ProviderRequisiteUI createFromParcel(Parcel parcel) {
                return new ProviderRequisiteUI(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ProviderRequisiteUI[] newArray(int i) {
                return new ProviderRequisiteUI[i];
            }
        }

        public ProviderRequisiteUI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.f11176a = str;
            this.f11177b = str2;
            this.f11178c = str3;
            this.f11179d = str4;
            this.f11180e = str5;
            this.f11181f = str6;
            this.f11182g = str7;
            this.f11183h = str8;
            this.i = str9;
            this.f11184j = str10;
            this.f11185k = str11;
            this.f11186l = str12;
            this.f11187m = str13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderRequisiteUI)) {
                return false;
            }
            ProviderRequisiteUI providerRequisiteUI = (ProviderRequisiteUI) obj;
            return f.b(this.f11176a, providerRequisiteUI.f11176a) && f.b(this.f11177b, providerRequisiteUI.f11177b) && f.b(this.f11178c, providerRequisiteUI.f11178c) && f.b(this.f11179d, providerRequisiteUI.f11179d) && f.b(this.f11180e, providerRequisiteUI.f11180e) && f.b(this.f11181f, providerRequisiteUI.f11181f) && f.b(this.f11182g, providerRequisiteUI.f11182g) && f.b(this.f11183h, providerRequisiteUI.f11183h) && f.b(this.i, providerRequisiteUI.i) && f.b(this.f11184j, providerRequisiteUI.f11184j) && f.b(this.f11185k, providerRequisiteUI.f11185k) && f.b(this.f11186l, providerRequisiteUI.f11186l) && f.b(this.f11187m, providerRequisiteUI.f11187m);
        }

        public final int hashCode() {
            String str = this.f11176a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f11177b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f11178c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f11179d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f11180e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f11181f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f11182g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f11183h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f11184j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f11185k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f11186l;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f11187m;
            return hashCode12 + (str13 != null ? str13.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProviderRequisiteUI(fullName=");
            sb2.append(this.f11176a);
            sb2.append(", address=");
            sb2.append(this.f11177b);
            sb2.append(", sortCode=");
            sb2.append(this.f11178c);
            sb2.append(", number=");
            sb2.append(this.f11179d);
            sb2.append(", iban=");
            sb2.append(this.f11180e);
            sb2.append(", bicSwift=");
            sb2.append(this.f11181f);
            sb2.append(", bankName=");
            sb2.append(this.f11182g);
            sb2.append(", bankAddress=");
            sb2.append(this.f11183h);
            sb2.append(", bankCountry=");
            sb2.append(this.i);
            sb2.append(", reference=");
            sb2.append(this.f11184j);
            sb2.append(", intermediaryBankName=");
            sb2.append(this.f11185k);
            sb2.append(", intermediaryBankSwift=");
            sb2.append(this.f11186l);
            sb2.append(", bankCountryFullName=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f11187m, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11176a);
            parcel.writeString(this.f11177b);
            parcel.writeString(this.f11178c);
            parcel.writeString(this.f11179d);
            parcel.writeString(this.f11180e);
            parcel.writeString(this.f11181f);
            parcel.writeString(this.f11182g);
            parcel.writeString(this.f11183h);
            parcel.writeString(this.i);
            parcel.writeString(this.f11184j);
            parcel.writeString(this.f11185k);
            parcel.writeString(this.f11186l);
            parcel.writeString(this.f11187m);
        }
    }

    /* compiled from: AccountDetailsUI.kt */
    public static final class a implements Parcelable.Creator<AccountDetailsUI> {
        @Override // android.os.Parcelable.Creator
        public final AccountDetailsUI createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), ProviderRequisiteUI.CREATOR.createFromParcel(parcel));
                }
            }
            return new AccountDetailsUI(valueOf, valueOf2, readString, readString2, bigDecimal, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Date) parcel.readSerializable(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountDetailsUI[] newArray(int i) {
            return new AccountDetailsUI[i];
        }
    }

    public AccountDetailsUI(Integer num, Integer num2, String str, String str2, BigDecimal bigDecimal, LinkedHashMap linkedHashMap, String str3, String str4, String str5, Integer num3, Date date, Boolean bool) {
        this.f11164a = num;
        this.f11165b = num2;
        this.f11166c = str;
        this.f11167d = str2;
        this.f11168e = bigDecimal;
        this.f11169f = linkedHashMap;
        this.f11170g = str3;
        this.f11171h = str4;
        this.i = str5;
        this.f11172j = num3;
        this.f11173k = date;
        this.f11174l = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDetailsUI)) {
            return false;
        }
        AccountDetailsUI accountDetailsUI = (AccountDetailsUI) obj;
        return f.b(this.f11164a, accountDetailsUI.f11164a) && f.b(this.f11165b, accountDetailsUI.f11165b) && f.b(this.f11166c, accountDetailsUI.f11166c) && f.b(this.f11167d, accountDetailsUI.f11167d) && f.b(this.f11168e, accountDetailsUI.f11168e) && f.b(this.f11169f, accountDetailsUI.f11169f) && f.b(this.f11170g, accountDetailsUI.f11170g) && f.b(this.f11171h, accountDetailsUI.f11171h) && f.b(this.i, accountDetailsUI.i) && f.b(this.f11172j, accountDetailsUI.f11172j) && f.b(this.f11173k, accountDetailsUI.f11173k) && f.b(this.f11174l, accountDetailsUI.f11174l);
    }

    public final int hashCode() {
        Integer num = this.f11164a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f11165b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f11166c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11167d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f11168e;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Map<String, ProviderRequisiteUI> map = this.f11169f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.f11170g;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11171h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f11172j;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Date date = this.f11173k;
        int hashCode11 = (hashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool = this.f11174l;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.i;
        StringBuilder sb2 = new StringBuilder("AccountDetailsUI(id=");
        sb2.append(this.f11164a);
        sb2.append(", clientId=");
        sb2.append(this.f11165b);
        sb2.append(", clientName=");
        sb2.append(this.f11166c);
        sb2.append(", assetType=");
        sb2.append(this.f11167d);
        sb2.append(", balance=");
        sb2.append(this.f11168e);
        sb2.append(", providerRequisites=");
        sb2.append(this.f11169f);
        sb2.append(", number=");
        sb2.append(this.f11170g);
        sb2.append(", currency=");
        androidx.camera.core.impl.utils.a.u(sb2, this.f11171h, ", prettyName=", str, ", status=");
        sb2.append(this.f11172j);
        sb2.append(", createdAt=");
        sb2.append(this.f11173k);
        sb2.append(", welcomeMailSent=");
        sb2.append(this.f11174l);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.f11164a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f11165b;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.f11166c);
        parcel.writeString(this.f11167d);
        parcel.writeSerializable(this.f11168e);
        Map<String, ProviderRequisiteUI> map = this.f11169f;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ProviderRequisiteUI> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f11170g);
        parcel.writeString(this.f11171h);
        parcel.writeString(this.i);
        Integer num3 = this.f11172j;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeSerializable(this.f11173k);
        Boolean bool = this.f11174l;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }
}
