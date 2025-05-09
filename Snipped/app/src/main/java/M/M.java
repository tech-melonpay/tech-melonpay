package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public final class M extends K implements L {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f23672D;

    /* renamed from: C, reason: collision with root package name */
    public L f23673C;

    /* compiled from: MenuPopupWindow.java */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    public static class c extends C0997G {

        /* renamed from: m, reason: collision with root package name */
        public final int f23674m;

        /* renamed from: n, reason: collision with root package name */
        public final int f23675n;

        /* renamed from: o, reason: collision with root package name */
        public L f23676o;

        /* renamed from: p, reason: collision with root package name */
        public androidx.appcompat.view.menu.h f23677p;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f23674m = 21;
                this.f23675n = 22;
            } else {
                this.f23674m = 22;
                this.f23675n = 21;
            }
        }

        @Override // m.C0997G, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int i;
            int pointToPosition;
            int i9;
            if (this.f23676o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    i = 0;
                }
                androidx.appcompat.view.menu.h item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i9 = pointToPosition - i) < 0 || i9 >= eVar.getCount()) ? null : eVar.getItem(i9);
                androidx.appcompat.view.menu.h hVar = this.f23677p;
                if (hVar != item) {
                    androidx.appcompat.view.menu.f fVar = eVar.f4739a;
                    if (hVar != null) {
                        this.f23676o.g(fVar, hVar);
                    }
                    this.f23677p = item;
                    if (item != null) {
                        this.f23676o.d(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f23674m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f23675n) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.e) adapter).f4739a.c(false);
            return true;
        }

        public void setHoverListener(L l10) {
            this.f23676o = l10;
        }

        @Override // m.C0997G, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f23672D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.L
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        L l10 = this.f23673C;
        if (l10 != null) {
            l10.d(fVar, hVar);
        }
    }

    @Override // m.L
    public final void g(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        L l10 = this.f23673C;
        if (l10 != null) {
            l10.g(fVar, menuItem);
        }
    }

    @Override // m.K
    public final C0997G q(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
