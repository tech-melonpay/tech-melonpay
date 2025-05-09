package S7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.company.CreateCompanyUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: InputAddressCompanyFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CreateCompanyUI f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3408b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3409c;

    public f(CreateCompanyUI createCompanyUI, boolean z10, String str) {
        this.f3407a = createCompanyUI;
        this.f3408b = z10;
        this.f3409c = str;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CreateCompanyUI.class);
        Parcelable parcelable = this.f3407a;
        if (isAssignableFrom) {
            bundle.putParcelable("createCompany", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(CreateCompanyUI.class)) {
                throw new UnsupportedOperationException(CreateCompanyUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("createCompany", (Serializable) parcelable);
        }
        bundle.putBoolean("mEdit", this.f3408b);
        bundle.putString("companyId", this.f3409c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_inputAddressCompanyFragment_to_positionInCompanyFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f3407a, fVar.f3407a) && this.f3408b == fVar.f3408b && kotlin.jvm.internal.f.b(this.f3409c, fVar.f3409c);
    }

    public final int hashCode() {
        return this.f3409c.hashCode() + v.d(this.f3407a.hashCode() * 31, 31, this.f3408b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionInputAddressCompanyFragmentToPositionInCompanyFragment(createCompany=");
        sb2.append(this.f3407a);
        sb2.append(", mEdit=");
        sb2.append(this.f3408b);
        sb2.append(", companyId=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3409c, ")");
    }
}
