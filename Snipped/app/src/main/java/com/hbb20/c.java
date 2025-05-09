package com.hbb20;

import android.content.DialogInterface;

/* compiled from: CountryCodeDialog.java */
/* loaded from: classes.dex */
public final class c implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f10628a;

    public c(CountryCodePicker countryCodePicker) {
        this.f10628a = countryCodePicker;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        e.a(e.f10634e);
        this.f10628a.getDialogEventsListener();
    }
}
