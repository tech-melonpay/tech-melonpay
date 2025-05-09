package com.luminary.business.presentation.ui.fragments.auth.register.validation;

import F8.o;
import Fa.h;
import M6.l;
import M6.w;
import U4.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.camera.core.impl.utils.a;
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
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import t6.t6;
import y8.DialogC1630k;

/* compiled from: ValidationFragment.kt */
/* loaded from: classes2.dex */
public final class ValidationFragment extends BaseFragment<t6> {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f11701x0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f11702n0 = R.layout.fragment_validation;

    /* renamed from: o0, reason: collision with root package name */
    public final h f11703o0 = new h(kotlin.jvm.internal.h.a(P6.c.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment$special$$inlined$navArgs$1
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

    /* renamed from: p0, reason: collision with root package name */
    public ValidationType f11704p0 = ValidationType.f11716a;

    /* renamed from: q0, reason: collision with root package name */
    public final H1.a f11705q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f11706r0;
    public final Handler s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f11707t0;

    /* renamed from: u0, reason: collision with root package name */
    public DialogC1630k f11708u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f11709v0;

    /* renamed from: w0, reason: collision with root package name */
    public final P6.a f11710w0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ValidationFragment.kt */
    public static final class ValidationType {

        /* renamed from: a, reason: collision with root package name */
        public static final ValidationType f11716a;

        /* renamed from: b, reason: collision with root package name */
        public static final ValidationType f11717b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ValidationType[] f11718c;

        static {
            ValidationType validationType = new ValidationType("Email", 0);
            f11716a = validationType;
            ValidationType validationType2 = new ValidationType("Phone", 1);
            f11717b = validationType2;
            f11718c = new ValidationType[]{validationType, validationType2, new ValidationType("Empty", 2)};
        }

        public ValidationType() {
            throw null;
        }

        public static ValidationType valueOf(String str) {
            return (ValidationType) Enum.valueOf(ValidationType.class, str);
        }

        public static ValidationType[] values() {
            return (ValidationType[]) f11718c.clone();
        }
    }

    /* compiled from: ValidationFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11719a;

        static {
            int[] iArr = new int[ValidationType.values().length];
            try {
                ValidationType validationType = ValidationType.f11716a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ValidationType validationType2 = ValidationType.f11716a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ValidationType validationType3 = ValidationType.f11716a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11719a = iArr;
        }
    }

    /* compiled from: ValidationFragment.kt */
    public static final class d implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11721a;

        public d(InterfaceC0646l interfaceC0646l) {
            this.f11721a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11721a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11721a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment$special$$inlined$viewModel$default$1] */
    public ValidationFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11705q0 = E.a(this, kotlin.jvm.internal.h.a(w.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.validation.ValidationFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(w.class), null, null, b.l(this));
            }
        });
        this.s0 = new Handler(Looper.getMainLooper());
        this.f11709v0 = true;
        this.f11710w0 = new P6.a(this, 0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final boolean C0() {
        ValidationType validationType = this.f11704p0;
        if (validationType == ValidationType.f11717b) {
            U4.b.g(this).l();
            return false;
        }
        if (validationType != ValidationType.f11716a) {
            return false;
        }
        U4.b.g(this).l();
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f11704p0.ordinal();
        if (ordinal == 0) {
            toolbarStatus.f13266d = T0().f3077a;
            if (U0().f2702c1.e()) {
                toolbarStatus.f13272k = Integer.valueOf(R.color.verified_color);
                string = getString(R.string.email_confirmed);
            } else {
                toolbarStatus.f13272k = Integer.valueOf(R.color.black);
                string = getString(R.string.confirm_email);
            }
        } else if (ordinal == 1) {
            toolbarStatus.f13266d = "\n";
            if (U0().f2702c1.A()) {
                toolbarStatus.f13272k = Integer.valueOf(R.color.verified_color);
                string = getString(R.string.phone_confirmed);
            } else {
                toolbarStatus.f13272k = Integer.valueOf(R.color.black);
                string = getString(R.string.confirm_phone);
            }
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarStatus.f13266d = getString(R.string.empty);
            string = getString(R.string.empty);
        }
        toolbarStatus.f13263a = string;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13267e = true;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        String string;
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f11704p0.ordinal();
        if (ordinal == 0) {
            string = getString(R.string.confirm_email);
        } else if (ordinal == 1) {
            string = getString(R.string.confirm_phone);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(R.string.empty);
        }
        toolbarStatus.f13263a = string;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final P6.c T0() {
        return (P6.c) this.f11703o0.getValue();
    }

    public final w U0() {
        return (w) this.f11705q0.getValue();
    }

    public final void V0() {
        NavController g10 = U4.b.g(this);
        String str = T0().f3077a;
        String str2 = T0().f3078b;
        String str3 = T0().f3079c;
        String str4 = T0().f3082f;
        g10.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("email", str);
        bundle.putString("phoneCode", str2);
        bundle.putString("phoneNumber", str3);
        bundle.putString("password", str4);
        g10.i(R.id.action_validationFragment_to_registerAddressFragment, bundle);
    }

    public final void W0() {
        if (getView() == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new ValidationFragment$showResendTimer$1(this, null), 2, null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            int i = T0().f3081e;
            if (i == 0) {
                this.f11704p0 = ValidationType.f11716a;
                return;
            }
            if (i == 1) {
                this.f11704p0 = ValidationType.f11717b;
            } else {
                if (i != 2) {
                    return;
                }
                w U02 = U0();
                l lVar = new l(U02, 0);
                U02.f423P0 = lVar;
                lVar.invoke();
            }
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        this.s0.removeCallbacks(new H6.c(3, this.f11710w0));
        super.onPause();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        W0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        E.b(this, "country", new B6.h(this, 5));
        u0().f29628u.setText(R.string.empty);
        o.b(u0().f29625r);
        int ordinal = this.f11704p0.ordinal();
        if (ordinal == 0) {
            if (T0().f3077a != null) {
                o.b(u0().f29623p);
                o.b(u0().f29626s);
                o.b(u0().f29629v);
                this.f11706r0 = 0;
                o.b(u0().f29631x);
                W0();
            }
            if (U0().f2702c1.e()) {
                u0().f29621n.setEnabled(true);
                u0().f29622o.setEnabled(true);
                o.b(u0().f29630w);
            } else {
                u0().f29621n.setEnabled(false);
                u0().f29622o.setEnabled(false);
                u0().f29630w.setVisibility(0);
            }
        } else if (ordinal == 1) {
            u0().f29623p.setVisibility(0);
            u0().f29626s.setVisibility(0);
            o.b(u0().f29629v);
            t6 u02 = u0();
            o.c(u02.f29624q, 500L, new P6.a(this, 1));
            String str = T0().f3078b;
            String str2 = T0().f3079c;
            t6 u03 = u0();
            u03.f29627t.setText(String.valueOf(str2));
            u0().f29627t.f();
            t6 u04 = u0();
            u04.f29626s.setHint(getString(R.string.phone_number));
            u0().f29627t.setEnabled(true);
            t6 u05 = u0();
            u05.f29624q.setText(s3.b.j("+", str));
            this.f11706r0 = 0;
            W0();
            if (U0().f2702c1.A()) {
                u0().f29621n.setEnabled(true);
                u0().f29622o.setEnabled(true);
                u0().f29626s.setEnabled(false);
                u0().f29623p.setEnabled(false);
                o.b(u0().f29630w);
            } else {
                u0().f29621n.setEnabled(false);
                u0().f29622o.setEnabled(false);
                u0().f29626s.setEnabled(true);
                u0().f29623p.setEnabled(true);
                u0().f29630w.setVisibility(0);
            }
            if (U0().n1.getValue() != null) {
                u0().f29627t.setText("null");
                u0().f29626s.setHint(getString(R.string.phone_number));
                u0().f29627t.setEnabled(true);
                this.f11706r0 = 0;
                W0();
            }
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            u0().f29625r.setVisibility(0);
        }
        L0();
        U0().f426S0.observe(getViewLifecycleOwner(), new d(new P6.b(this, 1)));
        U0().f2720v1.observe(getViewLifecycleOwner(), new d(new P6.b(this, 2)));
        U0().f2717s1.observe(getViewLifecycleOwner(), new d(new P6.b(this, 3)));
        w U02 = U0();
        U02.f2715q1.observe(getViewLifecycleOwner(), new d(new P6.b(this, 4)));
        U0().f2718t1.observe(getViewLifecycleOwner(), new d(new P6.b(this, 5)));
        t6 u06 = u0();
        u06.f29628u.addTextChangedListener(new c());
        t6 u07 = u0();
        o.c(u07.f29631x, 500L, new P6.a(this, 5));
        t6 u08 = u0();
        o.c(u08.f29630w, 500L, new P6.a(this, 6));
        t6 u09 = u0();
        o.c(u09.f29621n, 500L, new P6.a(this, 7));
        t6 u010 = u0();
        o.c(u010.f29622o, 500L, new P6.a(this, 8));
        t6 u011 = u0();
        u011.f29627t.addTextChangedListener(new b());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11702n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29621n.setVisibility(0);
        o.b(u0().f29622o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29621n);
        u0().f29622o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            ValidationFragment validationFragment = ValidationFragment.this;
            boolean z10 = false;
            validationFragment.u0().f29621n.setEnabled(charSequence != null && charSequence.length() == 5);
            t6 u02 = validationFragment.u0();
            if (charSequence != null && charSequence.length() == 5) {
                z10 = true;
            }
            u02.f29622o.setEnabled(z10);
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
