package i3;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: KeyTemplate.java */
/* loaded from: classes.dex */
public final class x extends GeneratedMessageLite<x, a> implements J {
    private static final x DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile Q<x> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f10084b;

    /* compiled from: KeyTemplate.java */
    public static final class a extends GeneratedMessageLite.a<x, a> implements J {
        public a() {
            super(x.DEFAULT_INSTANCE);
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        GeneratedMessageLite.r(x.class, xVar);
    }

    public static a A() {
        return DEFAULT_INSTANCE.j();
    }

    public static void t(x xVar, String str) {
        xVar.getClass();
        xVar.typeUrl_ = str;
    }

    public static void u(x xVar, ByteString byteString) {
        xVar.getClass();
        xVar.value_ = byteString;
    }

    public static void v(x xVar, OutputPrefixType outputPrefixType) {
        xVar.getClass();
        xVar.outputPrefixType_ = outputPrefixType.getNumber();
    }

    public static x w() {
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new x();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<x> q10 = PARSER;
                if (q10 == null) {
                    synchronized (x.class) {
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

    public final OutputPrefixType x() {
        OutputPrefixType a10 = OutputPrefixType.a(this.outputPrefixType_);
        return a10 == null ? OutputPrefixType.UNRECOGNIZED : a10;
    }

    public final String y() {
        return this.typeUrl_;
    }

    public final ByteString z() {
        return this.value_;
    }
}
