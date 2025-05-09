package com.sumsub.sns.core.widget.applicantData;

import android.widget.CompoundButton;
import ca.InterfaceC0646l;
import com.sumsub.sns.internal.presentation.consent.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14362c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f14360a = i;
        this.f14361b = obj;
        this.f14362c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f14360a) {
            case 0:
                SNSApplicantDataBoolFieldView.m59_set_onCheckedChanged_$lambda0((SNSApplicantDataBoolFieldView) this.f14361b, (InterfaceC0646l) this.f14362c, compoundButton, z10);
                break;
            default:
                com.sumsub.sns.presentation.consent.a.a((com.sumsub.sns.presentation.consent.a) this.f14361b, (a.b) this.f14362c, compoundButton, z10);
                break;
        }
    }
}
