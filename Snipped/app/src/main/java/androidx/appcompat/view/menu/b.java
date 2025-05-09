package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import l.AbstractC0974d;
import m.C0997G;
import m.L;
import m.M;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class b extends AbstractC0974d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4696A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4698c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4700e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4701f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f4702g;

    /* renamed from: o, reason: collision with root package name */
    public View f4709o;

    /* renamed from: p, reason: collision with root package name */
    public View f4710p;

    /* renamed from: q, reason: collision with root package name */
    public int f4711q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4712r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4713s;

    /* renamed from: t, reason: collision with root package name */
    public int f4714t;

    /* renamed from: u, reason: collision with root package name */
    public int f4715u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4717w;

    /* renamed from: x, reason: collision with root package name */
    public j.a f4718x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f4719y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4720z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4703h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final a f4704j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0061b f4705k = new ViewOnAttachStateChangeListenerC0061b();

    /* renamed from: l, reason: collision with root package name */
    public final c f4706l = new c();

    /* renamed from: m, reason: collision with root package name */
    public int f4707m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4708n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4716v = false;

    /* compiled from: CascadingMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.b()) {
                ArrayList arrayList = bVar.i;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f4724a.f23665y) {
                    return;
                }
                View view = bVar.f4710p;
                if (view == null || !view.isShown()) {
                    bVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f4724a.a();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    public class c implements L {
        public c() {
        }

        @Override // m.L
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            bVar.f4702g.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i)).f4725b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i9 = i + 1;
            bVar.f4702g.postAtTime(new androidx.appcompat.view.menu.c(this, i9 < arrayList.size() ? (d) arrayList.get(i9) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // m.L
        public final void g(f fVar, MenuItem menuItem) {
            b.this.f4702g.removeCallbacksAndMessages(fVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final M f4724a;

        /* renamed from: b, reason: collision with root package name */
        public final f f4725b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4726c;

        public d(M m2, f fVar, int i) {
            this.f4724a = m2;
            this.f4725b = fVar;
            this.f4726c = i;
        }
    }

    public b(Context context, View view, int i, int i9, boolean z10) {
        this.f4697b = context;
        this.f4709o = view;
        this.f4699d = i;
        this.f4700e = i9;
        this.f4701f = z10;
        this.f4711q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4698c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4702g = new Handler();
    }

    @Override // l.f
    public final void a() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f4703h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((f) it.next());
        }
        arrayList.clear();
        View view = this.f4709o;
        this.f4710p = view;
        if (view != null) {
            boolean z10 = this.f4719y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4719y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4704j);
            }
            this.f4710p.addOnAttachStateChangeListener(this.f4705k);
        }
    }

    @Override // l.f
    public final boolean b() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f4724a.f23666z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i)).f4725b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i9 = i + 1;
        if (i9 < arrayList.size()) {
            ((d) arrayList.get(i9)).f4725b.c(false);
        }
        d dVar = (d) arrayList.remove(i);
        dVar.f4725b.r(this);
        boolean z11 = this.f4696A;
        M m2 = dVar.f4724a;
        if (z11) {
            M.a.b(m2.f23666z, null);
            m2.f23666z.setAnimationStyle(0);
        }
        m2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4711q = ((d) arrayList.get(size2 - 1)).f4726c;
        } else {
            this.f4711q = this.f4709o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f4725b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f4718x;
        if (aVar != null) {
            aVar.c(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4719y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4719y.removeGlobalOnLayoutListener(this.f4704j);
            }
            this.f4719y = null;
        }
        this.f4710p.removeOnAttachStateChangeListener(this.f4705k);
        this.f4720z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f4724a.f23644c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.f
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f4724a.f23666z.isShowing()) {
                    dVar.f4724a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        this.f4718x = aVar;
    }

    @Override // l.f
    public final C0997G j() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) com.google.android.gms.measurement.internal.a.f(1, arrayList)).f4724a.f23644c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f4725b) {
                dVar.f4724a.f23644c.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        n(mVar);
        j.a aVar = this.f4718x;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        return null;
    }

    @Override // l.AbstractC0974d
    public final void n(f fVar) {
        fVar.b(this, this.f4697b);
        if (b()) {
            x(fVar);
        } else {
            this.f4703h.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.f4724a.f23666z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f4725b.c(false);
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
        if (this.f4709o != view) {
            this.f4709o = view;
            this.f4708n = Gravity.getAbsoluteGravity(this.f4707m, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC0974d
    public final void q(boolean z10) {
        this.f4716v = z10;
    }

    @Override // l.AbstractC0974d
    public final void r(int i) {
        if (this.f4707m != i) {
            this.f4707m = i;
            this.f4708n = Gravity.getAbsoluteGravity(i, this.f4709o.getLayoutDirection());
        }
    }

    @Override // l.AbstractC0974d
    public final void s(int i) {
        this.f4712r = true;
        this.f4714t = i;
    }

    @Override // l.AbstractC0974d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f4720z = onDismissListener;
    }

    @Override // l.AbstractC0974d
    public final void u(boolean z10) {
        this.f4717w = z10;
    }

    @Override // l.AbstractC0974d
    public final void v(int i) {
        this.f4713s = true;
        this.f4715u = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013c, code lost:
    
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013e, code lost:
    
        r10 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
    
        r8 = 1;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0147, code lost:
    
        if ((r10[0] - r5) < 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(androidx.appcompat.view.menu.f r17) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.x(androidx.appcompat.view.menu.f):void");
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0061b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0061b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.f4719y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.f4719y = view.getViewTreeObserver();
                }
                bVar.f4719y.removeGlobalOnLayoutListener(bVar.f4704j);
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
}
