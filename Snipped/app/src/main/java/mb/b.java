package mb;

import qrcode.raw.QRCodeDataType;

/* compiled from: QRData.kt */
/* loaded from: classes3.dex */
public final class b extends f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, int i) {
        super(QRCodeDataType.UPPER_ALPHA_NUM, str);
        this.f24036c = i;
        switch (i) {
            case 1:
                super(QRCodeDataType.NUMBERS, str);
                break;
            default:
                break;
        }
    }

    public static int c(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < '[') {
            return c2 - '7';
        }
        int i = 36;
        if (c2 != ' ') {
            int i9 = 37;
            if (c2 != '$') {
                if (c2 == '%') {
                    return 38;
                }
                i9 = 42;
                if (c2 == '*') {
                    return 39;
                }
                i = 43;
                if (c2 == '+') {
                    return 40;
                }
                if (c2 == '-') {
                    return 41;
                }
                if (c2 != '.') {
                    if (c2 != '/') {
                        if (c2 == ':') {
                            return 44;
                        }
                        throw new IllegalArgumentException("Illegal character: " + c2);
                    }
                }
            }
            return i9;
        }
        return i;
    }

    @Override // mb.f
    public final int a() {
        switch (this.f24036c) {
        }
        return this.f24050b.length();
    }

    @Override // mb.f
    public final void b(Na.a aVar) {
        switch (this.f24036c) {
            case 0:
                String str = this.f24050b;
                int length = str.length();
                int i = 0;
                while (true) {
                    int i9 = i + 1;
                    if (i9 >= length) {
                        if (i < length) {
                            aVar.c(c(str.charAt(i)), 6);
                            break;
                        }
                    } else {
                        aVar.c(c(str.charAt(i9)) + (c(str.charAt(i)) * 45), 11);
                        i += 2;
                    }
                }
                break;
            default:
                String str2 = this.f24050b;
                int length2 = str2.length();
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 2;
                    if (i11 >= length2) {
                        if (i10 < length2) {
                            int i12 = length2 - i10;
                            if (i12 != 1) {
                                if (i12 == 2) {
                                    aVar.c(Integer.parseInt(str2.substring(i10, i11)), 7);
                                    break;
                                }
                            } else {
                                aVar.c(Integer.parseInt(str2.substring(i10, i10 + 1)), 4);
                                break;
                            }
                        }
                    } else {
                        int i13 = i10 + 3;
                        aVar.c(Integer.parseInt(str2.substring(i10, i13)), 10);
                        i10 = i13;
                    }
                }
                break;
        }
    }
}
