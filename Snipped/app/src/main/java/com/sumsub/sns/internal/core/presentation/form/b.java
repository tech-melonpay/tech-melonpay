package com.sumsub.sns.internal.core.presentation.form;

import C.v;
import P9.s;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.presentation.form.model.FormItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public interface b {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16464a;

        /* renamed from: b, reason: collision with root package name */
        public final List<C0241b> f16465b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16466c;

        /* renamed from: d, reason: collision with root package name */
        public final c f16467d;

        public a(int i, List<C0241b> list, String str, c cVar) {
            this.f16464a = i;
            this.f16465b = list;
            this.f16466c = str;
            this.f16467d = cVar;
        }

        public final C0241b e() {
            return (C0241b) s.M(this.f16464a, this.f16465b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16464a == aVar.f16464a && f.b(this.f16465b, aVar.f16465b) && f.b(this.f16466c, aVar.f16466c) && f.b(this.f16467d, aVar.f16467d);
        }

        public final int f() {
            return this.f16464a;
        }

        public final String g() {
            return this.f16466c;
        }

        public final List<C0241b> h() {
            return this.f16465b;
        }

        public int hashCode() {
            int f10 = v.f(this.f16465b, Integer.hashCode(this.f16464a) * 31, 31);
            String str = this.f16466c;
            int hashCode = (f10 + (str == null ? 0 : str.hashCode())) * 31;
            c cVar = this.f16467d;
            return hashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final c i() {
            return this.f16467d;
        }

        public String toString() {
            return "FormViewState(currentPageIndex=" + this.f16464a + ", pages=" + this.f16465b + ", mimeTypes=" + this.f16466c + ", validationStrings=" + this.f16467d + ')';
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.presentation.form.b$b, reason: collision with other inner class name */
    public static final class C0241b implements Parcelable {
        public static final Parcelable.Creator<C0241b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f16468a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16469b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16470c;

        /* renamed from: d, reason: collision with root package name */
        public final List<FormItem> f16471d;

        /* renamed from: com.sumsub.sns.internal.core.presentation.form.b$b$a */
        public static final class a implements Parcelable.Creator<C0241b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0241b createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(parcel.readParcelable(C0241b.class.getClassLoader()));
                }
                return new C0241b(readInt, readString, readString2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0241b[] newArray(int i) {
                return new C0241b[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0241b(int i, String str, String str2, List<? extends FormItem> list) {
            this.f16468a = i;
            this.f16469b = str;
            this.f16470c = str2;
            this.f16471d = list;
        }

        public final C0241b a(int i, String str, String str2, List<? extends FormItem> list) {
            return new C0241b(i, str, str2, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f16468a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0241b)) {
                return false;
            }
            C0241b c0241b = (C0241b) obj;
            return this.f16468a == c0241b.f16468a && f.b(this.f16469b, c0241b.f16469b) && f.b(this.f16470c, c0241b.f16470c) && f.b(this.f16471d, c0241b.f16471d);
        }

        public final List<FormItem> f() {
            return this.f16471d;
        }

        public final String g() {
            return this.f16470c;
        }

        public final String h() {
            return this.f16469b;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f16468a) * 31;
            String str = this.f16469b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f16470c;
            return this.f16471d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Page(index=");
            sb2.append(this.f16468a);
            sb2.append(", title=");
            sb2.append(this.f16469b);
            sb2.append(", subtitle=");
            sb2.append(this.f16470c);
            sb2.append(", items=");
            return v.r(sb2, this.f16471d, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f16468a);
            parcel.writeString(this.f16469b);
            parcel.writeString(this.f16470c);
            List<FormItem> list = this.f16471d;
            parcel.writeInt(list.size());
            Iterator<FormItem> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C0241b a(C0241b c0241b, int i, String str, String str2, List list, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i = c0241b.f16468a;
            }
            if ((i9 & 2) != 0) {
                str = c0241b.f16469b;
            }
            if ((i9 & 4) != 0) {
                str2 = c0241b.f16470c;
            }
            if ((i9 & 8) != 0) {
                list = c0241b.f16471d;
            }
            return c0241b.a(i, str, str2, list);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f16472a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16473b;

        public c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final String c() {
            return this.f16473b;
        }

        public final String d() {
            return this.f16472a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return f.b(this.f16472a, cVar.f16472a) && f.b(this.f16473b, cVar.f16473b);
        }

        public int hashCode() {
            String str = this.f16472a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f16473b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationStrings(isRequired=");
            sb2.append(this.f16472a);
            sb2.append(", isNotValid=");
            return v.q(sb2, this.f16473b, ')');
        }

        public c(String str, String str2) {
            this.f16472a = str;
            this.f16473b = str2;
        }

        public /* synthetic */ c(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    d a();

    default void a(Context context, FieldId fieldId, List<? extends Uri> list) {
    }

    StateFlow<a> b();

    default void b(FormItem formItem, String str) {
    }

    default void a(FormItem formItem, String str) {
    }

    default void a(FormItem formItem, List<String> list) {
    }
}
