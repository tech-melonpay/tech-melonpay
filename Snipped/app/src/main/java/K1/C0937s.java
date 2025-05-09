package k1;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: ImageViewUtils.java */
/* renamed from: k1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937s {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f22917a = true;

    /* compiled from: ImageViewUtils.java */
    /* renamed from: k1.s$a */
    public static class a {
        public static void a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    public static void a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f22917a) {
            try {
                a.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f22917a = false;
            }
        }
    }
}
