package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.luminary.mobile.R;
import l.AbstractC0974d;
import m.C0997G;
import m.M;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class l extends AbstractC0974d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f4813b;

    /* renamed from: c, reason: collision with root package name */
    public final f f4814c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4815d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4816e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4817f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4818g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4819h;
    public final M i;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4822l;

    /* renamed from: m, reason: collision with root package name */
    public View f4823m;

    /* renamed from: n, reason: collision with root package name */
    public View f4824n;

    /* renamed from: o, reason: collision with root package name */
    public j.a f4825o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f4826p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4827q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4828r;

    /* renamed from: s, reason: collision with root package name */
    public int f4829s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4831u;

    /* renamed from: j, reason: collision with root package name */
    public final a f4820j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final b f4821k = new b();

    /* renamed from: t, reason: collision with root package name */
    public int f4830t = 0;

    /* compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (!lVar.b() || lVar.i.f23665y) {
                return;
            }
            View view = lVar.f4824n;
            if (view == null || !view.isShown()) {
                lVar.dismiss();
            } else {
                lVar.i.a();
            }
        }
    }

    public l(int i, int i9, Context context, View view, f fVar, boolean z10) {
        this.f4813b = context;
        this.f4814c = fVar;
        this.f4816e = z10;
        this.f4815d = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f4818g = i;
        this.f4819h = i9;
        Resources resources = context.getResources();
        this.f4817f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4823m = view;
        this.i = new M(context, null, i, i9);
        fVar.b(this, context);
    }

    @Override // l.f
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.f4827q || (view = this.f4823m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4824n = view;
        M m2 = this.i;
        m2.f23666z.setOnDismissListener(this);
        m2.f23656p = this;
        m2.f23665y = true;
        m2.f23666z.setFocusable(true);
        View view2 = this.f4824n;
        boolean z10 = this.f4826p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4826p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4820j);
        }
        view2.addOnAttachStateChangeListener(this.f4821k);
        m2.f23655o = view2;
        m2.f23652l = this.f4830t;
        boolean z11 = this.f4828r;
        Context context = this.f4813b;
        e eVar = this.f4815d;
        if (!z11) {
            this.f4829s = AbstractC0974d.o(eVar, context, this.f4817f);
            this.f4828r = true;
        }
        m2.r(this.f4829s);
        m2.f23666z.setInputMethodMode(2);
        Rect rect = this.f23457a;
        m2.f23664x = rect != null ? new Rect(rect) : null;
        m2.a();
        C0997G c0997g = m2.f23644c;
        c0997g.setOnKeyListener(this);
        if (this.f4831u) {
            f fVar = this.f4814c;
            if (fVar.f4757m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0997g, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.f4757m);
                }
                frameLayout.setEnabled(false);
                c0997g.addHeaderView(frameLayout, null, false);
            }
        }
        m2.p(eVar);
        m2.a();
    }

    @Override // l.f
    public final boolean b() {
        return !this.f4827q && this.i.f23666z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        if (fVar != this.f4814c) {
            return;
        }
        dismiss();
        j.a aVar = this.f4825o;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        this.f4828r = false;
        e eVar = this.f4815d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // l.f
    public final void dismiss() {
        if (b()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f4825o = aVar;
    }

    @Override // l.f
    public final C0997G j() {
        return this.i.f23644c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            View view = this.f4824n;
            i iVar = new i(this.f4818g, this.f4819h, this.f4813b, view, mVar, this.f4816e);
            j.a aVar = this.f4825o;
            iVar.i = aVar;
            AbstractC0974d abstractC0974d = iVar.f4809j;
            if (abstractC0974d != null) {
                abstractC0974d.f(aVar);
            }
            boolean w2 = AbstractC0974d.w(mVar);
            iVar.f4808h = w2;
            AbstractC0974d abstractC0974d2 = iVar.f4809j;
            if (abstractC0974d2 != null) {
                abstractC0974d2.q(w2);
            }
            iVar.f4810k = this.f4822l;
            this.f4822l = null;
            this.f4814c.c(false);
            M m2 = this.i;
            int i = m2.f23647f;
            int o10 = m2.o();
            if ((Gravity.getAbsoluteGravity(this.f4830t, this.f4823m.getLayoutDirection()) & 7) == 5) {
                i += this.f4823m.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f4806f != null) {
                    iVar.d(i, o10, true, true);
                }
            }
            j.a aVar2 = this.f4825o;
            if (aVar2 != null) {
                aVar2.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4827q = true;
        this.f4814c.c(true);
        ViewTreeObserver viewTreeObserver = this.f4826p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4826p = this.f4824n.getViewTreeObserver();
            }
            this.f4826p.removeGlobalOnLayoutListener(this.f4820j);
            this.f4826p = null;
        }
        this.f4824n.removeOnAttachStateChangeListener(this.f4821k);
        PopupWindow.OnDismissListener onDismissListener = this.f4822l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.AbstractC0974d
    public final void p(View view) {
        this.f4823m = view;
    }

    @Override // l.AbstractC0974d
    public final void q(boolean z10) {
        this.f4815d.f4741c = z10;
    }

    @Override // l.AbstractC0974d
    public final void r(int i) {
        this.f4830t = i;
    }

    @Override // l.AbstractC0974d
    public final void s(int i) {
        this.i.f23647f = i;
    }

    @Override // l.AbstractC0974d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f4822l = onDismissListener;
    }

    @Override // l.AbstractC0974d
    public final void u(boolean z10) {
        this.f4831u = z10;
    }

    @Override // l.AbstractC0974d
    public final void v(int i) {
        this.i.l(i);
    }

    /* compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.f4826p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.f4826p = view.getViewTreeObserver();
                }
                lVar.f4826p.removeGlobalOnLayoutListener(lVar.f4820j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
    }

    @Override // l.AbstractC0974d
    public final void n(f fVar) {
    }
}
