package e3;

import b3.f;
import b3.p;
import e3.C0712a;
import i3.E;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: DeterministicAeadConfig.java */
/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20507a = 0;

    static {
        f.b[] bVarArr = {new C0712a.C0393a(b3.c.class)};
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
            p.f(new C0712a(), true);
            p.g(new C0714c());
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
