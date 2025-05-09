package G6;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: AccountInformationFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f1332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1333b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1334c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1335d;

    public d(RegisterSuccessUI registerSuccessUI, String str, String str2, String str3) {
        this.f1332a = registerSuccessUI;
        this.f1333b = str;
        this.f1334c = str2;
        this.f1335d = str3;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(RegisterSuccessUI.class);
        Parcelable parcelable = this.f1332a;
        if (isAssignableFrom) {
            bundle.putParcelable("userData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("userData", (Serializable) parcelable);
        }
        bundle.putString("email", this.f1333b);
        bundle.putString("phoneCode", this.f1334c);
        bundle.putString("phoneNumber", this.f1335d);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_AccountInformationFragment_to_registerSuccessFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f1332a, dVar.f1332a) && f.b(this.f1333b, dVar.f1333b) && f.b(this.f1334c, dVar.f1334c) && f.b(this.f1335d, dVar.f1335d);
    }

    public final int hashCode() {
        return this.f1335d.hashCode() + v.c(v.c(this.f1332a.hashCode() * 31, 31, this.f1333b), 31, this.f1334c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionAccountInformationFragmentToRegisterSuccessFragment(userData=");
        sb2.append(this.f1332a);
        sb2.append(", email=");
        sb2.append(this.f1333b);
        sb2.append(", phoneCode=");
        sb2.append(this.f1334c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1335d, ")");
    }
}
