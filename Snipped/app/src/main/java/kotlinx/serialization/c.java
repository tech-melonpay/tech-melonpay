package kotlinx.serialization;

import O9.f;
import O9.p;
import P9.z;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;
import na.InterfaceC1077a;
import na.InterfaceC1078b;
import na.InterfaceC1081e;
import pa.C1123a;
import pa.d;
import pa.g;
import qa.InterfaceC1142b;
import qa.InterfaceC1145e;
import ra.AbstractC1167b;
import ra.m0;

/* compiled from: SealedSerializer.kt */
/* loaded from: classes2.dex */
public final class c<T> extends AbstractC1167b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0835c<T> f23290a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends Annotation> f23291b;

    /* renamed from: c, reason: collision with root package name */
    public final f f23292c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<InterfaceC0835c<? extends T>, InterfaceC1078b<? extends T>> f23293d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f23294e;

    public c(final String str, kotlin.jvm.internal.b bVar, InterfaceC0835c[] interfaceC0835cArr, InterfaceC1078b[] interfaceC1078bArr, Annotation[] annotationArr) {
        this.f23290a = bVar;
        this.f23291b = EmptyList.f23104a;
        this.f23292c = kotlin.a.b(LazyThreadSafetyMode.f23086b, new InterfaceC0635a<pa.f>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final pa.f invoke() {
                final c<Object> cVar = this;
                InterfaceC0646l<C1123a, p> interfaceC0646l = new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // ca.InterfaceC0646l
                    public final p invoke(C1123a c1123a) {
                        C1123a c1123a2 = c1123a;
                        C1123a.a(c1123a2, "type", m0.f26415b);
                        StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                        final c<Object> cVar2 = cVar;
                        sb2.append(cVar2.f23290a.d());
                        sb2.append('>');
                        C1123a.a(c1123a2, "value", kotlinx.serialization.descriptors.a.c(sb2.toString(), g.a.f25739a, new pa.f[0], new InterfaceC0646l<C1123a, p>() { // from class: kotlinx.serialization.SealedClassSerializer$descriptor$2$1$elementDescriptor$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // ca.InterfaceC0646l
                            public final p invoke(C1123a c1123a3) {
                                C1123a c1123a4 = c1123a3;
                                for (Map.Entry entry : cVar2.f23294e.entrySet()) {
                                    C1123a.a(c1123a4, (String) entry.getKey(), ((InterfaceC1078b) entry.getValue()).getDescriptor());
                                }
                                return p.f3034a;
                            }
                        }));
                        c1123a2.f25719b = cVar2.f23291b;
                        return p.f3034a;
                    }
                };
                return kotlinx.serialization.descriptors.a.c(str, d.b.f25729a, new pa.f[0], interfaceC0646l);
            }
        });
        if (interfaceC0835cArr.length != interfaceC1078bArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + bVar.d() + " should be marked @Serializable");
        }
        int min = Math.min(interfaceC0835cArr.length, interfaceC1078bArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(new Pair(interfaceC0835cArr[i], interfaceC1078bArr[i]));
        }
        Map<InterfaceC0835c<? extends T>, InterfaceC1078b<? extends T>> v10 = kotlin.collections.a.v(arrayList);
        this.f23293d = v10;
        Set<Map.Entry<InterfaceC0835c<? extends T>, InterfaceC1078b<? extends T>>> entrySet = v10.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String a10 = ((InterfaceC1078b) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(a10);
            if (obj == null) {
                linkedHashMap.containsKey(a10);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f23290a + "' have the same serial name '" + a10 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(a10, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(z.n(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC1078b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f23294e = linkedHashMap2;
        this.f23291b = Arrays.asList(annotationArr);
    }

    @Override // ra.AbstractC1167b
    public final InterfaceC1077a<T> a(InterfaceC1142b interfaceC1142b, String str) {
        InterfaceC1078b interfaceC1078b = (InterfaceC1078b) this.f23294e.get(str);
        return interfaceC1078b != null ? interfaceC1078b : super.a(interfaceC1142b, str);
    }

    @Override // ra.AbstractC1167b
    public final InterfaceC1081e<T> b(InterfaceC1145e interfaceC1145e, T t3) {
        InterfaceC1078b<? extends T> interfaceC1078b = this.f23293d.get(h.a(t3.getClass()));
        if (interfaceC1078b == null) {
            interfaceC1078b = super.b(interfaceC1145e, t3);
        }
        if (interfaceC1078b != null) {
            return interfaceC1078b;
        }
        return null;
    }

    @Override // ra.AbstractC1167b
    public final InterfaceC0835c<T> c() {
        return this.f23290a;
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return (pa.f) this.f23292c.getValue();
    }
}
