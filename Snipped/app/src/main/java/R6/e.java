package R6;

import C.v;
import android.os.Bundle;

/* compiled from: CardSecurityVerificationFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3268b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3269c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3270d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3271e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3272f;

    public e() {
        this(null, null, null, null, null, null);
    }

    public static final e fromBundle(Bundle bundle) {
        return new e(v.y(bundle, e.class, "accountId") ? bundle.getString("accountId") : null, bundle.containsKey("programId") ? bundle.getString("programId") : null, bundle.containsKey("cardName") ? bundle.getString("cardName") : null, bundle.containsKey("vaultName") ? bundle.getString("vaultName") : null, bundle.containsKey("navigationType") ? bundle.getString("navigationType") : null, bundle.containsKey("vaultId") ? bundle.getString("vaultId") : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f3267a, eVar.f3267a) && kotlin.jvm.internal.f.b(this.f3268b, eVar.f3268b) && kotlin.jvm.internal.f.b(this.f3269c, eVar.f3269c) && kotlin.jvm.internal.f.b(this.f3270d, eVar.f3270d) && kotlin.jvm.internal.f.b(this.f3271e, eVar.f3271e) && kotlin.jvm.internal.f.b(this.f3272f, eVar.f3272f);
    }

    public final int hashCode() {
        String str = this.f3267a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3268b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3269c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3270d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3271e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f3272f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardSecurityVerificationFragmentArgs(accountId=");
        sb2.append(this.f3267a);
        sb2.append(", programId=");
        sb2.append(this.f3268b);
        sb2.append(", cardName=");
        sb2.append(this.f3269c);
        sb2.append(", vaultName=");
        sb2.append(this.f3270d);
        sb2.append(", navigationType=");
        sb2.append(this.f3271e);
        sb2.append(", vaultId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3272f, ")");
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f3267a = str;
        this.f3268b = str2;
        this.f3269c = str3;
        this.f3270d = str4;
        this.f3271e = str5;
        this.f3272f = str6;
    }
}
