package com.sumsub.sns.core.widget;

import android.view.View;
import com.sumsub.sns.core.widget.autocompletePhone.PhoneNumberKitV2;
import java.util.Calendar;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14377c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14378d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.f14375a = i;
        this.f14376b = obj;
        this.f14377c = obj2;
        this.f14378d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14375a) {
            case 0:
                SNSDateTimeInputLayout.m47showTime$lambda8((Calendar) this.f14376b, (com.google.android.material.timepicker.f) this.f14377c, (SNSDateTimeInputLayout) this.f14378d, view);
                break;
            default:
                PhoneNumberKitV2.m70_init_$lambda12((List) this.f14376b, (List) this.f14377c, (PhoneNumberKitV2) this.f14378d, view);
                break;
        }
    }
}
