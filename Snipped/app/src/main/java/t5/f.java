package t5;

import C.v;

/* compiled from: EditCardRequestDomain.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f27543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27544b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27545c;

    public f(int i, int i9, String str) {
        this.f27543a = i;
        this.f27544b = i9;
        this.f27545c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f27543a == fVar.f27543a && this.f27544b == fVar.f27544b && kotlin.jvm.internal.f.b(this.f27545c, fVar.f27545c);
    }

    public final int hashCode() {
        return this.f27545c.hashCode() + v.b(this.f27544b, Integer.hashCode(this.f27543a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditCardRequestDomain(clientId=");
        sb2.append(this.f27543a);
        sb2.append(", cardId=");
        sb2.append(this.f27544b);
        sb2.append(", name=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f27545c, ")");
    }
}
