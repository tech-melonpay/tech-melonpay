package u0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x0.InterfaceC1579a;

/* compiled from: FontRequestWorker.java */
/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505i {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.collection.f<String, Typeface> f30108a = new androidx.collection.f<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f30109b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f30110c;

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.collection.g<String, ArrayList<InterfaceC1579a<a>>> f30111d;

    static {
        ThreadFactoryC1508l threadFactoryC1508l = new ThreadFactoryC1508l();
        threadFactoryC1508l.f30121a = "fonts-androidx";
        threadFactoryC1508l.f30122b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ModuleDescriptor.MODULE_VERSION, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC1508l);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f30109b = threadPoolExecutor;
        f30110c = new Object();
        f30111d = new androidx.collection.g<>();
    }

    public static String a(int i, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            sb2.append(((C1500d) list.get(i9)).f30097e);
            sb2.append("-");
            sb2.append(i);
            if (i9 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0050, B:20:0x0059, B:22:0x005f, B:24:0x0065, B:27:0x0072, B:29:0x0093, B:32:0x009f, B:37:0x0077, B:38:0x007a, B:39:0x007b, B:42:0x008e, B:45:0x00a9, B:46:0x00ac, B:48:0x002e, B:50:0x0036, B:53:0x003a, B:55:0x003e, B:57:0x0049, B:66:0x00ad, B:26:0x006c, B:41:0x0088), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #2 {all -> 0x0019, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0050, B:20:0x0059, B:22:0x005f, B:24:0x0065, B:27:0x0072, B:29:0x0093, B:32:0x009f, B:37:0x0077, B:38:0x007a, B:39:0x007b, B:42:0x008e, B:45:0x00a9, B:46:0x00ac, B:48:0x002e, B:50:0x0036, B:53:0x003a, B:55:0x003e, B:57:0x0049, B:66:0x00ad, B:26:0x006c, B:41:0x0088), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0050, B:20:0x0059, B:22:0x005f, B:24:0x0065, B:27:0x0072, B:29:0x0093, B:32:0x009f, B:37:0x0077, B:38:0x007a, B:39:0x007b, B:42:0x008e, B:45:0x00a9, B:46:0x00ac, B:48:0x002e, B:50:0x0036, B:53:0x003a, B:55:0x003e, B:57:0x0049, B:66:0x00ad, B:26:0x006c, B:41:0x0088), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[Catch: all -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0019, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:17:0x0050, B:20:0x0059, B:22:0x005f, B:24:0x0065, B:27:0x0072, B:29:0x0093, B:32:0x009f, B:37:0x0077, B:38:0x007a, B:39:0x007b, B:42:0x008e, B:45:0x00a9, B:46:0x00ac, B:48:0x002e, B:50:0x0036, B:53:0x003a, B:55:0x003e, B:57:0x0049, B:66:0x00ad, B:26:0x006c, B:41:0x0088), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u0.C1505i.a b(java.lang.String r8, android.content.Context r9, java.util.List<u0.C1500d> r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            j1.C0880a.a(r1)
            androidx.collection.f<java.lang.String, android.graphics.Typeface> r1 = u0.C1505i.f30108a
            java.lang.Object r2 = r1.get(r8)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1c
            u0.i$a r8 = new u0.i$a     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L19:
            r8 = move-exception
            goto Lb7
        L1c:
            u0.j r10 = u0.C1499c.a(r9, r10)     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> Lad
            int r2 = r10.f30114a     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.util.List<u0.k[]> r10 = r10.f30115b
            r4 = -3
            if (r2 == 0) goto L2e
            if (r2 == r0) goto L2c
        L2a:
            r2 = r4
            goto L4e
        L2c:
            r2 = -2
            goto L4e
        L2e:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            u0.k[] r2 = (u0.C1507k[]) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L4d
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L3a
            goto L4d
        L3a:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            r6 = r3
        L3c:
            if (r6 >= r5) goto L4b
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L19
            int r7 = r7.f30120e     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L49
            if (r7 >= 0) goto L47
            goto L2a
        L47:
            r2 = r7
            goto L4e
        L49:
            int r6 = r6 + r0
            goto L3c
        L4b:
            r2 = r3
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r2 == 0) goto L59
            u0.i$a r8 = new u0.i$a     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L59:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L19
            if (r2 <= r0) goto L7b
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 29
            if (r0 < r2) goto L7b
            n0.j r0 = n0.e.f24073a     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            j1.C0880a.a(r0)     // Catch: java.lang.Throwable -> L19
            n0.j r0 = n0.e.f24073a     // Catch: java.lang.Throwable -> L76
            android.graphics.Typeface r9 = r0.c(r9, r10, r11)     // Catch: java.lang.Throwable -> L76
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            goto L91
        L76:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7b:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            u0.k[] r10 = (u0.C1507k[]) r10     // Catch: java.lang.Throwable -> L19
            n0.j r0 = n0.e.f24073a     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            j1.C0880a.a(r0)     // Catch: java.lang.Throwable -> L19
            n0.j r0 = n0.e.f24073a     // Catch: java.lang.Throwable -> La8
            android.graphics.Typeface r9 = r0.b(r9, r10, r11)     // Catch: java.lang.Throwable -> La8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
        L91:
            if (r9 == 0) goto L9f
            r1.put(r8, r9)     // Catch: java.lang.Throwable -> L19
            u0.i$a r8 = new u0.i$a     // Catch: java.lang.Throwable -> L19
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L9f:
            u0.i$a r8 = new u0.i$a     // Catch: java.lang.Throwable -> L19
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        La8:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        Lad:
            u0.i$a r8 = new u0.i$a     // Catch: java.lang.Throwable -> L19
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Lb7:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1505i.b(java.lang.String, android.content.Context, java.util.List, int):u0.i$a");
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: u0.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f30112a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30113b;

        public a(int i) {
            this.f30112a = null;
            this.f30113b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f30112a = typeface;
            this.f30113b = 0;
        }
    }
}
