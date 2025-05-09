package k1;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f22775a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Method f22776b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f22777c;

    /* compiled from: ViewGroupUtils.java */
    public static class a {
        public static int a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        public static void b(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z10);
        } else if (f22775a) {
            try {
                a.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f22775a = false;
            }
        }
    }
}
