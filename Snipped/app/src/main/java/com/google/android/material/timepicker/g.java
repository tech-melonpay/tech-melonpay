package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: MaxInputValidator.java */
/* loaded from: classes.dex */
public final class g implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final int f10013a;

    public g(int i) {
        this.f10013a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i9, Spanned spanned, int i10, int i11) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i10, i11, charSequence.subSequence(i, i9).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f10013a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
