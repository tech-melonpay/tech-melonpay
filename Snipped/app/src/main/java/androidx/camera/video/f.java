package androidx.camera.video;

import C.v;
import android.util.Range;
import androidx.camera.video.r;

/* compiled from: AutoValue_VideoSpec.java */
/* loaded from: classes.dex */
public final class f extends r {

    /* renamed from: d, reason: collision with root package name */
    public final C.r f5597d;

    /* renamed from: e, reason: collision with root package name */
    public final Range<Integer> f5598e;

    /* renamed from: f, reason: collision with root package name */
    public final Range<Integer> f5599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5600g;

    /* compiled from: AutoValue_VideoSpec.java */
    public static final class a extends r.a {

        /* renamed from: a, reason: collision with root package name */
        public C.r f5601a;

        /* renamed from: b, reason: collision with root package name */
        public Range<Integer> f5602b;

        /* renamed from: c, reason: collision with root package name */
        public Range<Integer> f5603c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f5604d;

        public final f a() {
            String str = this.f5601a == null ? " qualitySelector" : "";
            if (this.f5602b == null) {
                str = str.concat(" frameRate");
            }
            if (this.f5603c == null) {
                str = v.n(str, " bitrate");
            }
            if (this.f5604d == null) {
                str = v.n(str, " aspectRatio");
            }
            if (str.isEmpty()) {
                return new f(this.f5601a, this.f5602b, this.f5603c, this.f5604d.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(int i) {
            this.f5604d = Integer.valueOf(i);
            return this;
        }

        public final a c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.f5603c = range;
            return this;
        }

        public final a d(C.r rVar) {
            if (rVar == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.f5601a = rVar;
            return this;
        }
    }

    public f(C.r rVar, Range range, Range range2, int i) {
        this.f5597d = rVar;
        this.f5598e = range;
        this.f5599f = range2;
        this.f5600g = i;
    }

    @Override // androidx.camera.video.r
    public final int b() {
        return this.f5600g;
    }

    @Override // androidx.camera.video.r
    public final Range<Integer> c() {
        return this.f5599f;
    }

    @Override // androidx.camera.video.r
    public final Range<Integer> d() {
        return this.f5598e;
    }

    @Override // androidx.camera.video.r
    public final C.r e() {
        return this.f5597d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f5597d.equals(rVar.e()) && this.f5598e.equals(rVar.d()) && this.f5599f.equals(rVar.c()) && this.f5600g == rVar.b();
    }

    @Override // androidx.camera.video.r
    public final a f() {
        a aVar = new a();
        aVar.f5601a = this.f5597d;
        aVar.f5602b = this.f5598e;
        aVar.f5603c = this.f5599f;
        aVar.f5604d = Integer.valueOf(this.f5600g);
        return aVar;
    }

    public final int hashCode() {
        return ((((((this.f5597d.hashCode() ^ 1000003) * 1000003) ^ this.f5598e.hashCode()) * 1000003) ^ this.f5599f.hashCode()) * 1000003) ^ this.f5600g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoSpec{qualitySelector=");
        sb2.append(this.f5597d);
        sb2.append(", frameRate=");
        sb2.append(this.f5598e);
        sb2.append(", bitrate=");
        sb2.append(this.f5599f);
        sb2.append(", aspectRatio=");
        return s3.b.m(sb2, this.f5600g, "}");
    }
}
