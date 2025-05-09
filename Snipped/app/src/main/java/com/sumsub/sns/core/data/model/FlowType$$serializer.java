package com.sumsub.sns.core.data.model;

import kotlin.Metadata;
import kotlinx.serialization.internal.EnumDescriptor;
import na.InterfaceC1078b;
import pa.f;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.a0;
import ra.m0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sumsub/sns/core/data/model/FlowType.$serializer", "Lra/A;", "Lcom/sumsub/sns/core/data/model/FlowType;", "<init>", "()V", "", "Lna/b;", "childSerializers", "()[Lna/b;", "Lqa/d;", "decoder", "deserialize", "(Lqa/d;)Lcom/sumsub/sns/core/data/model/FlowType;", "Lqa/e;", "encoder", "value", "LO9/p;", "serialize", "(Lqa/e;Lcom/sumsub/sns/core/data/model/FlowType;)V", "Lpa/f;", "getDescriptor", "()Lpa/f;", "descriptor", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FlowType$$serializer implements InterfaceC1162A<FlowType> {
    public static final FlowType$$serializer INSTANCE = new FlowType$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sumsub.sns.core.data.model.FlowType", 3);
        enumDescriptor.k("actions", false);
        enumDescriptor.k("standalone", false);
        enumDescriptor.k("module", false);
        descriptor = enumDescriptor;
    }

    private FlowType$$serializer() {
    }

    @Override // ra.InterfaceC1162A
    public InterfaceC1078b<?>[] childSerializers() {
        return new InterfaceC1078b[]{m0.f26414a};
    }

    @Override // na.InterfaceC1077a
    public FlowType deserialize(InterfaceC1144d decoder) {
        return FlowType.values()[decoder.i(getDescriptor())];
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // na.InterfaceC1081e
    public void serialize(InterfaceC1145e encoder, FlowType value) {
        encoder.l(getDescriptor(), value.ordinal());
    }

    @Override // ra.InterfaceC1162A
    public InterfaceC1078b<?>[] typeParametersSerializers() {
        return a0.f26382b;
    }
}
