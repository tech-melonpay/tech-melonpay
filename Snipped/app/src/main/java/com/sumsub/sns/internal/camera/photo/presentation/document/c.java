package com.sumsub.sns.internal.camera.photo.presentation.document;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class c {
    public static final Rect a(Rect rect, float f10, float f11) {
        RectF rectF = new RectF(rect);
        return new Rect((int) (rectF.left * f10), (int) (rectF.top * f11), (int) (rectF.right * f10), (int) (rectF.bottom * f11));
    }
}
