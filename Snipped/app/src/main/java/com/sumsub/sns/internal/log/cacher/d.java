package com.sumsub.sns.internal.log.cacher;

import O9.p;
import P9.n;
import ca.InterfaceC0650p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f17543a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineScope f17544b = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor()));

    /* renamed from: c, reason: collision with root package name */
    public static final Set<b> f17545c = new LinkedHashSet();

    @V9.d(c = "com.sumsub.sns.internal.log.cacher.SinkCache$flush$1", f = "SinkCache.kt", l = {135}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17546a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17547b;

        @V9.d(c = "com.sumsub.sns.internal.log.cacher.SinkCache$flush$1$1$1", f = "SinkCache.kt", l = {134}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.log.cacher.d$a$a, reason: collision with other inner class name */
        public static final class C0268a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f17548a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f17549b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0268a(b bVar, T9.a<? super C0268a> aVar) {
                super(2, aVar);
                this.f17549b = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                return ((C0268a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new C0268a(this.f17549b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f17548a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    b bVar = this.f17549b;
                    this.f17548a = 1;
                    if (bVar.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p.f3034a;
            }
        }

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = new a(aVar);
            aVar2.f17547b = obj;
            return aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred async$default;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f17546a;
            if (i == 0) {
                kotlin.b.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f17547b;
                Set set = d.f17545c;
                ArrayList arrayList = new ArrayList(n.u(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C0268a((b) it.next(), null), 3, null);
                    arrayList.add(async$default);
                }
                this.f17546a = 1;
                if (AwaitKt.awaitAll(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    public final void b() {
        BuildersKt__Builders_commonKt.launch$default(f17544b, null, null, new a(null), 3, null);
    }

    public final void c() {
        CoroutineScopeKt.cancel$default(f17544b, null, 1, null);
    }

    public final boolean a(b bVar) {
        return f17545c.add(bVar);
    }
}
