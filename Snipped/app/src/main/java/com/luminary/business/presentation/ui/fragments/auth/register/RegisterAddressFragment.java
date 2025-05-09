package com.luminary.business.presentation.ui.fragments.auth.register;

import F8.o;
import M6.w;
import U4.b;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import ka.C0969n;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;
import t6.AbstractC1451u5;

/* compiled from: RegisterAddressFragment.kt */
/* loaded from: classes2.dex */
public final class RegisterAddressFragment extends BaseFragment<AbstractC1451u5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f11629n0 = R.layout.fragment_register_address;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f11630o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f11631p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f11632q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Fa.h f11633r0;
    public NewCompanyViewModel.UploadFileType s0;

    /* renamed from: t0, reason: collision with root package name */
    public final FilePickerContractor f11634t0;

    /* renamed from: u0, reason: collision with root package name */
    public UploadFileUI f11635u0;

    /* renamed from: v0, reason: collision with root package name */
    public UploadFileUI f11636v0;

    /* renamed from: w0, reason: collision with root package name */
    public Uri f11637w0;

    /* renamed from: x0, reason: collision with root package name */
    public final AbstractC0704c<String> f11638x0;

    /* renamed from: y0, reason: collision with root package name */
    public final AbstractC0704c<String> f11639y0;

    /* renamed from: z0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f11640z0;

    /* compiled from: RegisterAddressFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11646a;

        static {
            int[] iArr = new int[NewCompanyViewModel.UploadFileType.values().length];
            try {
                NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.f12461a;
                iArr[12] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NewCompanyViewModel.UploadFileType uploadFileType2 = NewCompanyViewModel.UploadFileType.f12461a;
                iArr[10] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11646a = iArr;
        }
    }

    /* compiled from: RegisterAddressFragment.kt */
    public static final class k implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11664a;

        public k(InterfaceC0646l interfaceC0646l) {
            this.f11664a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11664a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11664a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment$special$$inlined$viewModel$default$1] */
    public RegisterAddressFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f11630o0 = E.a(this, kotlin.jvm.internal.h.a(w.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(w.class), null, null, b.l(this));
            }
        });
        this.f11633r0 = new Fa.h(kotlin.jvm.internal.h.a(M6.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment$special$$inlined$navArgs$1
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
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new RegisterAddressFragment$filePicker$1(1, this, RegisterAddressFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f11634t0 = filePickerContractor;
        final int i9 = 0;
        this.f11638x0 = registerForActivityResult(new f.g(), new InterfaceC0702a(this) { // from class: M6.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterAddressFragment f2608b;

            {
                this.f2608b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                RegisterAddressFragment registerAddressFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f2608b.f11639y0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            RegisterAddressFragment registerAddressFragment2 = this.f2608b;
                            registerAddressFragment2.f11637w0 = registerAddressFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", registerAddressFragment2.f11637w0);
                            registerAddressFragment2.f11640z0.a(registerAddressFragment2.f11637w0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (registerAddressFragment = this.f2608b).f11637w0) != null) {
                            registerAddressFragment.Y0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f11639y0 = registerForActivityResult(new f.g(), new InterfaceC0702a(this) { // from class: M6.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterAddressFragment f2608b;

            {
                this.f2608b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                RegisterAddressFragment registerAddressFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f2608b.f11639y0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            RegisterAddressFragment registerAddressFragment2 = this.f2608b;
                            registerAddressFragment2.f11637w0 = registerAddressFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", registerAddressFragment2.f11637w0);
                            registerAddressFragment2.f11640z0.a(registerAddressFragment2.f11637w0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (registerAddressFragment = this.f2608b).f11637w0) != null) {
                            registerAddressFragment.Y0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 2;
        this.f11640z0 = registerForActivityResult(new f.i(), new InterfaceC0702a(this) { // from class: M6.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterAddressFragment f2608b;

            {
                this.f2608b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                RegisterAddressFragment registerAddressFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i11) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f2608b.f11639y0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            RegisterAddressFragment registerAddressFragment2 = this.f2608b;
                            registerAddressFragment2.f11637w0 = registerAddressFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", registerAddressFragment2.f11637w0);
                            registerAddressFragment2.f11640z0.a(registerAddressFragment2.f11637w0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (registerAddressFragment = this.f2608b).f11637w0) != null) {
                            registerAddressFragment.Y0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static final void T0(RegisterAddressFragment registerAddressFragment, CustomTextInputLayout customTextInputLayout, CustomTextInputEditText customTextInputEditText, String str) {
        registerAddressFragment.getClass();
        Editable text = customTextInputEditText.getText();
        if (text == null || text.length() == 0) {
            customTextInputLayout.setErrorWithoutFocus(str);
        } else {
            customTextInputLayout.setError(null);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.personal_address);
        toolbarStatus.f13266d = getString(R.string.step_of, 3, 6);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.personal_address);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void U0() {
        boolean a12 = a1(false, false, false);
        u0().f29683s.setEnabled(a12);
        u0().f29684t.setEnabled(a12);
    }

    public final M6.d V0() {
        return (M6.d) this.f11633r0.getValue();
    }

    public final w W0() {
        return (w) this.f11630o0.getValue();
    }

    public final boolean X0() {
        return kotlin.jvm.internal.f.b(this.f11632q0, "gb");
    }

    public final void Y0(Uri uri, boolean z10) {
        String b9 = F8.e.b(requireActivity(), uri);
        NewCompanyViewModel.UploadFileType uploadFileType = this.s0;
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f11634t0.f13322b;
        }
        String c2 = F8.e.c(requireContext, uri);
        if (c2 != null) {
            int i9 = uploadFileType == null ? -1 : a.f11646a[uploadFileType.ordinal()];
            String str = null;
            if (i9 == 1) {
                this.f11635u0 = new UploadFileUI(c2, b9, NewCompanyViewModel.UploadFileType.f12468h, str);
                u0().f29666F.setText(b9);
                U0();
            } else {
                if (i9 != 2) {
                    return;
                }
                this.f11636v0 = new UploadFileUI(c2, b9, NewCompanyViewModel.UploadFileType.f12466f, str);
                u0().R.setText(b9);
                U0();
            }
        }
    }

    public final void Z0() {
        u0().f29674N.setError(null);
        u0().f29667G.setError(null);
        u0().f29670J.setError(null);
        u0().f29672L.setError(null);
        u0().f29687w.setError(null);
        u0().f29678n.setError(null);
        u0().f29685u.setError(null);
        u0().f29680p.setError(null);
        u0().f29661A.setError(null);
        u0().f29687w.setError(null);
        u0().f29665E.setError(null);
        u0().f29689y.setVisibility(0);
    }

    public final boolean a1(boolean z10, boolean z11, boolean z12) {
        CharSequence u02;
        if (z12) {
            Z0();
        }
        if (X0()) {
            Editable text = u0().f29688x.getText();
            CharSequence u03 = text != null ? C0969n.u0(text) : null;
            if (u03 == null || u03.length() == 0 || this.f11632q0 == null) {
                if (z11) {
                    u0().f29687w.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.country)));
                }
                if (z10) {
                    u0().f29688x.requestFocus();
                }
            } else {
                Editable text2 = u0().f29668H.getText();
                if (s3.b.w("^[^0-9]+$", String.valueOf(text2 != null ? C0969n.u0(text2) : null))) {
                    Editable text3 = u0().f29675O.getText();
                    CharSequence u04 = text3 != null ? C0969n.u0(text3) : null;
                    if (u04 == null || u04.length() == 0) {
                        if (z11) {
                            u0().f29674N.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.street_address)));
                        }
                        if (z10) {
                            u0().f29675O.requestFocus();
                        }
                    } else {
                        Editable text4 = u0().f29671K.getText();
                        CharSequence u05 = text4 != null ? C0969n.u0(text4) : null;
                        if (u05 == null || u05.length() == 0) {
                            if (z11) {
                                u0().f29670J.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.house_number)));
                            }
                            if (z10) {
                                u0().f29671K.requestFocus();
                            }
                        } else {
                            Editable text5 = u0().f29673M.getText();
                            u02 = text5 != null ? C0969n.u0(text5) : null;
                            if (u02 == null || u02.length() == 0) {
                                if (z11) {
                                    u0().f29672L.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.postal_code)));
                                }
                                if (z10) {
                                    u0().f29673M.requestFocus();
                                }
                            } else {
                                if (this.f11635u0 != null) {
                                    return true;
                                }
                                if (z11) {
                                    u0().f29665E.setErrorWithoutFocus(getString(R.string.choose_file));
                                }
                            }
                        }
                    }
                } else {
                    if (z11) {
                        u0().f29667G.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.city)));
                    }
                    if (z10) {
                        u0().f29668H.requestFocus();
                    }
                }
            }
        } else {
            Editable text6 = u0().f29688x.getText();
            CharSequence u06 = text6 != null ? C0969n.u0(text6) : null;
            if (u06 == null || u06.length() == 0 || this.f11632q0 == null) {
                if (z11) {
                    u0().f29687w.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.country)));
                }
                if (z10) {
                    u0().f29679o.requestFocus();
                }
            } else {
                Editable text7 = u0().f29679o.getText();
                CharSequence u07 = text7 != null ? C0969n.u0(text7) : null;
                if (u07 == null || u07.length() == 0) {
                    if (z11) {
                        u0().f29678n.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.text_address_line_1)));
                    }
                    if (z10) {
                        u0().f29681q.requestFocus();
                    }
                } else {
                    Editable text8 = u0().f29686v.getText();
                    if (s3.b.w("^[^0-9]+$", String.valueOf(text8 != null ? C0969n.u0(text8) : null))) {
                        Editable text9 = u0().f29662B.getText();
                        u02 = text9 != null ? C0969n.u0(text9) : null;
                        if (u02 == null || u02.length() == 0) {
                            if (z11) {
                                u0().f29661A.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.postal_code)));
                            }
                        } else {
                            if (this.f11635u0 != null) {
                                return true;
                            }
                            if (z11) {
                                u0().f29665E.setErrorWithoutFocus(getString(R.string.choose_file));
                            }
                        }
                    } else {
                        if (z11) {
                            u0().f29685u.setErrorWithoutFocus(getString(R.string.enter_value, getString(R.string.city)));
                        }
                        if (z10) {
                            u0().f29686v.requestFocus();
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"RestrictedApi"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        W0().m(false);
        final int i9 = 0;
        W0().n1.observe(getViewLifecycleOwner(), new k(new InterfaceC0646l(this) { // from class: M6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterAddressFragment f2604b;

            {
                this.f2604b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                switch (i9) {
                    case 0:
                        RegisterAddressFragment registerAddressFragment = this.f2604b;
                        U4.b.g(registerAddressFragment).j(new e(registerAddressFragment.V0().f2609a, registerAddressFragment.V0().f2610b, registerAddressFragment.V0().f2611c, registerAddressFragment.W0().h0(), 0, registerAddressFragment.V0().f2612d));
                        break;
                    case 1:
                        this.f2604b.getClass();
                        break;
                    default:
                        I5.k kVar = (I5.k) obj;
                        if (kVar != null) {
                            RegisterAddressFragment registerAddressFragment2 = this.f2604b;
                            String str3 = kVar.f1817c;
                            if (str3 != null && str3.length() != 0 && (str = kVar.f1821e) != null && str.length() != 0 && (str2 = kVar.f1823f) != null && str2.length() != 0) {
                                U4.b.g(registerAddressFragment2).j(new e(registerAddressFragment2.V0().f2609a, registerAddressFragment2.V0().f2610b, registerAddressFragment2.V0().f2611c, registerAddressFragment2.W0().h0(), 1, registerAddressFragment2.V0().f2612d));
                            }
                            registerAddressFragment2.W0().f2710k1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return O9.p.f3034a;
            }
        }));
        final int i10 = 1;
        W0().f426S0.observe(getViewLifecycleOwner(), new k(new InterfaceC0646l(this) { // from class: M6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterAddressFragment f2604b;

            {
                this.f2604b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                switch (i10) {
                    case 0:
                        RegisterAddressFragment registerAddressFragment = this.f2604b;
                        U4.b.g(registerAddressFragment).j(new e(registerAddressFragment.V0().f2609a, registerAddressFragment.V0().f2610b, registerAddressFragment.V0().f2611c, registerAddressFragment.W0().h0(), 0, registerAddressFragment.V0().f2612d));
                        break;
                    case 1:
                        this.f2604b.getClass();
                        break;
                    default:
                        I5.k kVar = (I5.k) obj;
                        if (kVar != null) {
                            RegisterAddressFragment registerAddressFragment2 = this.f2604b;
                            String str3 = kVar.f1817c;
                            if (str3 != null && str3.length() != 0 && (str = kVar.f1821e) != null && str.length() != 0 && (str2 = kVar.f1823f) != null && str2.length() != 0) {
                                U4.b.g(registerAddressFragment2).j(new e(registerAddressFragment2.V0().f2609a, registerAddressFragment2.V0().f2610b, registerAddressFragment2.V0().f2611c, registerAddressFragment2.W0().h0(), 1, registerAddressFragment2.V0().f2612d));
                            }
                            registerAddressFragment2.W0().f2710k1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return O9.p.f3034a;
            }
        }));
        final int i11 = 2;
        W0().f2710k1.observe(getViewLifecycleOwner(), new k(new InterfaceC0646l(this) { // from class: M6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RegisterAddressFragment f2604b;

            {
                this.f2604b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                String str2;
                switch (i11) {
                    case 0:
                        RegisterAddressFragment registerAddressFragment = this.f2604b;
                        U4.b.g(registerAddressFragment).j(new e(registerAddressFragment.V0().f2609a, registerAddressFragment.V0().f2610b, registerAddressFragment.V0().f2611c, registerAddressFragment.W0().h0(), 0, registerAddressFragment.V0().f2612d));
                        break;
                    case 1:
                        this.f2604b.getClass();
                        break;
                    default:
                        I5.k kVar = (I5.k) obj;
                        if (kVar != null) {
                            RegisterAddressFragment registerAddressFragment2 = this.f2604b;
                            String str3 = kVar.f1817c;
                            if (str3 != null && str3.length() != 0 && (str = kVar.f1821e) != null && str.length() != 0 && (str2 = kVar.f1823f) != null && str2.length() != 0) {
                                U4.b.g(registerAddressFragment2).j(new e(registerAddressFragment2.V0().f2609a, registerAddressFragment2.V0().f2610b, registerAddressFragment2.V0().f2611c, registerAddressFragment2.W0().h0(), 1, registerAddressFragment2.V0().f2612d));
                            }
                            registerAddressFragment2.W0().f2710k1.postValue(null);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return O9.p.f3034a;
            }
        }));
        E.b(this, "country", new B6.h(this, 3));
        AbstractC1451u5 u02 = u0();
        o.c(u02.R, 500L, new M6.b(this, 5));
        AbstractC1451u5 u03 = u0();
        o.c(u03.f29666F, 500L, new M6.b(this, 6));
        AbstractC1451u5 u04 = u0();
        o.c(u04.f29663C, 500L, new M6.b(this, 7));
        AbstractC1451u5 u05 = u0();
        o.c(u05.f29676P, 500L, new M6.b(this, 8));
        AbstractC1451u5 u06 = u0();
        o.c(u06.f29688x, 500L, new M6.b(this, 9));
        if (this.f11631p0 != null) {
            if (X0()) {
                u0().f29669I.setVisibility(0);
                o.b(u0().f29682r);
            } else {
                o.b(u0().f29669I);
                u0().f29682r.setVisibility(0);
            }
        }
        AbstractC1451u5 u07 = u0();
        o.c(u07.f29683s, 500L, new M6.b(this, 0));
        AbstractC1451u5 u08 = u0();
        o.c(u08.f29684t, 500L, new M6.b(this, 4));
        AbstractC1451u5 u09 = u0();
        u09.f29688x.addTextChangedListener(new b(u09));
        u09.f29668H.addTextChangedListener(new c(u09));
        u09.f29671K.addTextChangedListener(new d(u09));
        u09.f29675O.addTextChangedListener(new e(u09));
        u09.f29673M.addTextChangedListener(new f(u09));
        u09.f29686v.addTextChangedListener(new g(u09));
        u09.f29679o.addTextChangedListener(new h(u09));
        u09.f29681q.addTextChangedListener(new i());
        u09.f29662B.addTextChangedListener(new j(u09));
        String str = this.f11632q0;
        if (str != null && str.length() != 0) {
            u0().S.setVisibility(0);
            if (X0()) {
                u0().S.setDisplayedChild(0);
            } else {
                u0().S.setDisplayedChild(1);
            }
        }
        Z0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f11629n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f29683s.setVisibility(0);
        o.b(u0().f29684t);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29683s);
        u0().f29684t.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11648b;

        public b(AbstractC1451u5 abstractC1451u5) {
            this.f11648b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11648b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29687w, abstractC1451u5.f29688x, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.country)));
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

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11650b;

        public c(AbstractC1451u5 abstractC1451u5) {
            this.f11650b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11650b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29667G, abstractC1451u5.f29668H, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.city)));
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

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11652b;

        public d(AbstractC1451u5 abstractC1451u5) {
            this.f11652b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11652b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29670J, abstractC1451u5.f29671K, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.house_number)));
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

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11654b;

        public e(AbstractC1451u5 abstractC1451u5) {
            this.f11654b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11654b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29674N, abstractC1451u5.f29675O, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.street_address)));
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

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11656b;

        public f(AbstractC1451u5 abstractC1451u5) {
            this.f11656b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11656b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29672L, abstractC1451u5.f29673M, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.postal_code)));
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

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11658b;

        public g(AbstractC1451u5 abstractC1451u5) {
            this.f11658b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11658b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29685u, abstractC1451u5.f29686v, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.city)));
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class h implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11660b;

        public h(AbstractC1451u5 abstractC1451u5) {
            this.f11660b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11660b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29678n, abstractC1451u5.f29679o, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.text_address_line_1)));
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment.this.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class j implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1451u5 f11663b;

        public j(AbstractC1451u5 abstractC1451u5) {
            this.f11663b = abstractC1451u5;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            RegisterAddressFragment registerAddressFragment = RegisterAddressFragment.this;
            registerAddressFragment.U0();
            AbstractC1451u5 abstractC1451u5 = this.f11663b;
            RegisterAddressFragment.T0(registerAddressFragment, abstractC1451u5.f29661A, abstractC1451u5.f29662B, registerAddressFragment.getString(R.string.enter_value, registerAddressFragment.getString(R.string.postal_code)));
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
