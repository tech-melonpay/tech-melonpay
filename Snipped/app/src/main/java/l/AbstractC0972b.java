package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0972b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23444a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.collection.g<q0.b, MenuItem> f23445b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.collection.g<q0.c, SubMenu> f23446c;

    public AbstractC0972b(Context context) {
        this.f23444a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof q0.b)) {
            return menuItem;
        }
        q0.b bVar = (q0.b) menuItem;
        if (this.f23445b == null) {
            this.f23445b = new androidx.collection.g<>();
        }
        MenuItem menuItem2 = this.f23445b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0973c menuItemC0973c = new MenuItemC0973c(this.f23444a, bVar);
        this.f23445b.put(bVar, menuItemC0973c);
        return menuItemC0973c;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof q0.c)) {
            return subMenu;
        }
        q0.c cVar = (q0.c) subMenu;
        if (this.f23446c == null) {
            this.f23446c = new androidx.collection.g<>();
        }
        SubMenu subMenu2 = this.f23446c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f23444a, cVar);
        this.f23446c.put(cVar, gVar);
        return gVar;
    }
}
