package com.luminary.business.presentation.ui.fragments.invoices.invoice_details;

import C.N;
import F8.e;
import F8.k;
import F8.o;
import Fa.h;
import O9.p;
import U4.b;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.SpannedString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.impl.utils.a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.signature.ObjectKey;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.PDFView.a;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment;
import com.luminary.business.presentation.ui.views.ButtonSmall;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.g;
import f.i;
import java.io.File;
import java.math.BigDecimal;
import ka.C0967l;
import ka.C0969n;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.MessageBundle;
import t6.AbstractC1309c4;

/* compiled from: InvoiceDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class InvoiceDetailsFragment extends BaseFragment<AbstractC1309c4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12300n0 = R.layout.fragment_invoice_details;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12301o0;

    /* renamed from: p0, reason: collision with root package name */
    public final h f12302p0;

    /* renamed from: q0, reason: collision with root package name */
    public final FilePickerContractor f12303q0;

    /* renamed from: r0, reason: collision with root package name */
    public Uri f12304r0;
    public final AbstractC0704c<String> s0;

    /* renamed from: t0, reason: collision with root package name */
    public final AbstractC0704c<String> f12305t0;

    /* renamed from: u0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12306u0;

    /* compiled from: InvoiceDetailsFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12312a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12312a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12312a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12312a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment$special$$inlined$viewModel$default$1] */
    public InvoiceDetailsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12301o0 = E.a(this, kotlin.jvm.internal.h.a(E7.h.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), kotlin.jvm.internal.h.a(E7.h.class), null, null, b.l(this));
            }
        });
        this.f12302p0 = new h(kotlin.jvm.internal.h.a(E7.d.class), new InterfaceC0635a<Bundle>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.invoice_details.InvoiceDetailsFragment$special$$inlined$navArgs$1
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
        filePickerContractor.f13324d = new InvoiceDetailsFragment$filePicker$1(1, this, InvoiceDetailsFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12303q0 = filePickerContractor;
        final int i = 0;
        this.s0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: E7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsFragment f1070b;

            {
                this.f1070b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                InvoiceDetailsFragment invoiceDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f1070b.f12305t0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            InvoiceDetailsFragment invoiceDetailsFragment2 = this.f1070b;
                            invoiceDetailsFragment2.f12304r0 = invoiceDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", invoiceDetailsFragment2.f12304r0);
                            invoiceDetailsFragment2.f12306u0.a(invoiceDetailsFragment2.f12304r0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (invoiceDetailsFragment = this.f1070b).f12304r0) != null) {
                            invoiceDetailsFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f12305t0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: E7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsFragment f1070b;

            {
                this.f1070b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                InvoiceDetailsFragment invoiceDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f1070b.f12305t0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            InvoiceDetailsFragment invoiceDetailsFragment2 = this.f1070b;
                            invoiceDetailsFragment2.f12304r0 = invoiceDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", invoiceDetailsFragment2.f12304r0);
                            invoiceDetailsFragment2.f12306u0.a(invoiceDetailsFragment2.f12304r0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (invoiceDetailsFragment = this.f1070b).f12304r0) != null) {
                            invoiceDetailsFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        this.f12306u0 = registerForActivityResult(new i(), new InterfaceC0702a(this) { // from class: E7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsFragment f1070b;

            {
                this.f1070b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                InvoiceDetailsFragment invoiceDetailsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f1070b.f12305t0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            InvoiceDetailsFragment invoiceDetailsFragment2 = this.f1070b;
                            invoiceDetailsFragment2.f12304r0 = invoiceDetailsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", invoiceDetailsFragment2.f12304r0);
                            invoiceDetailsFragment2.f12306u0.a(invoiceDetailsFragment2.f12304r0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (invoiceDetailsFragment = this.f1070b).f12304r0) != null) {
                            invoiceDetailsFragment.U0(uri, true);
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
        toolbarStatus.f13263a = ((E7.d) this.f12302p0.getValue()).f1076b.f11389t ? getString(R.string.invoice_details) : getString(R.string.add_invoice_title);
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final E7.h T0() {
        return (E7.h) this.f12301o0.getValue();
    }

    public final void U0(Uri uri, boolean z10) {
        int i = 1;
        char c2 = 0;
        String b9 = e.b(requireContext(), uri);
        u0().f28869s.setVisibility(0);
        o.b(u0().f28864n);
        String name = new File(b9).getName();
        int j02 = C0969n.j0('.', 0, 6, name);
        if (f.b(j02 == -1 ? "" : name.substring(j02 + 1, name.length()), "pdf")) {
            u0().f28874x.setVisibility(0);
            o.b(u0().f28872v);
            PDFView pDFView = u0().f28874x;
            pDFView.getClass();
            N n10 = new N(12, c2);
            n10.f535b = uri;
            PDFView.a aVar = pDFView.new a(n10);
            aVar.f8846b = new int[]{0};
            aVar.a();
        } else {
            o.b(u0().f28874x);
            u0().f28872v.setVisibility(0);
            ImageView imageView = u0().f28872v;
            Glide.with(imageView.getContext().getApplicationContext()).load(uri).transition(DrawableTransitionOptions.withCrossFade()).timeout(6000).apply((BaseRequestOptions<?>) new RequestOptions().transform(new CenterCrop(), new RoundedCorners(16))).into(imageView);
        }
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f12303q0.f13322b;
        }
        String c10 = e.c(requireContext, uri);
        if (c10 != null) {
            E7.h T02 = T0();
            D7.e eVar = new D7.e(c10, b9, i, T02);
            T02.f421M0 = eVar;
            eVar.invoke();
        }
    }

    public final void V0() {
        e.a(this, null, new E7.b(this, 0), new E7.b(this, 1), new E7.b(this, 2));
    }

    public final void W0(TransactionUI transactionUI) {
        String plainString;
        AbstractC1309c4 u02 = u0();
        Integer valueOf = Integer.valueOf(R.drawable.ic_add);
        ButtonSmall buttonSmall = u02.f28864n;
        buttonSmall.setIcon(valueOf);
        buttonSmall.setText(getString(R.string.add_invoice));
        boolean z10 = false;
        buttonSmall.setVisibility(transactionUI.f11389t ^ true ? 0 : 8);
        boolean z11 = transactionUI.f11389t;
        u02.f28869s.setVisibility(z11 ? 0 : 8);
        boolean z12 = transactionUI.f11388s;
        String str = z12 ? "+" : "-";
        BigDecimal bigDecimal = transactionUI.f11383n;
        SpannedString v02 = D9.b.v0(str, (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) ? null : D9.b.v(plainString), D9.b.u(String.valueOf(bigDecimal), transactionUI.f11378h), transactionUI.f11378h, 30, 18, true, true, false, 256);
        TextView textView = u02.f28865o;
        textView.setText(v02);
        String str2 = transactionUI.f11384o;
        u02.f28875y.setText(str2 != null ? D9.b.l(C0967l.X(str2, "_", " ", false)) : null);
        int I02 = D9.b.I0(transactionUI);
        ImageView imageView = u02.f28870t;
        imageView.setImageResource(I02);
        Integer N10 = D9.b.N(transactionUI, requireContext());
        u02.f28871u.setImageResource(N10 != null ? N10.intValue() : 0);
        TextView textView2 = u02.f28873w;
        if (z12) {
            textView2.setText(transactionUI.f11376f);
        } else {
            textView2.setText(transactionUI.f11379j);
        }
        Integer num = transactionUI.f11372b;
        if (num != null && num.intValue() == 6) {
            textView2.setText(getString(R.string.empty));
        }
        if (D9.b.a0(transactionUI)) {
            textView.setTextColor(requireContext().getColor(R.color.neutral_400));
            textView2.setTextColor(requireContext().getColor(R.color.neutral_400));
            if (num != null && num.intValue() == 6) {
                imageView.setImageResource(R.drawable.ic_exchange_declined);
            }
        }
        if (z11) {
            String str3 = ((E7.d) this.f12302p0.getValue()).f1075a;
            if (str3.length() == 0) {
                V0();
                return;
            }
            File file = new File(requireContext().getFilesDir().getAbsolutePath(), "Statements");
            if (!file.exists()) {
                file.mkdirs();
            }
            E7.h T02 = T0();
            E7.f fVar = new E7.f(T02, str3, file.getAbsolutePath(), z10);
            T02.f420L0 = fVar;
            fVar.invoke();
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        E7.d dVar = (E7.d) this.f12302p0.getValue();
        E7.h T02 = T0();
        E7.e eVar = new E7.e(T02, dVar.f1075a, 0);
        T02.f419K0 = eVar;
        eVar.invoke();
        W0(dVar.f1076b);
        final int i = 0;
        T0().f1095a1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: E7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsFragment f1074b;

            {
                this.f1074b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                InvoiceDetailsFragment invoiceDetailsFragment = this.f1074b;
                char c2 = 0;
                switch (i) {
                    case 0:
                        invoiceDetailsFragment.u0().f28864n.setVisibility(0);
                        break;
                    case 1:
                        String str = (String) obj;
                        File file = new File(str);
                        String name = file.getName();
                        int j02 = C0969n.j0('.', 0, 6, name);
                        if (kotlin.jvm.internal.f.b(j02 == -1 ? "" : name.substring(j02 + 1, name.length()), "pdf")) {
                            invoiceDetailsFragment.u0().f28874x.setVisibility(0);
                            o.b(invoiceDetailsFragment.u0().f28872v);
                            PDFView pDFView = invoiceDetailsFragment.u0().f28874x;
                            pDFView.getClass();
                            N n10 = new N(11, c2);
                            n10.f535b = file;
                            PDFView.a aVar = pDFView.new a(n10);
                            aVar.f8846b = new int[]{0};
                            aVar.a();
                        } else {
                            o.b(invoiceDetailsFragment.u0().f28874x);
                            invoiceDetailsFragment.u0().f28872v.setVisibility(0);
                            AbstractC1309c4 u02 = invoiceDetailsFragment.u0();
                            if (str != null) {
                                File file2 = new File(str);
                                ImageView imageView = u02.f28872v;
                                Glide.with(imageView.getContext().getApplicationContext()).load(str).signature(new ObjectKey(file2.getPath() + file2.lastModified())).transition(DrawableTransitionOptions.withCrossFade()).timeout(6000).apply((BaseRequestOptions<?>) new RequestOptions().transform(new CenterCrop(), new RoundedCorners(16))).into(imageView);
                            }
                        }
                        break;
                    default:
                        F5.b bVar = (F5.b) obj;
                        if (bVar != null) {
                            invoiceDetailsFragment.W0(k.a(bVar));
                            break;
                        } else {
                            break;
                        }
                }
                return p.f3034a;
            }
        }));
        final int i9 = 1;
        T0().f1094Z0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: E7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsFragment f1074b;

            {
                this.f1074b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                InvoiceDetailsFragment invoiceDetailsFragment = this.f1074b;
                char c2 = 0;
                switch (i9) {
                    case 0:
                        invoiceDetailsFragment.u0().f28864n.setVisibility(0);
                        break;
                    case 1:
                        String str = (String) obj;
                        File file = new File(str);
                        String name = file.getName();
                        int j02 = C0969n.j0('.', 0, 6, name);
                        if (kotlin.jvm.internal.f.b(j02 == -1 ? "" : name.substring(j02 + 1, name.length()), "pdf")) {
                            invoiceDetailsFragment.u0().f28874x.setVisibility(0);
                            o.b(invoiceDetailsFragment.u0().f28872v);
                            PDFView pDFView = invoiceDetailsFragment.u0().f28874x;
                            pDFView.getClass();
                            N n10 = new N(11, c2);
                            n10.f535b = file;
                            PDFView.a aVar = pDFView.new a(n10);
                            aVar.f8846b = new int[]{0};
                            aVar.a();
                        } else {
                            o.b(invoiceDetailsFragment.u0().f28874x);
                            invoiceDetailsFragment.u0().f28872v.setVisibility(0);
                            AbstractC1309c4 u02 = invoiceDetailsFragment.u0();
                            if (str != null) {
                                File file2 = new File(str);
                                ImageView imageView = u02.f28872v;
                                Glide.with(imageView.getContext().getApplicationContext()).load(str).signature(new ObjectKey(file2.getPath() + file2.lastModified())).transition(DrawableTransitionOptions.withCrossFade()).timeout(6000).apply((BaseRequestOptions<?>) new RequestOptions().transform(new CenterCrop(), new RoundedCorners(16))).into(imageView);
                            }
                        }
                        break;
                    default:
                        F5.b bVar = (F5.b) obj;
                        if (bVar != null) {
                            invoiceDetailsFragment.W0(k.a(bVar));
                            break;
                        } else {
                            break;
                        }
                }
                return p.f3034a;
            }
        }));
        AbstractC1309c4 u02 = u0();
        o.c(u02.f28866p, 500L, new E7.b(this, 3));
        AbstractC1309c4 u03 = u0();
        o.c(u03.f28868r, 500L, new E7.b(this, 4));
        AbstractC1309c4 u04 = u0();
        o.c(u04.f28867q, 500L, new E7.b(this, 5));
        AbstractC1309c4 u05 = u0();
        o.c(u05.f28864n, 500L, new E7.b(this, 6));
        final int i10 = 2;
        T0().f1093Y0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: E7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoiceDetailsFragment f1074b;

            {
                this.f1074b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                InvoiceDetailsFragment invoiceDetailsFragment = this.f1074b;
                char c2 = 0;
                switch (i10) {
                    case 0:
                        invoiceDetailsFragment.u0().f28864n.setVisibility(0);
                        break;
                    case 1:
                        String str = (String) obj;
                        File file = new File(str);
                        String name = file.getName();
                        int j02 = C0969n.j0('.', 0, 6, name);
                        if (kotlin.jvm.internal.f.b(j02 == -1 ? "" : name.substring(j02 + 1, name.length()), "pdf")) {
                            invoiceDetailsFragment.u0().f28874x.setVisibility(0);
                            o.b(invoiceDetailsFragment.u0().f28872v);
                            PDFView pDFView = invoiceDetailsFragment.u0().f28874x;
                            pDFView.getClass();
                            N n10 = new N(11, c2);
                            n10.f535b = file;
                            PDFView.a aVar = pDFView.new a(n10);
                            aVar.f8846b = new int[]{0};
                            aVar.a();
                        } else {
                            o.b(invoiceDetailsFragment.u0().f28874x);
                            invoiceDetailsFragment.u0().f28872v.setVisibility(0);
                            AbstractC1309c4 u022 = invoiceDetailsFragment.u0();
                            if (str != null) {
                                File file2 = new File(str);
                                ImageView imageView = u022.f28872v;
                                Glide.with(imageView.getContext().getApplicationContext()).load(str).signature(new ObjectKey(file2.getPath() + file2.lastModified())).transition(DrawableTransitionOptions.withCrossFade()).timeout(6000).apply((BaseRequestOptions<?>) new RequestOptions().transform(new CenterCrop(), new RoundedCorners(16))).into(imageView);
                            }
                        }
                        break;
                    default:
                        F5.b bVar = (F5.b) obj;
                        if (bVar != null) {
                            invoiceDetailsFragment.W0(k.a(bVar));
                            break;
                        } else {
                            break;
                        }
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12300n0;
    }
}
