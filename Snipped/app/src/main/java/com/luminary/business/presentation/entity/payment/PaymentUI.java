package com.luminary.business.presentation.entity.payment;

import C.v;
import P9.s;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.f;

/* compiled from: PaymentUI.kt */
/* loaded from: classes2.dex */
public final class PaymentUI implements Parcelable {
    public static final Parcelable.Creator<PaymentUI> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    public String f11329A;

    /* renamed from: a, reason: collision with root package name */
    public String f11330a;

    /* renamed from: b, reason: collision with root package name */
    public PaymentType f11331b;

    /* renamed from: c, reason: collision with root package name */
    public BigDecimal f11332c;

    /* renamed from: d, reason: collision with root package name */
    public String f11333d;

    /* renamed from: e, reason: collision with root package name */
    public String f11334e;

    /* renamed from: f, reason: collision with root package name */
    public String f11335f;

    /* renamed from: g, reason: collision with root package name */
    public String f11336g;

    /* renamed from: h, reason: collision with root package name */
    public String f11337h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f11338j;

    /* renamed from: k, reason: collision with root package name */
    public String f11339k;

    /* renamed from: l, reason: collision with root package name */
    public String f11340l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11341m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f11342n;

    /* renamed from: o, reason: collision with root package name */
    public String f11343o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11344p;

    /* renamed from: q, reason: collision with root package name */
    public float f11345q;

    /* renamed from: r, reason: collision with root package name */
    public String f11346r;

    /* renamed from: s, reason: collision with root package name */
    public String f11347s;

    /* renamed from: t, reason: collision with root package name */
    public String f11348t;

    /* renamed from: u, reason: collision with root package name */
    public String f11349u;

    /* renamed from: v, reason: collision with root package name */
    public String f11350v;

    /* renamed from: w, reason: collision with root package name */
    public String f11351w;

    /* renamed from: x, reason: collision with root package name */
    public String f11352x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f11353y;

    /* renamed from: z, reason: collision with root package name */
    public String f11354z;

    /* compiled from: PaymentUI.kt */
    public static final class a implements Parcelable.Creator<PaymentUI> {
        @Override // android.os.Parcelable.Creator
        public final PaymentUI createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            PaymentType valueOf2 = PaymentType.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            boolean z10 = parcel.readInt() != 0;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString11 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            float readFloat = parcel.readFloat();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PaymentUI(readString, valueOf2, bigDecimal, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, z10, valueOf3, readString11, z11, readFloat, readString12, readString13, readString14, readString15, readString16, readString17, readString18, valueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentUI[] newArray(int i) {
            return new PaymentUI[i];
        }
    }

    /* compiled from: PaymentUI.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11355a;

        static {
            int[] iArr = new int[PaymentType.values().length];
            try {
                PaymentType paymentType = PaymentType.f11147a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PaymentType paymentType2 = PaymentType.f11147a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PaymentType paymentType3 = PaymentType.f11147a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PaymentType paymentType4 = PaymentType.f11147a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PaymentType paymentType5 = PaymentType.f11147a;
                iArr[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11355a = iArr;
        }
    }

    public PaymentUI(String str, PaymentType paymentType, BigDecimal bigDecimal, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, Integer num, String str11, boolean z11, float f10, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Boolean bool, String str19, String str20) {
        this.f11330a = str;
        this.f11331b = paymentType;
        this.f11332c = bigDecimal;
        this.f11333d = str2;
        this.f11334e = str3;
        this.f11335f = str4;
        this.f11336g = str5;
        this.f11337h = str6;
        this.i = str7;
        this.f11338j = str8;
        this.f11339k = str9;
        this.f11340l = str10;
        this.f11341m = z10;
        this.f11342n = num;
        this.f11343o = str11;
        this.f11344p = z11;
        this.f11345q = f10;
        this.f11346r = str12;
        this.f11347s = str13;
        this.f11348t = str14;
        this.f11349u = str15;
        this.f11350v = str16;
        this.f11351w = str17;
        this.f11352x = str18;
        this.f11353y = bool;
        this.f11354z = str19;
        this.f11329A = str20;
    }

    public final String a() {
        List r02 = C0969n.r0(this.f11332c.toPlainString(), new String[]{"."});
        if (r02.size() != 2) {
            return ".00";
        }
        if (((String) s.Q(r02)).length() != 1) {
            return ".".concat(((String) s.Q(r02)).substring(0, 2));
        }
        return "." + s.Q(r02) + "0";
    }

    public final String b() {
        return v.n(c(), a());
    }

    public final String c() {
        List r02 = C0969n.r0(this.f11332c.toPlainString(), new String[]{"."});
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("#,###");
        return decimalFormat.format(Integer.valueOf(Integer.parseInt(D9.b.r0((String) s.J(r02)))));
    }

    public final SpannableString d(Context context) {
        int ordinal = this.f11331b.ordinal();
        return new SpannableString(context.getText(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 8 ? 0 : R.string.to_bank_account : R.string.international : R.string.european : R.string.uk : R.string.bank_app_payment));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Log.e("PAYMENT", toString());
        int ordinal = this.f11331b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3 || this.f11332c.compareTo(BigDecimal.ZERO) <= 0 || !D9.b.g0(this.f11334e) || this.f11342n == null || (str9 = this.f11339k) == null || str9.length() == 0 || (str10 = this.f11338j) == null || str10.length() == 0 || (str11 = this.f11336g) == null || str11.length() == 0) {
                        return false;
                    }
                } else if (this.f11332c.compareTo(BigDecimal.ZERO) <= 0 || !D9.b.g0(this.f11334e) || (str6 = this.f11339k) == null || str6.length() == 0 || (str7 = this.f11338j) == null || str7.length() == 0 || (str8 = this.f11336g) == null || str8.length() == 0) {
                    return false;
                }
            } else {
                if (this.f11332c.compareTo(BigDecimal.ZERO) <= 0 || !D9.b.g0(this.f11334e) || (str3 = this.f11333d) == null || str3.length() == 0) {
                    return false;
                }
                String X = C0967l.X(this.f11333d, "-", "", false);
                if (!TextUtils.isDigitsOnly(X) || X.length() != 6 || (str4 = this.f11335f) == null || str4.length() == 0) {
                    return false;
                }
                String str12 = this.f11335f;
                if (!TextUtils.isDigitsOnly(str12) || str12.length() != 8 || (str5 = this.f11336g) == null || str5.length() == 0) {
                    return false;
                }
            }
        } else if (this.f11332c.compareTo(BigDecimal.ZERO) <= 0 || !D9.b.g0(this.f11334e) || (str = this.f11336g) == null || str.length() == 0 || (str2 = this.f11330a) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentUI)) {
            return false;
        }
        PaymentUI paymentUI = (PaymentUI) obj;
        return f.b(this.f11330a, paymentUI.f11330a) && this.f11331b == paymentUI.f11331b && f.b(this.f11332c, paymentUI.f11332c) && f.b(this.f11333d, paymentUI.f11333d) && f.b(this.f11334e, paymentUI.f11334e) && f.b(this.f11335f, paymentUI.f11335f) && f.b(this.f11336g, paymentUI.f11336g) && f.b(this.f11337h, paymentUI.f11337h) && f.b(this.i, paymentUI.i) && f.b(this.f11338j, paymentUI.f11338j) && f.b(this.f11339k, paymentUI.f11339k) && f.b(this.f11340l, paymentUI.f11340l) && this.f11341m == paymentUI.f11341m && f.b(this.f11342n, paymentUI.f11342n) && f.b(this.f11343o, paymentUI.f11343o) && this.f11344p == paymentUI.f11344p && Float.compare(this.f11345q, paymentUI.f11345q) == 0 && f.b(this.f11346r, paymentUI.f11346r) && f.b(this.f11347s, paymentUI.f11347s) && f.b(this.f11348t, paymentUI.f11348t) && f.b(this.f11349u, paymentUI.f11349u) && f.b(this.f11350v, paymentUI.f11350v) && f.b(this.f11351w, paymentUI.f11351w) && f.b(this.f11352x, paymentUI.f11352x) && f.b(this.f11353y, paymentUI.f11353y) && f.b(this.f11354z, paymentUI.f11354z) && f.b(this.f11329A, paymentUI.f11329A);
    }

    public final boolean f() {
        Log.e("PAYMENT", toString());
        return b.f11355a[this.f11331b.ordinal()] == 5 && this.f11332c.compareTo(BigDecimal.ZERO) > 0;
    }

    public final boolean g() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Log.e("PAYMENT", toString());
        return (b.f11355a[this.f11331b.ordinal()] != 5 || this.f11332c.compareTo(BigDecimal.ZERO) <= 0 || !D9.b.g0(this.f11334e) || this.f11342n == null || (str = this.f11339k) == null || str.length() == 0 || !s3.b.w("^[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}([A-Z0-9]{3})?$", this.f11339k) || (str2 = this.f11338j) == null || str2.length() == 0 || (str3 = this.f11348t) == null || str3.length() == 0 || (str4 = this.f11350v) == null || str4.length() == 0 || (str5 = this.f11351w) == null || str5.length() == 0 || (str6 = this.f11352x) == null || str6.length() == 0 || (str7 = this.f11330a) == null || str7.length() == 0 || !(!f.b(this.f11353y, Boolean.TRUE) || ((str8 = this.f11329A) != null && s3.b.w("^[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}([A-Z0-9]{3})?$", str8) && (str9 = this.f11354z) != null && str9.length() != 0))) ? false : true;
    }

    public final int hashCode() {
        int hashCode = (this.f11332c.hashCode() + ((this.f11331b.hashCode() + (this.f11330a.hashCode() * 31)) * 31)) * 31;
        String str = this.f11333d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11334e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11335f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11336g;
        int c2 = v.c((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f11337h);
        String str5 = this.i;
        int hashCode5 = (c2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11338j;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11339k;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11340l;
        int d10 = v.d((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.f11341m);
        Integer num = this.f11342n;
        int hashCode8 = (d10 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.f11343o;
        int c10 = v.c(v.a(v.d((hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.f11344p), this.f11345q, 31), 31, this.f11346r);
        String str10 = this.f11347s;
        int hashCode9 = (c10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11348t;
        int hashCode10 = (hashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f11349u;
        int hashCode11 = (hashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f11350v;
        int hashCode12 = (hashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f11351w;
        int hashCode13 = (hashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f11352x;
        int hashCode14 = (hashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.f11353y;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str16 = this.f11354z;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f11329A;
        return hashCode16 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f11330a;
        PaymentType paymentType = this.f11331b;
        BigDecimal bigDecimal = this.f11332c;
        String str2 = this.f11333d;
        String str3 = this.f11334e;
        String str4 = this.f11335f;
        String str5 = this.f11336g;
        String str6 = this.f11337h;
        String str7 = this.i;
        String str8 = this.f11338j;
        String str9 = this.f11339k;
        String str10 = this.f11340l;
        Integer num = this.f11342n;
        String str11 = this.f11343o;
        float f10 = this.f11345q;
        String str12 = this.f11346r;
        String str13 = this.f11347s;
        String str14 = this.f11348t;
        String str15 = this.f11349u;
        String str16 = this.f11350v;
        String str17 = this.f11351w;
        String str18 = this.f11352x;
        Boolean bool = this.f11353y;
        String str19 = this.f11354z;
        String str20 = this.f11329A;
        StringBuilder sb2 = new StringBuilder("PaymentUI(bankAccountId=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(paymentType);
        sb2.append(", amount=");
        sb2.append(bigDecimal);
        sb2.append(", sortCode=");
        sb2.append(str2);
        sb2.append(", beneficiary=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", accountNumber=", str4, ", reference=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", currency=", str6, ", currencySign=");
        androidx.camera.core.impl.utils.a.u(sb2, str7, ", recipientIban=", str8, ", recipientSwift=");
        androidx.camera.core.impl.utils.a.u(sb2, str9, ", accountFrom=", str10, ", urgent=");
        sb2.append(this.f11341m);
        sb2.append(", beneficiaryType=");
        sb2.append(num);
        sb2.append(", bankId=");
        sb2.append(str11);
        sb2.append(", beneficiaryAdjusted=");
        sb2.append(this.f11344p);
        sb2.append(", fee=");
        sb2.append(f10);
        sb2.append(", feeString=");
        androidx.camera.core.impl.utils.a.u(sb2, str12, ", email=", str13, ", addressLine1=");
        androidx.camera.core.impl.utils.a.u(sb2, str14, ", addressLine2=", str15, ", postalCode=");
        androidx.camera.core.impl.utils.a.u(sb2, str16, ", city=", str17, ", country=");
        sb2.append(str18);
        sb2.append(", beneficiaryIntermediaryBank=");
        sb2.append(bool);
        sb2.append(", bankName=");
        return s3.b.o(sb2, str19, ", bankSwift=", str20, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11330a);
        parcel.writeString(this.f11331b.name());
        parcel.writeSerializable(this.f11332c);
        parcel.writeString(this.f11333d);
        parcel.writeString(this.f11334e);
        parcel.writeString(this.f11335f);
        parcel.writeString(this.f11336g);
        parcel.writeString(this.f11337h);
        parcel.writeString(this.i);
        parcel.writeString(this.f11338j);
        parcel.writeString(this.f11339k);
        parcel.writeString(this.f11340l);
        parcel.writeInt(this.f11341m ? 1 : 0);
        Integer num = this.f11342n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f11343o);
        parcel.writeInt(this.f11344p ? 1 : 0);
        parcel.writeFloat(this.f11345q);
        parcel.writeString(this.f11346r);
        parcel.writeString(this.f11347s);
        parcel.writeString(this.f11348t);
        parcel.writeString(this.f11349u);
        parcel.writeString(this.f11350v);
        parcel.writeString(this.f11351w);
        parcel.writeString(this.f11352x);
        Boolean bool = this.f11353y;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f11354z);
        parcel.writeString(this.f11329A);
    }

    public /* synthetic */ PaymentUI(PaymentType paymentType, BigDecimal bigDecimal, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, String str14, String str15, int i) {
        this("", paymentType, bigDecimal, str, str2, (i & 32) != 0 ? null : str3, null, (i & 128) != 0 ? "gbp" : str4, (i & 256) != 0 ? "£" : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, null, false, null, null, false, 0.0f, "", (262144 & i) != 0 ? "" : str8, (524288 & i) != 0 ? null : str9, (1048576 & i) != 0 ? null : str10, (2097152 & i) != 0 ? null : str11, (4194304 & i) != 0 ? null : str12, (8388608 & i) != 0 ? null : str13, (16777216 & i) != 0 ? null : bool, (33554432 & i) != 0 ? null : str14, (i & 67108864) != 0 ? null : str15);
    }
}
