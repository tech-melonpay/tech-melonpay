package I6;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: KycFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f1893a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1894b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1895c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1896d;

    public e(RegisterSuccessUI registerSuccessUI, String str, String str2, String str3) {
        this.f1893a = registerSuccessUI;
        this.f1894b = str;
        this.f1895c = str2;
        this.f1896d = str3;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f1893a;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putString("email", this.f1894b);
        bundle.putString("phoneCode", this.f1895c);
        bundle.putString("phoneNumber", this.f1896d);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_kycFragment_to_AccountInformationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.b(this.f1893a, eVar.f1893a) && f.b(this.f1894b, eVar.f1894b) && f.b(this.f1895c, eVar.f1895c) && f.b(this.f1896d, eVar.f1896d);
    }

    public final int hashCode() {
        return this.f1896d.hashCode() + v.c(v.c(this.f1893a.hashCode() * 31, 31, this.f1894b), 31, this.f1895c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionKycFragmentToAccountInformationFragment(userData=");
        sb2.append(this.f1893a);
        sb2.append(", email=");
        sb2.append(this.f1894b);
        sb2.append(", phoneCode=");
        sb2.append(this.f1895c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1896d, ")");
    }
}
