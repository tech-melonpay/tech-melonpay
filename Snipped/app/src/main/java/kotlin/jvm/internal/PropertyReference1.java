package kotlin.jvm.internal;

import ia.InterfaceC0834b;
import ia.InterfaceC0840h;
import ia.InterfaceC0842j;

/* loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC0842j {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC0834b computeReflected() {
        h.f23186a.getClass();
        return this;
    }

    @Override // ia.InterfaceC0842j
    public Object getDelegate(Object obj) {
        return ((InterfaceC0842j) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC0840h.a getGetter() {
        mo95getGetter();
        return null;
    }

    @Override // ca.InterfaceC0646l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // ia.InterfaceC0842j
    /* renamed from: getGetter */
    public InterfaceC0842j.a mo95getGetter() {
        ((InterfaceC0842j) getReflected()).mo95getGetter();
        return null;
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
