package com.sumsub.sns.internal.ml.core.pipeline;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class a extends com.sumsub.sns.internal.ml.core.pipeline.core.c<Bitmap, C0277a> {

    /* renamed from: com.sumsub.sns.internal.ml.core.pipeline.a$a, reason: collision with other inner class name */
    public static final class C0277a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17680a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17681b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f17682c;

        public C0277a(int i, int i9, int[] iArr) {
            this.f17680a = i;
            this.f17681b = i9;
            this.f17682c = iArr;
        }

        public final int a() {
            return this.f17681b;
        }

        public final int[] b() {
            return this.f17682c;
        }

        public final int c() {
            return this.f17680a;
        }
    }

    @Override // com.sumsub.sns.internal.ml.core.pipeline.core.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0277a b(Bitmap bitmap) {
        int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return new C0277a(bitmap.getWidth(), bitmap.getHeight(), iArr);
    }
}
