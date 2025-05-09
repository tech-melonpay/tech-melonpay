package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import k0.C0913a;
import y0.AbstractC1598b;

/* compiled from: ActionMenuItem.java */
/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971a implements q0.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f23429a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f23430b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f23431c;

    /* renamed from: d, reason: collision with root package name */
    public char f23432d;

    /* renamed from: f, reason: collision with root package name */
    public char f23434f;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f23436h;
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f23437j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f23438k;

    /* renamed from: e, reason: collision with root package name */
    public int f23433e = 4096;

    /* renamed from: g, reason: collision with root package name */
    public int f23435g = 4096;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f23439l = null;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f23440m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23441n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23442o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f23443p = 16;

    public C0971a(Context context, CharSequence charSequence) {
        this.i = context;
        this.f23429a = charSequence;
    }

    @Override // q0.b
    public final q0.b a(AbstractC1598b abstractC1598b) {
        throw new UnsupportedOperationException();
    }

    @Override // q0.b
    public final AbstractC1598b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f23436h;
        if (drawable != null) {
            if (this.f23441n || this.f23442o) {
                this.f23436h = drawable;
                Drawable mutate = drawable.mutate();
                this.f23436h = mutate;
                if (this.f23441n) {
                    mutate.setTintList(this.f23439l);
                }
                if (this.f23442o) {
                    this.f23436h.setTintMode(this.f23440m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f23435g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f23434f;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f23437j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f23436h;
    }

    @Override // q0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f23439l;
    }

    @Override // q0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f23440m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f23431c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // q0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f23433e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f23432d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f23429a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f23430b;
        return charSequence != null ? charSequence : this.f23429a;
    }

    @Override // q0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f23438k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f23443p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f23443p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f23443p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f23443p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f23434f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f23443p = (z10 ? 1 : 0) | (this.f23443p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f23443p = (z10 ? 2 : 0) | (this.f23443p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f23437j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f23443p = (z10 ? 16 : 0) | (this.f23443p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f23436h = drawable;
        c();
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f23439l = colorStateList;
        this.f23441n = true;
        c();
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f23440m = mode;
        this.f23442o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f23431c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.f23432d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c10) {
        this.f23432d = c2;
        this.f23434f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f23429a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f23430b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f23438k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f23443p = (this.f23443p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f23434f = Character.toLowerCase(c2);
        this.f23435g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setContentDescription(CharSequence charSequence) {
        this.f23437j = charSequence;
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f23432d = c2;
        this.f23433e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f23429a = this.i.getResources().getString(i);
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final q0.b setTooltipText(CharSequence charSequence) {
        this.f23438k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f23436h = C0913a.getDrawable(this.i, i);
        c();
        return this;
    }

    @Override // q0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c10, int i, int i9) {
        this.f23432d = c2;
        this.f23433e = KeyEvent.normalizeMetaState(i);
        this.f23434f = Character.toLowerCase(c10);
        this.f23435g = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
