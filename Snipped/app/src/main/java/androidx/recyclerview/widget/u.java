package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyModelTouchCallback;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.bouncycastle.tls.CipherSuite;
import y0.C1596C;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class u extends RecyclerView.m implements RecyclerView.p {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f7772A;

    /* renamed from: C, reason: collision with root package name */
    public GestureDetectorCompat f7774C;

    /* renamed from: D, reason: collision with root package name */
    public e f7775D;

    /* renamed from: F, reason: collision with root package name */
    public Rect f7777F;

    /* renamed from: G, reason: collision with root package name */
    public long f7778G;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f7782j;

    /* renamed from: k, reason: collision with root package name */
    public float f7783k;

    /* renamed from: l, reason: collision with root package name */
    public float f7784l;

    /* renamed from: m, reason: collision with root package name */
    public float f7785m;

    /* renamed from: n, reason: collision with root package name */
    public float f7786n;

    /* renamed from: o, reason: collision with root package name */
    public float f7787o;

    /* renamed from: p, reason: collision with root package name */
    public float f7788p;

    /* renamed from: r, reason: collision with root package name */
    public final d f7790r;

    /* renamed from: t, reason: collision with root package name */
    public int f7792t;

    /* renamed from: v, reason: collision with root package name */
    public int f7794v;

    /* renamed from: w, reason: collision with root package name */
    public RecyclerView f7795w;

    /* renamed from: y, reason: collision with root package name */
    public VelocityTracker f7797y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f7798z;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7779f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final float[] f7780g = new float[2];

    /* renamed from: h, reason: collision with root package name */
    public RecyclerView.C f7781h = null;

    /* renamed from: q, reason: collision with root package name */
    public int f7789q = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f7791s = 0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f7793u = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final a f7796x = new a();

    /* renamed from: B, reason: collision with root package name */
    public View f7773B = null;

    /* renamed from: E, reason: collision with root package name */
    public final b f7776E = new b();

    /* compiled from: ItemTouchHelper.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (r12 < 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
        
            if (r12 > 0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.u.a.run():void");
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public class b implements RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(MotionEvent motionEvent) {
            u uVar = u.this;
            uVar.f7774C.f6499a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = uVar.f7797y;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (uVar.f7789q == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(uVar.f7789q);
            if (findPointerIndex >= 0) {
                uVar.f(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.C c2 = uVar.f7781h;
            if (c2 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        uVar.o(uVar.f7792t, findPointerIndex, motionEvent);
                        uVar.l(c2);
                        RecyclerView recyclerView = uVar.f7795w;
                        a aVar = uVar.f7796x;
                        recyclerView.removeCallbacks(aVar);
                        aVar.run();
                        uVar.f7795w.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == uVar.f7789q) {
                        uVar.f7789q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        uVar.o(uVar.f7792t, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = uVar.f7797y;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            uVar.n(null, 0);
            uVar.f7789q = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final boolean b(MotionEvent motionEvent) {
            int findPointerIndex;
            u uVar = u.this;
            uVar.f7774C.f6499a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                uVar.f7789q = motionEvent.getPointerId(0);
                uVar.i = motionEvent.getX();
                uVar.f7782j = motionEvent.getY();
                VelocityTracker velocityTracker = uVar.f7797y;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                uVar.f7797y = VelocityTracker.obtain();
                if (uVar.f7781h == null) {
                    ArrayList arrayList = uVar.f7793u;
                    if (!arrayList.isEmpty()) {
                        View i = uVar.i(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f7810e.itemView == i) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        uVar.i -= fVar.i;
                        uVar.f7782j -= fVar.f7814j;
                        RecyclerView.C c2 = fVar.f7810e;
                        uVar.h(c2, true);
                        if (uVar.f7779f.remove(c2.itemView)) {
                            uVar.f7790r.clearView(uVar.f7795w, c2);
                        }
                        uVar.n(c2, fVar.f7811f);
                        uVar.o(uVar.f7792t, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                uVar.f7789q = -1;
                uVar.n(null, 0);
            } else {
                int i9 = uVar.f7789q;
                if (i9 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i9)) >= 0) {
                    uVar.f(actionMasked, findPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = uVar.f7797y;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return uVar.f7781h != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void c(boolean z10) {
            if (z10) {
                u.this.n(null, 0);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public class c extends f {

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f7801n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f7802o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.C c2, int i, int i9, float f10, float f11, float f12, float f13, int i10, RecyclerView.C c10) {
            super(c2, i9, f10, f11, f12, f13);
            this.f7801n = i10;
            this.f7802o = c10;
        }

        @Override // androidx.recyclerview.widget.u.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f7815k) {
                return;
            }
            int i = this.f7801n;
            RecyclerView.C c2 = this.f7802o;
            u uVar = u.this;
            if (i <= 0) {
                uVar.f7790r.clearView(uVar.f7795w, c2);
            } else {
                uVar.f7779f.add(c2.itemView);
                this.f7813h = true;
                if (i > 0) {
                    uVar.f7795w.post(new v(uVar, this, i));
                }
            }
            View view = uVar.f7773B;
            View view2 = c2.itemView;
            if (view == view2) {
                uVar.m(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7804a = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            u uVar;
            View i;
            RecyclerView.C childViewHolder;
            if (this.f7804a && (i = (uVar = u.this).i(motionEvent)) != null && (childViewHolder = uVar.f7795w.getChildViewHolder(i)) != null && uVar.f7790r.hasDragFlag(uVar.f7795w, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i9 = uVar.f7789q;
                if (pointerId == i9) {
                    int findPointerIndex = motionEvent.findPointerIndex(i9);
                    float x9 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    uVar.i = x9;
                    uVar.f7782j = y10;
                    uVar.f7786n = 0.0f;
                    uVar.f7785m = 0.0f;
                    if (uVar.f7790r.isLongPressDragEnabled()) {
                        uVar.n(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public interface g {
        void prepareForDrop(View view, View view2, int i, int i9);
    }

    public u(EpoxyModelTouchCallback epoxyModelTouchCallback) {
        this.f7790r = epoxyModelTouchCallback;
    }

    public static boolean k(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    public final void d(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7795w;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f7776E;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f7795w.removeOnItemTouchListener(bVar);
            this.f7795w.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f7793u;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList.get(0);
                fVar.f7812g.cancel();
                this.f7790r.clearView(this.f7795w, fVar.f7810e);
            }
            arrayList.clear();
            this.f7773B = null;
            VelocityTracker velocityTracker = this.f7797y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7797y = null;
            }
            e eVar = this.f7775D;
            if (eVar != null) {
                eVar.f7804a = false;
                this.f7775D = null;
            }
            if (this.f7774C != null) {
                this.f7774C = null;
            }
        }
        this.f7795w = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f7783k = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f7784l = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f7794v = ViewConfiguration.get(this.f7795w.getContext()).getScaledTouchSlop();
            this.f7795w.addItemDecoration(this);
            this.f7795w.addOnItemTouchListener(bVar);
            this.f7795w.addOnChildAttachStateChangeListener(this);
            this.f7775D = new e();
            this.f7774C = new GestureDetectorCompat(this.f7795w.getContext(), this.f7775D);
        }
    }

    public final int e(RecyclerView.C c2, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i9 = this.f7785m > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f7797y;
        d dVar = this.f7790r;
        if (velocityTracker != null && this.f7789q > -1) {
            velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.f7784l));
            float xVelocity = this.f7797y.getXVelocity(this.f7789q);
            float yVelocity = this.f7797y.getYVelocity(this.f7789q);
            int i10 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i10 & i) != 0 && i9 == i10 && abs >= dVar.getSwipeEscapeVelocity(this.f7783k) && abs > Math.abs(yVelocity)) {
                return i10;
            }
        }
        float swipeThreshold = dVar.getSwipeThreshold(c2) * this.f7795w.getWidth();
        if ((i & i9) == 0 || Math.abs(this.f7785m) <= swipeThreshold) {
            return 0;
        }
        return i9;
    }

    public final void f(int i, int i9, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View i10;
        if (this.f7781h == null && i == 2 && this.f7791s != 2) {
            d dVar = this.f7790r;
            if (dVar.isItemViewSwipeEnabled() && this.f7795w.getScrollState() != 1) {
                RecyclerView.n layoutManager = this.f7795w.getLayoutManager();
                int i11 = this.f7789q;
                RecyclerView.C c2 = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x9 = motionEvent.getX(findPointerIndex) - this.i;
                    float y10 = motionEvent.getY(findPointerIndex) - this.f7782j;
                    float abs = Math.abs(x9);
                    float abs2 = Math.abs(y10);
                    float f10 = this.f7794v;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (i10 = i(motionEvent)) != null))) {
                        c2 = this.f7795w.getChildViewHolder(i10);
                    }
                }
                if (c2 == null || (absoluteMovementFlags = (dVar.getAbsoluteMovementFlags(this.f7795w, c2) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8) == 0) {
                    return;
                }
                float x10 = motionEvent.getX(i9);
                float y11 = motionEvent.getY(i9);
                float f11 = x10 - this.i;
                float f12 = y11 - this.f7782j;
                float abs3 = Math.abs(f11);
                float abs4 = Math.abs(f12);
                float f13 = this.f7794v;
                if (abs3 >= f13 || abs4 >= f13) {
                    if (abs3 > abs4) {
                        if (f11 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f12 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.f7786n = 0.0f;
                    this.f7785m = 0.0f;
                    this.f7789q = motionEvent.getPointerId(0);
                    n(c2, 1);
                }
            }
        }
    }

    public final int g(RecyclerView.C c2, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i9 = this.f7786n > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f7797y;
        d dVar = this.f7790r;
        if (velocityTracker != null && this.f7789q > -1) {
            velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.f7784l));
            float xVelocity = this.f7797y.getXVelocity(this.f7789q);
            float yVelocity = this.f7797y.getYVelocity(this.f7789q);
            int i10 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i10 & i) != 0 && i10 == i9 && abs >= dVar.getSwipeEscapeVelocity(this.f7783k) && abs > Math.abs(xVelocity)) {
                return i10;
            }
        }
        float swipeThreshold = dVar.getSwipeThreshold(c2) * this.f7795w.getHeight();
        if ((i & i9) == 0 || Math.abs(this.f7786n) <= swipeThreshold) {
            return 0;
        }
        return i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        rect.setEmpty();
    }

    public final void h(RecyclerView.C c2, boolean z10) {
        ArrayList arrayList = this.f7793u;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.f7810e == c2) {
                fVar.f7815k |= z10;
                if (!fVar.f7816l) {
                    fVar.f7812g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View i(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.C c2 = this.f7781h;
        if (c2 != null) {
            View view = c2.itemView;
            if (k(view, x9, y10, this.f7787o + this.f7785m, this.f7788p + this.f7786n)) {
                return view;
            }
        }
        ArrayList arrayList = this.f7793u;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view2 = fVar.f7810e.itemView;
            if (k(view2, x9, y10, fVar.i, fVar.f7814j)) {
                return view2;
            }
        }
        return this.f7795w.findChildViewUnder(x9, y10);
    }

    public final void j(float[] fArr) {
        if ((this.f7792t & 12) != 0) {
            fArr[0] = (this.f7787o + this.f7785m) - this.f7781h.itemView.getLeft();
        } else {
            fArr[0] = this.f7781h.itemView.getTranslationX();
        }
        if ((this.f7792t & 3) != 0) {
            fArr[1] = (this.f7788p + this.f7786n) - this.f7781h.itemView.getTop();
        } else {
            fArr[1] = this.f7781h.itemView.getTranslationY();
        }
    }

    public final void l(RecyclerView.C c2) {
        int i;
        int i9;
        int i10;
        if (!this.f7795w.isLayoutRequested() && this.f7791s == 2) {
            d dVar = this.f7790r;
            float moveThreshold = dVar.getMoveThreshold(c2);
            int i11 = (int) (this.f7787o + this.f7785m);
            int i12 = (int) (this.f7788p + this.f7786n);
            if (Math.abs(i12 - c2.itemView.getTop()) >= c2.itemView.getHeight() * moveThreshold || Math.abs(i11 - c2.itemView.getLeft()) >= c2.itemView.getWidth() * moveThreshold) {
                ArrayList arrayList = this.f7798z;
                if (arrayList == null) {
                    this.f7798z = new ArrayList();
                    this.f7772A = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f7772A.clear();
                }
                int boundingBoxMargin = dVar.getBoundingBoxMargin();
                int round = Math.round(this.f7787o + this.f7785m) - boundingBoxMargin;
                int round2 = Math.round(this.f7788p + this.f7786n) - boundingBoxMargin;
                int i13 = boundingBoxMargin * 2;
                int width = c2.itemView.getWidth() + round + i13;
                int height = c2.itemView.getHeight() + round2 + i13;
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                RecyclerView.n layoutManager = this.f7795w.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i16 = 0;
                while (i16 < childCount) {
                    View childAt = layoutManager.getChildAt(i16);
                    if (childAt != c2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        RecyclerView.C childViewHolder = this.f7795w.getChildViewHolder(childAt);
                        i = round;
                        i9 = round2;
                        if (dVar.canDropOver(this.f7795w, this.f7781h, childViewHolder)) {
                            int abs = Math.abs(i14 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int abs2 = Math.abs(i15 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i17 = (abs2 * abs2) + (abs * abs);
                            int size = this.f7798z.size();
                            i10 = i14;
                            int i18 = 0;
                            int i19 = 0;
                            while (i19 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.f7772A.get(i19)).intValue()) {
                                    break;
                                }
                                i18++;
                                i19++;
                                size = i20;
                            }
                            this.f7798z.add(i18, childViewHolder);
                            this.f7772A.add(i18, Integer.valueOf(i17));
                        } else {
                            i10 = i14;
                        }
                    } else {
                        i10 = i14;
                        i = round;
                        i9 = round2;
                    }
                    i16++;
                    round = i;
                    round2 = i9;
                    i14 = i10;
                }
                ArrayList arrayList2 = this.f7798z;
                if (arrayList2.size() == 0) {
                    return;
                }
                RecyclerView.C chooseDropTarget = dVar.chooseDropTarget(c2, arrayList2, i11, i12);
                if (chooseDropTarget == null) {
                    this.f7798z.clear();
                    this.f7772A.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = c2.getAbsoluteAdapterPosition();
                if (dVar.onMove(this.f7795w, c2, chooseDropTarget)) {
                    this.f7790r.onMoved(this.f7795w, c2, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i11, i12);
                }
            }
        }
    }

    public final void m(View view) {
        if (view == this.f7773B) {
            this.f7773B = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0095, code lost:
    
        if (r2 > 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.recyclerview.widget.RecyclerView.C r25, int r26) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.u.n(androidx.recyclerview.widget.RecyclerView$C, int):void");
    }

    public final void o(int i, int i9, MotionEvent motionEvent) {
        float x9 = motionEvent.getX(i9);
        float y10 = motionEvent.getY(i9);
        float f10 = x9 - this.i;
        this.f7785m = f10;
        this.f7786n = y10 - this.f7782j;
        if ((i & 4) == 0) {
            this.f7785m = Math.max(0.0f, f10);
        }
        if ((i & 8) == 0) {
            this.f7785m = Math.min(0.0f, this.f7785m);
        }
        if ((i & 1) == 0) {
            this.f7786n = Math.max(0.0f, this.f7786n);
        }
        if ((i & 2) == 0) {
            this.f7786n = Math.min(0.0f, this.f7786n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onChildViewDetachedFromWindow(View view) {
        m(view);
        RecyclerView.C childViewHolder = this.f7795w.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.C c2 = this.f7781h;
        if (c2 != null && childViewHolder == c2) {
            n(null, 0);
            return;
        }
        h(childViewHolder, false);
        if (this.f7779f.remove(childViewHolder.itemView)) {
            this.f7790r.clearView(this.f7795w, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        float f10;
        float f11;
        if (this.f7781h != null) {
            float[] fArr = this.f7780g;
            j(fArr);
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f7790r.onDraw(canvas, recyclerView, this.f7781h, this.f7793u, this.f7791s, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        float f10;
        float f11;
        if (this.f7781h != null) {
            float[] fArr = this.f7780g;
            j(fArr);
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f7790r.onDrawOver(canvas, recyclerView, this.f7781h, this.f7793u, this.f7791s, f10, f11);
    }

    /* compiled from: ItemTouchHelper.java */
    public static abstract class d {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* compiled from: ItemTouchHelper.java */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i9) {
            int i10;
            int i11 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i11 == 0) {
                return i;
            }
            int i12 = i & (~i11);
            if (i9 == 0) {
                i10 = i11 << 2;
            } else {
                int i13 = i11 << 1;
                i12 |= (-789517) & i13;
                i10 = (i13 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i12 | i10;
        }

        public static x getDefaultUIUtil() {
            return y.f7822a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i9) {
            return i9 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i9) {
            return makeFlag(2, i) | makeFlag(1, i9) | makeFlag(0, i9 | i);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.C c2, RecyclerView.C c10) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.C chooseDropTarget(RecyclerView.C c2, List<RecyclerView.C> list, int i, int i9) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = c2.itemView.getWidth() + i;
            int height = c2.itemView.getHeight() + i9;
            int left2 = i - c2.itemView.getLeft();
            int top2 = i9 - c2.itemView.getTop();
            int size = list.size();
            RecyclerView.C c10 = null;
            int i10 = -1;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView.C c11 = list.get(i11);
                if (left2 > 0 && (right = c11.itemView.getRight() - width) < 0 && c11.itemView.getRight() > c2.itemView.getRight() && (abs4 = Math.abs(right)) > i10) {
                    c10 = c11;
                    i10 = abs4;
                }
                if (left2 < 0 && (left = c11.itemView.getLeft() - i) > 0 && c11.itemView.getLeft() < c2.itemView.getLeft() && (abs3 = Math.abs(left)) > i10) {
                    c10 = c11;
                    i10 = abs3;
                }
                if (top2 < 0 && (top = c11.itemView.getTop() - i9) > 0 && c11.itemView.getTop() < c2.itemView.getTop() && (abs2 = Math.abs(top)) > i10) {
                    c10 = c11;
                    i10 = abs2;
                }
                if (top2 > 0 && (bottom = c11.itemView.getBottom() - height) < 0 && c11.itemView.getBottom() > c2.itemView.getBottom() && (abs = Math.abs(bottom)) > i10) {
                    c10 = c11;
                    i10 = abs;
                }
            }
            return c10;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.C c2) {
            View view = c2.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                C1596C.d.l(view, floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i, int i9) {
            int i10;
            int i11 = i & RELATIVE_DIR_FLAGS;
            if (i11 == 0) {
                return i;
            }
            int i12 = i & (~i11);
            if (i9 == 0) {
                i10 = i11 >> 2;
            } else {
                int i13 = i11 >> 1;
                i12 |= (-3158065) & i13;
                i10 = (i13 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i12 | i10;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.C c2) {
            int movementFlags = getMovementFlags(recyclerView, c2);
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f10, float f11) {
            RecyclerView.k itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.f7495e : itemAnimator.f7494d;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.C c2) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.C c2);

        public float getSwipeThreshold(RecyclerView.C c2) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.C c2) {
            return (getAbsoluteMovementFlags(recyclerView, c2) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.C c2) {
            return (getAbsoluteMovementFlags(recyclerView, c2) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i9, int i10, long j10) {
            int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j10 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j10 / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i9) * 1.0f) / i)) * ((int) Math.signum(i9)) * getMaxDragScroll(recyclerView))));
            return interpolation == 0 ? i9 > 0 ? 1 : -1 : interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c2, float f10, float f11, int i, boolean z10) {
            View view = c2.itemView;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                Float valueOf = Float.valueOf(C1596C.d.e(view));
                int childCount = recyclerView.getChildCount();
                float f12 = 0.0f;
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = recyclerView.getChildAt(i9);
                    if (childAt != view) {
                        WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
                        float e10 = C1596C.d.e(childAt);
                        if (e10 > f12) {
                            f12 = e10;
                        }
                    }
                }
                C1596C.d.l(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f10);
            view.setTranslationY(f11);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.C c2, float f10, float f11, int i, boolean z10) {
            View view = c2.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c2, List<f> list, int i, float f10, float f11) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                f fVar = list.get(i9);
                float f12 = fVar.f7806a;
                float f13 = fVar.f7808c;
                RecyclerView.C c10 = fVar.f7810e;
                if (f12 == f13) {
                    fVar.i = c10.itemView.getTranslationX();
                } else {
                    fVar.i = com.google.android.gms.measurement.internal.a.d(f13, f12, fVar.f7817m, f12);
                }
                float f14 = fVar.f7807b;
                float f15 = fVar.f7809d;
                if (f14 == f15) {
                    fVar.f7814j = c10.itemView.getTranslationY();
                } else {
                    fVar.f7814j = com.google.android.gms.measurement.internal.a.d(f15, f14, fVar.f7817m, f14);
                }
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.f7810e, fVar.i, fVar.f7814j, fVar.f7811f, false);
                canvas.restoreToCount(save);
            }
            if (c2 != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, c2, f10, f11, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c2, List<f> list, int i, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i9 = 0; i9 < size; i9++) {
                f fVar = list.get(i9);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.f7810e, fVar.i, fVar.f7814j, fVar.f7811f, false);
                canvas.restoreToCount(save);
            }
            if (c2 != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, c2, f10, f11, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i10 = size - 1; i10 >= 0; i10--) {
                f fVar2 = list.get(i10);
                boolean z11 = fVar2.f7816l;
                if (z11 && !fVar2.f7813h) {
                    list.remove(i10);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.C c2, RecyclerView.C c10);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.C c2, int i, RecyclerView.C c10, int i9, int i10, int i11) {
            RecyclerView.n layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof g) {
                ((g) layoutManager).prepareForDrop(c2.itemView, c10.itemView, i10, i11);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(c10.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i9);
                }
                if (layoutManager.getDecoratedRight(c10.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i9);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(c10.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i9);
                }
                if (layoutManager.getDecoratedBottom(c10.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i9);
                }
            }
        }

        public abstract void onSwiped(RecyclerView.C c2, int i);

        public float getSwipeEscapeVelocity(float f10) {
            return f10;
        }

        public float getSwipeVelocityThreshold(float f10) {
            return f10;
        }

        public void onSelectedChanged(RecyclerView.C c2, int i) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final float f7806a;

        /* renamed from: b, reason: collision with root package name */
        public final float f7807b;

        /* renamed from: c, reason: collision with root package name */
        public final float f7808c;

        /* renamed from: d, reason: collision with root package name */
        public final float f7809d;

        /* renamed from: e, reason: collision with root package name */
        public final RecyclerView.C f7810e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7811f;

        /* renamed from: g, reason: collision with root package name */
        public final ValueAnimator f7812g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7813h;
        public float i;

        /* renamed from: j, reason: collision with root package name */
        public float f7814j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f7815k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f7816l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f7817m;

        public f(RecyclerView.C c2, int i, float f10, float f11, float f12, float f13) {
            this.f7811f = i;
            this.f7810e = c2;
            this.f7806a = f10;
            this.f7807b = f11;
            this.f7808c = f12;
            this.f7809d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f7812g = ofFloat;
            ofFloat.addUpdateListener(new w(this));
            ofFloat.setTarget(c2.itemView);
            ofFloat.addListener(this);
            this.f7817m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f7817m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f7816l) {
                this.f7810e.setIsRecyclable(true);
            }
            this.f7816l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void onChildViewAttachedToWindow(View view) {
    }
}
