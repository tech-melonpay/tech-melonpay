package com.luminary.business.presentation.ui.fragments.crypto.verify_transaction;

import C.v;
import F8.e;
import F8.o;
import O9.p;
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
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.VerifyTransactionFragment;
import com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.g;
import f.i;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;
import t6.z6;
import t7.C1488b;

/* compiled from: VerifyTransactionFragment.kt */
/* loaded from: classes2.dex */
public final class VerifyTransactionFragment extends BaseFragment<z6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12170n0 = R.layout.fragment_verify_transaction;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12171o0;

    /* renamed from: p0, reason: collision with root package name */
    public Uri f12172p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a f12173q0;

    /* renamed from: r0, reason: collision with root package name */
    public final AbstractC0704c<String> f12174r0;
    public final AbstractC0704c<String> s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f12175t0;

    /* renamed from: u0, reason: collision with root package name */
    public final FilePickerContractor f12176u0;

    /* renamed from: v0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12177v0;

    /* compiled from: VerifyTransactionFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12183a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f12183a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12183a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12183a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.VerifyTransactionFragment$special$$inlined$viewModel$default$1] */
    public VerifyTransactionFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.VerifyTransactionFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12171o0 = E.a(this, h.a(t7.f.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.VerifyTransactionFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.VerifyTransactionFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(t7.f.class), null, null, b.l(this));
            }
        });
        final int i = 0;
        this.f12174r0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: t7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyTransactionFragment f29918b;

            {
                this.f29918b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                VerifyTransactionFragment verifyTransactionFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f29918b.s0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            VerifyTransactionFragment verifyTransactionFragment2 = this.f29918b;
                            verifyTransactionFragment2.f12172p0 = verifyTransactionFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", verifyTransactionFragment2.f12172p0);
                            verifyTransactionFragment2.f12177v0.a(verifyTransactionFragment2.f12172p0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (verifyTransactionFragment = this.f29918b).f12172p0) != null) {
                            verifyTransactionFragment.T0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.s0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: t7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyTransactionFragment f29918b;

            {
                this.f29918b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                VerifyTransactionFragment verifyTransactionFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f29918b.s0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            VerifyTransactionFragment verifyTransactionFragment2 = this.f29918b;
                            verifyTransactionFragment2.f12172p0 = verifyTransactionFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", verifyTransactionFragment2.f12172p0);
                            verifyTransactionFragment2.f12177v0.a(verifyTransactionFragment2.f12172p0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (verifyTransactionFragment = this.f29918b).f12172p0) != null) {
                            verifyTransactionFragment.T0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new VerifyTransactionFragment$filePicker$1(1, this, VerifyTransactionFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12176u0 = filePickerContractor;
        final int i10 = 2;
        this.f12177v0 = registerForActivityResult(new i(), new InterfaceC0702a(this) { // from class: t7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyTransactionFragment f29918b;

            {
                this.f29918b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                VerifyTransactionFragment verifyTransactionFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f29918b.s0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            VerifyTransactionFragment verifyTransactionFragment2 = this.f29918b;
                            verifyTransactionFragment2.f12172p0 = verifyTransactionFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", verifyTransactionFragment2.f12172p0);
                            verifyTransactionFragment2.f12177v0.a(verifyTransactionFragment2.f12172p0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (verifyTransactionFragment = this.f29918b).f12172p0) != null) {
                            verifyTransactionFragment.T0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.send_test_transaction);
        toolbarStatus.f13266d = "\n";
        toolbarStatus.f13278q = 5;
        toolbarStatus.f13276o = null;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.send_test_transaction);
        toolbarStatus.f13266d = "\n";
        toolbarStatus.f13278q = 5;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        toolbarStatus.f13276o = null;
        return toolbarStatus;
    }

    public final void T0(Uri uri, boolean z10) {
        String b9 = e.b(requireActivity(), uri);
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f12176u0.f13322b;
        }
        String c2 = e.c(requireContext, uri);
        if (c2 != null) {
            u0().f29908u.setText(b9);
            this.f12175t0 = c2;
            U0();
        }
    }

    public final void U0() {
        z6 u02 = u0();
        Editable text = u0().f29903p.getText();
        u02.f29901n.setEnabled((text == null || text.length() == 0 || this.f12175t0 == null) ? false : true);
        u0().f29902o.setEnabled(u0().f29901n.isEnabled());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12173q0 = a.C0126a.a(arguments);
        }
        this.f11471m0 = (t7.f) this.f12171o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        CryptowalletDomain cryptowalletDomain;
        String str5;
        CryptowalletDomain cryptowalletDomain2;
        CryptowalletDomain cryptowalletDomain3;
        CryptowalletDomain cryptowalletDomain4;
        String str6;
        CryptowalletDomain cryptowalletDomain5;
        CryptowalletDomain cryptowalletDomain6;
        CryptowalletDomain cryptowalletDomain7;
        CryptowalletDomain cryptowalletDomain8;
        String str7;
        super.onViewCreated(view, bundle);
        H1.a aVar = this.f12171o0;
        final int i = 0;
        ((t7.f) aVar.getValue()).f426S0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: t7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyTransactionFragment f29914b;

            {
                this.f29914b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        this.f29914b.getClass();
                        break;
                    default:
                        U4.b.g(this.f29914b).l();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        ((t7.f) aVar.getValue()).f29931X0.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: t7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VerifyTransactionFragment f29914b;

            {
                this.f29914b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        this.f29914b.getClass();
                        break;
                    default:
                        U4.b.g(this.f29914b).l();
                        break;
                }
                return p.f3034a;
            }
        }));
        o.c(u0().f29901n, 500L, new C1488b(this, 2));
        o.c(u0().f29902o, 500L, new C1488b(this, 3));
        o.c(u0().f29908u, 500L, new C1488b(this, 4));
        u0().f29903p.addTextChangedListener(new a());
        z6 u02 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar2 = this.f12173q0;
        String str8 = null;
        String I10 = (aVar2 == null || (cryptowalletDomain8 = aVar2.f12184a) == null || (str7 = cryptowalletDomain8.f11080j) == null) ? null : D9.b.I(str7, cryptowalletDomain8.f11078g);
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar3 = this.f12173q0;
        String str9 = "";
        if (aVar3 == null || (cryptowalletDomain7 = aVar3.f12184a) == null || (str = cryptowalletDomain7.f11078g) == null) {
            str = "";
        }
        u02.f29911x.setText(v.p(I10, " ", str));
        z6 u03 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar4 = this.f12173q0;
        if (aVar4 == null || (cryptowalletDomain6 = aVar4.f12184a) == null || (str2 = cryptowalletDomain6.f11081k) == null) {
            str2 = "";
        }
        u03.f29909v.setText(str2);
        z6 u04 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar5 = this.f12173q0;
        u04.f29910w.setText((aVar5 == null || (cryptowalletDomain5 = aVar5.f12184a) == null) ? null : cryptowalletDomain5.f11077f);
        o.b(u0().f29912y);
        o.b(u0().f29906s);
        z6 u05 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar6 = this.f12173q0;
        if (aVar6 != null && (cryptowalletDomain4 = aVar6.f12184a) != null && (str6 = cryptowalletDomain4.f11080j) != null) {
            str8 = D9.b.I(str6, cryptowalletDomain4.f11078g);
        }
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar7 = this.f12173q0;
        if (aVar7 == null || (cryptowalletDomain3 = aVar7.f12184a) == null || (str3 = cryptowalletDomain3.f11078g) == null) {
            str3 = "";
        }
        u05.f29907t.setText(getString(R.string.send_to, v.p(str8, " ", str3)));
        z6 u06 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar8 = this.f12173q0;
        if (aVar8 == null || (cryptowalletDomain2 = aVar8.f12184a) == null || (str4 = cryptowalletDomain2.f11078g) == null) {
            str4 = "";
        }
        u06.f29901n.setText(getString(R.string.i_have_sent, str4));
        z6 u07 = u0();
        com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a aVar9 = this.f12173q0;
        if (aVar9 != null && (cryptowalletDomain = aVar9.f12184a) != null && (str5 = cryptowalletDomain.f11078g) != null) {
            str9 = str5;
        }
        u07.f29902o.setText(getString(R.string.i_have_sent, str9));
        o.c(u0().f29904q, 500L, new C1488b(this, 5));
        o.c(u0().f29905r, 500L, new C1488b(this, 6));
        U0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12170n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        u0().f29901n.setVisibility(0);
        o.b(u0().f29902o);
        t0(true);
        s0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f29901n);
        u0().f29902o.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            VerifyTransactionFragment.this.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
