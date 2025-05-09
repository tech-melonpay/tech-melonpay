package t4;

import java.util.ArrayList;
import kotlin.jvm.internal.f;

/* compiled from: SignerRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("@result")
    private final Boolean f27515a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("@level")
    private final Integer f27516b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("record")
    private final ArrayList<d> f27517c;

    public final ArrayList<d> a() {
        return this.f27517c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.b(this.f27515a, eVar.f27515a) && f.b(this.f27516b, eVar.f27516b) && f.b(this.f27517c, eVar.f27517c);
    }

    public final int hashCode() {
        Boolean bool = this.f27515a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f27516b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList<d> arrayList = this.f27517c;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "SignerResponseRaw(result=" + this.f27515a + ", level=" + this.f27516b + ", record=" + this.f27517c + ")";
    }
}
