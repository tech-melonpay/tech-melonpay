package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class i extends RecyclerView.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f9440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f9441c;

    public i(MaterialCalendar materialCalendar, r rVar, MaterialButton materialButton) {
        this.f9441c = materialCalendar;
        this.f9439a = rVar;
        this.f9440b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f9440b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
        MaterialCalendar materialCalendar = this.f9441c;
        int findFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) materialCalendar.f9389o0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) materialCalendar.f9389o0.getLayoutManager()).findLastVisibleItemPosition();
        r rVar = this.f9439a;
        Calendar c2 = y.c(rVar.f9499d.f9365a.f9401a);
        c2.add(2, findFirstVisibleItemPosition);
        materialCalendar.f9385k0 = new Month(c2);
        Calendar c10 = y.c(rVar.f9499d.f9365a.f9401a);
        c10.add(2, findFirstVisibleItemPosition);
        this.f9440b.setText(new Month(c10).e());
    }
}
