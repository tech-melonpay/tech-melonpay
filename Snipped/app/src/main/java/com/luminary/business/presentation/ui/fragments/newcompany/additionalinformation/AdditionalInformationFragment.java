package com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation;

import C.v;
import F8.o;
import O9.p;
import P7.e;
import U4.b;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.DatePicker;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation.AdditionalInformationFragment;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import ka.C0966k;
import kotlin.Pair;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import t0.c;
import t6.AbstractC1450u4;

/* compiled from: AdditionalInformationFragment.kt */
/* loaded from: classes2.dex */
public final class AdditionalInformationFragment extends BaseFragment<AbstractC1450u4> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f12470n0 = R.layout.fragment_new_company_additional_information;

    /* renamed from: o0, reason: collision with root package name */
    public e f12471o0;

    /* renamed from: p0, reason: collision with root package name */
    public final H1.a f12472p0;

    /* renamed from: q0, reason: collision with root package name */
    public Date f12473q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f12474r0;
    public String s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f12475t0;

    /* compiled from: AdditionalInformationFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f12481a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f12481a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f12481a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12481a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation.AdditionalInformationFragment$special$$inlined$viewModel$default$1] */
    public AdditionalInformationFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation.AdditionalInformationFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f12472p0 = E.a(this, h.a(NewCompanyViewModel.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation.AdditionalInformationFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.newcompany.additionalinformation.AdditionalInformationFragment$special$$inlined$viewModel$default$2
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
    public final boolean C0() {
        e eVar = this.f12471o0;
        getParentFragmentManager().f0("additional_information", c.b(new Pair("company_id", eVar != null ? eVar.f3097a : null)));
        return !(this instanceof CardsFragment);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.additional_information);
        toolbarStatus.f13266d = getString(R.string.step_of, 5, 14);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus R0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13263a = getString(R.string.additional_information);
        toolbarStatus.f13267e = true;
        toolbarStatus.f13265c = 18;
        return toolbarStatus;
    }

    public final NewCompanyViewModel T0() {
        return (NewCompanyViewModel) this.f12472p0.getValue();
    }

    public final void U0() {
        Editable text;
        boolean z10 = ((!u0().f29658r.isChecked() && !u0().f29659s.isChecked()) || this.f12473q0 == null || this.f12474r0 == null || (text = u0().f29660t.getText()) == null || text.length() == 0) ? false : true;
        C0966k.R(String.valueOf(u0().f29660t.getText()));
        u0().f29654n.setEnabled(z10);
        u0().f29655o.setEnabled(z10);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!v.y(arguments, e.class, "companyId")) {
                throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
            }
            String string = arguments.getString("companyId");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
            }
            this.f12471o0 = new e(string, arguments.containsKey("isEdit") ? arguments.getBoolean("isEdit") : false);
        }
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final int i = 0;
        T0().n1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: P7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3090b;

            {
                this.f3090b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
            @Override // ca.InterfaceC0646l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r8) {
                /*
                    Method dump skipped, instructions count: 258
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: P7.a.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        if (!this.f12475t0) {
            AbstractC1450u4 u02 = u0();
            final int i9 = 1;
            u02.f29656p.postDelayed(new Runnable(this) { // from class: P7.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AdditionalInformationFragment f3096b;

                {
                    this.f3096b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    switch (i9) {
                        case 0:
                            this.f3096b.U0();
                            break;
                        default:
                            AdditionalInformationFragment additionalInformationFragment = this.f3096b;
                            e eVar = additionalInformationFragment.f12471o0;
                            if (eVar != null && (str = eVar.f3097a) != null) {
                                NewCompanyViewModel T02 = additionalInformationFragment.T0();
                                O7.b bVar = new O7.b(T02, str, 2);
                                T02.f12421A1 = bVar;
                                bVar.invoke();
                                break;
                            }
                            break;
                    }
                }
            }, 300L);
        }
        final int i10 = 1;
        T0().f12453s1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: P7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3090b;

            {
                this.f3090b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                /*
                    Method dump skipped, instructions count: 258
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: P7.a.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i11 = 2;
        T0().f12449o1.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: P7.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3090b;

            {
                this.f3090b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                /*
                    Method dump skipped, instructions count: 258
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: P7.a.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        AbstractC1450u4 u03 = u0();
        final int i12 = 3;
        o.c(u03.f29656p, 500L, new InterfaceC0635a(this) { // from class: P7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3092b;

            {
                this.f3092b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                final String str;
                boolean z10;
                switch (i12) {
                    case 0:
                        AdditionalInformationFragment additionalInformationFragment = this.f3092b;
                        additionalInformationFragment.u0().f29658r.setChecked(true);
                        additionalInformationFragment.U0();
                        break;
                    case 1:
                        AdditionalInformationFragment additionalInformationFragment2 = this.f3092b;
                        e eVar = additionalInformationFragment2.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            final long parseLong = Long.parseLong(D9.b.r0(String.valueOf(additionalInformationFragment2.u0().f29660t.getText())));
                            Date date = additionalInformationFragment2.f12473q0;
                            if (date != null) {
                                long time = date.getTime();
                                final String str2 = additionalInformationFragment2.f12474r0;
                                if (str2 != null) {
                                    final NewCompanyViewModel T02 = additionalInformationFragment2.T0();
                                    final long j10 = time / 1000;
                                    if (additionalInformationFragment2.u0().f29659s.isChecked()) {
                                        z10 = true;
                                    } else {
                                        additionalInformationFragment2.u0().f29658r.isChecked();
                                        z10 = false;
                                    }
                                    final boolean z11 = z10;
                                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: O7.d

                                        /* renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f2972f = null;

                                        /* renamed from: h, reason: collision with root package name */
                                        public final /* synthetic */ Boolean f2974h = null;

                                        @Override // ca.InterfaceC0635a
                                        public final Object invoke() {
                                            NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                            newCompanyViewModel.l();
                                            Pair pair = new Pair(str, new u5.c(parseLong, str2, j10, this.f2972f, z11, this.f2974h));
                                            newCompanyViewModel.f12431V0.a(new e(newCompanyViewModel, 6), pair);
                                            return p.f3034a;
                                        }
                                    };
                                    T02.f421M0 = interfaceC0635a;
                                    interfaceC0635a.invoke();
                                }
                            }
                        }
                        break;
                    case 2:
                        this.f3092b.u0().f29654n.callOnClick();
                        break;
                    case 3:
                        AdditionalInformationFragment additionalInformationFragment3 = this.f3092b;
                        additionalInformationFragment3.f12475t0 = true;
                        NavController g10 = U4.b.g(additionalInformationFragment3);
                        g10.i(R.id.action_additionalInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 4:
                        final Calendar calendar = Calendar.getInstance();
                        int i13 = calendar.get(1);
                        int i14 = calendar.get(2);
                        int i15 = calendar.get(5);
                        final AdditionalInformationFragment additionalInformationFragment4 = this.f3092b;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(additionalInformationFragment4.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: P7.c
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i16, int i17, int i18) {
                                Calendar calendar2 = calendar;
                                calendar2.set(1, i16);
                                calendar2.set(2, i17);
                                calendar2.set(5, i18);
                                calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                calendar2.set(11, 12);
                                calendar2.set(12, 0);
                                Date time2 = calendar2.getTime();
                                AdditionalInformationFragment additionalInformationFragment5 = additionalInformationFragment4;
                                additionalInformationFragment5.f12473q0 = time2;
                                AbstractC1450u4 u04 = additionalInformationFragment5.u0();
                                u04.f29657q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                                additionalInformationFragment5.U0();
                            }
                        }, i13, i14, i15);
                        datePickerDialog.getDatePicker().setMaxDate(calendar.getTime().getTime());
                        datePickerDialog.show();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment5 = this.f3092b;
                        additionalInformationFragment5.u0().f29659s.setChecked(true);
                        additionalInformationFragment5.U0();
                        break;
                }
                return p.f3034a;
            }
        });
        E.b(this, "country", new B6.h(this, 6));
        AbstractC1450u4 u04 = u0();
        final int i13 = 4;
        o.c(u04.f29657q, 500L, new InterfaceC0635a(this) { // from class: P7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3092b;

            {
                this.f3092b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                final String str;
                boolean z10;
                switch (i13) {
                    case 0:
                        AdditionalInformationFragment additionalInformationFragment = this.f3092b;
                        additionalInformationFragment.u0().f29658r.setChecked(true);
                        additionalInformationFragment.U0();
                        break;
                    case 1:
                        AdditionalInformationFragment additionalInformationFragment2 = this.f3092b;
                        e eVar = additionalInformationFragment2.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            final long parseLong = Long.parseLong(D9.b.r0(String.valueOf(additionalInformationFragment2.u0().f29660t.getText())));
                            Date date = additionalInformationFragment2.f12473q0;
                            if (date != null) {
                                long time = date.getTime();
                                final String str2 = additionalInformationFragment2.f12474r0;
                                if (str2 != null) {
                                    final NewCompanyViewModel T02 = additionalInformationFragment2.T0();
                                    final long j10 = time / 1000;
                                    if (additionalInformationFragment2.u0().f29659s.isChecked()) {
                                        z10 = true;
                                    } else {
                                        additionalInformationFragment2.u0().f29658r.isChecked();
                                        z10 = false;
                                    }
                                    final boolean z11 = z10;
                                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: O7.d

                                        /* renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f2972f = null;

                                        /* renamed from: h, reason: collision with root package name */
                                        public final /* synthetic */ Boolean f2974h = null;

                                        @Override // ca.InterfaceC0635a
                                        public final Object invoke() {
                                            NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                            newCompanyViewModel.l();
                                            Pair pair = new Pair(str, new u5.c(parseLong, str2, j10, this.f2972f, z11, this.f2974h));
                                            newCompanyViewModel.f12431V0.a(new e(newCompanyViewModel, 6), pair);
                                            return p.f3034a;
                                        }
                                    };
                                    T02.f421M0 = interfaceC0635a;
                                    interfaceC0635a.invoke();
                                }
                            }
                        }
                        break;
                    case 2:
                        this.f3092b.u0().f29654n.callOnClick();
                        break;
                    case 3:
                        AdditionalInformationFragment additionalInformationFragment3 = this.f3092b;
                        additionalInformationFragment3.f12475t0 = true;
                        NavController g10 = U4.b.g(additionalInformationFragment3);
                        g10.i(R.id.action_additionalInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 4:
                        final Calendar calendar = Calendar.getInstance();
                        int i132 = calendar.get(1);
                        int i14 = calendar.get(2);
                        int i15 = calendar.get(5);
                        final AdditionalInformationFragment additionalInformationFragment4 = this.f3092b;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(additionalInformationFragment4.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: P7.c
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i16, int i17, int i18) {
                                Calendar calendar2 = calendar;
                                calendar2.set(1, i16);
                                calendar2.set(2, i17);
                                calendar2.set(5, i18);
                                calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                calendar2.set(11, 12);
                                calendar2.set(12, 0);
                                Date time2 = calendar2.getTime();
                                AdditionalInformationFragment additionalInformationFragment5 = additionalInformationFragment4;
                                additionalInformationFragment5.f12473q0 = time2;
                                AbstractC1450u4 u042 = additionalInformationFragment5.u0();
                                u042.f29657q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                                additionalInformationFragment5.U0();
                            }
                        }, i132, i14, i15);
                        datePickerDialog.getDatePicker().setMaxDate(calendar.getTime().getTime());
                        datePickerDialog.show();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment5 = this.f3092b;
                        additionalInformationFragment5.u0().f29659s.setChecked(true);
                        additionalInformationFragment5.U0();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1450u4 u05 = u0();
        u05.f29660t.addTextChangedListener(new a());
        AbstractC1450u4 u06 = u0();
        final int i14 = 5;
        o.c(u06.f29659s, 500L, new InterfaceC0635a(this) { // from class: P7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3092b;

            {
                this.f3092b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                final String str;
                boolean z10;
                switch (i14) {
                    case 0:
                        AdditionalInformationFragment additionalInformationFragment = this.f3092b;
                        additionalInformationFragment.u0().f29658r.setChecked(true);
                        additionalInformationFragment.U0();
                        break;
                    case 1:
                        AdditionalInformationFragment additionalInformationFragment2 = this.f3092b;
                        e eVar = additionalInformationFragment2.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            final long parseLong = Long.parseLong(D9.b.r0(String.valueOf(additionalInformationFragment2.u0().f29660t.getText())));
                            Date date = additionalInformationFragment2.f12473q0;
                            if (date != null) {
                                long time = date.getTime();
                                final String str2 = additionalInformationFragment2.f12474r0;
                                if (str2 != null) {
                                    final NewCompanyViewModel T02 = additionalInformationFragment2.T0();
                                    final long j10 = time / 1000;
                                    if (additionalInformationFragment2.u0().f29659s.isChecked()) {
                                        z10 = true;
                                    } else {
                                        additionalInformationFragment2.u0().f29658r.isChecked();
                                        z10 = false;
                                    }
                                    final boolean z11 = z10;
                                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: O7.d

                                        /* renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f2972f = null;

                                        /* renamed from: h, reason: collision with root package name */
                                        public final /* synthetic */ Boolean f2974h = null;

                                        @Override // ca.InterfaceC0635a
                                        public final Object invoke() {
                                            NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                            newCompanyViewModel.l();
                                            Pair pair = new Pair(str, new u5.c(parseLong, str2, j10, this.f2972f, z11, this.f2974h));
                                            newCompanyViewModel.f12431V0.a(new e(newCompanyViewModel, 6), pair);
                                            return p.f3034a;
                                        }
                                    };
                                    T02.f421M0 = interfaceC0635a;
                                    interfaceC0635a.invoke();
                                }
                            }
                        }
                        break;
                    case 2:
                        this.f3092b.u0().f29654n.callOnClick();
                        break;
                    case 3:
                        AdditionalInformationFragment additionalInformationFragment3 = this.f3092b;
                        additionalInformationFragment3.f12475t0 = true;
                        NavController g10 = U4.b.g(additionalInformationFragment3);
                        g10.i(R.id.action_additionalInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 4:
                        final Calendar calendar = Calendar.getInstance();
                        int i132 = calendar.get(1);
                        int i142 = calendar.get(2);
                        int i15 = calendar.get(5);
                        final AdditionalInformationFragment additionalInformationFragment4 = this.f3092b;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(additionalInformationFragment4.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: P7.c
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i16, int i17, int i18) {
                                Calendar calendar2 = calendar;
                                calendar2.set(1, i16);
                                calendar2.set(2, i17);
                                calendar2.set(5, i18);
                                calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                calendar2.set(11, 12);
                                calendar2.set(12, 0);
                                Date time2 = calendar2.getTime();
                                AdditionalInformationFragment additionalInformationFragment5 = additionalInformationFragment4;
                                additionalInformationFragment5.f12473q0 = time2;
                                AbstractC1450u4 u042 = additionalInformationFragment5.u0();
                                u042.f29657q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                                additionalInformationFragment5.U0();
                            }
                        }, i132, i142, i15);
                        datePickerDialog.getDatePicker().setMaxDate(calendar.getTime().getTime());
                        datePickerDialog.show();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment5 = this.f3092b;
                        additionalInformationFragment5.u0().f29659s.setChecked(true);
                        additionalInformationFragment5.U0();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1450u4 u07 = u0();
        final int i15 = 0;
        o.c(u07.f29658r, 500L, new InterfaceC0635a(this) { // from class: P7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3092b;

            {
                this.f3092b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                final String str;
                boolean z10;
                switch (i15) {
                    case 0:
                        AdditionalInformationFragment additionalInformationFragment = this.f3092b;
                        additionalInformationFragment.u0().f29658r.setChecked(true);
                        additionalInformationFragment.U0();
                        break;
                    case 1:
                        AdditionalInformationFragment additionalInformationFragment2 = this.f3092b;
                        e eVar = additionalInformationFragment2.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            final long parseLong = Long.parseLong(D9.b.r0(String.valueOf(additionalInformationFragment2.u0().f29660t.getText())));
                            Date date = additionalInformationFragment2.f12473q0;
                            if (date != null) {
                                long time = date.getTime();
                                final String str2 = additionalInformationFragment2.f12474r0;
                                if (str2 != null) {
                                    final NewCompanyViewModel T02 = additionalInformationFragment2.T0();
                                    final long j10 = time / 1000;
                                    if (additionalInformationFragment2.u0().f29659s.isChecked()) {
                                        z10 = true;
                                    } else {
                                        additionalInformationFragment2.u0().f29658r.isChecked();
                                        z10 = false;
                                    }
                                    final boolean z11 = z10;
                                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: O7.d

                                        /* renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f2972f = null;

                                        /* renamed from: h, reason: collision with root package name */
                                        public final /* synthetic */ Boolean f2974h = null;

                                        @Override // ca.InterfaceC0635a
                                        public final Object invoke() {
                                            NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                            newCompanyViewModel.l();
                                            Pair pair = new Pair(str, new u5.c(parseLong, str2, j10, this.f2972f, z11, this.f2974h));
                                            newCompanyViewModel.f12431V0.a(new e(newCompanyViewModel, 6), pair);
                                            return p.f3034a;
                                        }
                                    };
                                    T02.f421M0 = interfaceC0635a;
                                    interfaceC0635a.invoke();
                                }
                            }
                        }
                        break;
                    case 2:
                        this.f3092b.u0().f29654n.callOnClick();
                        break;
                    case 3:
                        AdditionalInformationFragment additionalInformationFragment3 = this.f3092b;
                        additionalInformationFragment3.f12475t0 = true;
                        NavController g10 = U4.b.g(additionalInformationFragment3);
                        g10.i(R.id.action_additionalInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 4:
                        final Calendar calendar = Calendar.getInstance();
                        int i132 = calendar.get(1);
                        int i142 = calendar.get(2);
                        int i152 = calendar.get(5);
                        final AdditionalInformationFragment additionalInformationFragment4 = this.f3092b;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(additionalInformationFragment4.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: P7.c
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i16, int i17, int i18) {
                                Calendar calendar2 = calendar;
                                calendar2.set(1, i16);
                                calendar2.set(2, i17);
                                calendar2.set(5, i18);
                                calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                calendar2.set(11, 12);
                                calendar2.set(12, 0);
                                Date time2 = calendar2.getTime();
                                AdditionalInformationFragment additionalInformationFragment5 = additionalInformationFragment4;
                                additionalInformationFragment5.f12473q0 = time2;
                                AbstractC1450u4 u042 = additionalInformationFragment5.u0();
                                u042.f29657q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                                additionalInformationFragment5.U0();
                            }
                        }, i132, i142, i152);
                        datePickerDialog.getDatePicker().setMaxDate(calendar.getTime().getTime());
                        datePickerDialog.show();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment5 = this.f3092b;
                        additionalInformationFragment5.u0().f29659s.setChecked(true);
                        additionalInformationFragment5.U0();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1450u4 u08 = u0();
        final int i16 = 1;
        o.c(u08.f29654n, 500L, new InterfaceC0635a(this) { // from class: P7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3092b;

            {
                this.f3092b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                final String str;
                boolean z10;
                switch (i16) {
                    case 0:
                        AdditionalInformationFragment additionalInformationFragment = this.f3092b;
                        additionalInformationFragment.u0().f29658r.setChecked(true);
                        additionalInformationFragment.U0();
                        break;
                    case 1:
                        AdditionalInformationFragment additionalInformationFragment2 = this.f3092b;
                        e eVar = additionalInformationFragment2.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            final long parseLong = Long.parseLong(D9.b.r0(String.valueOf(additionalInformationFragment2.u0().f29660t.getText())));
                            Date date = additionalInformationFragment2.f12473q0;
                            if (date != null) {
                                long time = date.getTime();
                                final String str2 = additionalInformationFragment2.f12474r0;
                                if (str2 != null) {
                                    final NewCompanyViewModel T02 = additionalInformationFragment2.T0();
                                    final long j10 = time / 1000;
                                    if (additionalInformationFragment2.u0().f29659s.isChecked()) {
                                        z10 = true;
                                    } else {
                                        additionalInformationFragment2.u0().f29658r.isChecked();
                                        z10 = false;
                                    }
                                    final boolean z11 = z10;
                                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: O7.d

                                        /* renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f2972f = null;

                                        /* renamed from: h, reason: collision with root package name */
                                        public final /* synthetic */ Boolean f2974h = null;

                                        @Override // ca.InterfaceC0635a
                                        public final Object invoke() {
                                            NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                            newCompanyViewModel.l();
                                            Pair pair = new Pair(str, new u5.c(parseLong, str2, j10, this.f2972f, z11, this.f2974h));
                                            newCompanyViewModel.f12431V0.a(new e(newCompanyViewModel, 6), pair);
                                            return p.f3034a;
                                        }
                                    };
                                    T02.f421M0 = interfaceC0635a;
                                    interfaceC0635a.invoke();
                                }
                            }
                        }
                        break;
                    case 2:
                        this.f3092b.u0().f29654n.callOnClick();
                        break;
                    case 3:
                        AdditionalInformationFragment additionalInformationFragment3 = this.f3092b;
                        additionalInformationFragment3.f12475t0 = true;
                        NavController g10 = U4.b.g(additionalInformationFragment3);
                        g10.i(R.id.action_additionalInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 4:
                        final Calendar calendar = Calendar.getInstance();
                        int i132 = calendar.get(1);
                        int i142 = calendar.get(2);
                        int i152 = calendar.get(5);
                        final AdditionalInformationFragment additionalInformationFragment4 = this.f3092b;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(additionalInformationFragment4.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: P7.c
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i162, int i17, int i18) {
                                Calendar calendar2 = calendar;
                                calendar2.set(1, i162);
                                calendar2.set(2, i17);
                                calendar2.set(5, i18);
                                calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                calendar2.set(11, 12);
                                calendar2.set(12, 0);
                                Date time2 = calendar2.getTime();
                                AdditionalInformationFragment additionalInformationFragment5 = additionalInformationFragment4;
                                additionalInformationFragment5.f12473q0 = time2;
                                AbstractC1450u4 u042 = additionalInformationFragment5.u0();
                                u042.f29657q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                                additionalInformationFragment5.U0();
                            }
                        }, i132, i142, i152);
                        datePickerDialog.getDatePicker().setMaxDate(calendar.getTime().getTime());
                        datePickerDialog.show();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment5 = this.f3092b;
                        additionalInformationFragment5.u0().f29659s.setChecked(true);
                        additionalInformationFragment5.U0();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1450u4 u09 = u0();
        final int i17 = 2;
        o.c(u09.f29655o, 500L, new InterfaceC0635a(this) { // from class: P7.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3092b;

            {
                this.f3092b = this;
            }

            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                final String str;
                boolean z10;
                switch (i17) {
                    case 0:
                        AdditionalInformationFragment additionalInformationFragment = this.f3092b;
                        additionalInformationFragment.u0().f29658r.setChecked(true);
                        additionalInformationFragment.U0();
                        break;
                    case 1:
                        AdditionalInformationFragment additionalInformationFragment2 = this.f3092b;
                        e eVar = additionalInformationFragment2.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            final long parseLong = Long.parseLong(D9.b.r0(String.valueOf(additionalInformationFragment2.u0().f29660t.getText())));
                            Date date = additionalInformationFragment2.f12473q0;
                            if (date != null) {
                                long time = date.getTime();
                                final String str2 = additionalInformationFragment2.f12474r0;
                                if (str2 != null) {
                                    final NewCompanyViewModel T02 = additionalInformationFragment2.T0();
                                    final long j10 = time / 1000;
                                    if (additionalInformationFragment2.u0().f29659s.isChecked()) {
                                        z10 = true;
                                    } else {
                                        additionalInformationFragment2.u0().f29658r.isChecked();
                                        z10 = false;
                                    }
                                    final boolean z11 = z10;
                                    InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: O7.d

                                        /* renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f2972f = null;

                                        /* renamed from: h, reason: collision with root package name */
                                        public final /* synthetic */ Boolean f2974h = null;

                                        @Override // ca.InterfaceC0635a
                                        public final Object invoke() {
                                            NewCompanyViewModel newCompanyViewModel = NewCompanyViewModel.this;
                                            newCompanyViewModel.l();
                                            Pair pair = new Pair(str, new u5.c(parseLong, str2, j10, this.f2972f, z11, this.f2974h));
                                            newCompanyViewModel.f12431V0.a(new e(newCompanyViewModel, 6), pair);
                                            return p.f3034a;
                                        }
                                    };
                                    T02.f421M0 = interfaceC0635a;
                                    interfaceC0635a.invoke();
                                }
                            }
                        }
                        break;
                    case 2:
                        this.f3092b.u0().f29654n.callOnClick();
                        break;
                    case 3:
                        AdditionalInformationFragment additionalInformationFragment3 = this.f3092b;
                        additionalInformationFragment3.f12475t0 = true;
                        NavController g10 = U4.b.g(additionalInformationFragment3);
                        g10.i(R.id.action_additionalInformationFragment_to_countrySelectFragment, v.h(g10, "isCountryCode", false, "fieldName", ""));
                        break;
                    case 4:
                        final Calendar calendar = Calendar.getInstance();
                        int i132 = calendar.get(1);
                        int i142 = calendar.get(2);
                        int i152 = calendar.get(5);
                        final AdditionalInformationFragment additionalInformationFragment4 = this.f3092b;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(additionalInformationFragment4.requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: P7.c
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, int i162, int i172, int i18) {
                                Calendar calendar2 = calendar;
                                calendar2.set(1, i162);
                                calendar2.set(2, i172);
                                calendar2.set(5, i18);
                                calendar2.setTimeZone(TimeZone.getTimeZone("UTC"));
                                calendar2.set(11, 12);
                                calendar2.set(12, 0);
                                Date time2 = calendar2.getTime();
                                AdditionalInformationFragment additionalInformationFragment5 = additionalInformationFragment4;
                                additionalInformationFragment5.f12473q0 = time2;
                                AbstractC1450u4 u042 = additionalInformationFragment5.u0();
                                u042.f29657q.setText(D9.b.F0(calendar2.getTime(), "dd MMM yyyy"));
                                additionalInformationFragment5.U0();
                            }
                        }, i132, i142, i152);
                        datePickerDialog.getDatePicker().setMaxDate(calendar.getTime().getTime());
                        datePickerDialog.show();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment5 = this.f3092b;
                        additionalInformationFragment5.u0().f29659s.setChecked(true);
                        additionalInformationFragment5.U0();
                        break;
                }
                return p.f3034a;
            }
        });
        AbstractC1450u4 u010 = u0();
        final int i18 = 0;
        u010.f29659s.post(new Runnable(this) { // from class: P7.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInformationFragment f3096b;

            {
                this.f3096b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                switch (i18) {
                    case 0:
                        this.f3096b.U0();
                        break;
                    default:
                        AdditionalInformationFragment additionalInformationFragment = this.f3096b;
                        e eVar = additionalInformationFragment.f12471o0;
                        if (eVar != null && (str = eVar.f3097a) != null) {
                            NewCompanyViewModel T02 = additionalInformationFragment.T0();
                            O7.b bVar = new O7.b(T02, str, 2);
                            T02.f12421A1 = bVar;
                            bVar.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f12470n0;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void y0() {
        t0(false);
        s0();
        u0().f29654n.setVisibility(0);
        o.b(u0().f29655o);
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final void z0() {
        p0(true);
        B0();
        o.b(u0().f29654n);
        u0().f29655o.setVisibility(0);
    }

    /* compiled from: TextView.kt */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
            AdditionalInformationFragment.this.U0();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        }
    }
}
