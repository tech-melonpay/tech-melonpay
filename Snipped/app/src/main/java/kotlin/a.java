package kotlin;

import O9.f;
import O9.m;
import ca.InterfaceC0635a;

/* compiled from: LazyJVM.kt */
/* loaded from: classes2.dex */
public class a {
    public static <T> f<T> a(InterfaceC0635a<? extends T> interfaceC0635a) {
        return new SynchronizedLazyImpl(interfaceC0635a);
    }

    public static <T> f<T> b(LazyThreadSafetyMode lazyThreadSafetyMode, InterfaceC0635a<? extends T> interfaceC0635a) {
        int ordinal = lazyThreadSafetyMode.ordinal();
        if (ordinal == 0) {
            return new SynchronizedLazyImpl(interfaceC0635a);
        }
        m mVar = m.f3029a;
        if (ordinal == 1) {
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.f23094a = interfaceC0635a;
            safePublicationLazyImpl.f23095b = mVar;
            return safePublicationLazyImpl;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.f23102a = interfaceC0635a;
        unsafeLazyImpl.f23103b = mVar;
        return unsafeLazyImpl;
    }
}
