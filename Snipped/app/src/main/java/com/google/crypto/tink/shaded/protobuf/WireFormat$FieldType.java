package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class WireFormat$FieldType {

    /* renamed from: b, reason: collision with root package name */
    public static final WireFormat$FieldType f10169b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ WireFormat$FieldType[] f10170c;

    /* renamed from: a, reason: collision with root package name */
    public final WireFormat$JavaType f10171a;

    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF10;

    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF11;

    /* JADX INFO: Fake field, exist only in values array */
    WireFormat$FieldType EF12;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$1, reason: invalid class name */
    public enum AnonymousClass1 extends WireFormat$FieldType {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$2, reason: invalid class name */
    public enum AnonymousClass2 extends WireFormat$FieldType {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$3, reason: invalid class name */
    public enum AnonymousClass3 extends WireFormat$FieldType {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType$4, reason: invalid class name */
    public enum AnonymousClass4 extends WireFormat$FieldType {
    }

    static {
        WireFormat$FieldType wireFormat$FieldType = new WireFormat$FieldType("DOUBLE", 0, WireFormat$JavaType.DOUBLE, 1);
        WireFormat$FieldType wireFormat$FieldType2 = new WireFormat$FieldType("FLOAT", 1, WireFormat$JavaType.FLOAT, 5);
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.LONG;
        WireFormat$FieldType wireFormat$FieldType3 = new WireFormat$FieldType("INT64", 2, wireFormat$JavaType, 0);
        WireFormat$FieldType wireFormat$FieldType4 = new WireFormat$FieldType("UINT64", 3, wireFormat$JavaType, 0);
        WireFormat$JavaType wireFormat$JavaType2 = WireFormat$JavaType.INT;
        WireFormat$FieldType wireFormat$FieldType5 = new WireFormat$FieldType("INT32", 4, wireFormat$JavaType2, 0);
        WireFormat$FieldType wireFormat$FieldType6 = new WireFormat$FieldType("FIXED64", 5, wireFormat$JavaType, 1);
        WireFormat$FieldType wireFormat$FieldType7 = new WireFormat$FieldType("FIXED32", 6, wireFormat$JavaType2, 5);
        WireFormat$FieldType wireFormat$FieldType8 = new WireFormat$FieldType("BOOL", 7, WireFormat$JavaType.BOOLEAN, 0);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("STRING", 8, WireFormat$JavaType.STRING, 2);
        WireFormat$JavaType wireFormat$JavaType3 = WireFormat$JavaType.MESSAGE;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2("GROUP", 9, wireFormat$JavaType3, 3);
        f10169b = anonymousClass2;
        f10170c = new WireFormat$FieldType[]{wireFormat$FieldType, wireFormat$FieldType2, wireFormat$FieldType3, wireFormat$FieldType4, wireFormat$FieldType5, wireFormat$FieldType6, wireFormat$FieldType7, wireFormat$FieldType8, anonymousClass1, anonymousClass2, new AnonymousClass3("MESSAGE", 10, wireFormat$JavaType3, 2), new AnonymousClass4("BYTES", 11, WireFormat$JavaType.BYTE_STRING, 2), new WireFormat$FieldType("UINT32", 12, wireFormat$JavaType2, 0), new WireFormat$FieldType("ENUM", 13, WireFormat$JavaType.ENUM, 0), new WireFormat$FieldType("SFIXED32", 14, wireFormat$JavaType2, 5), new WireFormat$FieldType("SFIXED64", 15, wireFormat$JavaType, 1), new WireFormat$FieldType("SINT32", 16, wireFormat$JavaType2, 0), new WireFormat$FieldType("SINT64", 17, wireFormat$JavaType, 0)};
    }

    public WireFormat$FieldType(String str, int i, WireFormat$JavaType wireFormat$JavaType, int i9) {
        this.f10171a = wireFormat$JavaType;
    }

    public static WireFormat$FieldType valueOf(String str) {
        return (WireFormat$FieldType) Enum.valueOf(WireFormat$FieldType.class, str);
    }

    public static WireFormat$FieldType[] values() {
        return (WireFormat$FieldType[]) f10170c.clone();
    }
}
