package com.sumsub.sns.internal.videoident.videoident.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f19601a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.e f19602b;

    /* renamed from: c, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f19603c;

    @V9.d(c = "com.sumsub.sns.internal.videoident.videoident.domain.UploadFileFromStreamUseCase", f = "UploadFileFromStreamUseCase.kt", l = {29, 30, 33}, m = "invoke-hUnOzRk")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19604a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19605b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19606c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19607d;

        /* renamed from: e, reason: collision with root package name */
        public Object f19608e;

        /* renamed from: f, reason: collision with root package name */
        public Object f19609f;

        /* renamed from: g, reason: collision with root package name */
        public Object f19610g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f19611h;

        /* renamed from: j, reason: collision with root package name */
        public int f19612j;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19611h = obj;
            this.f19612j |= Integer.MIN_VALUE;
            Object a10 = b.this.a(null, null, null, null, null, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public b(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.applicant.e eVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        this.f19601a = aVar;
        this.f19602b = eVar;
        this.f19603c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0166 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0167 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #4 {Exception -> 0x0039, blocks: (B:14:0x0034, B:15:0x0162, B:19:0x0167), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:0: B:48:0x00fd->B:70:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.DocumentType r20, java.lang.String r21, com.sumsub.sns.internal.core.data.model.IdentitySide r22, java.lang.String r23, java.io.InputStream r24, T9.a<? super kotlin.Result<com.sumsub.sns.internal.core.data.model.remote.k>> r25) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.videoident.domain.b.a(com.sumsub.sns.internal.core.data.model.DocumentType, java.lang.String, com.sumsub.sns.internal.core.data.model.IdentitySide, java.lang.String, java.io.InputStream, T9.a):java.lang.Object");
    }
}
