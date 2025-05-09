package androidx.camera.video;

import C.v;
import androidx.camera.video.g;

/* compiled from: AutoValue_MediaSpec.java */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final r f5583a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.camera.video.a f5584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5585c;

    /* compiled from: AutoValue_MediaSpec.java */
    public static final class a extends g.a {

        /* renamed from: a, reason: collision with root package name */
        public r f5586a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.camera.video.a f5587b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f5588c;

        public final c a() {
            String str = this.f5586a == null ? " videoSpec" : "";
            if (this.f5587b == null) {
                str = str.concat(" audioSpec");
            }
            if (this.f5588c == null) {
                str = v.n(str, " outputFormat");
            }
            if (str.isEmpty()) {
                return new c(this.f5586a, this.f5587b, this.f5588c.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(r rVar) {
            if (rVar == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f5586a = rVar;
            return this;
        }
    }

    public c(r rVar, androidx.camera.video.a aVar, int i) {
        this.f5583a = rVar;
        this.f5584b = aVar;
        this.f5585c = i;
    }

    @Override // androidx.camera.video.g
    public final androidx.camera.video.a b() {
        return this.f5584b;
    }

    @Override // androidx.camera.video.g
    public final int c() {
        return this.f5585c;
    }

    @Override // androidx.camera.video.g
    public final r d() {
        return this.f5583a;
    }

    public final a e() {
        a aVar = new a();
        aVar.f5586a = this.f5583a;
        aVar.f5587b = this.f5584b;
        aVar.f5588c = Integer.valueOf(this.f5585c);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5583a.equals(gVar.d()) && this.f5584b.equals(gVar.b()) && this.f5585c == gVar.c();
    }

    public final int hashCode() {
        return ((((this.f5583a.hashCode() ^ 1000003) * 1000003) ^ this.f5584b.hashCode()) * 1000003) ^ this.f5585c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSpec{videoSpec=");
        sb2.append(this.f5583a);
        sb2.append(", audioSpec=");
        sb2.append(this.f5584b);
        sb2.append(", outputFormat=");
        return s3.b.m(sb2, this.f5585c, "}");
    }
}
