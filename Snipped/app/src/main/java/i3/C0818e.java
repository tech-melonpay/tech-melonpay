package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCtrHmacAeadKeyFormat.java */
/* renamed from: i3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818e extends GeneratedMessageLite<C0818e, a> implements J {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C0818e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile Q<C0818e> PARSER;
    private C0820g aesCtrKeyFormat_;
    private v hmacKeyFormat_;

    /* compiled from: AesCtrHmacAeadKeyFormat.java */
    /* renamed from: i3.e$a */
    public static final class a extends GeneratedMessageLite.a<C0818e, a> implements J {
    }

    static {
        C0818e c0818e = new C0818e();
        DEFAULT_INSTANCE = c0818e;
        GeneratedMessageLite.r(C0818e.class, c0818e);
    }

    public static C0818e u(ByteString byteString, C0666m c0666m) {
        return (C0818e) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new C0818e();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0818e> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0818e.class) {
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

    public final C0820g s() {
        C0820g c0820g = this.aesCtrKeyFormat_;
        return c0820g == null ? C0820g.s() : c0820g;
    }

    public final v t() {
        v vVar = this.hmacKeyFormat_;
        return vVar == null ? v.s() : vVar;
    }
}
