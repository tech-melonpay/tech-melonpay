package y0;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f31090a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f31091a;

        public a(View view) {
            this.f31091a = view;
        }

        public void a() {
            View view = this.f31091a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            View view;
            View view2 = this.f31091a;
            if (view2 == null) {
                return;
            }
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new com.google.android.material.datepicker.c(4, view));
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f31092b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f31093c;

        /* JADX WARN: Type inference failed for: r4v0, types: [y0.u] */
        @Override // y0.t.a
        public final void a() {
            int ime;
            WindowInsetsController windowInsetsController = this.f31093c;
            View view = this.f31092b;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: y0.u
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // y0.t.a
        public final void b() {
            int ime;
            View view = this.f31092b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f31093c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    public static class c {
    }

    public t(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f31090a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f31092b = view;
        this.f31090a = bVar;
    }

    @Deprecated
    public t(WindowInsetsController windowInsetsController) {
        b bVar = new b(null);
        bVar.f31093c = windowInsetsController;
        this.f31090a = bVar;
    }
}
