package com.sumsub.sns.presentation.screen.verification;

import android.content.DialogInterface;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f20184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.sumsub.sns.core.presentation.b f20185c;

    public /* synthetic */ e(com.sumsub.sns.core.presentation.b bVar, Map map, int i) {
        this.f20183a = i;
        this.f20185c = bVar;
        this.f20184b = map;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f20183a) {
            case 0:
                a.b((a) this.f20185c, this.f20184b, dialogInterface);
                break;
            default:
                SNSVideoIdentFragment.m87showExitConfirmationState$lambda60$lambda59((SNSVideoIdentFragment) this.f20185c, this.f20184b, dialogInterface);
                break;
        }
    }
}
