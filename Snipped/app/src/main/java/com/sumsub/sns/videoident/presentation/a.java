package com.sumsub.sns.videoident.presentation;

import android.os.Bundle;
import androidx.fragment.app.s;
import e.InterfaceC0702a;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements s, InterfaceC0702a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SNSVideoIdentFragment f20337b;

    public /* synthetic */ a(SNSVideoIdentFragment sNSVideoIdentFragment, int i) {
        this.f20336a = i;
        this.f20337b = sNSVideoIdentFragment;
    }

    @Override // e.InterfaceC0702a
    public void a(Object obj) {
        this.f20337b.handlePermissionResults((Map) obj);
    }

    @Override // androidx.fragment.app.s
    public void b(String str, Bundle bundle) {
        switch (this.f20336a) {
            case 0:
                SNSVideoIdentFragment.m88showPhoneVerificationFragment$lambda23(this.f20337b, str, bundle);
                break;
            default:
                this.f20337b.handleLanguageSelectionResult(bundle);
                break;
        }
    }
}
