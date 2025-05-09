package com.google.android.material.datepicker;

import com.google.android.material.datepicker.o;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* compiled from: RangeDateSelector.java */
/* loaded from: classes.dex */
public final class u extends b {
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f9507j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f9508k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f9509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f9510m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, o.a aVar, int i) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.i = i;
        this.f9510m = rangeDateSelector;
        this.f9507j = textInputLayout2;
        this.f9508k = textInputLayout3;
        this.f9509l = aVar;
    }

    @Override // com.google.android.material.datepicker.b
    public final void a() {
        switch (this.i) {
            case 0:
                RangeDateSelector rangeDateSelector = this.f9510m;
                rangeDateSelector.f9411d = null;
                RangeDateSelector.a(rangeDateSelector, this.f9507j, this.f9508k, this.f9509l);
                break;
            default:
                RangeDateSelector rangeDateSelector2 = this.f9510m;
                rangeDateSelector2.f9412e = null;
                RangeDateSelector.a(rangeDateSelector2, this.f9507j, this.f9508k, this.f9509l);
                break;
        }
    }

    @Override // com.google.android.material.datepicker.b
    public final void b(Long l10) {
        switch (this.i) {
            case 0:
                RangeDateSelector rangeDateSelector = this.f9510m;
                rangeDateSelector.f9411d = l10;
                RangeDateSelector.a(rangeDateSelector, this.f9507j, this.f9508k, this.f9509l);
                break;
            default:
                RangeDateSelector rangeDateSelector2 = this.f9510m;
                rangeDateSelector2.f9412e = l10;
                RangeDateSelector.a(rangeDateSelector2, this.f9507j, this.f9508k, this.f9509l);
                break;
        }
    }
}
