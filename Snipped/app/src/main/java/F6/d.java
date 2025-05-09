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
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1223c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f1224d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1225e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1226f = "";

    public d(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i) {
        this.f1221a = str;
        this.f1222b = str2;
        this.f1223c = str3;
        this.f1224d = registerSuccessUI;
        this.f1225e = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f1221a);
        bundle.putString("phoneCode", this.f1222b);
        bundle.putString("phoneNumber", this.f1223c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f1224d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f1225e);
        bundle.putString("password", this.f1226f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_welcomeFragment_to_kycFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f1221a, dVar.f1221a) && kotlin.jvm.internal.f.b(this.f1222b, dVar.f1222b) && kotlin.jvm.internal.f.b(this.f1223c, dVar.f1223c) && kotlin.jvm.internal.f.b(this.f1224d, dVar.f1224d) && this.f1225e == dVar.f1225e && kotlin.jvm.internal.f.b(this.f1226f, dVar.f1226f);
    }

    public final int hashCode() {
        return this.f1226f.hashCode() + v.b(this.f1225e, (this.f1224d.hashCode() + v.c(v.c(this.f1221a.hashCode() * 31, 31, this.f1222b), 31, this.f1223c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionWelcomeFragmentToKycFragment(email=");
        sb2.append(this.f1221a);
        sb2.append(", phoneCode=");
        sb2.append(this.f1222b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f1223c);
        sb2.append(", userData=");
        sb2.append(this.f1224d);
        sb2.append(", startFrom=");
        sb2.append(this.f1225e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1226f, ")");
    }
}
