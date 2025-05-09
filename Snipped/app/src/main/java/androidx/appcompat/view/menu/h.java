package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import y0.AbstractC1598b;

/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class h implements q0.b {

    /* renamed from: A, reason: collision with root package name */
    public AbstractC1598b f4772A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4773B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4778d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4779e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4780f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f4781g;

    /* renamed from: h, reason: collision with root package name */
    public char f4782h;

    /* renamed from: j, reason: collision with root package name */
    public char f4783j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4785l;

    /* renamed from: n, reason: collision with root package name */
    public final f f4787n;

    /* renamed from: o, reason: collision with root package name */
    public m f4788o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4789p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f4790q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f4791r;

    /* renamed from: y, reason: collision with root package name */
    public int f4798y;

    /* renamed from: z, reason: collision with root package name */
    public View f4799z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f4784k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f4786m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f4792s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f4793t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4794u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4795v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4796w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f4797x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4774C = false;

    /* compiled from: MenuItemImpl.java */
    public class a implements AbstractC1598b.a {
        public a() {
        }
    }

    public h(f fVar, int i, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f4787n = fVar;
        this.f4775a = i9;
        this.f4776b = i;
        this.f4777c = i10;
        this.f4778d = i11;
        this.f4779e = charSequence;
        this.f4798y = i12;
    }

    public static void c(int i, int i9, String str, StringBuilder sb2) {
        if ((i & i9) == i9) {
            sb2.append(str);
        }
    }

    @Override // q0.b
    public final q0.b a(AbstractC1598b abstractC1598b) {
        AbstractC1598b abstractC1598b2 = this.f4772A;
        if (abstractC1598b2 != null) {
            abstractC1598b2.f31049a = null;
        }
        this.f4799z = null;
        this.f4772A = abstractC1598b;
        this.f4787n.p(true);
        AbstractC1598b abstractC1598b3 = this.f4772A;
        if (abstractC1598b3 != null) {
            abstractC1598b3.h(new a());
        }
        return this;
    }

    @Override // q0.b
    public final AbstractC1598b b() {
        return this.f4772A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4798y & 8) == 0) {
            return false;
        }
        if (this.f4799z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4773B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4787n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f4796w && (this.f4794u || this.f4795v)) {
            drawable = drawable.mutate();
            if (this.f4794u) {
                drawable.setTintList(this.f4792s);
            }
            if (this.f4795v) {
                drawable.setTintMode(this.f4793t);
            }
            this.f4796w = false;
        }
        return drawable;
    }

    public final boolean e() {
        AbstractC1598b abstractC1598b;
        if ((this.f4798y & 8) == 0) {
            return false;
        }
        if (this.f4799z == null && (abstractC1598b = this.f4772A) != null) {
            this.f4799z = abstractC1598b.d(this);
        }
        return this.f4799z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4773B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4787n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.f4797x & 32) == 32;
    }

    public final void g(boolean z10) {
        this.f4797x = (z10 ? 4 : 0) | (this.f4797x & (-5));
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4799z;
        if (view != null) {
            return view;
        }
        AbstractC1598b abstractC1598b = this.f4772A;
        if (abstractC1598b == null) {
            return null;
        }
        View d10 = abstractC1598b.d(this);
        this.f4799z = d10;
        return d10;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4784k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4783j;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4790q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4776b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4785l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f4786m;
        if (i == 0) {
            return null;
        }
        Drawable j10 = U4.b.j(this.f4787n.f4746a, i);
        this.f4786m = 0;
        this.f4785l = j10;
        return d(j10);
    }

    @Override // q0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4792s;
    }

    @Override // q0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4793t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4781g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f4775a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4782h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4777c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4788o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f4779e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4780f;
        return charSequence != null ? charSequence : this.f4779e;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4791r;
    }

    public final void h(boolean z10) {
        if (z10) {
            this.f4797x |= 32;
        } else {
            this.f4797x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4788o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4774C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4797x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4797x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4797x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC1598b abstractC1598b = this.f4772A;
        return (abstractC1598b == null || !abstractC1598b.g()) ? (this.f4797x & 8) == 0 : (this.f4797x & 8) == 0 && this.f4772A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f4799z = view;
        this.f4772A = null;
        if (view != null && view.getId() == -1 && (i = this.f4775a) > 0) {
            view.setId(i);
        }
        f fVar = this.f4787n;
        fVar.f4755k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f4783j == c2) {
            return this;
        }
        this.f4783j = Character.toLowerCase(c2);
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i = this.f4797x;
        int i9 = (z10 ? 1 : 0) | (i & (-2));
        this.f4797x = i9;
        if (i != i9) {
            this.f4787n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i = this.f4797x;
        if ((i & 4) != 0) {
            f fVar = this.f4787n;
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f4751f;
            int size = arrayList.size();
            fVar.w();
            for (int i9 = 0; i9 < size; i9++) {
                h hVar = arrayList.get(i9);
                if (hVar.f4776b == this.f4776b && (hVar.f4797x & 4) != 0 && hVar.isCheckable()) {
                    boolean z11 = hVar == this;
                    int i10 = hVar.f4797x;
                    int i11 = (z11 ? 2 : 0) | (i10 & (-3));
                    hVar.f4797x = i11;
                    if (i10 != i11) {
                        hVar.f4787n.p(false);
                    }
                }
            }
            fVar.v();
        } else {
            int i12 = (i & (-3)) | (z10 ? 2 : 0);
            this.f4797x = i12;
            if (i != i12) {
                this.f4787n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f4797x |= 16;
        } else {
            this.f4797x &= -17;
        }
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4786m = 0;
        this.f4785l = drawable;
        this.f4796w = true;
        this.f4787n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4792s = colorStateList;
        this.f4794u = true;
        this.f4796w = true;
        this.f4787n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4793t = mode;
        this.f4795v = true;
        this.f4796w = true;
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4781g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.f4782h == c2) {
            return this;
        }
        this.f4782h = c2;
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4773B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4789p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c10) {
        this.f4782h = c2;
        this.f4783j = Character.toLowerCase(c10);
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i9 = i & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4798y = i;
        f fVar = this.f4787n;
        fVar.f4755k = true;
        fVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4779e = charSequence;
        this.f4787n.p(false);
        m mVar = this.f4788o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4780f = charSequence;
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i = this.f4797x;
        int i9 = (z10 ? 0 : 8) | (i & (-9));
        this.f4797x = i9;
        if (i != i9) {
            f fVar = this.f4787n;
            fVar.f4753h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4779e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setContentDescription(CharSequence charSequence) {
        this.f4790q = charSequence;
        this.f4787n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setTooltipText(CharSequence charSequence) {
        this.f4791r = charSequence;
        this.f4787n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f4783j == c2 && this.f4784k == i) {
            return this;
        }
        this.f4783j = Character.toLowerCase(c2);
        this.f4784k = KeyEvent.normalizeMetaState(i);
        this.f4787n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        if (this.f4782h == c2 && this.i == i) {
            return this;
        }
        this.f4782h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f4787n.p(false);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c10, int i, int i9) {
        this.f4782h = c2;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f4783j = Character.toLowerCase(c10);
        this.f4784k = KeyEvent.normalizeMetaState(i9);
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f4785l = null;
        this.f4786m = i;
        this.f4796w = true;
        this.f4787n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f4787n.f4746a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i9;
        Context context = this.f4787n.f4746a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f4799z = inflate;
        this.f4772A = null;
        if (inflate != null && inflate.getId() == -1 && (i9 = this.f4775a) > 0) {
            inflate.setId(i9);
        }
        f fVar = this.f4787n;
        fVar.f4755k = true;
        fVar.p(true);
        return this;
    }
}
