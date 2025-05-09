package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.messaging.ServiceStarter;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class s extends RecyclerView.m implements RecyclerView.r {

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f7723H = {R.attr.state_pressed};

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f7724I = new int[0];

    /* renamed from: E, reason: collision with root package name */
    public final ValueAnimator f7729E;

    /* renamed from: F, reason: collision with root package name */
    public int f7730F;

    /* renamed from: G, reason: collision with root package name */
    public final a f7731G;

    /* renamed from: f, reason: collision with root package name */
    public final int f7732f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7733g;

    /* renamed from: h, reason: collision with root package name */
    public final StateListDrawable f7734h;
    public final Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7735j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7736k;

    /* renamed from: l, reason: collision with root package name */
    public final StateListDrawable f7737l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f7738m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7739n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7740o;

    /* renamed from: p, reason: collision with root package name */
    public int f7741p;

    /* renamed from: q, reason: collision with root package name */
    public int f7742q;

    /* renamed from: r, reason: collision with root package name */
    public float f7743r;

    /* renamed from: s, reason: collision with root package name */
    public int f7744s;

    /* renamed from: t, reason: collision with root package name */
    public int f7745t;

    /* renamed from: u, reason: collision with root package name */
    public float f7746u;

    /* renamed from: x, reason: collision with root package name */
    public final RecyclerView f7749x;

    /* renamed from: v, reason: collision with root package name */
    public int f7747v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f7748w = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7750y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7751z = false;

    /* renamed from: A, reason: collision with root package name */
    public int f7725A = 0;

    /* renamed from: B, reason: collision with root package name */
    public int f7726B = 0;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f7727C = new int[2];

    /* renamed from: D, reason: collision with root package name */
    public final int[] f7728D = new int[2];

    /* compiled from: FastScroller.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s sVar = s.this;
            int i = sVar.f7730F;
            ValueAnimator valueAnimator = sVar.f7729E;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            sVar.f7730F = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(ServiceStarter.ERROR_UNKNOWN);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void onScrolled(RecyclerView recyclerView, int i, int i9) {
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            s sVar = s.this;
            int computeVerticalScrollRange = sVar.f7749x.computeVerticalScrollRange();
            int i10 = sVar.f7748w;
            int i11 = computeVerticalScrollRange - i10;
            int i12 = sVar.f7732f;
            sVar.f7750y = i11 > 0 && i10 >= i12;
            int computeHorizontalScrollRange = sVar.f7749x.computeHorizontalScrollRange();
            int i13 = sVar.f7747v;
            boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= i12;
            sVar.f7751z = z10;
            boolean z11 = sVar.f7750y;
            if (!z11 && !z10) {
                if (sVar.f7725A != 0) {
                    sVar.g(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f10 = i10;
                sVar.f7742q = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                sVar.f7741p = Math.min(i10, (i10 * i10) / computeVerticalScrollRange);
            }
            if (sVar.f7751z) {
                float f11 = computeHorizontalScrollOffset;
                float f12 = i13;
                sVar.f7745t = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
                sVar.f7744s = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
            }
            int i14 = sVar.f7725A;
            if (i14 == 0 || i14 == 1) {
                sVar.g(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7754a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f7754a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f7754a) {
                this.f7754a = false;
                return;
            }
            s sVar = s.this;
            if (((Float) sVar.f7729E.getAnimatedValue()).floatValue() == 0.0f) {
                sVar.f7730F = 0;
                sVar.g(0);
            } else {
                sVar.f7730F = 2;
                sVar.f7749x.invalidate();
            }
        }
    }

    /* compiled from: FastScroller.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            s sVar = s.this;
            sVar.f7734h.setAlpha(floatValue);
            sVar.i.setAlpha(floatValue);
            sVar.f7749x.invalidate();
        }
    }

    public s(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i9, int i10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7729E = ofFloat;
        this.f7730F = 0;
        a aVar = new a();
        this.f7731G = aVar;
        b bVar = new b();
        this.f7734h = stateListDrawable;
        this.i = drawable;
        this.f7737l = stateListDrawable2;
        this.f7738m = drawable2;
        this.f7735j = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f7736k = Math.max(i, drawable.getIntrinsicWidth());
        this.f7739n = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f7740o = Math.max(i, drawable2.getIntrinsicWidth());
        this.f7732f = i9;
        this.f7733g = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f7749x;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f7749x.removeOnItemTouchListener(this);
            this.f7749x.removeOnScrollListener(bVar);
            this.f7749x.removeCallbacks(aVar);
        }
        this.f7749x = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f7749x.addOnItemTouchListener(this);
            this.f7749x.addOnScrollListener(bVar);
        }
    }

    public static int f(float f10, float f11, int[] iArr, int i, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 == 0) {
            return 0;
        }
        int i12 = i - i10;
        int i13 = (int) (((f11 - f10) / i11) * i12);
        int i14 = i9 + i13;
        if (i14 >= i12 || i14 < 0) {
            return 0;
        }
        return i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(MotionEvent motionEvent) {
        if (this.f7725A == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean e10 = e(motionEvent.getX(), motionEvent.getY());
            boolean d10 = d(motionEvent.getX(), motionEvent.getY());
            if (e10 || d10) {
                if (d10) {
                    this.f7726B = 1;
                    this.f7746u = (int) motionEvent.getX();
                } else if (e10) {
                    this.f7726B = 2;
                    this.f7743r = (int) motionEvent.getY();
                }
                g(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f7725A == 2) {
            this.f7743r = 0.0f;
            this.f7746u = 0.0f;
            g(1);
            this.f7726B = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f7725A == 2) {
            h();
            int i = this.f7726B;
            int i9 = this.f7733g;
            if (i == 1) {
                float x9 = motionEvent.getX();
                int[] iArr = this.f7728D;
                iArr[0] = i9;
                int i10 = this.f7747v - i9;
                iArr[1] = i10;
                float max = Math.max(i9, Math.min(i10, x9));
                if (Math.abs(this.f7745t - max) >= 2.0f) {
                    int f10 = f(this.f7746u, max, iArr, this.f7749x.computeHorizontalScrollRange(), this.f7749x.computeHorizontalScrollOffset(), this.f7747v);
                    if (f10 != 0) {
                        this.f7749x.scrollBy(f10, 0);
                    }
                    this.f7746u = max;
                }
            }
            if (this.f7726B == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f7727C;
                iArr2[0] = i9;
                int i11 = this.f7748w - i9;
                iArr2[1] = i11;
                float max2 = Math.max(i9, Math.min(i11, y10));
                if (Math.abs(this.f7742q - max2) < 2.0f) {
                    return;
                }
                int f11 = f(this.f7743r, max2, iArr2, this.f7749x.computeVerticalScrollRange(), this.f7749x.computeVerticalScrollOffset(), this.f7748w);
                if (f11 != 0) {
                    this.f7749x.scrollBy(0, f11);
                }
                this.f7743r = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final boolean b(MotionEvent motionEvent) {
        int i = this.f7725A;
        if (i == 1) {
            boolean e10 = e(motionEvent.getX(), motionEvent.getY());
            boolean d10 = d(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!e10 && !d10) {
                return false;
            }
            if (d10) {
                this.f7726B = 1;
                this.f7746u = (int) motionEvent.getX();
            } else if (e10) {
                this.f7726B = 2;
                this.f7743r = (int) motionEvent.getY();
            }
            g(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final boolean d(float f10, float f11) {
        if (f11 >= this.f7748w - this.f7739n) {
            int i = this.f7745t;
            int i9 = this.f7744s;
            if (f10 >= i - (i9 / 2) && f10 <= (i9 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(float f10, float f11) {
        RecyclerView recyclerView = this.f7749x;
        WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
        boolean z10 = recyclerView.getLayoutDirection() == 1;
        int i = this.f7735j;
        if (z10) {
            if (f10 > i) {
                return false;
            }
        } else if (f10 < this.f7747v - i) {
            return false;
        }
        int i9 = this.f7742q;
        int i10 = this.f7741p / 2;
        return f11 >= ((float) (i9 - i10)) && f11 <= ((float) (i10 + i9));
    }

    public final void g(int i) {
        a aVar = this.f7731G;
        StateListDrawable stateListDrawable = this.f7734h;
        if (i == 2 && this.f7725A != 2) {
            stateListDrawable.setState(f7723H);
            this.f7749x.removeCallbacks(aVar);
        }
        if (i == 0) {
            this.f7749x.invalidate();
        } else {
            h();
        }
        if (this.f7725A == 2 && i != 2) {
            stateListDrawable.setState(f7724I);
            this.f7749x.removeCallbacks(aVar);
            this.f7749x.postDelayed(aVar, 1200);
        } else if (i == 1) {
            this.f7749x.removeCallbacks(aVar);
            this.f7749x.postDelayed(aVar, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f7725A = i;
    }

    public final void h() {
        int i = this.f7730F;
        ValueAnimator valueAnimator = this.f7729E;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7730F = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        int i = this.f7747v;
        RecyclerView recyclerView2 = this.f7749x;
        if (i != recyclerView2.getWidth() || this.f7748w != recyclerView2.getHeight()) {
            this.f7747v = recyclerView2.getWidth();
            this.f7748w = recyclerView2.getHeight();
            g(0);
            return;
        }
        if (this.f7730F != 0) {
            if (this.f7750y) {
                int i9 = this.f7747v;
                int i10 = this.f7735j;
                int i11 = i9 - i10;
                int i12 = this.f7742q;
                int i13 = this.f7741p;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f7734h;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.f7748w;
                int i16 = this.f7736k;
                Drawable drawable = this.i;
                drawable.setBounds(0, 0, i16, i15);
                WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i10, i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i10, -i14);
                } else {
                    canvas.translate(i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i14);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i11, -i14);
                }
            }
            if (this.f7751z) {
                int i17 = this.f7748w;
                int i18 = this.f7739n;
                int i19 = i17 - i18;
                int i20 = this.f7745t;
                int i21 = this.f7744s;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.f7737l;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.f7747v;
                int i24 = this.f7740o;
                Drawable drawable2 = this.f7738m;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, i19);
                drawable2.draw(canvas);
                canvas.translate(i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i22, -i19);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void c(boolean z10) {
    }
}
