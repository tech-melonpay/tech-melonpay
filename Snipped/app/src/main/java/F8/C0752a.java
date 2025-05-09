package f8;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.SignerUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: SignerFragmentArgs.kt */
/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0752a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SignerUI f20716a;

    public C0752a(SignerUI signerUI) {
        this.f20716a = signerUI;
    }

    public static final C0752a fromBundle(Bundle bundle) {
        if (!v.y(bundle, C0752a.class, "signer")) {
            throw new IllegalArgumentException("Required argument \"signer\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SignerUI.class) && !Serializable.class.isAssignableFrom(SignerUI.class)) {
            throw new UnsupportedOperationException(SignerUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        SignerUI signerUI = (SignerUI) bundle.get("signer");
        if (signerUI != null) {
            return new C0752a(signerUI);
        }
        throw new IllegalArgumentException("Argument \"signer\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0752a) && f.b(this.f20716a, ((C0752a) obj).f20716a);
    }

    public final int hashCode() {
        return this.f20716a.hashCode();
    }

    public final String toString() {
        return "SignerFragmentArgs(signer=" + this.f20716a + ")";
    }
}
