package com.sumsub.sns.presentation.screen.verification;

import android.content.DialogInterface;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f20181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.sumsub.sns.core.presentation.b f20182c;

    public /* synthetic */ d(com.sumsub.sns.core.presentation.b bVar, Map map, int i) {
        this.f20180a = i;
        this.f20182c = bVar;
        this.f20181b = map;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20180a) {
            case 0:
                a.a((a) this.f20182c, this.f20181b, dialogInterface);
                break;
            default:
                SNSVideoIdentFragment.m86showExitConfirmationState$lambda58$lambda57((SNSVideoIdentFragment) this.f20182c, this.f20181b, dialogInterface);
                break;
        }
    }
}
