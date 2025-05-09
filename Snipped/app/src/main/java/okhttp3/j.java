package okhttp3;

import C.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import ka.C0956a;
import net.sf.scuba.smartcards.ISO7816;
import okhttp3.g;
import okhttp3.i;
import okio.ByteString;
import org.jmrtd.PassportService;

/* compiled from: MultipartBody.kt */
/* loaded from: classes2.dex */
public final class j extends o {

    /* renamed from: h, reason: collision with root package name */
    public static final i f24631h;
    public static final i i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f24632j;

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f24633k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f24634l;

    /* renamed from: d, reason: collision with root package name */
    public final ByteString f24635d;

    /* renamed from: e, reason: collision with root package name */
    public final List<c> f24636e;

    /* renamed from: f, reason: collision with root package name */
    public final i f24637f;

    /* renamed from: g, reason: collision with root package name */
    public long f24638g;

    /* compiled from: MultipartBody.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ByteString f24639a;

        /* renamed from: b, reason: collision with root package name */
        public i f24640b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f24641c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            ByteString byteString = new ByteString(uuid.getBytes(C0956a.f23054b));
            byteString.f24699c = uuid;
            this.f24639a = byteString;
            this.f24640b = j.f24631h;
            this.f24641c = new ArrayList();
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class b {
        public static void a(StringBuilder sb2, String str) {
            sb2.append('\"');
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb2.append("%0A");
                } else if (charAt == '\r') {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
            }
            sb2.append('\"');
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f24642a;

        /* renamed from: b, reason: collision with root package name */
        public final o f24643b;

        /* compiled from: MultipartBody.kt */
        public static final class a {
            public static c a(String str, o oVar) {
                StringBuilder s10 = v.s("form-data; name=");
                i iVar = j.f24631h;
                b.a(s10, FirebaseAnalytics.Param.CONTENT);
                if (str != null) {
                    s10.append("; filename=");
                    b.a(s10, str);
                }
                String sb2 = s10.toString();
                g.a aVar = new g.a();
                for (int i = 0; i < 19; i++) {
                    char charAt = "Content-Disposition".charAt(i);
                    if ('!' > charAt || charAt >= 127) {
                        throw new IllegalArgumentException(wa.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), "Content-Disposition").toString());
                    }
                }
                aVar.c("Content-Disposition", sb2);
                g d10 = aVar.d();
                if (d10.a("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if (d10.a("Content-Length") == null) {
                    return new c(d10, oVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        public c(g gVar, o oVar) {
            this.f24642a = gVar;
            this.f24643b = oVar;
        }
    }

    static {
        Pattern pattern = i.f24542d;
        f24631h = i.a.a("multipart/mixed");
        i.a.a("multipart/alternative");
        i.a.a("multipart/digest");
        i.a.a("multipart/parallel");
        i = i.a.a("multipart/form-data");
        f24632j = new byte[]{58, ISO7816.INS_VERIFY};
        f24633k = new byte[]{PassportService.SFI_DG13, 10};
        f24634l = new byte[]{45, 45};
    }

    public j(ByteString byteString, i iVar, List<c> list) {
        this.f24635d = byteString;
        this.f24636e = list;
        Pattern pattern = i.f24542d;
        this.f24637f = i.a.a(iVar + "; boundary=" + byteString.k());
        this.f24638g = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(Ka.h hVar, boolean z10) {
        Ka.f fVar;
        Ka.h hVar2;
        if (z10) {
            hVar2 = new Ka.f();
            fVar = hVar2;
        } else {
            fVar = 0;
            hVar2 = hVar;
        }
        List<c> list = this.f24636e;
        int size = list.size();
        long j10 = 0;
        int i9 = 0;
        while (true) {
            ByteString byteString = this.f24635d;
            byte[] bArr = f24634l;
            byte[] bArr2 = f24633k;
            if (i9 >= size) {
                hVar2.X(bArr);
                hVar2.Z(byteString);
                hVar2.X(bArr);
                hVar2.X(bArr2);
                if (!z10) {
                    return j10;
                }
                long j11 = j10 + fVar.f2294b;
                fVar.d();
                return j11;
            }
            c cVar = list.get(i9);
            g gVar = cVar.f24642a;
            hVar2.X(bArr);
            hVar2.Z(byteString);
            hVar2.X(bArr2);
            if (gVar != null) {
                int size2 = gVar.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    hVar2.F(gVar.c(i10)).X(f24632j).F(gVar.f(i10)).X(bArr2);
                }
            }
            o oVar = cVar.f24643b;
            i contentType = oVar.contentType();
            if (contentType != null) {
                hVar2.F("Content-Type: ").F(contentType.f24544a).X(bArr2);
            }
            long contentLength = oVar.contentLength();
            if (contentLength != -1) {
                hVar2.F("Content-Length: ").j0(contentLength).X(bArr2);
            } else if (z10) {
                fVar.d();
                return -1L;
            }
            hVar2.X(bArr2);
            if (z10) {
                j10 += contentLength;
            } else {
                oVar.writeTo(hVar2);
            }
            hVar2.X(bArr2);
            i9++;
        }
    }

    @Override // okhttp3.o
    public final long contentLength() {
        long j10 = this.f24638g;
        if (j10 != -1) {
            return j10;
        }
        long a10 = a(null, true);
        this.f24638g = a10;
        return a10;
    }

    @Override // okhttp3.o
    public final i contentType() {
        return this.f24637f;
    }

    @Override // okhttp3.o
    public final void writeTo(Ka.h hVar) {
        a(hVar, false);
    }
}
