package ra;

import java.lang.annotation.Annotation;
import java.util.List;
import ka.C0966k;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;

/* compiled from: CollectionDescriptors.kt */
/* loaded from: classes2.dex */
public abstract class P implements pa.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f26366a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.f f26367b;

    /* renamed from: c, reason: collision with root package name */
    public final pa.f f26368c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26369d = 2;

    public P(String str, pa.f fVar, pa.f fVar2) {
        this.f26366a = str;
        this.f26367b = fVar;
        this.f26368c = fVar2;
    }

    @Override // pa.f
    public final String a() {
        return this.f26366a;
    }

    @Override // pa.f
    public final boolean c() {
        return false;
    }

    @Override // pa.f
    public final int d(String str) {
        Integer S = C0966k.S(str);
        if (S != null) {
            return S.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // pa.f
    public final pa.g e() {
        return b.c.f23311a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return kotlin.jvm.internal.f.b(this.f26366a, p10.f26366a) && kotlin.jvm.internal.f.b(this.f26367b, p10.f26367b) && kotlin.jvm.internal.f.b(this.f26368c, p10.f26368c);
    }

    @Override // pa.f
    public final int f() {
        return this.f26369d;
    }

    @Override // pa.f
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return EmptyList.f23104a;
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        if (i >= 0) {
            return EmptyList.f23104a;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(com.google.android.gms.measurement.internal.a.l("Illegal index ", i, ", "), this.f26366a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f26368c.hashCode() + ((this.f26367b.hashCode() + (this.f26366a.hashCode() * 31)) * 31);
    }

    @Override // pa.f
    public final pa.f i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(com.google.android.gms.measurement.internal.a.l("Illegal index ", i, ", "), this.f26366a, " expects only non-negative indices").toString());
        }
        int i9 = i % 2;
        if (i9 == 0) {
            return this.f26367b;
        }
        if (i9 == 1) {
            return this.f26368c;
        }
        throw new IllegalStateException("Unreached".toString());
    }

    @Override // pa.f
    public final boolean isInline() {
        return false;
    }

    @Override // pa.f
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.n(com.google.android.gms.measurement.internal.a.l("Illegal index ", i, ", "), this.f26366a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f26366a + '(' + this.f26367b + ", " + this.f26368c + ')';
    }
}
