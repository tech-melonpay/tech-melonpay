package com.bumptech.glide.load.resource.drawable;

import U4.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import k.c;
import k0.C0913a;
import m0.f;

/* loaded from: classes.dex */
public final class DrawableDecoderCompat {
    private static volatile boolean shouldCallAppCompatResources = true;

    private DrawableDecoderCompat() {
    }

    public static Drawable getDrawable(Context context, Context context2, int i) {
        return getDrawable(context, context2, i, null);
    }

    private static Drawable loadDrawableV4(Context context, int i, Resources.Theme theme) {
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f23858a;
        return resources.getDrawable(i, theme);
    }

    private static Drawable loadDrawableV7(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            c cVar = new c(context);
            cVar.f22602b = theme;
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return b.j(context, i);
    }

    public static Drawable getDrawable(Context context, int i, Resources.Theme theme) {
        return getDrawable(context, context, i, theme);
    }

    private static Drawable getDrawable(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (shouldCallAppCompatResources) {
                return loadDrawableV7(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0913a.getDrawable(context2, i);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            shouldCallAppCompatResources = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return loadDrawableV4(context2, i, theme);
    }
}
