package v5;

import C.v;
import java.util.ArrayList;

/* compiled from: CryptoWalletUpdateDomain.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Long f30646a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f30647b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30648c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30649d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<u5.j> f30650e;

    public i(Long l10, Integer num, String str, String str2, ArrayList<u5.j> arrayList) {
        this.f30646a = l10;
        this.f30647b = num;
        this.f30648c = str;
        this.f30649d = str2;
        this.f30650e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f30646a, iVar.f30646a) && kotlin.jvm.internal.f.b(this.f30647b, iVar.f30647b) && kotlin.jvm.internal.f.b(this.f30648c, iVar.f30648c) && kotlin.jvm.internal.f.b(this.f30649d, iVar.f30649d) && kotlin.jvm.internal.f.b(this.f30650e, iVar.f30650e);
    }

    public final int hashCode() {
        Long l10 = this.f30646a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Integer num = this.f30647b;
        return this.f30650e.hashCode() + v.c(v.c((hashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.f30648c), 31, this.f30649d);
    }

    public final String toString() {
        return "CryptoWalletUpdateDomain(pk=" + this.f30646a + ", clientId=" + this.f30647b + ", statusTo=" + this.f30648c + ", verificationTxId=" + this.f30649d + ", photos=" + this.f30650e + ")";
    }
}
