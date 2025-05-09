package com.luminary.business.presentation.ui.fragments.transfer;

import F8.j;
import F8.o;
import G0.c;
import O9.p;
import U4.b;
import android.os.Bundle;
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
import ca.InterfaceC0650p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.transfer.TransferController;
import com.luminary.business.presentation.ui.fragments.transfer.TransferFragment;
import com.luminary.business.presentation.ui.fragments.transfer.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.business.presentation.utils.extensions.FeeType;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import ka.C0966k;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.bouncycastle.i18n.MessageBundle;
import t6.AbstractC1415p6;
import u8.C1528d;
import w6.C1573a;
import w7.C1574a;
import w7.C1575b;

/* compiled from: TransferFragment.kt */
/* loaded from: classes2.dex */
public final class TransferFragment extends BaseFragment<AbstractC1415p6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f13141n0 = R.layout.fragment_transfer;

    /* renamed from: o0, reason: collision with root package name */
    public TransferController f13142o0;

    /* renamed from: p0, reason: collision with root package name */
    public final C1573a f13143p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f13144q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f13145r0;
    public com.luminary.business.presentation.ui.fragments.transfer.a s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f13146t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f13147u0;

    /* renamed from: v0, reason: collision with root package name */
    public final H1.a f13148v0;

    /* compiled from: TransferFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f13153a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f13153a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f13153a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13153a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.luminary.business.presentation.ui.fragments.transfer.TransferFragment$special$$inlined$viewModel$default$1] */
    public TransferFragment() {
        C1573a c1573a = new C1573a();
        c1573a.f30837a = null;
        c1573a.f30838b = null;
        c1573a.f30839c = "";
        c1573a.f30840d = "0";
        c1573a.f30841e = 0.0f;
        c1573a.f30842f = "";
        this.f13143p0 = c1573a;
        this.f13147u0 = true;
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.transfer.TransferFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f13148v0 = E.a(this, h.a(C1575b.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.transfer.TransferFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.transfer.TransferFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(C1575b.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.transfer_single);
        return toolbarStatus;
    }

    public final C1575b T0() {
        return (C1575b) this.f13148v0.getValue();
    }

    public final void U0() {
        this.f13144q0 = 0;
        NavController g10 = b.g(this);
        int i = this.f13144q0;
        C1573a c1573a = this.f13143p0;
        BankAccountDomain bankAccountDomain = c1573a.f30838b;
        String str = bankAccountDomain != null ? bankAccountDomain.f10700g : null;
        String string = getString(R.string.transfer);
        BankAccountDomain bankAccountDomain2 = c1573a.f30838b;
        String str2 = bankAccountDomain2 != null ? bankAccountDomain2.f10701h : null;
        g10.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("way", i);
        bundle.putString("exceptAccount", str);
        bundle.putString(MessageBundle.TITLE_ENTRY, string);
        bundle.putString(FirebaseAnalytics.Param.CURRENCY, str2);
        g10.i(R.id.action_transferFragment_to_exchangeAccountListFragment, bundle);
    }

    public final void V0() {
        boolean z10;
        BigDecimal bigDecimal;
        if (getView() == null) {
            return;
        }
        C1573a c1573a = this.f13143p0;
        if (c1573a.f30837a != null && c1573a.f30838b != null) {
            Double R = C0966k.R(D9.b.r0(c1573a.f30840d));
            if ((R != null ? R.doubleValue() : 0.0d) > 0.0d && c1573a.f30839c.length() > 0) {
                BankAccountDomain bankAccountDomain = c1573a.f30837a;
                double doubleValue = (bankAccountDomain == null || (bigDecimal = bankAccountDomain.f10698e) == null) ? 0.0d : bigDecimal.doubleValue();
                Double R2 = C0966k.R(D9.b.r0(c1573a.f30840d));
                if (doubleValue >= (R2 != null ? R2.doubleValue() : 0.0d) + c1573a.f30841e) {
                    z10 = true;
                    BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new TransferFragment$validate$1(this, z10, null), 2, null);
                }
            }
        }
        z10 = false;
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(getViewLifecycleOwner()), Dispatchers.getMain(), null, new TransferFragment$validate$1(this, z10, null), 2, null);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.s0 = a.C0138a.a(arguments);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f13145r0) {
            requireActivity().onBackPressed();
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1575b T02 = T0();
        T02.l();
        String valueOf = String.valueOf(T02.f30847V0.h());
        T02.f30846U0.a(new C1574a(T02, 1), valueOf);
        final int i = 0;
        final int i9 = 0;
        final int i10 = 1;
        this.f13142o0 = new TransferController(requireContext(), new InterfaceC0646l(this) { // from class: u8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30346b;

            {
                this.f30346b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                switch (i) {
                    case 0:
                        String str2 = (String) obj;
                        TransferFragment transferFragment = this.f30346b;
                        BankAccountDomain bankAccountDomain = transferFragment.f13143p0.f30837a;
                        if (f.b(bankAccountDomain != null ? bankAccountDomain.f10700g : null, str2)) {
                            transferFragment.U0();
                        } else {
                            C1573a c1573a = transferFragment.f13143p0;
                            BankAccountDomain bankAccountDomain2 = c1573a.f30838b;
                            if (f.b(bankAccountDomain2 != null ? bankAccountDomain2.f10700g : null, str2)) {
                                transferFragment.f13144q0 = 1;
                                NavController g10 = U4.b.g(transferFragment);
                                int i11 = transferFragment.f13144q0;
                                BankAccountDomain bankAccountDomain3 = c1573a.f30837a;
                                String str3 = bankAccountDomain3 != null ? bankAccountDomain3.f10700g : null;
                                String string = transferFragment.getString(R.string.transfer);
                                BankAccountDomain bankAccountDomain4 = c1573a.f30837a;
                                String str4 = bankAccountDomain4 != null ? bankAccountDomain4.f10701h : null;
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("way", i11);
                                bundle2.putString("exceptAccount", str3);
                                bundle2.putString(MessageBundle.TITLE_ENTRY, string);
                                bundle2.putString(FirebaseAnalytics.Param.CURRENCY, str4);
                                g10.i(R.id.action_transferFragment_to_exchangeAccountListFragment, bundle2);
                            }
                        }
                        break;
                    case 1:
                        B5.h hVar = (B5.h) obj;
                        TransferFragment transferFragment2 = this.f30346b;
                        C1573a c1573a2 = transferFragment2.f13143p0;
                        BankAccountDomain bankAccountDomain5 = c1573a2.f30837a;
                        if (bankAccountDomain5 != null && (str = bankAccountDomain5.f10701h) != null) {
                            FeeType feeType = FeeType.f13319d;
                            c1573a2.f30841e = j.b(hVar, feeType, str);
                            String string2 = transferFragment2.getString(R.string.fee_value, j.a(hVar, feeType, str));
                            C1573a c1573a3 = transferFragment2.f13143p0;
                            c1573a3.f30842f = string2;
                            TransferController transferController = transferFragment2.f13142o0;
                            if (transferController == null) {
                                transferController = null;
                            }
                            transferController.setData(c1573a3);
                        }
                        break;
                    default:
                        BottomDialogType.a aVar = BottomDialogType.f13289k;
                        TransferFragment transferFragment3 = this.f30346b;
                        transferFragment3.requireContext();
                        aVar.getClass();
                        BottomDialogType d10 = BottomDialogType.a.d();
                        d10.f13295a = transferFragment3.getString(R.string.your_transfer_was_successful);
                        d10.f13297c = transferFragment3.getString(R.string.done);
                        transferFragment3.w0().c(d10, new C1528d(transferFragment3, 0), null);
                        break;
                }
                return p.f3034a;
            }
        }, new c.InterfaceC0016c(this) { // from class: u8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30352b;

            {
                this.f30352b = this;
            }

            @Override // G0.c.InterfaceC0016c
            public final void a(CharSequence charSequence) {
                switch (i9) {
                    case 0:
                        TransferFragment transferFragment = this.f30352b;
                        transferFragment.f13143p0.f30839c = charSequence.toString();
                        transferFragment.V0();
                        break;
                    default:
                        TransferFragment transferFragment2 = this.f30352b;
                        transferFragment2.f13143p0.f30840d = D9.b.r0(charSequence.toString());
                        transferFragment2.V0();
                        break;
                }
            }
        }, new c.InterfaceC0016c(this) { // from class: u8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30352b;

            {
                this.f30352b = this;
            }

            @Override // G0.c.InterfaceC0016c
            public final void a(CharSequence charSequence) {
                switch (i10) {
                    case 0:
                        TransferFragment transferFragment = this.f30352b;
                        transferFragment.f13143p0.f30839c = charSequence.toString();
                        transferFragment.V0();
                        break;
                    default:
                        TransferFragment transferFragment2 = this.f30352b;
                        transferFragment2.f13143p0.f30840d = D9.b.r0(charSequence.toString());
                        transferFragment2.V0();
                        break;
                }
            }
        });
        AbstractC1415p6 u02 = u0();
        u02.f29482p.setLayoutManager(new TransferFragment$onViewCreated$4(requireContext(), 1, false));
        AbstractC1415p6 u03 = u0();
        TransferController transferController = this.f13142o0;
        if (transferController == null) {
            transferController = null;
        }
        u03.f29482p.setAdapter(transferController.getAdapter());
        final int i11 = 1;
        T0().f30850Y0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: u8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30346b;

            {
                this.f30346b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                switch (i11) {
                    case 0:
                        String str2 = (String) obj;
                        TransferFragment transferFragment = this.f30346b;
                        BankAccountDomain bankAccountDomain = transferFragment.f13143p0.f30837a;
                        if (f.b(bankAccountDomain != null ? bankAccountDomain.f10700g : null, str2)) {
                            transferFragment.U0();
                        } else {
                            C1573a c1573a = transferFragment.f13143p0;
                            BankAccountDomain bankAccountDomain2 = c1573a.f30838b;
                            if (f.b(bankAccountDomain2 != null ? bankAccountDomain2.f10700g : null, str2)) {
                                transferFragment.f13144q0 = 1;
                                NavController g10 = U4.b.g(transferFragment);
                                int i112 = transferFragment.f13144q0;
                                BankAccountDomain bankAccountDomain3 = c1573a.f30837a;
                                String str3 = bankAccountDomain3 != null ? bankAccountDomain3.f10700g : null;
                                String string = transferFragment.getString(R.string.transfer);
                                BankAccountDomain bankAccountDomain4 = c1573a.f30837a;
                                String str4 = bankAccountDomain4 != null ? bankAccountDomain4.f10701h : null;
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("way", i112);
                                bundle2.putString("exceptAccount", str3);
                                bundle2.putString(MessageBundle.TITLE_ENTRY, string);
                                bundle2.putString(FirebaseAnalytics.Param.CURRENCY, str4);
                                g10.i(R.id.action_transferFragment_to_exchangeAccountListFragment, bundle2);
                            }
                        }
                        break;
                    case 1:
                        B5.h hVar = (B5.h) obj;
                        TransferFragment transferFragment2 = this.f30346b;
                        C1573a c1573a2 = transferFragment2.f13143p0;
                        BankAccountDomain bankAccountDomain5 = c1573a2.f30837a;
                        if (bankAccountDomain5 != null && (str = bankAccountDomain5.f10701h) != null) {
                            FeeType feeType = FeeType.f13319d;
                            c1573a2.f30841e = j.b(hVar, feeType, str);
                            String string2 = transferFragment2.getString(R.string.fee_value, j.a(hVar, feeType, str));
                            C1573a c1573a3 = transferFragment2.f13143p0;
                            c1573a3.f30842f = string2;
                            TransferController transferController2 = transferFragment2.f13142o0;
                            if (transferController2 == null) {
                                transferController2 = null;
                            }
                            transferController2.setData(c1573a3);
                        }
                        break;
                    default:
                        BottomDialogType.a aVar = BottomDialogType.f13289k;
                        TransferFragment transferFragment3 = this.f30346b;
                        transferFragment3.requireContext();
                        aVar.getClass();
                        BottomDialogType d10 = BottomDialogType.a.d();
                        d10.f13295a = transferFragment3.getString(R.string.your_transfer_was_successful);
                        d10.f13297c = transferFragment3.getString(R.string.done);
                        transferFragment3.w0().c(d10, new C1528d(transferFragment3, 0), null);
                        break;
                }
                return p.f3034a;
            }
        }));
        T0().f30848W0.observe(getViewLifecycleOwner(), new a(new J8.c(15, this, view)));
        AbstractC1415p6 u04 = u0();
        o.c(u04.f29480n, 500L, new C1528d(this, 1));
        final int i12 = 2;
        T0().f30849X0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: u8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30346b;

            {
                this.f30346b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                String str;
                switch (i12) {
                    case 0:
                        String str2 = (String) obj;
                        TransferFragment transferFragment = this.f30346b;
                        BankAccountDomain bankAccountDomain = transferFragment.f13143p0.f30837a;
                        if (f.b(bankAccountDomain != null ? bankAccountDomain.f10700g : null, str2)) {
                            transferFragment.U0();
                        } else {
                            C1573a c1573a = transferFragment.f13143p0;
                            BankAccountDomain bankAccountDomain2 = c1573a.f30838b;
                            if (f.b(bankAccountDomain2 != null ? bankAccountDomain2.f10700g : null, str2)) {
                                transferFragment.f13144q0 = 1;
                                NavController g10 = U4.b.g(transferFragment);
                                int i112 = transferFragment.f13144q0;
                                BankAccountDomain bankAccountDomain3 = c1573a.f30837a;
                                String str3 = bankAccountDomain3 != null ? bankAccountDomain3.f10700g : null;
                                String string = transferFragment.getString(R.string.transfer);
                                BankAccountDomain bankAccountDomain4 = c1573a.f30837a;
                                String str4 = bankAccountDomain4 != null ? bankAccountDomain4.f10701h : null;
                                g10.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("way", i112);
                                bundle2.putString("exceptAccount", str3);
                                bundle2.putString(MessageBundle.TITLE_ENTRY, string);
                                bundle2.putString(FirebaseAnalytics.Param.CURRENCY, str4);
                                g10.i(R.id.action_transferFragment_to_exchangeAccountListFragment, bundle2);
                            }
                        }
                        break;
                    case 1:
                        B5.h hVar = (B5.h) obj;
                        TransferFragment transferFragment2 = this.f30346b;
                        C1573a c1573a2 = transferFragment2.f13143p0;
                        BankAccountDomain bankAccountDomain5 = c1573a2.f30837a;
                        if (bankAccountDomain5 != null && (str = bankAccountDomain5.f10701h) != null) {
                            FeeType feeType = FeeType.f13319d;
                            c1573a2.f30841e = j.b(hVar, feeType, str);
                            String string2 = transferFragment2.getString(R.string.fee_value, j.a(hVar, feeType, str));
                            C1573a c1573a3 = transferFragment2.f13143p0;
                            c1573a3.f30842f = string2;
                            TransferController transferController2 = transferFragment2.f13142o0;
                            if (transferController2 == null) {
                                transferController2 = null;
                            }
                            transferController2.setData(c1573a3);
                        }
                        break;
                    default:
                        BottomDialogType.a aVar = BottomDialogType.f13289k;
                        TransferFragment transferFragment3 = this.f30346b;
                        transferFragment3.requireContext();
                        aVar.getClass();
                        BottomDialogType d10 = BottomDialogType.a.d();
                        d10.f13295a = transferFragment3.getString(R.string.your_transfer_was_successful);
                        d10.f13297c = transferFragment3.getString(R.string.done);
                        transferFragment3.w0().c(d10, new C1528d(transferFragment3, 0), null);
                        break;
                }
                return p.f3034a;
            }
        }));
        AbstractC1415p6 u05 = u0();
        o.c(u05.f29481o, 500L, new C1528d(this, 2));
        final int i13 = 2;
        E.b(this, "ACCOUNT", new InterfaceC0650p(this) { // from class: u8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30348b;

            {
                this.f30348b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                BankAccountDomain bankAccountDomain;
                String str;
                B5.h value;
                Bundle bundle2 = (Bundle) obj2;
                switch (i13) {
                    case 0:
                        TransferFragment transferFragment = this.f30348b;
                        C1573a c1573a = transferFragment.f13143p0;
                        if (c1573a.f30837a == null || c1573a.f30838b == null) {
                            transferFragment.f13145r0 = true;
                        }
                        break;
                    case 1:
                        TransferFragment transferFragment2 = this.f30348b;
                        transferFragment2.f13145r0 = true;
                        U4.b.g(transferFragment2).l();
                        break;
                    default:
                        String string = bundle2.getString("ACCOUNT");
                        if (string != null) {
                            TransferFragment transferFragment3 = this.f30348b;
                            List<BankAccountDomain> value2 = transferFragment3.T0().f30848W0.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (f.b(((BankAccountDomain) obj3).f10700g, string)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj3;
                                if (bankAccountDomain2 != null) {
                                    int i14 = transferFragment3.f13144q0;
                                    C1573a c1573a2 = transferFragment3.f13143p0;
                                    if (i14 == 0) {
                                        c1573a2.f30838b = bankAccountDomain2;
                                        c1573a2.f30837a = bankAccountDomain2;
                                        if (transferFragment3.getView() != null && (bankAccountDomain = c1573a2.f30837a) != null && (str = bankAccountDomain.f10701h) != null && (value = transferFragment3.T0().f30850Y0.getValue()) != null) {
                                            FeeType feeType = FeeType.f13319d;
                                            c1573a2.f30841e = j.b(value, feeType, str);
                                            c1573a2.f30842f = transferFragment3.getString(R.string.fee_value, j.a(value, feeType, str));
                                            TransferController transferController2 = transferFragment3.f13142o0;
                                            if (transferController2 == null) {
                                                transferController2 = null;
                                            }
                                            transferController2.setData(c1573a2);
                                        }
                                    } else {
                                        c1573a2.f30838b = bankAccountDomain2;
                                        c1573a2.f30837a = bankAccountDomain2;
                                    }
                                    TransferController transferController3 = transferFragment3.f13142o0;
                                    (transferController3 != null ? transferController3 : null).setData(c1573a2);
                                    transferFragment3.V0();
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i14 = 0;
        E.b(this, "EMPTY_BACK", new InterfaceC0650p(this) { // from class: u8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30348b;

            {
                this.f30348b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                BankAccountDomain bankAccountDomain;
                String str;
                B5.h value;
                Bundle bundle2 = (Bundle) obj2;
                switch (i14) {
                    case 0:
                        TransferFragment transferFragment = this.f30348b;
                        C1573a c1573a = transferFragment.f13143p0;
                        if (c1573a.f30837a == null || c1573a.f30838b == null) {
                            transferFragment.f13145r0 = true;
                        }
                        break;
                    case 1:
                        TransferFragment transferFragment2 = this.f30348b;
                        transferFragment2.f13145r0 = true;
                        U4.b.g(transferFragment2).l();
                        break;
                    default:
                        String string = bundle2.getString("ACCOUNT");
                        if (string != null) {
                            TransferFragment transferFragment3 = this.f30348b;
                            List<BankAccountDomain> value2 = transferFragment3.T0().f30848W0.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (f.b(((BankAccountDomain) obj3).f10700g, string)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj3;
                                if (bankAccountDomain2 != null) {
                                    int i142 = transferFragment3.f13144q0;
                                    C1573a c1573a2 = transferFragment3.f13143p0;
                                    if (i142 == 0) {
                                        c1573a2.f30838b = bankAccountDomain2;
                                        c1573a2.f30837a = bankAccountDomain2;
                                        if (transferFragment3.getView() != null && (bankAccountDomain = c1573a2.f30837a) != null && (str = bankAccountDomain.f10701h) != null && (value = transferFragment3.T0().f30850Y0.getValue()) != null) {
                                            FeeType feeType = FeeType.f13319d;
                                            c1573a2.f30841e = j.b(value, feeType, str);
                                            c1573a2.f30842f = transferFragment3.getString(R.string.fee_value, j.a(value, feeType, str));
                                            TransferController transferController2 = transferFragment3.f13142o0;
                                            if (transferController2 == null) {
                                                transferController2 = null;
                                            }
                                            transferController2.setData(c1573a2);
                                        }
                                    } else {
                                        c1573a2.f30838b = bankAccountDomain2;
                                        c1573a2.f30837a = bankAccountDomain2;
                                    }
                                    TransferController transferController3 = transferFragment3.f13142o0;
                                    (transferController3 != null ? transferController3 : null).setData(c1573a2);
                                    transferFragment3.V0();
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        });
        final int i15 = 1;
        E.b(this, "DONE", new InterfaceC0650p(this) { // from class: u8.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferFragment f30348b;

            {
                this.f30348b = this;
            }

            @Override // ca.InterfaceC0650p
            public final Object invoke(Object obj, Object obj2) {
                Object obj3;
                BankAccountDomain bankAccountDomain;
                String str;
                B5.h value;
                Bundle bundle2 = (Bundle) obj2;
                switch (i15) {
                    case 0:
                        TransferFragment transferFragment = this.f30348b;
                        C1573a c1573a = transferFragment.f13143p0;
                        if (c1573a.f30837a == null || c1573a.f30838b == null) {
                            transferFragment.f13145r0 = true;
                        }
                        break;
                    case 1:
                        TransferFragment transferFragment2 = this.f30348b;
                        transferFragment2.f13145r0 = true;
                        U4.b.g(transferFragment2).l();
                        break;
                    default:
                        String string = bundle2.getString("ACCOUNT");
                        if (string != null) {
                            TransferFragment transferFragment3 = this.f30348b;
                            List<BankAccountDomain> value2 = transferFragment3.T0().f30848W0.getValue();
                            if (value2 != null) {
                                Iterator<T> it = value2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (f.b(((BankAccountDomain) obj3).f10700g, string)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                BankAccountDomain bankAccountDomain2 = (BankAccountDomain) obj3;
                                if (bankAccountDomain2 != null) {
                                    int i142 = transferFragment3.f13144q0;
                                    C1573a c1573a2 = transferFragment3.f13143p0;
                                    if (i142 == 0) {
                                        c1573a2.f30838b = bankAccountDomain2;
                                        c1573a2.f30837a = bankAccountDomain2;
                                        if (transferFragment3.getView() != null && (bankAccountDomain = c1573a2.f30837a) != null && (str = bankAccountDomain.f10701h) != null && (value = transferFragment3.T0().f30850Y0.getValue()) != null) {
                                            FeeType feeType = FeeType.f13319d;
                                            c1573a2.f30841e = j.b(value, feeType, str);
                                            c1573a2.f30842f = transferFragment3.getString(R.string.fee_value, j.a(value, feeType, str));
                                            TransferController transferController2 = transferFragment3.f13142o0;
                                            if (transferController2 == null) {
                                                transferController2 = null;
                                            }
                                            transferController2.setData(c1573a2);
                                        }
                                    } else {
                                        c1573a2.f30838b = bankAccountDomain2;
                                        c1573a2.f30837a = bankAccountDomain2;
                                    }
                                    TransferController transferController3 = transferFragment3.f13142o0;
                                    (transferController3 != null ? transferController3 : null).setData(c1573a2);
                                    transferFragment3.V0();
                                }
                            }
                        }
                        break;
                }
                return p.f3034a;
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13141n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        AbstractC1415p6 u02 = u0();
        t0(true);
        s0();
        u02.f29480n.setVisibility(0);
        o.b(u02.f29481o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        AbstractC1415p6 u02 = u0();
        o.b(u02.f29480n);
        p0(true);
        B0();
        u02.f29481o.setVisibility(0);
    }
}
