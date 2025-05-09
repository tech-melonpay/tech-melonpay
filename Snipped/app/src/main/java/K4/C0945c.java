package k4;

import e4.C0715a;
import java.util.ArrayList;

/* compiled from: CryptowalletResponseRaw.kt */
/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945c extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("results")
    private final ArrayList<C0944b> f22956b;

    public final ArrayList<C0944b> b() {
        return this.f22956b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0945c) && kotlin.jvm.internal.f.b(this.f22956b, ((C0945c) obj).f22956b);
    }

    public final int hashCode() {
        ArrayList<C0944b> arrayList = this.f22956b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final String toString() {
        return "CryptowalletResponseRaw(results=" + this.f22956b + ")";
    }
}
