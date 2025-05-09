package com.luminary.business.presentation.ui.fragments.settings;

import C.v;
import F8.e;
import F8.o;
import I5.k;
import O9.p;
import P9.s;
import U4.b;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import c.RunnableC0615f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.settings.SettingsFragment;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;
import com.luminary.business.presentation.ui.views.dialogs.EditTFADialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;
import q.h;
import q.i;
import t6.Q5;

/* compiled from: SettingsFragment.kt */
/* loaded from: classes2.dex */
public final class SettingsFragment extends BaseFragment<Q5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12981n0 = R.layout.fragment_settings;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12982o0;

    /* renamed from: p0, reason: collision with root package name */
    public i f12983p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f12984q0;

    /* renamed from: r0, reason: collision with root package name */
    public SettingsController f12985r0;
    public m8.b s0;

    /* renamed from: t0, reason: collision with root package name */
    public Uri f12986t0;

    /* renamed from: u0, reason: collision with root package name */
    public final FilePickerContractor f12987u0;

    /* renamed from: v0, reason: collision with root package name */
    public final AbstractC0704c<String> f12988v0;

    /* renamed from: w0, reason: collision with root package name */
    public final AbstractC0704c<Intent> f12989w0;

    /* renamed from: x0, reason: collision with root package name */
    public final AbstractC0704c<String> f12990x0;

    /* renamed from: y0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12991y0;

    /* renamed from: z0, reason: collision with root package name */
    public long f12992z0;

    /* compiled from: SettingsFragment.kt */
    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            SettingsFragment settingsFragment = SettingsFragment.this;
            if (settingsFragment.getView() != null) {
                settingsFragment.f12984q0 = gVar != null ? gVar.f9855d : 0;
                settingsFragment.L0();
                settingsFragment.V0();
            }
        }
    }

    /* compiled from: SettingsFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12998a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f12998a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12998a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12998a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.settings.SettingsFragment$special$$inlined$viewModel$default$1] */
    public SettingsFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.settings.SettingsFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12982o0 = E.a(this, h.a(SettingsViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.settings.SettingsFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.settings.SettingsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(SettingsViewModel.class), null, null, b.l(this));
            }
        });
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new SettingsFragment$filePicker$1(1, this, SettingsFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12987u0 = filePickerContractor;
        final int i = 0;
        this.f12988v0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: m8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24020b;

            {
                this.f24020b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                SettingsFragment settingsFragment;
                Uri uri;
                switch (i) {
                    case 0:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            this.f24020b.f12990x0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (((ActivityResult) obj).f4575a == -1) {
                            SettingsViewModel T02 = this.f24020b.T0();
                            T02.getClass();
                            j jVar = new j(0, T02);
                            T02.f422O0 = jVar;
                            jVar.invoke();
                            break;
                        }
                        break;
                    case 2:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            SettingsFragment settingsFragment2 = this.f24020b;
                            settingsFragment2.f12986t0 = settingsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", settingsFragment2.f12986t0);
                            settingsFragment2.f12991y0.a(settingsFragment2.f12986t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE) && (uri = (settingsFragment = this.f24020b).f12986t0) != null) {
                            settingsFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i9 = 1;
        this.f12989w0 = registerForActivityResult(new f.h(), new InterfaceC0702a(this) { // from class: m8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24020b;

            {
                this.f24020b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                SettingsFragment settingsFragment;
                Uri uri;
                switch (i9) {
                    case 0:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            this.f24020b.f12990x0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (((ActivityResult) obj).f4575a == -1) {
                            SettingsViewModel T02 = this.f24020b.T0();
                            T02.getClass();
                            j jVar = new j(0, T02);
                            T02.f422O0 = jVar;
                            jVar.invoke();
                            break;
                        }
                        break;
                    case 2:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            SettingsFragment settingsFragment2 = this.f24020b;
                            settingsFragment2.f12986t0 = settingsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", settingsFragment2.f12986t0);
                            settingsFragment2.f12991y0.a(settingsFragment2.f12986t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE) && (uri = (settingsFragment = this.f24020b).f12986t0) != null) {
                            settingsFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        this.f12990x0 = registerForActivityResult(new g(), new InterfaceC0702a(this) { // from class: m8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24020b;

            {
                this.f24020b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                SettingsFragment settingsFragment;
                Uri uri;
                switch (i10) {
                    case 0:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            this.f24020b.f12990x0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (((ActivityResult) obj).f4575a == -1) {
                            SettingsViewModel T02 = this.f24020b.T0();
                            T02.getClass();
                            j jVar = new j(0, T02);
                            T02.f422O0 = jVar;
                            jVar.invoke();
                            break;
                        }
                        break;
                    case 2:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            SettingsFragment settingsFragment2 = this.f24020b;
                            settingsFragment2.f12986t0 = settingsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", settingsFragment2.f12986t0);
                            settingsFragment2.f12991y0.a(settingsFragment2.f12986t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE) && (uri = (settingsFragment = this.f24020b).f12986t0) != null) {
                            settingsFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 3;
        this.f12991y0 = registerForActivityResult(new f.i(), new InterfaceC0702a(this) { // from class: m8.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24020b;

            {
                this.f24020b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                SettingsFragment settingsFragment;
                Uri uri;
                switch (i11) {
                    case 0:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            this.f24020b.f12990x0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (((ActivityResult) obj).f4575a == -1) {
                            SettingsViewModel T02 = this.f24020b.T0();
                            T02.getClass();
                            j jVar = new j(0, T02);
                            T02.f422O0 = jVar;
                            jVar.invoke();
                            break;
                        }
                        break;
                    case 2:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            SettingsFragment settingsFragment2 = this.f24020b;
                            settingsFragment2.f12986t0 = settingsFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", settingsFragment2.f12986t0);
                            settingsFragment2.f12991y0.a(settingsFragment2.f12986t0);
                            break;
                        }
                        break;
                    default:
                        if (kotlin.jvm.internal.f.b((Boolean) obj, Boolean.TRUE) && (uri = (settingsFragment = this.f24020b).f12986t0) != null) {
                            settingsFragment.U0(uri, true);
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
        toolbarStatus.f13265c = 28;
        toolbarStatus.f13263a = getString(R.string.hub_settings);
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        int i = this.f12984q0;
        toolbarStatus.f13263a = i != 0 ? i != 1 ? getString(R.string.settings) : getString(R.string.business) : getString(R.string.personal);
        return toolbarStatus;
    }

    public final SettingsViewModel T0() {
        return (SettingsViewModel) this.f12982o0.getValue();
    }

    public final void U0(Uri uri, boolean z10) {
        e.b(requireContext(), uri);
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f12987u0.f13322b;
        }
        String c2 = e.c(requireContext, uri);
        if (c2 != null) {
            SettingsViewModel T02 = T0();
            int i = this.f12984q0;
            T02.getClass();
            G7.f fVar = new G7.f(i, T02, c2);
            T02.f421M0 = fVar;
            fVar.invoke();
        }
    }

    public final void V0() {
        CorporateDetailsDomain value;
        CorporateDetailsDomain value2;
        List<CorporateDetailsDomain.b> list;
        Object obj;
        List<String> list2;
        String P4;
        this.f12992z0 = System.currentTimeMillis();
        int i = this.f12984q0;
        if (i != 0) {
            if (i == 1) {
                SettingsController settingsController = this.f12985r0;
                if (settingsController == null) {
                    settingsController = null;
                }
                settingsController.setData(null, T0().f13007b1.getValue(), null, Integer.valueOf(this.f12984q0));
                return;
            }
            if (i != 2) {
                return;
            }
            SettingsController settingsController2 = this.f12985r0;
            if (settingsController2 == null) {
                settingsController2 = null;
            }
            settingsController2.setData(null, null, null, Integer.valueOf(i));
            u0().f28399n.postDelayed(new RunnableC0615f(this, 13), 150L);
            return;
        }
        k value3 = T0().f13006a1.getValue();
        if (value3 == null || (value = T0().f13007b1.getValue()) == null) {
            return;
        }
        SettingsController settingsController3 = this.f12985r0;
        if (settingsController3 == null) {
            settingsController3 = null;
        }
        SettingsViewModel T02 = T0();
        k value4 = T02.f13006a1.getValue();
        String str = "";
        if (value4 != null && (value2 = T02.f13008c1.getValue()) != null && (list = value2.f10805b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                CorporateDetailsDomain.a aVar = ((CorporateDetailsDomain.b) obj).f10950e;
                if (f.b(aVar != null ? aVar.f10893c : null, value4.f1817c)) {
                    break;
                }
            }
            CorporateDetailsDomain.b bVar = (CorporateDetailsDomain.b) obj;
            if (bVar != null && (list2 = bVar.f10946a) != null && (P4 = s.P(list2, ", ", null, null, new Z3.a(18), 30)) != null) {
                str = P4;
            }
        }
        settingsController3.setData(new Triple(value3, value, str), null, null, Integer.valueOf(this.f12984q0));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        w0().dismiss();
        if (this.f12984q0 == 2) {
            V0();
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int a10 = new q.h(new h.c(requireContext())).a(32783);
        if (a10 == -2) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13014a;
        } else if (a10 == -1) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13014a;
        } else if (a10 == 0) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13015b;
        } else if (a10 == 1) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13014a;
        } else if (a10 == 11) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13016c;
        } else if (a10 == 12) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13014a;
        } else if (a10 == 15) {
            T0().f13013h1 = SettingsViewModel.BioStatus.f13014a;
        }
        final int i = 0;
        this.f12985r0 = new SettingsController(requireContext(), new a(), new InterfaceC0646l(this) { // from class: m8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24027b;

            {
                this.f24027b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                CorporateDetailsDomain.a aVar;
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        final SettingsFragment settingsFragment = this.f24027b;
                        CorporateDetailsDomain value = settingsFragment.T0().f13007b1.getValue();
                        if (kotlin.jvm.internal.f.b(str, (value == null || (aVar = value.f10804a) == null) ? null : aVar.f10937z)) {
                            v.w(U4.b.g(settingsFragment), R.id.action_settingsFragment_to_myCompaniesFragment);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.two_factor_authentication))) {
                            EditTFADialog editTFADialog = new EditTFADialog(settingsFragment.requireContext());
                            settingsFragment.T0();
                            editTFADialog.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.password))) {
                            settingsFragment.T0().f13009d1.setValue(null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.passcode))) {
                            if (settingsFragment.s0 == null) {
                                settingsFragment.s0 = new b(settingsFragment.requireContext(), new e(settingsFragment, 3));
                            }
                            b bVar = settingsFragment.s0;
                            if (bVar != null) {
                                bVar.show();
                            }
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.support))) {
                            U4.b.g(settingsFragment).i(R.id.action_settingsFragment_to_SupportFragment, null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.face_id))) {
                            BaseFragment.q0(settingsFragment, Collections.singletonList("support@com"));
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.about_us_and_legal))) {
                            final G5.a l10 = settingsFragment.T0().f13003X0.l();
                            final int i9 = 0;
                            InterfaceC0635a interfaceC0635a = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i9) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i10 = 1;
                            InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i11 = 2;
                            InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i12 = 3;
                            InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            B6.g gVar = new B6.g(2);
                            Context requireContext = settingsFragment.requireContext();
                            int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
                            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_link_picker, new LinearLayout(requireContext));
                            androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
                            Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
                            }
                            Window window2 = create.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 80;
                            }
                            Window window3 = create.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.tv_support_email);
                            View findViewById = inflate.findViewById(R.id.tv_cookie_policy);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_privacy_policy);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_terms_conditions);
                            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_cancel);
                            o.c(textView, 500L, new F8.d(create, interfaceC0635a, 2));
                            o.c(findViewById, 500L, new F8.d(create, interfaceC0635a2, 3));
                            o.c(textView2, 500L, new F8.d(create, interfaceC0635a3, 4));
                            o.c(textView3, 500L, new F8.d(create, interfaceC0635a4, 5));
                            o.c(textView4, 500L, new F8.d(create, gVar, 6));
                            create.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.deactivate_account))) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = settingsFragment.getString(R.string.deactivate_your_account);
                            c2.f13296b = settingsFragment.getString(R.string.please_note_deleting_is_permanent);
                            c2.f13297c = settingsFragment.getString(R.string.deactivate_account);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            c2.f13299e = settingsFragment.getString(R.string.cancel);
                            settingsFragment.w0().c(c2, new e(settingsFragment, 4), null);
                        }
                        break;
                    case 1:
                        this.f24027b.V0();
                        break;
                    case 2:
                        this.f24027b.V0();
                        break;
                    case 3:
                        this.f24027b.V0();
                        break;
                    case 4:
                        v.w(U4.b.g(this.f24027b), R.id.action_settingsFragment_to_resetPasswordFragment);
                        break;
                    default:
                        BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                        SettingsFragment settingsFragment2 = this.f24027b;
                        settingsFragment2.requireContext();
                        aVar2.getClass();
                        BottomDialogType b9 = BottomDialogType.a.b();
                        b9.f13295a = settingsFragment2.getString(R.string.your_account_deactivated);
                        b9.f13296b = settingsFragment2.getString(R.string.our_customer_support_via_email);
                        b9.f13297c = settingsFragment2.getString(R.string.done);
                        settingsFragment2.w0().c(b9, new e(settingsFragment2, 5), null);
                        break;
                }
                return p.f3034a;
            }
        }, new m8.e(this, 7), new B6.h(this, 25), new m8.e(this, 8));
        Q5 u02 = u0();
        SettingsController settingsController = this.f12985r0;
        if (settingsController == null) {
            settingsController = null;
        }
        u02.f28399n.setAdapter(settingsController.getAdapter());
        SettingsViewModel T02 = T0();
        T02.f13010e1.postValue(T02.f12999T0.f());
        T02.k0();
        final int i9 = 1;
        T0().f13007b1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: m8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24027b;

            {
                this.f24027b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                CorporateDetailsDomain.a aVar;
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        final SettingsFragment settingsFragment = this.f24027b;
                        CorporateDetailsDomain value = settingsFragment.T0().f13007b1.getValue();
                        if (kotlin.jvm.internal.f.b(str, (value == null || (aVar = value.f10804a) == null) ? null : aVar.f10937z)) {
                            v.w(U4.b.g(settingsFragment), R.id.action_settingsFragment_to_myCompaniesFragment);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.two_factor_authentication))) {
                            EditTFADialog editTFADialog = new EditTFADialog(settingsFragment.requireContext());
                            settingsFragment.T0();
                            editTFADialog.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.password))) {
                            settingsFragment.T0().f13009d1.setValue(null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.passcode))) {
                            if (settingsFragment.s0 == null) {
                                settingsFragment.s0 = new b(settingsFragment.requireContext(), new e(settingsFragment, 3));
                            }
                            b bVar = settingsFragment.s0;
                            if (bVar != null) {
                                bVar.show();
                            }
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.support))) {
                            U4.b.g(settingsFragment).i(R.id.action_settingsFragment_to_SupportFragment, null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.face_id))) {
                            BaseFragment.q0(settingsFragment, Collections.singletonList("support@com"));
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.about_us_and_legal))) {
                            final G5.a l10 = settingsFragment.T0().f13003X0.l();
                            final int i92 = 0;
                            InterfaceC0635a interfaceC0635a = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i92) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i10 = 1;
                            InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i11 = 2;
                            InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i12 = 3;
                            InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            B6.g gVar = new B6.g(2);
                            Context requireContext = settingsFragment.requireContext();
                            int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
                            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_link_picker, new LinearLayout(requireContext));
                            androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
                            Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
                            }
                            Window window2 = create.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 80;
                            }
                            Window window3 = create.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.tv_support_email);
                            View findViewById = inflate.findViewById(R.id.tv_cookie_policy);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_privacy_policy);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_terms_conditions);
                            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_cancel);
                            o.c(textView, 500L, new F8.d(create, interfaceC0635a, 2));
                            o.c(findViewById, 500L, new F8.d(create, interfaceC0635a2, 3));
                            o.c(textView2, 500L, new F8.d(create, interfaceC0635a3, 4));
                            o.c(textView3, 500L, new F8.d(create, interfaceC0635a4, 5));
                            o.c(textView4, 500L, new F8.d(create, gVar, 6));
                            create.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.deactivate_account))) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = settingsFragment.getString(R.string.deactivate_your_account);
                            c2.f13296b = settingsFragment.getString(R.string.please_note_deleting_is_permanent);
                            c2.f13297c = settingsFragment.getString(R.string.deactivate_account);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            c2.f13299e = settingsFragment.getString(R.string.cancel);
                            settingsFragment.w0().c(c2, new e(settingsFragment, 4), null);
                        }
                        break;
                    case 1:
                        this.f24027b.V0();
                        break;
                    case 2:
                        this.f24027b.V0();
                        break;
                    case 3:
                        this.f24027b.V0();
                        break;
                    case 4:
                        v.w(U4.b.g(this.f24027b), R.id.action_settingsFragment_to_resetPasswordFragment);
                        break;
                    default:
                        BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                        SettingsFragment settingsFragment2 = this.f24027b;
                        settingsFragment2.requireContext();
                        aVar2.getClass();
                        BottomDialogType b9 = BottomDialogType.a.b();
                        b9.f13295a = settingsFragment2.getString(R.string.your_account_deactivated);
                        b9.f13296b = settingsFragment2.getString(R.string.our_customer_support_via_email);
                        b9.f13297c = settingsFragment2.getString(R.string.done);
                        settingsFragment2.w0().c(b9, new e(settingsFragment2, 5), null);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        T0().f13008c1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: m8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24027b;

            {
                this.f24027b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                CorporateDetailsDomain.a aVar;
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        final SettingsFragment settingsFragment = this.f24027b;
                        CorporateDetailsDomain value = settingsFragment.T0().f13007b1.getValue();
                        if (kotlin.jvm.internal.f.b(str, (value == null || (aVar = value.f10804a) == null) ? null : aVar.f10937z)) {
                            v.w(U4.b.g(settingsFragment), R.id.action_settingsFragment_to_myCompaniesFragment);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.two_factor_authentication))) {
                            EditTFADialog editTFADialog = new EditTFADialog(settingsFragment.requireContext());
                            settingsFragment.T0();
                            editTFADialog.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.password))) {
                            settingsFragment.T0().f13009d1.setValue(null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.passcode))) {
                            if (settingsFragment.s0 == null) {
                                settingsFragment.s0 = new b(settingsFragment.requireContext(), new e(settingsFragment, 3));
                            }
                            b bVar = settingsFragment.s0;
                            if (bVar != null) {
                                bVar.show();
                            }
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.support))) {
                            U4.b.g(settingsFragment).i(R.id.action_settingsFragment_to_SupportFragment, null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.face_id))) {
                            BaseFragment.q0(settingsFragment, Collections.singletonList("support@com"));
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.about_us_and_legal))) {
                            final G5.a l10 = settingsFragment.T0().f13003X0.l();
                            final int i92 = 0;
                            InterfaceC0635a interfaceC0635a = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i92) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i102 = 1;
                            InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i102) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i11 = 2;
                            InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i12 = 3;
                            InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            B6.g gVar = new B6.g(2);
                            Context requireContext = settingsFragment.requireContext();
                            int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
                            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_link_picker, new LinearLayout(requireContext));
                            androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
                            Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
                            }
                            Window window2 = create.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 80;
                            }
                            Window window3 = create.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.tv_support_email);
                            View findViewById = inflate.findViewById(R.id.tv_cookie_policy);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_privacy_policy);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_terms_conditions);
                            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_cancel);
                            o.c(textView, 500L, new F8.d(create, interfaceC0635a, 2));
                            o.c(findViewById, 500L, new F8.d(create, interfaceC0635a2, 3));
                            o.c(textView2, 500L, new F8.d(create, interfaceC0635a3, 4));
                            o.c(textView3, 500L, new F8.d(create, interfaceC0635a4, 5));
                            o.c(textView4, 500L, new F8.d(create, gVar, 6));
                            create.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.deactivate_account))) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = settingsFragment.getString(R.string.deactivate_your_account);
                            c2.f13296b = settingsFragment.getString(R.string.please_note_deleting_is_permanent);
                            c2.f13297c = settingsFragment.getString(R.string.deactivate_account);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            c2.f13299e = settingsFragment.getString(R.string.cancel);
                            settingsFragment.w0().c(c2, new e(settingsFragment, 4), null);
                        }
                        break;
                    case 1:
                        this.f24027b.V0();
                        break;
                    case 2:
                        this.f24027b.V0();
                        break;
                    case 3:
                        this.f24027b.V0();
                        break;
                    case 4:
                        v.w(U4.b.g(this.f24027b), R.id.action_settingsFragment_to_resetPasswordFragment);
                        break;
                    default:
                        BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                        SettingsFragment settingsFragment2 = this.f24027b;
                        settingsFragment2.requireContext();
                        aVar2.getClass();
                        BottomDialogType b9 = BottomDialogType.a.b();
                        b9.f13295a = settingsFragment2.getString(R.string.your_account_deactivated);
                        b9.f13296b = settingsFragment2.getString(R.string.our_customer_support_via_email);
                        b9.f13297c = settingsFragment2.getString(R.string.done);
                        settingsFragment2.w0().c(b9, new e(settingsFragment2, 5), null);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i11 = 3;
        T0().f13006a1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: m8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24027b;

            {
                this.f24027b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                CorporateDetailsDomain.a aVar;
                switch (i11) {
                    case 0:
                        String str = (String) obj;
                        final SettingsFragment settingsFragment = this.f24027b;
                        CorporateDetailsDomain value = settingsFragment.T0().f13007b1.getValue();
                        if (kotlin.jvm.internal.f.b(str, (value == null || (aVar = value.f10804a) == null) ? null : aVar.f10937z)) {
                            v.w(U4.b.g(settingsFragment), R.id.action_settingsFragment_to_myCompaniesFragment);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.two_factor_authentication))) {
                            EditTFADialog editTFADialog = new EditTFADialog(settingsFragment.requireContext());
                            settingsFragment.T0();
                            editTFADialog.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.password))) {
                            settingsFragment.T0().f13009d1.setValue(null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.passcode))) {
                            if (settingsFragment.s0 == null) {
                                settingsFragment.s0 = new b(settingsFragment.requireContext(), new e(settingsFragment, 3));
                            }
                            b bVar = settingsFragment.s0;
                            if (bVar != null) {
                                bVar.show();
                            }
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.support))) {
                            U4.b.g(settingsFragment).i(R.id.action_settingsFragment_to_SupportFragment, null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.face_id))) {
                            BaseFragment.q0(settingsFragment, Collections.singletonList("support@com"));
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.about_us_and_legal))) {
                            final G5.a l10 = settingsFragment.T0().f13003X0.l();
                            final int i92 = 0;
                            InterfaceC0635a interfaceC0635a = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i92) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i102 = 1;
                            InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i102) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i112 = 2;
                            InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i12 = 3;
                            InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            B6.g gVar = new B6.g(2);
                            Context requireContext = settingsFragment.requireContext();
                            int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
                            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_link_picker, new LinearLayout(requireContext));
                            androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
                            Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
                            }
                            Window window2 = create.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 80;
                            }
                            Window window3 = create.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.tv_support_email);
                            View findViewById = inflate.findViewById(R.id.tv_cookie_policy);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_privacy_policy);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_terms_conditions);
                            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_cancel);
                            o.c(textView, 500L, new F8.d(create, interfaceC0635a, 2));
                            o.c(findViewById, 500L, new F8.d(create, interfaceC0635a2, 3));
                            o.c(textView2, 500L, new F8.d(create, interfaceC0635a3, 4));
                            o.c(textView3, 500L, new F8.d(create, interfaceC0635a4, 5));
                            o.c(textView4, 500L, new F8.d(create, gVar, 6));
                            create.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.deactivate_account))) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = settingsFragment.getString(R.string.deactivate_your_account);
                            c2.f13296b = settingsFragment.getString(R.string.please_note_deleting_is_permanent);
                            c2.f13297c = settingsFragment.getString(R.string.deactivate_account);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            c2.f13299e = settingsFragment.getString(R.string.cancel);
                            settingsFragment.w0().c(c2, new e(settingsFragment, 4), null);
                        }
                        break;
                    case 1:
                        this.f24027b.V0();
                        break;
                    case 2:
                        this.f24027b.V0();
                        break;
                    case 3:
                        this.f24027b.V0();
                        break;
                    case 4:
                        v.w(U4.b.g(this.f24027b), R.id.action_settingsFragment_to_resetPasswordFragment);
                        break;
                    default:
                        BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                        SettingsFragment settingsFragment2 = this.f24027b;
                        settingsFragment2.requireContext();
                        aVar2.getClass();
                        BottomDialogType b9 = BottomDialogType.a.b();
                        b9.f13295a = settingsFragment2.getString(R.string.your_account_deactivated);
                        b9.f13296b = settingsFragment2.getString(R.string.our_customer_support_via_email);
                        b9.f13297c = settingsFragment2.getString(R.string.done);
                        settingsFragment2.w0().c(b9, new e(settingsFragment2, 5), null);
                        break;
                }
                return p.f3034a;
            }
        }));
        SettingsViewModel T03 = T0();
        final int i12 = 4;
        T03.f13009d1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: m8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24027b;

            {
                this.f24027b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                CorporateDetailsDomain.a aVar;
                switch (i12) {
                    case 0:
                        String str = (String) obj;
                        final SettingsFragment settingsFragment = this.f24027b;
                        CorporateDetailsDomain value = settingsFragment.T0().f13007b1.getValue();
                        if (kotlin.jvm.internal.f.b(str, (value == null || (aVar = value.f10804a) == null) ? null : aVar.f10937z)) {
                            v.w(U4.b.g(settingsFragment), R.id.action_settingsFragment_to_myCompaniesFragment);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.two_factor_authentication))) {
                            EditTFADialog editTFADialog = new EditTFADialog(settingsFragment.requireContext());
                            settingsFragment.T0();
                            editTFADialog.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.password))) {
                            settingsFragment.T0().f13009d1.setValue(null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.passcode))) {
                            if (settingsFragment.s0 == null) {
                                settingsFragment.s0 = new b(settingsFragment.requireContext(), new e(settingsFragment, 3));
                            }
                            b bVar = settingsFragment.s0;
                            if (bVar != null) {
                                bVar.show();
                            }
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.support))) {
                            U4.b.g(settingsFragment).i(R.id.action_settingsFragment_to_SupportFragment, null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.face_id))) {
                            BaseFragment.q0(settingsFragment, Collections.singletonList("support@com"));
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.about_us_and_legal))) {
                            final G5.a l10 = settingsFragment.T0().f13003X0.l();
                            final int i92 = 0;
                            InterfaceC0635a interfaceC0635a = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i92) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i102 = 1;
                            InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i102) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i112 = 2;
                            InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i122 = 3;
                            InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i122) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            B6.g gVar = new B6.g(2);
                            Context requireContext = settingsFragment.requireContext();
                            int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
                            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_link_picker, new LinearLayout(requireContext));
                            androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
                            Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
                            }
                            Window window2 = create.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 80;
                            }
                            Window window3 = create.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.tv_support_email);
                            View findViewById = inflate.findViewById(R.id.tv_cookie_policy);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_privacy_policy);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_terms_conditions);
                            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_cancel);
                            o.c(textView, 500L, new F8.d(create, interfaceC0635a, 2));
                            o.c(findViewById, 500L, new F8.d(create, interfaceC0635a2, 3));
                            o.c(textView2, 500L, new F8.d(create, interfaceC0635a3, 4));
                            o.c(textView3, 500L, new F8.d(create, interfaceC0635a4, 5));
                            o.c(textView4, 500L, new F8.d(create, gVar, 6));
                            create.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.deactivate_account))) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = settingsFragment.getString(R.string.deactivate_your_account);
                            c2.f13296b = settingsFragment.getString(R.string.please_note_deleting_is_permanent);
                            c2.f13297c = settingsFragment.getString(R.string.deactivate_account);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            c2.f13299e = settingsFragment.getString(R.string.cancel);
                            settingsFragment.w0().c(c2, new e(settingsFragment, 4), null);
                        }
                        break;
                    case 1:
                        this.f24027b.V0();
                        break;
                    case 2:
                        this.f24027b.V0();
                        break;
                    case 3:
                        this.f24027b.V0();
                        break;
                    case 4:
                        v.w(U4.b.g(this.f24027b), R.id.action_settingsFragment_to_resetPasswordFragment);
                        break;
                    default:
                        BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                        SettingsFragment settingsFragment2 = this.f24027b;
                        settingsFragment2.requireContext();
                        aVar2.getClass();
                        BottomDialogType b9 = BottomDialogType.a.b();
                        b9.f13295a = settingsFragment2.getString(R.string.your_account_deactivated);
                        b9.f13296b = settingsFragment2.getString(R.string.our_customer_support_via_email);
                        b9.f13297c = settingsFragment2.getString(R.string.done);
                        settingsFragment2.w0().c(b9, new e(settingsFragment2, 5), null);
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i13 = 5;
        T0().f13011f1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: m8.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsFragment f24027b;

            {
                this.f24027b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                CorporateDetailsDomain.a aVar;
                switch (i13) {
                    case 0:
                        String str = (String) obj;
                        final SettingsFragment settingsFragment = this.f24027b;
                        CorporateDetailsDomain value = settingsFragment.T0().f13007b1.getValue();
                        if (kotlin.jvm.internal.f.b(str, (value == null || (aVar = value.f10804a) == null) ? null : aVar.f10937z)) {
                            v.w(U4.b.g(settingsFragment), R.id.action_settingsFragment_to_myCompaniesFragment);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.two_factor_authentication))) {
                            EditTFADialog editTFADialog = new EditTFADialog(settingsFragment.requireContext());
                            settingsFragment.T0();
                            editTFADialog.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.password))) {
                            settingsFragment.T0().f13009d1.setValue(null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.passcode))) {
                            if (settingsFragment.s0 == null) {
                                settingsFragment.s0 = new b(settingsFragment.requireContext(), new e(settingsFragment, 3));
                            }
                            b bVar = settingsFragment.s0;
                            if (bVar != null) {
                                bVar.show();
                            }
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.support))) {
                            U4.b.g(settingsFragment).i(R.id.action_settingsFragment_to_SupportFragment, null);
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.face_id))) {
                            BaseFragment.q0(settingsFragment, Collections.singletonList("support@com"));
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.about_us_and_legal))) {
                            final G5.a l10 = settingsFragment.T0().f13003X0.l();
                            final int i92 = 0;
                            InterfaceC0635a interfaceC0635a = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i92) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i102 = 1;
                            InterfaceC0635a interfaceC0635a2 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i102) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i112 = 2;
                            InterfaceC0635a interfaceC0635a3 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i112) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            final int i122 = 3;
                            InterfaceC0635a interfaceC0635a4 = new InterfaceC0635a() { // from class: m8.f
                                @Override // ca.InterfaceC0635a
                                public final Object invoke() {
                                    switch (i122) {
                                        case 0:
                                            G5.a aVar2 = l10;
                                            BaseFragment.q0(settingsFragment, Collections.singletonList(aVar2 != null ? aVar2.f1320a : null));
                                            break;
                                        case 1:
                                            G5.a aVar3 = l10;
                                            settingsFragment.A0(aVar3 != null ? aVar3.f1321b : null);
                                            break;
                                        case 2:
                                            G5.a aVar4 = l10;
                                            settingsFragment.A0(aVar4 != null ? aVar4.f1322c : null);
                                            break;
                                        default:
                                            G5.a aVar5 = l10;
                                            settingsFragment.A0(aVar5 != null ? aVar5.f1323d : null);
                                            break;
                                    }
                                    return p.f3034a;
                                }
                            };
                            B6.g gVar = new B6.g(2);
                            Context requireContext = settingsFragment.requireContext();
                            int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
                            View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_link_picker, new LinearLayout(requireContext));
                            androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
                            Window window = create.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
                            }
                            Window window2 = create.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 80;
                            }
                            Window window3 = create.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            TextView textView = (TextView) inflate.findViewById(R.id.tv_support_email);
                            View findViewById = inflate.findViewById(R.id.tv_cookie_policy);
                            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_privacy_policy);
                            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_terms_conditions);
                            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_cancel);
                            o.c(textView, 500L, new F8.d(create, interfaceC0635a, 2));
                            o.c(findViewById, 500L, new F8.d(create, interfaceC0635a2, 3));
                            o.c(textView2, 500L, new F8.d(create, interfaceC0635a3, 4));
                            o.c(textView3, 500L, new F8.d(create, interfaceC0635a4, 5));
                            o.c(textView4, 500L, new F8.d(create, gVar, 6));
                            create.show();
                        } else if (kotlin.jvm.internal.f.b(str, settingsFragment.getString(R.string.deactivate_account))) {
                            BottomDialogType.f13289k.getClass();
                            BottomDialogType c2 = BottomDialogType.a.c();
                            c2.f13295a = settingsFragment.getString(R.string.deactivate_your_account);
                            c2.f13296b = settingsFragment.getString(R.string.please_note_deleting_is_permanent);
                            c2.f13297c = settingsFragment.getString(R.string.deactivate_account);
                            c2.f13301g = BottomDialogType.Type.ERROR;
                            c2.f13299e = settingsFragment.getString(R.string.cancel);
                            settingsFragment.w0().c(c2, new e(settingsFragment, 4), null);
                        }
                        break;
                    case 1:
                        this.f24027b.V0();
                        break;
                    case 2:
                        this.f24027b.V0();
                        break;
                    case 3:
                        this.f24027b.V0();
                        break;
                    case 4:
                        v.w(U4.b.g(this.f24027b), R.id.action_settingsFragment_to_resetPasswordFragment);
                        break;
                    default:
                        BottomDialogType.a aVar2 = BottomDialogType.f13289k;
                        SettingsFragment settingsFragment2 = this.f24027b;
                        settingsFragment2.requireContext();
                        aVar2.getClass();
                        BottomDialogType b9 = BottomDialogType.a.b();
                        b9.f13295a = settingsFragment2.getString(R.string.your_account_deactivated);
                        b9.f13296b = settingsFragment2.getString(R.string.our_customer_support_via_email);
                        b9.f13297c = settingsFragment2.getString(R.string.done);
                        settingsFragment2.w0().c(b9, new e(settingsFragment2, 5), null);
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12981n0;
    }
}
