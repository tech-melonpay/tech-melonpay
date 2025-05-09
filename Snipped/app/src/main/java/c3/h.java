package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.i;
import java.security.GeneralSecurityException;

/* compiled from: AesEaxKeyManager.java */
/* loaded from: classes.dex */
public final class h extends b3.f<i3.i> {

    /* compiled from: AesEaxKeyManager.java */
    public class a extends f.a<i3.j, i3.i> {
        public a() {
            super(i3.j.class);
        }

        @Override // b3.f.a
        public final i3.i a(i3.j jVar) {
            i3.j jVar2 = jVar;
            i.a z10 = i3.i.z();
            byte[] a10 = j3.p.a(jVar2.s());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            z10.i();
            i3.i.v((i3.i) z10.f10116b, c2);
            i3.k t3 = jVar2.t();
            z10.i();
            i3.i.u((i3.i) z10.f10116b, t3);
            h.this.getClass();
            z10.i();
            i3.i.t((i3.i) z10.f10116b);
            return z10.g();
        }

        @Override // b3.f.a
        public final i3.j b(ByteString byteString) {
            return i3.j.u(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(i3.j jVar) {
            i3.j jVar2 = jVar;
            j3.q.a(jVar2.s());
            if (jVar2.t().t() != 12 && jVar2.t().t() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // b3.f
    public final f.a<?, i3.i> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final i3.i e(ByteString byteString) {
        return i3.i.A(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(i3.i iVar) {
        i3.i iVar2 = iVar;
        j3.q.c(iVar2.y());
        j3.q.a(iVar2.w().size());
        if (iVar2.x().t() != 12 && iVar2.x().t() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
