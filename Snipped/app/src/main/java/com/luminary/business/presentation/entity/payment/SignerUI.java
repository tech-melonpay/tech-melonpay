package com.luminary.business.presentation.entity.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;

/* compiled from: SignerUI.kt */
/* loaded from: classes2.dex */
public final class SignerUI implements Parcelable {
    public static final Parcelable.Creator<SignerUI> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f11356a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11357b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11358c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f11359d;

    /* compiled from: SignerUI.kt */
    public static final class a implements Parcelable.Creator<SignerUI> {
        @Override // android.os.Parcelable.Creator
        public final SignerUI createFromParcel(Parcel parcel) {
            return new SignerUI(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SignerUI[] newArray(int i) {
            return new SignerUI[i];
        }
    }

    public SignerUI(String str, String str2, String str3, Integer num) {
        this.f11356a = str;
        this.f11357b = str2;
        this.f11358c = str3;
        this.f11359d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignerUI)) {
            return false;
        }
        SignerUI signerUI = (SignerUI) obj;
        return f.b(this.f11356a, signerUI.f11356a) && f.b(this.f11357b, signerUI.f11357b) && f.b(this.f11358c, signerUI.f11358c) && f.b(this.f11359d, signerUI.f11359d);
    }

    public final int hashCode() {
        String str = this.f11356a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11357b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11358c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f11359d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SignerUI(transactionId=" + this.f11356a + ", providerSignerStatus=" + this.f11357b + ", pin=" + this.f11358c + ", expiresIn=" + this.f11359d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.writeString(this.f11356a);
        parcel.writeString(this.f11357b);
        parcel.writeString(this.f11358c);
        Integer num = this.f11359d;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
