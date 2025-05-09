package com.luminary.business.presentation.ui.fragments.newcompany.upload;

import A7.c;
import C.v;
import F8.e;
import F8.o;
import O9.p;
import a8.C0524e;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.a;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.g;
import f.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;
import t6.O4;

/* compiled from: UploadDocumentsFragment.kt */
/* loaded from: classes2.dex */
public final class UploadDocumentsFragment extends BaseFragment<O4> {

    /* renamed from: A0, reason: collision with root package name */
    public Uri f12717A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f12718B0;

    /* renamed from: C0, reason: collision with root package name */
    public final AbstractC0704c<String> f12719C0;

    /* renamed from: D0, reason: collision with root package name */
    public final AbstractC0704c<String> f12720D0;

    /* renamed from: E0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12721E0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12722n0 = R.layout.fragment_new_company_upload_document;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12723o0;

    /* renamed from: p0, reason: collision with root package name */
    public final FilePickerContractor f12724p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcompany.upload.a f12725q0;

    /* renamed from: r0, reason: collision with root package name */
    public NewCompanyViewModel.UploadFileType f12726r0;
    public UploadFileUI s0;

    /* renamed from: t0, reason: collision with root package name */
    public UploadFileUI f12727t0;

    /* renamed from: u0, reason: collision with root package name */
    public UploadFileUI f12728u0;

    /* renamed from: v0, reason: collision with root package name */
    public UploadFileUI f12729v0;

    /* renamed from: w0, reason: collision with root package name */
    public UploadFileUI f12730w0;

    /* renamed from: x0, reason: collision with root package name */
    public b f12731x0;

    /* renamed from: y0, reason: collision with root package name */
    public final ArrayList<UploadFileUI> f12732y0;

    /* renamed from: z0, reason: collision with root package name */
    public final ArrayList<UploadFileUI> f12733z0;

    /* compiled from: UploadDocumentsFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12738a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12738a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12738a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12738a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment$special$$inlined$viewModel$default$1] */
    public UploadDocumentsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12723o0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadDocumentsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, U4.b.l(this));
            }
        });
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new UploadDocumentsFragment$filePicker$1(1, this, UploadDocumentsFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12724p0 = filePickerContractor;
        this.f12732y0 = new ArrayList<>();
        this.f12733z0 = new ArrayList<>();
        final int i = 0;
        this.f12719C0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: a8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4484b;

            {
                this.f4484b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                UploadDocumentsFragment uploadDocumentsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f4484b.f12720D0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            UploadDocumentsFragment uploadDocumentsFragment2 = this.f4484b;
                            uploadDocumentsFragment2.f12717A0 = uploadDocumentsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uploadDocumentsFragment2.f12717A0);
                            uploadDocumentsFragment2.f12721E0.a(uploadDocumentsFragment2.f12717A0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (uploadDocumentsFragment = this.f4484b).f12717A0) != null) {
                            uploadDocumentsFragment.V0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f12720D0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: a8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4484b;

            {
                this.f4484b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                UploadDocumentsFragment uploadDocumentsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f4484b.f12720D0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            UploadDocumentsFragment uploadDocumentsFragment2 = this.f4484b;
                            uploadDocumentsFragment2.f12717A0 = uploadDocumentsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uploadDocumentsFragment2.f12717A0);
                            uploadDocumentsFragment2.f12721E0.a(uploadDocumentsFragment2.f12717A0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (uploadDocumentsFragment = this.f4484b).f12717A0) != null) {
                            uploadDocumentsFragment.V0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        this.f12721E0 = registerForActivityResult(new i(), new InterfaceC0702a(this) { // from class: a8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4484b;

            {
                this.f4484b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                UploadDocumentsFragment uploadDocumentsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f4484b.f12720D0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            UploadDocumentsFragment uploadDocumentsFragment2 = this.f4484b;
                            uploadDocumentsFragment2.f12717A0 = uploadDocumentsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uploadDocumentsFragment2.f12717A0);
                            uploadDocumentsFragment2.f12721E0.a(uploadDocumentsFragment2.f12717A0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (uploadDocumentsFragment = this.f4484b).f12717A0) != null) {
                            uploadDocumentsFragment.V0(uri, true);
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
        toolbarStatus.f13263a = getString(R.string.required_documents);
        toolbarStatus.f13266d = getString(R.string.step_of, 13, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.required_documents);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12723o0.getValue();
    }

    public final void U0() {
        u0().f28281C.removeAllViews();
        Iterator<UploadFileUI> it = this.f12732y0.iterator();
        while (it.hasNext()) {
            UploadFileUI next = it.next();
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.item_document, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.itemInputView);
            TextView textView2 = (TextView) inflate.findViewById(R.id.itemDelete);
            if (f.b(next.f11321g, Boolean.TRUE)) {
                o.b(textView2);
            }
            o.c(textView2, 500L, new c(10, this, next));
            textView.setText(next.f11316b);
            u0().f28281C.addView(inflate);
        }
    }

    public final void V0(Uri uri, boolean z10) {
        NewCompanyViewModel.UploadFileType uploadFileType = this.f12726r0;
        if (uploadFileType != null) {
            String b9 = e.b(requireActivity(), uri);
            Context requireContext = requireContext();
            if (!z10) {
                uri = this.f12724p0.f13322b;
            }
            String c2 = e.c(requireContext, uri);
            if (c2 != null) {
                UploadFileUI uploadFileUI = new UploadFileUI(c2, b9, uploadFileType, null, null, b9, Boolean.FALSE);
                switch (uploadFileType.ordinal()) {
                    case 4:
                        this.f12730w0 = uploadFileUI;
                        u0().f28287I.setText(b9);
                        u0().f28285G.setVisibility(0);
                        o.b(u0().f28286H);
                        break;
                    case 6:
                        this.s0 = uploadFileUI;
                        u0().f28296s.setText(b9);
                        u0().f28294q.setVisibility(0);
                        o.b(u0().f28295r);
                        break;
                    case 7:
                        this.f12727t0 = uploadFileUI;
                        u0().f28284F.setText(b9);
                        u0().f28282D.setVisibility(0);
                        o.b(u0().f28283E);
                        break;
                    case 8:
                        this.f12728u0 = uploadFileUI;
                        u0().f28302y.setText(b9);
                        u0().f28300w.setVisibility(0);
                        o.b(u0().f28301x);
                        break;
                    case 9:
                        this.f12729v0 = uploadFileUI;
                        u0().f28303z.setText(b9);
                        u0().f28279A.setVisibility(0);
                        o.b(u0().f28280B);
                        break;
                }
                Y0();
            }
        }
    }

    public final void W0() {
        e.a(this, null, new C0524e(this, 13), new C0524e(this, 14), new C0524e(this, 15));
    }

    public final void X0(String str, String str2) {
        Window window;
        View inflate = getLayoutInflater().inflate(R.layout.dialog_rates, (ViewGroup) null);
        this.f12731x0 = new b.a(requireContext()).setView(inflate).create();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.close);
        TextView textView = (TextView) inflate.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tvDescription);
        textView.setText(str);
        textView2.setText(str2);
        o.c(imageView, 500L, new C0524e(this, 16));
        b bVar = this.f12731x0;
        if (bVar != null && (window = bVar.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        b bVar2 = this.f12731x0;
        if (bVar2 != null) {
            bVar2.show();
        }
    }

    public final void Y0() {
        boolean z10 = (this.s0 == null || this.f12727t0 == null || this.f12730w0 == null) ? false : true;
        u0().f28292o.setEnabled(z10);
        u0().f28293p.setEnabled(z10);
        if (this.f12728u0 == null) {
            o.b(u0().f28300w);
            u0().f28301x.setVisibility(0);
        } else {
            u0().f28302y.setText(this.f12728u0.f11316b);
            u0().f28300w.setVisibility(0);
            o.b(u0().f28301x);
        }
        if (this.f12730w0 == null) {
            o.b(u0().f28285G);
            u0().f28286H.setVisibility(0);
        } else {
            u0().f28287I.setText(this.f12730w0.f11316b);
            u0().f28285G.setVisibility(0);
            o.b(u0().f28286H);
        }
        if (this.f12727t0 == null) {
            o.b(u0().f28282D);
            u0().f28283E.setVisibility(0);
        } else {
            u0().f28284F.setText(this.f12727t0.f11316b);
            u0().f28282D.setVisibility(0);
            o.b(u0().f28283E);
        }
        if (this.s0 == null) {
            o.b(u0().f28294q);
            u0().f28295r.setVisibility(0);
        } else {
            u0().f28296s.setText(this.s0.f11316b);
            u0().f28294q.setVisibility(0);
            o.b(u0().f28295r);
        }
        if (this.f12729v0 == null) {
            o.b(u0().f28279A);
            u0().f28280B.setVisibility(0);
        } else {
            u0().f28303z.setText(this.f12729v0.f11316b);
            u0().f28279A.setVisibility(0);
            o.b(u0().f28280B);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12725q0 = a.C0137a.a(arguments);
        }
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b bVar = this.f12731x0;
        if (bVar != null) {
            if (bVar != null) {
                bVar.dismiss();
            }
            this.f12731x0 = null;
        }
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CompanyDetailsUI companyDetailsUI;
        CompanyDetailsUI.CompanyUI companyUI;
        Integer num;
        super.onViewCreated(view, bundle);
        final int i = 1;
        T0().f12450p1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: a8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4482b;

            {
                this.f4482b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        List<u5.i> list = (List) obj;
                        if (list == null) {
                            return p.f3034a;
                        }
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4482b;
                        uploadDocumentsFragment.f12732y0.clear();
                        for (u5.i iVar : list) {
                            String str = iVar.f30312c;
                            NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.f12462b;
                            boolean b9 = kotlin.jvm.internal.f.b(str, "INCORPORATION_CERT");
                            String str2 = iVar.f30314e;
                            if (b9) {
                                UploadFileUI uploadFileUI = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType, null, null, null, Boolean.TRUE);
                                uploadDocumentsFragment.u0().f28296s.setText(str2);
                                uploadDocumentsFragment.s0 = uploadFileUI;
                            } else {
                                NewCompanyViewModel.UploadFileType uploadFileType2 = NewCompanyViewModel.UploadFileType.f12464d;
                                if (kotlin.jvm.internal.f.b(str, "FINANCIAL_STATEMENT")) {
                                    UploadFileUI uploadFileUI2 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType2, null, null, null, Boolean.TRUE);
                                    uploadDocumentsFragment.u0().f28302y.setText(str2);
                                    uploadDocumentsFragment.f12728u0 = uploadFileUI2;
                                } else {
                                    NewCompanyViewModel.UploadFileType uploadFileType3 = NewCompanyViewModel.UploadFileType.f12461a;
                                    if (kotlin.jvm.internal.f.b(str, "PROOF_OF_ADDRESS")) {
                                        UploadFileUI uploadFileUI3 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType3, null, null, null, Boolean.TRUE);
                                        uploadDocumentsFragment.u0().f28287I.setText(str2);
                                        uploadDocumentsFragment.f12730w0 = uploadFileUI3;
                                    } else {
                                        NewCompanyViewModel.UploadFileType uploadFileType4 = NewCompanyViewModel.UploadFileType.f12465e;
                                        if (kotlin.jvm.internal.f.b(str, "STATE_REGISTRY")) {
                                            UploadFileUI uploadFileUI4 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType4, null, null, null, Boolean.TRUE);
                                            uploadDocumentsFragment.u0().f28303z.setText(str2);
                                            uploadDocumentsFragment.f12729v0 = uploadFileUI4;
                                        } else {
                                            NewCompanyViewModel.UploadFileType uploadFileType5 = NewCompanyViewModel.UploadFileType.f12463c;
                                            if (kotlin.jvm.internal.f.b(str, "INCORPORATION_ARTICLES")) {
                                                UploadFileUI uploadFileUI5 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType5, null, null, null, Boolean.TRUE);
                                                uploadDocumentsFragment.u0().f28284F.setText(str2);
                                                uploadDocumentsFragment.f12727t0 = uploadFileUI5;
                                            } else {
                                                NewCompanyViewModel.UploadFileType uploadFileType6 = NewCompanyViewModel.UploadFileType.i;
                                                if (kotlin.jvm.internal.f.b(str, "CUSTOM")) {
                                                    uploadDocumentsFragment.f12732y0.add(new UploadFileUI("", str2 == null ? "" : str2, uploadFileType6, null, null, null, Boolean.TRUE));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        uploadDocumentsFragment.U0();
                        uploadDocumentsFragment.Y0();
                        uploadDocumentsFragment.T0().f12456v1.postValue(null);
                        return p.f3034a;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4482b;
                        ArrayList<UploadFileUI> arrayList = uploadDocumentsFragment2.f12733z0;
                        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                            Iterator<UploadFileUI> it = arrayList.iterator();
                            while (it.hasNext()) {
                                Boolean bool = it.next().f11321g;
                                if (bool == null || kotlin.jvm.internal.f.b(bool, Boolean.FALSE)) {
                                    uploadDocumentsFragment2.U0();
                                    return p.f3034a;
                                }
                            }
                        }
                        com.luminary.business.presentation.ui.fragments.newcompany.upload.a aVar = uploadDocumentsFragment2.f12725q0;
                        if (aVar != null) {
                            NavController g10 = U4.b.g(uploadDocumentsFragment2);
                            Bundle g11 = v.g(g10);
                            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CompanyDetailsUI.class);
                            Parcelable parcelable = aVar.f12739a;
                            if (isAssignableFrom) {
                                g11.putParcelable("companyDetails", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                    throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("companyDetails", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_uploadDocumentsFragment_to_submitCompanyFragment, g11);
                        }
                        return p.f3034a;
                }
            }
        }));
        U0();
        final int i9 = 0;
        T0().f12456v1.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: a8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4482b;

            {
                this.f4482b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        List<u5.i> list = (List) obj;
                        if (list == null) {
                            return p.f3034a;
                        }
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4482b;
                        uploadDocumentsFragment.f12732y0.clear();
                        for (u5.i iVar : list) {
                            String str = iVar.f30312c;
                            NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.f12462b;
                            boolean b9 = kotlin.jvm.internal.f.b(str, "INCORPORATION_CERT");
                            String str2 = iVar.f30314e;
                            if (b9) {
                                UploadFileUI uploadFileUI = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType, null, null, null, Boolean.TRUE);
                                uploadDocumentsFragment.u0().f28296s.setText(str2);
                                uploadDocumentsFragment.s0 = uploadFileUI;
                            } else {
                                NewCompanyViewModel.UploadFileType uploadFileType2 = NewCompanyViewModel.UploadFileType.f12464d;
                                if (kotlin.jvm.internal.f.b(str, "FINANCIAL_STATEMENT")) {
                                    UploadFileUI uploadFileUI2 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType2, null, null, null, Boolean.TRUE);
                                    uploadDocumentsFragment.u0().f28302y.setText(str2);
                                    uploadDocumentsFragment.f12728u0 = uploadFileUI2;
                                } else {
                                    NewCompanyViewModel.UploadFileType uploadFileType3 = NewCompanyViewModel.UploadFileType.f12461a;
                                    if (kotlin.jvm.internal.f.b(str, "PROOF_OF_ADDRESS")) {
                                        UploadFileUI uploadFileUI3 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType3, null, null, null, Boolean.TRUE);
                                        uploadDocumentsFragment.u0().f28287I.setText(str2);
                                        uploadDocumentsFragment.f12730w0 = uploadFileUI3;
                                    } else {
                                        NewCompanyViewModel.UploadFileType uploadFileType4 = NewCompanyViewModel.UploadFileType.f12465e;
                                        if (kotlin.jvm.internal.f.b(str, "STATE_REGISTRY")) {
                                            UploadFileUI uploadFileUI4 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType4, null, null, null, Boolean.TRUE);
                                            uploadDocumentsFragment.u0().f28303z.setText(str2);
                                            uploadDocumentsFragment.f12729v0 = uploadFileUI4;
                                        } else {
                                            NewCompanyViewModel.UploadFileType uploadFileType5 = NewCompanyViewModel.UploadFileType.f12463c;
                                            if (kotlin.jvm.internal.f.b(str, "INCORPORATION_ARTICLES")) {
                                                UploadFileUI uploadFileUI5 = new UploadFileUI("", str2 == null ? "" : str2, uploadFileType5, null, null, null, Boolean.TRUE);
                                                uploadDocumentsFragment.u0().f28284F.setText(str2);
                                                uploadDocumentsFragment.f12727t0 = uploadFileUI5;
                                            } else {
                                                NewCompanyViewModel.UploadFileType uploadFileType6 = NewCompanyViewModel.UploadFileType.i;
                                                if (kotlin.jvm.internal.f.b(str, "CUSTOM")) {
                                                    uploadDocumentsFragment.f12732y0.add(new UploadFileUI("", str2 == null ? "" : str2, uploadFileType6, null, null, null, Boolean.TRUE));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        uploadDocumentsFragment.U0();
                        uploadDocumentsFragment.Y0();
                        uploadDocumentsFragment.T0().f12456v1.postValue(null);
                        return p.f3034a;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4482b;
                        ArrayList<UploadFileUI> arrayList = uploadDocumentsFragment2.f12733z0;
                        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                            Iterator<UploadFileUI> it = arrayList.iterator();
                            while (it.hasNext()) {
                                Boolean bool = it.next().f11321g;
                                if (bool == null || kotlin.jvm.internal.f.b(bool, Boolean.FALSE)) {
                                    uploadDocumentsFragment2.U0();
                                    return p.f3034a;
                                }
                            }
                        }
                        com.luminary.business.presentation.ui.fragments.newcompany.upload.a aVar = uploadDocumentsFragment2.f12725q0;
                        if (aVar != null) {
                            NavController g10 = U4.b.g(uploadDocumentsFragment2);
                            Bundle g11 = v.g(g10);
                            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CompanyDetailsUI.class);
                            Parcelable parcelable = aVar.f12739a;
                            if (isAssignableFrom) {
                                g11.putParcelable("companyDetails", parcelable);
                            } else {
                                if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                                    throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                                }
                                g11.putSerializable("companyDetails", (Serializable) parcelable);
                            }
                            g10.i(R.id.action_uploadDocumentsFragment_to_submitCompanyFragment, g11);
                        }
                        return p.f3034a;
                }
            }
        }));
        E.b(this, "additional_document", new B6.h(this, 16));
        final O4 u02 = u0();
        o.c(u02.f28296s, 500L, new C0524e(this, 6));
        o.c(u02.f28284F, 500L, new C0524e(this, 7));
        o.c(u02.f28302y, 500L, new C0524e(this, 8));
        o.c(u02.f28287I, 500L, new C0524e(this, 9));
        o.c(u02.f28303z, 500L, new C0524e(this, 10));
        o.c(u02.f28292o, 500L, new C0524e(this, 11));
        o.c(u02.f28291n, 500L, new C0524e(this, 12));
        final int i10 = 0;
        o.c(u02.f28294q, 500L, new InterfaceC0635a(this) { // from class: a8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4486b;

            {
                this.f4486b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4486b;
                        uploadDocumentsFragment.s0 = null;
                        O4 o42 = u02;
                        o42.f28296s.setText(R.string.empty);
                        o.b(o42.f28294q);
                        o42.f28295r.setVisibility(0);
                        uploadDocumentsFragment.Y0();
                        break;
                    case 1:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4486b;
                        uploadDocumentsFragment2.f12727t0 = null;
                        O4 o43 = u02;
                        o43.f28284F.setText(R.string.empty);
                        o.b(o43.f28282D);
                        o43.f28283E.setVisibility(0);
                        uploadDocumentsFragment2.Y0();
                        break;
                    case 2:
                        UploadDocumentsFragment uploadDocumentsFragment3 = this.f4486b;
                        uploadDocumentsFragment3.f12728u0 = null;
                        O4 o44 = u02;
                        o44.f28302y.setText(R.string.empty);
                        o.b(o44.f28300w);
                        o44.f28301x.setVisibility(0);
                        uploadDocumentsFragment3.Y0();
                        break;
                    case 3:
                        UploadDocumentsFragment uploadDocumentsFragment4 = this.f4486b;
                        uploadDocumentsFragment4.f12729v0 = null;
                        O4 o45 = u02;
                        o45.f28303z.setText(R.string.empty);
                        o.b(o45.f28279A);
                        o45.f28280B.setVisibility(0);
                        uploadDocumentsFragment4.Y0();
                        break;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment5 = this.f4486b;
                        uploadDocumentsFragment5.f12730w0 = null;
                        O4 o46 = u02;
                        o46.f28287I.setText(R.string.empty);
                        o.b(o46.f28285G);
                        o46.f28286H.setVisibility(0);
                        uploadDocumentsFragment5.Y0();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i11 = 1;
        o.c(u02.f28282D, 500L, new InterfaceC0635a(this) { // from class: a8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4486b;

            {
                this.f4486b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4486b;
                        uploadDocumentsFragment.s0 = null;
                        O4 o42 = u02;
                        o42.f28296s.setText(R.string.empty);
                        o.b(o42.f28294q);
                        o42.f28295r.setVisibility(0);
                        uploadDocumentsFragment.Y0();
                        break;
                    case 1:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4486b;
                        uploadDocumentsFragment2.f12727t0 = null;
                        O4 o43 = u02;
                        o43.f28284F.setText(R.string.empty);
                        o.b(o43.f28282D);
                        o43.f28283E.setVisibility(0);
                        uploadDocumentsFragment2.Y0();
                        break;
                    case 2:
                        UploadDocumentsFragment uploadDocumentsFragment3 = this.f4486b;
                        uploadDocumentsFragment3.f12728u0 = null;
                        O4 o44 = u02;
                        o44.f28302y.setText(R.string.empty);
                        o.b(o44.f28300w);
                        o44.f28301x.setVisibility(0);
                        uploadDocumentsFragment3.Y0();
                        break;
                    case 3:
                        UploadDocumentsFragment uploadDocumentsFragment4 = this.f4486b;
                        uploadDocumentsFragment4.f12729v0 = null;
                        O4 o45 = u02;
                        o45.f28303z.setText(R.string.empty);
                        o.b(o45.f28279A);
                        o45.f28280B.setVisibility(0);
                        uploadDocumentsFragment4.Y0();
                        break;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment5 = this.f4486b;
                        uploadDocumentsFragment5.f12730w0 = null;
                        O4 o46 = u02;
                        o46.f28287I.setText(R.string.empty);
                        o.b(o46.f28285G);
                        o46.f28286H.setVisibility(0);
                        uploadDocumentsFragment5.Y0();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i12 = 2;
        o.c(u02.f28300w, 500L, new InterfaceC0635a(this) { // from class: a8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4486b;

            {
                this.f4486b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4486b;
                        uploadDocumentsFragment.s0 = null;
                        O4 o42 = u02;
                        o42.f28296s.setText(R.string.empty);
                        o.b(o42.f28294q);
                        o42.f28295r.setVisibility(0);
                        uploadDocumentsFragment.Y0();
                        break;
                    case 1:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4486b;
                        uploadDocumentsFragment2.f12727t0 = null;
                        O4 o43 = u02;
                        o43.f28284F.setText(R.string.empty);
                        o.b(o43.f28282D);
                        o43.f28283E.setVisibility(0);
                        uploadDocumentsFragment2.Y0();
                        break;
                    case 2:
                        UploadDocumentsFragment uploadDocumentsFragment3 = this.f4486b;
                        uploadDocumentsFragment3.f12728u0 = null;
                        O4 o44 = u02;
                        o44.f28302y.setText(R.string.empty);
                        o.b(o44.f28300w);
                        o44.f28301x.setVisibility(0);
                        uploadDocumentsFragment3.Y0();
                        break;
                    case 3:
                        UploadDocumentsFragment uploadDocumentsFragment4 = this.f4486b;
                        uploadDocumentsFragment4.f12729v0 = null;
                        O4 o45 = u02;
                        o45.f28303z.setText(R.string.empty);
                        o.b(o45.f28279A);
                        o45.f28280B.setVisibility(0);
                        uploadDocumentsFragment4.Y0();
                        break;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment5 = this.f4486b;
                        uploadDocumentsFragment5.f12730w0 = null;
                        O4 o46 = u02;
                        o46.f28287I.setText(R.string.empty);
                        o.b(o46.f28285G);
                        o46.f28286H.setVisibility(0);
                        uploadDocumentsFragment5.Y0();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i13 = 3;
        o.c(u02.f28279A, 500L, new InterfaceC0635a(this) { // from class: a8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4486b;

            {
                this.f4486b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4486b;
                        uploadDocumentsFragment.s0 = null;
                        O4 o42 = u02;
                        o42.f28296s.setText(R.string.empty);
                        o.b(o42.f28294q);
                        o42.f28295r.setVisibility(0);
                        uploadDocumentsFragment.Y0();
                        break;
                    case 1:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4486b;
                        uploadDocumentsFragment2.f12727t0 = null;
                        O4 o43 = u02;
                        o43.f28284F.setText(R.string.empty);
                        o.b(o43.f28282D);
                        o43.f28283E.setVisibility(0);
                        uploadDocumentsFragment2.Y0();
                        break;
                    case 2:
                        UploadDocumentsFragment uploadDocumentsFragment3 = this.f4486b;
                        uploadDocumentsFragment3.f12728u0 = null;
                        O4 o44 = u02;
                        o44.f28302y.setText(R.string.empty);
                        o.b(o44.f28300w);
                        o44.f28301x.setVisibility(0);
                        uploadDocumentsFragment3.Y0();
                        break;
                    case 3:
                        UploadDocumentsFragment uploadDocumentsFragment4 = this.f4486b;
                        uploadDocumentsFragment4.f12729v0 = null;
                        O4 o45 = u02;
                        o45.f28303z.setText(R.string.empty);
                        o.b(o45.f28279A);
                        o45.f28280B.setVisibility(0);
                        uploadDocumentsFragment4.Y0();
                        break;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment5 = this.f4486b;
                        uploadDocumentsFragment5.f12730w0 = null;
                        O4 o46 = u02;
                        o46.f28287I.setText(R.string.empty);
                        o.b(o46.f28285G);
                        o46.f28286H.setVisibility(0);
                        uploadDocumentsFragment5.Y0();
                        break;
                }
                return p.f3034a;
            }
        });
        final int i14 = 4;
        o.c(u02.f28285G, 500L, new InterfaceC0635a(this) { // from class: a8.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadDocumentsFragment f4486b;

            {
                this.f4486b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        UploadDocumentsFragment uploadDocumentsFragment = this.f4486b;
                        uploadDocumentsFragment.s0 = null;
                        O4 o42 = u02;
                        o42.f28296s.setText(R.string.empty);
                        o.b(o42.f28294q);
                        o42.f28295r.setVisibility(0);
                        uploadDocumentsFragment.Y0();
                        break;
                    case 1:
                        UploadDocumentsFragment uploadDocumentsFragment2 = this.f4486b;
                        uploadDocumentsFragment2.f12727t0 = null;
                        O4 o43 = u02;
                        o43.f28284F.setText(R.string.empty);
                        o.b(o43.f28282D);
                        o43.f28283E.setVisibility(0);
                        uploadDocumentsFragment2.Y0();
                        break;
                    case 2:
                        UploadDocumentsFragment uploadDocumentsFragment3 = this.f4486b;
                        uploadDocumentsFragment3.f12728u0 = null;
                        O4 o44 = u02;
                        o44.f28302y.setText(R.string.empty);
                        o.b(o44.f28300w);
                        o44.f28301x.setVisibility(0);
                        uploadDocumentsFragment3.Y0();
                        break;
                    case 3:
                        UploadDocumentsFragment uploadDocumentsFragment4 = this.f4486b;
                        uploadDocumentsFragment4.f12729v0 = null;
                        O4 o45 = u02;
                        o45.f28303z.setText(R.string.empty);
                        o.b(o45.f28279A);
                        o45.f28280B.setVisibility(0);
                        uploadDocumentsFragment4.Y0();
                        break;
                    default:
                        UploadDocumentsFragment uploadDocumentsFragment5 = this.f4486b;
                        uploadDocumentsFragment5.f12730w0 = null;
                        O4 o46 = u02;
                        o46.f28287I.setText(R.string.empty);
                        o.b(o46.f28285G);
                        o46.f28286H.setVisibility(0);
                        uploadDocumentsFragment5.Y0();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(u02.f28297t, 500L, new C0524e(this, 0));
        o.c(u02.f28288J, 500L, new C0524e(this, 1));
        o.c(u02.f28298u, 500L, new C0524e(this, 2));
        o.c(u02.f28289K, 500L, new C0524e(this, 3));
        o.c(u02.f28290L, 500L, new C0524e(this, 4));
        o.c(u02.f28299v, 500L, new C0524e(this, 5));
        Y0();
        if (this.f12718B0) {
            return;
        }
        this.f12718B0 = true;
        com.luminary.business.presentation.ui.fragments.newcompany.upload.a aVar = this.f12725q0;
        if (aVar == null || (companyDetailsUI = aVar.f12739a) == null || (companyUI = companyDetailsUI.f11192a) == null || (num = companyUI.f11218a) == null) {
            return;
        }
        int intValue = num.intValue();
        NewCompanyViewModel T02 = T0();
        O7.b bVar = new O7.b(T02, String.valueOf(intValue), 3);
        T02.f424Q0 = bVar;
        bVar.invoke();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12722n0;
    }
}
