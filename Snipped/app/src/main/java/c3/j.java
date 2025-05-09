package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.l;

/* compiled from: AesGcmKeyManager.java */
/* loaded from: classes.dex */
public final class j extends b3.f<i3.l> {

    /* compiled from: AesGcmKeyManager.java */
    public class a extends f.a<i3.m, i3.l> {
        public a() {
            super(i3.m.class);
        }

        @Override // b3.f.a
        public final i3.l a(i3.m mVar) {
            l.a x9 = i3.l.x();
            byte[] a10 = j3.p.a(mVar.u());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            x9.i();
            i3.l.u((i3.l) x9.f10116b, c2);
            j.this.getClass();
            x9.i();
            i3.l.t((i3.l) x9.f10116b);
            return x9.g();
        }

        @Override // b3.f.a
        public final i3.m b(ByteString byteString) {
            return i3.m.w(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(i3.m mVar) {
            j3.q.a(mVar.u());
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // b3.f
    public final f.a<?, i3.l> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final i3.l e(ByteString byteString) {
        return i3.l.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(i3.l lVar) {
        i3.l lVar2 = lVar;
        j3.q.c(lVar2.w());
        j3.q.a(lVar2.v().size());
    }
}
