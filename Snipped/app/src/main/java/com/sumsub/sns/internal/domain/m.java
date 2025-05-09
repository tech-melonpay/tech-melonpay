package com.sumsub.sns.internal.domain;

import C.v;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class m extends com.sumsub.sns.internal.core.domain.base.b<com.sumsub.sns.internal.core.data.model.g, a> {

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f16865b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16866c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, Object> f16867a;

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f16868b;

        /* renamed from: c, reason: collision with root package name */
        public final List<com.sumsub.sns.internal.core.data.model.remote.e> f16869c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f16870d;

        public a(Map<String, ? extends Object> map, List<String> list, List<com.sumsub.sns.internal.core.data.model.remote.e> list2, List<String> list3) {
            this.f16867a = map;
            this.f16868b = list;
            this.f16869c = list2;
            this.f16870d = list3;
        }

        public final List<com.sumsub.sns.internal.core.data.model.remote.e> e() {
            return this.f16869c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f16867a, aVar.f16867a) && f.b(this.f16868b, aVar.f16868b) && f.b(this.f16869c, aVar.f16869c) && f.b(this.f16870d, aVar.f16870d);
        }

        public final Map<String, Object> f() {
            return this.f16867a;
        }

        public final List<String> g() {
            return this.f16870d;
        }

        public final List<String> h() {
            return this.f16868b;
        }

        public int hashCode() {
            int hashCode = this.f16867a.hashCode() * 31;
            List<String> list = this.f16868b;
            int f10 = v.f(this.f16869c, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
            List<String> list2 = this.f16870d;
            return f10 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Params(fields=");
            sb2.append(this.f16867a);
            sb2.append(", unsetFields=");
            sb2.append(this.f16868b);
            sb2.append(", customFields=");
            sb2.append(this.f16869c);
            sb2.append(", unsetCoreFields=");
            return v.r(sb2, this.f16870d, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.UploadApplicantDataUseCase", f = "UploadApplicantDataUseCase.kt", l = {30, 45, 52}, m = "run")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16871a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16872b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16873c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16874d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f16875e;

        /* renamed from: g, reason: collision with root package name */
        public int f16877g;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16875e = obj;
            this.f16877g |= Integer.MIN_VALUE;
            return m.this.a((a) null, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, com.sumsub.sns.internal.core.data.model.g>>) this);
        }
    }

    public m(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.e eVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar);
        this.f16865b = eVar;
        this.f16866c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:14:0x01f4, B:21:0x0052, B:22:0x012c, B:24:0x0137, B:25:0x0146, B:27:0x014c, B:29:0x0163, B:30:0x0166, B:31:0x016e, B:33:0x0174, B:35:0x0186, B:36:0x01b9, B:38:0x01bf, B:40:0x01da, B:44:0x005f, B:46:0x0083, B:47:0x009a, B:49:0x00a0, B:52:0x00b3, B:57:0x00bf, B:59:0x00cc, B:61:0x00d2, B:62:0x00db, B:64:0x00e1, B:67:0x00e9, B:72:0x00ed, B:74:0x00f5, B:76:0x0103, B:78:0x0109, B:79:0x0110, B:80:0x0113, B:86:0x006c), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0174 A[Catch: Exception -> 0x0037, LOOP:1: B:31:0x016e->B:33:0x0174, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:14:0x01f4, B:21:0x0052, B:22:0x012c, B:24:0x0137, B:25:0x0146, B:27:0x014c, B:29:0x0163, B:30:0x0166, B:31:0x016e, B:33:0x0174, B:35:0x0186, B:36:0x01b9, B:38:0x01bf, B:40:0x01da, B:44:0x005f, B:46:0x0083, B:47:0x009a, B:49:0x00a0, B:52:0x00b3, B:57:0x00bf, B:59:0x00cc, B:61:0x00d2, B:62:0x00db, B:64:0x00e1, B:67:0x00e9, B:72:0x00ed, B:74:0x00f5, B:76:0x0103, B:78:0x0109, B:79:0x0110, B:80:0x0113, B:86:0x006c), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bf A[Catch: Exception -> 0x0037, LOOP:2: B:36:0x01b9->B:38:0x01bf, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:14:0x01f4, B:21:0x0052, B:22:0x012c, B:24:0x0137, B:25:0x0146, B:27:0x014c, B:29:0x0163, B:30:0x0166, B:31:0x016e, B:33:0x0174, B:35:0x0186, B:36:0x01b9, B:38:0x01bf, B:40:0x01da, B:44:0x005f, B:46:0x0083, B:47:0x009a, B:49:0x00a0, B:52:0x00b3, B:57:0x00bf, B:59:0x00cc, B:61:0x00d2, B:62:0x00db, B:64:0x00e1, B:67:0x00e9, B:72:0x00ed, B:74:0x00f5, B:76:0x0103, B:78:0x0109, B:79:0x0110, B:80:0x0113, B:86:0x006c), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:14:0x01f4, B:21:0x0052, B:22:0x012c, B:24:0x0137, B:25:0x0146, B:27:0x014c, B:29:0x0163, B:30:0x0166, B:31:0x016e, B:33:0x0174, B:35:0x0186, B:36:0x01b9, B:38:0x01bf, B:40:0x01da, B:44:0x005f, B:46:0x0083, B:47:0x009a, B:49:0x00a0, B:52:0x00b3, B:57:0x00bf, B:59:0x00cc, B:61:0x00d2, B:62:0x00db, B:64:0x00e1, B:67:0x00e9, B:72:0x00ed, B:74:0x00f5, B:76:0x0103, B:78:0x0109, B:79:0x0110, B:80:0x0113, B:86:0x006c), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:14:0x01f4, B:21:0x0052, B:22:0x012c, B:24:0x0137, B:25:0x0146, B:27:0x014c, B:29:0x0163, B:30:0x0166, B:31:0x016e, B:33:0x0174, B:35:0x0186, B:36:0x01b9, B:38:0x01bf, B:40:0x01da, B:44:0x005f, B:46:0x0083, B:47:0x009a, B:49:0x00a0, B:52:0x00b3, B:57:0x00bf, B:59:0x00cc, B:61:0x00d2, B:62:0x00db, B:64:0x00e1, B:67:0x00e9, B:72:0x00ed, B:74:0x00f5, B:76:0x0103, B:78:0x0109, B:79:0x0110, B:80:0x0113, B:86:0x006c), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:13:0x0032, B:14:0x01f4, B:21:0x0052, B:22:0x012c, B:24:0x0137, B:25:0x0146, B:27:0x014c, B:29:0x0163, B:30:0x0166, B:31:0x016e, B:33:0x0174, B:35:0x0186, B:36:0x01b9, B:38:0x01bf, B:40:0x01da, B:44:0x005f, B:46:0x0083, B:47:0x009a, B:49:0x00a0, B:52:0x00b3, B:57:0x00bf, B:59:0x00cc, B:61:0x00d2, B:62:0x00db, B:64:0x00e1, B:67:0x00e9, B:72:0x00ed, B:74:0x00f5, B:76:0x0103, B:78:0x0109, B:79:0x0110, B:80:0x0113, B:86:0x006c), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.domain.m.a r18, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends java.lang.Exception, com.sumsub.sns.internal.core.data.model.g>> r19) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.m.a(com.sumsub.sns.internal.domain.m$a, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.core.domain.base.b
    public /* bridge */ /* synthetic */ Object b(a aVar, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends com.sumsub.sns.internal.core.data.model.g>> aVar2) {
        return a(aVar, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, com.sumsub.sns.internal.core.data.model.g>>) aVar2);
    }

    public m(com.sumsub.sns.internal.core.a aVar) {
        this(aVar.n(), aVar.h(), aVar.p());
    }
}
