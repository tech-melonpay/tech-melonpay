package com.sumsub.sns.presentation.screen;

import O9.p;
import android.content.Intent;
import android.net.Uri;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C0527a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.p;
import androidx.fragment.app.s;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSProgressView;
import com.sumsub.sns.internal.core.common.NetworkManager;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.l0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.t0;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.core.data.model.o;
import com.sumsub.sns.internal.core.presentation.screen.imageviewer.a;
import com.sumsub.sns.internal.core.presentation.screen.verification.ValidationIdentifierType;
import com.sumsub.sns.presentation.screen.b;
import com.sumsub.sns.presentation.screen.d;
import com.sumsub.sns.presentation.screen.questionnary.SNSQuestionnaireFragment;
import com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import t0.C1275b;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 z2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u000fB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u000f\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0007J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0007J\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0007J!\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\b\u0010\u0016\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u00101J+\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u00102\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b\u000f\u00105J\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u00106\u001a\u00020'H\u0014¢\u0006\u0004\b6\u00107J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000208H\u0014¢\u0006\u0004\b\u000f\u00109J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b\u000f\u0010<J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b\u000f\u0010?J\u000f\u0010@\u001a\u00020\u000eH\u0014¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010A\u001a\u00020\u000eH\u0014¢\u0006\u0004\bA\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\b\u000f\u0010DJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010$J\u000f\u0010F\u001a\u00020\u000eH\u0014¢\u0006\u0004\bF\u0010\u0007J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\b\u000f\u0010KJ\u000f\u0010L\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010\u0007J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\f2\u0006\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010NJ\u0019\u0010Q\u001a\u00020\u000e2\b\u0010P\u001a\u0004\u0018\u00010OH\u0014¢\u0006\u0004\bQ\u0010RJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u000e0SH\u0016¢\u0006\u0004\b\u000f\u0010VJ\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0007J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010!J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020'2\u0006\u00102\u001a\u00020\f2\b\u0010M\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010ZJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020[2\b\u0010^\u001a\u0004\u0018\u00010]H\u0016¢\u0006\u0004\b\u000f\u0010_J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010aJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0007R\u001b\u0010e\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u0010b\u001a\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001e\u0010u\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006{"}, d2 = {"Lcom/sumsub/sns/presentation/screen/SNSAppActivity;", "Lcom/sumsub/sns/core/presentation/a;", "Lcom/sumsub/sns/presentation/screen/d$d;", "Lcom/sumsub/sns/presentation/screen/d;", "Lcom/sumsub/sns/internal/core/common/k0;", "Lcom/sumsub/sns/internal/core/common/l0;", "<init>", "()V", "Lcom/sumsub/sns/internal/core/presentation/intro/f;", "stepInfo", "", "cancelOnBackPressed", "", "countryCode", "LO9/p;", "a", "(Lcom/sumsub/sns/internal/core/presentation/intro/f;ZLjava/lang/String;)V", "Lcom/sumsub/sns/internal/core/data/model/o;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "c", "(Lcom/sumsub/sns/internal/core/data/model/o;)V", "Lcom/sumsub/sns/presentation/screen/b$d;", "event", "(Lcom/sumsub/sns/presentation/screen/b$d;)V", "q", "r", "Landroidx/fragment/app/Fragment;", "fragment", "tag", "allowStateLoss", "addToBackStack", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZZ)V", "b", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "p", "isCancelled", "(Z)V", "k", "l", "", "keyCode", "Landroid/view/KeyEvent;", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "state", "(Lcom/sumsub/sns/presentation/screen/d$d;)V", "idDocSetType", "", "buttonText", "(Lcom/sumsub/sns/internal/core/data/model/o;Ljava/lang/String;Ljava/lang/CharSequence;)V", "d", "()I", "Lcom/sumsub/sns/core/presentation/base/a$j;", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "Lcom/sumsub/sns/internal/core/data/model/DocumentType;", "documentType", "(Lcom/sumsub/sns/internal/core/data/model/DocumentType;)V", "Lcom/sumsub/sns/internal/core/data/model/s;", "mrtd", "(Lcom/sumsub/sns/internal/core/data/model/s;)V", "onResume", "onPause", "Lcom/sumsub/sns/internal/core/data/model/Document;", "document", "(Lcom/sumsub/sns/internal/core/data/model/Document;)V", "show", "j", "Lcom/sumsub/sns/internal/core/common/q;", "reason", "", "delay", "(Lcom/sumsub/sns/internal/core/common/q;Ljava/lang/Long;)V", "onBackPressed", "requestKey", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function1;", "Landroid/nfc/tech/IsoDep;", "callback", "(Lca/l;)V", "Ljava/io/File;", "file", "rotation", "(Ljava/io/File;ILjava/lang/String;Ljava/lang/String;)V", "Lcom/sumsub/sns/internal/core/domain/model/c;", "introParams", "Landroid/os/Parcelable;", "payload", "(Lcom/sumsub/sns/internal/core/domain/model/c;Landroid/os/Parcelable;)V", ImagesContract.URL, "(Ljava/lang/String;)V", "LO9/f;", "o", "()Lcom/sumsub/sns/presentation/screen/d;", "viewModel", "Lcom/sumsub/sns/core/widget/SNSProgressView;", "e", "Lcom/sumsub/sns/core/widget/SNSProgressView;", "vgProgress", "Lcom/sumsub/sns/internal/nfc/d;", "f", "Lcom/sumsub/sns/internal/nfc/d;", "nfcManager", "Lcom/sumsub/sns/internal/core/common/NetworkManager;", "g", "Lcom/sumsub/sns/internal/core/common/NetworkManager;", "networkManager", "Lcom/sumsub/sns/core/presentation/b;", "m", "()Lcom/sumsub/sns/core/presentation/b;", "currentFragment", "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "n", "()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "currentFragmentCompletionResult", "h", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSAppActivity extends com.sumsub.sns.core.presentation.a<d.C0372d, com.sumsub.sns.presentation.screen.d> implements k0, l0 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public SNSProgressView vgProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.presentation.screen.d.class), new d(this), new g(), new e(null, this));

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.sumsub.sns.internal.nfc.d nfcManager = new com.sumsub.sns.internal.nfc.d();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final NetworkManager networkManager = new NetworkManager();

    /* renamed from: com.sumsub.sns.presentation.screen.SNSAppActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @V9.d(c = "com.sumsub.sns.presentation.screen.SNSAppActivity$showFragment$1", f = "SNSAppActivity.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements InterfaceC0650p<CoroutineScope, T9.a<? super p>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f19679a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19681c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f19682d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Fragment fragment, T9.a<? super b> aVar) {
            super(2, aVar);
            this.f19681c = str;
            this.f19682d = fragment;
        }

        @Override // ca.InterfaceC0650p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, T9.a<? super p> aVar) {
            return ((b) create(coroutineScope, aVar)).invokeSuspend(p.f3034a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final T9.a<p> create(Object obj, T9.a<?> aVar) {
            return SNSAppActivity.this.new b(this.f19681c, this.f19682d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23158a;
            if (this.f19679a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            try {
                FragmentManager supportFragmentManager = SNSAppActivity.this.getSupportFragmentManager();
                supportFragmentManager.B(true);
                supportFragmentManager.H();
            } catch (IllegalStateException e10) {
                com.sumsub.sns.core.c.a(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", androidx.camera.core.impl.utils.a.n(new StringBuilder("Fragment with tag = "), this.f19681c, " is already added"), null, 4, null);
                if (e0.f15081a.isDebug()) {
                    throw e10;
                }
            }
            Fragment G8 = SNSAppActivity.this.getSupportFragmentManager().G(this.f19681c);
            if (G8 != null && G8.isAdded()) {
                com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", androidx.camera.core.impl.utils.a.n(new StringBuilder("Fragment with tag = "), this.f19681c, " is already added"), null, 4, null);
                return p.f3034a;
            }
            FragmentManager supportFragmentManager2 = SNSAppActivity.this.getSupportFragmentManager();
            Fragment fragment = this.f19682d;
            String str = this.f19681c;
            supportFragmentManager2.getClass();
            C0527a c0527a = new C0527a(supportFragmentManager2);
            c0527a.d(R$id.sns_container, fragment, str, 1);
            c0527a.c(str);
            c0527a.h();
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f19683a = componentActivity;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return this.f19683a.getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19684a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, ComponentActivity componentActivity) {
            super(0);
            this.f19684a = interfaceC0635a;
            this.f19685b = componentActivity;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19684a;
            return (interfaceC0635a == null || (aVar = (R0.a) interfaceC0635a.invoke()) == null) ? this.f19685b.getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class f extends Lambda implements InterfaceC0646l<NetworkManager.NetworkType, p> {
        public f() {
            super(1);
        }

        public final void a(NetworkManager.NetworkType networkType) {
            SNSAppActivity.this.h().c(networkType.getType());
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(NetworkManager.NetworkType networkType) {
            a(networkType);
            return p.f3034a;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<T> {
        public g() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            SNSAppActivity sNSAppActivity = SNSAppActivity.this;
            return new com.sumsub.sns.presentation.screen.e(sNSAppActivity, sNSAppActivity.f(), null, 4, null);
        }
    }

    public static final void b(SNSAppActivity sNSAppActivity, String str, Bundle bundle) {
        if (!com.sumsub.sns.core.presentation.b.INSTANCE.b(bundle)) {
            sNSAppActivity.h().c(false);
            return;
        }
        if (sNSAppActivity.m() instanceof com.sumsub.sns.presentation.screen.intro.a) {
            FragmentManager supportFragmentManager = sNSAppActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            supportFragmentManager.z(supportFragmentManager.new p(null, -1, 0), false);
        }
        sNSAppActivity.h().c(true);
    }

    public final void c(o error) {
        for (Fragment fragment : getSupportFragmentManager().f6735c.f()) {
            com.sumsub.sns.core.presentation.b bVar = fragment instanceof com.sumsub.sns.core.presentation.b ? (com.sumsub.sns.core.presentation.b) fragment : null;
            if (bVar != null) {
                bVar.onHandleError(error);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.a
    public int d() {
        return R$layout.sns_activity_app;
    }

    @Override // com.sumsub.sns.core.presentation.a
    public void j() {
        h().a(n(), true);
    }

    public final void k() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.f6736d.size() + (supportFragmentManager.f6740h != null ? 1 : 0) == 1) {
            h().a(true, false);
        }
    }

    public final void l() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.z(supportFragmentManager.new p(null, -1, 1), false);
    }

    public final com.sumsub.sns.core.presentation.b<?, ?> m() {
        Fragment F10 = getSupportFragmentManager().F(R$id.sns_container);
        if (F10 instanceof com.sumsub.sns.core.presentation.b) {
            return (com.sumsub.sns.core.presentation.b) F10;
        }
        return null;
    }

    public final SNSCompletionResult n() {
        SNSCompletionResult onCancelResult;
        com.sumsub.sns.core.presentation.b<?, ?> m2 = m();
        return (m2 == null || (onCancelResult = m2.onCancelResult()) == null) ? new SNSCompletionResult.SuccessTermination(null, 1, null) : onCancelResult;
    }

    @Override // com.sumsub.sns.core.presentation.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.presentation.screen.d h() {
        return (com.sumsub.sns.presentation.screen.d) this.viewModel.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppActivity", "onBackPressed()", null, 4, null);
        com.sumsub.sns.core.presentation.b<?, ?> m2 = m();
        if (m2 == null) {
            h().a(n(), false);
        } else if (m2.onFinishCalled(q.c.f15162b)) {
            k();
            a(false);
            super.onBackPressed();
        }
    }

    @Override // com.sumsub.sns.core.presentation.a, androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", SNSMobileSDK.INSTANCE.toString(), null, 4, null);
        this.vgProgress = (SNSProgressView) findViewById(R$id.sns_progress);
        final int i = 0;
        getSupportFragmentManager().g0("geo_request_fallback", this, new s(this) { // from class: com.sumsub.sns.presentation.screen.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSAppActivity f19714b;

            {
                this.f19714b = this;
            }

            @Override // androidx.fragment.app.s
            public final void b(String str, Bundle bundle) {
                switch (i) {
                    case 0:
                        SNSAppActivity.a(this.f19714b, str, bundle);
                        break;
                    default:
                        SNSAppActivity.b(this.f19714b, str, bundle);
                        break;
                }
            }
        });
        final int i9 = 1;
        getSupportFragmentManager().g0("instructions_request_key_internal", this, new s(this) { // from class: com.sumsub.sns.presentation.screen.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSAppActivity f19714b;

            {
                this.f19714b = this;
            }

            @Override // androidx.fragment.app.s
            public final void b(String str, Bundle bundle) {
                switch (i9) {
                    case 0:
                        SNSAppActivity.a(this.f19714b, str, bundle);
                        break;
                    default:
                        SNSAppActivity.b(this.f19714b, str, bundle);
                        break;
                }
            }
        });
    }

    @Override // h.ActivityC0775b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Boolean onKeyDown;
        X m2 = m();
        t0 t0Var = m2 instanceof t0 ? (t0) m2 : null;
        return (t0Var == null || (onKeyDown = t0Var.onKeyDown(keyCode, event)) == null) ? super.onKeyDown(keyCode, event) : onKeyDown.booleanValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "onNewIntent = " + intent, null, 4, null);
        super.onNewIntent(intent);
        this.nfcManager.a(intent);
    }

    @Override // com.sumsub.sns.core.presentation.a, androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onPause() {
        super.onPause();
        r();
    }

    @Override // com.sumsub.sns.core.presentation.a, androidx.fragment.app.ActivityC0533g, android.app.Activity
    public void onResume() {
        super.onResume();
        q();
    }

    public final void p() {
        l();
        com.sumsub.sns.presentation.screen.d.a(h(), false, 1, (Object) null);
    }

    public final void q() {
        this.networkManager.a(getApplicationContext(), new f());
    }

    public final void r() {
        this.networkManager.c();
    }

    @Override // com.sumsub.sns.core.presentation.a
    public void a(d.C0372d state) {
        SNSProgressView sNSProgressView;
        if (state.j() && (sNSProgressView = this.vgProgress) != null) {
            sNSProgressView.setText(state.h());
        }
        if (state.f()) {
            SNSProgressView sNSProgressView2 = this.vgProgress;
            if (sNSProgressView2 == null) {
                return;
            }
            sNSProgressView2.setText(state.g());
            return;
        }
        if (state.i() != null) {
            if (state.i().booleanValue()) {
                SNSProgressView sNSProgressView3 = this.vgProgress;
                if (sNSProgressView3 != null) {
                    i.e(sNSProgressView3);
                    return;
                }
                return;
            }
            SNSProgressView sNSProgressView4 = this.vgProgress;
            if (sNSProgressView4 != null) {
                sNSProgressView4.setText(state.h());
            }
            SNSProgressView sNSProgressView5 = this.vgProgress;
            if (sNSProgressView5 != null) {
                i.c(sNSProgressView5);
            }
        }
    }

    public final void b(Fragment fragment, String tag) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", s3.b.j("ShowFragment, tag = ", tag), null, 4, null);
        a(false);
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), Dispatchers.getMain().getImmediate(), null, new b(tag, fragment, null), 2, null);
    }

    public final void c(boolean isCancelled) {
        h().r();
        l();
        com.sumsub.sns.presentation.screen.d.a(h(), isCancelled, false, 2, (Object) null);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void c() {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Stop listening NFC", null, 4, null);
        this.nfcManager.a();
    }

    public final void a(com.sumsub.sns.internal.core.presentation.intro.f stepInfo, boolean cancelOnBackPressed, String countryCode) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "showInstructions: " + stepInfo, null, 4, null);
        a(this, com.sumsub.sns.presentation.screen.intro.a.INSTANCE.a(stepInfo.c(), stepInfo.b(), stepInfo.a(), cancelOnBackPressed, countryCode).forResult("instructions_request_key_internal"), "SNSIntroScreenFragment", false, false, 12, null);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void b(o error) {
        for (Fragment fragment : getSupportFragmentManager().f6735c.f()) {
            com.sumsub.sns.core.presentation.b bVar = fragment instanceof com.sumsub.sns.core.presentation.b ? (com.sumsub.sns.core.presentation.b) fragment : null;
            if (bVar != null) {
                bVar.onErrorCancelled(error);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.a
    public void a(o error, String idDocSetType, CharSequence buttonText) {
        c();
        if (error != null) {
            if (error instanceof o.f) {
                com.sumsub.sns.presentation.screen.error.a.INSTANCE.a(((o.f) error).d(), buttonText).show(getSupportFragmentManager(), "SNSErrorDialog");
            } else {
                b(com.sumsub.sns.presentation.screen.error.b.INSTANCE.a(error, idDocSetType), "ErrorFragment");
            }
        }
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void b() {
        h().a((SNSCompletionResult) new SNSCompletionResult.SuccessTermination(null, 1, null), false);
    }

    public final void a(b.d event) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Navigate to: " + event, null, 4, null);
        if (event instanceof b.d.o) {
            a(this, SNSVideoIdentFragment.INSTANCE.create(((b.d.o) event).e()), SNSVideoIdentFragment.TAG, false, false, 12, null);
            return;
        }
        if (event instanceof b.d.i) {
            a(this, com.sumsub.sns.presentation.screen.preview.photo.identity.a.INSTANCE.a(((b.d.i) event).e()), "SNSPreviewIdentityDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.l) {
            a(this, com.sumsub.sns.presentation.screen.preview.selfie.a.INSTANCE.a(((b.d.l) event).e()), "PreviewSelfieFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.C0369b) {
            a(this, com.sumsub.sns.presentation.screen.preview.applicantdata.a.INSTANCE.a(((b.d.C0369b) event).e()), "SNSApplicantDataDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.k) {
            a(this, com.sumsub.sns.presentation.screen.preview.photo.common.a.INSTANCE.a(((b.d.k) event).e()), "SNSPreviewCommonDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.j) {
            a(this, com.sumsub.sns.presentation.screen.preview.photo.common.a.INSTANCE.a(((b.d.j) event).e()), "SNSPreviewCommonDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.m) {
            a(this, com.sumsub.sns.presentation.screen.preview.photo.common.a.INSTANCE.a(((b.d.m) event).e()), "SNSPreviewCommonDocumentFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.g) {
            a(this, com.sumsub.sns.geo.presentation.a.INSTANCE.a(((b.d.g) event).e()), "SNSGeoFragment", false, false, 12, null);
            return;
        }
        if (event instanceof b.d.C0370d) {
            a(this, com.sumsub.sns.core.presentation.screen.verification.a.INSTANCE.a(ValidationIdentifierType.EMAIL), "SNSVerificationStepFragment", true, false, 8, null);
            return;
        }
        if (event instanceof b.d.e) {
            a(this, com.sumsub.sns.core.presentation.screen.verification.a.INSTANCE.a(ValidationIdentifierType.PHONE), "SNSVerificationStepFragment", true, false, 8, null);
            return;
        }
        if (event instanceof b.d.n) {
            a(this, SNSQuestionnaireFragment.Companion.newInstance$default(SNSQuestionnaireFragment.INSTANCE, ((b.d.n) event).e().getType().c(), null, null, null, 14, null), "SNSQuestionnaireFragment", true, false, 8, null);
            return;
        }
        if (event instanceof b.d.c) {
            if (getSupportFragmentManager().G("SNSApplicantStatusFragment") != null) {
                l();
                return;
            } else {
                a(this, com.sumsub.sns.presentation.screen.verification.a.INSTANCE.a(), "SNSApplicantStatusFragment", false, false, 4, null);
                return;
            }
        }
        if (event instanceof b.d.h) {
            a(this, SNSLiveness3dFaceFragment.INSTANCE.newInstance(((b.d.h) event).e().getType()), null, false, false, 14, null);
        } else if (event instanceof b.d.f) {
            a(this, com.sumsub.sns.presentation.screen.preview.ekyc.a.INSTANCE.a(((b.d.f) event).e()), "SNSEkycFragment", false, false, 12, null);
        } else if (event instanceof b.d.a) {
            a(this, com.sumsub.sns.presentation.consent.a.INSTANCE.a(), "SNSConsentFragment", false, false, 12, null);
        }
    }

    public static /* synthetic */ void a(SNSAppActivity sNSAppActivity, Fragment fragment, String str, boolean z10, boolean z11, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z10 = false;
        }
        if ((i & 8) != 0) {
            z11 = true;
        }
        sNSAppActivity.a(fragment, str, z10, z11);
    }

    public final void a(Fragment fragment, String tag, boolean allowStateLoss, boolean addToBackStack) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", s3.b.j("ReplaceFragment, tag = ", tag), null, 4, null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0527a c0527a = new C0527a(supportFragmentManager);
        c0527a.e(R$id.sns_container, fragment, tag);
        if (addToBackStack) {
            c0527a.c(tag);
        }
        if (allowStateLoss) {
            c0527a.i(true, true);
        } else {
            c0527a.h();
        }
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a() {
        h().e(true);
    }

    @Override // com.sumsub.sns.core.presentation.a
    public void a(a.j event) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "event: " + event, null, 4, null);
        super.a(event);
        if (event instanceof b.d) {
            a((b.d) event);
            return;
        }
        if (event instanceof b.c) {
            c(((b.c) event).b());
            return;
        }
        if (event instanceof b.C0367b) {
            f().b();
            finish();
            return;
        }
        if (event instanceof b.e) {
            b.e eVar = (b.e) event;
            a(eVar.f(), eVar.d(), eVar.e());
            return;
        }
        if (event instanceof a.e) {
            l0.a(this, ((a.e) event).f(), null, 2, null);
            return;
        }
        if (event instanceof b.a) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Bundle bundle = new Bundle();
            b.a aVar = (b.a) event;
            bundle.putInt(com.sumsub.sns.core.presentation.b.FRAGMENT_RESULT_KEY, aVar.d() ? -1 : 0);
            bundle.putParcelable("payload", aVar.c());
            O9.p pVar = O9.p.f3034a;
            supportFragmentManager.f0("instructions_request_key", bundle);
        }
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(DocumentType documentType) {
        h().b(documentType);
        p();
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(com.sumsub.sns.internal.core.data.model.s mrtd) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "NFC is enabled. Show MRTD reading screen " + mrtd, null, 4, null);
        String k3 = mrtd.k();
        String i = mrtd.i();
        String n10 = mrtd.n();
        if (k3 == null || i == null || n10 == null) {
            return;
        }
        a(this, com.sumsub.sns.presentation.screen.preview.photo.mrtd.a.INSTANCE.a(mrtd.h(), mrtd.j().getType().c(), k3, i, n10, mrtd.m(), mrtd.l()), "SNSMRTDReadFragment", false, false, 12, null);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(Document document) {
        h().b(document);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(o error) {
        h().b(error);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(boolean show) {
        h().g(show);
    }

    @Override // com.sumsub.sns.internal.core.common.l0
    public void a(q reason, Long delay) {
        if (delay != null) {
            h().a(reason, delay.longValue());
            return;
        }
        if (reason instanceof q.c) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.f6736d.size() + (supportFragmentManager.f6740h == null ? 0 : 1) > 0) {
                k();
                a(false);
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.getClass();
                supportFragmentManager2.z(supportFragmentManager2.new p(null, -1, 0), false);
                return;
            }
            h().a(n(), false);
            return;
        }
        if (reason instanceof q.a) {
            c(true);
            return;
        }
        if (reason instanceof q.b) {
            if (((q.b) reason).b()) {
                p();
                return;
            } else {
                c(false);
                return;
            }
        }
        if (reason instanceof q.d) {
            com.sumsub.sns.presentation.screen.d h9 = h();
            SNSCompletionResult b9 = ((q.d) reason).b();
            if (b9 == null) {
                b9 = n();
            }
            h9.a(b9, false);
        }
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(String requestKey, String documentType) {
        a(this, com.sumsub.sns.camera.photo.presentation.a.INSTANCE.a(documentType).forResult(requestKey), "SNSDocumentSelectorFragment", false, false, 12, null);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(InterfaceC0646l<? super IsoDep, O9.p> callback) {
        com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "Start listening NFC", null, 4, null);
        this.nfcManager.a(this, callback);
    }

    @Override // com.sumsub.sns.internal.core.common.l0
    public void a(Fragment fragment, String tag) {
        a(this, fragment, tag, false, false, 12, null);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(File file, int rotation, String idDocSetType, String requestKey) {
        com.sumsub.sns.core.presentation.b<a.b, com.sumsub.sns.internal.core.presentation.screen.imageviewer.a> forResult = com.sumsub.sns.core.presentation.screen.imageviewer.a.INSTANCE.a(file, rotation, idDocSetType).forResult(requestKey);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0527a c0527a = new C0527a(supportFragmentManager);
        c0527a.e(R$id.sns_container, forResult, "SNSImageViewerFragment");
        c0527a.c("SNSImageViewerFragment");
        c0527a.h();
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(com.sumsub.sns.internal.core.domain.model.c introParams, Parcelable payload) {
        getSupportFragmentManager().e("instructions_request_key");
        h().a(introParams, payload);
    }

    @Override // com.sumsub.sns.internal.core.common.k0
    public void a(String url) {
        try {
            SNSUrlHandler urlHandler = SNSMobileSDK.INSTANCE.getUrlHandler();
            if (urlHandler != null && urlHandler.onUrl(this, url)) {
                com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "handled by host application", null, 4, null);
            } else {
                com.sumsub.sns.core.c.b(com.sumsub.sns.core.c.f14016a, "SNSAppViewModel", "handle url using system default behaviour", null, 4, null);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        } catch (Exception e10) {
            com.sumsub.sns.core.c.f14016a.b("SNSAppViewModel", "Can't open deep link " + url, e10);
        }
    }

    public static final void a(SNSAppActivity sNSAppActivity, String str, Bundle bundle) {
        O9.p pVar;
        Document document = (Document) C1275b.a(bundle, Document.class, "geo_fallback_document");
        if (document != null) {
            a(sNSAppActivity, com.sumsub.sns.presentation.screen.preview.photo.common.a.INSTANCE.a(document), "SNSPreviewCommonDocumentFragment", false, false, 12, null);
            pVar = O9.p.f3034a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            sNSAppActivity.c(true);
        }
    }
}
