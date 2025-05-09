package mb;

import ka.C0956a;
import qrcode.raw.QRCodeDataType;

/* compiled from: QRData.kt */
/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f24035c;

    public a(String str) {
        super(QRCodeDataType.DEFAULT, str);
        this.f24035c = str.getBytes(C0956a.f23054b);
    }

    @Override // mb.f
    public final int a() {
        return this.f24035c.length;
    }

    @Override // mb.f
    public final void b(Na.a aVar) {
        for (byte b9 : this.f24035c) {
            aVar.c(b9, 8);
        }
    }
}
