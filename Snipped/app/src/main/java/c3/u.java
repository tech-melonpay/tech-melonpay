package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.F;
import i3.G;
import java.security.GeneralSecurityException;

/* compiled from: XChaCha20Poly1305KeyManager.java */
/* loaded from: classes.dex */
public final class u extends b3.f<F> {

    /* compiled from: XChaCha20Poly1305KeyManager.java */
    public class a extends f.a<G, F> {
        public a() {
            super(G.class);
        }

        @Override // b3.f.a
        public final F a(G g10) {
            F.a x9 = F.x();
            u.this.getClass();
            x9.i();
            F.t((F) x9.f10116b);
            byte[] a10 = j3.p.a(32);
            ByteString c2 = ByteString.c(0, a10.length, a10);
            x9.i();
            F.u((F) x9.f10116b, c2);
            return x9.g();
        }

        @Override // b3.f.a
        public final G b(ByteString byteString) {
            return G.s(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final /* bridge */ /* synthetic */ void c(G g10) {
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // b3.f
    public final f.a<?, F> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final F e(ByteString byteString) {
        return F.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(F f10) {
        F f11 = f10;
        j3.q.c(f11.w());
        if (f11.v().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
