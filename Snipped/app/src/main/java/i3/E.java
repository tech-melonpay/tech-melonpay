package i3;

import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.U;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: RegistryConfig.java */
@Deprecated
/* loaded from: classes.dex */
public final class E extends GeneratedMessageLite<E, a> implements J {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final E DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile Q<E> PARSER;
    private String configName_ = "";
    private C0673u.c<y> entry_ = U.f10161d;

    /* compiled from: RegistryConfig.java */
    public static final class a extends GeneratedMessageLite.a<E, a> implements J {
    }

    static {
        E e10 = new E();
        DEFAULT_INSTANCE = e10;
        GeneratedMessageLite.r(E.class, e10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", y.class});
            case 3:
                return new E();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<E> q10 = PARSER;
                if (q10 == null) {
                    synchronized (E.class) {
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
}
