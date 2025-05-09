package i3;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.U;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: KeysetInfo.java */
/* loaded from: classes.dex */
public final class z extends GeneratedMessageLite<z, a> implements J {
    private static final z DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Q<z> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C0673u.c<b> keyInfo_ = U.f10161d;
    private int primaryKeyId_;

    /* compiled from: KeysetInfo.java */
    public static final class a extends GeneratedMessageLite.a<z, a> implements J {
        public a() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: KeysetInfo.java */
    public static final class b extends GeneratedMessageLite<b, a> implements J {
        private static final b DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Q<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* compiled from: KeysetInfo.java */
        public static final class a extends GeneratedMessageLite.a<b, a> implements J {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.r(b.class, bVar);
        }

        public static void t(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.typeUrl_ = str;
        }

        public static void u(b bVar, OutputPrefixType outputPrefixType) {
            bVar.getClass();
            bVar.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void v(b bVar, KeyStatusType keyStatusType) {
            bVar.getClass();
            bVar.status_ = keyStatusType.getNumber();
        }

        public static void w(b bVar, int i) {
            bVar.keyId_ = i;
        }

        public static a y() {
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
                    return new V(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new b();
                case 4:
                    return new a();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    Q<b> q10 = PARSER;
                    if (q10 == null) {
                        synchronized (b.class) {
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

        public final int x() {
            return this.keyId_;
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        GeneratedMessageLite.r(z.class, zVar);
    }

    public static void t(z zVar, int i) {
        zVar.primaryKeyId_ = i;
    }

    public static void u(z zVar, b bVar) {
        zVar.getClass();
        if (!zVar.keyInfo_.k0()) {
            C0673u.c<b> cVar = zVar.keyInfo_;
            int size = cVar.size();
            zVar.keyInfo_ = cVar.p(size == 0 ? 10 : size * 2);
        }
        zVar.keyInfo_.add(bVar);
    }

    public static a w() {
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", b.class});
            case 3:
                return new z();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<z> q10 = PARSER;
                if (q10 == null) {
                    synchronized (z.class) {
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

    public final b v() {
        return this.keyInfo_.get(0);
    }
}
