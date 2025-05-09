package com.sumsub.sns.camera;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13859b;

    public /* synthetic */ c(a aVar, int i) {
        this.f13858a = i;
        this.f13859b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13858a) {
            case 0:
                a.b(this.f13859b, view);
                break;
            case 1:
                a.c(this.f13859b, view);
                break;
            default:
                a.a(this.f13859b, view);
                break;
        }
    }
}
