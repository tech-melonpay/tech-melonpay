package com.luminary.business.presentation.ui.fragments.auth.login;

import C.v;
import F8.o;
import I5.k;
import J6.g;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.login.LoginFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import s5.n;
import t6.AbstractC1405o4;

/* compiled from: LoginFragment.kt */
/* loaded from: classes2.dex */
public final class LoginFragment extends BaseFragment<AbstractC1405o4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11592n0 = R.layout.fragment_login;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11593o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f11594p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Handler f11595q0;

    /* renamed from: r0, reason: collision with root package name */
    public final com.luminary.business.presentation.ui.fragments.auth.login.a f11596r0;

    /* compiled from: LoginFragment.kt */
    public static final class c implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11603a;

        public c(InterfaceC0646l interfaceC0646l) {
            this.f11603a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11603a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11603a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.login.LoginFragment$special$$inlined$viewModel$default$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.luminary.business.presentation.ui.fragments.auth.login.a] */
    public LoginFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.LoginFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11593o0 = E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.LoginFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.LoginFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
        this.f11595q0 = new Handler(Looper.getMainLooper());
        this.f11596r0 = new InterfaceC0635a() { // from class: com.luminary.business.presentation.ui.fragments.auth.login.a
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                LoginFragment loginFragment = LoginFragment.this;
                if (loginFragment.getView() != null) {
                    BuildersKt__Builders_commonKt.launch$default(C0552s.a(loginFragment.getViewLifecycleOwner()), Dispatchers.getMain(), null, new LoginFragment$showResendTimer$1(loginFragment, null), 2, null);
                }
                return p.f3034a;
            }
        };
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.welcome_back_please_login);
        toolbarStatus.f13276o = null;
        toolbarStatus.f13266d = "\n";
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(String str, String str2) {
        boolean z10 = false;
        u0().f29427n.setEnabled(str.length() > 0 && str2.length() > 0);
        AbstractC1405o4 u02 = u0();
        if (str.length() > 0 && str2.length() > 0) {
            z10 = true;
        }
        u02.f29428o.setEnabled(z10);
    }

    public final g U0() {
        return (g) this.f11593o0.getValue();
    }

    public final void V0() {
        u0().f29430q.setError(null);
        u0().f29432s.setError(null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T0(String.valueOf(u0().f29429p.getText()), String.valueOf(u0().f29433t.getText()));
        final int i = 0;
        U0().f426S0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: J6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2160b;

            {
                this.f2160b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.f2160b.getClass();
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            LoginFragment loginFragment = this.f2160b;
                            loginFragment.U0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(loginFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_loginFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        if (((n) obj) != null) {
                            LoginFragment loginFragment2 = this.f2160b;
                            loginFragment2.U0().j0(null, null);
                            loginFragment2.U0().f2189b1.postValue(null);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            LoginFragment loginFragment3 = this.f2160b;
                            loginFragment3.U0().f2188a1.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g11 = U4.b.g(loginFragment3);
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
                                loginFragment3.U0().f2189b1.getValue();
                                g11.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(loginFragment3), R.id.action_loginFragment_to_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g12 = U4.b.g(loginFragment3);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        g12.j(new d(str11, str13, str14, registerSuccessUI2, number.intValue(), String.valueOf(loginFragment3.u0().f29433t.getText())));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g13 = U4.b.g(loginFragment3);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g13.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g14 = U4.b.g(loginFragment3);
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
                                        loginFragment3.U0().f2189b1.getValue();
                                        g14.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("email", str21);
                                        bundle3.putString("phoneCode", str22);
                                        bundle3.putString("phoneNumber", str23);
                                        bundle3.putString("password", "");
                                        g14.i(R.id.action_loginFragment_to_registerAddressFragment2, bundle3);
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        t0(false);
        final int i9 = 1;
        U0().f2187Z0.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: J6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2160b;

            {
                this.f2160b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f2160b.getClass();
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            LoginFragment loginFragment = this.f2160b;
                            loginFragment.U0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(loginFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_loginFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        if (((n) obj) != null) {
                            LoginFragment loginFragment2 = this.f2160b;
                            loginFragment2.U0().j0(null, null);
                            loginFragment2.U0().f2189b1.postValue(null);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            LoginFragment loginFragment3 = this.f2160b;
                            loginFragment3.U0().f2188a1.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g11 = U4.b.g(loginFragment3);
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
                                loginFragment3.U0().f2189b1.getValue();
                                g11.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(loginFragment3), R.id.action_loginFragment_to_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g12 = U4.b.g(loginFragment3);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        g12.j(new d(str11, str13, str14, registerSuccessUI2, number.intValue(), String.valueOf(loginFragment3.u0().f29433t.getText())));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g13 = U4.b.g(loginFragment3);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g13.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g14 = U4.b.g(loginFragment3);
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
                                        loginFragment3.U0().f2189b1.getValue();
                                        g14.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("email", str21);
                                        bundle3.putString("phoneCode", str22);
                                        bundle3.putString("phoneNumber", str23);
                                        bundle3.putString("password", "");
                                        g14.i(R.id.action_loginFragment_to_registerAddressFragment2, bundle3);
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i10 = 2;
        U0().f2189b1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: J6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2160b;

            {
                this.f2160b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        this.f2160b.getClass();
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            LoginFragment loginFragment = this.f2160b;
                            loginFragment.U0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(loginFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_loginFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        if (((n) obj) != null) {
                            LoginFragment loginFragment2 = this.f2160b;
                            loginFragment2.U0().j0(null, null);
                            loginFragment2.U0().f2189b1.postValue(null);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            LoginFragment loginFragment3 = this.f2160b;
                            loginFragment3.U0().f2188a1.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g11 = U4.b.g(loginFragment3);
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
                                loginFragment3.U0().f2189b1.getValue();
                                g11.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(loginFragment3), R.id.action_loginFragment_to_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g12 = U4.b.g(loginFragment3);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        g12.j(new d(str11, str13, str14, registerSuccessUI2, number.intValue(), String.valueOf(loginFragment3.u0().f29433t.getText())));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g13 = U4.b.g(loginFragment3);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g13.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g14 = U4.b.g(loginFragment3);
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
                                        loginFragment3.U0().f2189b1.getValue();
                                        g14.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("email", str21);
                                        bundle3.putString("phoneCode", str22);
                                        bundle3.putString("phoneNumber", str23);
                                        bundle3.putString("password", "");
                                        g14.i(R.id.action_loginFragment_to_registerAddressFragment2, bundle3);
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        final int i11 = 3;
        U0().f2188a1.observe(getViewLifecycleOwner(), new c(new InterfaceC0646l(this) { // from class: J6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2160b;

            {
                this.f2160b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        this.f2160b.getClass();
                        return p.f3034a;
                    case 1:
                        Parcelable parcelable = (RegisterSuccessUI) obj;
                        if (parcelable != null) {
                            LoginFragment loginFragment = this.f2160b;
                            loginFragment.U0().f2187Z0.postValue(null);
                            NavController g10 = U4.b.g(loginFragment);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            if (Parcelable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                bundle2.putParcelable("userData", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                                    throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                bundle2.putSerializable("userData", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_loginFragment_to_userBlockedFragment, bundle2);
                        }
                        return p.f3034a;
                    case 2:
                        if (((n) obj) != null) {
                            LoginFragment loginFragment2 = this.f2160b;
                            loginFragment2.U0().j0(null, null);
                            loginFragment2.U0().f2189b1.postValue(null);
                        }
                        return p.f3034a;
                    default:
                        Pair pair = (Pair) obj;
                        if (pair != null) {
                            LoginFragment loginFragment3 = this.f2160b;
                            loginFragment3.U0().f2188a1.postValue(null);
                            Number number = (Number) pair.f23090b;
                            int intValue = number.intValue();
                            A a10 = pair.f23089a;
                            if (intValue == 0 || intValue == 1) {
                                k kVar = (k) a10;
                                String str = kVar.i;
                                String str2 = str == null ? "" : str;
                                String str3 = kVar.f1830j;
                                RegisterSuccessUI registerSuccessUI = new RegisterSuccessUI(str2, str3 == null ? "" : str3, D9.b.w(kVar), D9.b.s(kVar), kVar.f1828h0, kVar.V);
                                NavController g11 = U4.b.g(loginFragment3);
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
                                loginFragment3.U0().f2189b1.getValue();
                                g11.j(new e(str4, str5, str6, registerSuccessUI, intValue2));
                            } else if (intValue != 2) {
                                if (intValue == 3) {
                                    v.w(U4.b.g(loginFragment3), R.id.action_loginFragment_to_companiesListFragment);
                                } else if (intValue != 4) {
                                    if (intValue == 5) {
                                        k kVar2 = (k) a10;
                                        String str7 = kVar2.i;
                                        String str8 = str7 == null ? "" : str7;
                                        String str9 = kVar2.f1830j;
                                        RegisterSuccessUI registerSuccessUI2 = new RegisterSuccessUI(str8, str9 == null ? "" : str9, D9.b.w(kVar2), D9.b.s(kVar2), kVar2.f1828h0, kVar2.V);
                                        NavController g12 = U4.b.g(loginFragment3);
                                        String str10 = kVar2.f1817c;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = kVar2.f1821e;
                                        String str13 = str12 == null ? "" : str12;
                                        String str14 = kVar2.f1823f;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        g12.j(new d(str11, str13, str14, registerSuccessUI2, number.intValue(), String.valueOf(loginFragment3.u0().f29433t.getText())));
                                    } else if (intValue != 7) {
                                        k kVar3 = (k) a10;
                                        String str15 = kVar3.i;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = kVar3.f1830j;
                                        RegisterSuccessUI registerSuccessUI3 = new RegisterSuccessUI(str16, str17 == null ? "" : str17, D9.b.w(kVar3), D9.b.s(kVar3), kVar3.f1828h0, kVar3.V);
                                        NavController g13 = U4.b.g(loginFragment3);
                                        String str18 = kVar3.f1817c;
                                        if (str18 == null) {
                                            str18 = "";
                                        }
                                        String str19 = kVar3.f1821e;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = kVar3.f1823f;
                                        g13.j(new c(registerSuccessUI3, str18, str19, str20 != null ? str20 : ""));
                                    } else {
                                        NavController g14 = U4.b.g(loginFragment3);
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
                                        loginFragment3.U0().f2189b1.getValue();
                                        g14.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("email", str21);
                                        bundle3.putString("phoneCode", str22);
                                        bundle3.putString("phoneNumber", str23);
                                        bundle3.putString("password", "");
                                        g14.i(R.id.action_loginFragment_to_registerAddressFragment2, bundle3);
                                    }
                                }
                            }
                        }
                        return p.f3034a;
                }
            }
        }));
        AbstractC1405o4 u02 = u0();
        final int i12 = 0;
        o.c(u02.f29427n, 500L, new InterfaceC0635a(this) { // from class: J6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2162b;

            {
                this.f2162b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        LoginFragment loginFragment = this.f2162b;
                        String valueOf = String.valueOf(loginFragment.u0().f29429p.getText());
                        String valueOf2 = String.valueOf(loginFragment.u0().f29433t.getText());
                        loginFragment.V0();
                        if (D9.b.h0(String.valueOf(loginFragment.u0().f29429p.getText()))) {
                            Editable text = loginFragment.u0().f29433t.getText();
                            if (text == null || text.length() == 0) {
                                AbstractC1405o4 u03 = loginFragment.u0();
                                u03.f29432s.setError(loginFragment.getString(R.string.empty_password));
                            } else {
                                loginFragment.U0().j0(valueOf, valueOf2);
                            }
                        } else {
                            AbstractC1405o4 u04 = loginFragment.u0();
                            u04.f29430q.setError(loginFragment.getString(R.string.invalid_email));
                        }
                        break;
                    case 1:
                        this.f2162b.u0().f29427n.callOnClick();
                        break;
                    default:
                        v.w(U4.b.g(this.f2162b), R.id.action_loginFragment_to_forgotPasswordEmailCodeFragment);
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1405o4 u03 = u0();
        final int i13 = 1;
        o.c(u03.f29428o, 500L, new InterfaceC0635a(this) { // from class: J6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2162b;

            {
                this.f2162b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        LoginFragment loginFragment = this.f2162b;
                        String valueOf = String.valueOf(loginFragment.u0().f29429p.getText());
                        String valueOf2 = String.valueOf(loginFragment.u0().f29433t.getText());
                        loginFragment.V0();
                        if (D9.b.h0(String.valueOf(loginFragment.u0().f29429p.getText()))) {
                            Editable text = loginFragment.u0().f29433t.getText();
                            if (text == null || text.length() == 0) {
                                AbstractC1405o4 u032 = loginFragment.u0();
                                u032.f29432s.setError(loginFragment.getString(R.string.empty_password));
                            } else {
                                loginFragment.U0().j0(valueOf, valueOf2);
                            }
                        } else {
                            AbstractC1405o4 u04 = loginFragment.u0();
                            u04.f29430q.setError(loginFragment.getString(R.string.invalid_email));
                        }
                        break;
                    case 1:
                        this.f2162b.u0().f29427n.callOnClick();
                        break;
                    default:
                        v.w(U4.b.g(this.f2162b), R.id.action_loginFragment_to_forgotPasswordEmailCodeFragment);
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1405o4 u04 = u0();
        u04.f29429p.addTextChangedListener(new a());
        AbstractC1405o4 u05 = u0();
        u05.f29433t.addTextChangedListener(new b());
        AbstractC1405o4 u06 = u0();
        final int i14 = 2;
        o.c(u06.f29431r, 500L, new InterfaceC0635a(this) { // from class: J6.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoginFragment f2162b;

            {
                this.f2162b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        LoginFragment loginFragment = this.f2162b;
                        String valueOf = String.valueOf(loginFragment.u0().f29429p.getText());
                        String valueOf2 = String.valueOf(loginFragment.u0().f29433t.getText());
                        loginFragment.V0();
                        if (D9.b.h0(String.valueOf(loginFragment.u0().f29429p.getText()))) {
                            Editable text = loginFragment.u0().f29433t.getText();
                            if (text == null || text.length() == 0) {
                                AbstractC1405o4 u032 = loginFragment.u0();
                                u032.f29432s.setError(loginFragment.getString(R.string.empty_password));
                            } else {
                                loginFragment.U0().j0(valueOf, valueOf2);
                            }
                        } else {
                            AbstractC1405o4 u042 = loginFragment.u0();
                            u042.f29430q.setError(loginFragment.getString(R.string.invalid_email));
                        }
                        break;
                    case 1:
                        this.f2162b.u0().f29427n.callOnClick();
                        break;
                    default:
                        v.w(U4.b.g(this.f2162b), R.id.action_loginFragment_to_forgotPasswordEmailCodeFragment);
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11592n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29427n.setVisibility(0);
        o.b(u0().f29428o);
        t0(true);
        s0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29427n);
        u0().f29428o.setVisibility(0);
        T0(String.valueOf(u0().f29429p.getText()), String.valueOf(u0().f29433t.getText()));
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            LoginFragment loginFragment = LoginFragment.this;
            loginFragment.T0(valueOf, String.valueOf(loginFragment.u0().f29433t.getText()));
            loginFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            LoginFragment loginFragment = LoginFragment.this;
            loginFragment.T0(String.valueOf(loginFragment.u0().f29429p.getText()), String.valueOf(editable));
            loginFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
