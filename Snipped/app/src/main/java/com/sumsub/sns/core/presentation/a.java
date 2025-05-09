package com.sumsub.sns.core.presentation;

import O9.f;
import O9.p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import ca.InterfaceC0635a;
import ca.InterfaceC0650p;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.presentation.base.a.l;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.common.b0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.videoident.service.SNSVideoChatService;
import h.ActivityC0775b;
import k0.C0913a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public abstract class a<S extends a.l, VM extends com.sumsub.sns.core.presentation.base.a<S>> extends ActivityC0775b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f14021b;

    /* renamed from: a, reason: collision with root package name */
    public final f f14020a = kotlin.a.a(new e(this));

    /* renamed from: c, reason: collision with root package name */
    public final C0153a f14022c = new C0153a(this);

    /* renamed from: com.sumsub.sns.core.presentation.a$a, reason: collision with other inner class name */
    public static final class C0153a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<S, VM> f14023a;

        public C0153a(a<S, VM> aVar) {
            this.f14023a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (kotlin.jvm.internal.f.b(intent != null ? intent.getAction() : null, "com.sumsub.sns.intent.ACTION_CLOSE")) {
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), "ACTION_CLOSE received. Finishing...", null, 4, null);
                this.f14023a.j();
            }
        }
    }

    public /* synthetic */ class b extends AdaptedFunctionReference implements InterfaceC0650p<a.j, T9.a<? super p>, Object> {
        public b(Object obj) {
            super(2, obj, a.class, "handleEvent", "handleEvent(Lcom/sumsub/sns/core/presentation/base/SNSViewModel$SNSViewModelEvent;)V", 4);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.j jVar, T9.a<? super p> aVar) {
            return a.b((a) this.receiver, jVar, aVar);
        }
    }

    @V9.d(c = "com.sumsub.sns.core.presentation.BaseActivity$onCreate$4", f = "BaseActivity.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements InterfaceC0650p<a.k, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14024a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14025b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<S, VM> f14026c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f14027d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Bundle f14028e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<S, VM> aVar, TextView textView, Bundle bundle, T9.a<? super c> aVar2) {
            super(2, aVar2);
            this.f14026c = aVar;
            this.f14027d = textView;
            this.f14028e = bundle;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.k kVar, T9.a<? super p> aVar) {
            return ((c) create(kVar, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            c cVar = new c(this.f14026c, this.f14027d, this.f14028e, aVar);
            cVar.f14025b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f14024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            a.k kVar = (a.k) this.f14025b;
            this.f14026c.b(kVar.g());
            TextView e10 = this.f14026c.e();
            if (e10 != null) {
                i.a(e10, kVar.h());
            }
            TextView textView = this.f14027d;
            if (textView != null) {
                i.a(textView, kVar.i());
            }
            if (this.f14026c.i() != kVar.j()) {
                this.f14026c.f14021b = kVar.j();
                this.f14026c.a(this.f14028e);
            }
            return p.f3034a;
        }
    }

    public /* synthetic */ class d extends AdaptedFunctionReference implements InterfaceC0650p<S, T9.a<? super p>, Object> {
        public d(Object obj) {
            super(2, obj, a.class, "handleState", "handleState(Lcom/sumsub/sns/core/presentation/base/SNSViewModel$SNSViewModelState;)V", 4);
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S s10, T9.a<? super p> aVar) {
            return a.b((a) this.receiver, s10, aVar);
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<com.sumsub.sns.internal.core.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<S, VM> f14029a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a<S, VM> aVar) {
            super(0);
            this.f14029a = aVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.sumsub.sns.internal.core.a invoke() {
            return com.sumsub.sns.internal.core.a.f14918z.a(this.f14029a.getApplicationContext(), this.f14029a.g());
        }
    }

    public static final /* synthetic */ Object b(a aVar, a.j jVar, T9.a aVar2) {
        aVar.a(jVar);
        return p.f3034a;
    }

    public void a(Bundle bundle) {
    }

    public abstract int d();

    public TextView e() {
        return (TextView) findViewById(R$id.sns_powered);
    }

    public final com.sumsub.sns.internal.core.a f() {
        return (com.sumsub.sns.internal.core.a) this.f14020a.getValue();
    }

    public final SNSSession g() {
        return (SNSSession) getIntent().getParcelableExtra(SNSVideoChatService.SNS_EXTRA_SESSION);
    }

    public abstract VM h();

    public final boolean i() {
        return this.f14021b;
    }

    public abstract void j();

    @Override // androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), getClass().getSimpleName().concat(".onCreate"), null, 4, null);
        }
        if (bundle != null && bundle.containsKey(SNSVideoChatService.SNS_EXTRA_SESSION)) {
            Parcelable parcelable = bundle.getParcelable(SNSVideoChatService.SNS_EXTRA_SESSION);
            SNSSession sNSSession = parcelable instanceof SNSSession ? (SNSSession) parcelable : null;
            if (sNSSession != null) {
                getIntent().putExtra(SNSVideoChatService.SNS_EXTRA_SESSION, sNSSession);
            }
        }
        f().F().a(g().getSessionId());
        Integer theme = f().E().getTheme();
        setTheme(theme != null ? theme.intValue() : R$style.Theme_SNSCore);
        super.onCreate(bundle);
        setContentView(d());
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a10 = aVar.a();
        if (a10 != null) {
            Integer a11 = aVar.a(a10, SNSColorElement.STATUS_BAR_COLOR, i.a(getResources().getConfiguration()));
            if (a11 != null) {
                int intValue = a11.intValue();
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(intValue);
            }
        }
        TextView textView = (TextView) findViewById(R$id.sns_progress_text);
        b0.a(h().g(), this, new b(this));
        b0.b(h().i(), this, new c(this, textView, bundle, null));
        b0.b(FlowKt.filterNotNull(h().j()), this, new d(this));
    }

    @Override // h.ActivityC0775b, androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onDestroy() {
        if (e0.f15081a.isDebug()) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(this), getClass().getSimpleName().concat(".onDestroy"), null, 4, null);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onPause() {
        unregisterReceiver(this.f14022c);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onResume() {
        super.onResume();
        C0913a.registerReceiver(this, this.f14022c, new IntentFilter("com.sumsub.sns.intent.ACTION_CLOSE"), 4);
    }

    @Override // androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(SNSVideoChatService.SNS_EXTRA_SESSION, f().E());
    }

    public static final /* synthetic */ Object b(a aVar, a.l lVar, T9.a aVar2) {
        aVar.a((a) lVar);
        return p.f3034a;
    }

    public void a(S s10) {
    }

    public void a(o oVar, String str, CharSequence charSequence) {
    }

    public void b(boolean z10) {
        TextView textView = (TextView) findViewById(R$id.sns_powered);
        if (textView != null) {
            i.a(textView, z10);
        }
    }

    public void a(a.j jVar) {
        if (jVar instanceof a.d) {
            a.d dVar = (a.d) jVar;
            a(dVar.e(), dVar.f(), dVar.d());
        }
    }
}
