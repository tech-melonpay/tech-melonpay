package a4;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CryptoUpdateRequestRaw.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("status_to")
    private final String f4322a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("verification_tx_id")
    private final String f4323b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("photos")
    private final List<y> f4324c;

    public l(String str, String str2, ArrayList arrayList) {
        this.f4322a = str;
        this.f4323b = str2;
        this.f4324c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.f.b(this.f4322a, lVar.f4322a) && kotlin.jvm.internal.f.b(this.f4323b, lVar.f4323b) && kotlin.jvm.internal.f.b(this.f4324c, lVar.f4324c);
    }

    public final int hashCode() {
        return this.f4324c.hashCode() + C.v.c(this.f4322a.hashCode() * 31, 31, this.f4323b);
    }

    public final String toString() {
        String str = this.f4322a;
        String str2 = this.f4323b;
        List<y> list = this.f4324c;
        StringBuilder p10 = s3.b.p("CryptoUpdateRequestRaw(statusTo=", str, ", verificationTxId=", str2, ", photos=");
        p10.append(list);
        p10.append(")");
        return p10.toString();
    }
}
