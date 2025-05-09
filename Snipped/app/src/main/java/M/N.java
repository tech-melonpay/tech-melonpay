package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.luminary.mobile.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m.C1008j;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: g, reason: collision with root package name */
    public static N f23679g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, androidx.collection.h<ColorStateList>> f23681a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Context, androidx.collection.d<WeakReference<Drawable.ConstantState>>> f23682b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f23683c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23684d;

    /* renamed from: e, reason: collision with root package name */
    public b f23685e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f23678f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final a f23680h = new a(6);

    /* compiled from: ResourceManagerInternal.java */
    public static class a extends androidx.collection.f<Integer, PorterDuffColorFilter> {
    }

    /* compiled from: ResourceManagerInternal.java */
    public interface b {
    }

    public static synchronized N c() {
        N n10;
        synchronized (N.class) {
            try {
                if (f23679g == null) {
                    f23679g = new N();
                }
                n10 = f23679g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n10;
    }

    public static synchronized PorterDuffColorFilter g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (N.class) {
            a aVar = f23680h;
            aVar.getClass();
            int i9 = (31 + i) * 31;
            porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i9));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                aVar.put(Integer.valueOf(mode.hashCode() + i9), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f23682b.get(context);
                if (dVar == null) {
                    dVar = new androidx.collection.d<>();
                    this.f23682b.put(context, dVar);
                }
                dVar.put(j10, new WeakReference<>(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable b(Context context, int i) {
        if (this.f23683c == null) {
            this.f23683c = new TypedValue();
        }
        TypedValue typedValue = this.f23683c;
        context.getResources().getValue(i, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d10 = d(context, j10);
        if (d10 != null) {
            return d10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f23685e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, 2131230869)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C1008j.a.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C1008j.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C1008j.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j10) {
        androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f23682b.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = dVar.get(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.remove(j10);
        }
        return null;
    }

    public final synchronized Drawable e(Context context, int i) {
        return f(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r0.setTintMode(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable f(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f23684d     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r8.f23684d = r0     // Catch: java.lang.Throwable -> L31
            r0 = 2131230930(0x7f0800d2, float:1.8077927E38)
            android.graphics.drawable.Drawable r0 = r8.e(r9, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ldb
            boolean r1 = r0 instanceof l1.f     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Ldb
        L26:
            android.graphics.drawable.Drawable r0 = r8.b(r9, r10)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L34
            android.graphics.drawable.Drawable r0 = k0.C0913a.getDrawable(r9, r10)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r9 = move-exception
            goto Le6
        L34:
            if (r0 == 0) goto Ld4
            android.content.res.ColorStateList r1 = r8.h(r9, r10)     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 == 0) goto L57
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch: java.lang.Throwable -> L31
            r0.setTintList(r1)     // Catch: java.lang.Throwable -> L31
            m.N$b r9 = r8.f23685e     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto L49
            goto L50
        L49:
            r9 = 2131230917(0x7f0800c5, float:1.80779E38)
            if (r10 != r9) goto L50
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> L31
        L50:
            if (r2 == 0) goto Ld4
            r0.setTintMode(r2)     // Catch: java.lang.Throwable -> L31
            goto Ld4
        L57:
            m.N$b r1 = r8.f23685e     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto Lcb
            r1 = 2131230912(0x7f0800c0, float:1.807789E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            r6 = 2130968882(0x7f040132, float:1.754643E38)
            r7 = 2130968884(0x7f040134, float:1.7546434E38)
            if (r10 != r1) goto L95
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> L31
            int r1 = m.U.c(r9, r7)     // Catch: java.lang.Throwable -> L31
            android.graphics.PorterDuff$Mode r2 = m.C1008j.f23776b     // Catch: java.lang.Throwable -> L31
            m.C1008j.a.e(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = m.U.c(r9, r7)     // Catch: java.lang.Throwable -> L31
            m.C1008j.a.e(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L31
            int r9 = m.U.c(r9, r6)     // Catch: java.lang.Throwable -> L31
            m.C1008j.a.e(r10, r9, r2)     // Catch: java.lang.Throwable -> L31
            goto Ld4
        L95:
            r1 = 2131230903(0x7f0800b7, float:1.8077872E38)
            if (r10 == r1) goto La4
            r1 = 2131230902(0x7f0800b6, float:1.807787E38)
            if (r10 == r1) goto La4
            r1 = 2131230904(0x7f0800b8, float:1.8077874E38)
            if (r10 != r1) goto Lcb
        La4:
            r10 = r0
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r5)     // Catch: java.lang.Throwable -> L31
            int r1 = m.U.b(r9, r7)     // Catch: java.lang.Throwable -> L31
            android.graphics.PorterDuff$Mode r2 = m.C1008j.f23776b     // Catch: java.lang.Throwable -> L31
            m.C1008j.a.e(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r11 = r10.findDrawableByLayerId(r4)     // Catch: java.lang.Throwable -> L31
            int r1 = m.U.c(r9, r6)     // Catch: java.lang.Throwable -> L31
            m.C1008j.a.e(r11, r1, r2)     // Catch: java.lang.Throwable -> L31
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)     // Catch: java.lang.Throwable -> L31
            int r9 = m.U.c(r9, r6)     // Catch: java.lang.Throwable -> L31
            m.C1008j.a.e(r10, r9, r2)     // Catch: java.lang.Throwable -> L31
            goto Ld4
        Lcb:
            boolean r9 = r8.i(r9, r10, r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto Ld4
            if (r11 == 0) goto Ld4
            r0 = r2
        Ld4:
            if (r0 == 0) goto Ld9
            m.C0996F.a(r0)     // Catch: java.lang.Throwable -> L31
        Ld9:
            monitor-exit(r8)
            return r0
        Ldb:
            r9 = 0
            r8.f23684d = r9     // Catch: java.lang.Throwable -> L31
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L31
        Le6:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m.N.f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList h(Context context, int i) {
        ColorStateList c2;
        androidx.collection.h<ColorStateList> hVar;
        WeakHashMap<Context, androidx.collection.h<ColorStateList>> weakHashMap = this.f23681a;
        ColorStateList colorStateList = null;
        c2 = (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) ? null : hVar.c(i);
        if (c2 == null) {
            b bVar = this.f23685e;
            if (bVar != null) {
                colorStateList = ((C1008j.a) bVar).d(context, i);
            }
            if (colorStateList != null) {
                if (this.f23681a == null) {
                    this.f23681a = new WeakHashMap<>();
                }
                androidx.collection.h<ColorStateList> hVar2 = this.f23681a.get(context);
                if (hVar2 == null) {
                    hVar2 = new androidx.collection.h<>();
                    this.f23681a.put(context, hVar2);
                }
                hVar2.a(i, colorStateList);
            }
            c2 = colorStateList;
        }
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            m.N$b r0 = r7.f23685e
            r1 = 0
            if (r0 == 0) goto L68
            m.j$a r0 = (m.C1008j.a) r0
            android.graphics.PorterDuff$Mode r2 = m.C1008j.f23776b
            int[] r3 = r0.f23779a
            boolean r3 = m.C1008j.a.a(r9, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130968884(0x7f040134, float:1.7546434E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L51
        L19:
            int[] r3 = r0.f23781c
            boolean r3 = m.C1008j.a.a(r9, r3)
            if (r3 == 0) goto L25
            r9 = 2130968882(0x7f040132, float:1.754643E38)
            goto L16
        L25:
            int[] r0 = r0.f23782d
            boolean r0 = m.C1008j.a.a(r9, r0)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L32:
            r9 = r3
            goto L16
        L34:
            r0 = 2131230889(0x7f0800a9, float:1.8077844E38)
            if (r9 != r0) goto L48
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L51
        L48:
            r0 = 2131230871(0x7f080097, float:1.8077807E38)
            if (r9 != r0) goto L4e
            goto L32
        L4e:
            r9 = r1
            r3 = r9
            goto L17
        L51:
            if (r3 == 0) goto L68
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = m.U.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = m.C1008j.c(r8, r2)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L67
            r10.setAlpha(r0)
        L67:
            r1 = r4
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.N.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
