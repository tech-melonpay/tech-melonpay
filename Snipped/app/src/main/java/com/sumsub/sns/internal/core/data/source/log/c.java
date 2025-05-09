package com.sumsub.sns.internal.core.data.source.log;

import com.sumsub.sns.internal.core.data.model.LogParams;
import com.sumsub.sns.internal.core.data.model.LogType;
import com.sumsub.sns.internal.core.data.model.r;
import com.sumsub.sns.internal.core.data.source.applicant.remote.g;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final b f16312a;

    public c(b bVar) {
        this.f16312a = bVar;
    }

    @Override // com.sumsub.sns.internal.core.data.source.log.a
    public Object a(LogType logType, LogParams logParams, T9.a<? super g> aVar) {
        return this.f16312a.a(logType.getValue(), r.a(logParams), aVar);
    }
}
