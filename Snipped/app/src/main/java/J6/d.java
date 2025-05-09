package J6;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: LoginFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2167a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2169c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f2170d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2171e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2172f;

    public d(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i, String str4) {
        this.f2167a = str;
        this.f2168b = str2;
        this.f2169c = str3;
        this.f2170d = registerSuccessUI;
        this.f2171e = i;
        this.f2172f = str4;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f2167a);
        bundle.putString("phoneCode", this.f2168b);
        bundle.putString("phoneNumber", this.f2169c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f2170d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f2171e);
        bundle.putString("password", this.f2172f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_loginFragment_to_kycFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f2167a, dVar.f2167a) && kotlin.jvm.internal.f.b(this.f2168b, dVar.f2168b) && kotlin.jvm.internal.f.b(this.f2169c, dVar.f2169c) && kotlin.jvm.internal.f.b(this.f2170d, dVar.f2170d) && this.f2171e == dVar.f2171e && kotlin.jvm.internal.f.b(this.f2172f, dVar.f2172f);
    }

    public final int hashCode() {
        return this.f2172f.hashCode() + v.b(this.f2171e, (this.f2170d.hashCode() + v.c(v.c(this.f2167a.hashCode() * 31, 31, this.f2168b), 31, this.f2169c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionLoginFragmentToKycFragment(email=");
        sb2.append(this.f2167a);
        sb2.append(", phoneCode=");
        sb2.append(this.f2168b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f2169c);
        sb2.append(", userData=");
        sb2.append(this.f2170d);
        sb2.append(", startFrom=");
        sb2.append(this.f2171e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2172f, ")");
    }
}
