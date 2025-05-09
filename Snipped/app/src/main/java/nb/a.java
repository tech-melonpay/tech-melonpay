package nb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;
import mb.f;
import qrcode.raw.ErrorCorrectionLevel;
import qrcode.raw.QRCodeDataType;
import s3.b;

/* compiled from: QRCodeProcessor.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24311a;

    /* renamed from: b, reason: collision with root package name */
    public final ErrorCorrectionLevel f24312b;

    /* renamed from: c, reason: collision with root package name */
    public final QRCodeDataType f24313c;

    /* renamed from: d, reason: collision with root package name */
    public final f f24314d;

    /* compiled from: QRCodeProcessor.kt */
    /* renamed from: nb.a$a, reason: collision with other inner class name */
    public static final class C0436a {
    }

    public a(String str) {
        f bVar;
        ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.VERY_HIGH;
        QRCodeDataType qRCodeDataType = b.w("^[0-9A-Z $%*+\\-./:]+$", str) ? b.w("^\\d+$", str) ? QRCodeDataType.NUMBERS : QRCodeDataType.UPPER_ALPHA_NUM : QRCodeDataType.DEFAULT;
        this.f24311a = str;
        this.f24312b = errorCorrectionLevel;
        this.f24313c = qRCodeDataType;
        int ordinal = qRCodeDataType.ordinal();
        if (ordinal == 0) {
            bVar = new mb.b(str, 1);
        } else if (ordinal == 1) {
            bVar = new mb.b(str, 0);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new mb.a(str);
        }
        this.f24314d = bVar;
    }

    public final String toString() {
        return "QRCode(data=" + this.f24311a + ", errorCorrectionLevel=" + this.f24312b + ", dataType=" + this.f24313c + ", qrCodeData=" + h.a(this.f24314d.getClass()).d() + ')';
    }
}
