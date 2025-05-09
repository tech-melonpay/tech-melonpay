package E0;

import E0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.C1597a;
import y0.E;
import z0.C1638d;
import z0.C1639e;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends C1597a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f999n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final C0011a f1000o = new C0011a();

    /* renamed from: p, reason: collision with root package name */
    public static final b f1001p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1006h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public c f1007j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1002d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1003e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1004f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1005g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1008k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1009l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1010m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: E0.a$a, reason: collision with other inner class name */
    public class C0011a implements b.a<C1638d> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    public class b {
    }

    /* compiled from: ExploreByTouchHelper.java */
    public class c extends C1639e {
        public c() {
        }

        @Override // z0.C1639e
        public final C1638d b(int i) {
            return new C1638d(AccessibilityNodeInfo.obtain(a.this.n(i).f31219a));
        }

        @Override // z0.C1639e
        public final C1638d c(int i) {
            a aVar = a.this;
            int i9 = i == 2 ? aVar.f1008k : aVar.f1009l;
            if (i9 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i9);
        }

        @Override // z0.C1639e
        public final boolean d(int i, int i9, Bundle bundle) {
            int i10;
            a aVar = a.this;
            View view = aVar.i;
            if (i == -1) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                return view.performAccessibilityAction(i9, bundle);
            }
            boolean z10 = true;
            if (i9 == 1) {
                return aVar.p(i);
            }
            if (i9 == 2) {
                return aVar.j(i);
            }
            boolean z11 = false;
            if (i9 == 64) {
                AccessibilityManager accessibilityManager = aVar.f1006h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i10 = aVar.f1008k) != i) {
                    if (i10 != Integer.MIN_VALUE) {
                        aVar.f1008k = Integer.MIN_VALUE;
                        aVar.i.invalidate();
                        aVar.q(i10, 65536);
                    }
                    aVar.f1008k = i;
                    view.invalidate();
                    aVar.q(i, 32768);
                }
                z10 = false;
            } else {
                if (i9 != 128) {
                    Chip.b bVar = (Chip.b) aVar;
                    if (i9 != 16) {
                        return false;
                    }
                    Chip chip = Chip.this;
                    if (i == 0) {
                        return chip.performClick();
                    }
                    if (i != 1) {
                        return false;
                    }
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f9293h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z11 = true;
                    }
                    if (!chip.f9303s) {
                        return z11;
                    }
                    chip.f9302r.q(1, 1);
                    return z11;
                }
                if (aVar.f1008k == i) {
                    aVar.f1008k = Integer.MIN_VALUE;
                    view.invalidate();
                    aVar.q(i, 65536);
                }
                z10 = false;
            }
            return z10;
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.f1006h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // y0.C1597a
    public final C1639e b(View view) {
        if (this.f1007j == null) {
            this.f1007j = new c();
        }
        return this.f1007j;
    }

    @Override // y0.C1597a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // y0.C1597a
    public final void d(View view, C1638d c1638d) {
        View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        accessibilityNodeInfo.setCheckable(chip.e());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1638d.h(chip.getAccessibilityClassName());
        c1638d.m(chip.getText());
    }

    public final boolean j(int i) {
        if (this.f1009l != i) {
            return false;
        }
        this.f1009l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f9297m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final C1638d k(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C1638d c1638d = new C1638d(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c1638d.h("android.view.View");
        Rect rect = f999n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        c1638d.f31220b = -1;
        View view = this.i;
        obtain.setParent(view);
        o(i, c1638d);
        if (c1638d.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f1003e;
        c1638d.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        c1638d.f31221c = i;
        obtain.setSource(view, i);
        if (this.f1008k == i) {
            obtain.setAccessibilityFocused(true);
            c1638d.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            c1638d.a(64);
        }
        boolean z10 = this.f1009l == i;
        if (z10) {
            c1638d.a(2);
        } else if (obtain.isFocusable()) {
            c1638d.a(1);
        }
        obtain.setFocused(z10);
        int[] iArr = this.f1005g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f1002d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1638d.f(rect3);
            if (c1638d.f31220b != -1) {
                C1638d c1638d2 = new C1638d(AccessibilityNodeInfo.obtain());
                for (int i9 = c1638d.f31220b; i9 != -1; i9 = c1638d2.f31220b) {
                    c1638d2.f31220b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c1638d2.f31219a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i9, c1638d2);
                    c1638d2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f1004f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1638d.f31219a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c1638d;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.m(int, android.graphics.Rect):boolean");
    }

    public final C1638d n(int i) {
        if (i != -1) {
            return k(i);
        }
        View view = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        C1638d c1638d = new C1638d(obtain);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            c1638d.f31219a.addChild(view, ((Integer) arrayList.get(i9)).intValue());
        }
        return c1638d;
    }

    public abstract void o(int i, C1638d c1638d);

    public final boolean p(int i) {
        int i9;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i9 = this.f1009l) == i) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            j(i9);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f1009l = i;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f9297m = true;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i9) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f1006h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i9);
            C1638d n10 = n(i);
            obtain.getText().add(n10.g());
            AccessibilityNodeInfo accessibilityNodeInfo = n10.f31219a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i9);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
