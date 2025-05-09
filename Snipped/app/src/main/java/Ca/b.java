package Ca;

import Ca.m;
import Ca.p;
import Ka.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISOFileInfo;
import okio.ByteString;

/* compiled from: Hpack.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Ca.a[] f706a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<ByteString, Integer> f707b;

    /* compiled from: Hpack.kt */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public final t f710c;

        /* renamed from: f, reason: collision with root package name */
        public int f713f;

        /* renamed from: g, reason: collision with root package name */
        public int f714g;

        /* renamed from: a, reason: collision with root package name */
        public int f708a = 4096;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f709b = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public Ca.a[] f711d = new Ca.a[8];

        /* renamed from: e, reason: collision with root package name */
        public int f712e = 7;

        public a(m.b bVar) {
            this.f710c = new t(bVar);
        }

        public final int a(int i) {
            int i9;
            int i10 = 0;
            if (i > 0) {
                int length = this.f711d.length;
                while (true) {
                    length--;
                    i9 = this.f712e;
                    if (length < i9 || i <= 0) {
                        break;
                    }
                    int i11 = this.f711d[length].f705c;
                    i -= i11;
                    this.f714g -= i11;
                    this.f713f--;
                    i10++;
                }
                Ca.a[] aVarArr = this.f711d;
                System.arraycopy(aVarArr, i9 + 1, aVarArr, i9 + 1 + i10, this.f713f);
                this.f712e += i10;
            }
            return i10;
        }

        public final ByteString b(int i) {
            if (i >= 0) {
                Ca.a[] aVarArr = b.f706a;
                if (i <= aVarArr.length - 1) {
                    return aVarArr[i].f703a;
                }
            }
            int length = this.f712e + 1 + (i - b.f706a.length);
            if (length >= 0) {
                Ca.a[] aVarArr2 = this.f711d;
                if (length < aVarArr2.length) {
                    return aVarArr2[length].f703a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(Ca.a aVar) {
            this.f709b.add(aVar);
            int i = this.f708a;
            int i9 = aVar.f705c;
            if (i9 > i) {
                P9.i.k(this.f711d, null);
                this.f712e = this.f711d.length - 1;
                this.f713f = 0;
                this.f714g = 0;
                return;
            }
            a((this.f714g + i9) - i);
            int i10 = this.f713f + 1;
            Ca.a[] aVarArr = this.f711d;
            if (i10 > aVarArr.length) {
                Ca.a[] aVarArr2 = new Ca.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f712e = this.f711d.length - 1;
                this.f711d = aVarArr2;
            }
            int i11 = this.f712e;
            this.f712e = i11 - 1;
            this.f711d[i11] = aVar;
            this.f713f++;
            this.f714g += i9;
        }

        public final ByteString d() {
            int i;
            t tVar = this.f710c;
            byte readByte = tVar.readByte();
            byte[] bArr = wa.b.f30872a;
            int i9 = readByte & 255;
            int i10 = 0;
            boolean z10 = (readByte & ISOFileInfo.DATA_BYTES1) == 128;
            long e10 = e(i9, 127);
            if (!z10) {
                return tVar.h(e10);
            }
            Ka.f fVar = new Ka.f();
            p.a aVar = p.f847c;
            p.a aVar2 = aVar;
            int i11 = 0;
            for (long j10 = 0; j10 < e10; j10++) {
                byte readByte2 = tVar.readByte();
                byte[] bArr2 = wa.b.f30872a;
                i10 = (i10 << 8) | (readByte2 & 255);
                i11 += 8;
                while (i11 >= 8) {
                    aVar2 = aVar2.f848a[(i10 >>> (i11 - 8)) & 255];
                    if (aVar2.f848a == null) {
                        fVar.W(aVar2.f849b);
                        i11 -= aVar2.f850c;
                        aVar2 = aVar;
                    } else {
                        i11 -= 8;
                    }
                }
            }
            while (i11 > 0) {
                p.a aVar3 = aVar2.f848a[(i10 << (8 - i11)) & 255];
                if (aVar3.f848a != null || (i = aVar3.f850c) > i11) {
                    break;
                }
                fVar.W(aVar3.f849b);
                i11 -= i;
                aVar2 = aVar;
            }
            return fVar.h(fVar.f2294b);
        }

        public final int e(int i, int i9) {
            int i10 = i & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                byte readByte = this.f710c.readByte();
                byte[] bArr = wa.b.f30872a;
                int i12 = readByte & 255;
                if ((readByte & ISOFileInfo.DATA_BYTES1) == 0) {
                    return i9 + (i12 << i11);
                }
                i9 += (readByte & Byte.MAX_VALUE) << i11;
                i11 += 7;
            }
        }
    }

    /* compiled from: Hpack.kt */
    /* renamed from: Ca.b$b, reason: collision with other inner class name */
    public static final class C0008b {

        /* renamed from: b, reason: collision with root package name */
        public final Ka.f f716b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f718d;

        /* renamed from: h, reason: collision with root package name */
        public int f722h;
        public int i;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f715a = true;

        /* renamed from: c, reason: collision with root package name */
        public int f717c = Integer.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        public int f719e = 4096;

        /* renamed from: f, reason: collision with root package name */
        public Ca.a[] f720f = new Ca.a[8];

        /* renamed from: g, reason: collision with root package name */
        public int f721g = 7;

        public C0008b(Ka.f fVar) {
            this.f716b = fVar;
        }

        public final void a(int i) {
            int i9;
            if (i > 0) {
                int length = this.f720f.length - 1;
                int i10 = 0;
                while (true) {
                    i9 = this.f721g;
                    if (length < i9 || i <= 0) {
                        break;
                    }
                    int i11 = this.f720f[length].f705c;
                    i -= i11;
                    this.i -= i11;
                    this.f722h--;
                    i10++;
                    length--;
                }
                Ca.a[] aVarArr = this.f720f;
                int i12 = i9 + 1;
                System.arraycopy(aVarArr, i12, aVarArr, i12 + i10, this.f722h);
                Ca.a[] aVarArr2 = this.f720f;
                int i13 = this.f721g + 1;
                Arrays.fill(aVarArr2, i13, i13 + i10, (Object) null);
                this.f721g += i10;
            }
        }

        public final void b(Ca.a aVar) {
            int i = this.f719e;
            int i9 = aVar.f705c;
            if (i9 > i) {
                P9.i.k(this.f720f, null);
                this.f721g = this.f720f.length - 1;
                this.f722h = 0;
                this.i = 0;
                return;
            }
            a((this.i + i9) - i);
            int i10 = this.f722h + 1;
            Ca.a[] aVarArr = this.f720f;
            if (i10 > aVarArr.length) {
                Ca.a[] aVarArr2 = new Ca.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f721g = this.f720f.length - 1;
                this.f720f = aVarArr2;
            }
            int i11 = this.f721g;
            this.f721g = i11 - 1;
            this.f720f[i11] = aVar;
            this.f722h++;
            this.i += i9;
        }

        public final void c(ByteString byteString) {
            boolean z10 = this.f715a;
            Ka.f fVar = this.f716b;
            if (z10) {
                int[] iArr = p.f845a;
                int d10 = byteString.d();
                long j10 = 0;
                for (int i = 0; i < d10; i++) {
                    byte g10 = byteString.g(i);
                    byte[] bArr = wa.b.f30872a;
                    j10 += p.f846b[g10 & 255];
                }
                if (((int) ((j10 + 7) >> 3)) < byteString.d()) {
                    Ka.f fVar2 = new Ka.f();
                    int[] iArr2 = p.f845a;
                    int d11 = byteString.d();
                    long j11 = 0;
                    int i9 = 0;
                    for (int i10 = 0; i10 < d11; i10++) {
                        byte g11 = byteString.g(i10);
                        byte[] bArr2 = wa.b.f30872a;
                        int i11 = g11 & 255;
                        int i12 = p.f845a[i11];
                        byte b9 = p.f846b[i11];
                        j11 = (j11 << b9) | i12;
                        i9 += b9;
                        while (i9 >= 8) {
                            i9 -= 8;
                            fVar2.W((int) (j11 >> i9));
                        }
                    }
                    if (i9 > 0) {
                        fVar2.W((int) ((255 >>> i9) | (j11 << (8 - i9))));
                    }
                    ByteString h9 = fVar2.h(fVar2.f2294b);
                    e(h9.d(), 127, 128);
                    fVar.getClass();
                    h9.l(fVar, h9.d());
                    return;
                }
            }
            e(byteString.d(), 127, 0);
            fVar.getClass();
            byteString.l(fVar, byteString.d());
        }

        public final void d(ArrayList arrayList) {
            int i;
            int i9;
            if (this.f718d) {
                int i10 = this.f717c;
                if (i10 < this.f719e) {
                    e(i10, 31, 32);
                }
                this.f718d = false;
                this.f717c = Integer.MAX_VALUE;
                e(this.f719e, 31, 32);
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Ca.a aVar = (Ca.a) arrayList.get(i11);
                ByteString j10 = aVar.f703a.j();
                Integer num = b.f707b.get(j10);
                ByteString byteString = aVar.f704b;
                if (num != null) {
                    int intValue = num.intValue();
                    i9 = intValue + 1;
                    if (2 <= i9 && i9 < 8) {
                        Ca.a[] aVarArr = b.f706a;
                        if (kotlin.jvm.internal.f.b(aVarArr[intValue].f704b, byteString)) {
                            i = i9;
                        } else if (kotlin.jvm.internal.f.b(aVarArr[i9].f704b, byteString)) {
                            i9 = intValue + 2;
                            i = i9;
                        }
                    }
                    i = i9;
                    i9 = -1;
                } else {
                    i = -1;
                    i9 = -1;
                }
                if (i9 == -1) {
                    int i12 = this.f721g + 1;
                    int length = this.f720f.length;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        }
                        if (kotlin.jvm.internal.f.b(this.f720f[i12].f703a, j10)) {
                            if (kotlin.jvm.internal.f.b(this.f720f[i12].f704b, byteString)) {
                                i9 = b.f706a.length + (i12 - this.f721g);
                                break;
                            } else if (i == -1) {
                                i = (i12 - this.f721g) + b.f706a.length;
                            }
                        }
                        i12++;
                    }
                }
                if (i9 != -1) {
                    e(i9, 127, 128);
                } else if (i == -1) {
                    this.f716b.W(64);
                    c(j10);
                    c(byteString);
                    b(aVar);
                } else {
                    ByteString byteString2 = Ca.a.f698d;
                    j10.getClass();
                    if (!j10.h(byteString2.d(), byteString2) || kotlin.jvm.internal.f.b(Ca.a.i, j10)) {
                        e(i, 63, 64);
                        c(byteString);
                        b(aVar);
                    } else {
                        e(i, 15, 0);
                        c(byteString);
                    }
                }
            }
        }

        public final void e(int i, int i9, int i10) {
            Ka.f fVar = this.f716b;
            if (i < i9) {
                fVar.W(i | i10);
                return;
            }
            fVar.W(i10 | i9);
            int i11 = i - i9;
            while (i11 >= 128) {
                fVar.W(128 | (i11 & 127));
                i11 >>>= 7;
            }
            fVar.W(i11);
        }
    }

    static {
        Ca.a aVar = new Ca.a(Ca.a.i, "");
        ByteString byteString = Ca.a.f700f;
        Ca.a aVar2 = new Ca.a(byteString, "GET");
        Ca.a aVar3 = new Ca.a(byteString, "POST");
        ByteString byteString2 = Ca.a.f701g;
        Ca.a aVar4 = new Ca.a(byteString2, "/");
        Ca.a aVar5 = new Ca.a(byteString2, "/index.html");
        ByteString byteString3 = Ca.a.f702h;
        Ca.a aVar6 = new Ca.a(byteString3, "http");
        Ca.a aVar7 = new Ca.a(byteString3, "https");
        ByteString byteString4 = Ca.a.f699e;
        Ca.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new Ca.a(byteString4, "200"), new Ca.a(byteString4, "204"), new Ca.a(byteString4, "206"), new Ca.a(byteString4, "304"), new Ca.a(byteString4, "400"), new Ca.a(byteString4, "404"), new Ca.a(byteString4, "500"), new Ca.a("accept-charset", ""), new Ca.a("accept-encoding", "gzip, deflate"), new Ca.a("accept-language", ""), new Ca.a("accept-ranges", ""), new Ca.a("accept", ""), new Ca.a("access-control-allow-origin", ""), new Ca.a("age", ""), new Ca.a("allow", ""), new Ca.a("authorization", ""), new Ca.a("cache-control", ""), new Ca.a("content-disposition", ""), new Ca.a("content-encoding", ""), new Ca.a("content-language", ""), new Ca.a("content-length", ""), new Ca.a("content-location", ""), new Ca.a("content-range", ""), new Ca.a("content-type", ""), new Ca.a("cookie", ""), new Ca.a("date", ""), new Ca.a("etag", ""), new Ca.a("expect", ""), new Ca.a("expires", ""), new Ca.a(Constants.MessagePayloadKeys.FROM, ""), new Ca.a("host", ""), new Ca.a("if-match", ""), new Ca.a("if-modified-since", ""), new Ca.a("if-none-match", ""), new Ca.a("if-range", ""), new Ca.a("if-unmodified-since", ""), new Ca.a("last-modified", ""), new Ca.a("link", ""), new Ca.a(FirebaseAnalytics.Param.LOCATION, ""), new Ca.a("max-forwards", ""), new Ca.a("proxy-authenticate", ""), new Ca.a("proxy-authorization", ""), new Ca.a("range", ""), new Ca.a("referer", ""), new Ca.a("refresh", ""), new Ca.a("retry-after", ""), new Ca.a("server", ""), new Ca.a("set-cookie", ""), new Ca.a("strict-transport-security", ""), new Ca.a("transfer-encoding", ""), new Ca.a("user-agent", ""), new Ca.a("vary", ""), new Ca.a("via", ""), new Ca.a("www-authenticate", "")};
        f706a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(aVarArr[i].f703a)) {
                linkedHashMap.put(aVarArr[i].f703a, Integer.valueOf(i));
            }
        }
        f707b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(ByteString byteString) {
        int d10 = byteString.d();
        for (int i = 0; i < d10; i++) {
            byte g10 = byteString.g(i);
            if (65 <= g10 && g10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.k()));
            }
        }
    }
}
