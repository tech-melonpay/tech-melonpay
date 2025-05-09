package j0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator.java */
/* renamed from: j0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876e {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f22249a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f22250b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f22251c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f22252d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f22253e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f22254f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f22255g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            j0.C0876e.f22255g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            j0.C0876e.f22249a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            j0.C0876e.f22250b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            j0.C0876e.f22251c = r0
            java.lang.Class<?> r0 = j0.C0876e.f22249a
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            java.lang.String r4 = "performStopActivity"
            if (r0 != 0) goto L3d
        L3b:
            r0 = r1
            goto L4c
        L3d:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3b
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r5, r6}     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L3b
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3b
        L4c:
            j0.C0876e.f22252d = r0
            java.lang.Class<?> r0 = j0.C0876e.f22249a
            if (r0 != 0) goto L54
        L52:
            r0 = r1
            goto L61
        L54:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L52
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r5}     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> L52
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L52
        L61:
            j0.C0876e.f22253e = r0
            java.lang.Class<?> r0 = j0.C0876e.f22249a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 == r4) goto L6f
            r4 = 27
            if (r3 != r4) goto L90
        L6f:
            if (r0 != 0) goto L72
            goto L90
        L72:
            java.lang.String r3 = "requestRelaunchActivity"
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L90
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L90
            java.lang.Class<android.content.res.Configuration> r9 = android.content.res.Configuration.class
            java.lang.Class<android.content.res.Configuration> r10 = android.content.res.Configuration.class
            r8 = r12
            r11 = r12
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L90
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L90
            r1 = r0
        L90:
            j0.C0876e.f22254f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C0876e.<clinit>():void");
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: j0.e$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f22256a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f22257b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22258c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22259d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22260e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22261f = false;

        public a(Activity activity) {
            this.f22257b = activity;
            this.f22258c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f22257b == activity) {
                this.f22257b = null;
                this.f22260e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f22260e || this.f22261f || this.f22259d) {
                return;
            }
            Object obj = this.f22256a;
            try {
                Object obj2 = C0876e.f22251c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f22258c) {
                    C0876e.f22255g.postAtFrontOfQueue(new A3.k(3, C0876e.f22250b.get(activity), obj2));
                    this.f22261f = true;
                    this.f22256a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f22257b == activity) {
                this.f22259d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
