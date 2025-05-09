package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.C0819f;
import i3.C0820g;
import java.security.GeneralSecurityException;

/* compiled from: AesCtrKeyManager.java */
/* loaded from: classes.dex */
public final class f extends b3.f<C0819f> {

    /* compiled from: AesCtrKeyManager.java */
    public class a extends f.a<C0820g, C0819f> {
        public a() {
            super(C0820g.class);
        }

        @Override // b3.f.a
        public final C0819f a(C0820g c0820g) {
            C0820g c0820g2 = c0820g;
            C0819f.a A10 = C0819f.A();
            i3.h u6 = c0820g2.u();
            A10.i();
            C0819f.u((C0819f) A10.f10116b, u6);
            byte[] a10 = j3.p.a(c0820g2.t());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            A10.i();
            C0819f.v((C0819f) A10.f10116b, c2);
            f.this.getClass();
            A10.i();
            C0819f.t((C0819f) A10.f10116b);
            return A10.g();
        }

        @Override // b3.f.a
        public final C0820g b(ByteString byteString) {
            return C0820g.v(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(C0820g c0820g) {
            C0820g c0820g2 = c0820g;
            j3.q.a(c0820g2.t());
            i3.h u6 = c0820g2.u();
            f.this.getClass();
            if (u6.t() < 12 || u6.t() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // b3.f
    public final f.a<?, C0819f> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final C0819f e(ByteString byteString) {
        return C0819f.B(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(C0819f c0819f) {
        C0819f c0819f2 = c0819f;
        j3.q.c(c0819f2.z());
        j3.q.a(c0819f2.x().size());
        i3.h y10 = c0819f2.y();
        if (y10.t() < 12 || y10.t() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
