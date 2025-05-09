package Aa;

import ka.C0956a;
import ka.C0967l;
import okhttp3.p;
import okio.ByteString;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes2.dex */
public final class e {
    static {
        new ByteString("\"\\".getBytes(C0956a.f23054b)).f24699c = "\"\\";
        new ByteString("\t ,=".getBytes(C0956a.f23054b)).f24699c = "\t ,=";
    }

    public static final boolean a(p pVar) {
        if (kotlin.jvm.internal.f.b(pVar.f24671a.f24645b, "HEAD")) {
            return false;
        }
        int i = pVar.f24674d;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && wa.b.j(pVar) == -1) {
            String a10 = pVar.f24676f.a("Transfer-Encoding");
            if (a10 == null) {
                a10 = null;
            }
            if (!C0967l.U("chunked", a10, true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01f2  */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(va.C1552a r35, okhttp3.h r36, okhttp3.g r37) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Aa.e.b(va.a, okhttp3.h, okhttp3.g):void");
    }
}
