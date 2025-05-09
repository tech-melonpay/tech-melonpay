package qrcode.internals;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRCodeSquare.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lqrcode/internals/QRCodeSquareType;", "", "qrcode-kotlin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class QRCodeSquareType {

    /* renamed from: a, reason: collision with root package name */
    public static final QRCodeSquareType f26128a;

    /* renamed from: b, reason: collision with root package name */
    public static final QRCodeSquareType f26129b;

    /* renamed from: c, reason: collision with root package name */
    public static final QRCodeSquareType f26130c;

    /* renamed from: d, reason: collision with root package name */
    public static final QRCodeSquareType f26131d;

    /* renamed from: e, reason: collision with root package name */
    public static final QRCodeSquareType f26132e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ QRCodeSquareType[] f26133f;

    static {
        QRCodeSquareType qRCodeSquareType = new QRCodeSquareType("POSITION_PROBE", 0);
        f26128a = qRCodeSquareType;
        QRCodeSquareType qRCodeSquareType2 = new QRCodeSquareType("POSITION_ADJUST", 1);
        f26129b = qRCodeSquareType2;
        QRCodeSquareType qRCodeSquareType3 = new QRCodeSquareType("TIMING_PATTERN", 2);
        f26130c = qRCodeSquareType3;
        QRCodeSquareType qRCodeSquareType4 = new QRCodeSquareType("DEFAULT", 3);
        f26131d = qRCodeSquareType4;
        QRCodeSquareType qRCodeSquareType5 = new QRCodeSquareType("MARGIN", 4);
        f26132e = qRCodeSquareType5;
        f26133f = new QRCodeSquareType[]{qRCodeSquareType, qRCodeSquareType2, qRCodeSquareType3, qRCodeSquareType4, qRCodeSquareType5};
    }

    public QRCodeSquareType() {
        throw null;
    }

    public static QRCodeSquareType valueOf(String str) {
        return (QRCodeSquareType) Enum.valueOf(QRCodeSquareType.class, str);
    }

    public static QRCodeSquareType[] values() {
        return (QRCodeSquareType[]) f26133f.clone();
    }
}
