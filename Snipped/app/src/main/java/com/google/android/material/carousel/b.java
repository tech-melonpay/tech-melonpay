package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineState.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f9235a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0102b> f9236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9238d;

    /* compiled from: KeylineState.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f9239a;

        /* renamed from: b, reason: collision with root package name */
        public final float f9240b;

        /* renamed from: d, reason: collision with root package name */
        public C0102b f9242d;

        /* renamed from: e, reason: collision with root package name */
        public C0102b f9243e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f9241c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f9244f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f9245g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f9246h = 0.0f;
        public int i = -1;

        public a(float f10, float f11) {
            this.f9239a = f10;
            this.f9240b = f11;
        }

        public final void a(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float f14 = f12 / 2.0f;
            float f15 = f10 - f14;
            float f16 = f14 + f10;
            float f17 = this.f9240b;
            if (f16 > f17) {
                f13 = Math.abs(f16 - Math.max(f16 - f12, f17));
            } else {
                f13 = 0.0f;
                if (f15 < 0.0f) {
                    f13 = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
                }
            }
            b(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public final void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f9241c;
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = arrayList.size();
            }
            C0102b c0102b = new C0102b(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f9242d == null) {
                    this.f9242d = c0102b;
                    this.f9244f = arrayList.size();
                }
                if (this.f9245g != -1 && arrayList.size() - this.f9245g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f9242d.f9250d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f9243e = c0102b;
                this.f9245g = arrayList.size();
            } else {
                if (this.f9242d == null && f12 < this.f9246h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f9243e != null && f12 > this.f9246h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f9246h = f12;
            arrayList.add(c0102b);
        }

        public final void c(float f10, float f11, float f12, int i, boolean z10) {
            if (i <= 0 || f12 <= 0.0f) {
                return;
            }
            for (int i9 = 0; i9 < i; i9++) {
                a((i9 * f12) + f10, f11, f12, z10, false);
            }
        }

        public final b d() {
            if (this.f9242d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.f9241c;
                int size = arrayList2.size();
                float f10 = this.f9239a;
                if (i >= size) {
                    return new b(f10, arrayList, this.f9244f, this.f9245g);
                }
                C0102b c0102b = (C0102b) arrayList2.get(i);
                arrayList.add(new C0102b((i * f10) + (this.f9242d.f9248b - (this.f9244f * f10)), c0102b.f9248b, c0102b.f9249c, c0102b.f9250d, c0102b.f9251e, c0102b.f9252f, c0102b.f9253g, c0102b.f9254h));
                i++;
            }
        }
    }

    /* compiled from: KeylineState.java */
    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0102b {

        /* renamed from: a, reason: collision with root package name */
        public final float f9247a;

        /* renamed from: b, reason: collision with root package name */
        public final float f9248b;

        /* renamed from: c, reason: collision with root package name */
        public final float f9249c;

        /* renamed from: d, reason: collision with root package name */
        public final float f9250d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f9251e;

        /* renamed from: f, reason: collision with root package name */
        public final float f9252f;

        /* renamed from: g, reason: collision with root package name */
        public final float f9253g;

        /* renamed from: h, reason: collision with root package name */
        public final float f9254h;

        public C0102b(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f9247a = f10;
            this.f9248b = f11;
            this.f9249c = f12;
            this.f9250d = f13;
            this.f9251e = z10;
            this.f9252f = f14;
            this.f9253g = f15;
            this.f9254h = f16;
        }
    }

    public b(float f10, ArrayList arrayList, int i, int i9) {
        this.f9235a = f10;
        this.f9236b = Collections.unmodifiableList(arrayList);
        this.f9237c = i;
        this.f9238d = i9;
    }

    public final C0102b a() {
        return this.f9236b.get(this.f9237c);
    }

    public final C0102b b() {
        return this.f9236b.get(0);
    }

    public final C0102b c() {
        return this.f9236b.get(this.f9238d);
    }

    public final C0102b d() {
        return this.f9236b.get(r0.size() - 1);
    }
}
