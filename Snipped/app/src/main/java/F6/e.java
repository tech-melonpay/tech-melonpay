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
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1227a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1228b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1229c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f1230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1231e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1232f = "";

    public e(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i) {
        this.f1227a = str;
        this.f1228b = str2;
        this.f1229c = str3;
        this.f1230d = registerSuccessUI;
        this.f1231e = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("email", this.f1227a);
        bundle.putString("phoneCode", this.f1228b);
        bundle.putString("phoneNumber", this.f1229c);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f1230d;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putInt("startFrom", this.f1231e);
        bundle.putString("password", this.f1232f);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_welcomeFragment_to_validationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f1227a, eVar.f1227a) && kotlin.jvm.internal.f.b(this.f1228b, eVar.f1228b) && kotlin.jvm.internal.f.b(this.f1229c, eVar.f1229c) && kotlin.jvm.internal.f.b(this.f1230d, eVar.f1230d) && this.f1231e == eVar.f1231e && kotlin.jvm.internal.f.b(this.f1232f, eVar.f1232f);
    }

    public final int hashCode() {
        return this.f1232f.hashCode() + v.b(this.f1231e, (this.f1230d.hashCode() + v.c(v.c(this.f1227a.hashCode() * 31, 31, this.f1228b), 31, this.f1229c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionWelcomeFragmentToValidationFragment(email=");
        sb2.append(this.f1227a);
        sb2.append(", phoneCode=");
        sb2.append(this.f1228b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f1229c);
        sb2.append(", userData=");
        sb2.append(this.f1230d);
        sb2.append(", startFrom=");
        sb2.append(this.f1231e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1232f, ")");
    }
}
