package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes.dex */
public final class r extends RecyclerView.m {
    public static final int[] i = {R.attr.listDivider};

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f7720f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7721g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f7722h = new Rect();

    @SuppressLint({"UnknownNullness"})
    public r(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f7720f = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.f7721g = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        Drawable drawable = this.f7720f;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f7721g == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        Drawable drawable;
        int height;
        int i9;
        int width;
        int i10;
        if (recyclerView.getLayoutManager() == null || (drawable = this.f7720f) == null) {
            return;
        }
        int i11 = this.f7721g;
        Rect rect = this.f7722h;
        int i12 = 0;
        if (i11 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i10 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i10, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i10 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i12 < childCount) {
                View childAt = recyclerView.getChildAt(i12);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                drawable.setBounds(i10, round - drawable.getIntrinsicHeight(), width, round);
                drawable.draw(canvas);
                i12++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i9 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i9, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i9 = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i12 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i12);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
            drawable.setBounds(round2 - drawable.getIntrinsicWidth(), i9, round2, height);
            drawable.draw(canvas);
            i12++;
        }
        canvas.restore();
    }
}
