package androidx.navigation.serialization;

import C.v;
import O9.p;
import P9.s;
import U0.b;
import U0.k;
import androidx.navigation.serialization.RouteBuilder;
import ca.InterfaceC0651q;
import j3.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import na.InterfaceC1078b;

/* compiled from: RouteSerializer.kt */
/* loaded from: classes.dex */
public final class a {
    public static final <T> int a(InterfaceC1078b<T> interfaceC1078b) {
        int hashCode = interfaceC1078b.getDescriptor().a().hashCode();
        int f10 = interfaceC1078b.getDescriptor().f();
        for (int i = 0; i < f10; i++) {
            hashCode = (hashCode * 31) + interfaceC1078b.getDescriptor().g(i).hashCode();
        }
        return hashCode;
    }

    public static final String b(Object obj, LinkedHashMap linkedHashMap) {
        InterfaceC1078b D2 = e.D(h.a(obj.getClass()));
        X0.a aVar = new X0.a(D2, linkedHashMap);
        D2.serialize(aVar, obj);
        final Map w2 = kotlin.collections.a.w(aVar.f3889d);
        final RouteBuilder routeBuilder = new RouteBuilder(D2);
        InterfaceC0651q<Integer, String, k<Object>, p> interfaceC0651q = new InterfaceC0651q<Integer, String, k<Object>, p>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRouteWithArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // ca.InterfaceC0651q
            public final p invoke(Integer num, String str, k<Object> kVar) {
                int intValue = num.intValue();
                String str2 = str;
                List<String> list = w2.get(str2);
                RouteBuilder<Object> routeBuilder2 = routeBuilder;
                routeBuilder2.getClass();
                int ordinal = (((kVar instanceof b) || routeBuilder2.f7332a.getDescriptor().j(intValue)) ? RouteBuilder.ParamType.f7337b : RouteBuilder.ParamType.f7336a).ordinal();
                if (ordinal == 0) {
                    if (list.size() != 1) {
                        StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("Expected one value for argument ", str2, ", found ");
                        m2.append(list.size());
                        m2.append("values instead.");
                        throw new IllegalArgumentException(m2.toString().toString());
                    }
                    routeBuilder2.f7334c += '/' + ((String) s.J(list));
                } else if (ordinal == 1) {
                    for (String str3 : list) {
                        routeBuilder2.f7335d += (routeBuilder2.f7335d.length() == 0 ? "?" : "&") + str2 + '=' + str3;
                    }
                }
                return p.f3034a;
            }
        };
        int f10 = D2.getDescriptor().f();
        for (int i = 0; i < f10; i++) {
            String g10 = D2.getDescriptor().g(i);
            k<Object> kVar = (k) linkedHashMap.get(g10);
            if (kVar == null) {
                throw new IllegalStateException(v.o("Cannot locate NavType for argument [", g10, ']').toString());
            }
            interfaceC0651q.invoke(Integer.valueOf(i), g10, kVar);
        }
        return routeBuilder.f7333b + routeBuilder.f7334c + routeBuilder.f7335d;
    }
}
