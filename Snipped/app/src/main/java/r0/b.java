package R0;

import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import ca.InterfaceC0646l;
import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* compiled from: InitializerViewModelFactory.android.kt */
/* loaded from: classes.dex */
public final class b implements T {

    /* renamed from: a, reason: collision with root package name */
    public final d<?>[] f3237a;

    public b(d<?>... dVarArr) {
        this.f3237a = dVarArr;
    }

    @Override // androidx.lifecycle.T
    public final <VM extends Q> VM create(Class<VM> cls, a aVar) {
        VM vm;
        d dVar;
        InterfaceC0646l<a, T> interfaceC0646l;
        kotlin.jvm.internal.b a10 = h.a(cls);
        d<?>[] dVarArr = this.f3237a;
        d[] dVarArr2 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
        int length = dVarArr2.length;
        int i = 0;
        while (true) {
            vm = null;
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = dVarArr2[i];
            if (f.b(dVar.f3238a, a10)) {
                break;
            }
            i++;
        }
        if (dVar != null && (interfaceC0646l = dVar.f3239b) != 0) {
            vm = (VM) interfaceC0646l.invoke(aVar);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a10.b()).toString());
    }
}
