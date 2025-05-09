package b3;

import b3.f;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* compiled from: KeyManagerImpl.java */
/* loaded from: classes.dex */
public final class d<PrimitiveT, KeyProtoT extends I> {

    /* renamed from: a, reason: collision with root package name */
    public final f<KeyProtoT> f8289a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f8290b;

    public d(f<KeyProtoT> fVar, Class<PrimitiveT> cls) {
        if (!fVar.f8293b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(s3.b.k("Given internalKeyMananger ", fVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f8289a = fVar;
        this.f8290b = cls;
    }

    public final KeyData a(ByteString byteString) {
        f<KeyProtoT> fVar = this.f8289a;
        try {
            f.a<?, KeyProtoT> c2 = fVar.c();
            Object b9 = c2.b(byteString);
            c2.c(b9);
            KeyProtoT a10 = c2.a(b9);
            KeyData.a A10 = KeyData.A();
            String a11 = fVar.a();
            A10.i();
            KeyData.t((KeyData) A10.f10116b, a11);
            ByteString c10 = a10.c();
            A10.i();
            KeyData.u((KeyData) A10.f10116b, c10);
            KeyData.KeyMaterialType d10 = fVar.d();
            A10.i();
            KeyData.v((KeyData) A10.f10116b, d10);
            return A10.g();
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }
}
