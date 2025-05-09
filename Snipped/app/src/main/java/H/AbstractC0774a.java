package h;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import h.LayoutInflaterFactory2C0778e;
import k.AbstractC0912a;

/* compiled from: ActionBar.java */
/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0774a {

    /* compiled from: ActionBar.java */
    /* renamed from: h.a$b */
    public interface b {
        void a();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(boolean z10);

    public abstract void m(boolean z10);

    public abstract void n(boolean z10);

    public abstract void o(CharSequence charSequence);

    public AbstractC0912a p(LayoutInflaterFactory2C0778e.d dVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: h.a$a, reason: collision with other inner class name */
    public static class C0401a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f20846a;

        public C0401a(C0401a c0401a) {
            super((ViewGroup.MarginLayoutParams) c0401a);
            this.f20846a = 0;
            this.f20846a = c0401a.f20846a;
        }

        public C0401a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20846a = 0;
        }
    }

    public void h() {
    }
}
