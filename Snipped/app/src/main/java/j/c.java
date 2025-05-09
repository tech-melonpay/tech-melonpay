package J;

import J.a;
import androidx.camera.core.impl.Timebase;

/* compiled from: AutoValue_AudioEncoderConfig.java */
/* loaded from: classes.dex */
public final class c extends J.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2022a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2023b;

    /* renamed from: c, reason: collision with root package name */
    public final Timebase f2024c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2025d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2026e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2027f;

    /* compiled from: AutoValue_AudioEncoderConfig.java */
    public static final class a extends a.AbstractC0025a {

        /* renamed from: a, reason: collision with root package name */
        public String f2028a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f2029b;

        /* renamed from: c, reason: collision with root package name */
        public Timebase f2030c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f2031d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f2032e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f2033f;
    }

    public c(String str, int i, Timebase timebase, int i9, int i10, int i11) {
        this.f2022a = str;
        this.f2023b = i;
        this.f2024c = timebase;
        this.f2025d = i9;
        this.f2026e = i10;
        this.f2027f = i11;
    }

    @Override // J.k
    public final Timebase b() {
        return this.f2024c;
    }

    @Override // J.a
    public final int c() {
        return this.f2025d;
    }

    @Override // J.a
    public final int d() {
        return this.f2027f;
    }

    @Override // J.a
    public final int e() {
        return this.f2023b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J.a)) {
            return false;
        }
        J.a aVar = (J.a) obj;
        if (this.f2022a.equals(((c) aVar).f2022a)) {
            if (this.f2023b == aVar.e() && this.f2024c.equals(((c) aVar).f2024c) && this.f2025d == aVar.c() && this.f2026e == aVar.f() && this.f2027f == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // J.a
    public final int f() {
        return this.f2026e;
    }

    @Override // J.k
    public final String getMimeType() {
        return this.f2022a;
    }

    public final int hashCode() {
        return ((((((((((this.f2022a.hashCode() ^ 1000003) * 1000003) ^ this.f2023b) * 1000003) ^ this.f2024c.hashCode()) * 1000003) ^ this.f2025d) * 1000003) ^ this.f2026e) * 1000003) ^ this.f2027f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb2.append(this.f2022a);
        sb2.append(", profile=");
        sb2.append(this.f2023b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f2024c);
        sb2.append(", bitrate=");
        sb2.append(this.f2025d);
        sb2.append(", sampleRate=");
        sb2.append(this.f2026e);
        sb2.append(", channelCount=");
        return s3.b.m(sb2, this.f2027f, "}");
    }
}
