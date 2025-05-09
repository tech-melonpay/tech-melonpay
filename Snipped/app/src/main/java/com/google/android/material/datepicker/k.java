package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f9444b;

    public k(MaterialCalendar materialCalendar, r rVar) {
        this.f9444b = materialCalendar;
        this.f9443a = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f9444b;
        int findFirstVisibleItemPosition = ((LinearLayoutManager) materialCalendar.f9389o0.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < materialCalendar.f9389o0.getAdapter().getItemCount()) {
            Calendar c2 = y.c(this.f9443a.f9499d.f9365a.f9401a);
            c2.add(2, findFirstVisibleItemPosition);
            materialCalendar.d(new Month(c2));
        }
    }
}
