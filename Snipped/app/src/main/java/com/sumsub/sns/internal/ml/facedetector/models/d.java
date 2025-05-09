package com.sumsub.sns.internal.ml.facedetector.models;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f17744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17745b;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final C0281a f17746c = new C0281a(null);

        /* renamed from: a, reason: collision with root package name */
        public float f17747a = 0.5f;

        /* renamed from: b, reason: collision with root package name */
        public int f17748b = -1;

        /* renamed from: com.sumsub.sns.internal.ml.facedetector.models.d$a$a, reason: collision with other inner class name */
        public static final class C0281a {
            public /* synthetic */ C0281a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0281a() {
            }

            public final void a(d dVar) {
                if (dVar.a() == 0 || dVar.a() < -1) {
                    throw new IllegalArgumentException(("MaxNumberOfFaces must be greater than 0 or -1, maxNumberOfFaces: " + dVar.a()).toString());
                }
                if (dVar.b() < 0.0f || dVar.b() > 1.0f) {
                    throw new IllegalArgumentException("MinConfidence must be between 0 and 1".toString());
                }
            }
        }

        public final a a(float f10) {
            this.f17747a = f10;
            return this;
        }

        public final int b() {
            return this.f17748b;
        }

        public final float c() {
            return this.f17747a;
        }

        public final a a(int i) {
            this.f17748b = i;
            return this;
        }

        public final d a() {
            d dVar = new d(this, null);
            f17746c.a(dVar);
            return dVar;
        }
    }

    public /* synthetic */ d(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final int a() {
        return this.f17745b;
    }

    public final float b() {
        return this.f17744a;
    }

    public d(a aVar) {
        this.f17744a = aVar.c();
        this.f17745b = aVar.b();
    }
}
