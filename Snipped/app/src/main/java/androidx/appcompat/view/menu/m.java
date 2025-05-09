package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public final class m extends f implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final h f4834A;

    /* renamed from: z, reason: collision with root package name */
    public final f f4835z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f4835z = fVar;
        this.f4834A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.f4835z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.f4835z.e(fVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(h hVar) {
        return this.f4835z.f(hVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4834A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final String j() {
        h hVar = this.f4834A;
        int i = hVar != null ? hVar.f4775a : 0;
        if (i == 0) {
            return null;
        }
        return com.google.android.gms.measurement.internal.a.g(i, "android:menu:actionviewstates:");
    }

    @Override // androidx.appcompat.view.menu.f
    public final f k() {
        return this.f4835z.k();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
        return this.f4835z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
        return this.f4835z.n();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.f4835z.o();
    }

    @Override // androidx.appcompat.view.menu.f, q0.InterfaceMenuC1128a, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f4835z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4834A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f4835z.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4834A.setIcon(i);
        return this;
    }
}
