package M6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: RegisterAddressFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2613a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2614b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2615c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f2616d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2617e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2618f;

    public e(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i, String str4) {
        this.f2613a = str;
        this.f2614b = str2;
        this.f2615c = str3;
        this.f2616d = registerSuccessUI;
        this.f2617e = i;
        this.f2618f = str4;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f2613a);
        bundle.putString("phoneCode", this.f2614b);
        bundle.putString("phoneNumber", this.f2615c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f2616d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f2617e);
        bundle.putString("password", this.f2618f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_registerAddressFragment_to_validationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f2613a, eVar.f2613a) && kotlin.jvm.internal.f.b(this.f2614b, eVar.f2614b) && kotlin.jvm.internal.f.b(this.f2615c, eVar.f2615c) && kotlin.jvm.internal.f.b(this.f2616d, eVar.f2616d) && this.f2617e == eVar.f2617e && kotlin.jvm.internal.f.b(this.f2618f, eVar.f2618f);
    }

    public final int hashCode() {
        return this.f2618f.hashCode() + C.v.b(this.f2617e, (this.f2616d.hashCode() + C.v.c(C.v.c(this.f2613a.hashCode() * 31, 31, this.f2614b), 31, this.f2615c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionRegisterAddressFragmentToValidationFragment(email=");
        sb2.append(this.f2613a);
        sb2.append(", phoneCode=");
        sb2.append(this.f2614b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f2615c);
        sb2.append(", userData=");
        sb2.append(this.f2616d);
        sb2.append(", startFrom=");
        sb2.append(this.f2617e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2618f, ")");
    }
}
