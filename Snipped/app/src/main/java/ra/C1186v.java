package ra;

import kotlin.time.DurationUnit;
import la.c;
import na.InterfaceC1078b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* compiled from: BuiltInSerializers.kt */
/* renamed from: ra.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1186v implements InterfaceC1078b<la.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1186v f26440a = new C1186v();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f26441b = new e0("kotlin.time.Duration", e.i.f25738a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        c.a aVar = la.c.f23587b;
        String p10 = interfaceC1144d.p();
        aVar.getClass();
        try {
            return new la.c(la.e.a(p10, true));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(androidx.camera.core.n.a("Invalid ISO duration string format: '", p10, "'."), e10);
        }
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f26441b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        long j10 = ((la.c) obj).f23590a;
        c.a aVar = la.c.f23587b;
        StringBuilder sb2 = new StringBuilder();
        if (la.c.j(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long n10 = la.c.j(j10) ? la.c.n(j10) : j10;
        long l10 = la.c.l(n10, DurationUnit.HOURS);
        int f10 = la.c.f(n10);
        int h9 = la.c.h(n10);
        int g10 = la.c.g(n10);
        if (la.c.i(j10)) {
            l10 = 9999999999999L;
        }
        boolean z10 = false;
        boolean z11 = l10 != 0;
        boolean z12 = (h9 == 0 && g10 == 0) ? false : true;
        if (f10 != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(l10);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(f10);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            la.c.c(sb2, h9, g10, 9, "S", true);
        }
        interfaceC1145e.F(sb2.toString());
    }
}
