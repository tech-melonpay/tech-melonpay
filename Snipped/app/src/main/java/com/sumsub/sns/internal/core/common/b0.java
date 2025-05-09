package com.sumsub.sns.internal.core.common;

import androidx.lifecycle.C0552s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final class b0 {

    @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$collectEvents$1", f = "LifecycleExtensions.kt", l = {17}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15035a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.r f15036b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f15037c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<T, T9.a<? super O9.p>, Object> f15038d;

        @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$collectEvents$1$1", f = "LifecycleExtensions.kt", l = {18}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.core.common.b0$a$a, reason: collision with other inner class name */
        public static final class C0194a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15039a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow<T> f15040b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0650p<T, T9.a<? super O9.p>, Object> f15041c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0194a(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super C0194a> aVar) {
                super(2, aVar);
                this.f15040b = flow;
                this.f15041c = interfaceC0650p;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((C0194a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new C0194a(this.f15040b, this.f15041c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f15039a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    Flow<T> flow = this.f15040b;
                    e eVar = new e(this.f15041c);
                    this.f15039a = 1;
                    if (flow.collect(eVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.lifecycle.r rVar, Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super a> aVar) {
            super(2, aVar);
            this.f15036b = rVar;
            this.f15037c = flow;
            this.f15038d = interfaceC0650p;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new a(this.f15036b, this.f15037c, this.f15038d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f15035a;
            if (i == 0) {
                kotlin.b.b(obj);
                Lifecycle lifecycle = this.f15036b.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f6978d;
                C0194a c0194a = new C0194a(this.f15037c, this.f15038d, null);
                this.f15035a = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, state, c0194a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$collectIn$1", f = "LifecycleExtensions.kt", l = {33, 34}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15042a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<T, T9.a<? super O9.p>, Object> f15043b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f15044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, Flow<? extends T> flow, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f15043b = interfaceC0650p;
            this.f15044c = flow;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new b(this.f15043b, this.f15044c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f15042a;
            if (i == 0) {
                kotlin.b.b(obj);
                InterfaceC0650p<T, T9.a<? super O9.p>, Object> interfaceC0650p = this.f15043b;
                if (interfaceC0650p == 0) {
                    Flow<T> flow = this.f15044c;
                    this.f15042a = 1;
                    if (FlowKt.collect(flow, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    Flow<T> flow2 = this.f15044c;
                    e eVar = new e(interfaceC0650p);
                    this.f15042a = 2;
                    if (flow2.collect(eVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$collectLatestIn$1", f = "LifecycleExtensions.kt", l = {40}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15045a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f15046b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<T, T9.a<? super O9.p>, Object> f15047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super c> aVar) {
            super(2, aVar);
            this.f15046b = flow;
            this.f15047c = interfaceC0650p;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new c(this.f15046b, this.f15047c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f15045a;
            if (i == 0) {
                kotlin.b.b(obj);
                Flow<T> flow = this.f15046b;
                InterfaceC0650p<T, T9.a<? super O9.p>, Object> interfaceC0650p = this.f15047c;
                this.f15045a = 1;
                if (FlowKt.collectLatest(flow, interfaceC0650p, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$collectState$1", f = "LifecycleExtensions.kt", l = {25}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.r f15049b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f15050c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<T, T9.a<? super O9.p>, Object> f15051d;

        @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$collectState$1$1", f = "LifecycleExtensions.kt", l = {26}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f15052a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow<T> f15053b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0650p<T, T9.a<? super O9.p>, Object> f15054c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f15053b = flow;
                this.f15054c = interfaceC0650p;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f15053b, this.f15054c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f15052a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    Flow<T> flow = this.f15053b;
                    InterfaceC0650p<T, T9.a<? super O9.p>, Object> interfaceC0650p = this.f15054c;
                    this.f15052a = 1;
                    if (FlowKt.collectLatest(flow, interfaceC0650p, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return O9.p.f3034a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(androidx.lifecycle.r rVar, Flow<? extends T> flow, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super d> aVar) {
            super(2, aVar);
            this.f15049b = rVar;
            this.f15050c = flow;
            this.f15051d = interfaceC0650p;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new d(this.f15049b, this.f15050c, this.f15051d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f15048a;
            if (i == 0) {
                kotlin.b.b(obj);
                Lifecycle lifecycle = this.f15049b.getLifecycle();
                Lifecycle.State state = Lifecycle.State.f6978d;
                a aVar = new a(this.f15050c, this.f15051d, null);
                this.f15048a = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, state, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return O9.p.f3034a;
        }
    }

    public static final class e implements FlowCollector, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<Object, T9.a<Object>, Object> f15055a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC0650p<Object, ? super T9.a<Object>, ? extends Object> interfaceC0650p) {
            this.f15055a = interfaceC0650p;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, T9.a aVar) {
            Object invoke = this.f15055a.invoke(obj, aVar);
            return invoke == CoroutineSingletons.f23158a ? invoke : O9.p.f3034a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f15055a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.core.common.LifecycleExtensionsKt$updateStateIn$1", f = "LifecycleExtensions.kt", l = {50}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15056a;

        /* renamed from: b, reason: collision with root package name */
        public int f15057b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow<T> f15058c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<T, T9.a<? super T>, Object> f15059d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(MutableStateFlow<T> mutableStateFlow, InterfaceC0650p<? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0650p, T9.a<? super f> aVar) {
            super(2, aVar);
            this.f15058c = mutableStateFlow;
            this.f15059d = interfaceC0650p;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((f) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new f(this.f15058c, this.f15059d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object obj2 = CoroutineSingletons.f23158a;
            int i = this.f15057b;
            if (i == 0) {
                kotlin.b.b(obj);
                MutableStateFlow mutableStateFlow2 = this.f15058c;
                InterfaceC0650p<T, T9.a<? super T>, Object> interfaceC0650p = this.f15059d;
                Object value = mutableStateFlow2.getValue();
                this.f15056a = mutableStateFlow2;
                this.f15057b = 1;
                Object invoke = interfaceC0650p.invoke(value, this);
                if (invoke == obj2) {
                    return obj2;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.f15056a;
                kotlin.b.b(obj);
            }
            mutableStateFlow.setValue(obj);
            return O9.p.f3034a;
        }
    }

    public static final <T> void a(Flow<? extends T> flow, androidx.lifecycle.r rVar, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(rVar), null, null, new a(rVar, flow, interfaceC0650p, null), 3, null);
    }

    public static final <T> Job b(Flow<? extends T> flow, androidx.lifecycle.r rVar, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.a(rVar), null, null, new d(rVar, flow, interfaceC0650p, null), 3, null);
        return launch$default;
    }

    public static /* synthetic */ void a(Flow flow, CoroutineScope coroutineScope, InterfaceC0650p interfaceC0650p, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC0650p = null;
        }
        a(flow, coroutineScope, interfaceC0650p);
    }

    public static final <T> void b(Flow<? extends T> flow, CoroutineScope coroutineScope, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(flow, interfaceC0650p, null), 3, null);
    }

    public static final <T> void a(Flow<? extends T> flow, CoroutineScope coroutineScope, InterfaceC0650p<? super T, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(interfaceC0650p, flow, null), 3, null);
    }

    public static final <T> void a(MutableStateFlow<T> mutableStateFlow, InterfaceC0646l<? super T, ? extends T> interfaceC0646l) {
        mutableStateFlow.setValue(interfaceC0646l.invoke(mutableStateFlow.getValue()));
    }

    public static final <T> void a(MutableStateFlow<T> mutableStateFlow, CoroutineScope coroutineScope, InterfaceC0650p<? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0650p) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new f(mutableStateFlow, interfaceC0650p, null), 3, null);
    }
}
