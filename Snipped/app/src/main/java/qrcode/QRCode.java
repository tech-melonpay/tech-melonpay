package qrcode;

import O9.p;
import ca.InterfaceC0652r;
import j3.e;
import mb.d;
import ob.a;
import org.bouncycastle.asn1.BERTags;
import pb.b;
import qrcode.internals.QRCodeRegion;
import qrcode.internals.QRCodeSquareType;

/* compiled from: QRCode.kt */
/* loaded from: classes3.dex */
public final class QRCode {

    /* renamed from: k, reason: collision with root package name */
    public static final InterfaceC0652r<QRCode, a, Integer, Integer, p> f26084k = QRCode$Companion$EMPTY_FN$1.f26094l;

    /* renamed from: a, reason: collision with root package name */
    public final int f26085a = 25;

    /* renamed from: b, reason: collision with root package name */
    public final lb.a f26086b;

    /* renamed from: c, reason: collision with root package name */
    public final b f26087c;

    /* renamed from: d, reason: collision with root package name */
    public final e f26088d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0652r<QRCode, a, Integer, Integer, p> f26089e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0652r<QRCode, a, Integer, Integer, p> f26090f;

    /* renamed from: g, reason: collision with root package name */
    public final nb.a f26091g;

    /* renamed from: h, reason: collision with root package name */
    public final d[][] f26092h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final a f26093j;

    /* JADX WARN: Removed duplicated region for block: B:208:0x040c A[LOOP:24: B:207:0x040a->B:208:0x040c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0652  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public QRCode(java.lang.String r37, lb.a r38, pb.b r39, j3.e r40, qrcode.raw.ErrorCorrectionLevel r41, int r42, ca.InterfaceC0652r r43, ca.InterfaceC0652r r44) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qrcode.QRCode.<init>(java.lang.String, lb.a, pb.b, j3.e, qrcode.raw.ErrorCorrectionLevel, int, ca.r, ca.r):void");
    }

    public static a a(final QRCode qRCode) {
        qRCode.f26086b.getClass();
        qRCode.f26087c.getClass();
        final int i = 0;
        InterfaceC0652r<QRCode, a, Integer, Integer, p> interfaceC0652r = qRCode.f26089e;
        final a aVar = qRCode.f26093j;
        interfaceC0652r.invoke(qRCode, aVar, 0, 0);
        InterfaceC0652r<Integer, Integer, d, a, p> interfaceC0652r2 = new InterfaceC0652r<Integer, Integer, d, a, p>() { // from class: qrcode.QRCode$draw$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // ca.InterfaceC0652r
            public final p invoke(Integer num, Integer num2, d dVar, a aVar2) {
                boolean z10;
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                d dVar2 = dVar;
                d dVar3 = dVar2.f24046h;
                d dVar4 = dVar3 == null ? dVar2 : dVar3;
                if (!dVar4.i) {
                    int ordinal = dVar2.f24043e.f24047a.ordinal();
                    QRCode qRCode2 = QRCode.this;
                    if (ordinal == 0 || ordinal == 1) {
                        z10 = true;
                        qRCode2.f26087c.b(i, i, qRCode2.f26086b, dVar4, aVar, qRCode2);
                    } else {
                        qRCode2.f26087c.a(i + intValue, i + intValue2, qRCode2.f26086b, dVar2, aVar, qRCode2);
                        z10 = true;
                    }
                    dVar4.i = z10;
                }
                return p.f3034a;
            }
        };
        qRCode.f26091g.getClass();
        d[][] dVarArr = qRCode.f26092h;
        int i9 = qRCode.f26085a;
        if (i9 > 0) {
            d dVar = new d(false, 0, 0, dVarArr.length, new mb.e(QRCodeSquareType.f26132e, QRCodeRegion.f26125j), 0, 0, null, BERTags.FLAGS);
            interfaceC0652r2.invoke(Integer.valueOf(dVar.f24041c * i9), Integer.valueOf(dVar.f24040b * i9), dVar, aVar);
        }
        for (d[] dVarArr2 : dVarArr) {
            for (d dVar2 : dVarArr2) {
                if (!dVar2.i) {
                    interfaceC0652r2.invoke(Integer.valueOf((dVar2.f24041c * i9) + i9), Integer.valueOf((dVar2.f24040b * i9) + i9), dVar2, aVar);
                    dVar2.i = true;
                }
            }
        }
        qRCode.f26090f.invoke(qRCode, aVar, 0, 0);
        return aVar;
    }
}
