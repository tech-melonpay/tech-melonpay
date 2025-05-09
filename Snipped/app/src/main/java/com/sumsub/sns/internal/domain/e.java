package com.sumsub.sns.internal.domain;

import C.v;
import com.sumsub.sns.internal.core.data.model.Document;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16796a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16797b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16798c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.g f16799a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Document> f16800b;

        public a(com.sumsub.sns.internal.core.data.model.g gVar, List<Document> list) {
            this.f16799a = gVar;
            this.f16800b = list;
        }

        public final com.sumsub.sns.internal.core.data.model.g a() {
            return this.f16799a;
        }

        public final List<Document> b() {
            return this.f16800b;
        }

        public final com.sumsub.sns.internal.core.data.model.g c() {
            return this.f16799a;
        }

        public final List<Document> d() {
            return this.f16800b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f.b(this.f16799a, aVar.f16799a) && f.b(this.f16800b, aVar.f16800b);
        }

        public int hashCode() {
            return this.f16800b.hashCode() + (this.f16799a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SNSApplicantData(applicant=");
            sb2.append(this.f16799a);
            sb2.append(", documents=");
            return v.r(sb2, this.f16800b, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.domain.GetApplicantDataAndUpdateStatusIfNeededUseCase", f = "GetApplicantDataAndUpdateStatusIfNeededUseCase.kt", l = {33, 34, 37, 40, 44, 49, 57}, m = "invoke-0E7RQCE")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16801a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16802b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16803c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16804d;

        /* renamed from: e, reason: collision with root package name */
        public Object f16805e;

        /* renamed from: f, reason: collision with root package name */
        public Object f16806f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16807g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f16808h;

        /* renamed from: j, reason: collision with root package name */
        public int f16809j;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16808h = obj;
            this.f16809j |= Integer.MIN_VALUE;
            Object a10 = e.this.a(false, null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public e(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, String str) {
        this.f16796a = aVar;
        this.f16797b = bVar;
        this.f16798c = s3.b.j("GetApplUptStat_", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x025c A[Catch: Exception -> 0x0274, TRY_LEAVE, TryCatch #6 {Exception -> 0x0274, blocks: (B:14:0x003e, B:15:0x0254, B:17:0x025c), top: B:13:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027f A[Catch: Exception -> 0x005a, TryCatch #1 {Exception -> 0x005a, blocks: (B:20:0x0279, B:22:0x027f, B:23:0x0284, B:31:0x0055, B:62:0x006e, B:64:0x01aa, B:72:0x0182, B:74:0x018e, B:83:0x00ac, B:103:0x010c), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f7 A[Catch: Exception -> 0x0202, TryCatch #7 {Exception -> 0x0202, blocks: (B:33:0x01e2, B:37:0x01ef, B:39:0x01f7, B:41:0x01fb, B:45:0x021f, B:50:0x0206, B:51:0x020a, B:53:0x0210), top: B:32:0x01e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018e A[Catch: Exception -> 0x005a, TryCatch #1 {Exception -> 0x005a, blocks: (B:20:0x0279, B:22:0x027f, B:23:0x0284, B:31:0x0055, B:62:0x006e, B:64:0x01aa, B:72:0x0182, B:74:0x018e, B:83:0x00ac, B:103:0x010c), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r22, com.sumsub.sns.internal.core.data.source.applicant.b r23, T9.a<? super kotlin.Result<com.sumsub.sns.internal.domain.e.a>> r24) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.domain.e.a(boolean, com.sumsub.sns.internal.core.data.source.applicant.b, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(e eVar, boolean z10, com.sumsub.sns.internal.core.data.source.applicant.b bVar, T9.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = false;
        }
        return eVar.a(z10, bVar, aVar);
    }
}
