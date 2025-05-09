package kotlin.jvm.internal;

import ia.InterfaceC0834b;
import ia.InterfaceC0838f;
import ia.InterfaceC0839g;
import ia.InterfaceC0840h;
import ia.InterfaceC0842j;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC0839g {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC0834b computeReflected() {
        h.f23186a.getClass();
        return this;
    }

    @Override // ia.InterfaceC0842j
    public Object getDelegate(Object obj) {
        return ((InterfaceC0839g) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC0840h.a getGetter() {
        mo95getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC0838f getSetter() {
        mo96getSetter();
        return null;
    }

    @Override // ca.InterfaceC0646l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // ia.InterfaceC0842j
    /* renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC0842j.a mo95getGetter() {
        ((InterfaceC0839g) getReflected()).mo95getGetter();
        return null;
    }

    @Override // ia.InterfaceC0839g
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC0839g.a mo96getSetter() {
        ((InterfaceC0839g) getReflected()).mo96getSetter();
        return null;
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
