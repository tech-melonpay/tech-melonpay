package k1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: ObjectAnimatorUtils.java */
/* renamed from: k1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939u {
    public static <T, V> ObjectAnimator a(T t3, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}
