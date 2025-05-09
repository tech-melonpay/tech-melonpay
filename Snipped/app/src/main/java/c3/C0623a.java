package c3;

import b3.InterfaceC0586a;
import b3.f;
import g3.C0763d;
import i3.C;
import i3.C0812A;
import i3.C0817d;
import i3.E;
import i3.F;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: AeadConfig.java */
/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623a {
    static {
        f.b[] bVarArr = {new c(InterfaceC0586a.class)};
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
        f.b[] bVarArr2 = {new i(InterfaceC0586a.class)};
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
        f.b[] bVarArr3 = {new k(InterfaceC0586a.class)};
        HashMap hashMap3 = new HashMap();
        f.b bVar3 = bVarArr3[0];
        boolean containsKey3 = hashMap3.containsKey(bVar3.f8296a);
        Class<PrimitiveT> cls3 = bVar3.f8296a;
        if (containsKey3) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap3.put(cls3, bVar3);
        GenericDeclaration genericDeclaration3 = bVarArr3[0].f8296a;
        Collections.unmodifiableMap(hashMap3);
        f.b[] bVarArr4 = {new g(InterfaceC0586a.class)};
        HashMap hashMap4 = new HashMap();
        f.b bVar4 = bVarArr4[0];
        boolean containsKey4 = hashMap4.containsKey(bVar4.f8296a);
        Class<PrimitiveT> cls4 = bVar4.f8296a;
        if (containsKey4) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls4, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap4.put(cls4, bVar4);
        GenericDeclaration genericDeclaration4 = bVarArr4[0].f8296a;
        Collections.unmodifiableMap(hashMap4);
        f.b[] bVarArr5 = {new o(InterfaceC0586a.class)};
        HashMap hashMap5 = new HashMap();
        f.b bVar5 = bVarArr5[0];
        boolean containsKey5 = hashMap5.containsKey(bVar5.f8296a);
        Class<PrimitiveT> cls5 = bVar5.f8296a;
        if (containsKey5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap5.put(cls5, bVar5);
        GenericDeclaration genericDeclaration5 = bVarArr5[0].f8296a;
        Collections.unmodifiableMap(hashMap5);
        f.b[] bVarArr6 = {new r(InterfaceC0586a.class)};
        HashMap hashMap6 = new HashMap();
        f.b bVar6 = bVarArr6[0];
        boolean containsKey6 = hashMap6.containsKey(bVar6.f8296a);
        Class<PrimitiveT> cls6 = bVar6.f8296a;
        if (containsKey6) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls6, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap6.put(cls6, bVar6);
        GenericDeclaration genericDeclaration6 = bVarArr6[0].f8296a;
        Collections.unmodifiableMap(hashMap6);
        f.b[] bVarArr7 = {new m(InterfaceC0586a.class)};
        HashMap hashMap7 = new HashMap();
        f.b bVar7 = bVarArr7[0];
        boolean containsKey7 = hashMap7.containsKey(bVar7.f8296a);
        Class<PrimitiveT> cls7 = bVar7.f8296a;
        if (containsKey7) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap7.put(cls7, bVar7);
        GenericDeclaration genericDeclaration7 = bVarArr7[0].f8296a;
        Collections.unmodifiableMap(hashMap7);
        f.b[] bVarArr8 = {new t(InterfaceC0586a.class)};
        HashMap hashMap8 = new HashMap();
        f.b bVar8 = bVarArr8[0];
        boolean containsKey8 = hashMap8.containsKey(bVar8.f8296a);
        Class<PrimitiveT> cls8 = bVar8.f8296a;
        if (containsKey8) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls8, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap8.put(cls8, bVar8);
        GenericDeclaration genericDeclaration8 = bVarArr8[0].f8296a;
        Collections.unmodifiableMap(hashMap8);
        int i9 = E.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        C0763d.a();
        b3.p.f(new d(C0817d.class, new c(InterfaceC0586a.class)), true);
        b3.p.f(new h(i3.i.class, new g(InterfaceC0586a.class)), true);
        b3.p.f(new j(i3.l.class, new i(InterfaceC0586a.class)), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            b3.p.f(new l(i3.n.class, new k(InterfaceC0586a.class)), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        b3.p.f(new n(i3.r.class, new m(InterfaceC0586a.class)), true);
        b3.p.f(new p(C0812A.class, new o(InterfaceC0586a.class)), true);
        b3.p.f(new s(C.class, new r(InterfaceC0586a.class)), true);
        b3.p.f(new u(F.class, new t(InterfaceC0586a.class)), true);
        b3.p.g(new b());
    }
}
