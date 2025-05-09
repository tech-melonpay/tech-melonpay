package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: KmsEnvelopeAeadKey.java */
/* loaded from: classes.dex */
public final class C extends GeneratedMessageLite<C, a> implements J {
    private static final C DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Q<C> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private D params_;
    private int version_;

    /* compiled from: KmsEnvelopeAeadKey.java */
    public static final class a extends GeneratedMessageLite.a<C, a> implements J {
        public a() {
            super(C.DEFAULT_INSTANCE);
        }
    }

    static {
        C c2 = new C();
        DEFAULT_INSTANCE = c2;
        GeneratedMessageLite.r(C.class, c2);
    }

    public static void t(C c2) {
        c2.version_ = 0;
    }

    public static void u(C c2, D d10) {
        c2.getClass();
        d10.getClass();
        c2.params_ = d10;
    }

    public static a x() {
        return DEFAULT_INSTANCE.j();
    }

    public static C y(ByteString byteString, C0666m c0666m) {
        return (C) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new C();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C.class) {
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

    public final D v() {
        D d10 = this.params_;
        return d10 == null ? D.s() : d10;
    }

    public final int w() {
        return this.version_;
    }
}
