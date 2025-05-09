package g9;

import io.sentry.InterfaceC0859q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SimpleExtBuilder.java */
/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0771a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20837a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20838b;

    public C0771a() {
        this.f20838b = new ArrayList(2);
    }

    public String a(String str) {
        return (String) ((Map) this.f20838b).get(str);
    }

    public void b() {
        this.f20837a = true;
    }

    public void c() {
        this.f20837a = false;
    }

    public void d() {
        this.f20837a = false;
    }

    public void e(byte b9) {
        ((Na.a) this.f20838b).j(b9);
    }

    public void f(char c2) {
        ((Na.a) this.f20838b).i(c2);
    }

    public void g(int i) {
        ((Na.a) this.f20838b).j(i);
    }

    public void h(long j10) {
        ((Na.a) this.f20838b).j(j10);
    }

    public void i(String str) {
        ((Na.a) this.f20838b).h(str);
    }

    public void j(short s10) {
        ((Na.a) this.f20838b).j(s10);
    }

    public void k(String str) {
        ((Na.a) this.f20838b).k(str);
    }

    public void l(String str, String str2) {
        if (this.f20837a) {
            ((Map) this.f20838b).put(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(io.sentry.InterfaceC0864w r3, H9.o r4, io.sentry.SentryOptions r5, Fa.h r6) {
        /*
            r2 = this;
            io.sentry.p0 r0 = r3.j()
            H9.g r0 = r0.f22102a
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "sentry-trace_id"
            r2.l(r1, r0)
            Fa.h r0 = new Fa.h
            java.lang.String r1 = r5.getDsn()
            r0.<init>(r1)
            java.lang.String r1 = "sentry-public_key"
            java.lang.Object r0 = r0.f1300c
            java.lang.String r0 = (java.lang.String) r0
            r2.l(r1, r0)
            java.lang.String r0 = r5.getRelease()
            java.lang.String r1 = "sentry-release"
            r2.l(r1, r0)
            java.lang.String r5 = r5.getEnvironment()
            java.lang.String r0 = "sentry-environment"
            r2.l(r0, r5)
            r5 = 0
            if (r4 == 0) goto L49
            java.lang.String r0 = r4.f1658d
            if (r0 == 0) goto L3b
            goto L4a
        L3b:
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f1660f
            if (r4 == 0) goto L49
            java.lang.String r0 = "segment"
            java.lang.Object r4 = r4.get(r0)
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            goto L4a
        L49:
            r0 = r5
        L4a:
            java.lang.String r4 = "sentry-user_segment"
            r2.l(r4, r0)
            io.sentry.protocol.TransactionNameSource r4 = r3.k()
            if (r4 == 0) goto L62
            io.sentry.protocol.TransactionNameSource r0 = io.sentry.protocol.TransactionNameSource.URL
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L62
            java.lang.String r3 = r3.getName()
            goto L63
        L62:
            r3 = r5
        L63:
            java.lang.String r4 = "sentry-transaction"
            r2.l(r4, r3)
            if (r6 != 0) goto L6c
            r3 = r5
            goto L70
        L6c:
            java.lang.Object r3 = r6.f1300c
            java.lang.Double r3 = (java.lang.Double) r3
        L70:
            r4 = 0
            boolean r4 = D9.b.l0(r4, r3)
            if (r4 != 0) goto L78
            goto L89
        L78:
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.util.Locale r5 = java.util.Locale.ROOT
            java.text.DecimalFormatSymbols r5 = java.text.DecimalFormatSymbols.getInstance(r5)
            java.lang.String r6 = "#.################"
            r4.<init>(r6, r5)
            java.lang.String r5 = r4.format(r3)
        L89:
            java.lang.String r3 = "sentry-sample_rate"
            r2.l(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.C0771a.m(io.sentry.w, H9.o, io.sentry.SentryOptions, Fa.h):void");
    }

    public C0771a(Na.a aVar) {
        this.f20838b = aVar;
        this.f20837a = true;
    }

    public C0771a(InterfaceC0859q interfaceC0859q) {
        this.f20838b = new HashMap();
        this.f20837a = true;
    }

    public void n() {
    }

    public void o() {
    }
}
