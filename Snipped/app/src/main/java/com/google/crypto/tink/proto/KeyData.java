package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C0673u;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.V;

/* loaded from: classes.dex */
public final class KeyData extends GeneratedMessageLite<KeyData, a> implements J {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile Q<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f10084b;

    public enum KeyMaterialType implements C0673u.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* renamed from: a, reason: collision with root package name */
        public final int f10063a;

        KeyMaterialType(int i) {
            this.f10063a = i;
        }

        public static KeyMaterialType a(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C0673u.a
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f10063a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class a extends GeneratedMessageLite.a<KeyData, a> implements J {
        public a() {
            super(KeyData.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.r(KeyData.class, keyData);
    }

    public static a A() {
        return DEFAULT_INSTANCE.j();
    }

    public static void t(KeyData keyData, String str) {
        keyData.getClass();
        str.getClass();
        keyData.typeUrl_ = str;
    }

    public static void u(KeyData keyData, ByteString byteString) {
        keyData.getClass();
        byteString.getClass();
        keyData.value_ = byteString;
    }

    public static void v(KeyData keyData, KeyMaterialType keyMaterialType) {
        keyData.getClass();
        keyData.keyMaterialType_ = keyMaterialType.getNumber();
    }

    public static KeyData w() {
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
                return new V(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new KeyData();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q<KeyData> q10 = PARSER;
                if (q10 == null) {
                    synchronized (KeyData.class) {
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

    public final KeyMaterialType x() {
        KeyMaterialType a10 = KeyMaterialType.a(this.keyMaterialType_);
        return a10 == null ? KeyMaterialType.UNRECOGNIZED : a10;
    }

    public final String y() {
        return this.typeUrl_;
    }

    public final ByteString z() {
        return this.value_;
    }
}
