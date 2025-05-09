package com.sumsub.sns.internal.core.common;

import android.os.SystemClock;
import ca.InterfaceC0635a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Long> f15060a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f15061b = true;

    public final long a(InterfaceC0635a<O9.p> interfaceC0635a) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC0635a.invoke();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        this.f15060a.add(Long.valueOf(elapsedRealtime2));
        this.f15061b = false;
        return elapsedRealtime2;
    }

    public final void b() {
        if (this.f15061b) {
            return;
        }
        P9.q.C(this.f15060a);
        this.f15061b = true;
    }

    public final long c() {
        return a(50.0d);
    }

    public final long d() {
        return a(100.0d);
    }

    public final long e() {
        return a(99.0d);
    }

    public final void f() {
        this.f15060a.clear();
        this.f15061b = true;
    }

    public final Object a() {
        Iterator<T> it = this.f15060a.iterator();
        double d10 = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            d10 += ((Number) it.next()).longValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        Double valueOf = Double.valueOf(i == 0 ? Double.NaN : d10 / i);
        if (!(!Double.isNaN(r0))) {
            valueOf = null;
        }
        if (valueOf == null) {
            return -1;
        }
        return valueOf;
    }

    public final long a(double d10) {
        b();
        int B10 = U4.b.B((d10 / 100.0d) * (this.f15060a.size() - 1));
        ArrayList<Long> arrayList = this.f15060a;
        return ((B10 < 0 || B10 > P9.m.p(arrayList)) ? -1L : arrayList.get(B10)).longValue();
    }
}
