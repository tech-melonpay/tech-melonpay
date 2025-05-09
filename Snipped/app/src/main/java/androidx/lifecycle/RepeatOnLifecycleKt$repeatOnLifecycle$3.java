package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: RepeatOnLifecycle.kt */
@V9.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

    /* renamed from: u, reason: collision with root package name */
    public int f7016u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7017v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f7018w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f7019x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> f7020y;

    /* compiled from: RepeatOnLifecycle.kt */
    @V9.d(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "LO9/p;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f7021A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f7022B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> f7023C;

        /* renamed from: u, reason: collision with root package name */
        public Ref$ObjectRef f7024u;

        /* renamed from: v, reason: collision with root package name */
        public Ref$ObjectRef f7025v;

        /* renamed from: w, reason: collision with root package name */
        public CoroutineScope f7026w;

        /* renamed from: x, reason: collision with root package name */
        public InterfaceC0650p f7027x;

        /* renamed from: y, reason: collision with root package name */
        public int f7028y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f7029z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f7029z = lifecycle;
            this.f7021A = state;
            this.f7022B = coroutineScope;
            this.f7023C = interfaceC0650p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new AnonymousClass1(this.f7029z, this.f7021A, this.f7022B, this.f7023C, aVar);
        }

        @Override // ca.InterfaceC0650p
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
        /* JADX WARN: Type inference failed for: r11v1, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, androidx.lifecycle.q] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, T9.a<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> aVar) {
        super(2, aVar);
        this.f7018w = lifecycle;
        this.f7019x = state;
        this.f7020y = interfaceC0650p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f7018w, this.f7019x, this.f7020y, aVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f7017v = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // ca.InterfaceC0650p
    public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
        int i = this.f7016u;
        if (i == 0) {
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f7017v;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7018w, this.f7019x, coroutineScope, this.f7020y, null);
            this.f7016u = 1;
            if (BuildersKt.withContext(immediate, anonymousClass1, this) == coroutineSingletons) {
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
