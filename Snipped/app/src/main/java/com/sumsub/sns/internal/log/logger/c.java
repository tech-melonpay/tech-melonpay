package com.sumsub.sns.internal.log.logger;

import com.sumsub.log.logger.Logger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c implements Logger {

    /* renamed from: a, reason: collision with root package name */
    public final List<Logger> f17575a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends Logger> list) {
        this.f17575a = list;
    }

    @Override // com.sumsub.log.logger.Logger
    public void d(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17575a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).d(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void e(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17575a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).e(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void i(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17575a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).i(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void v(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17575a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).v(str, str2, th);
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void w(String str, String str2, Throwable th) {
        Iterator<T> it = this.f17575a.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).w(str, str2, th);
        }
    }
}
