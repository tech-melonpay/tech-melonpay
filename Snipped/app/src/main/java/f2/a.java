package F2;

import A1.c;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: DrawableUtils.java */
    /* renamed from: F2.a$a, reason: collision with other inner class name */
    public static class C0015a {
        public static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* compiled from: DrawableUtils.java */
    public static class b {
        public static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static ColorStateList a(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !c.z(drawable)) {
            return null;
        }
        colorStateList = c.f(drawable).getColorStateList();
        return colorStateList;
    }
}
