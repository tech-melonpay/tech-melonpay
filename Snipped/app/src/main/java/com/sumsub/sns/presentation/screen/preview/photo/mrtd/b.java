package com.sumsub.sns.presentation.screen.preview.photo.mrtd;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20126b;

    public /* synthetic */ b(a aVar, int i) {
        this.f20125a = i;
        this.f20126b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20125a) {
            case 0:
                a.c(this.f20126b, view);
                break;
            case 1:
                a.d(this.f20126b, view);
                break;
            case 2:
                a.a(this.f20126b, view);
                break;
            default:
                a.b(this.f20126b, view);
                break;
        }
    }
}
