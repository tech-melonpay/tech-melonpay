package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.luminary.mobile.R;
import y0.C1597a;
import z0.C1638d;

/* compiled from: ClockFaceView.java */
/* loaded from: classes.dex */
public class c extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9984d;

    public c(ClockFaceView clockFaceView) {
        this.f9984d = clockFaceView;
    }

    @Override // y0.C1597a
    public final void d(View view, C1638d c1638d) {
        View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter(this.f9984d.f9935h.get(intValue - 1));
        }
        c1638d.j(C1638d.f.a(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c1638d.b(C1638d.a.f31222e);
    }

    @Override // y0.C1597a
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f9984d;
        view.getHitRect(clockFaceView.f9932e);
        float centerX = clockFaceView.f9932e.centerX();
        float centerY = clockFaceView.f9932e.centerY();
        clockFaceView.f9931d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f9931d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
