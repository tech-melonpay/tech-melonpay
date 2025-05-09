package e7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;

/* compiled from: CreateNewVirtualCardFragmentArgs.kt */
/* renamed from: e7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0723c implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f20541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20542b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20543c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20544d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20545e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20546f;

    /* renamed from: g, reason: collision with root package name */
    public final VaultDomain f20547g;

    public C0723c(String str, String str2, String str3, String str4, String str5, String str6, VaultDomain vaultDomain) {
        this.f20541a = str;
        this.f20542b = str2;
        this.f20543c = str3;
        this.f20544d = str4;
        this.f20545e = str5;
        this.f20546f = str6;
        this.f20547g = vaultDomain;
    }

    public static final C0723c fromBundle(Bundle bundle) {
        VaultDomain vaultDomain = null;
        String string = v.y(bundle, C0723c.class, "accountId") ? bundle.getString("accountId") : null;
        String string2 = bundle.containsKey("programId") ? bundle.getString("programId") : null;
        String string3 = bundle.containsKey("vaultName") ? bundle.getString("vaultName") : null;
        String string4 = bundle.containsKey("description") ? bundle.getString("description") : null;
        String string5 = bundle.containsKey("programType") ? bundle.getString("programType") : null;
        if (!bundle.containsKey("typeNavigation")) {
            throw new IllegalArgumentException("Required argument \"typeNavigation\" is missing and does not have an android:defaultValue");
        }
        String string6 = bundle.getString("typeNavigation");
        if (string6 == null) {
            throw new IllegalArgumentException("Argument \"typeNavigation\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("vault")) {
            if (!Parcelable.class.isAssignableFrom(VaultDomain.class) && !Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            vaultDomain = (VaultDomain) bundle.get("vault");
        }
        return new C0723c(string6, string, string2, string3, string4, string5, vaultDomain);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0723c)) {
            return false;
        }
        C0723c c0723c = (C0723c) obj;
        return kotlin.jvm.internal.f.b(this.f20541a, c0723c.f20541a) && kotlin.jvm.internal.f.b(this.f20542b, c0723c.f20542b) && kotlin.jvm.internal.f.b(this.f20543c, c0723c.f20543c) && kotlin.jvm.internal.f.b(this.f20544d, c0723c.f20544d) && kotlin.jvm.internal.f.b(this.f20545e, c0723c.f20545e) && kotlin.jvm.internal.f.b(this.f20546f, c0723c.f20546f) && kotlin.jvm.internal.f.b(this.f20547g, c0723c.f20547g);
    }

    public final int hashCode() {
        int hashCode = this.f20541a.hashCode() * 31;
        String str = this.f20542b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20543c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20544d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20545e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20546f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        VaultDomain vaultDomain = this.f20547g;
        return hashCode6 + (vaultDomain != null ? vaultDomain.hashCode() : 0);
    }

    public final String toString() {
        return "CreateNewVirtualCardFragmentArgs(typeNavigation=" + this.f20541a + ", accountId=" + this.f20542b + ", programId=" + this.f20543c + ", vaultName=" + this.f20544d + ", description=" + this.f20545e + ", programType=" + this.f20546f + ", vault=" + this.f20547g + ")";
    }
}
