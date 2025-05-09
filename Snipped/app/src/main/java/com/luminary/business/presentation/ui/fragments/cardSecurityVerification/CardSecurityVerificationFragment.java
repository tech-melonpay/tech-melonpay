package com.luminary.business.presentation.ui.fragments.cardSecurityVerification;

import C.v;
import D8.a;
import F8.g;
import F8.o;
import Fa.h;
import O9.p;
import R6.c;
import R6.d;
import R6.e;
import R6.i;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.luminary.business.domain.entity.cards.CardCreateType;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.internal.f;
import t5.C1280a;
import t6.W2;

/* compiled from: CardSecurityVerificationFragment.kt */
/* loaded from: classes2.dex */
public final class CardSecurityVerificationFragment extends BaseFragment<W2> {

    /* renamed from: n0, reason: collision with root package name */
    public final h f11731n0 = new h(kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment$special$$inlined$navArgs$1
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

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11732o0;

    /* renamed from: p0, reason: collision with root package name */
    public PhoneNumberUtil f11733p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11734q0;

    /* renamed from: r0, reason: collision with root package name */
    public Phonenumber$PhoneNumber f11735r0;
    public CardCreateType s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f11736t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f11737u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Handler f11738v0;

    /* renamed from: w0, reason: collision with root package name */
    public c f11739w0;

    /* compiled from: FragmentExt.kt */
    public static final class a implements InterfaceC0646l<p, p> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ca.InterfaceC0646l
        public final p invoke(p pVar) {
            Pair pair;
            CardSecurityVerificationFragment cardSecurityVerificationFragment = CardSecurityVerificationFragment.this;
            int ordinal = cardSecurityVerificationFragment.s0.ordinal();
            if (ordinal == 0) {
                pair = new Pair(Integer.valueOf(R.string.card_vault_created), Integer.valueOf(R.id.cardsFragment));
            } else if (ordinal == 1) {
                pair = new Pair(Integer.valueOf(R.string.card_issued), Integer.valueOf(R.id.cardsFragment));
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(Integer.valueOf(R.string.card_issued), Integer.valueOf(R.id.cardDetailsFragment));
            }
            int intValue = ((Number) pair.f23089a).intValue();
            U4.b.g(cardSecurityVerificationFragment).m(((Number) pair.f23090b).intValue(), false);
            BottomDialogType.a aVar = BottomDialogType.f13289k;
            cardSecurityVerificationFragment.requireContext();
            aVar.getClass();
            BottomDialogType d10 = BottomDialogType.a.d();
            d10.f13297c = cardSecurityVerificationFragment.getString(R.string.done);
            d10.f13295a = cardSecurityVerificationFragment.getString(intValue);
            d10.f13303j = Boolean.TRUE;
            d10.f13301g = BottomDialogType.Type.OK;
            a.C0010a.a(cardSecurityVerificationFragment.w0(), d10, b.f11746a, 4);
            return p.f3034a;
        }
    }

    /* compiled from: CardSecurityVerificationFragment.kt */
    public static final class b implements InterfaceC0635a<p> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11746a = new b();

        @Override // ca.InterfaceC0635a
        public final /* bridge */ /* synthetic */ p invoke() {
            return p.f3034a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment$special$$inlined$viewModel$default$1] */
    public CardSecurityVerificationFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11732o0 = E.a(this, kotlin.jvm.internal.h.a(i.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.cardSecurityVerification.CardSecurityVerificationFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(i.class), null, null, b.l(this));
            }
        });
        this.f11734q0 = "";
        this.f11735r0 = new Phonenumber$PhoneNumber();
        this.s0 = CardCreateType.f10750b;
        this.f11738v0 = new Handler(Looper.getMainLooper());
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

    public final e T0() {
        return (e) this.f11731n0.getValue();
    }

    public final String U0(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        String str;
        try {
            PhoneNumberUtil phoneNumberUtil = this.f11733p0;
            if (phoneNumberUtil != null) {
                str = phoneNumberUtil.c(phonenumber$PhoneNumber);
                if (str == null) {
                }
                return C0969n.n0(str, "+");
            }
            str = "";
            return C0969n.n0(str, "+");
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final void V0() {
        W2 u02 = u0();
        boolean z10 = false;
        u02.f28621n.setEnabled(this.f11736t0 && this.f11737u0);
        if (this.f11736t0 && this.f11737u0) {
            z10 = true;
        }
        u02.f28622o.setEnabled(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W0(String str, boolean z10) {
        Pair k02 = D9.b.k0(requireContext(), str);
        this.f11737u0 = ((Boolean) k02.f23089a).booleanValue();
        if (str.length() > 0) {
            String str2 = (String) k02.f23090b;
            c cVar = this.f11739w0;
            Handler handler = this.f11738v0;
            if (cVar != null) {
                handler.removeCallbacks(cVar);
            }
            c cVar2 = new c(0, this, str2, z10);
            this.f11739w0 = cVar2;
            handler.postDelayed(cVar2, 1000L);
        }
    }

    public final void X0(String str) {
        Object failure;
        try {
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
            int parseInt = Integer.parseInt(this.f11734q0);
            phonenumber$PhoneNumber.f10505a = true;
            phonenumber$PhoneNumber.f10506b = parseInt;
            phonenumber$PhoneNumber.f10507c = Long.parseLong(str);
            this.f11735r0 = phonenumber$PhoneNumber;
            PhoneNumberUtil phoneNumberUtil = this.f11733p0;
            failure = phoneNumberUtil != null ? Boolean.valueOf(phoneNumberUtil.j(phonenumber$PhoneNumber)) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        boolean b9 = f.b(failure, Boolean.TRUE);
        this.f11736t0 = b9;
        if (b9) {
            u0().f28626s.setError(null);
        }
        V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (i) this.f11732o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11733p0 = PhoneNumberUtil.d();
        W2 u02 = u0();
        final int i = 0;
        o.c(u02.f28621n, 500L, new InterfaceC0635a(this) { // from class: R6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityVerificationFragment f3258b;

            {
                this.f3258b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer valueOf;
                switch (i) {
                    case 0:
                        CardSecurityVerificationFragment cardSecurityVerificationFragment = this.f3258b;
                        int ordinal = cardSecurityVerificationFragment.s0.ordinal();
                        H1.a aVar = cardSecurityVerificationFragment.f11732o0;
                        if (ordinal == 0) {
                            W2 u03 = cardSecurityVerificationFragment.u0();
                            String str = cardSecurityVerificationFragment.T0().f3267a;
                            Integer valueOf2 = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
                            String str2 = cardSecurityVerificationFragment.T0().f3268b;
                            valueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
                            final String str3 = cardSecurityVerificationFragment.T0().f3270d;
                            final String str4 = cardSecurityVerificationFragment.T0().f3269c;
                            if (valueOf2 != null && valueOf != null && str3 != null && str4 != null) {
                                final i iVar = (i) aVar.getValue();
                                final int intValue = valueOf.intValue();
                                final int intValue2 = valueOf2.intValue();
                                final String U02 = u03.f28626s.getVisibility() == 0 ? cardSecurityVerificationFragment.U0(cardSecurityVerificationFragment.f11735r0) : "";
                                final String valueOf3 = String.valueOf(u03.f28624q.getText());
                                InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: R6.f

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ String f3276d = "";

                                    @Override // ca.InterfaceC0635a
                                    public final Object invoke() {
                                        i iVar2 = i.this;
                                        int h9 = iVar2.f3290U0.h();
                                        iVar2.l();
                                        Pair pair = new Pair(String.valueOf(h9), new C1280a(intValue, intValue2, this.f3276d, U02, valueOf3, str3, str4));
                                        iVar2.f3289T0.a(new h(iVar2, 0), pair);
                                        return p.f3034a;
                                    }
                                };
                                iVar.f418J0 = interfaceC0635a;
                                interfaceC0635a.invoke();
                            }
                        } else {
                            if (ordinal != 1 && ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            W2 u04 = cardSecurityVerificationFragment.u0();
                            String str5 = cardSecurityVerificationFragment.T0().f3272f;
                            valueOf = str5 != null ? Integer.valueOf(Integer.parseInt(str5)) : null;
                            final String str6 = cardSecurityVerificationFragment.T0().f3269c;
                            if (valueOf != null && str6 != null) {
                                final i iVar2 = (i) aVar.getValue();
                                final int intValue3 = valueOf.intValue();
                                final String U03 = u04.f28626s.getVisibility() == 0 ? cardSecurityVerificationFragment.U0(cardSecurityVerificationFragment.f11735r0) : "";
                                final String valueOf4 = String.valueOf(u04.f28624q.getText());
                                InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: R6.g

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ String f3283c = "";

                                    @Override // ca.InterfaceC0635a
                                    public final Object invoke() {
                                        i iVar3 = i.this;
                                        int h9 = iVar3.f3290U0.h();
                                        iVar3.l();
                                        Triple triple = new Triple(String.valueOf(h9), String.valueOf(intValue3), new t5.c(U03, this.f3283c, str6, valueOf4));
                                        iVar3.f3291V0.a(new h(iVar3, 1), triple);
                                        return p.f3034a;
                                    }
                                };
                                iVar2.f419K0 = interfaceC0635a2;
                                interfaceC0635a2.invoke();
                            }
                        }
                        return p.f3034a;
                    default:
                        NavController g10 = U4.b.g(this.f3258b);
                        g10.i(R.id.actionToCountrySelectFragment, v.h(g10, "isCountryCode", true, "fieldName", ""));
                        return p.f3034a;
                }
            }
        });
        o.c(u02.f28622o, 500L, new R6.b(u02, 0));
        final int i9 = 1;
        o.c(u02.f28625r, 500L, new InterfaceC0635a(this) { // from class: R6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityVerificationFragment f3258b;

            {
                this.f3258b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer valueOf;
                switch (i9) {
                    case 0:
                        CardSecurityVerificationFragment cardSecurityVerificationFragment = this.f3258b;
                        int ordinal = cardSecurityVerificationFragment.s0.ordinal();
                        H1.a aVar = cardSecurityVerificationFragment.f11732o0;
                        if (ordinal == 0) {
                            W2 u03 = cardSecurityVerificationFragment.u0();
                            String str = cardSecurityVerificationFragment.T0().f3267a;
                            Integer valueOf2 = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
                            String str2 = cardSecurityVerificationFragment.T0().f3268b;
                            valueOf = str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null;
                            final String str3 = cardSecurityVerificationFragment.T0().f3270d;
                            final String str4 = cardSecurityVerificationFragment.T0().f3269c;
                            if (valueOf2 != null && valueOf != null && str3 != null && str4 != null) {
                                final i iVar = (i) aVar.getValue();
                                final int intValue = valueOf.intValue();
                                final int intValue2 = valueOf2.intValue();
                                final String U02 = u03.f28626s.getVisibility() == 0 ? cardSecurityVerificationFragment.U0(cardSecurityVerificationFragment.f11735r0) : "";
                                final String valueOf3 = String.valueOf(u03.f28624q.getText());
                                InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: R6.f

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ String f3276d = "";

                                    @Override // ca.InterfaceC0635a
                                    public final Object invoke() {
                                        i iVar2 = i.this;
                                        int h9 = iVar2.f3290U0.h();
                                        iVar2.l();
                                        Pair pair = new Pair(String.valueOf(h9), new C1280a(intValue, intValue2, this.f3276d, U02, valueOf3, str3, str4));
                                        iVar2.f3289T0.a(new h(iVar2, 0), pair);
                                        return p.f3034a;
                                    }
                                };
                                iVar.f418J0 = interfaceC0635a;
                                interfaceC0635a.invoke();
                            }
                        } else {
                            if (ordinal != 1 && ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            W2 u04 = cardSecurityVerificationFragment.u0();
                            String str5 = cardSecurityVerificationFragment.T0().f3272f;
                            valueOf = str5 != null ? Integer.valueOf(Integer.parseInt(str5)) : null;
                            final String str6 = cardSecurityVerificationFragment.T0().f3269c;
                            if (valueOf != null && str6 != null) {
                                final i iVar2 = (i) aVar.getValue();
                                final int intValue3 = valueOf.intValue();
                                final String U03 = u04.f28626s.getVisibility() == 0 ? cardSecurityVerificationFragment.U0(cardSecurityVerificationFragment.f11735r0) : "";
                                final String valueOf4 = String.valueOf(u04.f28624q.getText());
                                InterfaceC0635a<p> interfaceC0635a2 = new InterfaceC0635a() { // from class: R6.g

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ String f3283c = "";

                                    @Override // ca.InterfaceC0635a
                                    public final Object invoke() {
                                        i iVar3 = i.this;
                                        int h9 = iVar3.f3290U0.h();
                                        iVar3.l();
                                        Triple triple = new Triple(String.valueOf(h9), String.valueOf(intValue3), new t5.c(U03, this.f3283c, str6, valueOf4));
                                        iVar3.f3291V0.a(new h(iVar3, 1), triple);
                                        return p.f3034a;
                                    }
                                };
                                iVar2.f419K0 = interfaceC0635a2;
                                interfaceC0635a2.invoke();
                            }
                        }
                        return p.f3034a;
                    default:
                        NavController g10 = U4.b.g(this.f3258b);
                        g10.i(R.id.actionToCountrySelectFragment, v.h(g10, "isCountryCode", true, "fieldName", ""));
                        return p.f3034a;
                }
            }
        });
        W2 u03 = u0();
        u03.f28627t.addTextChangedListener(new d(this, 0));
        u03.f28624q.addTextChangedListener(new d(this, 1));
        String str = T0().f3271e;
        if (str == null) {
            str = "VIRTUAL_CARD_WITHOUT_VAULT";
        }
        this.s0 = CardCreateType.valueOf(str);
        i iVar = (i) this.f11732o0.getValue();
        iVar.f3293X0.observe(getViewLifecycleOwner(), new F8.i(new a()));
        E.b(this, "country", new B6.h(this, 8));
        W2 u04 = u0();
        g.a(u04.f28627t, new J8.c(4, this, u04));
        g.a(u04.f28624q, new C7.a(this, 8));
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
