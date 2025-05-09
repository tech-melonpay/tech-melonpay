package com.sumsub.sns.presentation.screen.preview.ekyc;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f19966b;

    public /* synthetic */ b(a aVar, int i) {
        this.f19965a = i;
        this.f19966b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19965a) {
            case 0:
                a.a(this.f19966b, view);
                break;
            case 1:
                a.d(this.f19966b, view);
                break;
            case 2:
                a.e(this.f19966b, view);
                break;
            case 3:
                a.c(this.f19966b, view);
                break;
            default:
                a.b(this.f19966b, view);
                break;
        }
    }
}
