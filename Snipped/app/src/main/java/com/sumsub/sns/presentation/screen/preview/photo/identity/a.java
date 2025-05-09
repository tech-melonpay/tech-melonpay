package com.sumsub.sns.presentation.screen.preview.photo.identity;

import R0.a;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.internal.core.common.k0;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.presentation.screen.preview.photo.identity.SNSPreviewIdentityDocumentViewModel;
import com.sumsub.sns.presentation.screen.preview.photo.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u001b\u0010 \u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/photo/identity/a;", "Lcom/sumsub/sns/presentation/screen/preview/photo/f;", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/identity/SNSPreviewIdentityDocumentViewModel;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onCreate", "(Landroid/os/Bundle;)V", "", FirebaseAnalytics.Param.SUCCESS, "Landroid/os/Parcelable;", "payload", "a", "(ZLandroid/os/Parcelable;)V", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "y", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "", "Ljava/lang/String;", "idDocType", "z", "LO9/f;", "A", "()Lcom/sumsub/sns/internal/presentation/screen/preview/photo/identity/SNSPreviewIdentityDocumentViewModel;", "viewModel", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends f<SNSPreviewIdentityDocumentViewModel> {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public String idDocType;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.photo.identity.a$a, reason: collision with other inner class name and from kotlin metadata */
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

    public static final class b extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f20086a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f20086a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20086a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20087a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20087a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f20088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(O9.f fVar) {
            super(0);
            this.f20088a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20088a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20089a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20090b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20089a = interfaceC0635a;
            this.f20090b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20089a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20090b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<T> {
        public g() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.screen.preview.photo.identity.a(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    public a() {
        g gVar = new g();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(SNSPreviewIdentityDocumentViewModel.class), new d(b9), gVar, new e(null, b9));
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public SNSPreviewIdentityDocumentViewModel getViewModel() {
        return (SNSPreviewIdentityDocumentViewModel) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        DocumentType type;
        String c2;
        Bundle arguments = getArguments();
        Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
        Document document2 = document instanceof Document ? document : null;
        return (document2 == null || (type = document2.getType()) == null || (c2 = type.c()) == null) ? DocumentType.f15253j : c2;
    }

    @Override // com.sumsub.sns.presentation.screen.preview.photo.f, com.sumsub.sns.presentation.screen.preview.a, com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (!(event instanceof SNSPreviewIdentityDocumentViewModel.a)) {
            super.handleEvent(event);
            return;
        }
        k0 appListener = getAppListener();
        if (appListener != null) {
            appListener.a("pick_document", ((SNSPreviewIdentityDocumentViewModel.a) event).b());
        }
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getSupportFragmentManager().g0("pick_document", this, new com.sumsub.sns.geo.presentation.d(this, 7));
    }

    @Override // com.sumsub.sns.presentation.screen.preview.photo.f, com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        super.onFinishCalled(finishReason);
        if (!getViewModel().U()) {
            return true;
        }
        getViewModel().W();
        return false;
    }

    @Override // com.sumsub.sns.presentation.screen.preview.photo.f
    public void y() {
        getViewModel().V();
    }

    public static final void a(a aVar, String str, Bundle bundle) {
        if (!com.sumsub.sns.core.presentation.b.INSTANCE.b(bundle)) {
            com.sumsub.sns.core.presentation.b.finish$default(aVar, null, null, null, 7, null);
            return;
        }
        String string = bundle.getString("result_selected_country");
        String string2 = bundle.getString("result_selected_id_doc_type");
        com.sumsub.sns.internal.camera.photo.presentation.document.b bVar = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a;
        com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, com.sumsub.sns.internal.log.c.a(bVar), "Document selected: " + string + ' ' + string2, null, 4, null);
        if (string == null || string2 == null) {
            com.sumsub.sns.core.presentation.b.finish$default(aVar, null, null, null, 7, null);
        } else {
            aVar.idDocType = string2;
            aVar.getViewModel().b(string, string2);
        }
    }

    @Override // com.sumsub.sns.presentation.screen.preview.photo.f, com.sumsub.sns.presentation.screen.h
    public void a(boolean success, Parcelable payload) {
        if (!success && !getViewModel().U()) {
            com.sumsub.sns.internal.camera.photo.presentation.document.b bVar = com.sumsub.sns.internal.camera.photo.presentation.document.b.f14849a;
            com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, com.sumsub.sns.internal.log.c.a(bVar), "On instructions showed, is not success and viewModel.hasPhoto()==false", null, 4, null);
            if (!getViewModel().G() && !getViewModel().S()) {
                com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, com.sumsub.sns.internal.log.c.a(bVar), "On instructions showed, restart step", null, 4, null);
                getViewModel().X();
                return;
            } else {
                com.sumsub.sns.internal.camera.photo.presentation.document.b.b(bVar, com.sumsub.sns.internal.log.c.a(bVar), "On instructions showed, finish", null, 4, null);
                com.sumsub.sns.core.presentation.b.finish$default(this, null, null, null, 7, null);
                return;
            }
        }
        super.a(success, payload);
    }
}
