package com.luminary.business.presentation.ui.fragments.auth.register;

import D8.a;
import F8.n;
import F8.o;
import M6.j;
import M6.w;
import U4.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import ka.C0969n;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import t6.AbstractC1465w5;

/* compiled from: RegisterFragment.kt */
/* loaded from: classes2.dex */
public final class RegisterFragment extends BaseFragment<AbstractC1465w5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11665n0 = R.layout.fragment_register;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11666o0;

    /* renamed from: p0, reason: collision with root package name */
    public Date f11667p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11668q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f11669r0;
    public boolean s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f11670t0;

    /* compiled from: RegisterFragment.kt */
    public static final class h implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11682a;

        public h(InterfaceC0646l interfaceC0646l) {
            this.f11682a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11682a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11682a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment$special$$inlined$viewModel$default$1] */
    public RegisterFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11666o0 = E.a(this, kotlin.jvm.internal.h.a(w.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(w.class), null, null, b.l(this));
            }
        });
        this.f11668q0 = "";
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.personal_details);
        toolbarStatus.f13266d = getString(R.string.step_of, 1, 5);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.personal_details);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        if (r3.before(r4.getTime()) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T0() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment.T0():void");
    }

    public final w U0() {
        return (w) this.f11666o0.getValue();
    }

    public final void V0() {
        u0().f29755J.setError(null);
        u0().f29751F.setError(null);
        u0().f29763t.setError(null);
        u0().f29765v.setError(null);
        u0().f29749D.setError(null);
        u0().f29767x.setError(null);
        u0().f29757n.setError(null);
        u0().f29753H.setError(null);
        u0().f29747B.setVisibility(0);
    }

    public final void W0() {
        if (this.s0) {
            Date date = this.f11667p0;
            if (date == null) {
                AbstractC1465w5 u02 = u0();
                u02.f29757n.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.date_of_birth)));
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, -18);
            if (date.before(calendar.getTime())) {
                u0().f29757n.setError(null);
                return;
            }
            AbstractC1465w5 u03 = u0();
            u03.f29757n.setErrorWithoutFocus(getString(R.string.you_must_be_at_least_18_year_old));
        }
    }

    public final void X0() {
        if (this.s0) {
            if (kotlin.jvm.internal.f.b(String.valueOf(u0().f29764u.getText()), String.valueOf(u0().f29752G.getText()))) {
                u0().f29763t.setError(null);
                return;
            }
            AbstractC1465w5 u02 = u0();
            u02.f29763t.setErrorWithoutFocus(getString(R.string.password_mismatch));
        }
    }

    public final void Y0() {
        if (this.s0) {
            if (D9.b.h0(String.valueOf(u0().f29766w.getText()))) {
                u0().f29765v.setError(null);
                return;
            }
            AbstractC1465w5 u02 = u0();
            u02.f29765v.setErrorWithoutFocus(getString(R.string.invalid_email));
        }
    }

    public final void Z0() {
        String obj;
        if (this.s0) {
            Editable text = u0().f29768y.getText();
            if (text == null || (obj = text.toString()) == null || !D9.b.d0(obj)) {
                u0().f29767x.setError(null);
            } else {
                u0().f29767x.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.first_name)));
            }
        }
    }

    public final void a1() {
        String obj;
        if (this.s0) {
            Editable text = u0().f29748C.getText();
            if (text == null || (obj = text.toString()) == null || !D9.b.d0(obj)) {
                u0().f29749D.setError(null);
            } else {
                u0().f29749D.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.last_name)));
            }
        }
    }

    public final void b1() {
        if (this.s0) {
            String j02 = D9.b.j0(requireContext(), String.valueOf(u0().f29752G.getText()));
            if (j02.length() <= 0) {
                u0().f29751F.setError(null);
            } else {
                u0().f29751F.setErrorWithoutFocus(j02);
                o.b(u0().f29769z);
            }
        }
    }

    public final void c1() {
        if (this.s0) {
            Editable text = u0().f29756K.getText();
            if (Pattern.compile("^[123456789]\\d{4,}$").matcher(D9.b.q0(String.valueOf(text != null ? C0969n.u0(text) : null))).matches()) {
                u0().f29755J.setError(null);
            } else {
                u0().f29755J.setErrorWithoutFocus(getString(R.string.invalid_phone));
            }
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        U0().f426S0.observe(getViewLifecycleOwner(), new h(new InterfaceC0646l(this) { // from class: M6.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2620b;

            {
                this.f2620b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.f2620b.getClass();
                        break;
                    default:
                        if (((I5.k) obj) != null) {
                            RegisterFragment registerFragment = this.f2620b;
                            registerFragment.f11670t0 = true;
                            AbstractC1465w5 u02 = registerFragment.u0();
                            U4.b.g(registerFragment).j(new k(String.valueOf(u02.f29766w.getText()).toLowerCase(Locale.ROOT), registerFragment.f11668q0, D9.b.q0(String.valueOf(u02.f29756K.getText())), registerFragment.U0().h0(), String.valueOf(u02.f29752G.getText())));
                            registerFragment.U0().f2710k1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                }
                return O9.p.f3034a;
            }
        }));
        this.s0 = false;
        u0().f29753H.postDelayed(new B2.d(this, 12), 500L);
        T0();
        final int i9 = 0;
        o.c(u0().f29754I, 500L, new InterfaceC0635a(this) { // from class: M6.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2622b;

            {
                this.f2622b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                int i10;
                int i11;
                switch (i9) {
                    case 0:
                        NavController g10 = U4.b.g(this.f2622b);
                        g10.i(R.id.action_registerFragment_to_countrySelectFragment, C.v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                    case 1:
                        RegisterFragment registerFragment = this.f2622b;
                        registerFragment.V0();
                        Editable text = registerFragment.u0().f29768y.getText();
                        if (text == null || text.length() == 0) {
                            AbstractC1465w5 u02 = registerFragment.u0();
                            u02.f29767x.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.first_name)));
                            registerFragment.u0().f29768y.requestFocus();
                        } else {
                            Editable text2 = registerFragment.u0().f29748C.getText();
                            if (text2 == null || text2.length() == 0) {
                                AbstractC1465w5 u03 = registerFragment.u0();
                                u03.f29749D.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.last_name)));
                                registerFragment.u0().f29748C.requestFocus();
                            } else if (D9.b.h0(String.valueOf(registerFragment.u0().f29766w.getText()))) {
                                Editable text3 = registerFragment.u0().f29754I.getText();
                                if (text3 == null || text3.length() == 0) {
                                    AbstractC1465w5 u04 = registerFragment.u0();
                                    u04.f29753H.setError(registerFragment.getString(R.string.select_country));
                                    F8.o.b(registerFragment.u0().f29747B);
                                    registerFragment.u0().f29755J.setError(" ");
                                } else {
                                    if (Pattern.compile("^[123456789]\\d{4,}$").matcher(D9.b.q0(String.valueOf(registerFragment.u0().f29756K.getText()))).matches()) {
                                        String j02 = D9.b.j0(registerFragment.requireContext(), String.valueOf(registerFragment.u0().f29752G.getText()));
                                        if (j02.length() > 0) {
                                            registerFragment.u0().f29751F.setError(j02);
                                            registerFragment.u0().f29752G.requestFocus();
                                            F8.o.b(registerFragment.u0().f29769z);
                                        } else if (kotlin.jvm.internal.f.b(String.valueOf(registerFragment.u0().f29764u.getText()), String.valueOf(registerFragment.u0().f29752G.getText()))) {
                                            Date date = registerFragment.f11667p0;
                                            if (date == null) {
                                                AbstractC1465w5 u05 = registerFragment.u0();
                                                u05.f29757n.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.date_of_birth)));
                                            } else {
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.add(1, -18);
                                                if (date.before(calendar.getTime())) {
                                                    AbstractC1465w5 u06 = registerFragment.u0();
                                                    boolean z10 = registerFragment.f11670t0;
                                                    CustomTextInputEditText customTextInputEditText = u06.f29752G;
                                                    CustomTextInputEditText customTextInputEditText2 = u06.f29756K;
                                                    CustomTextInputEditText customTextInputEditText3 = u06.f29766w;
                                                    CustomTextInputEditText customTextInputEditText4 = u06.f29748C;
                                                    CustomTextInputEditText customTextInputEditText5 = u06.f29768y;
                                                    if (z10) {
                                                        w U02 = registerFragment.U0();
                                                        v vVar = new v(U02, String.valueOf(customTextInputEditText5.getText()), String.valueOf(customTextInputEditText4.getText()), String.valueOf(customTextInputEditText3.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText2.getText())), String.valueOf(customTextInputEditText.getText()), registerFragment.f11667p0, null, null, null, null, null, null, null, null);
                                                        U02.f2691D1 = vVar;
                                                        vVar.invoke();
                                                    } else {
                                                        w U03 = registerFragment.U0();
                                                        s sVar = new s(U03, String.valueOf(customTextInputEditText5.getText()), String.valueOf(customTextInputEditText4.getText()), String.valueOf(customTextInputEditText3.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText2.getText())), String.valueOf(customTextInputEditText.getText()), registerFragment.f11667p0, 0);
                                                        U03.f418J0 = sVar;
                                                        sVar.invoke();
                                                    }
                                                } else {
                                                    BottomDialogType.a aVar = BottomDialogType.f13289k;
                                                    registerFragment.requireContext();
                                                    aVar.getClass();
                                                    BottomDialogType b9 = BottomDialogType.a.b();
                                                    b9.f13295a = registerFragment.getString(R.string.you_must_be_at_least_18_year_old);
                                                    a.C0010a.a(registerFragment.w0(), b9, null, 6);
                                                }
                                            }
                                        } else {
                                            AbstractC1465w5 u07 = registerFragment.u0();
                                            u07.f29763t.setError(registerFragment.getString(R.string.password_mismatch));
                                            registerFragment.u0().f29764u.requestFocus();
                                            F8.o.b(registerFragment.u0().f29746A);
                                        }
                                    } else {
                                        AbstractC1465w5 u08 = registerFragment.u0();
                                        u08.f29755J.setError(registerFragment.getString(R.string.invalid_phone));
                                        registerFragment.u0().f29756K.requestFocus();
                                    }
                                }
                            } else {
                                AbstractC1465w5 u09 = registerFragment.u0();
                                u09.f29765v.setError(registerFragment.getString(R.string.invalid_email));
                                registerFragment.u0().f29766w.requestFocus();
                            }
                        }
                        break;
                    case 2:
                        this.f2622b.u0().f29759p.callOnClick();
                        break;
                    case 3:
                        RegisterFragment registerFragment2 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText6 = registerFragment2.u0().f29764u;
                        if (customTextInputEditText6.getInputType() == 225) {
                            customTextInputEditText6.setInputType(145);
                            customTextInputEditText6.e();
                            i10 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText6.setInputType(225);
                            customTextInputEditText6.e();
                            i10 = R.drawable.ic_eye_c;
                        }
                        registerFragment2.u0().f29746A.setImageResource(i10);
                        break;
                    default:
                        RegisterFragment registerFragment3 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText7 = registerFragment3.u0().f29752G;
                        if (customTextInputEditText7.getInputType() == 225) {
                            customTextInputEditText7.setInputType(145);
                            customTextInputEditText7.e();
                            i11 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText7.setInputType(225);
                            customTextInputEditText7.e();
                            i11 = R.drawable.ic_eye_c;
                        }
                        registerFragment3.u0().f29769z.setImageResource(i11);
                        break;
                }
                return O9.p.f3034a;
            }
        });
        E.b(this, "country", new B6.h(this, 4));
        final int i10 = 1;
        U0().f2710k1.observe(getViewLifecycleOwner(), new h(new InterfaceC0646l(this) { // from class: M6.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2620b;

            {
                this.f2620b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        this.f2620b.getClass();
                        break;
                    default:
                        if (((I5.k) obj) != null) {
                            RegisterFragment registerFragment = this.f2620b;
                            registerFragment.f11670t0 = true;
                            AbstractC1465w5 u02 = registerFragment.u0();
                            U4.b.g(registerFragment).j(new k(String.valueOf(u02.f29766w.getText()).toLowerCase(Locale.ROOT), registerFragment.f11668q0, D9.b.q0(String.valueOf(u02.f29756K.getText())), registerFragment.U0().h0(), String.valueOf(u02.f29752G.getText())));
                            registerFragment.U0().f2710k1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                }
                return O9.p.f3034a;
            }
        }));
        final int i11 = 1;
        o.c(u0().f29759p, 500L, new InterfaceC0635a(this) { // from class: M6.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2622b;

            {
                this.f2622b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                int i102;
                int i112;
                switch (i11) {
                    case 0:
                        NavController g10 = U4.b.g(this.f2622b);
                        g10.i(R.id.action_registerFragment_to_countrySelectFragment, C.v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                    case 1:
                        RegisterFragment registerFragment = this.f2622b;
                        registerFragment.V0();
                        Editable text = registerFragment.u0().f29768y.getText();
                        if (text == null || text.length() == 0) {
                            AbstractC1465w5 u02 = registerFragment.u0();
                            u02.f29767x.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.first_name)));
                            registerFragment.u0().f29768y.requestFocus();
                        } else {
                            Editable text2 = registerFragment.u0().f29748C.getText();
                            if (text2 == null || text2.length() == 0) {
                                AbstractC1465w5 u03 = registerFragment.u0();
                                u03.f29749D.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.last_name)));
                                registerFragment.u0().f29748C.requestFocus();
                            } else if (D9.b.h0(String.valueOf(registerFragment.u0().f29766w.getText()))) {
                                Editable text3 = registerFragment.u0().f29754I.getText();
                                if (text3 == null || text3.length() == 0) {
                                    AbstractC1465w5 u04 = registerFragment.u0();
                                    u04.f29753H.setError(registerFragment.getString(R.string.select_country));
                                    F8.o.b(registerFragment.u0().f29747B);
                                    registerFragment.u0().f29755J.setError(" ");
                                } else {
                                    if (Pattern.compile("^[123456789]\\d{4,}$").matcher(D9.b.q0(String.valueOf(registerFragment.u0().f29756K.getText()))).matches()) {
                                        String j02 = D9.b.j0(registerFragment.requireContext(), String.valueOf(registerFragment.u0().f29752G.getText()));
                                        if (j02.length() > 0) {
                                            registerFragment.u0().f29751F.setError(j02);
                                            registerFragment.u0().f29752G.requestFocus();
                                            F8.o.b(registerFragment.u0().f29769z);
                                        } else if (kotlin.jvm.internal.f.b(String.valueOf(registerFragment.u0().f29764u.getText()), String.valueOf(registerFragment.u0().f29752G.getText()))) {
                                            Date date = registerFragment.f11667p0;
                                            if (date == null) {
                                                AbstractC1465w5 u05 = registerFragment.u0();
                                                u05.f29757n.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.date_of_birth)));
                                            } else {
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.add(1, -18);
                                                if (date.before(calendar.getTime())) {
                                                    AbstractC1465w5 u06 = registerFragment.u0();
                                                    boolean z10 = registerFragment.f11670t0;
                                                    CustomTextInputEditText customTextInputEditText = u06.f29752G;
                                                    CustomTextInputEditText customTextInputEditText2 = u06.f29756K;
                                                    CustomTextInputEditText customTextInputEditText3 = u06.f29766w;
                                                    CustomTextInputEditText customTextInputEditText4 = u06.f29748C;
                                                    CustomTextInputEditText customTextInputEditText5 = u06.f29768y;
                                                    if (z10) {
                                                        w U02 = registerFragment.U0();
                                                        v vVar = new v(U02, String.valueOf(customTextInputEditText5.getText()), String.valueOf(customTextInputEditText4.getText()), String.valueOf(customTextInputEditText3.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText2.getText())), String.valueOf(customTextInputEditText.getText()), registerFragment.f11667p0, null, null, null, null, null, null, null, null);
                                                        U02.f2691D1 = vVar;
                                                        vVar.invoke();
                                                    } else {
                                                        w U03 = registerFragment.U0();
                                                        s sVar = new s(U03, String.valueOf(customTextInputEditText5.getText()), String.valueOf(customTextInputEditText4.getText()), String.valueOf(customTextInputEditText3.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText2.getText())), String.valueOf(customTextInputEditText.getText()), registerFragment.f11667p0, 0);
                                                        U03.f418J0 = sVar;
                                                        sVar.invoke();
                                                    }
                                                } else {
                                                    BottomDialogType.a aVar = BottomDialogType.f13289k;
                                                    registerFragment.requireContext();
                                                    aVar.getClass();
                                                    BottomDialogType b9 = BottomDialogType.a.b();
                                                    b9.f13295a = registerFragment.getString(R.string.you_must_be_at_least_18_year_old);
                                                    a.C0010a.a(registerFragment.w0(), b9, null, 6);
                                                }
                                            }
                                        } else {
                                            AbstractC1465w5 u07 = registerFragment.u0();
                                            u07.f29763t.setError(registerFragment.getString(R.string.password_mismatch));
                                            registerFragment.u0().f29764u.requestFocus();
                                            F8.o.b(registerFragment.u0().f29746A);
                                        }
                                    } else {
                                        AbstractC1465w5 u08 = registerFragment.u0();
                                        u08.f29755J.setError(registerFragment.getString(R.string.invalid_phone));
                                        registerFragment.u0().f29756K.requestFocus();
                                    }
                                }
                            } else {
                                AbstractC1465w5 u09 = registerFragment.u0();
                                u09.f29765v.setError(registerFragment.getString(R.string.invalid_email));
                                registerFragment.u0().f29766w.requestFocus();
                            }
                        }
                        break;
                    case 2:
                        this.f2622b.u0().f29759p.callOnClick();
                        break;
                    case 3:
                        RegisterFragment registerFragment2 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText6 = registerFragment2.u0().f29764u;
                        if (customTextInputEditText6.getInputType() == 225) {
                            customTextInputEditText6.setInputType(145);
                            customTextInputEditText6.e();
                            i102 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText6.setInputType(225);
                            customTextInputEditText6.e();
                            i102 = R.drawable.ic_eye_c;
                        }
                        registerFragment2.u0().f29746A.setImageResource(i102);
                        break;
                    default:
                        RegisterFragment registerFragment3 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText7 = registerFragment3.u0().f29752G;
                        if (customTextInputEditText7.getInputType() == 225) {
                            customTextInputEditText7.setInputType(145);
                            customTextInputEditText7.e();
                            i112 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText7.setInputType(225);
                            customTextInputEditText7.e();
                            i112 = R.drawable.ic_eye_c;
                        }
                        registerFragment3.u0().f29769z.setImageResource(i112);
                        break;
                }
                return O9.p.f3034a;
            }
        });
        final int i12 = 2;
        o.c(u0().f29760q, 500L, new InterfaceC0635a(this) { // from class: M6.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2622b;

            {
                this.f2622b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                int i102;
                int i112;
                switch (i12) {
                    case 0:
                        NavController g10 = U4.b.g(this.f2622b);
                        g10.i(R.id.action_registerFragment_to_countrySelectFragment, C.v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                    case 1:
                        RegisterFragment registerFragment = this.f2622b;
                        registerFragment.V0();
                        Editable text = registerFragment.u0().f29768y.getText();
                        if (text == null || text.length() == 0) {
                            AbstractC1465w5 u02 = registerFragment.u0();
                            u02.f29767x.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.first_name)));
                            registerFragment.u0().f29768y.requestFocus();
                        } else {
                            Editable text2 = registerFragment.u0().f29748C.getText();
                            if (text2 == null || text2.length() == 0) {
                                AbstractC1465w5 u03 = registerFragment.u0();
                                u03.f29749D.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.last_name)));
                                registerFragment.u0().f29748C.requestFocus();
                            } else if (D9.b.h0(String.valueOf(registerFragment.u0().f29766w.getText()))) {
                                Editable text3 = registerFragment.u0().f29754I.getText();
                                if (text3 == null || text3.length() == 0) {
                                    AbstractC1465w5 u04 = registerFragment.u0();
                                    u04.f29753H.setError(registerFragment.getString(R.string.select_country));
                                    F8.o.b(registerFragment.u0().f29747B);
                                    registerFragment.u0().f29755J.setError(" ");
                                } else {
                                    if (Pattern.compile("^[123456789]\\d{4,}$").matcher(D9.b.q0(String.valueOf(registerFragment.u0().f29756K.getText()))).matches()) {
                                        String j02 = D9.b.j0(registerFragment.requireContext(), String.valueOf(registerFragment.u0().f29752G.getText()));
                                        if (j02.length() > 0) {
                                            registerFragment.u0().f29751F.setError(j02);
                                            registerFragment.u0().f29752G.requestFocus();
                                            F8.o.b(registerFragment.u0().f29769z);
                                        } else if (kotlin.jvm.internal.f.b(String.valueOf(registerFragment.u0().f29764u.getText()), String.valueOf(registerFragment.u0().f29752G.getText()))) {
                                            Date date = registerFragment.f11667p0;
                                            if (date == null) {
                                                AbstractC1465w5 u05 = registerFragment.u0();
                                                u05.f29757n.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.date_of_birth)));
                                            } else {
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.add(1, -18);
                                                if (date.before(calendar.getTime())) {
                                                    AbstractC1465w5 u06 = registerFragment.u0();
                                                    boolean z10 = registerFragment.f11670t0;
                                                    CustomTextInputEditText customTextInputEditText = u06.f29752G;
                                                    CustomTextInputEditText customTextInputEditText2 = u06.f29756K;
                                                    CustomTextInputEditText customTextInputEditText3 = u06.f29766w;
                                                    CustomTextInputEditText customTextInputEditText4 = u06.f29748C;
                                                    CustomTextInputEditText customTextInputEditText5 = u06.f29768y;
                                                    if (z10) {
                                                        w U02 = registerFragment.U0();
                                                        v vVar = new v(U02, String.valueOf(customTextInputEditText5.getText()), String.valueOf(customTextInputEditText4.getText()), String.valueOf(customTextInputEditText3.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText2.getText())), String.valueOf(customTextInputEditText.getText()), registerFragment.f11667p0, null, null, null, null, null, null, null, null);
                                                        U02.f2691D1 = vVar;
                                                        vVar.invoke();
                                                    } else {
                                                        w U03 = registerFragment.U0();
                                                        s sVar = new s(U03, String.valueOf(customTextInputEditText5.getText()), String.valueOf(customTextInputEditText4.getText()), String.valueOf(customTextInputEditText3.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText2.getText())), String.valueOf(customTextInputEditText.getText()), registerFragment.f11667p0, 0);
                                                        U03.f418J0 = sVar;
                                                        sVar.invoke();
                                                    }
                                                } else {
                                                    BottomDialogType.a aVar = BottomDialogType.f13289k;
                                                    registerFragment.requireContext();
                                                    aVar.getClass();
                                                    BottomDialogType b9 = BottomDialogType.a.b();
                                                    b9.f13295a = registerFragment.getString(R.string.you_must_be_at_least_18_year_old);
                                                    a.C0010a.a(registerFragment.w0(), b9, null, 6);
                                                }
                                            }
                                        } else {
                                            AbstractC1465w5 u07 = registerFragment.u0();
                                            u07.f29763t.setError(registerFragment.getString(R.string.password_mismatch));
                                            registerFragment.u0().f29764u.requestFocus();
                                            F8.o.b(registerFragment.u0().f29746A);
                                        }
                                    } else {
                                        AbstractC1465w5 u08 = registerFragment.u0();
                                        u08.f29755J.setError(registerFragment.getString(R.string.invalid_phone));
                                        registerFragment.u0().f29756K.requestFocus();
                                    }
                                }
                            } else {
                                AbstractC1465w5 u09 = registerFragment.u0();
                                u09.f29765v.setError(registerFragment.getString(R.string.invalid_email));
                                registerFragment.u0().f29766w.requestFocus();
                            }
                        }
                        break;
                    case 2:
                        this.f2622b.u0().f29759p.callOnClick();
                        break;
                    case 3:
                        RegisterFragment registerFragment2 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText6 = registerFragment2.u0().f29764u;
                        if (customTextInputEditText6.getInputType() == 225) {
                            customTextInputEditText6.setInputType(145);
                            customTextInputEditText6.e();
                            i102 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText6.setInputType(225);
                            customTextInputEditText6.e();
                            i102 = R.drawable.ic_eye_c;
                        }
                        registerFragment2.u0().f29746A.setImageResource(i102);
                        break;
                    default:
                        RegisterFragment registerFragment3 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText7 = registerFragment3.u0().f29752G;
                        if (customTextInputEditText7.getInputType() == 225) {
                            customTextInputEditText7.setInputType(145);
                            customTextInputEditText7.e();
                            i112 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText7.setInputType(225);
                            customTextInputEditText7.e();
                            i112 = R.drawable.ic_eye_c;
                        }
                        registerFragment3.u0().f29769z.setImageResource(i112);
                        break;
                }
                return O9.p.f3034a;
            }
        });
        AbstractC1465w5 u02 = u0();
        a aVar = new a();
        CustomTextInputEditText customTextInputEditText = u02.f29768y;
        customTextInputEditText.addTextChangedListener(aVar);
        final int i13 = 0;
        customTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i13) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        b bVar = new b();
        CustomTextInputEditText customTextInputEditText2 = u02.f29748C;
        customTextInputEditText2.addTextChangedListener(bVar);
        final int i14 = 1;
        customTextInputEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i14) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        c cVar = new c();
        CustomTextInputEditText customTextInputEditText3 = u02.f29766w;
        customTextInputEditText3.addTextChangedListener(cVar);
        final int i15 = 2;
        customTextInputEditText3.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i15) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        d dVar = new d();
        CustomTextInputEditText customTextInputEditText4 = u02.f29756K;
        customTextInputEditText4.addTextChangedListener(dVar);
        final int i16 = 3;
        customTextInputEditText4.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i16) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        e eVar = new e();
        CustomTextInputEditText customTextInputEditText5 = u02.f29752G;
        customTextInputEditText5.addTextChangedListener(eVar);
        final int i17 = 4;
        customTextInputEditText5.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i17) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        f fVar = new f();
        CustomTextInputEditText customTextInputEditText6 = u02.f29764u;
        customTextInputEditText6.addTextChangedListener(fVar);
        final int i18 = 5;
        customTextInputEditText6.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i18) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        g gVar = new g();
        CustomTextInputEditText customTextInputEditText7 = u02.f29758o;
        customTextInputEditText7.addTextChangedListener(gVar);
        final int i19 = 6;
        customTextInputEditText7.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: M6.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2624b;

            {
                this.f2624b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                switch (i19) {
                    case 0:
                        if (!z10) {
                            this.f2624b.Z0();
                            break;
                        }
                        break;
                    case 1:
                        if (!z10) {
                            this.f2624b.a1();
                            break;
                        }
                        break;
                    case 2:
                        if (!z10) {
                            this.f2624b.Y0();
                            break;
                        }
                        break;
                    case 3:
                        if (!z10) {
                            this.f2624b.c1();
                            break;
                        }
                        break;
                    case 4:
                        if (!z10) {
                            RegisterFragment registerFragment = this.f2624b;
                            registerFragment.b1();
                            registerFragment.X0();
                            break;
                        }
                        break;
                    case 5:
                        if (!z10) {
                            this.f2624b.X0();
                            break;
                        }
                        break;
                    default:
                        if (!z10) {
                            this.f2624b.W0();
                            break;
                        }
                        break;
                }
            }
        });
        u02.f29761r.setOnCheckedChangeListener(new C2.a(this, 1));
        AbstractC1465w5 u03 = u0();
        final int i20 = 0;
        final int i21 = 1;
        Pair[] pairArr = {new Pair("Privacy Policy", new View.OnClickListener(this) { // from class: M6.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2626b;

            {
                this.f2626b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        RegisterFragment registerFragment = this.f2626b;
                        G5.a l10 = registerFragment.U0().f2702c1.l();
                        registerFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(l10 != null ? l10.f1322c : null)));
                        break;
                    default:
                        RegisterFragment registerFragment2 = this.f2626b;
                        G5.a l11 = registerFragment2.U0().f2702c1.l();
                        registerFragment2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(l11 != null ? l11.f1323d : null)));
                        break;
                }
            }
        }), new Pair("Terms & Conditions", new View.OnClickListener(this) { // from class: M6.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2626b;

            {
                this.f2626b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i21) {
                    case 0:
                        RegisterFragment registerFragment = this.f2626b;
                        G5.a l10 = registerFragment.U0().f2702c1.l();
                        registerFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(l10 != null ? l10.f1322c : null)));
                        break;
                    default:
                        RegisterFragment registerFragment2 = this.f2626b;
                        G5.a l11 = registerFragment2.U0().f2702c1.l();
                        registerFragment2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(l11 != null ? l11.f1323d : null)));
                        break;
                }
            }
        })};
        TextView textView = u03.f29762s;
        SpannableString spannableString = new SpannableString(textView.getText());
        int i22 = -1;
        for (int i23 = 0; i23 < 2; i23++) {
            Pair pair = pairArr[i23];
            n nVar = new n(textView, pair);
            i22 = C0969n.g0(textView.getText().toString(), (String) pair.f23089a, i22 + 1, false, 4);
            if (i22 != -1) {
                spannableString.setSpan(nVar, i22, ((String) pair.f23089a).length() + i22, 33);
            }
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        final int i24 = 3;
        o.c(u0().f29746A, 500L, new InterfaceC0635a(this) { // from class: M6.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2622b;

            {
                this.f2622b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                int i102;
                int i112;
                switch (i24) {
                    case 0:
                        NavController g10 = U4.b.g(this.f2622b);
                        g10.i(R.id.action_registerFragment_to_countrySelectFragment, C.v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                    case 1:
                        RegisterFragment registerFragment = this.f2622b;
                        registerFragment.V0();
                        Editable text = registerFragment.u0().f29768y.getText();
                        if (text == null || text.length() == 0) {
                            AbstractC1465w5 u022 = registerFragment.u0();
                            u022.f29767x.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.first_name)));
                            registerFragment.u0().f29768y.requestFocus();
                        } else {
                            Editable text2 = registerFragment.u0().f29748C.getText();
                            if (text2 == null || text2.length() == 0) {
                                AbstractC1465w5 u032 = registerFragment.u0();
                                u032.f29749D.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.last_name)));
                                registerFragment.u0().f29748C.requestFocus();
                            } else if (D9.b.h0(String.valueOf(registerFragment.u0().f29766w.getText()))) {
                                Editable text3 = registerFragment.u0().f29754I.getText();
                                if (text3 == null || text3.length() == 0) {
                                    AbstractC1465w5 u04 = registerFragment.u0();
                                    u04.f29753H.setError(registerFragment.getString(R.string.select_country));
                                    F8.o.b(registerFragment.u0().f29747B);
                                    registerFragment.u0().f29755J.setError(" ");
                                } else {
                                    if (Pattern.compile("^[123456789]\\d{4,}$").matcher(D9.b.q0(String.valueOf(registerFragment.u0().f29756K.getText()))).matches()) {
                                        String j02 = D9.b.j0(registerFragment.requireContext(), String.valueOf(registerFragment.u0().f29752G.getText()));
                                        if (j02.length() > 0) {
                                            registerFragment.u0().f29751F.setError(j02);
                                            registerFragment.u0().f29752G.requestFocus();
                                            F8.o.b(registerFragment.u0().f29769z);
                                        } else if (kotlin.jvm.internal.f.b(String.valueOf(registerFragment.u0().f29764u.getText()), String.valueOf(registerFragment.u0().f29752G.getText()))) {
                                            Date date = registerFragment.f11667p0;
                                            if (date == null) {
                                                AbstractC1465w5 u05 = registerFragment.u0();
                                                u05.f29757n.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.date_of_birth)));
                                            } else {
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.add(1, -18);
                                                if (date.before(calendar.getTime())) {
                                                    AbstractC1465w5 u06 = registerFragment.u0();
                                                    boolean z10 = registerFragment.f11670t0;
                                                    CustomTextInputEditText customTextInputEditText8 = u06.f29752G;
                                                    CustomTextInputEditText customTextInputEditText22 = u06.f29756K;
                                                    CustomTextInputEditText customTextInputEditText32 = u06.f29766w;
                                                    CustomTextInputEditText customTextInputEditText42 = u06.f29748C;
                                                    CustomTextInputEditText customTextInputEditText52 = u06.f29768y;
                                                    if (z10) {
                                                        w U02 = registerFragment.U0();
                                                        v vVar = new v(U02, String.valueOf(customTextInputEditText52.getText()), String.valueOf(customTextInputEditText42.getText()), String.valueOf(customTextInputEditText32.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText22.getText())), String.valueOf(customTextInputEditText8.getText()), registerFragment.f11667p0, null, null, null, null, null, null, null, null);
                                                        U02.f2691D1 = vVar;
                                                        vVar.invoke();
                                                    } else {
                                                        w U03 = registerFragment.U0();
                                                        s sVar = new s(U03, String.valueOf(customTextInputEditText52.getText()), String.valueOf(customTextInputEditText42.getText()), String.valueOf(customTextInputEditText32.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText22.getText())), String.valueOf(customTextInputEditText8.getText()), registerFragment.f11667p0, 0);
                                                        U03.f418J0 = sVar;
                                                        sVar.invoke();
                                                    }
                                                } else {
                                                    BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                                                    registerFragment.requireContext();
                                                    aVar2.getClass();
                                                    BottomDialogType b9 = BottomDialogType.a.b();
                                                    b9.f13295a = registerFragment.getString(R.string.you_must_be_at_least_18_year_old);
                                                    a.C0010a.a(registerFragment.w0(), b9, null, 6);
                                                }
                                            }
                                        } else {
                                            AbstractC1465w5 u07 = registerFragment.u0();
                                            u07.f29763t.setError(registerFragment.getString(R.string.password_mismatch));
                                            registerFragment.u0().f29764u.requestFocus();
                                            F8.o.b(registerFragment.u0().f29746A);
                                        }
                                    } else {
                                        AbstractC1465w5 u08 = registerFragment.u0();
                                        u08.f29755J.setError(registerFragment.getString(R.string.invalid_phone));
                                        registerFragment.u0().f29756K.requestFocus();
                                    }
                                }
                            } else {
                                AbstractC1465w5 u09 = registerFragment.u0();
                                u09.f29765v.setError(registerFragment.getString(R.string.invalid_email));
                                registerFragment.u0().f29766w.requestFocus();
                            }
                        }
                        break;
                    case 2:
                        this.f2622b.u0().f29759p.callOnClick();
                        break;
                    case 3:
                        RegisterFragment registerFragment2 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText62 = registerFragment2.u0().f29764u;
                        if (customTextInputEditText62.getInputType() == 225) {
                            customTextInputEditText62.setInputType(145);
                            customTextInputEditText62.e();
                            i102 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText62.setInputType(225);
                            customTextInputEditText62.e();
                            i102 = R.drawable.ic_eye_c;
                        }
                        registerFragment2.u0().f29746A.setImageResource(i102);
                        break;
                    default:
                        RegisterFragment registerFragment3 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText72 = registerFragment3.u0().f29752G;
                        if (customTextInputEditText72.getInputType() == 225) {
                            customTextInputEditText72.setInputType(145);
                            customTextInputEditText72.e();
                            i112 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText72.setInputType(225);
                            customTextInputEditText72.e();
                            i112 = R.drawable.ic_eye_c;
                        }
                        registerFragment3.u0().f29769z.setImageResource(i112);
                        break;
                }
                return O9.p.f3034a;
            }
        });
        final int i25 = 4;
        o.c(u0().f29769z, 500L, new InterfaceC0635a(this) { // from class: M6.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterFragment f2622b;

            {
                this.f2622b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                int i102;
                int i112;
                switch (i25) {
                    case 0:
                        NavController g10 = U4.b.g(this.f2622b);
                        g10.i(R.id.action_registerFragment_to_countrySelectFragment, C.v.h(g10, "isCountryCode", true, "fieldName", ""));
                        break;
                    case 1:
                        RegisterFragment registerFragment = this.f2622b;
                        registerFragment.V0();
                        Editable text = registerFragment.u0().f29768y.getText();
                        if (text == null || text.length() == 0) {
                            AbstractC1465w5 u022 = registerFragment.u0();
                            u022.f29767x.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.first_name)));
                            registerFragment.u0().f29768y.requestFocus();
                        } else {
                            Editable text2 = registerFragment.u0().f29748C.getText();
                            if (text2 == null || text2.length() == 0) {
                                AbstractC1465w5 u032 = registerFragment.u0();
                                u032.f29749D.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.last_name)));
                                registerFragment.u0().f29748C.requestFocus();
                            } else if (D9.b.h0(String.valueOf(registerFragment.u0().f29766w.getText()))) {
                                Editable text3 = registerFragment.u0().f29754I.getText();
                                if (text3 == null || text3.length() == 0) {
                                    AbstractC1465w5 u04 = registerFragment.u0();
                                    u04.f29753H.setError(registerFragment.getString(R.string.select_country));
                                    F8.o.b(registerFragment.u0().f29747B);
                                    registerFragment.u0().f29755J.setError(" ");
                                } else {
                                    if (Pattern.compile("^[123456789]\\d{4,}$").matcher(D9.b.q0(String.valueOf(registerFragment.u0().f29756K.getText()))).matches()) {
                                        String j02 = D9.b.j0(registerFragment.requireContext(), String.valueOf(registerFragment.u0().f29752G.getText()));
                                        if (j02.length() > 0) {
                                            registerFragment.u0().f29751F.setError(j02);
                                            registerFragment.u0().f29752G.requestFocus();
                                            F8.o.b(registerFragment.u0().f29769z);
                                        } else if (kotlin.jvm.internal.f.b(String.valueOf(registerFragment.u0().f29764u.getText()), String.valueOf(registerFragment.u0().f29752G.getText()))) {
                                            Date date = registerFragment.f11667p0;
                                            if (date == null) {
                                                AbstractC1465w5 u05 = registerFragment.u0();
                                                u05.f29757n.setError(registerFragment.getString(R.string.enter_value, registerFragment.getString(R.string.date_of_birth)));
                                            } else {
                                                Calendar calendar = Calendar.getInstance();
                                                calendar.add(1, -18);
                                                if (date.before(calendar.getTime())) {
                                                    AbstractC1465w5 u06 = registerFragment.u0();
                                                    boolean z10 = registerFragment.f11670t0;
                                                    CustomTextInputEditText customTextInputEditText8 = u06.f29752G;
                                                    CustomTextInputEditText customTextInputEditText22 = u06.f29756K;
                                                    CustomTextInputEditText customTextInputEditText32 = u06.f29766w;
                                                    CustomTextInputEditText customTextInputEditText42 = u06.f29748C;
                                                    CustomTextInputEditText customTextInputEditText52 = u06.f29768y;
                                                    if (z10) {
                                                        w U02 = registerFragment.U0();
                                                        v vVar = new v(U02, String.valueOf(customTextInputEditText52.getText()), String.valueOf(customTextInputEditText42.getText()), String.valueOf(customTextInputEditText32.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText22.getText())), String.valueOf(customTextInputEditText8.getText()), registerFragment.f11667p0, null, null, null, null, null, null, null, null);
                                                        U02.f2691D1 = vVar;
                                                        vVar.invoke();
                                                    } else {
                                                        w U03 = registerFragment.U0();
                                                        s sVar = new s(U03, String.valueOf(customTextInputEditText52.getText()), String.valueOf(customTextInputEditText42.getText()), String.valueOf(customTextInputEditText32.getText()), registerFragment.f11668q0, D9.b.q0(String.valueOf(customTextInputEditText22.getText())), String.valueOf(customTextInputEditText8.getText()), registerFragment.f11667p0, 0);
                                                        U03.f418J0 = sVar;
                                                        sVar.invoke();
                                                    }
                                                } else {
                                                    BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                                                    registerFragment.requireContext();
                                                    aVar2.getClass();
                                                    BottomDialogType b9 = BottomDialogType.a.b();
                                                    b9.f13295a = registerFragment.getString(R.string.you_must_be_at_least_18_year_old);
                                                    a.C0010a.a(registerFragment.w0(), b9, null, 6);
                                                }
                                            }
                                        } else {
                                            AbstractC1465w5 u07 = registerFragment.u0();
                                            u07.f29763t.setError(registerFragment.getString(R.string.password_mismatch));
                                            registerFragment.u0().f29764u.requestFocus();
                                            F8.o.b(registerFragment.u0().f29746A);
                                        }
                                    } else {
                                        AbstractC1465w5 u08 = registerFragment.u0();
                                        u08.f29755J.setError(registerFragment.getString(R.string.invalid_phone));
                                        registerFragment.u0().f29756K.requestFocus();
                                    }
                                }
                            } else {
                                AbstractC1465w5 u09 = registerFragment.u0();
                                u09.f29765v.setError(registerFragment.getString(R.string.invalid_email));
                                registerFragment.u0().f29766w.requestFocus();
                            }
                        }
                        break;
                    case 2:
                        this.f2622b.u0().f29759p.callOnClick();
                        break;
                    case 3:
                        RegisterFragment registerFragment2 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText62 = registerFragment2.u0().f29764u;
                        if (customTextInputEditText62.getInputType() == 225) {
                            customTextInputEditText62.setInputType(145);
                            customTextInputEditText62.e();
                            i102 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText62.setInputType(225);
                            customTextInputEditText62.e();
                            i102 = R.drawable.ic_eye_c;
                        }
                        registerFragment2.u0().f29746A.setImageResource(i102);
                        break;
                    default:
                        RegisterFragment registerFragment3 = this.f2622b;
                        CustomTextInputEditText customTextInputEditText72 = registerFragment3.u0().f29752G;
                        if (customTextInputEditText72.getInputType() == 225) {
                            customTextInputEditText72.setInputType(145);
                            customTextInputEditText72.e();
                            i112 = R.drawable.ic_eye;
                        } else {
                            customTextInputEditText72.setInputType(225);
                            customTextInputEditText72.e();
                            i112 = R.drawable.ic_eye_c;
                        }
                        registerFragment3.u0().f29769z.setImageResource(i112);
                        break;
                }
                return O9.p.f3034a;
            }
        });
        u0().f29750E.setOnScrollChangeListener(new j(this, 0));
        V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11665n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29759p.setVisibility(0);
        o.b(u0().f29760q);
        this.f11669r0 = false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29759p);
        u0().f29760q.setVisibility(0);
        this.f11669r0 = true;
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.Z0();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.a1();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.Y0();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.c1();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.b1();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterFragment registerFragment = RegisterFragment.this;
            registerFragment.X0();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            int length = String.valueOf(charSequence).length();
            RegisterFragment registerFragment = RegisterFragment.this;
            if (length == 10) {
                String valueOf = String.valueOf(charSequence);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                Date parse = simpleDateFormat.parse(valueOf);
                if (parse != null) {
                    registerFragment.f11667p0 = parse;
                }
            } else {
                registerFragment.f11667p0 = null;
            }
            registerFragment.W0();
            registerFragment.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
