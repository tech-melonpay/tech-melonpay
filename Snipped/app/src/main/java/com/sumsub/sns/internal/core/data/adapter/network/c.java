package com.sumsub.sns.internal.core.data.adapter.network;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.common.x0;
import com.sumsub.sns.internal.log.LoggerType;
import java.io.IOException;
import java.util.Collections;
import okhttp3.k;
import qb.d;
import qb.f;
import qb.q;
import va.i;

/* loaded from: classes2.dex */
public final class c<S, E> implements qb.b<S> {

    /* renamed from: a, reason: collision with root package name */
    public final qb.b<S> f15232a;

    /* renamed from: b, reason: collision with root package name */
    public final f<i, E> f15233b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f15234c;

    public static final class a implements d<S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<S> f15235a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<S, E> f15236b;

        public a(d<S> dVar, c<S, E> cVar) {
            this.f15235a = dVar;
            this.f15236b = cVar;
        }

        @Override // qb.d
        public void onFailure(qb.b<S> bVar, Throwable th) {
            Logger.v$default(com.sumsub.sns.internal.log.a.f17535a.c(Collections.singletonList(LoggerType.LOG_CAT)), "ApiResponseCall", "failure on " + bVar.request().f24644a, null, 4, null);
            this.f15235a.onFailure(this.f15236b, th instanceof IOException ? new SNSException.Network(th) : new SNSException.Unknown(th));
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
        
            if (r0 == null) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
        @Override // qb.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(qb.b<S> r10, qb.q<S> r11) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.data.adapter.network.c.a.onResponse(qb.b, qb.q):void");
        }
    }

    public c(qb.b<S> bVar, f<i, E> fVar, x0 x0Var) {
        this.f15232a = bVar;
        this.f15233b = fVar;
        this.f15234c = x0Var;
    }

    @Override // qb.b
    public void cancel() {
        this.f15232a.cancel();
    }

    @Override // qb.b
    public void enqueue(d<S> dVar) {
        this.f15232a.enqueue(new a(dVar, this));
    }

    @Override // qb.b
    public q<S> execute() {
        throw new UnsupportedOperationException("ApiResponseCall doesn't support execute");
    }

    @Override // qb.b
    public boolean isCanceled() {
        return this.f15232a.isCanceled();
    }

    @Override // qb.b
    public k request() {
        return this.f15232a.request();
    }

    @Override // qb.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c<S, E> clone() {
        return new c<>(this.f15232a.clone(), this.f15233b, this.f15234c);
    }
}
