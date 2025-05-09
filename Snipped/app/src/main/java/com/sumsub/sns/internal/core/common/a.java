package com.sumsub.sns.internal.core.common;

import android.app.Activity;
import android.content.res.TypedArray;

/* loaded from: classes2.dex */
public final class a {
    public static final int b(Activity activity, int i) {
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{i});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
