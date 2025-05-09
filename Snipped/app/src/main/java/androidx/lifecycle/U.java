package androidx.lifecycle;

import ia.InterfaceC0835c;

/* compiled from: ViewModelProvider.android.kt */
/* loaded from: classes.dex */
public class U implements T {

    /* renamed from: a, reason: collision with root package name */
    public static U f7059a;

    @Override // androidx.lifecycle.T
    public final Q a(InterfaceC0835c interfaceC0835c, R0.c cVar) {
        return create(((kotlin.jvm.internal.a) interfaceC0835c).g(), cVar);
    }

    @Override // androidx.lifecycle.T
    public <T extends Q> T create(Class<T> cls) {
        return (T) Ja.a.f(cls);
    }

    @Override // androidx.lifecycle.T
    public <T extends Q> T create(Class<T> cls, R0.a aVar) {
        return (T) create(cls);
    }
}
