package io.sentry;

import io.sentry.protocol.TransactionNameSource;

/* compiled from: TransactionContext.java */
/* loaded from: classes2.dex */
public final class u0 extends p0 {

    /* renamed from: j, reason: collision with root package name */
    public final String f22209j;

    /* renamed from: k, reason: collision with root package name */
    public final TransactionNameSource f22210k;

    public u0(String str, TransactionNameSource transactionNameSource, String str2) {
        super(new H9.g(), new q0(), str2, null, null);
        D9.b.t0(str, "name is required");
        this.f22209j = str;
        this.f22210k = transactionNameSource;
        this.f22105d = null;
    }
}
