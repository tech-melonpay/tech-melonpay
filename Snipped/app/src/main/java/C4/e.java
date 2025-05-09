package c4;

import a4.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;

/* compiled from: UpdateExchangeRequestRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("status_to")
    private String f8559a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("crypto_account_wallet_id")
    private Integer f8560b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("destination_currency")
    private String f8561c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("blockchain_tx_id")
    private String f8562d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("photos")
    private final List<y> f8563e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("external_account_country")
    private String f8564f;

    public e(String str, Integer num, String str2, String str3, ArrayList arrayList, String str4) {
        this.f8559a = str;
        this.f8560b = num;
        this.f8561c = str2;
        this.f8562d = str3;
        this.f8563e = arrayList;
        this.f8564f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.b(this.f8559a, eVar.f8559a) && f.b(this.f8560b, eVar.f8560b) && f.b(this.f8561c, eVar.f8561c) && f.b(this.f8562d, eVar.f8562d) && f.b(this.f8563e, eVar.f8563e) && f.b(this.f8564f, eVar.f8564f);
    }

    public final int hashCode() {
        String str = this.f8559a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f8560b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f8561c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8562d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<y> list = this.f8563e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f8564f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f8559a;
        Integer num = this.f8560b;
        String str2 = this.f8561c;
        String str3 = this.f8562d;
        List<y> list = this.f8563e;
        String str4 = this.f8564f;
        StringBuilder sb2 = new StringBuilder("UpdateExchangeRequestRaw(statusTo=");
        sb2.append(str);
        sb2.append(", cryptoWalletId=");
        sb2.append(num);
        sb2.append(", destinationCurrence=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", blockchainTxId=", str3, ", photos=");
        sb2.append(list);
        sb2.append(", externalAccountCountry=");
        sb2.append(str4);
        sb2.append(")");
        return sb2.toString();
    }
}
