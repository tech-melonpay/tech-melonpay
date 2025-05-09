package com.sumsub.sns.internal.camera;

import O9.p;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.camera.c;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.log.LoggerType;
import java.io.File;
import ka.C0967l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public abstract class b extends com.sumsub.sns.internal.camera.c {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f14427x;

    /* renamed from: y, reason: collision with root package name */
    public final MutableStateFlow<a> f14428y;

    /* renamed from: z, reason: collision with root package name */
    public final StateFlow<a> f14429z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f14430a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14431b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f14432c;

        public a() {
            this(null, null, null, 7, null);
        }

        public final a a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            return new a(charSequence, charSequence2, charSequence3);
        }

        public final CharSequence d() {
            return this.f14432c;
        }

        public final CharSequence e() {
            return this.f14431b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f14430a, aVar.f14430a) && kotlin.jvm.internal.f.b(this.f14431b, aVar.f14431b) && kotlin.jvm.internal.f.b(this.f14432c, aVar.f14432c);
        }

        public final CharSequence f() {
            return this.f14430a;
        }

        public int hashCode() {
            CharSequence charSequence = this.f14430a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f14431b;
            int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.f14432c;
            return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(permissionsTitle=");
            sb2.append((Object) this.f14430a);
            sb2.append(", permissionsPositive=");
            sb2.append((Object) this.f14431b);
            sb2.append(", permissionNegative=");
            return com.google.android.gms.measurement.internal.a.j(sb2, this.f14432c, ')');
        }

        public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            this.f14430a = charSequence;
            this.f14431b = charSequence2;
            this.f14432c = charSequence3;
        }

        public /* synthetic */ a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraPhotoViewModel$onGalleryImagePicked$1", f = "SNSCameraPhotoViewModel.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.camera.b$b, reason: collision with other inner class name */
    public static final class C0173b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14433a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14434b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f14435c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f14436d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Uri f14437e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f14438f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0173b(Context context, String str, Uri uri, b bVar, T9.a<? super C0173b> aVar) {
            super(2, aVar);
            this.f14435c = context;
            this.f14436d = str;
            this.f14437e = uri;
            this.f14438f = bVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((C0173b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            C0173b c0173b = new C0173b(this.f14435c, this.f14436d, this.f14437e, this.f14438f, aVar);
            c0173b.f14434b = obj;
            return c0173b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object a10;
            String scheme;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14433a;
            if (i == 0) {
                kotlin.b.b(obj);
                coroutineScope = (CoroutineScope) this.f14434b;
                Context context = this.f14435c;
                String str = this.f14436d;
                Uri uri = this.f14437e;
                this.f14434b = coroutineScope;
                this.f14433a = 1;
                a10 = i.a(context, str, uri, this);
                if (a10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f14434b;
                kotlin.b.b(obj);
                a10 = obj;
                coroutineScope = coroutineScope2;
            }
            Uri uri2 = (Uri) a10;
            Logger.e$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(coroutineScope), com.google.android.gms.measurement.internal.a.h("onGalleryImagePicked: temp file uri - ", uri2), null, 4, null);
            if (uri2 == null) {
                return p.f3034a;
            }
            String path = uri2.getPath();
            if (path == null || path.length() == 0 || (scheme = uri2.getScheme()) == null || !scheme.startsWith("file")) {
                return p.f3034a;
            }
            try {
                File file = new File(C0967l.X(uri2.toString(), "file://", "", false));
                com.sumsub.sns.core.presentation.base.a.a(this.f14438f, (q) null, new n(file, file, null, null, this.f14438f.q(), false, null, null, true, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, null), (Long) null, 5, (Object) null);
            } catch (Exception e10) {
                com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
                String a11 = com.sumsub.sns.internal.log.c.a(coroutineScope);
                String message = e10.getMessage();
                aVar.e(a11, message != null ? message : "", e10);
                this.f14438f.a("Can't copy gallery file", e10);
            }
            return p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraPhotoViewModel$onPictureTaken$1", f = "SNSCameraPhotoViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14439a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14440b;

        public c(T9.a<? super c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
            return ((c) create(bVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            c cVar = new c(aVar);
            cVar.f14440b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14439a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return c.b.a((c.b) this.f14440b, false, false, false, false, false, null, 61, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraPhotoViewModel", f = "SNSCameraPhotoViewModel.kt", l = {40}, m = "onPrepare$suspendImpl")
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14441a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14442b;

        /* renamed from: d, reason: collision with root package name */
        public int f14444d;

        public d(T9.a<? super d> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14442b = obj;
            this.f14444d |= Integer.MIN_VALUE;
            return b.a(b.this, (T9.a) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraPhotoViewModel$onPrepare$2", f = "SNSCameraPhotoViewModel.kt", l = {43, 44, 45}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<a, T9.a<? super a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14445a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14446b;

        /* renamed from: c, reason: collision with root package name */
        public int f14447c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14448d;

        public e(T9.a<? super e> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, T9.a<? super a> aVar2) {
            return ((e) create(aVar, aVar2)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = b.this.new e(aVar);
            eVar.f14448d = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
                int r1 = r6.f14447c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L33
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r0 = r6.f14446b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r6.f14445a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r6.f14448d
                com.sumsub.sns.internal.camera.b$a r2 = (com.sumsub.sns.internal.camera.b.a) r2
                kotlin.b.b(r7)
                goto L81
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L27:
                java.lang.Object r1 = r6.f14445a
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r3 = r6.f14448d
                com.sumsub.sns.internal.camera.b$a r3 = (com.sumsub.sns.internal.camera.b.a) r3
                kotlin.b.b(r7)
                goto L69
            L33:
                java.lang.Object r1 = r6.f14448d
                com.sumsub.sns.internal.camera.b$a r1 = (com.sumsub.sns.internal.camera.b.a) r1
                kotlin.b.b(r7)
                goto L52
            L3b:
                kotlin.b.b(r7)
                java.lang.Object r7 = r6.f14448d
                r1 = r7
                com.sumsub.sns.internal.camera.b$a r1 = (com.sumsub.sns.internal.camera.b.a) r1
                com.sumsub.sns.internal.camera.b r7 = com.sumsub.sns.internal.camera.b.this
                r6.f14448d = r1
                r6.f14447c = r4
                java.lang.String r4 = "sns_alert_lackOfPhotoLibraryPermissions"
                java.lang.Object r7 = com.sumsub.sns.internal.camera.b.a(r7, r4, r6)
                if (r7 != r0) goto L52
                return r0
            L52:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                com.sumsub.sns.internal.camera.b r4 = com.sumsub.sns.internal.camera.b.this
                r6.f14448d = r1
                r6.f14445a = r7
                r6.f14447c = r3
                java.lang.String r3 = "sns_alert_action_ok"
                java.lang.Object r3 = com.sumsub.sns.internal.camera.b.a(r4, r3, r6)
                if (r3 != r0) goto L65
                return r0
            L65:
                r5 = r1
                r1 = r7
                r7 = r3
                r3 = r5
            L69:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                com.sumsub.sns.internal.camera.b r4 = com.sumsub.sns.internal.camera.b.this
                r6.f14448d = r3
                r6.f14445a = r1
                r6.f14446b = r7
                r6.f14447c = r2
                java.lang.String r2 = "sns_alert_action_settings"
                java.lang.Object r2 = com.sumsub.sns.internal.camera.b.a(r4, r2, r6)
                if (r2 != r0) goto L7e
                return r0
            L7e:
                r0 = r7
                r7 = r2
                r2 = r3
            L81:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                com.sumsub.sns.internal.camera.b$a r7 = r2.a(r1, r0, r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraPhotoViewModel$sendLog$1", f = "SNSCameraPhotoViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14450a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14451b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14452c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Exception f14453d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Exception exc, T9.a<? super f> aVar) {
            super(2, aVar);
            this.f14452c = str;
            this.f14453d = exc;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((f) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            f fVar = new f(this.f14452c, this.f14453d, aVar);
            fVar.f14451b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14450a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            com.sumsub.sns.internal.log.a.f17535a.a(LoggerType.KIBANA).e(com.sumsub.sns.internal.log.c.a((CoroutineScope) this.f14451b), this.f14452c, this.f14453d);
            return p.f3034a;
        }
    }

    public /* synthetic */ b(DocumentType documentType, String str, boolean z10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentType, (i & 2) != 0 ? null : str, z10, aVar, bVar);
    }

    public final StateFlow<a> A() {
        return this.f14429z;
    }

    public final void B() {
        if (e0.f15081a.isDebug()) {
            a(new o.c(new Exception("Picker NOT found!!!"), null, null, 6, null), f());
        }
    }

    @Override // com.sumsub.sns.internal.camera.c, com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        return a(this, (T9.a) aVar);
    }

    public final boolean z() {
        return this.f14427x;
    }

    public b(DocumentType documentType, String str, boolean z10, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(documentType, str, aVar, bVar);
        this.f14427x = z10;
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow(new a(null, null, null, 7, null));
        this.f14428y = MutableStateFlow;
        this.f14429z = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(com.sumsub.sns.internal.camera.b r4, T9.a r5) {
        /*
            boolean r0 = r5 instanceof com.sumsub.sns.internal.camera.b.d
            if (r0 == 0) goto L13
            r0 = r5
            com.sumsub.sns.internal.camera.b$d r0 = (com.sumsub.sns.internal.camera.b.d) r0
            int r1 = r0.f14444d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14444d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.b$d r0 = new com.sumsub.sns.internal.camera.b$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14442b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14444d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f14441a
            com.sumsub.sns.internal.camera.b r4 = (com.sumsub.sns.internal.camera.b) r4
            kotlin.b.b(r5)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.b.b(r5)
            r0.f14441a = r4
            r0.f14444d = r3
            java.lang.Object r5 = super.c(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlinx.coroutines.flow.MutableStateFlow<com.sumsub.sns.internal.camera.b$a> r5 = r4.f14428y
            S0.a r0 = androidx.lifecycle.C0552s.b(r4)
            com.sumsub.sns.internal.camera.b$e r1 = new com.sumsub.sns.internal.camera.b$e
            r2 = 0
            r1.<init>(r2)
            com.sumsub.sns.internal.core.common.b0.a(r5, r0, r1)
            O9.p r4 = O9.p.f3034a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.b.a(com.sumsub.sns.internal.camera.b, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.camera.c
    public void a(File file) {
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Picture is taken", null, 4, null);
        b(true);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new c(null), 1, null);
        com.sumsub.sns.core.presentation.base.a.a(this, (q) null, new n(file, file, null, null, q(), false, null, null, false, 428, null), (Long) null, 5, (Object) null);
    }

    public void a(Context context, String str, Uri uri) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new C0173b(context, str, uri, this, null), 3, null);
    }

    public final void a(String str, Exception exc) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), NonCancellable.INSTANCE, null, new f(str, exc, null), 2, null);
    }
}
