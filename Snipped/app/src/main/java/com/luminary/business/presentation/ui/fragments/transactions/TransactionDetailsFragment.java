package com.luminary.business.presentation.ui.fragments.transactions;

import F8.o;
import Fa.h;
import O9.f;
import U4.b;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.g;
import f.i;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.d;
import org.bouncycastle.i18n.MessageBundle;
import t6.AbstractC1399n6;
import t8.c;
import t8.e;
import t8.j;

/* compiled from: TransactionDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class TransactionDetailsFragment extends BaseFragment<AbstractC1399n6> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f13126n0 = R.layout.fragment_transaction_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f13127o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f13128p0;

    /* renamed from: q0, reason: collision with root package name */
    public final FilePickerContractor f13129q0;

    /* renamed from: r0, reason: collision with root package name */
    public Uri f13130r0;
    public final f s0;

    /* renamed from: t0, reason: collision with root package name */
    public final AbstractC0704c<String> f13131t0;

    /* renamed from: u0, reason: collision with root package name */
    public final AbstractC0704c<String> f13132u0;

    /* renamed from: v0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f13133v0;

    /* compiled from: TransactionDetailsFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13139a;

        static {
            int[] iArr = new int[CryptoExchangeDomain.ExchangeStatus.values().length];
            try {
                CryptoExchangeDomain.ExchangeStatus.a aVar = CryptoExchangeDomain.ExchangeStatus.f11042a;
                iArr[14] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CryptoExchangeDomain.ExchangeStatus.a aVar2 = CryptoExchangeDomain.ExchangeStatus.f11042a;
                iArr[15] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CryptoExchangeDomain.ExchangeStatus.a aVar3 = CryptoExchangeDomain.ExchangeStatus.f11042a;
                iArr[16] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13139a = iArr;
        }
    }

    /* compiled from: TransactionDetailsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f13140a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f13140a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f13140a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13140a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment$special$$inlined$viewModel$default$1] */
    public TransactionDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f13127o0 = E.a(this, kotlin.jvm.internal.h.a(j.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(j.class), null, null, b.l(this));
            }
        });
        this.f13128p0 = new h(kotlin.jvm.internal.h.a(e.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment$special$$inlined$navArgs$1
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
        filePickerContractor.f13324d = new TransactionDetailsFragment$filePicker$1(1, this, TransactionDetailsFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f13129q0 = filePickerContractor;
        this.s0 = org.koin.java.a.a(K5.a.class);
        final int i = 0;
        this.f13131t0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: t8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsFragment f29933b;

            {
                this.f29933b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                TransactionDetailsFragment transactionDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f29933b.f13132u0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            TransactionDetailsFragment transactionDetailsFragment2 = this.f29933b;
                            transactionDetailsFragment2.f13130r0 = transactionDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", transactionDetailsFragment2.f13130r0);
                            transactionDetailsFragment2.f13133v0.a(transactionDetailsFragment2.f13130r0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (transactionDetailsFragment = this.f29933b).f13130r0) != null) {
                            transactionDetailsFragment.X0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f13132u0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: t8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsFragment f29933b;

            {
                this.f29933b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                TransactionDetailsFragment transactionDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f29933b.f13132u0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            TransactionDetailsFragment transactionDetailsFragment2 = this.f29933b;
                            transactionDetailsFragment2.f13130r0 = transactionDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", transactionDetailsFragment2.f13130r0);
                            transactionDetailsFragment2.f13133v0.a(transactionDetailsFragment2.f13130r0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (transactionDetailsFragment = this.f29933b).f13130r0) != null) {
                            transactionDetailsFragment.X0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        this.f13133v0 = registerForActivityResult(new i(), new InterfaceC0702a(this) { // from class: t8.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsFragment f29933b;

            {
                this.f29933b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                TransactionDetailsFragment transactionDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f29933b.f13132u0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            TransactionDetailsFragment transactionDetailsFragment2 = this.f29933b;
                            transactionDetailsFragment2.f13130r0 = transactionDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", transactionDetailsFragment2.f13130r0);
                            transactionDetailsFragment2.f13133v0.a(transactionDetailsFragment2.f13130r0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (transactionDetailsFragment = this.f29933b).f13130r0) != null) {
                            transactionDetailsFragment.X0(uri, true);
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
        toolbarStatus.f13276o = null;
        toolbarStatus.f13263a = (kotlin.jvm.internal.f.b(T0().f29942b.f11375e, "fx_order") || kotlin.jvm.internal.f.b(T0().f29942b.f11375e, "fx_execution") || kotlin.jvm.internal.f.b(T0().f29942b.f11375e, "exchange")) ? getString(R.string.exchange_details) : getString(R.string.transaction_details);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final e T0() {
        return (e) this.f13128p0.getValue();
    }

    public final j U0() {
        return (j) this.f13127o0.getValue();
    }

    public final void V0(TransactionUI transactionUI) {
        AbstractC1399n6 u02 = u0();
        boolean z10 = transactionUI.f11388s;
        ButtonSmall buttonSmall = u02.f29353H;
        ButtonSmall buttonSmall2 = u02.f29348C;
        if (z10) {
            buttonSmall2.setIcon(Integer.valueOf(R.drawable.ic_arrowtopright_white));
            buttonSmall2.setText(getString(R.string.send));
            buttonSmall.setIcon(Integer.valueOf(R.drawable.ic_invoice));
            buttonSmall.setText(getString(R.string.view_invoice));
            buttonSmall.setBackground(R.drawable.small_btn_bg);
        } else {
            buttonSmall2.setVisibility(0);
            buttonSmall2.setIcon(Integer.valueOf(R.drawable.ic_arrowtopright_white));
            buttonSmall2.setText(getString(R.string.send_again));
            buttonSmall.setIcon(Integer.valueOf(R.drawable.ic_invoice));
            buttonSmall.setText(getString(R.string.invoice));
            buttonSmall.setBackground(R.drawable.bg_button_black);
        }
        o.c(buttonSmall2, 500L, new t8.b(this, 2));
    }

    public final void W0(TransactionUI transactionUI) {
        String plainString;
        String plainString2;
        Integer M8;
        String str;
        String str2;
        String str3;
        String str4;
        String I10;
        String str5;
        String I11;
        String plainString3;
        String plainString4;
        Integer M10;
        String plainString5;
        String plainString6;
        AbstractC1399n6 u02 = u0();
        ButtonSmall buttonSmall = u02.f29348C;
        int i = 0;
        buttonSmall.setVisibility(0);
        buttonSmall.setText(getString(R.string.exchange_again));
        buttonSmall.setIcon(Integer.valueOf(R.drawable.ic_exchange_button));
        o.b(u02.f29353H);
        o.c(buttonSmall, 500L, new c(this, transactionUI, 1));
        String str6 = transactionUI.f11375e;
        boolean b9 = kotlin.jvm.internal.f.b(str6, "fx_order");
        BigDecimal bigDecimal = transactionUI.f11383n;
        String str7 = transactionUI.f11367B;
        String str8 = transactionUI.f11366A;
        String str9 = transactionUI.f11378h;
        if (b9) {
            u0().f29360n.setText(D9.b.v0("-", (bigDecimal == null || (plainString6 = bigDecimal.toPlainString()) == null) ? null : D9.b.v(plainString6), (bigDecimal == null || (plainString5 = bigDecimal.toPlainString()) == null) ? null : D9.b.u(plainString5, str9), transactionUI.f11378h, 30, 18, true, true, false, 256));
            AbstractC1399n6 u03 = u0();
            if (str8 != null && (M10 = D9.b.M(requireContext(), str8)) != null) {
                i = M10.intValue();
            }
            u03.f29347B.setImageResource(i);
        } else if (kotlin.jvm.internal.f.b(str6, "fx_execution") || kotlin.jvm.internal.f.b(str6, "exchange")) {
            AbstractC1399n6 u04 = u0();
            if (str7 != null && (M8 = D9.b.M(requireContext(), str7)) != null) {
                i = M8.intValue();
            }
            u04.f29347B.setImageResource(i);
            u0().f29360n.setText(D9.b.v0("+", (bigDecimal == null || (plainString2 = bigDecimal.toPlainString()) == null) ? null : D9.b.v(plainString2), (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) ? null : D9.b.u(plainString, str9), transactionUI.f11378h, 30, 18, true, true, false, 256));
        }
        u0().f29349D.setText(D9.b.S(transactionUI, requireContext()));
        u0().f29369w.setText(getString(R.string.fee));
        u0().f29363q.setText(getString(R.string.time_and_date));
        AbstractC1399n6 u05 = u0();
        Date date = transactionUI.f11382m;
        u05.f29364r.setText(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : null);
        u0().f29350E.setText(getString(R.string.exchange));
        o.b(u0().f29351F);
        o.b(u0().f29352G);
        o.b(u0().f29359N);
        o.b(u0().f29358M);
        u0().f29371y.setText(getString(R.string.you_sold));
        AbstractC1399n6 u06 = u0();
        String str10 = "";
        String str11 = str8 == null ? "" : str8;
        BigDecimal bigDecimal2 = transactionUI.f11368C;
        if (bigDecimal2 == null || (plainString4 = bigDecimal2.toPlainString()) == null || (str = D9.b.I(plainString4, str8)) == null) {
            str = "";
        }
        u06.f29372z.setText(D9.b.o(str11, str));
        u0().f29354I.setText(getString(R.string.you_received));
        AbstractC1399n6 u07 = u0();
        String str12 = str7 == null ? "" : str7;
        BigDecimal bigDecimal3 = transactionUI.f11369D;
        if (bigDecimal3 == null || (plainString3 = bigDecimal3.toPlainString()) == null || (str2 = D9.b.I(plainString3, str7)) == null) {
            str2 = "";
        }
        u07.f29355J.setText(D9.b.o(str12, str2));
        boolean z10 = transactionUI.f11388s;
        TransactionUI.CommissionUI commissionUI = transactionUI.f11395z;
        if (z10) {
            str3 = commissionUI != null ? commissionUI.f11396a : null;
            if (str3 == null || str3.length() == 0) {
                o.b(u0().f29370x);
                o.b(u0().f29369w);
                return;
            }
            AbstractC1399n6 u08 = u0();
            String str13 = str9 == null ? "" : str9;
            if (commissionUI != null && (str5 = commissionUI.f11396a) != null && (I11 = D9.b.I(str5, str9)) != null) {
                str10 = I11;
            }
            u08.f29370x.setText(D9.b.o(str13, str10));
            return;
        }
        str3 = commissionUI != null ? commissionUI.f11397b : null;
        if (str3 == null || str3.length() == 0) {
            o.b(u0().f29370x);
            o.b(u0().f29369w);
            return;
        }
        AbstractC1399n6 u09 = u0();
        String str14 = str9 == null ? "" : str9;
        if (commissionUI != null && (str4 = commissionUI.f11397b) != null && (I10 = D9.b.I(str4, str9)) != null) {
            str10 = I10;
        }
        u09.f29370x.setText(D9.b.o(str14, str10));
    }

    public final void X0(Uri uri, boolean z10) {
        String b9 = F8.e.b(requireActivity(), uri);
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f13129q0.f13322b;
        }
        String c2 = F8.e.c(requireContext, uri);
        if (c2 != null) {
            j U02 = U0();
            U02.getClass();
            t8.i iVar = new t8.i(U02, c2, b9, 0);
            U02.f419K0 = iVar;
            iVar.invoke();
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = U0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x08b0  */
    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 2402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.transactions.TransactionDetailsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13126n0;
    }
}
