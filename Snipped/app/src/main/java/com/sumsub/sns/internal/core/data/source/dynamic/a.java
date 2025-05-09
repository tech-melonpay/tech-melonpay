package com.sumsub.sns.internal.core.data.source.dynamic;

import O9.p;
import P9.s;
import V9.d;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.sumsub.sns.internal.core.data.source.dynamic.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes2.dex */
public final class a<T, P> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f16114a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f16115b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0651q<P, T, T9.a<? super T>, Object> f16116c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16117d;

    /* renamed from: e, reason: collision with root package name */
    public Job f16118e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableSharedFlow<e<T>> f16119f;

    /* renamed from: g, reason: collision with root package name */
    public final SharedFlow<e<T>> f16120g;

    @d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataKeeper", f = "DataKeeper.kt", l = {31, 32}, m = "get")
    /* renamed from: com.sumsub.sns.internal.core.data.source.dynamic.a$a, reason: collision with other inner class name */
    public static final class C0231a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16121a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T, P> f16123c;

        /* renamed from: d, reason: collision with root package name */
        public int f16124d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0231a(a<T, P> aVar, T9.a<? super C0231a> aVar2) {
            super(aVar2);
            this.f16123c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16122b = obj;
            this.f16124d |= Integer.MIN_VALUE;
            return this.f16123c.a(false, null, this);
        }
    }

    @d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataKeeper", f = "DataKeeper.kt", l = {42, 43}, m = "getAsResult")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f16125a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16126b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T, P> f16127c;

        /* renamed from: d, reason: collision with root package name */
        public int f16128d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T, P> aVar, T9.a<? super b> aVar2) {
            super(aVar2);
            this.f16127c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f16126b = obj;
            this.f16128d |= Integer.MIN_VALUE;
            return this.f16127c.b(false, null, this);
        }
    }

    @d(c = "com.sumsub.sns.internal.core.data.source.dynamic.DataKeeper$refreshInternal$1", f = "DataKeeper.kt", l = {62, 63, 67}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f16129a;

        /* renamed from: b, reason: collision with root package name */
        public int f16130b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T, P> f16131c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ P f16132d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<T, P> aVar, P p10, T9.a<? super c> aVar2) {
            super(2, aVar2);
            this.f16131c = aVar;
            this.f16132d = p10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new c(this.f16131c, this.f16132d, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f16130b;
            try {
            } catch (Throwable th) {
                com.sumsub.sns.core.c.a(com.sumsub.sns.core.c.f14016a, this.f16131c.f16117d, "updating failed: " + th.getMessage(), null, 4, null);
                MutableSharedFlow mutableSharedFlow = this.f16131c.f16119f;
                e.c<T> a10 = e.f16308a.a(i, th);
                this.f16129a = null;
                this.f16130b = 3;
                if (mutableSharedFlow.emit(a10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (i == 0) {
                kotlin.b.b(obj);
                e eVar = (e) s.L(this.f16131c.f16119f.getReplayCache());
                Object d10 = eVar != null ? eVar.d() : null;
                InterfaceC0651q interfaceC0651q = this.f16131c.f16116c;
                P p10 = this.f16132d;
                this.f16129a = d10;
                this.f16130b = 1;
                obj = interfaceC0651q.invoke(p10, d10, this);
                obj2 = d10;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        return p.f3034a;
                    }
                    Object obj3 = this.f16129a;
                    kotlin.b.b(obj);
                    i = obj3;
                    com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, this.f16131c.f16117d, "Updated", null, 4, null);
                    return p.f3034a;
                }
                Object obj4 = this.f16129a;
                kotlin.b.b(obj);
                obj2 = obj4;
            }
            MutableSharedFlow mutableSharedFlow2 = this.f16131c.f16119f;
            e.d a11 = e.f16308a.a(obj);
            this.f16129a = obj2;
            this.f16130b = 2;
            i = obj2;
            if (mutableSharedFlow2.emit(a11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, this.f16131c.f16117d, "Updated", null, 4, null);
            return p.f3034a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, InterfaceC0651q<? super P, ? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0651q, String str) {
        this.f16114a = coroutineScope;
        this.f16115b = coroutineDispatcher;
        this.f16116c = interfaceC0651q;
        this.f16117d = str;
        MutableSharedFlow<e<T>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f16119f = MutableSharedFlow$default;
        this.f16120g = MutableSharedFlow$default;
    }

    public final SharedFlow<e<T>> a() {
        return this.f16120g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[PHI: r8
      0x006e: PHI (r8v4 java.lang.Object) = (r8v3 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x006b, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r6, P r7, T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.e<T>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.core.data.source.dynamic.a.b
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.core.data.source.dynamic.a$b r0 = (com.sumsub.sns.internal.core.data.source.dynamic.a.b) r0
            int r1 = r0.f16128d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16128d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.a$b r0 = new com.sumsub.sns.internal.core.data.source.dynamic.a$b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16126b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16128d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f16125a
            com.sumsub.sns.internal.core.data.source.dynamic.a r6 = (com.sumsub.sns.internal.core.data.source.dynamic.a) r6
            kotlin.b.b(r8)
            goto L60
        L3a:
            kotlin.b.b(r8)
            if (r6 != 0) goto L54
            kotlinx.coroutines.flow.MutableSharedFlow<com.sumsub.sns.internal.core.data.source.dynamic.e<T>> r6 = r5.f16119f
            java.util.List r6 = r6.getReplayCache()
            java.lang.Object r6 = P9.s.L(r6)
            com.sumsub.sns.internal.core.data.source.dynamic.e r6 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r6
            if (r6 == 0) goto L54
            boolean r8 = r6.b()
            if (r8 != r4) goto L54
            return r6
        L54:
            r0.f16125a = r5
            r0.f16128d = r4
            java.lang.Object r6 = r5.a(r7, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r6 = r5
        L60:
            kotlinx.coroutines.flow.MutableSharedFlow<com.sumsub.sns.internal.core.data.source.dynamic.e<T>> r6 = r6.f16119f
            r7 = 0
            r0.f16125a = r7
            r0.f16128d = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r6, r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.a.b(boolean, java.lang.Object, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r7, P r8, T9.a<? super T> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.core.data.source.dynamic.a.C0231a
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.core.data.source.dynamic.a$a r0 = (com.sumsub.sns.internal.core.data.source.dynamic.a.C0231a) r0
            int r1 = r0.f16124d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16124d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.core.data.source.dynamic.a$a r0 = new com.sumsub.sns.internal.core.data.source.dynamic.a$a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f16122b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f16124d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            kotlin.b.b(r9)
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.f16121a
            com.sumsub.sns.internal.core.data.source.dynamic.a r7 = (com.sumsub.sns.internal.core.data.source.dynamic.a) r7
            kotlin.b.b(r9)
            goto L63
        L3b:
            kotlin.b.b(r9)
            if (r7 != 0) goto L57
            kotlinx.coroutines.flow.MutableSharedFlow<com.sumsub.sns.internal.core.data.source.dynamic.e<T>> r7 = r6.f16119f
            java.util.List r7 = r7.getReplayCache()
            java.lang.Object r7 = P9.s.L(r7)
            com.sumsub.sns.internal.core.data.source.dynamic.e r7 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r7
            if (r7 == 0) goto L53
            java.lang.Object r7 = r7.d()
            goto L54
        L53:
            r7 = r3
        L54:
            if (r7 == 0) goto L57
            return r7
        L57:
            r0.f16121a = r6
            r0.f16124d = r5
            java.lang.Object r7 = r6.a(r8, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r7 = r6
        L63:
            kotlinx.coroutines.flow.MutableSharedFlow<com.sumsub.sns.internal.core.data.source.dynamic.e<T>> r7 = r7.f16119f
            r0.f16121a = r3
            r0.f16124d = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r7, r0)
            if (r9 != r1) goto L70
            return r1
        L70:
            com.sumsub.sns.internal.core.data.source.dynamic.e r9 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r9
            java.lang.Object r7 = r9.e()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.source.dynamic.a.a(boolean, java.lang.Object, T9.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object b(a aVar, boolean z10, Object obj, T9.a aVar2, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return aVar.b(z10, obj, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(a aVar, boolean z10, Object obj, T9.a aVar2, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return aVar.a(z10, obj, aVar2);
    }

    public final Object b(T t3, T9.a<? super p> aVar) {
        Object emit = this.f16119f.emit(e.f16308a.a(t3), aVar);
        return emit == CoroutineSingletons.f23158a ? emit : p.f3034a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(a aVar, Object obj, T9.a aVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return aVar.a(obj, aVar2);
    }

    public final Object a(P p10, T9.a<? super p> aVar) {
        Job job;
        Job job2 = this.f16118e;
        if ((job2 != null && job2.isActive()) || ((job = this.f16118e) != null && !job.isCompleted())) {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, this.f16117d, "refresh: waiting for existing update job to finish", null, 4, null);
        } else {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, this.f16117d, "Updating ...", null, 4, null);
            this.f16118e = a((a<T, P>) p10);
        }
        Job job3 = this.f16118e;
        if (job3 == null) {
            return p.f3034a;
        }
        Object join = job3.join(aVar);
        return join == CoroutineSingletons.f23158a ? join : p.f3034a;
    }

    public final Job a(P p10) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f16114a, this.f16115b, null, new c(this, p10, null), 2, null);
        return launch$default;
    }

    public final Object a(T9.a<? super p> aVar) {
        e eVar = (e) s.L(this.f16119f.getReplayCache());
        if (eVar != null && eVar.b()) {
            return p.f3034a;
        }
        Object a10 = a(this, null, aVar, 1, null);
        return a10 == CoroutineSingletons.f23158a ? a10 : p.f3034a;
    }
}
