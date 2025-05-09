package com.luminary.business.presentation.entity.register;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;

/* compiled from: RegisterSuccessUI.kt */
/* loaded from: classes2.dex */
public final class RegisterSuccessUI implements Parcelable {
    public static final Parcelable.Creator<RegisterSuccessUI> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f11360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11361b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11362c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11363d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11364e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11365f;

    /* compiled from: RegisterSuccessUI.kt */
    public static final class a implements Parcelable.Creator<RegisterSuccessUI> {
        @Override // android.os.Parcelable.Creator
        public final RegisterSuccessUI createFromParcel(Parcel parcel) {
            return new RegisterSuccessUI(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RegisterSuccessUI[] newArray(int i) {
            return new RegisterSuccessUI[i];
        }
    }

    public RegisterSuccessUI(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f11360a = str;
        this.f11361b = str2;
        this.f11362c = str3;
        this.f11363d = str4;
        this.f11364e = str5;
        this.f11365f = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSuccessUI)) {
            return false;
        }
        RegisterSuccessUI registerSuccessUI = (RegisterSuccessUI) obj;
        return f.b(this.f11360a, registerSuccessUI.f11360a) && f.b(this.f11361b, registerSuccessUI.f11361b) && f.b(this.f11362c, registerSuccessUI.f11362c) && f.b(this.f11363d, registerSuccessUI.f11363d) && f.b(this.f11364e, registerSuccessUI.f11364e) && f.b(this.f11365f, registerSuccessUI.f11365f);
    }

    public final int hashCode() {
        int c2 = v.c(v.c(v.c(this.f11360a.hashCode() * 31, 31, this.f11361b), 31, this.f11362c), 31, this.f11363d);
        String str = this.f11364e;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11365f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f11363d;
        StringBuilder sb2 = new StringBuilder("RegisterSuccessUI(firstName=");
        sb2.append(this.f11360a);
        sb2.append(", lastName=");
        sb2.append(this.f11361b);
        sb2.append(", bDay=");
        androidx.camera.core.impl.utils.a.u(sb2, this.f11362c, ", address=", str, ", alternativeOnboarding=");
        sb2.append(this.f11364e);
        sb2.append(", kycFlow=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f11365f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11360a);
        parcel.writeString(this.f11361b);
        parcel.writeString(this.f11362c);
        parcel.writeString(this.f11363d);
        parcel.writeString(this.f11364e);
        parcel.writeString(this.f11365f);
    }
}
