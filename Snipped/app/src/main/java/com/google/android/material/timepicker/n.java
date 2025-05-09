package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;

/* compiled from: TimePickerView.java */
/* loaded from: classes.dex */
public final class n extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f10046a;

    public n(TimePickerView timePickerView) {
        this.f10046a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView.b bVar = this.f10046a.f9980h;
        if (bVar == null) {
            return false;
        }
        f fVar = (f) bVar;
        fVar.f10007y0 = 1;
        fVar.q0(fVar.f10005w0);
        fVar.f9996m0.b();
        return true;
    }
}
