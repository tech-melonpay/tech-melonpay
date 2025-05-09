package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: NoOpEnvelopeReader.java */
/* loaded from: classes2.dex */
public final class I implements InterfaceC0856n, InterfaceC0862u, InterfaceC0865x, InterfaceC0866y, InterfaceC0859q {

    /* renamed from: a, reason: collision with root package name */
    public static final I f21824a = new I();

    /* renamed from: b, reason: collision with root package name */
    public static final I f21825b = new I();

    /* renamed from: c, reason: collision with root package name */
    public static final I f21826c = new I();

    public static Date n() {
        return Calendar.getInstance(L9.a.f2499a).getTime();
    }

    public static Date o(String str) {
        try {
            return L9.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(s3.b.j("timestamp is not ISO format ", str));
        }
    }

    public static Date p(String str) {
        try {
            long longValue = new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue();
            Calendar calendar = Calendar.getInstance(L9.a.f2499a);
            calendar.setTimeInMillis(longValue);
            return calendar.getTime();
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(s3.b.j("timestamp is not millis format ", str));
        }
    }

    public static String q(Date date) {
        TimeZone timeZone = L9.a.f2499a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = L9.a.f2499a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(23 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        L9.a.b(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        L9.a.b(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        L9.a.b(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        L9.a.b(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        L9.a.b(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        L9.a.b(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        L9.a.b(sb2, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            L9.a.b(sb2, abs, 2);
            sb2.append(':');
            L9.a.b(sb2, abs2, 2);
        } else {
            sb2.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb2.toString();
    }

    @Override // io.sentry.InterfaceC0862u
    public Object a(Reader reader, Class cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC0862u
    public B1.f b(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC0866y
    public I9.f c(B1.f fVar, SentryOptions sentryOptions) {
        return new I9.b(sentryOptions, new I9.k(sentryOptions), sentryOptions.getTransportGate(), fVar);
    }

    @Override // io.sentry.InterfaceC0859q
    public void d(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (th == null) {
            h(sentryLevel, str, objArr);
            return;
        }
        PrintStream printStream = System.out;
        String format = String.format(str, objArr);
        String th2 = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(sentryLevel + ": " + format + " \n " + th2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC0862u
    public String e(Map map) {
        return "";
    }

    @Override // io.sentry.InterfaceC0859q
    public void f(SentryLevel sentryLevel, String str, Throwable th) {
        if (th == null) {
            h(sentryLevel, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String format = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(sentryLevel + ": " + format + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC0859q
    public void h(SentryLevel sentryLevel, String str, Object... objArr) {
        System.out.println(sentryLevel + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.InterfaceC0859q
    public boolean j(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.InterfaceC0856n
    public B1.f l(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC0865x
    public void g(m0 m0Var) {
    }

    @Override // io.sentry.InterfaceC0865x
    public void i(InterfaceC0864w interfaceC0864w) {
    }

    @Override // io.sentry.InterfaceC0862u
    public void k(B1.f fVar, OutputStream outputStream) {
    }

    @Override // io.sentry.InterfaceC0862u
    public void m(Object obj, BufferedWriter bufferedWriter) {
    }
}
