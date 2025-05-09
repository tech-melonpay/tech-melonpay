package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public abstract class a implements Parcelable {

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a$a, reason: collision with other inner class name */
    public static final class C0329a extends a {
        public static final Parcelable.Creator<C0329a> CREATOR = new C0330a();

        /* renamed from: a, reason: collision with root package name */
        public final String f18407a;

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a$a$a, reason: collision with other inner class name */
        public static final class C0330a implements Parcelable.Creator<C0329a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0329a createFromParcel(Parcel parcel) {
                return new C0329a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0329a[] newArray(int i) {
                return new C0329a[i];
            }
        }

        public C0329a(String str) {
            super(null);
            this.f18407a = str;
        }

        public final String b() {
            return this.f18407a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0329a) && f.b(this.f18407a, ((C0329a) obj).f18407a);
        }

        public int hashCode() {
            return this.f18407a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("CanEnter(pin="), this.f18407a, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f18407a);
        }
    }

    public static final class b extends a {
        public static final Parcelable.Creator<b> CREATOR = new C0331a();

        /* renamed from: a, reason: collision with root package name */
        public final String f18408a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18409b;

        /* renamed from: c, reason: collision with root package name */
        public final String f18410c;

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a$b$a, reason: collision with other inner class name */
        public static final class C0331a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, String str2, String str3) {
            super(null);
            this.f18408a = str;
            this.f18409b = str2;
            this.f18410c = str3;
        }

        public final String d() {
            return this.f18410c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f18409b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return f.b(this.f18408a, bVar.f18408a) && f.b(this.f18409b, bVar.f18409b) && f.b(this.f18410c, bVar.f18410c);
        }

        public final String f() {
            return this.f18408a;
        }

        public int hashCode() {
            int c2 = v.c(this.f18408a.hashCode() * 31, 31, this.f18409b);
            String str = this.f18410c;
            return c2 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CanEnterForTransportPin(pin=");
            sb2.append(this.f18408a);
            sb2.append(", newPin=");
            sb2.append(this.f18409b);
            sb2.append(", lastPinDigit=");
            return v.q(sb2, this.f18410c, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f18408a);
            parcel.writeString(this.f18409b);
            parcel.writeString(this.f18410c);
        }
    }

    public static final class c extends a {
        public static final Parcelable.Creator<c> CREATOR = new C0332a();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18411a;

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a$c$a, reason: collision with other inner class name */
        public static final class C0332a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(boolean z10) {
            super(null);
            this.f18411a = z10;
        }

        public final boolean b() {
            return this.f18411a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f18411a == ((c) obj).f18411a;
        }

        public int hashCode() {
            boolean z10 = this.f18411a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return androidx.camera.core.impl.utils.a.o(new StringBuilder("PinEnter(needCan="), this.f18411a, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f18411a ? 1 : 0);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18412a = new d();
        public static final Parcelable.Creator<d> CREATOR = new C0333a();

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a$d$a, reason: collision with other inner class name */
        public static final class C0333a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                parcel.readInt();
                return d.f18412a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f18413a = new e();
        public static final Parcelable.Creator<e> CREATOR = new C0334a();

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a$e$a, reason: collision with other inner class name */
        public static final class C0334a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                parcel.readInt();
                return e.f18413a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
