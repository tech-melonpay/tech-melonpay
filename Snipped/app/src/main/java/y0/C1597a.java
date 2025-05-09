package y0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import y0.C1596C;
import z0.C1638d;
import z0.C1639e;
import z0.InterfaceC1640f;

/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1597a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f31045c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f31046a;

    /* renamed from: b, reason: collision with root package name */
    public final C0481a f31047b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: y0.a$a, reason: collision with other inner class name */
    public static final class C0481a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final C1597a f31048a;

        public C0481a(C1597a c1597a) {
            this.f31048a = c1597a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f31048a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1639e b9 = this.f31048a.b(view);
            if (b9 != null) {
                return (AccessibilityNodeProvider) b9.f31235a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f31048a.c(view, accessibilityEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object tag2;
            C1638d c1638d = new C1638d(accessibilityNodeInfo);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            Object obj = null;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(C1596C.h.c(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z10 = (bool == null || !bool.booleanValue()) ? 0 : 1;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z10);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z10 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                tag2 = Boolean.valueOf(C1596C.h.b(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            boolean z11 = bool2 != null && bool2.booleanValue();
            if (i >= 28) {
                accessibilityNodeInfo.setHeading(z11);
            } else {
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z11 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
                }
            }
            CharSequence e10 = C1596C.e(view);
            if (i >= 28) {
                accessibilityNodeInfo.setPaneTitle(e10);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e10);
            }
            if (i >= 30) {
                obj = C1596C.j.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag3)) {
                    obj = tag3;
                }
            }
            CharSequence charSequence = (CharSequence) obj;
            if (i >= 30) {
                C1638d.b.b(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f31048a.d(view, c1638d);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i9 = 0; i9 < list.size(); i9++) {
                c1638d.b((C1638d.a) list.get(i9));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f31048a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f31048a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f31048a.g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f31048a.h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f31048a.i(view, accessibilityEvent);
        }
    }

    public C1597a() {
        this(f31045c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f31046a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1639e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f31046a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1639e(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f31046a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, C1638d c1638d) {
        this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f31046a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f31046a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= list.size()) {
                break;
            }
            C1638d.a aVar = (C1638d.a) list.get(i9);
            if (aVar.a() == i) {
                InterfaceC1640f interfaceC1640f = aVar.f31232d;
                if (interfaceC1640f != null) {
                    Class<? extends InterfaceC1640f.a> cls = aVar.f31231c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(null).newInstance(null).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = interfaceC1640f.a(view);
                }
            } else {
                i9++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = this.f31046a.performAccessibilityAction(view, i, bundle);
        }
        if (z10 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z10;
        }
        int i10 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i10)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i11 = 0;
            while (true) {
                if (clickableSpanArr == null || i11 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i11])) {
                    clickableSpan.onClick(view);
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        return z11;
    }

    public void h(View view, int i) {
        this.f31046a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f31046a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1597a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f31046a = accessibilityDelegate;
        this.f31047b = new C0481a(this);
    }
}
