package io.sentry;

import io.sentry.clientreport.DiscardReason;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.g0;
import io.sentry.protocol.Contexts;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: SentryClient.java */
/* loaded from: classes2.dex */
public final class a0 implements InterfaceC0860s {

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f21934a;

    /* renamed from: b, reason: collision with root package name */
    public final I9.f f21935b;

    /* renamed from: c, reason: collision with root package name */
    public final SecureRandom f21936c;

    /* renamed from: d, reason: collision with root package name */
    public final a f21937d = new a();

    /* compiled from: SentryClient.java */
    public static final class a implements Comparator<C0844b> {
        @Override // java.util.Comparator
        public final int compare(C0844b c0844b, C0844b c0844b2) {
            return ((Date) c0844b.f21962a.clone()).compareTo((Date) c0844b2.f21962a.clone());
        }
    }

    public a0(SentryOptions sentryOptions) {
        this.f21934a = sentryOptions;
        InterfaceC0866y transportFactory = sentryOptions.getTransportFactory();
        if (transportFactory instanceof O) {
            transportFactory = new I();
            sentryOptions.setTransportFactory(transportFactory);
        }
        Fa.h hVar = new Fa.h(sentryOptions.getDsn());
        StringBuilder sb2 = new StringBuilder();
        URI uri = (URI) hVar.f1301d;
        sb2.append(uri.getPath());
        sb2.append("/envelope/");
        String uri2 = uri.resolve(sb2.toString()).toString();
        StringBuilder sb3 = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb3.append(sentryOptions.getSentryClientName());
        sb3.append(",sentry_key=");
        sb3.append((String) hVar.f1300c);
        String str = (String) hVar.f1299b;
        sb3.append((str == null || str.length() <= 0) ? "" : ",sentry_secret=".concat(str));
        String sb4 = sb3.toString();
        String sentryClientName = sentryOptions.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put("X-Sentry-Auth", sb4);
        this.f21935b = transportFactory.c(new B1.f(uri2, hashMap), sentryOptions);
        this.f21936c = sentryOptions.getSampleRate() == null ? null : new SecureRandom();
    }

    public static ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0843a c0843a = (C0843a) it.next();
            if (c0843a.f21933d) {
                arrayList2.add(c0843a);
            }
        }
        return arrayList2;
    }

    @Override // io.sentry.InterfaceC0860s
    public final void a(long j10) {
        this.f21935b.a(j10);
    }

    @Override // io.sentry.InterfaceC0860s
    public final void b(Session session, C0852j c0852j) {
        D9.b.t0(session, "Session is required.");
        SentryOptions sentryOptions = this.f21934a;
        String str = session.f21882m;
        if (str == null || str.isEmpty()) {
            sentryOptions.getLogger().h(SentryLevel.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC0862u serializer = sentryOptions.getSerializer();
            H9.e sdkVersion = sentryOptions.getSdkVersion();
            D9.b.t0(serializer, "Serializer is required.");
            c(new B1.f((H9.g) null, sdkVersion, g0.c(serializer, session)), c0852j);
        } catch (IOException e10) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Failed to capture session.", e10);
        }
    }

    @Override // io.sentry.InterfaceC0860s
    public final H9.g c(B1.f fVar, C0852j c0852j) {
        try {
            this.f21935b.m(fVar, c0852j);
            H9.g gVar = ((c0) fVar.f229b).f21973a;
            return gVar != null ? gVar : H9.g.f1604b;
        } catch (IOException e10) {
            this.f21934a.getLogger().f(SentryLevel.ERROR, "Failed to capture envelope.", e10);
            return H9.g.f1604b;
        }
    }

    @Override // io.sentry.InterfaceC0860s
    public final void close() {
        SentryOptions sentryOptions = this.f21934a;
        sentryOptions.getLogger().h(SentryLevel.INFO, "Closing SentryClient.", new Object[0]);
        try {
            a(sentryOptions.getShutdownTimeoutMillis());
            this.f21935b.close();
        } catch (IOException e10) {
            sentryOptions.getLogger().f(SentryLevel.WARNING, "Failed to close the connection to the Sentry Server.", e10);
        }
        for (InterfaceC0850h interfaceC0850h : sentryOptions.getEventProcessors()) {
            if (interfaceC0850h instanceof Closeable) {
                try {
                    ((Closeable) interfaceC0850h).close();
                } catch (IOException e11) {
                    sentryOptions.getLogger().h(SentryLevel.WARNING, "Failed to close the event processor {}.", interfaceC0850h, e11);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0179, code lost:
    
        if (r4.f21877g != r7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018a, code lost:
    
        if (r4.f21873c.get() <= 0) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bb A[Catch: SentryEnvelopeException -> 0x01b4, IOException -> 0x01b6, TryCatch #4 {SentryEnvelopeException -> 0x01b4, IOException -> 0x01b6, blocks: (B:110:0x01ab, B:112:0x01af, B:94:0x01bb, B:96:0x01c6, B:97:0x01c9, B:99:0x01cf), top: B:109:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cf A[Catch: SentryEnvelopeException -> 0x01b4, IOException -> 0x01b6, TRY_LEAVE, TryCatch #4 {SentryEnvelopeException -> 0x01b4, IOException -> 0x01b6, blocks: (B:110:0x01ab, B:112:0x01af, B:94:0x01bb, B:96:0x01c6, B:97:0x01c9, B:99:0x01cf), top: B:109:0x01ab }] */
    @Override // io.sentry.InterfaceC0860s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final H9.g d(io.sentry.i0 r10, io.sentry.U r11, io.sentry.C0852j r12) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.a0.d(io.sentry.i0, io.sentry.U, io.sentry.j):H9.g");
    }

    @Override // io.sentry.InterfaceC0860s
    public final H9.g e(H9.m mVar, s0 s0Var, U u6, C0852j c0852j) {
        if (c0852j == null) {
            c0852j = new C0852j();
        }
        boolean k3 = k(mVar, c0852j);
        ArrayList arrayList = c0852j.f22048b;
        if (k3 && u6 != null) {
            arrayList.addAll(new CopyOnWriteArrayList(u6.f21909p));
        }
        SentryOptions sentryOptions = this.f21934a;
        InterfaceC0859q logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.h(sentryLevel, "Capturing transaction: %s", mVar.f21917a);
        H9.g gVar = H9.g.f1604b;
        H9.g gVar2 = mVar.f21917a;
        if (gVar2 == null) {
            gVar2 = gVar;
        }
        if (k(mVar, c0852j)) {
            f(mVar, u6);
            if (u6 != null) {
                mVar = j(mVar, c0852j, u6.f21903j);
            }
            if (mVar == null) {
                sentryOptions.getLogger().h(sentryLevel, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (mVar != null) {
            mVar = j(mVar, c0852j, sentryOptions.getEventProcessors());
        }
        if (mVar == null) {
            sentryOptions.getLogger().h(sentryLevel, "Transaction was dropped by Event processors.", new Object[0]);
            return gVar;
        }
        try {
            ArrayList arrayList2 = new ArrayList(arrayList);
            C0843a c0843a = c0852j.f22049c;
            if (c0843a != null) {
                arrayList2.add(c0843a);
            }
            B1.f g10 = g(mVar, h(arrayList2), null, s0Var);
            if (g10 == null) {
                return gVar;
            }
            this.f21935b.m(g10, c0852j);
            return gVar2;
        } catch (SentryEnvelopeException | IOException e10) {
            sentryOptions.getLogger().d(SentryLevel.WARNING, e10, "Capturing transaction %s failed.", gVar2);
            return H9.g.f1604b;
        }
    }

    public final void f(Z z10, U u6) {
        if (u6 != null) {
            if (z10.f21920d == null) {
                z10.f21920d = u6.f21899e;
            }
            if (z10.i == null) {
                z10.i = u6.f21898d;
            }
            Map<String, String> map = z10.f21921e;
            ConcurrentHashMap concurrentHashMap = u6.f21902h;
            if (map == null) {
                z10.f21921e = new HashMap(new HashMap(J9.a.a(concurrentHashMap)));
            } else {
                for (Map.Entry entry : J9.a.a(concurrentHashMap).entrySet()) {
                    if (!z10.f21921e.containsKey(entry.getKey())) {
                        z10.f21921e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List<C0844b> list = z10.f21928m;
            Collection<? extends C0844b> collection = u6.f21901g;
            if (list == null) {
                z10.f21928m = new ArrayList(new ArrayList(collection));
            } else if (!((SynchronizedCollection) collection).isEmpty()) {
                list.addAll(collection);
                Collections.sort(list, this.f21937d);
            }
            Map<String, Object> map2 = z10.f21929n;
            ConcurrentHashMap concurrentHashMap2 = u6.i;
            if (map2 == null) {
                z10.f21929n = new HashMap(new HashMap(concurrentHashMap2));
            } else {
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    if (!z10.f21929n.containsKey(entry2.getKey())) {
                        z10.f21929n.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            for (Map.Entry<String, Object> entry3 : new Contexts(u6.f21908o).entrySet()) {
                String key = entry3.getKey();
                Contexts contexts = z10.f21918b;
                if (!contexts.containsKey(key)) {
                    contexts.put(entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    public final B1.f g(Z z10, ArrayList arrayList, Session session, s0 s0Var) {
        H9.g gVar;
        ArrayList arrayList2 = new ArrayList();
        SentryOptions sentryOptions = this.f21934a;
        if (z10 != null) {
            InterfaceC0862u serializer = sentryOptions.getSerializer();
            Charset charset = g0.f22003d;
            D9.b.t0(serializer, "ISerializer is required.");
            g0.a aVar = new g0.a(new com.google.firebase.heartbeatinfo.d(5, serializer, z10));
            arrayList2.add(new g0(new h0(SentryItemType.resolve(z10), new e0(aVar, 0), "application/json", (String) null, (String) null), new e0(aVar, 1)));
            gVar = z10.f21917a;
        } else {
            gVar = null;
        }
        if (session != null) {
            arrayList2.add(g0.c(sentryOptions.getSerializer(), session));
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final C0843a c0843a = (C0843a) it.next();
                final long maxAttachmentSize = sentryOptions.getMaxAttachmentSize();
                Charset charset2 = g0.f22003d;
                g0.a aVar2 = new g0.a(new Callable() { // from class: io.sentry.d0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C0843a c0843a2 = C0843a.this;
                        byte[] bArr = c0843a2.f21930a;
                        String str = c0843a2.f21931b;
                        if (bArr == null) {
                            throw new SentryEnvelopeException(androidx.camera.core.n.a("Couldn't attach the attachment ", str, ".\nPlease check that either bytes or a path is set."));
                        }
                        long length = bArr.length;
                        long j10 = maxAttachmentSize;
                        if (length <= j10) {
                            return bArr;
                        }
                        throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Integer.valueOf(c0843a2.f21930a.length), Long.valueOf(j10)));
                    }
                });
                arrayList2.add(new g0(new h0(SentryItemType.Attachment, new e0(aVar2, 4), c0843a.f21932c, c0843a.f21931b, "event.attachment"), new e0(aVar2, 5)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new B1.f(new c0(gVar, sentryOptions.getSdkVersion(), s0Var), arrayList2);
    }

    public final i0 i(i0 i0Var, C0852j c0852j, List<InterfaceC0850h> list) {
        SentryOptions sentryOptions = this.f21934a;
        Iterator<InterfaceC0850h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC0850h next = it.next();
            try {
                i0Var = next.d(i0Var, c0852j);
            } catch (Throwable th) {
                sentryOptions.getLogger().d(SentryLevel.ERROR, th, "An exception occurred while processing event by processor: %s", next.getClass().getName());
            }
            if (i0Var == null) {
                sentryOptions.getLogger().h(SentryLevel.DEBUG, "Event was dropped by a processor: %s", next.getClass().getName());
                sentryOptions.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Error);
                break;
            }
        }
        return i0Var;
    }

    public final H9.m j(H9.m mVar, C0852j c0852j, List<InterfaceC0850h> list) {
        SentryOptions sentryOptions = this.f21934a;
        Iterator<InterfaceC0850h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC0850h next = it.next();
            try {
                mVar = next.i(mVar, c0852j);
            } catch (Throwable th) {
                sentryOptions.getLogger().d(SentryLevel.ERROR, th, "An exception occurred while processing transaction by processor: %s", next.getClass().getName());
            }
            if (mVar == null) {
                sentryOptions.getLogger().h(SentryLevel.DEBUG, "Transaction was dropped by a processor: %s", next.getClass().getName());
                sentryOptions.getClientReportRecorder().a(DiscardReason.EVENT_PROCESSOR, DataCategory.Transaction);
                break;
            }
        }
        return mVar;
    }

    public final boolean k(Z z10, C0852j c0852j) {
        if (J9.b.d(c0852j)) {
            return true;
        }
        this.f21934a.getLogger().h(SentryLevel.DEBUG, "Event was cached so not applying scope: %s", z10.f21917a);
        return false;
    }
}
