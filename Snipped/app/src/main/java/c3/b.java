package c3;

import b3.InterfaceC0586a;
import b3.l;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: AeadWrapper.java */
/* loaded from: classes.dex */
public final class b implements b3.m<InterfaceC0586a, InterfaceC0586a> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f8510a = Logger.getLogger(b.class.getName());

    /* compiled from: AeadWrapper.java */
    public static class a implements InterfaceC0586a {

        /* renamed from: a, reason: collision with root package name */
        public final b3.l<InterfaceC0586a> f8511a;

        public a(b3.l lVar) {
            this.f8511a = lVar;
        }

        @Override // b3.InterfaceC0586a
        public final byte[] a(byte[] bArr, byte[] bArr2) {
            b3.l<InterfaceC0586a> lVar = this.f8511a;
            return j3.e.h(lVar.f8301b.a(), lVar.f8301b.f8303a.a(bArr, bArr2));
        }

        @Override // b3.InterfaceC0586a
        public final byte[] decrypt(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            b3.l<InterfaceC0586a> lVar = this.f8511a;
            if (length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<l.a<InterfaceC0586a>> it = lVar.a(copyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().f8303a.decrypt(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        b.f8510a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10.toString());
                    }
                }
            }
            Iterator<l.a<InterfaceC0586a>> it2 = lVar.a(b3.b.f8288a).iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().f8303a.decrypt(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    @Override // b3.m
    public final Class<InterfaceC0586a> a() {
        return InterfaceC0586a.class;
    }

    @Override // b3.m
    public final Class<InterfaceC0586a> b() {
        return InterfaceC0586a.class;
    }

    @Override // b3.m
    public final InterfaceC0586a c(b3.l<InterfaceC0586a> lVar) {
        return new a(lVar);
    }
}
