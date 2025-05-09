package androidx.fragment.app;

import ca.InterfaceC0635a;
import ca.InterfaceC0650p;

/* compiled from: FragmentViewModelLazy.kt */
/* loaded from: classes.dex */
public final class E {
    public static final H1.a a(final Fragment fragment, kotlin.jvm.internal.b bVar, InterfaceC0635a interfaceC0635a, InterfaceC0635a interfaceC0635a2) {
        return new H1.a(bVar, interfaceC0635a, interfaceC0635a2, new InterfaceC0635a<R0.a>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$1
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final R0.a invoke() {
                return Fragment.this.getDefaultViewModelCreationExtras();
            }
        });
    }

    public static final void b(Fragment fragment, String str, InterfaceC0650p interfaceC0650p) {
        fragment.getParentFragmentManager().g0(str, fragment, new A0.b(interfaceC0650p, 23));
    }
}
