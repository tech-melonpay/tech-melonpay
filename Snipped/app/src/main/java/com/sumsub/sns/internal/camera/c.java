package com.sumsub.sns.internal.camera;

import C.v;
import O9.p;
import android.util.Size;
import androidx.lifecycle.C0552s;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.core.data.model.q;
import com.sumsub.sns.internal.core.data.source.dynamic.b;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import com.sumsub.sns.internal.core.presentation.helper.camera.b;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public abstract class c extends com.sumsub.sns.core.presentation.base.a<b> {

    /* renamed from: q, reason: collision with root package name */
    public final DocumentType f14454q;

    /* renamed from: r, reason: collision with root package name */
    public final String f14455r;

    /* renamed from: s, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.common.a f14456s;

    /* renamed from: t, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.data.source.dynamic.b f14457t;

    /* renamed from: u, reason: collision with root package name */
    public final Size f14458u;

    /* renamed from: v, reason: collision with root package name */
    public final CameraX.b f14459v;

    /* renamed from: w, reason: collision with root package name */
    public IdentitySide f14460w;

    public static abstract class a implements a.j {

        /* renamed from: com.sumsub.sns.internal.camera.c$a$a, reason: collision with other inner class name */
        public static final class C0174a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final String f14461a;

            public C0174a(String str) {
                super(null);
                this.f14461a = str;
            }

            public final String b() {
                return this.f14461a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0174a) && kotlin.jvm.internal.f.b(this.f14461a, ((C0174a) obj).f14461a);
            }

            public int hashCode() {
                return this.f14461a.hashCode();
            }

            public String toString() {
                return v.q(new StringBuilder("TakePicture(filePrefix="), this.f14461a, ')');
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14462a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14463b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14464c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14465d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14466e;

        /* renamed from: f, reason: collision with root package name */
        public final com.sumsub.sns.internal.core.presentation.helper.camera.b f14467f;

        public b() {
            this(false, false, false, false, false, null, 63, null);
        }

        public final b a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.sumsub.sns.internal.core.presentation.helper.camera.b bVar) {
            return new b(z10, z11, z12, z13, z14, bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14462a == bVar.f14462a && this.f14463b == bVar.f14463b && this.f14464c == bVar.f14464c && this.f14465d == bVar.f14465d && this.f14466e == bVar.f14466e && kotlin.jvm.internal.f.b(this.f14467f, bVar.f14467f);
        }

        public final boolean g() {
            return this.f14463b;
        }

        public final boolean h() {
            return this.f14466e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.f14462a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            ?? r22 = this.f14463b;
            int i9 = r22;
            if (r22 != 0) {
                i9 = 1;
            }
            int i10 = (i + i9) * 31;
            ?? r23 = this.f14464c;
            int i11 = r23;
            if (r23 != 0) {
                i11 = 1;
            }
            int i12 = (i10 + i11) * 31;
            ?? r24 = this.f14465d;
            int i13 = r24;
            if (r24 != 0) {
                i13 = 1;
            }
            int i14 = (i12 + i13) * 31;
            boolean z11 = this.f14466e;
            int i15 = (i14 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            com.sumsub.sns.internal.core.presentation.helper.camera.b bVar = this.f14467f;
            return i15 + (bVar == null ? 0 : bVar.hashCode());
        }

        public final com.sumsub.sns.internal.core.presentation.helper.camera.b i() {
            return this.f14467f;
        }

        public final boolean j() {
            return this.f14462a;
        }

        public final boolean k() {
            return this.f14464c;
        }

        public final boolean l() {
            return this.f14465d;
        }

        public String toString() {
            return "ViewState(showCamera=" + this.f14462a + ", enableTakePicture=" + this.f14463b + ", showTakePicture=" + this.f14464c + ", showTakePictureProgress=" + this.f14465d + ", flash=" + this.f14466e + ", helperState=" + this.f14467f + ')';
        }

        public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.sumsub.sns.internal.core.presentation.helper.camera.b bVar) {
            this.f14462a = z10;
            this.f14463b = z11;
            this.f14464c = z12;
            this.f14465d = z13;
            this.f14466e = z14;
            this.f14467f = bVar;
        }

        public static /* synthetic */ b a(b bVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.sumsub.sns.internal.core.presentation.helper.camera.b bVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                z10 = bVar.f14462a;
            }
            if ((i & 2) != 0) {
                z11 = bVar.f14463b;
            }
            boolean z15 = z11;
            if ((i & 4) != 0) {
                z12 = bVar.f14464c;
            }
            boolean z16 = z12;
            if ((i & 8) != 0) {
                z13 = bVar.f14465d;
            }
            boolean z17 = z13;
            if ((i & 16) != 0) {
                z14 = bVar.f14466e;
            }
            boolean z18 = z14;
            if ((i & 32) != 0) {
                bVar2 = bVar.f14467f;
            }
            return bVar.a(z10, z15, z16, z17, z18, bVar2);
        }

        public /* synthetic */ b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, com.sumsub.sns.internal.core.presentation.helper.camera.b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z10, (i & 2) != 0 ? true : z11, (i & 4) == 0 ? z12 : true, (i & 8) != 0 ? false : z13, (i & 16) != 0 ? false : z14, (i & 32) != 0 ? null : bVar);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel$currentSide$1", f = "SNSCameraViewModel.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.sumsub.sns.internal.camera.c$c, reason: collision with other inner class name */
    public static final class C0175c extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14468a;

        public C0175c(T9.a<? super C0175c> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((C0175c) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return c.this.new C0175c(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14468a;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = c.this;
                this.f14468a = 1;
                if (cVar.d(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel$onCameraPermissionDenied$1", f = "SNSCameraViewModel.kt", l = {150, 151, 152}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14470a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14471b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14472c;

        /* renamed from: d, reason: collision with root package name */
        public int f14473d;

        /* renamed from: e, reason: collision with root package name */
        public int f14474e;

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
            return c.this.new d(aVar);
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
                int r1 = r9.f14474e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L3b
                if (r1 == r3) goto L2d
                if (r1 != r2) goto L25
                int r0 = r9.f14473d
                java.lang.Object r1 = r9.f14472c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Object r2 = r9.f14471b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.Object r3 = r9.f14470a
                com.sumsub.sns.internal.camera.c r3 = (com.sumsub.sns.internal.camera.c) r3
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
                int r1 = r9.f14473d
                java.lang.Object r3 = r9.f14471b
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.Object r4 = r9.f14470a
                com.sumsub.sns.internal.camera.c r4 = (com.sumsub.sns.internal.camera.c) r4
                kotlin.b.b(r10)
                goto L75
            L3b:
                int r1 = r9.f14473d
                java.lang.Object r4 = r9.f14470a
                com.sumsub.sns.internal.camera.c r4 = (com.sumsub.sns.internal.camera.c) r4
                kotlin.b.b(r10)
                goto L5d
            L45:
                kotlin.b.b(r10)
                com.sumsub.sns.internal.camera.c r10 = com.sumsub.sns.internal.camera.c.this
                r9.f14470a = r10
                r1 = 0
                r9.f14473d = r1
                r9.f14474e = r4
                java.lang.String r4 = "sns_alert_lackOfCameraPermissions"
                java.lang.Object r4 = com.sumsub.sns.internal.camera.c.a(r10, r4, r9)
                if (r4 != r0) goto L5a
                return r0
            L5a:
                r8 = r4
                r4 = r10
                r10 = r8
            L5d:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                com.sumsub.sns.internal.camera.c r5 = com.sumsub.sns.internal.camera.c.this
                r9.f14470a = r4
                r9.f14471b = r10
                r9.f14473d = r1
                r9.f14474e = r3
                java.lang.String r3 = "sns_alert_action_settings"
                java.lang.Object r3 = com.sumsub.sns.internal.camera.c.a(r5, r3, r9)
                if (r3 != r0) goto L72
                return r0
            L72:
                r8 = r3
                r3 = r10
                r10 = r8
            L75:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                com.sumsub.sns.internal.camera.c r5 = com.sumsub.sns.internal.camera.c.this
                r9.f14470a = r4
                r9.f14471b = r3
                r9.f14472c = r10
                r9.f14473d = r1
                r9.f14474e = r2
                java.lang.String r2 = "sns_alert_action_cancel"
                java.lang.Object r2 = com.sumsub.sns.internal.camera.c.a(r5, r2, r9)
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
                com.sumsub.sns.internal.camera.c.a(r7, r10)
                O9.p r10 = O9.p.f3034a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel$onPictureTaken$1", f = "SNSCameraViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements InterfaceC0650p<b, T9.a<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14476a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14477b;

        public e(T9.a<? super e> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, T9.a<? super b> aVar) {
            return ((e) create(bVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            e eVar = new e(aVar);
            eVar.f14477b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14476a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return b.a((b) this.f14477b, false, false, false, false, false, null, 61, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel", f = "SNSCameraViewModel.kt", l = {56, 60}, m = "onPrepare$suspendImpl")
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14478a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14479b;

        /* renamed from: d, reason: collision with root package name */
        public int f14481d;

        public f(T9.a<? super f> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14479b = obj;
            this.f14481d |= Integer.MIN_VALUE;
            return c.b(c.this, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel$onTakePictureClicked$1", f = "SNSCameraViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements InterfaceC0650p<b, T9.a<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14482a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14483b;

        public g(T9.a<? super g> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, T9.a<? super b> aVar) {
            return ((g) create(bVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            g gVar = new g(aVar);
            gVar.f14483b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14482a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return b.a((b) this.f14483b, false, false, false, false, false, null, 61, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel$onToggleFlashClicked$1", f = "SNSCameraViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements InterfaceC0650p<b, T9.a<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14484a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14485b;

        public h(T9.a<? super h> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, T9.a<? super b> aVar) {
            return ((h) create(bVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            h hVar = new h(aVar);
            hVar.f14485b = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14484a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return b.a((b) this.f14485b, false, false, false, false, !r0.h(), null, 47, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel", f = "SNSCameraViewModel.kt", l = {65}, m = "updateInstructions")
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14486a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14487b;

        /* renamed from: d, reason: collision with root package name */
        public int f14489d;

        public i(T9.a<? super i> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14487b = obj;
            this.f14489d |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.SNSCameraViewModel$updateInstructions$3", f = "SNSCameraViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements InterfaceC0650p<b, T9.a<? super b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14490a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14491b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f14493d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f14494e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.sumsub.sns.internal.core.data.model.g f14495f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, com.sumsub.sns.internal.core.data.model.g gVar, T9.a<? super j> aVar) {
            super(2, aVar);
            this.f14493d = str;
            this.f14494e = str2;
            this.f14495f = gVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, T9.a<? super b> aVar) {
            return ((j) create(bVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            j jVar = c.this.new j(this.f14493d, this.f14494e, this.f14495f, aVar);
            jVar.f14491b = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14490a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            b bVar = (b) this.f14491b;
            com.sumsub.sns.internal.core.data.model.e d10 = c.this.d();
            if (d10 != null) {
                r1 = com.sumsub.sns.internal.core.data.model.f.a(d10, this.f14493d, c.this.q() == IdentitySide.Back);
            }
            b.c h9 = c.this.h();
            com.sumsub.sns.internal.core.data.model.e d11 = c.this.d();
            com.sumsub.sns.internal.core.presentation.intro.b bVar2 = new com.sumsub.sns.internal.core.presentation.intro.b(h9, d11 != null ? d11.C() : null, this.f14493d, c.this.s(), this.f14494e, false, 32, null);
            com.sumsub.sns.internal.core.presentation.intro.f fVar = new com.sumsub.sns.internal.core.presentation.intro.f(this.f14493d, this.f14494e, c.this.s());
            String a10 = c.this.p().a();
            if (a10 == null) {
                a10 = this.f14495f.u();
            }
            return b.a(bVar, false, false, false, false, false, (r1 && bVar2.f()) ? c.this.a(fVar, (Map<String, ? extends Object>) bVar2.c(), a10) : c.this.a(this.f14495f, fVar, a10), 31, null);
        }
    }

    public c(DocumentType documentType, String str, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar) {
        super(aVar, bVar);
        this.f14454q = documentType;
        this.f14455r = str;
        this.f14456s = aVar;
        this.f14457t = bVar;
        this.f14458u = new Size(1920, 1080);
        this.f14459v = new CameraX.b(0, null, null, 0L, 0L, 31, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public Object c(T9.a<? super p> aVar) {
        return b(this, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(T9.a<? super O9.p> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.sumsub.sns.internal.camera.c.i
            if (r0 == 0) goto L13
            r0 = r13
            com.sumsub.sns.internal.camera.c$i r0 = (com.sumsub.sns.internal.camera.c.i) r0
            int r1 = r0.f14489d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14489d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.c$i r0 = new com.sumsub.sns.internal.camera.c$i
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f14487b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14489d
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            java.lang.Object r0 = r0.f14486a
            com.sumsub.sns.internal.camera.c r0 = (com.sumsub.sns.internal.camera.c) r0
            kotlin.b.b(r13)
            goto L57
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            kotlin.b.b(r13)
            com.sumsub.sns.internal.core.data.model.IdentitySide r13 = r12.f14460w
            if (r13 == 0) goto L49
            java.lang.String r13 = r13.getValue()
            if (r13 == 0) goto L49
            com.sumsub.sns.internal.core.analytics.b r2 = com.sumsub.sns.internal.core.analytics.b.f14967a
            com.sumsub.sns.internal.core.analytics.GlobalStatePayload r6 = com.sumsub.sns.internal.core.analytics.GlobalStatePayload.IdDocSubType
            r2.a(r6, r13)
        L49:
            com.sumsub.sns.internal.core.data.source.dynamic.b r13 = r12.f14457t
            r0.f14486a = r12
            r0.f14489d = r5
            java.lang.Object r13 = com.sumsub.sns.internal.core.data.source.dynamic.b.b(r13, r4, r0, r5, r3)
            if (r13 != r1) goto L56
            return r1
        L56:
            r0 = r12
        L57:
            r10 = r13
            com.sumsub.sns.internal.core.data.model.g r10 = (com.sumsub.sns.internal.core.data.model.g) r10
            com.sumsub.sns.internal.core.data.model.DocumentType r13 = r0.f14454q
            java.lang.String r8 = r13.c()
            com.sumsub.sns.internal.core.data.model.DocumentType r13 = r0.f14454q
            com.sumsub.sns.internal.core.data.model.g$c$a r13 = r10.a(r13)
            if (r13 == 0) goto L76
            boolean r1 = r13.w()
            if (r1 != r5) goto L76
            com.sumsub.sns.internal.core.presentation.intro.IntroScene r13 = com.sumsub.sns.internal.core.presentation.intro.IntroScene.PHOTOSELFIE
            java.lang.String r13 = r13.getSceneName()
        L74:
            r9 = r13
            goto L99
        L76:
            if (r13 == 0) goto L85
            boolean r13 = r13.v()
            if (r13 != r5) goto L85
            com.sumsub.sns.internal.core.presentation.intro.IntroScene r13 = com.sumsub.sns.internal.core.presentation.intro.IntroScene.PORTRAIT_SELFIE
            java.lang.String r13 = r13.getSceneName()
            goto L74
        L85:
            com.sumsub.sns.internal.core.data.model.IdentitySide r13 = r0.f14460w
            com.sumsub.sns.internal.core.data.model.IdentitySide r1 = com.sumsub.sns.internal.core.data.model.IdentitySide.Back
            if (r13 != r1) goto L92
            com.sumsub.sns.internal.core.presentation.intro.IntroScene r13 = com.sumsub.sns.internal.core.presentation.intro.IntroScene.SCAN_BACKSIDE
            java.lang.String r13 = r13.getSceneName()
            goto L74
        L92:
            com.sumsub.sns.internal.core.presentation.intro.IntroScene r13 = com.sumsub.sns.internal.core.presentation.intro.IntroScene.SCAN_FRONTSIDE
            java.lang.String r13 = r13.getSceneName()
            goto L74
        L99:
            com.sumsub.sns.internal.camera.c$j r13 = new com.sumsub.sns.internal.camera.c$j
            r11 = 0
            r6 = r13
            r7 = r0
            r6.<init>(r8, r9, r10, r11)
            com.sumsub.sns.core.presentation.base.a.a(r0, r4, r13, r5, r3)
            O9.p r13 = O9.p.f3034a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.c.d(T9.a):java.lang.Object");
    }

    public final com.sumsub.sns.internal.core.data.source.common.a p() {
        return this.f14456s;
    }

    public final IdentitySide q() {
        return this.f14460w;
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public b e() {
        return new b(false, false, false, false, false, null, 63, null);
    }

    public final String s() {
        return this.f14455r;
    }

    public Size t() {
        return this.f14458u;
    }

    public final DocumentType u() {
        return this.f14454q;
    }

    public CameraX.b v() {
        return this.f14459v;
    }

    public final void w() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new d(null), 3, null);
    }

    public void x() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "On take picture is clicked", null, 4, null);
        a(new a.C0174a("manual_"));
        com.sumsub.sns.core.presentation.base.a.a(this, false, new g(null), 1, null);
    }

    public final void y() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "On Toggle Flash is clicked", null, 4, null);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new h(null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(com.sumsub.sns.internal.camera.c r10, T9.a r11) {
        /*
            boolean r0 = r11 instanceof com.sumsub.sns.internal.camera.c.f
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.camera.c$f r0 = (com.sumsub.sns.internal.camera.c.f) r0
            int r1 = r0.f14481d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14481d = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.c$f r0 = new com.sumsub.sns.internal.camera.c$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f14479b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14481d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r11)
            goto L7d
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            java.lang.Object r10 = r0.f14478a
            com.sumsub.sns.internal.camera.c r10 = (com.sumsub.sns.internal.camera.c) r10
            kotlin.b.b(r11)
            goto L48
        L3a:
            kotlin.b.b(r11)
            r0.f14478a = r10
            r0.f14481d = r4
            java.lang.Object r11 = super.c(r0)
            if (r11 != r1) goto L48
            return r1
        L48:
            com.sumsub.sns.internal.log.a r4 = com.sumsub.sns.internal.log.a.f17535a
            java.lang.String r5 = com.sumsub.sns.internal.log.c.a(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "Camera is started. Side - "
            r11.<init>(r2)
            com.sumsub.sns.internal.core.data.model.IdentitySide r2 = r10.f14460w
            r11.append(r2)
            java.lang.String r6 = r11.toString()
            r8 = 4
            r9 = 0
            r7 = 0
            com.sumsub.log.logger.Logger.i$default(r4, r5, r6, r7, r8, r9)
            com.sumsub.sns.internal.core.analytics.b r11 = com.sumsub.sns.internal.core.analytics.b.f14967a
            com.sumsub.sns.internal.core.analytics.GlobalStatePayload r2 = com.sumsub.sns.internal.core.analytics.GlobalStatePayload.IdDocType
            com.sumsub.sns.internal.core.data.model.DocumentType r4 = r10.f14454q
            java.lang.String r4 = r4.c()
            r11.a(r2, r4)
            r11 = 0
            r0.f14478a = r11
            r0.f14481d = r3
            java.lang.Object r10 = r10.d(r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            O9.p r10 = O9.p.f3034a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.c.b(com.sumsub.sns.internal.camera.c, T9.a):java.lang.Object");
    }

    public final void a(IdentitySide identitySide) {
        boolean z10 = this.f14460w != identitySide;
        this.f14460w = identitySide;
        if (z10) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "setting current side to " + identitySide, null, 4, null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new C0175c(null), 3, null);
        }
    }

    public final com.sumsub.sns.internal.core.presentation.helper.camera.b a(com.sumsub.sns.internal.core.presentation.intro.f fVar, Map<String, ? extends Object> map, String str) {
        return new b.C0246b(fVar, map, str);
    }

    public com.sumsub.sns.internal.core.presentation.helper.camera.b a(com.sumsub.sns.internal.core.data.model.g gVar, com.sumsub.sns.internal.core.presentation.intro.f fVar, String str) {
        List<q> b9;
        String value;
        String str2 = this.f14455r;
        if (str2 != null) {
            b9 = Collections.singletonList(q.f15559c.a(str2));
        } else {
            b9 = gVar.b(this.f14454q);
        }
        List<q> list = b9;
        IdentitySide identitySide = this.f14460w;
        if (identitySide != null && (value = identitySide.getValue()) != null) {
            com.sumsub.sns.internal.core.analytics.b.f14967a.a(GlobalStatePayload.IdDocSubType, value);
        }
        return com.sumsub.sns.internal.core.presentation.helper.camera.a.f16589a.a(h(), this.f14454q, gVar.a(this.f14454q), fVar, str, list, this.f14460w);
    }

    public void a(File file) {
        Logger.i$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "Picture is taken", null, 4, null);
        b(true);
        com.sumsub.sns.core.presentation.base.a.a(this, false, new e(null), 1, null);
        com.sumsub.sns.core.presentation.base.a.a(this, (com.sumsub.sns.internal.core.common.q) null, new n(file, file, null, null, this.f14460w, false, null, null, false, 492, null), (Long) null, 5, (Object) null);
    }
}
