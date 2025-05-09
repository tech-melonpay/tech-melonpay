package com.sumsub.sns.internal.core.data.model;

import com.sumsub.sns.core.data.model.SNSException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f15532d = new b(null);
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f15533a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15534b;

    /* renamed from: c, reason: collision with root package name */
    public final a f15535c;

    public static final class a implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        public static final C0210a f15536d = new C0210a(null);
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final String f15537a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15538b;

        /* renamed from: c, reason: collision with root package name */
        public final String f15539c;

        /* renamed from: com.sumsub.sns.internal.core.data.model.o$a$a, reason: collision with other inner class name */
        public static final class C0210a {
            public /* synthetic */ C0210a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0210a() {
            }
        }

        public a() {
            this(null, null, null, 7, null);
        }

        public final String d() {
            return this.f15539c;
        }

        public final String e() {
            return this.f15538b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f15537a, aVar.f15537a) && kotlin.jvm.internal.f.b(this.f15538b, aVar.f15538b) && kotlin.jvm.internal.f.b(this.f15539c, aVar.f15539c);
        }

        public final String f() {
            return this.f15537a;
        }

        public int hashCode() {
            String str = this.f15537a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f15538b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f15539c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Appearance(title=");
            sb2.append(this.f15537a);
            sb2.append(", text=");
            sb2.append(this.f15538b);
            sb2.append(", buttonText=");
            return C.v.q(sb2, this.f15539c, ')');
        }

        public a(String str, String str2, String str3) {
            this.f15537a = str;
            this.f15538b = str2;
            this.f15539c = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends o {
        public /* synthetic */ c(Throwable th, Object obj, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : aVar);
        }

        public c(Throwable th, Object obj, a aVar) {
            super(th, obj, aVar, null);
        }
    }

    public static final class d extends o {
        public /* synthetic */ d(Throwable th, Object obj, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : aVar);
        }

        public d(Throwable th, Object obj, a aVar) {
            super(th, obj, aVar, null);
        }
    }

    public static final class e extends o {
        public /* synthetic */ e(Throwable th, Object obj, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : aVar);
        }

        public e(Throwable th, Object obj, a aVar) {
            super(th, obj, aVar, null);
        }
    }

    public static final class f extends o {

        /* renamed from: e, reason: collision with root package name */
        public final String f15540e;

        public /* synthetic */ f(String str, SNSException.Api api, Object obj, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : api, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : aVar);
        }

        public final String d() {
            return this.f15540e;
        }

        public f(String str, SNSException.Api api, Object obj, a aVar) {
            super(api, obj, aVar, null);
            this.f15540e = str;
        }
    }

    public /* synthetic */ o(Throwable th, Object obj, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, obj, aVar);
    }

    public final a a() {
        return this.f15535c;
    }

    public final Throwable b() {
        return this.f15533a;
    }

    public final Object c() {
        return this.f15534b;
    }

    public o(Throwable th, Object obj, a aVar) {
        this.f15533a = th;
        this.f15534b = obj;
        this.f15535c = aVar;
    }
}
