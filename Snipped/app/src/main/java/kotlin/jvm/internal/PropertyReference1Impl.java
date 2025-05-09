package kotlin.jvm.internal;

import ia.InterfaceC0835c;
import ia.InterfaceC0836d;

/* loaded from: classes2.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(InterfaceC0836d interfaceC0836d, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((a) interfaceC0836d).g(), str, str2, !(interfaceC0836d instanceof InterfaceC0835c) ? 1 : 0);
    }

    public Object get(Object obj) {
        mo95getGetter();
        throw null;
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
