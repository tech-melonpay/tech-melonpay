package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f9879b;

    public c(TabLayout.i iVar, View view) {
        this.f9879b = iVar;
        this.f9878a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        View view2 = this.f9878a;
        if (view2.getVisibility() == 0) {
            this.f9879b.c(view2);
        }
    }
}
