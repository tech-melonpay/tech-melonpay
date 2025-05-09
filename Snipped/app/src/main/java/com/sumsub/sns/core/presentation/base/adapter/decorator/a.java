package com.sumsub.sns.core.presentation.base.adapter.decorator;

import P9.m;
import P9.v;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.m {

    /* renamed from: a, reason: collision with root package name */
    public final float f14149a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14150b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14152d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f14153e;

    public a(float f10, float f11, float f12, int i) {
        this.f14149a = f10;
        this.f14150b = f11;
        this.f14151c = f12;
        this.f14152d = i;
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f12);
        this.f14153e = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        int childCount = recyclerView.getChildCount();
        v vVar = new v(recyclerView, 4);
        int i = 0;
        while (vVar.hasNext()) {
            Object next = vVar.next();
            int i9 = i + 1;
            if (i < 0) {
                m.t();
                throw null;
            }
            View view = (View) next;
            if (i != childCount - 1) {
                float bottom = view.getBottom();
                canvas.drawLine(this.f14149a, bottom, view.getRight() - this.f14150b, bottom, this.f14153e);
            }
            i = i9;
        }
    }
}
