package com.sumsub.sns.internal.ml.core.pipeline;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class b extends com.sumsub.sns.internal.ml.core.pipeline.core.c<Bitmap, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final int f17683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17684b;

    public b(int i, int i9) {
        this.f17683a = i;
        this.f17684b = i9;
    }

    @Override // com.sumsub.sns.internal.ml.core.pipeline.core.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap b(Bitmap bitmap) {
        int i;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i14 = this.f17683a;
        int i15 = 0;
        if (i14 > width) {
            i11 = (i14 - width) / 2;
            i10 = i11 + width;
            i9 = width;
            i = 0;
        } else {
            i = (width - i14) / 2;
            i9 = i + i14;
            i10 = i14;
            i11 = 0;
        }
        int i16 = this.f17684b;
        if (i16 > height) {
            i13 = (i16 - height) / 2;
            i12 = i13 + height;
        } else {
            int i17 = (height - i16) / 2;
            i15 = i17;
            height = i17 + i16;
            i12 = i16;
            i13 = 0;
        }
        Rect rect = new Rect(i, i15, i9, height);
        Rect rect2 = new Rect(i11, i13, i10, i12);
        Bitmap createBitmap = Bitmap.createBitmap(this.f17683a, this.f17684b, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, rect, rect2, (Paint) null);
        return createBitmap;
    }
}
