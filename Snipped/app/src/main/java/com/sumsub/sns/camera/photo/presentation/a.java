package com.sumsub.sns.camera.photo.presentation;

import O9.p;
import R0.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSDefaultCountryPickerKt;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.widget.SNSCountrySelectorView;
import com.sumsub.sns.core.widget.SNSSelectorItemView;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog;
import com.sumsub.sns.internal.camera.photo.presentation.a;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.q;
import ia.InterfaceC0840h;
import java.util.List;
import k1.H;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0011\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ'\u0010\u0011\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b\u0011\u0010#R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u001d\u00102\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001d\u00107\u001a\u0004\u0018\u0001038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010D\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020;8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010?¨\u0006M"}, d2 = {"Lcom/sumsub/sns/camera/photo/presentation/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/camera/photo/presentation/a$e;", "Lcom/sumsub/sns/internal/camera/photo/presentation/a;", "<init>", "()V", "", "getLayoutId", "()I", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "LO9/p;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "state", "a", "(Lcom/sumsub/sns/internal/camera/photo/presentation/a$e;Landroid/os/Bundle;)V", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "onDestroyView", "(Lcom/sumsub/sns/internal/camera/photo/presentation/a$e;)V", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;", "item", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker$CountryItem;)V", "country", "b", "Lcom/sumsub/sns/internal/camera/photo/presentation/a$f;", "viewText", "", "Lcom/sumsub/sns/internal/camera/photo/presentation/a$b;", "documents", "(Lcom/sumsub/sns/internal/camera/photo/presentation/a$f;Ljava/util/List;)V", "Landroid/widget/TextView;", "Lcom/sumsub/sns/internal/core/common/z;", "m", "()Landroid/widget/TextView;", "tvCountryTitle", "Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;", "l", "()Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;", "snsCountrySelector", "c", "o", "tvDocumentsTitle", "d", "n", "tvDocumentsEmpty", "Landroid/view/ViewGroup;", "e", "q", "()Landroid/view/ViewGroup;", "vgDocuments", "f", "p", "tvFooter", "", "g", "LO9/f;", "k", "()Ljava/lang/String;", "documentType", "h", "r", "()Lcom/sumsub/sns/internal/camera/photo/presentation/a;", "viewModel", "", "i", "Z", "isPickerShowing", "j", "Ljava/util/List;", "getIdDocSetType", "idDocSetType", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<a.e, com.sumsub.sns.internal.camera.photo.presentation.a> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f13863l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final z tvCountryTitle = a0.a(this, R$id.sns_country_title);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final z snsCountrySelector = a0.a(this, R$id.sns_country_selector);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z tvDocumentsTitle = a0.a(this, R$id.sns_documents_title);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z tvDocumentsEmpty = a0.a(this, R$id.sns_documents_empty);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z vgDocuments = a0.a(this, R$id.sns_list);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z tvFooter = a0.a(this, R$id.sns_footer);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final O9.f documentType = kotlin.a.a(new b());

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean isPickerShowing;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public List<a.b> documents;

    /* renamed from: com.sumsub.sns.camera.photo.presentation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("extra_document_type", str);
            aVar.setArguments(bundle);
            return aVar;
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0635a<String> {
        public b() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String string;
            Bundle arguments = a.this.getArguments();
            return (arguments == null || (string = arguments.getString("extra_document_type")) == null) ? "" : string;
        }
    }

    public static final class c implements SNSCountryPicker.SNSCountryPickerCallBack {
        public c() {
        }

        @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker.SNSCountryPickerCallBack
        public void onDismiss() {
            a.this.getViewModel().t();
        }

        @Override // com.sumsub.sns.core.data.listener.SNSCountryPicker.SNSCountryPickerCallBack
        public void onItemSelected(SNSCountryPicker.CountryItem countryItem) {
            a.this.a(countryItem);
        }
    }

    public static final class d extends Lambda implements InterfaceC0646l<String, p> {
        public d() {
            super(1);
        }

        public final void a(String str) {
            a.this.getViewModel().a(str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13876a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f13876a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f13876a;
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f13877a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f13877a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f13877a.invoke();
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f13878a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(O9.f fVar) {
            super(0);
            this.f13878a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f13878a.getValue()).getViewModelStore();
        }
    }

    public static final class h extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f13879a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f13880b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f13879a = interfaceC0635a;
            this.f13880b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f13879a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f13880b.getValue();
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
            return new com.sumsub.sns.internal.camera.photo.presentation.b(aVar, aVar.k(), a.this.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "tvCountryTitle", "getTvCountryTitle()Landroid/widget/TextView;", 0);
        i iVar = kotlin.jvm.internal.h.f23186a;
        f13863l = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, "snsCountrySelector", "getSnsCountrySelector()Lcom/sumsub/sns/core/widget/SNSCountrySelectorView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "tvDocumentsTitle", "getTvDocumentsTitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvDocumentsEmpty", "getTvDocumentsEmpty()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "vgDocuments", "getVgDocuments()Landroid/view/ViewGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "tvFooter", "getTvFooter()Landroid/widget/TextView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        j jVar = new j();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new f(new e(this)));
        this.viewModel = new H1.a(kotlin.jvm.internal.h.a(com.sumsub.sns.internal.camera.photo.presentation.a.class), new g(b9), jVar, new h(null, b9));
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return k();
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_document_selector;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        a.d dVar;
        q d10;
        super.handleEvent(event);
        if (!(event instanceof a.d) || (d10 = (dVar = (a.d) event).d()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("result_selected_country", dVar.c());
        bundle.putString("result_selected_id_doc_type", d10.b());
        p pVar = p.f3034a;
        com.sumsub.sns.core.presentation.b.finishWithResult$default(this, 0, bundle, 1, null);
    }

    public final String k() {
        return (String) this.documentType.getValue();
    }

    public final SNSCountrySelectorView l() {
        return (SNSCountrySelectorView) this.snsCountrySelector.a(this, f13863l[1]);
    }

    public final TextView m() {
        return (TextView) this.tvCountryTitle.a(this, f13863l[0]);
    }

    public final TextView n() {
        return (TextView) this.tvDocumentsEmpty.a(this, f13863l[3]);
    }

    public final TextView o() {
        return (TextView) this.tvDocumentsTitle.a(this, f13863l[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.documents = null;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String c2;
        super.onViewCreated(view, savedInstanceState);
        SNSCountrySelectorView l10 = l();
        if (l10 != null) {
            Context requireContext = requireContext();
            com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
            Drawable a10 = aVar.a(requireContext, SNSIconHandler.SNSCommonIcons.MORE.getImageName());
            if (a10 == null) {
                a10 = aVar.a(requireContext, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName());
            }
            l10.setIconEnd(a10);
        }
        SNSCountrySelectorView l11 = l();
        if (l11 != null) {
            l11.setOnClickListener(new J7.b(this, 8));
        }
        requireActivity().getSupportFragmentManager().g0("country_selector_request_key", this, new A0.b(this, 27));
        com.sumsub.sns.core.presentation.helper.a aVar2 = com.sumsub.sns.core.presentation.helper.a.f14273a;
        com.sumsub.sns.internal.core.theme.d a11 = aVar2.a();
        if (a11 == null || (c2 = aVar2.c(a11, SNSMetricElement.SECTION_HEADER_ALIGNMENT)) == null) {
            return;
        }
        TextView m2 = m();
        if (m2 != null) {
            aVar2.a(m2, c2);
        }
        TextView o10 = o();
        if (o10 != null) {
            aVar2.a(o10, c2);
        }
    }

    public final TextView p() {
        return (TextView) this.tvFooter.a(this, f13863l[5]);
    }

    public final ViewGroup q() {
        return (ViewGroup) this.vgDocuments.a(this, f13863l[4]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.camera.photo.presentation.a getViewModel() {
        return (com.sumsub.sns.internal.camera.photo.presentation.a) this.viewModel.getValue();
    }

    public final void b(SNSCountryPicker.CountryItem country) {
        SNSCountrySelectorView l10 = l();
        if (l10 != null) {
            l10.setIconStart(country != null ? SNSDefaultCountryPickerKt.getFlagDrawable(country, requireContext()) : null);
        }
        SNSCountrySelectorView l11 = l();
        if (l11 == null) {
            return;
        }
        l11.setTitle(country != null ? country.getName() : null);
    }

    public static final void a(a aVar, View view) {
        aVar.getViewModel().u();
    }

    public static final void a(a aVar, String str, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("country_selector_result_key");
        SNSPickerDialog.Item item = parcelable instanceof SNSPickerDialog.Item ? (SNSPickerDialog.Item) parcelable : null;
        if (item != null) {
            aVar.a(new SNSCountryPicker.CountryItem(item.getId(), item.getTitle()));
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(a.e state, Bundle savedInstanceState) {
        b(state.m());
        a(state.n(), state.l().d());
        a(state);
        TextView m2 = m();
        if (m2 != null) {
            a.f n10 = state.n();
            m2.setText(n10 != null ? n10.g() : null);
        }
        SNSCountrySelectorView l10 = l();
        if (l10 != null) {
            a.f n11 = state.n();
            l10.setPlaceholder(n11 != null ? n11.f() : null);
        }
        TextView p10 = p();
        if (p10 != null) {
            a.f n12 = state.n();
            com.sumsub.sns.internal.core.common.i.a(p10, n12 != null ? n12.i() : null);
        }
        TextView p11 = p();
        if (p11 != null) {
            com.sumsub.sns.core.common.b.a(p11, new d());
            p11.setMovementMethod(new LinkMovementMethod());
        }
    }

    public final void a(a.e state) {
        List<SNSCountryPicker.CountryItem> j10 = state.j();
        if (j10 == null) {
            return;
        }
        if (state.k() && !this.isPickerShowing) {
            this.isPickerShowing = true;
            e0.f15081a.getCountryPicker().pickCountry(requireContext(), j10, new c(), "country_selector_request_key", "country_selector_result_key");
        } else {
            this.isPickerShowing = false;
        }
    }

    public final void a(SNSCountryPicker.CountryItem item) {
        getViewModel().a(item);
        b(item);
    }

    public final void a(a.f viewText, List<a.b> documents) {
        CharSequence title;
        TextView n10;
        if (kotlin.jvm.internal.f.b(this.documents, documents)) {
            return;
        }
        this.documents = documents;
        TextView n11 = n();
        if (n11 != null) {
            n11.setVisibility(8);
        }
        if (!documents.isEmpty()) {
            TextView o10 = o();
            if (o10 != null) {
                com.sumsub.sns.internal.core.common.i.a(o10, viewText != null ? viewText.h() : null);
            }
            ViewGroup q10 = q();
            if (q10 != null) {
                H.a(q10, null);
            }
            ViewGroup q11 = q();
            if (q11 != null) {
                q11.removeAllViews();
            }
            for (a.b bVar : documents) {
                SNSSelectorItemView sNSSelectorItemView = new SNSSelectorItemView(requireContext(), null, 0, 0, 14, null);
                sNSSelectorItemView.setTag(bVar);
                sNSSelectorItemView.setTitle(bVar.d());
                sNSSelectorItemView.setIconStart(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), "IdentityType/" + bVar.c().a()));
                Context requireContext = requireContext();
                com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
                Drawable a10 = aVar.a(requireContext, SNSIconHandler.SNSCommonIcons.MORE.getImageName());
                if (a10 == null) {
                    a10 = aVar.a(requireContext, SNSIconHandler.SNSCommonIcons.DISCLOSURE.getImageName());
                }
                sNSSelectorItemView.setIconEnd(a10);
                sNSSelectorItemView.setOnClickListener(new B7.f(12, this, bVar));
                ViewGroup q12 = q();
                if (q12 != null) {
                    q12.addView(sNSSelectorItemView);
                }
            }
            ViewGroup q13 = q();
            if (q13 == null) {
                return;
            }
            q13.setVisibility(0);
            return;
        }
        ViewGroup q14 = q();
        if (q14 != null) {
            q14.removeAllViews();
        }
        com.sumsub.sns.internal.core.common.i.a(o(), q());
        SNSCountrySelectorView l10 = l();
        if (l10 == null || (title = l10.getTitle()) == null || title.length() <= 0 || (n10 = n()) == null) {
            return;
        }
        com.sumsub.sns.internal.core.common.i.a(n10, viewText != null ? viewText.j() : null);
    }

    public static final void a(a aVar, a.b bVar, View view) {
        aVar.getViewModel().a(bVar.c());
    }
}
