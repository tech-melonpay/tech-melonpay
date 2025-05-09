package z0;

import X2.h;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: AccessibilityManagerCompat.java */
/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1636b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final A0.b f31218a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC1636b(A0.b bVar) {
        this.f31218a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1636b) {
            return this.f31218a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1636b) obj).f31218a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31218a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        h hVar = (h) this.f31218a.f14b;
        AutoCompleteTextView autoCompleteTextView = hVar.f3969h;
        if (autoCompleteTextView == null || U4.b.q(autoCompleteTextView)) {
            return;
        }
        int i = z10 ? 2 : 1;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        hVar.f3982d.setImportantForAccessibility(i);
    }
}
