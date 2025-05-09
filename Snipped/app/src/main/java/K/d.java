package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import k.AbstractC0912a;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public final class d extends AbstractC0912a implements f.a {

    /* renamed from: c, reason: collision with root package name */
    public Context f22606c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f22607d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0912a.InterfaceC0418a f22608e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference<View> f22609f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22610g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.appcompat.view.menu.f f22611h;

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f22608e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        ActionMenuPresenter actionMenuPresenter = this.f22607d.f23733d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.n();
        }
    }

    @Override // k.AbstractC0912a
    public final void c() {
        if (this.f22610g) {
            return;
        }
        this.f22610g = true;
        this.f22608e.d(this);
    }

    @Override // k.AbstractC0912a
    public final View d() {
        WeakReference<View> weakReference = this.f22609f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0912a
    public final androidx.appcompat.view.menu.f e() {
        return this.f22611h;
    }

    @Override // k.AbstractC0912a
    public final MenuInflater f() {
        return new f(this.f22607d.getContext());
    }

    @Override // k.AbstractC0912a
    public final CharSequence g() {
        return this.f22607d.getSubtitle();
    }

    @Override // k.AbstractC0912a
    public final CharSequence h() {
        return this.f22607d.getTitle();
    }

    @Override // k.AbstractC0912a
    public final void i() {
        this.f22608e.b(this, this.f22611h);
    }

    @Override // k.AbstractC0912a
    public final boolean j() {
        return this.f22607d.f4854s;
    }

    @Override // k.AbstractC0912a
    public final void k(View view) {
        this.f22607d.setCustomView(view);
        this.f22609f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // k.AbstractC0912a
    public final void l(int i) {
        m(this.f22606c.getString(i));
    }

    @Override // k.AbstractC0912a
    public final void m(CharSequence charSequence) {
        this.f22607d.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0912a
    public final void n(int i) {
        o(this.f22606c.getString(i));
    }

    @Override // k.AbstractC0912a
    public final void o(CharSequence charSequence) {
        this.f22607d.setTitle(charSequence);
    }

    @Override // k.AbstractC0912a
    public final void p(boolean z10) {
        this.f22599b = z10;
        this.f22607d.setTitleOptional(z10);
    }
}
