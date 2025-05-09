package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: MonthAdapter.java */
/* loaded from: classes.dex */
public final class p extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public static final int f9489g = y.g(null).getMaximum(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f9490h = (y.g(null).getMaximum(7) + y.g(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final Month f9491a;

    /* renamed from: b, reason: collision with root package name */
    public final DateSelector<?> f9492b;

    /* renamed from: c, reason: collision with root package name */
    public Collection<Long> f9493c;

    /* renamed from: d, reason: collision with root package name */
    public H1.c f9494d;

    /* renamed from: e, reason: collision with root package name */
    public final CalendarConstraints f9495e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f9496f;

    public p(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f9491a = month;
        this.f9492b = dateSelector;
        this.f9495e = calendarConstraints;
        this.f9496f = dayViewDecorator;
        this.f9493c = dateSelector.W();
    }

    public final int b() {
        int i = this.f9495e.f9369e;
        Month month = this.f9491a;
        Calendar calendar = month.f9401a;
        int i9 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i10 = i9 - i;
        return i10 < 0 ? i10 + month.f9404d : i10;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < b() || i > d()) {
            return null;
        }
        int b9 = (i - b()) + 1;
        Calendar c2 = y.c(this.f9491a.f9401a);
        c2.set(5, b9);
        return Long.valueOf(c2.getTimeInMillis());
    }

    public final int d() {
        return (b() + this.f9491a.f9405e) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(TextView textView, long j10, int i) {
        boolean z10;
        boolean z11;
        C0653a c0653a;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z12 = false;
        boolean z13 = y.f().getTimeInMillis() == j10;
        DateSelector<?> dateSelector = this.f9492b;
        Iterator it = dateSelector.C().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            F f10 = ((x0.b) it.next()).f30903a;
            if (f10 != 0 && ((Long) f10).longValue() == j10) {
                z10 = true;
                break;
            }
        }
        Iterator it2 = dateSelector.C().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = false;
                break;
            }
            S s10 = ((x0.b) it2.next()).f30904b;
            if (s10 != 0 && ((Long) s10).longValue() == j10) {
                z11 = true;
                break;
            }
        }
        Calendar f11 = y.f();
        Calendar g10 = y.g(null);
        g10.setTimeInMillis(j10);
        String format = f11.get(1) == g10.get(1) ? y.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j10)) : y.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j10));
        if (z13) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z10) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z11) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f9495e.f9367c.P(j10)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.W().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (y.a(j10) == y.a(((Long) it3.next()).longValue())) {
                    z12 = true;
                    break;
                }
            }
            textView.setSelected(z12);
            c0653a = z12 ? (C0653a) this.f9494d.f1439b : y.f().getTimeInMillis() == j10 ? (C0653a) this.f9494d.f1440c : (C0653a) this.f9494d.f1438a;
        } else {
            textView.setEnabled(false);
            c0653a = (C0653a) this.f9494d.f1444g;
        }
        if (this.f9496f == null || i == -1) {
            c0653a.b(textView);
            return;
        }
        int i9 = this.f9491a.f9403c;
        c0653a.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(format);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j10) {
        Month d10 = Month.d(j10);
        Month month = this.f9491a;
        if (d10.equals(month)) {
            Calendar c2 = y.c(month.f9401a);
            c2.setTimeInMillis(j10);
            int i = c2.get(5);
            e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().b() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f9490h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f9491a.f9404d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            H1.c r1 = r5.f9494d
            if (r1 != 0) goto Lf
            H1.c r1 = new H1.c
            r1.<init>(r0)
            r5.f9494d = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131558724(0x7f0d0144, float:1.8742772E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.Month r8 = r5.f9491a
            int r2 = r8.f9405e
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            goto L74
        L6d:
            long r1 = r6.longValue()
            r5.e(r0, r1, r7)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.p.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
