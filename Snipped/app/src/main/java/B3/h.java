package b3;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import i3.x;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: KeysetManager.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final a.C0107a f8298a;

    public h(a.C0107a c0107a) {
        this.f8298a = c0107a;
    }

    public static int d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public final synchronized g a() {
        com.google.crypto.tink.proto.a g10;
        g10 = this.f8298a.g();
        if (g10.w() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new g(g10);
    }

    public final synchronized boolean b(int i) {
        Iterator it = Collections.unmodifiableList(((com.google.crypto.tink.proto.a) this.f8298a.f10116b).x()).iterator();
        while (it.hasNext()) {
            if (((a.b) it.next()).y() == i) {
                return true;
            }
        }
        return false;
    }

    public final synchronized a.b c(x xVar) {
        KeyData e10;
        int d10;
        try {
            e10 = p.e(xVar);
            synchronized (this) {
                d10 = d();
                while (b(d10)) {
                    d10 = d();
                }
            }
            return r2.g();
        } catch (Throwable th) {
            throw th;
        }
        OutputPrefixType x9 = xVar.x();
        if (x9 == OutputPrefixType.UNKNOWN_PREFIX) {
            x9 = OutputPrefixType.TINK;
        }
        a.b.C0108a C10 = a.b.C();
        C10.i();
        a.b.t((a.b) C10.f10116b, e10);
        C10.i();
        a.b.w((a.b) C10.f10116b, d10);
        C10.i();
        a.b.v((a.b) C10.f10116b);
        C10.i();
        a.b.u((a.b) C10.f10116b, x9);
        return C10.g();
    }
}
