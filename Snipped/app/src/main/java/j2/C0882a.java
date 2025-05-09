package j2;

import C.v;
import j2.AbstractC0888g;
import java.util.Map;

/* compiled from: AutoValue_EventInternal.java */
/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882a extends AbstractC0888g {

    /* renamed from: a, reason: collision with root package name */
    public final String f22409a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22410b;

    /* renamed from: c, reason: collision with root package name */
    public final C0887f f22411c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22412d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22413e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f22414f;

    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: j2.a$a, reason: collision with other inner class name */
    public static final class C0415a extends AbstractC0888g.a {

        /* renamed from: a, reason: collision with root package name */
        public String f22415a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f22416b;

        /* renamed from: c, reason: collision with root package name */
        public C0887f f22417c;

        /* renamed from: d, reason: collision with root package name */
        public Long f22418d;

        /* renamed from: e, reason: collision with root package name */
        public Long f22419e;

        /* renamed from: f, reason: collision with root package name */
        public Map<String, String> f22420f;

        public final C0882a b() {
            String str = this.f22415a == null ? " transportName" : "";
            if (this.f22417c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f22418d == null) {
                str = v.n(str, " eventMillis");
            }
            if (this.f22419e == null) {
                str = v.n(str, " uptimeMillis");
            }
            if (this.f22420f == null) {
                str = v.n(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new C0882a(this.f22415a, this.f22416b, this.f22417c, this.f22418d.longValue(), this.f22419e.longValue(), this.f22420f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public C0882a(String str, Integer num, C0887f c0887f, long j10, long j11, Map map) {
        this.f22409a = str;
        this.f22410b = num;
        this.f22411c = c0887f;
        this.f22412d = j10;
        this.f22413e = j11;
        this.f22414f = map;
    }

    @Override // j2.AbstractC0888g
    public final Map<String, String> b() {
        return this.f22414f;
    }

    @Override // j2.AbstractC0888g
    public final Integer c() {
        return this.f22410b;
    }

    @Override // j2.AbstractC0888g
    public final C0887f d() {
        return this.f22411c;
    }

    @Override // j2.AbstractC0888g
    public final long e() {
        return this.f22412d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0888g)) {
            return false;
        }
        AbstractC0888g abstractC0888g = (AbstractC0888g) obj;
        return this.f22409a.equals(abstractC0888g.g()) && ((num = this.f22410b) != null ? num.equals(abstractC0888g.c()) : abstractC0888g.c() == null) && this.f22411c.equals(abstractC0888g.d()) && this.f22412d == abstractC0888g.e() && this.f22413e == abstractC0888g.h() && this.f22414f.equals(abstractC0888g.b());
    }

    @Override // j2.AbstractC0888g
    public final String g() {
        return this.f22409a;
    }

    @Override // j2.AbstractC0888g
    public final long h() {
        return this.f22413e;
    }

    public final int hashCode() {
        int hashCode = (this.f22409a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f22410b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f22411c.hashCode()) * 1000003;
        long j10 = this.f22412d;
        int i = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f22413e;
        return ((i ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f22414f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f22409a + ", code=" + this.f22410b + ", encodedPayload=" + this.f22411c + ", eventMillis=" + this.f22412d + ", uptimeMillis=" + this.f22413e + ", autoMetadata=" + this.f22414f + "}";
    }
}
