package com.sumsub.sns.camera;

import android.content.DialogInterface;
import com.sumsub.sns.camera.b;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataSelectionFieldView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13861b;

    public /* synthetic */ d(Object obj, int i) {
        this.f13860a = i;
        this.f13861b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f13860a) {
            case 0:
                b.d.a((b) this.f13861b, dialogInterface, i);
                break;
            default:
                SNSApplicantDataSelectionFieldView.m68showDialog$lambda3((SNSApplicantDataSelectionFieldView) this.f13861b, dialogInterface, i);
                break;
        }
    }
}
