package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.C0812A;
import i3.C0813B;

/* compiled from: KmsAeadKeyManager.java */
/* loaded from: classes.dex */
public final class p extends b3.f<C0812A> {

    /* compiled from: KmsAeadKeyManager.java */
    public class a extends f.a<C0813B, C0812A> {
        public a() {
            super(C0813B.class);
        }

        @Override // b3.f.a
        public final C0812A a(C0813B c0813b) {
            C0812A.a x9 = C0812A.x();
            x9.i();
            C0812A.u((C0812A) x9.f10116b, c0813b);
            p.this.getClass();
            x9.i();
            C0812A.t((C0812A) x9.f10116b);
            return x9.g();
        }

        @Override // b3.f.a
        public final C0813B b(ByteString byteString) {
            return C0813B.u(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final /* bridge */ /* synthetic */ void c(C0813B c0813b) {
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // b3.f
    public final f.a<?, C0812A> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // b3.f
    public final C0812A e(ByteString byteString) {
        return C0812A.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(C0812A c0812a) {
        j3.q.c(c0812a.w());
    }
}
