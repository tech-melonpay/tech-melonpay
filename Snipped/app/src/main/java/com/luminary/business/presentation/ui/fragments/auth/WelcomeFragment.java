package com.luminary.business.presentation.ui.fragments.auth;

import C.v;
import F6.g;
import F8.o;
import I5.k;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.WelcomeFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.B6;

/* compiled from: WelcomeFragment.kt */
/* loaded from: classes2.dex */
public final class WelcomeFragment extends BaseFragment<B6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11518n0 = R.layout.fragment_welcome;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11519o0;

    /* compiled from: WelcomeFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11524a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f11524a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11524a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11524a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.WelcomeFragment$special$$inlined$viewModel$default$1] */
    public WelcomeFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.WelcomeFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11519o0 = E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.WelcomeFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.WelcomeFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.a();
        ToolbarStatus toolbarStatus = ToolbarStatus.gone;
        ((MainActivity) requireActivity()).D();
        toolbarStatus.f13268f = true;
        return toolbarStatus;
    }

    public final g T0() {
        return (g) this.f11519o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((BaseActivity) requireActivity()).getWindow().clearFlags(512);
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((BaseActivity) requireActivity()).getWindow().addFlags(512);
        ((MainActivity) requireActivity()).D();
        final int i = 0;
        T0().f426S0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: F6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WelcomeFragment f1214b;

            {
                this.f1214b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.f1214b.getClass();
                        break;
                    case 1:
                        this.f1214b.u0().f27651n.callOnClick();
                        break;
                    case 2:
                        v.w(U4.b.g(this.f1214b), R.id.action_global_companiesListFragment);
                        break;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            WelcomeFragment welcomeFragment = this.f1214b;
                            welcomeFragment.T0().f1239X0.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g10 = U4.b.g(welcomeFragment);
                                String str4 = kVar.f1817c;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = kVar.f1821e;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = kVar.f1823f;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                int intValue2 = number.intValue();
                                welcomeFragment.T0().f1240Y0.getValue();
                                g10.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(welcomeFragment), R.id.action_global_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g11 = U4.b.g(welcomeFragment);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        int intValue3 = number.intValue();
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g11.j(new d(str11, str13, str14, registerSuccessUI2, intValue3));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g12 = U4.b.g(welcomeFragment);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g12.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g13 = U4.b.g(welcomeFragment);
                                        k kVar4 = (k) a10;
                                        String str21 = kVar4.f1817c;
                                        if (str21 == null) {
                                            str21 = "";
                                        }
                                        String str22 = kVar4.f1821e;
                                        if (str22 == null) {
                                            str22 = "";
                                        }
                                        String str23 = kVar4.f1823f;
                                        if (str23 == null) {
                                            str23 = "";
                                        }
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g13.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("email", str21);
                                        bundle2.putString("phoneCode", str22);
                                        bundle2.putString("phoneNumber", str23);
                                        bundle2.putString("password", "");
                                        g13.i(R.id.action_welcomeFragment_to_registerAddressFragment, bundle2);
                                    }
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        g T02 = T0();
        final int i9 = 1;
        T02.f1238W0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: F6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WelcomeFragment f1214b;

            {
                this.f1214b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f1214b.getClass();
                        break;
                    case 1:
                        this.f1214b.u0().f27651n.callOnClick();
                        break;
                    case 2:
                        v.w(U4.b.g(this.f1214b), R.id.action_global_companiesListFragment);
                        break;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            WelcomeFragment welcomeFragment = this.f1214b;
                            welcomeFragment.T0().f1239X0.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g10 = U4.b.g(welcomeFragment);
                                String str4 = kVar.f1817c;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = kVar.f1821e;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = kVar.f1823f;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                int intValue2 = number.intValue();
                                welcomeFragment.T0().f1240Y0.getValue();
                                g10.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(welcomeFragment), R.id.action_global_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g11 = U4.b.g(welcomeFragment);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        int intValue3 = number.intValue();
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g11.j(new d(str11, str13, str14, registerSuccessUI2, intValue3));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g12 = U4.b.g(welcomeFragment);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g12.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g13 = U4.b.g(welcomeFragment);
                                        k kVar4 = (k) a10;
                                        String str21 = kVar4.f1817c;
                                        if (str21 == null) {
                                            str21 = "";
                                        }
                                        String str22 = kVar4.f1821e;
                                        if (str22 == null) {
                                            str22 = "";
                                        }
                                        String str23 = kVar4.f1823f;
                                        if (str23 == null) {
                                            str23 = "";
                                        }
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g13.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("email", str21);
                                        bundle2.putString("phoneCode", str22);
                                        bundle2.putString("phoneNumber", str23);
                                        bundle2.putString("password", "");
                                        g13.i(R.id.action_welcomeFragment_to_registerAddressFragment, bundle2);
                                    }
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        g T03 = T0();
        final int i10 = 2;
        T03.f1237V0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: F6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WelcomeFragment f1214b;

            {
                this.f1214b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        this.f1214b.getClass();
                        break;
                    case 1:
                        this.f1214b.u0().f27651n.callOnClick();
                        break;
                    case 2:
                        v.w(U4.b.g(this.f1214b), R.id.action_global_companiesListFragment);
                        break;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            WelcomeFragment welcomeFragment = this.f1214b;
                            welcomeFragment.T0().f1239X0.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g10 = U4.b.g(welcomeFragment);
                                String str4 = kVar.f1817c;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = kVar.f1821e;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = kVar.f1823f;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                int intValue2 = number.intValue();
                                welcomeFragment.T0().f1240Y0.getValue();
                                g10.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(welcomeFragment), R.id.action_global_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g11 = U4.b.g(welcomeFragment);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        int intValue3 = number.intValue();
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g11.j(new d(str11, str13, str14, registerSuccessUI2, intValue3));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g12 = U4.b.g(welcomeFragment);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g12.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g13 = U4.b.g(welcomeFragment);
                                        k kVar4 = (k) a10;
                                        String str21 = kVar4.f1817c;
                                        if (str21 == null) {
                                            str21 = "";
                                        }
                                        String str22 = kVar4.f1821e;
                                        if (str22 == null) {
                                            str22 = "";
                                        }
                                        String str23 = kVar4.f1823f;
                                        if (str23 == null) {
                                            str23 = "";
                                        }
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g13.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("email", str21);
                                        bundle2.putString("phoneCode", str22);
                                        bundle2.putString("phoneNumber", str23);
                                        bundle2.putString("password", "");
                                        g13.i(R.id.action_welcomeFragment_to_registerAddressFragment, bundle2);
                                    }
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i11 = 3;
        T0().f1239X0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: F6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WelcomeFragment f1214b;

            {
                this.f1214b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        this.f1214b.getClass();
                        break;
                    case 1:
                        this.f1214b.u0().f27651n.callOnClick();
                        break;
                    case 2:
                        v.w(U4.b.g(this.f1214b), R.id.action_global_companiesListFragment);
                        break;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            WelcomeFragment welcomeFragment = this.f1214b;
                            welcomeFragment.T0().f1239X0.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g10 = U4.b.g(welcomeFragment);
                                String str4 = kVar.f1817c;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = kVar.f1821e;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String str6 = kVar.f1823f;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                int intValue2 = number.intValue();
                                welcomeFragment.T0().f1240Y0.getValue();
                                g10.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(welcomeFragment), R.id.action_global_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g11 = U4.b.g(welcomeFragment);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        int intValue3 = number.intValue();
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g11.j(new d(str11, str13, str14, registerSuccessUI2, intValue3));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g12 = U4.b.g(welcomeFragment);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g12.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g13 = U4.b.g(welcomeFragment);
                                        k kVar4 = (k) a10;
                                        String str21 = kVar4.f1817c;
                                        if (str21 == null) {
                                            str21 = "";
                                        }
                                        String str22 = kVar4.f1821e;
                                        if (str22 == null) {
                                            str22 = "";
                                        }
                                        String str23 = kVar4.f1823f;
                                        if (str23 == null) {
                                            str23 = "";
                                        }
                                        welcomeFragment.T0().f1240Y0.getValue();
                                        g13.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("email", str21);
                                        bundle2.putString("phoneCode", str22);
                                        bundle2.putString("phoneNumber", str23);
                                        bundle2.putString("password", "");
                                        g13.i(R.id.action_welcomeFragment_to_registerAddressFragment, bundle2);
                                    }
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        B6 u02 = u0();
        o.c(u02.f27652o, 500L, new F6.b(this, 0));
        B6 u03 = u0();
        o.c(u03.f27651n, 500L, new F6.b(this, 1));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11518n0;
    }
}
