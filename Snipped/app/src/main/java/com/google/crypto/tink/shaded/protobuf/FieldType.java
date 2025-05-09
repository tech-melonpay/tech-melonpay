package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class FieldType {

    /* renamed from: b, reason: collision with root package name */
    public static final FieldType f10098b;

    /* renamed from: c, reason: collision with root package name */
    public static final FieldType f10099c;

    /* renamed from: d, reason: collision with root package name */
    public static final FieldType[] f10100d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FieldType[] f10101e;

    /* renamed from: a, reason: collision with root package name */
    public final int f10102a;

    /* JADX INFO: Fake field, exist only in values array */
    FieldType EF0;

    public enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        Collection(boolean z10) {
        }
    }

    static {
        Collection collection = Collection.SCALAR;
        JavaType javaType = JavaType.DOUBLE;
        FieldType fieldType = new FieldType("DOUBLE", 0, 0, collection, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FieldType fieldType2 = new FieldType("FLOAT", 1, 1, collection, javaType2);
        JavaType javaType3 = JavaType.LONG;
        FieldType fieldType3 = new FieldType("INT64", 2, 2, collection, javaType3);
        FieldType fieldType4 = new FieldType("UINT64", 3, 3, collection, javaType3);
        JavaType javaType4 = JavaType.INT;
        FieldType fieldType5 = new FieldType("INT32", 4, 4, collection, javaType4);
        FieldType fieldType6 = new FieldType("FIXED64", 5, 5, collection, javaType3);
        FieldType fieldType7 = new FieldType("FIXED32", 6, 6, collection, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        FieldType fieldType8 = new FieldType("BOOL", 7, 7, collection, javaType5);
        JavaType javaType6 = JavaType.STRING;
        FieldType fieldType9 = new FieldType("STRING", 8, 8, collection, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        FieldType fieldType10 = new FieldType("MESSAGE", 9, 9, collection, javaType7);
        JavaType javaType8 = JavaType.BYTE_STRING;
        FieldType fieldType11 = new FieldType("BYTES", 10, 10, collection, javaType8);
        FieldType fieldType12 = new FieldType("UINT32", 11, 11, collection, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        FieldType fieldType13 = new FieldType("ENUM", 12, 12, collection, javaType9);
        FieldType fieldType14 = new FieldType("SFIXED32", 13, 13, collection, javaType4);
        FieldType fieldType15 = new FieldType("SFIXED64", 14, 14, collection, javaType3);
        FieldType fieldType16 = new FieldType("SINT32", 15, 15, collection, javaType4);
        FieldType fieldType17 = new FieldType("SINT64", 16, 16, collection, javaType3);
        FieldType fieldType18 = new FieldType("GROUP", 17, 17, collection, javaType7);
        Collection collection2 = Collection.VECTOR;
        FieldType fieldType19 = new FieldType("DOUBLE_LIST", 18, 18, collection2, javaType);
        FieldType fieldType20 = new FieldType("FLOAT_LIST", 19, 19, collection2, javaType2);
        FieldType fieldType21 = new FieldType("INT64_LIST", 20, 20, collection2, javaType3);
        FieldType fieldType22 = new FieldType("UINT64_LIST", 21, 21, collection2, javaType3);
        FieldType fieldType23 = new FieldType("INT32_LIST", 22, 22, collection2, javaType4);
        FieldType fieldType24 = new FieldType("FIXED64_LIST", 23, 23, collection2, javaType3);
        FieldType fieldType25 = new FieldType("FIXED32_LIST", 24, 24, collection2, javaType4);
        FieldType fieldType26 = new FieldType("BOOL_LIST", 25, 25, collection2, javaType5);
        FieldType fieldType27 = new FieldType("STRING_LIST", 26, 26, collection2, javaType6);
        FieldType fieldType28 = new FieldType("MESSAGE_LIST", 27, 27, collection2, javaType7);
        FieldType fieldType29 = new FieldType("BYTES_LIST", 28, 28, collection2, javaType8);
        FieldType fieldType30 = new FieldType("UINT32_LIST", 29, 29, collection2, javaType4);
        FieldType fieldType31 = new FieldType("ENUM_LIST", 30, 30, collection2, javaType9);
        FieldType fieldType32 = new FieldType("SFIXED32_LIST", 31, 31, collection2, javaType4);
        FieldType fieldType33 = new FieldType("SFIXED64_LIST", 32, 32, collection2, javaType3);
        FieldType fieldType34 = new FieldType("SINT32_LIST", 33, 33, collection2, javaType4);
        FieldType fieldType35 = new FieldType("SINT64_LIST", 34, 34, collection2, javaType3);
        Collection collection3 = Collection.PACKED_VECTOR;
        FieldType fieldType36 = new FieldType("DOUBLE_LIST_PACKED", 35, 35, collection3, javaType);
        f10098b = fieldType36;
        FieldType fieldType37 = new FieldType("FLOAT_LIST_PACKED", 36, 36, collection3, javaType2);
        FieldType fieldType38 = new FieldType("INT64_LIST_PACKED", 37, 37, collection3, javaType3);
        FieldType fieldType39 = new FieldType("UINT64_LIST_PACKED", 38, 38, collection3, javaType3);
        FieldType fieldType40 = new FieldType("INT32_LIST_PACKED", 39, 39, collection3, javaType4);
        FieldType fieldType41 = new FieldType("FIXED64_LIST_PACKED", 40, 40, collection3, javaType3);
        FieldType fieldType42 = new FieldType("FIXED32_LIST_PACKED", 41, 41, collection3, javaType4);
        FieldType fieldType43 = new FieldType("BOOL_LIST_PACKED", 42, 42, collection3, javaType5);
        FieldType fieldType44 = new FieldType("UINT32_LIST_PACKED", 43, 43, collection3, javaType4);
        FieldType fieldType45 = new FieldType("ENUM_LIST_PACKED", 44, 44, collection3, javaType9);
        FieldType fieldType46 = new FieldType("SFIXED32_LIST_PACKED", 45, 45, collection3, javaType4);
        FieldType fieldType47 = new FieldType("SFIXED64_LIST_PACKED", 46, 46, collection3, javaType3);
        FieldType fieldType48 = new FieldType("SINT32_LIST_PACKED", 47, 47, collection3, javaType4);
        FieldType fieldType49 = new FieldType("SINT64_LIST_PACKED", 48, 48, collection3, javaType3);
        f10099c = fieldType49;
        f10101e = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18, fieldType19, fieldType20, fieldType21, fieldType22, fieldType23, fieldType24, fieldType25, fieldType26, fieldType27, fieldType28, fieldType29, fieldType30, fieldType31, fieldType32, fieldType33, fieldType34, fieldType35, fieldType36, fieldType37, fieldType38, fieldType39, fieldType40, fieldType41, fieldType42, fieldType43, fieldType44, fieldType45, fieldType46, fieldType47, fieldType48, fieldType49, new FieldType("GROUP_LIST", 49, 49, collection2, javaType7), new FieldType("MAP", 50, 50, Collection.MAP, JavaType.VOID)};
        FieldType[] values = values();
        f10100d = new FieldType[values.length];
        for (FieldType fieldType50 : values) {
            f10100d[fieldType50.f10102a] = fieldType50;
        }
    }

    public FieldType(String str, int i, int i9, Collection collection, JavaType javaType) {
        this.f10102a = i9;
        int ordinal = collection.ordinal();
        if (ordinal == 1) {
            javaType.getClass();
        } else if (ordinal == 3) {
            javaType.getClass();
        }
        if (collection == Collection.SCALAR) {
            javaType.ordinal();
        }
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) f10101e.clone();
    }

    public final int a() {
        return this.f10102a;
    }
}
