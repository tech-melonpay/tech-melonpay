package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import y0.C1597a;
import z0.C1638d;

/* compiled from: CheckableImageButton.java */
/* loaded from: classes.dex */
public class a extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f9622d;

    public a(CheckableImageButton checkableImageButton) {
        this.f9622d = checkableImageButton;
    }

    @Override // y0.C1597a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f9622d.f9593a);
    }

    @Override // y0.C1597a
    public final void d(View view, C1638d c1638d) {
        View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f9622d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f9594b);
        accessibilityNodeInfo.setChecked(checkableImageButton.f9593a);
    }
}
