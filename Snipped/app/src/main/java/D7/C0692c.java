package d7;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CreateNewCardVaultFragmentDirections.kt */
/* renamed from: d7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0692c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f20445a = "VIRTUAL_CARD_AND_VAULT";

    /* renamed from: b, reason: collision with root package name */
    public final String f20446b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20447c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20448d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20449e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20450f;

    /* renamed from: g, reason: collision with root package name */
    public final VaultDomain f20451g;

    public C0692c(String str, String str2, String str3, String str4, String str5, VaultDomain vaultDomain) {
        this.f20446b = str;
        this.f20447c = str2;
        this.f20448d = str3;
        this.f20449e = str4;
        this.f20450f = str5;
        this.f20451g = vaultDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("accountId", this.f20446b);
        bundle.putString("programId", this.f20447c);
        bundle.putString("vaultName", this.f20448d);
        bundle.putString("description", this.f20449e);
        bundle.putString("programType", this.f20450f);
        bundle.putString("typeNavigation", this.f20445a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f20451g;
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
        if (!(obj instanceof C0692c)) {
            return false;
        }
        C0692c c0692c = (C0692c) obj;
        return kotlin.jvm.internal.f.b(this.f20445a, c0692c.f20445a) && kotlin.jvm.internal.f.b(this.f20446b, c0692c.f20446b) && kotlin.jvm.internal.f.b(this.f20447c, c0692c.f20447c) && kotlin.jvm.internal.f.b(this.f20448d, c0692c.f20448d) && kotlin.jvm.internal.f.b(this.f20449e, c0692c.f20449e) && kotlin.jvm.internal.f.b(this.f20450f, c0692c.f20450f) && kotlin.jvm.internal.f.b(this.f20451g, c0692c.f20451g);
    }

    public final int hashCode() {
        int hashCode = this.f20445a.hashCode() * 31;
        String str = this.f20446b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20447c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20448d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20449e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20450f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        VaultDomain vaultDomain = this.f20451g;
        return hashCode6 + (vaultDomain != null ? vaultDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionToCreateNewVirtualCardFragment(typeNavigation=" + this.f20445a + ", accountId=" + this.f20446b + ", programId=" + this.f20447c + ", vaultName=" + this.f20448d + ", description=" + this.f20449e + ", programType=" + this.f20450f + ", vault=" + this.f20451g + ")";
    }
}
