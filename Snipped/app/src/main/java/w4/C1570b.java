package w4;

import e4.C0715a;
import java.util.HashMap;
import kotlin.jvm.internal.f;

/* compiled from: VersionRaw.kt */
/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570b extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("versions")
    private final HashMap<String, C1571c> f30822b;

    public final HashMap<String, C1571c> b() {
        return this.f30822b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1570b) && f.b(this.f30822b, ((C1570b) obj).f30822b);
    }

    public final int hashCode() {
        HashMap<String, C1571c> hashMap = this.f30822b;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public final String toString() {
        return "VersionBodyRaw(versions=" + this.f30822b + ")";
    }
}
