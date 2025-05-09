package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.luminary.mobile.R;
import java.util.Locale;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;
import z0.C1638d;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: classes.dex */
public final class i implements ClockHandView.c, TimePickerView.d, TimePickerView.c, ClockHandView.b, j {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f10017f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f10018g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f10019h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a, reason: collision with root package name */
    public final TimePickerView f10020a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeModel f10021b;

    /* renamed from: c, reason: collision with root package name */
    public float f10022c;

    /* renamed from: d, reason: collision with root package name */
    public float f10023d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10024e = false;

    /* compiled from: TimePickerClockPresenter.java */
    public class a extends com.google.android.material.timepicker.a {
        public a(Context context) {
            super(context, R.string.material_hour_selection);
        }

        @Override // com.google.android.material.timepicker.a, y0.C1597a
        public final void d(View view, C1638d c1638d) {
            super.d(view, c1638d);
            Resources resources = view.getResources();
            TimeModel timeModel = i.this.f10021b;
            c1638d.k(resources.getString(timeModel.f9968c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel.b())));
        }
    }

    /* compiled from: TimePickerClockPresenter.java */
    public class b extends com.google.android.material.timepicker.a {
        public b(Context context) {
            super(context, R.string.material_minute_selection);
        }

        @Override // com.google.android.material.timepicker.a, y0.C1597a
        public final void d(View view, C1638d c1638d) {
            super.d(view, c1638d);
            c1638d.k(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(i.this.f10021b.f9970e)));
        }
    }

    public i(TimePickerView timePickerView, TimeModel timeModel) {
        this.f10020a = timePickerView;
        this.f10021b = timeModel;
        if (timeModel.f9968c == 0) {
            timePickerView.f9977e.setVisibility(0);
        }
        timePickerView.f9975c.f9954j.add(this);
        timePickerView.f9979g = this;
        timePickerView.f9978f = this;
        timePickerView.f9975c.f9962r = this;
        String[] strArr = f10017f;
        for (int i = 0; i < 12; i++) {
            strArr[i] = TimeModel.a(this.f10020a.getResources(), strArr[i], "%d");
        }
        String[] strArr2 = f10019h;
        for (int i9 = 0; i9 < 12; i9++) {
            strArr2[i9] = TimeModel.a(this.f10020a.getResources(), strArr2[i9], "%02d");
        }
        invalidate();
    }

    @Override // com.google.android.material.timepicker.j
    public final void a() {
        this.f10020a.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public final void b(float f10, boolean z10) {
        if (this.f10024e) {
            return;
        }
        TimeModel timeModel = this.f10021b;
        int i = timeModel.f9969d;
        int i9 = timeModel.f9970e;
        int round = Math.round(f10);
        int i10 = timeModel.f9971f;
        TimePickerView timePickerView = this.f10020a;
        if (i10 == 12) {
            timeModel.d((round + 3) / 6);
            this.f10022c = (float) Math.floor(timeModel.f9970e * 6);
        } else {
            int i11 = (round + 15) / 30;
            if (timeModel.f9968c == 1) {
                i11 %= 12;
                if (timePickerView.f9976d.f9931d.f9965u == 2) {
                    i11 += 12;
                }
            }
            timeModel.c(i11);
            this.f10023d = (timeModel.b() * 30) % 360;
        }
        if (z10) {
            return;
        }
        f();
        if (timeModel.f9970e == i9 && timeModel.f9969d == i) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    public final void c(int i) {
        e(i, true);
    }

    @Override // com.google.android.material.timepicker.j
    public final void d() {
        this.f10020a.setVisibility(8);
    }

    public final void e(int i, boolean z10) {
        boolean z11 = i == 12;
        TimePickerView timePickerView = this.f10020a;
        timePickerView.f9975c.f9949d = z11;
        TimeModel timeModel = this.f10021b;
        timeModel.f9971f = i;
        int i9 = timeModel.f9968c;
        String[] strArr = z11 ? f10019h : i9 == 1 ? f10018g : f10017f;
        int i10 = z11 ? R.string.material_minute_suffix : i9 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        ClockFaceView clockFaceView = timePickerView.f9976d;
        clockFaceView.d(strArr, i10);
        int i11 = (timeModel.f9971f == 10 && i9 == 1 && timeModel.f9969d >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.f9931d;
        clockHandView.f9965u = i11;
        clockHandView.invalidate();
        timePickerView.f9975c.c(z11 ? this.f10022c : this.f10023d, z10);
        boolean z12 = i == 12;
        Chip chip = timePickerView.f9973a;
        chip.setChecked(z12);
        int i12 = z12 ? 2 : 0;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        chip.setAccessibilityLiveRegion(i12);
        boolean z13 = i == 10;
        Chip chip2 = timePickerView.f9974b;
        chip2.setChecked(z13);
        chip2.setAccessibilityLiveRegion(z13 ? 2 : 0);
        C1596C.o(chip2, new a(timePickerView.getContext()));
        C1596C.o(chip, new b(timePickerView.getContext()));
    }

    public final void f() {
        TimeModel timeModel = this.f10021b;
        int i = timeModel.f9972g;
        int b9 = timeModel.b();
        int i9 = timeModel.f9970e;
        TimePickerView timePickerView = this.f10020a;
        timePickerView.getClass();
        timePickerView.f9977e.b(i == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i9));
        String format2 = String.format(locale, "%02d", Integer.valueOf(b9));
        Chip chip = timePickerView.f9973a;
        if (!TextUtils.equals(chip.getText(), format)) {
            chip.setText(format);
        }
        Chip chip2 = timePickerView.f9974b;
        if (TextUtils.equals(chip2.getText(), format2)) {
            return;
        }
        chip2.setText(format2);
    }

    @Override // com.google.android.material.timepicker.j
    public final void invalidate() {
        TimeModel timeModel = this.f10021b;
        this.f10023d = (timeModel.b() * 30) % 360;
        this.f10022c = timeModel.f9970e * 6;
        e(timeModel.f9971f, false);
        f();
    }
}
