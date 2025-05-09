package com.sumsub.sns.geo.presentation;

import O9.p;
import R0.a;
import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.widget.SNSStepState;
import com.sumsub.sns.internal.geo.presentation.e;
import e.AbstractC0704c;
import ia.InterfaceC0840h;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.bouncycastle.i18n.MessageBundle;
import r0.C1146a;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020!H\u0002¢\u0006\u0004\b\u0012\u0010\"J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020#H\u0002¢\u0006\u0004\b\u0012\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u0006J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b\u0012\u00103R\u001d\u00108\u001a\u0004\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001d\u0010=\u001a\u0004\u0018\u0001098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001d\u0010@\u001a\u0004\u0018\u0001098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00105\u001a\u0004\b?\u0010<R\u001d\u0010E\u001a\u0004\u0018\u00010A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010DR\u001d\u0010H\u001a\u0004\u0018\u0001098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00105\u001a\u0004\bG\u0010<R\u001d\u0010M\u001a\u0004\u0018\u00010I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00105\u001a\u0004\bK\u0010LR\u001d\u0010P\u001a\u0004\u0018\u00010I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00105\u001a\u0004\bO\u0010LR\u001d\u0010S\u001a\u0004\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\bR\u00107R$\u0010X\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0U\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010`R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010`R\u001b\u0010f\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u0010c\u001a\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010hR\u0016\u0010m\u001a\u0004\u0018\u00010j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010u¨\u0006w"}, d2 = {"Lcom/sumsub/sns/geo/presentation/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/geo/presentation/e;", "Lcom/sumsub/sns/internal/geo/presentation/c;", "Lcom/sumsub/sns/internal/core/presentation/form/a;", "<init>", "()V", "", "", "", "grantResults", "LO9/p;", "handlePermissionResults", "(Ljava/util/Map;)V", "y", "s", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "a", "(Landroid/location/Location;)V", "l", "k", "Lcom/sumsub/sns/internal/geo/presentation/e$b;", "state", "(Lcom/sumsub/sns/internal/geo/presentation/e$b;)V", "Lcom/sumsub/sns/internal/geo/presentation/e$f;", "(Lcom/sumsub/sns/internal/geo/presentation/e$f;)V", "Lcom/sumsub/sns/core/presentation/base/a$n;", "event", "(Lcom/sumsub/sns/core/presentation/base/a$n;)V", "A", "x", "z", "Lcom/sumsub/sns/internal/geo/presentation/e$d;", "(Lcom/sumsub/sns/internal/geo/presentation/e$d;)V", "Lcom/sumsub/sns/internal/geo/presentation/e$g;", "(Lcom/sumsub/sns/internal/geo/presentation/e$g;)V", "m", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "Lcom/sumsub/sns/core/presentation/base/a$j;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "(Lcom/sumsub/sns/internal/geo/presentation/e;Landroid/os/Bundle;)V", "Landroid/view/ViewGroup;", "Lcom/sumsub/sns/internal/core/common/z;", "n", "()Landroid/view/ViewGroup;", FirebaseAnalytics.Param.CONTENT, "Landroid/widget/TextView;", "b", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "c", "v", "subtitle", "Landroid/widget/ImageView;", "d", "r", "()Landroid/widget/ImageView;", "icon", "e", "q", "hint", "Landroid/widget/Button;", "f", "t", "()Landroid/widget/Button;", "primaryButton", "g", "u", "secondaryButton", "h", "o", "formContainer", "Le/c;", "", "i", "Le/c;", "permissionLauncher", "j", "Z", "locationSent", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "locationTimeOut", "Landroid/location/LocationListener;", "Landroid/location/LocationListener;", "gpslocationListener", "networklocationListener", "LO9/f;", "w", "()Lcom/sumsub/sns/internal/geo/presentation/c;", "viewModel", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "Lcom/sumsub/sns/internal/core/analytics/Screen;", "screenInternal", "Lcom/sumsub/sns/core/presentation/form/d;", "p", "()Lcom/sumsub/sns/core/presentation/form/d;", "formFragment", "getScreen", "()Lcom/sumsub/sns/internal/core/analytics/Screen;", "screen", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lcom/sumsub/sns/internal/core/presentation/form/b;", "()Lcom/sumsub/sns/internal/core/presentation/form/b;", "hostViewModel", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<com.sumsub.sns.internal.geo.presentation.e, com.sumsub.sns.internal.geo.presentation.c> implements com.sumsub.sns.internal.core.presentation.form.a {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f14393q;

    /* renamed from: u, reason: collision with root package name */
    public static final long f14394u;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final z content = a0.a(this, R$id.sns_fragment_content);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z title = a0.a(this, R$id.sns_title);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z subtitle = a0.a(this, R$id.sns_subtitle);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z icon = a0.a(this, R$id.sns_icon);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z hint = a0.a(this, R$id.sns_hint);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z primaryButton = a0.a(this, R$id.sns_primary_button);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z secondaryButton = a0.a(this, R$id.sns_secondary_button);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z formContainer = a0.a(this, R$id.sns_form_placeholder);

    /* renamed from: i, reason: from kotlin metadata */
    public AbstractC0704c<String[]> permissionLauncher;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean locationSent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Job locationTimeOut;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final LocationListener gpslocationListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final LocationListener networklocationListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public Screen screenInternal;

    /* renamed from: com.sumsub.sns.geo.presentation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fragment a(Document document) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    @V9.d(c = "com.sumsub.sns.geo.presentation.SNSGeoFragment$enableLocationUpdates$1", f = "SNSGeoFragment.kt", l = {210}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14409a;

        public b(T9.a<? super b> aVar) {
            super(2, aVar);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return a.this.new b(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            int i = this.f14409a;
            if (i == 0) {
                kotlin.b.b(obj);
                this.f14409a = 1;
                if (DelayKt.delay(30000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            a.this.k();
            a.this.getViewModel().u();
            return p.f3034a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<p> {
        public c() {
            super(0);
        }

        public final void a() {
            com.sumsub.sns.core.presentation.b.finish$default(a.this, null, null, null, 7, null);
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<p> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.n f14413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.n nVar) {
            super(0);
            this.f14413b = nVar;
        }

        public final void a() {
            a.this.getViewModel().a(this.f14413b.e());
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f14414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f14414a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f14414a;
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14415a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f14415a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f14415a.invoke();
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f14416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(O9.f fVar) {
            super(0);
            this.f14416a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f14416a.getValue()).getViewModelStore();
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f14417a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f14418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f14417a = interfaceC0635a;
            this.f14418b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f14417a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f14418b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class j extends Lambda implements InterfaceC0635a<T> {
        public j() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new com.sumsub.sns.internal.geo.presentation.d(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, FirebaseAnalytics.Param.CONTENT, "getContent()Landroid/view/ViewGroup;", 0);
        i iVar = kotlin.jvm.internal.h.f23186a;
        f14393q = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, MessageBundle.TITLE_ENTRY, "getTitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "icon", "getIcon()Landroid/widget/ImageView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "hint", "getHint()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "secondaryButton", "getSecondaryButton()Landroid/widget/Button;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "formContainer", "getFormContainer()Landroid/view/ViewGroup;", 0, iVar)};
        INSTANCE = new Companion(null);
        f14394u = TimeUnit.MINUTES.toNanos(10L);
    }

    public a() {
        final int i = 0;
        this.gpslocationListener = new LocationListener(this) { // from class: com.sumsub.sns.geo.presentation.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f14423b;

            {
                this.f14423b = this;
            }

            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                switch (i) {
                    case 0:
                        a.a(this.f14423b, location);
                        break;
                    default:
                        a.b(this.f14423b, location);
                        break;
                }
            }
        };
        final int i9 = 1;
        this.networklocationListener = new LocationListener(this) { // from class: com.sumsub.sns.geo.presentation.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f14423b;

            {
                this.f14423b = this;
            }

            @Override // android.location.LocationListener
            public final void onLocationChanged(Location location) {
                switch (i9) {
                    case 0:
                        a.a(this.f14423b, location);
                        break;
                    default:
                        a.b(this.f14423b, location);
                        break;
                }
            }
        };
        j jVar = new j();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new f(new e(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.geo.presentation.c.class), new g(b9), jVar, new h(null, b9));
        this.screenInternal = Screen.GeolocationDetectionScreen;
    }

    public static final void c(a aVar, View view) {
        aVar.getViewModel().v();
    }

    public static final void d(a aVar, View view) {
        aVar.m();
    }

    public static final void e(a aVar, View view) {
        com.sumsub.sns.internal.core.analytics.c.b(aVar.getAnalyticsDelegate(), aVar.getScreenInternal(), aVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        aVar.getViewModel().w();
    }

    public static final void f(a aVar, View view) {
        aVar.s();
    }

    public static final void g(a aVar, View view) {
        aVar.m();
    }

    public final void A() {
        TextView title = getTitle();
        if (title != null) {
            title.setVisibility(4);
        }
        TextView v10 = v();
        if (v10 != null) {
            v10.setVisibility(4);
        }
        ImageView r8 = r();
        if (r8 != null) {
            r8.setVisibility(4);
        }
        TextView q10 = q();
        if (q10 != null) {
            q10.setVisibility(4);
        }
        Button t3 = t();
        if (t3 != null) {
            t3.setVisibility(8);
        }
        Button u6 = u();
        if (u6 != null) {
            u6.setVisibility(8);
        }
        ViewGroup o10 = o();
        if (o10 != null) {
            o10.setVisibility(4);
        }
        getViewModel().b(true);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return getViewModel().r().getType().c();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_geo;
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: getScreen, reason: from getter */
    public Screen getScreenInternal() {
        return this.screenInternal;
    }

    public final TextView getTitle() {
        return (TextView) this.title.a(this, f14393q[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        super.handleEvent(event);
        if (event instanceof a.n) {
            a((a.n) event);
        }
    }

    public final void handlePermissionResults(Map<String, Boolean> grantResults) {
        getViewModel().a(grantResults);
    }

    public final void k() {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "disableLocationUpdates", null, 4, null);
        Job job = this.locationTimeOut;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.locationTimeOut = null;
        Object systemService = requireActivity().getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return;
        }
        locationManager.removeUpdates(this.gpslocationListener);
        locationManager.removeUpdates(this.networklocationListener);
    }

    @SuppressLint({"MissingPermission"})
    public final void l() {
        Job launch$default;
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "enableLocationUpdates", null, 4, null);
        Object systemService = requireActivity().getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager == null) {
            return;
        }
        this.locationSent = false;
        boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
        if (isProviderEnabled) {
            locationManager.requestLocationUpdates("gps", TimeUnit.SECONDS.toMillis(5L), 0.0f, this.gpslocationListener);
        }
        boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
        if (isProviderEnabled2) {
            locationManager.requestLocationUpdates("network", TimeUnit.SECONDS.toMillis(5L), 0.0f, this.networklocationListener);
        }
        if (!isProviderEnabled && !isProviderEnabled2) {
            getViewModel().u();
        } else {
            launch$default = BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new b(null), 3, null);
            this.locationTimeOut = launch$default;
        }
    }

    public final void m() {
        com.sumsub.sns.internal.core.analytics.c.b(getAnalyticsDelegate(), getScreen(), getIdDocSetType(), Control.SkipButton, null, 8, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("geo_fallback_document", getViewModel().r());
        p pVar = p.f3034a;
        getParentFragmentManager().f0("geo_request_fallback", bundle);
    }

    public final ViewGroup n() {
        return (ViewGroup) this.content.a(this, f14393q[0]);
    }

    public final ViewGroup o() {
        return (ViewGroup) this.formContainer.a(this, f14393q[7]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onStop() {
        k();
        super.onStop();
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.permissionLauncher = registerForActivityResult(new f.f(), new com.sumsub.sns.geo.presentation.d(this, 0));
        ImageView r8 = r();
        if (r8 != null) {
            com.sumsub.sns.core.presentation.helper.a.a(com.sumsub.sns.core.presentation.helper.a.f14273a, r8, null, null, 3, null);
        }
    }

    public final com.sumsub.sns.core.presentation.form.d p() {
        Fragment F10 = getChildFragmentManager().F(R$id.sns_form_placeholder);
        if (F10 instanceof com.sumsub.sns.core.presentation.form.d) {
            return (com.sumsub.sns.core.presentation.form.d) F10;
        }
        return null;
    }

    public final TextView q() {
        return (TextView) this.hint.a(this, f14393q[4]);
    }

    public final ImageView r() {
        return (ImageView) this.icon.a(this, f14393q[3]);
    }

    @SuppressLint({"MissingPermission"})
    public final void s() {
        this.screenInternal = Screen.GeolocationDetectionScreen;
        this.locationSent = false;
        A();
        Object systemService = requireActivity().getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        if (locationManager != null) {
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            if (lastKnownLocation == null) {
                lastKnownLocation = locationManager.getLastKnownLocation("network");
            }
            if (lastKnownLocation == null || SystemClock.elapsedRealtimeNanos() - lastKnownLocation.getElapsedRealtimeNanos() >= f14394u) {
                l();
                return;
            }
            com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "Using last known location: " + lastKnownLocation, null, 4, null);
            a(lastKnownLocation);
        }
    }

    public final Button t() {
        return (Button) this.primaryButton.a(this, f14393q[5]);
    }

    public final Button u() {
        return (Button) this.secondaryButton.a(this, f14393q[6]);
    }

    public final TextView v() {
        return (TextView) this.subtitle.a(this, f14393q[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.geo.presentation.c getViewModel() {
        return (com.sumsub.sns.internal.geo.presentation.c) this.viewModel.getValue();
    }

    public final void x() {
        getViewModel().b(false);
    }

    public final void y() {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "Requesting permissions", null, 4, null);
        AbstractC0704c<String[]> abstractC0704c = this.permissionLauncher;
        if (abstractC0704c != null) {
            abstractC0704c.a(getViewModel().s());
        }
    }

    public final void z() {
        this.screenInternal = Screen.GeolocationFormScreen;
        ViewGroup n10 = n();
        if (n10 != null) {
            n10.setVisibility(4);
        }
        com.sumsub.sns.core.presentation.b.finish$default(this, new q.b(false, 1, null), null, null, 6, null);
    }

    public static final void a(a aVar, Location location) {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "onLocationChanged: location=" + location, null, 4, null);
        aVar.a(location);
    }

    public static final void b(a aVar, Location location) {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "onLocationChanged: location=" + location, null, 4, null);
        aVar.a(location);
    }

    public static final void b(a aVar, View view) {
        aVar.m();
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.a
    public com.sumsub.sns.internal.core.presentation.form.b a() {
        return getViewModel();
    }

    public static final void a(a aVar, Map map) {
        aVar.handlePermissionResults(map);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(com.sumsub.sns.internal.geo.presentation.e state, Bundle savedInstanceState) {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "handleViewStateChange: " + state, null, 4, null);
        x();
        if (state instanceof e.c) {
            A();
            return;
        }
        if (state instanceof e.b) {
            a((e.b) state);
            return;
        }
        if (state instanceof e.f) {
            a((e.f) state);
            return;
        }
        if (state instanceof e.d) {
            a((e.d) state);
            return;
        }
        if (state instanceof e.C0265e) {
            s();
        } else if (state instanceof e.a) {
            z();
        } else if (state instanceof e.g) {
            a((e.g) state);
        }
    }

    public final void a(Location location) {
        com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "Send location: " + location, null, 4, null);
        if (this.locationSent) {
            return;
        }
        getViewModel().a(location);
        this.locationSent = true;
        k();
    }

    public final void a(e.b state) {
        this.screenInternal = Screen.GeolocationDetectionScreen;
        getAnalyticsDelegate().c();
        TextView title = getTitle();
        if (title != null) {
            title.setText(state.d());
        }
        TextView title2 = getTitle();
        if (title2 != null) {
            title2.setVisibility(0);
        }
        TextView v10 = v();
        if (v10 != null) {
            v10.setText(state.c());
        }
        TextView v11 = v();
        if (v11 != null) {
            v11.setVisibility(0);
        }
        ViewGroup o10 = o();
        if (o10 != null) {
            o10.setVisibility(8);
        }
        ImageView r8 = r();
        if (r8 != null) {
            r8.setVisibility(0);
        }
        ImageView r10 = r();
        SNSImageView sNSImageView = r10 instanceof SNSImageView ? (SNSImageView) r10 : null;
        if (sNSImageView != null) {
            SNSStepViewExtensionsKt.setSnsStepState(sNSImageView, SNSStepState.INIT);
        }
        ImageView r11 = r();
        if (r11 != null) {
            r11.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), state.f()));
        }
        TextView q10 = q();
        if (q10 != null) {
            q10.setText(state.e());
        }
        TextView q11 = q();
        if (q11 != null) {
            q11.setVisibility(0);
        }
        Button t3 = t();
        if (t3 != null) {
            t3.setText(state.a());
        }
        Button t10 = t();
        if (t10 != null) {
            t10.setVisibility(0);
        }
        Button t11 = t();
        if (t11 != null) {
            t11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 3));
        }
        Button u6 = u();
        if (u6 != null) {
            u6.setText(state.b());
        }
        Button u10 = u();
        if (u10 != null) {
            u10.setVisibility(0);
        }
        Button u11 = u();
        if (u11 != null) {
            u11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 4));
        }
    }

    public static final void a(a aVar, View view) {
        LocationManager locationManager = (LocationManager) C0913a.getSystemService(aVar.requireContext(), LocationManager.class);
        boolean z10 = true;
        if (locationManager != null) {
            int i = C1146a.f26144a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = C1146a.C0463a.a(locationManager);
            } else if (!locationManager.isProviderEnabled("network") && !locationManager.isProviderEnabled("gps")) {
                z10 = false;
            }
        }
        aVar.getAnalyticsDelegate().b(aVar.getScreen(), aVar.getIdDocSetType(), Control.StartButton, com.google.android.gms.measurement.internal.a.n("IS_LOCATION_ENABLED", String.valueOf(z10)));
        if (z10) {
            aVar.y();
        } else {
            com.sumsub.sns.internal.geo.a.a(com.sumsub.sns.internal.geo.a.f17365a, "SumSubGeo", "Asking the user to enable location in settings", null, 4, null);
            aVar.getViewModel().t();
        }
    }

    public final void a(e.f state) {
        this.screenInternal = Screen.GeolocationDetectionScreen;
        TextView title = getTitle();
        if (title != null) {
            title.setText(state.d());
        }
        TextView title2 = getTitle();
        if (title2 != null) {
            title2.setVisibility(0);
        }
        TextView v10 = v();
        if (v10 != null) {
            v10.setText(state.c());
        }
        TextView v11 = v();
        if (v11 != null) {
            v11.setVisibility(0);
        }
        ViewGroup o10 = o();
        if (o10 != null) {
            o10.setVisibility(8);
        }
        ImageView r8 = r();
        if (r8 != null) {
            r8.setVisibility(0);
        }
        ImageView r10 = r();
        SNSImageView sNSImageView = r10 instanceof SNSImageView ? (SNSImageView) r10 : null;
        if (sNSImageView != null) {
            SNSStepViewExtensionsKt.setSnsStepState(sNSImageView, SNSStepState.INIT);
        }
        ImageView r11 = r();
        if (r11 != null) {
            r11.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), state.f()));
        }
        TextView q10 = q();
        if (q10 != null) {
            q10.setText(state.e());
        }
        TextView q11 = q();
        if (q11 != null) {
            q11.setVisibility(0);
        }
        Button t3 = t();
        if (t3 != null) {
            t3.setText(state.a());
        }
        Button t10 = t();
        if (t10 != null) {
            t10.setVisibility(0);
        }
        Button t11 = t();
        if (t11 != null) {
            t11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 0));
        }
        Button u6 = u();
        if (u6 != null) {
            u6.setText(state.b());
        }
        Button u10 = u();
        if (u10 != null) {
            u10.setVisibility(0);
        }
        Button u11 = u();
        if (u11 != null) {
            u11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 1));
        }
    }

    public final void a(a.n event) {
        com.sumsub.sns.internal.core.android.c.f15027a.a(requireActivity(), event.f(), event.h(), event.g(), new c(), new d(event)).show();
    }

    public final void a(e.d state) {
        this.screenInternal = Screen.GeolocationFormScreen;
        getAnalyticsDelegate().e();
        TextView title = getTitle();
        if (title != null) {
            title.setVisibility(8);
        }
        TextView v10 = v();
        if (v10 != null) {
            v10.setVisibility(8);
        }
        ImageView r8 = r();
        if (r8 != null) {
            r8.setVisibility(8);
        }
        TextView q10 = q();
        if (q10 != null) {
            q10.setVisibility(8);
        }
        Button u6 = u();
        if (u6 != null) {
            u6.setVisibility(8);
        }
        ViewGroup o10 = o();
        if (o10 != null) {
            o10.setVisibility(0);
        }
        if (p() == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C0527a c0527a = new C0527a(childFragmentManager);
            c0527a.e(R$id.sns_form_placeholder, com.sumsub.sns.core.presentation.form.d.INSTANCE.a("SumSubGeo"), null);
            c0527a.j();
        }
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            com.sumsub.sns.internal.core.common.i.g(currentFocus);
        }
        Button t3 = t();
        if (t3 != null) {
            t3.setText(state.a());
        }
        Button t10 = t();
        if (t10 != null) {
            t10.setVisibility(0);
        }
        Button t11 = t();
        if (t11 != null) {
            t11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 2));
        }
    }

    public final void a(e.g state) {
        this.screenInternal = Screen.GeolocationUnknownScreen;
        getAnalyticsDelegate().c();
        TextView title = getTitle();
        if (title != null) {
            title.setText(state.d());
        }
        TextView title2 = getTitle();
        if (title2 != null) {
            title2.setVisibility(0);
        }
        TextView v10 = v();
        if (v10 != null) {
            v10.setText(state.c());
        }
        TextView v11 = v();
        if (v11 != null) {
            v11.setVisibility(0);
        }
        ViewGroup o10 = o();
        if (o10 != null) {
            o10.setVisibility(8);
        }
        ImageView r8 = r();
        if (r8 != null) {
            r8.setVisibility(0);
        }
        ImageView r10 = r();
        SNSImageView sNSImageView = r10 instanceof SNSImageView ? (SNSImageView) r10 : null;
        if (sNSImageView != null) {
            SNSStepViewExtensionsKt.setSnsStepState(sNSImageView, SNSStepState.INIT);
        }
        ImageView r11 = r();
        if (r11 != null) {
            r11.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), state.e()));
        }
        TextView q10 = q();
        if (q10 != null) {
            q10.setVisibility(8);
        }
        Button t3 = t();
        if (t3 != null) {
            t3.setText(state.a());
        }
        Button t10 = t();
        if (t10 != null) {
            t10.setVisibility(0);
        }
        Button t11 = t();
        if (t11 != null) {
            t11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 5));
        }
        Button u6 = u();
        if (u6 != null) {
            u6.setText(state.b());
        }
        Button u10 = u();
        if (u10 != null) {
            u10.setVisibility(0);
        }
        Button u11 = u();
        if (u11 != null) {
            u11.setOnClickListener(new com.sumsub.sns.geo.presentation.b(this, 6));
        }
    }
}
