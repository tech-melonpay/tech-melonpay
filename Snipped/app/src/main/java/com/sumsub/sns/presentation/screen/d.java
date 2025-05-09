package com.sumsub.sns.presentation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ca.InterfaceC0651q;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.SdkEvent;
import com.sumsub.sns.internal.core.common.u0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.ReviewStatusType;
import com.sumsub.sns.internal.core.data.model.SNSMessage;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.domain.model.a;
import com.sumsub.sns.internal.domain.g;
import com.sumsub.sns.presentation.screen.b;
import com.sumsub.sns.prooface.SNSProoface;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class d extends com.sumsub.sns.core.presentation.base.a<C0372d> {

    /* renamed from: L, reason: collision with root package name */
    public static final b f19715L;

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19716M;

    /* renamed from: A, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f19717A;

    /* renamed from: B, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f19718B;

    /* renamed from: C, reason: collision with root package name */
    public Job f19719C;

    /* renamed from: D, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f19720D;

    /* renamed from: E, reason: collision with root package name */
    public Document f19721E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f19722F;

    /* renamed from: G, reason: collision with root package name */
    public final MutableStateFlow<Boolean> f19723G;

    /* renamed from: H, reason: collision with root package name */
    public final MutableStateFlow<Integer> f19724H;

    /* renamed from: I, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f19725I;

    /* renamed from: J, reason: collision with root package name */
    public final Set<String> f19726J;

    /* renamed from: K, reason: collision with root package name */
    public final Flow<Boolean> f19727K;

    /* renamed from: q, reason: collision with root package name */
    public final G f19728q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.g f19729r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.domain.e f19730s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.n f19731t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f19732u;

    /* renamed from: v, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.settings.b f19733v;

    /* renamed from: w, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f19734w;

    /* renamed from: x, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.applicant.b f19735x;

    /* renamed from: y, reason: collision with root package name */
    public long f19736y;

    /* renamed from: z, reason: collision with root package name */
    public Job f19737z;

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements InterfaceC0650p<Boolean, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19738a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f19739b;

        @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$1$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.presentation.screen.d$a$a, reason: collision with other inner class name */
        public static final class C0371a extends SuspendLambda implements InterfaceC0650p<C0372d, T9.a<? super C0372d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19741a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f19742b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f19743c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0371a(boolean z10, T9.a<? super C0371a> aVar) {
                super(2, aVar);
                this.f19743c = z10;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C0372d c0372d, T9.a<? super C0372d> aVar) {
                return ((C0371a) create(c0372d, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                C0371a c0371a = new C0371a(this.f19743c, aVar);
                c0371a.f19742b = obj;
                return c0371a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f19741a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return C0372d.a((C0372d) this.f19742b, false, Boolean.valueOf(this.f19743c), false, null, null, 29, null);
            }
        }

        public a(T9.a<? super a> aVar) {
            super(2, aVar);
        }

        public final Object a(boolean z10, T9.a<? super O9.p> aVar) {
            return ((a) create(Boolean.valueOf(z10), aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            a aVar2 = d.this.new a(aVar);
            aVar2.f19739b = ((Boolean) obj).booleanValue();
            return aVar2;
        }

        @Override // ca.InterfaceC0650p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, T9.a<? super O9.p> aVar) {
            return a(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19738a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            boolean z10 = this.f19739b;
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Show progress = " + z10, null, 4, null);
            d.this.a(true, (InterfaceC0650p) new C0371a(z10, null));
            if (z10) {
                d.this.B();
            } else {
                d.this.p();
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {836, 837, 861, 879}, m = "resolveApplicantStatus")
    public static final class a0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19744a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19745b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19746c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19747d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19748e;

        /* renamed from: f, reason: collision with root package name */
        public int f19749f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f19750g;
        public int i;

        public a0(T9.a<? super a0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19750g = obj;
            this.i |= Integer.MIN_VALUE;
            return d.this.b(false, (T9.a<? super O9.p>) this);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$resolveApplicantStatusWithLevelChangeWaiting$1", f = "SNSAppViewModel.kt", l = {912}, m = "invokeSuspend")
    public static final class b0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19752a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.g f19754c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.e f19755d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f19756e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, boolean z10, T9.a<? super b0> aVar) {
            super(2, aVar);
            this.f19754c = gVar;
            this.f19755d = eVar;
            this.f19756e = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((b0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new b0(this.f19754c, this.f19755d, this.f19756e, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19752a;
            if (i == 0) {
                kotlin.b.b(obj);
                long j10 = d.this.f19736y;
                this.f19752a = 1;
                if (DelayKt.delay(j10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "level change did not happen", null, 4, null);
            d.this.q();
            d.this.a(this.f19754c, this.f19755d, false, this.f19756e);
            return O9.p.f3034a;
        }
    }

    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.domain.model.c f19757a;

        /* renamed from: b, reason: collision with root package name */
        public final Parcelable f19758b;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                return new c(com.sumsub.sns.internal.core.domain.model.c.CREATOR.createFromParcel(parcel), parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(com.sumsub.sns.internal.core.domain.model.c cVar, Parcelable parcelable) {
            this.f19757a = cVar;
            this.f19758b = parcelable;
        }

        public final com.sumsub.sns.internal.core.domain.model.c c() {
            return this.f19757a;
        }

        public final Parcelable d() {
            return this.f19758b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f19757a, cVar.f19757a) && kotlin.jvm.internal.f.b(this.f19758b, cVar.f19758b);
        }

        public int hashCode() {
            return this.f19758b.hashCode() + (this.f19757a.hashCode() * 31);
        }

        public String toString() {
            return "PendingInstructionsData(introParams=" + this.f19757a + ", payload=" + this.f19758b + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f19757a.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f19758b, i);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$resolveInstructions$1", f = "SNSAppViewModel.kt", l = {545, 546, 563}, m = "invokeSuspend")
    public static final class c0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19759a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19760b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19761c;

        /* renamed from: d, reason: collision with root package name */
        public int f19762d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19763e;

        /* renamed from: f, reason: collision with root package name */
        public int f19764f;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.domain.model.c f19766h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(com.sumsub.sns.internal.core.domain.model.c cVar, T9.a<? super c0> aVar) {
            super(2, aVar);
            this.f19766h = cVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((c0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new c0(this.f19766h, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x011e A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.c0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.sumsub.sns.presentation.screen.d$d, reason: collision with other inner class name */
    public static final class C0372d implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19767a;

        /* renamed from: b, reason: collision with root package name */
        public final Boolean f19768b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f19769c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f19770d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f19771e;

        public C0372d() {
            this(false, null, false, null, null, 31, null);
        }

        public final C0372d a(boolean z10, Boolean bool, boolean z11, CharSequence charSequence, CharSequence charSequence2) {
            return new C0372d(z10, bool, z11, charSequence, charSequence2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0372d)) {
                return false;
            }
            C0372d c0372d = (C0372d) obj;
            return this.f19767a == c0372d.f19767a && kotlin.jvm.internal.f.b(this.f19768b, c0372d.f19768b) && this.f19769c == c0372d.f19769c && kotlin.jvm.internal.f.b(this.f19770d, c0372d.f19770d) && kotlin.jvm.internal.f.b(this.f19771e, c0372d.f19771e);
        }

        public final boolean f() {
            return this.f19769c;
        }

        public final CharSequence g() {
            return this.f19771e;
        }

        public final CharSequence h() {
            return this.f19770d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z10 = this.f19767a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            Boolean bool = this.f19768b;
            int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
            boolean z11 = this.f19769c;
            int i9 = (hashCode + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            CharSequence charSequence = this.f19770d;
            int hashCode2 = (i9 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f19771e;
            return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        public final Boolean i() {
            return this.f19768b;
        }

        public final boolean j() {
            return this.f19767a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(isSdkPrepared=");
            sb2.append(this.f19767a);
            sb2.append(", isLoading=");
            sb2.append(this.f19768b);
            sb2.append(", loadingIsTooLong=");
            sb2.append(this.f19769c);
            sb2.append(", preparedText=");
            sb2.append((Object) this.f19770d);
            sb2.append(", loadingTooLongText=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f19771e, ')');
        }

        public C0372d(boolean z10, Boolean bool, boolean z11, CharSequence charSequence, CharSequence charSequence2) {
            this.f19767a = z10;
            this.f19768b = bool;
            this.f19769c = z11;
            this.f19770d = charSequence;
            this.f19771e = charSequence2;
        }

        public static /* synthetic */ C0372d a(C0372d c0372d, boolean z10, Boolean bool, boolean z11, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
            if ((i & 1) != 0) {
                z10 = c0372d.f19767a;
            }
            if ((i & 2) != 0) {
                bool = c0372d.f19768b;
            }
            Boolean bool2 = bool;
            if ((i & 4) != 0) {
                z11 = c0372d.f19769c;
            }
            boolean z12 = z11;
            if ((i & 8) != 0) {
                charSequence = c0372d.f19770d;
            }
            CharSequence charSequence3 = charSequence;
            if ((i & 16) != 0) {
                charSequence2 = c0372d.f19771e;
            }
            return c0372d.a(z10, bool2, z12, charSequence3, charSequence2);
        }

        public /* synthetic */ C0372d(boolean z10, Boolean bool, boolean z11, CharSequence charSequence, CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z10, (i & 2) != 0 ? null : bool, (i & 4) == 0 ? z11 : false, (i & 8) != 0 ? null : charSequence, (i & 16) != 0 ? null : charSequence2);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$scheduleSlowConnectionTimer$1", f = "SNSAppViewModel.kt", l = {CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19772a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19773b;

        @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$scheduleSlowConnectionTimer$1$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<C0372d, T9.a<? super C0372d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f19775a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f19776b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C0372d c0372d, T9.a<? super C0372d> aVar) {
                return ((a) create(c0372d, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f19776b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f19775a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return C0372d.a((C0372d) this.f19776b, false, null, true, null, null, 27, null);
            }
        }

        public d0(T9.a<? super d0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((d0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            d0 d0Var = d.this.new d0(aVar);
            d0Var.f19773b = obj;
            return d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19772a;
            if (i == 0) {
                kotlin.b.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f19773b;
                this.f19773b = coroutineScope2;
                this.f19772a = 1;
                if (DelayKt.delay(7000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f19773b;
                kotlin.b.b(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                com.sumsub.sns.core.presentation.base.a.a(d.this, false, new a(null), 1, null);
            }
            return O9.p.f3034a;
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19777a;

        static {
            int[] iArr = new int[FlowType.values().length];
            iArr[FlowType.Module.ordinal()] = 1;
            f19777a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$setDefaultSDKState$$inlined$launchOnViewModelScope$1", f = "SNSAppViewModel.kt", l = {444}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19778a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19779b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.core.presentation.base.a f19780c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f19781d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f19782e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(com.sumsub.sns.core.presentation.base.a aVar, String str, T9.a aVar2, d dVar) {
            super(2, aVar2);
            this.f19780c = aVar;
            this.f19781d = str;
            this.f19782e = dVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((e0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            e0 e0Var = new e0(this.f19780c, this.f19781d, aVar, this.f19782e);
            e0Var.f19779b = obj;
            return e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            SNSSDKState a10;
            com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.t> j10;
            com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g> g10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19778a;
            com.sumsub.sns.internal.core.data.model.t tVar = null;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    coroutineScope = (CoroutineScope) this.f19779b;
                    try {
                        StateFlow<b.a> b9 = this.f19782e.f19734w.b();
                        f0 f0Var = new f0(null);
                        this.f19779b = coroutineScope;
                        this.f19778a = 1;
                        Object first = FlowKt.first(b9, f0Var, this);
                        if (first == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        coroutineScope2 = coroutineScope;
                        obj = first;
                    } catch (CancellationException unused) {
                        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(coroutineScope), "CancellationException happened", null, 4, null);
                        return O9.p.f3034a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope2 = (CoroutineScope) this.f19779b;
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException unused2) {
                        coroutineScope = coroutineScope2;
                        Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(coroutineScope), "CancellationException happened", null, 4, null);
                        return O9.p.f3034a;
                    }
                }
                b.a aVar = (b.a) obj;
                com.sumsub.sns.internal.core.data.model.g d10 = (aVar == null || (g10 = aVar.g()) == null) ? null : g10.d();
                if (aVar != null && (j10 = aVar.j()) != null) {
                    tVar = j10.d();
                }
                if (d10 != null && tVar != null && (a10 = com.sumsub.sns.internal.core.data.model.k.a(d10, tVar.d())) != null) {
                    this.f19782e.f19732u.a(a10);
                }
            } catch (Exception e10) {
                com.sumsub.sns.core.presentation.base.a.a(this.f19780c, e10, this.f19781d, (Object) null, 4, (Object) null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$cancelSlowConnectionJob$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<C0372d, T9.a<? super C0372d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19783a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19784b;

        public f(T9.a<? super f> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0372d c0372d, T9.a<? super C0372d> aVar) {
            return ((f) create(c0372d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            f fVar = new f(aVar);
            fVar.f19784b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19783a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return C0372d.a((C0372d) this.f19784b, false, null, false, null, null, 27, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$setDefaultSDKState$1$data$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class f0 extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19785a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19786b;

        public f0(T9.a<? super f0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.a aVar, T9.a<? super Boolean> aVar2) {
            return ((f0) create(aVar, aVar2)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            f0 f0Var = new f0(aVar);
            f0Var.f19786b = obj;
            return f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.sumsub.sns.internal.core.data.source.dynamic.e<com.sumsub.sns.internal.core.data.model.g> g10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19785a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b.a aVar = (b.a) this.f19786b;
            return Boolean.valueOf((((aVar == null || (g10 = aVar.g()) == null) ? null : g10.d()) == null || aVar.j().d() == null) ? false : true);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {669, 675, 698}, m = "checkAgreementForAction")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19787a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19788b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19789c;

        /* renamed from: d, reason: collision with root package name */
        public Object f19790d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19791e;

        /* renamed from: g, reason: collision with root package name */
        public int f19793g;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19791e = obj;
            this.f19793g |= Integer.MIN_VALUE;
            return d.this.a((com.sumsub.sns.internal.core.data.model.g) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$setNetworkState$$inlined$launchOnViewModelScope$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class g0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19794a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19795b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.core.presentation.base.a f19796c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f19797d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f19798e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f19799f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(com.sumsub.sns.core.presentation.base.a aVar, String str, T9.a aVar2, d dVar, String str2) {
            super(2, aVar2);
            this.f19796c = aVar;
            this.f19797d = str;
            this.f19798e = dVar;
            this.f19799f = str2;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((g0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            g0 g0Var = new g0(this.f19796c, this.f19797d, aVar, this.f19798e, this.f19799f);
            g0Var.f19795b = obj;
            return g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19794a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f19795b;
            try {
                this.f19798e.f19733v.b(this.f19799f);
            } catch (CancellationException unused) {
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(coroutineScope), "CancellationException happened", null, 4, null);
            } catch (Exception e10) {
                com.sumsub.sns.core.presentation.base.a.a(this.f19796c, e10, this.f19797d, (Object) null, 4, (Object) null);
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$delayedFinish$$inlined$launchOnViewModelScope$1", f = "SNSAppViewModel.kt", l = {445, 446}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19800a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19801b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.core.presentation.base.a f19802c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f19803d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f19804e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.common.q f19805f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d f19806g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.sumsub.sns.core.presentation.base.a aVar, String str, T9.a aVar2, long j10, com.sumsub.sns.internal.core.common.q qVar, d dVar) {
            super(2, aVar2);
            this.f19802c = aVar;
            this.f19803d = str;
            this.f19804e = j10;
            this.f19805f = qVar;
            this.f19806g = dVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((h) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            h hVar = new h(this.f19802c, this.f19803d, aVar, this.f19804e, this.f19805f, this.f19806g);
            hVar.f19801b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = "Delayed finish for ";
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19800a;
            try {
                try {
                } catch (Exception e10) {
                    com.sumsub.sns.core.presentation.base.a.a(this.f19802c, e10, this.f19803d, (Object) null, 4, (Object) null);
                }
            } catch (CancellationException unused) {
            }
            if (i == 0) {
                kotlin.b.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f19801b;
                try {
                    com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Delayed finish for " + this.f19804e + " ms requested with reason " + this.f19805f, null, 4, null);
                    Job job = this.f19806g.f19737z;
                    if (job != null) {
                        this.f19801b = coroutineScope;
                        this.f19800a = 1;
                        if (job.join(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    obj2 = coroutineScope;
                } catch (CancellationException unused2) {
                    obj2 = coroutineScope;
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(obj2), "CancellationException happened", null, 4, null);
                    return O9.p.f3034a;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (CoroutineScope) this.f19801b;
                    kotlin.b.b(obj);
                    com.sumsub.sns.core.presentation.base.a.a(this.f19806g, this.f19805f, (Object) null, (Long) null, 6, (Object) null);
                    return O9.p.f3034a;
                }
                obj2 = (CoroutineScope) this.f19801b;
                kotlin.b.b(obj);
            }
            long j10 = this.f19804e;
            this.f19801b = obj2;
            this.f19800a = 2;
            if (DelayKt.delay(j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            com.sumsub.sns.core.presentation.base.a.a(this.f19806g, this.f19805f, (Object) null, (Long) null, 6, (Object) null);
            return O9.p.f3034a;
        }
    }

    public static final class h0 implements Flow<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f19807a;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f19808a;

            @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$special$$inlined$map$1$2", f = "SNSAppViewModel.kt", l = {BERTags.FLAGS}, m = "emit")
            /* renamed from: com.sumsub.sns.presentation.screen.d$h0$a$a, reason: collision with other inner class name */
            public static final class C0373a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f19809a;

                /* renamed from: b, reason: collision with root package name */
                public int f19810b;

                public C0373a(T9.a aVar) {
                    super(aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f19809a = obj;
                    this.f19810b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f19808a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, T9.a r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.sumsub.sns.presentation.screen.d.h0.a.C0373a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.sumsub.sns.presentation.screen.d$h0$a$a r0 = (com.sumsub.sns.presentation.screen.d.h0.a.C0373a) r0
                    int r1 = r0.f19810b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19810b = r1
                    goto L18
                L13:
                    com.sumsub.sns.presentation.screen.d$h0$a$a r0 = new com.sumsub.sns.presentation.screen.d$h0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f19809a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                    int r2 = r0.f19810b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    kotlin.b.b(r6)
                    goto L41
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    kotlin.b.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f19808a
                    kotlin.Pair r5 = (kotlin.Pair) r5
                    A r5 = r5.f23089a
                    r0.f19810b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    O9.p r5 = O9.p.f3034a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.h0.a.emit(java.lang.Object, T9.a):java.lang.Object");
            }
        }

        public h0(Flow flow) {
            this.f19807a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, T9.a aVar) {
            Object collect = this.f19807a.collect(new a(flowCollector), aVar);
            return collect == CoroutineSingletons.f23158a ? collect : O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {640, 647}, m = "handleAction")
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19812a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19813b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19814c;

        /* renamed from: e, reason: collision with root package name */
        public int f19816e;

        public i(T9.a<? super i> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19814c = obj;
            this.f19816e |= Integer.MIN_VALUE;
            return d.this.a((com.sumsub.sns.internal.core.data.model.g) null, (com.sumsub.sns.internal.core.data.model.e) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {613, 620, 618}, m = "handleFlowType")
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19817a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19818b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19819c;

        /* renamed from: e, reason: collision with root package name */
        public int f19821e;

        public j(T9.a<? super j> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19819c = obj;
            this.f19821e |= Integer.MIN_VALUE;
            return d.this.a((com.sumsub.sns.internal.core.data.model.g) null, (FlowType) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$launchWithProgress$1", f = "SNSAppViewModel.kt", l = {1038}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19822a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19823b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> f19824c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f19825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p, d dVar, T9.a<? super k> aVar) {
            super(2, aVar);
            this.f19824c = interfaceC0650p;
            this.f19825d = dVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((k) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            k kVar = new k(this.f19824c, this.f19825d, aVar);
            kVar.f19823b = obj;
            return kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19822a;
            try {
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f19823b;
                        InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> interfaceC0650p = this.f19824c;
                        this.f19822a = 1;
                        if (interfaceC0650p.invoke(coroutineScope, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    this.f19825d.f(false);
                } catch (CancellationException unused) {
                    com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "CancellationException happened", null, 4, null);
                    return O9.p.f3034a;
                } catch (Exception e10) {
                    com.sumsub.sns.core.presentation.base.a.a(this.f19825d, e10, DocumentType.f15253j, (Object) null, 4, (Object) null);
                    return O9.p.f3034a;
                }
                return O9.p.f3034a;
            } finally {
                this.f19825d.f(false);
            }
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$moveToNextDocument$1", f = "SNSAppViewModel.kt", l = {280, 287, 296, 308, 315, 321}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19826a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19827b;

        /* renamed from: c, reason: collision with root package name */
        public int f19828c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f19830e;

        public static final class a extends Lambda implements InterfaceC0646l<Document, CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f19831a = new a();

            public a() {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Document document) {
                return document.getType().c();
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19832a;

            static {
                int[] iArr = new int[FlowType.values().length];
                iArr[FlowType.Module.ordinal()] = 1;
                iArr[FlowType.Actions.ordinal()] = 2;
                f19832a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z10, T9.a<? super l> aVar) {
            super(2, aVar);
            this.f19830e = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((l) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new l(this.f19830e, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0179 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {368, 372, 391}, m = "moveToNextModuleDocument")
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19833a;

        /* renamed from: b, reason: collision with root package name */
        public Object f19834b;

        /* renamed from: c, reason: collision with root package name */
        public Object f19835c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19836d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19837e;

        /* renamed from: g, reason: collision with root package name */
        public int f19839g;

        public m(T9.a<? super m> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19837e = obj;
            this.f19839g |= Integer.MIN_VALUE;
            return d.this.b(null, null, false, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {1030}, m = "needSelectAgreement")
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f19840a;

        /* renamed from: c, reason: collision with root package name */
        public int f19842c;

        public n(T9.a<? super n> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19840a = obj;
            this.f19842c |= Integer.MIN_VALUE;
            return d.this.b((com.sumsub.sns.internal.core.data.model.g) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$observeData$1", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0651q<FlowCollector<? super SNSMessage.ServerMessage>, Throwable, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19843a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19844b;

        public o(T9.a<? super o> aVar) {
            super(3, aVar);
        }

        @Override // ca.InterfaceC0651q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super SNSMessage.ServerMessage> flowCollector, Throwable th, T9.a<? super O9.p> aVar) {
            o oVar = new o(aVar);
            oVar.f19844b = th;
            return oVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19843a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.core.c.a(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", String.valueOf(((Throwable) this.f19844b).getMessage()), null, 4, null);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$observeData$2", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements InterfaceC0650p<b.a, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19845a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19846b;

        public p(T9.a<? super p> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b.a aVar, T9.a<? super O9.p> aVar2) {
            return ((p) create(aVar, aVar2)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            p pVar = d.this.new p(aVar);
            pVar.f19846b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19845a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            d.this.a((b.a) this.f19846b);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onCancel$1", f = "SNSAppViewModel.kt", l = {440, 443}, m = "invokeSuspend")
    public static final class q extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19848a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSCompletionResult f19850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(SNSCompletionResult sNSCompletionResult, T9.a<? super q> aVar) {
            super(2, aVar);
            this.f19850c = sNSCompletionResult;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((q) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new q(this.f19850c, aVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:(1:(9:5|6|(1:8)|9|10|11|(1:13)|15|16)(2:23|24))(1:25))(2:37|(1:39))|26|(3:30|(1:32)|(4:34|(1:36)|6|(0)))|9|10|11|(0)|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
        
            r0 = com.sumsub.sns.core.c.f14016a;
            r1 = r11.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
        
            if (r1 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
        
            r1 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
        
            r0.a("SNSAppViewModel", r1, r11);
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00b4 A[Catch: Exception -> 0x00be, TRY_LEAVE, TryCatch #0 {Exception -> 0x00be, blocks: (B:11:0x00ac, B:13:0x00b4), top: B:10:0x00ac }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r10.f19848a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                kotlin.b.b(r11)
                goto L64
            L11:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L19:
                kotlin.b.b(r11)
                goto L30
            L1d:
                kotlin.b.b(r11)
                com.sumsub.sns.presentation.screen.d r11 = com.sumsub.sns.presentation.screen.d.this
                com.sumsub.sns.internal.core.data.source.dynamic.b r11 = com.sumsub.sns.presentation.screen.d.f(r11)
                r10.f19848a = r4
                r1 = 0
                java.lang.Object r11 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r11, r1, r10, r4, r2)
                if (r11 != r0) goto L30
                return r0
            L30:
                com.sumsub.sns.internal.core.data.source.dynamic.e r11 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r11
                java.lang.Object r11 = r11.d()
                com.sumsub.sns.internal.core.data.model.e r11 = (com.sumsub.sns.internal.core.data.model.e) r11
                if (r11 == 0) goto La0
                com.sumsub.sns.internal.core.data.model.e$a r11 = r11.r()
                if (r11 == 0) goto La0
                com.sumsub.sns.core.data.model.FlowActionType r1 = r11.d()
                com.sumsub.sns.core.data.model.FlowActionType$FaceEnrollment r5 = com.sumsub.sns.core.data.model.FlowActionType.FaceEnrollment.INSTANCE
                boolean r1 = kotlin.jvm.internal.f.b(r1, r5)
                r1 = r1 ^ r4
                if (r1 == 0) goto L4e
                r2 = r11
            L4e:
                if (r2 == 0) goto La0
                com.sumsub.sns.presentation.screen.d r11 = com.sumsub.sns.presentation.screen.d.this
                com.sumsub.sns.internal.core.data.source.dynamic.b r4 = com.sumsub.sns.presentation.screen.d.f(r11)
                r10.f19848a = r3
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = r10
                java.lang.Object r11 = com.sumsub.sns.internal.core.data.source.dynamic.b.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L64
                return r0
            L64:
                com.sumsub.sns.internal.core.data.source.dynamic.e r11 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r11
                java.lang.Object r11 = r11.d()
                com.sumsub.sns.internal.core.data.model.g r11 = (com.sumsub.sns.internal.core.data.model.g) r11
                if (r11 == 0) goto La0
                com.sumsub.sns.core.c r0 = com.sumsub.sns.core.c.f14016a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "handleActionCompleted: "
                r1.<init>(r2)
                java.lang.String r2 = r11.B()
                r1.append(r2)
                java.lang.String r2 = ", "
                r1.append(r2)
                java.lang.String r3 = r11.L()
                r1.append(r3)
                r1.append(r2)
                com.sumsub.sns.internal.core.data.model.ReviewStatusType r11 = r11.K()
                r1.append(r11)
                java.lang.String r2 = r1.toString()
                r4 = 4
                r5 = 0
                java.lang.String r1 = "SNSAppViewModel"
                r3 = 0
                com.sumsub.sns.core.c.b(r0, r1, r2, r3, r4, r5)
            La0:
                com.sumsub.sns.presentation.screen.d r11 = com.sumsub.sns.presentation.screen.d.this
                com.sumsub.sns.presentation.screen.b$b r0 = new com.sumsub.sns.presentation.screen.b$b
                com.sumsub.sns.core.data.model.SNSCompletionResult r1 = r10.f19850c
                r0.<init>(r1)
                r11.a(r0)
                com.sumsub.sns.core.SNSMobileSDK r11 = com.sumsub.sns.core.SNSMobileSDK.INSTANCE     // Catch: java.lang.Exception -> Lbe
                com.sumsub.sns.core.data.listener.SNSCompleteHandler r0 = r11.getCompleteHandler()     // Catch: java.lang.Exception -> Lbe
                if (r0 == 0) goto Lce
                com.sumsub.sns.core.data.model.SNSCompletionResult r1 = r10.f19850c     // Catch: java.lang.Exception -> Lbe
                com.sumsub.sns.core.data.model.SNSSDKState r11 = r11.getState()     // Catch: java.lang.Exception -> Lbe
                r0.onComplete(r1, r11)     // Catch: java.lang.Exception -> Lbe
                goto Lce
            Lbe:
                r11 = move-exception
                com.sumsub.sns.core.c r0 = com.sumsub.sns.core.c.f14016a
                java.lang.String r1 = r11.getMessage()
                if (r1 != 0) goto Lc9
                java.lang.String r1 = ""
            Lc9:
                java.lang.String r2 = "SNSAppViewModel"
                r0.a(r2, r1, r11)
            Lce:
                com.sumsub.sns.core.SNSMobileSDK r11 = com.sumsub.sns.core.SNSMobileSDK.INSTANCE
                r11.shutdown()
                O9.p r11 = O9.p.f3034a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onDocumentClicked$1", f = "SNSAppViewModel.kt", l = {413, 414, 426}, m = "invokeSuspend")
    public static final class r extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19851a;

        /* renamed from: b, reason: collision with root package name */
        public int f19852b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Document f19853c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f19854d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Document document, d dVar, T9.a<? super r> aVar) {
            super(2, aVar);
            this.f19853c = document;
            this.f19854d = dVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((r) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new r(this.f19853c, this.f19854d, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00ca A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r13.f19852b
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == 0) goto L2a
                if (r1 == r6) goto L26
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                kotlin.b.b(r14)
                goto Lcb
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                java.lang.Object r1 = r13.f19851a
                com.sumsub.sns.internal.core.data.model.g r1 = (com.sumsub.sns.internal.core.data.model.g) r1
                kotlin.b.b(r14)
                goto L78
            L26:
                kotlin.b.b(r14)
                goto L5e
            L2a:
                kotlin.b.b(r14)
                com.sumsub.sns.core.c r7 = com.sumsub.sns.core.c.f14016a
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                java.lang.String r1 = "A user has clicked on document: "
                r14.<init>(r1)
                com.sumsub.sns.internal.core.data.model.Document r1 = r13.f19853c
                com.sumsub.sns.internal.core.data.model.DocumentType r1 = r1.getType()
                java.lang.String r1 = r1.c()
                r14.append(r1)
                java.lang.String r9 = r14.toString()
                r11 = 4
                r12 = 0
                java.lang.String r8 = "SNSAppViewModel"
                r10 = 0
                com.sumsub.sns.core.c.b(r7, r8, r9, r10, r11, r12)
                com.sumsub.sns.presentation.screen.d r14 = r13.f19854d
                com.sumsub.sns.internal.core.data.source.dynamic.b r14 = com.sumsub.sns.presentation.screen.d.f(r14)
                r13.f19852b = r6
                java.lang.Object r14 = com.sumsub.sns.internal.core.data.source.dynamic.b.e(r14, r2, r13, r6, r5)
                if (r14 != r0) goto L5e
                return r0
            L5e:
                com.sumsub.sns.internal.core.data.source.dynamic.e r14 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r14
                java.lang.Object r14 = r14.e()
                r1 = r14
                com.sumsub.sns.internal.core.data.model.g r1 = (com.sumsub.sns.internal.core.data.model.g) r1
                com.sumsub.sns.presentation.screen.d r14 = r13.f19854d
                com.sumsub.sns.internal.core.data.source.dynamic.b r14 = com.sumsub.sns.presentation.screen.d.f(r14)
                r13.f19851a = r1
                r13.f19852b = r4
                java.lang.Object r14 = com.sumsub.sns.internal.core.data.source.dynamic.b.c(r14, r2, r13, r6, r5)
                if (r14 != r0) goto L78
                return r0
            L78:
                com.sumsub.sns.internal.core.data.source.dynamic.e r14 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r14
                java.lang.Object r14 = r14.e()
                com.sumsub.sns.internal.core.data.model.t r14 = (com.sumsub.sns.internal.core.data.model.t) r14
                java.util.List r14 = r14.d()
                com.sumsub.sns.internal.core.data.model.g$c r2 = r1.I()
                boolean r2 = r2.k()
                if (r2 == 0) goto Lae
                com.sumsub.sns.internal.core.data.model.g$c r2 = r1.I()
                java.util.List r2 = r2.j()
                if (r2 == 0) goto La9
                com.sumsub.sns.internal.core.data.model.Document r4 = r13.f19853c
                com.sumsub.sns.internal.core.data.model.DocumentType r4 = r4.getType()
                java.lang.String r4 = r4.c()
                boolean r2 = r2.contains(r4)
                if (r2 == 0) goto La9
                goto Lae
            La9:
                java.util.List r14 = com.sumsub.sns.internal.core.common.i.a(r14, r1)
                goto Lb4
            Lae:
                com.sumsub.sns.internal.core.data.model.Document r14 = r13.f19853c
                java.util.List r14 = java.util.Collections.singletonList(r14)
            Lb4:
                com.sumsub.sns.presentation.screen.d r2 = r13.f19854d
                com.sumsub.sns.internal.core.data.model.Document r4 = r13.f19853c
                com.sumsub.sns.internal.core.data.model.DocumentType r4 = r4.getType()
                boolean r4 = r4.m()
                r13.f19851a = r5
                r13.f19852b = r3
                java.lang.Object r14 = com.sumsub.sns.presentation.screen.d.a(r2, r1, r14, r4, r13)
                if (r14 != r0) goto Lcb
                return r0
            Lcb:
                O9.p r14 = O9.p.f3034a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onLoad$1", f = "SNSAppViewModel.kt", l = {204, 213}, m = "invokeSuspend")
    public static final class s extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19855a;

        public static final class a extends Lambda implements InterfaceC0646l<SNSTrackEvents, O9.p> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f19857a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.f19857a = dVar;
            }

            public final void a(SNSTrackEvents sNSTrackEvents) {
                this.f19857a.a(new SNSEvent.SNSEventAnalytics(sNSTrackEvents));
            }

            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ O9.p invoke(SNSTrackEvents sNSTrackEvents) {
                a(sNSTrackEvents);
                return O9.p.f3034a;
            }
        }

        public s(T9.a<? super s> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((s) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return d.this.new s(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19855a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "onLoad", null, 4, null);
                com.sumsub.sns.internal.core.analytics.b.f14967a.a(new a(d.this));
                com.sumsub.sns.internal.domain.g gVar = d.this.f19729r;
                g.a aVar = new g.a();
                this.f19855a = 1;
                obj = gVar.a(aVar, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, g.b>>) this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    d.this.A();
                    return O9.p.f3034a;
                }
                kotlin.b.b(obj);
            }
            com.sumsub.sns.internal.core.domain.model.a aVar2 = (com.sumsub.sns.internal.core.domain.model.a) obj;
            if (aVar2.a()) {
                d.this.b((Throwable) ((a.C0240a) aVar2).d());
                return O9.p.f3034a;
            }
            g.b bVar = (g.b) ((a.b) aVar2).d();
            d.this.a(new SNSEvent.SNSEventApplicantLoaded(d.this.f19733v.a()));
            d dVar = d.this;
            boolean y10 = dVar.y();
            com.sumsub.sns.internal.core.data.model.g d10 = bVar.d();
            com.sumsub.sns.internal.core.data.model.e e10 = bVar.e();
            this.f19855a = 2;
            if (dVar.a(y10, d10, e10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            d.this.A();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onMoveToApplicantStatusScreen$$inlined$launchOnViewModelScope$1", f = "SNSAppViewModel.kt", l = {445, 450}, m = "invokeSuspend")
    public static final class t extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19858a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.core.presentation.base.a f19860c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f19861d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f19862e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f19863f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f19864g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(com.sumsub.sns.core.presentation.base.a aVar, String str, T9.a aVar2, boolean z10, d dVar, boolean z11) {
            super(2, aVar2);
            this.f19860c = aVar;
            this.f19861d = str;
            this.f19862e = z10;
            this.f19863f = dVar;
            this.f19864g = z11;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((t) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            t tVar = new t(this.f19860c, this.f19861d, aVar, this.f19862e, this.f19863f, this.f19864g);
            tVar.f19859b = obj;
            return tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3 = "Show applicant status screen: isCancelled=";
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19858a;
            try {
            } catch (Exception e10) {
                com.sumsub.sns.core.presentation.base.a.a(this.f19860c, e10, this.f19861d, (Object) null, 4, (Object) null);
            }
            if (i == 0) {
                kotlin.b.b(obj);
                Object obj4 = (CoroutineScope) this.f19859b;
                try {
                    com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Show applicant status screen: isCancelled=" + this.f19862e, null, 4, null);
                    com.sumsub.sns.internal.domain.e eVar = this.f19863f.f19730s;
                    boolean z10 = this.f19864g;
                    com.sumsub.sns.internal.core.data.source.applicant.b bVar = this.f19863f.f19735x;
                    this.f19859b = obj4;
                    this.f19858a = 1;
                    if (eVar.a(z10, bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = obj4;
                } catch (CancellationException unused) {
                    obj3 = obj4;
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(obj3), "CancellationException happened", null, 4, null);
                    return O9.p.f3034a;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return O9.p.f3034a;
                }
                obj2 = (CoroutineScope) this.f19859b;
                kotlin.b.b(obj);
                ((Result) obj).getClass();
            }
            this.f19863f.d(this.f19862e);
            d dVar = this.f19863f;
            boolean z11 = this.f19862e;
            this.f19859b = obj2;
            this.f19858a = 2;
            if (dVar.a(z11, (T9.a<? super O9.p>) this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {157}, m = "onPrepare")
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19865a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19866b;

        /* renamed from: d, reason: collision with root package name */
        public int f19868d;

        public u(T9.a<? super u> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19866b = obj;
            this.f19868d |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onPrepare$2", f = "SNSAppViewModel.kt", l = {160, 161}, m = "invokeSuspend")
    public static final class v extends SuspendLambda implements InterfaceC0650p<C0372d, T9.a<? super C0372d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f19869a;

        /* renamed from: b, reason: collision with root package name */
        public int f19870b;

        /* renamed from: c, reason: collision with root package name */
        public int f19871c;

        /* renamed from: d, reason: collision with root package name */
        public int f19872d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f19873e;

        public v(T9.a<? super v> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0372d c0372d, T9.a<? super C0372d> aVar) {
            return ((v) create(c0372d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            v vVar = d.this.new v(aVar);
            vVar.f19873e = obj;
            return vVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r13.f19872d
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L26
                if (r1 != r2) goto L1e
                int r0 = r13.f19871c
                int r1 = r13.f19870b
                java.lang.Object r2 = r13.f19869a
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r5 = r13.f19873e
                com.sumsub.sns.presentation.screen.d$d r5 = (com.sumsub.sns.presentation.screen.d.C0372d) r5
                kotlin.b.b(r14)
                r9 = r2
                goto L6c
            L1e:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L26:
                int r1 = r13.f19871c
                int r5 = r13.f19870b
                java.lang.Object r6 = r13.f19873e
                com.sumsub.sns.presentation.screen.d$d r6 = (com.sumsub.sns.presentation.screen.d.C0372d) r6
                kotlin.b.b(r14)
                goto L50
            L32:
                kotlin.b.b(r14)
                java.lang.Object r14 = r13.f19873e
                com.sumsub.sns.presentation.screen.d$d r14 = (com.sumsub.sns.presentation.screen.d.C0372d) r14
                com.sumsub.sns.presentation.screen.d r1 = com.sumsub.sns.presentation.screen.d.this
                r13.f19873e = r14
                r13.f19870b = r3
                r13.f19871c = r3
                r13.f19872d = r4
                java.lang.String r5 = "sns_general_progress_text"
                java.lang.Object r1 = com.sumsub.sns.presentation.screen.d.a(r1, r5, r13)
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r6 = r14
                r14 = r1
                r1 = r3
                r5 = r1
            L50:
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                com.sumsub.sns.presentation.screen.d r7 = com.sumsub.sns.presentation.screen.d.this
                r13.f19873e = r6
                r13.f19869a = r14
                r13.f19870b = r5
                r13.f19871c = r1
                r13.f19872d = r2
                java.lang.String r2 = "sns_general_loadingTakesTooLong"
                java.lang.Object r2 = com.sumsub.sns.presentation.screen.d.a(r7, r2, r13)
                if (r2 != r0) goto L67
                return r0
            L67:
                r9 = r14
                r0 = r1
                r14 = r2
                r1 = r5
                r5 = r6
            L6c:
                if (r1 == 0) goto L70
                r6 = r4
                goto L71
            L70:
                r6 = r3
            L71:
                if (r0 == 0) goto L75
                r8 = r4
                goto L76
            L75:
                r8 = r3
            L76:
                r10 = r14
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                r11 = 7
                r12 = 0
                r7 = 0
                com.sumsub.sns.presentation.screen.d$d r14 = com.sumsub.sns.presentation.screen.d.C0372d.a(r5, r6, r7, r8, r9, r10, r11, r12)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onProgress$1", f = "SNSAppViewModel.kt", l = {138}, m = "invokeSuspend")
    public static final class w extends SuspendLambda implements ca.s<FlowCollector<? super Pair<? extends Boolean, ? extends Long>>, a.k, Boolean, Integer, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19875a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19876b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19877c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ boolean f19878d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ int f19879e;

        public w(T9.a<? super w> aVar) {
            super(5, aVar);
        }

        public final Object a(FlowCollector<? super Pair<Boolean, Long>> flowCollector, a.k kVar, boolean z10, int i, T9.a<? super O9.p> aVar) {
            w wVar = d.this.new w(aVar);
            wVar.f19876b = flowCollector;
            wVar.f19877c = kVar;
            wVar.f19878d = z10;
            wVar.f19879e = i;
            return wVar.invokeSuspend(O9.p.f3034a);
        }

        @Override // ca.s
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends Boolean, ? extends Long>> flowCollector, a.k kVar, Boolean bool, Integer num, T9.a<? super O9.p> aVar) {
            return a(flowCollector, kVar, bool.booleanValue(), num.intValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f19875a;
            if (i == 0) {
                kotlin.b.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f19876b;
                a.k kVar = (a.k) this.f19877c;
                boolean z10 = this.f19878d;
                int i9 = this.f19879e;
                com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "onProgress: progress=" + z10 + ", internalProgress=" + i9 + ", internalState=" + d.this.i().getValue(), null, 4, null);
                Pair pair = new Pair(Boolean.valueOf(!kVar.f() || !kVar.j() || z10 || i9 > 0), new Long((z10 || i9 > 0 || !kVar.f() || !kVar.j()) ? 0L : 350L));
                this.f19876b = null;
                this.f19875a = 1;
                if (flowCollector.emit(pair, this) == coroutineSingletons) {
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

    public static final class x extends Lambda implements InterfaceC0646l<Pair<? extends Boolean, ? extends Long>, Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final x f19881a = new x();

        public x() {
            super(1);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(Pair<Boolean, Long> pair) {
            return pair.f23090b;
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel$onSdkPreparedSuccess$2", f = "SNSAppViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements InterfaceC0650p<C0372d, T9.a<? super C0372d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19882a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19883b;

        public y(T9.a<? super y> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0372d c0372d, T9.a<? super C0372d> aVar) {
            return ((y) create(c0372d, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            y yVar = new y(aVar);
            yVar.f19883b = obj;
            return yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19882a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return C0372d.a((C0372d) this.f19883b, true, null, false, null, null, 30, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppViewModel", f = "SNSAppViewModel.kt", l = {785, 795}, m = "onStepComplete")
    public static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f19884a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19885b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f19886c;

        /* renamed from: e, reason: collision with root package name */
        public int f19888e;

        public z(T9.a<? super z> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19886c = obj;
            this.f19888e |= Integer.MIN_VALUE;
            return d.this.a(false, (T9.a<? super O9.p>) this);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(d.class, "currentLevelName", "getCurrentLevelName()Ljava/lang/String;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(d.class, "isSDKPrepared", "isSDKPrepared()Z", 0);
        iVar.getClass();
        f19716M = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, C.v.t(d.class, "verificationStarted", "getVerificationStarted()Z", 0, iVar), C.v.t(d.class, "pendingInstructionsData", "getPendingInstructionsData()Lcom/sumsub/sns/presentation/screen/SNSAppViewModel$PendingInstructionsData;", 0, iVar)};
        f19715L = new b(null);
    }

    public d(G g10, com.sumsub.sns.internal.domain.g gVar, com.sumsub.sns.internal.domain.e eVar, com.sumsub.sns.internal.core.domain.n nVar, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.settings.b bVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar2, com.sumsub.sns.internal.core.data.source.applicant.b bVar3) {
        super(aVar, bVar2);
        this.f19728q = g10;
        this.f19729r = gVar;
        this.f19730s = eVar;
        this.f19731t = nVar;
        this.f19732u = aVar;
        this.f19733v = bVar;
        this.f19734w = bVar2;
        this.f19735x = bVar3;
        this.f19736y = 5000L;
        this.f19717A = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_CURRENT_LEVEL", null);
        Boolean bool = Boolean.FALSE;
        this.f19718B = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_SDK_PREPARED", bool);
        this.f19720D = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "VERIFICATION_STARTED", bool);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f19723G = MutableStateFlow;
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f19724H = MutableStateFlow2;
        this.f19725I = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "KEY_AFTER_INSTRUCTIONS_DATA", null);
        this.f19726J = new LinkedHashSet();
        Flow<Boolean> distinctUntilChanged = FlowKt.distinctUntilChanged(new h0(FlowKt.debounce(FlowKt.combineTransform(i(), MutableStateFlow, MutableStateFlow2, new w(null)), x.f19881a)));
        this.f19727K = distinctUntilChanged;
        com.sumsub.sns.internal.core.common.b0.a(distinctUntilChanged, C0552s.b(this), new a(null));
        m();
    }

    public final void A() {
        com.sumsub.sns.internal.core.common.b0.a(FlowKt.m142catch(this.f19734w.a(), new o(null)), C0552s.b(this), null, 2, null);
        com.sumsub.sns.internal.core.common.b0.a(this.f19734w.b(), C0552s.b(this), new p(null));
    }

    public final void B() {
        Job launch$default;
        p();
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new d0(null), 3, null);
        this.f19719C = launch$default;
    }

    public final void C() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new e0(this, DocumentType.f15253j, null, this), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        com.sumsub.sns.internal.core.analytics.b.f14967a.a((InterfaceC0646l<? super SNSTrackEvents, O9.p>) null);
        q();
        super.onCleared();
    }

    public final void q() {
        f(false);
        if (this.f19737z != null) {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "cancelWaitForLevelChange", null, 4, null);
        }
        Job job = this.f19737z;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f19737z = null;
    }

    public final void r() {
        this.f19726J.clear();
    }

    public final String s() {
        return (String) this.f19717A.a(this, f19716M[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C0372d e() {
        return new C0372d(false, null, false, null, null, 31, null);
    }

    public final c w() {
        return (c) this.f19725I.a(this, f19716M[3]);
    }

    public final boolean x() {
        return ((Boolean) this.f19720D.a(this, f19716M[2])).booleanValue();
    }

    public final boolean y() {
        return ((Boolean) this.f19718B.a(this, f19716M[1])).booleanValue();
    }

    public final boolean z() {
        return this.f19737z != null;
    }

    public final void c(Document document) {
        this.f19721E = document;
        i(true);
    }

    public final void d(boolean z10) {
        Document document = this.f19721E;
        if (document != null) {
            c((Document) null);
            a(new SNSEvent.SNSEventStepCompleted(this.f19733v.a(), document.getType().c(), z10));
        }
    }

    public final void f(boolean z10) {
        MutableStateFlow<Integer> mutableStateFlow = this.f19724H;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + (z10 ? 1 : -1)));
    }

    public final void g(boolean z10) {
        this.f19723G.setValue(Boolean.valueOf(z10));
    }

    public final void h(boolean z10) {
        this.f19718B.a(this, f19716M[1], Boolean.valueOf(z10));
    }

    public final void i(boolean z10) {
        this.f19720D.a(this, f19716M[2], Boolean.valueOf(z10));
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void m() {
        a((InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object>) new s(null));
    }

    public final void p() {
        Job job = this.f19719C;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f19719C = null;
        com.sumsub.sns.core.presentation.base.a.a(this, false, new f(null), 1, null);
    }

    public final void e(boolean z10) {
        a((InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object>) new l(z10, null));
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
            boolean r0 = r5 instanceof com.sumsub.sns.presentation.screen.d.u
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.presentation.screen.d$u r0 = (com.sumsub.sns.presentation.screen.d.u) r0
            int r1 = r0.f19868d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19868d = r1
            goto L18
        L13:
            com.sumsub.sns.presentation.screen.d$u r0 = new com.sumsub.sns.presentation.screen.d$u
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19866b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19868d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f19865a
            com.sumsub.sns.presentation.screen.d r0 = (com.sumsub.sns.presentation.screen.d) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f19865a = r4
            r0.f19868d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.sumsub.sns.presentation.screen.d$v r5 = new com.sumsub.sns.presentation.screen.d$v
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            com.sumsub.sns.core.presentation.base.a.a(r0, r2, r5, r3, r1)
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.c(T9.a):java.lang.Object");
    }

    public final void b(String str) {
        this.f19717A.a(this, f19716M[0], str);
    }

    public final void b(com.sumsub.sns.internal.core.data.model.g gVar, Document document) {
        b.d b9;
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "startActionStep: " + document, null, 4, null);
        b9 = com.sumsub.sns.presentation.screen.f.b(gVar, document);
        if (b9 == null) {
            b9 = com.sumsub.sns.presentation.screen.a.a(document, gVar, true);
            if (!b9.a()) {
                com.sumsub.sns.core.presentation.base.a.a(this, new IllegalArgumentException("Step " + document.getType().c() + " is NOT supported in actions"), document.getType().c(), (Object) null, 4, (Object) null);
                return;
            }
        }
        a(b9);
    }

    public final void c(boolean z10) {
        c w2 = w();
        if (w2 == null) {
            return;
        }
        a((c) null);
        if (z10) {
            if (w2.d() instanceof b.d) {
                ((b.d) w2.d()).a(null);
            }
            this.f19726J.add(a(w2.c()));
            if (w2.d() instanceof com.sumsub.sns.presentation.screen.b) {
                a((a.j) w2.d());
                return;
            } else {
                a(new b.a(true, w2.d()));
                return;
            }
        }
        a(new b.a(false, w2.d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.sumsub.sns.internal.core.data.model.g r12, java.util.List<com.sumsub.sns.internal.core.data.model.Document> r13, boolean r14, T9.a<? super O9.p> r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.b(com.sumsub.sns.internal.core.data.model.g, java.util.List, boolean, T9.a):java.lang.Object");
    }

    public final void a(c cVar) {
        this.f19725I.a(this, f19716M[3], cVar);
    }

    public final void a(b.a aVar) {
        com.sumsub.sns.internal.core.data.model.remote.response.c e10;
        com.sumsub.sns.internal.core.data.model.remote.response.c e11;
        if (aVar == null) {
            return;
        }
        if (s() == null) {
            com.sumsub.sns.internal.core.data.model.t d10 = aVar.j().d();
            b((d10 == null || (e11 = d10.e()) == null) ? null : e11.b());
        }
        com.sumsub.sns.internal.core.data.model.t d11 = aVar.j().d();
        String b9 = (d11 == null || (e10 = d11.e()) == null) ? null : e10.b();
        boolean z10 = (kotlin.jvm.internal.f.b(s(), b9) || b9 == null) ? false : true;
        b(b9);
        com.sumsub.sns.core.c cVar = com.sumsub.sns.core.c.f14016a;
        com.sumsub.sns.core.c.b(cVar, "SNSAppViewModel", "Data updated: levelChanged=" + z10 + ", level=" + s() + ", isWaitingForLevelChange=" + z(), null, 4, null);
        if (z() && z10) {
            q();
            com.sumsub.sns.internal.core.data.model.g d12 = aVar.g().d();
            if (d12 != null && d12.A()) {
                com.sumsub.sns.core.c.b(cVar, "SNSAppViewModel", "Data updated: Applicant has VI only, moving to status screen", null, 4, null);
                a(this, false, false, 2, (Object) null);
            } else {
                com.sumsub.sns.core.c.b(cVar, "SNSAppViewModel", "Data updated: moving to next document", null, 4, null);
                a(this, false, 1, (Object) null);
            }
        }
    }

    public final void c(String str) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new g0(this, DocumentType.f15253j, null, this, str), 3, null);
    }

    public static /* synthetic */ void a(d dVar, boolean z10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z10 = false;
        }
        dVar.e(z10);
    }

    public final Object a(com.sumsub.sns.internal.core.data.model.g gVar, List<Document> list, T9.a<? super O9.p> aVar) {
        Document b9 = com.sumsub.sns.presentation.screen.g.b(list, gVar);
        if (b9 != null && !kotlin.jvm.internal.f.b(this.f19721E, b9)) {
            d(false);
            b(gVar, b9);
            a(b9);
            return O9.p.f3034a;
        }
        d(false);
        Object a10 = a(false, aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
    }

    public final void b(DocumentType documentType) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "A user has uploaded document: " + documentType.c(), null, 4, null);
    }

    public final void b(Document document) {
        a((InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object>) new r(document, this, null));
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "On handle error - " + oVar, null, 4, null);
        if (oVar instanceof o.c) {
            a(this, (SNSCompletionResult) new SNSCompletionResult.AbnormalTermination(oVar.b()), false, 2, (Object) null);
        } else {
            a(new b.c(oVar));
        }
    }

    public final void b(com.sumsub.sns.internal.core.data.model.g gVar) {
        Object obj;
        Iterator<T> it = gVar.I().g().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((g.c.a) obj).m().k()) {
                    break;
                }
            }
        }
        g.c.a aVar = (g.c.a) obj;
        if (aVar != null) {
            try {
                SNSProoface.Companion companion = SNSProoface.INSTANCE;
            } catch (Exception e10) {
                com.sumsub.sns.core.c.a(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", com.google.android.gms.measurement.internal.a.i("Prooface is not available: ", e10), null, 4, null);
                g(false);
                com.sumsub.sns.core.presentation.base.a.a(this, e10, aVar.m().c(), (Object) null, 4, (Object) null);
            }
        }
    }

    public static /* synthetic */ void a(d dVar, boolean z10, boolean z11, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z11 = true;
        }
        dVar.a(z10, z11);
    }

    public static /* synthetic */ void a(d dVar, SNSCompletionResult sNSCompletionResult, boolean z10, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z10 = false;
        }
        dVar.a(sNSCompletionResult, z10);
    }

    public final void a(SNSCompletionResult sNSCompletionResult, boolean z10) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Cancel verification with reason - " + sNSCompletionResult, null, 4, null);
        com.sumsub.sns.internal.core.analytics.f.a(0L, 1, null).a(SdkEvent.Dismiss).a(new Pair("isDismissMethodCalled", Boolean.valueOf(z10))).a(true);
        q();
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new q(sNSCompletionResult, null), 3, null);
    }

    public final void b(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        a(new o.c(th, null, null, 6, null), DocumentType.f15253j);
        g(false);
        com.sumsub.sns.core.c.f14016a.a("SNSAppViewModel", "An error while preparing the sdk...", th);
    }

    public final void a(com.sumsub.sns.internal.core.data.model.g gVar, Document document) {
        com.sumsub.sns.core.c cVar = com.sumsub.sns.core.c.f14016a;
        com.sumsub.sns.core.c.b(cVar, "SNSAppViewModel", "Show preview for document: " + document.getType().c(), null, 4, null);
        g(false);
        if (document.getType().k() && com.sumsub.sns.presentation.screen.a.a(gVar, document).c()) {
            a(document.getType());
        }
        b.d a10 = com.sumsub.sns.presentation.screen.a.a(document, gVar, false, 2, null);
        com.sumsub.sns.core.c.b(cVar, "SNSAppViewModel", "navigation event: " + a10 + '}', null, 4, null);
        a(a10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r24, T9.a<? super O9.p> r25) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.b(boolean, T9.a):java.lang.Object");
    }

    public final void a(DocumentType documentType) {
        try {
            SNSProoface.Companion companion = SNSProoface.INSTANCE;
        } catch (Exception e10) {
            com.sumsub.sns.core.c.a(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", com.google.android.gms.measurement.internal.a.i("Prooface is not available: ", e10), null, 4, null);
            g(false);
            com.sumsub.sns.core.presentation.base.a.a(this, e10, documentType.c(), (Object) null, 4, (Object) null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void a(a.j jVar) {
        if (jVar instanceof b.d) {
            b.d dVar = (b.d) jVar;
            if (dVar.b() != null) {
                com.sumsub.sns.internal.core.domain.model.c b9 = dVar.b();
                if (b9 != null) {
                    a(new com.sumsub.sns.internal.core.domain.model.c(b9.g(), b9.f(), b9.e(), b9.h()), (Parcelable) jVar);
                    return;
                }
                return;
            }
        }
        super.a(jVar);
    }

    public final void a(com.sumsub.sns.internal.core.domain.model.c cVar, Parcelable parcelable) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "resolveInstructions, introParams=" + cVar + ", payload=" + parcelable, null, 4, null);
        if (parcelable != null) {
            a(new c(cVar, parcelable));
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new c0(cVar, null), 3, null);
    }

    public final String a(com.sumsub.sns.internal.core.domain.model.c cVar) {
        return cVar.g() + '|' + cVar.f() + '|' + cVar.e();
    }

    public final Object a(boolean z10, com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super O9.p> aVar) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "SDK is prepared. Applicant - " + eVar.s() + ", type=" + eVar.y(), null, 4, null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new y(null), 1, null);
        h(true);
        a(new SNSEvent.VerificationStarted(eVar.s()));
        if (z10) {
            C();
            return O9.p.f3034a;
        }
        Object a10 = a(gVar, eVar.y(), aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.g r8, com.sumsub.sns.core.data.model.FlowType r9, T9.a<? super O9.p> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.presentation.screen.d.j
            if (r0 == 0) goto L13
            r0 = r10
            com.sumsub.sns.presentation.screen.d$j r0 = (com.sumsub.sns.presentation.screen.d.j) r0
            int r1 = r0.f19821e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19821e = r1
            goto L18
        L13:
            com.sumsub.sns.presentation.screen.d$j r0 = new com.sumsub.sns.presentation.screen.d$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19819c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19821e
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L46
            if (r2 == r6) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.b.b(r10)
            goto L7d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f19818b
            com.sumsub.sns.internal.core.data.model.g r8 = (com.sumsub.sns.internal.core.data.model.g) r8
            java.lang.Object r9 = r0.f19817a
            com.sumsub.sns.presentation.screen.d r9 = (com.sumsub.sns.presentation.screen.d) r9
            kotlin.b.b(r10)
            goto L6e
        L42:
            kotlin.b.b(r10)
            goto L57
        L46:
            kotlin.b.b(r10)
            com.sumsub.sns.core.data.model.FlowType r10 = com.sumsub.sns.core.data.model.FlowType.Standalone
            r2 = 0
            if (r9 != r10) goto L5a
            r0.f19821e = r6
            java.lang.Object r8 = r7.b(r2, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            O9.p r8 = O9.p.f3034a
            return r8
        L5a:
            com.sumsub.sns.core.data.model.FlowType r10 = com.sumsub.sns.core.data.model.FlowType.Actions
            if (r9 != r10) goto L80
            com.sumsub.sns.internal.core.data.source.dynamic.b r9 = r7.f19734w
            r0.f19817a = r7
            r0.f19818b = r8
            r0.f19821e = r4
            java.lang.Object r10 = com.sumsub.sns.internal.core.data.source.dynamic.b.a(r9, r2, r0, r6, r5)
            if (r10 != r1) goto L6d
            return r1
        L6d:
            r9 = r7
        L6e:
            com.sumsub.sns.internal.core.data.model.e r10 = (com.sumsub.sns.internal.core.data.model.e) r10
            r0.f19817a = r5
            r0.f19818b = r5
            r0.f19821e = r3
            java.lang.Object r8 = r9.a(r8, r10, r0)
            if (r8 != r1) goto L7d
            return r1
        L7d:
            O9.p r8 = O9.p.f3034a
            return r8
        L80:
            com.sumsub.sns.core.data.model.FlowType r10 = com.sumsub.sns.core.data.model.FlowType.Module
            if (r9 != r10) goto L87
            r7.a(r8)
        L87:
            O9.p r8 = O9.p.f3034a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.a(com.sumsub.sns.internal.core.data.model.g, com.sumsub.sns.core.data.model.FlowType, T9.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (com.sumsub.sns.internal.ff.a.f16930a.w().g() == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.sumsub.sns.internal.core.data.model.g r5, T9.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.sumsub.sns.presentation.screen.d.n
            if (r0 == 0) goto L13
            r0 = r6
            com.sumsub.sns.presentation.screen.d$n r0 = (com.sumsub.sns.presentation.screen.d.n) r0
            int r1 = r0.f19842c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19842c = r1
            goto L18
        L13:
            com.sumsub.sns.presentation.screen.d$n r0 = new com.sumsub.sns.presentation.screen.d$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19840a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19842c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            com.sumsub.sns.internal.core.data.model.b r5 = r5.r()
            if (r5 != 0) goto L5c
            r0.f19842c = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.sumsub.sns.internal.core.data.source.dynamic.b$c r6 = (com.sumsub.sns.internal.core.data.source.dynamic.b.c) r6
            java.util.List r5 = r6.c()
            if (r5 == 0) goto L5c
            int r5 = r5.size()
            if (r5 <= r3) goto L5c
            com.sumsub.sns.internal.ff.a r5 = com.sumsub.sns.internal.ff.a.f16930a
            com.sumsub.sns.internal.ff.core.a r5 = r5.w()
            boolean r5 = r5.g()
            if (r5 != 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.b(com.sumsub.sns.internal.core.data.model.g, T9.a):java.lang.Object");
    }

    public final void a(com.sumsub.sns.internal.core.data.model.g gVar) {
        if (gVar.r() == null && !com.sumsub.sns.internal.ff.a.f16930a.w().g()) {
            a(b.d.a.f19694c);
        } else {
            a(this, false, 1, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.g r10, com.sumsub.sns.internal.core.data.model.e r11, T9.a<? super O9.p> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.presentation.screen.d.i
            if (r0 == 0) goto L14
            r0 = r12
            com.sumsub.sns.presentation.screen.d$i r0 = (com.sumsub.sns.presentation.screen.d.i) r0
            int r1 = r0.f19816e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f19816e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.sumsub.sns.presentation.screen.d$i r0 = new com.sumsub.sns.presentation.screen.d$i
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r4.f19814c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f19816e
            r7 = 0
            r2 = 2
            r8 = 1
            if (r1 == 0) goto L46
            if (r1 == r8) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r10 = r4.f19812a
            com.sumsub.sns.presentation.screen.d r10 = (com.sumsub.sns.presentation.screen.d) r10
            kotlin.b.b(r12)
            goto L88
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            java.lang.Object r10 = r4.f19813b
            r11 = r10
            com.sumsub.sns.internal.core.data.model.e r11 = (com.sumsub.sns.internal.core.data.model.e) r11
            java.lang.Object r10 = r4.f19812a
            com.sumsub.sns.presentation.screen.d r10 = (com.sumsub.sns.presentation.screen.d) r10
            kotlin.b.b(r12)
            goto L57
        L46:
            kotlin.b.b(r12)
            r4.f19812a = r9
            r4.f19813b = r11
            r4.f19816e = r8
            java.lang.Object r12 = r9.a(r10, r4)
            if (r12 != r0) goto L56
            return r0
        L56:
            r10 = r9
        L57:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L67
            com.sumsub.sns.presentation.screen.b$d$a r11 = com.sumsub.sns.presentation.screen.b.d.a.f19694c
            r10.a(r11)
            O9.p r10 = O9.p.f3034a
            return r10
        L67:
            if (r11 == 0) goto Lb4
            com.sumsub.sns.internal.core.data.model.e$a r11 = r11.r()
            if (r11 == 0) goto Lac
            java.lang.String r11 = r11.c()
            if (r11 == 0) goto Lac
            com.sumsub.sns.internal.core.data.source.common.a r1 = r10.f19732u
            r4.f19812a = r10
            r4.f19813b = r7
            r4.f19816e = r2
            r5 = 2
            r6 = 0
            r3 = 0
            r2 = r11
            java.lang.Object r12 = com.sumsub.sns.internal.core.data.source.common.a.a(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L88
            return r0
        L88:
            com.sumsub.sns.internal.core.data.model.g r12 = (com.sumsub.sns.internal.core.data.model.g) r12
            r10.b(r12)
            com.sumsub.sns.internal.core.data.model.g$c r11 = r12.I()
            java.util.List r11 = r11.g()
            java.lang.Object r11 = P9.s.L(r11)
            com.sumsub.sns.internal.core.data.model.g$c$a r11 = (com.sumsub.sns.internal.core.data.model.g.c.a) r11
            if (r11 == 0) goto La4
            r11 = 0
            a(r10, r11, r8, r7)
            O9.p r10 = O9.p.f3034a
            return r10
        La4:
            java.security.InvalidParameterException r10 = new java.security.InvalidParameterException
            java.lang.String r11 = "No doc set item found"
            r10.<init>(r11)
            throw r10
        Lac:
            java.security.InvalidParameterException r10 = new java.security.InvalidParameterException
            java.lang.String r11 = "ActionId is not found"
            r10.<init>(r11)
            throw r10
        Lb4:
            java.security.InvalidParameterException r10 = new java.security.InvalidParameterException
            java.lang.String r11 = "Config for action is null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.a(com.sumsub.sns.internal.core.data.model.g, com.sumsub.sns.internal.core.data.model.e, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.data.model.g r20, T9.a<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.a(com.sumsub.sns.internal.core.data.model.g, T9.a):java.lang.Object");
    }

    public final Object a(com.sumsub.sns.internal.core.data.model.g gVar, List<Document> list, boolean z10, T9.a<? super O9.p> aVar) {
        Document b9 = com.sumsub.sns.presentation.screen.g.b(list, gVar);
        if (b9 != null && !kotlin.jvm.internal.f.b(this.f19721E, b9)) {
            d(false);
            a(gVar, b9);
            a(b9);
            return O9.p.f3034a;
        }
        d(false);
        if (com.sumsub.sns.presentation.screen.g.a(list, gVar) != null) {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "moveToNextStep: applicantStatus=" + gVar.J().p(), null, 4, null);
            if (z10) {
                a(com.sumsub.sns.internal.core.common.i.a(list, gVar));
            } else {
                a(b.d.c.f19696c);
            }
            return O9.p.f3034a;
        }
        Object a10 = a(false, aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
    }

    public final void a(List<Document> list) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "startVideoIdentification: docs " + list.size(), null, 4, null);
        if (u0.b()) {
            a(new b.d.o(list));
        } else {
            g(false);
            com.sumsub.sns.core.presentation.base.a.a(this, new Exception("VideoIdent not available"), DocumentType.f15254k, (Object) null, 4, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r14, T9.a<? super O9.p> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.sumsub.sns.presentation.screen.d.z
            if (r0 == 0) goto L13
            r0 = r15
            com.sumsub.sns.presentation.screen.d$z r0 = (com.sumsub.sns.presentation.screen.d.z) r0
            int r1 = r0.f19888e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19888e = r1
            goto L18
        L13:
            com.sumsub.sns.presentation.screen.d$z r0 = new com.sumsub.sns.presentation.screen.d$z
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f19886c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f19888e
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.b.b(r15)
            goto La9
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            boolean r14 = r0.f19885b
            java.lang.Object r2 = r0.f19884a
            com.sumsub.sns.presentation.screen.d r2 = (com.sumsub.sns.presentation.screen.d) r2
            kotlin.b.b(r15)
            goto L6a
        L3f:
            kotlin.b.b(r15)
            com.sumsub.sns.core.c r7 = com.sumsub.sns.core.c.f14016a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "onStepComplete, isCancelled="
            r15.<init>(r2)
            r15.append(r14)
            java.lang.String r9 = r15.toString()
            r11 = 4
            r12 = 0
            java.lang.String r8 = "SNSAppViewModel"
            r10 = 0
            com.sumsub.sns.core.c.b(r7, r8, r9, r10, r11, r12)
            com.sumsub.sns.internal.core.data.source.dynamic.b r15 = r13.f19734w
            r0.f19884a = r13
            r0.f19885b = r14
            r0.f19888e = r5
            java.lang.Object r15 = com.sumsub.sns.internal.core.data.source.dynamic.b.d(r15, r3, r0, r5, r6)
            if (r15 != r1) goto L69
            return r1
        L69:
            r2 = r13
        L6a:
            com.sumsub.sns.internal.core.data.source.dynamic.e r15 = (com.sumsub.sns.internal.core.data.source.dynamic.e) r15
            java.lang.Throwable r7 = r15.a()
            if (r7 == 0) goto L78
            r2.b(r7)
            O9.p r14 = O9.p.f3034a
            return r14
        L78:
            java.lang.Object r15 = r15.d()
            com.sumsub.sns.internal.core.data.model.e r15 = (com.sumsub.sns.internal.core.data.model.e) r15
            if (r15 == 0) goto L85
            com.sumsub.sns.core.data.model.FlowType r15 = r15.y()
            goto L86
        L85:
            r15 = r6
        L86:
            if (r15 != 0) goto L89
            goto L9e
        L89:
            int[] r7 = com.sumsub.sns.presentation.screen.d.e.f19777a
            int r15 = r15.ordinal()
            r15 = r7[r15]
            if (r15 != r5) goto L9e
            com.sumsub.sns.core.data.model.SNSCompletionResult$SuccessTermination r14 = new com.sumsub.sns.core.data.model.SNSCompletionResult$SuccessTermination
            r14.<init>(r6, r5, r6)
            a(r2, r14, r3, r4, r6)
            O9.p r14 = O9.p.f3034a
            return r14
        L9e:
            r0.f19884a = r6
            r0.f19888e = r4
            java.lang.Object r14 = r2.b(r14, r0)
            if (r14 != r1) goto La9
            return r1
        La9:
            O9.p r14 = O9.p.f3034a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.screen.d.a(boolean, T9.a):java.lang.Object");
    }

    public final void a(Document document) {
        c(document);
        a(new SNSEvent.SNSEventStepInitiated(this.f19733v.a(), document.getType().c()));
    }

    public final void a(SNSEvent sNSEvent) {
        try {
            SNSEventHandler eventHandler = SNSMobileSDK.INSTANCE.getEventHandler();
            if (eventHandler != null) {
                eventHandler.onEvent(sNSEvent);
            }
        } catch (Throwable th) {
            com.sumsub.sns.core.c.f14016a.a("SNSAppViewModel", "Can't fire sns event " + sNSEvent, th);
        }
    }

    public final void a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, boolean z10) {
        Job launch$default;
        f(true);
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "waiting for possible level change ...", null, 4, null);
        a(b.f.f19712a);
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new b0(gVar, eVar, z10, null), 3, null);
        this.f19737z = launch$default;
    }

    public final boolean a(com.sumsub.sns.internal.core.data.model.g gVar, List<Document> list, boolean z10) {
        List<Document> a10 = com.sumsub.sns.presentation.screen.g.a(list, gVar);
        if (a10 != null) {
            com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "resolveApplicantStatusWithVideoIdent: applicantStatus=" + gVar.J().p() + ", unsubmitted docs=" + a10.size(), null, 4, null);
            if (gVar.J().p() == ReviewStatusType.Pending || gVar.J().p() == ReviewStatusType.Queued) {
                if (z10 && !gVar.A()) {
                    a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
                    return true;
                }
                if (gVar.A() || a(gVar, list)) {
                    a(b.d.c.f19696c);
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, boolean z10, boolean z11) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "resolveNextScreenByApplicantStatus: status=" + gVar.K() + ", isCancelled=" + z11, null, 4, null);
        this.f19722F = true;
        ReviewStatusType K2 = gVar.K();
        ReviewStatusType reviewStatusType = ReviewStatusType.Init;
        if (K2 == reviewStatusType && com.sumsub.sns.internal.core.data.model.f.f(eVar) && z10 && !gVar.A()) {
            if (z11) {
                a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
                return;
            } else {
                a(this, false, 1, (Object) null);
                return;
            }
        }
        if (gVar.K() == reviewStatusType && com.sumsub.sns.internal.core.data.model.f.d(eVar) && !z10) {
            a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
            return;
        }
        if (gVar.K() == ReviewStatusType.Pending && com.sumsub.sns.internal.core.data.model.f.d(eVar)) {
            a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
            return;
        }
        if (gVar.K() == ReviewStatusType.Prechecked && com.sumsub.sns.internal.core.data.model.f.d(eVar)) {
            a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
            return;
        }
        if (gVar.O() && com.sumsub.sns.internal.core.data.model.f.b(eVar)) {
            a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
            return;
        }
        if (!gVar.P() || !com.sumsub.sns.internal.core.data.model.f.h(eVar)) {
            a(b.d.c.f19696c);
        } else if (z10 && !z11) {
            e(true);
        } else {
            a(this, (SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false, 2, (Object) null);
        }
    }

    public final void a(InterfaceC0650p<? super CoroutineScope, ? super T9.a<? super O9.p>, ? extends Object> interfaceC0650p) {
        f(true);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new k(interfaceC0650p, this, null), 3, null);
    }

    public final void a(boolean z10, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new t(this, DocumentType.f15253j, null, z10, this, z11), 3, null);
    }

    public final boolean a(com.sumsub.sns.internal.core.data.model.g gVar, List<Document> list) {
        List<String> j10;
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (gVar.I().k() && ((j10 = gVar.I().j()) == null || !j10.contains(document.getType().c()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Document) it.next()).isRejected()) {
                return true;
            }
        }
        return false;
    }

    public final void a(com.sumsub.sns.internal.core.common.q qVar, long j10) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new h(this, DocumentType.f15253j, null, j10, qVar, this), 3, null);
    }
}
