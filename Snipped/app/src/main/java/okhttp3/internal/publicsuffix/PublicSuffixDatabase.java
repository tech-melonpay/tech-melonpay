package okhttp3.internal.publicsuffix;

import Ea.h;
import Ka.n;
import Ka.t;
import O9.p;
import P9.k;
import P9.s;
import j3.e;
import ja.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.f;
import net.sf.scuba.smartcards.ISO7816;
import wa.b;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f24624e = {ISO7816.INS_PSO};

    /* renamed from: f, reason: collision with root package name */
    public static final List<String> f24625f = Collections.singletonList("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f24626g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f24627a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f24628b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f24629c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f24630d;

    /* compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i9;
            boolean z10;
            int i10;
            int i11;
            int i12 = -1;
            byte[] bArr3 = PublicSuffixDatabase.f24624e;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > i12 && bArr[i14] != 10) {
                    i14 += i12;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i9 = i15 + i16;
                    if (bArr[i9] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i9 - i15;
                int i18 = i;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        i10 = 46;
                        z10 = false;
                    } else {
                        byte b9 = bArr2[i18][i19];
                        byte[] bArr4 = b.f30872a;
                        int i21 = b9 & 255;
                        z10 = z11;
                        i10 = i21;
                    }
                    byte b10 = bArr[i15 + i20];
                    byte[] bArr5 = b.f30872a;
                    i11 = i10 - (b10 & 255);
                    if (i11 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    }
                    if (bArr2[i18].length != i19) {
                        z11 = z10;
                    } else {
                        if (i18 == bArr2.length - 1) {
                            break;
                        }
                        i18++;
                        z11 = true;
                        i19 = -1;
                    }
                }
                if (i11 >= 0) {
                    if (i11 <= 0) {
                        int i22 = i17 - i20;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i23 = i18 + 1; i23 < length3; i23++) {
                            length2 += bArr2[i23].length;
                        }
                        if (length2 >= i22) {
                            if (length2 <= i22) {
                                return new String(bArr, i15, i17, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    i13 = i9 + 1;
                    i12 = -1;
                }
                length = i14;
                i12 = -1;
            }
            return null;
        }
    }

    public static List c(String str) {
        List q02 = C0969n.q0(str, new char[]{'.'});
        if (!f.b(s.Q(q02), "")) {
            return q02;
        }
        List list = q02;
        int size = q02.size() - 1;
        return s.Y(list, size >= 0 ? size : 0);
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List<String> q02;
        int size;
        int size2;
        int i = 0;
        List c2 = c(IDN.toUnicode(str));
        if (this.f24627a.get() || !this.f24627a.compareAndSet(false, true)) {
            try {
                this.f24628b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e10) {
                        h hVar = h.f1121a;
                        h.f1121a.getClass();
                        h.i(5, "Failed to read public suffix list", e10);
                        if (z10) {
                        }
                    }
                } finally {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f24629c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = c2.size();
        byte[][] bArr = new byte[size3][];
        for (int i9 = 0; i9 < size3; i9++) {
            bArr[i9] = ((String) c2.get(i9)).getBytes(StandardCharsets.UTF_8);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f24629c;
            if (bArr2 == null) {
                bArr2 = null;
            }
            str2 = a.a(bArr2, bArr, i10);
            if (str2 != null) {
                break;
            }
            i10++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                bArr3[i11] = f24624e;
                byte[] bArr4 = this.f24629c;
                if (bArr4 == null) {
                    bArr4 = null;
                }
                str3 = a.a(bArr4, bArr3, i11);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i12 = size3 - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                byte[] bArr5 = this.f24630d;
                if (bArr5 == null) {
                    bArr5 = null;
                }
                str4 = a.a(bArr5, bArr, i13);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            q02 = C0969n.q0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            q02 = f24625f;
        } else {
            List<String> q03 = str2 != null ? C0969n.q0(str2, new char[]{'.'}) : EmptyList.f23104a;
            q02 = str3 != null ? C0969n.q0(str3, new char[]{'.'}) : EmptyList.f23104a;
            if (q03.size() > q02.size()) {
                q02 = q03;
            }
        }
        if (c2.size() == q02.size() && q02.get(0).charAt(0) != '!') {
            return null;
        }
        if (q02.get(0).charAt(0) == '!') {
            size = c2.size();
            size2 = q02.size();
        } else {
            size = c2.size();
            size2 = q02.size() + 1;
        }
        int i14 = size - size2;
        ja.h kVar = new k(c(str), 1);
        if (i14 < 0) {
            throw new IllegalArgumentException(s3.b.i("Requested element count ", i14, " is less than zero.").toString());
        }
        if (i14 != 0) {
            kVar = kVar instanceof c ? ((c) kVar).a(i14) : new ja.b(kVar, i14);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : kVar) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ".");
            }
            e.b(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() {
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            t tVar = new t(new n(Ja.a.C(resourceAsStream)));
            try {
                long readInt = tVar.readInt();
                tVar.h0(readInt);
                ref$ObjectRef.f23179a = tVar.f2332b.E(readInt);
                long readInt2 = tVar.readInt();
                tVar.h0(readInt2);
                ref$ObjectRef2.f23179a = tVar.f2332b.E(readInt2);
                p pVar = p.f3034a;
                U4.b.d(tVar, null);
                synchronized (this) {
                    this.f24629c = (byte[]) ref$ObjectRef.f23179a;
                    this.f24630d = (byte[]) ref$ObjectRef2.f23179a;
                }
            } finally {
            }
        } finally {
            this.f24628b.countDown();
        }
    }
}
