package S7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import java.io.Serializable;

/* compiled from: InputAddressCompanyFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f3404a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3406c;

    public e(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f3404a = createCompanyUI;
        this.f3405b = z10;
        this.f3406c = str;
    }

    public static final e fromBundle(Bundle bundle) {
        if (!v.y(bundle, e.class, "createCompany")) {
            throw new IllegalArgumentException("Required argument \"createCompany\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CreateCompanyUI.class) && !Serializable.class.isAssignableFrom(CreateCompanyUI.class)) {
            throw new UnsupportedOperationException(CreateCompanyUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CreateCompanyUI createCompanyUI = (CreateCompanyUI) bundle.get("createCompany");
        if (createCompanyUI == null) {
            throw new IllegalArgumentException("Argument \"createCompany\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("mEdit")) {
            throw new IllegalArgumentException("Required argument \"mEdit\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("mEdit");
        if (!bundle.containsKey("companyId")) {
            throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("companyId");
        if (string != null) {
            return new e(createCompanyUI, z10, string);
        }
        throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f3404a, eVar.f3404a) && this.f3405b == eVar.f3405b && kotlin.jvm.internal.f.b(this.f3406c, eVar.f3406c);
    }

    public final int hashCode() {
        return this.f3406c.hashCode() + v.d(this.f3404a.hashCode() * 31, 31, this.f3405b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputAddressCompanyFragmentArgs(createCompany=");
        sb2.append(this.f3404a);
        sb2.append(", mEdit=");
        sb2.append(this.f3405b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3406c, ")");
    }
}
