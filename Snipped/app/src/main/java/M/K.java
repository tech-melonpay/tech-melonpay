package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import g.C0756a;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class K implements l.f {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f23640A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f23641B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23642a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f23643b;

    /* renamed from: c, reason: collision with root package name */
    public C0997G f23644c;

    /* renamed from: f, reason: collision with root package name */
    public int f23647f;

    /* renamed from: g, reason: collision with root package name */
    public int f23648g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23650j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23651k;

    /* renamed from: n, reason: collision with root package name */
    public d f23654n;

    /* renamed from: o, reason: collision with root package name */
    public View f23655o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f23656p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f23657q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f23662v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f23664x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23665y;

    /* renamed from: z, reason: collision with root package name */
    public final C1015q f23666z;

    /* renamed from: d, reason: collision with root package name */
    public final int f23645d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f23646e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f23649h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f23652l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f23653m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final g f23658r = new g();

    /* renamed from: s, reason: collision with root package name */
    public final f f23659s = new f();

    /* renamed from: t, reason: collision with root package name */
    public final e f23660t = new e();

    /* renamed from: u, reason: collision with root package name */
    public final c f23661u = new c();

    /* renamed from: w, reason: collision with root package name */
    public final Rect f23663w = new Rect();

    /* compiled from: ListPopupWindow.java */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i, z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* compiled from: ListPopupWindow.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0997G c0997g = K.this.f23644c;
            if (c0997g != null) {
                c0997g.setListSelectionHidden(true);
                c0997g.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow.java */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            K k3 = K.this;
            if (k3.f23666z.isShowing()) {
                k3.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            K.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C1015q c1015q;
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            K k3 = K.this;
            if (action == 0 && (c1015q = k3.f23666z) != null && c1015q.isShowing() && x9 >= 0 && x9 < k3.f23666z.getWidth() && y10 >= 0 && y10 < k3.f23666z.getHeight()) {
                k3.f23662v.postDelayed(k3.f23658r, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            k3.f23662v.removeCallbacks(k3.f23658r);
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            K k3 = K.this;
            C0997G c0997g = k3.f23644c;
            if (c0997g == null || !c0997g.isAttachedToWindow() || k3.f23644c.getCount() <= k3.f23644c.getChildCount() || k3.f23644c.getChildCount() > k3.f23653m) {
                return;
            }
            k3.f23666z.setInputMethodMode(2);
            k3.a();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f23640A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f23641B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public K(Context context, AttributeSet attributeSet, int i, int i9) {
        int resourceId;
        this.f23642a = context;
        this.f23662v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20742o, i, i9);
        this.f23647f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f23648g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C1015q c1015q = new C1015q(context, attributeSet, i, i9);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0756a.f20746s, i, i9);
        if (obtainStyledAttributes2.hasValue(2)) {
            c1015q.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c1015q.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : U4.b.j(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f23666z = c1015q;
        c1015q.setInputMethodMode(1);
    }

    @Override // l.f
    public final void a() {
        int i;
        int paddingBottom;
        C0997G c0997g;
        C0997G c0997g2 = this.f23644c;
        C1015q c1015q = this.f23666z;
        Context context = this.f23642a;
        if (c0997g2 == null) {
            C0997G q10 = q(context, !this.f23665y);
            this.f23644c = q10;
            q10.setAdapter(this.f23643b);
            this.f23644c.setOnItemClickListener(this.f23656p);
            this.f23644c.setFocusable(true);
            this.f23644c.setFocusableInTouchMode(true);
            this.f23644c.setOnItemSelectedListener(new J(this));
            this.f23644c.setOnScrollListener(this.f23660t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f23657q;
            if (onItemSelectedListener != null) {
                this.f23644c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1015q.setContentView(this.f23644c);
        }
        Drawable background = c1015q.getBackground();
        Rect rect = this.f23663w;
        if (background != null) {
            background.getPadding(rect);
            int i9 = rect.top;
            i = rect.bottom + i9;
            if (!this.i) {
                this.f23648g = -i9;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a10 = a.a(c1015q, this.f23655o, this.f23648g, c1015q.getInputMethodMode() == 2);
        int i10 = this.f23645d;
        if (i10 == -1) {
            paddingBottom = a10 + i;
        } else {
            int i11 = this.f23646e;
            int a11 = this.f23644c.a(i11 != -2 ? i11 != -1 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a10);
            paddingBottom = a11 + (a11 > 0 ? this.f23644c.getPaddingBottom() + this.f23644c.getPaddingTop() + i : 0);
        }
        boolean z10 = this.f23666z.getInputMethodMode() == 2;
        c1015q.setWindowLayoutType(this.f23649h);
        if (c1015q.isShowing()) {
            if (this.f23655o.isAttachedToWindow()) {
                int i12 = this.f23646e;
                if (i12 == -1) {
                    i12 = -1;
                } else if (i12 == -2) {
                    i12 = this.f23655o.getWidth();
                }
                if (i10 == -1) {
                    i10 = z10 ? paddingBottom : -1;
                    if (z10) {
                        c1015q.setWidth(this.f23646e == -1 ? -1 : 0);
                        c1015q.setHeight(0);
                    } else {
                        c1015q.setWidth(this.f23646e == -1 ? -1 : 0);
                        c1015q.setHeight(-1);
                    }
                } else if (i10 == -2) {
                    i10 = paddingBottom;
                }
                c1015q.setOutsideTouchable(true);
                View view = this.f23655o;
                int i13 = this.f23647f;
                int i14 = this.f23648g;
                if (i12 < 0) {
                    i12 = -1;
                }
                c1015q.update(view, i13, i14, i12, i10 < 0 ? -1 : i10);
                return;
            }
            return;
        }
        int i15 = this.f23646e;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.f23655o.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = paddingBottom;
        }
        c1015q.setWidth(i15);
        c1015q.setHeight(i10);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f23640A;
            if (method != null) {
                try {
                    method.invoke(c1015q, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(c1015q, true);
        }
        c1015q.setOutsideTouchable(true);
        c1015q.setTouchInterceptor(this.f23659s);
        if (this.f23651k) {
            c1015q.setOverlapAnchor(this.f23650j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f23641B;
            if (method2 != null) {
                try {
                    method2.invoke(c1015q, this.f23664x);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(c1015q, this.f23664x);
        }
        c1015q.showAsDropDown(this.f23655o, this.f23647f, this.f23648g, this.f23652l);
        this.f23644c.setSelection(-1);
        if ((!this.f23665y || this.f23644c.isInTouchMode()) && (c0997g = this.f23644c) != null) {
            c0997g.setListSelectionHidden(true);
            c0997g.requestLayout();
        }
        if (this.f23665y) {
            return;
        }
        this.f23662v.post(this.f23661u);
    }

    @Override // l.f
    public final boolean b() {
        return this.f23666z.isShowing();
    }

    public final int c() {
        return this.f23647f;
    }

    @Override // l.f
    public final void dismiss() {
        C1015q c1015q = this.f23666z;
        c1015q.dismiss();
        c1015q.setContentView(null);
        this.f23644c = null;
        this.f23662v.removeCallbacks(this.f23658r);
    }

    public final void e(int i) {
        this.f23647f = i;
    }

    public final Drawable h() {
        return this.f23666z.getBackground();
    }

    @Override // l.f
    public final C0997G j() {
        return this.f23644c;
    }

    public final void k(Drawable drawable) {
        this.f23666z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f23648g = i;
        this.i = true;
    }

    public final int o() {
        if (this.i) {
            return this.f23648g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.f23654n;
        if (dVar == null) {
            this.f23654n = new d();
        } else {
            ListAdapter listAdapter2 = this.f23643b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f23643b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f23654n);
        }
        C0997G c0997g = this.f23644c;
        if (c0997g != null) {
            c0997g.setAdapter(this.f23643b);
        }
    }

    public C0997G q(Context context, boolean z10) {
        return new C0997G(context, z10);
    }

    public final void r(int i) {
        Drawable background = this.f23666z.getBackground();
        if (background == null) {
            this.f23646e = i;
            return;
        }
        Rect rect = this.f23663w;
        background.getPadding(rect);
        this.f23646e = rect.left + rect.right + i;
    }

    /* compiled from: ListPopupWindow.java */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                K k3 = K.this;
                if (k3.f23666z.getInputMethodMode() == 2 || k3.f23666z.getContentView() == null) {
                    return;
                }
                Handler handler = k3.f23662v;
                g gVar = k3.f23658r;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i9, int i10) {
        }
    }
}
