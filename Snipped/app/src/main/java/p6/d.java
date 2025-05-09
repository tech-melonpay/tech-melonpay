package P6;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: ValidationFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3084b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3085c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f3086d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3087e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3088f;

    public d(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i, String str4) {
        this.f3083a = str;
        this.f3084b = str2;
        this.f3085c = str3;
        this.f3086d = registerSuccessUI;
        this.f3087e = i;
        this.f3088f = str4;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f3083a);
        bundle.putString("phoneCode", this.f3084b);
        bundle.putString("phoneNumber", this.f3085c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f3086d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f3087e);
        bundle.putString("password", this.f3088f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_validationFragment_to_kycFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f3083a, dVar.f3083a) && f.b(this.f3084b, dVar.f3084b) && f.b(this.f3085c, dVar.f3085c) && f.b(this.f3086d, dVar.f3086d) && this.f3087e == dVar.f3087e && f.b(this.f3088f, dVar.f3088f);
    }

    public final int hashCode() {
        return this.f3088f.hashCode() + v.b(this.f3087e, (this.f3086d.hashCode() + v.c(v.c(this.f3083a.hashCode() * 31, 31, this.f3084b), 31, this.f3085c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionValidationFragmentToKycFragment(email=");
        sb2.append(this.f3083a);
        sb2.append(", phoneCode=");
        sb2.append(this.f3084b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f3085c);
        sb2.append(", userData=");
        sb2.append(this.f3086d);
        sb2.append(", startFrom=");
        sb2.append(this.f3087e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3088f, ")");
    }
}
