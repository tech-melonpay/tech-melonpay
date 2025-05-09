package Z6;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cards.TopUpCommissionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: TopUpFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4205a;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f4206b;

    /* renamed from: c, reason: collision with root package name */
    public final BankAccountDomain f4207c;

    /* renamed from: d, reason: collision with root package name */
    public final VaultDomain f4208d;

    /* renamed from: e, reason: collision with root package name */
    public final TopUpCommissionDomain f4209e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4210f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4211g;

    public d(int i, VaultDomain vaultDomain, BankAccountDomain bankAccountDomain, VaultDomain vaultDomain2, TopUpCommissionDomain topUpCommissionDomain, String str, boolean z10) {
        this.f4205a = i;
        this.f4206b = vaultDomain;
        this.f4207c = bankAccountDomain;
        this.f4208d = vaultDomain2;
        this.f4209e = topUpCommissionDomain;
        this.f4210f = str;
        this.f4211g = z10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("routeId", this.f4205a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f4206b;
        if (isAssignableFrom) {
            bundle.putParcelable("sourceVault", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("sourceVault", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable2 = this.f4207c;
        if (isAssignableFrom2) {
            bundle.putParcelable("bankTopUp", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("bankTopUp", serializable2);
        }
        boolean isAssignableFrom3 = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable3 = this.f4208d;
        if (isAssignableFrom3) {
            bundle.putParcelable("vaultTopUp", (Parcelable) serializable3);
        } else {
            if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("vaultTopUp", serializable3);
        }
        boolean isAssignableFrom4 = Parcelable.class.isAssignableFrom(TopUpCommissionDomain.class);
        Serializable serializable4 = this.f4209e;
        if (isAssignableFrom4) {
            bundle.putParcelable("commission", (Parcelable) serializable4);
        } else {
            if (!Serializable.class.isAssignableFrom(TopUpCommissionDomain.class)) {
                throw new UnsupportedOperationException(TopUpCommissionDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("commission", serializable4);
        }
        bundle.putString("amount", this.f4210f);
        bundle.putBoolean("isOverLimit", this.f4211g);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_topUpFragment_to_confirmTopUpFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4205a == dVar.f4205a && kotlin.jvm.internal.f.b(this.f4206b, dVar.f4206b) && kotlin.jvm.internal.f.b(this.f4207c, dVar.f4207c) && kotlin.jvm.internal.f.b(this.f4208d, dVar.f4208d) && kotlin.jvm.internal.f.b(this.f4209e, dVar.f4209e) && kotlin.jvm.internal.f.b(this.f4210f, dVar.f4210f) && this.f4211g == dVar.f4211g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f4205a) * 31;
        VaultDomain vaultDomain = this.f4206b;
        int hashCode2 = (hashCode + (vaultDomain == null ? 0 : vaultDomain.hashCode())) * 31;
        BankAccountDomain bankAccountDomain = this.f4207c;
        int hashCode3 = (hashCode2 + (bankAccountDomain == null ? 0 : bankAccountDomain.hashCode())) * 31;
        VaultDomain vaultDomain2 = this.f4208d;
        int hashCode4 = (hashCode3 + (vaultDomain2 == null ? 0 : vaultDomain2.hashCode())) * 31;
        TopUpCommissionDomain topUpCommissionDomain = this.f4209e;
        return Boolean.hashCode(this.f4211g) + v.c((hashCode4 + (topUpCommissionDomain != null ? topUpCommissionDomain.hashCode() : 0)) * 31, 31, this.f4210f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionTopUpFragmentToConfirmTopUpFragment(routeId=");
        sb2.append(this.f4205a);
        sb2.append(", sourceVault=");
        sb2.append(this.f4206b);
        sb2.append(", bankTopUp=");
        sb2.append(this.f4207c);
        sb2.append(", vaultTopUp=");
        sb2.append(this.f4208d);
        sb2.append(", commission=");
        sb2.append(this.f4209e);
        sb2.append(", amount=");
        sb2.append(this.f4210f);
        sb2.append(", isOverLimit=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f4211g, ")");
    }
}
