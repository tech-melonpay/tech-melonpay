package mb;

import qrcode.internals.QRCodeRegion;
import qrcode.internals.QRCodeSquareType;

/* compiled from: QRCodeSquare.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final QRCodeSquareType f24047a;

    /* renamed from: b, reason: collision with root package name */
    public final QRCodeRegion f24048b;

    public e(QRCodeSquareType qRCodeSquareType, QRCodeRegion qRCodeRegion) {
        this.f24047a = qRCodeSquareType;
        this.f24048b = qRCodeRegion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f24047a == eVar.f24047a && this.f24048b == eVar.f24048b;
    }

    public final int hashCode() {
        return this.f24048b.hashCode() + (this.f24047a.hashCode() * 31);
    }

    public final String toString() {
        return "QRCodeSquareInfo(type=" + this.f24047a + ", region=" + this.f24048b + ')';
    }
}
