package j2;

/* compiled from: AutoValue_SendRequest.java */
/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883b extends AbstractC0891j {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0892k f22421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22422b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.c<?> f22423c;

    /* renamed from: d, reason: collision with root package name */
    public final g2.d<?, byte[]> f22424d;

    /* renamed from: e, reason: collision with root package name */
    public final g2.b f22425e;

    public C0883b(AbstractC0892k abstractC0892k, String str, g2.c cVar, g2.d dVar, g2.b bVar) {
        this.f22421a = abstractC0892k;
        this.f22422b = str;
        this.f22423c = cVar;
        this.f22424d = dVar;
        this.f22425e = bVar;
    }

    @Override // j2.AbstractC0891j
    public final g2.b a() {
        return this.f22425e;
    }

    @Override // j2.AbstractC0891j
    public final g2.c<?> b() {
        return this.f22423c;
    }

    @Override // j2.AbstractC0891j
    public final g2.d<?, byte[]> c() {
        return this.f22424d;
    }

    @Override // j2.AbstractC0891j
    public final AbstractC0892k d() {
        return this.f22421a;
    }

    @Override // j2.AbstractC0891j
    public final String e() {
        return this.f22422b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0891j)) {
            return false;
        }
        AbstractC0891j abstractC0891j = (AbstractC0891j) obj;
        return this.f22421a.equals(abstractC0891j.d()) && this.f22422b.equals(abstractC0891j.e()) && this.f22423c.equals(abstractC0891j.b()) && this.f22424d.equals(abstractC0891j.c()) && this.f22425e.equals(abstractC0891j.a());
    }

    public final int hashCode() {
        return ((((((((this.f22421a.hashCode() ^ 1000003) * 1000003) ^ this.f22422b.hashCode()) * 1000003) ^ this.f22423c.hashCode()) * 1000003) ^ this.f22424d.hashCode()) * 1000003) ^ this.f22425e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f22421a + ", transportName=" + this.f22422b + ", event=" + this.f22423c + ", transformer=" + this.f22424d + ", encoding=" + this.f22425e + "}";
    }
}
