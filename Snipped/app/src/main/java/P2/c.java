package P2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import k0.C0913a;
import m.Z;

/* compiled from: MaterialResources.java */
/* loaded from: classes.dex */
public final class c {
    public static ColorStateList a(Context context, Z z10, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = z10.f23728b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C0913a.getColorStateList(context, resourceId)) == null) ? z10.a(i) : colorStateList;
    }

    public static ColorStateList b(TypedArray typedArray, Context context, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C0913a.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static int c(Context context, TypedArray typedArray, int i, int i9) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i9);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i9);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(TypedArray typedArray, Context context, int i) {
        int resourceId;
        Drawable j10;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (j10 = U4.b.j(context, resourceId)) == null) ? typedArray.getDrawable(i) : j10;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
}
