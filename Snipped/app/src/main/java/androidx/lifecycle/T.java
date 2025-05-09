package androidx.lifecycle;

import ia.InterfaceC0835c;

/* compiled from: ViewModelProvider.android.kt */
/* loaded from: classes.dex */
public interface T {
    default Q a(InterfaceC0835c interfaceC0835c, R0.c cVar) {
        return create(((kotlin.jvm.internal.a) interfaceC0835c).g(), cVar);
    }

    default <T extends Q> T create(Class<T> cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default <T extends Q> T create(Class<T> cls, R0.a aVar) {
        return (T) create(cls);
    }
}
