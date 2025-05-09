package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.r;
import java.security.GeneralSecurityException;

/* compiled from: ChaCha20Poly1305KeyManager.java */
/* loaded from: classes.dex */
public final class n extends b3.f<i3.r> {

    /* compiled from: ChaCha20Poly1305KeyManager.java */
    public class a extends f.a<i3.s, i3.r> {
        public a() {
            super(i3.s.class);
        }

        @Override // b3.f.a
        public final i3.r a(i3.s sVar) {
            r.a x9 = i3.r.x();
            n.this.getClass();
            x9.i();
            i3.r.t((i3.r) x9.f10116b);
            byte[] a10 = j3.p.a(32);
            ByteString c2 = ByteString.c(0, a10.length, a10);
            x9.i();
            i3.r.u((i3.r) x9.f10116b, c2);
            return x9.g();
        }

        @Override // b3.f.a
        public final i3.s b(ByteString byteString) {
            return i3.s.s(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final /* bridge */ /* synthetic */ void c(i3.s sVar) {
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // b3.f
    public final f.a<?, i3.r> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final i3.r e(ByteString byteString) {
        return i3.r.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(i3.r rVar) {
        i3.r rVar2 = rVar;
        j3.q.c(rVar2.w());
        if (rVar2.v().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
