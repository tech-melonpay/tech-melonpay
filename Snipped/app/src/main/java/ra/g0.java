package ra;

import ia.InterfaceC0835c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import na.InterfaceC1078b;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes2.dex */
public final class g0<ElementKlass, Element extends ElementKlass> extends r<Element, Element[], ArrayList<Element>> {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0835c<ElementKlass> f26397b;

    /* renamed from: c, reason: collision with root package name */
    public final C1168c f26398c;

    public g0(InterfaceC0835c<ElementKlass> interfaceC0835c, InterfaceC1078b<Element> interfaceC1078b) {
        super(interfaceC1078b);
        this.f26397b = interfaceC0835c;
        this.f26398c = new C1168c(interfaceC1078b.getDescriptor(), 0);
    }

    @Override // ra.AbstractC1166a
    public final Object a() {
        return new ArrayList();
    }

    @Override // ra.AbstractC1166a
    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // ra.AbstractC1166a
    public final Iterator c(Object obj) {
        return new P9.v((Object[]) obj, 2);
    }

    @Override // ra.AbstractC1166a
    public final int d(Object obj) {
        return ((Object[]) obj).length;
    }

    @Override // ra.AbstractC1166a
    public final Object g(Object obj) {
        return new ArrayList(Arrays.asList(null));
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return this.f26398c;
    }

    @Override // ra.AbstractC1166a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance(((kotlin.jvm.internal.a) this.f26397b).g(), arrayList.size()));
    }

    @Override // ra.r
    public final void i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
