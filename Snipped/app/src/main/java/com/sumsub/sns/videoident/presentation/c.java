package com.sumsub.sns.videoident.presentation;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SNSVideoIdentFragment f20341b;

    public /* synthetic */ c(SNSVideoIdentFragment sNSVideoIdentFragment, int i) {
        this.f20340a = i;
        this.f20341b = sNSVideoIdentFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20340a) {
            case 0:
                this.f20341b.switchCameraAndUpdateMirroring();
                break;
            case 1:
                SNSVideoIdentFragment.m78handleState$lambda46$lambda45(this.f20341b, view);
                break;
            case 2:
                SNSVideoIdentFragment.m79handleState$lambda48$lambda47(this.f20341b, view);
                break;
            default:
                SNSVideoIdentFragment.m91updateLanguageSection$lambda53(this.f20341b, view);
                break;
        }
    }
}
