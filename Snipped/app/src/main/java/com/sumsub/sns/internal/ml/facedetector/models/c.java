package com.sumsub.sns.internal.ml.facedetector.models;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f17741a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f17742b;

    /* renamed from: c, reason: collision with root package name */
    public final List<PointF> f17743c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(float f10, RectF rectF, List<? extends PointF> list) {
        this.f17741a = f10;
        this.f17742b = rectF;
        this.f17743c = list;
    }

    public final RectF a() {
        return this.f17742b;
    }

    public final List<PointF> b() {
        return this.f17743c;
    }

    public final float c() {
        return this.f17741a;
    }
}
