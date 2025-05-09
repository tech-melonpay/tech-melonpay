package io.sentry;

import java.io.File;

/* compiled from: EnvelopeSender.java */
/* renamed from: io.sentry.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0849g extends AbstractC0846d implements InterfaceC0857o {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0858p f22000c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0862u f22001d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0859q f22002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0849g(InterfaceC0862u interfaceC0862u, InterfaceC0859q interfaceC0859q, long j10) {
        super(j10, interfaceC0859q);
        C0855m c0855m = C0855m.f22069a;
        this.f22000c = c0855m;
        D9.b.t0(interfaceC0862u, "Serializer is required.");
        this.f22001d = interfaceC0862u;
        D9.b.t0(interfaceC0859q, "Logger is required.");
        this.f22002e = interfaceC0859q;
    }

    public static void d(C0849g c0849g, File file, E9.f fVar) {
        c0849g.getClass();
        boolean a10 = fVar.a();
        InterfaceC0859q interfaceC0859q = c0849g.f22002e;
        if (a10) {
            interfaceC0859q.h(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                interfaceC0859q.h(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            interfaceC0859q.d(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        interfaceC0859q.h(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.InterfaceC0857o
    public final void a(String str, C0852j c0852j) {
        D9.b.t0(str, "Path is required.");
        c(new File(str), c0852j);
    }

    @Override // io.sentry.AbstractC0846d
    public final boolean b(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0160, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015c, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013b, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0119, code lost:
    
        if (r10 != null) goto L33;
     */
    @Override // io.sentry.AbstractC0846d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.io.File r9, io.sentry.C0852j r10) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C0849g.c(java.io.File, io.sentry.j):void");
    }
}
