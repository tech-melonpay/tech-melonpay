package com.sumsub.sns.internal.ml.core.pipeline.core;

import com.sumsub.sns.internal.core.common.s$a;

/* loaded from: classes2.dex */
public abstract class c<Input, Output> implements b<Input, Output> {
    @Override // com.sumsub.sns.internal.ml.core.pipeline.core.b
    public Output a(Input input) {
        try {
            return b(input);
        } catch (OutOfMemoryError unused) {
            s$a.f15191a.a();
            return b(input);
        }
    }

    public abstract Output b(Input input);
}
