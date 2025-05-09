package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: KmsAeadKey.java */
/* renamed from: i3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812A extends GeneratedMessageLite<C0812A, a> implements J {
    private static final C0812A DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Q<C0812A> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0813B params_;
    private int version_;

    /* compiled from: KmsAeadKey.java */
    /* renamed from: i3.A$a */
    public static final class a extends GeneratedMessageLite.a<C0812A, a> implements J {
        public a() {
            super(C0812A.DEFAULT_INSTANCE);
        }
    }

    static {
        C0812A c0812a = new C0812A();
        DEFAULT_INSTANCE = c0812a;
        GeneratedMessageLite.r(C0812A.class, c0812a);
    }

    public static void t(C0812A c0812a) {
        c0812a.version_ = 0;
    }

    public static void u(C0812A c0812a, C0813B c0813b) {
        c0812a.getClass();
        c0813b.getClass();
        c0812a.params_ = c0813b;
    }

    public static a x() {
        return DEFAULT_INSTANCE.j();
    }

    public static C0812A y(ByteString byteString, C0666m c0666m) {
        return (C0812A) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
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
                return new C0812A();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0812A> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0812A.class) {
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

    public final C0813B v() {
        C0813B c0813b = this.params_;
        return c0813b == null ? C0813B.s() : c0813b;
    }

    public final int w() {
        return this.version_;
    }
}
