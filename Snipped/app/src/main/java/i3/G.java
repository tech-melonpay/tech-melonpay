package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: XChaCha20Poly1305KeyFormat.java */
/* loaded from: classes.dex */
public final class G extends GeneratedMessageLite<G, a> implements J {
    private static final G DEFAULT_INSTANCE;
    private static volatile Q<G> PARSER;

    /* compiled from: XChaCha20Poly1305KeyFormat.java */
    public static final class a extends GeneratedMessageLite.a<G, a> implements J {
    }

    static {
        G g10 = new G();
        DEFAULT_INSTANCE = g10;
        GeneratedMessageLite.r(G.class, g10);
    }

    public static G s(ByteString byteString, C0666m c0666m) {
        return (G) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new G();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<G> q10 = PARSER;
                if (q10 == null) {
                    synchronized (G.class) {
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
