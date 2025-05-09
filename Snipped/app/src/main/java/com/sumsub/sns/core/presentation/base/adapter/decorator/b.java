package com.sumsub.sns.core.presentation.base.adapter.decorator;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.m {

    /* renamed from: a, reason: collision with root package name */
    public final int f14154a;

    public b(int i) {
        this.f14154a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (recyclerView.getChildAdapterPosition(view) != (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
            rect.bottom = this.f14154a;
        }
    }
}
