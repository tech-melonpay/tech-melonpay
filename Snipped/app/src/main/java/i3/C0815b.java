package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCmacKeyFormat.java */
/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815b extends GeneratedMessageLite<C0815b, a> implements J {
    private static final C0815b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Q<C0815b> PARSER;
    private int keySize_;
    private C0816c params_;

    /* compiled from: AesCmacKeyFormat.java */
    /* renamed from: i3.b$a */
    public static final class a extends GeneratedMessageLite.a<C0815b, a> implements J {
    }

    static {
        C0815b c0815b = new C0815b();
        DEFAULT_INSTANCE = c0815b;
        GeneratedMessageLite.r(C0815b.class, c0815b);
    }

    public static C0815b u(ByteString byteString, C0666m c0666m) {
        return (C0815b) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new C0815b();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0815b> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0815b.class) {
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

    public final int s() {
        return this.keySize_;
    }

    public final C0816c t() {
        C0816c c0816c = this.params_;
        return c0816c == null ? C0816c.s() : c0816c;
    }
}
