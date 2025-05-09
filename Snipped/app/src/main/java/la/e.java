package la;

import P9.w;
import ha.C0805d;
import ha.C0806e;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ka.C0969n;
import ka.C0970o;
import kotlin.time.DurationUnit;
import la.c;

/* compiled from: Duration.kt */
/* loaded from: classes2.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: la.e.a(java.lang.String, boolean):long");
    }

    public static final long b(long j10) {
        long j11 = (j10 << 1) + 1;
        c.a aVar = c.f23587b;
        int i = d.f23591a;
        return j11;
    }

    public static final long c(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? b(ha.h.T(j10)) : d(j10 * 1000000);
    }

    public static final long d(long j10) {
        long j11 = j10 << 1;
        c.a aVar = c.f23587b;
        int i = d.f23591a;
        return j11;
    }

    public static final long e(String str) {
        int length = str.length();
        int i = (length <= 0 || !C0969n.Z("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            Iterable c0806e = new C0806e(i, C0969n.c0(str), 1);
            if (!(c0806e instanceof Collection) || !((Collection) c0806e).isEmpty()) {
                Iterator<Integer> it = c0806e.iterator();
                while (((C0805d) it).f21231c) {
                    char charAt = str.charAt(((w) it).a());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (str.startsWith("+")) {
            str = C0970o.w0(1, str);
        }
        return Long.parseLong(str);
    }

    public static final long f(double d10, DurationUnit durationUnit) {
        TimeUnit timeUnit = DurationUnit.NANOSECONDS.f23215a;
        TimeUnit timeUnit2 = durationUnit.f23215a;
        long convert = timeUnit.convert(1L, timeUnit2);
        double convert2 = convert > 0 ? convert * d10 : d10 / timeUnit2.convert(1L, timeUnit);
        if (!(!Double.isNaN(convert2))) {
            throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        if (Double.isNaN(convert2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long round = Math.round(convert2);
        if (-4611686018426999999L <= round && round < 4611686018427000000L) {
            return d(round);
        }
        long convert3 = DurationUnit.MILLISECONDS.f23215a.convert(1L, timeUnit2);
        double convert4 = convert3 > 0 ? d10 * convert3 : d10 / timeUnit2.convert(1L, r0);
        if (Double.isNaN(convert4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return c(Math.round(convert4));
    }

    public static final long g(long j10, DurationUnit durationUnit) {
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long convert = durationUnit.f23215a.convert(4611686018426999999L, durationUnit2.f23215a);
        long j11 = -convert;
        TimeUnit timeUnit = durationUnit.f23215a;
        return (j11 > j10 || j10 > convert) ? b(ha.h.T(DurationUnit.MILLISECONDS.f23215a.convert(j10, timeUnit))) : d(durationUnit2.f23215a.convert(j10, timeUnit));
    }
}
