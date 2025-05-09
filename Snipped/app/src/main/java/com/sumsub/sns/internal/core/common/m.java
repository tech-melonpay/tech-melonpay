package com.sumsub.sns.internal.core.common;

import A1.c;
import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class m {
    public static final void a(Drawable drawable, int i) {
        ColorFilter porterDuffColorFilter;
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT >= 29) {
            c.k();
            blendMode = BlendMode.SRC_ATOP;
            porterDuffColorFilter = c.e(i, blendMode);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }
}
