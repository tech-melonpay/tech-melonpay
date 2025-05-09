package ra;

import ia.InterfaceC0835c;
import java.util.Map;
import kotlin.Pair;
import la.c;
import na.InterfaceC1078b;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<InterfaceC0835c<? extends Object>, InterfaceC1078b<? extends Object>> f26394a;

    static {
        Pair pair = new Pair(kotlin.jvm.internal.h.a(String.class), m0.f26414a);
        Pair pair2 = new Pair(kotlin.jvm.internal.h.a(Character.TYPE), C1181p.f26422a);
        Pair pair3 = new Pair(kotlin.jvm.internal.h.a(char[].class), C1180o.f26420c);
        Pair pair4 = new Pair(kotlin.jvm.internal.h.a(Double.TYPE), C1185u.f26437a);
        Pair pair5 = new Pair(kotlin.jvm.internal.h.a(double[].class), C1184t.f26434c);
        Pair pair6 = new Pair(kotlin.jvm.internal.h.a(Float.TYPE), C1190z.f26457a);
        Pair pair7 = new Pair(kotlin.jvm.internal.h.a(float[].class), C1189y.f26454c);
        Pair pair8 = new Pair(kotlin.jvm.internal.h.a(Long.TYPE), O.f26364a);
        Pair pair9 = new Pair(kotlin.jvm.internal.h.a(long[].class), N.f26363c);
        Pair pair10 = new Pair(kotlin.jvm.internal.h.a(O9.k.class), v0.f26442a);
        Pair pair11 = new Pair(kotlin.jvm.internal.h.a(O9.l.class), u0.f26439c);
        Pair pair12 = new Pair(kotlin.jvm.internal.h.a(Integer.TYPE), H.f26353a);
        Pair pair13 = new Pair(kotlin.jvm.internal.h.a(int[].class), G.f26352c);
        Pair pair14 = new Pair(kotlin.jvm.internal.h.a(O9.i.class), s0.f26432a);
        Pair pair15 = new Pair(kotlin.jvm.internal.h.a(O9.j.class), r0.f26429c);
        Pair pair16 = new Pair(kotlin.jvm.internal.h.a(Short.TYPE), l0.f26411a);
        Pair pair17 = new Pair(kotlin.jvm.internal.h.a(short[].class), k0.f26410c);
        Pair pair18 = new Pair(kotlin.jvm.internal.h.a(O9.n.class), y0.f26455a);
        Pair pair19 = new Pair(kotlin.jvm.internal.h.a(O9.o.class), x0.f26453c);
        Pair pair20 = new Pair(kotlin.jvm.internal.h.a(Byte.TYPE), C1175j.f26405a);
        Pair pair21 = new Pair(kotlin.jvm.internal.h.a(byte[].class), C1174i.f26404c);
        Pair pair22 = new Pair(kotlin.jvm.internal.h.a(O9.g.class), p0.f26424a);
        Pair pair23 = new Pair(kotlin.jvm.internal.h.a(O9.h.class), o0.f26421c);
        Pair pair24 = new Pair(kotlin.jvm.internal.h.a(Boolean.TYPE), C1172g.f26395a);
        Pair pair25 = new Pair(kotlin.jvm.internal.h.a(boolean[].class), C1171f.f26393c);
        kotlin.jvm.internal.b a10 = kotlin.jvm.internal.h.a(O9.p.class);
        O9.p pVar = O9.p.f3034a;
        Pair pair26 = new Pair(a10, z0.f26459b);
        Pair pair27 = new Pair(kotlin.jvm.internal.h.a(Void.class), X.f26376a);
        kotlin.jvm.internal.b a11 = kotlin.jvm.internal.h.a(la.c.class);
        c.a aVar = la.c.f23587b;
        f26394a = kotlin.collections.a.s(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, new Pair(a11, C1186v.f26440a));
    }

    public static final String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char charAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(charAt) ? j3.e.F(charAt) : String.valueOf(charAt)));
        sb2.append(str.substring(1));
        return sb2.toString();
    }
}
