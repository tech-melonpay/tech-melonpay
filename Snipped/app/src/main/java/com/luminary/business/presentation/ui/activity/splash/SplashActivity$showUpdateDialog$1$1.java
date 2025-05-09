package com.luminary.business.presentation.ui.activity.splash;

import D8.a;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;
import com.luminary.mobile.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SplashActivity.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class SplashActivity$showUpdateDialog$1$1 extends FunctionReferenceImpl implements InterfaceC0635a<p> {
    @Override // ca.InterfaceC0635a
    public final p invoke() {
        SplashActivity splashActivity = (SplashActivity) this.receiver;
        int i = SplashActivity.f11443r;
        splashActivity.getClass();
        BottomDialogType.f13289k.getClass();
        BottomDialogType b9 = BottomDialogType.a.b();
        b9.f13295a = splashActivity.getString(R.string.please_update_through_google_play);
        a.C0010a.a((D8.a) splashActivity.f11450j.getValue(), b9, null, 6);
        return p.f3034a;
    }
}
