package X7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: SelectCountryFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f4034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4035b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4036c;

    public c(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f4034a = createCompanyUI;
        this.f4035b = z10;
        this.f4036c = str;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CreateCompanyUI.class);
        Parcelable parcelable = this.f4034a;
        if (isAssignableFrom) {
            bundle.putParcelable("createCompany", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(CreateCompanyUI.class)) {
                throw new UnsupportedOperationException(CreateCompanyUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("createCompany", (Serializable) parcelable);
        }
        bundle.putBoolean("mEdit", this.f4035b);
        bundle.putString("companyId", this.f4036c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_selectCountryFragment_to_selectCompanyFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f4034a, cVar.f4034a) && this.f4035b == cVar.f4035b && f.b(this.f4036c, cVar.f4036c);
    }

    public final int hashCode() {
        return this.f4036c.hashCode() + v.d(this.f4034a.hashCode() * 31, 31, this.f4035b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionSelectCountryFragmentToSelectCompanyFragment(createCompany=");
        sb2.append(this.f4034a);
        sb2.append(", mEdit=");
        sb2.append(this.f4035b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f4036c, ")");
    }
}
