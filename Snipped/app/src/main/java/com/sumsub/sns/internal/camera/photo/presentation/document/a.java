package com.sumsub.sns.internal.camera.photo.presentation.document;

import android.graphics.Rect;
import android.graphics.RectF;
import com.sumsub.sns.internal.camera.photo.presentation.document.CheckDetectionResult;
import ha.h;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.ml.autocapture.a f14847a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14848b;

    public a(com.sumsub.sns.internal.ml.autocapture.a aVar) {
        this.f14847a = aVar;
    }

    public final boolean a(float f10, float f11, com.sumsub.sns.internal.ml.docdetector.a aVar) {
        int i = aVar.i() - (aVar.o() / 2);
        int j10 = aVar.j() - (aVar.k() / 2);
        int o10 = (int) (aVar.o() * f10);
        int k3 = (int) (aVar.k() * f11);
        int i9 = (int) (i * f10);
        int i10 = (int) (j10 * f11);
        Rect rect = new Rect(i9, i10, o10 + i9, k3 + i10);
        BigDecimal bigDecimal = new BigDecimal(rect.width() / rect.height());
        RoundingMode roundingMode = RoundingMode.FLOOR;
        bigDecimal.setScale(2, roundingMode);
        BigDecimal bigDecimal2 = new BigDecimal(this.f14847a.q());
        BigDecimal bigDecimal3 = new BigDecimal(0.2d);
        return bigDecimal.compareTo(bigDecimal2.subtract(bigDecimal2.multiply(bigDecimal3)).setScale(2, roundingMode)) >= 0 && bigDecimal.compareTo(bigDecimal2.add(bigDecimal2.multiply(bigDecimal3)).setScale(2, roundingMode)) <= 0;
    }

    public final CheckDetectionResult.SizeCheckResult b(float f10, float f11, Rect rect, com.sumsub.sns.internal.ml.docdetector.a aVar) {
        Rect a10 = c.a(aVar.m(), f10, f11);
        boolean z10 = false;
        boolean z11 = ((float) (a10.height() * a10.width())) / ((float) (rect.height() * rect.width())) >= this.f14847a.u();
        RectF rectF = new RectF(a10);
        RectF rectF2 = new RectF(rect);
        boolean z12 = rectF.width() < rectF2.width() && 1.0f - h.Q(rectF.width() / rectF2.width(), 1.0f) <= this.f14847a.v();
        if (rectF.width() < rectF2.width() && rectF.height() > rectF2.height()) {
            return CheckDetectionResult.SizeCheckResult.BIG;
        }
        if (rectF.height() < rectF2.height() && h.Q(1.0f - (rectF.height() / rectF2.height()), 1.0f) <= this.f14847a.v()) {
            z10 = true;
        }
        if (a10.height() > a10.width()) {
            z12 = z10;
        }
        if (rectF.height() < rectF2.height() && rectF.width() > rectF2.width()) {
            return CheckDetectionResult.SizeCheckResult.BIG;
        }
        CheckDetectionResult.SizeCheckResult sizeCheckResult = CheckDetectionResult.SizeCheckResult.OK;
        if (!z11 || !z12) {
            sizeCheckResult = null;
        }
        return sizeCheckResult == null ? CheckDetectionResult.SizeCheckResult.SMALL : sizeCheckResult;
    }

    public final CheckDetectionResult c(float f10, float f11, Rect rect, com.sumsub.sns.internal.ml.docdetector.a aVar) {
        CheckDetectionResult checkDetectionResult = new CheckDetectionResult(a(f10, f11, rect, aVar), b(f10, f11, rect, aVar), a(f10, f11, aVar));
        b.b(b.f14849a, "DocCapture", "processor result -> " + checkDetectionResult, null, 4, null);
        return checkDetectionResult;
    }

    public final boolean a(float f10, float f11, Rect rect, com.sumsub.sns.internal.ml.docdetector.a aVar) {
        boolean contains = rect.contains(c.a(aVar.m(), f10, f11));
        if (contains && !this.f14848b) {
            b.b(b.f14849a, "DocCapture", "Documents hits the frame", null, 4, null);
        }
        if (!contains && this.f14848b) {
            b.b(b.f14849a, "DocCapture", "Documents is NOT in the frame", null, 4, null);
        }
        this.f14848b = contains;
        return contains;
    }

    public final void a() {
        this.f14848b = false;
    }
}
