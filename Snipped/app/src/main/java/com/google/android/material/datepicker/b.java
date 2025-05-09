package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.luminary.mobile.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import t.U;

/* compiled from: DateFormatTextWatcher.java */
/* loaded from: classes.dex */
public abstract class b extends J2.h {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f9420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9421b;

    /* renamed from: c, reason: collision with root package name */
    public final DateFormat f9422c;

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f9423d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9424e;

    /* renamed from: f, reason: collision with root package name */
    public final B6.d f9425f;

    /* renamed from: g, reason: collision with root package name */
    public U f9426g;

    /* renamed from: h, reason: collision with root package name */
    public int f9427h = 0;

    public b(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f9421b = str;
        this.f9422c = simpleDateFormat;
        this.f9420a = textInputLayout;
        this.f9423d = calendarConstraints;
        this.f9424e = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f9425f = new B6.d(29, this, str);
    }

    public abstract void a();

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f9421b;
        if (length >= str.length() || editable.length() < this.f9427h) {
            return;
        }
        char charAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(charAt)) {
            return;
        }
        editable.append(charAt);
    }

    public abstract void b(Long l10);

    @Override // J2.h, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        this.f9427h = charSequence.length();
    }

    @Override // J2.h, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
        CalendarConstraints calendarConstraints = this.f9423d;
        TextInputLayout textInputLayout = this.f9420a;
        B6.d dVar = this.f9425f;
        textInputLayout.removeCallbacks(dVar);
        textInputLayout.removeCallbacks(this.f9426g);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f9421b.length()) {
            return;
        }
        try {
            Date parse = this.f9422c.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = parse.getTime();
            if (calendarConstraints.f9367c.P(time)) {
                Calendar c2 = y.c(calendarConstraints.f9365a.f9401a);
                c2.set(5, 1);
                if (c2.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f9366b;
                    int i11 = month.f9405e;
                    Calendar c10 = y.c(month.f9401a);
                    c10.set(5, i11);
                    if (time <= c10.getTimeInMillis()) {
                        b(Long.valueOf(parse.getTime()));
                        return;
                    }
                }
            }
            U u6 = new U(time, 4, this);
            this.f9426g = u6;
            textInputLayout.post(u6);
        } catch (ParseException unused) {
            textInputLayout.post(dVar);
        }
    }
}
