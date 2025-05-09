package com.luminary.business.presentation.ui.fragments.newcompany.addubo;

import F8.o;
import P9.n;
import P9.s;
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
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.addubo.a;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.bouncycastle.i18n.MessageBundle;
import t6.I2;

/* compiled from: AddUBOFragment.kt */
/* loaded from: classes2.dex */
public final class AddUBOFragment extends BaseFragment<I2> {

    /* renamed from: A0, reason: collision with root package name */
    public UploadFileUI f12482A0;

    /* renamed from: B0, reason: collision with root package name */
    public final FilePickerContractor f12483B0;

    /* renamed from: C0, reason: collision with root package name */
    public Uri f12484C0;

    /* renamed from: D0, reason: collision with root package name */
    public final AbstractC0704c<String> f12485D0;

    /* renamed from: E0, reason: collision with root package name */
    public final AbstractC0704c<String> f12486E0;

    /* renamed from: F0, reason: collision with root package name */
    public final AbstractC0704c<Uri> f12487F0;

    /* renamed from: G0, reason: collision with root package name */
    public final H1.a f12488G0;

    /* renamed from: o0, reason: collision with root package name */
    public com.luminary.business.presentation.ui.fragments.newcompany.addubo.a f12490o0;
    public int s0;

    /* renamed from: u0, reason: collision with root package name */
    public String f12495u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f12496v0;

    /* renamed from: w0, reason: collision with root package name */
    public String f12497w0;

    /* renamed from: x0, reason: collision with root package name */
    public String f12498x0;

    /* renamed from: y0, reason: collision with root package name */
    public String f12499y0;

    /* renamed from: z0, reason: collision with root package name */
    public String f12500z0;

    /* renamed from: n0, reason: collision with root package name */
    public final int f12489n0 = R.layout.fragment_add_ubo;

    /* renamed from: p0, reason: collision with root package name */
    public List<String> f12491p0 = EmptyList.f23104a;

    /* renamed from: q0, reason: collision with root package name */
    public float f12492q0 = 100.0f;

    /* renamed from: r0, reason: collision with root package name */
    public TeamMembersFragment.UBOType f12493r0 = TeamMembersFragment.UBOType.f12692a;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f12494t0 = true;

    /* compiled from: AddUBOFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12505a;

        static {
            int[] iArr = new int[TeamMembersFragment.UBOType.values().length];
            try {
                TeamMembersFragment.UBOType uBOType = TeamMembersFragment.UBOType.f12692a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TeamMembersFragment.UBOType uBOType2 = TeamMembersFragment.UBOType.f12692a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TeamMembersFragment.UBOType uBOType3 = TeamMembersFragment.UBOType.f12692a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12505a = iArr;
        }
    }

    /* compiled from: AddUBOFragment.kt */
    public static final class k implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12515a;

        public k(Q7.c cVar) {
            this.f12515a = cVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12515a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12515a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment$special$$inlined$viewModel$default$1] */
    public AddUBOFragment() {
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new AddUBOFragment$filePicker$1(1, this, AddUBOFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;Z)V", 0);
        this.f12483B0 = filePickerContractor;
        final int i9 = 0;
        this.f12485D0 = registerForActivityResult(new f.g(), new InterfaceC0702a(this) { // from class: Q7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddUBOFragment f3196b;

            {
                this.f3196b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                AddUBOFragment addUBOFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i9) {
                    case 0:
                        if (f.b(bool, Boolean.TRUE)) {
                            this.f3196b.f12486E0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            AddUBOFragment addUBOFragment2 = this.f3196b;
                            addUBOFragment2.f12484C0 = addUBOFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", addUBOFragment2.f12484C0);
                            addUBOFragment2.f12487F0.a(addUBOFragment2.f12484C0);
                            break;
                        }
                        break;
                    default:
                        if (f.b(bool, Boolean.TRUE) && (uri = (addUBOFragment = this.f3196b).f12484C0) != null) {
                            addUBOFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f12486E0 = registerForActivityResult(new f.g(), new InterfaceC0702a(this) { // from class: Q7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddUBOFragment f3196b;

            {
                this.f3196b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                AddUBOFragment addUBOFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (f.b(bool, Boolean.TRUE)) {
                            this.f3196b.f12486E0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            AddUBOFragment addUBOFragment2 = this.f3196b;
                            addUBOFragment2.f12484C0 = addUBOFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", addUBOFragment2.f12484C0);
                            addUBOFragment2.f12487F0.a(addUBOFragment2.f12484C0);
                            break;
                        }
                        break;
                    default:
                        if (f.b(bool, Boolean.TRUE) && (uri = (addUBOFragment = this.f3196b).f12484C0) != null) {
                            addUBOFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 2;
        this.f12487F0 = registerForActivityResult(new f.i(), new InterfaceC0702a(this) { // from class: Q7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddUBOFragment f3196b;

            {
                this.f3196b = this;
            }

            @Override // e.InterfaceC0702a
            public final void a(Object obj) {
                AddUBOFragment addUBOFragment;
                Uri uri;
                Boolean bool = (Boolean) obj;
                switch (i11) {
                    case 0:
                        if (f.b(bool, Boolean.TRUE)) {
                            this.f3196b.f12486E0.a("android.permission.CAMERA");
                            break;
                        }
                        break;
                    case 1:
                        if (f.b(bool, Boolean.TRUE)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(MessageBundle.TITLE_ENTRY, Long.valueOf(System.currentTimeMillis()));
                            contentValues.put("description", "From Camera");
                            AddUBOFragment addUBOFragment2 = this.f3196b;
                            addUBOFragment2.f12484C0 = addUBOFragment2.requireContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                            new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", addUBOFragment2.f12484C0);
                            addUBOFragment2.f12487F0.a(addUBOFragment2.f12484C0);
                            break;
                        }
                        break;
                    default:
                        if (f.b(bool, Boolean.TRUE) && (uri = (addUBOFragment = this.f3196b).f12484C0) != null) {
                            addUBOFragment.U0(uri, true);
                            break;
                        }
                        break;
                }
            }
        });
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12488G0 = E.a(this, kotlin.jvm.internal.h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(NewCompanyViewModel.class), null, null, b.l(this));
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f12493r0.ordinal();
        if (ordinal == 0) {
            toolbarStatus.f13263a = getString(R.string.add_primary_ubo);
            toolbarStatus.f13266d = getString(R.string.owning_25_or_more);
        } else if (ordinal == 1) {
            toolbarStatus.f13263a = getString(R.string.add_secondary_ubo);
            toolbarStatus.f13266d = getString(R.string.owning_25_or_less);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarStatus.f13263a = getString(R.string.add_shareholder);
            toolbarStatus.f13266d = getString(R.string.owning_1_or_more);
        }
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        int ordinal = this.f12493r0.ordinal();
        if (ordinal == 0) {
            toolbarStatus.f13263a = getString(R.string.add_primary_ubo);
        } else if (ordinal == 1) {
            toolbarStatus.f13263a = getString(R.string.add_secondary_ubo);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarStatus.f13263a = getString(R.string.add_shareholder);
        }
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12488G0.getValue();
    }

    public final void U0(Uri uri, boolean z10) {
        String b9 = F8.e.b(requireActivity(), uri);
        Context requireContext = requireContext();
        if (!z10) {
            uri = this.f12483B0.f13322b;
        }
        String c2 = F8.e.c(requireContext, uri);
        if (c2 != null) {
            this.f12482A0 = new UploadFileUI(c2, String.valueOf(u0().f27994y.getText()), NewCompanyViewModel.UploadFileType.f12467g, b9);
            u0().f27982Q.setText(b9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b2, code lost:
    
        if (r1.length() != 0) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0() {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.newcompany.addubo.AddUBOFragment.V0():void");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        TeamMemberUI teamMemberUI;
        super.onCreate(bundle);
        this.f11471m0 = T0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            com.luminary.business.presentation.ui.fragments.newcompany.addubo.a a10 = a.C0133a.a(arguments);
            this.f12490o0 = a10;
            this.f12492q0 = a10.f12517b;
            String str = a10.f12518c;
            if (str != null) {
                this.f12493r0 = TeamMembersFragment.UBOType.valueOf(str);
            }
            com.luminary.business.presentation.ui.fragments.newcompany.addubo.a aVar = this.f12490o0;
            if (aVar == null || (teamMemberUI = aVar.f12519d) == null) {
                return;
            }
            TeamMemberUI.MemberUI memberUI = teamMemberUI.f11300e;
            String str2 = memberUI != null ? memberUI.f11306e : null;
            boolean z10 = str2 == null || str2.length() == 0;
            this.f12494t0 = z10;
            if (z10) {
                this.s0 = 0;
            } else {
                this.s0 = 1;
            }
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"RestrictedApi"})
    public final void onViewCreated(View view, Bundle bundle) {
        TeamMemberUI teamMemberUI;
        CorporateDetailsDomain.SourceofWealth sourceofWealth;
        TabLayout.g h9;
        super.onViewCreated(view, bundle);
        T0().h0();
        int ordinal = this.f12493r0.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        T0().f12453s1.observe(getViewLifecycleOwner(), new k(new Q7.c(this, 2)));
        TeamMembersFragment.UBOType uBOType = this.f12493r0;
        TeamMembersFragment.UBOType uBOType2 = TeamMembersFragment.UBOType.f12694c;
        if (uBOType == uBOType2) {
            u0().f27979N.setText(getString(R.string.is_the_shareholder_a_pep_new_onboarding));
            u0().f27978M.setText(getString(R.string.is_the_shareholder_a_us_persona));
        }
        if (this.f12493r0 == uBOType2) {
            u0().f27977L.a(new Q7.d(this));
            u0().f27977L.setVisibility(0);
        } else {
            o.b(u0().f27977L);
        }
        if (this.f12493r0 == uBOType2 && (h9 = u0().f27977L.h(this.s0)) != null) {
            h9.a();
        }
        com.luminary.business.presentation.ui.fragments.newcompany.addubo.a aVar = this.f12490o0;
        if (aVar != null && (teamMemberUI = aVar.f12519d) != null) {
            float f10 = this.f12492q0;
            Float f11 = teamMemberUI.f11298c;
            this.f12492q0 = f10 + (f11 != null ? f11.floatValue() : 0.0f);
            I2 u02 = u0();
            List<String> list = teamMemberUI.f11296a;
            if (list == null) {
                list = EmptyList.f23104a;
            }
            this.f12491p0 = list;
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(n.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(D9.b.l((String) it.next()));
            }
            this.f12491p0 = arrayList;
            Object obj = f11;
            if (f11 == null) {
                obj = 0;
            }
            String obj2 = obj.toString();
            if (C0969n.Y(obj2, ".", false)) {
                String str = (String) s.R(C0969n.r0(obj2, new String[]{"."}));
                if (str == null) {
                    str = "";
                }
                if (str.length() == 1) {
                    obj2 = obj2.concat("0");
                }
            } else {
                obj2 = obj2.concat(".00");
            }
            boolean z10 = this.f12494t0;
            TeamMemberUI.MemberUI memberUI = teamMemberUI.f11300e;
            if (z10) {
                u02.f27994y.setText(memberUI != null ? memberUI.f11304c : null);
                u02.f27966A.setText(memberUI != null ? memberUI.f11305d : null);
                List<String> list3 = this.f12491p0;
                u02.f27968C.setText(list3 != null ? s.P(list3, ", ", null, null, null, 62) : null);
                if (memberUI != null) {
                    if (kotlin.jvm.internal.f.b(memberUI.f11310j, Boolean.TRUE)) {
                        u02.f27970E.setChecked(true);
                    }
                }
                if (memberUI != null) {
                    if (kotlin.jvm.internal.f.b(memberUI.f11310j, Boolean.FALSE)) {
                        u02.f27969D.setChecked(true);
                    }
                }
                if (memberUI != null) {
                    if (kotlin.jvm.internal.f.b(memberUI.f11311k, Boolean.TRUE)) {
                        u02.f27972G.setChecked(true);
                    }
                }
                if (memberUI != null) {
                    if (kotlin.jvm.internal.f.b(memberUI.f11311k, Boolean.FALSE)) {
                        u02.f27971F.setChecked(true);
                    }
                }
                this.f12499y0 = memberUI != null ? memberUI.f11309h : null;
                this.f12497w0 = memberUI != null ? memberUI.i : null;
                u02.f27976K.setText((memberUI == null || (sourceofWealth = memberUI.f11312l) == null) ? null : sourceofWealth.f10853a);
                u02.f27967B.setText(memberUI != null ? memberUI.f11314n : null);
                u02.f27992w.setText(memberUI != null ? memberUI.f11303b : null);
                u02.f27975J.setText(obj2);
            } else {
                TabLayout tabLayout = u02.f27977L;
                tabLayout.k(tabLayout.h(1), true);
                u02.f27985p.setText(memberUI != null ? memberUI.f11306e : null);
                u02.f27973H.setText(memberUI != null ? memberUI.f11307f : null);
                this.f12495u0 = memberUI != null ? memberUI.f11308g : null;
                u02.f27990u.setText(memberUI != null ? memberUI.f11303b : null);
                u02.f27974I.setText(obj2);
            }
        }
        o.c(u0().f27982Q, 500L, new Q7.b(this, 8));
        o.c(u0().f27980O, 500L, new Q7.b(this, 9));
        u0().f27994y.addTextChangedListener(new b());
        u0().f27966A.addTextChangedListener(new c());
        u0().f27985p.addTextChangedListener(new d());
        u0().f27973H.addTextChangedListener(new e());
        u0().f27992w.addTextChangedListener(new f());
        u0().f27990u.addTextChangedListener(new g());
        u0().f27967B.addTextChangedListener(new h());
        o.c(u0().f27976K, 500L, new Q7.b(this, 10));
        E.b(this, "country", new B6.h(this, 7));
        o.c(u0().f27987r, 500L, new Q7.b(this, 11));
        o.c(u0().f27968C, 500L, new Q7.b(this, 0));
        o.c(u0().f27988s, 500L, new Q7.b(this, 1));
        o.c(u0().f27986q, 500L, new Q7.b(this, 2));
        u0().f27975J.addTextChangedListener(new i());
        u0().f27974I.addTextChangedListener(new j());
        o.c(u0().f27983n, 500L, new Q7.b(this, 3));
        o.c(u0().f27984o, 500L, new Q7.b(this, 7));
        V0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12489n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(true);
        s0();
        u0().f27983n.setVisibility(0);
        o.b(u0().f27984o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        o.b(u0().f27983n);
        u0().f27984o.setVisibility(0);
        p0(true);
        B0();
    }

    /* compiled from: TextView.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            String obj;
            AddUBOFragment addUBOFragment = AddUBOFragment.this;
            addUBOFragment.V0();
            if (addUBOFragment.f12493r0 != TeamMembersFragment.UBOType.f12694c || addUBOFragment.f12494t0) {
                Editable text = addUBOFragment.u0().f27994y.getText();
                if (text == null || (obj = text.toString()) == null || !D9.b.d0(obj)) {
                    addUBOFragment.u0().f27993x.setError(null);
                } else {
                    addUBOFragment.u0().f27993x.setErrorWithoutFocus(addUBOFragment.getString(R.string.enter_value, addUBOFragment.getString(R.string.first_name)));
                }
            }
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
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            String obj;
            AddUBOFragment addUBOFragment = AddUBOFragment.this;
            addUBOFragment.V0();
            if (addUBOFragment.f12493r0 != TeamMembersFragment.UBOType.f12694c || addUBOFragment.f12494t0) {
                Editable text = addUBOFragment.u0().f27966A.getText();
                if (text == null || (obj = text.toString()) == null || !D9.b.d0(obj)) {
                    addUBOFragment.u0().f27995z.setError(null);
                } else {
                    addUBOFragment.u0().f27995z.setErrorWithoutFocus(addUBOFragment.getString(R.string.enter_value, addUBOFragment.getString(R.string.last_name)));
                }
            }
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
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AddUBOFragment.this.V0();
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
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AddUBOFragment.this.V0();
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
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AddUBOFragment addUBOFragment = AddUBOFragment.this;
            addUBOFragment.V0();
            I2 u02 = addUBOFragment.u0();
            I2 u03 = addUBOFragment.u0();
            boolean h02 = D9.b.h0(String.valueOf(u02.f27992w.getText()));
            CustomTextInputLayout customTextInputLayout = u03.f27991v;
            if (h02) {
                customTextInputLayout.setError(null);
            } else {
                customTextInputLayout.setErrorWithoutFocus(addUBOFragment.getString(R.string.invalid_email));
            }
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
        public g() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AddUBOFragment addUBOFragment = AddUBOFragment.this;
            addUBOFragment.V0();
            I2 u02 = addUBOFragment.u0();
            I2 u03 = addUBOFragment.u0();
            boolean h02 = D9.b.h0(String.valueOf(u02.f27990u.getText()));
            CustomTextInputLayout customTextInputLayout = u03.f27989t;
            if (h02) {
                customTextInputLayout.setError(null);
            } else {
                customTextInputLayout.setErrorWithoutFocus(addUBOFragment.getString(R.string.invalid_email));
            }
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
        public h() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AddUBOFragment.this.V0();
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
            CharSequence u02 = charSequence != null ? C0969n.u0(charSequence) : null;
            if (u02 == null || u02.length() == 0) {
                return;
            }
            float parseFloat = Float.parseFloat(D9.b.r0(charSequence.toString()));
            if (parseFloat >= 0.0f) {
                int i11 = (parseFloat > 100.0f ? 1 : (parseFloat == 100.0f ? 0 : -1));
            }
            AddUBOFragment addUBOFragment = AddUBOFragment.this;
            addUBOFragment.getClass();
            addUBOFragment.V0();
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
        public j() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            CharSequence u02 = charSequence != null ? C0969n.u0(charSequence) : null;
            if (u02 == null || u02.length() == 0) {
                return;
            }
            float parseFloat = Float.parseFloat(D9.b.r0(charSequence.toString()));
            if (parseFloat >= 0.0f) {
                int i11 = (parseFloat > 100.0f ? 1 : (parseFloat == 100.0f ? 0 : -1));
            }
            AddUBOFragment addUBOFragment = AddUBOFragment.this;
            addUBOFragment.getClass();
            addUBOFragment.V0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
