package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.n;

/* compiled from: AesGcmSivKeyManager.java */
/* loaded from: classes.dex */
public final class l extends b3.f<i3.n> {

    /* compiled from: AesGcmSivKeyManager.java */
    public class a extends f.a<i3.o, i3.n> {
        public a() {
            super(i3.o.class);
        }

        @Override // b3.f.a
        public final i3.n a(i3.o oVar) {
            n.a x9 = i3.n.x();
            byte[] a10 = j3.p.a(oVar.s());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            x9.i();
            i3.n.u((i3.n) x9.f10116b, c2);
            l.this.getClass();
            x9.i();
            i3.n.t((i3.n) x9.f10116b);
            return x9.g();
        }

        @Override // b3.f.a
        public final i3.o b(ByteString byteString) {
            return i3.o.t(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(i3.o oVar) {
            j3.q.a(oVar.s());
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // b3.f
    public final f.a<?, i3.n> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final i3.n e(ByteString byteString) {
        return i3.n.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(i3.n nVar) {
        i3.n nVar2 = nVar;
        j3.q.c(nVar2.w());
        j3.q.a(nVar2.v().size());
    }
}
