package N7;

import C.v;
import U0.e;
import android.os.Bundle;
import s3.b;

/* compiled from: OrderSuccessFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f2851a;

    public a(int i) {
        this.f2851a = i;
    }

    public static final a fromBundle(Bundle bundle) {
        if (v.y(bundle, a.class, "cardType")) {
            return new a(bundle.getInt("cardType"));
        }
        throw new IllegalArgumentException("Required argument \"cardType\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2851a == ((a) obj).f2851a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2851a);
    }

    public final String toString() {
        return b.m(new StringBuilder("OrderSuccessFragmentArgs(cardType="), this.f2851a, ")");
    }
}
