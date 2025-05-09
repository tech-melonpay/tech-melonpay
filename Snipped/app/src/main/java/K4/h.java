package k4;

/* compiled from: ExchangeListContainerRaw.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("total")
    private final Integer f23014a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("start_index")
    private final Integer f23015b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("end_index")
    private final Integer f23016c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("page")
    private final Integer f23017d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("pages")
    private final Integer f23018e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("next_page")
    private final String f23019f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f23014a, hVar.f23014a) && kotlin.jvm.internal.f.b(this.f23015b, hVar.f23015b) && kotlin.jvm.internal.f.b(this.f23016c, hVar.f23016c) && kotlin.jvm.internal.f.b(this.f23017d, hVar.f23017d) && kotlin.jvm.internal.f.b(this.f23018e, hVar.f23018e) && kotlin.jvm.internal.f.b(this.f23019f, hVar.f23019f);
    }

    public final int hashCode() {
        Integer num = this.f23014a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f23015b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f23016c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f23017d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f23018e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.f23019f;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SummaryRaw(total=" + this.f23014a + ", startIndex=" + this.f23015b + ", endIndex=" + this.f23016c + ", page=" + this.f23017d + ", pages=" + this.f23018e + ", nextPage=" + this.f23019f + ")";
    }
}
