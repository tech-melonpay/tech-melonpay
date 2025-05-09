package v5;

import C.v;
import java.util.ArrayList;

/* compiled from: CryptoExchangeUpdateDomain.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f30628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30629b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30630c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f30631d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30632e = null;

    /* renamed from: f, reason: collision with root package name */
    public final String f30633f = null;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<u5.j> f30634g = null;

    /* renamed from: h, reason: collision with root package name */
    public final String f30635h;

    public g(int i, int i9, String str, Integer num, String str2) {
        this.f30628a = i;
        this.f30629b = i9;
        this.f30630c = str;
        this.f30631d = num;
        this.f30635h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f30628a == gVar.f30628a && this.f30629b == gVar.f30629b && kotlin.jvm.internal.f.b(this.f30630c, gVar.f30630c) && kotlin.jvm.internal.f.b(this.f30631d, gVar.f30631d) && kotlin.jvm.internal.f.b(this.f30632e, gVar.f30632e) && kotlin.jvm.internal.f.b(this.f30633f, gVar.f30633f) && kotlin.jvm.internal.f.b(this.f30634g, gVar.f30634g) && kotlin.jvm.internal.f.b(this.f30635h, gVar.f30635h);
    }

    public final int hashCode() {
        int b9 = v.b(this.f30629b, Integer.hashCode(this.f30628a) * 31, 31);
        String str = this.f30630c;
        int hashCode = (b9 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f30631d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f30632e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30633f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList<u5.j> arrayList = this.f30634g;
        int hashCode5 = (hashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.f30635h;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CryptoExchangeUpdateDomain(pk=");
        sb2.append(this.f30628a);
        sb2.append(", clientId=");
        sb2.append(this.f30629b);
        sb2.append(", statusTo=");
        sb2.append(this.f30630c);
        sb2.append(", cryptowalletId=");
        sb2.append(this.f30631d);
        sb2.append(", destinationCurrency=");
        sb2.append(this.f30632e);
        sb2.append(", blockchainTxId=");
        sb2.append(this.f30633f);
        sb2.append(", photos=");
        sb2.append(this.f30634g);
        sb2.append(", externalAccountCountry=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30635h, ")");
    }
}
