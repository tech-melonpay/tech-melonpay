package e3;

import b3.l;
import b3.m;
import j3.e;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: DeterministicAeadWrapper.java */
/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714c implements m<b3.c, b3.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f20508a = Logger.getLogger(C0714c.class.getName());

    /* compiled from: DeterministicAeadWrapper.java */
    /* renamed from: e3.c$a */
    public static class a implements b3.c {

        /* renamed from: a, reason: collision with root package name */
        public l<b3.c> f20509a;

        @Override // b3.c
        public final byte[] a(byte[] bArr, byte[] bArr2) {
            l<b3.c> lVar = this.f20509a;
            return e.h(lVar.f8301b.a(), lVar.f8301b.f8303a.a(bArr, bArr2));
        }

        @Override // b3.c
        public final byte[] b(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            l<b3.c> lVar = this.f20509a;
            if (length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<l.a<b3.c>> it = lVar.a(copyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().f8303a.b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        C0714c.f20508a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10.toString());
                    }
                }
            }
            Iterator<l.a<b3.c>> it2 = lVar.a(b3.b.f8288a).iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().f8303a.b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // b3.m
    public final Class<b3.c> a() {
        return b3.c.class;
    }

    @Override // b3.m
    public final Class<b3.c> b() {
        return b3.c.class;
    }

    @Override // b3.m
    public final b3.c c(l<b3.c> lVar) {
        a aVar = new a();
        aVar.f20509a = lVar;
        return aVar;
    }
}
