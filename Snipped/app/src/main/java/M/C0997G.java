package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.luminary.mobile.R;
import j.C0868a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DropDownListView.java */
/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0997G extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f23611a;

    /* renamed from: b, reason: collision with root package name */
    public int f23612b;

    /* renamed from: c, reason: collision with root package name */
    public int f23613c;

    /* renamed from: d, reason: collision with root package name */
    public int f23614d;

    /* renamed from: e, reason: collision with root package name */
    public int f23615e;

    /* renamed from: f, reason: collision with root package name */
    public int f23616f;

    /* renamed from: g, reason: collision with root package name */
    public d f23617g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23618h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23619j;

    /* renamed from: k, reason: collision with root package name */
    public B0.c f23620k;

    /* renamed from: l, reason: collision with root package name */
    public f f23621l;

    /* compiled from: DropDownListView.java */
    /* renamed from: m.G$a */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: m.G$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f23622a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f23623b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f23624c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f23625d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f23622a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f23623b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f23624c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f23625d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: m.G$c */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: m.G$d */
    public static class d extends C0868a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f23626b;

        @Override // j.C0868a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f23626b) {
                super.draw(canvas);
            }
        }

        @Override // j.C0868a, android.graphics.drawable.Drawable
        public final void setHotspot(float f10, float f11) {
            if (this.f23626b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // j.C0868a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i9, int i10, int i11) {
            if (this.f23626b) {
                super.setHotspotBounds(i, i9, i10, i11);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f23626b) {
                return this.f22228a.setState(iArr);
            }
            return false;
        }

        @Override // j.C0868a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f23626b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: m.G$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f23627a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f23627a = field;
        }
    }

    /* compiled from: DropDownListView.java */
    /* renamed from: m.G$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0997G c0997g = C0997G.this;
            c0997g.f23621l = null;
            c0997g.drawableStateChanged();
        }
    }

    public C0997G(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f23611a = new Rect();
        this.f23612b = 0;
        this.f23613c = 0;
        this.f23614d = 0;
        this.f23615e = 0;
        this.i = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f23617g;
        if (dVar != null) {
            dVar.f23626b = z10;
        }
    }

    public final int a(int i, int i9) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i9) {
                return i9;
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0145 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0997G.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f23611a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f23621l != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f23619j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.i && this.f23618h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f23621l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f23621l == null) {
            f fVar = new f();
            this.f23621l = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !b.f23625d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f23622a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f23623b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f23624c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f23619j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f23616f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f23621l;
        if (fVar != null) {
            C0997G c0997g = C0997G.this;
            c0997g.f23621l = null;
            c0997g.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f23618h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
            dVar.f23626b = true;
        } else {
            dVar = null;
        }
        this.f23617g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f23612b = rect.left;
        this.f23613c = rect.top;
        this.f23614d = rect.right;
        this.f23615e = rect.bottom;
    }
}
