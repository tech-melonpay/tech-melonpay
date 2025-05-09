package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.C1597a;
import z0.C1638d;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes.dex */
public final class c extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f9173d;

    public c(e eVar) {
        this.f9173d = eVar;
    }

    @Override // y0.C1597a
    public final void d(View view, C1638d c1638d) {
        View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (!this.f9173d.f9177j) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            c1638d.a(PKIFailureInfo.badCertTemplate);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // y0.C1597a
    public final boolean g(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            e eVar = this.f9173d;
            if (eVar.f9177j) {
                eVar.cancel();
                return true;
            }
        }
        return super.g(view, i, bundle);
    }
}
