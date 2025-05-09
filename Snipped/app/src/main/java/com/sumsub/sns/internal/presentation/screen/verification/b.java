package com.sumsub.sns.internal.presentation.screen.verification;

import C.v;
import P9.s;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.ApplicantStatus;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.ReviewAnswerType;
import com.sumsub.sns.internal.core.data.model.ReviewRejectType;
import com.sumsub.sns.internal.core.data.model.ReviewStatusType;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.t;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.presentation.screen.verification.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.core.presentation.base.a<com.sumsub.sns.internal.presentation.screen.verification.d> {

    /* renamed from: y, reason: collision with root package name */
    public static final a f18892y = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f18893q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.n f18894r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f18895s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f18896t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.extensions.a f18897u;

    /* renamed from: v, reason: collision with root package name */
    public com.sumsub.sns.internal.core.data.model.g f18898v;

    /* renamed from: w, reason: collision with root package name */
    public List<Document> f18899w;

    /* renamed from: x, reason: collision with root package name */
    public ApplicantStatus f18900x;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.sumsub.sns.internal.presentation.screen.verification.b$b, reason: collision with other inner class name */
    public static final class C0346b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18901a;

        public C0346b(String str) {
            this.f18901a = str;
        }

        public final String b() {
            return this.f18901a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0346b) && kotlin.jvm.internal.f.b(this.f18901a, ((C0346b) obj).f18901a);
        }

        public int hashCode() {
            return this.f18901a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("ShowAgreementEvent(text="), this.f18901a, ')');
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18902a;

        static {
            int[] iArr = new int[ReviewStatusType.values().length];
            iArr[ReviewStatusType.Completed.ordinal()] = 1;
            iArr[ReviewStatusType.Queued.ordinal()] = 2;
            iArr[ReviewStatusType.Pending.ordinal()] = 3;
            f18902a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel", f = "SNSApplicantStatusViewModel.kt", l = {364, 365, 367, 377, 378, 379}, m = "buildVideoIdentState")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18903a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18904b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18905c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18906d;

        /* renamed from: e, reason: collision with root package name */
        public Object f18907e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f18908f;

        /* renamed from: h, reason: collision with root package name */
        public int f18910h;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18908f = obj;
            this.f18910h |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel", f = "SNSApplicantStatusViewModel.kt", l = {113, 116}, m = "checkDocuments")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18911a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18912b;

        /* renamed from: d, reason: collision with root package name */
        public int f18914d;

        public e(T9.a<? super e> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18912b = obj;
            this.f18914d |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel", f = "SNSApplicantStatusViewModel.kt", l = {344, 345}, m = "createVideoIdentificationViewItem")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18915a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18916b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18917c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f18918d;

        /* renamed from: f, reason: collision with root package name */
        public int f18920f;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18918d = obj;
            this.f18920f |= Integer.MIN_VALUE;
            return b.this.a((List<Document>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$onContinueClicked$1", f = "SNSApplicantStatusViewModel.kt", l = {526, 527, 528}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18921a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.g f18923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.sumsub.sns.internal.core.data.model.g gVar, T9.a<? super g> aVar) {
            super(2, aVar);
            this.f18923c = gVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new g(this.f18923c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<com.sumsub.sns.internal.core.data.model.d> c2;
            com.sumsub.sns.internal.core.data.model.d dVar;
            com.sumsub.sns.internal.core.data.model.b c10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18921a;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = b.this;
                this.f18921a = 1;
                obj = bVar.e(this);
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
                        ((Result) obj).getClass();
                        return O9.p.f3034a;
                    }
                    kotlin.b.b(obj);
                    c2 = ((b.c) obj).c();
                    if (c2 != null || (dVar = (com.sumsub.sns.internal.core.data.model.d) s.L(c2)) == null || (c10 = dVar.c()) == null) {
                        return O9.p.f3034a;
                    }
                    com.sumsub.sns.internal.core.domain.n nVar = b.this.f18894r;
                    com.sumsub.sns.internal.core.data.source.applicant.b bVar2 = b.this.f18896t;
                    com.sumsub.sns.internal.core.data.model.g gVar = this.f18923c;
                    this.f18921a = 3;
                    if (com.sumsub.sns.internal.core.domain.n.a(nVar, bVar2, gVar, c10, false, this, 8, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return O9.p.f3034a;
                }
                kotlin.b.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                b bVar3 = b.this;
                this.f18921a = 2;
                obj = bVar3.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c2 = ((b.c) obj).c();
                if (c2 != null) {
                }
                return O9.p.f3034a;
            }
            return O9.p.f3034a;
        }
    }

    public static final class h extends Lambda implements InterfaceC0646l<Document, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f18924a = new h();

        public h() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Document document) {
            return document.getType().c();
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$onPrepare$2", f = "SNSApplicantStatusViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18925a;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$onPrepare$2$1", f = "SNSApplicantStatusViewModel.kt", l = {83, 84}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18927a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f18928b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f18929c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18929c = bVar;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(b.a aVar, T9.a<? super O9.p> aVar2) {
                return ((a) create(aVar, aVar2)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f18929c, aVar);
                aVar2.f18928b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.a aVar;
                List<Document> list;
                List<Document> X;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f18927a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    aVar = (b.a) this.f18928b;
                    com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSApplicantStatusViewModel", "Data repo updated", null, 4, null);
                    Throwable k3 = aVar != null ? aVar.k() : null;
                    if (k3 != null) {
                        if (this.f18929c.c() instanceof d.c) {
                            this.f18929c.b(k3);
                        }
                        return O9.p.f3034a;
                    }
                    if (aVar == null) {
                        return O9.p.f3034a;
                    }
                    com.sumsub.sns.internal.core.data.source.dynamic.b bVar = this.f18929c.f18895s;
                    this.f18928b = aVar;
                    this.f18927a = 1;
                    obj = com.sumsub.sns.internal.core.data.source.dynamic.b.e(bVar, false, this, 1, null);
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
                    aVar = (b.a) this.f18928b;
                    kotlin.b.b(obj);
                }
                com.sumsub.sns.internal.core.data.model.g gVar = (com.sumsub.sns.internal.core.data.model.g) ((com.sumsub.sns.internal.core.data.source.dynamic.e) obj).d();
                b bVar2 = this.f18929c;
                com.sumsub.sns.internal.core.data.model.e d10 = aVar.i().d();
                t d11 = aVar.j().d();
                if (d11 == null || (list = d11.d()) == null) {
                    list = null;
                } else if (gVar != null && (X = s.X(list, new com.sumsub.sns.internal.core.data.model.m(gVar))) != null) {
                    list = X;
                }
                this.f18928b = null;
                this.f18927a = 2;
                if (bVar2.a(d10, gVar, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return O9.p.f3034a;
            }
        }

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((i) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new i(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18925a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b0.b(b.this.f18895s.b(), C0552s.b(b.this), new a(b.this, null));
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$onTermsLinksClicked$1", f = "SNSApplicantStatusViewModel.kt", l = {487, 488, 497, 498}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18930a;

        /* renamed from: b, reason: collision with root package name */
        public int f18931b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18932c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f18933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, b bVar, T9.a<? super j> aVar) {
            super(2, aVar);
            this.f18932c = str;
            this.f18933d = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((j) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new j(this.f18932c, this.f18933d, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0111 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:10:0x0103, B:14:0x010b, B:16:0x0111, B:20:0x0117, B:22:0x011d, B:27:0x002c, B:28:0x00e5, B:32:0x00ec, B:34:0x00f2, B:39:0x0035, B:40:0x0083, B:43:0x0089, B:45:0x008f, B:46:0x009b, B:48:0x00a1, B:50:0x0039, B:51:0x006d, B:54:0x0072, B:59:0x0040, B:66:0x0138, B:67:0x0056, B:70:0x0060, B:73:0x00a8, B:76:0x00b2, B:78:0x00be, B:80:0x00c6, B:83:0x00d0, B:85:0x00d6, B:89:0x0128, B:91:0x0130), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0117 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:10:0x0103, B:14:0x010b, B:16:0x0111, B:20:0x0117, B:22:0x011d, B:27:0x002c, B:28:0x00e5, B:32:0x00ec, B:34:0x00f2, B:39:0x0035, B:40:0x0083, B:43:0x0089, B:45:0x008f, B:46:0x009b, B:48:0x00a1, B:50:0x0039, B:51:0x006d, B:54:0x0072, B:59:0x0040, B:66:0x0138, B:67:0x0056, B:70:0x0060, B:73:0x00a8, B:76:0x00b2, B:78:0x00be, B:80:0x00c6, B:83:0x00d0, B:85:0x00d6, B:89:0x0128, B:91:0x0130), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:10:0x0103, B:14:0x010b, B:16:0x0111, B:20:0x0117, B:22:0x011d, B:27:0x002c, B:28:0x00e5, B:32:0x00ec, B:34:0x00f2, B:39:0x0035, B:40:0x0083, B:43:0x0089, B:45:0x008f, B:46:0x009b, B:48:0x00a1, B:50:0x0039, B:51:0x006d, B:54:0x0072, B:59:0x0040, B:66:0x0138, B:67:0x0056, B:70:0x0060, B:73:0x00a8, B:76:0x00b2, B:78:0x00be, B:80:0x00c6, B:83:0x00d0, B:85:0x00d6, B:89:0x0128, B:91:0x0130), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x009b A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:10:0x0103, B:14:0x010b, B:16:0x0111, B:20:0x0117, B:22:0x011d, B:27:0x002c, B:28:0x00e5, B:32:0x00ec, B:34:0x00f2, B:39:0x0035, B:40:0x0083, B:43:0x0089, B:45:0x008f, B:46:0x009b, B:48:0x00a1, B:50:0x0039, B:51:0x006d, B:54:0x0072, B:59:0x0040, B:66:0x0138, B:67:0x0056, B:70:0x0060, B:73:0x00a8, B:76:0x00b2, B:78:0x00be, B:80:0x00c6, B:83:0x00d0, B:85:0x00d6, B:89:0x0128, B:91:0x0130), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$showInitialStatus$2", f = "SNSApplicantStatusViewModel.kt", l = {444, 447, 448, 449, 450, 452, 457}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.presentation.screen.verification.d, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18934a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18935b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18936c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18937d;

        /* renamed from: e, reason: collision with root package name */
        public int f18938e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.presentation.helper.b f18939f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f18940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.sumsub.sns.internal.core.presentation.helper.b bVar, b bVar2, T9.a<? super k> aVar) {
            super(2, aVar);
            this.f18939f = bVar;
            this.f18940g = bVar2;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.presentation.screen.verification.d dVar, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d> aVar) {
            return ((k) create(dVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new k(this.f18939f, this.f18940g, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0128 A[LOOP:0: B:13:0x0122->B:15:0x0128, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0162 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.CharSequence] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel", f = "SNSApplicantStatusViewModel.kt", l = {192, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 200, 207, Primes.SMALL_FACTOR_LIMIT, 220, BERTags.FLAGS, 228, 232, 233, 234, 273, 298, 299, 300, 308, 309, 310}, m = "showReviewedStatus")
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18941a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18942b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18943c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18944d;

        /* renamed from: e, reason: collision with root package name */
        public Object f18945e;

        /* renamed from: f, reason: collision with root package name */
        public Object f18946f;

        /* renamed from: g, reason: collision with root package name */
        public Object f18947g;

        /* renamed from: h, reason: collision with root package name */
        public Object f18948h;
        public /* synthetic */ Object i;

        /* renamed from: k, reason: collision with root package name */
        public int f18950k;

        public l(T9.a<? super l> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.f18950k |= Integer.MIN_VALUE;
            return b.this.b((com.sumsub.sns.internal.core.presentation.helper.b) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$showReviewedStatus$2", f = "SNSApplicantStatusViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class m extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.presentation.screen.verification.d, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18951a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.presentation.screen.verification.d f18952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.sumsub.sns.internal.presentation.screen.verification.d dVar, T9.a<? super m> aVar) {
            super(2, aVar);
            this.f18952b = dVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.presentation.screen.verification.d dVar, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d> aVar) {
            return ((m) create(dVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new m(this.f18952b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18951a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return this.f18952b;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$showReviewingStatus$1", f = "SNSApplicantStatusViewModel.kt", l = {406, 409, 410, 411}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.presentation.screen.verification.d, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18953a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18954b;

        /* renamed from: c, reason: collision with root package name */
        public int f18955c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.presentation.helper.b f18957e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.sumsub.sns.internal.core.presentation.helper.b bVar, T9.a<? super n> aVar) {
            super(2, aVar);
            this.f18957e = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.presentation.screen.verification.d dVar, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d> aVar) {
            return ((n) create(dVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return b.this.new n(this.f18957e, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00c0 A[LOOP:0: B:9:0x00ba->B:11:0x00c0, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel$showSubmittingStatus$1", f = "SNSApplicantStatusViewModel.kt", l = {425, 428, 429, 430, 434}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0650p<com.sumsub.sns.internal.presentation.screen.verification.d, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18958a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18959b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18960c;

        /* renamed from: d, reason: collision with root package name */
        public Object f18961d;

        /* renamed from: e, reason: collision with root package name */
        public int f18962e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.presentation.helper.b f18963f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f18964g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.sumsub.sns.internal.core.presentation.helper.b bVar, b bVar2, T9.a<? super o> aVar) {
            super(2, aVar);
            this.f18963f = bVar;
            this.f18964g = bVar2;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.sumsub.sns.internal.presentation.screen.verification.d dVar, T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d> aVar) {
            return ((o) create(dVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new o(this.f18963f, this.f18964g, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00de A[LOOP:0: B:16:0x00d8->B:18:0x00de, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x011b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.verification.SNSApplicantStatusViewModel", f = "SNSApplicantStatusViewModel.kt", l = {464, 466}, m = "skipAgreementSigning")
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18965a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18966b;

        /* renamed from: d, reason: collision with root package name */
        public int f18968d;

        public p(T9.a<? super p> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18966b = obj;
            this.f18968d |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    public b(com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.domain.n nVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.data.source.applicant.b bVar2, com.sumsub.sns.internal.core.data.source.extensions.a aVar2) {
        super(aVar, bVar);
        this.f18893q = aVar;
        this.f18894r = nVar;
        this.f18895s = bVar;
        this.f18896t = bVar2;
        this.f18897u = aVar2;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.verification.d e() {
        return com.sumsub.sns.internal.presentation.screen.verification.d.f18970f.a();
    }

    public final void q() {
        ApplicantStatus applicantStatus = this.f18900x;
        if (applicantStatus == null) {
            return;
        }
        if (applicantStatus == ApplicantStatus.Submitting) {
            com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false, 1, null), (Object) null, (Long) null, 6, (Object) null);
            return;
        }
        SNSEventHandler eventHandler = e0.f15081a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(SNSEvent.UserStartedVerification.INSTANCE);
        }
        com.sumsub.sns.internal.core.data.model.g gVar = this.f18898v;
        if (gVar == null) {
            return;
        }
        com.sumsub.sns.core.presentation.base.a.a(this, new q.b(false, 1, null), (Object) null, (Long) null, 6, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), NonCancellable.INSTANCE, null, new g(gVar, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super com.sumsub.sns.internal.presentation.screen.verification.d.e> r14) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.d(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.sumsub.sns.internal.presentation.screen.verification.b.p
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.presentation.screen.verification.b$p r0 = (com.sumsub.sns.internal.presentation.screen.verification.b.p) r0
            int r1 = r0.f18968d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18968d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.verification.b$p r0 = new com.sumsub.sns.internal.presentation.screen.verification.b$p
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18966b
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r0.f18968d
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L3a
            if (r1 == r9) goto L32
            if (r1 != r8) goto L2a
            kotlin.b.b(r11)
            goto L7a
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            java.lang.Object r1 = r0.f18965a
            com.sumsub.sns.internal.presentation.screen.verification.b r1 = (com.sumsub.sns.internal.presentation.screen.verification.b) r1
            kotlin.b.b(r11)
            goto L5c
        L3a:
            kotlin.b.b(r11)
            com.sumsub.sns.internal.ff.a r11 = com.sumsub.sns.internal.ff.a.f16930a
            com.sumsub.sns.internal.ff.core.a r11 = r11.w()
            boolean r11 = r11.g()
            if (r11 != 0) goto L8f
            com.sumsub.sns.internal.core.data.source.dynamic.b r1 = r10.f18895s
            r0.f18965a = r10
            r0.f18968d = r9
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = r0
            java.lang.Object r11 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r1, r2, r3, r4, r5, r6)
            if (r11 != r7) goto L5b
            return r7
        L5b:
            r1 = r10
        L5c:
            com.sumsub.sns.internal.core.data.source.dynamic.e r11 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r11
            java.lang.Object r11 = r11.d()
            com.sumsub.sns.internal.core.data.model.g r11 = (com.sumsub.sns.internal.core.data.model.g) r11
            r2 = 0
            if (r11 == 0) goto L6c
            com.sumsub.sns.internal.core.data.model.b r11 = r11.r()
            goto L6d
        L6c:
            r11 = r2
        L6d:
            if (r11 != 0) goto L8f
            r0.f18965a = r2
            r0.f18968d = r8
            java.lang.Object r11 = r1.b(r0)
            if (r11 != r7) goto L7a
            return r7
        L7a:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r11 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r11
            java.util.List r11 = r11.c()
            r0 = 0
            if (r11 == 0) goto L88
            int r11 = r11.size()
            goto L89
        L88:
            r11 = r0
        L89:
            if (r11 > r9) goto L8f
            if (r11 != 0) goto L8e
            goto L8f
        L8e:
            r9 = r0
        L8f:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.e(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super O9.p> aVar) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new i(null), 3, null);
        return O9.p.f3034a;
    }

    public final void b(Throwable th) {
        com.sumsub.sns.core.c.f14016a.a("SNSApplicantStatusViewModel", "Error when getting data...", th);
        com.sumsub.sns.core.presentation.base.a.a(this, th, DocumentType.f15253j, (Object) null, 4, (Object) null);
    }

    public final void c(com.sumsub.sns.internal.core.presentation.helper.b bVar) {
        b(false);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new n(bVar, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x04ee, code lost:
    
        if (r1 != null) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0645 A[LOOP:0: B:15:0x063f->B:17:0x0645, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x052b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x05b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0599 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x061b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0601 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0300 A[LOOP:2: B:82:0x02fa->B:84:0x0300, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.sumsub.sns.internal.core.presentation.helper.b r31, T9.a<? super O9.p> r32) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.b(com.sumsub.sns.internal.core.presentation.helper.b, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.e r12, com.sumsub.sns.internal.core.data.model.g r13, java.util.List<com.sumsub.sns.internal.core.data.model.Document> r14, T9.a<? super O9.p> r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.a(com.sumsub.sns.internal.core.data.model.e, com.sumsub.sns.internal.core.data.model.g, java.util.List, T9.a):java.lang.Object");
    }

    public final void d(com.sumsub.sns.internal.core.presentation.helper.b bVar) {
        b(false);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new o(bVar, this, null), 1, null);
    }

    public final com.sumsub.sns.internal.core.presentation.helper.b a(com.sumsub.sns.internal.core.data.model.e eVar, com.sumsub.sns.internal.core.data.model.g gVar, List<Document> list) {
        ApplicantStatus applicantStatus;
        if (eVar == null || gVar == null || list == null || list.isEmpty()) {
            return null;
        }
        com.sumsub.sns.core.c cVar = com.sumsub.sns.core.c.f14016a;
        com.sumsub.sns.core.c.b(cVar, "SNSApplicantStatusViewModel", "On Load Data Success for applicant: " + gVar.B(), null, 4, null);
        com.sumsub.sns.core.c.b(cVar, "SNSApplicantStatusViewModel", "Review status: " + gVar.J().p() + " result=" + gVar.J().o(), null, 4, null);
        int i9 = c.f18902a[gVar.J().p().ordinal()];
        if (i9 == 1) {
            g.d.a o10 = gVar.J().o();
            if ((o10 != null ? o10.i() : null) != ReviewAnswerType.Green) {
                g.d.a o11 = gVar.J().o();
                if ((o11 != null ? o11.j() : null) != ReviewRejectType.Final) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (!((Document) it.next()).isReviewing()) {
                                if (com.sumsub.sns.internal.core.data.model.f.h(eVar)) {
                                    applicantStatus = ApplicantStatus.Skip;
                                } else {
                                    applicantStatus = ApplicantStatus.Reviewed;
                                }
                            }
                        }
                    }
                    applicantStatus = ApplicantStatus.Reviewing;
                }
            }
            applicantStatus = com.sumsub.sns.internal.core.data.model.f.b(eVar) ? ApplicantStatus.Skip : ApplicantStatus.Reviewed;
        } else if (i9 != 2 && i9 != 3) {
            boolean z10 = list instanceof Collection;
            if (!z10 || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!(!((Document) it2.next()).isSubmitted())) {
                        if (!z10 || !list.isEmpty()) {
                            Iterator<T> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                if (!((Document) it3.next()).isSubmitted()) {
                                    if (!z10 || !list.isEmpty()) {
                                        Iterator<T> it4 = list.iterator();
                                        while (it4.hasNext()) {
                                            if (((Document) it4.next()).isSubmitted()) {
                                                applicantStatus = ApplicantStatus.Submitting;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        applicantStatus = ApplicantStatus.Reviewing;
                    }
                }
            }
            applicantStatus = ApplicantStatus.None;
        } else if (com.sumsub.sns.internal.core.data.model.f.d(eVar) && !gVar.A()) {
            applicantStatus = ApplicantStatus.Skip;
        } else {
            applicantStatus = ApplicantStatus.Reviewing;
        }
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSApplicantStatusViewModel", "Show screen for the following documents: " + s.P(list, null, null, null, h.f18924a, 31) + ". Status: " + applicantStatus.name(), null, 4, null);
        return new com.sumsub.sns.internal.core.presentation.helper.b(applicantStatus, gVar, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List<com.sumsub.sns.internal.core.data.model.Document> r11, T9.a<? super com.sumsub.sns.internal.core.presentation.base.adapter.c> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.internal.presentation.screen.verification.b.f
            if (r0 == 0) goto L13
            r0 = r12
            com.sumsub.sns.internal.presentation.screen.verification.b$f r0 = (com.sumsub.sns.internal.presentation.screen.verification.b.f) r0
            int r1 = r0.f18920f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18920f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.verification.b$f r0 = new com.sumsub.sns.internal.presentation.screen.verification.b$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f18918d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18920f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r11 = r0.f18917c
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r1 = r0.f18916b
            com.sumsub.sns.internal.core.widget.SNSStepState r1 = (com.sumsub.sns.internal.core.widget.SNSStepState) r1
            java.lang.Object r0 = r0.f18915a
            java.util.List r0 = (java.util.List) r0
            kotlin.b.b(r12)
            r5 = r11
            r4 = r1
            goto L88
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            java.lang.Object r11 = r0.f18917c
            com.sumsub.sns.internal.core.widget.SNSStepState r11 = (com.sumsub.sns.internal.core.widget.SNSStepState) r11
            java.lang.Object r2 = r0.f18916b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f18915a
            com.sumsub.sns.internal.presentation.screen.verification.b r4 = (com.sumsub.sns.internal.presentation.screen.verification.b) r4
            kotlin.b.b(r12)
            r9 = r2
            r2 = r11
            r11 = r9
            goto L6d
        L53:
            kotlin.b.b(r12)
            com.sumsub.sns.internal.core.widget.SNSStepState r12 = com.sumsub.sns.internal.core.widget.SNSStepState.REJECTED
            r0.f18915a = r10
            r0.f18916b = r11
            r0.f18917c = r12
            r0.f18920f = r4
            java.lang.String r2 = "sns_step_VIDEO_IDENT_title"
            java.lang.Object r2 = r10.a(r2, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r10
            r9 = r2
            r2 = r12
            r12 = r9
        L6d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L73
            java.lang.String r12 = ""
        L73:
            r0.f18915a = r11
            r0.f18916b = r2
            r0.f18917c = r12
            r0.f18920f = r3
            java.lang.String r3 = "sns_iddoc_status_notSubmitted"
            java.lang.Object r0 = r4.a(r3, r0)
            if (r0 != r1) goto L84
            return r1
        L84:
            r5 = r12
            r12 = r0
            r4 = r2
            r0 = r11
        L88:
            r6 = r12
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo r8 = new com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo
            com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo$Type r11 = com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo.Type.VIDEO_IDENTIFICATION
            java.lang.Object r12 = P9.s.J(r0)
            com.sumsub.sns.internal.core.data.model.Document r12 = (com.sumsub.sns.internal.core.data.model.Document) r12
            r8.<init>(r11, r12)
            com.sumsub.sns.internal.core.presentation.base.adapter.c r11 = new com.sumsub.sns.internal.core.presentation.base.adapter.c
            r7 = 1
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.verification.b.a(java.util.List, T9.a):java.lang.Object");
    }

    public final boolean a(com.sumsub.sns.internal.core.presentation.helper.b bVar) {
        List<String> j10;
        List<Document> e10 = bVar.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e10) {
            Document document = (Document) obj;
            if (bVar.d().I().k() && ((j10 = bVar.d().I().j()) == null || !j10.contains(document.getType().c()))) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Document) it.next()).isSubmitted()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object a(com.sumsub.sns.internal.core.presentation.helper.b bVar, T9.a<? super O9.p> aVar) {
        b(false);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new k(bVar, this, null), 1, null);
        return O9.p.f3034a;
    }

    public final void a(Document document) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSApplicantStatusViewModel", "onDocumentClick: " + document, null, 4, null);
        a(new a.m(document));
    }

    public final List<Document> a(List<Document> list, com.sumsub.sns.internal.core.data.model.g gVar) {
        ArrayList arrayList = new ArrayList();
        Document document = null;
        for (Document document2 : list) {
            if (!gVar.a(document2.getType().c())) {
                arrayList.add(document2);
            } else if (document == null) {
                document = new Document(new DocumentType(DocumentType.f15254k), document2.getResult());
            } else if (document2.isRejected() || ((document.isReviewing() && !document2.isReviewing()) || (document.isApproved() && !document2.isApproved()))) {
                document = Document.copy$default(document, null, document2.getResult(), 1, null);
            }
        }
        if (document != null) {
            arrayList.add(document);
        }
        return arrayList;
    }

    public final boolean b(com.sumsub.sns.internal.core.presentation.helper.b bVar) {
        if (bVar.d().I().k()) {
            List<Document> e10 = bVar.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e10) {
                Document document = (Document) obj;
                List<String> j10 = bVar.d().I().j();
                if (j10 != null && j10.contains(document.getType().c())) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Document) it.next()).isSubmitted()) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b(String str) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new j(str, this, null), 3, null);
    }
}
