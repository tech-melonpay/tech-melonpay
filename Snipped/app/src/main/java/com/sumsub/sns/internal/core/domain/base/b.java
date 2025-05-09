package com.sumsub.sns.internal.core.domain.base;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public abstract class b<Type, Params> {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f16329a;

    @V9.d(c = "com.sumsub.sns.internal.core.domain.base.BaseUseCase", f = "BaseUseCase.kt", l = {12, 14}, m = "invoke$suspendImpl")
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16330a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16331b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b<Type, Params> f16332c;

        /* renamed from: d, reason: collision with root package name */
        public int f16333d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b<? extends Type, ? super Params> bVar, T9.a<? super a> aVar) {
            super(aVar);
            this.f16332c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16331b = obj;
            this.f16333d |= Integer.MIN_VALUE;
            return b.a(this.f16332c, null, this);
        }
    }

    public b(com.sumsub.sns.internal.core.data.source.common.a aVar) {
        this.f16329a = aVar;
    }

    public Object a(Params params, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends Type>> aVar) {
        return a(this, params, aVar);
    }

    public abstract Object b(Params params, T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends Type>> aVar);

    public final com.sumsub.sns.internal.core.data.source.common.a a() {
        return this.f16329a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(1:25))|19|21))|30|6|7|(0)(0)|19|21) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        r0.f16330a = null;
        r0.f16333d = 2;
        r7 = r5.a(r6, (T9.a<? super java.lang.Exception>) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.sumsub.sns.internal.core.domain.base.b r5, java.lang.Object r6, T9.a r7) {
        /*
            boolean r0 = r7 instanceof com.sumsub.sns.internal.core.domain.base.b.a
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.core.domain.base.b$a r0 = (com.sumsub.sns.internal.core.domain.base.b.a) r0
            int r1 = r0.f16333d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16333d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.domain.base.b$a r0 = new com.sumsub.sns.internal.core.domain.base.b$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16331b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16333d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.f16330a
            com.sumsub.sns.internal.core.domain.base.b r5 = (com.sumsub.sns.internal.core.domain.base.b) r5
            kotlin.b.b(r7)     // Catch: java.lang.Exception -> L3a
            goto L4a
        L3a:
            r6 = move-exception
            goto L4d
        L3c:
            kotlin.b.b(r7)
            r0.f16330a = r5     // Catch: java.lang.Exception -> L3a
            r0.f16333d = r4     // Catch: java.lang.Exception -> L3a
            java.lang.Object r7 = r5.b(r6, r0)     // Catch: java.lang.Exception -> L3a
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.sumsub.sns.internal.core.domain.model.a r7 = (com.sumsub.sns.internal.core.domain.model.a) r7     // Catch: java.lang.Exception -> L3a
            goto L5f
        L4d:
            r7 = 0
            r0.f16330a = r7
            r0.f16333d = r3
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            com.sumsub.sns.internal.core.domain.model.a$a r5 = new com.sumsub.sns.internal.core.domain.model.a$a
            r5.<init>(r7)
            r7 = r5
        L5f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.domain.base.b.a(com.sumsub.sns.internal.core.domain.base.b, java.lang.Object, T9.a):java.lang.Object");
    }

    public final Object a(Exception exc, T9.a<? super Exception> aVar) {
        return d.a(this.f16329a, exc);
    }
}
