package io.sentry;

import com.bumptech.glide.load.Key;
import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

/* compiled from: SentryEnvelopeItem.java */
/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f22003d = Charset.forName(Key.STRING_CHARSET_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final h0 f22004a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable<byte[]> f22005b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f22006c;

    /* compiled from: SentryEnvelopeItem.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f22007a;

        /* renamed from: b, reason: collision with root package name */
        public final Callable<byte[]> f22008b;

        public a(Callable<byte[]> callable) {
            this.f22008b = callable;
        }

        public final byte[] a() {
            Callable<byte[]> callable;
            if (this.f22007a == null && (callable = this.f22008b) != null) {
                this.f22007a = callable.call();
            }
            byte[] bArr = this.f22007a;
            return bArr != null ? bArr : new byte[0];
        }
    }

    public g0(h0 h0Var, byte[] bArr) {
        this.f22004a = h0Var;
        this.f22006c = bArr;
        this.f22005b = null;
    }

    public static g0 a(InterfaceC0862u interfaceC0862u, C9.b bVar) {
        D9.b.t0(interfaceC0862u, "ISerializer is required.");
        a aVar = new a(new com.google.firebase.heartbeatinfo.d(3, interfaceC0862u, bVar));
        return new g0(new h0(SentryItemType.resolve(bVar), new e0(aVar, 2), "application/json", (String) null, (String) null), new e0(aVar, 3));
    }

    public static g0 b(final S s10, final long j10, final InterfaceC0862u interfaceC0862u) {
        final File file = s10.f21842a;
        a aVar = new a(new Callable() { // from class: io.sentry.f0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC0862u interfaceC0862u2 = interfaceC0862u;
                File file2 = file;
                if (!file2.exists()) {
                    throw new SentryEnvelopeException(androidx.camera.core.n.a("Dropping profiling trace data, because the file '", file2.getName(), "' doesn't exists"));
                }
                String path = file2.getPath();
                try {
                    File file3 = new File(path);
                    if (!file3.isFile()) {
                        throw new SentryEnvelopeException("Reading the item " + path + " failed, because the file located at the path is not a file.");
                    }
                    if (!file3.canRead()) {
                        throw new SentryEnvelopeException("Reading the item " + path + " failed, because can't read the file.");
                    }
                    long length = file3.length();
                    long j11 = j10;
                    if (length > j11) {
                        throw new SentryEnvelopeException(String.format("Dropping item, because its size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", path, Long.valueOf(file3.length()), Long.valueOf(j11)));
                    }
                    FileInputStream fileInputStream = new FileInputStream(path);
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bufferedInputStream.close();
                                fileInputStream.close();
                                try {
                                    String str = new String(K9.a.a(byteArray), "US-ASCII");
                                    if (str.isEmpty()) {
                                        throw new SentryEnvelopeException("Profiling trace file is empty");
                                    }
                                    S s11 = s10;
                                    s11.f21840A = str;
                                    try {
                                        s11.f21852l = s11.f21843b.call();
                                    } catch (Throwable unused) {
                                    }
                                    try {
                                        try {
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            try {
                                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, g0.f22003d));
                                                try {
                                                    interfaceC0862u2.m(s11, bufferedWriter);
                                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                                    bufferedWriter.close();
                                                    byteArrayOutputStream2.close();
                                                    return byteArray2;
                                                } finally {
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    byteArrayOutputStream2.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                                throw th;
                                            }
                                        } finally {
                                            file2.delete();
                                        }
                                    } catch (IOException e10) {
                                        throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e10.getMessage());
                                    }
                                } catch (UnsupportedEncodingException e11) {
                                    throw new AssertionError(e11);
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException | SecurityException e12) {
                    throw new SentryEnvelopeException(s3.b.k("Reading the item ", path, " failed.\n", e12.getMessage()));
                }
            }
        });
        return new g0(new h0(SentryItemType.Profile, new e0(aVar, 6), "application-json", file.getName(), (String) null), new e0(aVar, 7));
    }

    public static g0 c(InterfaceC0862u interfaceC0862u, Session session) {
        D9.b.t0(interfaceC0862u, "ISerializer is required.");
        D9.b.t0(session, "Session is required.");
        a aVar = new a(new com.google.firebase.heartbeatinfo.d(4, interfaceC0862u, session));
        return new g0(new h0(SentryItemType.Session, new e0(aVar, 8), "application/json", (String) null, (String) null), new e0(aVar, 9));
    }

    public final C9.b d(InterfaceC0862u interfaceC0862u) {
        h0 h0Var = this.f22004a;
        if (h0Var == null || h0Var.f22011c != SentryItemType.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(e()), f22003d));
        try {
            C9.b bVar = (C9.b) interfaceC0862u.a(bufferedReader, C9.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] e() {
        Callable<byte[]> callable;
        if (this.f22006c == null && (callable = this.f22005b) != null) {
            this.f22006c = callable.call();
        }
        return this.f22006c;
    }

    public g0(h0 h0Var, Callable<byte[]> callable) {
        this.f22004a = h0Var;
        this.f22005b = callable;
        this.f22006c = null;
    }
}
