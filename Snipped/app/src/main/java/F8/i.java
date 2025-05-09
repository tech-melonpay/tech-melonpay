package F8;

import androidx.lifecycle.A;
import ca.InterfaceC0646l;

/* compiled from: FragmentExt.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements A, kotlin.jvm.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0646l f1271a;

    public i(InterfaceC0646l interfaceC0646l) {
        this.f1271a = interfaceC0646l;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
            return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.d
    public final O9.d<?> getFunctionDelegate() {
        return this.f1271a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.A
    public final /* synthetic */ void onChanged(Object obj) {
        this.f1271a.invoke(obj);
    }
}
