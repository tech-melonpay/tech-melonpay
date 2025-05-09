package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.core.data.model.SNSLivenessReason;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15795a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends u implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final String f15796c;

        /* renamed from: d, reason: collision with root package name */
        public final SNSLivenessReason f15797d;

        /* renamed from: e, reason: collision with root package name */
        public final String f15798e;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readString(), (SNSLivenessReason) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, SNSLivenessReason sNSLivenessReason, String str2) {
            super(null);
            this.f15796c = str;
            this.f15797d = sNSLivenessReason;
            this.f15798e = str2;
        }

        public final SNSLivenessReason c() {
            return this.f15797d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f15796c);
            parcel.writeSerializable(this.f15797d);
            parcel.writeString(this.f15798e);
        }
    }

    public static final class c extends u implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final SNSLivenessReason f15799c;

        /* renamed from: d, reason: collision with root package name */
        public final DocumentType f15800d;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                return new c((SNSLivenessReason) parcel.readSerializable(), DocumentType.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(SNSLivenessReason sNSLivenessReason, DocumentType documentType) {
            super(null);
            this.f15799c = sNSLivenessReason;
            this.f15800d = documentType;
        }

        public final DocumentType c() {
            return this.f15800d;
        }

        public final SNSLivenessReason d() {
            return this.f15799c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f15799c, cVar.f15799c) && kotlin.jvm.internal.f.b(this.f15800d, cVar.f15800d);
        }

        public int hashCode() {
            return this.f15800d.hashCode() + (this.f15799c.hashCode() * 31);
        }

        public String toString() {
            return "FaceDetection(reason=" + this.f15799c + ", documentType=" + this.f15800d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeSerializable(this.f15799c);
            this.f15800d.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public u() {
    }
}
