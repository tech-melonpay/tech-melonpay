package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCtrKey.java */
/* renamed from: i3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819f extends GeneratedMessageLite<C0819f, a> implements J {
    private static final C0819f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Q<C0819f> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f10084b;
    private h params_;
    private int version_;

    /* compiled from: AesCtrKey.java */
    /* renamed from: i3.f$a */
    public static final class a extends GeneratedMessageLite.a<C0819f, a> implements J {
        public a() {
            super(C0819f.DEFAULT_INSTANCE);
        }
    }

    static {
        C0819f c0819f = new C0819f();
        DEFAULT_INSTANCE = c0819f;
        GeneratedMessageLite.r(C0819f.class, c0819f);
    }

    public static a A() {
        return DEFAULT_INSTANCE.j();
    }

    public static C0819f B(ByteString byteString, C0666m c0666m) {
        return (C0819f) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    public static void t(C0819f c0819f) {
        c0819f.version_ = 0;
    }

    public static void u(C0819f c0819f, h hVar) {
        c0819f.getClass();
        hVar.getClass();
        c0819f.params_ = hVar;
    }

    public static void v(C0819f c0819f, ByteString byteString) {
        c0819f.getClass();
        c0819f.keyValue_ = byteString;
    }

    public static C0819f w() {
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
                return new C0819f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0819f> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0819f.class) {
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

    public final h y() {
        h hVar = this.params_;
        return hVar == null ? h.s() : hVar;
    }

    public final int z() {
        return this.version_;
    }
}
