package Y7;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: SubmitCompanyFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CompanyDetailsUI f4120a;

    public b(CompanyDetailsUI companyDetailsUI) {
        this.f4120a = companyDetailsUI;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "companyDetails")) {
            throw new IllegalArgumentException("Required argument \"companyDetails\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CompanyDetailsUI.class) && !Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
            throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CompanyDetailsUI companyDetailsUI = (CompanyDetailsUI) bundle.get("companyDetails");
        if (companyDetailsUI != null) {
            return new b(companyDetailsUI);
        }
        throw new IllegalArgumentException("Argument \"companyDetails\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f4120a, ((b) obj).f4120a);
    }

    public final int hashCode() {
        return this.f4120a.hashCode();
    }

    public final String toString() {
        return "SubmitCompanyFragmentArgs(companyDetails=" + this.f4120a + ")";
    }
}
