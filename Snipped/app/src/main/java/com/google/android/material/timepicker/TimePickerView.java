package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.luminary.mobile.R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Chip f9973a;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f9974b;

    /* renamed from: c, reason: collision with root package name */
    public final ClockHandView f9975c;

    /* renamed from: d, reason: collision with root package name */
    public final ClockFaceView f9976d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButtonToggleGroup f9977e;

    /* renamed from: f, reason: collision with root package name */
    public c f9978f;

    /* renamed from: g, reason: collision with root package name */
    public d f9979g;

    /* renamed from: h, reason: collision with root package name */
    public b f9980h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = TimePickerView.this.f9979g;
            if (dVar != null) {
                dVar.c(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
        void c(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f9976d = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f9977e = materialButtonToggleGroup;
        materialButtonToggleGroup.f9198c.add(new l(this, 1));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f9973a = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f9974b = chip2;
        this.f9975c = (ClockHandView) findViewById(R.id.material_clock_hand);
        o oVar = new o(new GestureDetector(getContext(), new n(this)));
        chip.setOnTouchListener(oVar);
        chip2.setOnTouchListener(oVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i9) {
        super.onVisibilityChanged(view, i9);
        if (view == this && i9 == 0) {
            this.f9974b.sendAccessibilityEvent(8);
        }
    }
}
