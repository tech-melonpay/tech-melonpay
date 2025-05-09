package J;

import J.v;
import android.util.Size;
import androidx.camera.core.impl.Timebase;

/* compiled from: AutoValue_VideoEncoderConfig.java */
/* loaded from: classes.dex */
public final class d extends v {

    /* renamed from: a, reason: collision with root package name */
    public final String f2034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2035b;

    /* renamed from: c, reason: collision with root package name */
    public final Timebase f2036c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f2037d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2038e;

    /* renamed from: f, reason: collision with root package name */
    public final w f2039f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2040g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2041h;
    public final int i;

    /* compiled from: AutoValue_VideoEncoderConfig.java */
    public static final class a extends v.a {

        /* renamed from: a, reason: collision with root package name */
        public String f2042a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f2043b;

        /* renamed from: c, reason: collision with root package name */
        public Timebase f2044c;

        /* renamed from: d, reason: collision with root package name */
        public Size f2045d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f2046e;

        /* renamed from: f, reason: collision with root package name */
        public w f2047f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f2048g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f2049h;
        public Integer i;

        public final d a() {
            String str = this.f2042a == null ? " mimeType" : "";
            if (this.f2043b == null) {
                str = str.concat(" profile");
            }
            if (this.f2044c == null) {
                str = C.v.n(str, " inputTimebase");
            }
            if (this.f2045d == null) {
                str = C.v.n(str, " resolution");
            }
            if (this.f2046e == null) {
                str = C.v.n(str, " colorFormat");
            }
            if (this.f2047f == null) {
                str = C.v.n(str, " dataSpace");
            }
            if (this.f2048g == null) {
                str = C.v.n(str, " frameRate");
            }
            if (this.f2049h == null) {
                str = C.v.n(str, " IFrameInterval");
            }
            if (this.i == null) {
                str = C.v.n(str, " bitrate");
            }
            if (str.isEmpty()) {
                return new d(this.f2042a, this.f2043b.intValue(), this.f2044c, this.f2045d, this.f2046e.intValue(), this.f2047f, this.f2048g.intValue(), this.f2049h.intValue(), this.i.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public d(String str, int i, Timebase timebase, Size size, int i9, w wVar, int i10, int i11, int i12) {
        this.f2034a = str;
        this.f2035b = i;
        this.f2036c = timebase;
        this.f2037d = size;
        this.f2038e = i9;
        this.f2039f = wVar;
        this.f2040g = i10;
        this.f2041h = i11;
        this.i = i12;
    }

    @Override // J.k
    public final Timebase b() {
        return this.f2036c;
    }

    @Override // J.v
    public final int d() {
        return this.i;
    }

    @Override // J.v
    public final int e() {
        return this.f2038e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f2034a.equals(((d) vVar).f2034a)) {
            if (this.f2035b == vVar.i() && this.f2036c.equals(((d) vVar).f2036c) && this.f2037d.equals(vVar.j()) && this.f2038e == vVar.e() && this.f2039f.equals(vVar.f()) && this.f2040g == vVar.g() && this.f2041h == vVar.h() && this.i == vVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // J.v
    public final w f() {
        return this.f2039f;
    }

    @Override // J.v
    public final int g() {
        return this.f2040g;
    }

    @Override // J.k
    public final String getMimeType() {
        return this.f2034a;
    }

    @Override // J.v
    public final int h() {
        return this.f2041h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f2034a.hashCode() ^ 1000003) * 1000003) ^ this.f2035b) * 1000003) ^ this.f2036c.hashCode()) * 1000003) ^ this.f2037d.hashCode()) * 1000003) ^ this.f2038e) * 1000003) ^ this.f2039f.hashCode()) * 1000003) ^ this.f2040g) * 1000003) ^ this.f2041h) * 1000003) ^ this.i;
    }

    @Override // J.v
    public final int i() {
        return this.f2035b;
    }

    @Override // J.v
    public final Size j() {
        return this.f2037d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb2.append(this.f2034a);
        sb2.append(", profile=");
        sb2.append(this.f2035b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f2036c);
        sb2.append(", resolution=");
        sb2.append(this.f2037d);
        sb2.append(", colorFormat=");
        sb2.append(this.f2038e);
        sb2.append(", dataSpace=");
        sb2.append(this.f2039f);
        sb2.append(", frameRate=");
        sb2.append(this.f2040g);
        sb2.append(", IFrameInterval=");
        sb2.append(this.f2041h);
        sb2.append(", bitrate=");
        return s3.b.m(sb2, this.i, "}");
    }
}
