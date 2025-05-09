package kotlinx.serialization.json.internal;

import ca.InterfaceC0650p;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import pa.f;

/* compiled from: JsonElementMarker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements InterfaceC0650p<f, Integer, Boolean> {
    @Override // ca.InterfaceC0650p
    public final Boolean invoke(f fVar, Integer num) {
        f fVar2 = fVar;
        int intValue = num.intValue();
        JsonElementMarker jsonElementMarker = (JsonElementMarker) this.receiver;
        jsonElementMarker.getClass();
        boolean z10 = !fVar2.j(intValue) && fVar2.i(intValue).c();
        jsonElementMarker.f23384b = z10;
        return Boolean.valueOf(z10);
    }
}
