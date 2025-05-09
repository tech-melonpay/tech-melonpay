package kotlinx.serialization;

import P9.n;
import ca.InterfaceC0635a;
import ia.InterfaceC0835c;
import ia.k;
import ia.l;
import j3.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import na.InterfaceC1078b;
import oa.C1095a;
import ra.a0;

/* compiled from: Serializers.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class SerializersKt__SerializersKt {
    public static final InterfaceC1078b<Object> a(Y8.a aVar, k kVar, boolean z10) {
        InterfaceC1078b interfaceC1078b;
        InterfaceC1078b c2;
        InterfaceC0835c g10 = a0.g(kVar);
        boolean c10 = kVar.c();
        List<l> a10 = kVar.a();
        final ArrayList arrayList = new ArrayList(n.u(a10, 10));
        Iterator<T> it = a10.iterator();
        while (it.hasNext()) {
            k kVar2 = ((l) it.next()).f21517b;
            if (kVar2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + kVar2).toString());
            }
            arrayList.add(kVar2);
        }
        if (!arrayList.isEmpty()) {
            Object n10 = !c10 ? SerializersCacheKt.f23275c.n(g10, arrayList) : SerializersCacheKt.f23276d.n(g10, arrayList);
            if (n10 instanceof Result.Failure) {
                n10 = null;
            }
            interfaceC1078b = (InterfaceC1078b) n10;
        } else if (c10) {
            interfaceC1078b = SerializersCacheKt.f23274b.m(g10);
        } else {
            interfaceC1078b = SerializersCacheKt.f23273a.m(g10);
            if (interfaceC1078b == null) {
                interfaceC1078b = null;
            }
        }
        if (interfaceC1078b != null) {
            return interfaceC1078b;
        }
        if (arrayList.isEmpty()) {
            c2 = aVar.c(g10, EmptyList.f23104a);
        } else {
            ArrayList E8 = e.E(aVar, arrayList, z10);
            if (E8 == null) {
                return null;
            }
            InterfaceC1078b y10 = e.y(g10, E8, new InterfaceC0635a<InterfaceC0835c>() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$serializerByKTypeImpl$contextualSerializer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final InterfaceC0835c invoke() {
                    return arrayList.get(0).e();
                }
            });
            c2 = y10 == null ? aVar.c(g10, E8) : y10;
        }
        if (c2 == null) {
            return null;
        }
        if (c10) {
            c2 = C1095a.a(c2);
        }
        return c2;
    }
}
