package com.luminary.business.presentation.ui.fragments.statements;

import F8.o;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.X;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import n8.C1074a;
import t6.Z5;

/* compiled from: StatementsDateFragment.kt */
/* loaded from: classes2.dex */
public final class StatementsDateFragment extends BaseFragment<Z5> {

    /* renamed from: n0, reason: collision with root package name */
    public final int f13018n0 = R.layout.fragment_statements_date;

    /* renamed from: o0, reason: collision with root package name */
    public final H1.a f13019o0;

    /* renamed from: p0, reason: collision with root package name */
    public Integer f13020p0;

    /* renamed from: q0, reason: collision with root package name */
    public Integer f13021q0;

    /* renamed from: r0, reason: collision with root package name */
    public Integer f13022r0;
    public Integer s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f13023t0;

    /* renamed from: u0, reason: collision with root package name */
    public StatementsType f13024u0;

    /* renamed from: v0, reason: collision with root package name */
    public DateRangeType f13025v0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StatementsDateFragment.kt */
    public static final class DateRangeType {

        /* renamed from: b, reason: collision with root package name */
        public static final DateRangeType f13030b;

        /* renamed from: c, reason: collision with root package name */
        public static final DateRangeType f13031c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ DateRangeType[] f13032d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ W9.a f13033e;

        /* renamed from: a, reason: collision with root package name */
        public final int f13034a;

        static {
            DateRangeType dateRangeType = new DateRangeType("LAST_30_DAYS", 0, R.string.last_30_days);
            f13030b = dateRangeType;
            DateRangeType dateRangeType2 = new DateRangeType("PREVIOUS_MONTH", 1, R.string.previous_month);
            DateRangeType dateRangeType3 = new DateRangeType("PREVIOUS_QUARTER", 2, R.string.previous_quarter);
            DateRangeType dateRangeType4 = new DateRangeType("CUSTOM", 3, R.string.custom_date_range);
            f13031c = dateRangeType4;
            DateRangeType[] dateRangeTypeArr = {dateRangeType, dateRangeType2, dateRangeType3, dateRangeType4, new DateRangeType("YEAR_TO_DATE", 4, R.string.year_to_date)};
            f13032d = dateRangeTypeArr;
            f13033e = kotlin.enums.a.a(dateRangeTypeArr);
        }

        public DateRangeType(String str, int i, int i9) {
            this.f13034a = i9;
        }

        public static DateRangeType valueOf(String str) {
            return (DateRangeType) Enum.valueOf(DateRangeType.class, str);
        }

        public static DateRangeType[] values() {
            return (DateRangeType[]) f13032d.clone();
        }
    }

    /* compiled from: StatementsDateFragment.kt */
    public static final class a implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f13035a;

        public a(n8.c cVar) {
            this.f13035a = cVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f13035a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13035a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment$special$$inlined$viewModel$default$1] */
    public StatementsDateFragment() {
        final ?? r02 = new InterfaceC0635a<Fragment>() { // from class: com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.f13019o0 = E.a(this, h.a(c.class), new InterfaceC0635a<W>() { // from class: com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment$special$$inlined$viewModel$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final W invoke() {
                return ((X) r02.invoke()).getViewModelStore();
            }
        }, new InterfaceC0635a<T>() { // from class: com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final T invoke() {
                return U4.b.n((X) r02.invoke(), h.a(c.class), null, null, U4.b.l(this));
            }
        });
        this.f13023t0 = "PDF";
        this.f13024u0 = StatementsType.f13086b;
        this.f13025v0 = DateRangeType.f13031c;
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.b();
        ToolbarStatus toolbarStatus = ToolbarStatus.visible;
        toolbarStatus.f13267e = true;
        toolbarStatus.f13263a = getString(R.string.hub_statements);
        return toolbarStatus;
    }

    public final c T0() {
        return (c) this.f13019o0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog.a r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            F0.f r0 = r5.u0()
            t6.Z5 r0 = (t6.Z5) r0
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r0 = r0.f28774t
            java.lang.String r1 = r6.f13052a
            r0.setText(r1)
            F0.f r0 = r5.u0()
            t6.Z5 r0 = (t6.Z5) r0
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r0 = r0.f28773s
            r0.e()
            com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType r0 = r5.f13024u0
            int r0 = r0.ordinal()
            r1 = 0
            java.lang.Integer r2 = r6.f13059h
            if (r0 == 0) goto L5b
            r3 = 1
            if (r0 == r3) goto L4d
            r3 = 2
            if (r0 != r3) goto L47
            r5.s0 = r2
            F0.f r0 = r5.u0()
            t6.Z5 r0 = (t6.Z5) r0
            com.google.android.material.imageview.ShapeableImageView r0 = r0.f28769o
            r0.setVisibility(r1)
            F0.f r0 = r5.u0()
            t6.Z5 r0 = (t6.Z5) r0
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r0 = r0.f28773s
            java.lang.String r6 = r6.f13053b
            r0.setHint(r6)
            goto L9a
        L47:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L4d:
            r5.f13022r0 = r2
            F0.f r6 = r5.u0()
            t6.Z5 r6 = (t6.Z5) r6
            com.google.android.material.imageview.ShapeableImageView r6 = r6.f28769o
            r6.setVisibility(r1)
            goto L9a
        L5b:
            java.lang.String r6 = r6.f13058g
            boolean r0 = K3.a.c(r6)
            r3 = 0
            if (r0 == 0) goto L71
            if (r6 == 0) goto L6f
            android.content.Context r0 = r5.requireContext()
            java.lang.Integer r0 = D9.b.M(r0, r6)
            goto L77
        L6f:
            r0 = r3
            goto L77
        L71:
            if (r6 == 0) goto L6f
            java.lang.Integer r0 = D9.b.z(r6)
        L77:
            if (r0 == 0) goto L8b
            int r0 = r0.intValue()
            F0.f r4 = r5.u0()
            t6.Z5 r4 = (t6.Z5) r4
            com.google.android.material.imageview.ShapeableImageView r4 = r4.f28772r
            r4.setImageResource(r0)
            r4.setVisibility(r1)
        L8b:
            boolean r6 = K3.a.c(r6)
            if (r6 == 0) goto L96
            r5.f13020p0 = r2
            r5.f13021q0 = r3
            goto L9a
        L96:
            r5.f13021q0 = r2
            r5.f13020p0 = r3
        L9a:
            r5.W0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment.U0(com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog$a):void");
    }

    public final void V0(final boolean z10) {
        final Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        final o8.a m2 = T0().m(this.f13024u0);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(1, -1);
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext(), R.style.my_dialog_theme, new DatePickerDialog.OnDateSetListener() { // from class: n8.b
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i9, int i10) {
                Calendar calendar4 = calendar;
                calendar4.set(i, i9, i10);
                boolean z11 = z10;
                o8.a aVar = m2;
                StatementsDateFragment statementsDateFragment = this;
                if (z11) {
                    if (!kotlin.jvm.internal.f.b(aVar.f24395b, D9.b.w0(calendar4.getTime()))) {
                        statementsDateFragment.u0().f28777w.setText(statementsDateFragment.getString(R.string.custom_date_range));
                    }
                    aVar.f24395b = D9.b.w0(calendar4.getTime());
                    Z5 u02 = statementsDateFragment.u0();
                    u02.f28771q.setText(D9.b.F0(calendar4.getTime(), "yyyy-MM-dd"));
                } else {
                    if (!kotlin.jvm.internal.f.b(aVar.f24396c, D9.b.u0(calendar4.getTime()))) {
                        statementsDateFragment.u0().f28777w.setText(statementsDateFragment.getString(R.string.custom_date_range));
                    }
                    aVar.f24396c = D9.b.u0(calendar4.getTime());
                    Z5 u03 = statementsDateFragment.u0();
                    u03.f28775u.setText(D9.b.F0(calendar4.getTime(), "yyyy-MM-dd"));
                }
                statementsDateFragment.W0();
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(calendar2.getTimeInMillis());
        if (z10) {
            Date date = m2.f24396c;
            if (date != null) {
                datePickerDialog.getDatePicker().setMaxDate(date.getTime());
            }
            Date date2 = m2.f24396c;
            if (date2 != null) {
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTime(date2);
                calendar4.add(1, -1);
                datePickerDialog.getDatePicker().setMinDate(calendar4.getTimeInMillis());
            } else {
                datePickerDialog.getDatePicker().setMinDate(calendar3.getTimeInMillis());
            }
        } else {
            Date date3 = m2.f24395b;
            datePickerDialog.getDatePicker().setMinDate(date3 != null ? date3.getTime() : calendar3.getTimeInMillis());
        }
        datePickerDialog.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r1.length() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0021, code lost:
    
        if (r4.f13022r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        if (r4.f13021q0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4.s0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0() {
        /*
            r4 = this;
            F0.f r0 = r4.u0()
            t6.Z5 r0 = (t6.Z5) r0
            com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType r1 = r4.f13024u0
            int r1 = r1.ordinal()
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1f
            r3 = 2
            if (r1 != r3) goto L19
            java.lang.Integer r1 = r4.s0
            if (r1 == 0) goto L48
            goto L2c
        L19:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L1f:
            java.lang.Integer r1 = r4.f13022r0
            if (r1 == 0) goto L48
            goto L2c
        L24:
            java.lang.Integer r1 = r4.f13020p0
            if (r1 != 0) goto L2c
            java.lang.Integer r1 = r4.f13021q0
            if (r1 == 0) goto L48
        L2c:
            com.luminary.business.presentation.ui.fragments.statements.c r1 = r4.T0()
            com.luminary.business.presentation.ui.fragments.statements.domain.StatementsType r3 = r4.f13024u0
            o8.a r1 = r1.m(r3)
            java.util.Date r3 = r1.f24395b
            if (r3 == 0) goto L48
            java.util.Date r1 = r1.f24396c
            if (r1 == 0) goto L48
            java.lang.String r1 = r4.f13023t0
            if (r1 == 0) goto L48
            int r1 = r1.length()
            if (r1 != 0) goto L49
        L48:
            r2 = 0
        L49:
            android.widget.Button r0 = r0.f28768n
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luminary.business.presentation.ui.fragments.statements.StatementsDateFragment.W0():void");
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11471m0 = T0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        u0().f28770p.setText(this.f13023t0);
        Z5 u02 = u0();
        o.c(u02.f28771q, 500L, new C1074a(this, 0));
        Z5 u03 = u0();
        o.c(u03.f28775u, 500L, new C1074a(this, 2));
        Z5 u04 = u0();
        o.c(u04.f28774t, 500L, new C1074a(this, 3));
        Z5 u05 = u0();
        o.c(u05.f28777w, 500L, new C1074a(this, 4));
        T0().f13078e1.observe(getViewLifecycleOwner(), new a(new n8.c(this, 0)));
        Z5 u06 = u0();
        o.c(u06.f28770p, 500L, new C1074a(this, 5));
        Z5 u07 = u0();
        o.c(u07.f28768n, 500L, new C1074a(this, 6));
        Z5 u08 = u0();
        u08.f28776v.a(new com.luminary.business.presentation.ui.fragments.statements.a(this));
        o8.a m2 = T0().m(this.f13024u0);
        Z5 u09 = u0();
        TabLayout.g h9 = u09.f28776v.h(m2.f24394a.ordinal());
        if (h9 != null) {
            h9.a();
        }
        StatementsSelectorDialog.a aVar = m2.f24398e;
        if (aVar != null) {
            U0(aVar);
        }
        W0();
    }

    @Override // com.luminary.business.presentation.ui.base.BaseFragment
    public final int v0() {
        return this.f13018n0;
    }
}
