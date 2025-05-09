package v5;

import C.v;
import java.util.ArrayList;

/* compiled from: CryptoExchangeListRequestDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f30615a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f30616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30617c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30618d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<String> f30619e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30620f;

    public e(int i, Integer num, String str, int i9, ArrayList<String> arrayList, String str2) {
        this.f30615a = i;
        this.f30616b = num;
        this.f30617c = str;
        this.f30618d = i9;
        this.f30619e = arrayList;
        this.f30620f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f30615a == eVar.f30615a && kotlin.jvm.internal.f.b(this.f30616b, eVar.f30616b) && kotlin.jvm.internal.f.b(this.f30617c, eVar.f30617c) && this.f30618d == eVar.f30618d && kotlin.jvm.internal.f.b(this.f30619e, eVar.f30619e) && kotlin.jvm.internal.f.b(this.f30620f, eVar.f30620f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f30615a) * 31;
        Integer num = this.f30616b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f30617c;
        int b9 = v.b(this.f30618d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        ArrayList<String> arrayList = this.f30619e;
        int hashCode3 = (b9 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str2 = this.f30620f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CryptoExchangeListRequestDomain(clientId=");
        sb2.append(this.f30615a);
        sb2.append(", cryptoAccountWalletId=");
        sb2.append(this.f30616b);
        sb2.append(", searchQuery=");
        sb2.append(this.f30617c);
        sb2.append(", page=");
        sb2.append(this.f30618d);
        sb2.append(", requestTypeList=");
        sb2.append(this.f30619e);
        sb2.append(", movementType=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30620f, ")");
    }
}
