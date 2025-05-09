package v9;

import B1.f;
import B9.d;
import E9.c;
import I9.e;
import io.sentry.C0852j;
import io.sentry.InterfaceC0859q;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import u9.n;

/* compiled from: AndroidEnvelopeCache.java */
/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1551a extends d {

    /* renamed from: h, reason: collision with root package name */
    public final e f30673h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1551a(io.sentry.android.core.SentryAndroidOptions r4) {
        /*
            r3 = this;
            y9.a r0 = y9.C1632a.f31158a
            java.lang.String r1 = r4.getCacheDirPath()
            java.lang.String r2 = "cacheDirPath must not be null"
            D9.b.t0(r1, r2)
            int r2 = r4.getMaxCacheItems()
            r3.<init>(r4, r1, r2)
            r3.f30673h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.C1551a.<init>(io.sentry.android.core.SentryAndroidOptions):void");
    }

    public static boolean i(SentryOptions sentryOptions) {
        if (sentryOptions.getOutboxPath() == null) {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(sentryOptions.getOutboxPath(), "startup_crash");
        try {
            boolean exists = file.exists();
            if (exists && !file.delete()) {
                sentryOptions.getLogger().h(SentryLevel.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            }
            return exists;
        } catch (Throwable th) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    @Override // B9.d, B9.e
    public final void T(f fVar, C0852j c0852j) {
        super.T(fVar, c0852j);
        SentryOptions sentryOptions = this.f464a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        Long l10 = n.f30446e.f30447a;
        if (!c.class.isInstance(c0852j.f22047a.get("sentry:typeCheckHint")) || l10 == null) {
            return;
        }
        long a10 = this.f30673h.a() - l10.longValue();
        if (a10 <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
            InterfaceC0859q logger = sentryAndroidOptions.getLogger();
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            logger.h(sentryLevel, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(a10));
            if (sentryOptions.getOutboxPath() == null) {
                sentryOptions.getLogger().h(sentryLevel, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                return;
            }
            try {
                new File(sentryOptions.getOutboxPath(), "startup_crash").createNewFile();
            } catch (Throwable th) {
                sentryOptions.getLogger().f(SentryLevel.ERROR, "Error writing the startup crash marker file to the disk", th);
            }
        }
    }
}
