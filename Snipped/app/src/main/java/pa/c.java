package pa;

import ia.InterfaceC0835c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;

/* compiled from: ContextAware.kt */
/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f25725a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0835c<?> f25726b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25727c;

    public c(SerialDescriptorImpl serialDescriptorImpl, InterfaceC0835c interfaceC0835c) {
        this.f25725a = serialDescriptorImpl;
        this.f25726b = interfaceC0835c;
        this.f25727c = serialDescriptorImpl.f23295a + '<' + interfaceC0835c.d() + '>';
    }

    @Override // pa.f
    public final String a() {
        return this.f25727c;
    }

    @Override // pa.f
    public final boolean c() {
        return this.f25725a.c();
    }

    @Override // pa.f
    public final int d(String str) {
        return this.f25725a.d(str);
    }

    @Override // pa.f
    public final g e() {
        return this.f25725a.e();
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && kotlin.jvm.internal.f.b(this.f25725a, cVar.f25725a) && kotlin.jvm.internal.f.b(cVar.f25726b, this.f25726b);
    }

    @Override // pa.f
    public final int f() {
        return this.f25725a.f();
    }

    @Override // pa.f
    public final String g(int i) {
        return this.f25725a.g(i);
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return this.f25725a.getAnnotations();
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        return this.f25725a.h(i);
    }

    public final int hashCode() {
        return this.f25727c.hashCode() + (this.f25726b.hashCode() * 31);
    }

    @Override // pa.f
    public final f i(int i) {
        return this.f25725a.i(i);
    }

    @Override // pa.f
    public final boolean isInline() {
        return this.f25725a.isInline();
    }

    @Override // pa.f
    public final boolean j(int i) {
        return this.f25725a.j(i);
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f25726b + ", original: " + this.f25725a + ')';
    }
}
