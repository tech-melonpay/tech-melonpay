package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCtrHmacAeadKey.java */
/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817d extends GeneratedMessageLite<C0817d, a> implements J {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0817d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Q<C0817d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0819f aesCtrKey_;
    private u hmacKey_;
    private int version_;

    /* compiled from: AesCtrHmacAeadKey.java */
    /* renamed from: i3.d$a */
    public static final class a extends GeneratedMessageLite.a<C0817d, a> implements J {
        public a() {
            super(C0817d.DEFAULT_INSTANCE);
        }
    }

    static {
        C0817d c0817d = new C0817d();
        DEFAULT_INSTANCE = c0817d;
        GeneratedMessageLite.r(C0817d.class, c0817d);
    }

    public static C0817d A(ByteString byteString, C0666m c0666m) {
        return (C0817d) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    public static void t(C0817d c0817d) {
        c0817d.version_ = 0;
    }

    public static void u(C0817d c0817d, C0819f c0819f) {
        c0817d.getClass();
        c0819f.getClass();
        c0817d.aesCtrKey_ = c0819f;
    }

    public static void v(C0817d c0817d, u uVar) {
        c0817d.getClass();
        uVar.getClass();
        c0817d.hmacKey_ = uVar;
    }

    public static a z() {
        return DEFAULT_INSTANCE.j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new C0817d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0817d> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0817d.class) {
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

    public final C0819f w() {
        C0819f c0819f = this.aesCtrKey_;
        return c0819f == null ? C0819f.w() : c0819f;
    }

    public final u x() {
        u uVar = this.hmacKey_;
        return uVar == null ? u.w() : uVar;
    }

    public final int y() {
        return this.version_;
    }
}
