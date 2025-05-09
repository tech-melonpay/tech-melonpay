package com.luminary.business.presentation.ui.fragments.createnewaccount;

import F8.o;
import O9.p;
import U4.b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountController;
import com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import f7.C0748b;
import f7.ViewOnScrollChangeListenerC0749c;
import java.util.Locale;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1449u3;

/* compiled from: CreateNewAccountFragment.kt */
/* loaded from: classes2.dex */
public final class CreateNewAccountFragment extends BaseFragment<AbstractC1449u3> {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f11925r0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f11926n0 = R.layout.fragment_create_new_account;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11927o0;

    /* renamed from: p0, reason: collision with root package name */
    public CreateNewAccountController f11928p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11929q0;

    /* compiled from: CreateNewAccountFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11935a;

        public b(C0748b c0748b) {
            this.f11935a = c0748b;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11935a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11935a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountFragment$special$$inlined$viewModel$default$1] */
    public CreateNewAccountFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11927o0 = E.a(this, h.a(f7.f.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.createnewaccount.CreateNewAccountFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(f7.f.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.new_account);
        return toolbarStatus;
    }

    public final void T0() {
        boolean z10 = String.valueOf(u0().f29653q.getText()).length() > 0 && this.f11929q0 != null;
        u0().f29650n.setEnabled(z10);
        u0().f29651o.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = (f7.f) this.f11927o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f7.b] */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f11928p0 = new CreateNewAccountController(requireContext(), new InterfaceC0646l(this) { // from class: f7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewAccountFragment f20707b;

            {
                this.f20707b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        CreateNewAccountFragment createNewAccountFragment = this.f20707b;
                        createNewAccountFragment.f11929q0 = str;
                        CreateNewAccountController createNewAccountController = createNewAccountFragment.f11928p0;
                        if (createNewAccountController == null) {
                            createNewAccountController = null;
                        }
                        createNewAccountController.setData(str);
                        createNewAccountFragment.T0();
                        break;
                    default:
                        CreateNewAccountFragment createNewAccountFragment2 = this.f20707b;
                        String str2 = createNewAccountFragment2.f11929q0;
                        if (str2 != null) {
                            NavController g10 = U4.b.g(createNewAccountFragment2);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("type", str2);
                            g10.i(R.id.action_createNewAccountFragment_to_createNewAccountSuccessFragment, bundle2);
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        T0();
        final int i9 = 1;
        ((f7.f) this.f11927o0.getValue()).f20715V0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: f7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewAccountFragment f20707b;

            {
                this.f20707b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        CreateNewAccountFragment createNewAccountFragment = this.f20707b;
                        createNewAccountFragment.f11929q0 = str;
                        CreateNewAccountController createNewAccountController = createNewAccountFragment.f11928p0;
                        if (createNewAccountController == null) {
                            createNewAccountController = null;
                        }
                        createNewAccountController.setData(str);
                        createNewAccountFragment.T0();
                        break;
                    default:
                        CreateNewAccountFragment createNewAccountFragment2 = this.f20707b;
                        String str2 = createNewAccountFragment2.f11929q0;
                        if (str2 != null) {
                            NavController g10 = U4.b.g(createNewAccountFragment2);
                            g10.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("type", str2);
                            g10.i(R.id.action_createNewAccountFragment_to_createNewAccountSuccessFragment, bundle2);
                        }
                        break;
                }
                return p.f3034a;
            }
        }));
        u0().f29652p.setLayoutManager(new CreateNewAccountFragment$onViewCreated$3(requireContext(), 1, false));
        AbstractC1449u3 u02 = u0();
        CreateNewAccountController createNewAccountController = this.f11928p0;
        if (createNewAccountController == null) {
            createNewAccountController = null;
        }
        u02.f29652p.setAdapter(createNewAccountController.getAdapter());
        CreateNewAccountController createNewAccountController2 = this.f11928p0;
        (createNewAccountController2 != null ? createNewAccountController2 : null).setData(this.f11929q0);
        u0().f29653q.addTextChangedListener(new a());
        u0().f29652p.setOnScrollChangeListener(new ViewOnScrollChangeListenerC0749c(0));
        final int i10 = 0;
        o.c(u0().f29650n, 500L, new InterfaceC0635a(this) { // from class: f7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewAccountFragment f20710b;

            {
                this.f20710b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        CreateNewAccountFragment createNewAccountFragment = this.f20710b;
                        String str = createNewAccountFragment.f11929q0;
                        if (str != null) {
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            String valueOf = String.valueOf(createNewAccountFragment.u0().f29653q.getText());
                            if (upperCase.length() > 0 && valueOf.length() > 0) {
                                f fVar = (f) createNewAccountFragment.f11927o0.getValue();
                                D7.e eVar = new D7.e(upperCase, valueOf, 3, fVar);
                                fVar.f418J0 = eVar;
                                eVar.invoke();
                            }
                        }
                        break;
                    default:
                        this.f20710b.u0().f29650n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i11 = 1;
        o.c(u0().f29651o, 500L, new InterfaceC0635a(this) { // from class: f7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateNewAccountFragment f20710b;

            {
                this.f20710b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        CreateNewAccountFragment createNewAccountFragment = this.f20710b;
                        String str = createNewAccountFragment.f11929q0;
                        if (str != null) {
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            String valueOf = String.valueOf(createNewAccountFragment.u0().f29653q.getText());
                            if (upperCase.length() > 0 && valueOf.length() > 0) {
                                f fVar = (f) createNewAccountFragment.f11927o0.getValue();
                                D7.e eVar = new D7.e(upperCase, valueOf, 3, fVar);
                                fVar.f418J0 = eVar;
                                eVar.invoke();
                            }
                        }
                        break;
                    default:
                        this.f20710b.u0().f29650n.callOnClick();
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11926n0;
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CreateNewAccountFragment.this.T0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
