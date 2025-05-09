package e4;

import kotlin.jvm.internal.f;

/* compiled from: Container.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("total")
    private final Integer f20511a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("start_index")
    private final Integer f20512b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("end_index")
    private final Integer f20513c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("page")
    private final Integer f20514d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("pages")
    private final Integer f20515e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("next_page")
    private final Integer f20516f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f20511a, bVar.f20511a) && f.b(this.f20512b, bVar.f20512b) && f.b(this.f20513c, bVar.f20513c) && f.b(this.f20514d, bVar.f20514d) && f.b(this.f20515e, bVar.f20515e) && f.b(this.f20516f, bVar.f20516f);
    }

    public final int hashCode() {
        Integer num = this.f20511a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20512b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20513c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f20514d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f20515e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f20516f;
        return hashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        return "ContainerSummery(total=" + this.f20511a + ", startIndex=" + this.f20512b + ", endIndex=" + this.f20513c + ", page=" + this.f20514d + ", pages=" + this.f20515e + ", nextPage=" + this.f20516f + ")";
    }
}
