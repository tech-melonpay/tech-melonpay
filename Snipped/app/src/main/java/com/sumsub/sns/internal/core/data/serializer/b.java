package com.sumsub.sns.internal.core.data.serializer;

import com.sumsub.sns.core.data.model.FlowActionType;
import na.InterfaceC1078b;
import pa.e;
import pa.f;
import qa.InterfaceC1144d;
import qa.InterfaceC1145e;

/* loaded from: classes2.dex */
public final class b implements InterfaceC1078b<FlowActionType> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15824a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final f f15825b = kotlinx.serialization.descriptors.a.a("com.sumsub.sns.internal.core.data.serializer.FlowActionTypeSerializer", e.i.f25738a);

    @Override // na.InterfaceC1077a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FlowActionType deserialize(InterfaceC1144d interfaceC1144d) {
        return FlowActionType.INSTANCE.get(interfaceC1144d.p());
    }

    @Override // na.InterfaceC1081e, na.InterfaceC1077a
    public f getDescriptor() {
        return f15825b;
    }

    @Override // na.InterfaceC1081e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC1145e interfaceC1145e, FlowActionType flowActionType) {
        interfaceC1145e.F(flowActionType.getValue());
    }
}
