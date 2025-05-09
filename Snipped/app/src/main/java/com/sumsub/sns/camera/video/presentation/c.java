package com.sumsub.sns.camera.video.presentation;

import android.content.DialogInterface;
import ca.InterfaceC0635a;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14015b;

    public /* synthetic */ c(Object obj, int i) {
        this.f14014a = i;
        this.f14015b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f14014a) {
            case 0:
                a.a((a) this.f14015b, dialogInterface);
                break;
            case 1:
                com.sumsub.sns.internal.core.android.c.a((InterfaceC0635a) this.f14015b, dialogInterface);
                break;
            case 2:
                com.sumsub.sns.presentation.screen.verification.a.a((com.sumsub.sns.presentation.screen.verification.a) this.f14015b, dialogInterface);
                break;
            default:
                SNSVideoIdentFragment.m85showExitConfirmationState$lambda58$lambda56((SNSVideoIdentFragment) this.f14015b, dialogInterface);
                break;
        }
    }
}
