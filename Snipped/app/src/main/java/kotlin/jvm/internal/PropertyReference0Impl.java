package kotlin.jvm.internal;

import ia.InterfaceC0835c;
import ia.InterfaceC0836d;

/* loaded from: classes2.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(InterfaceC0836d interfaceC0836d, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((a) interfaceC0836d).g(), str, str2, !(interfaceC0836d instanceof InterfaceC0835c) ? 1 : 0);
    }

    @Override // ia.InterfaceC0841i
    public Object get() {
        mo97getGetter();
        throw null;
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
