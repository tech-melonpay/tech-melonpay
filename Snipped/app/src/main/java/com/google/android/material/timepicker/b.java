package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: ClockFaceView.java */
/* loaded from: classes.dex */
public class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9983a;

    public b(ClockFaceView clockFaceView) {
        this.f9983a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f9983a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f9931d.f9955k) - clockFaceView.f9938l;
        if (height != clockFaceView.f10015b) {
            clockFaceView.f10015b = height;
            clockFaceView.a();
            int i = clockFaceView.f10015b;
            ClockHandView clockHandView = clockFaceView.f9931d;
            clockHandView.f9964t = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
