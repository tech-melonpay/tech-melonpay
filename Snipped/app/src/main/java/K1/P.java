package k1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final U f22778a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f22779b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f22780c;

    /* compiled from: ViewUtils.java */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(P.f22778a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            P.b(view, f10.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f22778a = new V();
        } else {
            f22778a = new U();
        }
        f22779b = new a(Float.class, "translationAlpha");
        f22780c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i9, int i10, int i11) {
        f22778a.g(view, i, i9, i10, i11);
    }

    public static void b(View view, float f10) {
        f22778a.b(view, f10);
    }

    public static void c(View view, int i) {
        f22778a.c(view, i);
    }
}
