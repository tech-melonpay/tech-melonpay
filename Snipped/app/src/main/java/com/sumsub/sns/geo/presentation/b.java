package com.sumsub.sns.geo.presentation;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f14421b;

    public /* synthetic */ b(a aVar, int i) {
        this.f14420a = i;
        this.f14421b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14420a) {
            case 0:
                a.c(this.f14421b, view);
                break;
            case 1:
                a.d(this.f14421b, view);
                break;
            case 2:
                a.e(this.f14421b, view);
                break;
            case 3:
                a.a(this.f14421b, view);
                break;
            case 4:
                a.b(this.f14421b, view);
                break;
            case 5:
                a.f(this.f14421b, view);
                break;
            default:
                a.g(this.f14421b, view);
                break;
        }
    }
}
