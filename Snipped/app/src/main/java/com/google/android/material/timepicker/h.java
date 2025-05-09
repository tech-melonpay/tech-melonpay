package com.google.android.material.timepicker;

import T2.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes.dex */
public class h extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final e f10014a;

    /* renamed from: b, reason: collision with root package name */
    public int f10015b;

    /* renamed from: c, reason: collision with root package name */
    public final T2.f f10016c;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i9 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i9 == null) {
                    i9 = 1;
                }
                if (!hashMap.containsKey(i9)) {
                    hashMap.put(i9, new ArrayList());
                }
                ((List) hashMap.get(i9)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f10015b * 0.66f) : this.f10015b;
            Iterator it = list.iterator();
            float f10 = 0.0f;
            while (it.hasNext()) {
                b.C0071b c0071b = bVar.e(((View) it.next()).getId()).f6337d;
                c0071b.f6409z = R.id.circle_center;
                c0071b.f6352A = round;
                c0071b.f6353B = f10;
                f10 += 360.0f / list.size();
            }
        }
        bVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f10014a;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f10014a;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f10016c.o(ColorStateList.valueOf(i));
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        T2.f fVar = new T2.f();
        this.f10016c = fVar;
        T2.g gVar = new T2.g(0.5f);
        i.a e10 = fVar.f3448a.f3471a.e();
        e10.f3508e = gVar;
        e10.f3509f = gVar;
        e10.f3510g = gVar;
        e10.f3511h = gVar;
        fVar.setShapeAppearanceModel(e10.a());
        this.f10016c.o(ColorStateList.valueOf(-1));
        T2.f fVar2 = this.f10016c;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setBackground(fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27475I, i, 0);
        this.f10015b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10014a = new e(this, 1);
        obtainStyledAttributes.recycle();
    }
}
