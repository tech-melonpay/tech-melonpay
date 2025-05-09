package sa;

import ka.C0966k;
import kotlinx.serialization.json.JsonElement;
import na.InterfaceC1078b;
import pa.C1124b;
import pa.e;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.e0;
import ra.v0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes2.dex */
public final class m implements InterfaceC1078b<l> {

    /* renamed from: a, reason: collision with root package name */
    public static final m f27108a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f27109b = kotlinx.serialization.descriptors.a.a("kotlinx.serialization.json.JsonLiteral", e.i.f25738a);

    @Override // na.InterfaceC1077a
    public final Object deserialize(InterfaceC1144d interfaceC1144d) {
        JsonElement l10 = C1124b.i(interfaceC1144d).l();
        if (l10 instanceof l) {
            return (l) l10;
        }
        throw C1124b.g(-1, "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.h.a(l10.getClass()), l10.toString());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public final pa.f getDescriptor() {
        return f27109b;
    }

    @Override // na.InterfaceC1081e
    public final void serialize(InterfaceC1145e interfaceC1145e, Object obj) {
        l lVar = (l) obj;
        C1124b.h(interfaceC1145e);
        String str = lVar.f27107c;
        if (lVar.f27105a) {
            interfaceC1145e.F(str);
            return;
        }
        pa.f fVar = lVar.f27106b;
        if (fVar != null) {
            interfaceC1145e.z(fVar).F(str);
            return;
        }
        Long T = C0966k.T(str);
        if (T != null) {
            interfaceC1145e.B(T.longValue());
            return;
        }
        O9.k I10 = j3.e.I(str);
        if (I10 != null) {
            interfaceC1145e.z(v0.f26443b).B(I10.f3025a);
            return;
        }
        Double R = C0966k.R(str);
        if (R != null) {
            interfaceC1145e.g(R.doubleValue());
            return;
        }
        Boolean bool = kotlin.jvm.internal.f.b(str, "true") ? Boolean.TRUE : kotlin.jvm.internal.f.b(str, "false") ? Boolean.FALSE : null;
        if (bool != null) {
            interfaceC1145e.k(bool.booleanValue());
        } else {
            interfaceC1145e.F(str);
        }
    }
}
