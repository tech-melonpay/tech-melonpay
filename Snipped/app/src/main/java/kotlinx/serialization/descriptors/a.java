package kotlinx.serialization.descriptors;

import P9.l;
import ca.InterfaceC0646l;
import ia.InterfaceC0835c;
import java.util.Iterator;
import ka.C0963h;
import ka.C0967l;
import ka.C0969n;
import kotlinx.serialization.descriptors.b;
import pa.C1123a;
import pa.e;
import pa.f;
import pa.g;
import ra.e0;
import ra.f0;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final e0 a(String str, e.i iVar) {
        if (!(!C0969n.i0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        Iterator<InterfaceC0835c<? extends Object>> it = f0.f26394a.keySet().iterator();
        while (it.hasNext()) {
            String a10 = f0.a(it.next().d());
            if (C0967l.U(str, "kotlin." + a10, true) || C0967l.U(str, a10, true)) {
                StringBuilder m2 = com.google.android.gms.measurement.internal.a.m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ");
                m2.append(f0.a(a10));
                m2.append("Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(C0963h.N(m2.toString()));
            }
        }
        return new e0(str, iVar);
    }

    public static final SerialDescriptorImpl b(String str, f[] fVarArr, InterfaceC0646l interfaceC0646l) {
        if (!(!C0969n.i0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        C1123a c1123a = new C1123a(str);
        interfaceC0646l.invoke(c1123a);
        return new SerialDescriptorImpl(str, b.a.f23309a, c1123a.f25720c.size(), l.u(fVarArr), c1123a);
    }

    public static final SerialDescriptorImpl c(String str, g gVar, f[] fVarArr, InterfaceC0646l interfaceC0646l) {
        if (!(!C0969n.i0(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!kotlin.jvm.internal.f.b(gVar, b.a.f23309a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        C1123a c1123a = new C1123a(str);
        interfaceC0646l.invoke(c1123a);
        return new SerialDescriptorImpl(str, gVar, c1123a.f25720c.size(), l.u(fVarArr), c1123a);
    }
}
