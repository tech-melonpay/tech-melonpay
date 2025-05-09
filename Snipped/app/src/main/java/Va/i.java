package va;

import O9.p;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import ka.C0956a;

/* compiled from: ResponseBody.kt */
/* loaded from: classes2.dex */
public abstract class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public a f30756a;

    /* compiled from: ResponseBody.kt */
    public static final class a extends Reader {

        /* renamed from: a, reason: collision with root package name */
        public final Ka.i f30757a;

        /* renamed from: b, reason: collision with root package name */
        public final Charset f30758b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f30759c;

        /* renamed from: d, reason: collision with root package name */
        public InputStreamReader f30760d;

        public a(Ka.i iVar, Charset charset) {
            this.f30757a = iVar;
            this.f30758b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            p pVar;
            this.f30759c = true;
            InputStreamReader inputStreamReader = this.f30760d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                pVar = p.f3034a;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                this.f30757a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i9) {
            if (this.f30759c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f30760d;
            if (inputStreamReader == null) {
                Ka.i iVar = this.f30757a;
                inputStreamReader = new InputStreamReader(iVar.m0(), wa.b.r(iVar, this.f30758b));
                this.f30760d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i9);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        wa.b.c(p());
    }

    public final byte[] d() {
        long i = i();
        if (i > 2147483647L) {
            throw new IOException(androidx.camera.core.impl.j.a("Cannot buffer entire body for content length: ", i));
        }
        Ka.i p10 = p();
        try {
            byte[] q10 = p10.q();
            U4.b.d(p10, null);
            int length = q10.length;
            if (i == -1 || i == length) {
                return q10;
            }
            throw new IOException("Content-Length (" + i + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public abstract long i();

    public abstract okhttp3.i j();

    public abstract Ka.i p();

    public final String y() {
        Charset charset;
        Ka.i p10 = p();
        try {
            okhttp3.i j10 = j();
            if (j10 == null || (charset = j10.a(C0956a.f23054b)) == null) {
                charset = C0956a.f23054b;
            }
            String I10 = p10.I(wa.b.r(p10, charset));
            U4.b.d(p10, null);
            return I10;
        } finally {
        }
    }
}
