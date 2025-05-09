package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.f;
import com.luminary.mobile.R;
import g.C0756a;
import h.LayoutInflaterFactory2C0778e;
import m.C1023z;
import m.InterfaceC0995E;
import m.Z;
import m.b0;
import pa.C1124b;
import y0.C1596C;
import y0.E;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class c implements InterfaceC0995E {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f5103a;

    /* renamed from: b, reason: collision with root package name */
    public int f5104b;

    /* renamed from: c, reason: collision with root package name */
    public b f5105c;

    /* renamed from: d, reason: collision with root package name */
    public final View f5106d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f5107e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f5108f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f5109g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5110h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f5111j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f5112k;

    /* renamed from: l, reason: collision with root package name */
    public Window.Callback f5113l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5114m;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuPresenter f5115n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5116o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f5117p;

    /* compiled from: ToolbarWidgetWrapper.java */
    public class a extends C1124b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5118a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f5119b;

        public a(int i) {
            this.f5119b = i;
        }

        @Override // pa.C1124b, y0.F
        public final void a() {
            this.f5118a = true;
        }

        @Override // pa.C1124b, y0.F
        public final void b() {
            c.this.f5103a.setVisibility(0);
        }

        @Override // y0.F
        public final void c() {
            if (this.f5118a) {
                return;
            }
            c.this.f5103a.setVisibility(this.f5119b);
        }
    }

    public c(Toolbar toolbar, boolean z10) {
        Drawable drawable;
        this.f5116o = 0;
        this.f5103a = toolbar;
        this.i = toolbar.getTitle();
        this.f5111j = toolbar.getSubtitle();
        this.f5110h = this.i != null;
        this.f5109g = toolbar.getNavigationIcon();
        Z f10 = Z.f(toolbar.getContext(), null, C0756a.f20729a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.f5117p = f10.b(15);
        if (z10) {
            TypedArray typedArray = f10.f23728b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f5110h = true;
                this.i = text;
                if ((this.f5104b & 8) != 0) {
                    Toolbar toolbar2 = this.f5103a;
                    toolbar2.setTitle(text);
                    if (this.f5110h) {
                        C1596C.p(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f5111j = text2;
                if ((this.f5104b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable b9 = f10.b(20);
            if (b9 != null) {
                this.f5108f = b9;
                s();
            }
            Drawable b10 = f10.b(17);
            if (b10 != null) {
                setIcon(b10);
            }
            if (this.f5109g == null && (drawable = this.f5117p) != null) {
                this.f5109g = drawable;
                int i9 = this.f5104b & 4;
                Toolbar toolbar3 = this.f5103a;
                if (i9 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            j(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f5106d;
                if (view != null && (this.f5104b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f5106d = inflate;
                if (inflate != null && (this.f5104b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                j(this.f5104b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f5080t.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f5072l = resourceId2;
                C1023z c1023z = toolbar.f5063b;
                if (c1023z != null) {
                    c1023z.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f5073m = resourceId3;
                C1023z c1023z2 = toolbar.f5064c;
                if (c1023z2 != null) {
                    c1023z2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f5117p = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f5104b = i;
        }
        f10.g();
        if (R.string.abc_action_bar_up_description != this.f5116o) {
            this.f5116o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i10 = this.f5116o;
                this.f5112k = i10 != 0 ? toolbar.getContext().getString(i10) : null;
                r();
            }
        }
        this.f5112k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new b0(this));
    }

    @Override // m.InterfaceC0995E
    public final boolean a() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f5103a.f5062a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null || !actionMenuPresenter.j()) ? false : true;
    }

    @Override // m.InterfaceC0995E
    public final void b() {
        this.f5114m = true;
    }

    @Override // m.InterfaceC0995E
    public final void c(f fVar, LayoutInflaterFactory2C0778e.c cVar) {
        ActionMenuPresenter actionMenuPresenter = this.f5115n;
        Toolbar toolbar = this.f5103a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f5115n = actionMenuPresenter2;
            actionMenuPresenter2.i = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.f5115n;
        actionMenuPresenter3.f4692e = cVar;
        if (fVar == null && toolbar.f5062a == null) {
            return;
        }
        toolbar.f();
        f fVar2 = toolbar.f5062a.f4916p;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.f5056L);
            fVar2.r(toolbar.f5057M);
        }
        if (toolbar.f5057M == null) {
            toolbar.f5057M = toolbar.new f();
        }
        actionMenuPresenter3.f4898r = true;
        if (fVar != null) {
            fVar.b(actionMenuPresenter3, toolbar.f5070j);
            fVar.b(toolbar.f5057M, toolbar.f5070j);
        } else {
            actionMenuPresenter3.h(toolbar.f5070j, null);
            toolbar.f5057M.h(toolbar.f5070j, null);
            actionMenuPresenter3.d(true);
            toolbar.f5057M.d(true);
        }
        toolbar.f5062a.setPopupTheme(toolbar.f5071k);
        toolbar.f5062a.setPresenter(actionMenuPresenter3);
        toolbar.f5056L = actionMenuPresenter3;
        toolbar.v();
    }

    @Override // m.InterfaceC0995E
    public final void collapseActionView() {
        Toolbar.f fVar = this.f5103a.f5057M;
        h hVar = fVar == null ? null : fVar.f5094b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // m.InterfaceC0995E
    public final boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f5103a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f5062a) != null && actionMenuView.f4919s;
    }

    @Override // m.InterfaceC0995E
    public final boolean e() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f5103a.f5062a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null || (actionMenuPresenter.f4902v == null && !actionMenuPresenter.j())) ? false : true;
    }

    @Override // m.InterfaceC0995E
    public final boolean f() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f5103a.f5062a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null || !actionMenuPresenter.b()) ? false : true;
    }

    @Override // m.InterfaceC0995E
    public final boolean g() {
        return this.f5103a.u();
    }

    @Override // m.InterfaceC0995E
    public final Context getContext() {
        return this.f5103a.getContext();
    }

    @Override // m.InterfaceC0995E
    public final CharSequence getTitle() {
        return this.f5103a.getTitle();
    }

    @Override // m.InterfaceC0995E
    public final void h() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f5103a.f5062a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null) {
            return;
        }
        actionMenuPresenter.b();
        ActionMenuPresenter.a aVar = actionMenuPresenter.f4901u;
        if (aVar == null || !aVar.b()) {
            return;
        }
        aVar.f4809j.dismiss();
    }

    @Override // m.InterfaceC0995E
    public final boolean i() {
        Toolbar.f fVar = this.f5103a.f5057M;
        return (fVar == null || fVar.f5094b == null) ? false : true;
    }

    @Override // m.InterfaceC0995E
    public final void j(int i) {
        View view;
        int i9 = this.f5104b ^ i;
        this.f5104b = i;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i & 4) != 0) {
                    r();
                }
                int i10 = this.f5104b & 4;
                Toolbar toolbar = this.f5103a;
                if (i10 != 0) {
                    Drawable drawable = this.f5109g;
                    if (drawable == null) {
                        drawable = this.f5117p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i9 & 3) != 0) {
                s();
            }
            int i11 = i9 & 8;
            Toolbar toolbar2 = this.f5103a;
            if (i11 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.i);
                    toolbar2.setSubtitle(this.f5111j);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) == 0 || (view = this.f5106d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // m.InterfaceC0995E
    public final void k() {
        b bVar = this.f5105c;
        if (bVar != null) {
            ViewParent parent = bVar.getParent();
            Toolbar toolbar = this.f5103a;
            if (parent == toolbar) {
                toolbar.removeView(this.f5105c);
            }
        }
        this.f5105c = null;
    }

    @Override // m.InterfaceC0995E
    public final void l(int i) {
        this.f5108f = i != 0 ? U4.b.j(this.f5103a.getContext(), i) : null;
        s();
    }

    @Override // m.InterfaceC0995E
    public final E m(int i, long j10) {
        E a10 = C1596C.a(this.f5103a);
        a10.a(i == 0 ? 1.0f : 0.0f);
        a10.c(j10);
        a10.d(new a(i));
        return a10;
    }

    @Override // m.InterfaceC0995E
    public final int n() {
        return this.f5104b;
    }

    @Override // m.InterfaceC0995E
    public final void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // m.InterfaceC0995E
    public final void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // m.InterfaceC0995E
    public final void q(boolean z10) {
        this.f5103a.setCollapsible(z10);
    }

    public final void r() {
        if ((this.f5104b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f5112k);
            Toolbar toolbar = this.f5103a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f5116o);
            } else {
                toolbar.setNavigationContentDescription(this.f5112k);
            }
        }
    }

    public final void s() {
        Drawable drawable;
        int i = this.f5104b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f5108f;
            if (drawable == null) {
                drawable = this.f5107e;
            }
        } else {
            drawable = this.f5107e;
        }
        this.f5103a.setLogo(drawable);
    }

    @Override // m.InterfaceC0995E
    public final void setIcon(int i) {
        setIcon(i != 0 ? U4.b.j(this.f5103a.getContext(), i) : null);
    }

    @Override // m.InterfaceC0995E
    public final void setVisibility(int i) {
        this.f5103a.setVisibility(i);
    }

    @Override // m.InterfaceC0995E
    public final void setWindowCallback(Window.Callback callback) {
        this.f5113l = callback;
    }

    @Override // m.InterfaceC0995E
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f5110h) {
            return;
        }
        this.i = charSequence;
        if ((this.f5104b & 8) != 0) {
            Toolbar toolbar = this.f5103a;
            toolbar.setTitle(charSequence);
            if (this.f5110h) {
                C1596C.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // m.InterfaceC0995E
    public final void setIcon(Drawable drawable) {
        this.f5107e = drawable;
        s();
    }
}
