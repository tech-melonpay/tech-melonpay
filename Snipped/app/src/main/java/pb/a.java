package pb;

import android.graphics.Paint;
import android.graphics.Rect;
import ha.C0804c;
import ha.C0806e;
import ha.InterfaceC0802a;
import ha.h;
import mb.d;
import qrcode.QRCode;
import qrcode.internals.QRCodeSquareType;

/* compiled from: DefaultShapeFunction.kt */
/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f25741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25742b;

    /* compiled from: DefaultShapeFunction.kt */
    /* renamed from: pb.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0451a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25743a;

        static {
            int[] iArr = new int[QRCodeSquareType.values().length];
            try {
                QRCodeSquareType qRCodeSquareType = QRCodeSquareType.f26128a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25743a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i, int i9) {
        int i10;
        this.f25741a = i;
        C0806e c0806e = new C0806e(0, i / 2, 1);
        if (c0806e instanceof InterfaceC0802a) {
            Object valueOf = Integer.valueOf(i9);
            InterfaceC0802a interfaceC0802a = (InterfaceC0802a) c0806e;
            if (interfaceC0802a.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC0802a + '.');
            }
            if (interfaceC0802a.a(valueOf, interfaceC0802a.c()) && !interfaceC0802a.a(interfaceC0802a.c(), valueOf)) {
                valueOf = interfaceC0802a.c();
            } else if (interfaceC0802a.a(interfaceC0802a.e(), valueOf) && !interfaceC0802a.a(valueOf, interfaceC0802a.e())) {
                valueOf = interfaceC0802a.e();
            }
            i10 = ((Number) valueOf).intValue();
        } else {
            if (c0806e.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c0806e + '.');
            }
            if (i9 < 0) {
                i9 = 0;
            } else {
                int i11 = c0806e.f21227b;
                if (i9 > i11) {
                    i9 = i11;
                }
            }
            i10 = i9;
        }
        this.f25742b = i10;
    }

    @Override // pb.b
    public final void a(int i, int i9, lb.a aVar, d dVar, ob.a aVar2, QRCode qRCode) {
        int i10 = dVar.f24040b;
        int a10 = aVar.a();
        int b9 = aVar.b();
        if (dVar.f24043e.f24047a == QRCodeSquareType.f26132e) {
            aVar2.a(0, 0, aVar2.f24400a, aVar2.f24401b, aVar.c());
            return;
        }
        int i11 = dVar.f24039a ? b9 : a10;
        int i12 = this.f25742b;
        int i13 = this.f25741a - (i12 * 2);
        e(i + i12, i9 + i12, i13, i13, i11, aVar2);
    }

    @Override // pb.b
    public final void b(int i, int i9, lb.a aVar, d dVar, ob.a aVar2, QRCode qRCode) {
        int a10 = aVar.a();
        int b9 = aVar.b();
        int i10 = dVar.f24044f;
        int i11 = this.f25741a;
        int i12 = i11 * i10;
        int i13 = (dVar.f24041c * i11) + i;
        int i14 = (dVar.f24040b * i11) + i9;
        if (C0451a.f25743a[dVar.f24043e.f24047a.ordinal()] != 1) {
            aVar2.a(i13, i14, i12, i12, a10);
            d(i13, i14, 1, b9, aVar2);
            d(i13, i14 + i11, 4, b9, aVar2);
            d(i13, (i11 * 2) + i14, 2, b9, aVar2);
            d(i13, (i11 * 3) + i14, 4, b9, aVar2);
            d(i13, (i11 * 4) + i14, 1, b9, aVar2);
            return;
        }
        int i15 = i11 * 2;
        int i16 = i15 + i12;
        aVar2.a(i13, i14, i16, i16, aVar.c());
        int i17 = i13 + i11;
        int i18 = this.f25742b;
        int i19 = i14 + i11;
        int i20 = i12 - (i18 * 2);
        c(i17 + i18, i19 + i18, i20, i20, b9, i11, aVar2);
        int i21 = i12 - (i11 * 4);
        e(i15 + i17, i15 + i19, i21, i21, b9, aVar2);
    }

    public void c(int i, int i9, int i10, int i11, int i12, double d10, ob.a aVar) {
        int B10 = U4.b.B(d10 / 2.0d);
        aVar.f24403d.drawRect(new Rect(i + B10, i9 + B10, (i + i10) - B10, (i9 + i11) - B10), aVar.b(i12, Paint.Style.STROKE, d10));
    }

    public final void d(int i, int i9, int i10, int i11, ob.a aVar) {
        C0804c U = h.U(h.V(0, 5), i10);
        int i12 = U.f21226a;
        int i13 = U.f21227b;
        int i14 = U.f21228c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return;
        }
        int i15 = i12;
        while (true) {
            int i16 = this.f25741a;
            int i17 = this.f25742b;
            int i18 = i16 - (i17 * 2);
            e((i16 * i15) + i + i17, i9 + i17, i18, i18, i11, aVar);
            if (i15 == i13) {
                return;
            } else {
                i15 += i14;
            }
        }
    }

    public void e(int i, int i9, int i10, int i11, int i12, ob.a aVar) {
        aVar.a(i, i9, i10, i11, i12);
    }
}
