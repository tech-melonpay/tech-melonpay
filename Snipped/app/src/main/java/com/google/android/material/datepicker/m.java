package com.google.android.material.datepicker;

import android.view.View;
import y0.J;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes.dex */
public final class m implements y0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9484c;

    public m(View view, int i, int i9) {
        this.f9482a = i;
        this.f9483b = view;
        this.f9484c = i9;
    }

    @Override // y0.p
    public final J c(View view, J j10) {
        int i = j10.f31013a.f(7).f24067b;
        int i9 = this.f9482a;
        View view2 = this.f9483b;
        if (i9 >= 0) {
            view2.getLayoutParams().height = i9 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f9484c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return j10;
    }
}
