package V6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: ConfirmTopUpFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3729a;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f3730b;

    /* renamed from: c, reason: collision with root package name */
    public final BankAccountDomain f3731c;

    /* renamed from: d, reason: collision with root package name */
    public final VaultDomain f3732d;

    /* renamed from: e, reason: collision with root package name */
    public final TopUpCommissionDomain f3733e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3734f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3735g;

    public b(int i, VaultDomain vaultDomain, BankAccountDomain bankAccountDomain, VaultDomain vaultDomain2, TopUpCommissionDomain topUpCommissionDomain, String str, boolean z10) {
        this.f3729a = i;
        this.f3730b = vaultDomain;
        this.f3731c = bankAccountDomain;
        this.f3732d = vaultDomain2;
        this.f3733e = topUpCommissionDomain;
        this.f3734f = str;
        this.f3735g = z10;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "routeId")) {
            throw new IllegalArgumentException("Required argument \"routeId\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("routeId");
        if (!bundle.containsKey("sourceVault")) {
            throw new IllegalArgumentException("Required argument \"sourceVault\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultDomain.class) && !Serializable.class.isAssignableFrom(VaultDomain.class)) {
            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        VaultDomain vaultDomain = (VaultDomain) bundle.get("sourceVault");
        if (!bundle.containsKey("bankTopUp")) {
            throw new IllegalArgumentException("Required argument \"bankTopUp\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(BankAccountDomain.class) && !Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
            throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        BankAccountDomain bankAccountDomain = (BankAccountDomain) bundle.get("bankTopUp");
        if (!bundle.containsKey("vaultTopUp")) {
            throw new IllegalArgumentException("Required argument \"vaultTopUp\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultDomain.class) && !Serializable.class.isAssignableFrom(VaultDomain.class)) {
            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        VaultDomain vaultDomain2 = (VaultDomain) bundle.get("vaultTopUp");
        if (!bundle.containsKey("commission")) {
            throw new IllegalArgumentException("Required argument \"commission\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TopUpCommissionDomain.class) && !Serializable.class.isAssignableFrom(TopUpCommissionDomain.class)) {
            throw new UnsupportedOperationException(TopUpCommissionDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TopUpCommissionDomain topUpCommissionDomain = (TopUpCommissionDomain) bundle.get("commission");
        if (!bundle.containsKey("amount")) {
            throw new IllegalArgumentException("Required argument \"amount\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("amount");
        if (string != null) {
            return new b(i, vaultDomain, bankAccountDomain, vaultDomain2, topUpCommissionDomain, string, bundle.containsKey("isOverLimit") ? bundle.getBoolean("isOverLimit") : false);
        }
        throw new IllegalArgumentException("Argument \"amount\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3729a == bVar.f3729a && f.b(this.f3730b, bVar.f3730b) && f.b(this.f3731c, bVar.f3731c) && f.b(this.f3732d, bVar.f3732d) && f.b(this.f3733e, bVar.f3733e) && f.b(this.f3734f, bVar.f3734f) && this.f3735g == bVar.f3735g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f3729a) * 31;
        VaultDomain vaultDomain = this.f3730b;
        int hashCode2 = (hashCode + (vaultDomain == null ? 0 : vaultDomain.hashCode())) * 31;
        BankAccountDomain bankAccountDomain = this.f3731c;
        int hashCode3 = (hashCode2 + (bankAccountDomain == null ? 0 : bankAccountDomain.hashCode())) * 31;
        VaultDomain vaultDomain2 = this.f3732d;
        int hashCode4 = (hashCode3 + (vaultDomain2 == null ? 0 : vaultDomain2.hashCode())) * 31;
        TopUpCommissionDomain topUpCommissionDomain = this.f3733e;
        return Boolean.hashCode(this.f3735g) + v.c((hashCode4 + (topUpCommissionDomain != null ? topUpCommissionDomain.hashCode() : 0)) * 31, 31, this.f3734f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmTopUpFragmentArgs(routeId=");
        sb2.append(this.f3729a);
        sb2.append(", sourceVault=");
        sb2.append(this.f3730b);
        sb2.append(", bankTopUp=");
        sb2.append(this.f3731c);
        sb2.append(", vaultTopUp=");
        sb2.append(this.f3732d);
        sb2.append(", commission=");
        sb2.append(this.f3733e);
        sb2.append(", amount=");
        sb2.append(this.f3734f);
        sb2.append(", isOverLimit=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f3735g, ")");
    }
}
