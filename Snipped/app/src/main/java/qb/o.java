package qb;

import java.util.ArrayList;
import java.util.regex.Pattern;
import okhttp3.f;
import okhttp3.g;
import okhttp3.h;
import okhttp3.i;
import okhttp3.j;
import okhttp3.k;
import org.bouncycastle.math.Primes;

/* compiled from: RequestBuilder.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f26017l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f26018m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f26019a;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.h f26020b;

    /* renamed from: c, reason: collision with root package name */
    public String f26021c;

    /* renamed from: d, reason: collision with root package name */
    public h.a f26022d;

    /* renamed from: e, reason: collision with root package name */
    public final k.a f26023e = new k.a();

    /* renamed from: f, reason: collision with root package name */
    public final g.a f26024f;

    /* renamed from: g, reason: collision with root package name */
    public okhttp3.i f26025g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26026h;
    public final j.a i;

    /* renamed from: j, reason: collision with root package name */
    public final f.a f26027j;

    /* renamed from: k, reason: collision with root package name */
    public okhttp3.o f26028k;

    /* compiled from: RequestBuilder.java */
    public static class a extends okhttp3.o {

        /* renamed from: d, reason: collision with root package name */
        public final okhttp3.o f26029d;

        /* renamed from: e, reason: collision with root package name */
        public final okhttp3.i f26030e;

        public a(okhttp3.o oVar, okhttp3.i iVar) {
            this.f26029d = oVar;
            this.f26030e = iVar;
        }

        @Override // okhttp3.o
        public final long contentLength() {
            return this.f26029d.contentLength();
        }

        @Override // okhttp3.o
        public final okhttp3.i contentType() {
            return this.f26030e;
        }

        @Override // okhttp3.o
        public final void writeTo(Ka.h hVar) {
            this.f26029d.writeTo(hVar);
        }
    }

    public o(String str, okhttp3.h hVar, String str2, okhttp3.g gVar, okhttp3.i iVar, boolean z10, boolean z11, boolean z12) {
        this.f26019a = str;
        this.f26020b = hVar;
        this.f26021c = str2;
        this.f26025g = iVar;
        this.f26026h = z10;
        if (gVar != null) {
            this.f26024f = gVar.e();
        } else {
            this.f26024f = new g.a();
        }
        if (z11) {
            this.f26027j = new f.a();
            return;
        }
        if (z12) {
            j.a aVar = new j.a();
            this.i = aVar;
            okhttp3.i iVar2 = okhttp3.j.i;
            if (kotlin.jvm.internal.f.b(iVar2.f24545b, "multipart")) {
                aVar.f24640b = iVar2;
            } else {
                throw new IllegalArgumentException(("multipart != " + iVar2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z10) {
        f.a aVar = this.f26027j;
        if (z10) {
            aVar.f24520b.add(h.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f24519a, 83));
            aVar.f24521c.add(h.b.a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f24519a, 83));
        } else {
            aVar.f24520b.add(h.b.a(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f24519a, 91));
            aVar.f24521c.add(h.b.a(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f24519a, 91));
        }
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f26024f.a(str, str2);
            return;
        }
        try {
            Pattern pattern = okhttp3.i.f24542d;
            this.f26025g = i.a.a(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(s3.b.j("Malformed content type: ", str2), e10);
        }
    }

    public final void c(okhttp3.g gVar, okhttp3.o oVar) {
        j.a aVar = this.i;
        aVar.getClass();
        if ((gVar != null ? gVar.a("Content-Type") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
        }
        if ((gVar != null ? gVar.a("Content-Length") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        aVar.f24641c.add(new j.c(gVar, oVar));
    }

    public final void d(String str, String str2, boolean z10) {
        String str3 = this.f26021c;
        if (str3 != null) {
            okhttp3.h hVar = this.f26020b;
            h.a g10 = hVar.g(str3);
            this.f26022d = g10;
            if (g10 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + hVar + ", Relative: " + this.f26021c);
            }
            this.f26021c = null;
        }
        if (z10) {
            h.a aVar = this.f26022d;
            if (aVar.f24540g == null) {
                aVar.f24540g = new ArrayList();
            }
            aVar.f24540g.add(h.b.a(str, 0, 0, " \"'<>#&=", true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT));
            aVar.f24540g.add(str2 != null ? h.b.a(str2, 0, 0, " \"'<>#&=", true, false, true, false, null, Primes.SMALL_FACTOR_LIMIT) : null);
            return;
        }
        h.a aVar2 = this.f26022d;
        if (aVar2.f24540g == null) {
            aVar2.f24540g = new ArrayList();
        }
        aVar2.f24540g.add(h.b.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        aVar2.f24540g.add(str2 != null ? h.b.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
    }
}
