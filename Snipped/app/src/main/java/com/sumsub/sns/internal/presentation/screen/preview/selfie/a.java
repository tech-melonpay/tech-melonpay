package com.sumsub.sns.internal.presentation.screen.preview.selfie;

import C.v;
import O9.p;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.VideoRequiredType;
import com.sumsub.sns.internal.core.data.model.g;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.data.model.remote.k;
import com.sumsub.sns.internal.core.domain.model.a;
import com.sumsub.sns.internal.domain.q;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.presentation.screen.preview.a;
import java.io.File;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.internal.presentation.screen.preview.a<d> {

    /* renamed from: F, reason: collision with root package name */
    public static final C0343a f18753F = new C0343a(null);

    /* renamed from: C, reason: collision with root package name */
    public final G f18754C;

    /* renamed from: D, reason: collision with root package name */
    public final q f18755D;

    /* renamed from: E, reason: collision with root package name */
    public final StateFlow<File> f18756E;

    /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.selfie.a$a, reason: collision with other inner class name */
    public static final class C0343a {
        public /* synthetic */ C0343a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0343a() {
        }
    }

    public static final class b implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final c f18757a;

        public b(c cVar) {
            this.f18757a = cVar;
        }

        public final c b() {
            return this.f18757a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f18757a, ((b) obj).f18757a);
        }

        public int hashCode() {
            return this.f18757a.hashCode();
        }

        public String toString() {
            return "ShowSelfiePicker(params=" + this.f18757a + ')';
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f18758a;

        /* renamed from: b, reason: collision with root package name */
        public final String f18759b;

        public c(String str, String str2) {
            this.f18758a = str;
            this.f18759b = str2;
        }

        public final String c() {
            return this.f18758a;
        }

        public final String d() {
            return this.f18759b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f18758a, cVar.f18758a) && kotlin.jvm.internal.f.b(this.f18759b, cVar.f18759b);
        }

        public int hashCode() {
            int hashCode = this.f18758a.hashCode() * 31;
            String str = this.f18759b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("VideoParams(idDocSetType=");
            sb2.append(this.f18758a);
            sb2.append(", type=");
            return v.q(sb2, this.f18759b, ')');
        }
    }

    public static final class d extends a.d {

        /* renamed from: a, reason: collision with root package name */
        public final File f18760a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f18761b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f18762c;

        /* renamed from: d, reason: collision with root package name */
        public final CharSequence f18763d;

        /* renamed from: e, reason: collision with root package name */
        public final CharSequence f18764e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f18765f;

        public d() {
            this(null, null, null, null, null, false, 63, null);
        }

        public final d a(File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10) {
            return new d(file, charSequence, charSequence2, charSequence3, charSequence4, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f18760a, dVar.f18760a) && kotlin.jvm.internal.f.b(this.f18761b, dVar.f18761b) && kotlin.jvm.internal.f.b(this.f18762c, dVar.f18762c) && kotlin.jvm.internal.f.b(this.f18763d, dVar.f18763d) && kotlin.jvm.internal.f.b(this.f18764e, dVar.f18764e) && this.f18765f == dVar.f18765f;
        }

        public final CharSequence g() {
            return this.f18764e;
        }

        public final CharSequence h() {
            return this.f18763d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            File file = this.f18760a;
            int hashCode = (file == null ? 0 : file.hashCode()) * 31;
            CharSequence charSequence = this.f18761b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.f18762c;
            int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f18763d;
            int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.f18764e;
            int hashCode5 = (hashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
            boolean z10 = this.f18765f;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return hashCode5 + i;
        }

        public final boolean i() {
            return this.f18765f;
        }

        public final CharSequence j() {
            return this.f18762c;
        }

        public final CharSequence k() {
            return this.f18761b;
        }

        public final File l() {
            return this.f18760a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(videoFile=");
            sb2.append(this.f18760a);
            sb2.append(", title=");
            sb2.append((Object) this.f18761b);
            sb2.append(", subtitle=");
            sb2.append((Object) this.f18762c);
            sb2.append(", buttonPositive=");
            sb2.append((Object) this.f18763d);
            sb2.append(", buttonNegative=");
            sb2.append((Object) this.f18764e);
            sb2.append(", showContent=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f18765f, ')');
        }

        public /* synthetic */ d(File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : file, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3, (i & 16) == 0 ? charSequence4 : null, (i & 32) != 0 ? false : z10);
        }

        public static /* synthetic */ d a(d dVar, File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, int i, Object obj) {
            if ((i & 1) != 0) {
                file = dVar.f18760a;
            }
            if ((i & 2) != 0) {
                charSequence = dVar.f18761b;
            }
            CharSequence charSequence5 = charSequence;
            if ((i & 4) != 0) {
                charSequence2 = dVar.f18762c;
            }
            CharSequence charSequence6 = charSequence2;
            if ((i & 8) != 0) {
                charSequence3 = dVar.f18763d;
            }
            CharSequence charSequence7 = charSequence3;
            if ((i & 16) != 0) {
                charSequence4 = dVar.f18764e;
            }
            CharSequence charSequence8 = charSequence4;
            if ((i & 32) != 0) {
                z10 = dVar.f18765f;
            }
            return dVar.a(file, charSequence5, charSequence6, charSequence7, charSequence8, z10);
        }

        public d(File file, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10) {
            this.f18760a = file;
            this.f18761b = charSequence;
            this.f18762c = charSequence2;
            this.f18763d = charSequence3;
            this.f18764e = charSequence4;
            this.f18765f = z10;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.selfie.SNSPreviewSelfieViewModel$onPrepare$2", f = "SNSPreviewSelfieViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<File, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18766a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18767b;

        @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.selfie.SNSPreviewSelfieViewModel$onPrepare$2$1", f = "SNSPreviewSelfieViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sumsub.sns.internal.presentation.screen.preview.selfie.a$e$a, reason: collision with other inner class name */
        public static final class C0344a extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f18769a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f18770b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ File f18771c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0344a(File file, T9.a<? super C0344a> aVar) {
                super(2, aVar);
                this.f18771c = file;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d dVar, T9.a<? super d> aVar) {
                return ((C0344a) create(dVar, aVar)).invokeSuspend(p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<p> create(Object obj, T9.a<?> aVar) {
                C0344a c0344a = new C0344a(this.f18771c, aVar);
                c0344a.f18770b = obj;
                return c0344a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f18769a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return d.a((d) this.f18770b, this.f18771c, null, null, null, null, false, 62, null);
            }
        }

        public e(T9.a<? super e> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(File file, T9.a<? super p> aVar) {
            return ((e) create(file, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = a.this.new e(aVar);
            eVar.f18767b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18766a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.core.presentation.base.a.a(a.this, false, new C0344a((File) this.f18767b, null), 1, null);
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.selfie.SNSPreviewSelfieViewModel$onPrepare$3", f = "SNSPreviewSelfieViewModel.kt", l = {58, 59, 60, 61}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18772a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18773b;

        /* renamed from: c, reason: collision with root package name */
        public Object f18774c;

        /* renamed from: d, reason: collision with root package name */
        public int f18775d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18776e;

        public f(T9.a<? super f> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((f) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            f fVar = a.this.new f(aVar);
            fVar.f18776e = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 201
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.selfie.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.selfie.SNSPreviewSelfieViewModel$onTakeAnotherDataClicked$1", f = "SNSPreviewSelfieViewModel.kt", l = {81}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18778a;

        public g(T9.a<? super g> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((g) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new g(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18778a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.core.data.source.dynamic.b t3 = a.this.t();
                this.f18778a = 1;
                obj = com.sumsub.sns.internal.core.data.source.dynamic.b.e(t3, false, this, 1, null);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            a.this.a((com.sumsub.sns.internal.core.data.model.g) ((com.sumsub.sns.internal.core.data.source.dynamic.e) obj).d());
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.selfie.SNSPreviewSelfieViewModel$showContent$1", f = "SNSPreviewSelfieViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<d, T9.a<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18780a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18781b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18782c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, T9.a<? super h> aVar) {
            super(2, aVar);
            this.f18782c = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, T9.a<? super d> aVar) {
            return ((h) create(dVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            h hVar = new h(this.f18782c, aVar);
            hVar.f18781b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f18780a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return d.a((d) this.f18781b, null, null, null, null, null, this.f18782c, 31, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.selfie.SNSPreviewSelfieViewModel$uploadDataOrMoveToStatusScreen$1", f = "SNSPreviewSelfieViewModel.kt", l = {115}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18783a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f18785c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, T9.a<? super i> aVar) {
            super(2, aVar);
            this.f18785c = file;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((i) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new i(this.f18785c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18783a;
            if (i == 0) {
                kotlin.b.b(obj);
                q qVar = a.this.f18755D;
                q.a aVar = new q.a(a.this.u(), this.f18785c, a.this.A());
                this.f18783a = 1;
                obj = qVar.a((q) aVar, (T9.a<? super com.sumsub.sns.internal.core.domain.model.a<? extends Exception, ? extends List<k>>>) this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            com.sumsub.sns.internal.core.domain.model.a aVar2 = (com.sumsub.sns.internal.core.domain.model.a) obj;
            a aVar3 = a.this;
            if (aVar2.b()) {
                aVar3.a(((a.b) aVar2).d());
            } else if (aVar2.a()) {
                aVar3.a((Exception) ((a.C0240a) aVar2).d());
            }
            return p.f3034a;
        }
    }

    public a(Document document, G g10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, q qVar, com.sumsub.sns.internal.core.domain.b bVar2) {
        super(document, g10, aVar, bVar, bVar2);
        this.f18754C = g10;
        this.f18755D = qVar;
        this.f18756E = g10.c(null, "KEY_FILE");
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Preview Selfie is created", null, 4, null);
    }

    public final String A() {
        return (String) this.f18754C.b("KEY_PHRASE");
    }

    public final void B() {
        String A10;
        File value = this.f18756E.getValue();
        if (value == null || (A10 = A()) == null || A10.length() == 0) {
            com.sumsub.sns.core.presentation.base.a.a(this, q.a.f15160b, (Object) null, (Long) null, 6, (Object) null);
            return;
        }
        b(true);
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Uploading video selfie fallback. File - " + value.getAbsolutePath() + ", Phrase - " + A(), null, 4, null);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new i(value, null), 3, null);
    }

    public void x() {
        B();
    }

    public void y() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new g(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(null, null, null, null, null, false, 63, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(o oVar) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Preview selfie error handling... " + oVar, null, 4, null);
        if (oVar instanceof o.e) {
            B();
        } else {
            super.b(oVar);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        b0.b(this.f18756E, C0552s.b(this), new e(null));
        com.sumsub.sns.core.presentation.base.a.a(this, false, new f(null), 1, null);
        m();
        return p.f3034a;
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public Object a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.data.model.e eVar, T9.a<? super p> aVar) {
        if (this.f18754C.b("KEY_FILE") == null) {
            a(gVar);
        } else {
            b(false);
            c(true);
        }
        return p.f3034a;
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.a
    public void c(boolean z10) {
        com.sumsub.sns.core.presentation.base.a.a(this, false, new h(z10, null), 1, null);
    }

    public final void a(File file, String str) {
        StringBuilder sb2 = new StringBuilder("onHandleVideoSelfie. File - ");
        sb2.append(file != null ? file.getAbsolutePath() : null);
        sb2.append(", Phrase size - ");
        sb2.append(str != null ? Integer.valueOf(str.length()) : null);
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", sb2.toString(), null, 4, null);
        if (file != null && str != null && str.length() != 0) {
            this.f18754C.d(file, "KEY_FILE");
            this.f18754C.d(str, "KEY_PHRASE");
            b(false);
            c(true);
            return;
        }
        if (this.f18756E.getValue() == null) {
            com.sumsub.sns.core.presentation.base.a.a(this, q.a.f15160b, (Object) null, (Long) null, 6, (Object) null);
        }
    }

    public final void a(Object obj) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "Video Selfie uploaded successful. Document is " + u().getType(), null, 4, null);
        a(u());
    }

    public final void a(Exception exc) {
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "An error while uploading video selfie", exc);
        b(false);
        com.sumsub.sns.core.presentation.base.a.a(this, exc, u().getType().c(), (Object) null, 4, (Object) null);
    }

    public final void a(com.sumsub.sns.internal.core.data.model.g gVar) {
        if (gVar == null) {
            com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "applicant null!", null, 4, null);
            Logger.e$default(com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA), "SumSubVideoSelfie", "applicant null!", null, 4, null);
            return;
        }
        g.c.a a10 = gVar.a(u().getType());
        com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "showPicker: docSet=" + a10, null, 4, null);
        if (kotlin.jvm.internal.f.b(a10 != null ? a10.r() : null, VideoRequiredType.Enabled.getValue())) {
            com.sumsub.sns.internal.presentation.screen.preview.selfie.c.a("SumSubVideoSelfie", "showPicker: show video selfie", null, 4, null);
            a((a.j) new b(new c(u().getType().c(), v())));
        }
    }
}
