package Z0;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4174b;

    public /* synthetic */ e(Context context, int i) {
        this.f4173a = i;
        this.f4174b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f4173a
            switch(r0) {
                case 0: goto L97;
                case 1: goto L88;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L85
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.f4174b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto L85
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L5e
            androidx.collection.b<java.lang.ref.WeakReference<h.d>> r0 = h.AbstractC0777d.f20855g
            r0.getClass()
            androidx.collection.b$a r2 = new androidx.collection.b$a
            r2.<init>()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            h.d r0 = (h.AbstractC0777d) r0
            if (r0 == 0) goto L2d
            android.content.Context r0 = r0.f()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L63
            android.os.LocaleList r0 = h.AbstractC0777d.b.a(r0)
            t0.g r2 = new t0.g
            t0.i r6 = new t0.i
            r6.<init>(r0)
            r2.<init>(r6)
            goto L65
        L5e:
            t0.g r2 = h.AbstractC0777d.f20851c
            if (r2 == 0) goto L63
            goto L65
        L63:
            t0.g r2 = t0.g.f27401b
        L65:
            t0.h r0 = r2.f27402a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7e
            java.lang.String r0 = j0.C0877f.b(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto L7e
            android.os.LocaleList r0 = h.AbstractC0777d.a.a(r0)
            h.AbstractC0777d.b.b(r2, r0)
        L7e:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L85:
            h.AbstractC0777d.f20854f = r1
            return
        L88:
            Z0.c r0 = new Z0.c
            r1 = 0
            r0.<init>(r1)
            androidx.profileinstaller.c$a r1 = androidx.profileinstaller.c.f7388a
            r2 = 0
            android.content.Context r3 = r11.f4174b
            androidx.profileinstaller.c.b(r3, r0, r1, r2)
            return
        L97:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            Z0.e r1 = new Z0.e
            android.content.Context r2 = r11.f4174b
            r3 = 1
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.e.run():void");
    }
}
