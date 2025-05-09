package kotlinx.serialization;

import B1.f;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ca.InterfaceC0650p;
import ia.InterfaceC0835c;
import ia.k;
import j3.e;
import java.util.Arrays;
import java.util.List;
import na.InterfaceC1078b;
import oa.C1095a;
import ra.C1178m;
import ra.a0;
import ra.f0;

/* compiled from: SerializersCache.kt */
/* loaded from: classes2.dex */
public final class SerializersCacheKt {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23273a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f23274b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f23275c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f23276d;

    static {
        SerializersCacheKt$SERIALIZERS_CACHE$1 serializersCacheKt$SERIALIZERS_CACHE$1 = new InterfaceC0646l<InterfaceC0835c<?>, InterfaceC1078b<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE$1
            @Override // ca.InterfaceC0646l
            public final InterfaceC1078b<? extends Object> invoke(InterfaceC0835c<?> interfaceC0835c) {
                InterfaceC0835c<?> interfaceC0835c2 = interfaceC0835c;
                InterfaceC1078b<? extends Object> d10 = a0.d(((kotlin.jvm.internal.a) interfaceC0835c2).g(), (InterfaceC1078b[]) Arrays.copyOf(new InterfaceC1078b[0], 0));
                return d10 == null ? f0.f26394a.get(interfaceC0835c2) : d10;
            }
        };
        boolean z10 = C1178m.f26413a;
        f23273a = z10 ? new f(13, serializersCacheKt$SERIALIZERS_CACHE$1) : new f(17, serializersCacheKt$SERIALIZERS_CACHE$1);
        SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 = new InterfaceC0646l<InterfaceC0835c<?>, InterfaceC1078b<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1
            @Override // ca.InterfaceC0646l
            public final InterfaceC1078b<Object> invoke(InterfaceC0835c<?> interfaceC0835c) {
                InterfaceC0835c<?> interfaceC0835c2 = interfaceC0835c;
                InterfaceC1078b<? extends Object> d10 = a0.d(((kotlin.jvm.internal.a) interfaceC0835c2).g(), (InterfaceC1078b[]) Arrays.copyOf(new InterfaceC1078b[0], 0));
                if (d10 == null) {
                    d10 = f0.f26394a.get(interfaceC0835c2);
                }
                if (d10 != null) {
                    return C1095a.a(d10);
                }
                return null;
            }
        };
        f23274b = z10 ? new f(13, serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1) : new f(17, serializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1);
        SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1 serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1 = new InterfaceC0650p<InterfaceC0835c<Object>, List<? extends k>, InterfaceC1078b<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1
            @Override // ca.InterfaceC0650p
            public final InterfaceC1078b<? extends Object> invoke(InterfaceC0835c<Object> interfaceC0835c, List<? extends k> list) {
                final List<? extends k> list2 = list;
                return e.y(interfaceC0835c, e.E(ua.a.f30484a, list2, true), new InterfaceC0635a<InterfaceC0835c>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public final InterfaceC0835c invoke() {
                        return list2.get(0).e();
                    }
                });
            }
        };
        f23275c = z10 ? new f(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1, 16) : new f(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1, 18);
        SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1 serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1 = new InterfaceC0650p<InterfaceC0835c<Object>, List<? extends k>, InterfaceC1078b<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1
            @Override // ca.InterfaceC0650p
            public final InterfaceC1078b<Object> invoke(InterfaceC0835c<Object> interfaceC0835c, List<? extends k> list) {
                final List<? extends k> list2 = list;
                InterfaceC1078b y10 = e.y(interfaceC0835c, e.E(ua.a.f30484a, list2, true), new InterfaceC0635a<InterfaceC0835c>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public final InterfaceC0835c invoke() {
                        return list2.get(0).e();
                    }
                });
                if (y10 != null) {
                    return C1095a.a(y10);
                }
                return null;
            }
        };
        f23276d = z10 ? new f(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1, 16) : new f(serializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1, 18);
    }
}
