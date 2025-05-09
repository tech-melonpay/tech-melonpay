package com.sumsub.sns.presentation.screen.preview.photo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.m {

    /* renamed from: a, reason: collision with root package name */
    public final int f20023a;

    public a(int i) {
        this.f20023a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        int i = this.f20023a;
        rect.right = i;
        rect.left = i;
    }
}
