package c4;

import kotlin.jvm.internal.f;

/* compiled from: CreateWithdrawRequestRaw.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("source_currency")
    private String f8548a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("crypto_account_wallet_id")
    private Integer f8549b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("cryptowallet_id")
    private Integer f8550c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("source_amount")
    private Float f8551d;

    public c(String str, Integer num, Integer num2, Float f10) {
        this.f8548a = str;
        this.f8549b = num;
        this.f8550c = num2;
        this.f8551d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f8548a, cVar.f8548a) && f.b(this.f8549b, cVar.f8549b) && f.b(this.f8550c, cVar.f8550c) && f.b(this.f8551d, cVar.f8551d);
    }

    public final int hashCode() {
        String str = this.f8548a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f8549b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f8550c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f10 = this.f8551d;
        return hashCode3 + (f10 != null ? f10.hashCode() : 0);
    }

    public final String toString() {
        return "CreateWithdrawRequestRaw(sourceCurrency=" + this.f8548a + ", accountId=" + this.f8549b + ", walletId=" + this.f8550c + ", sourceAmount=" + this.f8551d + ")";
    }
}
