package qb;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.f;
import okhttp3.g;
import okhttp3.h;
import okhttp3.j;
import okhttp3.k;
import okhttp3.p;
import qb.o;
import va.b;

/* compiled from: OkHttpCall.java */
/* loaded from: classes3.dex */
public final class j<T> implements qb.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final p f25954a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f25955b;

    /* renamed from: c, reason: collision with root package name */
    public final b.a f25956c;

    /* renamed from: d, reason: collision with root package name */
    public final f<va.i, T> f25957d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f25958e;

    /* renamed from: f, reason: collision with root package name */
    public va.b f25959f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f25960g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25961h;

    /* compiled from: OkHttpCall.java */
    public class a implements va.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f25962a;

        public a(d dVar) {
            this.f25962a = dVar;
        }

        @Override // va.c
        public final void a(okhttp3.p pVar) {
            d dVar = this.f25962a;
            j jVar = j.this;
            try {
                try {
                    dVar.onResponse(jVar, jVar.c(pVar));
                } catch (Throwable th) {
                    retrofit2.b.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                retrofit2.b.m(th2);
                try {
                    dVar.onFailure(jVar, th2);
                } catch (Throwable th3) {
                    retrofit2.b.m(th3);
                    th3.printStackTrace();
                }
            }
        }

        @Override // va.c
        public final void b(IOException iOException) {
            try {
                this.f25962a.onFailure(j.this, iOException);
            } catch (Throwable th) {
                retrofit2.b.m(th);
                th.printStackTrace();
            }
        }
    }

    /* compiled from: OkHttpCall.java */
    public static final class b extends va.i {

        /* renamed from: b, reason: collision with root package name */
        public final va.i f25964b;

        /* renamed from: c, reason: collision with root package name */
        public final Ka.t f25965c;

        /* renamed from: d, reason: collision with root package name */
        public IOException f25966d;

        /* compiled from: OkHttpCall.java */
        public class a extends Ka.l {
            public a(Ka.i iVar) {
                super(iVar);
            }

            @Override // Ka.l, Ka.y
            public final long i0(Ka.f fVar, long j10) {
                try {
                    return super.i0(fVar, j10);
                } catch (IOException e10) {
                    b.this.f25966d = e10;
                    throw e10;
                }
            }
        }

        public b(va.i iVar) {
            this.f25964b = iVar;
            this.f25965c = new Ka.t(new a(iVar.p()));
        }

        @Override // va.i, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f25964b.close();
        }

        @Override // va.i
        public final long i() {
            return this.f25964b.i();
        }

        @Override // va.i
        public final okhttp3.i j() {
            return this.f25964b.j();
        }

        @Override // va.i
        public final Ka.i p() {
            return this.f25965c;
        }
    }

    /* compiled from: OkHttpCall.java */
    public static final class c extends va.i {

        /* renamed from: b, reason: collision with root package name */
        public final okhttp3.i f25968b;

        /* renamed from: c, reason: collision with root package name */
        public final long f25969c;

        public c(okhttp3.i iVar, long j10) {
            this.f25968b = iVar;
            this.f25969c = j10;
        }

        @Override // va.i
        public final long i() {
            return this.f25969c;
        }

        @Override // va.i
        public final okhttp3.i j() {
            return this.f25968b;
        }

        @Override // va.i
        public final Ka.i p() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public j(p pVar, Object[] objArr, b.a aVar, f<va.i, T> fVar) {
        this.f25954a = pVar;
        this.f25955b = objArr;
        this.f25956c = aVar;
        this.f25957d = fVar;
    }

    public final va.b a() {
        okhttp3.h a10;
        p pVar = this.f25954a;
        pVar.getClass();
        Object[] objArr = this.f25955b;
        int length = objArr.length;
        m<?>[] mVarArr = pVar.f26039j;
        if (length != mVarArr.length) {
            throw new IllegalArgumentException(s3.b.m(com.google.android.gms.measurement.internal.a.l("Argument count (", length, ") doesn't match expected count ("), mVarArr.length, ")"));
        }
        o oVar = new o(pVar.f26033c, pVar.f26032b, pVar.f26034d, pVar.f26035e, pVar.f26036f, pVar.f26037g, pVar.f26038h, pVar.i);
        if (pVar.f26040k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            mVarArr[i].a(oVar, objArr[i]);
        }
        h.a aVar = oVar.f26022d;
        if (aVar != null) {
            a10 = aVar.a();
        } else {
            String str = oVar.f26021c;
            okhttp3.h hVar = oVar.f26020b;
            h.a g10 = hVar.g(str);
            a10 = g10 != null ? g10.a() : null;
            if (a10 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + hVar + ", Relative: " + oVar.f26021c);
            }
        }
        okhttp3.o oVar2 = oVar.f26028k;
        if (oVar2 == null) {
            f.a aVar2 = oVar.f26027j;
            if (aVar2 != null) {
                oVar2 = new okhttp3.f(aVar2.f24520b, aVar2.f24521c);
            } else {
                j.a aVar3 = oVar.i;
                if (aVar3 != null) {
                    ArrayList arrayList2 = aVar3.f24641c;
                    if (!(!arrayList2.isEmpty())) {
                        throw new IllegalStateException("Multipart body must have at least one part.".toString());
                    }
                    oVar2 = new okhttp3.j(aVar3.f24639a, aVar3.f24640b, wa.b.w(arrayList2));
                } else if (oVar.f26026h) {
                    oVar2 = okhttp3.o.create((okhttp3.i) null, new byte[0]);
                }
            }
        }
        okhttp3.i iVar = oVar.f26025g;
        g.a aVar4 = oVar.f26024f;
        if (iVar != null) {
            if (oVar2 != null) {
                oVar2 = new o.a(oVar2, iVar);
            } else {
                aVar4.a("Content-Type", iVar.f24544a);
            }
        }
        k.a aVar5 = oVar.f26023e;
        aVar5.f24650a = a10;
        aVar5.f24652c = aVar4.d().e();
        aVar5.d(oVar.f26019a, oVar2);
        aVar5.f(h.class, new h(pVar.f26031a, arrayList));
        return this.f25956c.a(aVar5.b());
    }

    public final va.b b() {
        va.b bVar = this.f25959f;
        if (bVar != null) {
            return bVar;
        }
        Throwable th = this.f25960g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            va.b a10 = a();
            this.f25959f = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e10) {
            retrofit2.b.m(e10);
            this.f25960g = e10;
            throw e10;
        }
    }

    public final q<T> c(okhttp3.p pVar) {
        va.i iVar = pVar.f24677g;
        p.a p10 = pVar.p();
        p10.f24690g = new c(iVar.j(), iVar.i());
        okhttp3.p a10 = p10.a();
        int i = a10.f24674d;
        if (i < 200 || i >= 300) {
            try {
                Ka.f fVar = new Ka.f();
                iVar.p().n(fVar);
                va.j jVar = new va.j(iVar.j(), iVar.i(), fVar);
                if (a10.j()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new q<>(a10, null, jVar);
            } finally {
                iVar.close();
            }
        }
        if (i == 204 || i == 205) {
            iVar.close();
            return q.a(null, a10);
        }
        b bVar = new b(iVar);
        try {
            return q.a(this.f25957d.b(bVar), a10);
        } catch (RuntimeException e10) {
            IOException iOException = bVar.f25966d;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // qb.b
    public final void cancel() {
        va.b bVar;
        this.f25958e = true;
        synchronized (this) {
            bVar = this.f25959f;
        }
        if (bVar != null) {
            bVar.cancel();
        }
    }

    public final Object clone() {
        return new j(this.f25954a, this.f25955b, this.f25956c, this.f25957d);
    }

    @Override // qb.b
    public final void enqueue(d<T> dVar) {
        va.b bVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f25961h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f25961h = true;
                bVar = this.f25959f;
                th = this.f25960g;
                if (bVar == null && th == null) {
                    try {
                        va.b a10 = a();
                        this.f25959f = a10;
                        bVar = a10;
                    } catch (Throwable th2) {
                        th = th2;
                        retrofit2.b.m(th);
                        this.f25960g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            dVar.onFailure(this, th);
            return;
        }
        if (this.f25958e) {
            bVar.cancel();
        }
        bVar.y(new a(dVar));
    }

    @Override // qb.b
    public final q<T> execute() {
        va.b b9;
        synchronized (this) {
            if (this.f25961h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f25961h = true;
            b9 = b();
        }
        if (this.f25958e) {
            b9.cancel();
        }
        return c(b9.execute());
    }

    @Override // qb.b
    public final boolean isCanceled() {
        boolean z10 = true;
        if (this.f25958e) {
            return true;
        }
        synchronized (this) {
            try {
                va.b bVar = this.f25959f;
                if (bVar == null || !bVar.isCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // qb.b
    public final synchronized okhttp3.k request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().request();
    }

    @Override // qb.b
    public final qb.b clone() {
        return new j(this.f25954a, this.f25955b, this.f25956c, this.f25957d);
    }
}
