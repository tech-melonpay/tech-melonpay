package com.sumsub.sns.internal.ml.core.pipeline;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class c extends com.sumsub.sns.internal.ml.core.pipeline.core.c<Bitmap, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final int f17685a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17686b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17687c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17688d;

    public c(int i, int i9, boolean z10, boolean z11) {
        this.f17685a = i;
        this.f17686b = i9;
        this.f17687c = z10;
        this.f17688d = z11;
    }

    @Override // com.sumsub.sns.internal.ml.core.pipeline.core.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap b(Bitmap bitmap) {
        if (!this.f17688d) {
            return Bitmap.createScaledBitmap(bitmap, this.f17685a, this.f17686b, this.f17687c);
        }
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), new RectF(0.0f, 0.0f, this.f17685a, this.f17686b), Matrix.ScaleToFit.CENTER);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, this.f17687c);
    }
}
