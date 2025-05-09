package ra;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;

/* compiled from: NothingSerialDescriptor.kt */
/* loaded from: classes2.dex */
public final class W implements pa.f {

    /* renamed from: a, reason: collision with root package name */
    public static final W f26373a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final b.d f26374b = b.d.f23312a;

    /* renamed from: c, reason: collision with root package name */
    public static final String f26375c = "kotlin.Nothing";

    @Override // pa.f
    public final String a() {
        return f26375c;
    }

    @Override // pa.f
    public final boolean c() {
        return false;
    }

    @Override // pa.f
    public final int d(String str) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // pa.f
    public final pa.g e() {
        return f26374b;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // pa.f
    public final int f() {
        return 0;
    }

    @Override // pa.f
    public final String g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return EmptyList.f23104a;
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (f26374b.hashCode() * 31) + f26375c.hashCode();
    }

    @Override // pa.f
    public final pa.f i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // pa.f
    public final boolean isInline() {
        return false;
    }

    @Override // pa.f
    public final boolean j(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
