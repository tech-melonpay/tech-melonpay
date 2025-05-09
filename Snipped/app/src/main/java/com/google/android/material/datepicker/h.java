package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class h extends RecyclerView.m {

    /* renamed from: f, reason: collision with root package name */
    public final Calendar f9436f = y.g(null);

    /* renamed from: g, reason: collision with root package name */
    public final Calendar f9437g = y.g(null);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f9438h;

    public h(MaterialCalendar materialCalendar) {
        this.f9438h = materialCalendar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        S s10;
        if ((recyclerView.getAdapter() instanceof A) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            A a10 = (A) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.f9438h;
            Iterator it = materialCalendar.f9382h0.C().iterator();
            while (it.hasNext()) {
                x0.b bVar = (x0.b) it.next();
                F f10 = bVar.f30903a;
                if (f10 != 0 && (s10 = bVar.f30904b) != 0) {
                    long longValue = ((Long) f10).longValue();
                    Calendar calendar = this.f9436f;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = ((Long) s10).longValue();
                    Calendar calendar2 = this.f9437g;
                    calendar2.setTimeInMillis(longValue2);
                    int i = calendar.get(1) - a10.f9363d.f9383i0.f9365a.f9403c;
                    int i9 = calendar2.get(1) - a10.f9363d.f9383i0.f9365a.f9403c;
                    View findViewByPosition = gridLayoutManager.findViewByPosition(i);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i9);
                    int i10 = gridLayoutManager.f7414b;
                    int i11 = i / i10;
                    int i12 = i9 / i10;
                    int i13 = i11;
                    while (i13 <= i12) {
                        if (gridLayoutManager.findViewByPosition(gridLayoutManager.f7414b * i13) != null) {
                            canvas.drawRect((i13 != i11 || findViewByPosition == null) ? 0 : (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft(), r10.getTop() + ((C0653a) materialCalendar.f9387m0.f1441d).f9414a.top, (i13 != i12 || findViewByPosition2 == null) ? recyclerView.getWidth() : (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft(), r10.getBottom() - ((C0653a) materialCalendar.f9387m0.f1441d).f9414a.bottom, (Paint) materialCalendar.f9387m0.f1445h);
                        }
                        i13++;
                    }
                }
            }
        }
    }
}
