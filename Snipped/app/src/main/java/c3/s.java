package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.C;
import i3.D;

/* compiled from: KmsEnvelopeAeadKeyManager.java */
/* loaded from: classes.dex */
public final class s extends b3.f<C> {

    /* compiled from: KmsEnvelopeAeadKeyManager.java */
    public class a extends f.a<D, C> {
        public a() {
            super(D.class);
        }

        @Override // b3.f.a
        public final C a(D d10) {
            C.a x9 = C.x();
            x9.i();
            C.u((C) x9.f10116b, d10);
            s.this.getClass();
            x9.i();
            C.t((C) x9.f10116b);
            return x9.g();
        }

        @Override // b3.f.a
        public final D b(ByteString byteString) {
            return D.v(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final /* bridge */ /* synthetic */ void c(D d10) {
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // b3.f
    public final f.a<?, C> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // b3.f
    public final C e(ByteString byteString) {
        return C.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(C c2) {
        j3.q.c(c2.w());
    }
}
