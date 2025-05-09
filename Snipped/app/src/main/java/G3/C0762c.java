package g3;

import b3.f;
import b3.k;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import i3.u;
import i3.v;
import i3.w;
import j3.n;
import j3.o;
import j3.p;
import j3.q;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: HmacKeyManager.java */
/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762c extends f<u> {

    /* compiled from: HmacKeyManager.java */
    /* renamed from: g3.c$a */
    public class a extends f.b<k, u> {
        @Override // b3.f.b
        public final k a(u uVar) {
            u uVar2 = uVar;
            HashType t3 = uVar2.y().t();
            SecretKeySpec secretKeySpec = new SecretKeySpec(uVar2.x().l(), "HMAC");
            int u6 = uVar2.y().u();
            int ordinal = t3.ordinal();
            if (ordinal == 1) {
                return new o(new n("HMACSHA1", secretKeySpec), u6);
            }
            if (ordinal == 3) {
                return new o(new n("HMACSHA256", secretKeySpec), u6);
            }
            if (ordinal == 4) {
                return new o(new n("HMACSHA512", secretKeySpec), u6);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* compiled from: HmacKeyManager.java */
    /* renamed from: g3.c$b */
    public class b extends f.a<v, u> {
        public b() {
            super(v.class);
        }

        @Override // b3.f.a
        public final u a(v vVar) {
            v vVar2 = vVar;
            u.a A10 = u.A();
            C0762c.this.getClass();
            A10.i();
            u.t((u) A10.f10116b);
            w u6 = vVar2.u();
            A10.i();
            u.u((u) A10.f10116b, u6);
            byte[] a10 = p.a(vVar2.t());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            A10.i();
            u.v((u) A10.f10116b, c2);
            return A10.g();
        }

        @Override // b3.f.a
        public final v b(ByteString byteString) {
            return v.v(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(v vVar) {
            v vVar2 = vVar;
            if (vVar2.t() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            C0762c.g(vVar2.u());
        }
    }

    public C0762c() {
        super(u.class, new a(k.class));
    }

    public static void g(w wVar) {
        if (wVar.u() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int ordinal = wVar.t().ordinal();
        if (ordinal == 1) {
            if (wVar.u() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 3) {
            if (wVar.u() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (wVar.u() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // b3.f
    public final f.a<?, u> c() {
        return new b();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final u e(ByteString byteString) {
        return u.B(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(u uVar) {
        u uVar2 = uVar;
        q.c(uVar2.z());
        if (uVar2.x().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        g(uVar2.y());
    }
}
