package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: KmsEnvelopeAeadKeyFormat.java */
/* loaded from: classes.dex */
public final class D extends GeneratedMessageLite<D, a> implements J {
    private static final D DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile Q<D> PARSER;
    private x dekTemplate_;
    private String kekUri_ = "";

    /* compiled from: KmsEnvelopeAeadKeyFormat.java */
    public static final class a extends GeneratedMessageLite.a<D, a> implements J {
    }

    static {
        D d10 = new D();
        DEFAULT_INSTANCE = d10;
        GeneratedMessageLite.r(D.class, d10);
    }

    public static D s() {
        return DEFAULT_INSTANCE;
    }

    public static D v(ByteString byteString, C0666m c0666m) {
        return (D) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new D();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<D> q10 = PARSER;
                if (q10 == null) {
                    synchronized (D.class) {
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

    public final x t() {
        x xVar = this.dekTemplate_;
        return xVar == null ? x.w() : xVar;
    }

    public final String u() {
        return this.kekUri_;
    }
}
