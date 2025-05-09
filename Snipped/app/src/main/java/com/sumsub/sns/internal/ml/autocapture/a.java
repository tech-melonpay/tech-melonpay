package com.sumsub.sns.internal.ml.autocapture;

import C.v;
import android.util.Size;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: m, reason: collision with root package name */
    public static final b f17588m = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17590b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17591c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17592d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17593e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17594f;

    /* renamed from: g, reason: collision with root package name */
    public final float f17595g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17596h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C0270a f17597j;

    /* renamed from: k, reason: collision with root package name */
    public final Size f17598k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f17599l;

    /* renamed from: com.sumsub.sns.internal.ml.autocapture.a$a, reason: collision with other inner class name */
    public static final class C0270a extends c {

        /* renamed from: d, reason: collision with root package name */
        public final String f17600d;

        /* renamed from: e, reason: collision with root package name */
        public final float f17601e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f17602f;

        /* renamed from: g, reason: collision with root package name */
        public final Size f17603g;

        /* renamed from: h, reason: collision with root package name */
        public final int f17604h;

        public C0270a() {
            this(null, 0.0f, false, null, 0, 31, null);
        }

        public boolean a() {
            return this.f17602f;
        }

        public String b() {
            return this.f17600d;
        }

        public float c() {
            return this.f17601e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0270a)) {
                return false;
            }
            C0270a c0270a = (C0270a) obj;
            return f.b(b(), c0270a.b()) && f.b(Float.valueOf(c()), Float.valueOf(c0270a.c())) && a() == c0270a.a() && f.b(this.f17603g, c0270a.f17603g) && this.f17604h == c0270a.f17604h;
        }

        public int hashCode() {
            int hashCode = (Float.hashCode(c()) + (b().hashCode() * 31)) * 31;
            boolean a10 = a();
            int i = a10;
            if (a10) {
                i = 1;
            }
            return Integer.hashCode(this.f17604h) + ((this.f17603g.hashCode() + ((hashCode + i) * 31)) * 31);
        }

        public final Size i() {
            return this.f17603g;
        }

        public final int j() {
            return this.f17604h;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AutoCaptureModel(name=");
            sb2.append(b());
            sb2.append(", threshold=");
            sb2.append(c());
            sb2.append(", allowCache=");
            sb2.append(a());
            sb2.append(", inputSize=");
            sb2.append(this.f17603g);
            sb2.append(", outputSize=");
            return androidx.camera.core.impl.utils.a.m(sb2, this.f17604h, ')');
        }

        public /* synthetic */ C0270a(String str, float f10, boolean z10, Size size, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? "model.tflite" : str, (i9 & 2) != 0 ? 0.3f : f10, (i9 & 4) != 0 ? true : z10, (i9 & 8) != 0 ? new Size(0, 0) : size, (i9 & 16) != 0 ? 0 : i);
        }

        public C0270a(String str, float f10, boolean z10, Size size, int i) {
            super(str, f10, z10);
            this.f17600d = str;
            this.f17601e = f10;
            this.f17602f = z10;
            this.f17603g = size;
            this.f17604h = i;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            String f10 = com.sumsub.sns.internal.ff.a.f16930a.f().f();
            if (f10 == null) {
                return new a(false, false, 0L, false, 0L, 0.0f, 0.0f, 0.0f, false, null, null, false, 4095, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(f10).getJSONObject("android");
                JSONObject jSONObject2 = jSONObject.getJSONObject("autoCaptureModel");
                JSONObject optJSONObject = jSONObject2.optJSONObject("inputSize");
                C0270a c0270a = new C0270a(jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), (float) jSONObject2.getDouble("threshold"), jSONObject2.getBoolean("allowCache"), optJSONObject != null ? new Size(optJSONObject.optInt("width", 384), optJSONObject.optInt("height", 640)) : new Size(384, 640), jSONObject2.getInt("outputSize"));
                JSONObject optJSONObject2 = jSONObject.optJSONObject("frameSize");
                return new a(jSONObject.optBoolean("enabled", true), jSONObject.optBoolean("showBounds", false), jSONObject.optLong("waitForBetterPhotoMs", 1500L), false, 4000L, (float) jSONObject.getDouble("requiredFrameFillRatio"), (float) jSONObject.getDouble("requiredLargestSizeOffsetRatio"), (float) jSONObject.getDouble("frameAspectRatio"), false, c0270a, optJSONObject2 != null ? new Size(optJSONObject2.getInt("height"), optJSONObject2.getInt("width")) : new Size(1920, 1080), jSONObject.optBoolean("imageCaptureUseCaseEnabled", false));
            } catch (Throwable th) {
                com.sumsub.sns.internal.log.b.b(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(a.f17588m), "Failed to parse documentAutocaptureConfig FF", th);
                return new a(false, false, 0L, false, 0L, 0.0f, 0.0f, 0.0f, false, null, null, false, 4095, null);
            }
        }

        public b() {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f17605a;

        /* renamed from: b, reason: collision with root package name */
        public final float f17606b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f17607c;

        public c(String str, float f10, boolean z10) {
            this.f17605a = str;
            this.f17606b = f10;
            this.f17607c = z10;
        }
    }

    public a() {
        this(false, false, 0L, false, 0L, 0.0f, 0.0f, 0.0f, false, null, null, false, 4095, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17589a == aVar.f17589a && this.f17590b == aVar.f17590b && this.f17591c == aVar.f17591c && this.f17592d == aVar.f17592d && this.f17593e == aVar.f17593e && f.b(Float.valueOf(this.f17594f), Float.valueOf(aVar.f17594f)) && f.b(Float.valueOf(this.f17595g), Float.valueOf(aVar.f17595g)) && f.b(Float.valueOf(this.f17596h), Float.valueOf(aVar.f17596h)) && this.i == aVar.i && f.b(this.f17597j, aVar.f17597j) && f.b(this.f17598k, aVar.f17598k) && this.f17599l == aVar.f17599l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f17589a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i = r02 * 31;
        ?? r32 = this.f17590b;
        int i9 = r32;
        if (r32 != 0) {
            i9 = 1;
        }
        int e10 = v.e(this.f17591c, (i + i9) * 31, 31);
        ?? r33 = this.f17592d;
        int i10 = r33;
        if (r33 != 0) {
            i10 = 1;
        }
        int a10 = v.a(v.a(v.a(v.e(this.f17593e, (e10 + i10) * 31, 31), this.f17594f, 31), this.f17595g, 31), this.f17596h, 31);
        ?? r34 = this.i;
        int i11 = r34;
        if (r34 != 0) {
            i11 = 1;
        }
        int hashCode = (this.f17597j.hashCode() + ((a10 + i11) * 31)) * 31;
        Size size = this.f17598k;
        int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
        boolean z11 = this.f17599l;
        return hashCode2 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final C0270a m() {
        return this.f17597j;
    }

    public final boolean n() {
        return this.i;
    }

    public final float q() {
        return this.f17596h;
    }

    public final Size r() {
        return this.f17598k;
    }

    public final boolean s() {
        return this.f17599l;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentAutocaptureMobileConfig(enabled=");
        sb2.append(this.f17589a);
        sb2.append(", showBounds=");
        sb2.append(this.f17590b);
        sb2.append(", waitForBetterPhotoMs=");
        sb2.append(this.f17591c);
        sb2.append(", enableInsideFrameAutoShot=");
        sb2.append(this.f17592d);
        sb2.append(", insideFrameAutoShotTimeoutMs=");
        sb2.append(this.f17593e);
        sb2.append(", requiredFrameFillRatio=");
        sb2.append(this.f17594f);
        sb2.append(", requiredLargestSizeOffsetRatio=");
        sb2.append(this.f17595g);
        sb2.append(", frameAspectRatio=");
        sb2.append(this.f17596h);
        sb2.append(", enableCropToFrame=");
        sb2.append(this.i);
        sb2.append(", autoCaptureModel=");
        sb2.append(this.f17597j);
        sb2.append(", frameSize=");
        sb2.append(this.f17598k);
        sb2.append(", imageCaptureUseCaseEnabled=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f17599l, ')');
    }

    public final float u() {
        return this.f17594f;
    }

    public final float v() {
        return this.f17595g;
    }

    public final boolean w() {
        return this.f17590b;
    }

    public final long x() {
        return this.f17591c;
    }

    public a(boolean z10, boolean z11, long j10, boolean z12, long j11, float f10, float f11, float f12, boolean z13, C0270a c0270a, Size size, boolean z14) {
        this.f17589a = z10;
        this.f17590b = z11;
        this.f17591c = j10;
        this.f17592d = z12;
        this.f17593e = j11;
        this.f17594f = f10;
        this.f17595g = f11;
        this.f17596h = f12;
        this.i = z13;
        this.f17597j = c0270a;
        this.f17598k = size;
        this.f17599l = z14;
    }

    public /* synthetic */ a(boolean z10, boolean z11, long j10, boolean z12, long j11, float f10, float f11, float f12, boolean z13, C0270a c0270a, Size size, boolean z14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z10, (i & 2) != 0 ? false : z11, (i & 4) != 0 ? 1500L : j10, (i & 8) != 0 ? false : z12, (i & 16) != 0 ? 0L : j11, (i & 32) != 0 ? 0.0f : f10, (i & 64) != 0 ? 0.1f : f11, (i & 128) != 0 ? 1.75f : f12, (i & 256) != 0 ? false : z13, (i & 512) != 0 ? new C0270a("autocapture_v1.tflite", 0.0f, false, null, 0, 30, null) : c0270a, (i & 1024) != 0 ? null : size, (i & 2048) == 0 ? z14 : false);
    }
}
