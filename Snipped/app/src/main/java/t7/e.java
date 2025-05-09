package T7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CryptoInformationFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final CompanyDetailsUI f3585a;

    public e(CompanyDetailsUI companyDetailsUI) {
        this.f3585a = companyDetailsUI;
    }

    public static final e fromBundle(Bundle bundle) {
        if (!v.y(bundle, e.class, "companyDetails")) {
            throw new IllegalArgumentException("Required argument \"companyDetails\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CompanyDetailsUI.class) && !Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
            throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CompanyDetailsUI companyDetailsUI = (CompanyDetailsUI) bundle.get("companyDetails");
        if (companyDetailsUI != null) {
            return new e(companyDetailsUI);
        }
        throw new IllegalArgumentException("Argument \"companyDetails\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && f.b(this.f3585a, ((e) obj).f3585a);
    }

    public final int hashCode() {
        return this.f3585a.hashCode();
    }

    public final String toString() {
        return "CryptoInformationFragmentArgs(companyDetails=" + this.f3585a + ")";
    }
}
