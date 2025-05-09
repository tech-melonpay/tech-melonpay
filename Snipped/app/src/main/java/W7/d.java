package W7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: SelectCompanyFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f3873a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3874b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3875c;

    public d(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f3873a = createCompanyUI;
        this.f3874b = z10;
        this.f3875c = str;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "createCompany")) {
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
            return new d(createCompanyUI, z10, string);
        }
        throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f3873a, dVar.f3873a) && this.f3874b == dVar.f3874b && f.b(this.f3875c, dVar.f3875c);
    }

    public final int hashCode() {
        return this.f3875c.hashCode() + v.d(this.f3873a.hashCode() * 31, 31, this.f3874b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectCompanyFragmentArgs(createCompany=");
        sb2.append(this.f3873a);
        sb2.append(", mEdit=");
        sb2.append(this.f3874b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3875c, ")");
    }
}
