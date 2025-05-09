package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin;

import C.v;
import O9.p;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0535a;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import androidx.lifecycle.Q;
import b1.InterfaceC0584d;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a;
import ia.InterfaceC0840h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.tls.CipherSuite;
import org.jmrtd.lds.iso19794.IrisImageInfo;

/* loaded from: classes2.dex */
public final class SNSEidPinViewModel extends com.sumsub.sns.core.presentation.base.a<e> {

    /* renamed from: y, reason: collision with root package name */
    public static final a f18367y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f18368z;

    /* renamed from: q, reason: collision with root package name */
    public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a f18369q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18370r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18371s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18372t;

    /* renamed from: u, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18373u;

    /* renamed from: v, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f18374v;

    /* renamed from: w, reason: collision with root package name */
    public final Flow<Step> f18375w;

    /* renamed from: x, reason: collision with root package name */
    public final StateFlow<e> f18376x;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;", "", "(Ljava/lang/String;I)V", "ENTER_OLD_PIN", "TESTING_ENTER_LAST_DIGIT", "ENTER_NEW_PIN", "REPEAT_NEW_PIN", "ENTER_PIN", "ENTER_CAN", "ENTER_PUK", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Step {
        ENTER_OLD_PIN,
        TESTING_ENTER_LAST_DIGIT,
        ENTER_NEW_PIN,
        REPEAT_NEW_PIN,
        ENTER_PIN,
        ENTER_CAN,
        ENTER_PUK
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.b f18377a;

        public b(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.b bVar) {
            this.f18377a = bVar;
        }

        public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.b b() {
            return this.f18377a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f18377a, ((b) obj).f18377a);
        }

        public int hashCode() {
            return this.f18377a.hashCode();
        }

        public String toString() {
            return "PinSuccessEvent(result=" + this.f18377a + ')';
        }
    }

    public static final class c implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18378a;

        public c(String str) {
            this.f18378a = str;
        }

        public final String b() {
            return this.f18378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.f.b(this.f18378a, ((c) obj).f18378a);
        }

        public int hashCode() {
            String str = this.f18378a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("RepeatPinError(text="), this.f18378a, ')');
        }
    }

    public static final class d extends AbstractC0535a {

        /* renamed from: a, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.a f18379a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f18380b;

        public d(InterfaceC0584d interfaceC0584d, com.sumsub.sns.internal.core.a aVar, Bundle bundle) {
            super(interfaceC0584d, bundle);
            this.f18379a = aVar;
            this.f18380b = bundle;
        }

        @Override // androidx.lifecycle.AbstractC0535a
        public <T extends Q> T create(String str, Class<T> cls, G g10) {
            com.sumsub.sns.internal.core.data.source.common.a n10 = this.f18379a.n();
            com.sumsub.sns.internal.core.data.source.dynamic.b p10 = this.f18379a.p();
            Bundle bundle = this.f18380b;
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a aVar = bundle != null ? (com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a) bundle.getParcelable("pin_mode") : null;
            if (aVar == null) {
                aVar = new a.c(false);
            }
            return new SNSEidPinViewModel(aVar, g10, n10, p10);
        }
    }

    public static abstract class e implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f18381a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18382b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18383c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<String, Object> f18384d;

        public static final class a extends e {
            public a(CharSequence charSequence, CharSequence charSequence2, int i, Map<String, ? extends Object> map) {
                super(charSequence, charSequence2, i, map, null);
            }
        }

        public static final class b extends e {
            public b(CharSequence charSequence, CharSequence charSequence2, int i, Map<String, ? extends Object> map) {
                super(charSequence, charSequence2, i, map, null);
            }
        }

        public static final class c extends e {
            public c(CharSequence charSequence, CharSequence charSequence2, int i, Map<String, ? extends Object> map) {
                super(charSequence, charSequence2, i, map, null);
            }
        }

        public static final class d extends e {

            /* renamed from: e, reason: collision with root package name */
            public static final d f18385e = new d();

            public d() {
                super(null, null, 0, null, 15, null);
            }
        }

        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$e$e, reason: collision with other inner class name */
        public static final class C0327e extends e {
            public C0327e(CharSequence charSequence, CharSequence charSequence2, int i, Map<String, ? extends Object> map) {
                super(charSequence, charSequence2, i, map, null);
            }
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, int i, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence, charSequence2, i, map);
        }

        public final Map<String, Object> a() {
            return this.f18384d;
        }

        public final int b() {
            return this.f18383c;
        }

        public final CharSequence c() {
            return this.f18382b;
        }

        public final CharSequence d() {
            return this.f18381a;
        }

        public e(CharSequence charSequence, CharSequence charSequence2, int i, Map<String, ? extends Object> map) {
            this.f18381a = charSequence;
            this.f18382b = charSequence2;
            this.f18383c = i;
            this.f18384d = map;
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, int i, Map map, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : charSequence, (i9 & 2) != 0 ? null : charSequence2, (i9 & 4) != 0 ? 6 : i, (i9 & 8) != 0 ? kotlin.collections.a.p() : map, null);
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18386a;

        static {
            int[] iArr = new int[Step.values().length];
            iArr[Step.ENTER_PIN.ordinal()] = 1;
            iArr[Step.ENTER_CAN.ordinal()] = 2;
            iArr[Step.ENTER_PUK.ordinal()] = 3;
            iArr[Step.ENTER_OLD_PIN.ordinal()] = 4;
            iArr[Step.ENTER_NEW_PIN.ordinal()] = 5;
            iArr[Step.REPEAT_NEW_PIN.ordinal()] = 6;
            iArr[Step.TESTING_ENTER_LAST_DIGIT.ordinal()] = 7;
            f18386a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$onInput$1", f = "SNSEidPinViewModel.kt", l = {126, 136, 141, 161, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18387a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18389c;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$onInput$1$1", f = "SNSEidPinViewModel.kt", l = {151}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f18390a;

            /* renamed from: b, reason: collision with root package name */
            public int f18391b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SNSEidPinViewModel f18392c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SNSEidPinViewModel sNSEidPinViewModel, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f18392c = sNSEidPinViewModel;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f18392c, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SNSEidPinViewModel sNSEidPinViewModel;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f18391b;
                if (i == 0) {
                    kotlin.b.b(obj);
                    this.f18392c.d((String) null);
                    this.f18392c.b(Step.ENTER_NEW_PIN);
                    com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidPin", "Pins do not match", null, 4, null);
                    SNSEidPinViewModel sNSEidPinViewModel2 = this.f18392c;
                    this.f18390a = sNSEidPinViewModel2;
                    this.f18391b = 1;
                    Object a10 = sNSEidPinViewModel2.a("sns_eid_error_newPinMismatch_title", this);
                    if (a10 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sNSEidPinViewModel = sNSEidPinViewModel2;
                    obj = a10;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sNSEidPinViewModel = (SNSEidPinViewModel) this.f18390a;
                    kotlin.b.b(obj);
                }
                sNSEidPinViewModel.a(new c((String) obj));
                return p.f3034a;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18393a;

            static {
                int[] iArr = new int[Step.values().length];
                iArr[Step.ENTER_OLD_PIN.ordinal()] = 1;
                iArr[Step.ENTER_NEW_PIN.ordinal()] = 2;
                iArr[Step.REPEAT_NEW_PIN.ordinal()] = 3;
                iArr[Step.TESTING_ENTER_LAST_DIGIT.ordinal()] = 4;
                iArr[Step.ENTER_PIN.ordinal()] = 5;
                iArr[Step.ENTER_PUK.ordinal()] = 6;
                iArr[Step.ENTER_CAN.ordinal()] = 7;
                f18393a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, T9.a<? super g> aVar) {
            super(2, aVar);
            this.f18389c = str;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return SNSEidPinViewModel.this.new g(this.f18389c, aVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0152  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h implements Flow<e> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f18394a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SNSEidPinViewModel f18395b;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f18396a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSEidPinViewModel f18397b;

            @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$special$$inlined$mapNotNull$1$2", f = "SNSEidPinViewModel.kt", l = {226, 227, 233, 234, 240, 241, 247, 248, IrisImageInfo.IMAGE_QUAL_UNDEF, 255, 261, 262, 272}, m = "emit")
            /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$h$a$a, reason: collision with other inner class name */
            public static final class C0328a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f18398a;

                /* renamed from: b, reason: collision with root package name */
                public int f18399b;

                /* renamed from: c, reason: collision with root package name */
                public Object f18400c;

                /* renamed from: e, reason: collision with root package name */
                public Object f18402e;

                /* renamed from: f, reason: collision with root package name */
                public Object f18403f;

                /* renamed from: g, reason: collision with root package name */
                public Object f18404g;

                public C0328a(T9.a aVar) {
                    super(aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f18398a = obj;
                    this.f18399b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, SNSEidPinViewModel sNSEidPinViewModel) {
                this.f18396a = flowCollector;
                this.f18397b = sNSEidPinViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x02f4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0187 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x01c8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x01c9  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x020d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x024c A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x024d  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0291 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x02d1 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            /* JADX WARN: Type inference failed for: r4v34, types: [com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$e$a] */
            /* JADX WARN: Type inference failed for: r4v42, types: [com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$e$e] */
            /* JADX WARN: Type inference failed for: r5v15, types: [com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$e$b] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r9, T9.a r10) {
                /*
                    Method dump skipped, instructions count: 810
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel.h.a.emit(java.lang.Object, T9.a):java.lang.Object");
            }
        }

        public h(Flow flow, SNSEidPinViewModel sNSEidPinViewModel) {
            this.f18394a = flow;
            this.f18395b = sNSEidPinViewModel;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super e> flowCollector, T9.a aVar) {
            Object collect = this.f18394a.collect(new a(flowCollector, this.f18395b), aVar);
            return collect == CoroutineSingletons.f23158a ? collect : p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.SNSEidPinViewModel$stepFlow$1", f = "SNSEidPinViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<Step, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18405a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18406b;

        public i(T9.a<? super i> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Step step, T9.a<? super p> aVar) {
            return ((i) create(step, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            i iVar = new i(aVar);
            iVar.f18406b = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18405a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidPin", "Step changed " + ((Step) this.f18406b), null, 4, null);
            return p.f3034a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SNSEidPinViewModel.class, "can", "getCan()Ljava/lang/String;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(SNSEidPinViewModel.class, "lastPinDigit", "getLastPinDigit()Ljava/lang/String;", 0);
        iVar.getClass();
        f18368z = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, v.t(SNSEidPinViewModel.class, "currentPin", "getCurrentPin()Ljava/lang/String;", 0, iVar), v.t(SNSEidPinViewModel.class, "originalPin", "getOriginalPin()Ljava/lang/String;", 0, iVar), v.t(SNSEidPinViewModel.class, "step", "getStep()Lcom/sumsub/sns/internal/presentation/screen/preview/ekyc/eid/pin/SNSEidPinViewModel$Step;", 0, iVar)};
        f18367y = new a(null);
    }

    public SNSEidPinViewModel(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a aVar, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar2, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar2, bVar);
        this.f18369q = aVar;
        this.f18370r = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "can", null);
        this.f18371s = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "last_pin_digit", null);
        this.f18372t = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "current_pin", null);
        this.f18373u = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "original_pin", null);
        Step step = Step.ENTER_PIN;
        this.f18374v = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "pin_step", step);
        Flow<Step> onEach = FlowKt.onEach(g10.c(step, "pin_step"), new i(null));
        this.f18375w = onEach;
        this.f18376x = FlowKt.stateIn(new h(onEach, this), C0552s.b(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), e.d.f18385e);
        if (!(aVar instanceof a.c)) {
            if (aVar instanceof a.e) {
                step = Step.ENTER_OLD_PIN;
            } else if (aVar instanceof a.d) {
                step = Step.ENTER_PUK;
            } else if (aVar instanceof a.C0329a) {
                d(((a.C0329a) aVar).b());
                step = Step.ENTER_CAN;
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b bVar2 = (a.b) aVar;
                f(bVar2.f());
                d(bVar2.e());
                e(bVar2.d());
                step = Step.ENTER_CAN;
            }
        }
        b(step);
    }

    public final void e(String str) {
        this.f18371s.a(this, f18368z[1], str);
    }

    public final void f(String str) {
        this.f18373u.a(this, f18368z[3], str);
    }

    public final void p() {
        com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.g.b("SNSEidPin", "Finish with success", null, 4, null);
        a(new b(new com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.b(this.f18369q, r(), t(), q(), s())));
    }

    public final String q() {
        return (String) this.f18370r.a(this, f18368z[0]);
    }

    public final String r() {
        return (String) this.f18372t.a(this, f18368z[2]);
    }

    public final String s() {
        return (String) this.f18371s.a(this, f18368z[1]);
    }

    public final String t() {
        return (String) this.f18373u.a(this, f18368z[3]);
    }

    public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a u() {
        return this.f18369q;
    }

    public final Step v() {
        return (Step) this.f18374v.a(this, f18368z[4]);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public StateFlow<e> j() {
        return this.f18376x;
    }

    public final void d(String str) {
        this.f18372t.a(this, f18368z[2], str);
    }

    public final void b(Step step) {
        this.f18374v.a(this, f18368z[4], step);
    }

    public final void c(String str) {
        this.f18370r.a(this, f18368z[0], str);
    }

    public final Job b(String str) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new g(str, null), 3, null);
        return launch$default;
    }

    public static /* synthetic */ Map a(SNSEidPinViewModel sNSEidPinViewModel, Step step, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            step = sNSEidPinViewModel.v();
        }
        return sNSEidPinViewModel.a(step);
    }

    public final Map<String, Object> a(Step step) {
        String str = "transportPin";
        switch (f.f18386a[step.ordinal()]) {
            case 1:
                str = "pin";
                break;
            case 2:
                str = "can";
                break;
            case 3:
                str = "puk";
                break;
            case 4:
            case 7:
                break;
            case 5:
                str = "newPin";
                break;
            case 6:
                str = "newPinRepeat";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return com.google.android.gms.measurement.internal.a.n("mode", str);
    }
}
