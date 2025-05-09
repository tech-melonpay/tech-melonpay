package kotlin.jvm.internal;

import C.v;
import P9.s;
import ia.InterfaceC0835c;
import ia.l;
import java.util.List;
import kotlin.reflect.KVariance;

/* compiled from: TypeReference.kt */
/* loaded from: classes2.dex */
public final class k implements ia.k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0835c f23188a;

    /* renamed from: b, reason: collision with root package name */
    public final List<l> f23189b;

    /* renamed from: c, reason: collision with root package name */
    public final ia.k f23190c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23191d;

    /* compiled from: TypeReference.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23192a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f23196a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f23196a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f23196a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23192a = iArr;
        }
    }

    public k() {
        throw null;
    }

    public k(InterfaceC0835c interfaceC0835c, List list, k kVar, int i) {
        this.f23188a = interfaceC0835c;
        this.f23189b = list;
        this.f23190c = kVar;
        this.f23191d = i;
    }

    @Override // ia.k
    public final List<l> a() {
        return this.f23189b;
    }

    @Override // ia.k
    public final boolean c() {
        return (this.f23191d & 1) != 0;
    }

    @Override // ia.k
    public final InterfaceC0835c e() {
        return this.f23188a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (f.b(this.f23188a, kVar.f23188a)) {
                if (f.b(this.f23189b, kVar.f23189b) && f.b(this.f23190c, kVar.f23190c) && this.f23191d == kVar.f23191d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String g(boolean z10) {
        InterfaceC0835c interfaceC0835c = this.f23188a;
        InterfaceC0835c interfaceC0835c2 = interfaceC0835c instanceof InterfaceC0835c ? interfaceC0835c : null;
        Class<?> g10 = interfaceC0835c2 != null ? ((kotlin.jvm.internal.a) interfaceC0835c2).g() : null;
        String obj = g10 == null ? interfaceC0835c.toString() : (this.f23191d & 4) != 0 ? "kotlin.Nothing" : g10.isArray() ? f.b(g10, boolean[].class) ? "kotlin.BooleanArray" : f.b(g10, char[].class) ? "kotlin.CharArray" : f.b(g10, byte[].class) ? "kotlin.ByteArray" : f.b(g10, short[].class) ? "kotlin.ShortArray" : f.b(g10, int[].class) ? "kotlin.IntArray" : f.b(g10, float[].class) ? "kotlin.FloatArray" : f.b(g10, long[].class) ? "kotlin.LongArray" : f.b(g10, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z10 && g10.isPrimitive()) ? U4.b.k(interfaceC0835c).getName() : g10.getName();
        List<l> list = this.f23189b;
        String p10 = v.p(obj, list.isEmpty() ? "" : s.P(list, ", ", "<", ">", new C7.a(this, 23), 24), c() ? "?" : "");
        ia.k kVar = this.f23190c;
        if (!(kVar instanceof k)) {
            return p10;
        }
        String g11 = ((k) kVar).g(true);
        if (f.b(g11, p10)) {
            return p10;
        }
        if (f.b(g11, p10 + '?')) {
            return p10 + '!';
        }
        return "(" + p10 + ".." + g11 + ')';
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23191d) + v.f(this.f23189b, this.f23188a.hashCode() * 31, 31);
    }

    public final String toString() {
        return g(false) + " (Kotlin reflection is not available)";
    }
}
