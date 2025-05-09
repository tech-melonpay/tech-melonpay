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
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f2173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2175c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f2176d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2177e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2178f = "";

    public e(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i) {
        this.f2173a = str;
        this.f2174b = str2;
        this.f2175c = str3;
        this.f2176d = registerSuccessUI;
        this.f2177e = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f2173a);
        bundle.putString("phoneCode", this.f2174b);
        bundle.putString("phoneNumber", this.f2175c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f2176d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f2177e);
        bundle.putString("password", this.f2178f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_loginFragment_to_validationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f2173a, eVar.f2173a) && kotlin.jvm.internal.f.b(this.f2174b, eVar.f2174b) && kotlin.jvm.internal.f.b(this.f2175c, eVar.f2175c) && kotlin.jvm.internal.f.b(this.f2176d, eVar.f2176d) && this.f2177e == eVar.f2177e && kotlin.jvm.internal.f.b(this.f2178f, eVar.f2178f);
    }

    public final int hashCode() {
        return this.f2178f.hashCode() + v.b(this.f2177e, (this.f2176d.hashCode() + v.c(v.c(this.f2173a.hashCode() * 31, 31, this.f2174b), 31, this.f2175c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionLoginFragmentToValidationFragment(email=");
        sb2.append(this.f2173a);
        sb2.append(", phoneCode=");
        sb2.append(this.f2174b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f2175c);
        sb2.append(", userData=");
        sb2.append(this.f2176d);
        sb2.append(", startFrom=");
        sb2.append(this.f2177e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2178f, ")");
    }
}
