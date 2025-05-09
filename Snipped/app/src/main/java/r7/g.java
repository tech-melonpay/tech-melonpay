package R7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import java.io.Serializable;

/* compiled from: BusinessActivityFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class g implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final CompanyDetailsUI f3308a;

    public g(CompanyDetailsUI companyDetailsUI) {
        this.f3308a = companyDetailsUI;
    }

    public static final g fromBundle(Bundle bundle) {
        if (!v.y(bundle, g.class, "companyDetails")) {
            throw new IllegalArgumentException("Required argument \"companyDetails\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CompanyDetailsUI.class) && !Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
            throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CompanyDetailsUI companyDetailsUI = (CompanyDetailsUI) bundle.get("companyDetails");
        if (companyDetailsUI != null) {
            return new g(companyDetailsUI);
        }
        throw new IllegalArgumentException("Argument \"companyDetails\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.f.b(this.f3308a, ((g) obj).f3308a);
    }

    public final int hashCode() {
        return this.f3308a.hashCode();
    }

    public final String toString() {
        return "BusinessActivityFragmentArgs(companyDetails=" + this.f3308a + ")";
    }
}
