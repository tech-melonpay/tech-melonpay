package u9;

import io.sentry.InterfaceC0859q;
import io.sentry.InterfaceC0867z;
import io.sentry.Q;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.Closeable;

/* compiled from: EnvelopeFileObserverIntegration.java */
/* loaded from: classes2.dex */
public abstract class s implements InterfaceC0867z, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public r f30467a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0859q f30468b;

    /* compiled from: EnvelopeFileObserverIntegration.java */
    public static final class a extends s {
    }

    public static a i() {
        return new a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f30467a;
        if (rVar != null) {
            rVar.stopWatching();
            InterfaceC0859q interfaceC0859q = this.f30468b;
            if (interfaceC0859q != null) {
                interfaceC0859q.h(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC0867z
    public final void d(SentryOptions sentryOptions) {
        this.f30468b = sentryOptions.getLogger();
        String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath == null) {
            this.f30468b.h(SentryLevel.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        InterfaceC0859q interfaceC0859q = this.f30468b;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        interfaceC0859q.h(sentryLevel, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        r rVar = new r(outboxPath, new Q(sentryOptions.getEnvelopeReader(), sentryOptions.getSerializer(), this.f30468b, sentryOptions.getFlushTimeoutMillis()), this.f30468b, sentryOptions.getFlushTimeoutMillis());
        this.f30467a = rVar;
        try {
            rVar.startWatching();
            this.f30468b.h(sentryLevel, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }
}
