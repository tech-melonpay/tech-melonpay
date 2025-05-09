package e3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.p;
import i3.q;
import j3.d;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* compiled from: AesSivKeyManager.java */
/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712a extends f<p> {

    /* compiled from: AesSivKeyManager.java */
    /* renamed from: e3.a$a, reason: collision with other inner class name */
    public class C0393a extends f.b<b3.c, p> {
        @Override // b3.f.b
        public final b3.c a(p pVar) {
            return new d(pVar.v().l());
        }
    }

    /* compiled from: AesSivKeyManager.java */
    /* renamed from: e3.a$b */
    public class b extends f.a<q, p> {
        public b() {
            super(q.class);
        }

        @Override // b3.f.a
        public final p a(q qVar) {
            p.a x9 = p.x();
            byte[] a10 = j3.p.a(qVar.u());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            x9.i();
            p.u((p) x9.f10116b, c2);
            C0712a.this.getClass();
            x9.i();
            p.t((p) x9.f10116b);
            return x9.g();
        }

        @Override // b3.f.a
        public final q b(ByteString byteString) {
            return q.w(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(q qVar) {
            q qVar2 = qVar;
            if (qVar2.u() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar2.u() + ". Valid keys must have 64 bytes.");
        }
    }

    public C0712a() {
        super(p.class, new C0393a(b3.c.class));
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // b3.f
    public final f.a<?, p> c() {
        return new b();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final p e(ByteString byteString) {
        return p.y(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(p pVar) {
        p pVar2 = pVar;
        j3.q.c(pVar2.w());
        if (pVar2.v().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar2.v().size() + ". Valid keys must have 64 bytes.");
    }
}
