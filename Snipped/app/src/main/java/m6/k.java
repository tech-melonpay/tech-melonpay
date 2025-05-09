package M6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: RegisterFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class k implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2631c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f2632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2633e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f2634f;

    public k(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, String str4) {
        this.f2629a = str;
        this.f2630b = str2;
        this.f2631c = str3;
        this.f2632d = registerSuccessUI;
        this.f2634f = str4;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f2629a);
        bundle.putString("phoneCode", this.f2630b);
        bundle.putString("phoneNumber", this.f2631c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f2632d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f2633e);
        bundle.putString("password", this.f2634f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_registerFragment_to_validationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.f.b(this.f2629a, kVar.f2629a) && kotlin.jvm.internal.f.b(this.f2630b, kVar.f2630b) && kotlin.jvm.internal.f.b(this.f2631c, kVar.f2631c) && kotlin.jvm.internal.f.b(this.f2632d, kVar.f2632d) && this.f2633e == kVar.f2633e && kotlin.jvm.internal.f.b(this.f2634f, kVar.f2634f);
    }

    public final int hashCode() {
        return this.f2634f.hashCode() + C.v.b(this.f2633e, (this.f2632d.hashCode() + C.v.c(C.v.c(this.f2629a.hashCode() * 31, 31, this.f2630b), 31, this.f2631c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionRegisterFragmentToValidationFragment(email=");
        sb2.append(this.f2629a);
        sb2.append(", phoneCode=");
        sb2.append(this.f2630b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f2631c);
        sb2.append(", userData=");
        sb2.append(this.f2632d);
        sb2.append(", startFrom=");
        sb2.append(this.f2633e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2634f, ")");
    }
}
