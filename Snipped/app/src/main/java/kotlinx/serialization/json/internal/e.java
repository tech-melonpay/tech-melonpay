package kotlinx.serialization.json.internal;

import O9.p;
import ca.InterfaceC0646l;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonElement;
import na.InterfaceC1078b;
import sa.AbstractC1244a;
import ta.l;

/* compiled from: TreeJsonEncoder.kt */
/* loaded from: classes2.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonElement a(AbstractC1244a abstractC1244a, Object obj, InterfaceC1078b interfaceC1078b) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new l(abstractC1244a, new InterfaceC0646l<JsonElement, p>() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$writeJson$encoder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.serialization.json.JsonElement] */
            @Override // ca.InterfaceC0646l
            public final p invoke(JsonElement jsonElement) {
                ref$ObjectRef.f23179a = jsonElement;
                return p.f3034a;
            }
        }, 1).s(interfaceC1078b, obj);
        T t3 = ref$ObjectRef.f23179a;
        if (t3 == 0) {
            return null;
        }
        return (JsonElement) t3;
    }
}
