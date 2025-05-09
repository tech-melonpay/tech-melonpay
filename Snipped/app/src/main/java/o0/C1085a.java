package o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableCompat.java */
/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085a {
    public static void a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void b(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void c(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
