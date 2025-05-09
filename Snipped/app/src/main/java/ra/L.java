package ra;

import java.lang.annotation.Annotation;
import java.util.List;
import ka.C0966k;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;

/* compiled from: CollectionDescriptors.kt */
/* loaded from: classes2.dex */
public abstract class L implements pa.f {

    /* renamed from: a, reason: collision with root package name */
    public final pa.f f26359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26360b = 1;

    public L(pa.f fVar) {
        this.f26359a = fVar;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // pa.f
    public final pa.g e() {
        return b.C0424b.f23310a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return kotlin.jvm.internal.f.b(this.f26359a, l10.f26359a) && kotlin.jvm.internal.f.b(a(), l10.a());
    }

    @Override // pa.f
    public final int f() {
        return this.f26360b;
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
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Illegal index ", i, ", ");
        l10.append(a());
        l10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l10.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f26359a.hashCode() * 31);
    }

    @Override // pa.f
    public final pa.f i(int i) {
        if (i >= 0) {
            return this.f26359a;
        }
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Illegal index ", i, ", ");
        l10.append(a());
        l10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l10.toString().toString());
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
        StringBuilder l10 = com.google.android.gms.measurement.internal.a.l("Illegal index ", i, ", ");
        l10.append(a());
        l10.append(" expects only non-negative indices");
        throw new IllegalArgumentException(l10.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f26359a + ')';
    }
}
