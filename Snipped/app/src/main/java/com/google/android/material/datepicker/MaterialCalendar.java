package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.l;
import y0.C1596C;
import y0.C1597a;
import z0.C1638d;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends t<S> {

    /* renamed from: g0, reason: collision with root package name */
    public int f9381g0;

    /* renamed from: h0, reason: collision with root package name */
    public DateSelector<S> f9382h0;

    /* renamed from: i0, reason: collision with root package name */
    public CalendarConstraints f9383i0;

    /* renamed from: j0, reason: collision with root package name */
    public DayViewDecorator f9384j0;

    /* renamed from: k0, reason: collision with root package name */
    public Month f9385k0;

    /* renamed from: l0, reason: collision with root package name */
    public CalendarSelector f9386l0;

    /* renamed from: m0, reason: collision with root package name */
    public H1.c f9387m0;

    /* renamed from: n0, reason: collision with root package name */
    public RecyclerView f9388n0;

    /* renamed from: o0, reason: collision with root package name */
    public RecyclerView f9389o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f9390p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f9391q0;

    /* renamed from: r0, reason: collision with root package name */
    public View f9392r0;
    public View s0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CalendarSelector {

        /* renamed from: a, reason: collision with root package name */
        public static final CalendarSelector f9393a;

        /* renamed from: b, reason: collision with root package name */
        public static final CalendarSelector f9394b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ CalendarSelector[] f9395c;

        static {
            CalendarSelector calendarSelector = new CalendarSelector("DAY", 0);
            f9393a = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            f9394b = calendarSelector2;
            f9395c = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public CalendarSelector() {
            throw null;
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) f9395c.clone();
        }
    }

    public class a extends C1597a {
        @Override // y0.C1597a
        public final void d(View view, C1638d c1638d) {
            this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
            c1638d.i(null);
        }
    }

    public class b extends w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int i, int i9) {
            super(context, i, false);
            this.f9396a = i9;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
            int i = this.f9396a;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i == 0) {
                iArr[0] = materialCalendar.f9389o0.getWidth();
                iArr[1] = materialCalendar.f9389o0.getWidth();
            } else {
                iArr[0] = materialCalendar.f9389o0.getHeight();
                iArr[1] = materialCalendar.f9389o0.getHeight();
            }
        }
    }

    public class c implements d {
        public c() {
        }
    }

    public interface d {
    }

    @Override // com.google.android.material.datepicker.t
    public final void c(l.c cVar) {
        this.f9506f0.add(cVar);
    }

    public final void d(Month month) {
        r rVar = (r) this.f9389o0.getAdapter();
        int f10 = rVar.f9499d.f9365a.f(month);
        int f11 = f10 - rVar.f9499d.f9365a.f(this.f9385k0);
        boolean z10 = Math.abs(f11) > 3;
        boolean z11 = f11 > 0;
        this.f9385k0 = month;
        if (z10 && z11) {
            this.f9389o0.scrollToPosition(f10 - 3);
            this.f9389o0.post(new A1.f(f10, 1, this));
        } else if (!z10) {
            this.f9389o0.post(new A1.f(f10, 1, this));
        } else {
            this.f9389o0.scrollToPosition(f10 + 3);
            this.f9389o0.post(new A1.f(f10, 1, this));
        }
    }

    public final void e(CalendarSelector calendarSelector) {
        this.f9386l0 = calendarSelector;
        if (calendarSelector == CalendarSelector.f9394b) {
            this.f9388n0.getLayoutManager().scrollToPosition(this.f9385k0.f9403c - ((A) this.f9388n0.getAdapter()).f9363d.f9383i0.f9365a.f9403c);
            this.f9392r0.setVisibility(0);
            this.s0.setVisibility(8);
            this.f9390p0.setVisibility(8);
            this.f9391q0.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.f9393a) {
            this.f9392r0.setVisibility(8);
            this.s0.setVisibility(0);
            this.f9390p0.setVisibility(0);
            this.f9391q0.setVisibility(0);
            d(this.f9385k0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9381g0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9382h0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f9383i0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9384j0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f9385k0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i9;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f9381g0);
        this.f9387m0 = new H1.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f9383i0.f9365a;
        if (l.q0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.luminary.mobile.R.layout.mtrl_calendar_vertical;
            i9 = 1;
        } else {
            i = com.luminary.mobile.R.layout.mtrl_calendar_horizontal;
            i9 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.mtrl_calendar_days_of_week_height);
        int i10 = p.f9489g;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_calendar_month_vertical_padding) * (i10 - 1)) + (resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.mtrl_calendar_day_height) * i10) + resources.getDimensionPixelOffset(com.luminary.mobile.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.luminary.mobile.R.id.mtrl_calendar_days_of_week);
        C1596C.o(gridView, new a());
        int i11 = this.f9383i0.f9369e;
        gridView.setAdapter((ListAdapter) (i11 > 0 ? new e(i11) : new e()));
        gridView.setNumColumns(month.f9404d);
        gridView.setEnabled(false);
        this.f9389o0 = (RecyclerView) inflate.findViewById(com.luminary.mobile.R.id.mtrl_calendar_months);
        this.f9389o0.setLayoutManager(new b(getContext(), i9, i9));
        this.f9389o0.setTag("MONTHS_VIEW_GROUP_TAG");
        r rVar = new r(contextThemeWrapper, this.f9382h0, this.f9383i0, this.f9384j0, new c());
        this.f9389o0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.luminary.mobile.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.luminary.mobile.R.id.mtrl_calendar_year_selector_frame);
        this.f9388n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f9388n0.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer));
            this.f9388n0.setAdapter(new A(this));
            this.f9388n0.addItemDecoration(new h(this));
        }
        if (inflate.findViewById(com.luminary.mobile.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.luminary.mobile.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C1596C.o(materialButton, new V2.b(this, 1));
            View findViewById = inflate.findViewById(com.luminary.mobile.R.id.month_navigation_previous);
            this.f9390p0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.luminary.mobile.R.id.month_navigation_next);
            this.f9391q0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f9392r0 = inflate.findViewById(com.luminary.mobile.R.id.mtrl_calendar_year_selector_frame);
            this.s0 = inflate.findViewById(com.luminary.mobile.R.id.mtrl_calendar_day_selector_frame);
            e(CalendarSelector.f9393a);
            materialButton.setText(this.f9385k0.e());
            this.f9389o0.addOnScrollListener(new i(this, rVar, materialButton));
            materialButton.setOnClickListener(new j(this));
            this.f9391q0.setOnClickListener(new k(this, rVar));
            this.f9390p0.setOnClickListener(new f(this, rVar));
        }
        if (!l.q0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new I().a(this.f9389o0);
        }
        this.f9389o0.scrollToPosition(rVar.f9499d.f9365a.f(this.f9385k0));
        C1596C.o(this.f9389o0, new g(0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9381g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f9382h0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9383i0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f9384j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9385k0);
    }
}
