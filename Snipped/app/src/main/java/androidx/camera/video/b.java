package androidx.camera.video;

import C.v;
import android.util.Range;
import androidx.camera.video.a;

/* compiled from: AutoValue_AudioSpec.java */
/* loaded from: classes.dex */
public final class b extends androidx.camera.video.a {

    /* renamed from: c, reason: collision with root package name */
    public final Range<Integer> f5573c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5574d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5575e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f5576f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5577g;

    /* compiled from: AutoValue_AudioSpec.java */
    public static final class a extends a.AbstractC0064a {

        /* renamed from: a, reason: collision with root package name */
        public Range<Integer> f5578a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f5579b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f5580c;

        /* renamed from: d, reason: collision with root package name */
        public Range<Integer> f5581d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f5582e;

        public final b a() {
            String str = this.f5578a == null ? " bitrate" : "";
            if (this.f5579b == null) {
                str = str.concat(" sourceFormat");
            }
            if (this.f5580c == null) {
                str = v.n(str, " source");
            }
            if (this.f5581d == null) {
                str = v.n(str, " sampleRate");
            }
            if (this.f5582e == null) {
                str = v.n(str, " channelCount");
            }
            if (str.isEmpty()) {
                return new b(this.f5578a, this.f5579b.intValue(), this.f5580c.intValue(), this.f5581d, this.f5582e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(Range range, int i, int i9, Range range2, int i10) {
        this.f5573c = range;
        this.f5574d = i;
        this.f5575e = i9;
        this.f5576f = range2;
        this.f5577g = i10;
    }

    @Override // androidx.camera.video.a
    public final Range<Integer> b() {
        return this.f5573c;
    }

    @Override // androidx.camera.video.a
    public final int c() {
        return this.f5577g;
    }

    @Override // androidx.camera.video.a
    public final Range<Integer> d() {
        return this.f5576f;
    }

    @Override // androidx.camera.video.a
    public final int e() {
        return this.f5575e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.a)) {
            return false;
        }
        androidx.camera.video.a aVar = (androidx.camera.video.a) obj;
        return this.f5573c.equals(aVar.b()) && this.f5574d == aVar.f() && this.f5575e == aVar.e() && this.f5576f.equals(aVar.d()) && this.f5577g == aVar.c();
    }

    @Override // androidx.camera.video.a
    public final int f() {
        return this.f5574d;
    }

    public final int hashCode() {
        return ((((((((this.f5573c.hashCode() ^ 1000003) * 1000003) ^ this.f5574d) * 1000003) ^ this.f5575e) * 1000003) ^ this.f5576f.hashCode()) * 1000003) ^ this.f5577g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpec{bitrate=");
        sb2.append(this.f5573c);
        sb2.append(", sourceFormat=");
        sb2.append(this.f5574d);
        sb2.append(", source=");
        sb2.append(this.f5575e);
        sb2.append(", sampleRate=");
        sb2.append(this.f5576f);
        sb2.append(", channelCount=");
        return s3.b.m(sb2, this.f5577g, "}");
    }
}
