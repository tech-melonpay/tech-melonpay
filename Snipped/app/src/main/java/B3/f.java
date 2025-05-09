package b3;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.I;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeyTypeManager.java */
/* loaded from: classes.dex */
public abstract class f<KeyProtoT extends I> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<KeyProtoT> f8292a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, b<?, KeyProtoT>> f8293b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f8294c;

    /* compiled from: KeyTypeManager.java */
    public static abstract class a<KeyFormatProtoT extends I, KeyT> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<KeyFormatProtoT> f8295a;

        public a(Class<KeyFormatProtoT> cls) {
            this.f8295a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot);

        public abstract KeyFormatProtoT b(ByteString byteString);

        public abstract void c(KeyFormatProtoT keyformatprotot);
    }

    /* compiled from: KeyTypeManager.java */
    public static abstract class b<PrimitiveT, KeyT> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<PrimitiveT> f8296a;

        public b(Class<PrimitiveT> cls) {
            this.f8296a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt);
    }

    @SafeVarargs
    public f(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.f8292a = cls;
        HashMap hashMap = new HashMap();
        for (b<?, KeyProtoT> bVar : bVarArr) {
            boolean containsKey = hashMap.containsKey(bVar.f8296a);
            Class<?> cls2 = bVar.f8296a;
            if (containsKey) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.a.i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls2, bVar);
        }
        if (bVarArr.length > 0) {
            this.f8294c = bVarArr[0].f8296a;
        } else {
            this.f8294c = Void.class;
        }
        this.f8293b = Collections.unmodifiableMap(hashMap);
    }

    public abstract String a();

    public final <P> P b(KeyProtoT keyprotot, Class<P> cls) {
        b<?, KeyProtoT> bVar = this.f8293b.get(cls);
        if (bVar != null) {
            return (P) bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> c();

    public abstract KeyData.KeyMaterialType d();

    public abstract KeyProtoT e(ByteString byteString);

    public abstract void f(KeyProtoT keyprotot);
}
