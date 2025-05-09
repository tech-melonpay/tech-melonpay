package com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification;

import C.v;
import D8.a;
import F8.g;
import F8.i;
import F8.o;
import Fa.h;
import O9.p;
import R6.c;
import S6.f;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.io.Serializable;
import ka.C0969n;
import kotlin.Pair;
import kotlin.Result;
import t6.W2;

/* compiled from: EditCardSecurityVerificationFragment.kt */
/* loaded from: classes2.dex */
public final class EditCardSecurityVerificationFragment extends BaseFragment<W2> {

    /* renamed from: n0, reason: collision with root package name */
    public PhoneNumberUtil f11747n0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f11750q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f11751r0;

    /* renamed from: t0, reason: collision with root package name */
    public c f11752t0;

    /* renamed from: v0, reason: collision with root package name */
    public final H1.a f11754v0;

    /* renamed from: o0, reason: collision with root package name */
    public String f11748o0 = "";

    /* renamed from: p0, reason: collision with root package name */
    public Phonenumber$PhoneNumber f11749p0 = new Phonenumber$PhoneNumber();
    public final Handler s0 = new Handler(Looper.getMainLooper());

    /* renamed from: u0, reason: collision with root package name */
    public final h f11753u0 = new h(kotlin.jvm.internal.h.a(S6.c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final Bundle invoke() {
            Fragment fragment = Fragment.this;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(a.k("Fragment ", fragment, " has null arguments"));
        }
    });

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<p, p> {
        public a() {
        }

        @Override // ca.InterfaceC0646l
        public final p invoke(p pVar) {
            EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = EditCardSecurityVerificationFragment.this;
            NavController g10 = U4.b.g(editCardSecurityVerificationFragment);
            Serializable serializable = ((S6.c) editCardSecurityVerificationFragment.f11753u0.getValue()).f3381a;
            Bundle g11 = v.g(g10);
            if (Parcelable.class.isAssignableFrom(VaultDomain.class)) {
                g11.putParcelable("vault", (Parcelable) serializable);
            } else {
                if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                    throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                g11.putSerializable("vault", serializable);
            }
            g10.i(R.id.actionToCardDetailsFragment, g11);
            BottomDialogType.a aVar = BottomDialogType.f13289k;
            editCardSecurityVerificationFragment.requireContext();
            aVar.getClass();
            BottomDialogType d10 = BottomDialogType.a.d();
            d10.f13297c = editCardSecurityVerificationFragment.getString(R.string.done);
            d10.f13295a = editCardSecurityVerificationFragment.getString(R.string.card_vault_edited);
            d10.f13303j = Boolean.TRUE;
            d10.f13301g = BottomDialogType.Type.OK;
            a.C0010a.a(editCardSecurityVerificationFragment.w0(), d10, b.f11761a, 4);
            return p.f3034a;
        }
    }

    /* compiled from: EditCardSecurityVerificationFragment.kt */
    public static final class b implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11761a = new b();

        @Override // ca.InterfaceC0635a
        public final /* bridge */ /* synthetic */ p invoke() {
            return p.f3034a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment$special$$inlined$viewModel$default$1] */
    public EditCardSecurityVerificationFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11754v0 = E.a(this, kotlin.jvm.internal.h.a(f.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.editCardSecurityVerification.EditCardSecurityVerificationFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(f.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string._3ds_verification);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    public final void T0() {
        W2 u02 = u0();
        boolean z10 = false;
        u02.f28621n.setEnabled(this.f11750q0 && this.f11751r0);
        if (this.f11750q0 && this.f11751r0) {
            z10 = true;
        }
        u02.f28622o.setEnabled(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0(String str, boolean z10) {
        Pair k02 = D9.b.k0(requireContext(), str);
        this.f11751r0 = ((Boolean) k02.f23089a).booleanValue();
        if (str.length() > 0) {
            String str2 = (String) k02.f23090b;
            c cVar = this.f11752t0;
            Handler handler = this.s0;
            if (cVar != null) {
                handler.removeCallbacks(cVar);
            }
            c cVar2 = new c(1, this, str2, z10);
            this.f11752t0 = cVar2;
            handler.postDelayed(cVar2, 1000L);
        }
    }

    public final void V0(String str) {
        Object failure;
        try {
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
            int parseInt = Integer.parseInt(this.f11748o0);
            phonenumber$PhoneNumber.f10505a = true;
            phonenumber$PhoneNumber.f10506b = parseInt;
            phonenumber$PhoneNumber.f10507c = Long.parseLong(str);
            this.f11749p0 = phonenumber$PhoneNumber;
            PhoneNumberUtil phoneNumberUtil = this.f11747n0;
            failure = phoneNumberUtil != null ? Boolean.valueOf(phoneNumberUtil.j(phonenumber$PhoneNumber)) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        boolean b9 = kotlin.jvm.internal.f.b(failure, Boolean.TRUE);
        this.f11750q0 = b9;
        if (b9) {
            u0().f28626s.setError(null);
        }
        T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11747n0 = PhoneNumberUtil.d();
        W2 u02 = u0();
        o.c(u02.f28622o, 500L, new R6.b(u02, 1));
        final int i = 1;
        o.c(u02.f28625r, 500L, new InterfaceC0635a(this) { // from class: S6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCardSecurityVerificationFragment f3378b;

            {
                this.f3378b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                switch (i) {
                    case 0:
                        EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = this.f3378b;
                        f fVar = (f) editCardSecurityVerificationFragment.f11754v0.getValue();
                        String str2 = "";
                        if (editCardSecurityVerificationFragment.u0().f28626s.getVisibility() == 0) {
                            Phonenumber$PhoneNumber phonenumber$PhoneNumber = editCardSecurityVerificationFragment.f11749p0;
                            try {
                                PhoneNumberUtil phoneNumberUtil = editCardSecurityVerificationFragment.f11747n0;
                                if (phoneNumberUtil != null) {
                                    str = phoneNumberUtil.c(phonenumber$PhoneNumber);
                                    if (str == null) {
                                    }
                                    str2 = C0969n.n0(str, "+");
                                }
                                str = "";
                                str2 = C0969n.n0(str, "+");
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        d dVar = new d(fVar, ((c) editCardSecurityVerificationFragment.f11753u0.getValue()).f3382b, str2, String.valueOf(editCardSecurityVerificationFragment.u0().f28624q.getText()));
                        fVar.f418J0 = dVar;
                        dVar.invoke();
                        break;
                    default:
                        NavController g10 = U4.b.g(this.f3378b);
                        g10.i(R.id.actionToCountrySelectFragment, v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        W2 u03 = u0();
        u03.f28627t.addTextChangedListener(new S6.b(this, 0));
        u03.f28624q.addTextChangedListener(new S6.b(this, 1));
        f fVar = (f) this.f11754v0.getValue();
        fVar.f3394W0.observe(getViewLifecycleOwner(), new i(new a()));
        W2 u04 = u0();
        final int i9 = 0;
        o.c(u04.f28621n, 500L, new InterfaceC0635a(this) { // from class: S6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCardSecurityVerificationFragment f3378b;

            {
                this.f3378b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                String str;
                switch (i9) {
                    case 0:
                        EditCardSecurityVerificationFragment editCardSecurityVerificationFragment = this.f3378b;
                        f fVar2 = (f) editCardSecurityVerificationFragment.f11754v0.getValue();
                        String str2 = "";
                        if (editCardSecurityVerificationFragment.u0().f28626s.getVisibility() == 0) {
                            Phonenumber$PhoneNumber phonenumber$PhoneNumber = editCardSecurityVerificationFragment.f11749p0;
                            try {
                                PhoneNumberUtil phoneNumberUtil = editCardSecurityVerificationFragment.f11747n0;
                                if (phoneNumberUtil != null) {
                                    str = phoneNumberUtil.c(phonenumber$PhoneNumber);
                                    if (str == null) {
                                    }
                                    str2 = C0969n.n0(str, "+");
                                }
                                str = "";
                                str2 = C0969n.n0(str, "+");
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        d dVar = new d(fVar2, ((c) editCardSecurityVerificationFragment.f11753u0.getValue()).f3382b, str2, String.valueOf(editCardSecurityVerificationFragment.u0().f28624q.getText()));
                        fVar2.f418J0 = dVar;
                        dVar.invoke();
                        break;
                    default:
                        NavController g10 = U4.b.g(this.f3378b);
                        g10.i(R.id.actionToCountrySelectFragment, v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                }
                return p.f3034a;
            }
        });
        E.b(this, "country", new B6.h(this, 11));
        W2 u05 = u0();
        g.a(u05.f28627t, new J8.c(5, this, u05));
        g.a(u05.f28624q, new C7.a(this, 10));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return R.layout.fragment_card_security_varification;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        W2 u02 = u0();
        t0(true);
        CustomTextInputEditText customTextInputEditText = u02.f28627t;
        if (customTextInputEditText.isFocused()) {
            customTextInputEditText.clearFocus();
        }
        CustomTextInputEditText customTextInputEditText2 = u02.f28624q;
        if (customTextInputEditText2.isFocused()) {
            customTextInputEditText2.clearFocus();
        }
        s0();
        u02.f28621n.setVisibility(0);
        o.b(u02.f28622o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28621n);
        u0().f28622o.setVisibility(0);
    }
}
