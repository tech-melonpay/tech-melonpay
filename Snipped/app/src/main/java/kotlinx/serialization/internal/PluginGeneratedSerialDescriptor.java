package kotlinx.serialization.internal;

import C.v;
import P9.s;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import ha.h;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import na.InterfaceC1078b;
import pa.f;
import pa.g;
import ra.InterfaceC1162A;
import ra.InterfaceC1177l;
import ra.a0;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
/* loaded from: classes2.dex */
public class PluginGeneratedSerialDescriptor implements f, InterfaceC1177l {

    /* renamed from: a, reason: collision with root package name */
    public final String f23335a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1162A<?> f23336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23337c;

    /* renamed from: d, reason: collision with root package name */
    public int f23338d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f23339e;

    /* renamed from: f, reason: collision with root package name */
    public final List<Annotation>[] f23340f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f23341g;

    /* renamed from: h, reason: collision with root package name */
    public Map<String, Integer> f23342h;
    public final O9.f i;

    /* renamed from: j, reason: collision with root package name */
    public final O9.f f23343j;

    /* renamed from: k, reason: collision with root package name */
    public final O9.f f23344k;

    public PluginGeneratedSerialDescriptor(String str, InterfaceC1162A<?> interfaceC1162A, int i) {
        this.f23335a = str;
        this.f23336b = interfaceC1162A;
        this.f23337c = i;
        String[] strArr = new String[i];
        for (int i9 = 0; i9 < i; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f23339e = strArr;
        int i10 = this.f23337c;
        this.f23340f = new List[i10];
        this.f23341g = new boolean[i10];
        this.f23342h = kotlin.collections.a.p();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23086b;
        this.i = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<InterfaceC1078b<?>[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final InterfaceC1078b<?>[] invoke() {
                InterfaceC1078b<?>[] childSerializers;
                InterfaceC1162A<?> interfaceC1162A2 = PluginGeneratedSerialDescriptor.this.f23336b;
                return (interfaceC1162A2 == null || (childSerializers = interfaceC1162A2.childSerializers()) == null) ? a0.f26382b : childSerializers;
            }
        });
        this.f23343j = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<f[]>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final f[] invoke() {
                ArrayList arrayList;
                InterfaceC1078b<?>[] typeParametersSerializers;
                InterfaceC1162A<?> interfaceC1162A2 = PluginGeneratedSerialDescriptor.this.f23336b;
                if (interfaceC1162A2 == null || (typeParametersSerializers = interfaceC1162A2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (InterfaceC1078b<?> interfaceC1078b : typeParametersSerializers) {
                        arrayList.add(interfaceC1078b.getDescriptor());
                    }
                }
                return a0.c(arrayList);
            }
        });
        this.f23344k = kotlin.a.b(lazyThreadSafetyMode, new InterfaceC0635a<Integer>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
                return Integer.valueOf(a0.e(pluginGeneratedSerialDescriptor, (f[]) pluginGeneratedSerialDescriptor.f23343j.getValue()));
            }
        });
    }

    @Override // pa.f
    public final String a() {
        return this.f23335a;
    }

    @Override // ra.InterfaceC1177l
    public final Set<String> b() {
        return this.f23342h.keySet();
    }

    @Override // pa.f
    public final boolean c() {
        return false;
    }

    @Override // pa.f
    public final int d(String str) {
        Integer num = this.f23342h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // pa.f
    public g e() {
        return b.a.f23309a;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            f fVar = (f) obj;
            if (kotlin.jvm.internal.f.b(this.f23335a, fVar.a()) && Arrays.equals((f[]) this.f23343j.getValue(), (f[]) ((PluginGeneratedSerialDescriptor) obj).f23343j.getValue())) {
                int f10 = fVar.f();
                int i9 = this.f23337c;
                if (i9 == f10) {
                    for (0; i < i9; i + 1) {
                        i = (kotlin.jvm.internal.f.b(i(i).a(), fVar.i(i).a()) && kotlin.jvm.internal.f.b(i(i).e(), fVar.i(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pa.f
    public final int f() {
        return this.f23337c;
    }

    @Override // pa.f
    public final String g(int i) {
        return this.f23339e[i];
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return EmptyList.f23104a;
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        List<Annotation> list = this.f23340f[i];
        return list == null ? EmptyList.f23104a : list;
    }

    public int hashCode() {
        return ((Number) this.f23344k.getValue()).intValue();
    }

    @Override // pa.f
    public f i(int i) {
        return ((InterfaceC1078b[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // pa.f
    public boolean isInline() {
        return false;
    }

    @Override // pa.f
    public final boolean j(int i) {
        return this.f23341g[i];
    }

    public final void k(String str, boolean z10) {
        int i = this.f23338d + 1;
        this.f23338d = i;
        String[] strArr = this.f23339e;
        strArr[i] = str;
        this.f23341g[i] = z10;
        this.f23340f[i] = null;
        if (i == this.f23337c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                hashMap.put(strArr[i9], Integer.valueOf(i9));
            }
            this.f23342h = hashMap;
        }
    }

    public String toString() {
        return s.P(h.V(0, this.f23337c), ", ", v.q(new StringBuilder(), this.f23335a, '('), ")", new InterfaceC0646l<Integer, CharSequence>() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$toString$1
            {
                super(1);
            }

            @Override // ca.InterfaceC0646l
            public final CharSequence invoke(Integer num) {
                int intValue = num.intValue();
                StringBuilder sb2 = new StringBuilder();
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
                sb2.append(pluginGeneratedSerialDescriptor.f23339e[intValue]);
                sb2.append(": ");
                sb2.append(pluginGeneratedSerialDescriptor.i(intValue).a());
                return sb2.toString();
            }
        }, 24);
    }
}
