package okhttp3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import ka.C0956a;
import okhttp3.i;
import okio.ByteString;

/* compiled from: RequestBody.kt */
/* loaded from: classes2.dex */
public abstract class o {
    public static final a Companion = new a();

    /* compiled from: RequestBody.kt */
    public static final class a {
        public static n a(i iVar, String str) {
            Charset charset = C0956a.f23054b;
            if (iVar != null) {
                Pattern pattern = i.f24542d;
                Charset a10 = iVar.a(null);
                if (a10 == null) {
                    iVar = i.a.b(iVar + "; charset=utf-8");
                } else {
                    charset = a10;
                }
            }
            byte[] bytes = str.getBytes(charset);
            int length = bytes.length;
            long length2 = bytes.length;
            long j10 = 0;
            long j11 = length;
            byte[] bArr = wa.b.f30872a;
            if ((j10 | j11) < 0 || j10 > length2 || length2 - j10 < j11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new n(iVar, length, bytes, 0);
        }

        public static n b(a aVar, byte[] bArr, i iVar, int i) {
            if ((i & 1) != 0) {
                iVar = null;
            }
            int length = bArr.length;
            aVar.getClass();
            long length2 = bArr.length;
            long j10 = 0;
            long j11 = length;
            byte[] bArr2 = wa.b.f30872a;
            if ((j10 | j11) < 0 || j10 > length2 || length2 - j10 < j11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new n(iVar, length, bArr, 0);
        }
    }

    public static final o create(i iVar, ByteString byteString) {
        Companion.getClass();
        return new m(iVar, byteString);
    }

    public long contentLength() {
        return -1L;
    }

    public abstract i contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(Ka.h hVar);

    public static final o create(i iVar, String str) {
        Companion.getClass();
        return a.a(iVar, str);
    }

    public static final o create(i iVar, byte[] bArr) {
        Companion.getClass();
        int length = bArr.length;
        long length2 = bArr.length;
        long j10 = 0;
        long j11 = length;
        byte[] bArr2 = wa.b.f30872a;
        if ((j10 | j11) >= 0 && j10 <= length2 && length2 - j10 >= j11) {
            return new n(iVar, length, bArr, 0);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
