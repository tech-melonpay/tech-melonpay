package io.sentry;

import C9.b;
import G9.a;
import G9.b;
import H9.a;
import H9.b;
import H9.c;
import H9.d;
import H9.e;
import H9.f;
import H9.h;
import H9.i;
import H9.j;
import H9.k;
import H9.l;
import H9.m;
import H9.o;
import com.bumptech.glide.load.Key;
import io.sentry.C0844b;
import io.sentry.S;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.Session;
import io.sentry.SpanStatus;
import io.sentry.T;
import io.sentry.c0;
import io.sentry.h0;
import io.sentry.i0;
import io.sentry.p0;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.Device;
import io.sentry.protocol.a;
import io.sentry.protocol.b;
import io.sentry.protocol.c;
import io.sentry.protocol.d;
import io.sentry.protocol.e;
import io.sentry.protocol.g;
import io.sentry.protocol.h;
import io.sentry.q0;
import io.sentry.x0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: JsonSerializer.java */
/* loaded from: classes2.dex */
public final class G implements InterfaceC0862u {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f21817c = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f21818a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21819b;

    public G(SentryOptions sentryOptions) {
        this.f21818a = sentryOptions;
        HashMap hashMap = new HashMap();
        this.f21819b = hashMap;
        hashMap.put(io.sentry.protocol.a.class, new a.C0412a());
        hashMap.put(C0844b.class, new C0844b.a());
        hashMap.put(io.sentry.protocol.b.class, new b.a());
        hashMap.put(Contexts.class, new Contexts.a());
        hashMap.put(DebugImage.class, new DebugImage.a());
        hashMap.put(io.sentry.protocol.c.class, new c.a());
        hashMap.put(Device.class, new Device.a());
        hashMap.put(Device.DeviceOrientation.class, new Device.DeviceOrientation.a());
        hashMap.put(io.sentry.protocol.d.class, new d.a());
        hashMap.put(H9.a.class, new a.C0021a());
        hashMap.put(H9.b.class, new b.a());
        hashMap.put(H9.c.class, new c.a());
        hashMap.put(io.sentry.protocol.e.class, new e.a());
        hashMap.put(S.class, new S.a());
        hashMap.put(T.class, new T.a());
        hashMap.put(G9.a.class, new a.C0017a());
        hashMap.put(G9.b.class, new b.a());
        hashMap.put(H9.d.class, new d.a());
        hashMap.put(io.sentry.protocol.g.class, new g.a());
        hashMap.put(H9.e.class, new e.a());
        hashMap.put(c0.class, new c0.a());
        hashMap.put(h0.class, new h0.a());
        hashMap.put(i0.class, new i0.a());
        hashMap.put(H9.f.class, new f.a());
        hashMap.put(SentryItemType.class, new SentryItemType.a());
        hashMap.put(SentryLevel.class, new SentryLevel.a());
        hashMap.put(H9.h.class, new h.a());
        hashMap.put(io.sentry.protocol.h.class, new h.a());
        hashMap.put(H9.i.class, new i.a());
        hashMap.put(H9.j.class, new j.a());
        hashMap.put(H9.k.class, new k.a());
        hashMap.put(H9.l.class, new l.a());
        hashMap.put(H9.m.class, new m.a());
        hashMap.put(Session.class, new Session.a());
        hashMap.put(p0.class, new p0.a());
        hashMap.put(q0.class, new q0.a());
        hashMap.put(SpanStatus.class, new SpanStatus.a());
        hashMap.put(H9.o.class, new o.a());
        hashMap.put(x0.class, new x0.a());
        hashMap.put(C9.b.class, new b.a());
    }

    @Override // io.sentry.InterfaceC0862u
    public final <T> T a(Reader reader, Class<T> cls) {
        SentryOptions sentryOptions = this.f21818a;
        try {
            D d10 = new D(reader);
            A a10 = (A) this.f21819b.get(cls);
            if (a10 != null) {
                return cls.cast(a10.a(d10, sentryOptions.getLogger()));
            }
            return null;
        } catch (Exception e10) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC0862u
    public final B1.f b(BufferedInputStream bufferedInputStream) {
        SentryOptions sentryOptions = this.f21818a;
        try {
            return sentryOptions.getEnvelopeReader().l(bufferedInputStream);
        } catch (IOException e10) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    public final String c(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        SentryOptions sentryOptions = this.f21818a;
        E e10 = new E(stringWriter, sentryOptions.getMaxDepth());
        if (z10) {
            e10.f2733d = "\t";
            e10.f2734e = ": ";
        }
        e10.Q(sentryOptions.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC0862u
    public final String e(Map<String, Object> map) {
        return c(map, false);
    }

    @Override // io.sentry.InterfaceC0862u
    public final void k(B1.f fVar, OutputStream outputStream) {
        SentryOptions sentryOptions = this.f21818a;
        D9.b.t0(fVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f21817c));
        try {
            ((c0) fVar.f229b).serialize(new E(bufferedWriter, sentryOptions.getMaxDepth()), sentryOptions.getLogger());
            bufferedWriter.write("\n");
            for (g0 g0Var : (Iterable) fVar.f230c) {
                try {
                    byte[] e10 = g0Var.e();
                    g0Var.f22004a.serialize(new E(bufferedWriter, sentryOptions.getMaxDepth()), sentryOptions.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(e10);
                    bufferedWriter.write("\n");
                } catch (Exception e11) {
                    sentryOptions.getLogger().f(SentryLevel.ERROR, "Failed to create envelope item. Dropping it.", e11);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC0862u
    public final void m(Object obj, BufferedWriter bufferedWriter) {
        D9.b.t0(obj, "The entity is required.");
        SentryOptions sentryOptions = this.f21818a;
        InterfaceC0859q logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (logger.j(sentryLevel)) {
            sentryOptions.getLogger().h(sentryLevel, "Serializing object: %s", c(obj, true));
        }
        new E(bufferedWriter, sentryOptions.getMaxDepth()).Q(sentryOptions.getLogger(), obj);
        bufferedWriter.flush();
    }
}
