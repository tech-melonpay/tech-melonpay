package com.google.android.material.bottomnavigation;

import J2.i;
import J2.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.navigation.NavigationBarView;
import com.luminary.mobile.R;
import m.Z;
import t2.C1279a;
import y2.c;

/* loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    public interface a extends NavigationBarView.a {
    }

    @Deprecated
    public interface b extends NavigationBarView.b {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Z e10 = i.e(getContext(), attributeSet, C1279a.f27488e, R.attr.bottomNavigationStyle, 2132083632, new int[0]);
        TypedArray typedArray = e10.f23728b;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        e10.g();
        k.a(this, new c());
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i9) != 1073741824 && suggestedMinimumHeight > 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i9);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        y2.b bVar = (y2.b) getMenuView();
        if (bVar.f31113L != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
