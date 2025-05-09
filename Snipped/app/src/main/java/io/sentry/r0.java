package io.sentry;

import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Stack.java */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f22187a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0859q f22188b;

    public r0(InterfaceC0859q interfaceC0859q, a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f22187a = linkedBlockingDeque;
        D9.b.t0(interfaceC0859q, "logger is required");
        this.f22188b = interfaceC0859q;
        linkedBlockingDeque.push(aVar);
    }

    public final a a() {
        return (a) this.f22187a.peek();
    }

    /* compiled from: Stack.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final SentryOptions f22189a;

        /* renamed from: b, reason: collision with root package name */
        public volatile InterfaceC0860s f22190b;

        /* renamed from: c, reason: collision with root package name */
        public volatile U f22191c;

        public a(SentryOptions sentryOptions, a0 a0Var, U u6) {
            this.f22190b = a0Var;
            this.f22191c = u6;
            this.f22189a = sentryOptions;
        }

        public a(a aVar) {
            this.f22189a = aVar.f22189a;
            this.f22190b = aVar.f22190b;
            this.f22191c = new U(aVar.f22191c);
        }
    }
}
