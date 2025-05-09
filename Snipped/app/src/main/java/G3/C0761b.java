package g3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.C0814a;
import i3.C0815b;
import i3.C0816c;
import j3.p;
import j3.q;
import java.security.GeneralSecurityException;

/* compiled from: AesCmacKeyManager.java */
/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761b extends f<C0814a> {

    /* compiled from: AesCmacKeyManager.java */
    /* renamed from: g3.b$a */
    public class a extends f.a<C0815b, C0814a> {
        @Override // b3.f.a
        public final C0814a a(C0815b c0815b) {
            C0815b c0815b2 = c0815b;
            C0814a.C0406a z10 = C0814a.z();
            z10.i();
            C0814a.t((C0814a) z10.f10116b);
            byte[] a10 = p.a(c0815b2.s());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            z10.i();
            C0814a.u((C0814a) z10.f10116b, c2);
            C0816c t3 = c0815b2.t();
            z10.i();
            C0814a.v((C0814a) z10.f10116b, t3);
            return z10.g();
        }

        @Override // b3.f.a
        public final C0815b b(ByteString byteString) {
            return C0815b.u(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(C0815b c0815b) {
            C0815b c0815b2 = c0815b;
            C0761b.g(c0815b2.t());
            if (c0815b2.s() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public static void g(C0816c c0816c) {
        if (c0816c.t() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c0816c.t() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // b3.f
    public final f.a<?, C0814a> c() {
        return new a(C0815b.class);
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final C0814a e(ByteString byteString) {
        return C0814a.A(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(C0814a c0814a) {
        C0814a c0814a2 = c0814a;
        q.c(c0814a2.y());
        if (c0814a2.w().size() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        g(c0814a2.x());
    }
}
