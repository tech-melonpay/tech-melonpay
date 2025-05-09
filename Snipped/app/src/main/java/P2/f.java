package P2;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import pa.C1124b;

/* compiled from: TypefaceUtils.java */
/* loaded from: classes.dex */
public final class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i;
        int i9;
        int weight;
        int i10;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i9 = configuration.fontWeightAdjustment;
        if (i9 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i10 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, C1124b.s(i10 + weight, 1, 1000), typeface.isItalic());
        return create;
    }
}
