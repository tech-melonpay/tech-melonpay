package com.sumsub.sns.internal.core.android;

import O9.p;
import android.app.Activity;
import android.content.DialogInterface;
import ca.InterfaceC0635a;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.common.i;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f15027a = new c();

    public final androidx.appcompat.app.b a(Activity activity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC0635a<p> interfaceC0635a, InterfaceC0635a<p> interfaceC0635a2) {
        return new SNSAlertDialogBuilder(activity).setMessage(charSequence).setNegativeButton(charSequence3, (DialogInterface.OnClickListener) new S1.c(2, interfaceC0635a)).setPositiveButton(charSequence2, (DialogInterface.OnClickListener) new com.sumsub.sns.presentation.screen.verification.c(2, interfaceC0635a2, activity)).setOnCancelListener((DialogInterface.OnCancelListener) new com.sumsub.sns.camera.video.presentation.c(interfaceC0635a, 1)).create();
    }

    public static final void a(InterfaceC0635a interfaceC0635a, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    public static final void a(InterfaceC0635a interfaceC0635a, Activity activity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        } else {
            i.a(activity);
        }
    }

    public static final void a(InterfaceC0635a interfaceC0635a, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }
}
