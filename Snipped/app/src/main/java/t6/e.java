package T6;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CardsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3564a = "VIRTUAL_CARD_WITHOUT_VAULT";

    /* renamed from: b, reason: collision with root package name */
    public final String f3565b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3566c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3567d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3568e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3569f;

    /* renamed from: g, reason: collision with root package name */
    public final VaultDomain f3570g;

    public e(String str, String str2, String str3, String str4, String str5, VaultDomain vaultDomain) {
        this.f3565b = str;
        this.f3566c = str2;
        this.f3567d = str3;
        this.f3568e = str4;
        this.f3569f = str5;
        this.f3570g = vaultDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("accountId", this.f3565b);
        bundle.putString("programId", this.f3566c);
        bundle.putString("vaultName", this.f3567d);
        bundle.putString("description", this.f3568e);
        bundle.putString("programType", this.f3569f);
        bundle.putString("typeNavigation", this.f3564a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f3570g;
        if (isAssignableFrom) {
            bundle.putParcelable("vault", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(VaultDomain.class)) {
            bundle.putSerializable("vault", serializable);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.actionToCreateNewVirtualCardFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f3564a, eVar.f3564a) && kotlin.jvm.internal.f.b(this.f3565b, eVar.f3565b) && kotlin.jvm.internal.f.b(this.f3566c, eVar.f3566c) && kotlin.jvm.internal.f.b(this.f3567d, eVar.f3567d) && kotlin.jvm.internal.f.b(this.f3568e, eVar.f3568e) && kotlin.jvm.internal.f.b(this.f3569f, eVar.f3569f) && kotlin.jvm.internal.f.b(this.f3570g, eVar.f3570g);
    }

    public final int hashCode() {
        int hashCode = this.f3564a.hashCode() * 31;
        String str = this.f3565b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3566c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3567d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3568e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3569f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        VaultDomain vaultDomain = this.f3570g;
        return hashCode6 + (vaultDomain != null ? vaultDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionToCreateNewVirtualCardFragment(typeNavigation=" + this.f3564a + ", accountId=" + this.f3565b + ", programId=" + this.f3566c + ", vaultName=" + this.f3567d + ", description=" + this.f3568e + ", programType=" + this.f3569f + ", vault=" + this.f3570g + ")";
    }
}
