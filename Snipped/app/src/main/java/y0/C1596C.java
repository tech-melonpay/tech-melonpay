package y0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import y0.C1597a;
import y0.C1599c;
import y0.J;
import z0.C1638d;
import z0.InterfaceC1640f;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: y0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596C {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, E> f30963a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f30964b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f30965c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f30966d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final y f30967e = new y();

    /* renamed from: f, reason: collision with root package name */
    public static final a f30968f = new a();

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$b */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f30970a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f30971b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30972c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30973d;

        public b(int i, Class<T> cls, int i9, int i10) {
            this.f30970a = i;
            this.f30971b = cls;
            this.f30973d = i9;
            this.f30972c = i10;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t3);

        public final T c(View view) {
            if (Build.VERSION.SDK_INT >= this.f30972c) {
                return a(view);
            }
            T t3 = (T) view.getTag(this.f30970a);
            if (this.f30971b.isInstance(t3)) {
                return t3;
            }
            return null;
        }

        public final void d(View view, T t3) {
            if (Build.VERSION.SDK_INT >= this.f30972c) {
                b(view, t3);
                return;
            }
            if (e(c(view), t3)) {
                View.AccessibilityDelegate d10 = C1596C.d(view);
                C1597a c1597a = d10 == null ? null : d10 instanceof C1597a.C0481a ? ((C1597a.C0481a) d10).f31048a : new C1597a(d10);
                if (c1597a == null) {
                    c1597a = new C1597a();
                }
                C1596C.o(view, c1597a);
                view.setTag(this.f30970a, t3);
                C1596C.i(this.f30973d, view);
            }
        }

        public abstract boolean e(T t3, T t10);
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$c */
    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$d */
    public static class d {

        /* compiled from: ViewCompat.java */
        /* renamed from: y0.C$d$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public J f30974a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f30975b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f30976c;

            public a(View view, p pVar) {
                this.f30975b = view;
                this.f30976c = pVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                J h9 = J.h(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                p pVar = this.f30976c;
                if (i < 30) {
                    d.a(windowInsets, this.f30975b);
                    if (h9.equals(this.f30974a)) {
                        return pVar.c(view, h9).g();
                    }
                }
                this.f30974a = h9;
                J c2 = pVar.c(view, h9);
                if (i >= 30) {
                    return c2.g();
                }
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                c.c(view);
                return c2.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static J b(View view, J j10, Rect rect) {
            WindowInsets g10 = j10.g();
            if (g10 != null) {
                return J.h(view, view.computeSystemWindowInsets(g10, rect));
            }
            rect.setEmpty();
            return j10;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static float g(View view) {
            return view.getTranslationZ();
        }

        public static float h(View view) {
            return view.getZ();
        }

        public static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void l(View view, float f10) {
            view.setElevation(f10);
        }

        public static void m(View view, p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, pVar));
            }
        }

        public static void n(View view, String str) {
            view.setTransitionName(str);
        }

        public static void o(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void p(View view, float f10) {
            view.setZ(f10);
        }

        public static void q(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$e */
    public static class e {
        public static J a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            J h9 = J.h(null, rootWindowInsets);
            J.j jVar = h9.f31013a;
            jVar.p(h9);
            jVar.d(view.getRootView());
            return h9;
        }

        public static void b(View view, int i, int i9) {
            view.setScrollIndicators(i, i9);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$f */
    public static class f {
        public static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$g */
    public static class g {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$h */
    public static class h {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$i */
    public static class i {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i9) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i9);
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$j */
    public static class j {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static L b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new L(windowInsetsController);
            }
            return null;
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$k */
    public static final class k {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1599c b(View view, C1599c c1599c) {
            ContentInfo c2 = c1599c.f31050a.c();
            Objects.requireNonNull(c2);
            ContentInfo performReceiveContent = view.performReceiveContent(c2);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == c2 ? c1599c : new C1599c(new C1599c.d(performReceiveContent));
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$l */
    public interface l {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$m */
    public static class m {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f30977d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f30978a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f30979b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f30980c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((l) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f30978a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a10 != null) {
                            return a10;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    @Deprecated
    public static E a(View view) {
        if (f30963a == null) {
            f30963a = new WeakHashMap<>();
        }
        E e10 = f30963a.get(view);
        if (e10 != null) {
            return e10;
        }
        E e11 = new E(view);
        f30963a.put(view, e11);
        return e11;
    }

    public static J b(View view, J j10) {
        WindowInsets g10 = j10.g();
        if (g10 != null) {
            WindowInsets a10 = c.a(view, g10);
            if (!a10.equals(g10)) {
                return J.h(view, a10);
            }
        }
        return j10;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = m.f30977d;
        m mVar = (m) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (mVar == null) {
            mVar = new m();
            view.setTag(R.id.tag_unhandled_key_event_manager, mVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = mVar.f30978a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = m.f30977d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (mVar.f30978a == null) {
                            mVar.f30978a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = m.f30977d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                mVar.f30978a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    mVar.f30978a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a10 = mVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (mVar.f30979b == null) {
                    mVar.f30979b = new SparseArray<>();
                }
                mVar.f30979b.put(keyCode, new WeakReference<>(a10));
            }
        }
        return a10 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (f30965c) {
            return null;
        }
        if (f30964b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f30964b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f30965c = true;
                return null;
            }
        }
        try {
            Object obj = f30964b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f30965c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = h.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(View view) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static L h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return j.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new L(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(int i9, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                obtain.setContentChangeTypes(i9);
                if (z10) {
                    obtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i9 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i9);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i9);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static J j(View view, J j10) {
        WindowInsets g10 = j10.g();
        if (g10 != null) {
            WindowInsets b9 = c.b(view, g10);
            if (!b9.equals(g10)) {
                return J.h(view, b9);
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1599c k(View view, C1599c c1599c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1599c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, c1599c);
        }
        q qVar = (q) view.getTag(R.id.tag_on_receive_content_listener);
        r rVar = f30967e;
        if (qVar == null) {
            if (view instanceof r) {
                rVar = (r) view;
            }
            return rVar.onReceiveContent(c1599c);
        }
        C1599c a10 = qVar.a(view, c1599c);
        if (a10 == null) {
            return null;
        }
        if (view instanceof r) {
            rVar = (r) view;
        }
        return rVar.onReceiveContent(a10);
    }

    public static void l(int i9, View view) {
        ArrayList f10 = f(view);
        for (int i10 = 0; i10 < f10.size(); i10++) {
            if (((C1638d.a) f10.get(i10)).a() == i9) {
                f10.remove(i10);
                return;
            }
        }
    }

    public static void m(View view, C1638d.a aVar, InterfaceC1640f interfaceC1640f) {
        if (interfaceC1640f == null) {
            l(aVar.a(), view);
            i(0, view);
            return;
        }
        C1638d.a aVar2 = new C1638d.a(null, aVar.f31230b, null, interfaceC1640f, aVar.f31231c);
        View.AccessibilityDelegate d10 = d(view);
        C1597a c1597a = d10 == null ? null : d10 instanceof C1597a.C0481a ? ((C1597a.C0481a) d10).f31048a : new C1597a(d10);
        if (c1597a == null) {
            c1597a = new C1597a();
        }
        o(view, c1597a);
        l(aVar2.a(), view);
        f(view).add(aVar2);
        i(0, view);
    }

    public static void n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.b(view, context, iArr, attributeSet, typedArray, i9, 0);
        }
    }

    public static void o(View view, C1597a c1597a) {
        if (c1597a == null && (d(view) instanceof C1597a.C0481a)) {
            c1597a = new C1597a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1597a == null ? null : c1597a.f31047b);
    }

    public static void p(View view, CharSequence charSequence) {
        new C1594A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view, charSequence);
        a aVar = f30968f;
        if (charSequence == null) {
            aVar.f30969a.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.f30969a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* renamed from: y0.C$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f30969a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f30969a.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
                    if (booleanValue != z10) {
                        C1596C.i(z10 ? 16 : 32, key);
                        entry.setValue(Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
