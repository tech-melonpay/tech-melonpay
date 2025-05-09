package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f9434b;

    public f(MaterialCalendar materialCalendar, r rVar) {
        this.f9434b = materialCalendar;
        this.f9433a = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f9434b;
        int findLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.f9389o0.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            Calendar c2 = y.c(this.f9433a.f9499d.f9365a.f9401a);
            c2.add(2, findLastVisibleItemPosition);
            materialCalendar.d(new Month(c2));
        }
    }
}
