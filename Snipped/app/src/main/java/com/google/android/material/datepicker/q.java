package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f9497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f9498b;

    public q(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f9498b = rVar;
        this.f9497a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f9497a;
        p a10 = materialCalendarGridView.a();
        if (i < a10.b() || i > a10.d()) {
            return;
        }
        MaterialCalendar.d dVar = this.f9498b.f9502g;
        long longValue = materialCalendarGridView.a().getItem(i).longValue();
        MaterialCalendar materialCalendar = MaterialCalendar.this;
        if (materialCalendar.f9383i0.f9367c.P(longValue)) {
            materialCalendar.f9382h0.g0(longValue);
            Iterator it = materialCalendar.f9506f0.iterator();
            while (it.hasNext()) {
                ((s) it.next()).b(materialCalendar.f9382h0.a0());
            }
            materialCalendar.f9389o0.getAdapter().notifyDataSetChanged();
            RecyclerView recyclerView = materialCalendar.f9388n0;
            if (recyclerView != null) {
                recyclerView.getAdapter().notifyDataSetChanged();
            }
        }
    }
}
