package com.luminary.business.presentation.ui.fragments.newcompany.upload;

import A7.c;
import C.v;
import F8.e;
import F8.o;
import U4.b;
import a8.C0520a;
import a8.C0523d;
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
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.g;
import f.i;
import java.util.Date;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;
import t6.M4;

/* compiled from: UploadAdditionalDocumentsFragment.kt */
/* loaded from: classes2.dex */
public final class UploadAdditionalDocumentsFragment extends BaseFragment<M4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12702n0 = R.layout.fragment_new_company_upload_additional_document;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12703o0;

    /* renamed from: p0, reason: collision with root package name */
    public final FilePickerContractor f12704p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f12705q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12706r0;
    public Date s0;

    /* renamed from: t0, reason: collision with root package name */
    public Uri f12707t0;

    /* renamed from: u0, reason: collision with root package name */
    public final AbstractC0704c<String> f12708u0;

    /* renamed from: v0, reason: collision with root package name */
    public final AbstractC0704c<String> f12709v0;

    /* renamed from: w0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12710w0;

    /* compiled from: UploadAdditionalDocumentsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12716a;

        public b(C7.a aVar) {
            this.f12716a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12716a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12716a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment$special$$inlined$viewModel$default$1] */
    public UploadAdditionalDocumentsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12703o0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.upload.UploadAdditionalDocumentsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new UploadAdditionalDocumentsFragment$filePicker$1(1, this, UploadAdditionalDocumentsFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12704p0 = filePickerContractor;
        final int i = 0;
        this.f12708u0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: a8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadAdditionalDocumentsFragment f4474b;

            {
                this.f4474b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f4474b.f12709v0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment2 = this.f4474b;
                            uploadAdditionalDocumentsFragment2.f12707t0 = uploadAdditionalDocumentsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uploadAdditionalDocumentsFragment2.f12707t0);
                            uploadAdditionalDocumentsFragment2.f12710w0.a(uploadAdditionalDocumentsFragment2.f12707t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (uploadAdditionalDocumentsFragment = this.f4474b).f12707t0) != null) {
                            uploadAdditionalDocumentsFragment.T0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f12709v0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: a8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadAdditionalDocumentsFragment f4474b;

            {
                this.f4474b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f4474b.f12709v0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment2 = this.f4474b;
                            uploadAdditionalDocumentsFragment2.f12707t0 = uploadAdditionalDocumentsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uploadAdditionalDocumentsFragment2.f12707t0);
                            uploadAdditionalDocumentsFragment2.f12710w0.a(uploadAdditionalDocumentsFragment2.f12707t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (uploadAdditionalDocumentsFragment = this.f4474b).f12707t0) != null) {
                            uploadAdditionalDocumentsFragment.T0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        this.f12710w0 = registerForActivityResult(new i(), new InterfaceC0702a(this) { // from class: a8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadAdditionalDocumentsFragment f4474b;

            {
                this.f4474b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            this.f4474b.f12709v0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            UploadAdditionalDocumentsFragment uploadAdditionalDocumentsFragment2 = this.f4474b;
                            uploadAdditionalDocumentsFragment2.f12707t0 = uploadAdditionalDocumentsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uploadAdditionalDocumentsFragment2.f12707t0);
                            uploadAdditionalDocumentsFragment2.f12710w0.a(uploadAdditionalDocumentsFragment2.f12707t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b(bool, Boolean.TRUE) && (uri = (uploadAdditionalDocumentsFragment = this.f4474b).f12707t0) != null) {
                            uploadAdditionalDocumentsFragment.T0(uri, true);
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
        toolbarStatus.f13263a = getString(R.string.upload_documents);
        toolbarStatus.f13266d = getString(R.string.step_of, 12, 12);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.upload_documents);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final void T0(Uri uri, boolean z10) {
        String b9 = e.b(requireActivity(), uri);
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f12704p0.f13322b;
        }
        String c2 = e.c(requireContext, uri);
        if (c2 != null) {
            this.f12706r0 = c2;
            this.f12705q0 = b9;
            u0().f28184s.setText(b9);
            U0();
        }
    }

    public final void U0() {
        String str;
        String str2;
        boolean z10 = (String.valueOf(u0().f28183r.getText()).length() == 0 || (str = this.f12705q0) == null || str.length() == 0 || (str2 = this.f12706r0) == null || str2.length() == 0) ? false : true;
        u0().f28180o.setEnabled(z10);
        u0().f28181p.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!v.y(arguments, C0523d.class, "companyId")) {
                throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
            }
            if (arguments.getString("companyId") == null) {
                throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
            }
        }
        this.f11471m0 = (NewCompanyViewModel) this.f12703o0.getValue();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) this.f12703o0.getValue();
        newCompanyViewModel.f12450p1.observe(getViewLifecycleOwner(), new b(new C7.a(this, 17)));
        M4 u02 = u0();
        o.c(u02.f28184s, 500L, new C0520a(this, 2));
        u02.f28183r.addTextChangedListener(new a());
        o.c(u02.f28182q, 500L, new c(9, this, u02));
        o.c(u02.f28181p, 500L, new A8.b(u02, 18));
        o.c(u02.f28180o, 500L, new C0520a(this, 3));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12702n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(false);
        s0();
        u0().f28180o.setVisibility(0);
        o.b(u0().f28181p);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f28180o);
        u0().f28181p.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            UploadAdditionalDocumentsFragment.this.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
