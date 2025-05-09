package m3;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes.dex */
public final class n extends o {
    @Override // m3.o
    public final <T> T a(Class<T> cls) {
        throw new UnsupportedOperationException(androidx.camera.core.impl.utils.a.l("Cannot allocate ", cls, ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."));
    }
}
