package S7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: ConfirmAddressCompanyFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f3397a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3398b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3399c;

    public b(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f3397a = createCompanyUI;
        this.f3398b = z10;
        this.f3399c = str;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CreateCompanyUI.class);
        Parcelable parcelable = this.f3397a;
        if (isAssignableFrom) {
            bundle.putParcelable("createCompany", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(CreateCompanyUI.class)) {
                throw new UnsupportedOperationException(CreateCompanyUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("createCompany", (Serializable) parcelable);
        }
        bundle.putBoolean("mEdit", this.f3398b);
        bundle.putString("companyId", this.f3399c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_confirmAddressCompanyFragment_to_positionInCompanyFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f3397a, bVar.f3397a) && this.f3398b == bVar.f3398b && kotlin.jvm.internal.f.b(this.f3399c, bVar.f3399c);
    }

    public final int hashCode() {
        return this.f3399c.hashCode() + v.d(this.f3397a.hashCode() * 31, 31, this.f3398b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionConfirmAddressCompanyFragmentToPositionInCompanyFragment(createCompany=");
        sb2.append(this.f3397a);
        sb2.append(", mEdit=");
        sb2.append(this.f3398b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3399c, ")");
    }
}
