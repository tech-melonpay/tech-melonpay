package v4;

import kotlin.jvm.internal.f;

/* compiled from: ProxyTransactionContainerRaw.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("Total")
    private final Integer f30567a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("StartIndex")
    private final Integer f30568b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("EndIndex")
    private final Integer f30569c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("Page")
    private final Integer f30570d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("Pages")
    private final Integer f30571e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("NextPage")
    private final String f30572f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f30567a, bVar.f30567a) && f.b(this.f30568b, bVar.f30568b) && f.b(this.f30569c, bVar.f30569c) && f.b(this.f30570d, bVar.f30570d) && f.b(this.f30571e, bVar.f30571e) && f.b(this.f30572f, bVar.f30572f);
    }

    public final int hashCode() {
        Integer num = this.f30567a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f30568b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f30569c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f30570d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f30571e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.f30572f;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SummaryRaw(total=" + this.f30567a + ", startIndex=" + this.f30568b + ", endIndex=" + this.f30569c + ", page=" + this.f30570d + ", pages=" + this.f30571e + ", nextPage=" + this.f30572f + ")";
    }
}
