package com.sumsub.sns.internal.ml.facedetector.pipeline;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.ml.core.pipeline.core.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a extends c<Bitmap, com.sumsub.sns.internal.ml.core.buffer.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C0282a f17765a = new C0282a(null);

    /* renamed from: com.sumsub.sns.internal.ml.facedetector.pipeline.a$a, reason: collision with other inner class name */
    public static final class C0282a {
        public /* synthetic */ C0282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0282a() {
        }
    }

    @Override // com.sumsub.sns.internal.ml.core.pipeline.core.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.sumsub.sns.internal.ml.core.buffer.a b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        float[] fArr = new float[i * 3];
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            fArr[i9] = (((i11 >> 16) & 255) - 127.5f) / 127.5f;
            int i12 = i9 + 2;
            fArr[i9 + 1] = (((i11 >> 8) & 255) - 127.5f) / 127.5f;
            i9 += 3;
            fArr[i12] = ((i11 & 255) - 127.5f) / 127.5f;
        }
        return new com.sumsub.sns.internal.ml.core.buffer.a(fArr, new int[]{height, width, 3});
    }
}
