package g3;

import b3.k;
import b3.l;
import b3.m;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* compiled from: MacWrapper.java */
/* renamed from: g3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764e implements m<k, k> {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f20766a = Logger.getLogger(C0764e.class.getName());

    /* compiled from: MacWrapper.java */
    /* renamed from: g3.e$a */
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public final l<k> f20767a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f20768b = {0};

        public a(l lVar) {
            this.f20767a = lVar;
        }

        @Override // b3.k
        public final void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            l<k> lVar = this.f20767a;
            for (l.a<k> aVar : lVar.a(copyOf)) {
                try {
                    boolean equals = aVar.f8306d.equals(OutputPrefixType.LEGACY);
                    k kVar = aVar.f8303a;
                    if (equals) {
                        kVar.a(copyOfRange, j3.e.h(bArr2, this.f20768b));
                        return;
                    } else {
                        kVar.a(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e10) {
                    C0764e.f20766a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            Iterator<l.a<k>> it = lVar.a(b3.b.f8288a).iterator();
            while (it.hasNext()) {
                try {
                    it.next().f8303a.a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // b3.k
        public final byte[] b(byte[] bArr) {
            l<k> lVar = this.f20767a;
            return lVar.f8301b.f8306d.equals(OutputPrefixType.LEGACY) ? j3.e.h(lVar.f8301b.a(), lVar.f8301b.f8303a.b(j3.e.h(bArr, this.f20768b))) : j3.e.h(lVar.f8301b.a(), lVar.f8301b.f8303a.b(bArr));
        }
    }

    @Override // b3.m
    public final Class<k> a() {
        return k.class;
    }

    @Override // b3.m
    public final Class<k> b() {
        return k.class;
    }

    @Override // b3.m
    public final k c(l<k> lVar) {
        return new a(lVar);
    }
}
