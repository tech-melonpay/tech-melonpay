package com.sumsub.sns.internal.fingerprint.tools;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class b {
    public static final <V> Object a(Object obj) {
        boolean z10 = !(obj instanceof Result.Failure);
        if (z10) {
            kotlin.b.b(obj);
            return ((Result) obj).f23091a;
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return new Result.Failure(Result.a(obj));
    }
}
