package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import k.AbstractC0912a;
import l.MenuItemC0973c;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22612a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0912a f22613b;

    /* compiled from: SupportActionModeWrapper.java */
    public static class a implements AbstractC0912a.InterfaceC0418a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f22614a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f22615b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f22616c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        public final androidx.collection.g<Menu, Menu> f22617d = new androidx.collection.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f22615b = context;
            this.f22614a = callback;
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final boolean a(AbstractC0912a abstractC0912a, MenuItem menuItem) {
            return this.f22614a.onActionItemClicked(e(abstractC0912a), new MenuItemC0973c(this.f22615b, (q0.b) menuItem));
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final boolean b(AbstractC0912a abstractC0912a, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(abstractC0912a);
            androidx.collection.g<Menu, Menu> gVar = this.f22617d;
            Menu menu = gVar.get(fVar);
            if (menu == null) {
                menu = new l.e(this.f22615b, fVar);
                gVar.put(fVar, menu);
            }
            return this.f22614a.onPrepareActionMode(e10, menu);
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final boolean c(AbstractC0912a abstractC0912a, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(abstractC0912a);
            androidx.collection.g<Menu, Menu> gVar = this.f22617d;
            Menu menu = gVar.get(fVar);
            if (menu == null) {
                menu = new l.e(this.f22615b, fVar);
                gVar.put(fVar, menu);
            }
            return this.f22614a.onCreateActionMode(e10, menu);
        }

        @Override // k.AbstractC0912a.InterfaceC0418a
        public final void d(AbstractC0912a abstractC0912a) {
            this.f22614a.onDestroyActionMode(e(abstractC0912a));
        }

        public final e e(AbstractC0912a abstractC0912a) {
            ArrayList<e> arrayList = this.f22616c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e eVar = arrayList.get(i);
                if (eVar != null && eVar.f22613b == abstractC0912a) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f22615b, abstractC0912a);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, AbstractC0912a abstractC0912a) {
        this.f22612a = context;
        this.f22613b = abstractC0912a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f22613b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f22613b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new l.e(this.f22612a, this.f22613b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f22613b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f22613b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f22613b.f22598a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f22613b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f22613b.f22599b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f22613b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f22613b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f22613b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f22613b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f22613b.f22598a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f22613b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f22613b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f22613b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f22613b.n(i);
    }
}
