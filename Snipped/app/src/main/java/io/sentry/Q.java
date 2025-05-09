package io.sentry;

import com.bumptech.glide.load.Key;
import java.io.File;
import java.nio.charset.Charset;

/* compiled from: OutboxSender.java */
/* loaded from: classes2.dex */
public final class Q extends AbstractC0846d implements InterfaceC0857o {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f21835g = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0858p f21836c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0856n f21837d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0862u f21838e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0859q f21839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(InterfaceC0856n interfaceC0856n, InterfaceC0862u interfaceC0862u, InterfaceC0859q interfaceC0859q, long j10) {
        super(j10, interfaceC0859q);
        C0855m c0855m = C0855m.f22069a;
        this.f21836c = c0855m;
        D9.b.t0(interfaceC0856n, "Envelope reader is required.");
        this.f21837d = interfaceC0856n;
        D9.b.t0(interfaceC0862u, "Serializer is required.");
        this.f21838e = interfaceC0862u;
        D9.b.t0(interfaceC0859q, "Logger is required.");
        this.f21839f = interfaceC0859q;
    }

    public static /* synthetic */ void d(Q q10, File file, E9.f fVar) {
        InterfaceC0859q interfaceC0859q = q10.f21839f;
        if (fVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            interfaceC0859q.h(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            interfaceC0859q.d(SentryLevel.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.InterfaceC0857o
    public final void a(String str, C0852j c0852j) {
        D9.b.t0(str, "Path is required.");
        c(new File(str), c0852j);
    }

    @Override // io.sentry.AbstractC0846d
    public final boolean b(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("startup_crash")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r9 != null) goto L17;
     */
    @Override // io.sentry.AbstractC0846d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.io.File r8, io.sentry.C0852j r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sentry:typeCheckHint"
            java.util.HashMap r1 = r9.f22047a
            java.lang.Class<E9.f> r2 = E9.f.class
            java.lang.String r3 = r8.getName()
            boolean r3 = r7.b(r3)
            io.sentry.q r4 = r7.f21839f
            if (r3 != 0) goto L22
            io.sentry.SentryLevel r9 = io.sentry.SentryLevel.DEBUG
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "File '%s' should be ignored."
            r4.h(r9, r0, r8)
            return
        L22:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            io.sentry.n r5 = r7.f21837d     // Catch: java.lang.Throwable -> L44
            B1.f r5 = r5.l(r3)     // Catch: java.lang.Throwable -> L44
            if (r5 != 0) goto L46
            io.sentry.SentryLevel r9 = io.sentry.SentryLevel.ERROR     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "Stream from path %s resulted in a null envelope."
            java.lang.String r6 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L44
            r4.h(r9, r5, r6)     // Catch: java.lang.Throwable -> L44
            goto L58
        L44:
            r9 = move-exception
            goto L79
        L46:
            r7.f(r5, r9)     // Catch: java.lang.Throwable -> L44
            io.sentry.SentryLevel r9 = io.sentry.SentryLevel.DEBUG     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "File '%s' is done."
            java.lang.String r6 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L44
            r4.h(r9, r5, r6)     // Catch: java.lang.Throwable -> L44
        L58:
            r3.close()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            java.lang.Object r9 = r1.get(r0)
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r2.isInstance(r0)
            if (r0 == 0) goto L71
            if (r9 == 0) goto L71
        L6b:
            E9.f r9 = (E9.f) r9
            d(r7, r8, r9)
            goto L9a
        L71:
            D9.b.o0(r2, r9, r4)
            goto L9a
        L75:
            r9 = move-exception
            goto L9b
        L77:
            r9 = move-exception
            goto L82
        L79:
            r3.close()     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r3 = move-exception
            r9.addSuppressed(r3)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
        L81:
            throw r9     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
        L82:
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.ERROR     // Catch: java.lang.Throwable -> L75
            java.lang.String r5 = "Error processing envelope."
            r4.f(r3, r5, r9)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r9 = r1.get(r0)
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r2.isInstance(r0)
            if (r0 == 0) goto L71
            if (r9 == 0) goto L71
            goto L6b
        L9a:
            return
        L9b:
            java.lang.Object r3 = r1.get(r0)
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r2.isInstance(r0)
            if (r0 == 0) goto Lb1
            if (r3 == 0) goto Lb1
            E9.f r3 = (E9.f) r3
            d(r7, r8, r3)
            goto Lb4
        Lb1:
            D9.b.o0(r2, r3, r4)
        Lb4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Q.c(java.io.File, io.sentry.j):void");
    }

    public final Fa.h e(s0 s0Var) {
        String str;
        InterfaceC0859q interfaceC0859q = this.f21839f;
        if (s0Var != null && (str = s0Var.f22199h) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(str));
                if (D9.b.l0(false, valueOf)) {
                    return new Fa.h(valueOf);
                }
                interfaceC0859q.h(SentryLevel.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                interfaceC0859q.h(SentryLevel.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new Fa.h((Double) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0249 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(B1.f r20, io.sentry.C0852j r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Q.f(B1.f, io.sentry.j):void");
    }

    public final boolean g(C0852j c0852j) {
        Object obj = c0852j.f22047a.get("sentry:typeCheckHint");
        if (obj instanceof E9.d) {
            return ((E9.d) obj).d();
        }
        D9.b.o0(E9.d.class, obj, this.f21839f);
        return true;
    }
}
