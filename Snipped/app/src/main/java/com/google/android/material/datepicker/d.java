package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* loaded from: classes.dex */
public final class d {
    public static x0.b<String, String> a(Long l10, Long l11) {
        x0.b<String, String> bVar;
        if (l10 == null && l11 == null) {
            return new x0.b<>(null, null);
        }
        if (l10 == null) {
            bVar = new x0.b<>(null, b(l11.longValue()));
        } else {
            if (l11 != null) {
                Calendar f10 = y.f();
                Calendar g10 = y.g(null);
                g10.setTimeInMillis(l10.longValue());
                Calendar g11 = y.g(null);
                g11.setTimeInMillis(l11.longValue());
                return g10.get(1) == g11.get(1) ? g10.get(1) == f10.get(1) ? new x0.b<>(c(l10.longValue(), Locale.getDefault()), c(l11.longValue(), Locale.getDefault())) : new x0.b<>(c(l10.longValue(), Locale.getDefault()), d(l11.longValue(), Locale.getDefault())) : new x0.b<>(d(l10.longValue(), Locale.getDefault()), d(l11.longValue(), Locale.getDefault()));
            }
            bVar = new x0.b<>(b(l10.longValue()), null);
        }
        return bVar;
    }

    public static String b(long j10) {
        Calendar f10 = y.f();
        Calendar g10 = y.g(null);
        g10.setTimeInMillis(j10);
        return f10.get(1) == g10.get(1) ? c(j10, Locale.getDefault()) : d(j10, Locale.getDefault());
    }

    public static String c(long j10, Locale locale) {
        return y.b("MMMd", locale).format(new Date(j10));
    }

    public static String d(long j10, Locale locale) {
        return y.b("yMMMd", locale).format(new Date(j10));
    }
}
