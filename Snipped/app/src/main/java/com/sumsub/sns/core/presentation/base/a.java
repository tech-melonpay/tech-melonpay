package com.sumsub.sns.core.presentation.base;

import androidx.lifecycle.C0552s;
import androidx.lifecycle.Q;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.presentation.base.a.l;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.log.LoggerType;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public abstract class a<T extends l> extends Q {

    /* renamed from: o, reason: collision with root package name */
    public static final c f14042o = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f14043a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f14044b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f14045c;

    /* renamed from: d, reason: collision with root package name */
    public final Channel<j> f14046d;

    /* renamed from: e, reason: collision with root package name */
    public final Flow<j> f14047e;

    /* renamed from: f, reason: collision with root package name */
    public final Channel<InterfaceC0650p<T, T9.a<? super T>, Object>> f14048f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableSharedFlow<T> f14049g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedFlow<T> f14050h;
    public final MutableStateFlow<k> i;

    /* renamed from: j, reason: collision with root package name */
    public final StateFlow<k> f14051j;

    /* renamed from: l, reason: collision with root package name */
    public b.c f14052l;

    /* renamed from: m, reason: collision with root package name */
    public final CoroutineExceptionHandler f14053m;

    /* renamed from: n, reason: collision with root package name */
    public com.sumsub.sns.internal.core.data.model.e f14054n;

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$1", f = "SNSViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.core.presentation.base.a$a, reason: collision with other inner class name */
    public static final class C0155a extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14055a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14056b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f14057c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0155a(a<T> aVar, T9.a<? super C0155a> aVar2) {
            super(2, aVar2);
            this.f14057c = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.a aVar, T9.a<? super O9.p> aVar2) {
            return ((C0155a) create(aVar, aVar2)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            C0155a c0155a = new C0155a(this.f14057c, aVar);
            c0155a.f14056b = obj;
            return c0155a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.e> i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14055a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.a aVar = (b.a) this.f14056b;
            this.f14057c.f14054n = (aVar == null || (i = aVar.i()) == null) ? null : i.d();
            return O9.p.f3034a;
        }
    }

    public static final class a0 extends Lambda implements InterfaceC0646l<k, k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a0 f14058a = new a0();

        public a0() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke(k kVar) {
            return k.a(kVar, false, true, true, null, null, 25, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$2", f = "SNSViewModel.kt", l = {136, 137, 141, 142}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14059a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14060b;

        /* renamed from: c, reason: collision with root package name */
        public int f14061c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<T> f14062d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar, T9.a<? super b> aVar2) {
            super(2, aVar2);
            this.f14062d = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new b(this.f14062d, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0083 -> B:8:0x0050). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a2 -> B:8:0x0050). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c1 -> B:8:0x0050). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r10.f14061c
                r2 = 0
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L43
                if (r1 == r6) goto L3b
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                java.lang.Object r1 = r10.f14059a
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.b.b(r11)
                goto L50
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                java.lang.Object r1 = r10.f14059a
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.b.b(r11)
                goto Lb1
            L2c:
                java.lang.Object r1 = r10.f14060b
                ca.p r1 = (ca.InterfaceC0650p) r1
                java.lang.Object r7 = r10.f14059a
                kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
                kotlin.b.b(r11)
                r9 = r7
                r7 = r1
                r1 = r9
                goto L7d
            L3b:
                java.lang.Object r1 = r10.f14059a
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.b.b(r11)
                goto L5d
            L43:
                kotlin.b.b(r11)
                com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r11 = r10.f14062d
                kotlinx.coroutines.channels.Channel r11 = com.sumsub.sns.core.presentation.base.a.c(r11)
                kotlinx.coroutines.channels.ChannelIterator r1 = r11.iterator()
            L50:
                r10.f14059a = r1
                r10.f14060b = r2
                r10.f14061c = r6
                java.lang.Object r11 = r1.hasNext(r10)
                if (r11 != r0) goto L5d
                return r0
            L5d:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lc4
                java.lang.Object r11 = r1.next()
                ca.p r11 = (ca.InterfaceC0650p) r11
                com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r7 = r10.f14062d
                r10.f14059a = r1
                r10.f14060b = r11
                r10.f14061c = r5
                java.lang.Object r7 = r7.a(r10)
                if (r7 != r0) goto L7a
                return r0
            L7a:
                r9 = r7
                r7 = r11
                r11 = r9
            L7d:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L50
                com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r11 = r10.f14062d
                kotlinx.coroutines.flow.MutableSharedFlow r11 = com.sumsub.sns.core.presentation.base.a.g(r11)
                java.util.List r11 = r11.getReplayCache()
                java.lang.Object r11 = P9.s.L(r11)
                com.sumsub.sns.core.presentation.base.a$l r11 = (com.sumsub.sns.core.presentation.base.a.l) r11
                if (r11 != 0) goto L9d
                com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r11 = r10.f14062d
                com.sumsub.sns.core.presentation.base.a$l r11 = r11.e()
            L9d:
                com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r8 = r10.f14062d
                com.sumsub.sns.core.presentation.base.a.a(r8, r11)
                if (r11 == 0) goto L50
                r10.f14059a = r1
                r10.f14060b = r2
                r10.f14061c = r4
                java.lang.Object r11 = r7.invoke(r11, r10)
                if (r11 != r0) goto Lb1
                return r0
            Lb1:
                com.sumsub.sns.core.presentation.base.a$l r11 = (com.sumsub.sns.core.presentation.base.a.l) r11
                com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r7 = r10.f14062d
                kotlinx.coroutines.flow.MutableSharedFlow r7 = com.sumsub.sns.core.presentation.base.a.g(r7)
                r10.f14059a = r1
                r10.f14061c = r3
                java.lang.Object r11 = r7.emit(r11, r10)
                if (r11 != r0) goto L50
                return r0
            Lc4:
                O9.p r11 = O9.p.f3034a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel", f = "SNSViewModel.kt", l = {279}, m = "runWithProgressIndicator")
    public static final class b0<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14063a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14064b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14065c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14066d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a<T> f14067e;

        /* renamed from: f, reason: collision with root package name */
        public int f14068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(a<T> aVar, T9.a<? super b0> aVar2) {
            super(aVar2);
            this.f14067e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14066d = obj;
            this.f14068f |= Integer.MIN_VALUE;
            return this.f14067e.a(0L, (InterfaceC0646l<? super T9.a<? super T>, ? extends Object>) null, this);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    public static final class c0 extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f14069a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(CoroutineExceptionHandler.Companion companion, a aVar) {
            super(companion);
            this.f14069a = aVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(kotlin.coroutines.d dVar, Throwable th) {
            com.sumsub.sns.core.c.f14016a.a(com.sumsub.sns.internal.log.c.a(this.f14069a), "Prepare error", th);
            if (this.f14069a.f14052l == null) {
                this.f14069a.f14052l = new b.c(null, null, 3, null);
            }
            com.sumsub.sns.internal.core.common.b0.a(this.f14069a.i, a0.f14058a);
            a aVar = this.f14069a;
            a.a(aVar, th, aVar.f(), (Object) null, 4, (Object) null);
        }
    }

    public static final class d implements j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.o f14070a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14071b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f14072c;

        public d(com.sumsub.sns.internal.core.data.model.o oVar, String str, CharSequence charSequence) {
            this.f14070a = oVar;
            this.f14071b = str;
            this.f14072c = charSequence;
        }

        public final CharSequence d() {
            return this.f14072c;
        }

        public final com.sumsub.sns.internal.core.data.model.o e() {
            return this.f14070a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f14070a, dVar.f14070a) && kotlin.jvm.internal.f.b(this.f14071b, dVar.f14071b) && kotlin.jvm.internal.f.b(this.f14072c, dVar.f14072c);
        }

        public final String f() {
            return this.f14071b;
        }

        public int hashCode() {
            com.sumsub.sns.internal.core.data.model.o oVar = this.f14070a;
            int c2 = C.v.c((oVar == null ? 0 : oVar.hashCode()) * 31, 31, this.f14071b);
            CharSequence charSequence = this.f14072c;
            return c2 + (charSequence != null ? charSequence.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(error=");
            sb2.append(this.f14070a);
            sb2.append(", idDocSetType=");
            sb2.append(this.f14071b);
            sb2.append(", buttonText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14072c, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$throwError$1$1", f = "SNSViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14073a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14074b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Throwable f14075c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(Throwable th, T9.a<? super d0> aVar) {
            super(2, aVar);
            this.f14075c = th;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((d0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            d0 d0Var = new d0(this.f14075c, aVar);
            d0Var.f14074b = obj;
            return d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14073a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f14074b;
            Logger a10 = com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA);
            String a11 = com.sumsub.sns.internal.log.c.a(coroutineScope);
            String message = this.f14075c.getMessage();
            if (message == null) {
                message = "";
            }
            a10.e(a11, message, this.f14075c);
            return O9.p.f3034a;
        }
    }

    public static final class e implements j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.common.q f14076a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f14077b;

        /* renamed from: c, reason: collision with root package name */
        public final Long f14078c;

        public e() {
            this(null, null, null, 7, null);
        }

        public final Long d() {
            return this.f14078c;
        }

        public final Object e() {
            return this.f14077b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f14076a, eVar.f14076a) && kotlin.jvm.internal.f.b(this.f14077b, eVar.f14077b) && kotlin.jvm.internal.f.b(this.f14078c, eVar.f14078c);
        }

        public final com.sumsub.sns.internal.core.common.q f() {
            return this.f14076a;
        }

        public int hashCode() {
            int hashCode = this.f14076a.hashCode() * 31;
            Object obj = this.f14077b;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Long l10 = this.f14078c;
            return hashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public String toString() {
            return "FinishEvent(reason=" + this.f14076a + ", payload=" + this.f14077b + ", delay=" + this.f14078c + ')';
        }

        public e(com.sumsub.sns.internal.core.common.q qVar, Object obj, Long l10) {
            this.f14076a = qVar;
            this.f14077b = obj;
            this.f14078c = l10;
        }

        public /* synthetic */ e(com.sumsub.sns.internal.core.common.q qVar, Object obj, Long l10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? q.c.f15162b : qVar, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : l10);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$updateState$1", f = "SNSViewModel.kt", l = {342}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14079a;

        /* renamed from: b, reason: collision with root package name */
        public int f14080b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f14081c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<T, T9.a<? super T>, Object> f14082d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T f14083e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e0(a<T> aVar, InterfaceC0650p<? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0650p, T t3, T9.a<? super e0> aVar2) {
            super(2, aVar2);
            this.f14081c = aVar;
            this.f14082d = interfaceC0650p;
            this.f14083e = t3;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((e0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new e0(this.f14081c, this.f14082d, this.f14083e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableSharedFlow mutableSharedFlow;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14080b;
            if (i == 0) {
                kotlin.b.b(obj);
                MutableSharedFlow mutableSharedFlow2 = this.f14081c.f14049g;
                InterfaceC0650p<T, T9.a<? super T>, Object> interfaceC0650p = this.f14082d;
                T t3 = this.f14083e;
                this.f14079a = mutableSharedFlow2;
                this.f14080b = 1;
                Object invoke = interfaceC0650p.invoke(t3, this);
                if (invoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableSharedFlow = mutableSharedFlow2;
                obj = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableSharedFlow = (MutableSharedFlow) this.f14079a;
                kotlin.b.b(obj);
            }
            mutableSharedFlow.tryEmit(obj);
            return O9.p.f3034a;
        }
    }

    public static final class f implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final f f14084a = new f();
    }

    public static final class g implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final g f14085a = new g();
    }

    public static final class h implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f14086a;

        public h(String str) {
            this.f14086a = str;
        }

        public final String b() {
            return this.f14086a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.f.b(this.f14086a, ((h) obj).f14086a);
        }

        public int hashCode() {
            return this.f14086a.hashCode();
        }

        public String toString() {
            return C.v.q(new StringBuilder("OpenUrlEvent(uri="), this.f14086a, ')');
        }
    }

    public static final class i implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f14087a;

        public i(String str) {
            this.f14087a = str;
        }

        public final String b() {
            return this.f14087a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && kotlin.jvm.internal.f.b(this.f14087a, ((i) obj).f14087a);
        }

        public int hashCode() {
            return this.f14087a.hashCode();
        }

        public String toString() {
            return C.v.q(new StringBuilder("PermissionRequest(permission="), this.f14087a, ')');
        }
    }

    public interface j {
    }

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14088a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14089b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14090c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f14091d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f14092e;

        public k() {
            this(false, false, false, null, null, 31, null);
        }

        public final k a(boolean z10, boolean z11, boolean z12, CharSequence charSequence, CharSequence charSequence2) {
            return new k(z10, z11, z12, charSequence, charSequence2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f14088a == kVar.f14088a && this.f14089b == kVar.f14089b && this.f14090c == kVar.f14090c && kotlin.jvm.internal.f.b(this.f14091d, kVar.f14091d) && kotlin.jvm.internal.f.b(this.f14092e, kVar.f14092e);
        }

        public final boolean f() {
            return this.f14089b;
        }

        public final boolean g() {
            return this.f14088a;
        }

        public final CharSequence h() {
            return this.f14091d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.f14088a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            ?? r22 = this.f14089b;
            int i9 = r22;
            if (r22 != 0) {
                i9 = 1;
            }
            int i10 = (i + i9) * 31;
            boolean z11 = this.f14090c;
            int i11 = (i10 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            CharSequence charSequence = this.f14091d;
            int hashCode = (i11 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f14092e;
            return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        public final CharSequence i() {
            return this.f14092e;
        }

        public final boolean j() {
            return this.f14090c;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SNSViewModelInternalState(hideLogo=");
            sb2.append(this.f14088a);
            sb2.append(", areStringsReady=");
            sb2.append(this.f14089b);
            sb2.append(", isViewModelPrepared=");
            sb2.append(this.f14090c);
            sb2.append(", poweredByText=");
            sb2.append((Object) this.f14091d);
            sb2.append(", progressText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14092e, ')');
        }

        public k(boolean z10, boolean z11, boolean z12, CharSequence charSequence, CharSequence charSequence2) {
            this.f14088a = z10;
            this.f14089b = z11;
            this.f14090c = z12;
            this.f14091d = charSequence;
            this.f14092e = charSequence2;
        }

        public static /* synthetic */ k a(k kVar, boolean z10, boolean z11, boolean z12, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
            if ((i & 1) != 0) {
                z10 = kVar.f14088a;
            }
            if ((i & 2) != 0) {
                z11 = kVar.f14089b;
            }
            boolean z13 = z11;
            if ((i & 4) != 0) {
                z12 = kVar.f14090c;
            }
            boolean z14 = z12;
            if ((i & 8) != 0) {
                charSequence = kVar.f14091d;
            }
            CharSequence charSequence3 = charSequence;
            if ((i & 16) != 0) {
                charSequence2 = kVar.f14092e;
            }
            return kVar.a(z10, z13, z14, charSequence3, charSequence2);
        }

        public /* synthetic */ k(boolean z10, boolean z11, boolean z12, CharSequence charSequence, CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z10, (i & 2) != 0 ? false : z11, (i & 4) == 0 ? z12 : false, (i & 8) != 0 ? null : charSequence, (i & 16) != 0 ? null : charSequence2);
        }
    }

    public interface l {
    }

    public static final class m implements j {

        /* renamed from: a, reason: collision with root package name */
        public final Document f14093a;

        public m(Document document) {
            this.f14093a = document;
        }

        public final Document b() {
            return this.f14093a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && kotlin.jvm.internal.f.b(this.f14093a, ((m) obj).f14093a);
        }

        public int hashCode() {
            return this.f14093a.hashCode();
        }

        public String toString() {
            return "ShowDocumentEvent(document=" + this.f14093a + ')';
        }
    }

    public static final class o implements j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14098a;

        public o(boolean z10) {
            this.f14098a = z10;
        }

        public final boolean b() {
            return this.f14098a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f14098a == ((o) obj).f14098a;
        }

        public int hashCode() {
            boolean z10 = this.f14098a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return androidx.camera.core.impl.utils.a.o(new StringBuilder("ShowProgressEvent(show="), this.f14098a, ')');
        }
    }

    public static final class p implements j {

        /* renamed from: a, reason: collision with root package name */
        public static final p f14099a = new p();
    }

    public static final class q implements j {

        /* renamed from: a, reason: collision with root package name */
        public final String f14100a;

        public final String b() {
            return this.f14100a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.f.b(this.f14100a, ((q) obj).f14100a);
        }

        public int hashCode() {
            return this.f14100a.hashCode();
        }

        public String toString() {
            return C.v.q(new StringBuilder("ShowToast(message="), this.f14100a, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel", f = "SNSViewModel.kt", l = {365}, m = "awaitStringsReady")
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f14101a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T> f14102b;

        /* renamed from: c, reason: collision with root package name */
        public int f14103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(a<T> aVar, T9.a<? super r> aVar2) {
            super(aVar2);
            this.f14102b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14101a = obj;
            this.f14103c |= Integer.MIN_VALUE;
            return this.f14102b.a(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$awaitStringsReady$2", f = "SNSViewModel.kt", l = {366}, m = "invokeSuspend")
    public static final class s extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super k>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14104a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T> f14105b;

        @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$awaitStringsReady$2$1", f = "SNSViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.core.presentation.base.a$s$a, reason: collision with other inner class name */
        public static final class C0156a extends SuspendLambda implements InterfaceC0650p<k, T9.a<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14106a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14107b;

            public C0156a(T9.a<? super C0156a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k kVar, T9.a<? super Boolean> aVar) {
                return ((C0156a) create(kVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                C0156a c0156a = new C0156a(aVar);
                c0156a.f14107b = obj;
                return c0156a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14106a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return Boolean.valueOf(((k) this.f14107b).f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a<T> aVar, T9.a<? super s> aVar2) {
            super(2, aVar2);
            this.f14105b = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super k> aVar) {
            return ((s) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new s(this.f14105b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14104a;
            if (i == 0) {
                kotlin.b.b(obj);
                MutableStateFlow mutableStateFlow = this.f14105b.i;
                C0156a c0156a = new C0156a(null);
                this.f14104a = 1;
                obj = FlowKt.first(mutableStateFlow, c0156a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$events$1", f = "SNSViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class t extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super j>, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14108a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T> f14109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(a<T> aVar, T9.a<? super t> aVar2) {
            super(2, aVar2);
            this.f14109b = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super j> flowCollector, T9.a<? super O9.p> aVar) {
            return ((t) create(flowCollector, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new t(this.f14109b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14108a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.f14109b.f14045c = Boolean.TRUE;
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$events$2", f = "SNSViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class u extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super j>, Throwable, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14110a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T> f14111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(a<T> aVar, T9.a<? super u> aVar2) {
            super(3, aVar2);
            this.f14111b = aVar;
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super j> flowCollector, Throwable th, T9.a<? super O9.p> aVar) {
            return new u(this.f14111b, aVar).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14110a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.f14111b.f14045c = Boolean.FALSE;
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$fireEvent$1", f = "SNSViewModel.kt", l = {329}, m = "invokeSuspend")
    public static final class v extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14112a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f14113b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f14114c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f14115d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, a<T> aVar, j jVar, T9.a<? super v> aVar2) {
            super(2, aVar2);
            this.f14113b = z10;
            this.f14114c = aVar;
            this.f14115d = jVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((v) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new v(this.f14113b, this.f14114c, this.f14115d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14112a;
            if (i == 0) {
                kotlin.b.b(obj);
                if (this.f14113b) {
                    Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this.f14114c), "fireEvent: " + this.f14115d, null, 4, null);
                }
                Channel channel = this.f14114c.f14046d;
                j jVar = this.f14115d;
                this.f14112a = 1;
                if (channel.send(jVar, this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel", f = "SNSViewModel.kt", l = {352}, m = "getString")
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14116a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14117b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14118c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a<T> f14119d;

        /* renamed from: e, reason: collision with root package name */
        public int f14120e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(a<T> aVar, T9.a<? super w> aVar2) {
            super(aVar2);
            this.f14119d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14118c = obj;
            this.f14120e |= Integer.MIN_VALUE;
            return this.f14119d.a((String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel", f = "SNSViewModel.kt", l = {360}, m = "getStrings")
    public static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14121a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f14123c;

        /* renamed from: d, reason: collision with root package name */
        public int f14124d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(a<T> aVar, T9.a<? super x> aVar2) {
            super(aVar2);
            this.f14123c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14122b = obj;
            this.f14124d |= Integer.MIN_VALUE;
            return this.f14123c.b(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$prepare$1", f = "SNSViewModel.kt", l = {167, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 204}, m = "invokeSuspend")
    public static final class z extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14125a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<T> f14126b;

        @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$prepare$1$1", f = "SNSViewModel.kt", l = {168}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.core.presentation.base.a$z$a, reason: collision with other inner class name */
        public static final class C0157a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super SNSSDKState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14127a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14128b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a<T> f14129c;

            @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$prepare$1$1$1", f = "SNSViewModel.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.sumsub.sns.core.presentation.base.a$z$a$a, reason: collision with other inner class name */
            public static final class C0158a extends SuspendLambda implements InterfaceC0650p<SNSSDKState, T9.a<? super Boolean>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f14130a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f14131b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f14132c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0158a(CoroutineScope coroutineScope, T9.a<? super C0158a> aVar) {
                    super(2, aVar);
                    this.f14132c = coroutineScope;
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(SNSSDKState sNSSDKState, T9.a<? super Boolean> aVar) {
                    return ((C0158a) create(sNSSDKState, aVar)).invokeSuspend(O9.p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                    C0158a c0158a = new C0158a(this.f14132c, aVar);
                    c0158a.f14131b = obj;
                    return c0158a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    if (this.f14130a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    SNSSDKState sNSSDKState = (SNSSDKState) this.f14131b;
                    com.sumsub.sns.core.c cVar = com.sumsub.sns.core.c.f14016a;
                    String a10 = com.sumsub.sns.internal.log.c.a(this.f14132c);
                    StringBuilder sb2 = new StringBuilder("sdkState: ");
                    sb2.append(sNSSDKState);
                    sb2.append(", ");
                    sb2.append(sNSSDKState != null ? sNSSDKState.getMessage() : null);
                    com.sumsub.sns.core.c.b(cVar, a10, sb2.toString(), null, 4, null);
                    return Boolean.valueOf(sNSSDKState != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0157a(a<T> aVar, T9.a<? super C0157a> aVar2) {
                super(2, aVar2);
                this.f14129c = aVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super SNSSDKState> aVar) {
                return ((C0157a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                C0157a c0157a = new C0157a(this.f14129c, aVar);
                c0157a.f14128b = obj;
                return c0157a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f14127a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f14128b;
                    Flow<SNSSDKState> b9 = this.f14129c.f14043a.b();
                    C0158a c0158a = new C0158a(coroutineScope, null);
                    this.f14127a = 1;
                    obj = FlowKt.first(b9, c0158a, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return obj;
            }
        }

        @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$prepare$1$2", f = "SNSViewModel.kt", l = {CipherSuite.TLS_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f14133a;

            /* renamed from: b, reason: collision with root package name */
            public int f14134b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f14135c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f14136d;

            @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$prepare$1$2$configRequest$1", f = "SNSViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "invokeSuspend")
            /* renamed from: com.sumsub.sns.core.presentation.base.a$z$b$a, reason: collision with other inner class name */
            public static final class C0159a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super com.sumsub.sns.internal.core.data.model.e>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f14137a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f14138b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0159a(a<T> aVar, T9.a<? super C0159a> aVar2) {
                    super(2, aVar2);
                    this.f14138b = aVar;
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, T9.a<? super com.sumsub.sns.internal.core.data.model.e> aVar) {
                    return ((C0159a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                    return new C0159a(this.f14138b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    int i = this.f14137a;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        com.sumsub.sns.internal.core.data.source.dynamic.b bVar = this.f14138b.f14044b;
                        this.f14137a = 1;
                        obj = com.sumsub.sns.internal.core.data.source.dynamic.b.a(bVar, false, this, 1, null);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return obj;
                }
            }

            @V9.d(c = "com.sumsub.sns.core.presentation.base.SNSViewModel$prepare$1$2$stringsRequest$1", f = "SNSViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256}, m = "invokeSuspend")
            /* renamed from: com.sumsub.sns.core.presentation.base.a$z$b$b, reason: collision with other inner class name */
            public static final class C0160b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super b.c>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f14139a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a<T> f14140b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0160b(a<T> aVar, T9.a<? super C0160b> aVar2) {
                    super(2, aVar2);
                    this.f14140b = aVar;
                }

                @Override // ca.InterfaceC0650p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, T9.a<? super b.c> aVar) {
                    return ((C0160b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                    return new C0160b(this.f14140b, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                    int i = this.f14139a;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        com.sumsub.sns.internal.core.data.source.dynamic.b bVar = this.f14140b.f14044b;
                        this.f14139a = 1;
                        obj = bVar.d(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a<T> aVar, T9.a<? super b> aVar2) {
                super(2, aVar2);
                this.f14136d = aVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                b bVar = new b(this.f14136d, aVar);
                bVar.f14135c = obj;
                return bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r1 = r12.f14134b
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L35
                    if (r1 == r4) goto L2d
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L19
                    java.lang.Object r0 = r12.f14135c
                    com.sumsub.sns.core.presentation.base.a r0 = (com.sumsub.sns.core.presentation.base.a) r0
                    kotlin.b.b(r13)
                    goto L90
                L19:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L21:
                    java.lang.Object r1 = r12.f14133a
                    com.sumsub.sns.core.presentation.base.a r1 = (com.sumsub.sns.core.presentation.base.a) r1
                    java.lang.Object r3 = r12.f14135c
                    kotlinx.coroutines.Deferred r3 = (kotlinx.coroutines.Deferred) r3
                    kotlin.b.b(r13)
                    goto L7a
                L2d:
                    java.lang.Object r1 = r12.f14135c
                    kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                    kotlin.b.b(r13)
                    goto L4e
                L35:
                    kotlin.b.b(r13)
                    java.lang.Object r13 = r12.f14135c
                    r1 = r13
                    kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                    com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r13 = r12.f14136d
                    com.sumsub.sns.internal.core.data.source.dynamic.b r13 = com.sumsub.sns.core.presentation.base.a.b(r13)
                    r12.f14135c = r1
                    r12.f14134b = r4
                    java.lang.Object r13 = r13.b(r12)
                    if (r13 != r0) goto L4e
                    return r0
                L4e:
                    com.sumsub.sns.core.presentation.base.a$z$b$b r9 = new com.sumsub.sns.core.presentation.base.a$z$b$b
                    com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r13 = r12.f14136d
                    r9.<init>(r13, r5)
                    r10 = 3
                    r11 = 0
                    r7 = 0
                    r8 = 0
                    r6 = r1
                    kotlinx.coroutines.Deferred r13 = kotlinx.coroutines.BuildersKt.async$default(r6, r7, r8, r9, r10, r11)
                    com.sumsub.sns.core.presentation.base.a$z$b$a r9 = new com.sumsub.sns.core.presentation.base.a$z$b$a
                    com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r4 = r12.f14136d
                    r9.<init>(r4, r5)
                    kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.async$default(r6, r7, r8, r9, r10, r11)
                    com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r4 = r12.f14136d
                    r12.f14135c = r1
                    r12.f14133a = r4
                    r12.f14134b = r3
                    java.lang.Object r13 = r13.await(r12)
                    if (r13 != r0) goto L78
                    return r0
                L78:
                    r3 = r1
                    r1 = r4
                L7a:
                    com.sumsub.sns.internal.core.data.source.dynamic.b$c r13 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r13
                    com.sumsub.sns.core.presentation.base.a.a(r1, r13)
                    com.sumsub.sns.core.presentation.base.a<T extends com.sumsub.sns.core.presentation.base.a$l> r13 = r12.f14136d
                    r12.f14135c = r13
                    r12.f14133a = r5
                    r12.f14134b = r2
                    java.lang.Object r1 = r3.await(r12)
                    if (r1 != r0) goto L8e
                    return r0
                L8e:
                    r0 = r13
                    r13 = r1
                L90:
                    com.sumsub.sns.internal.core.data.model.e r13 = (com.sumsub.sns.internal.core.data.model.e) r13
                    com.sumsub.sns.core.presentation.base.a.a(r0, r13)
                    O9.p r13 = O9.p.f3034a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.z.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class c extends Lambda implements InterfaceC0646l<k, k> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a<T> f14141a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a<T> aVar) {
                super(1);
                this.f14141a = aVar;
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(k kVar) {
                return k.a(kVar, false, true, false, this.f14141a.h().a("sns_general_poweredBy"), this.f14141a.h().a("sns_general_progress_text"), 5, null);
            }
        }

        public static final class d extends Lambda implements InterfaceC0646l<k, k> {

            /* renamed from: a, reason: collision with root package name */
            public static final d f14142a = new d();

            public d() {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(k kVar) {
                return k.a(kVar, false, false, true, null, null, 27, null);
            }
        }

        public static final class e extends Lambda implements InterfaceC0646l<k, k> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f14143a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(boolean z10) {
                super(1);
                this.f14143a = z10;
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(k kVar) {
                return k.a(kVar, this.f14143a, false, false, null, null, 30, null);
            }
        }

        public static final class f extends Lambda implements InterfaceC0646l<k, k> {

            /* renamed from: a, reason: collision with root package name */
            public static final f f14144a = new f();

            public f() {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(k kVar) {
                return k.a(kVar, false, false, false, null, null, 30, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(a<T> aVar, T9.a<? super z> aVar2) {
            super(2, aVar2);
            this.f14126b = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((z) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new z(this.f14126b, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00e8 A[Catch: Exception -> 0x019c, TryCatch #0 {Exception -> 0x019c, blocks: (B:9:0x0019, B:11:0x00e4, B:13:0x00e8, B:14:0x0109, B:16:0x0110, B:18:0x0127, B:20:0x012d, B:21:0x013a, B:23:0x0140, B:26:0x014f, B:32:0x0168, B:36:0x0154, B:40:0x0161, B:42:0x016c, B:45:0x0189, B:48:0x0173, B:51:0x0185, B:53:0x018d, B:62:0x00d5), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0168 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x013a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00e3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x009e A[RETURN] */
        /* JADX WARN: Type inference failed for: r4v26, types: [T, java.util.Map] */
        /* JADX WARN: Type inference failed for: r4v41, types: [T, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        SharedFlow shareIn$default;
        this.f14043a = aVar;
        this.f14044b = bVar;
        Channel<j> Channel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f14046d = Channel$default;
        Flow buffer$default = FlowKt__ContextKt.buffer$default(FlowKt.flowOn(FlowKt.receiveAsFlow(Channel$default), Dispatchers.getMain()), 0, null, 3, null);
        S0.a b9 = C0552s.b(this);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        shareIn$default = FlowKt__ShareKt.shareIn$default(buffer$default, b9, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 0, 4, null);
        this.f14047e = FlowKt.onCompletion(FlowKt.onSubscription(shareIn$default, new t(this, null)), new u(this, null));
        this.f14048f = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        MutableSharedFlow<T> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f14049g = MutableSharedFlow$default;
        this.f14050h = FlowKt.shareIn(FlowKt.distinctUntilChanged(MutableSharedFlow$default), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        MutableStateFlow<k> MutableStateFlow = StateFlowKt.MutableStateFlow(new k(false, false, false, null, null, 31, null));
        this.i = MutableStateFlow;
        this.f14051j = FlowKt.asStateFlow(MutableStateFlow);
        this.f14053m = new c0(CoroutineExceptionHandler.INSTANCE, this);
        com.sumsub.sns.internal.core.common.b0.b(bVar.b(), C0552s.b(this), new C0155a(this, null));
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new b(this, null), 3, null);
        n();
    }

    public void a(com.sumsub.sns.internal.core.data.model.o oVar) {
    }

    public Object c(T9.a<? super O9.p> aVar) {
        return a(this, aVar);
    }

    public T e() {
        return null;
    }

    public final b.c h() {
        b.c cVar = this.f14052l;
        if (cVar != null) {
            return cVar;
        }
        com.sumsub.sns.core.c.f14016a.a(com.sumsub.sns.internal.log.c.a(this), "Accessing strings before onPrepared()", new IllegalAccessException("Accessing strings before onPrepared(). Use getStrings() or getString() instead."));
        return new b.c(null, null, 3, null);
    }

    public final StateFlow<k> i() {
        return this.f14051j;
    }

    public SharedFlow<T> j() {
        return this.f14050h;
    }

    public final Job n() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), Dispatchers.getMain().plus(this.f14053m), null, new z(this, null), 2, null);
        return launch$default;
    }

    public final boolean o() {
        return this.f14051j.getValue().g();
    }

    @Override // androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "onCleared", null, 4, null);
        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.f14048f, (CancellationException) null, 1, (Object) null);
    }

    public static final void i(a aVar) {
        aVar.b(false);
    }

    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, com.sumsub.sns.internal.log.c.a(this), "Handle error: " + oVar, null, 4, null);
        if (oVar instanceof o.e) {
            m();
        } else if (oVar instanceof o.c) {
            a(new SNSCompletionResult.AbnormalTermination(oVar.b()));
        }
    }

    public final com.sumsub.sns.internal.core.data.model.e d() {
        return this.f14054n;
    }

    public String f() {
        return DocumentType.f15253j;
    }

    public final Flow<j> g() {
        return this.f14047e;
    }

    public final T c() {
        T t3 = (T) P9.s.L(this.f14049g.getReplayCache());
        return t3 == null ? e() : t3;
    }

    public static final class n implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f14094a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14095b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f14096c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f14097d;

        public n(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f14094a = i;
            this.f14095b = charSequence;
            this.f14096c = charSequence2;
            this.f14097d = charSequence3;
        }

        public final int e() {
            return this.f14094a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f14094a == nVar.f14094a && kotlin.jvm.internal.f.b(this.f14095b, nVar.f14095b) && kotlin.jvm.internal.f.b(this.f14096c, nVar.f14096c) && kotlin.jvm.internal.f.b(this.f14097d, nVar.f14097d);
        }

        public final CharSequence f() {
            return this.f14095b;
        }

        public final CharSequence g() {
            return this.f14097d;
        }

        public final CharSequence h() {
            return this.f14096c;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f14094a) * 31;
            CharSequence charSequence = this.f14095b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f14096c;
            int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f14097d;
            return hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPermissionDialog(dialogId=");
            sb2.append(this.f14094a);
            sb2.append(", message=");
            sb2.append((Object) this.f14095b);
            sb2.append(", positiveButton=");
            sb2.append((Object) this.f14096c);
            sb2.append(", negativeButton=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14097d, ')');
        }

        public /* synthetic */ n(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? 0 : i, charSequence, charSequence2, charSequence3);
        }
    }

    public static final void h(a aVar) {
        aVar.b(true);
    }

    public final void b(boolean z10) {
        a(new o(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(T9.a<? super com.sumsub.sns.internal.core.data.source.dynamic.b.c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.core.presentation.base.a.x
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.core.presentation.base.a$x r0 = (com.sumsub.sns.core.presentation.base.a.x) r0
            int r1 = r0.f14124d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14124d = r1
            goto L18
        L13:
            com.sumsub.sns.core.presentation.base.a$x r0 = new com.sumsub.sns.core.presentation.base.a$x
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f14122b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14124d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f14121a
            com.sumsub.sns.core.presentation.base.a r0 = (com.sumsub.sns.core.presentation.base.a) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f14121a = r4
            r0.f14124d = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r5 = r0.h()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.b(T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(a aVar, T9.a aVar2) {
        return O9.p.f3034a;
    }

    public final void a(Throwable th) {
        Integer code;
        if ((th instanceof SNSException.Api) && (code = ((SNSException.Api) th).getCode()) != null && code.intValue() == 401) {
            a(this, th, f(), (Object) null, 4, (Object) null);
        }
    }

    public final void a(com.sumsub.sns.internal.core.data.model.o oVar, String str) {
        Throwable b9;
        if (kotlin.jvm.internal.f.b(this.f14045c, Boolean.FALSE)) {
            return;
        }
        com.sumsub.sns.core.c.f14016a.b(com.sumsub.sns.internal.log.c.a(this), "An error happened", oVar != null ? oVar.b() : null);
        if (((oVar instanceof o.e) || (oVar instanceof o.c)) && (b9 = oVar.b()) != null) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), NonCancellable.INSTANCE, null, new d0(b9, null), 2, null);
        }
        b.c cVar = this.f14052l;
        a(new d(oVar, str, cVar != null ? cVar.a("sns_alert_action_ok") : null));
    }

    public void m() {
    }

    public static /* synthetic */ void a(a aVar, Throwable th, String str, Object obj, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwError");
        }
        if ((i9 & 4) != 0) {
            obj = null;
        }
        aVar.a(th, str, obj);
    }

    public final void a(Throwable th, String str, Object obj) {
        com.sumsub.sns.internal.core.data.model.o a10 = com.sumsub.sns.internal.core.common.o.a(th, obj);
        if (a10 != null) {
            a(a10, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object a(long r6, ca.InterfaceC0646l<? super T9.a<? super T>, ? extends java.lang.Object> r8, T9.a<? super T> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.core.presentation.base.a.b0
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.core.presentation.base.a$b0 r0 = (com.sumsub.sns.core.presentation.base.a.b0) r0
            int r1 = r0.f14068f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14068f = r1
            goto L18
        L13:
            com.sumsub.sns.core.presentation.base.a$b0 r0 = new com.sumsub.sns.core.presentation.base.a$b0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f14066d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14068f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f14065c
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            java.lang.Object r7 = r0.f14064b
            android.os.Handler r7 = (android.os.Handler) r7
            java.lang.Object r8 = r0.f14063a
            com.sumsub.sns.core.presentation.base.a r8 = (com.sumsub.sns.core.presentation.base.a) r8
            kotlin.b.b(r9)
            goto L63
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.b.b(r9)
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r9.<init>(r2)
            com.sumsub.sns.core.presentation.base.b r2 = new com.sumsub.sns.core.presentation.base.b
            r4 = 0
            r2.<init>(r5)
            r9.postDelayed(r2, r6)
            r0.f14063a = r5
            r0.f14064b = r9
            r0.f14065c = r2
            r0.f14068f = r3
            java.lang.Object r6 = r8.invoke(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r8 = r5
            r7 = r9
            r9 = r6
            r6 = r2
        L63:
            r7.removeCallbacks(r6)
            com.sumsub.sns.core.presentation.base.b r6 = new com.sumsub.sns.core.presentation.base.b
            r0 = 1
            r6.<init>(r8)
            r7.post(r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.a(long, ca.l, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(a aVar, long j10, InterfaceC0646l interfaceC0646l, T9.a aVar2, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runWithProgressIndicator");
        }
        if ((i9 & 1) != 0) {
            j10 = 300;
        }
        return aVar.a(j10, interfaceC0646l, aVar2);
    }

    public static /* synthetic */ void a(a aVar, com.sumsub.sns.internal.core.common.q qVar, Object obj, Long l10, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finish");
        }
        if ((i9 & 1) != 0) {
            qVar = q.c.f15162b;
        }
        if ((i9 & 2) != 0) {
            obj = null;
        }
        if ((i9 & 4) != 0) {
            l10 = null;
        }
        aVar.a(qVar, obj, l10);
    }

    public final void a(com.sumsub.sns.internal.core.common.q qVar, Object obj, Long l10) {
        b(false);
        a(new e(qVar, obj, l10));
    }

    public final void a(String str) {
        try {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, com.sumsub.sns.internal.log.c.a(this), "An user has clicked on " + str, null, 4, null);
            if (kotlin.jvm.internal.f.b(str, "support")) {
                a(p.f14099a);
            } else {
                a(new h(str));
            }
        } catch (Throwable th) {
            com.sumsub.sns.core.c.f14016a.a(com.sumsub.sns.internal.log.c.a(this), "onLinkClicked", th);
        }
    }

    public void a(j jVar) {
        a(jVar, true);
    }

    public final void a(j jVar, boolean z10) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new v(z10, this, jVar, null), 3, null);
    }

    public static /* synthetic */ void a(a aVar, boolean z10, InterfaceC0650p interfaceC0650p, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateState");
        }
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        aVar.a(z10, interfaceC0650p);
    }

    public final void a(boolean z10, InterfaceC0650p<? super T, ? super T9.a<? super T>, ? extends Object> interfaceC0650p) {
        if (z10) {
            T c2 = c();
            a((a<T>) c2);
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new e0(this, interfaceC0650p, c2, null), 3, null);
            return;
        }
        this.f14048f.mo110trySendJP2dKIU(interfaceC0650p);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, T9.a<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.core.presentation.base.a.w
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.core.presentation.base.a$w r0 = (com.sumsub.sns.core.presentation.base.a.w) r0
            int r1 = r0.f14120e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14120e = r1
            goto L18
        L13:
            com.sumsub.sns.core.presentation.base.a$w r0 = new com.sumsub.sns.core.presentation.base.a$w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14118c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14120e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f14117b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f14116a
            com.sumsub.sns.core.presentation.base.a r0 = (com.sumsub.sns.core.presentation.base.a) r0
            kotlin.b.b(r6)
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.b.b(r6)
            r0.f14116a = r4
            r0.f14117b = r5
            r0.f14120e = r3
            java.lang.Object r6 = r4.a(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            if (r5 != 0) goto L4c
            r5 = 0
            goto L54
        L4c:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r6 = r0.h()
            java.lang.String r5 = r6.a(r5)
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.a(java.lang.String, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T9.a<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.core.presentation.base.a.r
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.core.presentation.base.a$r r0 = (com.sumsub.sns.core.presentation.base.a.r) r0
            int r1 = r0.f14103c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14103c = r1
            goto L18
        L13:
            com.sumsub.sns.core.presentation.base.a$r r0 = new com.sumsub.sns.core.presentation.base.a$r
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f14101a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14103c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            kotlin.b.b(r7)
            com.sumsub.sns.core.presentation.base.a$s r7 = new com.sumsub.sns.core.presentation.base.a$s
            r2 = 0
            r7.<init>(r6, r2)
            r0.f14103c = r3
            r4 = 25000(0x61a8, double:1.23516E-319)
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r4, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            if (r7 == 0) goto L46
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.a.a(T9.a):java.lang.Object");
    }

    public final void a(SNSCompletionResult sNSCompletionResult) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, com.sumsub.sns.internal.log.c.a(this), "Completion the SDK with result - " + sNSCompletionResult, null, 4, null);
        a(this, new q.d(sNSCompletionResult), (Object) null, (Long) null, 6, (Object) null);
    }

    public final void a(T t3) {
        if (t3 == null && com.sumsub.sns.internal.core.common.e0.f15081a.isDebug()) {
            throw new IllegalStateException(("Before updating state provide default state for " + com.sumsub.sns.internal.log.c.a(this) + " by overriding getDefaultState()").toString());
        }
    }
}
