package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesEaxKey.java */
/* loaded from: classes.dex */
public final class i extends GeneratedMessageLite<i, a> implements J {
    private static final i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Q<i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f10084b;
    private k params_;
    private int version_;

    /* compiled from: AesEaxKey.java */
    public static final class a extends GeneratedMessageLite.a<i, a> implements J {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.r(i.class, iVar);
    }

    public static i A(ByteString byteString, C0666m c0666m) {
        return (i) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    public static void t(i iVar) {
        iVar.version_ = 0;
    }

    public static void u(i iVar, k kVar) {
        iVar.getClass();
        kVar.getClass();
        iVar.params_ = kVar;
    }

    public static void v(i iVar, ByteString byteString) {
        iVar.getClass();
        iVar.keyValue_ = byteString;
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new i();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<i> q10 = PARSER;
                if (q10 == null) {
                    synchronized (i.class) {
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

    public final ByteString w() {
        return this.keyValue_;
    }

    public final k x() {
        k kVar = this.params_;
        return kVar == null ? k.s() : kVar;
    }

    public final int y() {
        return this.version_;
    }
}
