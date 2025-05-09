package com.luminary.business.presentation.ui.fragments.invoices;

import A8.e;
import D7.g;
import F8.o;
import O9.p;
import P9.s;
import U4.b;
import android.content.Context;
import android.os.Bundle;
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
import com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ka.C0969n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t6.AbstractC1325e4;

/* compiled from: InvoicesDateFragment.kt */
/* loaded from: classes2.dex */
public final class InvoicesDateFragment extends BaseFragment<AbstractC1325e4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12284n0 = R.layout.fragment_invoices_date;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f12285o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f12286p0;

    /* renamed from: q0, reason: collision with root package name */
    public SortDialog.Status f12287q0;

    /* renamed from: r0, reason: collision with root package name */
    public Date f12288r0;
    public Date s0;

    /* renamed from: t0, reason: collision with root package name */
    public final SortDialog.Direction f12289t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f12290u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f12291v0;

    /* renamed from: w0, reason: collision with root package name */
    public final FilePickerContractor f12292w0;

    /* renamed from: x0, reason: collision with root package name */
    public InvoicesController f12293x0;

    /* compiled from: InvoicesDateFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12298a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f12298a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12298a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12298a.invoke(obj);
        }
    }

    /* compiled from: InvoicesDateFragment.kt */
    public static final class b implements A8.d {
        public b() {
        }

        @Override // A8.d
        public final void a() {
            InvoicesDateFragment.this.f12290u0 = false;
        }

        @Override // A8.d
        public final void b() {
            InvoicesDateFragment invoicesDateFragment = InvoicesDateFragment.this;
            invoicesDateFragment.f11467i0 = false;
            invoicesDateFragment.f12290u0 = true;
        }

        @Override // A8.d
        public final void c(String str) {
            InvoicesDateFragment invoicesDateFragment = InvoicesDateFragment.this;
            invoicesDateFragment.f12286p0 = str;
            invoicesDateFragment.U0(invoicesDateFragment.T0().f975X0.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment$special$$inlined$viewModel$default$1] */
    public InvoicesDateFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12285o0 = E.a(this, h.a(g.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return b.n((X) r02.invoke(), h.a(g.class), null, null, b.l(this));
            }
        });
        this.f12286p0 = "";
        this.f12287q0 = SortDialog.Status.f13217a;
        this.f12289t0 = SortDialog.Direction.f13213a;
        this.f12290u0 = true;
        FilePickerContractor filePickerContractor = new FilePickerContractor(this);
        filePickerContractor.f13324d = new InvoicesDateFragment$filePicker$1(1, this, InvoicesDateFragment.class, "onFileChange", "onFileChange(Landroid/net/Uri;)V", 0);
        this.f12292w0 = filePickerContractor;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void D0(Date date, Date date2) {
        this.f12288r0 = date;
        this.s0 = date2;
        L0();
        U0(T0().f975X0.getValue());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void E0(SortDialog.Status status, SortDialog.Direction direction) {
        this.f12287q0 = status;
        L0();
        U0(T0().f975X0.getValue());
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        boolean z10 = true;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_invoices);
        final int i = 0;
        toolbarStatus.f13269g = new e(Integer.valueOf(R.drawable.ic_filter), null, null, false, null, null, null, new InterfaceC0635a(this) { // from class: D7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f957b;

            {
                this.f957b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                InvoicesDateFragment invoicesDateFragment = this.f957b;
                switch (i) {
                    case 0:
                        SortDialog.Type[] typeArr = SortDialog.Type.f13222a;
                        invoicesDateFragment.K0(invoicesDateFragment.f12287q0, invoicesDateFragment.f12289t0);
                        break;
                    case 1:
                        invoicesDateFragment.G0(invoicesDateFragment.f12288r0, invoicesDateFragment.s0);
                        break;
                    default:
                        invoicesDateFragment.I0(null);
                        break;
                }
                return p.f3034a;
            }
        }, 124);
        Integer valueOf = Integer.valueOf(R.drawable.ic_customize);
        if (this.f12288r0 == null && this.s0 == null) {
            z10 = false;
        }
        final int i9 = 1;
        toolbarStatus.f13270h = new e(valueOf, null, Boolean.valueOf(z10), false, null, null, null, new InterfaceC0635a(this) { // from class: D7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f957b;

            {
                this.f957b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                InvoicesDateFragment invoicesDateFragment = this.f957b;
                switch (i9) {
                    case 0:
                        SortDialog.Type[] typeArr = SortDialog.Type.f13222a;
                        invoicesDateFragment.K0(invoicesDateFragment.f12287q0, invoicesDateFragment.f12289t0);
                        break;
                    case 1:
                        invoicesDateFragment.G0(invoicesDateFragment.f12288r0, invoicesDateFragment.s0);
                        break;
                    default:
                        invoicesDateFragment.I0(null);
                        break;
                }
                return p.f3034a;
            }
        }, 120);
        final int i10 = 2;
        toolbarStatus.i = new e(Integer.valueOf(R.drawable.ic_search), null, null, false, null, null, null, new InterfaceC0635a(this) { // from class: D7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f957b;

            {
                this.f957b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                InvoicesDateFragment invoicesDateFragment = this.f957b;
                switch (i10) {
                    case 0:
                        SortDialog.Type[] typeArr = SortDialog.Type.f13222a;
                        invoicesDateFragment.K0(invoicesDateFragment.f12287q0, invoicesDateFragment.f12289t0);
                        break;
                    case 1:
                        invoicesDateFragment.G0(invoicesDateFragment.f12288r0, invoicesDateFragment.s0);
                        break;
                    default:
                        invoicesDateFragment.I0(null);
                        break;
                }
                return p.f3034a;
            }
        }, 124);
        toolbarStatus.f13273l = new b();
        return toolbarStatus;
    }

    public final g T0() {
        return (g) this.f12285o0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [T] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [T] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [T] */
    public final void U0(List<F5.b> list) {
        ?? r52;
        ?? r22;
        ?? r8;
        EmptyList emptyList;
        Date date;
        Date date2;
        ?? r92;
        ?? r93;
        if (getView() == null) {
            return;
        }
        u0().f28960o.setText(this.f12286p0.length() > 0 ? getString(R.string.nothing_is_found) : getString(R.string.you_do_not_have_any_invoices_yet));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (this.f12286p0.length() == 0) {
            r52 = list;
        } else if (list != null) {
            r52 = new ArrayList();
            for (Object obj : list) {
                String P4 = D9.b.P((F5.b) obj);
                if (P4 != null) {
                    Locale locale = Locale.ROOT;
                    if (C0969n.Y(P4.toLowerCase(locale), this.f12286p0.toLowerCase(locale), false)) {
                        r52.add(obj);
                    }
                }
            }
        } else {
            r52 = 0;
        }
        ref$ObjectRef.f23179a = r52;
        int ordinal = this.f12287q0.ordinal();
        if (ordinal == 0) {
            List list2 = (List) ref$ObjectRef.f23179a;
            if (list2 != null) {
                r22 = s.X(list2, new A7.d(5));
            }
            r22 = 0;
        } else if (ordinal == 1) {
            List list3 = (List) ref$ObjectRef.f23179a;
            if (list3 != null) {
                r22 = s.X(list3, new A7.d(3));
            }
            r22 = 0;
        } else if (ordinal == 2) {
            List list4 = (List) ref$ObjectRef.f23179a;
            if (list4 != null) {
                r22 = s.X(list4, new A7.d(6));
            }
            r22 = 0;
        } else {
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            List list5 = (List) ref$ObjectRef.f23179a;
            if (list5 != null) {
                r22 = s.X(list5, new A7.d(4));
            }
            r22 = 0;
        }
        ref$ObjectRef.f23179a = r22;
        Date date3 = this.f12288r0;
        if (date3 != null) {
            List list6 = (List) r22;
            if (list6 != null) {
                r93 = new ArrayList();
                for (Object obj2 : list6) {
                    Date date4 = ((F5.b) obj2).f1191d;
                    if (date4 != null && date4.after(date3)) {
                        r93.add(obj2);
                    }
                }
            } else {
                r93 = 0;
            }
            ref$ObjectRef.f23179a = r93;
        }
        Date date5 = this.s0;
        if (date5 != null) {
            List list7 = (List) ref$ObjectRef.f23179a;
            if (list7 != null) {
                r92 = new ArrayList();
                for (Object obj3 : list7) {
                    Date date6 = ((F5.b) obj3).f1191d;
                    if (date6 != null && date6.before(date5)) {
                        r92.add(obj3);
                    }
                }
            } else {
                r92 = 0;
            }
            ref$ObjectRef.f23179a = r92;
        }
        List list8 = (List) ref$ObjectRef.f23179a;
        if (list8 != null) {
            r8 = new ArrayList();
            for (Object obj4 : list8) {
                F5.b bVar = (F5.b) obj4;
                int ordinal2 = this.f12289t0.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!D9.b.c0(bVar)) {
                        }
                    } else if (D9.b.c0(bVar)) {
                    }
                }
                r8.add(obj4);
            }
        } else {
            r8 = 0;
        }
        ref$ObjectRef.f23179a = r8;
        Context requireContext = requireContext();
        if (this.f12288r0 != null || this.s0 != null || this.f12287q0 != SortDialog.Status.f13217a || this.f12286p0.length() > 0) {
            emptyList = (r8 == 0 || r8.isEmpty()) ? EmptyList.f23104a : Collections.singletonList(new Pair(null, r8));
        } else if (r8 != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : r8) {
                Date date7 = ((F5.b) obj5).f1191d;
                if (date7 != null && D9.b.f0(date7)) {
                    arrayList.add(obj5);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : r8) {
                Date date8 = ((F5.b) obj6).f1191d;
                if (date8 != null && D9.b.m0(date8)) {
                    arrayList2.add(obj6);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj7 : r8) {
                F5.b bVar2 = (F5.b) obj7;
                Date date9 = bVar2.f1191d;
                if (date9 != null && D9.b.e0(date9) && ((date2 = bVar2.f1191d) == null || !D9.b.f0(date2))) {
                    if (date2 == null || !D9.b.m0(date2)) {
                        arrayList3.add(obj7);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj8 : r8) {
                F5.b bVar3 = (F5.b) obj8;
                Date date10 = bVar3.f1191d;
                if (date10 != null) {
                    int i = Calendar.getInstance().get(3) - 1;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date10);
                    if (i == calendar.get(3) && (((date = bVar3.f1191d) == null || !D9.b.e0(date)) && ((date == null || !D9.b.f0(date)) && (date == null || !D9.b.m0(date))))) {
                        arrayList4.add(obj8);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj9 : r8) {
                F5.b bVar4 = (F5.b) obj9;
                Date date11 = bVar4.f1191d;
                if (date11 == null || !D9.b.f0(date11)) {
                    Date date12 = bVar4.f1191d;
                    if (date12 == null || !D9.b.m0(date12)) {
                        if (date12 == null || !D9.b.e0(date12)) {
                            if (date12 != null) {
                                int i9 = Calendar.getInstance().get(3) - 1;
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.setTime(date12);
                                if (i9 == calendar2.get(3)) {
                                }
                            }
                            arrayList5.add(obj9);
                        }
                    }
                }
            }
            ?? arrayList6 = new ArrayList();
            if (!arrayList.isEmpty()) {
                arrayList6.add(new Pair(requireContext.getString(R.string.today), arrayList));
            }
            if (!arrayList2.isEmpty()) {
                arrayList6.add(new Pair(requireContext.getString(R.string.yesterday), arrayList2));
            }
            if (!arrayList3.isEmpty()) {
                arrayList6.add(new Pair(requireContext.getString(R.string.this_week), arrayList3));
            }
            if (!arrayList4.isEmpty()) {
                arrayList6.add(new Pair(requireContext.getString(R.string.last_week), arrayList4));
            }
            emptyList = arrayList6;
            if (!arrayList5.isEmpty()) {
                arrayList6.add(new Pair(requireContext.getString(R.string.older), arrayList5));
                emptyList = arrayList6;
            }
        } else {
            emptyList = EmptyList.f23104a;
        }
        InvoicesController invoicesController = this.f12293x0;
        (invoicesController != null ? invoicesController : null).setData(emptyList);
        if (emptyList.isEmpty()) {
            u0().f28959n.setVisibility(0);
            if (this.f12290u0) {
                u0().f28963r.setVisibility(0);
            } else {
                o.b(u0().f28963r);
            }
        } else {
            o.b(u0().f28959n);
            o.b(u0().f28963r);
        }
        View view = getView();
        if (view != null) {
            view.postDelayed(new B2.d(this, 5), 300L);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f12286p0.length() > 0) {
            I0(this.f12286p0);
        }
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        this.f12293x0 = new InvoicesController(requireContext(), new InterfaceC0646l(this) { // from class: D7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f959b;

            {
                this.f959b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i) {
                    case 0:
                        String str = (String) obj;
                        InvoicesDateFragment invoicesDateFragment = this.f959b;
                        List<F5.b> value = invoicesDateFragment.T0().f975X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(((F5.b) obj2).f1188a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            F5.b bVar = (F5.b) obj2;
                            if (bVar != null) {
                                File file = new File(invoicesDateFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                String str2 = bVar.f1188a;
                                if (str2 != null) {
                                    invoicesDateFragment.f12291v0 = str2;
                                    g T02 = invoicesDateFragment.T0();
                                    String absolutePath = file.getAbsolutePath();
                                    T02.getClass();
                                    e eVar = new e(str2, absolutePath, 0, T02);
                                    T02.f420L0 = eVar;
                                    eVar.invoke();
                                }
                            }
                        }
                        break;
                    case 1:
                        InvoicesDateFragment invoicesDateFragment2 = this.f959b;
                        invoicesDateFragment2.u0().f28962q.setRefreshing(false);
                        invoicesDateFragment2.U0((List) obj);
                        break;
                    case 2:
                        this.f959b.N0((String) obj, new B6.g(0));
                        break;
                    default:
                        this.f959b.T0().h0();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1325e4 u02 = u0();
        InvoicesController invoicesController = this.f12293x0;
        if (invoicesController == null) {
            invoicesController = null;
        }
        u02.f28961p.setAdapter(invoicesController.getAdapter());
        AbstractC1325e4 u03 = u0();
        u03.f28962q.setColorSchemeResources(R.color.main_color);
        AbstractC1325e4 u04 = u0();
        u04.f28962q.setOnRefreshListener(new A0.b(this, 4));
        final int i9 = 1;
        T0().f975X0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: D7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f959b;

            {
                this.f959b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i9) {
                    case 0:
                        String str = (String) obj;
                        InvoicesDateFragment invoicesDateFragment = this.f959b;
                        List<F5.b> value = invoicesDateFragment.T0().f975X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(((F5.b) obj2).f1188a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            F5.b bVar = (F5.b) obj2;
                            if (bVar != null) {
                                File file = new File(invoicesDateFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                String str2 = bVar.f1188a;
                                if (str2 != null) {
                                    invoicesDateFragment.f12291v0 = str2;
                                    g T02 = invoicesDateFragment.T0();
                                    String absolutePath = file.getAbsolutePath();
                                    T02.getClass();
                                    e eVar = new e(str2, absolutePath, 0, T02);
                                    T02.f420L0 = eVar;
                                    eVar.invoke();
                                }
                            }
                        }
                        break;
                    case 1:
                        InvoicesDateFragment invoicesDateFragment2 = this.f959b;
                        invoicesDateFragment2.u0().f28962q.setRefreshing(false);
                        invoicesDateFragment2.U0((List) obj);
                        break;
                    case 2:
                        this.f959b.N0((String) obj, new B6.g(0));
                        break;
                    default:
                        this.f959b.T0().h0();
                        break;
                }
                return p.f3034a;
            }
        }));
        final int i10 = 2;
        T0().f976Y0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: D7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f959b;

            {
                this.f959b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i10) {
                    case 0:
                        String str = (String) obj;
                        InvoicesDateFragment invoicesDateFragment = this.f959b;
                        List<F5.b> value = invoicesDateFragment.T0().f975X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(((F5.b) obj2).f1188a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            F5.b bVar = (F5.b) obj2;
                            if (bVar != null) {
                                File file = new File(invoicesDateFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                String str2 = bVar.f1188a;
                                if (str2 != null) {
                                    invoicesDateFragment.f12291v0 = str2;
                                    g T02 = invoicesDateFragment.T0();
                                    String absolutePath = file.getAbsolutePath();
                                    T02.getClass();
                                    e eVar = new e(str2, absolutePath, 0, T02);
                                    T02.f420L0 = eVar;
                                    eVar.invoke();
                                }
                            }
                        }
                        break;
                    case 1:
                        InvoicesDateFragment invoicesDateFragment2 = this.f959b;
                        invoicesDateFragment2.u0().f28962q.setRefreshing(false);
                        invoicesDateFragment2.U0((List) obj);
                        break;
                    case 2:
                        this.f959b.N0((String) obj, new B6.g(0));
                        break;
                    default:
                        this.f959b.T0().h0();
                        break;
                }
                return p.f3034a;
            }
        }));
        g T02 = T0();
        final int i11 = 3;
        T02.f977Z0.observe(getViewLifecycleOwner(), new a(new InterfaceC0646l(this) { // from class: D7.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvoicesDateFragment f959b;

            {
                this.f959b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                Object obj2;
                switch (i11) {
                    case 0:
                        String str = (String) obj;
                        InvoicesDateFragment invoicesDateFragment = this.f959b;
                        List<F5.b> value = invoicesDateFragment.T0().f975X0.getValue();
                        if (value != null) {
                            Iterator<T> it = value.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (kotlin.jvm.internal.f.b(((F5.b) obj2).f1188a, str)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            F5.b bVar = (F5.b) obj2;
                            if (bVar != null) {
                                File file = new File(invoicesDateFragment.requireContext().getFilesDir().getAbsolutePath(), "Statements");
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                String str2 = bVar.f1188a;
                                if (str2 != null) {
                                    invoicesDateFragment.f12291v0 = str2;
                                    g T022 = invoicesDateFragment.T0();
                                    String absolutePath = file.getAbsolutePath();
                                    T022.getClass();
                                    e eVar = new e(str2, absolutePath, 0, T022);
                                    T022.f420L0 = eVar;
                                    eVar.invoke();
                                }
                            }
                        }
                        break;
                    case 1:
                        InvoicesDateFragment invoicesDateFragment2 = this.f959b;
                        invoicesDateFragment2.u0().f28962q.setRefreshing(false);
                        invoicesDateFragment2.U0((List) obj);
                        break;
                    case 2:
                        this.f959b.N0((String) obj, new B6.g(0));
                        break;
                    default:
                        this.f959b.T0().h0();
                        break;
                }
                return p.f3034a;
            }
        }));
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12284n0;
    }
}
