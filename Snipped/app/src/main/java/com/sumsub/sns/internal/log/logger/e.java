package com.sumsub.sns.internal.log.logger;

import com.sumsub.log.logger.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class e implements Logger {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<Logger> f17577a = new CopyOnWriteArrayList<>();

    public final void a(Logger logger) {
        this.f17577a.add(logger);
    }

    public final List<Logger> c() {
        return this.f17577a;
    }

    public final void clear() {
        this.f17577a.clear();
    }

    @Override // com.sumsub.log.logger.Logger
    public void d(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17577a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).d(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void e(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17577a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).e(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void i(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17577a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).i(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void v(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17577a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).v(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void w(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17577a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).w(str, str2, th);
        }
    }
}
