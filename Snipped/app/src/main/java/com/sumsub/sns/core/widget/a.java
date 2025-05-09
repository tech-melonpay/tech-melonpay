package com.sumsub.sns.core.widget;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f14359c;

    public /* synthetic */ a(boolean z10, CoordinatorLayout coordinatorLayout, int i) {
        this.f14357a = i;
        this.f14358b = z10;
        this.f14359c = coordinatorLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14357a) {
            case 0:
                SNSCommonBottomSheetView.m39_set_dismissOnTouchOutside_$lambda0(this.f14358b, (SNSCommonBottomSheetView) this.f14359c, view);
                break;
            default:
                SNSErrorBottomSheetView.m48_set_dismissOnTouchOutside_$lambda0(this.f14358b, (SNSErrorBottomSheetView) this.f14359c, view);
                break;
        }
    }
}
