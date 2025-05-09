package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final File f15522a;

    /* renamed from: b, reason: collision with root package name */
    public final File f15523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15524c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15525d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentitySide f15526e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15527f;

    /* renamed from: g, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.badphotos.models.b f15528g;

    /* renamed from: h, reason: collision with root package name */
    public final b f15529h;
    public final boolean i;

    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            return new n((File) parcel.readSerializable(), (File) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : IdentitySide.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.sumsub.sns.internal.ml.badphotos.models.b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i) {
            return new n[i];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f15530a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15531b;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readInt(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(int i, long j10) {
            this.f15530a = i;
            this.f15531b = j10;
        }

        public final int c() {
            return this.f15530a;
        }

        public final long d() {
            return this.f15531b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15530a == bVar.f15530a && this.f15531b == bVar.f15531b;
        }

        public int hashCode() {
            return Long.hashCode(this.f15531b) + (Integer.hashCode(this.f15530a) * 31);
        }

        public String toString() {
            return "VideoStats(duration=" + this.f15530a + ", fileSize=" + this.f15531b + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f15530a);
            parcel.writeLong(this.f15531b);
        }
    }

    public n() {
        this(null, null, null, null, null, false, null, null, false, 511, null);
    }

    public final n a(File file, File file2, String str, String str2, IdentitySide identitySide, boolean z10, com.sumsub.sns.internal.ml.badphotos.models.b bVar, b bVar2, boolean z11) {
        return new n(file, file2, str, str2, identitySide, z10, bVar, bVar2, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.f.b(this.f15522a, nVar.f15522a) && kotlin.jvm.internal.f.b(this.f15523b, nVar.f15523b) && kotlin.jvm.internal.f.b(this.f15524c, nVar.f15524c) && kotlin.jvm.internal.f.b(this.f15525d, nVar.f15525d) && this.f15526e == nVar.f15526e && this.f15527f == nVar.f15527f && kotlin.jvm.internal.f.b(this.f15528g, nVar.f15528g) && kotlin.jvm.internal.f.b(this.f15529h, nVar.f15529h) && this.i == nVar.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        File file = this.f15522a;
        int hashCode = (file == null ? 0 : file.hashCode()) * 31;
        File file2 = this.f15523b;
        int hashCode2 = (hashCode + (file2 == null ? 0 : file2.hashCode())) * 31;
        String str = this.f15524c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15525d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.f15526e;
        int hashCode5 = (hashCode4 + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        boolean z10 = this.f15527f;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        int i9 = (hashCode5 + i) * 31;
        com.sumsub.sns.internal.ml.badphotos.models.b bVar = this.f15528g;
        int hashCode6 = (i9 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f15529h;
        int hashCode7 = (hashCode6 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        boolean z11 = this.i;
        return hashCode7 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final File k() {
        return this.f15522a;
    }

    public final com.sumsub.sns.internal.ml.badphotos.models.b l() {
        return this.f15528g;
    }

    public final File m() {
        return this.f15523b;
    }

    public final boolean n() {
        return this.f15527f;
    }

    public final IdentitySide o() {
        return this.f15526e;
    }

    public final String p() {
        return this.f15525d;
    }

    public final b q() {
        return this.f15529h;
    }

    public final boolean r() {
        return this.f15522a == null || this.f15523b == null;
    }

    public final boolean s() {
        return this.i;
    }

    public final boolean t() {
        return kotlin.jvm.internal.f.b(this.f15525d, "IDENTITY_VIDEO");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("type=");
        sb2.append(this.f15525d);
        sb2.append(", document=");
        File file = this.f15522a;
        sb2.append(file != null ? file.getAbsolutePath() : null);
        sb2.append(", raw=");
        File file2 = this.f15523b;
        sb2.append(file2 != null ? file2.getAbsolutePath() : null);
        sb2.append(", side=");
        IdentitySide identitySide = this.f15526e;
        sb2.append(identitySide != null ? identitySide.getValue() : null);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f15522a);
        parcel.writeSerializable(this.f15523b);
        parcel.writeString(this.f15524c);
        parcel.writeString(this.f15525d);
        IdentitySide identitySide = this.f15526e;
        if (identitySide == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(identitySide.name());
        }
        parcel.writeInt(this.f15527f ? 1 : 0);
        com.sumsub.sns.internal.ml.badphotos.models.b bVar = this.f15528g;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i);
        }
        b bVar2 = this.f15529h;
        if (bVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.i ? 1 : 0);
    }

    public n(File file, File file2, String str, String str2, IdentitySide identitySide, boolean z10, com.sumsub.sns.internal.ml.badphotos.models.b bVar, b bVar2, boolean z11) {
        this.f15522a = file;
        this.f15523b = file2;
        this.f15524c = str;
        this.f15525d = str2;
        this.f15526e = identitySide;
        this.f15527f = z10;
        this.f15528g = bVar;
        this.f15529h = bVar2;
        this.i = z11;
    }

    public /* synthetic */ n(File file, File file2, String str, String str2, IdentitySide identitySide, boolean z10, com.sumsub.sns.internal.ml.badphotos.models.b bVar, b bVar2, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : identitySide, (i & 32) != 0 ? false : z10, (i & 64) != 0 ? null : bVar, (i & 128) == 0 ? bVar2 : null, (i & 256) == 0 ? z11 : false);
    }
}
