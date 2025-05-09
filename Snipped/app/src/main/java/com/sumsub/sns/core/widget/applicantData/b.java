package com.sumsub.sns.core.widget.applicantData;

import X2.h;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14364b;

    public /* synthetic */ b(Object obj, int i) {
        this.f14363a = i;
        this.f14364b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean m64_init_$lambda5;
        switch (this.f14363a) {
            case 0:
                m64_init_$lambda5 = SNSApplicantDataSelectionCountryFieldView.m64_init_$lambda5((GestureDetector) this.f14364b, view, motionEvent);
                return m64_init_$lambda5;
            case 1:
                return SNSApplicantDataSelectionFieldView.m67_init_$lambda0((GestureDetector) this.f14364b, view, motionEvent);
            default:
                h hVar = (h) this.f14364b;
                hVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - hVar.f3975o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        hVar.f3973m = false;
                    }
                    hVar.u();
                    hVar.f3973m = true;
                    hVar.f3975o = System.currentTimeMillis();
                }
                return false;
        }
    }
}
