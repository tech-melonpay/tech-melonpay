package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: XChaCha20Poly1305Key.java */
/* loaded from: classes.dex */
public final class F extends GeneratedMessageLite<F, a> implements J {
    private static final F DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Q<F> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f10084b;
    private int version_;

    /* compiled from: XChaCha20Poly1305Key.java */
    public static final class a extends GeneratedMessageLite.a<F, a> implements J {
        public a() {
            super(F.DEFAULT_INSTANCE);
        }
    }

    static {
        F f10 = new F();
        DEFAULT_INSTANCE = f10;
        GeneratedMessageLite.r(F.class, f10);
    }

    public static void t(F f10) {
        f10.version_ = 0;
    }

    public static void u(F f10, ByteString byteString) {
        f10.getClass();
        f10.keyValue_ = byteString;
    }

    public static a x() {
        return DEFAULT_INSTANCE.j();
    }

    public static F y(ByteString byteString, C0666m c0666m) {
        return (F) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new F();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<F> q10 = PARSER;
                if (q10 == null) {
                    synchronized (F.class) {
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
        return this.keyValue_;
    }

    public final int w() {
        return this.version_;
    }
}
