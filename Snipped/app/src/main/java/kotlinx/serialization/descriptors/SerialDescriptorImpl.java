package kotlinx.serialization.descriptors;

import P9.j;
import P9.n;
import P9.s;
import P9.u;
import P9.v;
import P9.z;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ha.h;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import pa.C1123a;
import pa.f;
import pa.g;
import ra.InterfaceC1177l;
import ra.a0;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes2.dex */
public final class SerialDescriptorImpl implements f, InterfaceC1177l {

    /* renamed from: a, reason: collision with root package name */
    public final String f23295a;

    /* renamed from: b, reason: collision with root package name */
    public final g f23296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23297c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Annotation> f23298d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f23299e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f23300f;

    /* renamed from: g, reason: collision with root package name */
    public final f[] f23301g;

    /* renamed from: h, reason: collision with root package name */
    public final List<Annotation>[] f23302h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, Integer> f23303j;

    /* renamed from: k, reason: collision with root package name */
    public final f[] f23304k;

    /* renamed from: l, reason: collision with root package name */
    public final O9.f f23305l;

    public SerialDescriptorImpl(String str, g gVar, int i, List<? extends f> list, C1123a c1123a) {
        this.f23295a = str;
        this.f23296b = gVar;
        this.f23297c = i;
        this.f23298d = c1123a.f25719b;
        ArrayList arrayList = c1123a.f25720c;
        HashSet hashSet = new HashSet(z.n(n.u(arrayList, 12)));
        s.a0(arrayList, hashSet);
        this.f23299e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f23300f = strArr;
        this.f23301g = a0.c(c1123a.f25722e);
        this.f23302h = (List[]) c1123a.f25723f.toArray(new List[0]);
        this.i = s.Z(c1123a.f25724g);
        j jVar = new j(new A8.b(strArr, 8), 1);
        ArrayList arrayList2 = new ArrayList(n.u(jVar, 10));
        Iterator it = jVar.iterator();
        while (true) {
            v vVar = (v) it;
            if (!((Iterator) vVar.f3168c).hasNext()) {
                this.f23303j = kotlin.collections.a.v(arrayList2);
                this.f23304k = a0.c(list);
                this.f23305l = kotlin.a.a(new InterfaceC0635a<Integer>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
                    {
                        super(0);
                    }

                    @Override // ca.InterfaceC0635a
                    public final Integer invoke() {
                        SerialDescriptorImpl serialDescriptorImpl = SerialDescriptorImpl.this;
                        return Integer.valueOf(a0.e(serialDescriptorImpl, serialDescriptorImpl.f23304k));
                    }
                });
                return;
            }
            u uVar = (u) vVar.next();
            arrayList2.add(new Pair(uVar.f3165b, Integer.valueOf(uVar.f3164a)));
        }
    }

    @Override // pa.f
    public final String a() {
        return this.f23295a;
    }

    @Override // ra.InterfaceC1177l
    public final Set<String> b() {
        return this.f23299e;
    }

    @Override // pa.f
    public final boolean c() {
        return false;
    }

    @Override // pa.f
    public final int d(String str) {
        Integer num = this.f23303j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // pa.f
    public final g e() {
        return this.f23296b;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            f fVar = (f) obj;
            if (kotlin.jvm.internal.f.b(a(), fVar.a()) && Arrays.equals(this.f23304k, ((SerialDescriptorImpl) obj).f23304k) && f() == fVar.f()) {
                int f10 = f();
                for (0; i < f10; i + 1) {
                    i = (kotlin.jvm.internal.f.b(i(i).a(), fVar.i(i).a()) && kotlin.jvm.internal.f.b(i(i).e(), fVar.i(i).e())) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // pa.f
    public final int f() {
        return this.f23297c;
    }

    @Override // pa.f
    public final String g(int i) {
        return this.f23300f[i];
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return this.f23298d;
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        return this.f23302h[i];
    }

    public final int hashCode() {
        return ((Number) this.f23305l.getValue()).intValue();
    }

    @Override // pa.f
    public final f i(int i) {
        return this.f23301g[i];
    }

    @Override // pa.f
    public final boolean isInline() {
        return false;
    }

    @Override // pa.f
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return s.P(h.V(0, this.f23297c), ", ", C.v.q(new StringBuilder(), this.f23295a, '('), ")", new InterfaceC0646l<Integer, CharSequence>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$toString$1
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final CharSequence invoke(Integer num) {
                int intValue = num.intValue();
                StringBuilder sb2 = new StringBuilder();
                SerialDescriptorImpl serialDescriptorImpl = SerialDescriptorImpl.this;
                sb2.append(serialDescriptorImpl.f23300f[intValue]);
                sb2.append(": ");
                sb2.append(serialDescriptorImpl.f23301g[intValue].a());
                return sb2.toString();
            }
        }, 24);
    }
}
