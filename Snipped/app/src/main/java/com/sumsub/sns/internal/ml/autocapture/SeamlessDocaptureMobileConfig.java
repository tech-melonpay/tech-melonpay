package com.sumsub.sns.internal.ml.autocapture;

import C.v;
import com.sumsub.sns.internal.log.b;
import com.sumsub.sns.internal.util.DataUnit;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class SeamlessDocaptureMobileConfig {

    /* renamed from: f, reason: collision with root package name */
    public static final a f17580f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f17581g = (int) DataUnit.MEGABYTES.toBytes(2);

    /* renamed from: h, reason: collision with root package name */
    public static final int f17582h = (int) TimeUnit.MINUTES.toSeconds(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f17583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17584b;

    /* renamed from: c, reason: collision with root package name */
    public final VideoQuality f17585c;

    /* renamed from: d, reason: collision with root package name */
    public final VideoQuality f17586d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17587e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/sumsub/sns/internal/ml/autocapture/SeamlessDocaptureMobileConfig$VideoQuality;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "UHD", "FHD", "HD", "SD", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public enum VideoQuality {
        UHD("UHD"),
        FHD("FHD"),
        HD("HD"),
        SD("SD");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* renamed from: com.sumsub.sns.internal.ml.autocapture.SeamlessDocaptureMobileConfig$VideoQuality$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final VideoQuality a(String str) {
                for (VideoQuality videoQuality : VideoQuality.values()) {
                    if (f.b(videoQuality.getValue(), str)) {
                        return videoQuality;
                    }
                }
                return null;
            }

            public Companion() {
            }
        }

        VideoQuality(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SeamlessDocaptureMobileConfig a() {
            String f10 = com.sumsub.sns.internal.ff.a.f16930a.u().f();
            if (f10 == null) {
                return new SeamlessDocaptureMobileConfig(0, 0, null, null, 0, 31, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(f10).getJSONObject("android");
                int optInt = jSONObject.optInt("videoBitrate", c());
                int optInt2 = jSONObject.optInt("maxRecordedDurationSec", b());
                VideoQuality a10 = c.a(jSONObject.optString("videoQuality"));
                if (a10 == null) {
                    a10 = VideoQuality.HD;
                }
                VideoQuality videoQuality = a10;
                VideoQuality a11 = c.a(jSONObject.optString("videoFallbackQuality"));
                if (a11 == null) {
                    a11 = VideoQuality.SD;
                }
                return new SeamlessDocaptureMobileConfig(optInt, optInt2, videoQuality, a11, jSONObject.optInt("maxRecordedFileSizeMB", 30));
            } catch (Exception e10) {
                b.b(com.sumsub.sns.internal.log.a.f17535a, com.sumsub.sns.internal.log.c.a(com.sumsub.sns.internal.ml.autocapture.a.f17588m), "Failed to parse seamlessDocaptureMobileConfig FF", e10);
                return new SeamlessDocaptureMobileConfig(0, 0, null, null, 0, 31, null);
            }
        }

        public final int b() {
            return SeamlessDocaptureMobileConfig.f17582h;
        }

        public final int c() {
            return SeamlessDocaptureMobileConfig.f17581g;
        }

        public a() {
        }
    }

    public SeamlessDocaptureMobileConfig() {
        this(0, 0, null, null, 0, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeamlessDocaptureMobileConfig)) {
            return false;
        }
        SeamlessDocaptureMobileConfig seamlessDocaptureMobileConfig = (SeamlessDocaptureMobileConfig) obj;
        return this.f17583a == seamlessDocaptureMobileConfig.f17583a && this.f17584b == seamlessDocaptureMobileConfig.f17584b && this.f17585c == seamlessDocaptureMobileConfig.f17585c && this.f17586d == seamlessDocaptureMobileConfig.f17586d && this.f17587e == seamlessDocaptureMobileConfig.f17587e;
    }

    public final int h() {
        return this.f17584b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f17587e) + ((this.f17586d.hashCode() + ((this.f17585c.hashCode() + v.b(this.f17584b, Integer.hashCode(this.f17583a) * 31, 31)) * 31)) * 31);
    }

    public final int i() {
        return this.f17587e;
    }

    public final int j() {
        return this.f17583a;
    }

    public final VideoQuality k() {
        return this.f17586d;
    }

    public final VideoQuality l() {
        return this.f17585c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SeamlessDocaptureMobileConfig(videoBitrate=");
        sb2.append(this.f17583a);
        sb2.append(", maxRecordedDurationSec=");
        sb2.append(this.f17584b);
        sb2.append(", videoQuality=");
        sb2.append(this.f17585c);
        sb2.append(", videoFallbackQuality=");
        sb2.append(this.f17586d);
        sb2.append(", maxRecordedFileSizeMB=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.f17587e, ')');
    }

    public SeamlessDocaptureMobileConfig(int i, int i9, VideoQuality videoQuality, VideoQuality videoQuality2, int i10) {
        this.f17583a = i;
        this.f17584b = i9;
        this.f17585c = videoQuality;
        this.f17586d = videoQuality2;
        this.f17587e = i10;
    }

    public /* synthetic */ SeamlessDocaptureMobileConfig(int i, int i9, VideoQuality videoQuality, VideoQuality videoQuality2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f17581g : i, (i11 & 2) != 0 ? f17582h : i9, (i11 & 4) != 0 ? VideoQuality.HD : videoQuality, (i11 & 8) != 0 ? VideoQuality.SD : videoQuality2, (i11 & 16) != 0 ? 30 : i10);
    }
}
