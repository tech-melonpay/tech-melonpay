package com.google.android.material.datepicker;

import com.google.android.material.datepicker.o;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* compiled from: SingleDateSelector.java */
/* loaded from: classes.dex */
public final class v extends b {
    public final /* synthetic */ s i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f9511j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f9512k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, o.a aVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f9512k = singleDateSelector;
        this.i = aVar;
        this.f9511j = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.b
    public final void a() {
        this.f9511j.getError();
        this.f9512k.getClass();
        this.i.a();
    }

    @Override // com.google.android.material.datepicker.b
    public final void b(Long l10) {
        SingleDateSelector singleDateSelector = this.f9512k;
        if (l10 == null) {
            singleDateSelector.f9413a = null;
        } else {
            singleDateSelector.f9413a = l10;
        }
        singleDateSelector.getClass();
        this.i.b(singleDateSelector.f9413a);
    }
}
