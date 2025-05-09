package C;

import C.o;

/* compiled from: AutoValue_Quality_ConstantQuality.java */
/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491g extends o.a {

    /* renamed from: j, reason: collision with root package name */
    public final int f552j;

    /* renamed from: k, reason: collision with root package name */
    public final String f553k;

    public C0491g(int i, String str) {
        this.f552j = i;
        this.f553k = str;
    }

    @Override // C.o.a
    public final String a() {
        return this.f553k;
    }

    @Override // C.o.a
    public final int b() {
        return this.f552j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.a)) {
            return false;
        }
        o.a aVar = (o.a) obj;
        return this.f552j == aVar.b() && this.f553k.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f552j ^ 1000003) * 1000003) ^ this.f553k.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstantQuality{value=");
        sb2.append(this.f552j);
        sb2.append(", name=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f553k, "}");
    }
}
