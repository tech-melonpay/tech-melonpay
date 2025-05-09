package com.sumsub.sentry;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13611a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f13612b;

    /* renamed from: c, reason: collision with root package name */
    public static final SimpleDateFormat f13613c;

    /* renamed from: e, reason: collision with root package name */
    public static final Date f13614e;

    static {
        e eVar = new e();
        f13611a = eVar;
        ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>();
        f13612b = threadLocal;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            threadLocal.set(simpleDateFormat);
        }
        f13613c = simpleDateFormat;
        f13614e = a(eVar, null, 1, null);
    }

    public final Date a() {
        return f13614e;
    }

    public static /* synthetic */ Date a(e eVar, Long l10, int i, Object obj) {
        if ((i & 1) != 0) {
            l10 = null;
        }
        return eVar.a(l10);
    }

    public final Date a(Long l10) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        if (l10 != null) {
            calendar.getTimeInMillis();
        }
        return calendar.getTime();
    }

    public final String a(Date date) {
        return f13613c.format(date);
    }
}
