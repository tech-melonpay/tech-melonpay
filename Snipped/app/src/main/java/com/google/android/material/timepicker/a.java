package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import y0.C1597a;
import z0.C1638d;

/* compiled from: ClickActionDelegate.java */
/* loaded from: classes.dex */
public class a extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final C1638d.a f9982d;

    public a(Context context, int i) {
        this.f9982d = new C1638d.a(16, context.getString(i));
    }

    @Override // y0.C1597a
    public void d(View view, C1638d c1638d) {
        this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
        c1638d.b(this.f9982d);
    }
}
