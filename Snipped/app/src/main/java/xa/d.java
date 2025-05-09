package xa;

import okhttp3.c;
import okhttp3.k;
import okhttp3.p;

/* compiled from: CacheStrategy.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k f30953a;

    /* renamed from: b, reason: collision with root package name */
    public final p f30954b;

    /* compiled from: CacheStrategy.kt */
    public static final class a {
        public static boolean a(k kVar, p pVar) {
            int i = pVar.f24674d;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i != 307) {
                    if (i != 308 && i != 404 && i != 405) {
                        switch (i) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                String a10 = pVar.f24676f.a("Expires");
                if (a10 == null) {
                    a10 = null;
                }
                if (a10 == null && pVar.d().f24471c == -1 && !pVar.d().f24474f && !pVar.d().f24473e) {
                    return false;
                }
            }
            if (pVar.d().f24470b) {
                return false;
            }
            okhttp3.c cVar = kVar.f24649f;
            if (cVar == null) {
                okhttp3.c cVar2 = okhttp3.c.f24467n;
                cVar = c.b.a(kVar.f24646c);
                kVar.f24649f = cVar;
            }
            return !cVar.f24470b;
        }
    }

    public d(k kVar, p pVar) {
        this.f30953a = kVar;
        this.f30954b = pVar;
    }
}
