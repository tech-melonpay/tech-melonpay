package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: KmsAeadKeyFormat.java */
/* renamed from: i3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813B extends GeneratedMessageLite<C0813B, a> implements J {
    private static final C0813B DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile Q<C0813B> PARSER;
    private String keyUri_ = "";

    /* compiled from: KmsAeadKeyFormat.java */
    /* renamed from: i3.B$a */
    public static final class a extends GeneratedMessageLite.a<C0813B, a> implements J {
    }

    static {
        C0813B c0813b = new C0813B();
        DEFAULT_INSTANCE = c0813b;
        GeneratedMessageLite.r(C0813B.class, c0813b);
    }

    public static C0813B s() {
        return DEFAULT_INSTANCE;
    }

    public static C0813B u(ByteString byteString, C0666m c0666m) {
        return (C0813B) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new C0813B();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0813B> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0813B.class) {
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

    public final String t() {
        return this.keyUri_;
    }
}
