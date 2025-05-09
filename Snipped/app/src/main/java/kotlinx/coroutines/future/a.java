package kotlinx.coroutines.future;

import O9.p;
import ca.InterfaceC0650p;
import java.util.function.BiFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0650p f23238b;

    public /* synthetic */ a(InterfaceC0650p interfaceC0650p, int i) {
        this.f23237a = i;
        this.f23238b = interfaceC0650p;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Object invoke;
        p pVar;
        switch (this.f23237a) {
            case 0:
                invoke = this.f23238b.invoke(obj, (Throwable) obj2);
                return invoke;
            default:
                pVar = FutureKt.setupCancellation$lambda$3(this.f23238b, obj, (Throwable) obj2);
                return pVar;
        }
    }
}
