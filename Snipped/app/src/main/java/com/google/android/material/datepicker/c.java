package com.google.android.material.datepicker;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9429b;

    public /* synthetic */ c(int i, View view) {
        this.f9428a = i;
        this.f9429b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9428a) {
            case 0:
                View view = this.f9429b;
                view.requestFocus();
                view.post(new F.b(view));
                break;
            case 1:
                com.sumsub.sns.internal.core.common.i.d(this.f9429b);
                break;
            case 2:
                com.sumsub.sns.internal.core.common.i.f(this.f9429b);
                break;
            case 3:
                com.sumsub.sns.internal.core.common.i.h(this.f9429b);
                break;
            default:
                View view2 = this.f9429b;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                break;
        }
    }
}
