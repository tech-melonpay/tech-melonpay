package qrcode.raw;

import kotlin.Metadata;

/* compiled from: QRCodeEnums.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lqrcode/raw/ErrorCorrectionLevel;", "", "qrcode-kotlin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public enum ErrorCorrectionLevel {
    /* JADX INFO: Fake field, exist only in values array */
    LOW(1, 21),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM(0, 25),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH(3, 30),
    VERY_HIGH(2, 34);


    /* renamed from: a, reason: collision with root package name */
    public final int f26136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26137b;

    ErrorCorrectionLevel(int i, int i9) {
        this.f26136a = i;
        this.f26137b = i9;
    }
}
