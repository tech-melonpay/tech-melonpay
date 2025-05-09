package ra;

import kotlinx.serialization.internal.TaggedDecoder;

/* compiled from: Tagged.kt */
/* loaded from: classes2.dex */
public abstract class U extends TaggedDecoder<String> {
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String Q(pa.f fVar, int i) {
        String S = S(fVar, i);
        return S;
    }

    public String S(pa.f fVar, int i) {
        return fVar.g(i);
    }
}
