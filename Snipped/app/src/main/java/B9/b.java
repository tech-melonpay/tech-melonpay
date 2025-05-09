package B9;

import B1.f;
import com.bumptech.glide.load.Key;
import io.sentry.InterfaceC0862u;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.g0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* compiled from: CacheStrategy.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f463e = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final SentryOptions f464a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0862u f465b;

    /* renamed from: c, reason: collision with root package name */
    public final File f466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f467d;

    public b(SentryOptions sentryOptions, String str, int i) {
        D9.b.t0(sentryOptions, "SentryOptions is required.");
        this.f464a = sentryOptions;
        this.f465b = sentryOptions.getSerializer();
        this.f466c = new File(str);
        this.f467d = i;
    }

    public final f a(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                f b9 = this.f465b.b(bufferedInputStream);
                bufferedInputStream.close();
                return b9;
            } finally {
            }
        } catch (IOException e10) {
            this.f464a.getLogger().f(SentryLevel.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    public final Session b(g0 g0Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g0Var.e()), f463e));
            try {
                Session session = (Session) this.f465b.a(bufferedReader, Session.class);
                bufferedReader.close();
                return session;
            } finally {
            }
        } catch (Throwable th) {
            this.f464a.getLogger().f(SentryLevel.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }
}
