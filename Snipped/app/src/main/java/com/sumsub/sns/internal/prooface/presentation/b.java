package com.sumsub.sns.internal.prooface.presentation;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.SNSActionResult;
import com.sumsub.sns.core.data.listener.SNSActionResultHandler;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSLivenessReason;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.AnswerType;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.e;
import com.sumsub.sns.internal.core.data.model.u;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.domain.m;
import com.sumsub.sns.internal.fingerprint.Fingerprinter;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.prooface.network.Liveness3dFaceRepository;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.tls.CipherSuite;
import org.json.JSONObject;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.base.a<i> {

    /* renamed from: q, reason: collision with root package name */
    public static final d f18991q = new d(null);

    /* renamed from: w, reason: collision with root package name */
    public static final SimpleDateFormat f18992w = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    /* renamed from: B, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.m f18993B;

    /* renamed from: C, reason: collision with root package name */
    public final DocumentType f18994C;

    /* renamed from: D, reason: collision with root package name */
    public final AbstractC1244a f18995D;

    /* renamed from: E, reason: collision with root package name */
    public final com.sumsub.sns.prooface.network.a f18996E;

    /* renamed from: F, reason: collision with root package name */
    public final Liveness3dFaceRepository f18997F;

    /* renamed from: G, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f18998G;

    /* renamed from: H, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f18999H;

    /* renamed from: I, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f19000I;

    /* renamed from: J, reason: collision with root package name */
    public final Fingerprinter f19001J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f19002K;

    /* renamed from: L, reason: collision with root package name */
    public Timer f19003L;

    /* renamed from: M, reason: collision with root package name */
    public Timer f19004M;

    /* renamed from: N, reason: collision with root package name */
    public final String f19005N;

    /* renamed from: O, reason: collision with root package name */
    public String f19006O;

    /* renamed from: P, reason: collision with root package name */
    public final MutableSharedFlow<Triple<Bitmap, Size, String>> f19007P;

    /* renamed from: Q, reason: collision with root package name */
    public final ExecutorCoroutineDispatcher f19008Q;
    public com.sumsub.sns.prooface.data.a R;
    public boolean S;
    public Job T;
    public ImageProxy U;
    public boolean V;
    public final p W;
    public int X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public long f19009Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f19010a0;

    /* renamed from: b0, reason: collision with root package name */
    public String f19011b0;

    /* renamed from: c0, reason: collision with root package name */
    public Bitmap f19012c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f19013d0;

    /* renamed from: e0, reason: collision with root package name */
    public final MutableStateFlow<f> f19014e0;

    /* renamed from: f0, reason: collision with root package name */
    public final StateFlow<f> f19015f0;

    /* renamed from: g0, reason: collision with root package name */
    public final MutableStateFlow<g> f19016g0;

    /* renamed from: h0, reason: collision with root package name */
    public final StateFlow<g> f19017h0;

    /* renamed from: i0, reason: collision with root package name */
    public Job f19018i0;

    /* renamed from: j0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.common.e f19019j0;

    /* renamed from: k0, reason: collision with root package name */
    public final O9.f f19020k0;

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$1", f = "SNSLiveness3dFaceViewModel.kt", l = {279}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19021a;

        /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$a$a, reason: collision with other inner class name */
        public static final class C0349a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f19023a;

            public C0349a(b bVar) {
                this.f19023a = bVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.sumsub.sns.prooface.data.h hVar, T9.a<? super O9.p> aVar) {
                this.f19023a.f18997F.a(hVar);
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$1$invokeSuspend$$inlined$transform$1", f = "SNSLiveness3dFaceViewModel.kt", l = {40}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$a$b, reason: collision with other inner class name */
        public static final class C0350b extends SuspendLambda implements InterfaceC0650p<FlowCollector<? super com.sumsub.sns.prooface.data.h>, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19024a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f19025b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Flow f19026c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f19027d;

            /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$a$b$a, reason: collision with other inner class name */
            public static final class C0351a<T> implements FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector<com.sumsub.sns.prooface.data.h> f19028a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f19029b;

                @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$1$invokeSuspend$$inlined$transform$1$1", f = "SNSLiveness3dFaceViewModel.kt", l = {BERTags.FLAGS, 228}, m = "emit")
                /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$a$b$a$a, reason: collision with other inner class name */
                public static final class C0352a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f19030a;

                    /* renamed from: b, reason: collision with root package name */
                    public int f19031b;

                    /* renamed from: d, reason: collision with root package name */
                    public Object f19033d;

                    /* renamed from: e, reason: collision with root package name */
                    public Object f19034e;

                    public C0352a(T9.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f19030a = obj;
                        this.f19031b |= Integer.MIN_VALUE;
                        return C0351a.this.emit(null, this);
                    }
                }

                public C0351a(FlowCollector flowCollector, b bVar) {
                    this.f19029b = bVar;
                    this.f19028a = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r9, T9.a<? super O9.p> r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.sumsub.sns.internal.prooface.presentation.b.a.C0350b.C0351a.C0352a
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.sumsub.sns.internal.prooface.presentation.b$a$b$a$a r0 = (com.sumsub.sns.internal.prooface.presentation.b.a.C0350b.C0351a.C0352a) r0
                        int r1 = r0.f19031b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f19031b = r1
                        goto L18
                    L13:
                        com.sumsub.sns.internal.prooface.presentation.b$a$b$a$a r0 = new com.sumsub.sns.internal.prooface.presentation.b$a$b$a$a
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.f19030a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                        int r2 = r0.f19031b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3e
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.b.b(r10)
                        goto L84
                    L2a:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L32:
                        java.lang.Object r9 = r0.f19034e
                        kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                        java.lang.Object r2 = r0.f19033d
                        com.sumsub.sns.internal.prooface.presentation.b$a$b$a r2 = (com.sumsub.sns.internal.prooface.presentation.b.a.C0350b.C0351a) r2
                        kotlin.b.b(r10)
                        goto L6c
                    L3e:
                        kotlin.b.b(r10)
                        kotlinx.coroutines.flow.FlowCollector<com.sumsub.sns.prooface.data.h> r10 = r8.f19028a
                        kotlin.Triple r9 = (kotlin.Triple) r9
                        com.sumsub.sns.internal.prooface.presentation.b r2 = r8.f19029b
                        int r2 = com.sumsub.sns.internal.prooface.presentation.b.i(r2)
                        if (r2 == 0) goto L84
                        com.sumsub.sns.internal.prooface.presentation.b r2 = r8.f19029b
                        A r5 = r9.f23099a
                        android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                        B r6 = r9.f23100b
                        android.util.Size r6 = (android.util.Size) r6
                        C r9 = r9.f23101c
                        java.lang.String r9 = (java.lang.String) r9
                        r0.f19033d = r8
                        r0.f19034e = r10
                        r0.f19031b = r4
                        java.lang.Object r9 = com.sumsub.sns.internal.prooface.presentation.b.a(r2, r5, r6, r9, r0)
                        if (r9 != r1) goto L68
                        return r1
                    L68:
                        r2 = r8
                        r7 = r10
                        r10 = r9
                        r9 = r7
                    L6c:
                        com.sumsub.sns.prooface.data.h r10 = (com.sumsub.sns.prooface.data.h) r10
                        com.sumsub.sns.internal.prooface.presentation.b r2 = r2.f19029b
                        int r2 = com.sumsub.sns.internal.prooface.presentation.b.i(r2)
                        if (r2 == 0) goto L84
                        r2 = 0
                        r0.f19033d = r2
                        r0.f19034e = r2
                        r0.f19031b = r3
                        java.lang.Object r9 = r9.emit(r10, r0)
                        if (r9 != r1) goto L84
                        return r1
                    L84:
                        O9.p r9 = O9.p.f3034a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.a.C0350b.C0351a.emit(java.lang.Object, T9.a):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0350b(Flow flow, T9.a aVar, b bVar) {
                super(2, aVar);
                this.f19026c = flow;
                this.f19027d = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FlowCollector<? super com.sumsub.sns.prooface.data.h> flowCollector, T9.a<? super O9.p> aVar) {
                return ((C0350b) create(flowCollector, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                C0350b c0350b = new C0350b(this.f19026c, aVar, this.f19027d);
                c0350b.f19025b = obj;
                return c0350b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19024a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f19025b;
                    Flow flow = this.f19026c;
                    C0351a c0351a = new C0351a(flowCollector, this.f19027d);
                    this.f19024a = 1;
                    if (flow.collect(c0351a, this) == coroutineSingletons) {
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

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new a(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19021a;
            if (i == 0) {
                kotlin.b.b(obj);
                Flow flow = FlowKt.flow(new C0350b(b.this.f19007P, null, b.this));
                C0349a c0349a = new C0349a(b.this);
                this.f19021a = 1;
                if (flow.collect(c0349a, this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$startCalibration$1", f = "SNSLiveness3dFaceViewModel.kt", l = {542}, m = "invokeSuspend")
    public static final class a0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19035a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f19037c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(float f10, T9.a<? super a0> aVar) {
            super(2, aVar);
            this.f19037c = f10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new a0(this.f19037c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19035a;
            if (i == 0) {
                kotlin.b.b(obj);
                b.this.f19016g0.setValue(new g.c(this.f19037c));
                this.f19035a = 1;
                if (DelayKt.delay(250L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            b.this.b(false);
            com.sumsub.sns.prooface.a.a("Prooface", "Calibration finished", null, 4, null);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$2", f = "SNSLiveness3dFaceViewModel.kt", l = {287}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$b, reason: collision with other inner class name */
    public static final class C0353b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19038a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19039b;

        /* renamed from: c, reason: collision with root package name */
        public int f19040c;

        public C0353b(T9.a<? super C0353b> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((C0353b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new C0353b(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            b bVar2;
            b bVar3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19040c;
            boolean z10 = false;
            if (i == 0) {
                kotlin.b.b(obj);
                bVar = b.this;
                try {
                    com.sumsub.sns.internal.core.data.source.dynamic.b bVar4 = bVar.f19000I;
                    this.f19038a = bVar;
                    this.f19039b = bVar;
                    this.f19040c = 1;
                    Object a10 = com.sumsub.sns.internal.core.data.source.dynamic.b.a(bVar4, false, this, 1, null);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar2 = bVar;
                    obj = a10;
                    bVar3 = bVar2;
                } catch (Exception unused) {
                    bVar2 = bVar;
                    bVar2.f19002K = z10;
                    return O9.p.f3034a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (b) this.f19039b;
                bVar3 = (b) this.f19038a;
                try {
                    kotlin.b.b(obj);
                } catch (Exception unused2) {
                    bVar = bVar3;
                    bVar2 = bVar;
                    bVar2.f19002K = z10;
                    return O9.p.f3034a;
                }
            }
            z10 = com.sumsub.sns.internal.core.data.model.f.m((com.sumsub.sns.internal.core.data.model.e) obj);
            bVar2.f19002K = z10;
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$startCalibration$2", f = "SNSLiveness3dFaceViewModel.kt", l = {550, 552, 554, 556, 558}, m = "invokeSuspend")
    public static final class b0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19042a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f19044c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f19045d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f19046e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(float f10, float f11, float f12, T9.a<? super b0> aVar) {
            super(2, aVar);
            this.f19044c = f10;
            this.f19045d = f11;
            this.f19046e = f12;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new b0(this.f19044c, this.f19045d, this.f19046e, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r14.f19042a
                r2 = 100
                java.lang.String r4 = "Prooface"
                r5 = 5
                r6 = 3
                r7 = 2
                r8 = 250(0xfa, double:1.235E-321)
                r10 = 0
                r11 = 4
                r12 = 1
                if (r1 == 0) goto L39
                if (r1 == r12) goto L35
                if (r1 == r7) goto L31
                if (r1 == r6) goto L2d
                if (r1 == r11) goto L29
                if (r1 != r5) goto L21
                kotlin.b.b(r15)
                goto Lb8
            L21:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L29:
                kotlin.b.b(r15)
                goto L8e
            L2d:
                kotlin.b.b(r15)
                goto L89
            L31:
                kotlin.b.b(r15)
                goto L5f
            L35:
                kotlin.b.b(r15)
                goto L5a
            L39:
                kotlin.b.b(r15)
                java.lang.String r15 = "Calibration started"
                com.sumsub.sns.prooface.a.a(r4, r15, r10, r11, r10)
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                kotlinx.coroutines.flow.MutableStateFlow r15 = com.sumsub.sns.internal.prooface.presentation.b.l(r15)
                com.sumsub.sns.internal.prooface.presentation.b$g$a r1 = new com.sumsub.sns.internal.prooface.presentation.b$g$a
                float r13 = r14.f19044c
                r1.<init>(r13)
                r15.setValue(r1)
                r14.f19042a = r12
                java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r8, r14)
                if (r15 != r0) goto L5a
                return r0
            L5a:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                com.sumsub.sns.internal.prooface.presentation.b.b(r15, r12)
            L5f:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                boolean r15 = com.sumsub.sns.internal.prooface.presentation.b.j(r15)
                if (r15 == 0) goto L70
                r14.f19042a = r7
                java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r2, r14)
                if (r15 != r0) goto L5f
                return r0
            L70:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                kotlinx.coroutines.flow.MutableStateFlow r15 = com.sumsub.sns.internal.prooface.presentation.b.l(r15)
                com.sumsub.sns.internal.prooface.presentation.b$g$a r1 = new com.sumsub.sns.internal.prooface.presentation.b$g$a
                float r7 = r14.f19045d
                r1.<init>(r7)
                r15.setValue(r1)
                r14.f19042a = r6
                java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r8, r14)
                if (r15 != r0) goto L89
                return r0
            L89:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                com.sumsub.sns.internal.prooface.presentation.b.b(r15, r12)
            L8e:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                boolean r15 = com.sumsub.sns.internal.prooface.presentation.b.j(r15)
                if (r15 == 0) goto L9f
                r14.f19042a = r11
                java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r2, r14)
                if (r15 != r0) goto L8e
                return r0
            L9f:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                kotlinx.coroutines.flow.MutableStateFlow r15 = com.sumsub.sns.internal.prooface.presentation.b.l(r15)
                com.sumsub.sns.internal.prooface.presentation.b$g$c r1 = new com.sumsub.sns.internal.prooface.presentation.b$g$c
                float r2 = r14.f19046e
                r1.<init>(r2)
                r15.setValue(r1)
                r14.f19042a = r5
                java.lang.Object r15 = kotlinx.coroutines.DelayKt.delay(r8, r14)
                if (r15 != r0) goto Lb8
                return r0
            Lb8:
                com.sumsub.sns.internal.prooface.presentation.b r15 = com.sumsub.sns.internal.prooface.presentation.b.this
                r0 = 0
                r15.b(r0)
                java.lang.String r15 = "Calibration finished"
                com.sumsub.sns.prooface.a.a(r4, r15, r10, r11, r10)
                O9.p r15 = O9.p.f3034a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.b0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$3", f = "SNSLiveness3dFaceViewModel.kt", l = {295}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19047a;

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$3$1", f = "SNSLiveness3dFaceViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19049a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f19050b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f19051c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19051c = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(b.a aVar, T9.a<? super O9.p> aVar2) {
                return ((a) create(aVar, aVar2)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f19051c, aVar);
                aVar2.f19050b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.t> j10;
                com.sumsub.sns.internal.core.data.model.t d10;
                List<Document> d11;
                int i;
                int i9;
                com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.e> i10;
                com.sumsub.sns.internal.core.data.model.e d12;
                e.a r8;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f19049a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                b.a aVar = (b.a) this.f19050b;
                if (((aVar == null || (i10 = aVar.i()) == null || (d12 = i10.d()) == null || (r8 = d12.r()) == null) ? null : r8.c()) != null) {
                    return O9.p.f3034a;
                }
                if (aVar == null || (j10 = aVar.j()) == null || (d10 = j10.d()) == null || (d11 = d10.d()) == null) {
                    return O9.p.f3034a;
                }
                com.sumsub.sns.internal.core.data.model.g d13 = aVar.g().d();
                if (d13 == null) {
                    return O9.p.f3034a;
                }
                if (d11.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<T> it = d11.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((Document) it.next()).getType().c().startsWith(DocumentType.f15247c) && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                List X = P9.s.X(d11, new com.sumsub.sns.internal.core.data.model.m(d13));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : X) {
                    if (((Document) obj2).getType().c().startsWith(DocumentType.f15247c)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    i9 = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i9 = 0;
                    while (it2.hasNext()) {
                        Document document = (Document) it2.next();
                        if (document.isSubmitted() && (document.isApproved() || document.isReviewing())) {
                            i9++;
                            if (i9 < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    }
                }
                if (i9 == i) {
                    com.sumsub.sns.prooface.a.a("Prooface", "Selfie already submitted, aborting liveness check", null, 4, null);
                    com.sumsub.sns.core.presentation.base.a.a(this.f19051c, new q.b(false, 1, null), (Object) null, (Long) null, 6, (Object) null);
                }
                return O9.p.f3034a;
            }
        }

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new c(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19047a;
            if (i == 0) {
                kotlin.b.b(obj);
                StateFlow<b.a> b9 = b.this.f19000I.b();
                a aVar = new a(b.this, null);
                this.f19047a = 1;
                if (FlowKt.collectLatest(b9, aVar, this) == coroutineSingletons) {
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

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public d() {
        }
    }

    public static final class e implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.data.model.o f19052a;

        public e(com.sumsub.sns.internal.core.data.model.o oVar) {
            this.f19052a = oVar;
        }

        public final com.sumsub.sns.internal.core.data.model.o b() {
            return this.f19052a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.f.b(this.f19052a, ((e) obj).f19052a);
        }

        public int hashCode() {
            return this.f19052a.hashCode();
        }

        public String toString() {
            return "HandleErrorEvent(error=" + this.f19052a + ')';
        }
    }

    public static abstract class f implements h {

        public static final class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public final RectF f19053a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f19054b;

            public a(RectF rectF, CharSequence charSequence) {
                super(null);
                this.f19053a = rectF;
                this.f19054b = charSequence;
            }

            @Override // com.sumsub.sns.internal.prooface.presentation.b.h
            public CharSequence a() {
                return this.f19054b;
            }

            public final RectF d() {
                return this.f19053a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f19053a, aVar.f19053a) && kotlin.jvm.internal.f.b(a(), aVar.a());
            }

            public int hashCode() {
                return (this.f19053a.hashCode() * 31) + (a() == null ? 0 : a().hashCode());
            }

            public String toString() {
                return "FaceRecognized(faceRectangle=" + this.f19053a + ", hint=" + ((Object) a()) + ')';
            }
        }

        /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$f$b, reason: collision with other inner class name */
        public static final class C0354b extends f {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f19055a;

            public C0354b(CharSequence charSequence) {
                super(null);
                this.f19055a = charSequence;
            }

            @Override // com.sumsub.sns.internal.prooface.presentation.b.h
            public CharSequence a() {
                return this.f19055a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0354b) && kotlin.jvm.internal.f.b(a(), ((C0354b) obj).a());
            }

            public int hashCode() {
                if (a() == null) {
                    return 0;
                }
                return a().hashCode();
            }

            public String toString() {
                return "NoFace(hint=" + ((Object) a()) + ')';
            }
        }

        public static final class c extends f {

            /* renamed from: a, reason: collision with root package name */
            public final RectF f19056a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f19057b;

            public c(RectF rectF, CharSequence charSequence) {
                super(null);
                this.f19056a = rectF;
                this.f19057b = charSequence;
            }

            @Override // com.sumsub.sns.internal.prooface.presentation.b.h
            public CharSequence a() {
                return this.f19057b;
            }

            public final RectF d() {
                return this.f19056a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return kotlin.jvm.internal.f.b(this.f19056a, cVar.f19056a) && kotlin.jvm.internal.f.b(a(), cVar.a());
            }

            public int hashCode() {
                return (this.f19056a.hashCode() * 31) + (a() == null ? 0 : a().hashCode());
            }

            public String toString() {
                return "NotInCapturingBox(faceRectangle=" + this.f19056a + ", hint=" + ((Object) a()) + ')';
            }
        }

        public static final class d extends f {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f19058a;

            public d(CharSequence charSequence) {
                super(null);
                this.f19058a = charSequence;
            }

            @Override // com.sumsub.sns.internal.prooface.presentation.b.h
            public CharSequence a() {
                return this.f19058a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && kotlin.jvm.internal.f.b(a(), ((d) obj).a());
            }

            public int hashCode() {
                if (a() == null) {
                    return 0;
                }
                return a().hashCode();
            }

            public String toString() {
                return "TooManyFaces(hint=" + ((Object) a()) + ')';
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public f() {
        }
    }

    public static abstract class g {

        public static final class a extends g {

            /* renamed from: a, reason: collision with root package name */
            public final float f19059a;

            public a(float f10) {
                super(null);
                this.f19059a = f10;
            }

            public final float b() {
                return this.f19059a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.f.b(Float.valueOf(this.f19059a), Float.valueOf(((a) obj).f19059a));
            }

            public int hashCode() {
                return Float.hashCode(this.f19059a);
            }

            public String toString() {
                return "Calibration(value=" + this.f19059a + ')';
            }
        }

        /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$g$b, reason: collision with other inner class name */
        public static final class C0355b extends g {

            /* renamed from: a, reason: collision with root package name */
            public final Bitmap f19060a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f19061b;

            public C0355b(Bitmap bitmap, CharSequence charSequence) {
                super(null);
                this.f19060a = bitmap;
                this.f19061b = charSequence;
            }

            public final Bitmap c() {
                return this.f19060a;
            }

            public final CharSequence d() {
                return this.f19061b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0355b)) {
                    return false;
                }
                C0355b c0355b = (C0355b) obj;
                return kotlin.jvm.internal.f.b(this.f19060a, c0355b.f19060a) && kotlin.jvm.internal.f.b(this.f19061b, c0355b.f19061b);
            }

            public int hashCode() {
                Bitmap bitmap = this.f19060a;
                int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
                CharSequence charSequence = this.f19061b;
                return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Completed(blurredLastImage=");
                sb2.append(this.f19060a);
                sb2.append(", hint=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.f19061b, ')');
            }
        }

        public static final class c extends g {

            /* renamed from: a, reason: collision with root package name */
            public final float f19062a;

            public c(float f10) {
                super(null);
                this.f19062a = f10;
            }

            public final float b() {
                return this.f19062a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.f.b(Float.valueOf(this.f19062a), Float.valueOf(((c) obj).f19062a));
            }

            public int hashCode() {
                return Float.hashCode(this.f19062a);
            }

            public String toString() {
                return "EndCalibration(value=" + this.f19062a + ')';
            }
        }

        public static final class d extends g {

            /* renamed from: a, reason: collision with root package name */
            public final CharSequence f19063a;

            public d(CharSequence charSequence) {
                super(null);
                this.f19063a = charSequence;
            }

            public final CharSequence b() {
                return this.f19063a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f19063a, ((d) obj).f19063a);
            }

            public int hashCode() {
                CharSequence charSequence = this.f19063a;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            public String toString() {
                return com.google.android.gms.measurement.internal.a.j(new StringBuilder("LowConnection(hint="), this.f19063a, ')');
            }
        }

        public static final class e extends g {

            /* renamed from: a, reason: collision with root package name */
            public final float f19064a;

            public e(float f10) {
                super(null);
                this.f19064a = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && kotlin.jvm.internal.f.b(Float.valueOf(this.f19064a), Float.valueOf(((e) obj).f19064a));
            }

            public int hashCode() {
                return Float.hashCode(this.f19064a);
            }

            public String toString() {
                return "Progress(progress=" + this.f19064a + ')';
            }
        }

        public static final class f extends g {

            /* renamed from: a, reason: collision with root package name */
            public final com.sumsub.sns.prooface.data.j f19065a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f19066b;

            /* renamed from: c, reason: collision with root package name */
            public final CharSequence f19067c;

            /* renamed from: d, reason: collision with root package name */
            public final CharSequence f19068d;

            public f(com.sumsub.sns.prooface.data.j jVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
                super(null);
                this.f19065a = jVar;
                this.f19066b = charSequence;
                this.f19067c = charSequence2;
                this.f19068d = charSequence3;
            }

            public final CharSequence e() {
                return this.f19066b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return kotlin.jvm.internal.f.b(this.f19065a, fVar.f19065a) && kotlin.jvm.internal.f.b(this.f19066b, fVar.f19066b) && kotlin.jvm.internal.f.b(this.f19067c, fVar.f19067c) && kotlin.jvm.internal.f.b(this.f19068d, fVar.f19068d);
            }

            public final com.sumsub.sns.prooface.data.j f() {
                return this.f19065a;
            }

            public final CharSequence g() {
                return this.f19068d;
            }

            public final CharSequence h() {
                return this.f19067c;
            }

            public int hashCode() {
                com.sumsub.sns.prooface.data.j jVar = this.f19065a;
                int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
                CharSequence charSequence = this.f19066b;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.f19067c;
                int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.f19068d;
                return hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SessionResult(session=");
                sb2.append(this.f19065a);
                sb2.append(", retryText=");
                sb2.append((Object) this.f19066b);
                sb2.append(", title=");
                sb2.append((Object) this.f19067c);
                sb2.append(", text=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.f19068d, ')');
            }
        }

        /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$g$g, reason: collision with other inner class name */
        public static final class C0356g extends g {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f19069a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f19070b;

            public C0356g(boolean z10, CharSequence charSequence) {
                super(null);
                this.f19069a = z10;
                this.f19070b = charSequence;
            }

            public final boolean c() {
                return this.f19069a;
            }

            public final CharSequence d() {
                return this.f19070b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0356g)) {
                    return false;
                }
                C0356g c0356g = (C0356g) obj;
                return this.f19069a == c0356g.f19069a && kotlin.jvm.internal.f.b(this.f19070b, c0356g.f19070b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z10 = this.f19069a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                int i = r02 * 31;
                CharSequence charSequence = this.f19070b;
                return i + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Started(calibrationEnabled=");
                sb2.append(this.f19069a);
                sb2.append(", hint=");
                return com.google.android.gms.measurement.internal.a.j(sb2, this.f19070b, ')');
            }
        }

        public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public g() {
        }
    }

    public interface h {
        CharSequence a();
    }

    public static final class i implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final j f19071a;

        public i() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final i a(j jVar) {
            return new i(jVar);
        }

        public final j b() {
            return this.f19071a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && kotlin.jvm.internal.f.b(this.f19071a, ((i) obj).f19071a);
        }

        public int hashCode() {
            j jVar = this.f19071a;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public String toString() {
            return "ViewState(warningDialog=" + this.f19071a + ')';
        }

        public i(j jVar) {
            this.f19071a = jVar;
        }

        public /* synthetic */ i(j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jVar);
        }
    }

    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f19072a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f19073b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f19074c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f19075d;

        public j(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            this.f19072a = charSequence;
            this.f19073b = charSequence2;
            this.f19074c = charSequence3;
            this.f19075d = charSequence4;
        }

        public final CharSequence e() {
            return this.f19074c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.f.b(this.f19072a, jVar.f19072a) && kotlin.jvm.internal.f.b(this.f19073b, jVar.f19073b) && kotlin.jvm.internal.f.b(this.f19074c, jVar.f19074c) && kotlin.jvm.internal.f.b(this.f19075d, jVar.f19075d);
        }

        public final CharSequence f() {
            return this.f19075d;
        }

        public final CharSequence g() {
            return this.f19073b;
        }

        public final CharSequence h() {
            return this.f19072a;
        }

        public int hashCode() {
            CharSequence charSequence = this.f19072a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f19073b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f19074c;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f19075d;
            return hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("WriteSettingsDialog(message=");
            sb2.append((Object) this.f19072a);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.f19073b);
            sb2.append(", buttonNegative=");
            sb2.append((Object) this.f19074c);
            sb2.append(", buttonNeutral=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f19075d, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel", f = "SNSLiveness3dFaceViewModel.kt", l = {677}, m = "encodeSegment")
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19076a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19077b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19078c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19079d;

        /* renamed from: e, reason: collision with root package name */
        public Object f19080e;

        /* renamed from: f, reason: collision with root package name */
        public Object f19081f;

        /* renamed from: g, reason: collision with root package name */
        public Object f19082g;

        /* renamed from: h, reason: collision with root package name */
        public Object f19083h;
        public Object i;

        /* renamed from: j, reason: collision with root package name */
        public Object f19084j;

        /* renamed from: k, reason: collision with root package name */
        public Object f19085k;

        /* renamed from: l, reason: collision with root package name */
        public Object f19086l;

        /* renamed from: m, reason: collision with root package name */
        public Object f19087m;

        /* renamed from: n, reason: collision with root package name */
        public Object f19088n;

        /* renamed from: o, reason: collision with root package name */
        public Object f19089o;

        /* renamed from: p, reason: collision with root package name */
        public int f19090p;

        /* renamed from: q, reason: collision with root package name */
        public long f19091q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f19092r;

        /* renamed from: t, reason: collision with root package name */
        public int f19094t;

        public k(T9.a<? super k> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19092r = obj;
            this.f19094t |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$enqueueSegment$1", f = "SNSLiveness3dFaceViewModel.kt", l = {643}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19095a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f19097c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Size f19098d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f19099e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Bitmap bitmap, Size size, String str, T9.a<? super l> aVar) {
            super(2, aVar);
            this.f19097c = bitmap;
            this.f19098d = size;
            this.f19099e = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new l(this.f19097c, this.f19098d, this.f19099e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19095a;
            if (i == 0) {
                kotlin.b.b(obj);
                MutableSharedFlow mutableSharedFlow = b.this.f19007P;
                Triple triple = new Triple(this.f19097c, this.f19098d, this.f19099e);
                this.f19095a = 1;
                if (mutableSharedFlow.emit(triple, this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$finishWithReason$1", f = "SNSLiveness3dFaceViewModel.kt", l = {832}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19100a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19102c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SNSLivenessReason f19103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, SNSLivenessReason sNSLivenessReason, T9.a<? super m> aVar) {
            super(2, aVar);
            this.f19102c = str;
            this.f19103d = sNSLivenessReason;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((m) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new m(this.f19102c, this.f19103d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object cVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19100a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.b bVar = b.this.f19000I;
                this.f19100a = 1;
                obj = com.sumsub.sns.internal.core.data.source.dynamic.b.d(bVar, false, this, 1, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            com.sumsub.sns.internal.core.data.model.e eVar = (com.sumsub.sns.internal.core.data.model.e) ((com.sumsub.sns.internal.core.data.source.dynamic.e) obj).d();
            if (eVar == null) {
                return O9.p.f3034a;
            }
            e.a r8 = eVar.r();
            FlowActionType d10 = r8 != null ? r8.d() : null;
            FlowActionType.FaceEnrollment faceEnrollment = FlowActionType.FaceEnrollment.INSTANCE;
            if (kotlin.jvm.internal.f.b(d10, faceEnrollment)) {
                b.this.f18999H.a(new SNSSDKState.ActionCompleted(r8.c(), faceEnrollment, this.f19102c, P9.z.o(new Pair("reason", this.f19103d))));
                cVar = new u.b(r8.c(), this.f19103d, this.f19102c);
            } else {
                cVar = new u.c(this.f19103d, b.this.u());
            }
            Object obj2 = cVar;
            com.sumsub.sns.prooface.a.a("Prooface", "finish: " + obj2, null, 4, null);
            com.sumsub.sns.core.presentation.base.a.a(b.this, (com.sumsub.sns.internal.core.common.q) null, obj2, (Long) null, 5, (Object) null);
            return O9.p.f3034a;
        }
    }

    public static final class n extends Lambda implements InterfaceC0646l<Map<String, ? extends String>, O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T9.a<Map<String, String>> f19104a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(T9.a<? super Map<String, String>> aVar) {
            super(1);
            this.f19104a = aVar;
        }

        public final void a(Map<String, String> map) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "Fingerprinter", "Fingerprint size: " + map.size(), null, 4, null);
            this.f19104a.resumeWith(map);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(Map<String, ? extends String> map) {
            a(map);
            return O9.p.f3034a;
        }
    }

    public static final class o extends Lambda implements InterfaceC0635a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f19105a = new o();

        public o() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Boolean f10 = new com.sumsub.sns.internal.core.common.f().f();
            return Boolean.valueOf(f10 != null ? f10.booleanValue() : false);
        }
    }

    public static final class p implements Liveness3dFaceRepository.a {

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$livenessCallback$1$onResult$2", f = "SNSLiveness3dFaceViewModel.kt", l = {154}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f19107a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f19108b;

            /* renamed from: c, reason: collision with root package name */
            public int f19109c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f19110d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f19111e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, boolean z10, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19110d = bVar;
                this.f19111e = z10;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19110d, this.f19111e, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableStateFlow mutableStateFlow;
                boolean z10;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19109c;
                if (i == 0) {
                    kotlin.b.b(obj);
                    mutableStateFlow = this.f19110d.f19016g0;
                    boolean z11 = this.f19111e;
                    b bVar = this.f19110d;
                    this.f19107a = mutableStateFlow;
                    this.f19108b = z11;
                    this.f19109c = 1;
                    Object a10 = bVar.a("sns_facescan_hint_facePosition", this);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z10 = z11;
                    obj = a10;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = this.f19108b;
                    mutableStateFlow = (MutableStateFlow) this.f19107a;
                    kotlin.b.b(obj);
                }
                mutableStateFlow.setValue(new g.C0356g(z10, (CharSequence) obj));
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$livenessCallback$1$onResult$3", f = "SNSLiveness3dFaceViewModel.kt", l = {167}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.prooface.presentation.b$p$b, reason: collision with other inner class name */
        public static final class C0357b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f19112a;

            /* renamed from: b, reason: collision with root package name */
            public int f19113b;

            /* renamed from: c, reason: collision with root package name */
            public int f19114c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f19115d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0357b(b bVar, T9.a<? super C0357b> aVar) {
                super(2, aVar);
                this.f19115d = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((C0357b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new C0357b(this.f19115d, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableStateFlow mutableStateFlow;
                int i;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i9 = this.f19114c;
                if (i9 == 0) {
                    kotlin.b.b(obj);
                    mutableStateFlow = this.f19115d.f19016g0;
                    b bVar = this.f19115d;
                    this.f19112a = mutableStateFlow;
                    this.f19113b = 0;
                    this.f19114c = 1;
                    obj = bVar.a("sns_facescan_hint_facePosition", this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i = 0;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.f19113b;
                    mutableStateFlow = (MutableStateFlow) this.f19112a;
                    kotlin.b.b(obj);
                }
                mutableStateFlow.setValue(new g.C0356g(i != 0, (CharSequence) obj));
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$livenessCallback$1$onResult$4", f = "SNSLiveness3dFaceViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f19116a;

            /* renamed from: b, reason: collision with root package name */
            public Object f19117b;

            /* renamed from: c, reason: collision with root package name */
            public int f19118c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f19119d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, T9.a<? super c> aVar) {
                super(2, aVar);
                this.f19119d = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((c) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new c(this.f19119d, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableStateFlow mutableStateFlow;
                Bitmap bitmap;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19118c;
                if (i == 0) {
                    kotlin.b.b(obj);
                    mutableStateFlow = this.f19119d.f19016g0;
                    Bitmap bitmap2 = this.f19119d.f19012c0;
                    b bVar = this.f19119d;
                    this.f19116a = mutableStateFlow;
                    this.f19117b = bitmap2;
                    this.f19118c = 1;
                    Object a10 = bVar.a("sns_facescan_hint_processing", this);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bitmap = bitmap2;
                    obj = a10;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bitmap = (Bitmap) this.f19117b;
                    mutableStateFlow = (MutableStateFlow) this.f19116a;
                    kotlin.b.b(obj);
                }
                mutableStateFlow.setValue(new g.C0355b(bitmap, (CharSequence) obj));
                return O9.p.f3034a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$livenessCallback$1$onResult$5", f = "SNSLiveness3dFaceViewModel.kt", l = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 205, 206, 212}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f19120a;

            /* renamed from: b, reason: collision with root package name */
            public Object f19121b;

            /* renamed from: c, reason: collision with root package name */
            public Object f19122c;

            /* renamed from: d, reason: collision with root package name */
            public Object f19123d;

            /* renamed from: e, reason: collision with root package name */
            public int f19124e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f19125f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Liveness3dFaceRepository.LivenessRepositoryResult f19126g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(b bVar, Liveness3dFaceRepository.LivenessRepositoryResult livenessRepositoryResult, T9.a<? super d> aVar) {
                super(2, aVar);
                this.f19125f = bVar;
                this.f19126g = livenessRepositoryResult;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((d) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new d(this.f19125f, this.f19126g, aVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0127 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0128  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00f4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 313
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.p.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public p() {
        }

        @Override // com.sumsub.sns.prooface.network.Liveness3dFaceRepository.a
        public void a(Liveness3dFaceRepository.LivenessRepositoryResult livenessRepositoryResult) {
            com.sumsub.sns.prooface.data.a aVar;
            String sessionKey;
            Integer requiredFragments;
            com.sumsub.sns.prooface.a.a("Prooface", "repository callback " + livenessRepositoryResult, null, 4, null);
            b.this.p();
            if (livenessRepositoryResult instanceof Liveness3dFaceRepository.LivenessRepositoryResult.f) {
                b bVar = b.this;
                Liveness3dFaceRepository.LivenessRepositoryResult.f fVar = (Liveness3dFaceRepository.LivenessRepositoryResult.f) livenessRepositoryResult;
                com.sumsub.sns.prooface.data.j a10 = fVar.a();
                bVar.X = (a10 == null || (requiredFragments = a10.getRequiredFragments()) == null) ? 0 : requiredFragments.intValue();
                b.this.f19009Z = 0L;
                com.sumsub.sns.prooface.data.j a11 = fVar.a();
                if (a11 != null && (sessionKey = a11.getSessionKey()) != null) {
                    b bVar2 = b.this;
                    try {
                        bVar2.f18996E.a(sessionKey);
                        bVar2.f19011b0 = sessionKey;
                    } catch (Exception e10) {
                        bVar2.b((Throwable) e10);
                    }
                }
                com.sumsub.sns.prooface.data.j a12 = fVar.a();
                boolean z10 = !(a12 != null ? kotlin.jvm.internal.f.b(a12.getSkipCalibration(), Boolean.TRUE) : false);
                b bVar3 = b.this;
                if (z10) {
                    aVar = new com.sumsub.sns.prooface.data.a((String) null, new ArrayList(), (String) null, 4, (DefaultConstructorMarker) null);
                } else {
                    bVar3.b(false);
                    aVar = com.sumsub.sns.prooface.data.a.INSTANCE.a();
                }
                bVar3.R = aVar;
                BuildersKt__Builders_commonKt.launch$default(C0552s.b(b.this), null, null, new a(b.this, z10, null), 3, null);
                return;
            }
            if (livenessRepositoryResult instanceof Liveness3dFaceRepository.LivenessRepositoryResult.d) {
                com.sumsub.sns.prooface.data.j a13 = ((Liveness3dFaceRepository.LivenessRepositoryResult.d) livenessRepositoryResult).a();
                if (kotlin.jvm.internal.f.b(a13 != null ? a13.getAnswer() : null, AnswerType.Yellow.getValue())) {
                    b.this.Y = 0;
                    BuildersKt__Builders_commonKt.launch$default(C0552s.b(b.this), null, null, new C0357b(b.this, null), 3, null);
                    return;
                }
                return;
            }
            if (livenessRepositoryResult instanceof Liveness3dFaceRepository.LivenessRepositoryResult.b) {
                b.this.X = 0;
                b.this.b(false);
                BuildersKt__Builders_commonKt.launch$default(C0552s.b(b.this), null, null, new c(b.this, null), 3, null);
                return;
            }
            if (livenessRepositoryResult instanceof Liveness3dFaceRepository.LivenessRepositoryResult.g) {
                b.this.X = 0;
                b.this.b(false);
                BuildersKt__Builders_commonKt.launch$default(C0552s.b(b.this), null, null, new d(b.this, livenessRepositoryResult, null), 3, null);
                return;
            }
            if (livenessRepositoryResult instanceof Liveness3dFaceRepository.LivenessRepositoryResult.h) {
                return;
            }
            if (livenessRepositoryResult instanceof Liveness3dFaceRepository.LivenessRepositoryResult.c) {
                b.this.X = 0;
                SNSException.Network network = new SNSException.Network((Exception) ((Liveness3dFaceRepository.LivenessRepositoryResult.c) livenessRepositoryResult).a());
                b.a(b.this, new SNSLivenessReason.NetworkError(network), (String) null, 2, (Object) null);
                b.this.b((Throwable) network);
                return;
            }
            if (kotlin.jvm.internal.f.b(livenessRepositoryResult, Liveness3dFaceRepository.LivenessRepositoryResult.a.f20260a)) {
                b.this.X = 0;
                b.a(b.this, new SNSLivenessReason.NetworkError(new IOException()), (String) null, 2, (Object) null);
            } else if (kotlin.jvm.internal.f.b(livenessRepositoryResult, Liveness3dFaceRepository.LivenessRepositoryResult.e.f20264a)) {
                b.this.X = 0;
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$onCameraPermissionDenied$1", f = "SNSLiveness3dFaceViewModel.kt", l = {778, 779, 780}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19131a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19132b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19133c;

        /* renamed from: d, reason: collision with root package name */
        public int f19134d;

        /* renamed from: e, reason: collision with root package name */
        public int f19135e;

        public r(T9.a<? super r> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((r) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new r(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r9.f19135e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L3b
                if (r1 == r3) goto L2d
                if (r1 != r2) goto L25
                int r0 = r9.f19134d
                java.lang.Object r1 = r9.f19133c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r9.f19132b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r9.f19131a
                com.sumsub.sns.internal.prooface.presentation.b r3 = (com.sumsub.sns.internal.prooface.presentation.b) r3
                kotlin.b.b(r10)
                r7 = r3
                r3 = r1
                r1 = r0
                goto L91
            L25:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2d:
                int r1 = r9.f19134d
                java.lang.Object r3 = r9.f19132b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r9.f19131a
                com.sumsub.sns.internal.prooface.presentation.b r4 = (com.sumsub.sns.internal.prooface.presentation.b) r4
                kotlin.b.b(r10)
                goto L75
            L3b:
                int r1 = r9.f19134d
                java.lang.Object r4 = r9.f19131a
                com.sumsub.sns.internal.prooface.presentation.b r4 = (com.sumsub.sns.internal.prooface.presentation.b) r4
                kotlin.b.b(r10)
                goto L5d
            L45:
                kotlin.b.b(r10)
                com.sumsub.sns.internal.prooface.presentation.b r10 = com.sumsub.sns.internal.prooface.presentation.b.this
                r9.f19131a = r10
                r1 = 0
                r9.f19134d = r1
                r9.f19135e = r4
                java.lang.String r4 = "sns_alert_lackOfCameraPermissions"
                java.lang.Object r4 = com.sumsub.sns.internal.prooface.presentation.b.a(r10, r4, r9)
                if (r4 != r0) goto L5a
                return r0
            L5a:
                r8 = r4
                r4 = r10
                r10 = r8
            L5d:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                com.sumsub.sns.internal.prooface.presentation.b r5 = com.sumsub.sns.internal.prooface.presentation.b.this
                r9.f19131a = r4
                r9.f19132b = r10
                r9.f19134d = r1
                r9.f19135e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = com.sumsub.sns.internal.prooface.presentation.b.a(r5, r3, r9)
                if (r3 != r0) goto L72
                return r0
            L72:
                r8 = r3
                r3 = r10
                r10 = r8
            L75:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                com.sumsub.sns.internal.prooface.presentation.b r5 = com.sumsub.sns.internal.prooface.presentation.b.this
                r9.f19131a = r4
                r9.f19132b = r3
                r9.f19133c = r10
                r9.f19134d = r1
                r9.f19135e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = com.sumsub.sns.internal.prooface.presentation.b.a(r5, r2, r9)
                if (r2 != r0) goto L8c
                return r0
            L8c:
                r7 = r4
                r8 = r3
                r3 = r10
                r10 = r2
                r2 = r8
            L91:
                r4 = r10
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                com.sumsub.sns.core.presentation.base.a$n r10 = new com.sumsub.sns.core.presentation.base.a$n
                r5 = 1
                r6 = 0
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                com.sumsub.sns.internal.prooface.presentation.b.a(r7, r10)
                O9.p r10 = O9.p.f3034a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel", f = "SNSLiveness3dFaceViewModel.kt", l = {317}, m = "onPrepare")
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19137a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19138b;

        /* renamed from: d, reason: collision with root package name */
        public int f19140d;

        public s(T9.a<? super s> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19138b = obj;
            this.f19140d |= Integer.MIN_VALUE;
            return b.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$onPrepare$2", f = "SNSLiveness3dFaceViewModel.kt", l = {322, 323, 324, 325}, m = "invokeSuspend")
    public static final class t extends SuspendLambda implements InterfaceC0650p<i, T9.a<? super i>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19141a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19142b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19143c;

        /* renamed from: d, reason: collision with root package name */
        public int f19144d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19145e;

        public t(T9.a<? super t> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i iVar, T9.a<? super i> aVar) {
            return ((t) create(iVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            t tVar = b.this.new t(aVar);
            tVar.f19145e = obj;
            return tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class u extends Lambda implements InterfaceC0646l<m.a, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a<O9.p> f19148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC0635a<O9.p> interfaceC0635a) {
            super(1);
            this.f19148b = interfaceC0635a;
        }

        public final void a(m.a aVar) {
            if (!b.this.c(aVar.a())) {
                b.this.a(aVar);
            }
            this.f19148b.invoke();
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(m.a aVar) {
            a(aVar);
            return O9.p.f3034a;
        }
    }

    public static final class v extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageProxy f19149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ImageProxy imageProxy) {
            super(0);
            this.f19149a = imageProxy;
        }

        public final void a() {
            this.f19149a.close();
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    public static final class w extends Lambda implements InterfaceC0650p<Integer, Integer, Bitmap> {
        public w() {
            super(2);
        }

        public final Bitmap a(int i, int i9) {
            return b.this.f19019j0.a(i, i9);
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ Bitmap invoke(Integer num, Integer num2) {
            return a(num.intValue(), num2.intValue());
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$refuseShowSettingsDialog$1", f = "SNSLiveness3dFaceViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class x extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19151a;

        public x(T9.a<? super x> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((x) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new x(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19151a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.this.f18998G.d();
            return O9.p.f3034a;
        }
    }

    public static final class y extends TimerTask {
        public y() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            b.this.D();
        }
    }

    public static final class z extends TimerTask {

        @V9.d(c = "com.sumsub.sns.internal.prooface.presentation.SNSLiveness3dFaceViewModel$scheduleSlowConnectionTimer$1$1$run$1", f = "SNSLiveness3dFaceViewModel.kt", l = {740, 738}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f19155a;

            /* renamed from: b, reason: collision with root package name */
            public int f19156b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f19157c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19157c = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19157c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableStateFlow mutableStateFlow;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19156b;
                if (i == 0) {
                    kotlin.b.b(obj);
                    mutableStateFlow = this.f19157c.f19016g0;
                    b bVar = this.f19157c;
                    this.f19155a = mutableStateFlow;
                    this.f19156b = 1;
                    obj = bVar.a("sns_facescan_hint_processingTakesTooLong", this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        return O9.p.f3034a;
                    }
                    mutableStateFlow = (MutableStateFlow) this.f19155a;
                    kotlin.b.b(obj);
                }
                g.d dVar = new g.d((CharSequence) obj);
                this.f19155a = null;
                this.f19156b = 2;
                if (mutableStateFlow.emit(dVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return O9.p.f3034a;
            }
        }

        public z() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(b.this), null, null, new a(b.this, null), 3, null);
        }
    }

    public b(com.sumsub.sns.internal.core.domain.m mVar, DocumentType documentType, AbstractC1244a abstractC1244a, com.sumsub.sns.prooface.network.a aVar, Liveness3dFaceRepository liveness3dFaceRepository, com.sumsub.sns.internal.core.data.source.settings.b bVar, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar2, Fingerprinter fingerprinter) {
        super(aVar2, bVar2);
        Job launch$default;
        this.f18993B = mVar;
        this.f18994C = documentType;
        this.f18995D = abstractC1244a;
        this.f18996E = aVar;
        this.f18997F = liveness3dFaceRepository;
        this.f18998G = bVar;
        this.f18999H = aVar2;
        this.f19000I = bVar2;
        this.f19001J = fingerprinter;
        StringBuilder sb2 = new StringBuilder("msdk2 / 1.32.0 (Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(") - App ");
        e0 e0Var = e0.f15081a;
        sb2.append(e0Var.getPackageName());
        sb2.append(' ');
        sb2.append(e0Var.getVersionName());
        sb2.append(" / ");
        sb2.append(e0Var.getVersionCode());
        this.f19005N = sb2.toString();
        this.f19006O = "";
        this.f19007P = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        ExecutorCoroutineDispatcher from = ExecutorsKt.from(Executors.newSingleThreadExecutor());
        this.f19008Q = from;
        this.W = new p();
        this.Y = Integer.MAX_VALUE;
        this.f19011b0 = "";
        MutableStateFlow<f> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f19014e0 = MutableStateFlow;
        this.f19015f0 = MutableStateFlow;
        MutableStateFlow<g> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f19016g0 = MutableStateFlow2;
        this.f19017h0 = MutableStateFlow2;
        this.f19019j0 = new com.sumsub.sns.internal.core.common.e(Bitmap.Config.ARGB_8888);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), from, null, new a(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new C0353b(null), 3, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new c(null), 3, null);
        this.f19018i0 = launch$default;
        this.f19020k0 = kotlin.a.a(o.f19105a);
    }

    public final void A() {
        b(false);
        com.sumsub.sns.core.presentation.base.a.a(this, q.a.f15160b, (Object) null, (Long) null, 6, (Object) null);
    }

    public final void B() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new x(null), 3, null);
    }

    public final void C() {
        if (this.f19004M == null) {
            Timer timer = new Timer();
            timer.schedule(new y(), TimeUnit.SECONDS.toMillis(2L));
            this.f19004M = timer;
        }
    }

    public final void D() {
        if (this.f19003L == null) {
            Timer timer = new Timer();
            timer.schedule(new z(), TimeUnit.SECONDS.toMillis(2L));
            this.f19003L = timer;
        }
    }

    public final void E() {
        float f10;
        float f11;
        com.sumsub.sns.prooface.a.a("Prooface", "Stop calibration", null, 4, null);
        com.sumsub.sns.prooface.data.a aVar = this.R;
        if (aVar != null) {
            List<com.sumsub.sns.prooface.data.b> j10 = aVar.j();
            if (j10 != null) {
                Iterator<T> it = j10.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                f10 = ((com.sumsub.sns.prooface.data.b) it.next()).d();
                while (it.hasNext()) {
                    f10 = Math.max(f10, ((com.sumsub.sns.prooface.data.b) it.next()).d());
                }
            } else {
                f10 = 0.0f;
            }
            List<com.sumsub.sns.prooface.data.b> j11 = aVar.j();
            if (j11 != null) {
                Iterator<T> it2 = j11.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                f11 = ((com.sumsub.sns.prooface.data.b) it2.next()).d();
                while (it2.hasNext()) {
                    f11 = Math.min(f11, ((com.sumsub.sns.prooface.data.b) it2.next()).d());
                }
            } else {
                f11 = 0.0f;
            }
            aVar.b((f10 <= 0.0f || (f10 - f11) / f10 <= 0.3f) ? "fail" : "ok");
        }
    }

    public final void F() {
        com.sumsub.sns.prooface.a.a("Prooface", "stopSession()", null, 4, null);
        Job job = this.T;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f18993B.stop();
        this.f18997F.b();
        this.f19019j0.a();
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        this.U = null;
    }

    public final void p() {
        Timer timer = this.f19004M;
        if (timer != null) {
            timer.cancel();
        }
        this.f19004M = null;
        Timer timer2 = this.f19003L;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.f19003L = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public i e() {
        return new i(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean r() {
        return this.f18998G.i();
    }

    public final long t() {
        try {
            return new JSONObject(com.sumsub.sns.internal.ff.a.f16930a.l().f()).optLong("frameDelay", 500L);
        } catch (Exception e10) {
            com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, "Prooface", "Failed to parse config: " + com.sumsub.sns.internal.ff.a.f16930a.l().f(), e10);
            return 500L;
        }
    }

    public final DocumentType u() {
        return this.f18994C;
    }

    public final StateFlow<g> v() {
        return this.f19017h0;
    }

    public final byte[] w() {
        try {
            return com.sumsub.sns.prooface.network.d.f20283a.a(ByteBuffer.wrap(Base64.decode(this.f19011b0, 2)).getLong(0));
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            com.sumsub.sns.prooface.a.a("Prooface", message, e10);
            b((Throwable) e10);
            return com.sumsub.sns.prooface.network.d.f20283a.a(System.nanoTime());
        }
    }

    public final StateFlow<f> x() {
        return this.f19015f0;
    }

    public final boolean y() {
        return ((Boolean) this.f19020k0.getValue()).booleanValue();
    }

    public final void z() {
        a(this, SNSLivenessReason.UserCancelled.INSTANCE, (String) null, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.core.presentation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super O9.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.prooface.presentation.b.s
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.prooface.presentation.b$s r0 = (com.sumsub.sns.internal.prooface.presentation.b.s) r0
            int r1 = r0.f19140d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19140d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.prooface.presentation.b$s r0 = new com.sumsub.sns.internal.prooface.presentation.b$s
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19138b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19140d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f19137a
            com.sumsub.sns.internal.prooface.presentation.b r0 = (com.sumsub.sns.internal.prooface.presentation.b) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f19137a = r4
            r0.f19140d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            r0.b(r3)
            com.sumsub.sns.internal.prooface.presentation.b$t r5 = new com.sumsub.sns.internal.prooface.presentation.b$t
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            com.sumsub.sns.core.presentation.base.a.a(r0, r2, r5, r3, r1)
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.c(T9.a):java.lang.Object");
    }

    public final void d(boolean z10) {
        this.f19013d0 = z10;
    }

    public final Object d(T9.a<? super Map<String, String>> aVar) {
        if (com.sumsub.sns.internal.ff.a.f16930a.d().g()) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "Fingerprinter", "Fingerprint is enabled, collecting...", null, 4, null);
            T9.b bVar = new T9.b(U4.b.p(aVar));
            this.f19001J.b(new n(bVar));
            Object a10 = bVar.a();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            return a10;
        }
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "Fingerprinter", "Fingerprint is disabled", null, 4, null);
        return null;
    }

    public static final class q extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f19127a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f19128b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a<O9.p> f19129c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Handler f19130d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j10, long j11, InterfaceC0635a<O9.p> interfaceC0635a, Handler handler) {
            super(0);
            this.f19127a = j10;
            this.f19128b = j11;
            this.f19129c = interfaceC0635a;
            this.f19130d = handler;
        }

        public final void a() {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19127a;
            long j10 = this.f19128b;
            if (elapsedRealtime >= j10) {
                this.f19129c.invoke();
            } else {
                this.f19130d.postDelayed(new H6.c(6, this.f19129c), j10 - elapsedRealtime);
            }
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }

        public static final void a(InterfaceC0635a interfaceC0635a) {
            interfaceC0635a.invoke();
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        com.sumsub.sns.prooface.a.a("Prooface", "onHandleError " + oVar, null, 4, null);
        super.b(oVar);
        a(new e(oVar));
    }

    public final void b(Throwable th) {
        com.sumsub.sns.prooface.a.a("Prooface", "error " + th.getMessage(), th);
        Logger a10 = com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        a10.e("Prooface", message, th);
    }

    public final void b(String str) {
        com.sumsub.sns.prooface.a.a("Prooface", "message", null, 4, null);
        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), "Prooface", str, null, 4, null);
    }

    public final void c(String str) {
        com.sumsub.sns.prooface.a.a("Prooface", "startSession()", null, 4, null);
        ImageProxy imageProxy = this.U;
        if (imageProxy != null) {
            imageProxy.close();
        }
        if (y()) {
            a(this, new SNSLivenessReason.InitializationError(new IllegalArgumentException("Can't run on emulator")), (String) null, 2, (Object) null);
            return;
        }
        b(true);
        this.f19006O = str;
        this.f18997F.a(this.W);
        this.f18993B.start();
        b("Face Detector used: " + this.f18993B.getName());
        this.f19010a0 = System.currentTimeMillis() + ((long) 100);
    }

    public final void b(Bitmap bitmap) {
        try {
            Matrix matrix = new Matrix();
            matrix.setScale(0.2f, 0.2f);
            matrix.postScale(-1.0f, 1.0f);
            this.f19012c0 = com.sumsub.sns.internal.core.common.p.f15158a.a(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), 20, true);
        } catch (Throwable th) {
            b(th);
        }
    }

    public final String a(com.sumsub.sns.prooface.data.j jVar) {
        String answer = jVar != null ? jVar.getAnswer() : null;
        AnswerType answerType = AnswerType.Green;
        return kotlin.jvm.internal.f.b(answer, answerType.getValue()) ? answerType.getValue() : (jVar == null || !kotlin.jvm.internal.f.b(jVar.getAllowContinuing(), Boolean.TRUE) || kotlin.jvm.internal.f.b(jVar.getAnswer(), answerType.getValue())) ? AnswerType.Red.getValue() : AnswerType.Yellow.getValue();
    }

    public final void b(Exception exc) {
        com.sumsub.sns.core.presentation.base.a.a(this, exc, this.f18994C.c(), (Object) null, 4, (Object) null);
    }

    public final void a(Exception exc) {
        a(this, new SNSLivenessReason.InitializationError(exc), (String) null, 2, (Object) null);
        b((Throwable) exc);
    }

    public final void a(boolean z10, String str) {
        SNSLivenessReason sNSLivenessReason;
        com.sumsub.sns.prooface.a.a("Prooface", "finishSession()", null, 4, null);
        if (kotlin.jvm.internal.f.b(str, AnswerType.Green.getValue())) {
            sNSLivenessReason = SNSLivenessReason.VeritifcationSuccessfully.INSTANCE;
        } else {
            sNSLivenessReason = (kotlin.jvm.internal.f.b(str, AnswerType.Red.getValue()) && z10) ? SNSLivenessReason.CompletedUnsuccessfullyAllowContinue.INSTANCE : SNSLivenessReason.UnknownInternalError.INSTANCE;
        }
        a(sNSLivenessReason, str);
    }

    public final boolean c(Bitmap bitmap) {
        if (this.Y > 0 || this.X == 0 || System.currentTimeMillis() - this.f19010a0 < 0) {
            return false;
        }
        a(bitmap, new Size(bitmap.getWidth(), bitmap.getHeight()), "NOT_ALIGNED");
        this.f19010a0 = System.currentTimeMillis() + 8000;
        return true;
    }

    public final void c(boolean z10) {
        if (z10) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new r(null), 3, null);
        } else {
            b(false);
            com.sumsub.sns.core.presentation.base.a.a(this, q.a.f15160b, (Object) null, (Long) null, 6, (Object) null);
        }
    }

    public final void a(m.a aVar) {
        if (!(this.f19014e0.getValue() instanceof f.a) || !(aVar instanceof m.a.b)) {
            com.sumsub.sns.prooface.a.a("Prooface", "onResult " + aVar, null, 4, null);
        }
        if (aVar instanceof m.a.c) {
            this.f19014e0.setValue(new f.C0354b(h().a("sns_facescan_hint_facePosition")));
            return;
        }
        if (aVar instanceof m.a.e) {
            this.f19014e0.setValue(new f.d(h().a("sns_facescan_hint_facePosition")));
            return;
        }
        if (aVar instanceof m.a.d) {
            this.f19014e0.setValue(new f.c(((m.a.d) aVar).b(), h().a("sns_facescan_hint_facePosition")));
            return;
        }
        if (aVar instanceof m.a.C0239a) {
            com.sumsub.sns.prooface.a.a("Prooface", "FaceDetectorResult: " + ((m.a.C0239a) aVar).b(), null, 4, null);
        } else if (aVar instanceof m.a.b) {
            m.a.b bVar = (m.a.b) aVar;
            this.f19014e0.setValue(new f.a(bVar.b(), h().a("sns_facescan_hint_lookStraight")));
            a(bVar);
        }
    }

    public final InterfaceC0635a<O9.p> a(long j10, InterfaceC0635a<O9.p> interfaceC0635a) {
        return new q(SystemClock.elapsedRealtime(), j10, interfaceC0635a, new Handler(Looper.getMainLooper()));
    }

    public final void a(ImageProxy imageProxy, RectF rectF, float f10) {
        List<com.sumsub.sns.prooface.data.b> j10;
        try {
            com.sumsub.sns.prooface.a.a("Prooface", "Process image", null, 4, null);
            InterfaceC0635a<O9.p> a10 = a(t(), new v(imageProxy));
            if (!this.f18997F.c()) {
                com.sumsub.sns.prooface.a.a("Prooface", "Liveness session is not yet connected, skipping frame analyzing", null, 4, null);
                a10.invoke();
                return;
            }
            this.U = imageProxy;
            Bitmap a11 = com.sumsub.sns.internal.core.common.v.a(imageProxy, new w());
            com.sumsub.sns.prooface.data.a aVar = this.R;
            if (aVar != null && !aVar.l()) {
                if (!this.V) {
                    com.sumsub.sns.prooface.a.a("Prooface", "processImage(), Calibration is not completed", null, 4, null);
                }
                this.V = true;
                if (this.S) {
                    this.S = false;
                    Pair<Integer, Float> a12 = com.sumsub.sns.prooface.domain.a.f20248a.a(a11);
                    String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a12.f23089a.intValue() & 16777215)}, 1));
                    com.sumsub.sns.prooface.a.a("Prooface", "Calibrate, color=" + format + ", brightness=" + a12 + ", expositionBias=" + f10, null, 4, null);
                    com.sumsub.sns.prooface.data.a aVar2 = this.R;
                    if (aVar2 != null && (j10 = aVar2.j()) != null) {
                        j10.add(new com.sumsub.sns.prooface.data.b(f10, a12.f23090b.floatValue(), format));
                    }
                }
                a11.recycle();
                a10.invoke();
                return;
            }
            this.V = false;
            this.f18993B.a(a11, rectF, new u(a10));
        } catch (Throwable th) {
            b(th);
            imageProxy.close();
        }
    }

    public final void a(float f10, float f11, float f12) {
        Job launch$default;
        com.sumsub.sns.prooface.a.a("Prooface", "Start calibration, min=" + f11 + ", max=" + f12 + ", current=" + f10, null, 4, null);
        Job job = this.T;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (f11 != f12) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), Dispatchers.getIO(), null, new b0(f11, f12, f10, null), 2, null);
            this.T = launch$default;
        } else {
            com.sumsub.sns.prooface.a.a("Prooface", "Calibration, exposure min=max", null, 4, null);
            this.R = com.sumsub.sns.prooface.data.a.INSTANCE.b();
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), Dispatchers.getIO(), null, new a0(f10, null), 2, null);
        }
    }

    public final void a(m.a.b bVar) {
        if (!this.f19013d0) {
            this.f19009Z = System.currentTimeMillis() + 200;
            return;
        }
        int i9 = this.Y;
        if (i9 == this.X && i9 > 0) {
            C();
        }
        if (this.Y >= this.X) {
            Job job = this.f19018i0;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                return;
            }
            return;
        }
        if (System.currentTimeMillis() - this.f19009Z < 0) {
            return;
        }
        this.Y++;
        a(bVar.a(), bVar.c(), "OK");
        this.f19009Z = System.currentTimeMillis() + 200;
        this.f19016g0.setValue(new g.e(this.Y / this.X));
    }

    public final String a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + bArr2.length + 8);
        allocate.putInt(bArr.length);
        allocate.put(bArr);
        allocate.putInt(bArr2.length);
        allocate.put(bArr2);
        return Base64.encodeToString(this.f18996E.a(allocate.array(), bArr3), 2);
    }

    public final void a(Bitmap bitmap, Size size, String str) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new l(bitmap, size, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.graphics.Bitmap r33, android.util.Size r34, java.lang.String r35, T9.a<? super com.sumsub.sns.prooface.data.h> r36) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.prooface.presentation.b.a(android.graphics.Bitmap, android.util.Size, java.lang.String, T9.a):java.lang.Object");
    }

    public final m.b a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
        m.b bVar = new m.b(bitmap.getWidth(), bitmap.getHeight(), byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        return bVar;
    }

    public final void a(com.sumsub.sns.internal.core.data.model.g gVar, Liveness3dFaceRepository.LivenessRepositoryResult.g gVar2) {
        SNSActionResult sNSActionResult;
        boolean z10 = false;
        try {
            SNSActionResultHandler actionResultHandler = e0.f15081a.getActionResultHandler();
            if (actionResultHandler != null) {
                String B10 = gVar.B();
                String L7 = gVar.L();
                if (L7 == null) {
                    L7 = "";
                }
                com.sumsub.sns.prooface.data.j a10 = gVar2.a();
                String answer = a10 != null ? a10.getAnswer() : null;
                com.sumsub.sns.prooface.data.j a11 = gVar2.a();
                sNSActionResult = actionResultHandler.onActionResult(B10, L7, answer, a11 != null ? kotlin.jvm.internal.f.b(a11.getAllowContinuing(), Boolean.TRUE) : false);
            } else {
                sNSActionResult = null;
            }
            if (sNSActionResult == SNSActionResult.Cancel) {
                z10 = true;
            }
        } catch (Exception e10) {
            b((Throwable) e10);
        }
        com.sumsub.sns.prooface.a.a("Prooface", "handleSessionTerminatedForAction: cancelByHost=" + z10, null, 4, null);
        if (z10) {
            SNSLivenessReason.CancelledByHostApplication cancelledByHostApplication = SNSLivenessReason.CancelledByHostApplication.INSTANCE;
            com.sumsub.sns.prooface.data.j a12 = gVar2.a();
            a(cancelledByHostApplication, a12 != null ? a12.getAnswer() : null);
        }
    }

    public static /* synthetic */ void a(b bVar, SNSLivenessReason sNSLivenessReason, String str, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = null;
        }
        bVar.a(sNSLivenessReason, str);
    }

    public final void a(SNSLivenessReason sNSLivenessReason, String str) {
        com.sumsub.sns.prooface.a.a("Prooface", "finishWithReason: " + sNSLivenessReason + ", answer=" + str, null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new m(str, sNSLivenessReason, null), 3, null);
    }
}
