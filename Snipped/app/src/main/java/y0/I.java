package y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.J;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public e f30982a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n0.b f30983a;

        /* renamed from: b, reason: collision with root package name */
        public final n0.b f30984b;

        public a(n0.b bVar, n0.b bVar2) {
            this.f30983a = bVar;
            this.f30984b = bVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f30983a + " upper=" + this.f30984b + "}";
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public WindowInsets f30985a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30986b = 0;

        public abstract J a(J j10, List<I> list);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f30987e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final P0.a f30988f = new P0.a(0);

        /* renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f30989g = new DecelerateInterpolator();

        /* compiled from: WindowInsetsAnimationCompat.java */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f30990a;

            /* renamed from: b, reason: collision with root package name */
            public J f30991b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: y0.I$c$a$a, reason: collision with other inner class name */
            public class C0479a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ I f30992a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ J f30993b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ J f30994c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f30995d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f30996e;

                public C0479a(I i, J j10, J j11, int i9, View view) {
                    this.f30992a = i;
                    this.f30993b = j10;
                    this.f30994c = j11;
                    this.f30995d = i9;
                    this.f30996e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f10;
                    I i;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    I i9 = this.f30992a;
                    i9.f30982a.d(animatedFraction);
                    float b9 = i9.f30982a.b();
                    PathInterpolator pathInterpolator = c.f30987e;
                    int i10 = Build.VERSION.SDK_INT;
                    J j10 = this.f30993b;
                    J.d cVar = i10 >= 30 ? new J.c(j10) : i10 >= 29 ? new J.b(j10) : new J.a(j10);
                    int i11 = 1;
                    while (i11 <= 256) {
                        if ((this.f30995d & i11) == 0) {
                            cVar.c(i11, j10.f31013a.f(i11));
                            f10 = b9;
                            i = i9;
                        } else {
                            n0.b f11 = j10.f31013a.f(i11);
                            n0.b f12 = this.f30994c.f31013a.f(i11);
                            int i12 = (int) (((f11.f24066a - f12.f24066a) * r10) + 0.5d);
                            int i13 = (int) (((f11.f24067b - f12.f24067b) * r10) + 0.5d);
                            f10 = b9;
                            int i14 = (int) (((f11.f24068c - f12.f24068c) * r10) + 0.5d);
                            float f13 = (f11.f24069d - f12.f24069d) * (1.0f - b9);
                            i = i9;
                            cVar.c(i11, J.e(f11, i12, i13, i14, (int) (f13 + 0.5d)));
                        }
                        i11 <<= 1;
                        b9 = f10;
                        i9 = i;
                    }
                    c.g(this.f30996e, cVar.b(), Collections.singletonList(i9));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ I f30997a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f30998b;

                public b(View view, I i) {
                    this.f30997a = i;
                    this.f30998b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    I i = this.f30997a;
                    i.f30982a.d(1.0f);
                    c.e(this.f30998b, i);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: y0.I$c$a$c, reason: collision with other inner class name */
            public class RunnableC0480c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f30999a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f31000b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ a f31001c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f31002d;

                public RunnableC0480c(View view, I i, a aVar, ValueAnimator valueAnimator) {
                    this.f30999a = view;
                    this.f31000b = i;
                    this.f31001c = aVar;
                    this.f31002d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.f30999a, this.f31000b, this.f31001c);
                    this.f31002d.start();
                }
            }

            public a(View view, com.google.android.material.bottomsheet.g gVar) {
                J j10;
                this.f30990a = gVar;
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                J a10 = C1596C.e.a(view);
                if (a10 != null) {
                    int i = Build.VERSION.SDK_INT;
                    j10 = (i >= 30 ? new J.c(a10) : i >= 29 ? new J.b(a10) : new J.a(a10)).b();
                } else {
                    j10 = null;
                }
                this.f30991b = j10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                J.j jVar;
                if (!view.isLaidOut()) {
                    this.f30991b = J.h(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                J h9 = J.h(view, windowInsets);
                if (this.f30991b == null) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    this.f30991b = C1596C.e.a(view);
                }
                if (this.f30991b == null) {
                    this.f30991b = h9;
                    return c.i(view, windowInsets);
                }
                b j10 = c.j(view);
                if (j10 != null && Objects.equals(j10.f30985a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                J j11 = this.f30991b;
                int i = 1;
                int i9 = 0;
                while (true) {
                    jVar = h9.f31013a;
                    if (i > 256) {
                        break;
                    }
                    if (!jVar.f(i).equals(j11.f31013a.f(i))) {
                        i9 |= i;
                    }
                    i <<= 1;
                }
                if (i9 == 0) {
                    return c.i(view, windowInsets);
                }
                J j12 = this.f30991b;
                I i10 = new I(i9, (i9 & 8) != 0 ? jVar.f(8).f24069d > j12.f31013a.f(8).f24069d ? c.f30987e : c.f30988f : c.f30989g, 160L);
                i10.f30982a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(i10.f30982a.a());
                n0.b f10 = jVar.f(i9);
                n0.b f11 = j12.f31013a.f(i9);
                int min = Math.min(f10.f24066a, f11.f24066a);
                int i11 = f10.f24067b;
                int i12 = f11.f24067b;
                int min2 = Math.min(i11, i12);
                int i13 = f10.f24068c;
                int i14 = f11.f24068c;
                int min3 = Math.min(i13, i14);
                int i15 = f10.f24069d;
                int i16 = i9;
                int i17 = f11.f24069d;
                a aVar = new a(n0.b.b(min, min2, min3, Math.min(i15, i17)), n0.b.b(Math.max(f10.f24066a, f11.f24066a), Math.max(i11, i12), Math.max(i13, i14), Math.max(i15, i17)));
                c.f(view, i10, windowInsets, false);
                duration.addUpdateListener(new C0479a(i10, h9, j12, i16, view));
                duration.addListener(new b(view, i10));
                s.a(view, new RunnableC0480c(view, i10, aVar, duration));
                this.f30991b = h9;
                return c.i(view, windowInsets);
            }
        }

        public static void e(View view, I i) {
            b j10 = j(view);
            if (j10 != null) {
                ((com.google.android.material.bottomsheet.g) j10).f9190c.setTranslationY(0.0f);
                if (j10.f30986b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    e(viewGroup.getChildAt(i9), i);
                }
            }
        }

        public static void f(View view, I i, WindowInsets windowInsets, boolean z10) {
            b j10 = j(view);
            if (j10 != null) {
                j10.f30985a = windowInsets;
                if (!z10) {
                    com.google.android.material.bottomsheet.g gVar = (com.google.android.material.bottomsheet.g) j10;
                    View view2 = gVar.f9190c;
                    int[] iArr = gVar.f9193f;
                    view2.getLocationOnScreen(iArr);
                    gVar.f9191d = iArr[1];
                    z10 = j10.f30986b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    f(viewGroup.getChildAt(i9), i, windowInsets, z10);
                }
            }
        }

        public static void g(View view, J j10, List<I> list) {
            b j11 = j(view);
            if (j11 != null) {
                j11.a(j10, list);
                if (j11.f30986b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), j10, list);
                }
            }
        }

        public static void h(View view, I i, a aVar) {
            b j10 = j(view);
            if (j10 != null) {
                com.google.android.material.bottomsheet.g gVar = (com.google.android.material.bottomsheet.g) j10;
                View view2 = gVar.f9190c;
                int[] iArr = gVar.f9193f;
                view2.getLocationOnScreen(iArr);
                int i9 = gVar.f9191d - iArr[1];
                gVar.f9192e = i9;
                view2.setTranslationY(i9);
                if (j10.f30986b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    h(viewGroup.getChildAt(i10), i, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f30990a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f31003e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final b f31004a;

            /* renamed from: b, reason: collision with root package name */
            public List<I> f31005b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList<I> f31006c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, I> f31007d;

            public a(com.google.android.material.bottomsheet.g gVar) {
                super(gVar.f30986b);
                this.f31007d = new HashMap<>();
                this.f31004a = gVar;
            }

            public final I a(WindowInsetsAnimation windowInsetsAnimation) {
                I i = this.f31007d.get(windowInsetsAnimation);
                if (i == null) {
                    i = new I(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        i.f30982a = new d(windowInsetsAnimation);
                    }
                    this.f31007d.put(windowInsetsAnimation, i);
                }
                return i;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f31004a;
                a(windowInsetsAnimation);
                ((com.google.android.material.bottomsheet.g) bVar).f9190c.setTranslationY(0.0f);
                this.f31007d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f31004a;
                a(windowInsetsAnimation);
                com.google.android.material.bottomsheet.g gVar = (com.google.android.material.bottomsheet.g) bVar;
                View view = gVar.f9190c;
                int[] iArr = gVar.f9193f;
                view.getLocationOnScreen(iArr);
                gVar.f9191d = iArr[1];
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<I> arrayList = this.f31006c;
                if (arrayList == null) {
                    ArrayList<I> arrayList2 = new ArrayList<>(list.size());
                    this.f31006c = arrayList2;
                    this.f31005b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation o10 = C1.e.o(list.get(size));
                    I a10 = a(o10);
                    fraction = o10.getFraction();
                    a10.f30982a.d(fraction);
                    this.f31006c.add(a10);
                }
                b bVar = this.f31004a;
                J h9 = J.h(null, windowInsets);
                bVar.a(h9, this.f31005b);
                return h9.g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                Insets lowerBound;
                Insets upperBound;
                b bVar = this.f31004a;
                a(windowInsetsAnimation);
                lowerBound = bounds.getLowerBound();
                n0.b c2 = n0.b.c(lowerBound);
                upperBound = bounds.getUpperBound();
                n0.b c10 = n0.b.c(upperBound);
                com.google.android.material.bottomsheet.g gVar = (com.google.android.material.bottomsheet.g) bVar;
                View view = gVar.f9190c;
                int[] iArr = gVar.f9193f;
                view.getLocationOnScreen(iArr);
                int i = gVar.f9191d - iArr[1];
                gVar.f9192e = i;
                view.setTranslationY(i);
                C1.e.s();
                return C1.e.m(c2.d(), c10.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f31003e = windowInsetsAnimation;
        }

        @Override // y0.I.e
        public final long a() {
            long durationMillis;
            durationMillis = this.f31003e.getDurationMillis();
            return durationMillis;
        }

        @Override // y0.I.e
        public final float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f31003e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // y0.I.e
        public final int c() {
            int typeMask;
            typeMask = this.f31003e.getTypeMask();
            return typeMask;
        }

        @Override // y0.I.e
        public final void d(float f10) {
            this.f31003e.setFraction(f10);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f31008a;

        /* renamed from: b, reason: collision with root package name */
        public float f31009b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f31010c;

        /* renamed from: d, reason: collision with root package name */
        public final long f31011d;

        public e(int i, Interpolator interpolator, long j10) {
            this.f31008a = i;
            this.f31010c = interpolator;
            this.f31011d = j10;
        }

        public long a() {
            return this.f31011d;
        }

        public float b() {
            Interpolator interpolator = this.f31010c;
            return interpolator != null ? interpolator.getInterpolation(this.f31009b) : this.f31009b;
        }

        public int c() {
            return this.f31008a;
        }

        public void d(float f10) {
            this.f31009b = f10;
        }
    }

    public I(int i, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f30982a = new d(C1.e.n(i, interpolator, j10));
        } else {
            this.f30982a = new c(i, interpolator, j10);
        }
    }
}
