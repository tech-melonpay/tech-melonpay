package com.luminary.business.presentation.entity.transaction;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: TransactionUI.kt */
/* loaded from: classes2.dex */
public final class TransactionUI implements Parcelable {
    public static final Parcelable.Creator<TransactionUI> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public final String f11366A;

    /* renamed from: B, reason: collision with root package name */
    public final String f11367B;

    /* renamed from: C, reason: collision with root package name */
    public final BigDecimal f11368C;

    /* renamed from: D, reason: collision with root package name */
    public final BigDecimal f11369D;

    /* renamed from: E, reason: collision with root package name */
    public final Integer f11370E;

    /* renamed from: a, reason: collision with root package name */
    public final String f11371a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f11372b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f11373c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11374d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11375e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11376f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11377g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11378h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public String f11379j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11380k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11381l;

    /* renamed from: m, reason: collision with root package name */
    public final Date f11382m;

    /* renamed from: n, reason: collision with root package name */
    public final BigDecimal f11383n;

    /* renamed from: o, reason: collision with root package name */
    public final String f11384o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11385p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11386q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11387r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11388s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f11389t;

    /* renamed from: u, reason: collision with root package name */
    public final String f11390u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11391v;

    /* renamed from: w, reason: collision with root package name */
    public final String f11392w;

    /* renamed from: x, reason: collision with root package name */
    public final String f11393x;

    /* renamed from: y, reason: collision with root package name */
    public final String f11394y;

    /* renamed from: z, reason: collision with root package name */
    public final CommissionUI f11395z;

    /* compiled from: TransactionUI.kt */
    public static final class CommissionUI implements Parcelable {
        public static final Parcelable.Creator<CommissionUI> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f11396a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11397b;

        /* compiled from: TransactionUI.kt */
        public static final class a implements Parcelable.Creator<CommissionUI> {
            @Override // android.os.Parcelable.Creator
            public final CommissionUI createFromParcel(Parcel parcel) {
                return new CommissionUI(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommissionUI[] newArray(int i) {
                return new CommissionUI[i];
            }
        }

        public CommissionUI(String str, String str2) {
            this.f11396a = str;
            this.f11397b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommissionUI)) {
                return false;
            }
            CommissionUI commissionUI = (CommissionUI) obj;
            return f.b(this.f11396a, commissionUI.f11396a) && f.b(this.f11397b, commissionUI.f11397b);
        }

        public final int hashCode() {
            String str = this.f11396a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f11397b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CommissionUI(receiverFee=");
            sb2.append(this.f11396a);
            sb2.append(", senderFee=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f11397b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11396a);
            parcel.writeString(this.f11397b);
        }
    }

    /* compiled from: TransactionUI.kt */
    public static final class a implements Parcelable.Creator<TransactionUI> {
        @Override // android.os.Parcelable.Creator
        public final TransactionUI createFromParcel(Parcel parcel) {
            return new TransactionUI(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CommissionUI.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final TransactionUI[] newArray(int i) {
            return new TransactionUI[i];
        }
    }

    public TransactionUI(String str, Integer num, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, Date date, BigDecimal bigDecimal, String str10, String str11, String str12, String str13, boolean z11, boolean z12, String str14, String str15, String str16, String str17, String str18, CommissionUI commissionUI, String str19, String str20, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Integer num2) {
        this.f11371a = str;
        this.f11372b = num;
        this.f11373c = list;
        this.f11374d = str2;
        this.f11375e = str3;
        this.f11376f = str4;
        this.f11377g = str5;
        this.f11378h = str6;
        this.i = str7;
        this.f11379j = str8;
        this.f11380k = str9;
        this.f11381l = z10;
        this.f11382m = date;
        this.f11383n = bigDecimal;
        this.f11384o = str10;
        this.f11385p = str11;
        this.f11386q = str12;
        this.f11387r = str13;
        this.f11388s = z11;
        this.f11389t = z12;
        this.f11390u = str14;
        this.f11391v = str15;
        this.f11392w = str16;
        this.f11393x = str17;
        this.f11394y = str18;
        this.f11395z = commissionUI;
        this.f11366A = str19;
        this.f11367B = str20;
        this.f11368C = bigDecimal2;
        this.f11369D = bigDecimal3;
        this.f11370E = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionUI)) {
            return false;
        }
        TransactionUI transactionUI = (TransactionUI) obj;
        return f.b(this.f11371a, transactionUI.f11371a) && f.b(this.f11372b, transactionUI.f11372b) && f.b(this.f11373c, transactionUI.f11373c) && f.b(this.f11374d, transactionUI.f11374d) && f.b(this.f11375e, transactionUI.f11375e) && f.b(this.f11376f, transactionUI.f11376f) && f.b(this.f11377g, transactionUI.f11377g) && f.b(this.f11378h, transactionUI.f11378h) && f.b(this.i, transactionUI.i) && f.b(this.f11379j, transactionUI.f11379j) && f.b(this.f11380k, transactionUI.f11380k) && this.f11381l == transactionUI.f11381l && f.b(this.f11382m, transactionUI.f11382m) && f.b(this.f11383n, transactionUI.f11383n) && f.b(this.f11384o, transactionUI.f11384o) && f.b(this.f11385p, transactionUI.f11385p) && f.b(this.f11386q, transactionUI.f11386q) && f.b(this.f11387r, transactionUI.f11387r) && this.f11388s == transactionUI.f11388s && this.f11389t == transactionUI.f11389t && f.b(this.f11390u, transactionUI.f11390u) && f.b(this.f11391v, transactionUI.f11391v) && f.b(this.f11392w, transactionUI.f11392w) && f.b(this.f11393x, transactionUI.f11393x) && f.b(this.f11394y, transactionUI.f11394y) && f.b(this.f11395z, transactionUI.f11395z) && f.b(this.f11366A, transactionUI.f11366A) && f.b(this.f11367B, transactionUI.f11367B) && f.b(this.f11368C, transactionUI.f11368C) && f.b(this.f11369D, transactionUI.f11369D) && f.b(this.f11370E, transactionUI.f11370E);
    }

    public final int hashCode() {
        String str = this.f11371a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f11372b;
        int f10 = v.f(this.f11373c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str2 = this.f11374d;
        int hashCode2 = (f10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11375e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11376f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11377g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11378h;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11379j;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f11380k;
        int d10 = v.d((hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.f11381l);
        Date date = this.f11382m;
        int hashCode9 = (d10 + (date == null ? 0 : date.hashCode())) * 31;
        BigDecimal bigDecimal = this.f11383n;
        int hashCode10 = (hashCode9 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str10 = this.f11384o;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11385p;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f11386q;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f11387r;
        int d11 = v.d(v.d((hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.f11388s), 31, this.f11389t);
        String str14 = this.f11390u;
        int hashCode14 = (d11 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f11391v;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f11392w;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f11393x;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f11394y;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        CommissionUI commissionUI = this.f11395z;
        int hashCode19 = (hashCode18 + (commissionUI == null ? 0 : commissionUI.hashCode())) * 31;
        String str19 = this.f11366A;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f11367B;
        int hashCode21 = (hashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f11368C;
        int hashCode22 = (hashCode21 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f11369D;
        int hashCode23 = (hashCode22 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Integer num2 = this.f11370E;
        return hashCode23 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f11379j;
        StringBuilder sb2 = new StringBuilder("TransactionUI(id=");
        sb2.append(this.f11371a);
        sb2.append(", type=");
        sb2.append(this.f11372b);
        sb2.append(", referencedBy=");
        sb2.append(this.f11373c);
        sb2.append(", description=");
        sb2.append(this.f11374d);
        sb2.append(", providerType=");
        sb2.append(this.f11375e);
        sb2.append(", remitterName=");
        sb2.append(this.f11376f);
        sb2.append(", remitterAccountNumber=");
        sb2.append(this.f11377g);
        sb2.append(", currency=");
        sb2.append(this.f11378h);
        sb2.append(", accountName=");
        androidx.camera.core.impl.utils.a.u(sb2, this.i, ", beneficiaryName=", str, ", beneficiaryAccountNumber=");
        sb2.append(this.f11380k);
        sb2.append(", isTransfer=");
        sb2.append(this.f11381l);
        sb2.append(", createdAt=");
        sb2.append(this.f11382m);
        sb2.append(", amount=");
        sb2.append(this.f11383n);
        sb2.append(", status=");
        sb2.append(this.f11384o);
        sb2.append(", bankDetailsBicSortCodeFormatted=");
        sb2.append(this.f11385p);
        sb2.append(", bankDetailsBankAccountNumber=");
        sb2.append(this.f11386q);
        sb2.append(", bankDetailsBic=");
        sb2.append(this.f11387r);
        sb2.append(", isIncoming=");
        sb2.append(this.f11388s);
        sb2.append(", hasInvoice=");
        sb2.append(this.f11389t);
        sb2.append(", fromEmail=");
        sb2.append(this.f11390u);
        sb2.append(", toEmail=");
        sb2.append(this.f11391v);
        sb2.append(", fromSortCode=");
        sb2.append(this.f11392w);
        sb2.append(", toSortCode=");
        sb2.append(this.f11393x);
        sb2.append(", toGbAccount=");
        sb2.append(this.f11394y);
        sb2.append(", commission=");
        sb2.append(this.f11395z);
        sb2.append(", fromCurrency=");
        sb2.append(this.f11366A);
        sb2.append(", toCurrency=");
        sb2.append(this.f11367B);
        sb2.append(", fromAmount=");
        sb2.append(this.f11368C);
        sb2.append(", toAmount=");
        sb2.append(this.f11369D);
        sb2.append(", exchangeRequestId=");
        sb2.append(this.f11370E);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11371a);
        Integer num = this.f11372b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.f11373c);
        parcel.writeString(this.f11374d);
        parcel.writeString(this.f11375e);
        parcel.writeString(this.f11376f);
        parcel.writeString(this.f11377g);
        parcel.writeString(this.f11378h);
        parcel.writeString(this.i);
        parcel.writeString(this.f11379j);
        parcel.writeString(this.f11380k);
        parcel.writeInt(this.f11381l ? 1 : 0);
        parcel.writeSerializable(this.f11382m);
        parcel.writeSerializable(this.f11383n);
        parcel.writeString(this.f11384o);
        parcel.writeString(this.f11385p);
        parcel.writeString(this.f11386q);
        parcel.writeString(this.f11387r);
        parcel.writeInt(this.f11388s ? 1 : 0);
        parcel.writeInt(this.f11389t ? 1 : 0);
        parcel.writeString(this.f11390u);
        parcel.writeString(this.f11391v);
        parcel.writeString(this.f11392w);
        parcel.writeString(this.f11393x);
        parcel.writeString(this.f11394y);
        CommissionUI commissionUI = this.f11395z;
        if (commissionUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commissionUI.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f11366A);
        parcel.writeString(this.f11367B);
        parcel.writeSerializable(this.f11368C);
        parcel.writeSerializable(this.f11369D);
        Integer num2 = this.f11370E;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }
}
