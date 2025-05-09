package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes.dex */
public class w extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    public class a extends androidx.recyclerview.widget.A {
        @Override // androidx.recyclerview.widget.A
        public final float h(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.f7523a = i;
        startSmoothScroll(aVar);
    }
}
