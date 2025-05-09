package z0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1639e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31235a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: z0.e$a */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final C1639e f31236a;

        public a(C1639e c1639e) {
            this.f31236a = c1639e;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1638d b9 = this.f31236a.b(i);
            if (b9 == null) {
                return null;
            }
            return b9.f31219a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f31236a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            C1638d c2 = this.f31236a.c(i);
            if (c2 == null) {
                return null;
            }
            return c2.f31219a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i9, Bundle bundle) {
            return this.f31236a.d(i, i9, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: z0.e$b */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f31236a.a(i, new C1638d(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1639e() {
        this.f31235a = new b(this);
    }

    public C1638d b(int i) {
        return null;
    }

    public C1638d c(int i) {
        return null;
    }

    public boolean d(int i, int i9, Bundle bundle) {
        return false;
    }

    public C1639e(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f31235a = accessibilityNodeProvider;
    }

    public void a(int i, C1638d c1638d, String str, Bundle bundle) {
    }
}
