package g4;

import e4.C0715a;
import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: CardTransactionResponseRaw.kt */
/* loaded from: classes.dex */
public final class b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("records")
    private ArrayList<C0765a> f20791b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("total_records_number")
    private Integer f20792c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("debit_turnover")
    private Double f20793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super(0);
        ArrayList<C0765a> arrayList = new ArrayList<>();
        this.f20791b = arrayList;
        this.f20792c = null;
        this.f20793d = null;
    }

    public final ArrayList<C0765a> b() {
        return this.f20791b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f20791b, bVar.f20791b) && f.b(this.f20792c, bVar.f20792c) && f.b(this.f20793d, bVar.f20793d);
    }

    public final int hashCode() {
        int hashCode = this.f20791b.hashCode() * 31;
        Integer num = this.f20792c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d10 = this.f20793d;
        return hashCode2 + (d10 != null ? d10.hashCode() : 0);
    }

    public final String toString() {
        return "CardTransactionResponseRaw(records=" + this.f20791b + ", totalRecordsNumber=" + this.f20792c + ", debitTurnover=" + this.f20793d + ")";
    }
}
