package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.U;
import com.google.crypto.tink.shaded.protobuf.V;
import java.util.List;

/* compiled from: Keyset.java */
/* loaded from: classes.dex */
public final class a extends GeneratedMessageLite<a, C0107a> implements J {
    private static final a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Q<a> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C0673u.c<b> key_ = U.f10161d;
    private int primaryKeyId_;

    /* compiled from: Keyset.java */
    /* renamed from: com.google.crypto.tink.proto.a$a, reason: collision with other inner class name */
    public static final class C0107a extends GeneratedMessageLite.a<a, C0107a> implements J {
        public C0107a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: Keyset.java */
    public static final class b extends GeneratedMessageLite<b, C0108a> implements J {
        private static final b DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Q<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* compiled from: Keyset.java */
        /* renamed from: com.google.crypto.tink.proto.a$b$a, reason: collision with other inner class name */
        public static final class C0108a extends GeneratedMessageLite.a<b, C0108a> implements J {
            public C0108a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.r(b.class, bVar);
        }

        public static C0108a C() {
            return DEFAULT_INSTANCE.j();
        }

        public static void t(b bVar, KeyData keyData) {
            bVar.getClass();
            bVar.keyData_ = keyData;
        }

        public static void u(b bVar, OutputPrefixType outputPrefixType) {
            bVar.getClass();
            bVar.outputPrefixType_ = outputPrefixType.getNumber();
        }

        public static void v(b bVar) {
            KeyStatusType keyStatusType = KeyStatusType.ENABLED;
            bVar.getClass();
            bVar.status_ = keyStatusType.getNumber();
        }

        public static void w(b bVar, int i) {
            bVar.keyId_ = i;
        }

        public final KeyStatusType A() {
            int i = this.status_;
            KeyStatusType keyStatusType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : KeyStatusType.DESTROYED : KeyStatusType.DISABLED : KeyStatusType.ENABLED : KeyStatusType.UNKNOWN_STATUS;
            return keyStatusType == null ? KeyStatusType.UNRECOGNIZED : keyStatusType;
        }

        public final boolean B() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new V(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new b();
                case 4:
                    return new C0108a();
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

        public final KeyData x() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.w() : keyData;
        }

        public final int y() {
            return this.keyId_;
        }

        public final OutputPrefixType z() {
            OutputPrefixType a10 = OutputPrefixType.a(this.outputPrefixType_);
            return a10 == null ? OutputPrefixType.UNRECOGNIZED : a10;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.r(a.class, aVar);
    }

    public static a A(byte[] bArr, C0666m c0666m) {
        return (a) GeneratedMessageLite.p(DEFAULT_INSTANCE, bArr, c0666m);
    }

    public static void t(a aVar, int i) {
        aVar.primaryKeyId_ = i;
    }

    public static void u(a aVar, b bVar) {
        aVar.getClass();
        if (!aVar.key_.k0()) {
            C0673u.c<b> cVar = aVar.key_;
            int size = cVar.size();
            aVar.key_ = cVar.p(size == 0 ? 10 : size * 2);
        }
        aVar.key_.add(bVar);
    }

    public static C0107a z() {
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", b.class});
            case 3:
                return new a();
            case 4:
                return new C0107a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<a> q10 = PARSER;
                if (q10 == null) {
                    synchronized (a.class) {
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

    public final b v(int i) {
        return this.key_.get(i);
    }

    public final int w() {
        return this.key_.size();
    }

    public final List<b> x() {
        return this.key_;
    }

    public final int y() {
        return this.primaryKeyId_;
    }
}
