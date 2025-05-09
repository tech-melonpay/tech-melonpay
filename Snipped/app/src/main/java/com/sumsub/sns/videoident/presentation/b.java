package com.sumsub.sns.videoident.presentation;

import android.content.DialogInterface;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20339b;

    public /* synthetic */ b(Object obj, int i) {
        this.f20338a = i;
        this.f20339b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f20338a) {
            case 0:
                ((SNSVideoIdentFragment) this.f20339b).lackOfPermissionDialog = null;
                break;
            case 1:
                ((SNSVideoIdentFragment) this.f20339b).lackOfPermissionDialog = null;
                break;
            default:
                SNSApplicantDataSelectionFieldView.m69showDialog$lambda4((SNSApplicantDataSelectionFieldView) this.f20339b, dialogInterface);
                break;
        }
    }
}
