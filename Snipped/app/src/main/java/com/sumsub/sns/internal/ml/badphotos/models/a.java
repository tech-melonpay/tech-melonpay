package com.sumsub.sns.internal.ml.badphotos.models;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17625a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17626b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17627c;

    public a(String str, float f10, long j10) {
        this.f17625a = str;
        this.f17626b = f10;
        this.f17627c = j10;
    }

    public final long a() {
        return this.f17627c;
    }

    public final String b() {
        return this.f17625a;
    }

    public final float c() {
        return this.f17626b;
    }

    public String toString() {
        return "UnsatisfactoryPhotosDetectorResult(res=" + this.f17626b + ')';
    }
}
