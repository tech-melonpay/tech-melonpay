package W7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: SelectCompanyFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3877b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3878c;

    public e(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f3876a = createCompanyUI;
        this.f3877b = z10;
        this.f3878c = str;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CreateCompanyUI.class);
        Parcelable parcelable = this.f3876a;
        if (isAssignableFrom) {
            bundle.putParcelable("createCompany", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(CreateCompanyUI.class)) {
                throw new UnsupportedOperationException(CreateCompanyUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("createCompany", (Serializable) parcelable);
        }
        bundle.putBoolean("mEdit", this.f3877b);
        bundle.putString("companyId", this.f3878c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_selectCompanyFragment_to_inputAddressCompanyFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.b(this.f3876a, eVar.f3876a) && this.f3877b == eVar.f3877b && f.b(this.f3878c, eVar.f3878c);
    }

    public final int hashCode() {
        return this.f3878c.hashCode() + v.d(this.f3876a.hashCode() * 31, 31, this.f3877b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionSelectCompanyFragmentToInputAddressCompanyFragment(createCompany=");
        sb2.append(this.f3876a);
        sb2.append(", mEdit=");
        sb2.append(this.f3877b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3878c, ")");
    }
}
