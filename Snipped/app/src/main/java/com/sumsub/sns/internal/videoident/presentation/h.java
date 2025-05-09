package com.sumsub.sns.internal.videoident.presentation;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.ReviewStatusType;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.videoident.presentation.SNSStepViewItem;
import com.sumsub.sns.internal.videoident.presentation.SNSViewState;
import com.sumsub.sns.internal.videoident.presentation.c;
import com.sumsub.sns.internal.videoident.videoident.SNSVideoIdent;
import com.sumsub.sns.internal.videoident.videoident.chat.SNSVideoChatState;
import ia.InterfaceC0840h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.NamedGroup;
import sa.AbstractC1244a;

/* loaded from: classes2.dex */
public final class h extends com.sumsub.sns.core.presentation.base.a<SNSViewState> {

    /* renamed from: D, reason: collision with root package name */
    public static final long f19238D;

    /* renamed from: q, reason: collision with root package name */
    public static final c f19239q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19240r;

    /* renamed from: E, reason: collision with root package name */
    public final List<Document> f19241E;

    /* renamed from: F, reason: collision with root package name */
    public final AbstractC1244a f19242F;

    /* renamed from: G, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f19243G;

    /* renamed from: H, reason: collision with root package name */
    public final com.sumsub.sns.internal.videoident.videoident.domain.d f19244H;

    /* renamed from: I, reason: collision with root package name */
    public final com.sumsub.sns.internal.videoident.videoident.domain.e f19245I;

    /* renamed from: J, reason: collision with root package name */
    public final com.sumsub.sns.internal.videoident.videoident.domain.c f19246J;

    /* renamed from: K, reason: collision with root package name */
    public final com.sumsub.sns.internal.videoident.videoident.domain.b f19247K;

    /* renamed from: L, reason: collision with root package name */
    public final com.sumsub.sns.internal.videoident.videoident.domain.a f19248L;

    /* renamed from: M, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.j f19249M;

    /* renamed from: N, reason: collision with root package name */
    public com.sumsub.sns.internal.videoident.presentation.g f19250N;

    /* renamed from: O, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.common.c1 f19251O;

    /* renamed from: P, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f19252P;

    /* renamed from: Q, reason: collision with root package name */
    public final CoroutineScope f19253Q;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a R;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a S;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a T;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a U;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a V;
    public boolean W;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a X;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a Y;

    /* renamed from: Z, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f19254Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f19255a0;

    /* renamed from: b0, reason: collision with root package name */
    public Bitmap f19256b0;

    /* renamed from: c0, reason: collision with root package name */
    public File f19257c0;

    /* renamed from: d0, reason: collision with root package name */
    public final long f19258d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f19259e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f19260f0;

    /* renamed from: g0, reason: collision with root package name */
    public final String[] f19261g0;

    /* renamed from: h0, reason: collision with root package name */
    public InterfaceC0635a<O9.p> f19262h0;

    /* renamed from: i0, reason: collision with root package name */
    public InterfaceC0635a<O9.p> f19263i0;

    /* renamed from: j0, reason: collision with root package name */
    public InterfaceC0646l<? super Boolean, O9.p> f19264j0;

    /* renamed from: k0, reason: collision with root package name */
    public InterfaceC0646l<? super String, O9.p> f19265k0;

    /* renamed from: l0, reason: collision with root package name */
    public Job f19266l0;

    /* renamed from: m0, reason: collision with root package name */
    public Job f19267m0;

    /* renamed from: n0, reason: collision with root package name */
    public Job f19268n0;

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$1", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19269a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19270b;

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.a aVar, T9.a<? super O9.p> aVar2) {
            return ((a) create(aVar, aVar2)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = h.this.new a(aVar);
            aVar2.f19270b = obj;
            return aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19269a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.a aVar = (b.a) this.f19270b;
            if (aVar != null) {
                h hVar = h.this;
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "data repository flow updated", null, 4, null);
                hVar.a(aVar);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {147, 148, 149}, m = "readyForPhoto")
    public static final class a1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19272a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19273b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19274c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19275d;

        /* renamed from: f, reason: collision with root package name */
        public int f19277f;

        public a1(T9.a<? super a1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19275d = obj;
            this.f19277f |= Integer.MIN_VALUE;
            return h.this.j(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$2", f = "SNSVideoIdentViewModel.kt", l = {292}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<SNSMessage.ServerMessage, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19278a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19279b;

        public b(T9.a<? super b> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSMessage.ServerMessage serverMessage, T9.a<? super O9.p> aVar) {
            return ((b) create(serverMessage, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            b bVar = h.this.new b(aVar);
            bVar.f19279b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19278a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSMessage.ServerMessage serverMessage = (SNSMessage.ServerMessage) this.f19279b;
                if (serverMessage instanceof SNSMessage.ServerMessage.f) {
                    this.f19278a = 1;
                    if (h.this.a((SNSMessage.ServerMessage.f) serverMessage, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {412}, m = "requestAvailableLanguages")
    public static final class b1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19281a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19282b;

        /* renamed from: d, reason: collision with root package name */
        public int f19284d;

        public b1(T9.a<? super b1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19282b = obj;
            this.f19284d |= Integer.MIN_VALUE;
            return h.this.k(this);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$4", f = "SNSVideoIdentViewModel.kt", l = {693}, m = "invokeSuspend")
    public static final class c0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19285a;

        public c0(T9.a<? super c0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((c0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new c0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19285a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19285a = 1;
                obj = hVar.f(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$2", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c1 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19287a;

        public c1(T9.a<? super c1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((c1) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new c1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return SNSViewState.c.f19164a;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19288a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19289b;

        static {
            int[] iArr = new int[ButtonAction.values().length];
            iArr[ButtonAction.UPLOAD.ordinal()] = 1;
            iArr[ButtonAction.START_CALL.ordinal()] = 2;
            f19288a = iArr;
            int[] iArr2 = new int[PhoneVerificationStatus.values().length];
            iArr2[PhoneVerificationStatus.REQUESTED.ordinal()] = 1;
            iArr2[PhoneVerificationStatus.SUCCESS.ordinal()] = 2;
            iArr2[PhoneVerificationStatus.CANCELED.ordinal()] = 3;
            iArr2[PhoneVerificationStatus.RETRY_CODE.ordinal()] = 4;
            f19289b = iArr2;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$5", f = "SNSVideoIdentViewModel.kt", l = {705}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19290a;

        public d0(T9.a<? super d0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((d0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new d0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19290a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19290a = 1;
                obj = hVar.e(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$3", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d1 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19292a;

        public d1(T9.a<? super d1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((d1) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new d1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19292a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return new SNSViewState.d(false, false, null, 7, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {214, 215, 216, 218}, m = "connectionLostCallAgainState")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19293a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19294b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19295c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19296d;

        /* renamed from: e, reason: collision with root package name */
        public Object f19297e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f19298f;

        /* renamed from: h, reason: collision with root package name */
        public int f19300h;

        public e(T9.a<? super e> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19298f = obj;
            this.f19300h |= Integer.MIN_VALUE;
            return h.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$6", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19301a;

        public e0(T9.a<? super e0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((e0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new e0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19301a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return SNSViewState.c.f19164a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$requestAvailableLanguages$4", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e1 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19302a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<com.sumsub.sns.internal.core.data.source.applicant.remote.n> f19304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(List<com.sumsub.sns.internal.core.data.source.applicant.remote.n> list, T9.a<? super e1> aVar) {
            super(2, aVar);
            this.f19304c = list;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((e1) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new e1(this.f19304c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return new SNSViewState.b(h.this.J(), this.f19304c);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {204, 207, 209}, m = "connectionLostState")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19305a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19306b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19307c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19308d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19309e;

        /* renamed from: g, reason: collision with root package name */
        public int f19311g;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19309e = obj;
            this.f19311g |= Integer.MIN_VALUE;
            return h.this.e(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$7", f = "SNSVideoIdentViewModel.kt", l = {746}, m = "invokeSuspend")
    public static final class f0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19312a;

        public f0(T9.a<? super f0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((f0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new f0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19312a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19312a = 1;
                obj = hVar.d(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$scheduleDisconnectTimeout$1", f = "SNSVideoIdentViewModel.kt", l = {822}, m = "invokeSuspend")
    public static final class f1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19314a;

        public f1(T9.a<? super f1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((f1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new f1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19314a;
            if (i == 0) {
                kotlin.b.b(obj);
                long E8 = h.this.E();
                this.f19314a = 1;
                if (DelayKt.delay(E8, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            h.this.V();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$doStartCall$1", f = "SNSVideoIdentViewModel.kt", l = {610}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19316a;

        public g(T9.a<? super g> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((g) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new g(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19316a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19316a = 1;
                obj = hVar.i(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleVideoChatState$8", f = "SNSVideoIdentViewModel.kt", l = {748}, m = "invokeSuspend")
    public static final class g0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19318a;

        public g0(T9.a<? super g0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((g0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new g0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19318a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19318a = 1;
                obj = hVar.a(true, (T9.a<? super SNSViewState.e>) this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$scheduleWaitForStatusUpdate$1", f = "SNSVideoIdentViewModel.kt", l = {1332}, m = "invokeSuspend")
    public static final class g1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19320a;

        public g1(T9.a<? super g1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((g1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new g1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19320a;
            if (i == 0) {
                kotlin.b.b(obj);
                long j10 = h.this.f19258d0;
                this.f19320a = 1;
                if (DelayKt.delay(j10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            h.this.c0();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$doStartCall$2", f = "SNSVideoIdentViewModel.kt", l = {614}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.videoident.presentation.h$h, reason: collision with other inner class name */
    public static final class C0361h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19322a;

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$doStartCall$2$1", f = "SNSVideoIdentViewModel.kt", l = {624}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.videoident.presentation.h$h$a */
        public static final class a extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19324a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19325b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f19326c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, Object obj, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19325b = hVar;
                this.f19326c = obj;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((a) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19325b, this.f19326c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SNSViewState.e b9;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19324a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19325b;
                    this.f19324a = 1;
                    obj = hVar.l(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                b9 = com.sumsub.sns.internal.videoident.presentation.j.b((SNSViewState.e) obj, this.f19325b.h(), (Exception) Result.a(this.f19326c));
                return b9;
            }
        }

        public C0361h(T9.a<? super C0361h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((C0361h) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new C0361h(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19322a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "applying for a room ...", null, 4, null);
                com.sumsub.sns.internal.videoident.videoident.domain.d dVar = h.this.f19244H;
                this.f19322a = 1;
                a10 = dVar.a(this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                a10 = ((Result) obj).f23091a;
            }
            if (!(a10 instanceof Result.Failure)) {
                h hVar = h.this;
                kotlin.b.b(a10);
                hVar.a((com.sumsub.sns.internal.core.data.source.applicant.remote.h0) a10);
            } else {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "apply room error", (Exception) Result.a(a10));
                h hVar2 = h.this;
                com.sumsub.sns.core.presentation.base.a.a(hVar2, false, new a(hVar2, a10, null), 1, null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onChangeLanguageClick$1", f = "SNSVideoIdentViewModel.kt", l = {371}, m = "invokeSuspend")
    public static final class h0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19327a;

        public h0(T9.a<? super h0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((h0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new h0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19327a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19327a = 1;
                if (hVar.k(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {234, 238}, m = "startCallErrorState")
    public static final class h1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19329a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19330b;

        /* renamed from: c, reason: collision with root package name */
        public int f19331c;

        /* renamed from: d, reason: collision with root package name */
        public int f19332d;

        /* renamed from: e, reason: collision with root package name */
        public int f19333e;

        /* renamed from: f, reason: collision with root package name */
        public int f19334f;

        /* renamed from: g, reason: collision with root package name */
        public int f19335g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f19336h;

        /* renamed from: j, reason: collision with root package name */
        public int f19337j;

        public h1(T9.a<? super h1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19336h = obj;
            this.f19337j |= Integer.MIN_VALUE;
            return h.this.l(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {154, 156, 158, 159}, m = "exitConfirmationDialog")
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19338a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19339b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19340c;

        /* renamed from: e, reason: collision with root package name */
        public int f19342e;

        public i(T9.a<? super i> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19340c = obj;
            this.f19342e |= Integer.MIN_VALUE;
            return h.this.g(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {846, 894}, m = "onChatMessage")
    public static final class i0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19343a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19344b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19345c;

        /* renamed from: e, reason: collision with root package name */
        public int f19347e;

        public i0(T9.a<? super i0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19345c = obj;
            this.f19347e |= Integer.MIN_VALUE;
            return h.this.b((String) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$switchToReconnectingViewState$1", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class i1 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19348a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSViewState.e f19350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(SNSViewState.e eVar, T9.a<? super i1> aVar) {
            super(2, aVar);
            this.f19350c = eVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((i1) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new i1(this.f19350c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SNSViewState.e a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19348a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.videoident.presentation.e eVar = new com.sumsub.sns.internal.videoident.presentation.e(false, h.this.F(), true);
            if (this.f19350c.O() == null) {
                eVar = null;
            }
            com.sumsub.sns.internal.videoident.presentation.e eVar2 = eVar;
            SNSViewState.VideoStepState videoStepState = SNSViewState.VideoStepState.RECONNECTING;
            SNSViewState.e eVar3 = this.f19350c;
            a10 = eVar3.a((r42 & 1) != 0 ? eVar3.f19169a : videoStepState, (r42 & 2) != 0 ? eVar3.f19170b : null, (r42 & 4) != 0 ? eVar3.f19171c : false, (r42 & 8) != 0 ? eVar3.f19172d : false, (r42 & 16) != 0 ? eVar3.f19173e : false, (r42 & 32) != 0 ? eVar3.f19174f : false, (r42 & 64) != 0 ? eVar3.f19175g : false, (r42 & 128) != 0 ? eVar3.f19176h : null, (r42 & 256) != 0 ? eVar3.i : null, (r42 & 512) != 0 ? eVar3.f19177j : null, (r42 & 1024) != 0 ? eVar3.f19178k : null, (r42 & 2048) != 0 ? eVar3.f19179l : null, (r42 & 4096) != 0 ? eVar3.f19180m : null, (r42 & 8192) != 0 ? eVar3.f19181n : null, (r42 & 16384) != 0 ? eVar3.f19182o : false, (r42 & 32768) != 0 ? eVar3.f19183p : false, (r42 & 65536) != 0 ? eVar3.f19184q : eVar2, (r42 & 131072) != 0 ? eVar3.f19185r : null, (r42 & 262144) != 0 ? eVar3.f19186s : null, (r42 & 524288) != 0 ? eVar3.f19187t : null, (r42 & PKIFailureInfo.badCertTemplate) != 0 ? eVar3.f19188u : eVar3, (r42 & PKIFailureInfo.badSenderNonce) != 0 ? eVar3.f19189v : null, (r42 & 4194304) != 0 ? eVar3.f19190w : null, (r42 & 8388608) != 0 ? eVar3.f19191x : null);
            return a10;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleCancelScreenshot$1", f = "SNSVideoIdentViewModel.kt", l = {911}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19351a;

        public j(T9.a<? super j> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((j) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new j(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19351a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19351a = 1;
                obj = hVar.p(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onChatMessage$message$1", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class j0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super SNSMessage.ServerMessage>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19353a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19355c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str, T9.a<? super j0> aVar) {
            super(2, aVar);
            this.f19355c = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super SNSMessage.ServerMessage> aVar) {
            return ((j0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new j0(this.f19355c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19353a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return SNSMessage.ServerMessage.INSTANCE.a(h.this.y(), this.f19355c);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {192, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 198}, m = "uploadFailedState")
    public static final class j1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19356a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19357b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19358c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19359d;

        /* renamed from: e, reason: collision with root package name */
        public Object f19360e;

        /* renamed from: f, reason: collision with root package name */
        public Object f19361f;

        /* renamed from: g, reason: collision with root package name */
        public Object f19362g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f19363h;

        /* renamed from: j, reason: collision with root package name */
        public int f19364j;

        public j1(T9.a<? super j1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19363h = obj;
            this.f19364j |= Integer.MIN_VALUE;
            return h.this.m(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1", f = "SNSVideoIdentViewModel.kt", l = {1374, 1386, 1388}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19365a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f19367c;

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$1", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19368a;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((a) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f19368a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return SNSViewState.c.f19164a;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$5$1", f = "SNSVideoIdentViewModel.kt", l = {1396}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19369a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19370b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bitmap f19371c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, Bitmap bitmap, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f19370b = hVar;
                this.f19371c = bitmap;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((b) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f19370b, this.f19371c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19369a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19370b;
                    this.f19369a = 1;
                    obj = hVar.n(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                ((SNSViewState.e) obj).a(this.f19371c);
                return obj;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$6", f = "SNSVideoIdentViewModel.kt", l = {1405}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19372a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19373b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, T9.a<? super c> aVar) {
                super(2, aVar);
                this.f19373b = hVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((c) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new c(this.f19373b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19372a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19373b;
                    this.f19372a = 1;
                    obj = hVar.p(this);
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

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleFileSelectedForDocSetType$1$fileUri$1", f = "SNSVideoIdentViewModel.kt", l = {1375}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super String>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19374a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19375b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f19376c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, Uri uri, T9.a<? super d> aVar) {
                super(2, aVar);
                this.f19375b = hVar;
                this.f19376c = uri;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super String> aVar) {
                return ((d) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new d(this.f19375b, this.f19376c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19374a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    com.sumsub.sns.internal.core.common.c1 c1Var = this.f19375b.f19251O;
                    Uri uri = this.f19376c;
                    this.f19374a = 1;
                    obj = c1Var.copyContentsToCacheFile(uri, this);
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
        public k(Uri uri, T9.a<? super k> aVar) {
            super(2, aVar);
            this.f19367c = uri;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((k) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new k(this.f19367c, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r10.f19365a
                r2 = 0
                java.lang.String r3 = "SNSVideoIdent"
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L2b
                if (r1 == r6) goto L27
                if (r1 == r5) goto L23
                if (r1 != r4) goto L1b
                kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L18
                goto L9c
            L18:
                r11 = move-exception
                goto L9f
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                kotlin.b.b(r11)     // Catch: java.lang.Throwable -> L18
                goto L90
            L27:
                kotlin.b.b(r11)
                goto L54
            L2b:
                kotlin.b.b(r11)
                com.sumsub.sns.internal.videoident.presentation.h r11 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h$k$a r1 = new com.sumsub.sns.internal.videoident.presentation.h$k$a
                r1.<init>(r7)
                com.sumsub.sns.core.presentation.base.a.a(r11, r2, r1, r6, r7)
                java.lang.String r11 = "handleFileSelectedForDocSetType: creating preview ..."
                r1 = 4
                com.sumsub.sns.internal.videoident.videoident.a.a(r3, r11, r7, r1, r7)
                kotlinx.coroutines.CoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getDefault()
                com.sumsub.sns.internal.videoident.presentation.h$k$d r1 = new com.sumsub.sns.internal.videoident.presentation.h$k$d
                com.sumsub.sns.internal.videoident.presentation.h r8 = com.sumsub.sns.internal.videoident.presentation.h.this
                android.net.Uri r9 = r10.f19367c
                r1.<init>(r8, r9, r7)
                r10.f19365a = r6
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r1, r10)
                if (r11 != r0) goto L54
                return r0
            L54:
                java.lang.String r11 = (java.lang.String) r11
                if (r11 == 0) goto Lc0
                java.lang.String r1 = "file://"
                boolean r8 = r11.startsWith(r1)
                if (r8 != 0) goto L67
                int r8 = r11.length()
                if (r8 != 0) goto L67
                r11 = r7
            L67:
                if (r11 == 0) goto Lc0
                java.io.File r8 = new java.io.File
                java.lang.String r9 = ""
                java.lang.String r11 = ka.C0967l.X(r11, r1, r9, r2)
                r8.<init>(r11)
                com.sumsub.sns.internal.videoident.presentation.h r11 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h.a(r11, r8)
                java.lang.String r11 = com.sumsub.sns.internal.core.common.m0.a(r8)     // Catch: java.lang.Throwable -> L18
                java.lang.String r1 = "application/pdf"
                boolean r11 = kotlin.jvm.internal.f.b(r11, r1)     // Catch: java.lang.Throwable -> L18
                r1 = 1920(0x780, float:2.69E-42)
                if (r11 == 0) goto L93
                r10.f19365a = r5     // Catch: java.lang.Throwable -> L18
                java.lang.Object r11 = com.sumsub.sns.internal.core.common.m0.b(r8, r1, r10)     // Catch: java.lang.Throwable -> L18
                if (r11 != r0) goto L90
                return r0
            L90:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11     // Catch: java.lang.Throwable -> L18
                goto Lb1
            L93:
                r10.f19365a = r4     // Catch: java.lang.Throwable -> L18
                java.lang.Object r11 = com.sumsub.sns.internal.core.common.m0.a(r8, r1, r10)     // Catch: java.lang.Throwable -> L18
                if (r11 != r0) goto L9c
                return r0
            L9c:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11     // Catch: java.lang.Throwable -> L18
                goto Lb1
            L9f:
                com.sumsub.sns.internal.log.a r0 = com.sumsub.sns.internal.log.a.f17535a
                com.sumsub.sns.internal.log.LoggerType r1 = com.sumsub.sns.internal.log.LoggerType.KIBANA
                com.sumsub.sns.internal.log.LoggerType[] r1 = new com.sumsub.sns.internal.log.LoggerType[]{r1}
                com.sumsub.log.logger.Logger r0 = r0.a(r1)
                java.lang.String r1 = "decoding image failed"
                r0.e(r3, r1, r11)
                r11 = r7
            Lb1:
                if (r11 == 0) goto Lc0
                com.sumsub.sns.internal.videoident.presentation.h r0 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h$k$b r1 = new com.sumsub.sns.internal.videoident.presentation.h$k$b
                r1.<init>(r0, r11, r7)
                com.sumsub.sns.core.presentation.base.a.a(r0, r2, r1, r6, r7)
                O9.p r11 = O9.p.f3034a
                return r11
            Lc0:
                com.sumsub.sns.internal.videoident.presentation.h r11 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h.a(r11, r7)
                com.sumsub.sns.internal.videoident.presentation.h r11 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h.t(r11)
                com.sumsub.sns.internal.videoident.presentation.h r11 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h$k$c r0 = new com.sumsub.sns.internal.videoident.presentation.h$k$c
                r0.<init>(r11, r7)
                com.sumsub.sns.core.presentation.base.a.a(r11, r2, r0, r6, r7)
                com.sumsub.sns.internal.videoident.presentation.h r11 = com.sumsub.sns.internal.videoident.presentation.h.this
                com.sumsub.sns.internal.videoident.presentation.h.q(r11)
                O9.p r11 = O9.p.f3034a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256}, m = "uploadPreview")
    public static final class k1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19377a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19378b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19379c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19380d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19381e;

        /* renamed from: g, reason: collision with root package name */
        public int f19383g;

        public k1(T9.a<? super k1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19381e = obj;
            this.f19383g |= Integer.MIN_VALUE;
            return h.this.n(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleLanguageSelectionResult$1", f = "SNSVideoIdentViewModel.kt", l = {451}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19384a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, T9.a<? super l> aVar) {
            super(2, aVar);
            this.f19386c = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new l(this.f19386c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Throwable a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19384a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.domain.j jVar = h.this.f19249M;
                String str = this.f19386c;
                com.sumsub.sns.internal.core.data.source.applicant.b bVar = h.this.f19252P;
                this.f19384a = 1;
                a10 = jVar.a(str, bVar, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                a10 = ((Result) obj).f23091a;
            }
            if ((a10 instanceof Result.Failure) && (a11 = Result.a(a10)) != null) {
                h.this.a(a11, DocumentType.f15253j, new SNSViewState.b(null, EmptyList.f23104a));
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onDecodingPhotoFrame$1", f = "SNSVideoIdentViewModel.kt", l = {1038}, m = "invokeSuspend")
    public static final class l0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19387a;

        public l0(T9.a<? super l0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((l0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new l0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19387a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19387a = 1;
                obj = hVar.o(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {139, 142, 143}, m = "uploadingPhotoState")
    public static final class l1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19389a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19390b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19391c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f19392d;

        /* renamed from: f, reason: collision with root package name */
        public int f19394f;

        public l1(T9.a<? super l1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19392d = obj;
            this.f19394f |= Integer.MIN_VALUE;
            return h.this.o(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleLanguageSelectionResult$2", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19395a;

        public m(T9.a<? super m> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((m) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new m(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19395a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return new SNSViewState.d(false, false, null, 7, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onOperatorDisconnectTimeout$1", f = "SNSVideoIdentViewModel.kt", l = {831}, m = "invokeSuspend")
    public static final class m0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19396a;

        public m0(T9.a<? super m0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((m0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new m0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19396a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19396a = 1;
                obj = hVar.d(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {167, CipherSuite.TLS_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256}, m = "videoCallState")
    public static final class m1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19398a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19399b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19400c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19401d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19402e;

        /* renamed from: g, reason: collision with root package name */
        public int f19404g;

        public m1(T9.a<? super m1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19402e = obj;
            this.f19404g |= Integer.MIN_VALUE;
            return h.this.p(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleModeratorName$1", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19405a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SNSViewState f19406b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f19407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(SNSViewState sNSViewState, h hVar, T9.a<? super n> aVar) {
            super(2, aVar);
            this.f19406b = sNSViewState;
            this.f19407c = hVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((n) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new n(this.f19406b, this.f19407c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SNSViewState.e a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            SNSViewState.e eVar = (SNSViewState.e) this.f19406b;
            com.sumsub.sns.internal.videoident.presentation.e O6 = eVar.O();
            a10 = eVar.a((r42 & 1) != 0 ? eVar.f19169a : null, (r42 & 2) != 0 ? eVar.f19170b : null, (r42 & 4) != 0 ? eVar.f19171c : false, (r42 & 8) != 0 ? eVar.f19172d : false, (r42 & 16) != 0 ? eVar.f19173e : false, (r42 & 32) != 0 ? eVar.f19174f : false, (r42 & 64) != 0 ? eVar.f19175g : false, (r42 & 128) != 0 ? eVar.f19176h : null, (r42 & 256) != 0 ? eVar.i : null, (r42 & 512) != 0 ? eVar.f19177j : null, (r42 & 1024) != 0 ? eVar.f19178k : null, (r42 & 2048) != 0 ? eVar.f19179l : null, (r42 & 4096) != 0 ? eVar.f19180m : null, (r42 & 8192) != 0 ? eVar.f19181n : null, (r42 & 16384) != 0 ? eVar.f19182o : false, (r42 & 32768) != 0 ? eVar.f19183p : false, (r42 & 65536) != 0 ? eVar.f19184q : O6 != null ? com.sumsub.sns.internal.videoident.presentation.e.a(O6, false, this.f19407c.F(), false, 5, null) : null, (r42 & 131072) != 0 ? eVar.f19185r : null, (r42 & 262144) != 0 ? eVar.f19186s : null, (r42 & 524288) != 0 ? eVar.f19187t : null, (r42 & PKIFailureInfo.badCertTemplate) != 0 ? eVar.f19188u : null, (r42 & PKIFailureInfo.badSenderNonce) != 0 ? eVar.f19189v : null, (r42 & 4194304) != 0 ? eVar.f19190w : null, (r42 & 8388608) != 0 ? eVar.f19191x : null);
            return a10;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1", f = "SNSVideoIdentViewModel.kt", l = {1081, 1089}, m = "invokeSuspend")
    public static final class n0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19408a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19409b;

        /* renamed from: c, reason: collision with root package name */
        public int f19410c;

        /* renamed from: d, reason: collision with root package name */
        public int f19411d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Bitmap f19413f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f19414g;

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$1", f = "SNSVideoIdentViewModel.kt", l = {1073}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19415a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19416b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19416b = hVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((a) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19416b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19415a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19416b;
                    this.f19415a = 1;
                    obj = hVar.p(this);
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

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$2", f = "SNSVideoIdentViewModel.kt", l = {1077}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19417a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19418b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f19418b = hVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((b) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f19418b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19417a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19418b;
                    this.f19417a = 1;
                    obj = hVar.o(this);
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

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$4", f = "SNSVideoIdentViewModel.kt", l = {1125, 1125}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19419a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ref$BooleanRef f19420b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f19421c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Ref$BooleanRef ref$BooleanRef, h hVar, T9.a<? super c> aVar) {
                super(2, aVar);
                this.f19420b = ref$BooleanRef;
                this.f19421c = hVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((c) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new c(this.f19420b, this.f19421c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19419a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    if (this.f19420b.f23175a) {
                        h hVar = this.f19421c;
                        this.f19419a = 1;
                        obj = hVar.o(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        h hVar2 = this.f19421c;
                        this.f19419a = 2;
                        obj = hVar2.p(this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return (SNSViewState) obj;
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPhotoMade$1$5", f = "SNSVideoIdentViewModel.kt", l = {1135}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19422a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19423b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<Exception> f19424c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(h hVar, Ref$ObjectRef<Exception> ref$ObjectRef, T9.a<? super d> aVar) {
                super(2, aVar);
                this.f19423b = hVar;
                this.f19424c = ref$ObjectRef;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((d) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new d(this.f19423b, this.f19424c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SNSViewState.e b9;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19422a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19423b;
                    this.f19422a = 1;
                    obj = hVar.m(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                Ref$ObjectRef<Exception> ref$ObjectRef = this.f19424c;
                h hVar2 = this.f19423b;
                SNSViewState.e eVar = (SNSViewState.e) obj;
                if (ref$ObjectRef.f23179a == null) {
                    return eVar;
                }
                b9 = com.sumsub.sns.internal.videoident.presentation.j.b(eVar, hVar2.h(), ref$ObjectRef.f23179a);
                return b9;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(Bitmap bitmap, Ref$BooleanRef ref$BooleanRef, T9.a<? super n0> aVar) {
            super(2, aVar);
            this.f19413f = bitmap;
            this.f19414g = ref$BooleanRef;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((n0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new n0(this.f19413f, this.f19414g, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0116 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00cd  */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Exception] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {225, 226, 228}, m = "waitingForOperatorState")
    public static final class n1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19425a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19426b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19427c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19428d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19429e;

        /* renamed from: g, reason: collision with root package name */
        public int f19431g;

        public n1(T9.a<? super n1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19429e = obj;
            this.f19431g |= Integer.MIN_VALUE;
            return h.this.q(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handlePermissionResults$2", f = "SNSVideoIdentViewModel.kt", l = {526, 527, 528}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19432a;

        /* renamed from: b, reason: collision with root package name */
        public int f19433b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19434c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19435d;

        /* renamed from: e, reason: collision with root package name */
        public int f19436e;

        public o(T9.a<? super o> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((o) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new o(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r9.f19436e
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3d
                if (r1 == r5) goto L35
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r0 = r9.f19433b
                int r1 = r9.f19432a
                java.lang.Object r2 = r9.f19435d
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r9.f19434c
                java.lang.String r3 = (java.lang.String) r3
                kotlin.b.b(r10)
                goto L89
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                int r1 = r9.f19433b
                int r3 = r9.f19432a
                java.lang.Object r6 = r9.f19434c
                java.lang.String r6 = (java.lang.String) r6
                kotlin.b.b(r10)
                goto L6c
            L35:
                int r1 = r9.f19433b
                int r6 = r9.f19432a
                kotlin.b.b(r10)
                goto L53
            L3d:
                kotlin.b.b(r10)
                com.sumsub.sns.internal.videoident.presentation.h r10 = com.sumsub.sns.internal.videoident.presentation.h.this
                r9.f19432a = r5
                r9.f19433b = r4
                r9.f19436e = r5
                java.lang.String r1 = "sns_alert_lackOfCameraPermissions"
                java.lang.Object r10 = com.sumsub.sns.internal.videoident.presentation.h.a(r10, r1, r9)
                if (r10 != r0) goto L51
                return r0
            L51:
                r1 = r4
                r6 = r5
            L53:
                java.lang.String r10 = (java.lang.String) r10
                com.sumsub.sns.internal.videoident.presentation.h r7 = com.sumsub.sns.internal.videoident.presentation.h.this
                r9.f19434c = r10
                r9.f19432a = r6
                r9.f19433b = r1
                r9.f19436e = r3
                java.lang.String r3 = "sns_alert_action_cancel"
                java.lang.Object r3 = com.sumsub.sns.internal.videoident.presentation.h.a(r7, r3, r9)
                if (r3 != r0) goto L68
                return r0
            L68:
                r8 = r6
                r6 = r10
                r10 = r3
                r3 = r8
            L6c:
                java.lang.String r10 = (java.lang.String) r10
                com.sumsub.sns.internal.videoident.presentation.h r7 = com.sumsub.sns.internal.videoident.presentation.h.this
                r9.f19434c = r6
                r9.f19435d = r10
                r9.f19432a = r3
                r9.f19433b = r1
                r9.f19436e = r2
                java.lang.String r2 = "sns_alert_action_settings"
                java.lang.Object r2 = com.sumsub.sns.internal.videoident.presentation.h.a(r7, r2, r9)
                if (r2 != r0) goto L83
                return r0
            L83:
                r0 = r1
                r1 = r3
                r3 = r6
                r8 = r2
                r2 = r10
                r10 = r8
            L89:
                java.lang.String r10 = (java.lang.String) r10
                com.sumsub.sns.internal.videoident.presentation.f r6 = new com.sumsub.sns.internal.videoident.presentation.f
                r6.<init>(r3, r10, r2)
                com.sumsub.sns.internal.videoident.presentation.SNSViewState$d r10 = new com.sumsub.sns.internal.videoident.presentation.SNSViewState$d
                if (r1 == 0) goto L96
                r1 = r5
                goto L97
            L96:
                r1 = r4
            L97:
                if (r0 == 0) goto L9a
                r4 = r5
            L9a:
                r10.<init>(r1, r4, r6)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class o0 extends Lambda implements InterfaceC0646l<Throwable, O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f19439b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(Ref$BooleanRef ref$BooleanRef) {
            super(1);
            this.f19439b = ref$BooleanRef;
        }

        public final void a(Throwable th) {
            h.this.r();
            if (th != null) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "error after photo made ", th);
            }
            if (this.f19439b.f23175a) {
                h.this.d0();
            }
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(Throwable th) {
            a(th);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handlePermissionResults$3", f = "SNSVideoIdentViewModel.kt", l = {541, 542, 543}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19440a;

        /* renamed from: b, reason: collision with root package name */
        public int f19441b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19442c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19443d;

        /* renamed from: e, reason: collision with root package name */
        public int f19444e;

        public p(T9.a<? super p> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((p) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new p(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r9.f19444e
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3d
                if (r1 == r5) goto L35
                if (r1 == r3) goto L29
                if (r1 != r2) goto L21
                int r0 = r9.f19441b
                int r1 = r9.f19440a
                java.lang.Object r2 = r9.f19443d
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r9.f19442c
                java.lang.String r3 = (java.lang.String) r3
                kotlin.b.b(r10)
                goto L89
            L21:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L29:
                int r1 = r9.f19441b
                int r3 = r9.f19440a
                java.lang.Object r6 = r9.f19442c
                java.lang.String r6 = (java.lang.String) r6
                kotlin.b.b(r10)
                goto L6c
            L35:
                int r1 = r9.f19441b
                int r6 = r9.f19440a
                kotlin.b.b(r10)
                goto L53
            L3d:
                kotlin.b.b(r10)
                com.sumsub.sns.internal.videoident.presentation.h r10 = com.sumsub.sns.internal.videoident.presentation.h.this
                r9.f19440a = r4
                r9.f19441b = r5
                r9.f19444e = r5
                java.lang.String r1 = "sns_alert_lackOfMicrophonePermissions"
                java.lang.Object r10 = com.sumsub.sns.internal.videoident.presentation.h.a(r10, r1, r9)
                if (r10 != r0) goto L51
                return r0
            L51:
                r6 = r4
                r1 = r5
            L53:
                java.lang.String r10 = (java.lang.String) r10
                com.sumsub.sns.internal.videoident.presentation.h r7 = com.sumsub.sns.internal.videoident.presentation.h.this
                r9.f19442c = r10
                r9.f19440a = r6
                r9.f19441b = r1
                r9.f19444e = r3
                java.lang.String r3 = "sns_alert_action_cancel"
                java.lang.Object r3 = com.sumsub.sns.internal.videoident.presentation.h.a(r7, r3, r9)
                if (r3 != r0) goto L68
                return r0
            L68:
                r8 = r6
                r6 = r10
                r10 = r3
                r3 = r8
            L6c:
                java.lang.String r10 = (java.lang.String) r10
                com.sumsub.sns.internal.videoident.presentation.h r7 = com.sumsub.sns.internal.videoident.presentation.h.this
                r9.f19442c = r6
                r9.f19443d = r10
                r9.f19440a = r3
                r9.f19441b = r1
                r9.f19444e = r2
                java.lang.String r2 = "sns_alert_action_settings"
                java.lang.Object r2 = com.sumsub.sns.internal.videoident.presentation.h.a(r7, r2, r9)
                if (r2 != r0) goto L83
                return r0
            L83:
                r0 = r1
                r1 = r3
                r3 = r6
                r8 = r2
                r2 = r10
                r10 = r8
            L89:
                java.lang.String r10 = (java.lang.String) r10
                com.sumsub.sns.internal.videoident.presentation.f r6 = new com.sumsub.sns.internal.videoident.presentation.f
                r6.<init>(r3, r10, r2)
                com.sumsub.sns.internal.videoident.presentation.SNSViewState$d r10 = new com.sumsub.sns.internal.videoident.presentation.SNSViewState$d
                if (r1 == 0) goto L96
                r1 = r5
                goto L97
            L96:
                r1 = r4
            L97:
                if (r0 == 0) goto L9a
                r4 = r5
            L9a:
                r10.<init>(r1, r4, r6)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPrepare$2", f = "SNSVideoIdentViewModel.kt", l = {330}, m = "invokeSuspend")
    public static final class p0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19446a;

        public p0(T9.a<? super p0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((p0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new p0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19446a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19446a = 1;
                obj = hVar.a(false, (T9.a<? super SNSViewState.e>) this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handlePermissionResults$4", f = "SNSVideoIdentViewModel.kt", l = {550}, m = "invokeSuspend")
    public static final class q extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19448a;

        public q(T9.a<? super q> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((q) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new q(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19448a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19448a = 1;
                obj = hVar.a(true, (T9.a<? super SNSViewState.e>) this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPrepare$3", f = "SNSVideoIdentViewModel.kt", l = {335}, m = "invokeSuspend")
    public static final class q0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19450a;

        public q0(T9.a<? super q0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((q0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new q0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19450a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19450a = 1;
                if (hVar.k(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleQueueStatusUpdated$2", f = "SNSVideoIdentViewModel.kt", l = {488}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19452a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f19454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j10, T9.a<? super r> aVar) {
            super(2, aVar);
            this.f19454c = j10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((r) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new r(this.f19454c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SNSViewState.e b9;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19452a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19452a = 1;
                obj = hVar.q(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            b9 = com.sumsub.sns.internal.videoident.presentation.j.b((SNSViewState.e) obj, h.this.h(), this.f19454c);
            return b9;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onPrepare$4", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class r0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19455a;

        public r0(T9.a<? super r0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((r0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new r0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19455a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return new SNSViewState.d(false, false, null, 7, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleReadyForScreenshot$1", f = "SNSVideoIdentViewModel.kt", l = {947}, m = "invokeSuspend")
    public static final class s extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19456a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.a f19458c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(c.a aVar, T9.a<? super s> aVar2) {
            super(2, aVar2);
            this.f19458c = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((s) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new s(this.f19458c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19456a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19456a = 1;
                obj = hVar.j(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            c.a aVar = this.f19458c;
            SNSViewState.e eVar = (SNSViewState.e) obj;
            eVar.c(aVar.e());
            eVar.b(aVar.d());
            eVar.d(aVar.f());
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onUploadCancel$1", f = "SNSVideoIdentViewModel.kt", l = {1164}, m = "invokeSuspend")
    public static final class s0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19459a;

        public s0(T9.a<? super s0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((s0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new s0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19459a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19459a = 1;
                obj = hVar.p(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleReadyForScreenshot$2", f = "SNSVideoIdentViewModel.kt", l = {957}, m = "invokeSuspend")
    public static final class t extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19461a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.a f19463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(c.a aVar, T9.a<? super t> aVar2) {
            super(2, aVar2);
            this.f19463c = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((t) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new t(this.f19463c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19461a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19461a = 1;
                obj = hVar.j(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            c.a aVar = this.f19463c;
            SNSViewState.e eVar = (SNSViewState.e) obj;
            eVar.c(aVar.e());
            eVar.b(aVar.d());
            return obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {1193}, m = "onUploadFileForDocSetType")
    public static final class t0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19464a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19465b;

        /* renamed from: d, reason: collision with root package name */
        public int f19467d;

        public t0(T9.a<? super t0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19465b = obj;
            this.f19467d |= Integer.MIN_VALUE;
            return h.this.a((String) null, (File) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleRequestLanguagesErrorAction$1", f = "SNSVideoIdentViewModel.kt", l = {404}, m = "invokeSuspend")
    public static final class u extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19468a;

        public u(T9.a<? super u> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((u) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new u(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19468a;
            if (i == 0) {
                kotlin.b.b(obj);
                h.this.b(true);
                h hVar = h.this;
                this.f19468a = 1;
                if (hVar.k(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$2", f = "SNSVideoIdentViewModel.kt", l = {1190}, m = "invokeSuspend")
    public static final class u0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19470a;

        public u0(T9.a<? super u0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((u0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new u0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19470a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19470a = 1;
                obj = hVar.o(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleRetryUpload$2$1$1", f = "SNSVideoIdentViewModel.kt", l = {574}, m = "invokeSuspend")
    public static final class v extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19472a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19474c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ File f19475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, File file, T9.a<? super v> aVar) {
            super(2, aVar);
            this.f19474c = str;
            this.f19475d = file;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((v) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new v(this.f19474c, this.f19475d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19472a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                String str = this.f19474c;
                File file = this.f19475d;
                this.f19472a = 1;
                if (hVar.a(str, file, this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$3", f = "SNSVideoIdentViewModel.kt", l = {1222}, m = "invokeSuspend")
    public static final class v0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19476a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Exception f19478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(Exception exc, T9.a<? super v0> aVar) {
            super(2, aVar);
            this.f19478c = exc;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((v0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new v0(this.f19478c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SNSViewState.e b9;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19476a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19476a = 1;
                obj = hVar.m(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            b9 = com.sumsub.sns.internal.videoident.presentation.j.b((SNSViewState.e) obj, h.this.h(), this.f19478c);
            return b9;
        }
    }

    public static final class w extends Lambda implements InterfaceC0646l<Throwable, O9.p> {
        public w() {
            super(1);
        }

        public final void a(Throwable th) {
            h.this.r();
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ O9.p invoke(Throwable th) {
            a(th);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onUploadFileForDocSetType$4", f = "SNSVideoIdentViewModel.kt", l = {1232, 1234}, m = "invokeSuspend")
    public static final class w0 extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19480a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f19481b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f19482c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(Object obj, h hVar, T9.a<? super w0> aVar) {
            super(2, aVar);
            this.f19481b = obj;
            this.f19482c = hVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((w0) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new w0(this.f19481b, this.f19482c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19480a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return (SNSViewState) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return (SNSViewState) obj;
            }
            kotlin.b.b(obj);
            if (!(!(this.f19481b instanceof Result.Failure))) {
                h hVar = this.f19482c;
                this.f19480a = 2;
                obj = hVar.p(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return (SNSViewState) obj;
            }
            this.f19482c.g0();
            h hVar2 = this.f19482c;
            this.f19480a = 1;
            obj = hVar2.o(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            return (SNSViewState) obj;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleStepChange$2", f = "SNSVideoIdentViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class x extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19483a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<SNSViewState> f19484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Ref$ObjectRef<SNSViewState> ref$ObjectRef, T9.a<? super x> aVar) {
            super(2, aVar);
            this.f19484b = ref$ObjectRef;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((x) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new x(this.f19484b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19483a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return this.f19484b.f23179a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onWaitForStatusUpdateTimeout$1", f = "SNSVideoIdentViewModel.kt", l = {1342}, m = "invokeSuspend")
    public static final class x0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19485a;

        /* renamed from: b, reason: collision with root package name */
        public int f19486b;

        @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$onWaitForStatusUpdateTimeout$1$1", f = "SNSVideoIdentViewModel.kt", l = {1343}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19488a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19489b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f19489b = hVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
                return ((a) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f19489b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f19488a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    h hVar = this.f19489b;
                    this.f19488a = 1;
                    obj = hVar.p(this);
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

        public x0(T9.a<? super x0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((x0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new x0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.l lVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19486b;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSViewState c2 = h.this.c();
                h hVar = h.this;
                this.f19485a = c2;
                this.f19486b = 1;
                Object o10 = hVar.o(this);
                if (o10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lVar = c2;
                obj = o10;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (a.l) this.f19485a;
                kotlin.b.b(obj);
            }
            if (kotlin.jvm.internal.f.b(lVar, obj)) {
                h hVar2 = h.this;
                com.sumsub.sns.core.presentation.base.a.a(hVar2, false, new a(hVar2, null), 1, null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel$handleUpdateDocsStatus$2", f = "SNSVideoIdentViewModel.kt", l = {1288}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements InterfaceC0650p<SNSViewState, T9.a<? super SNSViewState>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19490a;

        public y(T9.a<? super y> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SNSViewState sNSViewState, T9.a<? super SNSViewState> aVar) {
            return ((y) create(sNSViewState, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return h.this.new y(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19490a;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = h.this;
                this.f19490a = 1;
                obj = hVar.o(this);
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

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {NamedGroup.ffdhe4096, NamedGroup.ffdhe6144, NamedGroup.ffdhe8192, 263, 264, 265}, m = "previewState")
    public static final class y0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19492a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19493b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19494c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19495d;

        /* renamed from: e, reason: collision with root package name */
        public Object f19496e;

        /* renamed from: f, reason: collision with root package name */
        public Object f19497f;

        /* renamed from: g, reason: collision with root package name */
        public Object f19498g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f19499h;
        public /* synthetic */ Object i;

        /* renamed from: k, reason: collision with root package name */
        public int f19501k;

        public y0(T9.a<? super y0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.f19501k |= Integer.MIN_VALUE;
            return h.this.a(false, (T9.a<? super SNSViewState.e>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.videoident.presentation.SNSVideoIdentViewModel", f = "SNSVideoIdentViewModel.kt", l = {247}, m = "previewStateLoading")
    public static final class z0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19502a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19503b;

        /* renamed from: d, reason: collision with root package name */
        public int f19505d;

        public z0(T9.a<? super z0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19503b = obj;
            this.f19505d |= Integer.MIN_VALUE;
            return h.this.i(this);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(h.class, "isChatRunning", "isChatRunning()Z", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(h.class, "updatedDocuments", "getUpdatedDocuments()Ljava/util/List;", 0);
        iVar.getClass();
        f19240r = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, C.v.t(h.class, "selectedDocument", "getSelectedDocument()Lcom/sumsub/sns/internal/core/data/model/Document;", 0, iVar), C.v.t(h.class, "selectedDocumentPayload", "getSelectedDocumentPayload()Lcom/sumsub/sns/internal/core/data/model/SNSMessage$ServerMessage$ScreenShotPayload;", 0, iVar), C.v.t(h.class, "operatorName", "getOperatorName()Ljava/lang/String;", 0, iVar), C.v.t(h.class, "finishOnDisconnect", "getFinishOnDisconnect()Z", 0, iVar), C.v.t(h.class, "speakingLanguage", "getSpeakingLanguage()Ljava/lang/String;", 0, iVar), C.v.t(h.class, "operatorCompletedCall", "getOperatorCompletedCall()Z", 0, iVar)};
        f19239q = new c(null);
        f19238D = TimeUnit.SECONDS.toMillis(15L);
    }

    public h(List<Document> list, AbstractC1244a abstractC1244a, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, G g10, com.sumsub.sns.internal.videoident.videoident.domain.d dVar, com.sumsub.sns.internal.videoident.videoident.domain.e eVar, com.sumsub.sns.internal.videoident.videoident.domain.c cVar, com.sumsub.sns.internal.videoident.videoident.domain.b bVar2, com.sumsub.sns.internal.videoident.videoident.domain.a aVar2, com.sumsub.sns.internal.domain.j jVar, com.sumsub.sns.internal.videoident.presentation.g gVar, com.sumsub.sns.internal.core.common.c1 c1Var, com.sumsub.sns.internal.core.data.source.applicant.b bVar3) {
        super(aVar, bVar);
        this.f19241E = list;
        this.f19242F = abstractC1244a;
        this.f19243G = bVar;
        this.f19244H = dVar;
        this.f19245I = eVar;
        this.f19246J = cVar;
        this.f19247K = bVar2;
        this.f19248L = aVar2;
        this.f19249M = jVar;
        this.f19250N = gVar;
        this.f19251O = c1Var;
        this.f19252P = bVar3;
        this.f19253Q = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        Boolean bool = Boolean.FALSE;
        this.R = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "isChatRunning", bool);
        this.S = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "documents", EmptyList.f23104a);
        this.T = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "selectedDocument", null);
        this.U = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "selectedDocumentPayload", null);
        this.V = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "operatorName", null);
        this.X = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "finishOnDisconnect", bool);
        this.Y = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "speakingLanguage", null);
        this.f19254Z = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "operatorCompletedCall", bool);
        this.f19258d0 = TimeUnit.SECONDS.toMillis(1L);
        this.f19259e0 = TimeUnit.MINUTES.toSeconds(2L);
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, " created view model, " + this, null, 4, null);
        b0.b(bVar.b(), C0552s.b(this), new a(null));
        b0.b(bVar.a(), C0552s.b(this), new b(null));
        this.f19260f0 = f19238D;
        this.f19261g0 = new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
    }

    public final boolean D() {
        return ((Boolean) this.f19254Z.a(this, f19240r[7])).booleanValue();
    }

    public final long E() {
        return this.f19260f0;
    }

    public final String F() {
        return (String) this.V.a(this, f19240r[4]);
    }

    public final String[] G() {
        return this.f19261g0;
    }

    public final Document H() {
        return (Document) this.T.a(this, f19240r[2]);
    }

    public final SNSMessage.ServerMessage.ScreenShotPayload I() {
        return (SNSMessage.ServerMessage.ScreenShotPayload) this.U.a(this, f19240r[3]);
    }

    public final String J() {
        return (String) this.Y.a(this, f19240r[6]);
    }

    public final List<Document> K() {
        return (List) this.S.a(this, f19240r[1]);
    }

    public final void L() {
        SNSVideoChatState state = this.f19250N.getState();
        if (state != null && state.isConnected()) {
            r();
            d(true);
            this.f19250N.disconnect();
        } else {
            InterfaceC0646l<? super Boolean, O9.p> interfaceC0646l = this.f19264j0;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Boolean.TRUE);
            }
        }
    }

    public final void M() {
        if (this.f19268n0 != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleCancelScreenshot: skipping. Upload is in progress", null, 4, null);
        } else {
            e0();
            com.sumsub.sns.core.presentation.base.a.a(this, false, new j(null), 1, null);
        }
    }

    public final void N() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new u(null), 3, null);
    }

    public final void O() {
        Document H10;
        DocumentType type;
        String c2;
        Job launch$default;
        Bitmap bitmap = this.f19256b0;
        if (bitmap != null) {
            a(bitmap);
            return;
        }
        File file = this.f19257c0;
        if (file == null || (H10 = H()) == null || (type = H10.getType()) == null || (c2 = type.c()) == null) {
            a0();
            return;
        }
        r();
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f19253Q, null, null, new v(c2, file, null), 3, null);
        this.f19268n0 = launch$default;
        launch$default.invokeOnCompletion(new w());
    }

    public final boolean P() {
        return ((Boolean) this.R.a(this, f19240r[0])).booleanValue();
    }

    public final void Q() {
        com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g> g10;
        com.sumsub.sns.internal.core.data.model.g d10;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onBackPressed", null, 4, null);
        CoroutineScopeKt.cancel$default(this.f19253Q, null, 1, null);
        if (this.W) {
            return;
        }
        this.W = true;
        SNSVideoChatState state = this.f19250N.getState();
        if (state != null && state.isConnected()) {
            this.f19250N.disconnect();
        }
        b.a value = this.f19243G.b().getValue();
        boolean z10 = (value == null || (g10 = value.g()) == null || (d10 = g10.d()) == null || !d10.A()) ? false : true;
        InterfaceC0646l<? super Boolean, O9.p> interfaceC0646l = this.f19264j0;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Boolean.valueOf(!z10));
        }
    }

    public final void R() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new h0(null), 3, null);
    }

    public final void T() {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new l0(null), 1, null);
    }

    public final void U() {
        u();
    }

    public final void V() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onOperatorDisconnectTimeout", null, 4, null);
        q();
        if (kotlin.jvm.internal.f.b(this.f19250N.getState(), SNSVideoChatState.e.f19565a)) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new m0(null), 1, null);
            this.f19250N.disconnect();
        }
    }

    public final void W() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, " onPhotoMakeError!", null, 4, null);
        e0();
        this.f19250N.sendMessage(new SNSMessage.ClientMessage.d());
    }

    public final void X() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, " onSelectingFileError!", null, 4, null);
        e0();
        this.f19250N.sendMessage(new SNSMessage.ClientMessage.d());
    }

    public final void Y() {
        if (Build.VERSION.SDK_INT < 33 || com.sumsub.sns.internal.ff.a.f16930a.D().g()) {
            u();
        } else {
            a(new a.i("android.permission.POST_NOTIFICATIONS"));
        }
    }

    public final void Z() {
        Document H10 = H();
        if (H10 == null) {
            Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), SNSVideoIdent.logTag, "onUploadCurrentDocumentClick: no current document", null, 4, null);
            return;
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "upload click " + H10, null, 4, null);
        d0();
        this.f19257c0 = null;
        InterfaceC0646l<? super String, O9.p> interfaceC0646l = this.f19265k0;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(H10.getType().c());
        }
    }

    public final void a0() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onUploadCancel!", null, 4, null);
        d0();
        this.f19250N.sendMessage(new SNSMessage.ClientMessage.d());
        e0();
        com.sumsub.sns.core.presentation.base.a.a(this, false, new s0(null), 1, null);
    }

    public final void c0() {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onWaitForStatusUpdateTimeout", null, 4, null);
        s();
        BuildersKt__Builders_commonKt.launch$default(this.f19253Q, null, null, new x0(null), 3, null);
    }

    public final void d0() {
        Bitmap bitmap = this.f19256b0;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "releaseUploadedBitmap", null, 4, null);
                bitmap.recycle();
            }
            this.f19256b0 = null;
        }
    }

    public final void e0() {
        this.f19255a0 = false;
        a((Document) null);
        a((SNSMessage.ServerMessage.ScreenShotPayload) null);
        d0();
        this.f19257c0 = null;
    }

    public final void f0() {
        Job launch$default;
        if (this.f19267m0 != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "scheduleDisconnectTimeout: already scheduled", null, 4, null);
            return;
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "scheduleDisconnectTimeout", null, 4, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f19253Q, null, null, new f1(null), 3, null);
        this.f19267m0 = launch$default;
    }

    public final void g0() {
        Job launch$default;
        if (this.f19266l0 != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "scheduleWaitForStatusUpdate: already scheduled", null, 4, null);
            return;
        }
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "scheduleWaitForStatusUpdate", null, 4, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f19253Q, null, null, new g1(null), 3, null);
        this.f19266l0 = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r31) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.o(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        q();
        s();
        d0();
        r();
        CoroutineScopeKt.cancel$default(this.f19253Q, null, 1, null);
        this.f19257c0 = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public SNSViewState.c e() {
        return SNSViewState.c.f19164a;
    }

    public final List<Document> w() {
        List<Document> K2 = K();
        if (!(!K2.isEmpty())) {
            K2 = null;
        }
        return K2 == null ? this.f19241E : K2;
    }

    public final boolean x() {
        return ((Boolean) this.X.a(this, f19240r[5])).booleanValue();
    }

    public final AbstractC1244a y() {
        return this.f19242F;
    }

    public final void d(String str) {
        this.V.a(this, f19240r[4], str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.p(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.videoident.presentation.h.n1
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.videoident.presentation.h$n1 r0 = (com.sumsub.sns.internal.videoident.presentation.h.n1) r0
            int r1 = r0.f19431g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19431g = r1
            goto L18
        L13:
            com.sumsub.sns.internal.videoident.presentation.h$n1 r0 = new com.sumsub.sns.internal.videoident.presentation.h$n1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19429e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19431g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L65
            if (r2 == r5) goto L59
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r1 = r0.f19428d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.f19427c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r3 = r0.f19426b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.Object r0 = r0.f19425a
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r0 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r0
            kotlin.b.b(r9)
            goto Lad
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L46:
            java.lang.Object r2 = r0.f19427c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f19426b
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r4 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r4
            java.lang.Object r5 = r0.f19425a
            com.sumsub.sns.internal.videoident.presentation.h r5 = (com.sumsub.sns.internal.videoident.presentation.h) r5
            kotlin.b.b(r9)
            r7 = r4
            r4 = r2
            r2 = r7
            goto L90
        L59:
            java.lang.Object r2 = r0.f19426b
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r2 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r2
            java.lang.Object r5 = r0.f19425a
            com.sumsub.sns.internal.videoident.presentation.h r5 = (com.sumsub.sns.internal.videoident.presentation.h) r5
            kotlin.b.b(r9)
            goto L7a
        L65:
            kotlin.b.b(r9)
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r2 = com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.f19168y
            r0.f19425a = r8
            r0.f19426b = r2
            r0.f19431g = r5
            java.lang.String r9 = "sns_videoident_warning_waitForConnect"
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            r5 = r8
        L7a:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r0.f19425a = r5
            r0.f19426b = r2
            r0.f19427c = r9
            r0.f19431g = r4
            java.lang.String r4 = "sns_videoident_state_followIntructions_text"
            java.lang.Object r4 = r5.a(r4, r0)
            if (r4 != r1) goto L8d
            return r1
        L8d:
            r7 = r4
            r4 = r9
            r9 = r7
        L90:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.util.List r6 = r5.t()
            r0.f19425a = r2
            r0.f19426b = r4
            r0.f19427c = r9
            r0.f19428d = r6
            r0.f19431g = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto La7
            return r1
        La7:
            r3 = r4
            r1 = r6
            r7 = r2
            r2 = r9
            r9 = r0
            r0 = r7
        Lad:
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$a r9 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.a) r9
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e r9 = r0.a(r3, r2, r1, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.q(T9.a):java.lang.Object");
    }

    public final void r() {
        Job job = this.f19268n0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            this.f19268n0 = null;
        }
    }

    public final void s() {
        Job job = this.f19266l0;
        if (job != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "cancelWaitForUpdateStatusJob", null, 4, null);
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            this.f19266l0 = null;
        }
    }

    public final List<SNSStepViewItem> t() {
        List<Document> w2 = w();
        ArrayList arrayList = new ArrayList(P9.n.u(w2, 10));
        int i9 = 0;
        for (Object obj : w2) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                P9.m.t();
                throw null;
            }
            Document document = (Document) obj;
            arrayList.add(new SNSStepViewItem(document.getType().b(), document.getType().a(h()), b(document)));
            i9 = i10;
        }
        return arrayList;
    }

    public final void u() {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new g(null), 1, null);
        BuildersKt__Builders_commonKt.launch$default(this.f19253Q, null, null, new C0361h(null), 3, null);
    }

    public final void b(InterfaceC0635a<O9.p> interfaceC0635a) {
        this.f19262h0 = interfaceC0635a;
    }

    public final void c(boolean z10) {
        this.R.a(this, f19240r[0], Boolean.valueOf(z10));
    }

    public final void d(boolean z10) {
        this.X.a(this, f19240r[5], Boolean.valueOf(z10));
    }

    public final void e(String str) {
        this.Y.a(this, f19240r[6], str);
    }

    public final Object f(T9.a<? super SNSViewState> aVar) {
        SNSViewState c2 = c();
        SNSViewState.e eVar = c2 instanceof SNSViewState.e ? (SNSViewState.e) c2 : null;
        if (eVar == null) {
            return c();
        }
        SNSViewState.e N10 = eVar.N();
        if (N10 != null) {
            SNSViewState.e eVar2 = eVar.isReconnecting() ? N10 : null;
            if (eVar2 != null) {
                return eVar2;
            }
        }
        Object p10 = p((T9.a<? super SNSViewState.e>) aVar);
        return p10 == CoroutineSingletons.f23158a ? p10 : (SNSViewState) p10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.sumsub.sns.internal.videoident.presentation.h.i
            if (r0 == 0) goto L13
            r0 = r9
            com.sumsub.sns.internal.videoident.presentation.h$i r0 = (com.sumsub.sns.internal.videoident.presentation.h.i) r0
            int r1 = r0.f19342e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19342e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.videoident.presentation.h$i r0 = new com.sumsub.sns.internal.videoident.presentation.h$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19340c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19342e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5d
            if (r2 == r6) goto L55
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.f19339b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r0 = r0.f19338a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.b.b(r9)
            goto Lb4
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L41:
            java.lang.Object r2 = r0.f19339b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f19338a
            com.sumsub.sns.internal.videoident.presentation.h r4 = (com.sumsub.sns.internal.videoident.presentation.h) r4
            kotlin.b.b(r9)
            goto La0
        L4d:
            java.lang.Object r2 = r0.f19338a
            com.sumsub.sns.internal.videoident.presentation.h r2 = (com.sumsub.sns.internal.videoident.presentation.h) r2
            kotlin.b.b(r9)
            goto L8b
        L55:
            java.lang.Object r2 = r0.f19338a
            com.sumsub.sns.internal.videoident.presentation.h r2 = (com.sumsub.sns.internal.videoident.presentation.h) r2
            kotlin.b.b(r9)
            goto L7a
        L5d:
            kotlin.b.b(r9)
            com.sumsub.sns.internal.ff.a r9 = com.sumsub.sns.internal.ff.a.f16930a
            com.sumsub.sns.internal.ff.core.a r9 = r9.r()
            boolean r9 = r9.g()
            if (r9 == 0) goto L7d
            r0.f19338a = r8
            r0.f19342e = r6
            java.lang.String r9 = "sns_alert_aboutToExitVerification"
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L79
            return r1
        L79:
            r2 = r8
        L7a:
            java.lang.String r9 = (java.lang.String) r9
            goto L8d
        L7d:
            r0.f19338a = r8
            r0.f19342e = r5
            java.lang.String r9 = "sns_videoident_alert_aboutToExit"
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L8a
            return r1
        L8a:
            r2 = r8
        L8b:
            java.lang.String r9 = (java.lang.String) r9
        L8d:
            r0.f19338a = r2
            r0.f19339b = r9
            r0.f19342e = r4
            java.lang.String r4 = "sns_alert_action_confirm"
            java.lang.Object r4 = r2.a(r4, r0)
            if (r4 != r1) goto L9c
            return r1
        L9c:
            r7 = r2
            r2 = r9
            r9 = r4
            r4 = r7
        La0:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r0.f19338a = r2
            r0.f19339b = r9
            r0.f19342e = r3
            java.lang.String r3 = "sns_alert_action_cancel"
            java.lang.Object r0 = r4.a(r3, r0)
            if (r0 != r1) goto Lb1
            return r1
        Lb1:
            r1 = r9
            r9 = r0
            r0 = r2
        Lb4:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$a r2 = new com.sumsub.sns.internal.videoident.presentation.SNSViewState$a
            r2.<init>(r0, r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.g(T9.a):java.lang.Object");
    }

    public final Object h(T9.a<? super O9.p> aVar) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleUpdateDocsStatus", null, 4, null);
        if (this.f19268n0 != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleUpdateDocsStatus: skipping. Upload is in progress", null, 4, null);
            return O9.p.f3034a;
        }
        com.sumsub.sns.core.presentation.base.a.a(this, false, new y(null), 1, null);
        g0();
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleUpdateDocsStatus: requesting doc status update", null, 4, null);
        Object c2 = this.f19243G.c(true, aVar);
        return c2 == CoroutineSingletons.f23158a ? c2 : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            boolean r2 = r1 instanceof com.sumsub.sns.internal.videoident.presentation.h.z0
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.videoident.presentation.h$z0 r2 = (com.sumsub.sns.internal.videoident.presentation.h.z0) r2
            int r3 = r2.f19505d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f19505d = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.videoident.presentation.h$z0 r2 = new com.sumsub.sns.internal.videoident.presentation.h$z0
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f19503b
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r2.f19505d
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            java.lang.Object r2 = r2.f19502a
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r2 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r2
            kotlin.b.b(r1)
            goto L4e
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            kotlin.b.b(r1)
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r1 = com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.f19168y
            r2.f19502a = r1
            r2.f19505d = r5
            java.lang.String r4 = "sns_videoident_state_connecting"
            java.lang.Object r2 = r0.a(r4, r2)
            if (r2 != r3) goto L49
            return r3
        L49:
            r37 = r2
            r2 = r1
            r1 = r37
        L4e:
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            r8 = 8
            r9 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e r10 = com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a.a(r2, r3, r4, r5, r6, r7, r8, r9)
            com.sumsub.sns.internal.videoident.presentation.AnalyticsCallState r32 = com.sumsub.sns.internal.videoident.presentation.AnalyticsCallState.CONNECTING
            r35 = 14680043(0xdfffeb, float:2.0571122E-38)
            r36 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e r1 = com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.i(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.videoident.presentation.h.a1
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.videoident.presentation.h$a1 r0 = (com.sumsub.sns.internal.videoident.presentation.h.a1) r0
            int r1 = r0.f19277f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19277f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.videoident.presentation.h$a1 r0 = new com.sumsub.sns.internal.videoident.presentation.h$a1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19275d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19277f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L61
            if (r2 == r5) goto L55
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r1 = r0.f19274c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r2 = r0.f19273b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r0 = r0.f19272a
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r0 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r0
            kotlin.b.b(r8)
            goto La1
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L42:
            java.lang.Object r2 = r0.f19274c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f19273b
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r4 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r4
            java.lang.Object r5 = r0.f19272a
            com.sumsub.sns.internal.videoident.presentation.h r5 = (com.sumsub.sns.internal.videoident.presentation.h) r5
            kotlin.b.b(r8)
            r6 = r4
            r4 = r2
            r2 = r6
            goto L8c
        L55:
            java.lang.Object r2 = r0.f19273b
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r2 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.a) r2
            java.lang.Object r5 = r0.f19272a
            com.sumsub.sns.internal.videoident.presentation.h r5 = (com.sumsub.sns.internal.videoident.presentation.h) r5
            kotlin.b.b(r8)
            goto L76
        L61:
            kotlin.b.b(r8)
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e$a r2 = com.sumsub.sns.internal.videoident.presentation.SNSViewState.e.f19168y
            r0.f19272a = r7
            r0.f19273b = r2
            r0.f19277f = r5
            java.lang.String r8 = "sns_step_defaults_scan_frontSide_title"
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            r5 = r7
        L76:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.f19272a = r5
            r0.f19273b = r2
            r0.f19274c = r8
            r0.f19277f = r4
            java.lang.String r4 = "sns_step_defaults_scan_frontSide_brief"
            java.lang.Object r4 = r5.a(r4, r0)
            if (r4 != r1) goto L89
            return r1
        L89:
            r6 = r4
            r4 = r8
            r8 = r6
        L8c:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r0.f19272a = r2
            r0.f19273b = r4
            r0.f19274c = r8
            r0.f19277f = r3
            java.lang.Object r0 = r5.g(r0)
            if (r0 != r1) goto L9d
            return r1
        L9d:
            r1 = r8
            r8 = r0
            r0 = r2
            r2 = r4
        La1:
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$a r8 = (com.sumsub.sns.internal.videoident.presentation.SNSViewState.a) r8
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$e r8 = r0.a(r2, r1, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.j(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(T9.a<? super O9.p> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.videoident.presentation.h.b1
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.internal.videoident.presentation.h$b1 r0 = (com.sumsub.sns.internal.videoident.presentation.h.b1) r0
            int r1 = r0.f19284d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19284d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.videoident.presentation.h$b1 r0 = new com.sumsub.sns.internal.videoident.presentation.h$b1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19282b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19284d
            r3 = 4
            java.lang.String r4 = "SNSVideoIdent"
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3c
            if (r2 != r6) goto L34
            java.lang.Object r0 = r0.f19281a
            com.sumsub.sns.internal.videoident.presentation.h r0 = (com.sumsub.sns.internal.videoident.presentation.h) r0
            kotlin.b.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.f23091a
            goto L5a
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3c:
            kotlin.b.b(r10)
            java.lang.String r10 = "requestAvailableLanguages"
            com.sumsub.sns.internal.videoident.videoident.a.a(r4, r10, r7, r3, r7)
            com.sumsub.sns.internal.videoident.presentation.h$c1 r10 = new com.sumsub.sns.internal.videoident.presentation.h$c1
            r10.<init>(r7)
            com.sumsub.sns.core.presentation.base.a.a(r9, r5, r10, r6, r7)
            com.sumsub.sns.internal.videoident.videoident.domain.a r10 = r9.f19248L
            r0.f19281a = r9
            r0.f19284d = r6
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            r0 = r9
        L5a:
            boolean r1 = r10 instanceof kotlin.Result.Failure
            r2 = r1 ^ 1
            if (r2 == 0) goto L9e
            if (r1 == 0) goto L63
            r10 = r7
        L63:
            java.util.List r10 = (java.util.List) r10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "available languages "
            r1.<init>(r2)
            if (r10 == 0) goto L78
            int r2 = r10.size()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            goto L79
        L78:
            r8 = r7
        L79:
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.sumsub.sns.internal.videoident.videoident.a.a(r4, r1, r7, r3, r7)
            if (r10 == 0) goto L95
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L8c
            goto L95
        L8c:
            com.sumsub.sns.internal.videoident.presentation.h$e1 r1 = new com.sumsub.sns.internal.videoident.presentation.h$e1
            r1.<init>(r10, r7)
            com.sumsub.sns.core.presentation.base.a.a(r0, r5, r1, r6, r7)
            goto Lb3
        L95:
            com.sumsub.sns.internal.videoident.presentation.h$d1 r10 = new com.sumsub.sns.internal.videoident.presentation.h$d1
            r10.<init>(r7)
            com.sumsub.sns.core.presentation.base.a.a(r0, r5, r10, r6, r7)
            goto Lb3
        L9e:
            java.lang.Throwable r10 = kotlin.Result.a(r10)
            if (r10 != 0) goto La7
            O9.p r10 = O9.p.f3034a
            return r10
        La7:
            com.sumsub.sns.internal.videoident.presentation.SNSViewState$b r1 = new com.sumsub.sns.internal.videoident.presentation.SNSViewState$b
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.f23104a
            r1.<init>(r7, r2)
            java.lang.String r2 = "TYPE_UNKNOWN"
            r0.a(r10, r2, r1)
        Lb3:
            O9.p r10 = O9.p.f3034a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.k(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r38) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.l(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.m(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r9) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.n(T9.a):java.lang.Object");
    }

    public final void b(InterfaceC0646l<? super String, O9.p> interfaceC0646l) {
        this.f19265k0 = interfaceC0646l;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super O9.p> aVar) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onPrepared", null, 4, null);
        if (P()) {
            SNSViewState c2 = c();
            if ((c2 instanceof SNSViewState.e) && ((SNSViewState.e) c2).M() != null) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onPrepared: skipping view update", null, 4, null);
                return O9.p.f3034a;
            }
            com.sumsub.sns.core.presentation.base.a.a(this, false, new p0(null), 1, null);
            return O9.p.f3034a;
        }
        if (J() == null) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new q0(null), 3, null);
            return O9.p.f3034a;
        }
        com.sumsub.sns.core.presentation.base.a.a(this, false, new r0(null), 1, null);
        return O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.d(T9.a):java.lang.Object");
    }

    public final void e(boolean z10) {
        this.f19254Z.a(this, f19240r[7], Boolean.valueOf(z10));
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        if (c(oVar)) {
            N();
        } else {
            super.b(oVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r14) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.e(T9.a):java.lang.Object");
    }

    public final void b(String str) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleLanguageSelectionResult: " + J() + " -> " + str, null, 4, null);
        if (str == null && J() == null) {
            InterfaceC0646l<? super Boolean, O9.p> interfaceC0646l = this.f19264j0;
            if (interfaceC0646l != null) {
                interfaceC0646l.invoke(Boolean.TRUE);
                return;
            }
            return;
        }
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new l(str, null), 3, null);
        }
        if (str != null) {
            e(str);
        }
        com.sumsub.sns.core.presentation.base.a.a(this, false, new m(null), 1, null);
    }

    public final void a(List<Document> list) {
        this.S.a(this, f19240r[1], list);
    }

    public final void a(Document document) {
        this.T.a(this, f19240r[2], document);
    }

    public final void a(SNSMessage.ServerMessage.ScreenShotPayload screenShotPayload) {
        this.U.a(this, f19240r[3], screenShotPayload);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r16, T9.a<? super com.sumsub.sns.internal.videoident.presentation.SNSViewState.e> r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.a(boolean, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r9, T9.a<? super O9.p> r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.b(java.lang.String, T9.a):java.lang.Object");
    }

    public final void q() {
        Job job = this.f19267m0;
        if (job != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "cancelDisconnectTimeoutJob", null, 4, null);
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            this.f19267m0 = null;
        }
    }

    public final void b0() {
    }

    public final boolean c(com.sumsub.sns.internal.core.data.model.o oVar) {
        return (oVar instanceof o.e) && (oVar.c() instanceof SNSViewState.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.sumsub.sns.internal.videoident.presentation.SNSViewState$e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.sumsub.sns.core.presentation.base.a$l] */
    public final void c(String str) {
        Object obj;
        ?? a10;
        if (str == null) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? c2 = c();
        ref$ObjectRef.f23179a = c2;
        if ((c2 instanceof SNSViewState.e) && !((SNSViewState.e) c2).I().isEmpty()) {
            Iterator<T> it = this.f19241E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.f.b(((Document) obj).getType().c(), str)) {
                        break;
                    }
                }
            }
            a((Document) obj);
            a10 = r6.a((r42 & 1) != 0 ? r6.f19169a : null, (r42 & 2) != 0 ? r6.f19170b : null, (r42 & 4) != 0 ? r6.f19171c : false, (r42 & 8) != 0 ? r6.f19172d : false, (r42 & 16) != 0 ? r6.f19173e : false, (r42 & 32) != 0 ? r6.f19174f : false, (r42 & 64) != 0 ? r6.f19175g : false, (r42 & 128) != 0 ? r6.f19176h : null, (r42 & 256) != 0 ? r6.i : null, (r42 & 512) != 0 ? r6.f19177j : null, (r42 & 1024) != 0 ? r6.f19178k : null, (r42 & 2048) != 0 ? r6.f19179l : null, (r42 & 4096) != 0 ? r6.f19180m : null, (r42 & 8192) != 0 ? r6.f19181n : null, (r42 & 16384) != 0 ? r6.f19182o : false, (r42 & 32768) != 0 ? r6.f19183p : false, (r42 & 65536) != 0 ? r6.f19184q : null, (r42 & 131072) != 0 ? r6.f19185r : null, (r42 & 262144) != 0 ? r6.f19186s : null, (r42 & 524288) != 0 ? r6.f19187t : null, (r42 & PKIFailureInfo.badCertTemplate) != 0 ? r6.f19188u : null, (r42 & PKIFailureInfo.badSenderNonce) != 0 ? r6.f19189v : null, (r42 & 4194304) != 0 ? r6.f19190w : null, (r42 & 8388608) != 0 ? ((SNSViewState.e) ref$ObjectRef.f23179a).f19191x : null);
            ref$ObjectRef.f23179a = a10;
            a10.a(t());
            com.sumsub.sns.core.presentation.base.a.a(this, false, new x(ref$ObjectRef, null), 1, null);
        }
    }

    public final void a(InterfaceC0635a<O9.p> interfaceC0635a) {
        this.f19263i0 = interfaceC0635a;
    }

    public final void a(InterfaceC0646l<? super Boolean, O9.p> interfaceC0646l) {
        this.f19264j0 = interfaceC0646l;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void a(com.sumsub.sns.internal.core.data.model.o oVar) {
        InterfaceC0646l<? super Boolean, O9.p> interfaceC0646l;
        if (!c(oVar) || (interfaceC0646l = this.f19264j0) == null) {
            return;
        }
        interfaceC0646l.invoke(Boolean.FALSE);
    }

    public final void a(com.sumsub.sns.internal.videoident.presentation.g gVar) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "updateVideoChatAdapter: was " + com.sumsub.sns.internal.core.common.i.a(this.f19250N) + " now " + com.sumsub.sns.internal.core.common.i.a(gVar), null, 4, null);
        this.f19250N = gVar;
    }

    public final Object a(SNSMessage.ServerMessage.f fVar, T9.a<? super O9.p> aVar) {
        Long e10;
        if (!c().isWaiting()) {
            return O9.p.f3034a;
        }
        SNSMessage.ServerMessage.f.c d10 = fVar.d();
        if (d10 == null || (e10 = d10.e()) == null) {
            return O9.p.f3034a;
        }
        long longValue = e10.longValue();
        if (this.f19259e0 == longValue) {
            return O9.p.f3034a;
        }
        this.f19259e0 = longValue;
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "wait time changed: " + fVar, null, 4, null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new r(longValue, null), 1, null);
        return O9.p.f3034a;
    }

    public final void b(SNSMessage.ServerMessage.ScreenShotPayload screenShotPayload) {
        Object obj;
        a((SNSMessage.ServerMessage.ScreenShotPayload) null);
        Iterator<T> it = w().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.f.b(((Document) obj).getType().c(), screenShotPayload != null ? screenShotPayload.h() : null)) {
                    break;
                }
            }
        }
        Document document = (Document) obj;
        if (document != null) {
            a(screenShotPayload);
        } else {
            document = null;
        }
        a(document);
        this.f19255a0 = (H() == null || kotlin.jvm.internal.f.b(screenShotPayload != null ? screenShotPayload.n() : null, SNSMessage.ServerMessage.ScreenShotPayload.Variant.UPLOAD.getValue())) ? false : true;
    }

    public final void a(b.a aVar) {
        if (this.f19266l0 != null) {
            b(aVar);
        }
        com.sumsub.sns.internal.core.data.model.g d10 = aVar.g().d();
        if (d10 != null && d10.K() == ReviewStatusType.Completed) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleDataUpdated: applicant status changed to completed. Closing ...", null, 4, null);
            L();
        }
    }

    public final SNSStepViewItem.State b(Document document) {
        if (H() == document) {
            return SNSStepViewItem.State.SELECTED;
        }
        if (document.isSubmitted()) {
            return SNSStepViewItem.State.DONE;
        }
        return SNSStepViewItem.State.DEFAULT;
    }

    public final void a(Map<String, Boolean> map) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("handlePermissionResults: all granted=");
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().booleanValue()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        sb2.append(z10);
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, sb2.toString(), null, 4, null);
        Boolean bool = map.get("android.permission.CAMERA");
        Boolean bool2 = Boolean.TRUE;
        if (!kotlin.jvm.internal.f.b(bool, bool2)) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new o(null), 1, null);
        } else if (!kotlin.jvm.internal.f.b(map.get("android.permission.RECORD_AUDIO"), bool2)) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new p(null), 1, null);
        } else {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new q(null), 1, null);
        }
    }

    public final void b(b.a aVar) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleDocStatusUpdated", null, 4, null);
        com.sumsub.sns.internal.core.data.model.g d10 = aVar.g().d();
        com.sumsub.sns.internal.core.data.model.t d11 = aVar.j().d();
        if (d11 == null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, " handleDocStatusUpdated getting doc status error", aVar.j().a());
        } else if (d10 == null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, " handleDocStatusUpdated getting applicant error", aVar.g().a());
        } else {
            a(com.sumsub.sns.internal.core.common.i.a(d11.d(), d10));
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleDocStatusUpdated. Docs updated", null, 4, null);
        }
    }

    public final void a(ButtonAction buttonAction) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "onPrimaryButtonClick: " + buttonAction, null, 4, null);
        int i9 = d.f19288a[buttonAction.ordinal()];
        if (i9 == 1) {
            O();
        } else {
            if (i9 != 2) {
                return;
            }
            Y();
        }
    }

    public final boolean a(SNSVideoChatState sNSVideoChatState) {
        com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleVideoChatState: " + sNSVideoChatState + ", exitingWithBackPress=" + this.W, null, 4, null);
        q();
        if (sNSVideoChatState instanceof SNSVideoChatState.d) {
            c(true);
            SNSViewState c2 = c();
            SNSViewState.e eVar = c2 instanceof SNSViewState.e ? (SNSViewState.e) c2 : null;
            if (((SNSVideoChatState.d) sNSVideoChatState).h() && (eVar == null || !eVar.isReconnecting())) {
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleVideoChatState: skipping view update", null, 4, null);
            } else {
                com.sumsub.sns.core.presentation.base.a.a(this, false, new c0(null), 1, null);
            }
        } else if (sNSVideoChatState instanceof SNSVideoChatState.e) {
            d((String) null);
            if (this.W) {
                return true;
            }
            com.sumsub.sns.core.presentation.base.a.a(this, false, new d0(null), 1, null);
            f0();
        } else {
            if (sNSVideoChatState instanceof SNSVideoChatState.c) {
                c(false);
                s();
                StringBuilder sb2 = new StringBuilder("handleVideoChatState: finishOnDisconnect=");
                sb2.append(x());
                sb2.append(", error=");
                SNSVideoChatState.c cVar = (SNSVideoChatState.c) sNSVideoChatState;
                sb2.append(cVar.b());
                com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, sb2.toString(), null, 4, null);
                InterfaceC0635a<O9.p> interfaceC0635a = this.f19263i0;
                if (interfaceC0635a != null) {
                    interfaceC0635a.invoke();
                }
                if (this.W) {
                    return true;
                }
                if (x()) {
                    com.sumsub.sns.core.presentation.base.a.a(this, false, new e0(null), 1, null);
                    InterfaceC0646l<? super Boolean, O9.p> interfaceC0646l = this.f19264j0;
                    if (interfaceC0646l != null) {
                        interfaceC0646l.invoke(Boolean.TRUE);
                    }
                    return true;
                }
                SNSViewState c10 = c();
                if (c10 instanceof SNSViewState.e) {
                    SNSViewState.e eVar2 = (SNSViewState.e) c10;
                    if (eVar2.V() == SNSViewState.VideoStepState.ERROR && eVar2.J() != SNSViewState.ErrorState.UPLOAD_ERROR) {
                        return true;
                    }
                }
                if (!c().isPreview()) {
                    if (cVar.b() != null) {
                        com.sumsub.sns.core.presentation.base.a.a(this, false, new f0(null), 1, null);
                    } else {
                        com.sumsub.sns.core.presentation.base.a.a(this, false, new g0(null), 1, null);
                    }
                }
                return true;
            }
            if (!(sNSVideoChatState instanceof SNSVideoChatState.f)) {
                return false;
            }
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).w(SNSVideoIdent.logTag, "reconnecting", ((SNSVideoChatState.f) sNSVideoChatState).a());
            SNSViewState c11 = c();
            SNSViewState.e eVar3 = c11 instanceof SNSViewState.e ? (SNSViewState.e) c11 : null;
            if (eVar3 != null) {
                a(eVar3);
            }
        }
        return true;
    }

    public final void a(SNSViewState.e eVar) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new i1(eVar, null), 1, null);
    }

    public final void a(PhoneVerificationStatus phoneVerificationStatus) {
        int i9 = d.f19289b[phoneVerificationStatus.ordinal()];
        if (i9 == 1) {
            this.f19250N.sendMessage(new SNSMessage.ClientMessage.f());
            return;
        }
        if (i9 == 2) {
            this.f19250N.sendMessage(new SNSMessage.ClientMessage.h());
        } else if (i9 == 3) {
            this.f19250N.sendMessage(new SNSMessage.ClientMessage.b());
        } else {
            if (i9 != 4) {
                return;
            }
            this.f19250N.sendMessage(new SNSMessage.ClientMessage.g());
        }
    }

    public final void a(SNSMessage.ServerMessage.m mVar) {
        if (this.f19268n0 != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleMakeScreenshot: skipping. Upload is in progress", null, 4, null);
            return;
        }
        d0();
        this.f19257c0 = null;
        b(mVar.d());
        this.f19250N.makePhoto();
    }

    public final void a(SNSMessage.ServerMessage.o oVar) {
        String str;
        if (this.f19268n0 != null) {
            com.sumsub.sns.internal.videoident.videoident.a.a(SNSVideoIdent.logTag, "handleReadyForScreenshot: skipping. Upload is in progress", null, 4, null);
            return;
        }
        b(oVar.d());
        com.sumsub.sns.internal.videoident.presentation.c cVar = com.sumsub.sns.internal.videoident.presentation.c.f19224a;
        b.c h9 = h();
        SNSMessage.ServerMessage.ScreenShotPayload I10 = I();
        if (I10 == null || (str = I10.h()) == null) {
            str = "";
        }
        IdentitySide.Companion companion = IdentitySide.INSTANCE;
        SNSMessage.ServerMessage.ScreenShotPayload I11 = I();
        IdentitySide a10 = companion.a(I11 != null ? I11.j() : null);
        if (a10 == null) {
            a10 = IdentitySide.Front;
        }
        SNSMessage.ServerMessage.ScreenShotPayload I12 = I();
        c.a a11 = cVar.a(h9, str, a10, I12 != null ? I12.l() : null);
        String value = SNSMessage.ServerMessage.ScreenShotPayload.Variant.UPLOAD.getValue();
        SNSMessage.ServerMessage.ScreenShotPayload I13 = I();
        if (kotlin.jvm.internal.f.b(value, I13 != null ? I13.n() : null)) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new s(a11, null), 1, null);
        } else {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new t(a11, null), 1, null);
        }
    }

    public final void a(SNSMessage.ServerMessage.n nVar) {
        com.sumsub.sns.internal.videoident.presentation.e O6;
        d(nVar.d().b());
        SNSViewState c2 = c();
        if ((c2 instanceof SNSViewState.e) && (O6 = ((SNSViewState.e) c2).O()) != null && O6.f()) {
            com.sumsub.sns.core.presentation.base.a.a(this, false, new n(c2, this, null), 1, null);
        }
    }

    public final void a(Boolean bool) {
        r();
        boolean z10 = true;
        e(true);
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            List<Document> w2 = w();
            if (!(w2 instanceof Collection) || !w2.isEmpty()) {
                Iterator<T> it = w2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!((Document) it.next()).isSubmitted()) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        d(z10);
        this.f19250N.disconnect();
    }

    public final void a(Bitmap bitmap) {
        Job launch$default;
        r();
        if (bitmap != this.f19256b0) {
            d0();
        }
        this.f19256b0 = bitmap;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f23175a = true;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f19253Q, null, null, new n0(bitmap, ref$BooleanRef, null), 3, null);
        this.f19268n0 = launch$default;
        launch$default.invokeOnCompletion(new o0(ref$BooleanRef));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r16, java.io.File r17, T9.a<? super O9.p> r18) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.videoident.presentation.h.a(java.lang.String, java.io.File, T9.a):java.lang.Object");
    }

    public final void a(com.sumsub.sns.internal.core.data.source.applicant.remote.h0 h0Var) {
        com.sumsub.sns.internal.core.data.source.applicant.remote.i0 c2;
        String b9;
        String e10 = h0Var.e();
        if (e10 == null || (c2 = h0Var.c()) == null || (b9 = c2.b()) == null) {
            return;
        }
        this.f19250N.connectToRoom(e10, b9);
    }

    public final void a(Uri uri) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new k(uri, null), 3, null);
    }
}
