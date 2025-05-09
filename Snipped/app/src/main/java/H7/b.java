package H7;

import C.v;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.f;

/* compiled from: ChangeLimitFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1552a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1554c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1555d;

    public b(int i, float f10, String str, int i9) {
        this.f1552a = i;
        this.f1553b = f10;
        this.f1554c = str;
        this.f1555d = i9;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "titleRes")) {
            throw new IllegalArgumentException("Required argument \"titleRes\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("titleRes");
        if (!bundle.containsKey("limit")) {
            throw new IllegalArgumentException("Required argument \"limit\" is missing and does not have an android:defaultValue");
        }
        float f10 = bundle.getFloat("limit");
        if (!bundle.containsKey(FirebaseAnalytics.Param.CURRENCY)) {
            throw new IllegalArgumentException("Required argument \"currency\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(FirebaseAnalytics.Param.CURRENCY);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"currency\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("cardId")) {
            return new b(i, f10, string, bundle.getInt("cardId"));
        }
        throw new IllegalArgumentException("Required argument \"cardId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1552a == bVar.f1552a && Float.compare(this.f1553b, bVar.f1553b) == 0 && f.b(this.f1554c, bVar.f1554c) && this.f1555d == bVar.f1555d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1555d) + v.c(v.a(Integer.hashCode(this.f1552a) * 31, this.f1553b, 31), 31, this.f1554c);
    }

    public final String toString() {
        return "ChangeLimitFragmentArgs(titleRes=" + this.f1552a + ", limit=" + this.f1553b + ", currency=" + this.f1554c + ", cardId=" + this.f1555d + ")";
    }
}
