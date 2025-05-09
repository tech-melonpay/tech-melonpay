package X2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import z0.C1638d;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3979a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.textfield.a f3980b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3981c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3982d;

    public i(com.google.android.material.textfield.a aVar) {
        this.f3979a = aVar.f9888a;
        this.f3980b = aVar;
        this.f3981c = aVar.getContext();
        this.f3982d = aVar.f9894g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public A0.b h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof h;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f3980b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(C1638d c1638d) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
