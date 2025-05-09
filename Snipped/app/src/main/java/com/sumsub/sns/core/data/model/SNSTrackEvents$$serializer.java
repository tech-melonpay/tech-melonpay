package com.sumsub.sns.core.data.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import na.InterfaceC1078b;
import oa.C1095a;
import pa.f;
import qa.InterfaceC1142b;
import qa.InterfaceC1143c;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;
import ra.InterfaceC1162A;
import ra.K;
import ra.a0;
import ra.i0;
import ra.m0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/sumsub/sns/core/data/model/SNSTrackEvents.$serializer", "Lra/A;", "Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "<init>", "()V", "", "Lna/b;", "childSerializers", "()[Lna/b;", "Lqa/d;", "decoder", "deserialize", "(Lqa/d;)Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "Lqa/e;", "encoder", "value", "LO9/p;", "serialize", "(Lqa/e;Lcom/sumsub/sns/core/data/model/SNSTrackEvents;)V", "Lpa/f;", "getDescriptor", "()Lpa/f;", "descriptor", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSTrackEvents$$serializer implements InterfaceC1162A<SNSTrackEvents> {
    public static final SNSTrackEvents$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        SNSTrackEvents$$serializer sNSTrackEvents$$serializer = new SNSTrackEvents$$serializer();
        INSTANCE = sNSTrackEvents$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sumsub.sns.core.data.model.SNSTrackEvents", sNSTrackEvents$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("activity", false);
        pluginGeneratedSerialDescriptor.k("ts", true);
        pluginGeneratedSerialDescriptor.k("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SNSTrackEvents$$serializer() {
    }

    @Override // ra.InterfaceC1162A
    public InterfaceC1078b<?>[] childSerializers() {
        m0 m0Var = m0.f26414a;
        return new InterfaceC1078b[]{m0Var, C1095a.a(m0Var), C1095a.a(new K(m0Var, new a(h.a(Object.class), new InterfaceC1078b[0])))};
    }

    @Override // na.InterfaceC1077a
    public SNSTrackEvents deserialize(InterfaceC1144d decoder) {
        f descriptor2 = getDescriptor();
        InterfaceC1142b c2 = decoder.c(descriptor2);
        Object obj = null;
        boolean z10 = true;
        int i = 0;
        Object obj2 = null;
        String str = null;
        while (z10) {
            int q10 = c2.q(descriptor2);
            if (q10 == -1) {
                z10 = false;
            } else if (q10 == 0) {
                str = c2.y(descriptor2, 0);
                i |= 1;
            } else if (q10 == 1) {
                obj = c2.D(descriptor2, 1, m0.f26414a, obj);
                i |= 2;
            } else {
                if (q10 != 2) {
                    throw new UnknownFieldException(q10);
                }
                obj2 = c2.D(descriptor2, 2, new K(m0.f26414a, new a(h.a(Object.class), new InterfaceC1078b[0])), obj2);
                i |= 4;
            }
        }
        c2.b(descriptor2);
        return new SNSTrackEvents(i, str, (String) obj, (Map) obj2, (i0) null);
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // na.InterfaceC1081e
    public void serialize(InterfaceC1145e encoder, SNSTrackEvents value) {
        f descriptor2 = getDescriptor();
        InterfaceC1143c c2 = encoder.c(descriptor2);
        SNSTrackEvents.write$Self(value, c2, descriptor2);
        c2.b(descriptor2);
    }

    @Override // ra.InterfaceC1162A
    public InterfaceC1078b<?>[] typeParametersSerializers() {
        return a0.f26382b;
    }
}
