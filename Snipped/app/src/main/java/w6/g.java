package W6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CardDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class g implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3839a = "VIRTUAL_CARD_FROM_DETAIL_VAULT";

    /* renamed from: b, reason: collision with root package name */
    public final String f3840b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3841c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3842d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3843e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3844f;

    /* renamed from: g, reason: collision with root package name */
    public final VaultDomain f3845g;

    public g(String str, String str2, String str3, String str4, String str5, VaultDomain vaultDomain) {
        this.f3840b = str;
        this.f3841c = str2;
        this.f3842d = str3;
        this.f3843e = str4;
        this.f3844f = str5;
        this.f3845g = vaultDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("accountId", this.f3840b);
        bundle.putString("programId", this.f3841c);
        bundle.putString("vaultName", this.f3842d);
        bundle.putString("description", this.f3843e);
        bundle.putString("programType", this.f3844f);
        bundle.putString("typeNavigation", this.f3839a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f3845g;
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f3839a, gVar.f3839a) && kotlin.jvm.internal.f.b(this.f3840b, gVar.f3840b) && kotlin.jvm.internal.f.b(this.f3841c, gVar.f3841c) && kotlin.jvm.internal.f.b(this.f3842d, gVar.f3842d) && kotlin.jvm.internal.f.b(this.f3843e, gVar.f3843e) && kotlin.jvm.internal.f.b(this.f3844f, gVar.f3844f) && kotlin.jvm.internal.f.b(this.f3845g, gVar.f3845g);
    }

    public final int hashCode() {
        int hashCode = this.f3839a.hashCode() * 31;
        String str = this.f3840b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3841c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3842d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3843e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3844f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        VaultDomain vaultDomain = this.f3845g;
        return hashCode6 + (vaultDomain != null ? vaultDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionToCreateNewVirtualCardFragment(typeNavigation=" + this.f3839a + ", accountId=" + this.f3840b + ", programId=" + this.f3841c + ", vaultName=" + this.f3842d + ", description=" + this.f3843e + ", programType=" + this.f3844f + ", vault=" + this.f3845g + ")";
    }
}
