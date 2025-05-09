package com.sumsub.sns.prooface.data;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i {
    public static final h a(String str) {
        return new h(LivenessMessageType.livenessFragment.getType(), (k) null, new f(str), (e) null, (j) null, 26, (DefaultConstructorMarker) null);
    }

    public static final h b(String str) {
        return new h(LivenessMessageType.startLivenessSession.getType(), new k(str), (f) null, (e) null, (j) null, 28, (DefaultConstructorMarker) null);
    }
}
