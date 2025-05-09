package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: HmacKey.java */
/* loaded from: classes.dex */
public final class u extends GeneratedMessageLite<u, a> implements J {
    private static final u DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Q<u> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f10084b;
    private w params_;
    private int version_;

    /* compiled from: HmacKey.java */
    public static final class a extends GeneratedMessageLite.a<u, a> implements J {
        public a() {
            super(u.DEFAULT_INSTANCE);
        }
    }

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        GeneratedMessageLite.r(u.class, uVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.j();
    }

    public static u B(ByteString byteString, C0666m c0666m) {
        return (u) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    public static void t(u uVar) {
        uVar.version_ = 0;
    }

    public static void u(u uVar, w wVar) {
        uVar.getClass();
        wVar.getClass();
        uVar.params_ = wVar;
    }

    public static void v(u uVar, ByteString byteString) {
        uVar.getClass();
        uVar.keyValue_ = byteString;
    }

    public static u w() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new u();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<u> q10 = PARSER;
                if (q10 == null) {
                    synchronized (u.class) {
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

    public final ByteString x() {
        return this.keyValue_;
    }

    public final w y() {
        w wVar = this.params_;
        return wVar == null ? w.s() : wVar;
    }

    public final int z() {
        return this.version_;
    }
}
