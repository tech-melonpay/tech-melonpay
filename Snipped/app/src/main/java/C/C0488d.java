package C;

import C.C0495k;
import android.location.Location;
import java.io.File;

/* compiled from: AutoValue_FileOutputOptions_FileOutputOptionsInternal.java */
/* renamed from: C.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488d extends C0495k.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f542a;

    /* renamed from: b, reason: collision with root package name */
    public final long f543b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f544c = null;

    /* renamed from: d, reason: collision with root package name */
    public final File f545d;

    /* compiled from: AutoValue_FileOutputOptions_FileOutputOptionsInternal.java */
    /* renamed from: C.d$a */
    public static final class a extends C0495k.a.AbstractC0004a {

        /* renamed from: a, reason: collision with root package name */
        public Long f546a;

        /* renamed from: b, reason: collision with root package name */
        public Long f547b;

        /* renamed from: c, reason: collision with root package name */
        public File f548c;

        public final C0488d a() {
            String str = this.f546a == null ? " fileSizeLimit" : "";
            if (this.f547b == null) {
                str = str.concat(" durationLimitMillis");
            }
            if (this.f548c == null) {
                str = v.n(str, " file");
            }
            if (str.isEmpty()) {
                return new C0488d(this.f546a.longValue(), this.f547b.longValue(), this.f548c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(long j10) {
            this.f547b = Long.valueOf(j10);
            return this;
        }

        public final a c(long j10) {
            this.f546a = Long.valueOf(j10);
            return this;
        }
    }

    public C0488d(long j10, long j11, File file) {
        this.f542a = j10;
        this.f543b = j11;
        this.f545d = file;
    }

    @Override // C.AbstractC0497m.a
    public final long a() {
        return this.f543b;
    }

    @Override // C.AbstractC0497m.a
    public final long b() {
        return this.f542a;
    }

    @Override // C.AbstractC0497m.a
    public final Location c() {
        return this.f544c;
    }

    @Override // C.C0495k.a
    public final File d() {
        return this.f545d;
    }

    public final boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0495k.a)) {
            return false;
        }
        C0495k.a aVar = (C0495k.a) obj;
        return this.f542a == aVar.b() && this.f543b == aVar.a() && ((location = this.f544c) != null ? location.equals(aVar.c()) : aVar.c() == null) && this.f545d.equals(aVar.d());
    }

    public final int hashCode() {
        long j10 = this.f542a;
        long j11 = this.f543b;
        int i = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f544c;
        return ((i ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f545d.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f542a + ", durationLimitMillis=" + this.f543b + ", location=" + this.f544c + ", file=" + this.f545d + "}";
    }
}
