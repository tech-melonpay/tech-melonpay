package O9;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes2.dex */
public final class e implements Comparable<e> {

    /* renamed from: e, reason: collision with root package name */
    public static final e f3012e = new e();

    /* renamed from: a, reason: collision with root package name */
    public final int f3013a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final int f3014b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f3015c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f3016d = 131328;

    @Override // java.lang.Comparable
    public final int compareTo(e eVar) {
        return this.f3016d - eVar.f3016d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f3016d == eVar.f3016d;
    }

    public final int hashCode() {
        return this.f3016d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3013a);
        sb2.append('.');
        sb2.append(this.f3014b);
        sb2.append('.');
        sb2.append(this.f3015c);
        return sb2.toString();
    }
}
