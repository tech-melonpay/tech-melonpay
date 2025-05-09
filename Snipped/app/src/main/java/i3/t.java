package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: EncryptedKeyset.java */
/* loaded from: classes.dex */
public final class t extends GeneratedMessageLite<t, a> implements J {
    private static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile Q<t> PARSER;
    private ByteString encryptedKeyset_ = ByteString.f10084b;
    private z keysetInfo_;

    /* compiled from: EncryptedKeyset.java */
    public static final class a extends GeneratedMessageLite.a<t, a> implements J {
        public a() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        GeneratedMessageLite.r(t.class, tVar);
    }

    public static void t(t tVar, ByteString byteString) {
        tVar.getClass();
        tVar.encryptedKeyset_ = byteString;
    }

    public static void u(t tVar, z zVar) {
        tVar.getClass();
        tVar.keysetInfo_ = zVar;
    }

    public static a w() {
        return DEFAULT_INSTANCE.j();
    }

    public static t x(byte[] bArr, C0666m c0666m) {
        return (t) GeneratedMessageLite.p(DEFAULT_INSTANCE, bArr, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new t();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<t> q10 = PARSER;
                if (q10 == null) {
                    synchronized (t.class) {
                        try {
                            q10 = PARSER;
                            if (q10 == null) {
                                q10 = new GeneratedMessageLite.b<>();
                                PARSER = q10;
                            }
                        } finally {
                        }
                    }
                }
                return q10;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final ByteString v() {
        return this.encryptedKeyset_;
    }
}
