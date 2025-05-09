package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimePickerView;
import com.luminary.mobile.R;
import java.util.Arrays;
import java.util.Locale;
import k0.C0913a;
import y0.C1596C;
import z0.C1638d;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: classes.dex */
public final class m implements TimePickerView.d, j {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f10033a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeModel f10034b;

    /* renamed from: c, reason: collision with root package name */
    public final a f10035c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10036d;

    /* renamed from: e, reason: collision with root package name */
    public final ChipTextInputComboView f10037e;

    /* renamed from: f, reason: collision with root package name */
    public final ChipTextInputComboView f10038f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f10039g;

    /* renamed from: h, reason: collision with root package name */
    public final EditText f10040h;
    public final MaterialButtonToggleGroup i;

    /* compiled from: TimePickerTextInputPresenter.java */
    public class a extends J2.h {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                boolean isEmpty = TextUtils.isEmpty(editable);
                m mVar = m.this;
                if (isEmpty) {
                    mVar.f10034b.d(0);
                } else {
                    mVar.f10034b.d(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class b extends J2.h {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                boolean isEmpty = TextUtils.isEmpty(editable);
                m mVar = m.this;
                if (isEmpty) {
                    mVar.f10034b.c(0);
                } else {
                    mVar.f10034b.c(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            m.this.c(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class d extends com.google.android.material.timepicker.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TimeModel f10044e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, TimeModel timeModel) {
            super(context, R.string.material_hour_selection);
            this.f10044e = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, y0.C1597a
        public final void d(View view, C1638d c1638d) {
            super.d(view, c1638d);
            Resources resources = view.getResources();
            TimeModel timeModel = this.f10044e;
            c1638d.k(resources.getString(timeModel.f9968c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel.b())));
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    public class e extends com.google.android.material.timepicker.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TimeModel f10045e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, TimeModel timeModel) {
            super(context, R.string.material_minute_selection);
            this.f10045e = timeModel;
        }

        @Override // com.google.android.material.timepicker.a, y0.C1597a
        public final void d(View view, C1638d c1638d) {
            super.d(view, c1638d);
            c1638d.k(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f10045e.f9970e)));
        }
    }

    public m(LinearLayout linearLayout, TimeModel timeModel) {
        a aVar = new a();
        this.f10035c = aVar;
        b bVar = new b();
        this.f10036d = bVar;
        this.f10033a = linearLayout;
        this.f10034b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f10037e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f10038f = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.f9968c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.i = materialButtonToggleGroup;
            materialButtonToggleGroup.f9198c.add(new l(this, 0));
            this.i.setVisibility(0);
            f();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        EditText editText = chipTextInputComboView2.f9928c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = timeModel.f9967b;
        editText.setFilters(inputFilterArr);
        EditText editText2 = chipTextInputComboView.f9928c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = timeModel.f9966a;
        editText2.setFilters(inputFilterArr2);
        TextInputLayout textInputLayout = chipTextInputComboView2.f9927b;
        EditText editText3 = textInputLayout.getEditText();
        this.f10039g = editText3;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f9927b;
        EditText editText4 = textInputLayout2.getEditText();
        this.f10040h = editText4;
        k kVar = new k(chipTextInputComboView2, chipTextInputComboView, timeModel);
        C1596C.o(chipTextInputComboView2.f9926a, new d(linearLayout.getContext(), timeModel));
        C1596C.o(chipTextInputComboView.f9926a, new e(linearLayout.getContext(), timeModel));
        editText3.addTextChangedListener(bVar);
        editText4.addTextChangedListener(aVar);
        e(timeModel);
        EditText editText5 = textInputLayout.getEditText();
        EditText editText6 = textInputLayout2.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(kVar);
        editText5.setOnKeyListener(kVar);
        editText6.setOnKeyListener(kVar);
    }

    @Override // com.google.android.material.timepicker.j
    public final void a() {
        this.f10033a.setVisibility(0);
        c(this.f10034b.f9971f);
    }

    public final void b() {
        TimeModel timeModel = this.f10034b;
        this.f10037e.setChecked(timeModel.f9971f == 12);
        this.f10038f.setChecked(timeModel.f9971f == 10);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.d
    public final void c(int i) {
        this.f10034b.f9971f = i;
        this.f10037e.setChecked(i == 12);
        this.f10038f.setChecked(i == 10);
        f();
    }

    @Override // com.google.android.material.timepicker.j
    public final void d() {
        InputMethodManager inputMethodManager;
        LinearLayout linearLayout = this.f10033a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null && (inputMethodManager = (InputMethodManager) C0913a.getSystemService(focusedChild.getContext(), InputMethodManager.class)) != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        linearLayout.setVisibility(8);
    }

    public final void e(TimeModel timeModel) {
        EditText editText = this.f10039g;
        b bVar = this.f10036d;
        editText.removeTextChangedListener(bVar);
        EditText editText2 = this.f10040h;
        a aVar = this.f10035c;
        editText2.removeTextChangedListener(aVar);
        Locale locale = this.f10033a.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(timeModel.f9970e));
        String format2 = String.format(locale, "%02d", Integer.valueOf(timeModel.b()));
        ChipTextInputComboView chipTextInputComboView = this.f10037e;
        String a10 = TimeModel.a(chipTextInputComboView.getResources(), format, "%02d");
        chipTextInputComboView.f9926a.setText(a10);
        if (!TextUtils.isEmpty(a10)) {
            ChipTextInputComboView.a aVar2 = chipTextInputComboView.f9929d;
            EditText editText3 = chipTextInputComboView.f9928c;
            editText3.removeTextChangedListener(aVar2);
            editText3.setText(a10);
            editText3.addTextChangedListener(aVar2);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f10038f;
        String a11 = TimeModel.a(chipTextInputComboView2.getResources(), format2, "%02d");
        chipTextInputComboView2.f9926a.setText(a11);
        if (!TextUtils.isEmpty(a11)) {
            ChipTextInputComboView.a aVar3 = chipTextInputComboView2.f9929d;
            EditText editText4 = chipTextInputComboView2.f9928c;
            editText4.removeTextChangedListener(aVar3);
            editText4.setText(a11);
            editText4.addTextChangedListener(aVar3);
        }
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(aVar);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.i;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.b(this.f10034b.f9972g == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // com.google.android.material.timepicker.j
    public final void invalidate() {
        e(this.f10034b);
    }
}
