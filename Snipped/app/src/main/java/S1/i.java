package S1;

import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0558y;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LiveDataUtils.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3353a = new Object();

    /* compiled from: LiveDataUtils.kt */
    public static final class a implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f3354a;

        public a(InterfaceC0646l interfaceC0646l) {
            this.f3354a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f3354a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f3354a.invoke(obj);
        }
    }

    public static final C0558y a(AbstractC0557x abstractC0557x, C0559z c0559z, InterfaceC0650p interfaceC0650p) {
        C0558y c0558y = new C0558y();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        c0558y.a(abstractC0557x, new a(new h(ref$ObjectRef, ref$ObjectRef2, c0558y, interfaceC0650p, 0)));
        c0558y.a(c0559z, new a(new h(ref$ObjectRef2, ref$ObjectRef, c0558y, interfaceC0650p, 1)));
        return c0558y;
    }
}
