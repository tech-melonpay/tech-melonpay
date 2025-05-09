package com.sumsub.sns.internal.camera.photo.presentation.document;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Size;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.G;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.camera.c;
import com.sumsub.sns.internal.camera.photo.presentation.document.CheckDetectionResult;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.IdentitySide;
import com.sumsub.sns.internal.core.data.model.n;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.domain.camera.CameraX;
import com.sumsub.sns.internal.ml.autocapture.SeamlessDocaptureMobileConfig;
import com.sumsub.sns.internal.ml.core.e;
import ia.InterfaceC0840h;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class SNSPhotoDocumentPickerViewModel extends com.sumsub.sns.internal.camera.b {

    /* renamed from: A, reason: collision with root package name */
    public static final b f14591A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f14592B;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f14593A0;
    public final com.sumsub.sns.internal.core.data.source.dynamic.b R;
    public final com.sumsub.sns.internal.ml.badphotos.a S;
    public final com.sumsub.sns.internal.ml.docdetector.b T;
    public final com.sumsub.sns.internal.ml.badphotos.c U;
    public final com.sumsub.sns.internal.ml.autocapture.a V;
    public final SeamlessDocaptureMobileConfig W;
    public boolean X;
    public final com.sumsub.sns.internal.core.presentation.screen.base.a Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f14594Z;

    /* renamed from: a0, reason: collision with root package name */
    public final O9.f f14595a0;

    /* renamed from: b0, reason: collision with root package name */
    public com.sumsub.sns.internal.ff.core.a f14596b0;

    /* renamed from: c0, reason: collision with root package name */
    public final O9.f f14597c0;

    /* renamed from: d0, reason: collision with root package name */
    public File f14598d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f14599e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f14600f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f14601g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f14602h0;

    /* renamed from: i0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f14603i0;

    /* renamed from: j0, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.presentation.screen.base.a f14604j0;

    /* renamed from: k0, reason: collision with root package name */
    public final MutableStateFlow<c> f14605k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f14606l0;

    /* renamed from: m0, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.badphotos.models.b f14607m0;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f14608n0;

    /* renamed from: o0, reason: collision with root package name */
    public final List<IdentitySide> f14609o0;

    /* renamed from: p0, reason: collision with root package name */
    public final DocCapture$PreferredMode f14610p0;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f14611q0;

    /* renamed from: r0, reason: collision with root package name */
    public long f14612r0;
    public boolean s0;

    /* renamed from: t0, reason: collision with root package name */
    public PhotoCheckResult f14613t0;

    /* renamed from: u0, reason: collision with root package name */
    public Channel<O9.p> f14614u0;

    /* renamed from: v0, reason: collision with root package name */
    public Channel<O9.p> f14615v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f14616w0;

    /* renamed from: x0, reason: collision with root package name */
    public long f14617x0;

    /* renamed from: y0, reason: collision with root package name */
    public a f14618y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f14619z0;

    public static final class AutoCaptureHint {

        /* renamed from: a, reason: collision with root package name */
        public final String f14620a;

        /* renamed from: b, reason: collision with root package name */
        public final State f14621b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "INVALID", "INTERMEDIATE", "OK", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum State {
            DEFAULT,
            INVALID,
            INTERMEDIATE,
            OK
        }

        public AutoCaptureHint(String str, State state) {
            this.f14620a = str;
            this.f14621b = state;
        }

        public final AutoCaptureHint a(String str, State state) {
            return new AutoCaptureHint(str, state);
        }

        public final String c() {
            return this.f14620a;
        }

        public final State d() {
            return this.f14621b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoCaptureHint)) {
                return false;
            }
            AutoCaptureHint autoCaptureHint = (AutoCaptureHint) obj;
            return kotlin.jvm.internal.f.b(this.f14620a, autoCaptureHint.f14620a) && this.f14621b == autoCaptureHint.f14621b;
        }

        public int hashCode() {
            return this.f14621b.hashCode() + (this.f14620a.hashCode() * 31);
        }

        public String toString() {
            return "AutoCaptureHint(hint=" + this.f14620a + ", state=" + this.f14621b + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$FrameHandleResult;", "", "(Ljava/lang/String;I)V", "RELEASED", "TAKEN", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum FrameHandleResult {
        RELEASED,
        TAKEN
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/internal/camera/photo/presentation/document/SNSPhotoDocumentPickerViewModel$PhotoCheckResult;", "", "(Ljava/lang/String;I)V", "SKIPPED", "FOCUSING", "WAITING", "CAPTURED", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum PhotoCheckResult {
        SKIPPED,
        FOCUSING,
        WAITING,
        CAPTURED
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f14622a;

        /* renamed from: b, reason: collision with root package name */
        public final com.sumsub.sns.internal.ml.badphotos.models.b f14623b;

        public a(Bitmap bitmap, com.sumsub.sns.internal.ml.badphotos.models.b bVar) {
            this.f14622a = bitmap;
            this.f14623b = bVar;
        }

        public final Bitmap c() {
            return this.f14622a;
        }

        public final com.sumsub.sns.internal.ml.badphotos.models.b d() {
            return this.f14623b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f14622a, aVar.f14622a) && kotlin.jvm.internal.f.b(this.f14623b, aVar.f14623b);
        }

        public int hashCode() {
            return this.f14623b.hashCode() + (this.f14622a.hashCode() * 31);
        }

        public String toString() {
            return "AutoCapturedFrame(frame=" + this.f14622a + ", quality=" + this.f14623b + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onCleared$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1413}, m = "invokeSuspend")
    public static final class a0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14624a;

        public a0(T9.a<? super a0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new a0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14624a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.ml.docdetector.b bVar = SNSPhotoDocumentPickerViewModel.this.T;
                this.f14624a = 1;
                if (bVar.a((T9.a<? super O9.p>) this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$showInitialViewState$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {414}, m = "invokeSuspend")
    public static final class a1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14626a;

        public a1(T9.a<? super a1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((a1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new a1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14626a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14626a = 1;
                if (sNSPhotoDocumentPickerViewModel.h(this) == coroutineSingletons) {
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

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1178}, m = "onFirstSideManuallyCapturedInSeamlessMode")
    public static final class b0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14628a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14629b;

        /* renamed from: d, reason: collision with root package name */
        public int f14631d;

        public b0(T9.a<? super b0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14629b = obj;
            this.f14631d |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((Context) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1147}, m = "showWaitPopup")
    public static final class b1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14632a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14633b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14634c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14635d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14636e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14637f;

        /* renamed from: h, reason: collision with root package name */
        public int f14639h;

        public b1(T9.a<? super b1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14637f = obj;
            this.f14639h |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.j(this);
        }
    }

    public static final class c implements a.l {

        /* renamed from: a, reason: collision with root package name */
        public final k f14640a;

        /* renamed from: b, reason: collision with root package name */
        public final a f14641b;

        /* renamed from: c, reason: collision with root package name */
        public final AutoCaptureHint f14642c;

        /* renamed from: d, reason: collision with root package name */
        public final d f14643d;

        /* renamed from: e, reason: collision with root package name */
        public final a.d f14644e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Boolean f14645a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f14646b;

            /* renamed from: c, reason: collision with root package name */
            public final CharSequence f14647c;

            /* renamed from: d, reason: collision with root package name */
            public final Boolean f14648d;

            public a(Boolean bool, CharSequence charSequence, CharSequence charSequence2, Boolean bool2) {
                this.f14645a = bool;
                this.f14646b = charSequence;
                this.f14647c = charSequence2;
                this.f14648d = bool2;
            }

            public final a a(Boolean bool, CharSequence charSequence, CharSequence charSequence2, Boolean bool2) {
                return new a(bool, charSequence, charSequence2, bool2);
            }

            public final Boolean e() {
                return this.f14645a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f14645a, aVar.f14645a) && kotlin.jvm.internal.f.b(this.f14646b, aVar.f14646b) && kotlin.jvm.internal.f.b(this.f14647c, aVar.f14647c) && kotlin.jvm.internal.f.b(this.f14648d, aVar.f14648d);
            }

            public final CharSequence f() {
                return this.f14646b;
            }

            public final CharSequence g() {
                return this.f14647c;
            }

            public final Boolean h() {
                return this.f14648d;
            }

            public int hashCode() {
                Boolean bool = this.f14645a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                CharSequence charSequence = this.f14646b;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                CharSequence charSequence2 = this.f14647c;
                int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                Boolean bool2 = this.f14648d;
                return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
            }

            public String toString() {
                return "AutoManualSwitch(auto=" + this.f14645a + ", autoText=" + ((Object) this.f14646b) + ", manualText=" + ((Object) this.f14647c) + ", visible=" + this.f14648d + ')';
            }

            public static /* synthetic */ a a(a aVar, Boolean bool, CharSequence charSequence, CharSequence charSequence2, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = aVar.f14645a;
                }
                if ((i & 2) != 0) {
                    charSequence = aVar.f14646b;
                }
                if ((i & 4) != 0) {
                    charSequence2 = aVar.f14647c;
                }
                if ((i & 8) != 0) {
                    bool2 = aVar.f14648d;
                }
                return aVar.a(bool, charSequence, charSequence2, bool2);
            }
        }

        public c(k kVar, a aVar, AutoCaptureHint autoCaptureHint, d dVar, a.d dVar2) {
            this.f14640a = kVar;
            this.f14641b = aVar;
            this.f14642c = autoCaptureHint;
            this.f14643d = dVar;
            this.f14644e = dVar2;
        }

        public final c a(k kVar, a aVar, AutoCaptureHint autoCaptureHint, d dVar, a.d dVar2) {
            return new c(kVar, aVar, autoCaptureHint, dVar, dVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f14640a, cVar.f14640a) && kotlin.jvm.internal.f.b(this.f14641b, cVar.f14641b) && kotlin.jvm.internal.f.b(this.f14642c, cVar.f14642c) && kotlin.jvm.internal.f.b(this.f14643d, cVar.f14643d) && kotlin.jvm.internal.f.b(this.f14644e, cVar.f14644e);
        }

        public final AutoCaptureHint f() {
            return this.f14642c;
        }

        public final a.d g() {
            return this.f14644e;
        }

        public final d h() {
            return this.f14643d;
        }

        public int hashCode() {
            k kVar = this.f14640a;
            int hashCode = (this.f14641b.hashCode() + ((kVar == null ? 0 : kVar.hashCode()) * 31)) * 31;
            AutoCaptureHint autoCaptureHint = this.f14642c;
            int hashCode2 = (hashCode + (autoCaptureHint == null ? 0 : autoCaptureHint.hashCode())) * 31;
            d dVar = this.f14643d;
            int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            a.d dVar2 = this.f14644e;
            return hashCode3 + (dVar2 != null ? dVar2.hashCode() : 0);
        }

        public final a i() {
            return this.f14641b;
        }

        public final k j() {
            return this.f14640a;
        }

        public String toString() {
            return "DocumentCaptureViewState(videoCapture=" + this.f14640a + ", switch=" + this.f14641b + ", autoCaptureHint=" + this.f14642c + ", frameHint=" + this.f14643d + ", error=" + this.f14644e + ')';
        }

        public static /* synthetic */ c a(c cVar, k kVar, a aVar, AutoCaptureHint autoCaptureHint, d dVar, a.d dVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = cVar.f14640a;
            }
            if ((i & 2) != 0) {
                aVar = cVar.f14641b;
            }
            a aVar2 = aVar;
            if ((i & 4) != 0) {
                autoCaptureHint = cVar.f14642c;
            }
            AutoCaptureHint autoCaptureHint2 = autoCaptureHint;
            if ((i & 8) != 0) {
                dVar = cVar.f14643d;
            }
            d dVar3 = dVar;
            if ((i & 16) != 0) {
                dVar2 = cVar.f14644e;
            }
            return cVar.a(kVar, aVar2, autoCaptureHint2, dVar3, dVar2);
        }

        public /* synthetic */ c(k kVar, a aVar, AutoCaptureHint autoCaptureHint, d dVar, a.d dVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, aVar, autoCaptureHint, (i & 8) != 0 ? null : dVar, dVar2);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onFirstSideManuallyCapturedInSeamlessMode$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c0 extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14649a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14650b;

        public c0(T9.a<? super c0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
            return ((c0) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            c0 c0Var = new c0(aVar);
            c0Var.f14650b = obj;
            return c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14649a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return c.b.a((c.b) this.f14650b, false, false, false, false, false, null, 59, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$showWaitPopup$3", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c1 extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14651a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14652b;

        public c1(T9.a<? super c1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
            return ((c1) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            c1 c1Var = new c1(aVar);
            c1Var.f14652b = obj;
            return c1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14651a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return c.b.a((c.b) this.f14652b, false, false, false, false, false, null, 59, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onFirstSideManuallyCapturedInSeamlessMode$3", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1170}, m = "invokeSuspend")
    public static final class d0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14656a;

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
            return SNSPhotoDocumentPickerViewModel.this.new d0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14656a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14656a = 1;
                if (sNSPhotoDocumentPickerViewModel.f(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$switchToAutoMode$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {918, 923}, m = "invokeSuspend")
    public static final class d1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14658a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14659b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14660c;

        /* renamed from: d, reason: collision with root package name */
        public int f14661d;

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$switchToAutoMode$1$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14663a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14664b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
                return ((a) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f14664b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14663a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return c.b.a((c.b) this.f14664b, false, false, false, false, false, null, 57, null);
            }
        }

        public d1(T9.a<? super d1> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((d1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new d1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel;
            MutableStateFlow mutableStateFlow;
            c cVar;
            c.a a10;
            MutableStateFlow mutableStateFlow2;
            c cVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14661d;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel.this.f14601g0 = true;
                com.sumsub.sns.core.presentation.base.a.a(SNSPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
                MutableStateFlow mutableStateFlow3 = SNSPhotoDocumentPickerViewModel.this.f14605k0;
                Object value = SNSPhotoDocumentPickerViewModel.this.f14605k0.getValue();
                sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                c cVar3 = (c) value;
                this.f14658a = sNSPhotoDocumentPickerViewModel;
                this.f14659b = cVar3;
                this.f14660c = mutableStateFlow3;
                this.f14661d = 1;
                Object g10 = sNSPhotoDocumentPickerViewModel.g(this);
                if (g10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow3;
                obj = g10;
                cVar = cVar3;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow2 = (MutableStateFlow) this.f14660c;
                    cVar2 = (c) this.f14659b;
                    c.a aVar = (c.a) this.f14658a;
                    kotlin.b.b(obj);
                    a10 = aVar;
                    mutableStateFlow2.setValue(c.a(cVar2, null, a10, (AutoCaptureHint) obj, null, null, 25, null));
                    return O9.p.f3034a;
                }
                mutableStateFlow = (MutableStateFlow) this.f14660c;
                cVar = (c) this.f14659b;
                sNSPhotoDocumentPickerViewModel = (SNSPhotoDocumentPickerViewModel) this.f14658a;
                kotlin.b.b(obj);
            }
            c cVar4 = (c) obj;
            c.a i9 = cVar.i();
            Boolean bool = Boolean.TRUE;
            a10 = c.a.a(i9, bool, null, null, bool, 6, null);
            CheckDetectionResult a11 = CheckDetectionResult.f14587d.a();
            this.f14658a = a10;
            this.f14659b = cVar4;
            this.f14660c = mutableStateFlow;
            this.f14661d = 2;
            Object a12 = SNSPhotoDocumentPickerViewModel.a(sNSPhotoDocumentPickerViewModel, a11, false, (T9.a) this, 2, (Object) null);
            if (a12 == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutableStateFlow2 = mutableStateFlow;
            cVar2 = cVar4;
            obj = a12;
            mutableStateFlow2.setValue(c.a(cVar2, null, a10, (AutoCaptureHint) obj, null, null, 25, null));
            return O9.p.f3034a;
        }
    }

    public static final class e implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14665a = new e();
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onFirstSideManuallyCapturedInSeamlessMode$4", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1184}, m = "invokeSuspend")
    public static final class e0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14666a;

        public e0(T9.a<? super e0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((e0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new e0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14666a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14666a = 1;
                if (sNSPhotoDocumentPickerViewModel.h(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$switchToManualMode$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {940}, m = "invokeSuspend")
    public static final class e1 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f14668a;

        /* renamed from: b, reason: collision with root package name */
        public int f14669b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f14671d;

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$switchToManualMode$1$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14672a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14673b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
                return ((a) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f14673b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14672a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return c.b.a((c.b) this.f14673b, false, true, true, false, false, null, 57, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(boolean z10, T9.a<? super e1> aVar) {
            super(2, aVar);
            this.f14671d = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((e1) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new e1(this.f14671d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14669b;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel.this.f14601g0 = false;
                com.sumsub.sns.core.presentation.base.a.a(SNSPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
                MutableStateFlow mutableStateFlow2 = SNSPhotoDocumentPickerViewModel.this.f14605k0;
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14668a = mutableStateFlow2;
                this.f14669b = 1;
                Object g10 = sNSPhotoDocumentPickerViewModel.g(this);
                if (g10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = g10;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.f14668a;
                kotlin.b.b(obj);
            }
            c cVar = (c) obj;
            mutableStateFlow.setValue(c.a(cVar, null, c.a.a(cVar.i(), null, null, null, Boolean.valueOf(this.f14671d), 7, null), null, null, null, 29, null));
            return O9.p.f3034a;
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final String f14674a;

        public static final class a extends f {

            /* renamed from: b, reason: collision with root package name */
            public final String f14675b;

            public a(String str) {
                super(str, null);
                this.f14675b = str;
            }

            @Override // com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.f
            public String a() {
                return this.f14675b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.f.b(a(), ((a) obj).a());
            }

            public int hashCode() {
                return a().hashCode();
            }

            public String toString() {
                return "VideoRecordingInterrupted(message=" + a() + ')';
            }
        }

        public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public String a() {
            return this.f14674a;
        }

        public f(String str) {
            this.f14674a = str;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {481, 509, 553, 591, 610}, m = "onFrameCaptured")
    public static final class f0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14676a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14677b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14678c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14679d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14680e;

        /* renamed from: f, reason: collision with root package name */
        public long f14681f;

        /* renamed from: g, reason: collision with root package name */
        public int f14682g;

        /* renamed from: h, reason: collision with root package name */
        public int f14683h;
        public /* synthetic */ Object i;

        /* renamed from: k, reason: collision with root package name */
        public int f14685k;

        public f0(T9.a<? super f0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.f14685k |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((Context) null, (Bitmap) null, (Rect) null, this);
        }
    }

    public static final class f1 extends Lambda implements InterfaceC0635a<O9.p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f14687b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f14688c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f14689d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Channel<O9.p> f14690e;

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$takeAutoCapturedFrame$2$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {672}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14691a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSPhotoDocumentPickerViewModel f14692b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f14693c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f14694d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Rect f14695e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Channel<O9.p> f14696f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel, Context context, a aVar, Rect rect, Channel<O9.p> channel, T9.a<? super a> aVar2) {
                super(2, aVar2);
                this.f14692b = sNSPhotoDocumentPickerViewModel;
                this.f14693c = context;
                this.f14694d = aVar;
                this.f14695e = rect;
                this.f14696f = channel;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((a) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new a(this.f14692b, this.f14693c, this.f14694d, this.f14695e, this.f14696f, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f14691a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    this.f14692b.f14602h0 = false;
                    SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = this.f14692b;
                    Context context = this.f14693c;
                    Bitmap c2 = this.f14694d.c();
                    Rect rect = this.f14695e;
                    com.sumsub.sns.internal.ml.badphotos.models.b d10 = this.f14694d.d();
                    this.f14691a = 1;
                    if (sNSPhotoDocumentPickerViewModel.a(context, c2, rect, d10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                Channel<O9.p> channel = this.f14696f;
                O9.p pVar = O9.p.f3034a;
                channel.mo110trySendJP2dKIU(pVar);
                return pVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(Context context, a aVar, Rect rect, Channel<O9.p> channel) {
            super(0);
            this.f14687b = context;
            this.f14688c = aVar;
            this.f14689d = rect;
            this.f14690e = channel;
        }

        public final void a() {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "photo animation finished", null, 4, null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(SNSPhotoDocumentPickerViewModel.this), null, null, new a(SNSPhotoDocumentPickerViewModel.this, this.f14687b, this.f14688c, this.f14689d, this.f14690e, null), 3, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    public static final class g implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public static final g f14697a = new g();
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onFrameCaptured$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {467}, m = "invokeSuspend")
    public static final class g0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14698a;

        public g0(T9.a<? super g0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((g0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new g0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14698a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14698a = 1;
                if (sNSPhotoDocumentPickerViewModel.h(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1052, 1057}, m = "takeFrameAsResult")
    public static final class g1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14700a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14701b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14702c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14703d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14704e;

        /* renamed from: f, reason: collision with root package name */
        public int f14705f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14706g;
        public int i;

        public g1(T9.a<? super g1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14706g = obj;
            this.i |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((Context) null, (Bitmap) null, (Rect) null, (com.sumsub.sns.internal.ml.badphotos.models.b) null, this);
        }
    }

    public static final class h implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final Size f14708a;

        /* renamed from: b, reason: collision with root package name */
        public final Size f14709b;

        /* renamed from: c, reason: collision with root package name */
        public final com.sumsub.sns.internal.ml.docdetector.a f14710c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14711d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14712e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f14713f;

        public h(Size size, Size size2, com.sumsub.sns.internal.ml.docdetector.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f14708a = size;
            this.f14709b = size2;
            this.f14710c = aVar;
            this.f14711d = z10;
            this.f14712e = z11;
            this.f14713f = z12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.f.b(this.f14708a, hVar.f14708a) && kotlin.jvm.internal.f.b(this.f14709b, hVar.f14709b) && kotlin.jvm.internal.f.b(this.f14710c, hVar.f14710c) && this.f14711d == hVar.f14711d && this.f14712e == hVar.f14712e && this.f14713f == hVar.f14713f;
        }

        public final boolean g() {
            return this.f14712e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.f14710c.hashCode() + ((this.f14709b.hashCode() + (this.f14708a.hashCode() * 31)) * 31)) * 31;
            boolean z10 = this.f14711d;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            int i9 = (hashCode + i) * 31;
            boolean z11 = this.f14712e;
            int i10 = z11;
            if (z11 != 0) {
                i10 = 1;
            }
            int i11 = (i9 + i10) * 31;
            boolean z12 = this.f14713f;
            return i11 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public final Size i() {
            return this.f14708a;
        }

        public final com.sumsub.sns.internal.ml.docdetector.a j() {
            return this.f14710c;
        }

        public final Size k() {
            return this.f14709b;
        }

        public final boolean l() {
            return this.f14713f;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowDocDetectionResult(photoSize=");
            sb2.append(this.f14708a);
            sb2.append(", sampleSize=");
            sb2.append(this.f14709b);
            sb2.append(", result=");
            sb2.append(this.f14710c);
            sb2.append(", frameHit=");
            sb2.append(this.f14711d);
            sb2.append(", drawDetectedFrame=");
            sb2.append(this.f14712e);
            sb2.append(", saveScreen=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f14713f, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onFrameCaptured$docBounds$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {510}, m = "invokeSuspend")
    public static final class h0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super com.sumsub.sns.internal.ml.docdetector.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14714a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f14716c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f14717d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(Bitmap bitmap, boolean z10, T9.a<? super h0> aVar) {
            super(2, aVar);
            this.f14716c = bitmap;
            this.f14717d = z10;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super com.sumsub.sns.internal.ml.docdetector.a> aVar) {
            return ((h0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new h0(this.f14716c, this.f14717d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14714a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.ml.docdetector.b bVar = SNSPhotoDocumentPickerViewModel.this.T;
                Bitmap bitmap = this.f14716c;
                boolean z10 = this.f14717d;
                this.f14714a = 1;
                obj = bVar.a(bitmap, z10, this);
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {637, 641, 645, 649}, m = "updateDocCaptureHint")
    public static final class h1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14718a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14719b;

        /* renamed from: d, reason: collision with root package name */
        public int f14721d;

        public h1(T9.a<? super h1> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14719b = obj;
            this.f14721d |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((CheckDetectionResult) null, (PhotoCheckResult) null, this);
        }
    }

    public static final class i implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0635a<O9.p> f14722a;

        public i(InterfaceC0635a<O9.p> interfaceC0635a) {
            this.f14722a = interfaceC0635a;
        }

        public final InterfaceC0635a<O9.p> b() {
            return this.f14722a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && kotlin.jvm.internal.f.b(this.f14722a, ((i) obj).f14722a);
        }

        public int hashCode() {
            return this.f14722a.hashCode();
        }

        public String toString() {
            return "ShowPhotoMadeAnimation(finishCallback=" + this.f14722a + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1124, 1127, 1132}, m = "onPhotoTakenManuallyInSeamlessMode")
    public static final class i0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14723a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14724b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14725c;

        /* renamed from: e, reason: collision with root package name */
        public int f14727e;

        public i0(T9.a<? super i0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14725c = obj;
            this.f14727e |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.b((Context) null, this);
        }
    }

    public static final class j implements a.j {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14728a;

        /* renamed from: b, reason: collision with root package name */
        public final float f14729b;

        /* renamed from: c, reason: collision with root package name */
        public final long f14730c;

        public j(boolean z10, float f10, long j10) {
            this.f14728a = z10;
            this.f14729b = f10;
            this.f14730c = j10;
        }

        public final float d() {
            return this.f14729b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f14728a == jVar.f14728a && kotlin.jvm.internal.f.b(Float.valueOf(this.f14729b), Float.valueOf(jVar.f14729b)) && this.f14730c == jVar.f14730c;
        }

        public final long f() {
            return this.f14730c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f14728a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return Long.hashCode(this.f14730c) + C.v.a(r02 * 31, this.f14729b, 31);
        }

        public String toString() {
            return "ShowQualityCheckResult(ok=" + this.f14728a + ", confidence=" + this.f14729b + ", timeMs=" + this.f14730c + ')';
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onPhotoTakenManuallyInSeamlessMode$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1134}, m = "invokeSuspend")
    public static final class j0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14731a;

        public j0(T9.a<? super j0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((j0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new j0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14731a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14731a = 1;
                if (sNSPhotoDocumentPickerViewModel.f(this) == coroutineSingletons) {
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

    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final File f14733a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14734b;

        public k(File file, boolean z10) {
            this.f14733a = file;
            this.f14734b = z10;
        }

        public final File c() {
            return this.f14733a;
        }

        public final boolean d() {
            return this.f14734b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.f.b(this.f14733a, kVar.f14733a) && this.f14734b == kVar.f14734b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            File file = this.f14733a;
            int hashCode = (file == null ? 0 : file.hashCode()) * 31;
            boolean z10 = this.f14734b;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("VideoCapture(file=");
            sb2.append(this.f14733a);
            sb2.append(", started=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f14734b, ')');
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onPictureTaken$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {425}, m = "invokeSuspend")
    public static final class k0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14735a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f14737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(File file, T9.a<? super k0> aVar) {
            super(2, aVar);
            this.f14737c = file;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((k0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new k0(this.f14737c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14735a;
            if (i == 0) {
                kotlin.b.b(obj);
                Channel channel = SNSPhotoDocumentPickerViewModel.this.f14615v0;
                this.f14735a = 1;
                if (channel.receive(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            SNSPhotoDocumentPickerViewModel.super.a(this.f14737c);
            return O9.p.f3034a;
        }
    }

    public /* synthetic */ class l {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14738a;

        static {
            int[] iArr = new int[CheckDetectionResult.SizeCheckResult.values().length];
            iArr[CheckDetectionResult.SizeCheckResult.OK.ordinal()] = 1;
            iArr[CheckDetectionResult.SizeCheckResult.SMALL.ordinal()] = 2;
            iArr[CheckDetectionResult.SizeCheckResult.BIG.ordinal()] = 3;
            f14738a = iArr;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onPictureTaken$4", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class l0 extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14739a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14740b;

        public l0(T9.a<? super l0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
            return ((l0) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            l0 l0Var = new l0(aVar);
            l0Var.f14740b = obj;
            return l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14739a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return c.b.a((c.b) this.f14740b, false, false, false, false, false, null, 61, null);
        }
    }

    public static final class m extends Lambda implements InterfaceC0635a<Boolean> {
        public m() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(SNSPhotoDocumentPickerViewModel.this.I().g());
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onPictureTaken$5", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1106}, m = "invokeSuspend")
    public static final class m0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14742a;

        public m0(T9.a<? super m0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((m0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new m0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14742a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14742a = 1;
                if (sNSPhotoDocumentPickerViewModel.f(this) == coroutineSingletons) {
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

    public static final class n extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.camera.photo.presentation.document.a> {
        public n() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.camera.photo.presentation.document.a invoke() {
            return new com.sumsub.sns.internal.camera.photo.presentation.document.a(SNSPhotoDocumentPickerViewModel.this.V);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onPictureTaken$6", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1117}, m = "invokeSuspend")
    public static final class n0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14745a;

        public n0(T9.a<? super n0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((n0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new n0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14745a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14745a = 1;
                if (sNSPhotoDocumentPickerViewModel.h(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {960, 962, 968, 973, 978, 980}, m = "buildAutoCaptureHint")
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14747a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14748b;

        /* renamed from: d, reason: collision with root package name */
        public int f14750d;

        public o(T9.a<? super o> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14748b = obj;
            this.f14750d |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((CheckDetectionResult) null, false, (T9.a<? super AutoCaptureHint>) this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {325, 335, 336}, m = "onPrepare")
    public static final class o0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14751a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14752b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14753c;

        /* renamed from: e, reason: collision with root package name */
        public int f14755e;

        public o0(T9.a<? super o0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14753c = obj;
            this.f14755e |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.c(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {377}, m = "checkAutoCaptureAllowedForStep")
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14756a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14757b;

        /* renamed from: d, reason: collision with root package name */
        public int f14759d;

        public p(T9.a<? super p> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14757b = obj;
            this.f14759d |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.e(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onPrepare$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {341}, m = "invokeSuspend")
    public static final class p0 extends SuspendLambda implements InterfaceC0646l<T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14760a;

        public p0(T9.a<? super p0> aVar) {
            super(1, aVar);
        }

        @Override // ca.InterfaceC0646l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T9.a<? super O9.p> aVar) {
            return ((p0) create(aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new p0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14760a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14760a = 1;
                if (sNSPhotoDocumentPickerViewModel.i(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {814}, m = "checkManualyCapturedPicture")
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14762a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14763b;

        /* renamed from: d, reason: collision with root package name */
        public int f14765d;

        public q(T9.a<? super q> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14763b = obj;
            this.f14765d |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((Bitmap) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {794, 799, 804}, m = "onRequestedPictureTaken")
    public static final class q0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14766a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14767b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14768c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14769d;

        /* renamed from: f, reason: collision with root package name */
        public int f14771f;

        public q0(T9.a<? super q0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14769d = obj;
            this.f14771f |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.b((Context) null, (Bitmap) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1351}, m = "checkPhotoQuality")
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14772a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f14773b;

        /* renamed from: c, reason: collision with root package name */
        public long f14774c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14775d;

        /* renamed from: f, reason: collision with root package name */
        public int f14777f;

        public r(T9.a<? super r> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14775d = obj;
            this.f14777f |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((Bitmap) null, false, (T9.a<? super com.sumsub.sns.internal.ml.badphotos.models.b>) this);
        }
    }

    public static final class r0 extends Lambda implements InterfaceC0635a<O9.p> {

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onTakePictureClicked$1$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14779a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14780b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
                return ((a) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f14780b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14779a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return c.b.a((c.b) this.f14780b, false, false, false, true, false, null, 55, null);
            }
        }

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onTakePictureClicked$1$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {457}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14781a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSPhotoDocumentPickerViewModel f14782b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel, T9.a<? super b> aVar) {
                super(2, aVar);
                this.f14782b = sNSPhotoDocumentPickerViewModel;
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
                return ((b) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                return new b(this.f14782b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                int i = this.f14781a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    Channel channel = this.f14782b.f14615v0;
                    O9.p pVar = O9.p.f3034a;
                    this.f14781a = 1;
                    if (channel.send(pVar, this) == coroutineSingletons) {
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

        public r0() {
            super(0);
        }

        public final void a() {
            SNSPhotoDocumentPickerViewModel.this.f14602h0 = false;
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "photo animation finished", null, 4, null);
            com.sumsub.sns.core.presentation.base.a.a(SNSPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(SNSPhotoDocumentPickerViewModel.this), null, null, new b(SNSPhotoDocumentPickerViewModel.this, null), 3, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$checkPhotoQuality$badPhotosDetectorResult$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1352}, m = "invokeSuspend")
    public static final class s extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super e.a<com.sumsub.sns.internal.ml.badphotos.models.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14783a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f14785c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Bitmap bitmap, T9.a<? super s> aVar) {
            super(2, aVar);
            this.f14785c = bitmap;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super e.a<com.sumsub.sns.internal.ml.badphotos.models.a>> aVar) {
            return ((s) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new s(this.f14785c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14783a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.ml.badphotos.a aVar = SNSPhotoDocumentPickerViewModel.this.S;
                if (aVar != null) {
                    Bitmap bitmap = this.f14785c;
                    this.f14783a = 1;
                    obj = aVar.a((com.sumsub.sns.internal.ml.badphotos.a) bitmap, (T9.a) this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new e.a.c();
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            e.a aVar2 = (e.a) obj;
            if (aVar2 != null) {
                return aVar2;
            }
            return new e.a.c();
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onVideoRecordingFinalized$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {277}, m = "invokeSuspend")
    public static final class s0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14786a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CameraX.c.a f14788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(CameraX.c.a aVar, T9.a<? super s0> aVar2) {
            super(2, aVar2);
            this.f14788c = aVar;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((s0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new s0(this.f14788c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14786a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                CameraX.c.a.C0238a c0238a = (CameraX.c.a.C0238a) this.f14788c;
                this.f14786a = 1;
                if (sNSPhotoDocumentPickerViewModel.a(c0238a, this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {690}, m = "checkPhotoQualityAndUpdateLastCaptured")
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14789a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14790b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14791c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14792d;

        /* renamed from: f, reason: collision with root package name */
        public int f14794f;

        public t(T9.a<? super t> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14792d = obj;
            this.f14794f |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((Context) null, (Bitmap) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onVideoRecordingFinalized$3", f = "SNSPhotoDocumentPickerViewModel.kt", l = {301}, m = "invokeSuspend")
    public static final class t0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14795a;

        public t0(T9.a<? super t0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((t0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new t0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14795a;
            if (i == 0) {
                kotlin.b.b(obj);
                SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
                this.f14795a = 1;
                if (sNSPhotoDocumentPickerViewModel.f(this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1270, 1272}, m = "finishWithCurrentResults")
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14797a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14798b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14799c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14800d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14801e;

        /* renamed from: g, reason: collision with root package name */
        public int f14803g;

        public u(T9.a<? super u> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14801e = obj;
            this.f14803g |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.f(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$onVideoRecordingStarted$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {229}, m = "invokeSuspend")
    public static final class u0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14804a;

        public u0(T9.a<? super u0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((u0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new u0(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14804a;
            if (i == 0) {
                kotlin.b.b(obj);
                Channel channel = SNSPhotoDocumentPickerViewModel.this.f14614u0;
                O9.p pVar = O9.p.f3034a;
                this.f14804a = 1;
                if (channel.send(pVar, this) == coroutineSingletons) {
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

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$finishWithCurrentResults$2", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class v extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14806a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14807b;

        public v(T9.a<? super v> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
            return ((v) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            v vVar = new v(aVar);
            vVar.f14807b = obj;
            return vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14806a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return c.b.a((c.b) this.f14807b, false, false, false, false, false, null, 59, null);
        }
    }

    public static final class v0 extends Lambda implements InterfaceC0635a<O9.p> {

        @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$requestDocumentFlip$2$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f14809a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f14810b;

            public a(T9.a<? super a> aVar) {
                super(2, aVar);
            }

            @Override // ca.InterfaceC0650p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
                return ((a) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
                a aVar2 = new a(aVar);
                aVar2.f14810b = obj;
                return aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
                if (this.f14809a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return c.b.a((c.b) this.f14810b, false, true, true, false, false, null, 49, null);
            }
        }

        public v0() {
            super(0);
        }

        public final void a() {
            SNSPhotoDocumentPickerViewModel.this.O();
            int size = SNSPhotoDocumentPickerViewModel.this.H().size();
            SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel = SNSPhotoDocumentPickerViewModel.this;
            sNSPhotoDocumentPickerViewModel.a((IdentitySide) sNSPhotoDocumentPickerViewModel.f14609o0.get(size));
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "requestDocumentNextSide: " + SNSPhotoDocumentPickerViewModel.this.q(), null, 4, null);
            if (SNSPhotoDocumentPickerViewModel.this.f14601g0) {
                return;
            }
            com.sumsub.sns.core.presentation.base.a.a(SNSPhotoDocumentPickerViewModel.this, false, new a(null), 1, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ O9.p invoke() {
            a();
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$finishWithCurrentResults$3", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1286}, m = "invokeSuspend")
    public static final class w extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14811a;

        public w(T9.a<? super w> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((w) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new w(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14811a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.f14811a = 1;
                if (DelayKt.delay(2000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            SNSPhotoDocumentPickerViewModel.this.b((f) null);
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1234}, m = "showDocumentFlipHint")
    public static final class w0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14813a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14814b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14815c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14816d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14817e;

        /* renamed from: f, reason: collision with root package name */
        public Object f14818f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f14819g;
        public int i;

        public w0(T9.a<? super w0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14819g = obj;
            this.i |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((InterfaceC0635a<O9.p>) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {305, 307, 310}, m = "handleVideoRecordingErrorStatus")
    public static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14821a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14822b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14823c;

        /* renamed from: e, reason: collision with root package name */
        public int f14825e;

        public x(T9.a<? super x> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14823c = obj;
            this.f14825e |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.a((CameraX.c.a.C0238a) null, this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$showDocumentFlipHint$3", f = "SNSPhotoDocumentPickerViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class x0 extends SuspendLambda implements InterfaceC0650p<c.b, T9.a<? super c.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14826a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14827b;

        public x0(T9.a<? super x0> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c.b bVar, T9.a<? super c.b> aVar) {
            return ((x0) create(bVar, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            x0 x0Var = new x0(aVar);
            x0Var.f14827b = obj;
            return x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14826a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return c.b.a((c.b) this.f14827b, false, false, false, false, false, null, 59, null);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$initMlModels$1", f = "SNSPhotoDocumentPickerViewModel.kt", l = {353, 355, 365, 373}, m = "invokeSuspend")
    public static final class y extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14828a;

        /* renamed from: b, reason: collision with root package name */
        public int f14829b;

        /* renamed from: c, reason: collision with root package name */
        public int f14830c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l<T9.a<? super O9.p>, Object> f14832e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(InterfaceC0646l<? super T9.a<? super O9.p>, ? extends Object> interfaceC0646l, T9.a<? super y> aVar) {
            super(2, aVar);
            this.f14832e = interfaceC0646l;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((y) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return SNSPhotoDocumentPickerViewModel.this.new y(this.f14832e, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0107 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$showDocumentFlipHint$4", f = "SNSPhotoDocumentPickerViewModel.kt", l = {1248}, m = "invokeSuspend")
    public static final class y0 extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super O9.p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14833a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a<O9.p> f14834b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SNSPhotoDocumentPickerViewModel f14835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(InterfaceC0635a<O9.p> interfaceC0635a, SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel, T9.a<? super y0> aVar) {
            super(2, aVar);
            this.f14834b = interfaceC0635a;
            this.f14835c = sNSPhotoDocumentPickerViewModel;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super O9.p> aVar) {
            return ((y0) create(coroutineScope, aVar)).invokeSuspend(O9.p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<O9.p> create(Object obj, T9.a<?> aVar) {
            return new y0(this.f14834b, this.f14835c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14833a;
            if (i == 0) {
                kotlin.b.b(obj);
                com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "waiting for doc flip ... ", null, 4, null);
                this.f14833a = 1;
                if (DelayKt.delay(3000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            InterfaceC0635a<O9.p> interfaceC0635a = this.f14834b;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
            }
            this.f14835c.f14619z0 = false;
            return O9.p.f3034a;
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384}, m = "manualDocumentCaptureState")
    public static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14836a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14837b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14838c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14839d;

        /* renamed from: f, reason: collision with root package name */
        public int f14841f;

        public z(T9.a<? super z> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14839d = obj;
            this.f14841f |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.g(this);
        }
    }

    @V9.d(c = "com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel", f = "SNSPhotoDocumentPickerViewModel.kt", l = {398, 409}, m = "showInitialViewState")
    public static final class z0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14842a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14843b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14844c;

        /* renamed from: e, reason: collision with root package name */
        public int f14846e;

        public z0(T9.a<? super z0> aVar) {
            super(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f14844c = obj;
            this.f14846e |= Integer.MIN_VALUE;
            return SNSPhotoDocumentPickerViewModel.this.i(this);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SNSPhotoDocumentPickerViewModel.class, "collectedResults", "getCollectedResults()Ljava/util/List;", 0);
        kotlin.jvm.internal.i iVar = kotlin.jvm.internal.h.f23186a;
        iVar.getClass();
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(SNSPhotoDocumentPickerViewModel.class, "badPhotosAllowed", "getBadPhotosAllowed()Z", 0);
        iVar.getClass();
        f14592B = new InterfaceC0840h[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, C.v.t(SNSPhotoDocumentPickerViewModel.class, "autoCaptureAllowed", "getAutoCaptureAllowed()Z", 0, iVar)};
        f14591A = new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.sumsub.sns.internal.core.data.model.IdentitySide>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public SNSPhotoDocumentPickerViewModel(DocumentType documentType, String str, com.sumsub.sns.internal.core.data.source.common.a aVar, com.sumsub.sns.internal.core.data.source.dynamic.b bVar, com.sumsub.sns.internal.ml.badphotos.a aVar2, com.sumsub.sns.internal.ml.docdetector.b bVar2, com.sumsub.sns.internal.ml.badphotos.c cVar, com.sumsub.sns.internal.ml.autocapture.a aVar3, SeamlessDocaptureMobileConfig seamlessDocaptureMobileConfig, G g10, boolean z10) {
        super(documentType, str, z10, aVar, bVar);
        this.R = bVar;
        this.S = aVar2;
        this.T = bVar2;
        this.U = cVar;
        this.V = aVar3;
        this.W = seamlessDocaptureMobileConfig;
        ?? r12 = EmptyList.f23104a;
        this.Y = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "key_collected_results", r12);
        this.f14595a0 = kotlin.a.a(new m());
        this.f14596b0 = com.sumsub.sns.internal.ff.a.f16930a.g();
        this.f14597c0 = kotlin.a.a(new n());
        Boolean bool = Boolean.FALSE;
        this.f14603i0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "badPhotosAllowed", bool);
        this.f14604j0 = new com.sumsub.sns.internal.core.presentation.screen.base.a(g10, "autoCaptureAllowed", bool);
        this.f14605k0 = StateFlowKt.MutableStateFlow(new c(null, new c.a(null, null, null, null), null, null, null, 8, null));
        this.f14607m0 = (com.sumsub.sns.internal.ml.badphotos.models.b) g10.b("EXTRA_PREV_QUALITY_RESULT");
        Boolean bool2 = (Boolean) g10.b("EXTRA_IS_RETAKE");
        this.f14608n0 = bool2 != null ? bool2.booleanValue() : false;
        List list = (List) g10.b("EXTRA_DOCUMENT_SIDES");
        if (list != null) {
            r12 = new ArrayList(P9.n.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IdentitySide a10 = IdentitySide.INSTANCE.a((String) it.next());
                if (a10 == null) {
                    a10 = IdentitySide.Front;
                }
                r12.add(a10);
            }
        }
        this.f14609o0 = r12;
        String str2 = (String) g10.b("EXTRA_PREFER_AUTO_CAPTURE");
        this.f14610p0 = str2 != null ? DocCapture$PreferredMode.INSTANCE.a(str2) : null;
        Boolean bool3 = (Boolean) g10.b("EXTRA_IS_SEAMLESS");
        this.f14611q0 = bool3 != null ? bool3.booleanValue() : false;
        this.f14612r0 = Long.MIN_VALUE;
        this.f14614u0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f14615v0 = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f14617x0 = Long.MIN_VALUE;
    }

    public final boolean C() {
        return ((Boolean) this.f14604j0.a(this, f14592B[2])).booleanValue();
    }

    public final boolean D() {
        return ((Boolean) this.f14595a0.getValue()).booleanValue();
    }

    public final com.sumsub.sns.internal.camera.photo.presentation.document.a E() {
        return (com.sumsub.sns.internal.camera.photo.presentation.document.a) this.f14597c0.getValue();
    }

    public final boolean F() {
        return ((Boolean) this.f14603i0.a(this, f14592B[1])).booleanValue();
    }

    public final CameraX.Mode G() {
        CameraX.Mode mode;
        if (this.f14611q0) {
            mode = CameraX.Mode.SEAMLESS_DOC_CAPTURE;
        } else if (C()) {
            mode = CameraX.Mode.PHOTO_AND_ANALYZER;
            if (!this.V.s()) {
                mode = null;
            }
            if (mode == null) {
                mode = CameraX.Mode.ANALYZER;
            }
        } else {
            mode = CameraX.Mode.PHOTO;
        }
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "cameraMode: " + mode, null, 4, null);
        return mode;
    }

    public final List<com.sumsub.sns.internal.core.data.model.n> H() {
        return (List) this.Y.a(this, f14592B[0]);
    }

    public final com.sumsub.sns.internal.ff.core.a I() {
        return this.f14596b0;
    }

    public final StateFlow<c> K() {
        return this.f14605k0;
    }

    public final boolean L() {
        return this.f14609o0.isEmpty() || this.f14609o0.size() <= H().size();
    }

    public final a.j N() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "lost document bounds", null, 4, null);
        this.f14593A0 = false;
        E().a();
        this.f14617x0 = Long.MIN_VALUE;
        return e.f14665a;
    }

    public final void O() {
        MutableStateFlow<c> mutableStateFlow = this.f14605k0;
        mutableStateFlow.setValue(c.a(mutableStateFlow.getValue(), null, null, null, null, null, 23, null));
    }

    public final void P() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onCameraPreviewReady", null, 4, null);
    }

    public final void Q() {
        IdentitySide identitySide = (IdentitySide) P9.s.L(this.f14609o0);
        if (identitySide == null) {
            identitySide = IdentitySide.Front;
        }
        a(identitySide);
        a(EmptyList.f23104a);
    }

    public final boolean R() {
        Float n10;
        Integer k3;
        Integer j10;
        com.sumsub.sns.internal.core.data.model.n nVar = (com.sumsub.sns.internal.core.data.model.n) P9.s.R(H());
        com.sumsub.sns.internal.ml.badphotos.models.b l10 = nVar != null ? nVar.l() : null;
        return l10 != null && ((l10 == null || (j10 = l10.j()) == null) ? 0 : j10.intValue()) <= ((l10 == null || (k3 = l10.k()) == null) ? 0 : k3.intValue()) && ((l10 == null || (n10 = l10.n()) == null) ? 1.0f : n10.floatValue()) < this.U.l();
    }

    public final void S() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "started waiting for better photo", null, 4, null);
        this.f14612r0 = System.currentTimeMillis();
        this.s0 = true;
    }

    public final void T() {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new d1(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a, androidx.lifecycle.Q
    public void onCleared() {
        super.onCleared();
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new a0(null), 3, null);
    }

    @Override // com.sumsub.sns.internal.camera.c
    public Size t() {
        Size r8 = this.V.r();
        if (r8 != null) {
            if (!C()) {
                r8 = null;
            }
            if (r8 != null) {
                return r8;
            }
        }
        return super.t();
    }

    @Override // com.sumsub.sns.internal.camera.c
    public CameraX.b v() {
        C.o b9;
        C.o b10;
        int j10 = this.W.j();
        b9 = com.sumsub.sns.internal.camera.photo.presentation.document.e.b(this.W.l());
        b10 = com.sumsub.sns.internal.camera.photo.presentation.document.e.b(this.W.k());
        return new CameraX.b(j10, b9, b10, TimeUnit.SECONDS.toMillis(this.W.h()), this.W.i() * 1048576);
    }

    @Override // com.sumsub.sns.internal.camera.c
    public void x() {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onTakePictureClicked", null, 4, null);
        this.f14602h0 = true;
        if (G() == CameraX.Mode.PHOTO) {
            super.x();
        } else {
            this.f14606l0 = true;
        }
        a(new i(new r0()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(T9.a<? super com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.c> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.z
            if (r0 == 0) goto L13
            r0 = r14
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$z r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.z) r0
            int r1 = r0.f14841f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14841f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$z r0 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$z
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f14839d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14841f
            java.lang.String r3 = " "
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r1 = r0.f14838c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r2 = r0.f14837b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r0 = r0.f14836a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$k r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.k) r0
            kotlin.b.b(r14)
            r5 = r0
            goto L92
        L39:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L41:
            java.lang.Object r2 = r0.f14838c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r5 = r0.f14837b
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$k r5 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.k) r5
            java.lang.Object r6 = r0.f14836a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r6 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r6
            kotlin.b.b(r14)
            goto L7a
        L51:
            kotlin.b.b(r14)
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$k r14 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$k
            java.io.File r2 = r13.f14598d0
            boolean r6 = r13.f14600f0
            r14.<init>(r2, r6)
            boolean r2 = r13.f14611q0
            if (r2 == 0) goto L62
            goto L63
        L62:
            r14 = 0
        L63:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f14836a = r13
            r0.f14837b = r14
            r0.f14838c = r2
            r0.f14841f = r5
            java.lang.String r5 = "sns_autocapture_action_auto"
            java.lang.Object r5 = r13.a(r5, r0)
            if (r5 != r1) goto L76
            return r1
        L76:
            r6 = r13
            r12 = r5
            r5 = r14
            r14 = r12
        L7a:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L7f
            r14 = r3
        L7f:
            r0.f14836a = r5
            r0.f14837b = r2
            r0.f14838c = r14
            r0.f14841f = r4
            java.lang.String r4 = "sns_autocapture_action_manual"
            java.lang.Object r0 = r6.a(r4, r0)
            if (r0 != r1) goto L90
            return r1
        L90:
            r1 = r14
            r14 = r0
        L92:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L97
            goto L98
        L97:
            r3 = r14
        L98:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c$a r6 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c$a
            r6.<init>(r2, r1, r3, r14)
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c r14 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c
            r10 = 8
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.g(T9.a):java.lang.Object");
    }

    public final Object h(T9.a<? super O9.p> aVar) {
        Object a10 = a(new v0(), aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(T9.a<? super O9.p> r19) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.i(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(T9.a<? super O9.p> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.b1
            if (r0 == 0) goto L13
            r0 = r14
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$b1 r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.b1) r0
            int r1 = r0.f14639h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14639h = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$b1 r0 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$b1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f14637f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14639h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 != r4) goto L3e
            java.lang.Object r1 = r0.f14636e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f14635d
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.AutoCaptureHint) r2
            java.lang.Object r5 = r0.f14634c
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c r5 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.c) r5
            java.lang.Object r6 = r0.f14633b
            kotlinx.coroutines.flow.MutableStateFlow r6 = (kotlinx.coroutines.flow.MutableStateFlow) r6
            java.lang.Object r0 = r0.f14632a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r0
            kotlin.b.b(r14)
            r8 = r2
            r2 = r6
            goto L87
        L3e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L46:
            kotlin.b.b(r14)
            com.sumsub.sns.internal.camera.photo.presentation.document.b r5 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            r9 = 4
            r10 = 0
            java.lang.String r6 = "DocCapture"
            java.lang.String r7 = "showWaitPopup"
            r8 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.MutableStateFlow<com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c> r6 = r13.f14605k0
            java.lang.Object r14 = r6.getValue()
            r5 = r14
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c r5 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.c) r5
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint r14 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$AutoCaptureHint$State r2 = com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.AutoCaptureHint.State.DEFAULT
            java.lang.String r7 = ""
            r14.<init>(r7, r2)
            boolean r2 = r13.f14601g0
            if (r2 == 0) goto L6d
            r2 = r14
            goto L6e
        L6d:
            r2 = r3
        L6e:
            r0.f14632a = r13
            r0.f14633b = r6
            r0.f14634c = r5
            r0.f14635d = r2
            r0.f14636e = r7
            r0.f14639h = r4
            java.lang.String r14 = "sns_general_progress_text"
            java.lang.Object r14 = r13.a(r14, r0)
            if (r14 != r1) goto L83
            return r1
        L83:
            r0 = r13
            r8 = r2
            r2 = r6
            r1 = r7
        L87:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L8d
            java.lang.String r14 = " "
        L8d:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$d r9 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$d
            r9.<init>(r1, r14, r4)
            r11 = 19
            r12 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c r14 = com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.c.a(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.setValue(r14)
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c1 r14 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c1
            r14.<init>(r3)
            r1 = 0
            com.sumsub.sns.core.presentation.base.a.a(r0, r1, r14, r4, r3)
            O9.p r14 = O9.p.f3034a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.j(T9.a):java.lang.Object");
    }

    public final void f(boolean z10) {
        this.f14616w0 = z10;
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f14653a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f14654b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14655c;

        public d(String str, CharSequence charSequence, boolean z10) {
            this.f14653a = str;
            this.f14654b = charSequence;
            this.f14655c = z10;
        }

        public final String d() {
            return this.f14653a;
        }

        public final boolean e() {
            return this.f14655c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.f.b(this.f14653a, dVar.f14653a) && kotlin.jvm.internal.f.b(this.f14654b, dVar.f14654b) && this.f14655c == dVar.f14655c;
        }

        public final CharSequence f() {
            return this.f14654b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f14653a.hashCode() * 31;
            CharSequence charSequence = this.f14654b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            boolean z10 = this.f14655c;
            int i = z10;
            if (z10 != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FrameHint(icon=");
            sb2.append(this.f14653a);
            sb2.append(", text=");
            sb2.append((Object) this.f14654b);
            sb2.append(", loading=");
            return androidx.camera.core.impl.utils.a.o(sb2, this.f14655c, ')');
        }

        public /* synthetic */ d(String str, CharSequence charSequence, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, charSequence, (i & 4) != 0 ? false : z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.sumsub.sns.internal.camera.b, com.sumsub.sns.internal.camera.c, com.sumsub.sns.core.presentation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(T9.a<? super O9.p> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.o0
            if (r0 == 0) goto L13
            r0 = r14
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$o0 r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.o0) r0
            int r1 = r0.f14755e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14755e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$o0 r0 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$o0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f14753c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14755e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f14751a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r0
            kotlin.b.b(r14)
            goto Lbb
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3b:
            java.lang.Object r2 = r0.f14752b
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r2
            java.lang.Object r5 = r0.f14751a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r5 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r5
            kotlin.b.b(r14)
            r12 = r5
            r5 = r2
            r2 = r12
            goto La4
        L4a:
            java.lang.Object r2 = r0.f14751a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r2
            kotlin.b.b(r14)
            goto L61
        L52:
            kotlin.b.b(r14)
            r0.f14751a = r13
            r0.f14755e = r6
            java.lang.Object r14 = super.c(r0)
            if (r14 != r1) goto L60
            return r1
        L60:
            r2 = r13
        L61:
            com.sumsub.sns.internal.camera.photo.presentation.document.b r6 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r7 = "onPrepare: docType: "
            r14.<init>(r7)
            com.sumsub.sns.internal.core.data.model.DocumentType r7 = r2.u()
            r14.append(r7)
            java.lang.String r7 = ", idType: "
            r14.append(r7)
            java.lang.String r7 = r2.s()
            r14.append(r7)
            java.lang.String r7 = ", sides: "
            r14.append(r7)
            java.util.List<com.sumsub.sns.internal.core.data.model.IdentitySide> r7 = r2.f14609o0
            r14.append(r7)
            java.lang.String r8 = r14.toString()
            r10 = 4
            r11 = 0
            java.lang.String r7 = "DocCapture"
            r9 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r6, r7, r8, r9, r10, r11)
            r2.Q()
            r0.f14751a = r2
            r0.f14752b = r2
            r0.f14755e = r5
            java.lang.Object r14 = r2.e(r0)
            if (r14 != r1) goto La3
            return r1
        La3:
            r5 = r2
        La4:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r5.d(r14)
            r0.f14751a = r2
            r0.f14752b = r3
            r0.f14755e = r4
            java.lang.Object r14 = r2.j(r0)
            if (r14 != r1) goto Lba
            return r1
        Lba:
            r0 = r2
        Lbb:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$p0 r14 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$p0
            r14.<init>(r3)
            r0.a(r14)
            O9.p r14 = O9.p.f3034a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.c(T9.a):java.lang.Object");
    }

    public final void d(boolean z10) {
        this.f14604j0.a(this, f14592B[2], Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f14603i0.a(this, f14592B[1], Boolean.valueOf(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(T9.a<? super O9.p> r19) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.f(T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(T9.a<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.e(T9.a):java.lang.Object");
    }

    public final void b(File file) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onVideoRecordingStarted: " + file, null, 4, null);
        this.X = false;
        this.f14600f0 = true;
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new u0(null), 3, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.a
    public void b(com.sumsub.sns.internal.core.data.model.o oVar) {
        Object c2 = oVar.c();
        f fVar = c2 instanceof f ? (f) c2 : null;
        if (fVar != null) {
            a(fVar);
        } else {
            super.b(oVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r19, android.graphics.Bitmap r20, T9.a<? super O9.p> r21) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.b(android.content.Context, android.graphics.Bitmap, T9.a):java.lang.Object");
    }

    public final void a(List<com.sumsub.sns.internal.core.data.model.n> list) {
        this.Y.a(this, f14592B[0], list);
    }

    public final void g(boolean z10) {
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new e1(z10, null), 3, null);
    }

    public final void a(f fVar) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "handleVideoRecordError: " + fVar, null, 4, null);
        a(g.f14697a);
    }

    public final void a(CameraX.c cVar) {
        File c2 = cVar.c();
        com.sumsub.sns.internal.camera.photo.presentation.document.b bVar = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a;
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", "video recording stopped. isWaitingForVideo=" + this.f14599e0 + ", " + c2, null, 4, null);
        this.f14600f0 = false;
        this.X = false;
        this.f14598d0 = null;
        CameraX.c.a d10 = cVar.d();
        boolean z10 = d10 instanceof CameraX.c.a.C0238a;
        if (z10) {
            bVar.b("DocCapture", "onVideoRecordingFinalized: " + d10, ((CameraX.c.a.C0238a) d10).c());
        }
        if (!this.f14599e0) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", "onVideoRecorded: removing video file", null, 4, null);
            c2.delete();
            if (z10) {
                BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new s0(d10, null), 3, null);
                return;
            }
            return;
        }
        this.f14599e0 = false;
        CameraX.c.a.b bVar2 = d10 instanceof CameraX.c.a.b ? (CameraX.c.a.b) d10 : null;
        if (bVar2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(H());
        arrayList.add(new com.sumsub.sns.internal.core.data.model.n(c2, c2, null, "IDENTITY_VIDEO", null, false, null, new n.b(bVar2.c(), bVar2.d()), false, 356, null));
        a(arrayList);
        BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new t0(null), 3, null);
    }

    public final void c(boolean z10) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onAutoEnabled: " + z10, null, 4, null);
        if (z10) {
            T();
        } else {
            g(true);
        }
    }

    public final void b(Context context) {
        if (this.f14611q0 && this.f14598d0 == null) {
            this.X = true;
            a(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r11, T9.a<? super O9.p> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.i0
            if (r0 == 0) goto L13
            r0 = r12
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$i0 r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.i0) r0
            int r1 = r0.f14727e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14727e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$i0 r0 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$i0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f14725c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14727e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L48
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r11 = r0.f14723a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r11 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r11
            kotlin.b.b(r12)
            goto L95
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r0.f14723a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r11 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r11
            kotlin.b.b(r12)
            kotlinx.coroutines.channels.ChannelResult r12 = (kotlinx.coroutines.channels.ChannelResult) r12
            java.lang.Object r12 = r12.getHolder()
            goto L7e
        L48:
            java.lang.Object r11 = r0.f14724b
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r2 = r0.f14723a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r2
            kotlin.b.b(r12)
            goto L6b
        L54:
            kotlin.b.b(r12)
            r10.f14619z0 = r6
            boolean r12 = r10.f14600f0
            if (r12 != 0) goto L94
            r0.f14723a = r10
            r0.f14724b = r11
            r0.f14727e = r6
            java.lang.Object r12 = r10.j(r0)
            if (r12 != r1) goto L6a
            return r1
        L6a:
            r2 = r10
        L6b:
            r2.b(r11)
            kotlinx.coroutines.channels.Channel<O9.p> r11 = r2.f14614u0
            r0.f14723a = r2
            r0.f14724b = r3
            r0.f14727e = r5
            java.lang.Object r12 = r11.mo116receiveCatchingJP2dKIU(r0)
            if (r12 != r1) goto L7d
            return r1
        L7d:
            r11 = r2
        L7e:
            boolean r12 = kotlinx.coroutines.channels.ChannelResult.m133isFailureimpl(r12)
            if (r12 == 0) goto L87
            O9.p r11 = O9.p.f3034a
            return r11
        L87:
            r0.f14723a = r11
            r0.f14727e = r4
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r4, r0)
            if (r12 != r1) goto L95
            return r1
        L94:
            r11 = r10
        L95:
            S0.a r4 = androidx.lifecycle.C0552s.b(r11)
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$j0 r7 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$j0
            r7.<init>(r3)
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            O9.p r11 = O9.p.f3034a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.b(android.content.Context, T9.a):java.lang.Object");
    }

    public final void b(f fVar) {
        if (fVar != null) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "stopVideoRecording with error: " + fVar, null, 4, null);
        }
        MutableStateFlow<c> mutableStateFlow = this.f14605k0;
        mutableStateFlow.setValue(c.a(mutableStateFlow.getValue(), new k(null, false), null, null, null, fVar != null ? new a.d(new o.d(null, fVar, new o.a(fVar.a(), null, null, 6, null), 1, null), u().c(), null) : null, 6, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
    
        if (r11 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (r11 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.core.domain.camera.CameraX.c.a.C0238a r10, T9.a<? super O9.p> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.x
            if (r0 == 0) goto L13
            r0 = r11
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$x r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.x) r0
            int r1 = r0.f14825e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14825e = r1
            goto L18
        L13:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$x r0 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$x
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f14823c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r2 = r0.f14825e
            r3 = 1
            java.lang.String r4 = " "
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L50
            if (r2 == r3) goto L44
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            java.lang.Object r10 = r0.f14821a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r10 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r10
            kotlin.b.b(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.f14821a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r10 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r10
            kotlin.b.b(r11)
            goto L7f
        L44:
            java.lang.Object r10 = r0.f14822b
            com.sumsub.sns.internal.core.domain.camera.CameraX$c$a$a r10 = (com.sumsub.sns.internal.core.domain.camera.CameraX.c.a.C0238a) r10
            java.lang.Object r2 = r0.f14821a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r2
            kotlin.b.b(r11)
            goto L63
        L50:
            kotlin.b.b(r11)
            r0.f14821a = r9
            r0.f14822b = r10
            r0.f14825e = r3
            java.lang.String r11 = "sns_seamless_error_general"
            java.lang.Object r11 = r9.a(r11, r0)
            if (r11 != r1) goto L62
            return r1
        L62:
            r2 = r9
        L63:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L68
            r11 = r4
        L68:
            int r3 = r10.d()
            r7 = 0
            if (r3 != r5) goto L87
            r0.f14821a = r2
            r0.f14822b = r7
            r0.f14825e = r6
            java.lang.String r10 = "sns_seamless_error_notEnoughStorage"
            java.lang.Object r11 = r2.a(r10, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r10 = r2
        L7f:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L85
        L83:
            r2 = r10
            goto Lad
        L85:
            r2 = r10
            goto L96
        L87:
            int r3 = r10.d()
            r8 = 9
            if (r3 == r8) goto L98
            int r10 = r10.d()
            if (r10 != r6) goto L96
            goto L98
        L96:
            r4 = r11
            goto Lad
        L98:
            r0.f14821a = r2
            r0.f14822b = r7
            r0.f14825e = r5
            java.lang.String r10 = "sns_seamless_error_timeExceeded"
            java.lang.Object r11 = r2.a(r10, r0)
            if (r11 != r1) goto La7
            return r1
        La7:
            r10 = r2
        La8:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L85
            goto L83
        Lad:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$f$a r10 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$f$a
            r10.<init>(r4)
            r2.b(r10)
            O9.p r10 = O9.p.f3034a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(com.sumsub.sns.internal.core.domain.camera.CameraX$c$a$a, T9.a):java.lang.Object");
    }

    public final Job a(InterfaceC0646l<? super T9.a<? super O9.p>, ? extends Object> interfaceC0646l) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new y(interfaceC0646l, null), 3, null);
        return launch$default;
    }

    @Override // com.sumsub.sns.internal.camera.b, com.sumsub.sns.internal.camera.c
    public void a(File file) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "onPictureTaken: waiting=" + this.f14602h0, null, 4, null);
        if (this.f14602h0) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new k0(file, null), 3, null);
        } else {
            super.a(file);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r28, android.graphics.Bitmap r29, android.graphics.Rect r30, T9.a<? super com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.FrameHandleResult> r31) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(android.content.Context, android.graphics.Bitmap, android.graphics.Rect, T9.a):java.lang.Object");
    }

    @Override // com.sumsub.sns.internal.camera.b
    public void a(Context context, String str, Uri uri) {
        if (!this.f14601g0 && (!this.f14611q0 || !C())) {
            super.a(context, str, uri);
            return;
        }
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "Gallery picking NOT allowed here!!", null, 4, null);
        com.sumsub.sns.internal.log.a.f17535a.w("DocCapture", "Gallery picking NOT allowed here!!", new RuntimeException("Gallery picking NOT allowed here!!"));
        if (!(!com.sumsub.sns.internal.core.common.e0.f15081a.isDebug())) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.camera.photo.presentation.document.CheckDetectionResult r9, com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.PhotoCheckResult r10, T9.a<? super O9.p> r11) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(com.sumsub.sns.internal.camera.photo.presentation.document.CheckDetectionResult, com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$PhotoCheckResult, T9.a):java.lang.Object");
    }

    public final Object a(Context context, Rect rect, a aVar, T9.a<? super O9.p> aVar2) {
        Channel Channel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        a(new i(new f1(context, aVar, rect, Channel$default)));
        Object receive = Channel$default.receive(aVar2);
        return receive == CoroutineSingletons.f23158a ? receive : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r8, android.graphics.Bitmap r9, T9.a<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.t
            if (r0 == 0) goto L14
            r0 = r10
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$t r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.t) r0
            int r1 = r0.f14794f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14794f = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$t r0 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$t
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f14792d
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r1 = r4.f14794f
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r8 = r4.f14791c
            r9 = r8
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.lang.Object r8 = r4.f14790b
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r0 = r4.f14789a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r0 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r0
            kotlin.b.b(r10)
            goto L56
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.b.b(r10)
            r4.f14789a = r7
            r4.f14790b = r8
            r4.f14791c = r9
            r4.f14794f = r2
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r9
            java.lang.Object r10 = a(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L55
            return r0
        L55:
            r0 = r7
        L56:
            com.sumsub.sns.internal.ml.badphotos.models.b r10 = (com.sumsub.sns.internal.ml.badphotos.models.b) r10
            if (r10 == 0) goto L65
            java.lang.Float r1 = r10.n()
            if (r1 == 0) goto L65
            float r1 = r1.floatValue()
            goto L67
        L65:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L67:
            com.sumsub.sns.internal.ml.badphotos.c r2 = r0.U
            float r2 = r2.k()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L7c
            if (r10 == 0) goto L7c
            boolean r8 = r0.a(r8, r9, r10)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(android.content.Context, android.graphics.Bitmap, T9.a):java.lang.Object");
    }

    public final PhotoCheckResult a(PhotoCheckResult photoCheckResult) {
        if (photoCheckResult != this.f14613t0) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "requestFrameCheckResultUpdate: -> " + photoCheckResult, null, 4, null);
        }
        this.f14613t0 = photoCheckResult;
        return photoCheckResult;
    }

    public final void a(CheckDetectionResult checkDetectionResult, com.sumsub.sns.internal.ml.docdetector.a aVar, boolean z10, Bitmap bitmap) {
        if (checkDetectionResult != null && aVar != null) {
            a.j a10 = a(checkDetectionResult, aVar, bitmap, z10);
            if (a10 != null) {
                a(a10);
                return;
            }
            return;
        }
        if (this.f14593A0) {
            a(N());
        }
    }

    public final a.j a(CheckDetectionResult checkDetectionResult, com.sumsub.sns.internal.ml.docdetector.a aVar, Bitmap bitmap, boolean z10) {
        if (!checkDetectionResult.e()) {
            this.f14617x0 = Long.MIN_VALUE;
        }
        if (!this.f14593A0 && com.sumsub.sns.internal.core.common.e0.f15081a.isDebug()) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "started tracking document bounds: " + aVar, null, 4, null);
        }
        if (z10) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "detected bounds " + aVar, null, 4, null);
        }
        this.f14593A0 = true;
        if (this.V.w()) {
            return new h(new Size(bitmap.getWidth(), bitmap.getHeight()), new Size(this.T.l().getWidth(), this.T.l().getHeight()), aVar, checkDetectionResult.e(), this.V.w(), z10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.graphics.Bitmap r19, T9.a<? super com.sumsub.sns.internal.ml.badphotos.models.b> r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.q
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$q r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.q) r2
            int r3 = r2.f14765d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f14765d = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$q r2 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$q
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f14763b
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r2.f14765d
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            java.lang.Object r2 = r2.f14762a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r2
            kotlin.b.b(r1)
            goto L48
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            kotlin.b.b(r1)
            r2.f14762a = r0
            r2.f14765d = r5
            r1 = r19
            java.lang.Object r1 = r0.a(r1, r5, r2)
            if (r1 != r3) goto L47
            return r3
        L47:
            r2 = r0
        L48:
            r6 = r1
            com.sumsub.sns.internal.ml.badphotos.models.b r6 = (com.sumsub.sns.internal.ml.badphotos.models.b) r6
            if (r6 == 0) goto L61
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r16 = 255(0xff, float:3.57E-43)
            r17 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.sumsub.sns.internal.ml.badphotos.models.b r1 = com.sumsub.sns.internal.ml.badphotos.models.b.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L5f:
            r6 = r1
            goto L63
        L61:
            r1 = 0
            goto L5f
        L63:
            r1 = 0
            if (r6 == 0) goto L71
            java.lang.Float r3 = r6.n()
            if (r3 == 0) goto L71
            float r3 = r3.floatValue()
            goto L72
        L71:
            r3 = r1
        L72:
            if (r6 == 0) goto L7e
            java.lang.Float r4 = r6.q()
            if (r4 == 0) goto L7e
            float r1 = r4.floatValue()
        L7e:
            com.sumsub.sns.internal.ml.badphotos.models.b r2 = r2.f14607m0
            if (r2 == 0) goto L8d
            java.lang.Integer r2 = r2.j()
            if (r2 == 0) goto L8d
            int r2 = r2.intValue()
            goto L8e
        L8d:
            r2 = 0
        L8e:
            if (r6 == 0) goto Laa
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto Laa
            int r2 = r2 + r5
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r2)
            r16 = 447(0x1bf, float:6.26E-43)
            r17 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            com.sumsub.sns.internal.ml.badphotos.models.b r6 = com.sumsub.sns.internal.ml.badphotos.models.b.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        Laa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(android.graphics.Bitmap, T9.a):java.lang.Object");
    }

    public final void a(Context context, Bitmap bitmap, Rect rect, Rect rect2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width));
        canvas.drawRect(rect, paint);
        paint.setColor(-65536);
        canvas.drawRect(rect2, paint);
        a(context, createBitmap, "frame");
        createBitmap.recycle();
    }

    public final void a(Context context, Bitmap bitmap, String str) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return;
        }
        File file = new File(externalFilesDir, str + '_' + System.currentTimeMillis() + ".jpg");
        com.sumsub.sns.internal.camera.photo.presentation.document.b bVar = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a;
        StringBuilder sb2 = new StringBuilder("saving to ");
        sb2.append(file.getAbsolutePath());
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", sb2.toString(), null, 4, null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        if (compress) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, "DocCapture", "saved!", null, 4, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0107, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010e, code lost:
    
        return new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.AutoCaptureHint(r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f1, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r9 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.sumsub.sns.internal.camera.photo.presentation.document.CheckDetectionResult r7, boolean r8, T9.a<? super com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.AutoCaptureHint> r9) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(com.sumsub.sns.internal.camera.photo.presentation.document.CheckDetectionResult, boolean, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel, CheckDetectionResult checkDetectionResult, boolean z10, T9.a aVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z10 = false;
        }
        return sNSPhotoDocumentPickerViewModel.a(checkDetectionResult, z10, (T9.a<? super AutoCaptureHint>) aVar);
    }

    public final boolean a(Context context, Bitmap bitmap, com.sumsub.sns.internal.ml.badphotos.models.b bVar) {
        Bitmap c2;
        com.sumsub.sns.internal.ml.badphotos.models.b d10;
        Float n10;
        a aVar = this.f14618y0;
        float floatValue = (aVar == null || (d10 = aVar.d()) == null || (n10 = d10.n()) == null) ? 0.0f : n10.floatValue();
        Float n11 = bVar.n();
        float floatValue2 = n11 != null ? n11.floatValue() : 0.0f;
        if (floatValue2 <= floatValue) {
            return false;
        }
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "better frame detected: score -> " + floatValue2, null, 4, null);
        a aVar2 = this.f14618y0;
        if (aVar2 != null && (c2 = aVar2.c()) != null) {
            c2.recycle();
        }
        this.f14618y0 = new a(bitmap, bVar);
        b(context);
        return true;
    }

    public final void a(Context context) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "initiateVideoRecord", null, 4, null);
        File externalCacheDir = context.getExternalCacheDir();
        if (!com.sumsub.sns.internal.core.common.e0.f15081a.isDebug()) {
            externalCacheDir = null;
        }
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        this.f14598d0 = new File(externalCacheDir, "docapture_" + UUID.randomUUID() + ".mp4");
        MutableStateFlow<c> mutableStateFlow = this.f14605k0;
        mutableStateFlow.setValue(c.a(mutableStateFlow.getValue(), new k(this.f14598d0, true), null, null, null, null, 30, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r22, android.graphics.Bitmap r23, android.graphics.Rect r24, com.sumsub.sns.internal.ml.badphotos.models.b r25, T9.a<? super O9.p> r26) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(android.content.Context, android.graphics.Bitmap, android.graphics.Rect, com.sumsub.sns.internal.ml.badphotos.models.b, T9.a):java.lang.Object");
    }

    public final Object a(Context context, File file, com.sumsub.sns.internal.ml.badphotos.models.b bVar, T9.a<? super O9.p> aVar) {
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a, "DocCapture", "Picture is taken. Side - " + q(), null, 4, null);
        ArrayList arrayList = new ArrayList(H());
        arrayList.add(new com.sumsub.sns.internal.core.data.model.n(file, file, null, null, q(), false, bVar, null, false, 428, null));
        a(arrayList);
        if (!this.f14611q0) {
            b(true);
            com.sumsub.sns.core.presentation.base.a.a(this, false, new l0(null), 1, null);
            com.sumsub.sns.core.presentation.base.a.a(this, (com.sumsub.sns.internal.core.common.q) null, new com.sumsub.sns.internal.core.data.model.n(file, file, null, null, q(), false, bVar, null, false, 428, null), (Long) null, 5, (Object) null);
            return O9.p.f3034a;
        }
        if (L()) {
            if (this.f14601g0 || H().size() != 1) {
                BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new m0(null), 3, null);
                return O9.p.f3034a;
            }
            Object b9 = b(context, aVar);
            return b9 == CoroutineSingletons.f23158a ? b9 : O9.p.f3034a;
        }
        if (H().size() != 1 || this.f14601g0) {
            BuildersKt__Builders_commonKt.launch$default(C0552s.b(this), null, null, new n0(null), 3, null);
            return O9.p.f3034a;
        }
        Object a10 = a(context, aVar);
        return a10 == CoroutineSingletons.f23158a ? a10 : O9.p.f3034a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r20, T9.a<? super O9.p> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.b0
            if (r2 == 0) goto L17
            r2 = r1
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$b0 r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.b0) r2
            int r3 = r2.f14631d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f14631d = r3
            goto L1c
        L17:
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$b0 r2 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$b0
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f14629b
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.f23158a
            int r4 = r2.f14631d
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 != r6) goto L36
            java.lang.Object r2 = r2.f14628a
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel r2 = (com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel) r2
            kotlin.b.b(r1)
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.getHolder()
            goto L86
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            kotlin.b.b(r1)
            r0.f14619z0 = r6
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c0 r1 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$c0
            r1.<init>(r5)
            r4 = 0
            com.sumsub.sns.core.presentation.base.a.a(r0, r4, r1, r6, r5)
            boolean r1 = r19.R()
            if (r1 == 0) goto L75
            com.sumsub.sns.internal.camera.photo.presentation.document.b r7 = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a
            java.lang.String r9 = "interrupting the seamless due to the bad quality"
            r10 = 0
            java.lang.String r8 = "DocCapture"
            r11 = 4
            r12 = 0
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(r7, r8, r9, r10, r11, r12)
            S0.a r13 = androidx.lifecycle.C0552s.b(r19)
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$d0 r1 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$d0
            r1.<init>(r5)
            r14 = 0
            r15 = 0
            r17 = 3
            r18 = 0
            r16 = r1
            kotlinx.coroutines.BuildersKt.launch$default(r13, r14, r15, r16, r17, r18)
            O9.p r1 = O9.p.f3034a
            return r1
        L75:
            r19.b(r20)
            kotlinx.coroutines.channels.Channel<O9.p> r1 = r0.f14614u0
            r2.f14628a = r0
            r2.f14631d = r6
            java.lang.Object r1 = r1.mo116receiveCatchingJP2dKIU(r2)
            if (r1 != r3) goto L85
            return r3
        L85:
            r2 = r0
        L86:
            boolean r1 = kotlinx.coroutines.channels.ChannelResult.m133isFailureimpl(r1)
            if (r1 == 0) goto L8f
            O9.p r1 = O9.p.f3034a
            return r1
        L8f:
            S0.a r1 = androidx.lifecycle.C0552s.b(r2)
            com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$e0 r6 = new com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel$e0
            r6.<init>(r5)
            r3 = 0
            r4 = 0
            r7 = 3
            r8 = 0
            r2 = r1
            r5 = r6
            r6 = r7
            r7 = r8
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            O9.p r1 = O9.p.f3034a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(android.content.Context, T9.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ca.InterfaceC0635a<O9.p> r21, T9.a<? super O9.p> r22) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(ca.a, T9.a):java.lang.Object");
    }

    public final Bitmap a(Bitmap bitmap, Rect rect) {
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, rect.left * (-1), rect.top * (-1), (Paint) null);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.graphics.Bitmap r24, boolean r25, T9.a<? super com.sumsub.sns.internal.ml.badphotos.models.b> r26) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.camera.photo.presentation.document.SNSPhotoDocumentPickerViewModel.a(android.graphics.Bitmap, boolean, T9.a):java.lang.Object");
    }

    public static /* synthetic */ Object a(SNSPhotoDocumentPickerViewModel sNSPhotoDocumentPickerViewModel, Bitmap bitmap, boolean z10, T9.a aVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z10 = false;
        }
        return sNSPhotoDocumentPickerViewModel.a(bitmap, z10, (T9.a<? super com.sumsub.sns.internal.ml.badphotos.models.b>) aVar);
    }

    public final CheckDetectionResult a(float f10, float f11, Rect rect, com.sumsub.sns.internal.ml.docdetector.a aVar) {
        return E().c(f10, f11, rect, aVar);
    }
}
