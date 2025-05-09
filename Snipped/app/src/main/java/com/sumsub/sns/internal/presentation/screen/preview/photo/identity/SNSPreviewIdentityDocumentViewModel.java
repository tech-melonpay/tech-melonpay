package com.sumsub.sns.internal.presentation.screen.preview.photo.identity;

import C.v;
import O9.p;
import android.graphics.Bitmap;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0650p;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.o0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.l;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.domain.o;
import com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel;
import ia.InterfaceC0840h;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class SNSPreviewIdentityDocumentViewModel extends SNSPreviewPhotoDocumentViewModel {
    public static final /* synthetic */ InterfaceC0840h<Object>[] Y;
    public final com.sumsub.sns.internal.core.data.source.extensions.a W;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a X;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/presentation/screen/preview/photo/identity/SNSPreviewIdentityDocumentViewModel$DocumentSideness;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "SINGLE", "DOUBLE", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DocumentSideness {
        UNKNOWN,
        SINGLE,
        DOUBLE
    }

    public static final class a implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final String f18661a;

        public a(String str) {
            this.f18661a = str;
        }

        public final String b() {
            return this.f18661a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.f.b(this.f18661a, ((a) obj).f18661a);
        }

        public int hashCode() {
            return this.f18661a.hashCode();
        }

        public String toString() {
            return v.q(new StringBuilder("SelectorRequest(documentType="), this.f18661a, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {113}, m = "findPreferredDocumentInSelector")
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18662a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18663b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18664c;

        /* renamed from: e, reason: collision with root package name */
        public int f18666e;

        public b(T9.a<? super b> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18664c = obj;
            this.f18666e |= Integer.MIN_VALUE;
            return SNSPreviewIdentityDocumentViewModel.this.a((Map<String, SNSDocumentDefinition>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {95, 99}, m = "onDataLoaded")
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18667a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18668b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f18669c;

        /* renamed from: e, reason: collision with root package name */
        public int f18671e;

        public c(T9.a<? super c> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18669c = obj;
            this.f18671e |= Integer.MIN_VALUE;
            return SNSPreviewIdentityDocumentViewModel.this.a((com.sumsub.sns.internal.core.data.model.g) null, (com.sumsub.sns.internal.core.data.model.e) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$onDocumentAndCountrySelected$1", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18672a;

        public d(T9.a<? super d> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((d) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return SNSPreviewIdentityDocumentViewModel.this.new d(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f18672a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPreviewIdentityDocumentViewModel sNSPreviewIdentityDocumentViewModel = SNSPreviewIdentityDocumentViewModel.this;
                this.f18672a = 1;
                if (sNSPreviewIdentityDocumentViewModel.c(false, (T9.a<? super p>) this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {71}, m = "onPrepare")
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18674a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18675b;

        /* renamed from: d, reason: collision with root package name */
        public int f18677d;

        public e(T9.a<? super e> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18675b = obj;
            this.f18677d |= Integer.MIN_VALUE;
            return SNSPreviewIdentityDocumentViewModel.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256}, m = "preparePickerRequest")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18678a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18679b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f18680c;

        /* renamed from: d, reason: collision with root package name */
        public int f18681d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f18682e;

        /* renamed from: g, reason: collision with root package name */
        public int f18684g;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18682e = obj;
            this.f18684g |= Integer.MIN_VALUE;
            return SNSPreviewIdentityDocumentViewModel.this.a(false, (com.sumsub.sns.internal.core.data.model.g) null, (T9.a<? super SNSPreviewPhotoDocumentViewModel.f>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384}, m = "resolveSecondSide")
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f18685a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18686b;

        /* renamed from: d, reason: collision with root package name */
        public int f18688d;

        public g(T9.a<? super g> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18686b = obj;
            this.f18688d |= Integer.MIN_VALUE;
            return SNSPreviewIdentityDocumentViewModel.this.b(false, (T9.a<? super p>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$showDocumentTypeSelector$1", f = "SNSPreviewIdentityDocumentViewModel.kt", l = {128, 129, 130}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f18689a;

        /* renamed from: b, reason: collision with root package name */
        public Object f18690b;

        /* renamed from: c, reason: collision with root package name */
        public int f18691c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18692d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ SNSPreviewIdentityDocumentViewModel f18693e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, SNSPreviewIdentityDocumentViewModel sNSPreviewIdentityDocumentViewModel, T9.a<? super h> aVar) {
            super(2, aVar);
            this.f18692d = z10;
            this.f18693e = sNSPreviewIdentityDocumentViewModel;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((h) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return new h(this.f18692d, this.f18693e, aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SNSPreviewIdentityDocumentViewModel.class, "showSelectorOnStart", "getShowSelectorOnStart()Z", 0);
        kotlin.jvm.internal.h.f23186a.getClass();
        Y = new InterfaceC0840h[]{mutablePropertyReference1Impl};
    }

    public SNSPreviewIdentityDocumentViewModel(Document document, G g10, o oVar, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.core.data.source.extensions.a aVar2, o0 o0Var, com.sumsub.sns.internal.ml.core.e<Bitmap, com.sumsub.sns.internal.ml.badphotos.models.a> eVar, com.sumsub.sns.internal.core.domain.b bVar2) {
        super(document, g10, aVar, bVar, aVar2, oVar, o0Var, eVar, bVar2);
        this.W = aVar2;
        this.X = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "showSelectorOnStart", Boolean.TRUE);
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel
    public void L() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onRestartStep", null, 4, null);
        if (G()) {
            super.L();
        } else {
            Q();
            h(true);
        }
    }

    public final boolean S() {
        return e0.f15081a.getPreferredDocumentsDefinitions() != null;
    }

    public final boolean T() {
        return ((Boolean) this.X.a(this, Y[0])).booleanValue();
    }

    public final boolean U() {
        if (I() == IdentitySide.Front) {
            if (!F().isEmpty()) {
                return true;
            }
        } else if (F().size() > 1) {
            return true;
        }
        return false;
    }

    public final void V() {
        if (U() || G() || S()) {
            com.sumsub.sns.core.presentation.base.a.a(this, (q) null, (Object) null, (Long) null, 7, (Object) null);
        } else {
            W();
        }
    }

    public final void W() {
        Q();
        a((n) null);
    }

    public final void X() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "restartStep", null, 4, null);
        if (I() == IdentitySide.Front) {
            a(this, false, 1, (Object) null);
        } else {
            a((l) null);
        }
    }

    public final void Y() {
        com.sumsub.sns.internal.core.analytics.b.f14967a.a(GlobalStatePayload.IdDocSubType, I().getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel, com.sumsub.sns.core.presentation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super O9.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.e
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$e r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.e) r0
            int r1 = r0.f18677d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18677d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$e r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18675b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18677d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f18674a
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel) r0
            kotlin.b.b(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.b.b(r5)
            r0.f18674a = r4
            r0.f18677d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            r0.m()
            O9.p r5 = O9.p.f3034a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.c(T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel
    public Object e(T9.a<? super CharSequence> aVar) {
        return this.W.a(com.sumsub.sns.internal.core.data.model.q.a(com.sumsub.sns.internal.core.data.model.q.f15559c.a(v()), h(), null, 2, null));
    }

    public final void g(boolean z10) {
        this.X.a(this, Y[0], Boolean.valueOf(z10));
    }

    public final Job h(boolean z10) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new h(z10, this, null), 3, null);
        return launch$default;
    }

    public final void b(String str, String str2) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", s3.b.k("onDocumentAndCountrySelected: c=", str, ", t=", str2), null, 4, null);
        a(str, str2);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new d(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel, com.sumsub.sns.internal.presentation.screen.preview.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.sumsub.sns.internal.core.data.model.g r13, com.sumsub.sns.internal.core.data.model.e r14, T9.a<? super O9.p> r15) {
        /*
            r12 = this;
            boolean r13 = r15 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.c
            if (r13 == 0) goto L13
            r13 = r15
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$c r13 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.c) r13
            int r0 = r13.f18671e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r13.f18671e = r0
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$c r13 = new com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$c
            r13.<init>(r15)
        L18:
            java.lang.Object r15 = r13.f18669c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r13.f18671e
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L41
            if (r1 == r4) goto L35
            if (r1 != r2) goto L2d
            kotlin.b.b(r15)
            goto Lc0
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            java.lang.Object r14 = r13.f18668b
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r1 = r13.f18667a
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel r1 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel) r1
            kotlin.b.b(r15)
            goto La0
        L41:
            kotlin.b.b(r15)
            com.sumsub.sns.internal.camera.photo.presentation.document.b r6 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "onDataLoaded: shouldSkipSelector="
            r15.<init>(r1)
            boolean r1 = r12.G()
            r15.append(r1)
            java.lang.String r1 = " showSelectorOnStart="
            r15.append(r1)
            boolean r1 = r12.T()
            r15.append(r1)
            java.lang.String r8 = r15.toString()
            r10 = 4
            r11 = 0
            java.lang.String r7 = "DocCapture"
            r9 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r6, r7, r8, r9, r10, r11)
            boolean r15 = r12.G()
            if (r15 == 0) goto Lc3
            if (r14 == 0) goto L79
            java.util.Map r14 = r14.v()
            goto L7a
        L79:
            r14 = r5
        L7a:
            if (r14 == 0) goto L8a
            java.util.Set r14 = r14.keySet()
            if (r14 == 0) goto L8a
            java.lang.Object r14 = P9.s.K(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L92
        L8a:
            java.lang.String r14 = r12.s()
            if (r14 != 0) goto L92
            java.lang.String r14 = "ATA"
        L92:
            r13.f18667a = r12
            r13.f18668b = r14
            r13.f18671e = r4
            java.lang.Object r15 = r12.b(r14, r13)
            if (r15 != r0) goto L9f
            return r0
        L9f:
            r1 = r12
        La0:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = P9.s.L(r15)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto Lb0
            com.sumsub.sns.internal.core.data.model.q$e r15 = com.sumsub.sns.internal.core.data.model.q.e.f15565f
            java.lang.String r15 = r15.b()
        Lb0:
            r1.a(r14, r15)
            r13.f18667a = r5
            r13.f18668b = r5
            r13.f18671e = r2
            java.lang.Object r13 = r1.c(r3, r13)
            if (r13 != r0) goto Lc0
            return r0
        Lc0:
            O9.p r13 = O9.p.f3034a
            return r13
        Lc3:
            boolean r13 = r12.T()
            if (r13 == 0) goto Lcf
            r12.g(r3)
            a(r12, r3, r4, r5)
        Lcf:
            O9.p r13 = O9.p.f3034a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.a(com.sumsub.sns.internal.core.data.model.g, com.sumsub.sns.internal.core.data.model.e, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(boolean r6, T9.a<? super O9.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.g
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$g r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.g) r0
            int r1 = r0.f18688d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18688d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$g r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18686b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18688d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f18685a
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel r6 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel) r6
            kotlin.b.b(r7)
            goto L49
        L3a:
            kotlin.b.b(r7)
            r0.f18685a = r5
            r0.f18688d = r4
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$DocumentSideness r7 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.DocumentSideness) r7
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$DocumentSideness r2 = com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.DocumentSideness.UNKNOWN
            if (r7 != r2) goto L5e
            r7 = 0
            r0.f18685a = r7
            r0.f18688d = r3
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            O9.p r6 = O9.p.f3034a
            return r6
        L5e:
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$DocumentSideness r0 = com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.DocumentSideness.DOUBLE
            if (r7 != r0) goto L63
            goto L64
        L63:
            r4 = 0
        L64:
            r6.d(r4)
            O9.p r6 = O9.p.f3034a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.b(boolean, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel, com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "Preview photo error handling... " + oVar, null, 4, null);
        if (oVar instanceof o.e) {
            x();
        } else {
            super.b(oVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.Map<java.lang.String, com.sumsub.sns.core.data.model.SNSDocumentDefinition> r6, T9.a<? super com.sumsub.sns.core.data.model.SNSDocumentDefinition> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.b
            if (r0 == 0) goto L13
            r0 = r7
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$b r0 = (com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.b) r0
            int r1 = r0.f18666e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18666e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$b r0 = new com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18664c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f18666e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f18663b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.f18662a
            com.sumsub.sns.core.data.model.SNSDocumentDefinition r0 = (com.sumsub.sns.core.data.model.SNSDocumentDefinition) r0
            kotlin.b.b(r7)
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.b.b(r7)
            com.sumsub.sns.internal.core.data.model.Document r7 = r5.u()
            com.sumsub.sns.internal.core.data.model.DocumentType r7 = r7.getType()
            java.lang.String r7 = r7.c()
            java.lang.Object r6 = r6.get(r7)
            com.sumsub.sns.core.data.model.SNSDocumentDefinition r6 = (com.sumsub.sns.core.data.model.SNSDocumentDefinition) r6
            if (r6 != 0) goto L50
            return r4
        L50:
            java.lang.String r7 = r6.getCountry()
            if (r7 != 0) goto L57
            return r4
        L57:
            java.lang.String r2 = r6.getIdDocType()
            if (r2 != 0) goto L5e
            return r4
        L5e:
            r0.f18662a = r6
            r0.f18663b = r2
            r0.f18666e = r3
            java.lang.Object r7 = r5.b(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
            r6 = r2
        L6d:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L73:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.jvm.internal.f.b(r2, r6)
            if (r2 == 0) goto L73
            goto L88
        L87:
            r1 = r4
        L88:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L8d
            r4 = r0
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.a(java.util.Map, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Job a(SNSPreviewIdentityDocumentViewModel sNSPreviewIdentityDocumentViewModel, boolean z10, int i, Object obj) {
        if ((i & 1) != 0) {
            z10 = false;
        }
        return sNSPreviewIdentityDocumentViewModel.h(z10);
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel
    public String a(Map<String, String> map, String str) {
        if (G()) {
            String n10 = v.n(str, "_noSelector");
            if ((map != null ? map.get(n10) : null) != null) {
                return n10;
            }
            if ((map != null ? map.get(str) : null) != null) {
                return str;
            }
            return (map != null ? map.get("default_noSelector") : null) != null ? "default_noSelector" : "default";
        }
        return super.a(map, str);
    }

    public final void a(String str, String str2) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", s3.b.k("applyCountryAndType: c=", str, ", t=", str2), null, 4, null);
        b(str);
        c(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (kotlin.jvm.internal.f.b(r2.r(), java.lang.Boolean.TRUE) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(boolean r18, com.sumsub.sns.internal.core.data.model.g r19, T9.a<? super com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel.f> r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel.a(boolean, com.sumsub.sns.internal.core.data.model.g, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.presentation.screen.preview.photo.SNSPreviewPhotoDocumentViewModel
    public void a(n nVar) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "id preview - on picker result: " + nVar + ", shouldSkipSelector=" + G(), null, 4, null);
        if (nVar == null && !G()) {
            ArrayList arrayList = new ArrayList(F());
            arrayList.clear();
            a(arrayList);
            a(IdentitySide.Front);
            Y();
            if (!S()) {
                a(this, false, 1, (Object) null);
                return;
            } else {
                com.sumsub.sns.core.presentation.base.a.a(this, (q) null, (Object) null, (Long) null, 7, (Object) null);
                return;
            }
        }
        super.a(nVar);
    }
}
