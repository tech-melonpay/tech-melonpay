package k1;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: PropertyValuesHolderUtils.java */
/* renamed from: k1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942x {
    public static <V> PropertyValuesHolder a(Property<?, V> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
