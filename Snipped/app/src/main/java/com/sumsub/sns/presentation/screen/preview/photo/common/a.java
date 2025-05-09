package com.sumsub.sns.presentation.screen.preview.photo.common;

import R0.a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.presentation.screen.preview.photo.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/sumsub/sns/presentation/screen/preview/photo/common/a;", "Lcom/sumsub/sns/presentation/screen/preview/photo/f;", "Lcom/sumsub/sns/internal/presentation/screen/preview/photo/common/a;", "<init>", "()V", "LO9/p;", "y", "LO9/f;", "A", "()Lcom/sumsub/sns/internal/presentation/screen/preview/photo/common/a;", "viewModel", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "z", "a", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends f<com.sumsub.sns.internal.presentation.screen.preview.photo.common.a> {

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: com.sumsub.sns.presentation.screen.preview.photo.common.a$a, reason: collision with other inner class name and from kotlin metadata */
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
        public final /* synthetic */ Fragment f20031a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f20031a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f20031a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f20032a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f20032a.invoke();
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f20033a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(O9.f fVar) {
            super(0);
            this.f20033a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f20033a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f20034a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f20035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f20034a = interfaceC0635a;
            this.f20035b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f20034a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f20035b.getValue();
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
            return new com.sumsub.sns.internal.presentation.screen.preview.photo.common.b(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    public a() {
        g gVar = new g();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new c(new b(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.screen.preview.photo.common.a.class), new d(b9), gVar, new e(null, b9));
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.screen.preview.photo.common.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.screen.preview.photo.common.a) this.viewModel.getValue();
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

    @Override // com.sumsub.sns.presentation.screen.preview.photo.f
    public void y() {
        com.sumsub.sns.core.presentation.b.finish$default(this, null, null, null, 7, null);
    }
}
