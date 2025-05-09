package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCtrKeyFormat.java */
/* renamed from: i3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820g extends GeneratedMessageLite<C0820g, a> implements J {
    private static final C0820g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Q<C0820g> PARSER;
    private int keySize_;
    private h params_;

    /* compiled from: AesCtrKeyFormat.java */
    /* renamed from: i3.g$a */
    public static final class a extends GeneratedMessageLite.a<C0820g, a> implements J {
    }

    static {
        C0820g c0820g = new C0820g();
        DEFAULT_INSTANCE = c0820g;
        GeneratedMessageLite.r(C0820g.class, c0820g);
    }

    public static C0820g s() {
        return DEFAULT_INSTANCE;
    }

    public static C0820g v(ByteString byteString, C0666m c0666m) {
        return (C0820g) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new C0820g();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0820g> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0820g.class) {
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

    public final int t() {
        return this.keySize_;
    }

    public final h u() {
        h hVar = this.params_;
        return hVar == null ? h.s() : hVar;
    }
}
