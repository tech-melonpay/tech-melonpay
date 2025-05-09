package F6;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: WelcomeFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f1217a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1218b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1219c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1220d;

    public c(RegisterSuccessUI registerSuccessUI, String str, String str2, String str3) {
        this.f1217a = registerSuccessUI;
        this.f1218b = str;
        this.f1219c = str2;
        this.f1220d = str3;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f1217a;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putString("email", this.f1218b);
        bundle.putString("phoneCode", this.f1219c);
        bundle.putString("phoneNumber", this.f1220d);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_welcomeFragment_to_AccountInformationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f1217a, cVar.f1217a) && kotlin.jvm.internal.f.b(this.f1218b, cVar.f1218b) && kotlin.jvm.internal.f.b(this.f1219c, cVar.f1219c) && kotlin.jvm.internal.f.b(this.f1220d, cVar.f1220d);
    }

    public final int hashCode() {
        return this.f1220d.hashCode() + v.c(v.c(this.f1217a.hashCode() * 31, 31, this.f1218b), 31, this.f1219c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionWelcomeFragmentToAccountInformationFragment(userData=");
        sb2.append(this.f1217a);
        sb2.append(", email=");
        sb2.append(this.f1218b);
        sb2.append(", phoneCode=");
        sb2.append(this.f1219c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1220d, ")");
    }
}
