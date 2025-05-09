package com.luminary.business.presentation.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: DisableableAppBarLayoutBehavior.kt */
/* loaded from: classes2.dex */
public final class DisableableAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public DisableableAppBarLayoutBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return false;
    }

    public DisableableAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
