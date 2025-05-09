package com.sumsub.sns.internal.ml.badphotos;

import C.v;
import P9.m;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.data.model.DocumentType;
import com.sumsub.sns.internal.log.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final a f17617h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f17618a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17619b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17620c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17621d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17622e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f17623f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17624g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            String f10 = com.sumsub.sns.internal.ff.a.f16930a.A().f();
            if (f10 == null) {
                return new c(null, 0.0f, 0.0f, 0L, false, null, 0, 127, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(f10).getJSONObject("android");
                JSONArray jSONArray = jSONObject.getJSONArray("allowed_steps");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                c cVar = new c(jSONObject.getString("model"), Float.parseFloat(jSONObject.getString("high_quality_threshold")), Float.parseFloat(jSONObject.getString("low_quality_threshold")), jSONObject.getLong("execution_timeout_ms"), jSONObject.getBoolean("allow_cache"), arrayList, jSONObject.getInt("max_blocked_attempts"));
                Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "BadPhotosDetectorFeature", "Parsed FF: " + cVar, null, 4, null);
                return cVar;
            } catch (Throwable th) {
                b.b(com.sumsub.sns.internal.log.a.f17535a, "BadPhotosDetectorFeature", "Failed to parse badPhotoDetectorConfig FF", th);
                return new c(null, 0.0f, 0.0f, 0L, false, null, 0, 127, null);
            }
        }

        public a() {
        }
    }

    public c() {
        this(null, 0.0f, 0.0f, 0L, false, null, 0, 127, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f17618a, cVar.f17618a) && f.b(Float.valueOf(this.f17619b), Float.valueOf(cVar.f17619b)) && f.b(Float.valueOf(this.f17620c), Float.valueOf(cVar.f17620c)) && this.f17621d == cVar.f17621d && this.f17622e == cVar.f17622e && f.b(this.f17623f, cVar.f17623f) && this.f17624g == cVar.f17624g;
    }

    public final boolean h() {
        return this.f17622e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e10 = v.e(this.f17621d, v.a(v.a(this.f17618a.hashCode() * 31, this.f17619b, 31), this.f17620c, 31), 31);
        boolean z10 = this.f17622e;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f17624g) + v.f(this.f17623f, (e10 + i) * 31, 31);
    }

    public final List<String> i() {
        return this.f17623f;
    }

    public final long j() {
        return this.f17621d;
    }

    public final float k() {
        return this.f17619b;
    }

    public final float l() {
        return this.f17620c;
    }

    public final int m() {
        return this.f17624g;
    }

    public final String n() {
        return this.f17618a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BadPhotosMobileConfig(model=");
        sb2.append(this.f17618a);
        sb2.append(", highQualityThreshold=");
        sb2.append(this.f17619b);
        sb2.append(", lowQualityThreshold=");
        sb2.append(this.f17620c);
        sb2.append(", executionTimeoutMs=");
        sb2.append(this.f17621d);
        sb2.append(", allowCache=");
        sb2.append(this.f17622e);
        sb2.append(", allowedSteps=");
        sb2.append(this.f17623f);
        sb2.append(", maxBlockedAttemptsCount=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.f17624g, ')');
    }

    public c(String str, float f10, float f11, long j10, boolean z10, List<String> list, int i) {
        this.f17618a = str;
        this.f17619b = f10;
        this.f17620c = f11;
        this.f17621d = j10;
        this.f17622e = z10;
        this.f17623f = list;
        this.f17624g = i;
    }

    public /* synthetic */ c(String str, float f10, float f11, long j10, boolean z10, List list, int i, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "unsatisfactory_photos_v2.tflite" : str, (i9 & 2) != 0 ? 0.75f : f10, (i9 & 4) != 0 ? 0.2f : f11, (i9 & 8) != 0 ? 3000L : j10, (i9 & 16) != 0 ? true : z10, (i9 & 32) != 0 ? m.q(DocumentType.f15246b, "IDENTITY2", "IDENTITY3", "IDENTITY4") : list, (i9 & 64) == 0 ? i : 1);
    }
}
