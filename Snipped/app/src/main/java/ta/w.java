package ta;

import ia.InterfaceC0835c;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.internal.WriteMode;
import na.InterfaceC1078b;
import pa.C1124b;
import pa.g;
import sa.AbstractC1244a;

/* compiled from: WriteMode.kt */
/* loaded from: classes2.dex */
public final class w {
    public static final pa.f a(pa.f fVar, Y8.a aVar) {
        pa.f a10;
        InterfaceC1078b c2;
        if (!kotlin.jvm.internal.f.b(fVar.e(), g.a.f25739a)) {
            return fVar.isInline() ? a(fVar.i(0), aVar) : fVar;
        }
        InterfaceC0835c z10 = C1124b.z(fVar);
        pa.f fVar2 = null;
        if (z10 != null && (c2 = aVar.c(z10, EmptyList.f23104a)) != null) {
            fVar2 = c2.getDescriptor();
        }
        return (fVar2 == null || (a10 = a(fVar2, aVar)) == null) ? fVar : a10;
    }

    public static final WriteMode b(pa.f fVar, AbstractC1244a abstractC1244a) {
        pa.g e10 = fVar.e();
        if (e10 instanceof pa.d) {
            return WriteMode.f23401f;
        }
        if (kotlin.jvm.internal.f.b(e10, b.C0424b.f23310a)) {
            return WriteMode.f23399d;
        }
        if (!kotlin.jvm.internal.f.b(e10, b.c.f23311a)) {
            return WriteMode.f23398c;
        }
        pa.f a10 = a(fVar.i(0), abstractC1244a.f27066b);
        pa.g e11 = a10.e();
        if ((e11 instanceof pa.e) || kotlin.jvm.internal.f.b(e11, g.b.f25740a)) {
            return WriteMode.f23400e;
        }
        if (abstractC1244a.f27065a.f27092d) {
            return WriteMode.f23399d;
        }
        throw C1124b.e(a10);
    }
}
