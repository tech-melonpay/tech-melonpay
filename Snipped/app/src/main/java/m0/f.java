package m0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f23858a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f23859b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f23860c = new Object();

    /* compiled from: ResourcesCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f23861a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f23862b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23863c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f23861a = colorStateList;
            this.f23862b = configuration;
            this.f23863c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f23864a;

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f23865b;

        public b(Resources resources, Resources.Theme theme) {
            this.f23864a = resources;
            this.f23865b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23864a.equals(bVar.f23864a) && Objects.equals(this.f23865b, bVar.f23865b);
        }

        public final int hashCode() {
            return Objects.hash(this.f23864a, this.f23865b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    public static abstract class c {
        public final void a(int i) {
            new Handler(Looper.getMainLooper()).post(new F.e(i, 4, this));
        }

        public abstract void b(int i);

        public abstract void c(Typeface typeface);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, m0.f.c r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f.b(android.content.Context, int, android.util.TypedValue, int, m0.f$c, boolean, boolean):android.graphics.Typeface");
    }
}
