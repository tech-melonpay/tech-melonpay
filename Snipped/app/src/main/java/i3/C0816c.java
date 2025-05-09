package i3;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* compiled from: AesCmacParams.java */
/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816c extends GeneratedMessageLite<C0816c, a> implements J {
    private static final C0816c DEFAULT_INSTANCE;
    private static volatile Q<C0816c> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* compiled from: AesCmacParams.java */
    /* renamed from: i3.c$a */
    public static final class a extends GeneratedMessageLite.a<C0816c, a> implements J {
    }

    static {
        C0816c c0816c = new C0816c();
        DEFAULT_INSTANCE = c0816c;
        GeneratedMessageLite.r(C0816c.class, c0816c);
    }

    public static C0816c s() {
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new C0816c();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<C0816c> q10 = PARSER;
                if (q10 == null) {
                    synchronized (C0816c.class) {
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
        return this.tagSize_;
    }
}
