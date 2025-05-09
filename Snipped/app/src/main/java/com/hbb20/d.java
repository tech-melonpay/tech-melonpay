package com.hbb20;

import android.content.DialogInterface;

/* compiled from: CountryCodeDialog.java */
/* loaded from: classes.dex */
public final class d implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f10629a;

    public d(CountryCodePicker countryCodePicker) {
        this.f10629a = countryCodePicker;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        e.a(e.f10634e);
        this.f10629a.getDialogEventsListener();
    }
}
