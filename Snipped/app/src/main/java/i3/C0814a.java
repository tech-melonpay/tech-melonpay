package i3;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0666m;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCmacKey.java */
/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814a extends GeneratedMessageLite<C0814a, C0406a> implements J {
    private static final C0814a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Q<C0814a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.f10084b;
    private C0816c params_;
    private int version_;

    /* compiled from: AesCmacKey.java */
    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public static final class C0406a extends GeneratedMessageLite.a<C0814a, C0406a> implements J {
        public C0406a() {
            super(C0814a.DEFAULT_INSTANCE);
        }
    }

    static {
        C0814a c0814a = new C0814a();
        DEFAULT_INSTANCE = c0814a;
        GeneratedMessageLite.r(C0814a.class, c0814a);
    }

    public static C0814a A(ByteString byteString, C0666m c0666m) {
        return (C0814a) GeneratedMessageLite.o(DEFAULT_INSTANCE, byteString, c0666m);
    }

    public static void t(C0814a c0814a) {
        c0814a.version_ = 0;
    }

    public static void u(C0814a c0814a, ByteString byteString) {
        c0814a.getClass();
        c0814a.keyValue_ = byteString;
    }

    public static void v(C0814a c0814a, C0816c c0816c) {
        c0814a.getClass();
        c0816c.getClass();
        c0814a.params_ = c0816c;
    }

    public static C0406a z() {
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0814a();
            case 4:
                return new C0406a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0814a> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0814a.class) {
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

    public final ByteString w() {
        return this.keyValue_;
    }

    public final C0816c x() {
        C0816c c0816c = this.params_;
        return c0816c == null ? C0816c.s() : c0816c;
    }

    public final int y() {
        return this.version_;
    }
}
