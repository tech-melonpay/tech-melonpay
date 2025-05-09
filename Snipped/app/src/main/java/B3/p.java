package b3;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import i3.x;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f8309a = Logger.getLogger(p.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f8310b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f8311c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f8312d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f8313e;

    /* compiled from: Registry.java */
    public interface a {
        d a(Class cls);

        d b();

        Class<?> c();

        Set<Class<?>> d();
    }

    static {
        new ConcurrentHashMap();
        f8313e = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Class<?> cls, boolean z10) {
        synchronized (p.class) {
            ConcurrentHashMap concurrentHashMap = f8310b;
            if (concurrentHashMap.containsKey(str)) {
                a aVar = (a) concurrentHashMap.get(str);
                if (aVar.c().equals(cls)) {
                    if (z10 && !((Boolean) f8312d.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    return;
                }
                f8309a.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + aVar.c().getName() + ", cannot be re-registered with " + cls.getName());
            }
        }
    }

    public static synchronized a b(String str) {
        a aVar;
        synchronized (p.class) {
            ConcurrentHashMap concurrentHashMap = f8310b;
            if (!concurrentHashMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            aVar = (a) concurrentHashMap.get(str);
        }
        return aVar;
    }

    public static Object c(String str, byte[] bArr) {
        ByteString byteString = ByteString.f10084b;
        return d(str, ByteString.c(0, bArr.length, bArr), InterfaceC0586a.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> P d(String str, ByteString byteString, Class<P> cls) {
        a b9 = b(str);
        if (b9.d().contains(cls)) {
            d a10 = b9.a(cls);
            f<KeyProtoT> fVar = a10.f8289a;
            try {
                I e10 = fVar.e(byteString);
                GenericDeclaration genericDeclaration = a10.f8290b;
                if (Void.class.equals(genericDeclaration)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                fVar.f(e10);
                return (P) fVar.b(e10, genericDeclaration);
            } catch (InvalidProtocolBufferException e11) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(fVar.f8292a.getName()), e11);
            }
        }
        StringBuilder sb2 = new StringBuilder("Primitive type ");
        sb2.append(cls.getName());
        sb2.append(" not supported by key manager of type ");
        sb2.append(b9.c());
        sb2.append(", supported primitives: ");
        Set<Class<?>> d10 = b9.d();
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls2 : d10) {
            if (!z10) {
                sb3.append(", ");
            }
            sb3.append(cls2.getCanonicalName());
            z10 = false;
        }
        sb2.append(sb3.toString());
        throw new GeneralSecurityException(sb2.toString());
    }

    public static synchronized KeyData e(x xVar) {
        KeyData a10;
        synchronized (p.class) {
            d b9 = b(xVar.y()).b();
            if (!((Boolean) f8312d.get(xVar.y())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + xVar.y());
            }
            a10 = b9.a(xVar.z());
        }
        return a10;
    }

    public static synchronized <KeyProtoT extends I> void f(f<KeyProtoT> fVar, boolean z10) {
        synchronized (p.class) {
            try {
                String a10 = fVar.a();
                a(a10, fVar.getClass(), z10);
                ConcurrentHashMap concurrentHashMap = f8310b;
                if (!concurrentHashMap.containsKey(a10)) {
                    concurrentHashMap.put(a10, new n(fVar));
                    f8311c.put(a10, new o());
                }
                f8312d.put(a10, Boolean.valueOf(z10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized <B, P> void g(m<B, P> mVar) {
        synchronized (p.class) {
            try {
                Class<P> b9 = mVar.b();
                ConcurrentHashMap concurrentHashMap = f8313e;
                if (concurrentHashMap.containsKey(b9)) {
                    m mVar2 = (m) concurrentHashMap.get(b9);
                    if (!mVar.getClass().equals(mVar2.getClass())) {
                        f8309a.warning("Attempted overwrite of a registered SetWrapper for type " + b9);
                        throw new GeneralSecurityException("SetWrapper for primitive (" + b9.getName() + ") is already registered to be " + mVar2.getClass().getName() + ", cannot be re-registered with " + mVar.getClass().getName());
                    }
                }
                concurrentHashMap.put(b9, mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
