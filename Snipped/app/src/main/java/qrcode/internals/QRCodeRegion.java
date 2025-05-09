package qrcode.internals;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRCodeSquare.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lqrcode/internals/QRCodeRegion;", "", "qrcode-kotlin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class QRCodeRegion {

    /* renamed from: a, reason: collision with root package name */
    public static final QRCodeRegion f26117a;

    /* renamed from: b, reason: collision with root package name */
    public static final QRCodeRegion f26118b;

    /* renamed from: c, reason: collision with root package name */
    public static final QRCodeRegion f26119c;

    /* renamed from: d, reason: collision with root package name */
    public static final QRCodeRegion f26120d;

    /* renamed from: e, reason: collision with root package name */
    public static final QRCodeRegion f26121e;

    /* renamed from: f, reason: collision with root package name */
    public static final QRCodeRegion f26122f;

    /* renamed from: g, reason: collision with root package name */
    public static final QRCodeRegion f26123g;

    /* renamed from: h, reason: collision with root package name */
    public static final QRCodeRegion f26124h;
    public static final QRCodeRegion i;

    /* renamed from: j, reason: collision with root package name */
    public static final QRCodeRegion f26125j;

    /* renamed from: k, reason: collision with root package name */
    public static final QRCodeRegion f26126k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ QRCodeRegion[] f26127l;

    static {
        QRCodeRegion qRCodeRegion = new QRCodeRegion("TOP_LEFT_CORNER", 0);
        f26117a = qRCodeRegion;
        QRCodeRegion qRCodeRegion2 = new QRCodeRegion("TOP_RIGHT_CORNER", 1);
        f26118b = qRCodeRegion2;
        QRCodeRegion qRCodeRegion3 = new QRCodeRegion("TOP_MID", 2);
        f26119c = qRCodeRegion3;
        QRCodeRegion qRCodeRegion4 = new QRCodeRegion("LEFT_MID", 3);
        f26120d = qRCodeRegion4;
        QRCodeRegion qRCodeRegion5 = new QRCodeRegion("RIGHT_MID", 4);
        f26121e = qRCodeRegion5;
        QRCodeRegion qRCodeRegion6 = new QRCodeRegion("CENTER", 5);
        f26122f = qRCodeRegion6;
        QRCodeRegion qRCodeRegion7 = new QRCodeRegion("BOTTOM_LEFT_CORNER", 6);
        f26123g = qRCodeRegion7;
        QRCodeRegion qRCodeRegion8 = new QRCodeRegion("BOTTOM_RIGHT_CORNER", 7);
        f26124h = qRCodeRegion8;
        QRCodeRegion qRCodeRegion9 = new QRCodeRegion("BOTTOM_MID", 8);
        i = qRCodeRegion9;
        QRCodeRegion qRCodeRegion10 = new QRCodeRegion("MARGIN", 9);
        f26125j = qRCodeRegion10;
        QRCodeRegion qRCodeRegion11 = new QRCodeRegion("UNKNOWN", 10);
        f26126k = qRCodeRegion11;
        f26127l = new QRCodeRegion[]{qRCodeRegion, qRCodeRegion2, qRCodeRegion3, qRCodeRegion4, qRCodeRegion5, qRCodeRegion6, qRCodeRegion7, qRCodeRegion8, qRCodeRegion9, qRCodeRegion10, qRCodeRegion11};
    }

    public QRCodeRegion() {
        throw null;
    }

    public static QRCodeRegion valueOf(String str) {
        return (QRCodeRegion) Enum.valueOf(QRCodeRegion.class, str);
    }

    public static QRCodeRegion[] values() {
        return (QRCodeRegion[]) f26127l.clone();
    }
}
