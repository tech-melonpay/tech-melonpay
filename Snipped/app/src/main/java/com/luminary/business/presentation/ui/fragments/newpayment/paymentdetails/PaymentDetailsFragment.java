package com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails;

import C.v;
import F8.e;
import F8.o;
import Fa.h;
import M6.j;
import O9.p;
import U4.b;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.impl.utils.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import com.luminary.business.domain.entity.payments.QRCode;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.business.presentation.entity.payment.SignerUI;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import e8.d;
import f.g;
import f.i;
import java.io.Serializable;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;
import t6.Z4;

/* compiled from: PaymentDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class PaymentDetailsFragment extends BaseFragment<Z4> {

    /* renamed from: o0, reason: collision with root package name */
    public boolean f12802o0;

    /* renamed from: q0, reason: collision with root package name */
    public final H1.a f12804q0;

    /* renamed from: r0, reason: collision with root package name */
    public final FilePickerContractor f12805r0;
    public Uri s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f12806t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f12807u0;

    /* renamed from: v0, reason: collision with root package name */
    public final AbstractC0704c<String> f12808v0;

    /* renamed from: w0, reason: collision with root package name */
    public final AbstractC0704c<String> f12809w0;

    /* renamed from: x0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12810x0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12801n0 = R.layout.fragment_new_payment_details;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12803p0 = new h(kotlin.jvm.internal.h.a(d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment$special$$inlined$navArgs$1
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

    /* compiled from: PaymentDetailsFragment.kt */
    public static final class a implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12816a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12816a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12816a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12816a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment$special$$inlined$viewModel$default$1] */
    public PaymentDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12804q0 = E.a(this, kotlin.jvm.internal.h.a(b8.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(b8.h.class), null, null, b.l(this));
            }
        });
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new PaymentDetailsFragment$filePicker$1(1, this, PaymentDetailsFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12805r0 = filePickerContractor;
        final int i = 0;
        this.f12808v0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: e8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentDetailsFragment f20565b;

            {
                this.f20565b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                PaymentDetailsFragment paymentDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 0:
                        if (f.b(bool, Boolean.TRUE)) {
                            this.f20565b.f12809w0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            PaymentDetailsFragment paymentDetailsFragment2 = this.f20565b;
                            paymentDetailsFragment2.s0 = paymentDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", paymentDetailsFragment2.s0);
                            paymentDetailsFragment2.f12810x0.a(paymentDetailsFragment2.s0);
                            break;
                        }
                        break;
                    default:
                        if (f.b(bool, Boolean.TRUE) && (uri = (paymentDetailsFragment = this.f20565b).s0) != null) {
                            paymentDetailsFragment.W0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f12809w0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: e8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentDetailsFragment f20565b;

            {
                this.f20565b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                PaymentDetailsFragment paymentDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (f.b(bool, Boolean.TRUE)) {
                            this.f20565b.f12809w0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            PaymentDetailsFragment paymentDetailsFragment2 = this.f20565b;
                            paymentDetailsFragment2.s0 = paymentDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", paymentDetailsFragment2.s0);
                            paymentDetailsFragment2.f12810x0.a(paymentDetailsFragment2.s0);
                            break;
                        }
                        break;
                    default:
                        if (f.b(bool, Boolean.TRUE) && (uri = (paymentDetailsFragment = this.f20565b).s0) != null) {
                            paymentDetailsFragment.W0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        this.f12810x0 = registerForActivityResult(new i(), new InterfaceC0702a(this) { // from class: e8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentDetailsFragment f20565b;

            {
                this.f20565b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                PaymentDetailsFragment paymentDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (f.b(bool, Boolean.TRUE)) {
                            this.f20565b.f12809w0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            PaymentDetailsFragment paymentDetailsFragment2 = this.f20565b;
                            paymentDetailsFragment2.s0 = paymentDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", paymentDetailsFragment2.s0);
                            paymentDetailsFragment2.f12810x0.a(paymentDetailsFragment2.s0);
                            break;
                        }
                        break;
                    default:
                        if (f.b(bool, Boolean.TRUE) && (uri = (paymentDetailsFragment = this.f20565b).s0) != null) {
                            paymentDetailsFragment.W0(uri, true);
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
        toolbarStatus.f13267e = true;
        toolbarStatus.f13264b = U0().f20568a.d(requireContext());
        toolbarStatus.f13265c = 28;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13264b = U0().f20568a.d(requireContext());
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0() {
        if (U0().f20569b) {
            o.b(u0().f28743D);
            o.b(u0().f28747H);
        } else {
            u0().f28743D.setVisibility(0);
            u0().f28747H.setVisibility(0);
        }
    }

    public final d U0() {
        return (d) this.f12803p0.getValue();
    }

    public final b8.h V0() {
        return (b8.h) this.f12804q0.getValue();
    }

    public final void W0(Uri uri, boolean z10) {
        String b9 = e.b(requireActivity(), uri);
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f12805r0.f13322b;
        }
        String c2 = e.c(requireContext, uri);
        if (c2 != null) {
            this.f12806t0 = b9;
            Z4 u02 = u0();
            u02.f28762u.setText(String.valueOf(this.f12806t0));
            this.f12807u0 = c2;
            X0();
        }
    }

    public final void X0() {
        boolean z10 = (!U0().f20572e && U0().f20568a.f11331b == PaymentType.f11151e && this.f12807u0 == null) ? false : true;
        u0().f28756o.setEnabled(z10);
        u0().f28757p.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((MainActivity) requireActivity()).f11403A = false;
        super.onDestroy();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u0().f28762u.setText(this.f12806t0);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        o.c(u0().f28756o, 500L, new e8.a(this, 0));
        o.c(u0().f28757p, 500L, new e8.a(this, 6));
        String str = U0().f20570c;
        if (str == null || str.length() == 0) {
            u0().f28744E.setText(U0().f20568a.f11334e);
        } else {
            u0().f28744E.setText(U0().f20570c);
        }
        final int i = 0;
        V0().f8476o1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: e8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentDetailsFragment f20567b;

            {
                this.f20567b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        PaymentDomain paymentDomain = (PaymentDomain) obj;
                        if (paymentDomain == null) {
                            return p.f3034a;
                        }
                        PaymentDetailsFragment paymentDetailsFragment = this.f20567b;
                        String str2 = paymentDomain.f11102G;
                        if (str2 == null) {
                            BottomDialogType.a aVar = BottomDialogType.f13289k;
                            paymentDetailsFragment.requireContext();
                            aVar.getClass();
                            BottomDialogType d10 = BottomDialogType.a.d();
                            d10.f13295a = paymentDetailsFragment.getString(R.string.your_payment_was_successful, D9.b.o(paymentDetailsFragment.U0().f20568a.f11337h, paymentDetailsFragment.U0().f20568a.b()), String.valueOf(paymentDetailsFragment.U0().f20568a.f11334e));
                            d10.f13297c = paymentDetailsFragment.getString(R.string.done);
                            o.b(paymentDetailsFragment.u0().f28759r);
                            paymentDetailsFragment.w0().c(d10, new a(paymentDetailsFragment, 1), null);
                        } else {
                            QRCode qRCode = paymentDomain.f11103H.f11095b;
                            Parcelable signerUI = new SignerUI(paymentDomain.f11104a, str2, qRCode != null ? qRCode.f11129a : null, qRCode != null ? qRCode.f11131c : null);
                            NavController g10 = U4.b.g(paymentDetailsFragment);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(SignerUI.class)) {
                                g11.putParcelable("signer", signerUI);
                            } else {
                                if (!Serializable.class.isAssignableFrom(SignerUI.class)) {
                                    throw new UnsupportedOperationException(SignerUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("signer", (Serializable) signerUI);
                            }
                            g10.i(R.id.action_paymentDetailsFragment_to_timerFragment, g11);
                        }
                        paymentDetailsFragment.V0().f8476o1.postValue(null);
                        return p.f3034a;
                    case 1:
                        B5.a aVar2 = (B5.a) obj;
                        boolean b9 = f.b(aVar2.f294a, "OUR");
                        PaymentDetailsFragment paymentDetailsFragment2 = this.f20567b;
                        if (b9) {
                            paymentDetailsFragment2.u0().f28741B.setText(R.string.fee);
                            paymentDetailsFragment2.u0().f28754O.setText(D9.b.o(paymentDetailsFragment2.U0().f20568a.f11337h, aVar2.f295b));
                            paymentDetailsFragment2.u0().f28741B.setVisibility(0);
                            paymentDetailsFragment2.u0().f28754O.setVisibility(0);
                        } else {
                            o.b(paymentDetailsFragment2.u0().f28741B);
                            o.b(paymentDetailsFragment2.u0().f28754O);
                        }
                        return p.f3034a;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        PaymentDetailsFragment paymentDetailsFragment3 = this.f20567b;
                        if (booleanValue) {
                            o.b(paymentDetailsFragment3.u0().f28747H);
                        } else {
                            paymentDetailsFragment3.T0();
                        }
                        return p.f3034a;
                }
            }
        }));
        E.b(this, "signer", new B6.h(this, 17));
        V0().f8471i1.observe(getViewLifecycleOwner(), new a(new Z3.a(10)));
        final int i9 = 1;
        V0().n1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: e8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentDetailsFragment f20567b;

            {
                this.f20567b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        PaymentDomain paymentDomain = (PaymentDomain) obj;
                        if (paymentDomain == null) {
                            return p.f3034a;
                        }
                        PaymentDetailsFragment paymentDetailsFragment = this.f20567b;
                        String str2 = paymentDomain.f11102G;
                        if (str2 == null) {
                            BottomDialogType.a aVar = BottomDialogType.f13289k;
                            paymentDetailsFragment.requireContext();
                            aVar.getClass();
                            BottomDialogType d10 = BottomDialogType.a.d();
                            d10.f13295a = paymentDetailsFragment.getString(R.string.your_payment_was_successful, D9.b.o(paymentDetailsFragment.U0().f20568a.f11337h, paymentDetailsFragment.U0().f20568a.b()), String.valueOf(paymentDetailsFragment.U0().f20568a.f11334e));
                            d10.f13297c = paymentDetailsFragment.getString(R.string.done);
                            o.b(paymentDetailsFragment.u0().f28759r);
                            paymentDetailsFragment.w0().c(d10, new a(paymentDetailsFragment, 1), null);
                        } else {
                            QRCode qRCode = paymentDomain.f11103H.f11095b;
                            Parcelable signerUI = new SignerUI(paymentDomain.f11104a, str2, qRCode != null ? qRCode.f11129a : null, qRCode != null ? qRCode.f11131c : null);
                            NavController g10 = U4.b.g(paymentDetailsFragment);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(SignerUI.class)) {
                                g11.putParcelable("signer", signerUI);
                            } else {
                                if (!Serializable.class.isAssignableFrom(SignerUI.class)) {
                                    throw new UnsupportedOperationException(SignerUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("signer", (Serializable) signerUI);
                            }
                            g10.i(R.id.action_paymentDetailsFragment_to_timerFragment, g11);
                        }
                        paymentDetailsFragment.V0().f8476o1.postValue(null);
                        return p.f3034a;
                    case 1:
                        B5.a aVar2 = (B5.a) obj;
                        boolean b9 = f.b(aVar2.f294a, "OUR");
                        PaymentDetailsFragment paymentDetailsFragment2 = this.f20567b;
                        if (b9) {
                            paymentDetailsFragment2.u0().f28741B.setText(R.string.fee);
                            paymentDetailsFragment2.u0().f28754O.setText(D9.b.o(paymentDetailsFragment2.U0().f20568a.f11337h, aVar2.f295b));
                            paymentDetailsFragment2.u0().f28741B.setVisibility(0);
                            paymentDetailsFragment2.u0().f28754O.setVisibility(0);
                        } else {
                            o.b(paymentDetailsFragment2.u0().f28741B);
                            o.b(paymentDetailsFragment2.u0().f28754O);
                        }
                        return p.f3034a;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        PaymentDetailsFragment paymentDetailsFragment3 = this.f20567b;
                        if (booleanValue) {
                            o.b(paymentDetailsFragment3.u0().f28747H);
                        } else {
                            paymentDetailsFragment3.T0();
                        }
                        return p.f3034a;
                }
            }
        }));
        PaymentUI paymentUI = U0().f20568a;
        u0().f28746G.setText(D9.b.U(paymentUI.f11334e));
        u0().f28742C.setText(paymentUI.f11334e);
        u0().f28755n.setText(D9.b.v0("", paymentUI.c(), paymentUI.a(), paymentUI.f11337h, 25, 16, false, false, false, 384));
        u0().f28745F.setOnScrollChangeListener(new j(this, 3));
        o.c(u0().f28762u, 500L, new e8.a(this, 7));
        u0().f28743D.setEnabled(u0().f28747H.isChecked());
        u0().f28747H.setOnCheckedChangeListener(new C2.a(this, 4));
        final int i10 = 2;
        u0().f28743D.setOnErrorStageChange(new InterfaceC0646l(this) { // from class: e8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentDetailsFragment f20567b;

            {
                this.f20567b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        PaymentDomain paymentDomain = (PaymentDomain) obj;
                        if (paymentDomain == null) {
                            return p.f3034a;
                        }
                        PaymentDetailsFragment paymentDetailsFragment = this.f20567b;
                        String str2 = paymentDomain.f11102G;
                        if (str2 == null) {
                            BottomDialogType.a aVar = BottomDialogType.f13289k;
                            paymentDetailsFragment.requireContext();
                            aVar.getClass();
                            BottomDialogType d10 = BottomDialogType.a.d();
                            d10.f13295a = paymentDetailsFragment.getString(R.string.your_payment_was_successful, D9.b.o(paymentDetailsFragment.U0().f20568a.f11337h, paymentDetailsFragment.U0().f20568a.b()), String.valueOf(paymentDetailsFragment.U0().f20568a.f11334e));
                            d10.f13297c = paymentDetailsFragment.getString(R.string.done);
                            o.b(paymentDetailsFragment.u0().f28759r);
                            paymentDetailsFragment.w0().c(d10, new a(paymentDetailsFragment, 1), null);
                        } else {
                            QRCode qRCode = paymentDomain.f11103H.f11095b;
                            Parcelable signerUI = new SignerUI(paymentDomain.f11104a, str2, qRCode != null ? qRCode.f11129a : null, qRCode != null ? qRCode.f11131c : null);
                            NavController g10 = U4.b.g(paymentDetailsFragment);
                            Bundle g11 = v.g(g10);
                            if (Parcelable.class.isAssignableFrom(SignerUI.class)) {
                                g11.putParcelable("signer", signerUI);
                            } else {
                                if (!Serializable.class.isAssignableFrom(SignerUI.class)) {
                                    throw new UnsupportedOperationException(SignerUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("signer", (Serializable) signerUI);
                            }
                            g10.i(R.id.action_paymentDetailsFragment_to_timerFragment, g11);
                        }
                        paymentDetailsFragment.V0().f8476o1.postValue(null);
                        return p.f3034a;
                    case 1:
                        B5.a aVar2 = (B5.a) obj;
                        boolean b9 = f.b(aVar2.f294a, "OUR");
                        PaymentDetailsFragment paymentDetailsFragment2 = this.f20567b;
                        if (b9) {
                            paymentDetailsFragment2.u0().f28741B.setText(R.string.fee);
                            paymentDetailsFragment2.u0().f28754O.setText(D9.b.o(paymentDetailsFragment2.U0().f20568a.f11337h, aVar2.f295b));
                            paymentDetailsFragment2.u0().f28741B.setVisibility(0);
                            paymentDetailsFragment2.u0().f28754O.setVisibility(0);
                        } else {
                            o.b(paymentDetailsFragment2.u0().f28741B);
                            o.b(paymentDetailsFragment2.u0().f28754O);
                        }
                        return p.f3034a;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        PaymentDetailsFragment paymentDetailsFragment3 = this.f20567b;
                        if (booleanValue) {
                            o.b(paymentDetailsFragment3.u0().f28747H);
                        } else {
                            paymentDetailsFragment3.T0();
                        }
                        return p.f3034a;
                }
            }
        });
        T0();
        PaymentUI paymentUI2 = U0().f20568a;
        b8.h V02 = V0();
        D7.d dVar = new D7.d(V02, paymentUI2.f11331b.toString(), paymentUI2.f11332c, paymentUI2.f11337h);
        V02.f419K0 = dVar;
        dVar.invoke();
        Z4 u02 = u0();
        u02.f28763v.setText(getString(R.string.sending_from));
        u02.f28748I.setText(paymentUI2.f11340l);
        o.b(u02.f28741B);
        o.b(u02.f28754O);
        int ordinal = paymentUI2.f11331b.ordinal();
        TextView textView = u02.f28752M;
        TextView textView2 = u02.f28767z;
        TextView textView3 = u02.f28750K;
        TextView textView4 = u02.f28765x;
        TextView textView5 = u02.f28749J;
        TextView textView6 = u02.f28764w;
        if (ordinal == 0) {
            o.b(textView2);
            o.b(textView);
            o.b(textView4);
            o.b(textView3);
            textView6.setText(getString(R.string.bank_app_id));
            textView5.setText(paymentUI2.f11343o);
        } else if (ordinal == 1) {
            textView6.setText(getString(R.string.sort_code));
            textView5.setText(paymentUI2.f11333d);
            textView4.setText(getString(R.string.account_number));
            textView3.setText(paymentUI2.f11335f);
        } else if (ordinal == 2) {
            textView6.setText(getString(R.string.iban));
            textView5.setText(paymentUI2.f11338j);
            textView4.setText(getString(R.string.swift_bic));
            textView3.setText(paymentUI2.f11339k);
        } else if (ordinal == 3) {
            textView6.setText(getString(R.string.account));
            textView5.setText(paymentUI2.f11338j);
            textView4.setText(getString(R.string.swift_bic));
            textView3.setText(paymentUI2.f11339k);
        } else if (ordinal == 8) {
            textView6.setText(getString(R.string.account_iban));
            textView5.setText(paymentUI2.f11338j);
            textView4.setText(getString(R.string.swift_bic));
            textView3.setText(paymentUI2.f11339k);
            if (U0().f20572e) {
                u0().f28761t.setHint(getString(R.string.invoice_or_contract_optional));
            } else {
                u0().f28761t.setHint(getString(R.string.invoice_or_contract));
            }
        }
        o.b(u02.f28766y);
        o.b(u02.f28751L);
        o.b(textView2);
        o.b(textView);
        u02.f28753N.setText(paymentUI2.f11336g);
        u02.f28740A.setText(getString(R.string.reference));
        int ordinal2 = paymentUI2.f11331b.ordinal();
        Integer valueOf = ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 8 ? null : Integer.valueOf(R.drawable.ic_international) : Integer.valueOf(R.drawable.ic_international) : Integer.valueOf(R.drawable.ic_euro) : Integer.valueOf(R.drawable.ic_gb) : Integer.valueOf(R.drawable.ic_bank_email_payment_small);
        if (valueOf != null) {
            u02.f28760s.setImageResource(valueOf.intValue());
        }
        X0();
        if (U0().f20568a.f11331b != PaymentType.f11151e || U0().f20572e) {
            return;
        }
        ((MainActivity) requireActivity()).f11403A = true;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12801n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        Z4 u02 = u0();
        u02.f28756o.setVisibility(0);
        o.b(u02.f28757p);
        t0(true);
        s0();
        ConstraintLayout constraintLayout = u02.f28758q;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = (int) D9.b.T(65);
        layoutParams.width = (int) D9.b.T(65);
        constraintLayout.setLayoutParams(layoutParams);
        u02.f28746G.setTextSize(25.0f);
        u02.f28742C.setTextSize(16.0f);
        u02.f28755n.setTextSize(25.0f);
        this.f12802o0 = false;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        Z4 u02 = u0();
        u02.f28756o.setVisibility(4);
        u02.f28757p.setVisibility(0);
        p0(true);
        B0();
        ConstraintLayout constraintLayout = u02.f28758q;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.height = (int) D9.b.T(44);
        layoutParams.width = (int) D9.b.T(44);
        constraintLayout.setLayoutParams(layoutParams);
        u02.f28746G.setTextSize(18.0f);
        u02.f28742C.setTextSize(16.0f);
        u02.f28755n.setTextSize(18.0f);
        this.f12802o0 = true;
    }
}
