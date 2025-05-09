package P2;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: MaterialAttributes.java */
/* loaded from: classes.dex */
public final class b {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z10) {
        TypedValue a10 = a(context, i);
        return (a10 == null || a10.type != 18) ? z10 : a10.data != 0;
    }

    public static TypedValue c(Context context, int i, String str) {
        TypedValue a10 = a(context, i);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}
