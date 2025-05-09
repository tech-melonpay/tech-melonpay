package s1;

import android.util.Log;

/* compiled from: Logger.java */
/* renamed from: s1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1197g {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC1197g f26512a;

    /* compiled from: Logger.java */
    /* renamed from: s1.g$a */
    public static class a extends AbstractC1197g {

        /* renamed from: b, reason: collision with root package name */
        public final int f26513b;

        public a(int i) {
            this.f26513b = i;
        }

        @Override // s1.AbstractC1197g
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.f26513b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // s1.AbstractC1197g
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.f26513b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // s1.AbstractC1197g
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.f26513b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // s1.AbstractC1197g
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.f26513b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized AbstractC1197g c() {
        AbstractC1197g abstractC1197g;
        synchronized (AbstractC1197g.class) {
            try {
                if (f26512a == null) {
                    f26512a = new a(3);
                }
                abstractC1197g = f26512a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC1197g;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
