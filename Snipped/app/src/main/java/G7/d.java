package G7;

import C.v;
import android.os.Bundle;

/* compiled from: CardLimitsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1345c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1346d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1347e;

    public d(String str, String str2, boolean z10, int i, boolean z11) {
        this.f1343a = i;
        this.f1344b = str;
        this.f1345c = str2;
        this.f1346d = z10;
        this.f1347e = z11;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "cardId")) {
            throw new IllegalArgumentException("Required argument \"cardId\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("cardId");
        if (!bundle.containsKey("cardNumber")) {
            throw new IllegalArgumentException("Required argument \"cardNumber\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("cardNumber");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"cardNumber\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("cardName")) {
            throw new IllegalArgumentException("Required argument \"cardName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("cardName");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"cardName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("internetActive")) {
            throw new IllegalArgumentException("Required argument \"internetActive\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("internetActive");
        if (bundle.containsKey("contactlessActive")) {
            return new d(string, string2, z10, i, bundle.getBoolean("contactlessActive"));
        }
        throw new IllegalArgumentException("Required argument \"contactlessActive\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1343a == dVar.f1343a && kotlin.jvm.internal.f.b(this.f1344b, dVar.f1344b) && kotlin.jvm.internal.f.b(this.f1345c, dVar.f1345c) && this.f1346d == dVar.f1346d && this.f1347e == dVar.f1347e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1347e) + v.d(v.c(v.c(Integer.hashCode(this.f1343a) * 31, 31, this.f1344b), 31, this.f1345c), 31, this.f1346d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CardLimitsFragmentArgs(cardId=");
        sb2.append(this.f1343a);
        sb2.append(", cardNumber=");
        sb2.append(this.f1344b);
        sb2.append(", cardName=");
        sb2.append(this.f1345c);
        sb2.append(", internetActive=");
        sb2.append(this.f1346d);
        sb2.append(", contactlessActive=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f1347e, ")");
    }
}
