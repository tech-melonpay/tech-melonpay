package com.sumsub.sns.internal.ml.docdetector;

import C.v;
import android.graphics.Rect;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f17692a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17693b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17695d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17696e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17697f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17698g;

    public a(int i, int i9, int i10, int i11, float f10, long j10, long j11) {
        this.f17692a = i;
        this.f17693b = i9;
        this.f17694c = i10;
        this.f17695d = i11;
        this.f17696e = f10;
        this.f17697f = j10;
        this.f17698g = j11;
    }

    public final a a(int i, int i9, int i10, int i11, float f10, long j10, long j11) {
        return new a(i, i9, i10, i11, f10, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17692a == aVar.f17692a && this.f17693b == aVar.f17693b && this.f17694c == aVar.f17694c && this.f17695d == aVar.f17695d && f.b(Float.valueOf(this.f17696e), Float.valueOf(aVar.f17696e)) && this.f17697f == aVar.f17697f && this.f17698g == aVar.f17698g;
    }

    public final float h() {
        return this.f17696e;
    }

    public int hashCode() {
        return Long.hashCode(this.f17698g) + v.e(this.f17697f, v.a(v.b(this.f17695d, v.b(this.f17694c, v.b(this.f17693b, Integer.hashCode(this.f17692a) * 31, 31), 31), 31), this.f17696e, 31), 31);
    }

    public final int i() {
        return this.f17692a;
    }

    public final int j() {
        return this.f17693b;
    }

    public final int k() {
        return this.f17695d;
    }

    public final long l() {
        return this.f17697f;
    }

    public final Rect m() {
        int i = this.f17692a - (this.f17694c / 2);
        int i9 = this.f17693b - (this.f17695d / 2);
        return new Rect(i, i9, this.f17694c + i, this.f17695d + i9);
    }

    public final int o() {
        return this.f17694c;
    }

    public String toString() {
        return "DetectionResult(cx=" + this.f17692a + ", cy=" + this.f17693b + ", width=" + this.f17694c + ", height=" + this.f17695d + ", confidence=" + this.f17696e + ", inferenceTimeMs=" + this.f17697f + ", timeMs=" + this.f17698g + ')';
    }
}
