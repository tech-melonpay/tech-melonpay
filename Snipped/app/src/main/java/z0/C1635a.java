package z0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f31215a;

    /* renamed from: b, reason: collision with root package name */
    public final C1638d f31216b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31217c;

    public C1635a(int i, C1638d c1638d, int i9) {
        this.f31215a = i;
        this.f31216b = c1638d;
        this.f31217c = i9;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f31215a);
        this.f31216b.f31219a.performAction(this.f31217c, bundle);
    }
}
