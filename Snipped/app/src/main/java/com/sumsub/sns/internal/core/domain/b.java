package com.sumsub.sns.internal.core.domain;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16318a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f16319b;

    @V9.d(c = "com.sumsub.sns.internal.core.domain.CountriesUseCase", f = "CountriesUseCase.kt", l = {26, 41, 42, 52}, m = "invoke-gIAlu-s")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16320a;

        /* renamed from: b, reason: collision with root package name */
        public Object f16321b;

        /* renamed from: c, reason: collision with root package name */
        public Object f16322c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16323d;

        /* renamed from: e, reason: collision with root package name */
        public Object f16324e;

        /* renamed from: f, reason: collision with root package name */
        public Object f16325f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16326g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f16327h;

        /* renamed from: j, reason: collision with root package name */
        public int f16328j;

        public a(T9.a<? super a> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16327h = obj;
            this.f16328j |= Integer.MIN_VALUE;
            Object a10 = b.this.a(false, this);
            return a10 == CoroutineSingletons.f23158a ? a10 : new Result(a10);
        }
    }

    public b(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        this.f16318a = aVar;
        this.f16319b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd A[Catch: Exception -> 0x004f, TRY_ENTER, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011f A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0133 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013b A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b0 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0232 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027e A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018f A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:14:0x004a, B:15:0x02a4, B:16:0x02c3, B:23:0x006c, B:24:0x01ac, B:26:0x01b0, B:27:0x01d3, B:29:0x01da, B:31:0x01f1, B:33:0x01f7, B:34:0x0204, B:36:0x020a, B:39:0x0219, B:44:0x0232, B:48:0x021e, B:52:0x022b, B:54:0x0237, B:58:0x023f, B:61:0x0250, B:63:0x0258, B:67:0x0264, B:70:0x026f, B:74:0x027e, B:84:0x0083, B:85:0x0187, B:87:0x018f, B:89:0x0197, B:94:0x008e, B:97:0x00ae, B:100:0x00bd, B:101:0x00ca, B:103:0x00d0, B:106:0x00da, B:109:0x00e1, B:113:0x00ef, B:116:0x00f9, B:118:0x011f, B:126:0x0133, B:128:0x013b, B:129:0x0141, B:137:0x009b), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r27, T9.a<? super kotlin.Result<com.sumsub.sns.internal.core.domain.c>> r28) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.b.a(boolean, T9.a):java.lang.Object");
    }
}
