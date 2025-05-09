package g3;

import b3.f;
import b3.k;
import b3.p;
import g3.C0762c;
import i3.C0814a;
import i3.E;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MacConfig.java */
/* renamed from: g3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763d {
    static {
        f.b[] bVarArr = {new C0762c.a(k.class)};
        HashMap hashMap = new HashMap();
        f.b bVar = bVarArr[0];
        boolean containsKey = hashMap.containsKey(bVar.f8296a);
        Class<PrimitiveT> cls = bVar.f8296a;
        if (containsKey) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        hashMap.put(cls, bVar);
        GenericDeclaration genericDeclaration = bVarArr[0].f8296a;
        Collections.unmodifiableMap(hashMap);
        int i = E.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        p.f(new C0762c(), true);
        p.f(new C0761b(C0814a.class, new C0760a(k.class)), true);
        p.g(new C0764e());
    }
}
