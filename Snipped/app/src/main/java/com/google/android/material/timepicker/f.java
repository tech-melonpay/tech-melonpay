package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t2.C1279a;
import y0.C1596C;
import y0.E;

/* compiled from: MaterialTimePicker.java */
/* loaded from: classes.dex */
public final class f extends DialogInterfaceOnCancelListenerC0530d implements TimePickerView.b {

    /* renamed from: j0, reason: collision with root package name */
    public TimePickerView f9993j0;

    /* renamed from: k0, reason: collision with root package name */
    public ViewStub f9994k0;

    /* renamed from: l0, reason: collision with root package name */
    public i f9995l0;

    /* renamed from: m0, reason: collision with root package name */
    public m f9996m0;

    /* renamed from: n0, reason: collision with root package name */
    public j f9997n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f9998o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f9999p0;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f10001r0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f10002t0;

    /* renamed from: v0, reason: collision with root package name */
    public CharSequence f10004v0;

    /* renamed from: w0, reason: collision with root package name */
    public MaterialButton f10005w0;

    /* renamed from: x0, reason: collision with root package name */
    public Button f10006x0;

    /* renamed from: z0, reason: collision with root package name */
    public TimeModel f10008z0;

    /* renamed from: f0, reason: collision with root package name */
    public final LinkedHashSet f9989f0 = new LinkedHashSet();

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f9990g0 = new LinkedHashSet();

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f9991h0 = new LinkedHashSet();

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f9992i0 = new LinkedHashSet();

    /* renamed from: q0, reason: collision with root package name */
    public int f10000q0 = 0;
    public int s0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public int f10003u0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f10007y0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f9988A0 = 0;

    /* compiled from: MaterialTimePicker.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = f.this;
            Iterator it = fVar.f9989f0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            fVar.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = f.this;
            Iterator it = fVar.f9990g0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            fVar.dismiss();
        }
    }

    /* compiled from: MaterialTimePicker.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = f.this;
            fVar.f10007y0 = fVar.f10007y0 == 0 ? 1 : 0;
            fVar.q0(fVar.f10005w0);
        }
    }

    /* compiled from: MaterialTimePicker.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public TimeModel f10012a = new TimeModel();

        public final void a(int i) {
            TimeModel timeModel = this.f10012a;
            timeModel.getClass();
            timeModel.f9972g = i >= 12 ? 1 : 0;
            timeModel.f9969d = i;
        }

        public final void b(int i) {
            this.f10012a.d(i);
        }

        public final void c() {
            TimeModel timeModel = this.f10012a;
            int i = timeModel.f9969d;
            int i9 = timeModel.f9970e;
            TimeModel timeModel2 = new TimeModel(1);
            this.f10012a = timeModel2;
            timeModel2.d(i9);
            TimeModel timeModel3 = this.f10012a;
            timeModel3.getClass();
            timeModel3.f9972g = i < 12 ? 0 : 1;
            timeModel3.f9969d = i;
        }
    }

    public final int o0() {
        return this.f10008z0.f9969d % 24;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f9991h0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f10008z0 = timeModel;
        if (timeModel == null) {
            this.f10008z0 = new TimeModel();
        }
        this.f10007y0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f10008z0.f9968c != 1 ? 0 : 1);
        this.f10000q0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f10001r0 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.s0 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f10002t0 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f10003u0 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f10004v0 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f9988A0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        int i = this.f9988A0;
        if (i == 0) {
            TypedValue a10 = P2.b.a(requireContext(), R.attr.materialTimePickerTheme);
            i = a10 == null ? 0 : a10.data;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        T2.f fVar = new T2.f(context, null, R.attr.materialTimePickerStyle, 2132083935);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1279a.f27471E, R.attr.materialTimePickerStyle, 2132083935);
        this.f9999p0 = obtainStyledAttributes.getResourceId(1, 0);
        this.f9998o0 = obtainStyledAttributes.getResourceId(2, 0);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        fVar.k(context);
        fVar.o(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(fVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        fVar.n(C1596C.d.e(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f9993j0 = timePickerView;
        timePickerView.f9980h = this;
        this.f9994k0 = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f10005w0 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.f10000q0;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f10001r0)) {
            textView.setText(this.f10001r0);
        }
        q0(this.f10005w0);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i9 = this.s0;
        if (i9 != 0) {
            button.setText(i9);
        } else if (!TextUtils.isEmpty(this.f10002t0)) {
            button.setText(this.f10002t0);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f10006x0 = button2;
        button2.setOnClickListener(new b());
        int i10 = this.f10003u0;
        if (i10 != 0) {
            this.f10006x0.setText(i10);
        } else if (!TextUtils.isEmpty(this.f10004v0)) {
            this.f10006x0.setText(this.f10004v0);
        }
        Button button3 = this.f10006x0;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.f10005w0.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f9997n0 = null;
        this.f9995l0 = null;
        this.f9996m0 = null;
        TimePickerView timePickerView = this.f9993j0;
        if (timePickerView != null) {
            timePickerView.f9980h = null;
            this.f9993j0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f9992i0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f10008z0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f10007y0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f10000q0);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f10001r0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.s0);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f10002t0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f10003u0);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f10004v0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f9988A0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f9997n0 instanceof m) {
            view.postDelayed(new e(this, 0), 100L);
        }
    }

    public final int p0() {
        return this.f10008z0.f9970e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(MaterialButton materialButton) {
        m mVar;
        Pair pair;
        if (materialButton == null || this.f9993j0 == null || this.f9994k0 == null) {
            return;
        }
        j jVar = this.f9997n0;
        if (jVar != null) {
            jVar.d();
        }
        int i = this.f10007y0;
        TimePickerView timePickerView = this.f9993j0;
        ViewStub viewStub = this.f9994k0;
        if (i == 0) {
            i iVar = this.f9995l0;
            i iVar2 = iVar;
            if (iVar == null) {
                iVar2 = new i(timePickerView, this.f10008z0);
            }
            this.f9995l0 = iVar2;
            mVar = iVar2;
        } else {
            if (this.f9996m0 == null) {
                this.f9996m0 = new m((LinearLayout) viewStub.inflate(), this.f10008z0);
            }
            m mVar2 = this.f9996m0;
            mVar2.f10037e.setChecked(false);
            mVar2.f10038f.setChecked(false);
            mVar = this.f9996m0;
        }
        this.f9997n0 = mVar;
        mVar.a();
        this.f9997n0.invalidate();
        int i9 = this.f10007y0;
        if (i9 == 0) {
            pair = new Pair(Integer.valueOf(this.f9998o0), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i9 != 1) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i9, "no icon for mode: "));
            }
            pair = new Pair(Integer.valueOf(this.f9999p0), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        Button button = this.f10006x0;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }
}
