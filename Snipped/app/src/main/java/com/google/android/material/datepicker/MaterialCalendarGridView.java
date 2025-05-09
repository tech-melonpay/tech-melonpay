package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import y0.C1596C;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f9399a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9400b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9399a = y.g(null);
        if (l.q0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.luminary.mobile.R.id.cancel_button);
            setNextFocusRightId(com.luminary.mobile.R.id.confirm_button);
        }
        this.f9400b = l.q0(getContext(), com.luminary.mobile.R.attr.nestedScrollable);
        C1596C.o(this, new g(1));
    }

    public final p a() {
        return (p) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p) super.getAdapter()).notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int b9;
        int width;
        int b10;
        int width2;
        int i;
        int i9;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        p pVar = (p) super.getAdapter();
        DateSelector<?> dateSelector = pVar.f9492b;
        H1.c cVar = pVar.f9494d;
        int max = Math.max(pVar.b(), getFirstVisiblePosition());
        int min = Math.min(pVar.d(), getLastVisiblePosition());
        Long item = pVar.getItem(max);
        Long item2 = pVar.getItem(min);
        Iterator it = dateSelector.C().iterator();
        while (it.hasNext()) {
            x0.b bVar = (x0.b) it.next();
            F f10 = bVar.f30903a;
            if (f10 != 0) {
                S s10 = bVar.f30904b;
                if (s10 != 0) {
                    Long l10 = (Long) f10;
                    long longValue = l10.longValue();
                    Long l11 = (Long) s10;
                    long longValue2 = l11.longValue();
                    if (item == null || item2 == null || l10.longValue() > item2.longValue() || l11.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        max = max;
                        pVar = pVar;
                        it = it;
                    } else {
                        boolean c2 = J2.k.c(this);
                        long longValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f9399a;
                        Month month = pVar.f9491a;
                        if (longValue < longValue3) {
                            width = max % month.f9404d == 0 ? 0 : !c2 ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                            b9 = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            b9 = pVar.b() + (calendar.get(5) - 1);
                            View b11 = materialCalendarGridView.b(b9);
                            width = (b11.getWidth() / 2) + b11.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            width2 = (min + 1) % month.f9404d == 0 ? getWidth() : !c2 ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                            b10 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            b10 = pVar.b() + (calendar.get(5) - 1);
                            View b12 = materialCalendarGridView.b(b10);
                            width2 = (b12.getWidth() / 2) + b12.getLeft();
                        }
                        int itemId = (int) pVar.getItemId(b9);
                        int itemId2 = (int) pVar.getItemId(b10);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            p pVar2 = pVar;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View b13 = materialCalendarGridView.b(numColumns);
                            int top = b13.getTop() + ((C0653a) cVar.f1438a).f9414a.top;
                            Iterator it2 = it;
                            int bottom = b13.getBottom() - ((C0653a) cVar.f1438a).f9414a.bottom;
                            if (c2) {
                                int i10 = b10 > numColumns2 ? 0 : width2;
                                int width3 = numColumns > b9 ? getWidth() : width;
                                i = i10;
                                i9 = width3;
                            } else {
                                i = numColumns > b9 ? 0 : width;
                                i9 = b10 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, i9, bottom, (Paint) cVar.f1445h);
                            itemId++;
                            materialCalendarGridView = this;
                            max = max;
                            pVar = pVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((p) super.getAdapter()).d());
        } else if (i == 130) {
            setSelection(((p) super.getAdapter()).b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((p) super.getAdapter()).b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((p) super.getAdapter()).b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i9) {
        if (!this.f9400b) {
            super.onMeasure(i, i9);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((p) super.getAdapter()).b()) {
            super.setSelection(((p) super.getAdapter()).b());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof p)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
