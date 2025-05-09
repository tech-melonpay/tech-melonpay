package B9;

import B1.f;
import H9.g;
import io.sentry.I;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.c0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: EnvelopeCache.java */
/* loaded from: classes2.dex */
public class d extends b implements e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f468g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f469f;

    public d(SentryOptions sentryOptions, String str, int i) {
        super(sentryOptions, str, i);
        this.f469f = new WeakHashMap();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0450 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221 A[SYNTHETIC] */
    @Override // B9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T(B1.f r24, io.sentry.C0852j r25) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B9.d.T(B1.f, io.sentry.j):void");
    }

    public final File[] c() {
        File file = this.f466c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] listFiles = file.listFiles(new c());
            if (listFiles != null) {
                return listFiles;
            }
        } else {
            this.f464a.getLogger().h(SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    @Override // B9.e
    public final void d(f fVar) {
        D9.b.t0(fVar, "Envelope is required.");
        File e10 = e(fVar);
        boolean exists = e10.exists();
        SentryOptions sentryOptions = this.f464a;
        if (!exists) {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Envelope was not cached: %s", e10.getAbsolutePath());
            return;
        }
        sentryOptions.getLogger().h(SentryLevel.DEBUG, "Discarding envelope from cache: %s", e10.getAbsolutePath());
        if (e10.delete()) {
            return;
        }
        sentryOptions.getLogger().h(SentryLevel.ERROR, "Failed to delete envelope: %s", e10.getAbsolutePath());
    }

    public final synchronized File e(f fVar) {
        String str;
        try {
            if (this.f469f.containsKey(fVar)) {
                str = (String) this.f469f.get(fVar);
            } else {
                g gVar = ((c0) fVar.f229b).f21973a;
                String str2 = (gVar != null ? gVar.toString() : UUID.randomUUID().toString()) + ".envelope";
                this.f469f.put(fVar, str2);
                str = str2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(this.f466c.getAbsolutePath(), str);
    }

    public final Date f(File file) {
        SentryOptions sentryOptions = this.f464a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b.f463e));
            try {
                String readLine = bufferedReader.readLine();
                sentryOptions.getLogger().h(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date o10 = I.o(readLine);
                bufferedReader.close();
                return o10;
            } finally {
            }
        } catch (IOException e10) {
            sentryOptions.getLogger().f(SentryLevel.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            sentryOptions.getLogger().d(SentryLevel.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    public final void g(File file, f fVar) {
        boolean exists = file.exists();
        SentryOptions sentryOptions = this.f464a;
        if (exists) {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                sentryOptions.getLogger().h(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f465b.k(fVar, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            sentryOptions.getLogger().d(SentryLevel.ERROR, th, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
        }
    }

    public final void h(File file, Session session) {
        boolean exists = file.exists();
        UUID uuid = session.f21875e;
        SentryOptions sentryOptions = this.f464a;
        if (exists) {
            sentryOptions.getLogger().h(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", uuid);
            if (!file.delete()) {
                sentryOptions.getLogger().h(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, b.f463e));
                try {
                    this.f465b.m(session, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            sentryOptions.getLogger().d(SentryLevel.ERROR, th, "Error writing Session to offline storage: %s", uuid);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<f> iterator() {
        SentryOptions sentryOptions = this.f464a;
        File[] c2 = c();
        ArrayList arrayList = new ArrayList(c2.length);
        for (File file : c2) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f465b.b(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                sentryOptions.getLogger().h(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                sentryOptions.getLogger().f(SentryLevel.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e10);
            }
        }
        return arrayList.iterator();
    }
}
