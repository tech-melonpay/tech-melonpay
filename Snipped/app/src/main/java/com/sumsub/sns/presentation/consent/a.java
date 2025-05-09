package com.sumsub.sns.presentation.consent;

import O9.p;
import P9.m;
import R0.a;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0543i;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSDefaultCountryPickerKt;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.a;
import com.sumsub.sns.core.widget.SNSCardRadioButton;
import com.sumsub.sns.internal.core.common.a0;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.l;
import com.sumsub.sns.internal.core.common.q;
import com.sumsub.sns.internal.core.common.z;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.presentation.consent.a;
import ia.InterfaceC0840h;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0005R\u001b\u0010 \u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010,\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u00100R\u001d\u00107\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u00100R\u001d\u0010<\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010;R\u001d\u0010A\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010@R\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/sumsub/sns/presentation/consent/a;", "Lcom/sumsub/sns/core/presentation/b;", "Lcom/sumsub/sns/internal/presentation/consent/a$d;", "Lcom/sumsub/sns/internal/presentation/consent/a;", "<init>", "()V", "", "getLayoutId", "()I", "Lcom/sumsub/sns/internal/core/common/q;", "finishReason", "", "onFinishCalled", "(Lcom/sumsub/sns/internal/core/common/q;)Z", "Lcom/sumsub/sns/core/presentation/base/a$j;", "event", "LO9/p;", "handleEvent", "(Lcom/sumsub/sns/core/presentation/base/a$j;)V", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "state", "a", "(Lcom/sumsub/sns/internal/presentation/consent/a$d;Landroid/os/Bundle;)V", "onDestroyView", "LO9/f;", "p", "()Lcom/sumsub/sns/internal/presentation/consent/a;", "viewModel", "", "b", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/widget/Button;", "c", "Lcom/sumsub/sns/internal/core/common/z;", "k", "()Landroid/widget/Button;", "button", "Landroid/widget/TextView;", "d", "getTitle", "()Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "e", "o", "subtitle", "f", "l", "footer", "Landroid/widget/RadioGroup;", "g", "n", "()Landroid/widget/RadioGroup;", "radioGroup", "Landroid/widget/ImageView;", "h", "m", "()Landroid/widget/ImageView;", "image", "", "Lcom/sumsub/sns/internal/presentation/consent/a$b;", "i", "Ljava/util/List;", "countries", "j", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.core.presentation.b<a.d, com.sumsub.sns.internal.presentation.consent.a> {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0840h<Object>[] f19646k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final O9.f viewModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String idDocSetType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final z button;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final z title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final z subtitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final z footer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final z radioGroup;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final z image;

    /* renamed from: i, reason: from kotlin metadata */
    public List<a.b> countries;

    /* renamed from: com.sumsub.sns.presentation.consent.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return new a();
        }

        public Companion() {
        }
    }

    public static final class b extends Lambda implements InterfaceC0646l<String, p> {
        public b() {
            super(1);
        }

        public final void a(String str) {
            a.this.getViewModel().b(str);
        }

        @Override // ca.InterfaceC0646l
        public /* bridge */ /* synthetic */ p invoke(String str) {
            a(str);
            return p.f3034a;
        }
    }

    public static final class c extends Lambda implements InterfaceC0635a<p> {
        public c() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            if (r0 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r8 = this;
                com.sumsub.sns.presentation.consent.a r0 = com.sumsub.sns.presentation.consent.a.this
                com.sumsub.sns.internal.presentation.consent.a r0 = r0.getViewModel()
                com.sumsub.sns.internal.presentation.consent.a$b r0 = r0.p()
                if (r0 == 0) goto L22
                com.sumsub.sns.core.data.listener.SNSCountryPicker$CountryItem r0 = r0.c()
                if (r0 == 0) goto L22
                java.lang.String r0 = r0.getCode()
                if (r0 == 0) goto L22
                int r1 = r0.length()
                if (r1 <= 0) goto L1f
                goto L20
            L1f:
                r0 = 0
            L20:
                if (r0 != 0) goto L24
            L22:
                java.lang.String r0 = "Other"
            L24:
                com.sumsub.sns.presentation.consent.a r1 = com.sumsub.sns.presentation.consent.a.this
                com.sumsub.sns.internal.presentation.consent.a r1 = r1.getViewModel()
                com.sumsub.sns.internal.core.data.model.b r1 = r1.q()
                if (r1 == 0) goto L36
                java.lang.String r1 = r1.q()
                if (r1 != 0) goto L38
            L36:
                java.lang.String r1 = ""
            L38:
                com.sumsub.sns.presentation.consent.a r2 = com.sumsub.sns.presentation.consent.a.this
                com.sumsub.sns.internal.core.analytics.c r2 = r2.getAnalyticsDelegate()
                com.sumsub.sns.presentation.consent.a r3 = com.sumsub.sns.presentation.consent.a.this
                com.sumsub.sns.internal.core.analytics.Screen r3 = r3.getScreen()
                com.sumsub.sns.presentation.consent.a r4 = com.sumsub.sns.presentation.consent.a.this
                java.lang.String r4 = r4.getIdDocSetType()
                com.sumsub.sns.internal.core.analytics.Control r5 = com.sumsub.sns.internal.core.analytics.Control.AcceptButton
                kotlin.Pair r6 = new kotlin.Pair
                java.lang.String r7 = "agreementCountry"
                r6.<init>(r7, r0)
                kotlin.Pair r0 = new kotlin.Pair
                java.lang.String r7 = "agreementTitleKey"
                r0.<init>(r7, r1)
                kotlin.Pair[] r0 = new kotlin.Pair[]{r6, r0}
                java.util.Map r0 = kotlin.collections.a.s(r0)
                r2.b(r3, r4, r5, r0)
                com.sumsub.sns.presentation.consent.a r0 = com.sumsub.sns.presentation.consent.a.this
                com.sumsub.sns.internal.presentation.consent.a r0 = r0.getViewModel()
                r0.t()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.presentation.consent.a.c.a():void");
        }

        @Override // ca.InterfaceC0635a
        public /* bridge */ /* synthetic */ p invoke() {
            a();
            return p.f3034a;
        }
    }

    public static final class d extends Lambda implements InterfaceC0635a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f19657a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f19657a = fragment;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f19657a;
        }
    }

    public static final class e extends Lambda implements InterfaceC0635a<X> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC0635a interfaceC0635a) {
            super(0);
            this.f19658a = interfaceC0635a;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return (X) this.f19658a.invoke();
        }
    }

    public static final class f extends Lambda implements InterfaceC0635a<W> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O9.f f19659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(O9.f fVar) {
            super(0);
            this.f19659a = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return ((X) this.f19659a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends Lambda implements InterfaceC0635a<R0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0635a f19660a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ O9.f f19661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0635a interfaceC0635a, O9.f fVar) {
            super(0);
            this.f19660a = interfaceC0635a;
            this.f19661b = fVar;
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R0.a invoke() {
            R0.a aVar;
            InterfaceC0635a interfaceC0635a = this.f19660a;
            if (interfaceC0635a != null && (aVar = (R0.a) interfaceC0635a.invoke()) != null) {
                return aVar;
            }
            X x9 = (X) this.f19661b.getValue();
            InterfaceC0543i interfaceC0543i = x9 instanceof InterfaceC0543i ? (InterfaceC0543i) x9 : null;
            return interfaceC0543i != null ? interfaceC0543i.getDefaultViewModelCreationExtras() : a.C0040a.f3236b;
        }
    }

    public static final class i extends Lambda implements InterfaceC0635a<T> {
        public i() {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            a aVar = a.this;
            return new com.sumsub.sns.internal.presentation.consent.b(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(a.class, "button", "getButton()Landroid/widget/Button;", 0);
        kotlin.jvm.internal.i iVar = h.f23186a;
        f19646k = new InterfaceC0840h[]{propertyReference1Impl, com.google.android.gms.measurement.internal.a.p(iVar, a.class, MessageBundle.TITLE_ENTRY, "getTitle()Landroid/widget/TextView;", 0), com.google.android.gms.measurement.internal.a.o(a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "footer", "getFooter()Landroid/widget/TextView;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "radioGroup", "getRadioGroup()Landroid/widget/RadioGroup;", 0, iVar), com.google.android.gms.measurement.internal.a.o(a.class, "image", "getImage()Landroid/widget/ImageView;", 0, iVar)};
        INSTANCE = new Companion(null);
    }

    public a() {
        i iVar = new i();
        O9.f b9 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new e(new d(this)));
        this.viewModel = new H1.a(h.a(com.sumsub.sns.internal.presentation.consent.a.class), new f(b9), iVar, new g(null, b9));
        this.idDocSetType = DocumentType.f15253j;
        this.button = a0.a(this, R$id.sns_primary_button);
        this.title = a0.a(this, R$id.sns_title);
        this.subtitle = a0.a(this, R$id.sns_subtitle);
        this.footer = a0.a(this, R$id.sns_footer);
        this.radioGroup = a0.a(this, R$id.sns_radiogroup);
        this.image = a0.a(this, R$id.sns_icon);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public int getLayoutId() {
        return R$layout.sns_fragment_agreement_selector;
    }

    public final TextView getTitle() {
        return (TextView) this.title.a(this, f19646k[1]);
    }

    @Override // com.sumsub.sns.core.presentation.b
    public void handleEvent(a.j event) {
        if (event instanceof a.c) {
            com.sumsub.sns.core.presentation.b.navigateTo$default(this, com.sumsub.sns.presentation.dialogs.bottomsheet.a.INSTANCE.a(((a.c) event).b()).forResult("REQUEST_KEY_CONSENT"), null, 2, null);
        } else {
            super.handleEvent(event);
        }
    }

    public final Button k() {
        return (Button) this.button.a(this, f19646k[0]);
    }

    public final TextView l() {
        return (TextView) this.footer.a(this, f19646k[3]);
    }

    public final ImageView m() {
        return (ImageView) this.image.a(this, f19646k[5]);
    }

    public final RadioGroup n() {
        return (RadioGroup) this.radioGroup.a(this, f19646k[4]);
    }

    public final TextView o() {
        return (TextView) this.subtitle.a(this, f19646k[2]);
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.countries = null;
    }

    @Override // com.sumsub.sns.core.presentation.b
    public boolean onFinishCalled(q finishReason) {
        if (!(finishReason instanceof q.c)) {
            return super.onFinishCalled(finishReason);
        }
        com.sumsub.sns.core.presentation.b.finish$default(this, new q.d(null, 1, null), null, null, 6, null);
        return false;
    }

    @Override // com.sumsub.sns.core.presentation.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button k3 = k();
        if (k3 != null) {
            l.a(k3, new c());
        }
        ImageView m2 = m();
        if (m2 != null) {
            m2.setImageDrawable(e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.PICTURE_AGREEMENT.getImageName()));
        }
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.presentation.consent.a getViewModel() {
        return (com.sumsub.sns.internal.presentation.consent.a) this.viewModel.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(a.d state, Bundle savedInstanceState) {
        Button k3 = k();
        if (k3 != null) {
            k3.setText(state.g());
        }
        TextView l10 = l();
        if (l10 != null) {
            l10.setText(state.i());
        }
        TextView title = getTitle();
        if (title != null) {
            title.setText(state.l());
        }
        TextView o10 = o();
        if (o10 != null) {
            com.sumsub.sns.internal.core.common.i.a(o10, state.k());
        }
        TextView l11 = l();
        if (l11 != null) {
            com.sumsub.sns.core.common.b.a(l11, new b());
        }
        Button k10 = k();
        if (k10 != null) {
            k10.setEnabled(state.j() != null);
        }
        TextView l12 = l();
        if (l12 != null) {
            l12.setVisibility(state.j() == null ? 4 : 0);
        }
        if (kotlin.jvm.internal.f.b(this.countries, state.h())) {
            return;
        }
        if (state.h().size() > 1) {
            RadioGroup n10 = n();
            if (n10 != null) {
                n10.removeAllViews();
            }
            int i9 = 0;
            for (Object obj : state.h()) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    m.t();
                    throw null;
                }
                a.b bVar = (a.b) obj;
                SNSCountryPicker.CountryItem c2 = bVar.c();
                SNSCardRadioButton sNSCardRadioButton = new SNSCardRadioButton(requireContext(), null, 0, 0, 14, null);
                sNSCardRadioButton.setText(c2.getName());
                sNSCardRadioButton.setTag(Integer.valueOf(bVar.d()));
                sNSCardRadioButton.setStartDrawable(c2.getCode().length() == 0 ? e0.f15081a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.COUNTRY_OTHER.getImageName()) : SNSDefaultCountryPickerKt.getFlagDrawable(c2, requireContext()));
                sNSCardRadioButton.setOnCheckedChangeListener(new com.sumsub.sns.core.widget.applicantData.a(1, this, bVar));
                RadioGroup n11 = n();
                if (n11 != null) {
                    RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R$dimen.sns_margin_small_tiny));
                    p pVar = p.f3034a;
                    n11.addView(sNSCardRadioButton, layoutParams);
                }
                i9 = i10;
            }
            RadioGroup n12 = n();
            if (n12 != null) {
                int childCount = n12.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = n12.getChildAt(i11);
                    SNSCardRadioButton sNSCardRadioButton2 = childAt instanceof SNSCardRadioButton ? (SNSCardRadioButton) childAt : null;
                    if (sNSCardRadioButton2 != null) {
                        sNSCardRadioButton2.setChecked(kotlin.jvm.internal.f.b(sNSCardRadioButton2.getTag(), state.j()));
                    }
                }
            }
            RadioGroup n13 = n();
            if (n13 != null) {
                n13.setVisibility(0);
            }
        } else {
            RadioGroup n14 = n();
            if (n14 != null) {
                n14.setVisibility(8);
            }
        }
        this.countries = state.h();
    }

    public static final void a(a aVar, a.b bVar, CompoundButton compoundButton, boolean z10) {
        if (z10) {
            aVar.getViewModel().a(bVar.d());
        }
    }
}
