package c3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import g3.C0762c;
import i3.C0817d;
import i3.C0818e;
import i3.C0819f;
import i3.C0820g;
import i3.u;
import i3.v;
import i3.w;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: AesCtrHmacAeadKeyManager.java */
/* loaded from: classes.dex */
public final class d extends b3.f<C0817d> {

    /* compiled from: AesCtrHmacAeadKeyManager.java */
    public class a extends f.a<C0818e, C0817d> {
        public a() {
            super(C0818e.class);
        }

        @Override // b3.f.a
        public final C0817d a(C0818e c0818e) {
            C0818e c0818e2 = c0818e;
            f.b[] bVarArr = {new e(j3.m.class)};
            HashMap hashMap = new HashMap();
            for (f.b bVar : bVarArr) {
                boolean containsKey = hashMap.containsKey(bVar.f8296a);
                Class<PrimitiveT> cls = bVar.f8296a;
                if (containsKey) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap.put(cls, bVar);
            }
            if (bVarArr.length > 0) {
                GenericDeclaration genericDeclaration = bVarArr[0].f8296a;
            }
            Collections.unmodifiableMap(hashMap);
            C0820g s10 = c0818e2.s();
            C0819f.a A10 = C0819f.A();
            i3.h u6 = s10.u();
            A10.i();
            C0819f.u((C0819f) A10.f10116b, u6);
            byte[] a10 = j3.p.a(s10.t());
            ByteString c2 = ByteString.c(0, a10.length, a10);
            A10.i();
            C0819f.v((C0819f) A10.f10116b, c2);
            A10.i();
            C0819f.t((C0819f) A10.f10116b);
            C0819f g10 = A10.g();
            f.b[] bVarArr2 = {new C0762c.a(b3.k.class)};
            HashMap hashMap2 = new HashMap();
            for (f.b bVar2 : bVarArr2) {
                boolean containsKey2 = hashMap2.containsKey(bVar2.f8296a);
                Class<PrimitiveT> cls2 = bVar2.f8296a;
                if (containsKey2) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap2.put(cls2, bVar2);
            }
            if (bVarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = bVarArr2[0].f8296a;
            }
            Collections.unmodifiableMap(hashMap2);
            v t3 = c0818e2.t();
            u.a A11 = i3.u.A();
            A11.i();
            i3.u.t((i3.u) A11.f10116b);
            w u10 = t3.u();
            A11.i();
            i3.u.u((i3.u) A11.f10116b, u10);
            byte[] a11 = j3.p.a(t3.t());
            ByteString c10 = ByteString.c(0, a11.length, a11);
            A11.i();
            i3.u.v((i3.u) A11.f10116b, c10);
            i3.u g11 = A11.g();
            C0817d.a z10 = C0817d.z();
            z10.i();
            C0817d.u((C0817d) z10.f10116b, g10);
            z10.i();
            C0817d.v((C0817d) z10.f10116b, g11);
            d.this.getClass();
            z10.i();
            C0817d.t((C0817d) z10.f10116b);
            return z10.g();
        }

        @Override // b3.f.a
        public final C0818e b(ByteString byteString) {
            return C0818e.u(byteString, C0666m.a());
        }

        @Override // b3.f.a
        public final void c(C0818e c0818e) {
            C0818e c0818e2 = c0818e;
            f.b[] bVarArr = {new e(j3.m.class)};
            HashMap hashMap = new HashMap();
            for (f.b bVar : bVarArr) {
                boolean containsKey = hashMap.containsKey(bVar.f8296a);
                Class<PrimitiveT> cls = bVar.f8296a;
                if (containsKey) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap.put(cls, bVar);
            }
            if (bVarArr.length > 0) {
                GenericDeclaration genericDeclaration = bVarArr[0].f8296a;
            }
            Collections.unmodifiableMap(hashMap);
            C0820g s10 = c0818e2.s();
            j3.q.a(s10.t());
            i3.h u6 = s10.u();
            if (u6.t() < 12 || u6.t() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
            f.b[] bVarArr2 = {new C0762c.a(b3.k.class)};
            HashMap hashMap2 = new HashMap();
            for (f.b bVar2 : bVarArr2) {
                boolean containsKey2 = hashMap2.containsKey(bVar2.f8296a);
                Class<PrimitiveT> cls2 = bVar2.f8296a;
                if (containsKey2) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                hashMap2.put(cls2, bVar2);
            }
            if (bVarArr2.length > 0) {
                GenericDeclaration genericDeclaration2 = bVarArr2[0].f8296a;
            }
            Collections.unmodifiableMap(hashMap2);
            v t3 = c0818e2.t();
            if (t3.t() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            C0762c.g(t3.u());
            j3.q.a(c0818e2.s().t());
        }
    }

    @Override // b3.f
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // b3.f
    public final f.a<?, C0817d> c() {
        return new a();
    }

    @Override // b3.f
    public final KeyData.KeyMaterialType d() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // b3.f
    public final C0817d e(ByteString byteString) {
        return C0817d.A(byteString, C0666m.a());
    }

    @Override // b3.f
    public final void f(C0817d c0817d) {
        C0817d c0817d2 = c0817d;
        j3.q.c(c0817d2.y());
        f.b[] bVarArr = {new e(j3.m.class)};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 1; i++) {
            f.b bVar = bVarArr[i];
            boolean containsKey = hashMap.containsKey(bVar.f8296a);
            Class<PrimitiveT> cls = bVar.f8296a;
            if (containsKey) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls, bVar);
        }
        GenericDeclaration genericDeclaration = bVarArr[0].f8296a;
        Collections.unmodifiableMap(hashMap);
        C0819f w2 = c0817d2.w();
        j3.q.c(w2.z());
        j3.q.a(w2.x().size());
        i3.h y10 = w2.y();
        if (y10.t() < 12 || y10.t() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
        f.b[] bVarArr2 = {new C0762c.a(b3.k.class)};
        HashMap hashMap2 = new HashMap();
        f.b bVar2 = bVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(bVar2.f8296a);
        Class<PrimitiveT> cls2 = bVar2.f8296a;
        if (containsKey2) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap2.put(cls2, bVar2);
        GenericDeclaration genericDeclaration2 = bVarArr2[0].f8296a;
        Collections.unmodifiableMap(hashMap2);
        i3.u x9 = c0817d2.x();
        j3.q.c(x9.z());
        if (x9.x().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        C0762c.g(x9.y());
    }
}
