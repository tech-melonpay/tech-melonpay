package n0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import j1.C0880a;
import m0.f;
import pa.C1124b;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final j f24073a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.collection.f<String, Typeface> f24074b;

    /* compiled from: TypefaceCompat.java */
    public static class a extends C1124b {

        /* renamed from: a, reason: collision with root package name */
        public f.c f24075a;
    }

    static {
        C0880a.a("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f24073a = new i();
        } else if (i >= 28) {
            f24073a = new h();
        } else {
            f24073a = new g();
        }
        f24074b = new androidx.collection.f<>(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, m0.e.a r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, m0.f.c r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.e.a(android.content.Context, m0.e$a, android.content.res.Resources, int, java.lang.String, int, int, m0.f$c, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i9, int i10) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i9 + '-' + i + '-' + i10;
    }
}
