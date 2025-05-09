package y7;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.FeeDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: FeeDetailsFragmentArgs.kt */
/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1619a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final FeeDomain f31122a;

    public C1619a(FeeDomain feeDomain) {
        this.f31122a = feeDomain;
    }

    public static final C1619a fromBundle(Bundle bundle) {
        if (!v.y(bundle, C1619a.class, "fee")) {
            throw new IllegalArgumentException("Required argument \"fee\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(FeeDomain.class) || Serializable.class.isAssignableFrom(FeeDomain.class)) {
            return new C1619a((FeeDomain) bundle.get("fee"));
        }
        throw new UnsupportedOperationException(FeeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1619a) && f.b(this.f31122a, ((C1619a) obj).f31122a);
    }

    public final int hashCode() {
        FeeDomain feeDomain = this.f31122a;
        if (feeDomain == null) {
            return 0;
        }
        return feeDomain.hashCode();
    }

    public final String toString() {
        return "FeeDetailsFragmentArgs(fee=" + this.f31122a + ")";
    }
}
