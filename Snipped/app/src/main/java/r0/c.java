package R0;

import R0.a;

/* compiled from: CreationExtras.kt */
/* loaded from: classes.dex */
public final class c extends a {
    public /* synthetic */ c(int i) {
        this(a.C0040a.f3236b);
    }

    @Override // R0.a
    public final <T> T a(a.b<T> bVar) {
        return (T) this.f3235a.get(bVar);
    }

    public final <T> void b(a.b<T> bVar, T t3) {
        this.f3235a.put(bVar, t3);
    }

    public c(a aVar) {
        this.f3235a.putAll(aVar.f3235a);
    }
}
