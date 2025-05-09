package B0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.google.firebase.messaging.ServiceStarter;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: q, reason: collision with root package name */
    public static final int f189q = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final C0001a f190a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f191b;

    /* renamed from: c, reason: collision with root package name */
    public final View f192c;

    /* renamed from: d, reason: collision with root package name */
    public b f193d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f194e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f195f;

    /* renamed from: g, reason: collision with root package name */
    public final int f196g;

    /* renamed from: h, reason: collision with root package name */
    public final int f197h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f198j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f199k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f200l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f201m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f202n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f203o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f204p;

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: B0.a$a, reason: collision with other inner class name */
    public static class C0001a {

        /* renamed from: a, reason: collision with root package name */
        public int f205a;

        /* renamed from: b, reason: collision with root package name */
        public int f206b;

        /* renamed from: c, reason: collision with root package name */
        public float f207c;

        /* renamed from: d, reason: collision with root package name */
        public float f208d;

        /* renamed from: e, reason: collision with root package name */
        public long f209e;

        /* renamed from: f, reason: collision with root package name */
        public long f210f;

        /* renamed from: g, reason: collision with root package name */
        public long f211g;

        /* renamed from: h, reason: collision with root package name */
        public float f212h;
        public int i;

        public final float a(long j10) {
            if (j10 < this.f209e) {
                return 0.0f;
            }
            long j11 = this.f211g;
            if (j11 < 0 || j10 < j11) {
                return a.b((j10 - r0) / this.f205a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f212h;
            return (a.b((j10 - j11) / this.i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* compiled from: AutoScrollHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f203o) {
                boolean z10 = aVar.f201m;
                C0001a c0001a = aVar.f190a;
                if (z10) {
                    aVar.f201m = false;
                    c0001a.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0001a.f209e = currentAnimationTimeMillis;
                    c0001a.f211g = -1L;
                    c0001a.f210f = currentAnimationTimeMillis;
                    c0001a.f212h = 0.5f;
                }
                if ((c0001a.f211g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0001a.f211g + c0001a.i) || !aVar.e()) {
                    aVar.f203o = false;
                    return;
                }
                boolean z11 = aVar.f202n;
                View view = aVar.f192c;
                if (z11) {
                    aVar.f202n = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0001a.f210f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float a10 = c0001a.a(currentAnimationTimeMillis2);
                long j10 = currentAnimationTimeMillis2 - c0001a.f210f;
                c0001a.f210f = currentAnimationTimeMillis2;
                ((c) aVar).f214r.scrollListBy((int) (j10 * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0001a.f208d));
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                view.postOnAnimation(this);
            }
        }
    }

    public a(View view) {
        C0001a c0001a = new C0001a();
        c0001a.f209e = Long.MIN_VALUE;
        c0001a.f211g = -1L;
        c0001a.f210f = 0L;
        this.f190a = c0001a;
        this.f191b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f194e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f195f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f198j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f199k = fArr5;
        this.f192c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f196g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f197h = f189q;
        c0001a.f205a = ServiceStarter.ERROR_UNKNOWN;
        c0001a.f206b = ServiceStarter.ERROR_UNKNOWN;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f194e
            r0 = r0[r7]
            float[] r1 = r3.f195f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f191b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.i
            r0 = r0[r7]
            float[] r1 = r3.f198j
            r1 = r1[r7]
            float[] r2 = r3.f199k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i = this.f196g;
        if (i == 0 || i == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f203o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.f201m) {
            this.f203o = false;
            return;
        }
        C0001a c0001a = this.f190a;
        c0001a.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i9 = (int) (currentAnimationTimeMillis - c0001a.f209e);
        int i10 = c0001a.f206b;
        if (i9 > i10) {
            i = i10;
        } else if (i9 >= 0) {
            i = i9;
        }
        c0001a.i = i;
        c0001a.f212h = c0001a.a(currentAnimationTimeMillis);
        c0001a.f211g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        C0001a c0001a = this.f190a;
        float f10 = c0001a.f208d;
        int abs = (int) (f10 / Math.abs(f10));
        Math.abs(c0001a.f207c);
        if (abs == 0 || (count = (listView = ((c) this).f214r).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f204p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f202n = r2
            r7.f200l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f192c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            B0.a$a r9 = r7.f190a
            r9.f207c = r0
            r9.f208d = r8
            boolean r8 = r7.f203o
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            B0.a$b r8 = r7.f193d
            if (r8 != 0) goto L5f
            B0.a$b r8 = new B0.a$b
            r8.<init>()
            r7.f193d = r8
        L5f:
            r7.f203o = r2
            r7.f201m = r2
            boolean r8 = r7.f200l
            if (r8 != 0) goto L74
            int r8 = r7.f197h
            if (r8 <= 0) goto L74
            B0.a$b r9 = r7.f193d
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, y0.E> r8 = y0.C1596C.f30963a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            B0.a$b r8 = r7.f193d
            r8.run()
        L79:
            r7.f200l = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
