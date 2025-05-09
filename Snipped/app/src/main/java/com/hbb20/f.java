package com.hbb20;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: CountryCodePicker.java */
/* loaded from: classes.dex */
public final class f implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f10635a;

    public f(CountryCodePicker countryCodePicker) {
        this.f10635a = countryCodePicker;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = CountryCodePicker.f10528F0;
        this.f10635a.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i9, int i10) {
    }
}
