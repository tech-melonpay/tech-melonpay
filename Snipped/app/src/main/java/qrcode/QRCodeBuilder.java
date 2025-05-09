package qrcode;

import O9.p;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import ca.InterfaceC0652r;
import j3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import mb.d;
import mb.g;
import ob.a;
import pb.b;
import qrcode.raw.ErrorCorrectionLevel;

/* compiled from: QRCodeBuilder.kt */
/* loaded from: classes3.dex */
public final class QRCodeBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final b f26099a;

    /* renamed from: b, reason: collision with root package name */
    public int f26100b;

    /* renamed from: c, reason: collision with root package name */
    public int f26101c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26102d;

    /* renamed from: e, reason: collision with root package name */
    public Lambda f26103e;

    /* renamed from: f, reason: collision with root package name */
    public Lambda f26104f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0652r<? super QRCode, ? super a, ? super Integer, ? super Integer, p> f26105g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0652r<? super QRCode, ? super a, ? super Integer, ? super Integer, p> f26106h;
    public final e i;

    /* renamed from: j, reason: collision with root package name */
    public final ErrorCorrectionLevel f26107j;

    /* renamed from: k, reason: collision with root package name */
    public final int f26108k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QRCodeBuilder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lqrcode/QRCodeBuilder$QRCodeShapesEnum;", "", "qrcode-kotlin_release"}, k = 1, mv = {1, 9, 0})
    public static final class QRCodeShapesEnum {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ QRCodeShapesEnum[] f26109a = {new QRCodeShapesEnum("SQUARE", 0), new QRCodeShapesEnum("CIRCLE", 1), new QRCodeShapesEnum("ROUNDED_SQUARE", 2), new QRCodeShapesEnum("CUSTOM", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        QRCodeShapesEnum EF5;

        public QRCodeShapesEnum() {
            throw null;
        }

        public static QRCodeShapesEnum valueOf(String str) {
            return (QRCodeShapesEnum) Enum.valueOf(QRCodeShapesEnum.class, str);
        }

        public static QRCodeShapesEnum[] values() {
            return (QRCodeShapesEnum[]) f26109a.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QRCodeBuilder() {
        QRCodeShapesEnum[] qRCodeShapesEnumArr = QRCodeShapesEnum.f26109a;
        this.f26099a = null;
        this.f26100b = -16777216;
        this.f26101c = -1;
        Integer num = 1;
        this.f26102d = num.intValue();
        U4.b.B(25 / 1.75d);
        InterfaceC0652r<QRCode, a, Integer, Integer, p> interfaceC0652r = QRCode.f26084k;
        Lambda lambda = (Lambda) interfaceC0652r;
        this.f26103e = lambda;
        this.f26104f = lambda;
        this.f26105g = interfaceC0652r;
        this.f26106h = interfaceC0652r;
        this.i = new e(29);
        this.f26107j = ErrorCorrectionLevel.VERY_HIGH;
        this.f26108k = 6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.Lambda, qrcode.QRCodeBuilder$withLogo$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.Lambda, qrcode.QRCodeBuilder$withLogo$2] */
    public static void b(QRCodeBuilder qRCodeBuilder, final byte[] bArr, final int i, final int i9) {
        qRCodeBuilder.f26104f = new InterfaceC0652r<QRCode, a, Integer, Integer, p>() { // from class: qrcode.QRCodeBuilder$withLogo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // ca.InterfaceC0652r
            public final p invoke(QRCode qRCode, a aVar, Integer num, Integer num2) {
                int i10;
                boolean z10;
                QRCode qRCode2 = qRCode;
                num.intValue();
                num2.intValue();
                int i11 = qRCode2.i;
                int i12 = i;
                int i13 = (i11 - i12) / 2;
                int i14 = i9;
                int i15 = (i11 - i14) / 2;
                for (d[] dVarArr : qRCode2.f26092h) {
                    int length = dVarArr.length;
                    int i16 = 0;
                    while (i16 < length) {
                        d dVar = dVarArr[i16];
                        int i17 = dVar.f24041c;
                        int i18 = qRCode2.f26085a;
                        int i19 = (i17 * i18) + i18;
                        int i20 = (dVar.f24040b * i18) + i18;
                        int[] iArr = g.f24051a;
                        int i21 = i13 + i12;
                        QRCode qRCode3 = qRCode2;
                        int i22 = i15 + i14;
                        int i23 = i12;
                        int i24 = i19 + i18;
                        int i25 = i18 + i20;
                        if (i21 < i19 || i13 > i24 || i22 < i20 || i15 > i25) {
                            i10 = 1;
                            z10 = true;
                        } else {
                            i10 = 1;
                            z10 = false;
                        }
                        dVar.i = !z10;
                        i16 += i10;
                        i12 = i23;
                        qRCode2 = qRCode3;
                    }
                }
                return p.f3034a;
            }
        };
        qRCodeBuilder.f26103e = new InterfaceC0652r<QRCode, a, Integer, Integer, p>() { // from class: qrcode.QRCodeBuilder$withLogo$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // ca.InterfaceC0652r
            public final p invoke(QRCode qRCode, a aVar, Integer num, Integer num2) {
                a aVar2 = aVar;
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                int i10 = qRCode.i;
                int t3 = com.google.android.gms.measurement.internal.a.t(i10, i, 2, intValue);
                int t10 = com.google.android.gms.measurement.internal.a.t(i10, i9, 2, intValue2);
                byte[] bArr2 = bArr;
                if (bArr2 != null) {
                    if (!(bArr2.length == 0)) {
                        aVar2.f24403d.drawBitmap(BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length), t3, t10, (Paint) null);
                    }
                }
                return p.f3034a;
            }
        };
    }

    public final QRCode a(String str) {
        lb.a aVar = new lb.a(this.f26100b, this.f26101c);
        b bVar = this.f26099a;
        if (bVar == null) {
            QRCodeShapesEnum[] qRCodeShapesEnumArr = QRCodeShapesEnum.f26109a;
            bVar = new pb.a(25, this.f26102d);
        }
        return new QRCode(str, aVar, bVar, this.i, this.f26107j, this.f26108k, new InterfaceC0652r<QRCode, a, Integer, Integer, p>() { // from class: qrcode.QRCodeBuilder$beforeFn$1
            {
                super(4);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [ca.r, kotlin.jvm.internal.Lambda] */
            @Override // ca.InterfaceC0652r
            public final p invoke(QRCode qRCode, a aVar2, Integer num, Integer num2) {
                QRCode qRCode2 = qRCode;
                a aVar3 = aVar2;
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                QRCodeBuilder qRCodeBuilder = QRCodeBuilder.this;
                qRCodeBuilder.f26104f.invoke(qRCode2, aVar3, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                ((QRCode$Companion$EMPTY_FN$1) qRCodeBuilder.f26106h).invoke(qRCode2, aVar3, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                return p.f3034a;
            }
        }, new InterfaceC0652r<QRCode, a, Integer, Integer, p>() { // from class: qrcode.QRCodeBuilder$afterFn$1
            {
                super(4);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [ca.r, kotlin.jvm.internal.Lambda] */
            @Override // ca.InterfaceC0652r
            public final p invoke(QRCode qRCode, a aVar2, Integer num, Integer num2) {
                QRCode qRCode2 = qRCode;
                a aVar3 = aVar2;
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                QRCodeBuilder qRCodeBuilder = QRCodeBuilder.this;
                qRCodeBuilder.f26103e.invoke(qRCode2, aVar3, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                ((QRCode$Companion$EMPTY_FN$1) qRCodeBuilder.f26105g).invoke(qRCode2, aVar3, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                return p.f3034a;
            }
        });
    }
}
