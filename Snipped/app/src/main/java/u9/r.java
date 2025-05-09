package u9;

import android.os.FileObserver;
import io.sentry.C0852j;
import io.sentry.InterfaceC0857o;
import io.sentry.InterfaceC0859q;
import io.sentry.Q;
import io.sentry.SentryLevel;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: EnvelopeFileObserver.java */
/* loaded from: classes2.dex */
public final class r extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final String f30458a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0857o f30459b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0859q f30460c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30461d;

    /* compiled from: EnvelopeFileObserver.java */
    public static final class a implements E9.b, E9.f, E9.i, E9.d, E9.a, E9.e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f30462a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f30463b;

        /* renamed from: c, reason: collision with root package name */
        public CountDownLatch f30464c;

        /* renamed from: d, reason: collision with root package name */
        public final long f30465d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC0859q f30466e;

        public a(long j10, InterfaceC0859q interfaceC0859q) {
            reset();
            this.f30465d = j10;
            D9.b.t0(interfaceC0859q, "ILogger is required.");
            this.f30466e = interfaceC0859q;
        }

        @Override // E9.f
        public final boolean a() {
            return this.f30462a;
        }

        @Override // E9.i
        public final void b(boolean z10) {
            this.f30463b = z10;
            this.f30464c.countDown();
        }

        @Override // E9.f
        public final void c(boolean z10) {
            this.f30462a = z10;
        }

        @Override // E9.d
        public final boolean d() {
            try {
                return this.f30464c.await(this.f30465d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f30466e.f(SentryLevel.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // E9.i
        public final boolean e() {
            return this.f30463b;
        }

        @Override // E9.e
        public final void reset() {
            this.f30464c = new CountDownLatch(1);
            this.f30462a = false;
            this.f30463b = false;
        }
    }

    public r(String str, Q q10, InterfaceC0859q interfaceC0859q, long j10) {
        super(str);
        this.f30458a = str;
        this.f30459b = q10;
        D9.b.t0(interfaceC0859q, "Logger is required.");
        this.f30460c = interfaceC0859q;
        this.f30461d = j10;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Integer valueOf = Integer.valueOf(i);
        String str2 = this.f30458a;
        InterfaceC0859q interfaceC0859q = this.f30460c;
        interfaceC0859q.h(sentryLevel, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", valueOf, str2, str);
        C0852j a10 = J9.b.a(new a(this.f30461d, interfaceC0859q));
        this.f30459b.a(androidx.camera.core.impl.utils.a.n(C.v.s(str2), File.separator, str), a10);
    }
}
