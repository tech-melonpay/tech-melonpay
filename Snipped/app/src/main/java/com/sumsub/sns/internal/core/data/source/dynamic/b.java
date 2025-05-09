package com.sumsub.sns.internal.core.data.source.dynamic;

import C.v;
import O9.p;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.model.d;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public interface b {

    public static final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final C0232a f16133g = new C0232a(null);

        /* renamed from: a, reason: collision with root package name */
        public final e<g> f16134a;

        /* renamed from: b, reason: collision with root package name */
        public final e<g> f16135b;

        /* renamed from: c, reason: collision with root package name */
        public final e<t> f16136c;

        /* renamed from: d, reason: collision with root package name */
        public final e<com.sumsub.sns.internal.core.data.model.e> f16137d;

        /* renamed from: e, reason: collision with root package name */
        public final e<c> f16138e;

        /* renamed from: f, reason: collision with root package name */
        public final e<C0233b> f16139f;

        /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.b$a$a, reason: collision with other inner class name */
        public static final class C0232a {
            public /* synthetic */ C0232a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0232a() {
            }
        }

        public a(e<g> eVar, e<g> eVar2, e<t> eVar3, e<com.sumsub.sns.internal.core.data.model.e> eVar4, e<c> eVar5, e<C0233b> eVar6) {
            this.f16134a = eVar;
            this.f16135b = eVar2;
            this.f16136c = eVar3;
            this.f16137d = eVar4;
            this.f16138e = eVar5;
            this.f16139f = eVar6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f16134a, aVar.f16134a) && f.b(this.f16135b, aVar.f16135b) && f.b(this.f16136c, aVar.f16136c) && f.b(this.f16137d, aVar.f16137d) && f.b(this.f16138e, aVar.f16138e) && f.b(this.f16139f, aVar.f16139f);
        }

        public final e<g> g() {
            return this.f16134a;
        }

        public int hashCode() {
            int hashCode = this.f16134a.hashCode() * 31;
            e<g> eVar = this.f16135b;
            return this.f16139f.hashCode() + ((this.f16138e.hashCode() + ((this.f16137d.hashCode() + ((this.f16136c.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31)) * 31)) * 31);
        }

        public final e<com.sumsub.sns.internal.core.data.model.e> i() {
            return this.f16137d;
        }

        public final e<t> j() {
            return this.f16136c;
        }

        public final Throwable k() {
            Throwable a10 = this.f16134a.a();
            if (a10 != null) {
                return a10;
            }
            Throwable a11 = this.f16136c.a();
            return a11 == null ? this.f16137d.a() : a11;
        }

        public String toString() {
            return "Data(applicant=" + this.f16134a + ", applicantAction=" + this.f16135b + ", documentStatus=" + this.f16136c + ", config=" + this.f16137d + ", strings=" + this.f16138e + ", featureFlags=" + this.f16139f + ')';
        }
    }

    /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.b$b, reason: collision with other inner class name */
    public static final class C0233b {

        /* renamed from: a, reason: collision with root package name */
        public final List<a> f16140a;

        /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.b$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f16141a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f16142b;

            /* renamed from: c, reason: collision with root package name */
            public final String f16143c;

            public a(String str, boolean z10, String str2) {
                this.f16141a = str;
                this.f16142b = z10;
                this.f16143c = str2;
            }

            public final String d() {
                return this.f16141a;
            }

            public final String e() {
                return this.f16143c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return f.b(this.f16141a, aVar.f16141a) && this.f16142b == aVar.f16142b && f.b(this.f16143c, aVar.f16143c);
            }

            public final boolean f() {
                return this.f16142b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f16141a.hashCode() * 31;
                boolean z10 = this.f16142b;
                int i = z10;
                if (z10 != 0) {
                    i = 1;
                }
                int i9 = (hashCode + i) * 31;
                String str = this.f16143c;
                return i9 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("FeatureFlag(name=");
                sb2.append(this.f16141a);
                sb2.append(", isEnabled=");
                sb2.append(this.f16142b);
                sb2.append(", value=");
                return v.q(sb2, this.f16143c, ')');
            }
        }

        public C0233b(List<a> list) {
            this.f16140a = list;
        }

        public final List<a> a() {
            return this.f16140a;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, String> f16144a;

        /* renamed from: b, reason: collision with root package name */
        public final List<d> f16145b;

        public c() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final String a(String... strArr) {
            String str;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    str = a(strArr[i]);
                    if (str != null) {
                        break;
                    }
                    i++;
                } else {
                    str = null;
                    break;
                }
            }
            return str == null ? "" : str;
        }

        public final List<d> c() {
            return this.f16145b;
        }

        public final Map<String, String> d() {
            return this.f16144a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return f.b(this.f16144a, cVar.f16144a) && f.b(this.f16145b, cVar.f16145b);
        }

        public int hashCode() {
            int hashCode = this.f16144a.hashCode() * 31;
            List<d> list = this.f16145b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Strings(strings=");
            sb2.append(this.f16144a);
            sb2.append(", agreements=");
            return v.r(sb2, this.f16145b, ')');
        }

        public c(Map<String, String> map, List<d> list) {
            this.f16144a = map;
            this.f16145b = list;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            if (ka.C0967l.U(r1, "keys", true) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r9) {
            /*
                r8 = this;
                com.sumsub.sns.internal.ff.a r0 = com.sumsub.sns.internal.ff.a.f16930a
                com.sumsub.sns.internal.ff.core.a r1 = r0.y()
                boolean r1 = r1.g()
                if (r1 == 0) goto L4c
                com.sumsub.sns.internal.ff.core.a r1 = r0.y()
                java.lang.String r1 = r1.f()
                boolean r2 = r1 instanceof java.lang.String
                r3 = 1
                java.lang.String r4 = "keys"
                if (r2 == 0) goto L22
                boolean r1 = ka.C0967l.U(r1, r4, r3)
                if (r1 == 0) goto L4c
                goto L4b
            L22:
                if (r1 != r4) goto L25
                goto L4b
            L25:
                if (r1 == 0) goto L4c
                int r2 = r1.length()
                int r5 = r4.length()
                if (r2 == r5) goto L32
                goto L4c
            L32:
                int r2 = r1.length()
                r5 = 0
            L37:
                if (r5 >= r2) goto L4b
                char r6 = r1.charAt(r5)
                char r7 = r4.charAt(r5)
                boolean r6 = j3.e.p(r6, r7, r3)
                if (r6 != 0) goto L48
                goto L4c
            L48:
                int r5 = r5 + 1
                goto L37
            L4b:
                return r9
            L4c:
                java.util.Map<java.lang.String, java.lang.String> r1 = r8.f16144a
                java.lang.Object r1 = r1.get(r9)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L77
                com.sumsub.sns.internal.log.a r2 = com.sumsub.sns.internal.log.a.f17535a
                java.lang.String r3 = com.sumsub.sns.internal.log.c.a(r8)
                java.lang.String r1 = "DataRepository: "
                java.lang.String r4 = " is not found"
                java.lang.String r4 = androidx.camera.core.n.a(r1, r9, r4)
                r6 = 4
                r7 = 0
                r5 = 0
                com.sumsub.log.logger.Logger.d$default(r2, r3, r4, r5, r6, r7)
                com.sumsub.sns.internal.ff.core.a r0 = r0.y()
                boolean r0 = r0.g()
                if (r0 == 0) goto L75
                goto L78
            L75:
                r9 = 0
                goto L78
            L77:
                r9 = r1
            L78:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.b.c.a(java.lang.String):java.lang.String");
        }

        public /* synthetic */ c(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.a.p() : map, (i & 2) != 0 ? null : list);
        }
    }

    static /* synthetic */ Object a(b bVar, String str, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantActionAsResult");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z10 = false;
        }
        return bVar.a(str, z10, aVar);
    }

    static /* synthetic */ Object b(b bVar, String str, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantAction");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z10 = false;
        }
        return bVar.d(str, z10, aVar);
    }

    static /* synthetic */ Object c(b bVar, String str, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicant");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z10 = false;
        }
        return bVar.b(str, z10, aVar);
    }

    static /* synthetic */ Object d(b bVar, String str, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantAsResult");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z10 = false;
        }
        return bVar.c(str, z10, aVar);
    }

    static /* synthetic */ Object e(b bVar, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantByFlowTypeAsResult");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        return bVar.d(z10, aVar);
    }

    Object a(String str, boolean z10, T9.a<? super e<g>> aVar);

    Object a(boolean z10, T9.a<? super com.sumsub.sns.internal.core.data.model.e> aVar);

    Flow<SNSMessage.ServerMessage> a();

    Object b(T9.a<? super p> aVar);

    Object b(g gVar, T9.a<? super p> aVar);

    Object b(String str, boolean z10, T9.a<? super g> aVar);

    Object b(boolean z10, T9.a<? super e<com.sumsub.sns.internal.core.data.model.e>> aVar);

    StateFlow<a> b();

    Object c(String str, boolean z10, T9.a<? super e<g>> aVar);

    Object c(boolean z10, T9.a<? super e<t>> aVar);

    Object d(T9.a<? super c> aVar);

    Object d(String str, boolean z10, T9.a<? super g> aVar);

    Object d(boolean z10, T9.a<? super e<g>> aVar);

    Object e(boolean z10, T9.a<? super g> aVar);

    static /* synthetic */ Object a(b bVar, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConfig");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        return bVar.a(z10, aVar);
    }

    static /* synthetic */ Object b(b bVar, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantByFlowType");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        return bVar.e(z10, aVar);
    }

    static /* synthetic */ Object c(b bVar, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequiredIdDocStatus");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        return bVar.c(z10, aVar);
    }

    static /* synthetic */ Object d(b bVar, boolean z10, T9.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConfigAsResult");
        }
        if ((i & 1) != 0) {
            z10 = false;
        }
        return bVar.b(z10, (T9.a<? super e<com.sumsub.sns.internal.core.data.model.e>>) aVar);
    }
}
