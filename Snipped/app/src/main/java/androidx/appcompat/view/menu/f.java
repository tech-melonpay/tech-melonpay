package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C0913a;
import l0.C0975a;
import q0.InterfaceMenuC1128a;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class f implements InterfaceMenuC1128a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4745y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f4746a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f4747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4748c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4749d;

    /* renamed from: e, reason: collision with root package name */
    public a f4750e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<h> f4751f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<h> f4752g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4753h;
    public final ArrayList<h> i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<h> f4754j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4755k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f4757m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f4758n;

    /* renamed from: o, reason: collision with root package name */
    public View f4759o;

    /* renamed from: v, reason: collision with root package name */
    public h f4766v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4768x;

    /* renamed from: l, reason: collision with root package name */
    public int f4756l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4760p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4761q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4762r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4763s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<h> f4764t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f4765u = new CopyOnWriteArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    public boolean f4767w = false;

    /* compiled from: MenuBuilder.java */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* compiled from: MenuBuilder.java */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        Resources resources;
        int identifier;
        boolean z10 = false;
        this.f4746a = context;
        Resources resources2 = context.getResources();
        this.f4747b = resources2;
        this.f4751f = new ArrayList<>();
        this.f4752g = new ArrayList<>();
        this.f4753h = true;
        this.i = new ArrayList<>();
        this.f4754j = new ArrayList<>();
        this.f4755k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : C0975a.c(viewConfiguration)) {
                z10 = true;
            }
        }
        this.f4749d = z10;
    }

    public h a(int i, int i9, int i10, CharSequence charSequence) {
        int i11;
        int i12 = ((-65536) & i10) >> 16;
        if (i12 < 0 || i12 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i13 = (f4745y[i12] << 16) | (65535 & i10);
        h hVar = new h(this, i, i9, i10, i13, charSequence, this.f4756l);
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            }
            if (arrayList.get(size).f4778d <= i13) {
                i11 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i11, hVar);
        p(true);
        return hVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i9, int i10, ComponentName componentName, Intent[] intentArr, Intent intent, int i11, MenuItem[] menuItemArr) {
        int i12;
        PackageManager packageManager = this.f4746a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i11 & 1) == 0) {
            removeGroup(i);
        }
        for (int i13 = 0; i13 < size; i13++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i13);
            int i14 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i14 < 0 ? intent : intentArr[i14]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a10 = a(i, i9, i10, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f4781g = intent2;
            if (menuItemArr != null && (i12 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i12] = a10;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f4765u.add(new WeakReference<>(jVar));
        jVar.h(context, this);
        this.f4755k = true;
    }

    public final void c(boolean z10) {
        if (this.f4763s) {
            return;
        }
        this.f4763s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f4765u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f4763s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f4766v;
        if (hVar != null) {
            d(hVar);
        }
        this.f4751f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f4758n = null;
        this.f4757m = null;
        this.f4759o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f4765u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4766v == hVar) {
            w();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 = jVar.g(hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f4766v = null;
            }
        }
        return z10;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f4750e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f4765u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z10 = jVar.m(hVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f4766v = hVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = arrayList.get(i9);
            if (hVar.f4775a == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f4788o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f4764t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n10 = n();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = arrayList.get(i9);
            char c2 = n10 ? hVar.f4783j : hVar.f4782h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n10 && c2 == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f4751f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i9;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList<h> arrayList2 = this.f4751f;
            int size = arrayList2.size();
            for (0; i9 < size; i9 + 1) {
                h hVar = arrayList2.get(i9);
                if (hVar.hasSubMenu()) {
                    hVar.f4788o.h(arrayList, i, keyEvent);
                }
                char c2 = n10 ? hVar.f4783j : hVar.f4782h;
                if ((modifiers & 69647) == ((n10 ? hVar.f4784k : hVar.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n10 && c2 == '\b') {
                            i9 = i != 67 ? i9 + 1 : 0;
                        }
                    }
                    if (hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f4768x) {
            return true;
        }
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<h> l10 = l();
        if (this.f4755k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f4765u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z10 |= jVar.e();
                }
            }
            ArrayList<h> arrayList = this.i;
            ArrayList<h> arrayList2 = this.f4754j;
            if (z10) {
                arrayList.clear();
                arrayList2.clear();
                int size = l10.size();
                for (int i = 0; i < size; i++) {
                    h hVar = l10.get(i);
                    if (hVar.f()) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f4755k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<h> l() {
        boolean z10 = this.f4753h;
        ArrayList<h> arrayList = this.f4752g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f4751f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            h hVar = arrayList2.get(i);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.f4753h = false;
        this.f4755k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f4767w;
    }

    public boolean n() {
        return this.f4748c;
    }

    public boolean o() {
        return this.f4749d;
    }

    public final void p(boolean z10) {
        if (this.f4760p) {
            this.f4761q = true;
            if (z10) {
                this.f4762r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f4753h = true;
            this.f4755k = true;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f4765u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.d(z10);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i9) {
        return q(findItem(i), null, i9);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i9) {
        h g10 = g(i, keyEvent);
        boolean q10 = g10 != null ? q(g10, null, i9) : false;
        if ((i9 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f4789p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L41
        L1a:
            androidx.appcompat.view.menu.f r1 = r7.f4787n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f4781g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f4746a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            y0.b r1 = r7.f4772A
            if (r1 == 0) goto L40
            boolean r1 = r1.e()
            if (r1 == 0) goto L40
            goto L18
        L40:
            r1 = r0
        L41:
            y0.b r3 = r7.f4772A
            if (r3 == 0) goto L4d
            boolean r4 = r3.a()
            if (r4 == 0) goto L4d
            r4 = r2
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L60
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            r6.c(r2)
            goto Lcb
        L60:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L71
            if (r4 == 0) goto L69
            goto L71
        L69:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            r6.c(r2)
            goto Lcb
        L71:
            r9 = r9 & 4
            if (r9 != 0) goto L78
            r6.c(r0)
        L78:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8c
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f4746a
            r9.<init>(r5, r6, r7)
            r7.f4788o = r9
            java.lang.CharSequence r5 = r7.f4779e
            r9.setHeaderTitle(r5)
        L8c:
            androidx.appcompat.view.menu.m r7 = r7.f4788o
            if (r4 == 0) goto L93
            r3.f(r7)
        L93:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f4765u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9c
            goto Lc5
        L9c:
            if (r8 == 0) goto La2
            boolean r0 = r8.k(r7)
        La2:
            java.util.Iterator r8 = r9.iterator()
        La6:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.j r4 = (androidx.appcompat.view.menu.j) r4
            if (r4 != 0) goto Lbe
            r9.remove(r3)
            goto La6
        Lbe:
            if (r0 != 0) goto La6
            boolean r0 = r4.k(r7)
            goto La6
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
            r6.c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f4765u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10).f4776b == i) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            int size2 = arrayList.size() - i10;
            while (true) {
                int i11 = i9 + 1;
                if (i9 >= size2 || arrayList.get(i10).f4776b != i) {
                    break;
                }
                if (i10 >= 0) {
                    ArrayList<h> arrayList2 = this.f4751f;
                    if (i10 < arrayList2.size()) {
                        arrayList2.remove(i10);
                    }
                }
                i9 = i11;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (arrayList.get(i9).f4775a == i) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            ArrayList<h> arrayList2 = this.f4751f;
            if (i9 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i9);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f4751f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i9 = bundle.getInt("android:menu:expandedactionview");
        if (i9 <= 0 || (findItem = findItem(i9)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z10, boolean z11) {
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = arrayList.get(i9);
            if (hVar.f4776b == i) {
                hVar.g(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // q0.InterfaceMenuC1128a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f4767w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z10) {
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = arrayList.get(i9);
            if (hVar.f4776b == i) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z10) {
        ArrayList<h> arrayList = this.f4751f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i9 = 0; i9 < size; i9++) {
            h hVar = arrayList.get(i9);
            if (hVar.f4776b == i) {
                int i10 = hVar.f4797x;
                int i11 = (i10 & (-9)) | (z10 ? 0 : 8);
                hVar.f4797x = i11;
                if (i10 != i11) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f4748c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4751f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f4751f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i9, Drawable drawable, View view) {
        if (view != null) {
            this.f4759o = view;
            this.f4757m = null;
            this.f4758n = null;
        } else {
            if (i > 0) {
                this.f4757m = this.f4747b.getText(i);
            } else if (charSequence != null) {
                this.f4757m = charSequence;
            }
            if (i9 > 0) {
                this.f4758n = C0913a.getDrawable(this.f4746a, i9);
            } else if (drawable != null) {
                this.f4758n = drawable;
            }
            this.f4759o = null;
        }
        p(false);
    }

    public final void v() {
        this.f4760p = false;
        if (this.f4761q) {
            this.f4761q = false;
            p(this.f4762r);
        }
    }

    public final void w() {
        if (this.f4760p) {
            return;
        }
        this.f4760p = true;
        this.f4761q = false;
        this.f4762r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f4747b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f4747b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, CharSequence charSequence) {
        return a(i, i9, i10, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i9, int i10, CharSequence charSequence) {
        h a10 = a(i, i9, i10, charSequence);
        m mVar = new m(this.f4746a, this, a10);
        a10.f4788o = mVar;
        mVar.setHeaderTitle(a10.f4779e);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i9, int i10, int i11) {
        return a(i, i9, i10, this.f4747b.getString(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i9, int i10, int i11) {
        return addSubMenu(i, i9, i10, this.f4747b.getString(i11));
    }

    public f k() {
        return this;
    }
}
