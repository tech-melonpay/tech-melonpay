package com.sumsub.sns.internal.log.logger;

import android.util.Log;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.LoggerType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a implements Logger, b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0269a f17569e = new C0269a(null);

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final SimpleDateFormat f17570f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    /* renamed from: a, reason: collision with root package name */
    public final String f17571a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f17572b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f17573c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public List<? extends LoggerType> f17574d = Collections.singletonList(LoggerType.KIBANA);

    /* renamed from: com.sumsub.sns.internal.log.logger.a$a, reason: collision with other inner class name */
    public static final class C0269a {
        public /* synthetic */ C0269a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i, String str, String str2, Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.f17570f.format(new Date()).toString());
            sb2.append(' ');
            sb2.append(com.sumsub.sns.internal.log.b.a().get(Integer.valueOf(i)));
            sb2.append('/');
            sb2.append(str);
            sb2.append(": ");
            sb2.append(str2);
            if (th != null) {
                sb2.append('\n');
                sb2.append(Log.getStackTraceString(th));
            }
            return sb2.toString();
        }

        public C0269a() {
        }
    }

    public a(String str, Logger logger) {
        this.f17571a = str;
        this.f17572b = logger;
    }

    public String a() {
        return this.f17571a;
    }

    public synchronized List<LoggerType> b() {
        return this.f17574d;
    }

    @Override // com.sumsub.sns.internal.log.logger.b
    public synchronized void clear() {
        this.f17573c.clear();
    }

    @Override // com.sumsub.log.logger.Logger
    public void d(String str, String str2, Throwable th) {
        this.f17572b.d(str, str2, th);
        a(3, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void e(String str, String str2, Throwable th) {
        this.f17572b.e(str, str2, th);
        a(6, str, str2, th);
    }

    @Override // com.sumsub.sns.internal.log.logger.b
    public synchronized void flush() {
        try {
            if (this.f17573c.isEmpty()) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<T> it = this.f17573c.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append('\n');
            }
            this.f17573c.clear();
            String sb3 = sb2.toString();
            Iterator<T> it2 = com.sumsub.sns.internal.log.a.f17535a.b(b()).iterator();
            while (it2.hasNext()) {
                Logger.i$default((Logger) it2.next(), a(), sb3, null, 4, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.sumsub.log.logger.Logger
    public void i(String str, String str2, Throwable th) {
        this.f17572b.i(str, str2, th);
        a(4, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void v(String str, String str2, Throwable th) {
        this.f17572b.v(str, str2, th);
        a(2, str, str2, th);
    }

    @Override // com.sumsub.log.logger.Logger
    public void w(String str, String str2, Throwable th) {
        this.f17572b.w(str, str2, th);
        a(5, str, str2, th);
    }

    public final synchronized void a(int i, String str, String str2, Throwable th) {
        this.f17573c.add(f17569e.a(i, str, str2, th));
    }
}
