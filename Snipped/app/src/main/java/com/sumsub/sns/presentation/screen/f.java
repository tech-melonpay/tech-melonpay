package com.sumsub.sns.presentation.screen;

import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.internal.core.data.model.Document;
import com.sumsub.sns.presentation.screen.b;

/* loaded from: classes2.dex */
public final class f {
    public static final b.d b(com.sumsub.sns.internal.core.data.model.g gVar, Document document) {
        if (kotlin.jvm.internal.f.b(FlowActionType.INSTANCE.get(gVar.L()), FlowActionType.FaceEnrollment.INSTANCE)) {
            return a.a(document, gVar, true);
        }
        return null;
    }
}
