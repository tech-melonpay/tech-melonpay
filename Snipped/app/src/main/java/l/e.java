package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import q0.InterfaceMenuC1128a;

/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
public class e extends AbstractC0972b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceMenuC1128a f23458d;

    public e(Context context, InterfaceMenuC1128a interfaceMenuC1128a) {
        super(context);
        if (interfaceMenuC1128a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f23458d = interfaceMenuC1128a;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f23458d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f23458d.addIntentOptions(i, i9, i10, componentName, intentArr, intent, i11, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i12 = 0; i12 < length; i12++) {
                menuItemArr[i12] = c(menuItemArr2[i12]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f23458d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        androidx.collection.g<q0.b, MenuItem> gVar = this.f23445b;
        if (gVar != null) {
            gVar.clear();
        }
        androidx.collection.g<q0.c, SubMenu> gVar2 = this.f23446c;
        if (gVar2 != null) {
            gVar2.clear();
        }
        this.f23458d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f23458d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return c(this.f23458d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return c(this.f23458d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f23458d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f23458d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i9) {
        return this.f23458d.performIdentifierAction(i, i9);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i9) {
        return this.f23458d.performShortcut(i, keyEvent, i9);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f23445b != null) {
            int i9 = 0;
            while (i9 < this.f23445b.size()) {
                if (this.f23445b.keyAt(i9).getGroupId() == i) {
                    this.f23445b.removeAt(i9);
                    i9--;
                }
                i9++;
            }
        }
        this.f23458d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f23445b != null) {
            int i9 = 0;
            while (true) {
                if (i9 >= this.f23445b.size()) {
                    break;
                }
                if (this.f23445b.keyAt(i9).getItemId() == i) {
                    this.f23445b.removeAt(i9);
                    break;
                }
                i9++;
            }
        }
        this.f23458d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z10, boolean z11) {
        this.f23458d.setGroupCheckable(i, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z10) {
        this.f23458d.setGroupEnabled(i, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z10) {
        this.f23458d.setGroupVisible(i, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f23458d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f23458d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(this.f23458d.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return d(this.f23458d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, CharSequence charSequence) {
        return c(this.f23458d.add(i, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, CharSequence charSequence) {
        return d(this.f23458d.addSubMenu(i, i9, i10, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, int i11) {
        return c(this.f23458d.add(i, i9, i10, i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, int i11) {
        return d(this.f23458d.addSubMenu(i, i9, i10, i11));
    }
}
