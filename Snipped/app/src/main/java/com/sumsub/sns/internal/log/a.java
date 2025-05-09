package com.sumsub.sns.internal.log;

import P9.l;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.logger.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a implements Logger {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f17536b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f17535a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final HandlerC0266a f17537c = new HandlerC0266a();

    /* renamed from: d, reason: collision with root package name */
    public static final e f17538d = new e();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap<LoggerType, Logger> f17539e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap<String, com.sumsub.sns.internal.log.logger.b> f17540f = new ConcurrentHashMap<>();

    /* renamed from: com.sumsub.sns.internal.log.a$a, reason: collision with other inner class name */
    public static final class HandlerC0266a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public static final C0267a f17541a = new C0267a(null);

        /* renamed from: com.sumsub.sns.internal.log.a$a$a, reason: collision with other inner class name */
        public static final class C0267a {
            public /* synthetic */ C0267a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0267a() {
            }
        }

        public HandlerC0266a() {
            super(Looper.getMainLooper());
        }

        public final void a() {
            removeMessages(0);
        }

        public final void b() {
            if (hasMessages(0)) {
                return;
            }
            sendMessageDelayed(obtainMessage(0), 10000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                a.f17535a.e();
            }
        }
    }

    public final List<Logger> b(List<? extends LoggerType> list) {
        ArrayList arrayList = new ArrayList();
        for (LoggerType loggerType : list) {
            Logger logger = f17539e.get(loggerType);
            if (logger != null) {
                arrayList.add(logger);
            } else {
                Logger.e$default(f17538d, "L", "Failed to get logger for " + loggerType.name(), null, 4, null);
            }
        }
        return arrayList;
    }

    public final Logger c(List<? extends LoggerType> list) {
        Object obj;
        ArrayList arrayList = new ArrayList(f17538d.c());
        for (Logger logger : b(list)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Logger) obj) == logger) {
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(logger);
            }
        }
        return new com.sumsub.sns.internal.log.logger.c(arrayList);
    }

    @Override // com.sumsub.log.logger.Logger
    public void d(String str, String str2, Throwable th) {
        f17538d.d(str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void e(String str, String str2, Throwable th) {
        f17538d.e(str, str2, th);
    }

    public final void f() {
        f17537c.a();
        e();
    }

    public final void flush() {
        Iterator<T> it = f17540f.values().iterator();
        while (it.hasNext()) {
            ((com.sumsub.sns.internal.log.logger.b) it.next()).flush();
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void i(String str, String str2, Throwable th) {
        f17538d.i(str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void v(String str, String str2, Throwable th) {
        f17538d.v(str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void w(String str, String str2, Throwable th) {
        f17538d.w(str, str2, th);
    }

    public final void a(boolean z10) {
        f17536b = z10;
    }

    public final void d() {
        f17537c.b();
    }

    public final void e() {
        Iterator<Map.Entry<String, com.sumsub.sns.internal.log.logger.b>> it = f17540f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clear();
        }
        f17540f.clear();
        f17539e.clear();
        f17538d.clear();
    }

    public final Logger a(LoggerType... loggerTypeArr) {
        return c(l.u(loggerTypeArr));
    }

    public final com.sumsub.sns.internal.log.logger.b a(String str) {
        ConcurrentHashMap<String, com.sumsub.sns.internal.log.logger.b> concurrentHashMap = f17540f;
        com.sumsub.sns.internal.log.logger.b bVar = concurrentHashMap.get(str);
        if (bVar != null) {
            return bVar;
        }
        com.sumsub.sns.internal.log.logger.a aVar = new com.sumsub.sns.internal.log.logger.a(str, f17538d);
        concurrentHashMap.put(str, aVar);
        return aVar;
    }

    public static /* synthetic */ void a(a aVar, LoggerType loggerType, Logger logger, boolean z10, int i, Object obj) {
        if ((i & 4) != 0) {
            z10 = false;
        }
        aVar.a(loggerType, logger, z10);
    }

    public final void a(LoggerType loggerType, Logger logger, boolean z10) {
        f17539e.put(loggerType, logger);
        if (z10) {
            f17538d.a(logger);
        }
    }
}
