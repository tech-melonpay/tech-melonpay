package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
public final class A extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    public final MaterialCalendar<?> f9363d;

    /* compiled from: YearGridAdapter.java */
    public static class a extends RecyclerView.C {

        /* renamed from: e, reason: collision with root package name */
        public final TextView f9364e;

        public a(TextView textView) {
            super(textView);
            this.f9364e = textView;
        }
    }

    public A(MaterialCalendar<?> materialCalendar) {
        this.f9363d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f9363d.f9383i0.f9370f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        MaterialCalendar<?> materialCalendar = this.f9363d;
        int i9 = materialCalendar.f9383i0.f9365a.f9403c + i;
        aVar2.f9364e.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i9)));
        TextView textView = aVar2.f9364e;
        Context context = textView.getContext();
        textView.setContentDescription(y.f().get(1) == i9 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i9)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i9)));
        H1.c cVar = materialCalendar.f9387m0;
        Calendar f10 = y.f();
        C0653a c0653a = (C0653a) (f10.get(1) == i9 ? cVar.f1443f : cVar.f1441d);
        Iterator it = materialCalendar.f9382h0.W().iterator();
        while (it.hasNext()) {
            f10.setTimeInMillis(((Long) it.next()).longValue());
            if (f10.get(1) == i9) {
                c0653a = (C0653a) cVar.f1442e;
            }
        }
        c0653a.b(textView);
        textView.setOnClickListener(new z(this, i9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
