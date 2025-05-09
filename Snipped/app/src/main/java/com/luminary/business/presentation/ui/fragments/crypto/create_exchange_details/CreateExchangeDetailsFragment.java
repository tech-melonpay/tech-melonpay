package com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details;

import B6.g;
import D8.a;
import U4.b;
import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import j7.C0901b;
import j7.e;
import java.math.BigDecimal;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1435s3;
import y8.DialogC1631l;

/* compiled from: CreateExchangeDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class CreateExchangeDetailsFragment extends BaseFragment<AbstractC1435s3> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11969n0 = R.layout.fragment_create_exchange_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11970o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a f11971p0;

    /* compiled from: CreateExchangeDetailsFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11976a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11976a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11976a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11976a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment$special$$inlined$viewModel$default$1] */
    public CreateExchangeDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11970o0 = E.a(this, h.a(e.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(e.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String str;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar = this.f11971p0;
        if (K3.a.c(aVar != null ? aVar.f11981e : null)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar2 = this.f11971p0;
            if (K3.a.c(aVar2 != null ? aVar2.f11982f : null)) {
                str = getString(R.string.fiat_to_fiat);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(11), 76);
                return toolbarStatus;
            }
        }
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar3 = this.f11971p0;
        if (K3.a.c(aVar3 != null ? aVar3.f11981e : null)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar4 = this.f11971p0;
            if (D9.b.Z(aVar4 != null ? aVar4.f11982f : null)) {
                str = getString(R.string.fiat_to_crypto);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(11), 76);
                return toolbarStatus;
            }
        }
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar5 = this.f11971p0;
        if (D9.b.Z(aVar5 != null ? aVar5.f11981e : null)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar6 = this.f11971p0;
            if (K3.a.c(aVar6 != null ? aVar6.f11982f : null)) {
                str = getString(R.string.crypto_to_fiat);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(11), 76);
                return toolbarStatus;
            }
        }
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar7 = this.f11971p0;
        if (D9.b.Z(aVar7 != null ? aVar7.f11981e : null)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar8 = this.f11971p0;
            if (D9.b.Z(aVar8 != null ? aVar8.f11982f : null)) {
                str = getString(R.string.crypto_to_crypto);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(11), 76);
                return toolbarStatus;
            }
        }
        str = "";
        toolbarStatus.f13263a = str;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(11), 76);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar = this.f11971p0;
        if (aVar != null && (str5 = aVar.f11981e) != null && K3.a.c(str5)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar2 = this.f11971p0;
            if (K3.a.c(aVar2 != null ? aVar2.f11982f : null)) {
                str = getString(R.string.fiat_to_fiat);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(10), 76);
                return toolbarStatus;
            }
        }
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar3 = this.f11971p0;
        if (aVar3 != null && (str4 = aVar3.f11981e) != null && K3.a.c(str4)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar4 = this.f11971p0;
            if (D9.b.Z(aVar4 != null ? aVar4.f11982f : null)) {
                str = getString(R.string.fiat_to_crypto);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(10), 76);
                return toolbarStatus;
            }
        }
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar5 = this.f11971p0;
        if (aVar5 != null && (str3 = aVar5.f11981e) != null && D9.b.Z(str3)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar6 = this.f11971p0;
            if (K3.a.c(aVar6 != null ? aVar6.f11982f : null)) {
                str = getString(R.string.crypto_to_fiat);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(10), 76);
                return toolbarStatus;
            }
        }
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar7 = this.f11971p0;
        if (aVar7 != null && (str2 = aVar7.f11981e) != null && D9.b.Z(str2)) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar8 = this.f11971p0;
            if (D9.b.Z(aVar8 != null ? aVar8.f11982f : null)) {
                str = getString(R.string.crypto_to_crypto);
                toolbarStatus.f13263a = str;
                toolbarStatus.f13265c = 18;
                toolbarStatus.f13276o = null;
                toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(10), 76);
                return toolbarStatus;
            }
        }
        str = "";
        toolbarStatus.f13263a = str;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13269g = new A8.e(null, getString(R.string.rate_is_indicative), null, false, Integer.valueOf(R.drawable.rate_button_grey_background_900), Integer.valueOf(R.color.middle_gray), null, new g(10), 76);
        return toolbarStatus;
    }

    public final void T0() {
        String str;
        String plainString;
        String plainString2;
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar = this.f11971p0;
        String str2 = aVar != null ? aVar.f11981e : null;
        if (aVar == null || (plainString2 = new BigDecimal(String.valueOf(aVar.f11984h)).toPlainString()) == null) {
            str = null;
        } else {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar2 = this.f11971p0;
            str = D9.b.I(plainString2, aVar2 != null ? aVar2.f11981e : null);
        }
        String o10 = D9.b.o(str2, str);
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar3 = this.f11971p0;
        String str3 = aVar3 != null ? aVar3.f11982f : null;
        if (aVar3 != null && (plainString = new BigDecimal(String.valueOf(aVar3.f11983g)).toPlainString()) != null) {
            com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar4 = this.f11971p0;
            r1 = D9.b.I(plainString, aVar4 != null ? aVar4.f11982f : null);
        }
        String string = getString(R.string.exchanged_to, o10, D9.b.o(str3, r1));
        BottomDialogType.a aVar5 = BottomDialogType.f13289k;
        requireContext();
        aVar5.getClass();
        BottomDialogType d10 = BottomDialogType.a.d();
        d10.f13295a = string;
        d10.f13297c = getString(R.string.done);
        a.C0010a.a(w0(), d10, new C0901b(this, 2), 4);
    }

    public final void U0() {
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar = this.f11971p0;
        String str = aVar != null ? aVar.f11982f : null;
        String valueOf = String.valueOf(aVar != null ? Float.valueOf(aVar.f11983g) : null);
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar2 = this.f11971p0;
        String o10 = D9.b.o(str, D9.b.I(valueOf, aVar2 != null ? aVar2.f11982f : null));
        com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a aVar3 = this.f11971p0;
        DialogC1631l dialogC1631l = new DialogC1631l(requireContext(), getString(R.string.your_transacton_will_be_completed_within_hours, Integer.valueOf((aVar3 == null || !aVar3.f11986k) ? 2 : 24)), (aVar3 == null || !aVar3.f11986k) ? 7200L : 86400L);
        dialogC1631l.f31154s.f29568r.setText(getString(R.string.is_on_the_way, o10));
        dialogC1631l.f31155t = new C0901b(this, 1);
        dialogC1631l.show();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (e) this.f11970o0.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11971p0 = a.C0120a.a(arguments);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x03e9, code lost:
    
        if (r0 == null) goto L213;
     */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11969n0;
    }
}
