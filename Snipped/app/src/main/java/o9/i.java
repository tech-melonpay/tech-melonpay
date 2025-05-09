package O9;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: UInt.kt */
/* loaded from: classes2.dex */
public final class i implements Comparable<i> {

    /* renamed from: a, reason: collision with root package name */
    public final int f3021a;

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        return kotlin.jvm.internal.f.c(this.f3021a ^ Integer.MIN_VALUE, iVar.f3021a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3021a == ((i) obj).f3021a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3021a);
    }

    public final String toString() {
        return String.valueOf(this.f3021a & BodyPartID.bodyIdMax);
    }
}
