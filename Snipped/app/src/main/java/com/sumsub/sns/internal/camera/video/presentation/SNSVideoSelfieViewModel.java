package com.sumsub.sns.internal.camera.video.presentation;

import C.v;
import O9.p;
import android.os.CountDownTimer;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.domain.d;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* loaded from: classes2.dex */
public final class SNSVideoSelfieViewModel extends com.sumsub.sns.core.presentation.base.a<d> {

    /* renamed from: x, reason: collision with root package name */
    public static final a f14853x = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.d f14854q;

    /* renamed from: r, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.i f14855r;

    /* renamed from: s, reason: collision with root package name */
    public final String f14856s;

    /* renamed from: t, reason: collision with root package name */
    public final String f14857t;

    /* renamed from: u, reason: collision with root package name */
    public CountDownTimer f14858u;

    /* renamed from: v, reason: collision with root package name */
    public String f14859v;

    /* renamed from: w, reason: collision with root package name */
    public File f14860w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/camera/video/presentation/SNSVideoSelfieViewModel$State;", "", "(Ljava/lang/String;I)V", "Countdown", "Recording", "Done", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        Countdown,
        Recording,
        Done
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static abstract class b implements a.j {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final c f14861a;

            public a(c cVar) {
                super(null);
                this.f14861a = cVar;
            }

            public final c b() {
                return this.f14861a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.f.b(this.f14861a, ((a) obj).f14861a);
            }

            public int hashCode() {
                return this.f14861a.hashCode();
            }

            public String toString() {
                return "ResultObtained(result=" + this.f14861a + ')';
            }
        }

        /* renamed from: com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$b$b, reason: collision with other inner class name */
        public static final class C0184b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final File f14862a;

            public C0184b(File file) {
                super(null);
                this.f14862a = file;
            }

            public final File b() {
                return this.f14862a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0184b) && kotlin.jvm.internal.f.b(this.f14862a, ((C0184b) obj).f14862a);
            }

            public int hashCode() {
                return this.f14862a.hashCode();
            }

            public String toString() {
                return "StartRecording(file=" + this.f14862a + ')';
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f14863a = new c();

            public c() {
                super(null);
            }
        }

        public static abstract class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public final State f14864a;

            public static final class a extends d {
                public a(State state) {
                    super(state, null);
                }
            }

            /* renamed from: com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$b$d$b, reason: collision with other inner class name */
            public static final class C0185b extends d {

                /* renamed from: b, reason: collision with root package name */
                public final long f14865b;

                public C0185b(State state, long j10) {
                    super(state, null);
                    this.f14865b = j10;
                }

                public final long b() {
                    return this.f14865b;
                }
            }

            public /* synthetic */ d(State state, DefaultConstructorMarker defaultConstructorMarker) {
                this(state);
            }

            public final State a() {
                return this.f14864a;
            }

            public d(State state) {
                super(null);
                this.f14864a = state;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f14866a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14867b;

        public c(File file, String str) {
            this.f14866a = file;
            this.f14867b = str;
        }

        public final File c() {
            return this.f14866a;
        }

        public final String d() {
            return this.f14867b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f14866a, cVar.f14866a) && kotlin.jvm.internal.f.b(this.f14867b, cVar.f14867b);
        }

        public int hashCode() {
            return this.f14867b.hashCode() + (this.f14866a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Result(file=");
            sb2.append(this.f14866a);
            sb2.append(", phrase=");
            return v.q(sb2, this.f14867b, ')');
        }
    }

    public static final class d implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final e f14868a;

        /* renamed from: b, reason: collision with root package name */
        public final State f14869b;

        public d() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final d a(e eVar, State state) {
            return new d(eVar, state);
        }

        public final State c() {
            return this.f14869b;
        }

        public final e d() {
            return this.f14868a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f14868a, dVar.f14868a) && this.f14869b == dVar.f14869b;
        }

        public int hashCode() {
            int hashCode = this.f14868a.hashCode() * 31;
            State state = this.f14869b;
            return hashCode + (state == null ? 0 : state.hashCode());
        }

        public String toString() {
            return "ViewState(viewText=" + this.f14868a + ", state=" + this.f14869b + ')';
        }

        public d(e eVar, State state) {
            this.f14868a = eVar;
            this.f14869b = state;
        }

        public static /* synthetic */ d a(d dVar, e eVar, State state, int i, Object obj) {
            if ((i & 1) != 0) {
                eVar = dVar.f14868a;
            }
            if ((i & 2) != 0) {
                state = dVar.f14869b;
            }
            return dVar.a(eVar, state);
        }

        public /* synthetic */ d(e eVar, State state, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new e(null, null, null, null, null, null, 63, null) : eVar, (i & 2) != 0 ? null : state);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f14870a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14871b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f14872c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f14873d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f14874e;

        /* renamed from: f, reason: collision with root package name */
        public final CharSequence f14875f;

        public e() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final e a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6) {
            return new e(charSequence, charSequence2, charSequence3, charSequence4, charSequence5, charSequence6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.f.b(this.f14870a, eVar.f14870a) && kotlin.jvm.internal.f.b(this.f14871b, eVar.f14871b) && kotlin.jvm.internal.f.b(this.f14872c, eVar.f14872c) && kotlin.jvm.internal.f.b(this.f14873d, eVar.f14873d) && kotlin.jvm.internal.f.b(this.f14874e, eVar.f14874e) && kotlin.jvm.internal.f.b(this.f14875f, eVar.f14875f);
        }

        public final CharSequence g() {
            return this.f14871b;
        }

        public final CharSequence h() {
            return this.f14872c;
        }

        public int hashCode() {
            CharSequence charSequence = this.f14870a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f14871b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f14872c;
            int hashCode3 = (hashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f14873d;
            int hashCode4 = (hashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31;
            CharSequence charSequence5 = this.f14874e;
            int hashCode5 = (hashCode4 + (charSequence5 == null ? 0 : charSequence5.hashCode())) * 31;
            CharSequence charSequence6 = this.f14875f;
            return hashCode5 + (charSequence6 != null ? charSequence6.hashCode() : 0);
        }

        public final CharSequence i() {
            return this.f14873d;
        }

        public final CharSequence j() {
            return this.f14875f;
        }

        public final CharSequence k() {
            return this.f14874e;
        }

        public final CharSequence l() {
            return this.f14870a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewText(message=");
            sb2.append((Object) this.f14870a);
            sb2.append(", description1=");
            sb2.append((Object) this.f14871b);
            sb2.append(", description2=");
            sb2.append((Object) this.f14872c);
            sb2.append(", lackOfCameraMessage=");
            sb2.append((Object) this.f14873d);
            sb2.append(", lackOfCameraPositive=");
            sb2.append((Object) this.f14874e);
            sb2.append(", lackOfCameraNeutral=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14875f, ')');
        }

        public e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6) {
            this.f14870a = charSequence;
            this.f14871b = charSequence2;
            this.f14872c = charSequence3;
            this.f14873d = charSequence4;
            this.f14874e = charSequence5;
            this.f14875f = charSequence6;
        }

        public static /* synthetic */ e a(e eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = eVar.f14870a;
            }
            if ((i & 2) != 0) {
                charSequence2 = eVar.f14871b;
            }
            CharSequence charSequence7 = charSequence2;
            if ((i & 4) != 0) {
                charSequence3 = eVar.f14872c;
            }
            CharSequence charSequence8 = charSequence3;
            if ((i & 8) != 0) {
                charSequence4 = eVar.f14873d;
            }
            CharSequence charSequence9 = charSequence4;
            if ((i & 16) != 0) {
                charSequence5 = eVar.f14874e;
            }
            CharSequence charSequence10 = charSequence5;
            if ((i & 32) != 0) {
                charSequence6 = eVar.f14875f;
            }
            return eVar.a(charSequence, charSequence7, charSequence8, charSequence9, charSequence10, charSequence6);
        }

        public /* synthetic */ e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : charSequence4, (i & 16) != 0 ? null : charSequence5, (i & 32) != 0 ? null : charSequence6);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel", f = "SNSVideoSelfieViewModel.kt", l = {67, 83}, m = "initPhase")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14876a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14877b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14878c;

        /* renamed from: d, reason: collision with root package name */
        public int f14879d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14880e;

        /* renamed from: g, reason: collision with root package name */
        public int f14882g;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14880e = obj;
            this.f14882g |= Integer.MIN_VALUE;
            return SNSVideoSelfieViewModel.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$onCountdownFinished$1", f = "SNSVideoSelfieViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14883a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14884b;

        public g(T9.a<? super g> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((g) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            g gVar = new g(aVar);
            gVar.f14884b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14883a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return d.a((d) this.f14884b, null, State.Recording, 1, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$onCountdownFinished$2", f = "SNSVideoSelfieViewModel.kt", l = {99}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14885a;

        /* renamed from: b, reason: collision with root package name */
        public int f14886b;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((h) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return SNSVideoSelfieViewModel.this.new h(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SNSVideoSelfieViewModel sNSVideoSelfieViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14886b;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    String str = UUID.randomUUID().toString() + ".mp4";
                    com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", s3.b.j("File name is ", str), null, 4, null);
                    SNSVideoSelfieViewModel sNSVideoSelfieViewModel2 = SNSVideoSelfieViewModel.this;
                    com.sumsub.sns.internal.core.domain.d dVar = sNSVideoSelfieViewModel2.f14854q;
                    d.a aVar = new d.a(str);
                    this.f14885a = sNSVideoSelfieViewModel2;
                    this.f14886b = 1;
                    obj = dVar.a(aVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sNSVideoSelfieViewModel = sNSVideoSelfieViewModel2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sNSVideoSelfieViewModel = (SNSVideoSelfieViewModel) this.f14885a;
                    kotlin.b.b(obj);
                }
                sNSVideoSelfieViewModel.f14860w = (File) obj;
                SNSVideoSelfieViewModel sNSVideoSelfieViewModel3 = SNSVideoSelfieViewModel.this;
                sNSVideoSelfieViewModel3.a(new b.C0184b(sNSVideoSelfieViewModel3.f14860w));
            } catch (Exception e10) {
                com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "An error while creating new video selfie file...", e10);
                com.sumsub.sns.core.presentation.base.a.a(SNSVideoSelfieViewModel.this, (q) null, (Object) null, (Long) null, 7, (Object) null);
            }
            return p.f3034a;
        }
    }

    public static final class i extends CountDownTimer {
        public i() {
            super(7600L, 50L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SNSVideoSelfieViewModel.this.a(new b.d.a(State.Recording));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            SNSVideoSelfieViewModel.this.a(new b.d.C0185b(State.Recording, j10));
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel", f = "SNSVideoSelfieViewModel.kt", l = {53}, m = "onPrepare")
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14889a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14890b;

        /* renamed from: d, reason: collision with root package name */
        public int f14892d;

        public j(T9.a<? super j> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14890b = obj;
            this.f14892d |= Integer.MIN_VALUE;
            return SNSVideoSelfieViewModel.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$onPrepare$2", f = "SNSVideoSelfieViewModel.kt", l = {56, 57, 58, 59, 60}, m = "invokeSuspend")
    public static final class k extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14893a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14894b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14895c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14896d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14897e;

        /* renamed from: f, reason: collision with root package name */
        public int f14898f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14899g;

        public k(T9.a<? super k> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((k) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            k kVar = SNSVideoSelfieViewModel.this.new k(aVar);
            kVar.f14899g = obj;
            return kVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x012e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 325
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$onRecordingFinished$1", f = "SNSVideoSelfieViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class l extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14901a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14902b;

        public l(T9.a<? super l> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((l) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            l lVar = new l(aVar);
            lVar.f14902b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14901a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return d.a((d) this.f14902b, null, State.Done, 1, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$onRecordingStarted$1", f = "SNSVideoSelfieViewModel.kt", l = {142}, m = "invokeSuspend")
    public static final class n extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14904a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f14905b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSVideoSelfieViewModel f14906c;

        @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$onRecordingStarted$1$1$1", f = "SNSVideoSelfieViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14907a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14908b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f14909c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, T9.a<? super a> aVar) {
                super(2, aVar);
                this.f14909c = str;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d dVar, T9.a<? super d> aVar) {
                return ((a) create(dVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(this.f14909c, aVar);
                aVar2.f14908b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14907a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                d dVar = (d) this.f14908b;
                return d.a(dVar, e.a(dVar.d(), this.f14909c, null, null, null, null, null, 62, null), null, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(File file, SNSVideoSelfieViewModel sNSVideoSelfieViewModel, T9.a<? super n> aVar) {
            super(2, aVar);
            this.f14905b = file;
            this.f14906c = sNSVideoSelfieViewModel;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((n) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new n(this.f14905b, this.f14906c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14904a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "onRecordingStarted: " + this.f14905b.getName(), null, 4, null);
                this.f14904a = 1;
                if (DelayKt.delay(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            String str = this.f14906c.f14859v;
            if (str != null) {
                com.sumsub.sns.core.presentation.base.a.a(this.f14906c, false, new a(str, null), 1, null);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$startCountdown$1", f = "SNSVideoSelfieViewModel.kt", l = {127}, m = "invokeSuspend")
    public static final class o extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14910a;

        @V9.d(c = "com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$startCountdown$1$1", f = "SNSVideoSelfieViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14912a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14913b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d dVar, T9.a<? super d> aVar) {
                return ((a) create(dVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f14913b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14912a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return d.a((d) this.f14913b, null, State.Countdown, 1, null);
            }
        }

        public static final class b extends CountDownTimer {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SNSVideoSelfieViewModel f14914a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SNSVideoSelfieViewModel sNSVideoSelfieViewModel) {
                super(3000L, 50L);
                this.f14914a = sNSVideoSelfieViewModel;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.f14914a.r();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                this.f14914a.a(new b.d.C0185b(State.Countdown, j10));
            }
        }

        public o(T9.a<? super o> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((o) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return SNSVideoSelfieViewModel.this.new o(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14910a;
            if (i == 0) {
                kotlin.b.b(obj);
                if (SNSVideoSelfieViewModel.this.f14859v == null) {
                    SNSVideoSelfieViewModel sNSVideoSelfieViewModel = SNSVideoSelfieViewModel.this;
                    this.f14910a = 1;
                    if (sNSVideoSelfieViewModel.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            com.sumsub.sns.core.presentation.base.a.a(SNSVideoSelfieViewModel.this, false, new a(null), 1, null);
            SNSVideoSelfieViewModel.this.p();
            SNSVideoSelfieViewModel.this.f14858u = new b(SNSVideoSelfieViewModel.this).start();
            return p.f3034a;
        }
    }

    public SNSVideoSelfieViewModel(com.sumsub.sns.internal.core.domain.d dVar, com.sumsub.sns.internal.core.domain.i iVar, String str, String str2, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f14854q = dVar;
        this.f14855r = iVar;
        this.f14856s = str;
        this.f14857t = str2;
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Video Selfie is created", null, 4, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        p();
    }

    public final void p() {
        CountDownTimer countDownTimer = this.f14858u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f14858u = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void r() {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Countdown is finished", null, 4, null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new g(null), 1, null);
        p();
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new h(null), 3, null);
        this.f14858u = new i().start();
    }

    public final void s() {
        StringBuilder sb2 = new StringBuilder("File is created. File - ");
        File file = this.f14860w;
        sb2.append(file != null ? file.getAbsolutePath() : null);
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", sb2.toString(), null, 4, null);
        File file2 = this.f14860w;
        if (file2 != null) {
            String str = this.f14859v;
            if (str == null) {
                str = "";
            }
            a(new b.a(new c(file2, str)));
        }
    }

    public final void t() {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Recording is finished", null, 4, null);
        p();
        a(b.c.f14863a);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new l(null), 1, null);
        this.f14858u = new m().start();
    }

    public final Job u() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new o(null), 3, null);
        return launch$default;
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
            boolean r0 = r5 instanceof com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel.j
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$j r0 = (com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel.j) r0
            int r1 = r0.f14892d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14892d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$j r0 = new com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$j
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14890b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14892d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f14889a
            com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel r0 = (com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f14889a = r4
            r0.f14892d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$k r5 = new com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel$k
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            com.sumsub.sns.core.presentation.base.a.a(r0, r2, r5, r3, r1)
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel.c(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super O9.p> r11) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.video.presentation.SNSVideoSelfieViewModel.d(T9.a):java.lang.Object");
    }

    public final Job a(File file) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new n(file, this, null), 3, null);
        return launch$default;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void a(a.j jVar) {
        if (jVar instanceof b.d.C0185b) {
            a(jVar, false);
        } else {
            super.a(jVar);
        }
    }

    public static final class m extends CountDownTimer {
        public m() {
            super(1000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SNSVideoSelfieViewModel.this.s();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }
}
