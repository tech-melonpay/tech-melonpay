package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import y0.C1597a;
import z0.C1638d;
import z0.C1639e;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public final class J extends C1597a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f7429d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7430e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends C1597a {

        /* renamed from: d, reason: collision with root package name */
        public final J f7431d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f7432e = new WeakHashMap();

        public a(J j10) {
            this.f7431d = j10;
        }

        @Override // y0.C1597a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C1597a c1597a = (C1597a) this.f7432e.get(view);
            return c1597a != null ? c1597a.a(view, accessibilityEvent) : this.f31046a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // y0.C1597a
        public final C1639e b(View view) {
            C1597a c1597a = (C1597a) this.f7432e.get(view);
            return c1597a != null ? c1597a.b(view) : super.b(view);
        }

        @Override // y0.C1597a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            C1597a c1597a = (C1597a) this.f7432e.get(view);
            if (c1597a != null) {
                c1597a.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // y0.C1597a
        public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C1638d c1638d) {
            J j10 = this.f7431d;
            boolean hasPendingAdapterUpdates = j10.f7429d.hasPendingAdapterUpdates();
            View.AccessibilityDelegate accessibilityDelegate = this.f31046a;
            AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
            if (!hasPendingAdapterUpdates) {
                RecyclerView recyclerView = j10.f7429d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c1638d);
                    C1597a c1597a = (C1597a) this.f7432e.get(view);
                    if (c1597a != null) {
                        c1597a.d(view, c1638d);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // y0.C1597a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            C1597a c1597a = (C1597a) this.f7432e.get(view);
            if (c1597a != null) {
                c1597a.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // y0.C1597a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1597a c1597a = (C1597a) this.f7432e.get(viewGroup);
            return c1597a != null ? c1597a.f(viewGroup, view, accessibilityEvent) : this.f31046a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // y0.C1597a
        public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            J j10 = this.f7431d;
            if (!j10.f7429d.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = j10.f7429d;
                if (recyclerView.getLayoutManager() != null) {
                    C1597a c1597a = (C1597a) this.f7432e.get(view);
                    if (c1597a != null) {
                        if (c1597a.g(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i, bundle)) {
                        return true;
                    }
                    return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
                }
            }
            return super.g(view, i, bundle);
        }

        @Override // y0.C1597a
        public final void h(View view, int i) {
            C1597a c1597a = (C1597a) this.f7432e.get(view);
            if (c1597a != null) {
                c1597a.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // y0.C1597a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            C1597a c1597a = (C1597a) this.f7432e.get(view);
            if (c1597a != null) {
                c1597a.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public J(RecyclerView recyclerView) {
        this.f7429d = recyclerView;
        a aVar = this.f7430e;
        if (aVar != null) {
            this.f7430e = aVar;
        } else {
            this.f7430e = new a(this);
        }
    }

    @Override // y0.C1597a
    public final void c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7429d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // y0.C1597a
    public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C1638d c1638d) {
        this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
        RecyclerView recyclerView = this.f7429d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c1638d);
    }

    @Override // y0.C1597a
    public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7429d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
