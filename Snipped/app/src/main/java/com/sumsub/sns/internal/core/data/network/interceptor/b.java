package com.sumsub.sns.internal.core.data.network.interceptor;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.p;
import va.g;

/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final HttpLoggingInterceptor f15811a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Regex> f15812b;

    public b(HttpLoggingInterceptor httpLoggingInterceptor, List<Regex> list) {
        this.f15811a = httpLoggingInterceptor;
        this.f15812b = list;
    }

    @Override // va.g
    public p intercept(g.a aVar) {
        String str = aVar.request().f24644a.i;
        HttpLoggingInterceptor.Level level = this.f15811a.f24659c;
        HttpLoggingInterceptor.Level level2 = HttpLoggingInterceptor.Level.f24662c;
        if (level == level2) {
            List<Regex> list = this.f15812b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Regex) it.next()).f23200a.matcher(str).find()) {
                        this.f15811a.f24659c = HttpLoggingInterceptor.Level.f24661b;
                        p intercept = this.f15811a.intercept(aVar);
                        this.f15811a.f24659c = level2;
                        return intercept;
                    }
                }
            }
        }
        return this.f15811a.intercept(aVar);
    }
}
