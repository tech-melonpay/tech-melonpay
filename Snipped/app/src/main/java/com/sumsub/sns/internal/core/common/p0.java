package com.sumsub.sns.internal.core.common;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.c;

/* loaded from: classes2.dex */
public final class p0 {
    public final o0 a() {
        try {
            Class.forName("com.google.mlkit.vision.face.FaceDetection");
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Using MLKit Face rotation detector", null, 4, null);
            return new d0();
        } catch (Exception unused) {
            Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, c.a(this), "Disable rotation detector", null, 4, null);
            return new n();
        }
    }
}
