package com.sumsub.sns.core.presentation.screen.verification;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f14325b;

    public /* synthetic */ c(a aVar, int i) {
        this.f14324a = i;
        this.f14325b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14324a) {
            case 0:
                a.b(this.f14325b, view);
                break;
            case 1:
                a.c(this.f14325b, view);
                break;
            default:
                a.a(this.f14325b, view);
                break;
        }
    }
}
