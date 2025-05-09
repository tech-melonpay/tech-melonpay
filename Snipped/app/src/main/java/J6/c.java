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
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f2163a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2164b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2165c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2166d;

    public c(RegisterSuccessUI registerSuccessUI, String str, String str2, String str3) {
        this.f2163a = registerSuccessUI;
        this.f2164b = str;
        this.f2165c = str2;
        this.f2166d = str3;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f2163a;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putString("email", this.f2164b);
        bundle.putString("phoneCode", this.f2165c);
        bundle.putString("phoneNumber", this.f2166d);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_loginFragment_to_AccountInformationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f2163a, cVar.f2163a) && kotlin.jvm.internal.f.b(this.f2164b, cVar.f2164b) && kotlin.jvm.internal.f.b(this.f2165c, cVar.f2165c) && kotlin.jvm.internal.f.b(this.f2166d, cVar.f2166d);
    }

    public final int hashCode() {
        return this.f2166d.hashCode() + v.c(v.c(this.f2163a.hashCode() * 31, 31, this.f2164b), 31, this.f2165c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionLoginFragmentToAccountInformationFragment(userData=");
        sb2.append(this.f2163a);
        sb2.append(", email=");
        sb2.append(this.f2164b);
        sb2.append(", phoneCode=");
        sb2.append(this.f2165c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2166d, ")");
    }
}
