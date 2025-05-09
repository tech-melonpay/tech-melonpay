package kotlin.jvm.internal;

import ia.InterfaceC0834b;
import ia.InterfaceC0840h;
import ia.InterfaceC0841i;

/* loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC0841i {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC0834b computeReflected() {
        h.f23186a.getClass();
        return this;
    }

    @Override // ia.InterfaceC0841i
    public Object getDelegate() {
        return ((InterfaceC0841i) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC0840h.a getGetter() {
        mo97getGetter();
        return null;
    }

    @Override // ca.InterfaceC0635a
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // ia.InterfaceC0841i
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC0841i.a mo97getGetter() {
        ((InterfaceC0841i) getReflected()).mo97getGetter();
        return null;
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
