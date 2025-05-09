package io.sentry;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: DirectoryProcessor.java */
/* renamed from: io.sentry.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0846d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0859q f21977a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21978b;

    /* compiled from: DirectoryProcessor.java */
    /* renamed from: io.sentry.d$a */
    public static final class a implements E9.b, E9.f, E9.i, E9.d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21979a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21980b = false;

        /* renamed from: c, reason: collision with root package name */
        public final CountDownLatch f21981c = new CountDownLatch(1);

        /* renamed from: d, reason: collision with root package name */
        public final long f21982d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC0859q f21983e;

        public a(long j10, InterfaceC0859q interfaceC0859q) {
            this.f21982d = j10;
            this.f21983e = interfaceC0859q;
        }

        @Override // E9.f
        public final boolean a() {
            return this.f21979a;
        }

        @Override // E9.i
        public final void b(boolean z10) {
            this.f21980b = z10;
            this.f21981c.countDown();
        }

        @Override // E9.f
        public final void c(boolean z10) {
            this.f21979a = z10;
        }

        @Override // E9.d
        public final boolean d() {
            try {
                return this.f21981c.await(this.f21982d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f21983e.f(SentryLevel.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // E9.i
        public final boolean e() {
            return this.f21980b;
        }
    }

    public AbstractC0846d(long j10, InterfaceC0859q interfaceC0859q) {
        this.f21977a = interfaceC0859q;
        this.f21978b = j10;
    }

    public abstract boolean b(String str);

    public abstract void c(File file, C0852j c0852j);
}
