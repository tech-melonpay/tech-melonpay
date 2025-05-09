package com.sumsub.sns.internal.core.domain.model;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f16428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16429b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16430c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16431d;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(String str, String str2, String str3, boolean z10) {
        this.f16428a = str;
        this.f16429b = str2;
        this.f16430c = str3;
        this.f16431d = z10;
    }

    public final c a(String str, String str2, String str3, boolean z10) {
        return new c(str, str2, str3, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f16430c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f16428a, cVar.f16428a) && f.b(this.f16429b, cVar.f16429b) && f.b(this.f16430c, cVar.f16430c) && this.f16431d == cVar.f16431d;
    }

    public final String f() {
        return this.f16429b;
    }

    public final String g() {
        return this.f16428a;
    }

    public final boolean h() {
        return this.f16431d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c2 = v.c(this.f16428a.hashCode() * 31, 31, this.f16429b);
        String str = this.f16430c;
        int hashCode = (c2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.f16431d;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntroParams(step=");
        sb2.append(this.f16428a);
        sb2.append(", scene=");
        sb2.append(this.f16429b);
        sb2.append(", idDocType=");
        sb2.append(this.f16430c);
        sb2.append(", isAction=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f16431d, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16428a);
        parcel.writeString(this.f16429b);
        parcel.writeString(this.f16430c);
        parcel.writeInt(this.f16431d ? 1 : 0);
    }

    public static /* synthetic */ c a(c cVar, String str, String str2, String str3, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f16428a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f16429b;
        }
        if ((i & 4) != 0) {
            str3 = cVar.f16430c;
        }
        if ((i & 8) != 0) {
            z10 = cVar.f16431d;
        }
        return cVar.a(str, str2, str3, z10);
    }

    public /* synthetic */ c(String str, String str2, String str3, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z10);
    }
}
