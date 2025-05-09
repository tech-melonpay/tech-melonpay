package com.sumsub.sns.internal.core.presentation.form.model;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class FormItem implements Parcelable {
    public static final b i = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f16474a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16475b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16476c;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f16477d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16478e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f16479f;

    /* renamed from: g, reason: collision with root package name */
    public String f16480g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16481h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/internal/core/presentation/form/model/FormItem$ItemState;", "", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ItemState {
        DEFAULT,
        LOADING
    }

    public static final class a extends FormItem {
        public static final Parcelable.Creator<a> CREATOR = new C0242a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16482k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16483l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16484m;

        /* renamed from: n, reason: collision with root package name */
        public final CharSequence f16485n;

        /* renamed from: com.sumsub.sns.internal.core.presentation.form.model.FormItem$a$a, reason: collision with other inner class name */
        public static final class C0242a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                return new a(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public /* synthetic */ a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, str2, (i & 8) != 0 ? null : charSequence);
        }

        public final a a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            return new a(kVar, str, str2, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16485n;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16482k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16483l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(d(), aVar.d()) && kotlin.jvm.internal.f.b(e(), aVar.e()) && kotlin.jvm.internal.f.b(f(), aVar.f()) && kotlin.jvm.internal.f.b(b(), aVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16484m;
        }

        public int hashCode() {
            return ((((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31) + (b() != null ? b().hashCode() : 0);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Bool(item=" + d() + ", sectionId=" + e() + ", value=" + f() + ", error=" + ((Object) b()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16482k.writeToParcel(parcel, i);
            parcel.writeString(this.f16483l);
            parcel.writeString(this.f16484m);
            TextUtils.writeToParcel(this.f16485n, parcel, i);
        }

        public a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16482k = kVar;
            this.f16483l = str;
            this.f16484m = str2;
            this.f16485n = charSequence;
        }

        public static /* synthetic */ a a(a aVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = aVar.d();
            }
            if ((i & 2) != 0) {
                str = aVar.e();
            }
            if ((i & 4) != 0) {
                str2 = aVar.f();
            }
            if ((i & 8) != 0) {
                charSequence = aVar.b();
            }
            return aVar.a(kVar, str, str2, charSequence);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends FormItem {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final String f16486k;

        /* renamed from: l, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16487l;

        /* renamed from: m, reason: collision with root package name */
        public final Map<String, String> f16488m;

        /* renamed from: n, reason: collision with root package name */
        public final String f16489n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f16490o;

        /* renamed from: p, reason: collision with root package name */
        public final CharSequence f16491p;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                com.sumsub.sns.internal.core.data.source.applicant.remote.k createFromParcel = com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new c(readString, createFromParcel, linkedHashMap, parcel.readString(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public /* synthetic */ c(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map map, String str2, boolean z10, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kVar, (i & 4) != 0 ? kotlin.collections.a.p() : map, str2, (i & 16) != 0 ? true : z10, (i & 32) != 0 ? null : charSequence);
        }

        public final c a(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map<String, String> map, String str2, boolean z10, CharSequence charSequence) {
            return new c(str, kVar, map, str2, z10, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16491p;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16487l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16486k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(e(), cVar.e()) && kotlin.jvm.internal.f.b(d(), cVar.d()) && kotlin.jvm.internal.f.b(this.f16488m, cVar.f16488m) && kotlin.jvm.internal.f.b(f(), cVar.f()) && h() == cVar.h() && kotlin.jvm.internal.f.b(b(), cVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16489n;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public boolean h() {
            return this.f16490o;
        }

        public int hashCode() {
            int hashCode = (((this.f16488m.hashCode() + ((d().hashCode() + (e().hashCode() * 31)) * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31;
            boolean h9 = h();
            int i = h9;
            if (h9) {
                i = 1;
            }
            return ((hashCode + i) * 31) + (b() != null ? b().hashCode() : 0);
        }

        public final Map<String, String> r() {
            return this.f16488m;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return com.sumsub.sns.internal.core.common.i.a(this) + "(s=" + e() + ", i=" + d() + ", v=" + f() + ", countries=" + this.f16488m.size() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16486k);
            this.f16487l.writeToParcel(parcel, i);
            Map<String, String> map = this.f16488m;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            parcel.writeString(this.f16489n);
            parcel.writeInt(this.f16490o ? 1 : 0);
            TextUtils.writeToParcel(this.f16491p, parcel, i);
        }

        public static /* synthetic */ c a(c cVar, String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map map, String str2, boolean z10, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.e();
            }
            if ((i & 2) != 0) {
                kVar = cVar.d();
            }
            com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar2 = kVar;
            if ((i & 4) != 0) {
                map = cVar.f16488m;
            }
            Map map2 = map;
            if ((i & 8) != 0) {
                str2 = cVar.f();
            }
            String str3 = str2;
            if ((i & 16) != 0) {
                z10 = cVar.h();
            }
            boolean z11 = z10;
            if ((i & 32) != 0) {
                charSequence = cVar.b();
            }
            return cVar.a(str, kVar2, map2, str3, z11, charSequence);
        }

        public c(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map<String, String> map, String str2, boolean z10, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16486k = str;
            this.f16487l = kVar;
            this.f16488m = map;
            this.f16489n = str2;
            this.f16490o = z10;
            this.f16491p = charSequence;
        }
    }

    public static final class d extends FormItem {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16492k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16493l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f16494m;

        /* renamed from: n, reason: collision with root package name */
        public final String f16495n;

        /* renamed from: o, reason: collision with root package name */
        public final CharSequence f16496o;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                return new d(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public /* synthetic */ d(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, boolean z10, String str2, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, (i & 4) != 0 ? false : z10, str2, (i & 16) != 0 ? null : charSequence);
        }

        public final d a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, boolean z10, String str2, CharSequence charSequence) {
            return new d(kVar, str, z10, str2, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16496o;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16492k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16493l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(d(), dVar.d()) && kotlin.jvm.internal.f.b(e(), dVar.e()) && this.f16494m == dVar.f16494m && kotlin.jvm.internal.f.b(f(), dVar.f()) && kotlin.jvm.internal.f.b(b(), dVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16495n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (e().hashCode() + (d().hashCode() * 31)) * 31;
            boolean z10 = this.f16494m;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return ((((hashCode + i) * 31) + (f() == null ? 0 : f().hashCode())) * 31) + (b() != null ? b().hashCode() : 0);
        }

        public final boolean q() {
            return this.f16494m;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Date(item=" + d() + ", sectionId=" + e() + ", onlyPastDates=" + this.f16494m + ", value=" + f() + ", error=" + ((Object) b()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16492k.writeToParcel(parcel, i);
            parcel.writeString(this.f16493l);
            parcel.writeInt(this.f16494m ? 1 : 0);
            parcel.writeString(this.f16495n);
            TextUtils.writeToParcel(this.f16496o, parcel, i);
        }

        public d(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, boolean z10, String str2, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16492k = kVar;
            this.f16493l = str;
            this.f16494m = z10;
            this.f16495n = str2;
            this.f16496o = charSequence;
        }

        public static /* synthetic */ d a(d dVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, boolean z10, String str2, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = dVar.d();
            }
            if ((i & 2) != 0) {
                str = dVar.e();
            }
            String str3 = str;
            if ((i & 4) != 0) {
                z10 = dVar.f16494m;
            }
            boolean z11 = z10;
            if ((i & 8) != 0) {
                str2 = dVar.f();
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                charSequence = dVar.b();
            }
            return dVar.a(kVar, str3, z11, str4, charSequence);
        }
    }

    public static final class e extends FormItem {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16497k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16498l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16499m;

        /* renamed from: n, reason: collision with root package name */
        public final CharSequence f16500n;

        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                return new e(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        public /* synthetic */ e(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, str2, (i & 8) != 0 ? null : charSequence);
        }

        public final e a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            return new e(kVar, str, str2, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16500n;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16497k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16498l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(d(), eVar.d()) && kotlin.jvm.internal.f.b(e(), eVar.e()) && kotlin.jvm.internal.f.b(f(), eVar.f()) && kotlin.jvm.internal.f.b(b(), eVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16499m;
        }

        public int hashCode() {
            return ((((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31) + (b() != null ? b().hashCode() : 0);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "DateTime(item=" + d() + ", sectionId=" + e() + ", value=" + f() + ", error=" + ((Object) b()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16497k.writeToParcel(parcel, i);
            parcel.writeString(this.f16498l);
            parcel.writeString(this.f16499m);
            TextUtils.writeToParcel(this.f16500n, parcel, i);
        }

        public e(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16497k = kVar;
            this.f16498l = str;
            this.f16499m = str2;
            this.f16500n = charSequence;
        }

        public static /* synthetic */ e a(e eVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = eVar.d();
            }
            if ((i & 2) != 0) {
                str = eVar.e();
            }
            if ((i & 4) != 0) {
                str2 = eVar.f();
            }
            if ((i & 8) != 0) {
                charSequence = eVar.b();
            }
            return eVar.a(kVar, str, str2, charSequence);
        }
    }

    public static final class f extends FormItem {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final String f16501k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16502l;

        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                return new f(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(String str, String str2) {
            super(str2, new com.sumsub.sns.internal.core.data.source.applicant.remote.k("description_" + com.sumsub.sns.internal.core.common.i.a(FormItem.i), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 508, (DefaultConstructorMarker) null), null, null, false, null, null, false, 252, null);
            this.f16501k = str;
            this.f16502l = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16502l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.f.b(this.f16501k, fVar.f16501k) && kotlin.jvm.internal.f.b(e(), fVar.e());
        }

        public int hashCode() {
            String str = this.f16501k;
            return e().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Description(text=" + this.f16501k + ", sectionId=" + e() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16501k);
            parcel.writeString(this.f16502l);
        }
    }

    public static final class g extends FormItem {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16503k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16504l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16505m;

        /* renamed from: n, reason: collision with root package name */
        public final String f16506n;

        /* renamed from: o, reason: collision with root package name */
        public final CharSequence f16507o;

        /* renamed from: p, reason: collision with root package name */
        public final ItemState f16508p;

        /* renamed from: q, reason: collision with root package name */
        public final ItemState f16509q;

        /* renamed from: r, reason: collision with root package name */
        public final String f16510r;

        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                return new g(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), ItemState.valueOf(parcel.readString()), ItemState.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i) {
                return new g[i];
            }
        }

        public /* synthetic */ g(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, String str3, CharSequence charSequence, ItemState itemState, ItemState itemState2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : charSequence, (i & 32) != 0 ? ItemState.DEFAULT : itemState, (i & 64) != 0 ? ItemState.DEFAULT : itemState2, (i & 128) != 0 ? null : str4);
        }

        public final g a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, String str3, CharSequence charSequence, ItemState itemState, ItemState itemState2, String str4) {
            return new g(kVar, str, str2, str3, charSequence, itemState, itemState2, str4);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16507o;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16503k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16504l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.f.b(d(), gVar.d()) && kotlin.jvm.internal.f.b(e(), gVar.e()) && kotlin.jvm.internal.f.b(f(), gVar.f()) && kotlin.jvm.internal.f.b(this.f16506n, gVar.f16506n) && kotlin.jvm.internal.f.b(b(), gVar.b()) && this.f16508p == gVar.f16508p && this.f16509q == gVar.f16509q && kotlin.jvm.internal.f.b(this.f16510r, gVar.f16510r);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16505m;
        }

        public int hashCode() {
            int hashCode = (((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31;
            String str = this.f16506n;
            int hashCode2 = (this.f16509q.hashCode() + ((this.f16508p.hashCode() + ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (b() == null ? 0 : b().hashCode())) * 31)) * 31)) * 31;
            String str2 = this.f16510r;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final ItemState t() {
            return this.f16508p;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FileAttachment(item=");
            sb2.append(d());
            sb2.append(", sectionId=");
            sb2.append(e());
            sb2.append(", value=");
            sb2.append(f());
            sb2.append(", hint=");
            sb2.append(this.f16506n);
            sb2.append(", error=");
            sb2.append((Object) b());
            sb2.append(", fileState=");
            sb2.append(this.f16508p);
            sb2.append(", state=");
            sb2.append(this.f16509q);
            sb2.append(", previewUrl=");
            return v.q(sb2, this.f16510r, ')');
        }

        public final String u() {
            return this.f16506n;
        }

        public final String v() {
            return this.f16510r;
        }

        public final ItemState w() {
            return this.f16509q;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16503k.writeToParcel(parcel, i);
            parcel.writeString(this.f16504l);
            parcel.writeString(this.f16505m);
            parcel.writeString(this.f16506n);
            TextUtils.writeToParcel(this.f16507o, parcel, i);
            parcel.writeString(this.f16508p.name());
            parcel.writeString(this.f16509q.name());
            parcel.writeString(this.f16510r);
        }

        public g(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, String str3, CharSequence charSequence, ItemState itemState, ItemState itemState2, String str4) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16503k = kVar;
            this.f16504l = str;
            this.f16505m = str2;
            this.f16506n = str3;
            this.f16507o = charSequence;
            this.f16508p = itemState;
            this.f16509q = itemState2;
            this.f16510r = str4;
        }
    }

    public static final class h extends FormItem {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final String f16511k;

        /* renamed from: l, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16512l;

        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel.readString(), com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16511k = str;
            this.f16512l = kVar;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16512l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16511k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.f.b(e(), hVar.e()) && kotlin.jvm.internal.f.b(d(), hVar.d());
        }

        public int hashCode() {
            return d().hashCode() + (e().hashCode() * 31);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Hidden(sectionId=" + e() + ", item=" + d() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16511k);
            this.f16512l.writeToParcel(parcel, i);
        }
    }

    public static final class i extends FormItem {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16513k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16514l;

        /* renamed from: m, reason: collision with root package name */
        public final List<String> f16515m;

        /* renamed from: n, reason: collision with root package name */
        public final String f16516n;

        /* renamed from: o, reason: collision with root package name */
        public final CharSequence f16517o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f16518p;

        /* renamed from: q, reason: collision with root package name */
        public final List<ItemState> f16519q;

        /* renamed from: r, reason: collision with root package name */
        public final ItemState f16520r;

        /* renamed from: s, reason: collision with root package name */
        public final Map<String, String> f16521s;

        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                com.sumsub.sns.internal.core.data.source.applicant.remote.k createFromParcel = com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                String readString2 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                boolean z10 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(ItemState.valueOf(parcel.readString()));
                }
                ItemState valueOf = ItemState.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt2);
                    for (int i9 = 0; i9 != readInt2; i9++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                }
                return new i(createFromParcel, readString, createStringArrayList, readString2, charSequence, z10, arrayList, valueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i) {
                return new i[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, List<String> list, String str2, CharSequence charSequence, boolean z10, List<? extends ItemState> list2, ItemState itemState, Map<String, String> map) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16513k = kVar;
            this.f16514l = str;
            this.f16515m = list;
            this.f16516n = str2;
            this.f16517o = charSequence;
            this.f16518p = z10;
            this.f16519q = list2;
            this.f16520r = itemState;
            this.f16521s = map;
        }

        public final i a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, List<String> list, String str2, CharSequence charSequence, boolean z10, List<? extends ItemState> list2, ItemState itemState, Map<String, String> map) {
            return new i(kVar, str, list, str2, charSequence, z10, list2, itemState, map);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16517o;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16513k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16514l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.f.b(d(), iVar.d()) && kotlin.jvm.internal.f.b(e(), iVar.e()) && kotlin.jvm.internal.f.b(g(), iVar.g()) && kotlin.jvm.internal.f.b(this.f16516n, iVar.f16516n) && kotlin.jvm.internal.f.b(b(), iVar.b()) && i() == iVar.i() && kotlin.jvm.internal.f.b(this.f16519q, iVar.f16519q) && this.f16520r == iVar.f16520r && kotlin.jvm.internal.f.b(this.f16521s, iVar.f16521s);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public List<String> g() {
            return this.f16515m;
        }

        public int hashCode() {
            int hashCode = (((e().hashCode() + (d().hashCode() * 31)) * 31) + (g() == null ? 0 : g().hashCode())) * 31;
            String str = this.f16516n;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (b() == null ? 0 : b().hashCode())) * 31;
            boolean i = i();
            int i9 = i;
            if (i) {
                i9 = 1;
            }
            int hashCode3 = (this.f16520r.hashCode() + v.f(this.f16519q, (hashCode2 + i9) * 31, 31)) * 31;
            Map<String, String> map = this.f16521s;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public boolean i() {
            return this.f16518p;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "MultiFileAttachments(item=" + d() + ", sectionId=" + e() + ", values=" + g() + ", hint=" + this.f16516n + ", error=" + ((Object) b()) + ", isMultivalued=" + i() + ", fileStates=" + this.f16519q + ", state=" + this.f16520r + ", previewUrls=" + this.f16521s + ')';
        }

        public final List<ItemState> u() {
            return this.f16519q;
        }

        public final String v() {
            return this.f16516n;
        }

        public final Map<String, String> w() {
            return this.f16521s;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16513k.writeToParcel(parcel, i);
            parcel.writeString(this.f16514l);
            parcel.writeStringList(this.f16515m);
            parcel.writeString(this.f16516n);
            TextUtils.writeToParcel(this.f16517o, parcel, i);
            parcel.writeInt(this.f16518p ? 1 : 0);
            List<ItemState> list = this.f16519q;
            parcel.writeInt(list.size());
            Iterator<ItemState> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeString(this.f16520r.name());
            Map<String, String> map = this.f16521s;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public final ItemState x() {
            return this.f16520r;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(com.sumsub.sns.internal.core.data.source.applicant.remote.k r11, java.lang.String r12, java.util.List r13, java.lang.String r14, java.lang.CharSequence r15, boolean r16, java.util.List r17, com.sumsub.sns.internal.core.presentation.form.model.FormItem.ItemState r18, java.util.Map r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r3 = r13
                r0 = r20
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto La
                r5 = r2
                goto Lb
            La:
                r5 = r15
            Lb:
                r1 = r0 & 32
                if (r1 == 0) goto L12
                r1 = 1
                r6 = r1
                goto L14
            L12:
                r6 = r16
            L14:
                r1 = r0 & 64
                if (r1 == 0) goto L40
                if (r3 == 0) goto L3d
                java.util.ArrayList r1 = new java.util.ArrayList
                r4 = 10
                int r4 = P9.n.u(r13, r4)
                r1.<init>(r4)
                java.util.Iterator r4 = r13.iterator()
            L29:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L3b
                java.lang.Object r7 = r4.next()
                java.lang.String r7 = (java.lang.String) r7
                com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState r7 = com.sumsub.sns.internal.core.presentation.form.model.FormItem.ItemState.DEFAULT
                r1.add(r7)
                goto L29
            L3b:
                r7 = r1
                goto L42
            L3d:
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f23104a
                goto L3b
            L40:
                r7 = r17
            L42:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L4a
                com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState r1 = com.sumsub.sns.internal.core.presentation.form.model.FormItem.ItemState.DEFAULT
                r8 = r1
                goto L4c
            L4a:
                r8 = r18
            L4c:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L52
                r9 = r2
                goto L54
            L52:
                r9 = r19
            L54:
                r0 = r10
                r1 = r11
                r2 = r12
                r3 = r13
                r4 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.presentation.form.model.FormItem.i.<init>(com.sumsub.sns.internal.core.data.source.applicant.remote.k, java.lang.String, java.util.List, java.lang.String, java.lang.CharSequence, boolean, java.util.List, com.sumsub.sns.internal.core.presentation.form.model.FormItem$ItemState, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public static final class j extends FormItem {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16522k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16523l;

        /* renamed from: m, reason: collision with root package name */
        public final List<String> f16524m;

        /* renamed from: n, reason: collision with root package name */
        public final CharSequence f16525n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f16526o;

        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                return new j(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i) {
                return new j[i];
            }
        }

        public /* synthetic */ j(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, List list, CharSequence charSequence, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, list, (i & 8) != 0 ? null : charSequence, (i & 16) != 0 ? true : z10);
        }

        public final j a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, List<String> list, CharSequence charSequence, boolean z10) {
            return new j(kVar, str, list, charSequence, z10);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16525n;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16522k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16523l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.f.b(d(), jVar.d()) && kotlin.jvm.internal.f.b(e(), jVar.e()) && kotlin.jvm.internal.f.b(g(), jVar.g()) && kotlin.jvm.internal.f.b(b(), jVar.b()) && i() == jVar.i();
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public List<String> g() {
            return this.f16524m;
        }

        public int hashCode() {
            int hashCode = (((((e().hashCode() + (d().hashCode() * 31)) * 31) + (g() == null ? 0 : g().hashCode())) * 31) + (b() != null ? b().hashCode() : 0)) * 31;
            boolean i = i();
            int i9 = i;
            if (i) {
                i9 = 1;
            }
            return hashCode + i9;
        }

        public boolean i() {
            return this.f16526o;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "MultiSelect(item=" + d() + ", sectionId=" + e() + ", values=" + g() + ", error=" + ((Object) b()) + ", isMultivalued=" + i() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16522k.writeToParcel(parcel, i);
            parcel.writeString(this.f16523l);
            parcel.writeStringList(this.f16524m);
            TextUtils.writeToParcel(this.f16525n, parcel, i);
            parcel.writeInt(this.f16526o ? 1 : 0);
        }

        public j(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, List<String> list, CharSequence charSequence, boolean z10) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16522k = kVar;
            this.f16523l = str;
            this.f16524m = list;
            this.f16525n = charSequence;
            this.f16526o = z10;
        }

        public static /* synthetic */ j a(j jVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, List list, CharSequence charSequence, boolean z10, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = jVar.d();
            }
            if ((i & 2) != 0) {
                str = jVar.e();
            }
            String str2 = str;
            if ((i & 4) != 0) {
                list = jVar.g();
            }
            List list2 = list;
            if ((i & 8) != 0) {
                charSequence = jVar.b();
            }
            CharSequence charSequence2 = charSequence;
            if ((i & 16) != 0) {
                z10 = jVar.i();
            }
            return jVar.a(kVar, str2, list2, charSequence2, z10);
        }
    }

    public static final class k extends FormItem {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final String f16527k;

        /* renamed from: l, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16528l;

        /* renamed from: m, reason: collision with root package name */
        public final Map<String, String> f16529m;

        /* renamed from: n, reason: collision with root package name */
        public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> f16530n;

        /* renamed from: o, reason: collision with root package name */
        public final String f16531o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f16532p;

        /* renamed from: q, reason: collision with root package name */
        public final String f16533q;

        /* renamed from: r, reason: collision with root package name */
        public final CharSequence f16534r;

        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                com.sumsub.sns.internal.core.data.source.applicant.remote.k createFromParcel = com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i9 = 0; i9 != readInt2; i9++) {
                    linkedHashMap2.put(parcel.readString(), com.sumsub.sns.internal.core.data.model.remote.c.CREATOR.createFromParcel(parcel));
                }
                return new k(readString, createFromParcel, linkedHashMap, linkedHashMap2, parcel.readString(), parcel.readInt() != 0, parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i) {
                return new k[i];
            }
        }

        public /* synthetic */ k(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map map, Map map2, String str2, boolean z10, String str3, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kVar, map, map2, str2, (i & 32) != 0 ? false : z10, str3, (i & 128) != 0 ? null : charSequence);
        }

        public final k a(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map<String, String> map, Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2, String str2, boolean z10, String str3, CharSequence charSequence) {
            return new k(str, kVar, map, map2, str2, z10, str3, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16534r;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16528l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16527k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.f.b(e(), kVar.e()) && kotlin.jvm.internal.f.b(d(), kVar.d()) && kotlin.jvm.internal.f.b(this.f16529m, kVar.f16529m) && kotlin.jvm.internal.f.b(this.f16530n, kVar.f16530n) && kotlin.jvm.internal.f.b(this.f16531o, kVar.f16531o) && this.f16532p == kVar.f16532p && kotlin.jvm.internal.f.b(f(), kVar.f()) && kotlin.jvm.internal.f.b(b(), kVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16533q;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.f16530n.hashCode() + ((this.f16529m.hashCode() + ((d().hashCode() + (e().hashCode() * 31)) * 31)) * 31)) * 31;
            String str = this.f16531o;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z10 = this.f16532p;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return ((((hashCode2 + i) * 31) + (f() == null ? 0 : f().hashCode())) * 31) + (b() != null ? b().hashCode() : 0);
        }

        public final Map<String, String> t() {
            return this.f16529m;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return com.sumsub.sns.internal.core.common.i.a(this) + " (s=" + e() + ", i=" + d() + ", v=" + f() + ", countries=" + this.f16529m.size() + ')';
        }

        public final String u() {
            return this.f16531o;
        }

        public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> v() {
            return this.f16530n;
        }

        public final boolean w() {
            return this.f16532p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16527k);
            this.f16528l.writeToParcel(parcel, i);
            Map<String, String> map = this.f16529m;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2 = this.f16530n;
            parcel.writeInt(map2.size());
            for (Map.Entry<String, com.sumsub.sns.internal.core.data.model.remote.c> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i);
            }
            parcel.writeString(this.f16531o);
            parcel.writeInt(this.f16532p ? 1 : 0);
            parcel.writeString(this.f16533q);
            TextUtils.writeToParcel(this.f16534r, parcel, i);
        }

        public k(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, Map<String, String> map, Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2, String str2, boolean z10, String str3, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16527k = str;
            this.f16528l = kVar;
            this.f16529m = map;
            this.f16530n = map2;
            this.f16531o = str2;
            this.f16532p = z10;
            this.f16533q = str3;
            this.f16534r = charSequence;
        }
    }

    public static final class l extends FormItem {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16535k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16536l;

        public static final class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                return new l(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i) {
                return new l[i];
            }
        }

        public l(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16535k = kVar;
            this.f16536l = str;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16535k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16536l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.f.b(d(), lVar.d()) && kotlin.jvm.internal.f.b(e(), lVar.e());
        }

        public int hashCode() {
            return e().hashCode() + (d().hashCode() * 31);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Section(item=" + d() + ", sectionId=" + e() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16535k.writeToParcel(parcel, i);
            parcel.writeString(this.f16536l);
        }
    }

    public static final class m extends FormItem {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16537k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16538l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16539m;

        /* renamed from: n, reason: collision with root package name */
        public final CharSequence f16540n;

        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                return new m(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i) {
                return new m[i];
            }
        }

        public /* synthetic */ m(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, str2, (i & 8) != 0 ? null : charSequence);
        }

        public final m a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            return new m(kVar, str, str2, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16540n;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16537k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16538l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.f.b(d(), mVar.d()) && kotlin.jvm.internal.f.b(e(), mVar.e()) && kotlin.jvm.internal.f.b(f(), mVar.f()) && kotlin.jvm.internal.f.b(b(), mVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16539m;
        }

        public int hashCode() {
            return ((((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31) + (b() != null ? b().hashCode() : 0);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Select(item=" + d() + ", sectionId=" + e() + ", value=" + f() + ", error=" + ((Object) b()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16537k.writeToParcel(parcel, i);
            parcel.writeString(this.f16538l);
            parcel.writeString(this.f16539m);
            TextUtils.writeToParcel(this.f16540n, parcel, i);
        }

        public m(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16537k = kVar;
            this.f16538l = str;
            this.f16539m = str2;
            this.f16540n = charSequence;
        }

        public static /* synthetic */ m a(m mVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = mVar.d();
            }
            if ((i & 2) != 0) {
                str = mVar.e();
            }
            if ((i & 4) != 0) {
                str2 = mVar.f();
            }
            if ((i & 8) != 0) {
                charSequence = mVar.b();
            }
            return mVar.a(kVar, str, str2, charSequence);
        }
    }

    public static final class n extends FormItem {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16541k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16542l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16543m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f16544n;

        /* renamed from: o, reason: collision with root package name */
        public final CharSequence f16545o;

        public static final class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                return new n(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i) {
                return new n[i];
            }
        }

        public /* synthetic */ n(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, str2, (i & 8) != 0 ? true : z10, (i & 16) != 0 ? null : charSequence);
        }

        public final n a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence) {
            return new n(kVar, str, str2, z10, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16545o;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16541k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16542l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.f.b(d(), nVar.d()) && kotlin.jvm.internal.f.b(e(), nVar.e()) && kotlin.jvm.internal.f.b(f(), nVar.f()) && h() == nVar.h() && kotlin.jvm.internal.f.b(b(), nVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16543m;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public boolean h() {
            return this.f16544n;
        }

        public int hashCode() {
            int hashCode = (((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31;
            boolean h9 = h();
            int i = h9;
            if (h9) {
                i = 1;
            }
            return ((hashCode + i) * 31) + (b() != null ? b().hashCode() : 0);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "SelectDropdown(item=" + d() + ", sectionId=" + e() + ", value=" + f() + ", isEnabled=" + h() + ", error=" + ((Object) b()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16541k.writeToParcel(parcel, i);
            parcel.writeString(this.f16542l);
            parcel.writeString(this.f16543m);
            parcel.writeInt(this.f16544n ? 1 : 0);
            TextUtils.writeToParcel(this.f16545o, parcel, i);
        }

        public n(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16541k = kVar;
            this.f16542l = str;
            this.f16543m = str2;
            this.f16544n = z10;
            this.f16545o = charSequence;
        }

        public static /* synthetic */ n a(n nVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = nVar.d();
            }
            if ((i & 2) != 0) {
                str = nVar.e();
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = nVar.f();
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                z10 = nVar.h();
            }
            boolean z11 = z10;
            if ((i & 16) != 0) {
                charSequence = nVar.b();
            }
            return nVar.a(kVar, str3, str4, z11, charSequence);
        }
    }

    public static final class o extends FormItem {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final String f16546k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16547l;

        public static final class a implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                return new o(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i) {
                return new o[i];
            }
        }

        public o(String str, String str2) {
            super(str2, new com.sumsub.sns.internal.core.data.source.applicant.remote.k("subtitle_" + com.sumsub.sns.internal.core.common.i.a(FormItem.i), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 508, (DefaultConstructorMarker) null), null, null, false, null, null, false, 252, null);
            this.f16546k = str;
            this.f16547l = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16547l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return kotlin.jvm.internal.f.b(this.f16546k, oVar.f16546k) && kotlin.jvm.internal.f.b(e(), oVar.e());
        }

        public int hashCode() {
            String str = this.f16546k;
            return e().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Subtitle(text=" + this.f16546k + ", sectionId=" + e() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16546k);
            parcel.writeString(this.f16547l);
        }
    }

    public static final class p extends FormItem {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16548k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16549l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16550m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f16551n;

        /* renamed from: o, reason: collision with root package name */
        public final CharSequence f16552o;

        /* renamed from: p, reason: collision with root package name */
        public final List<String> f16553p;

        public static final class a implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                return new p(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i) {
                return new p[i];
            }
        }

        public /* synthetic */ p(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, str2, (i & 8) != 0 ? true : z10, (i & 16) != 0 ? null : charSequence, (i & 32) != 0 ? null : list);
        }

        public final p a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence, List<String> list) {
            return new p(kVar, str, str2, z10, charSequence, list);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16552o;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16548k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16549l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.f.b(d(), pVar.d()) && kotlin.jvm.internal.f.b(e(), pVar.e()) && kotlin.jvm.internal.f.b(f(), pVar.f()) && h() == pVar.h() && kotlin.jvm.internal.f.b(b(), pVar.b()) && kotlin.jvm.internal.f.b(this.f16553p, pVar.f16553p);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16550m;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public boolean h() {
            return this.f16551n;
        }

        public int hashCode() {
            int hashCode = (((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31;
            boolean h9 = h();
            int i = h9;
            if (h9) {
                i = 1;
            }
            int hashCode2 = (((hashCode + i) * 31) + (b() == null ? 0 : b().hashCode())) * 31;
            List<String> list = this.f16553p;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final List<String> r() {
            return this.f16553p;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Text(item=");
            sb2.append(d());
            sb2.append(", sectionId=");
            sb2.append(e());
            sb2.append(", value=");
            sb2.append(f());
            sb2.append(", isEnabled=");
            sb2.append(h());
            sb2.append(", error=");
            sb2.append((Object) b());
            sb2.append(", masks=");
            return v.r(sb2, this.f16553p, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16548k.writeToParcel(parcel, i);
            parcel.writeString(this.f16549l);
            parcel.writeString(this.f16550m);
            parcel.writeInt(this.f16551n ? 1 : 0);
            TextUtils.writeToParcel(this.f16552o, parcel, i);
            parcel.writeStringList(this.f16553p);
        }

        public p(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence, List<String> list) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16548k = kVar;
            this.f16549l = str;
            this.f16550m = str2;
            this.f16551n = z10;
            this.f16552o = charSequence;
            this.f16553p = list;
        }

        public static /* synthetic */ p a(p pVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, boolean z10, CharSequence charSequence, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = pVar.d();
            }
            if ((i & 2) != 0) {
                str = pVar.e();
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = pVar.f();
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                z10 = pVar.h();
            }
            boolean z11 = z10;
            if ((i & 16) != 0) {
                charSequence = pVar.b();
            }
            CharSequence charSequence2 = charSequence;
            if ((i & 32) != 0) {
                list = pVar.f16553p;
            }
            return pVar.a(kVar, str3, str4, z11, charSequence2, list);
        }
    }

    public static final class q extends FormItem {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.source.applicant.remote.k f16554k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16555l;

        /* renamed from: m, reason: collision with root package name */
        public final String f16556m;

        /* renamed from: n, reason: collision with root package name */
        public final CharSequence f16557n;

        public static final class a implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q createFromParcel(Parcel parcel) {
                return new q(com.sumsub.sns.internal.core.data.source.applicant.remote.k.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final q[] newArray(int i) {
                return new q[i];
            }
        }

        public /* synthetic */ q(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, str, str2, (i & 8) != 0 ? null : charSequence);
        }

        public final q a(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            return new q(kVar, str, str2, charSequence);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public CharSequence b() {
            return this.f16557n;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
            return this.f16554k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16555l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return kotlin.jvm.internal.f.b(d(), qVar.d()) && kotlin.jvm.internal.f.b(e(), qVar.e()) && kotlin.jvm.internal.f.b(f(), qVar.f()) && kotlin.jvm.internal.f.b(b(), qVar.b());
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String f() {
            return this.f16556m;
        }

        public int hashCode() {
            return ((((e().hashCode() + (d().hashCode() * 31)) * 31) + (f() == null ? 0 : f().hashCode())) * 31) + (b() != null ? b().hashCode() : 0);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "TextArea(item=" + d() + ", sectionId=" + e() + ", value=" + f() + ", error=" + ((Object) b()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f16554k.writeToParcel(parcel, i);
            parcel.writeString(this.f16555l);
            parcel.writeString(this.f16556m);
            TextUtils.writeToParcel(this.f16557n, parcel, i);
        }

        public q(com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence) {
            super(str, kVar, null, null, false, null, null, false, 252, null);
            this.f16554k = kVar;
            this.f16555l = str;
            this.f16556m = str2;
            this.f16557n = charSequence;
        }

        public static /* synthetic */ q a(q qVar, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str, String str2, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = qVar.d();
            }
            if ((i & 2) != 0) {
                str = qVar.e();
            }
            if ((i & 4) != 0) {
                str2 = qVar.f();
            }
            if ((i & 8) != 0) {
                charSequence = qVar.b();
            }
            return qVar.a(kVar, str, str2, charSequence);
        }
    }

    public static final class r extends FormItem {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: k, reason: collision with root package name */
        public final String f16558k;

        /* renamed from: l, reason: collision with root package name */
        public final String f16559l;

        public static final class a implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                return new r(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i) {
                return new r[i];
            }
        }

        public r(String str, String str2) {
            super(str2, new com.sumsub.sns.internal.core.data.source.applicant.remote.k("title_" + com.sumsub.sns.internal.core.common.i.a(FormItem.i), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 508, (DefaultConstructorMarker) null), null, null, false, null, null, false, 252, null);
            this.f16558k = str;
            this.f16559l = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String e() {
            return this.f16559l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return kotlin.jvm.internal.f.b(this.f16558k, rVar.f16558k) && kotlin.jvm.internal.f.b(e(), rVar.e());
        }

        public int hashCode() {
            String str = this.f16558k;
            return e().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // com.sumsub.sns.internal.core.presentation.form.model.FormItem
        public String toString() {
            return "Title(text=" + this.f16558k + ", sectionId=" + e() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f16558k);
            parcel.writeString(this.f16559l);
        }
    }

    public /* synthetic */ FormItem(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str2, List list, boolean z10, CharSequence charSequence, String str3, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVar, str2, list, z10, charSequence, str3, z11);
    }

    public String a() {
        return this.f16480g;
    }

    public CharSequence b() {
        return this.f16479f;
    }

    public final String c() {
        String p10 = d().p();
        return p10 == null ? com.sumsub.sns.internal.core.common.i.a(this) : p10;
    }

    public com.sumsub.sns.internal.core.data.source.applicant.remote.k d() {
        return this.f16475b;
    }

    public String e() {
        return this.f16474a;
    }

    public String f() {
        return this.f16476c;
    }

    public List<String> g() {
        return this.f16477d;
    }

    public boolean h() {
        return this.f16478e;
    }

    public final boolean j() {
        return kotlin.jvm.internal.f.b(d().v(), Boolean.TRUE);
    }

    public final String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.sumsub.sns.internal.core.common.i.a(this));
        sb2.append(" (");
        sb2.append(e());
        sb2.append('.');
        sb2.append(d().p());
        sb2.append(", isRequired=");
        sb2.append(d().v());
        sb2.append(", hasValue=");
        String f10 = f();
        sb2.append(!(f10 == null || f10.length() == 0));
        sb2.append("), hasValues=");
        List<String> g10 = g();
        return androidx.camera.core.impl.utils.a.o(sb2, !(g10 == null || g10.isEmpty()), ')');
    }

    public String toString() {
        return com.sumsub.sns.internal.core.common.i.a(this) + ", " + e() + '.' + d().p();
    }

    public FormItem(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str2, List<String> list, boolean z10, CharSequence charSequence, String str3, boolean z11) {
        this.f16474a = str;
        this.f16475b = kVar;
        this.f16476c = str2;
        this.f16477d = list;
        this.f16478e = z10;
        this.f16479f = charSequence;
        this.f16480g = str3;
        this.f16481h = z11;
    }

    public void a(String str) {
        this.f16480g = str;
    }

    public /* synthetic */ FormItem(String str, com.sumsub.sns.internal.core.data.source.applicant.remote.k kVar, String str2, List list, boolean z10, CharSequence charSequence, String str3, boolean z11, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, kVar, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : list, (i9 & 16) != 0 ? true : z10, (i9 & 32) != 0 ? null : charSequence, (i9 & 64) != 0 ? null : str3, (i9 & 128) != 0 ? false : z11, null);
    }
}
