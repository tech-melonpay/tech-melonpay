package n0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import m0.e;
import u0.C1507k;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class j {

    /* compiled from: TypefaceCompatBaseImpl.java */
    public class a implements b<C1507k> {
        @Override // n0.j.b
        public final int a(C1507k c1507k) {
            return c1507k.f30118c;
        }

        @Override // n0.j.b
        public final boolean b(C1507k c1507k) {
            return c1507k.f30119d;
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    public interface b<T> {
        int a(T t3);

        boolean b(T t3);
    }

    public j() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i, b<T> bVar) {
        int i9 = (i & 1) == 0 ? 400 : 700;
        boolean z10 = (i & 2) != 0;
        T t3 = null;
        int i10 = Integer.MAX_VALUE;
        for (T t10 : tArr) {
            int abs = (Math.abs(bVar.a(t10) - i9) * 2) + (bVar.b(t10) == z10 ? 0 : 1);
            if (t3 == null || i10 > abs) {
                t3 = t10;
                i10 = abs;
            }
        }
        return t3;
    }

    public Typeface a(Context context, e.b bVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, C1507k[] c1507kArr, int i) {
        throw null;
    }

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i9) {
        File d10 = k.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (k.b(d10, resources, i)) {
                return Typeface.createFromFile(d10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public C1507k f(C1507k[] c1507kArr, int i) {
        return (C1507k) e(c1507kArr, i, new a());
    }
}
