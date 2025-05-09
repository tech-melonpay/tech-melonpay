package mb;

import qrcode.internals.QRCodeRegion;
import qrcode.internals.QRCodeSquareType;

/* compiled from: QRCodeSquare.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24041c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24042d;

    /* renamed from: e, reason: collision with root package name */
    public final e f24043e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24044f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24045g;

    /* renamed from: h, reason: collision with root package name */
    public final d f24046h;
    public boolean i;

    public d(boolean z10, int i, int i9, int i10, e eVar, int i11, int i12, d dVar, int i13) {
        eVar = (i13 & 16) != 0 ? new e(QRCodeSquareType.f26131d, QRCodeRegion.f26126k) : eVar;
        i11 = (i13 & 32) != 0 ? 1 : i11;
        i12 = (i13 & 64) != 0 ? 1 : i12;
        dVar = (i13 & 128) != 0 ? null : dVar;
        this.f24039a = z10;
        this.f24040b = i;
        this.f24041c = i9;
        this.f24042d = i10;
        this.f24043e = eVar;
        this.f24044f = i11;
        this.f24045g = i12;
        this.f24046h = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24040b == dVar.f24040b && this.f24041c == dVar.f24041c && this.f24044f == dVar.f24044f && this.f24045g == dVar.f24045g;
    }

    public final int hashCode() {
        return (((((this.f24040b * 31) + this.f24041c) * 31) + this.f24044f) * 31) + this.f24045g;
    }

    public final String toString() {
        return "QRCodeSquare(dark=" + this.f24039a + ", row=" + this.f24040b + ", col=" + this.f24041c + ", moduleSize=" + this.f24042d + ", squareInfo=" + this.f24043e + ", rowSize=" + this.f24044f + ", colSize=" + this.f24045g + ", parent=" + this.f24046h + ')';
    }
}
