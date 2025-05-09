package com.sumsub.sns.internal.ml.badphotos.pipeline;

import android.content.Context;
import com.sumsub.sns.internal.ml.core.pipeline.a;
import com.sumsub.sns.internal.ml.core.pipeline.core.c;

/* loaded from: classes2.dex */
public final class a extends c<a.C0277a, com.sumsub.sns.internal.ml.core.buffer.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17636a;

    public a(Context context) {
        this.f17636a = context;
    }

    @Override // com.sumsub.sns.internal.ml.core.pipeline.core.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.ml.core.buffer.a b(a.C0277a c0277a) {
        int c2 = c0277a.c();
        int a10 = c0277a.a();
        int[] b9 = c0277a.b();
        float[] fArr = new float[c2 * a10 * 3];
        int length = b9.length;
        int i = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            fArr[i10] = ((b9[i9] >> 16) & 255) / 255.0f;
            i9++;
            i10++;
        }
        int length2 = b9.length;
        int i11 = 0;
        while (i11 < length2) {
            fArr[i10] = ((b9[i11] >> 8) & 255) / 255.0f;
            i11++;
            i10++;
        }
        int length3 = b9.length;
        while (i < length3) {
            fArr[i10] = (b9[i] & 255) / 255.0f;
            i++;
            i10++;
        }
        return new com.sumsub.sns.internal.ml.core.buffer.a(fArr, new int[]{1, 3, a10, c2});
    }
}
