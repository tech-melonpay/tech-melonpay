package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.util.HashMap;
import k1.AbstractC0919C;

/* compiled from: ChangeBounds.java */
/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923d extends AbstractC0919C {

    /* renamed from: L, reason: collision with root package name */
    public static final String[] f22816L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: M, reason: collision with root package name */
    public static final a f22817M = new a(PointF.class, "topLeft");

    /* renamed from: N, reason: collision with root package name */
    public static final b f22818N = new b(PointF.class, "bottomRight");

    /* renamed from: O, reason: collision with root package name */
    public static final c f22819O = new c(PointF.class, "bottomRight");

    /* renamed from: P, reason: collision with root package name */
    public static final C0421d f22820P = new C0421d(PointF.class, "topLeft");

    /* renamed from: Q, reason: collision with root package name */
    public static final e f22821Q = new e(PointF.class, "position");
    public static final I2.a R = new I2.a(2);

    /* renamed from: K, reason: collision with root package name */
    public boolean f22822K = false;

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$a */
    public class a extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f22838a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f22839b = round;
            int i = iVar2.f22843f + 1;
            iVar2.f22843f = i;
            if (i == iVar2.f22844g) {
                P.a(iVar2.f22842e, iVar2.f22838a, round, iVar2.f22840c, iVar2.f22841d);
                iVar2.f22843f = 0;
                iVar2.f22844g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$b */
    public class b extends Property<i, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f22840c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f22841d = round;
            int i = iVar2.f22844g + 1;
            iVar2.f22844g = i;
            if (iVar2.f22843f == i) {
                P.a(iVar2.f22842e, iVar2.f22838a, iVar2.f22839b, iVar2.f22840c, round);
                iVar2.f22843f = 0;
                iVar2.f22844g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$c */
    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            P.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$d, reason: collision with other inner class name */
    public class C0421d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            P.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$e */
    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            P.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$f */
    public class f extends AnimatorListenerAdapter {
        private final i mViewBounds;

        public f(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$g */
    public static class g extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final View f22823a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f22824b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22825c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f22826d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f22827e;

        /* renamed from: f, reason: collision with root package name */
        public final int f22828f;

        /* renamed from: g, reason: collision with root package name */
        public final int f22829g;

        /* renamed from: h, reason: collision with root package name */
        public final int f22830h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f22831j;

        /* renamed from: k, reason: collision with root package name */
        public final int f22832k;

        /* renamed from: l, reason: collision with root package name */
        public final int f22833l;

        /* renamed from: m, reason: collision with root package name */
        public final int f22834m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f22835n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f22823a = view;
            this.f22824b = rect;
            this.f22825c = z10;
            this.f22826d = rect2;
            this.f22827e = z11;
            this.f22828f = i;
            this.f22829g = i9;
            this.f22830h = i10;
            this.i = i11;
            this.f22831j = i12;
            this.f22832k = i13;
            this.f22833l = i14;
            this.f22834m = i15;
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
            this.f22835n = true;
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
            View view = this.f22823a;
            view.setTag(R.id.transition_clip, view.getClipBounds());
            view.setClipBounds(this.f22827e ? null : this.f22826d);
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
            View view = this.f22823a;
            Rect rect = (Rect) view.getTag(R.id.transition_clip);
            view.setTag(R.id.transition_clip, null);
            view.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f22835n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f22825c) {
                    rect = this.f22824b;
                }
            } else if (!this.f22827e) {
                rect = this.f22826d;
            }
            View view = this.f22823a;
            view.setClipBounds(rect);
            if (z10) {
                P.a(view, this.f22828f, this.f22829g, this.f22830h, this.i);
            } else {
                P.a(view, this.f22831j, this.f22832k, this.f22833l, this.f22834m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            int i = this.f22830h;
            int i9 = this.f22828f;
            int i10 = this.f22833l;
            int i11 = this.f22831j;
            int max = Math.max(i - i9, i10 - i11);
            int i12 = this.i;
            int i13 = this.f22829g;
            int i14 = this.f22834m;
            int i15 = this.f22832k;
            int max2 = Math.max(i12 - i13, i14 - i15);
            if (z10) {
                i9 = i11;
            }
            if (z10) {
                i13 = i15;
            }
            View view = this.f22823a;
            P.a(view, i9, i13, max + i9, max2 + i13);
            view.setClipBounds(z10 ? this.f22826d : this.f22824b);
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$h */
    public static class h extends G {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22836a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f22837b;

        public h(ViewGroup viewGroup) {
            this.f22837b = viewGroup;
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
            O.a(this.f22837b, false);
            this.f22836a = true;
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void c() {
            O.a(this.f22837b, false);
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            if (!this.f22836a) {
                O.a(this.f22837b, false);
            }
            abstractC0919C.G(this);
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void j() {
            O.a(this.f22837b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: k1.d$i */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f22838a;

        /* renamed from: b, reason: collision with root package name */
        public int f22839b;

        /* renamed from: c, reason: collision with root package name */
        public int f22840c;

        /* renamed from: d, reason: collision with root package name */
        public int f22841d;

        /* renamed from: e, reason: collision with root package name */
        public final View f22842e;

        /* renamed from: f, reason: collision with root package name */
        public int f22843f;

        /* renamed from: g, reason: collision with root package name */
        public int f22844g;

        public i(View view) {
            this.f22842e = view;
        }
    }

    public final void T(L l10) {
        View view = l10.f22762b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = l10.f22761a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", l10.f22762b.getParent());
        if (this.f22822K) {
            hashMap.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        T(l10);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        Rect rect;
        T(l10);
        if (!this.f22822K || (rect = (Rect) l10.f22762b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        l10.f22761a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d0  */
    @Override // k1.AbstractC0919C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator n(android.view.ViewGroup r25, k1.L r26, k1.L r27) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C0923d.n(android.view.ViewGroup, k1.L, k1.L):android.animation.Animator");
    }

    @Override // k1.AbstractC0919C
    public final String[] w() {
        return f22816L;
    }
}
