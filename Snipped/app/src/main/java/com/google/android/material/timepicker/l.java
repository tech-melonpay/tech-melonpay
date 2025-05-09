package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements MaterialButtonToggleGroup.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10032b;

    public /* synthetic */ l(Object obj, int i) {
        this.f10031a = i;
        this.f10032b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
    public final void a(int i, boolean z10) {
        Object obj = this.f10032b;
        switch (this.f10031a) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                if (z10) {
                    mVar.f10034b.e(i == R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z10) {
                    int i9 = TimePickerView.i;
                    timePickerView.getClass();
                    break;
                } else {
                    TimePickerView.c cVar = timePickerView.f9978f;
                    if (cVar != null) {
                        ((i) cVar).f10021b.e(i == R.id.material_clock_period_pm_button ? 1 : 0);
                        break;
                    }
                }
                break;
        }
    }
}
