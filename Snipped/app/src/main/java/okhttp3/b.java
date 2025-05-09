package okhttp3;

import Aa.i;
import Ka.f.b;
import Ka.s;
import Ka.t;
import Ka.w;
import Ka.y;
import ca.InterfaceC0635a;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import ka.C0956a;
import ka.C0967l;
import ka.C0969n;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import okhttp3.TlsVersion;
import okhttp3.g;
import okhttp3.h;
import okhttp3.i;
import okhttp3.internal.cache.DiskLruCache;
import okio.ByteString;

/* compiled from: Cache.kt */
/* loaded from: classes2.dex */
public final class b implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    public final DiskLruCache f24443a;

    /* compiled from: Cache.kt */
    public static final class a extends va.i {

        /* renamed from: b, reason: collision with root package name */
        public final DiskLruCache.b f24444b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24445c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24446d;

        /* renamed from: e, reason: collision with root package name */
        public final t f24447e;

        /* compiled from: Cache.kt */
        /* renamed from: okhttp3.b$a$a, reason: collision with other inner class name */
        public static final class C0438a extends Ka.l {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f24448b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0438a(y yVar, a aVar) {
                super(yVar);
                this.f24448b = aVar;
            }

            @Override // Ka.l, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                this.f24448b.f24444b.close();
                super.close();
            }
        }

        public a(DiskLruCache.b bVar, String str, String str2) {
            this.f24444b = bVar;
            this.f24445c = str;
            this.f24446d = str2;
            this.f24447e = new t(new C0438a(bVar.f24587c.get(1), this));
        }

        @Override // va.i
        public final long i() {
            String str = this.f24446d;
            if (str == null) {
                return -1L;
            }
            byte[] bArr = wa.b.f30872a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // va.i
        public final i j() {
            String str = this.f24445c;
            if (str == null) {
                return null;
            }
            Pattern pattern = i.f24542d;
            return i.a.b(str);
        }

        @Override // va.i
        public final Ka.i p() {
            return this.f24447e;
        }
    }

    /* compiled from: Cache.kt */
    /* renamed from: okhttp3.b$b, reason: collision with other inner class name */
    public static final class C0439b {
        public static String a(h hVar) {
            Charset charset = C0956a.f23054b;
            String str = hVar.i;
            ByteString byteString = new ByteString(str.getBytes(charset));
            byteString.f24699c = str;
            return byteString.c("MD5").e();
        }

        public static int b(t tVar) {
            try {
                long j10 = tVar.j();
                String x9 = tVar.x(Long.MAX_VALUE);
                if (j10 >= 0 && j10 <= 2147483647L && x9.length() <= 0) {
                    return (int) j10;
                }
                throw new IOException("expected an int but was \"" + j10 + x9 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static Set c(g gVar) {
            int size = gVar.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (C0967l.U("Vary", gVar.c(i), true)) {
                    String f10 = gVar.f(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = C0969n.q0(f10, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(C0969n.u0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? EmptySet.f23106a : treeSet;
        }
    }

    /* compiled from: Cache.kt */
    public final class d implements xa.c {

        /* renamed from: a, reason: collision with root package name */
        public final DiskLruCache.Editor f24460a;

        /* renamed from: b, reason: collision with root package name */
        public final w f24461b;

        /* renamed from: c, reason: collision with root package name */
        public final a f24462c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f24463d;

        /* compiled from: Cache.kt */
        public static final class a extends Ka.k {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f24465b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f24466c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar, w wVar) {
                super(wVar);
                this.f24465b = bVar;
                this.f24466c = dVar;
            }

            @Override // Ka.k, Ka.w, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                b bVar = this.f24465b;
                d dVar = this.f24466c;
                synchronized (bVar) {
                    if (dVar.f24463d) {
                        return;
                    }
                    dVar.f24463d = true;
                    super.close();
                    this.f24466c.f24460a.b();
                }
            }
        }

        public d(DiskLruCache.Editor editor) {
            this.f24460a = editor;
            w d10 = editor.d(1);
            this.f24461b = d10;
            this.f24462c = new a(b.this, this, d10);
        }

        @Override // xa.c
        public final void a() {
            synchronized (b.this) {
                if (this.f24463d) {
                    return;
                }
                this.f24463d = true;
                wa.b.c(this.f24461b);
                try {
                    this.f24460a.a();
                } catch (IOException unused) {
                }
            }
        }
    }

    public b(File file, long j10) {
        this.f24443a = new DiskLruCache(file, j10, ya.d.f31189h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24443a.close();
    }

    public final void d(k kVar) {
        DiskLruCache diskLruCache = this.f24443a;
        String a10 = C0439b.a(kVar.f24644a);
        synchronized (diskLruCache) {
            diskLruCache.y();
            diskLruCache.d();
            DiskLruCache.N(a10);
            DiskLruCache.a aVar = diskLruCache.i.get(a10);
            if (aVar == null) {
                return;
            }
            diskLruCache.H(aVar);
            if (diskLruCache.f24558g <= diskLruCache.f24554c) {
                diskLruCache.f24565o = false;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f24443a.flush();
    }

    /* compiled from: Cache.kt */
    public static final class c {

        /* renamed from: k, reason: collision with root package name */
        public static final String f24449k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f24450l;

        /* renamed from: a, reason: collision with root package name */
        public final h f24451a;

        /* renamed from: b, reason: collision with root package name */
        public final g f24452b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24453c;

        /* renamed from: d, reason: collision with root package name */
        public final Protocol f24454d;

        /* renamed from: e, reason: collision with root package name */
        public final int f24455e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24456f;

        /* renamed from: g, reason: collision with root package name */
        public final g f24457g;

        /* renamed from: h, reason: collision with root package name */
        public final Handshake f24458h;
        public final long i;

        /* renamed from: j, reason: collision with root package name */
        public final long f24459j;

        static {
            Ea.h hVar = Ea.h.f1121a;
            Ea.h.f1121a.getClass();
            f24449k = "OkHttp-Sent-Millis";
            Ea.h.f1121a.getClass();
            f24450l = "OkHttp-Received-Millis";
        }

        public c(y yVar) {
            h hVar;
            try {
                t tVar = new t(yVar);
                String x9 = tVar.x(Long.MAX_VALUE);
                try {
                    h.a aVar = new h.a();
                    aVar.d(null, x9);
                    hVar = aVar.a();
                } catch (IllegalArgumentException unused) {
                    hVar = null;
                }
                if (hVar == null) {
                    IOException iOException = new IOException("Cache corruption for ".concat(x9));
                    Ea.h hVar2 = Ea.h.f1121a;
                    Ea.h.f1121a.getClass();
                    Ea.h.i(5, "cache corruption", iOException);
                    throw iOException;
                }
                this.f24451a = hVar;
                this.f24453c = tVar.x(Long.MAX_VALUE);
                g.a aVar2 = new g.a();
                int b9 = C0439b.b(tVar);
                for (int i = 0; i < b9; i++) {
                    aVar2.b(tVar.x(Long.MAX_VALUE));
                }
                this.f24452b = aVar2.d();
                Aa.i a10 = i.a.a(tVar.x(Long.MAX_VALUE));
                this.f24454d = a10.f160a;
                this.f24455e = a10.f161b;
                this.f24456f = a10.f162c;
                g.a aVar3 = new g.a();
                int b10 = C0439b.b(tVar);
                for (int i9 = 0; i9 < b10; i9++) {
                    aVar3.b(tVar.x(Long.MAX_VALUE));
                }
                String str = f24449k;
                String e10 = aVar3.e(str);
                String str2 = f24450l;
                String e11 = aVar3.e(str2);
                aVar3.f(str);
                aVar3.f(str2);
                this.i = e10 != null ? Long.parseLong(e10) : 0L;
                this.f24459j = e11 != null ? Long.parseLong(e11) : 0L;
                this.f24457g = aVar3.d();
                if (kotlin.jvm.internal.f.b(this.f24451a.f24525a, "https")) {
                    String x10 = tVar.x(Long.MAX_VALUE);
                    if (x10.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + x10 + '\"');
                    }
                    okhttp3.d b11 = okhttp3.d.f24487b.b(tVar.x(Long.MAX_VALUE));
                    List a11 = a(tVar);
                    List a12 = a(tVar);
                    TlsVersion a13 = !tVar.r() ? TlsVersion.a.a(tVar.x(Long.MAX_VALUE)) : TlsVersion.SSL_3_0;
                    final List w2 = wa.b.w(a11);
                    this.f24458h = new Handshake(a13, b11, wa.b.w(a12), new InterfaceC0635a<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$get$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // ca.InterfaceC0635a
                        public final List<? extends Certificate> invoke() {
                            return w2;
                        }
                    });
                } else {
                    this.f24458h = null;
                }
                O9.p pVar = O9.p.f3034a;
                U4.b.d(yVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    U4.b.d(yVar, th);
                    throw th2;
                }
            }
        }

        public static List a(t tVar) {
            int b9 = C0439b.b(tVar);
            if (b9 == -1) {
                return EmptyList.f23104a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(b9);
                for (int i = 0; i < b9; i++) {
                    String x9 = tVar.x(Long.MAX_VALUE);
                    Ka.f fVar = new Ka.f();
                    ByteString a10 = ByteString.a.a(x9);
                    if (a10 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    a10.l(fVar, a10.d());
                    arrayList.add(certificateFactory.generateCertificate(fVar.new b()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static void b(s sVar, List list) {
            try {
                sVar.j0(list.size());
                sVar.s(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sVar.F(ByteString.a.d(((Certificate) it.next()).getEncoded()).a());
                    sVar.s(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void c(DiskLruCache.Editor editor) {
            h hVar = this.f24451a;
            g gVar = this.f24457g;
            g gVar2 = this.f24452b;
            s sVar = new s(editor.d(0));
            try {
                sVar.F(hVar.i);
                sVar.s(10);
                sVar.F(this.f24453c);
                sVar.s(10);
                sVar.j0(gVar2.size());
                sVar.s(10);
                int size = gVar2.size();
                for (int i = 0; i < size; i++) {
                    sVar.F(gVar2.c(i));
                    sVar.F(": ");
                    sVar.F(gVar2.f(i));
                    sVar.s(10);
                }
                Protocol protocol = this.f24454d;
                int i9 = this.f24455e;
                String str = this.f24456f;
                StringBuilder sb2 = new StringBuilder();
                if (protocol == Protocol.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(i9);
                sb2.append(' ');
                sb2.append(str);
                sVar.F(sb2.toString());
                sVar.s(10);
                sVar.j0(gVar.size() + 2);
                sVar.s(10);
                int size2 = gVar.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    sVar.F(gVar.c(i10));
                    sVar.F(": ");
                    sVar.F(gVar.f(i10));
                    sVar.s(10);
                }
                sVar.F(f24449k);
                sVar.F(": ");
                sVar.j0(this.i);
                sVar.s(10);
                sVar.F(f24450l);
                sVar.F(": ");
                sVar.j0(this.f24459j);
                sVar.s(10);
                if (kotlin.jvm.internal.f.b(hVar.f24525a, "https")) {
                    sVar.s(10);
                    Handshake handshake = this.f24458h;
                    sVar.F(handshake.f24412b.f24505a);
                    sVar.s(10);
                    b(sVar, handshake.a());
                    b(sVar, handshake.f24413c);
                    sVar.F(handshake.f24411a.f24432a);
                    sVar.s(10);
                }
                O9.p pVar = O9.p.f3034a;
                U4.b.d(sVar, null);
            } finally {
            }
        }

        public c(p pVar) {
            g d10;
            k kVar = pVar.f24671a;
            this.f24451a = kVar.f24644a;
            g gVar = pVar.f24678h.f24671a.f24646c;
            g gVar2 = pVar.f24676f;
            Set c2 = C0439b.c(gVar2);
            if (c2.isEmpty()) {
                d10 = wa.b.f30873b;
            } else {
                g.a aVar = new g.a();
                int size = gVar.size();
                for (int i = 0; i < size; i++) {
                    String c10 = gVar.c(i);
                    if (c2.contains(c10)) {
                        aVar.a(c10, gVar.f(i));
                    }
                }
                d10 = aVar.d();
            }
            this.f24452b = d10;
            this.f24453c = kVar.f24645b;
            this.f24454d = pVar.f24672b;
            this.f24455e = pVar.f24674d;
            this.f24456f = pVar.f24673c;
            this.f24457g = gVar2;
            this.f24458h = pVar.f24675e;
            this.i = pVar.f24680k;
            this.f24459j = pVar.f24681l;
        }
    }
}
