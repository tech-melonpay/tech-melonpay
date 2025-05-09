package t;

import t.g0;

/* compiled from: AutoValue_SupportedSurfaceCombination_FeatureSettings.java */
/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250b extends g0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27196b;

    public C1250b(int i, int i9) {
        this.f27195a = i;
        this.f27196b = i9;
    }

    @Override // t.g0.b
    public final int a() {
        return this.f27195a;
    }

    @Override // t.g0.b
    public final int b() {
        return this.f27196b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f27195a == bVar.a() && this.f27196b == bVar.b();
    }

    public final int hashCode() {
        return ((this.f27195a ^ 1000003) * 1000003) ^ this.f27196b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings{cameraMode=");
        sb2.append(this.f27195a);
        sb2.append(", requiredMaxBitDepth=");
        return s3.b.m(sb2, this.f27196b, "}");
    }
}
