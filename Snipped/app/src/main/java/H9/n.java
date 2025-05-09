package H9;

import io.sentry.E;
import io.sentry.F;
import io.sentry.InterfaceC0859q;
import java.util.Map;

/* compiled from: TransactionInfo.java */
/* loaded from: classes2.dex */
public final class n implements F {

    /* renamed from: a, reason: collision with root package name */
    public final String f1653a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f1654b;

    public n(String str) {
        this.f1653a = str;
    }

    @Override // io.sentry.F
    public final void serialize(E e10, InterfaceC0859q interfaceC0859q) {
        e10.i();
        String str = this.f1653a;
        if (str != null) {
            e10.P("source");
            e10.Q(interfaceC0859q, str);
        }
        Map<String, Object> map = this.f1654b;
        if (map != null) {
            for (String str2 : map.keySet()) {
                com.google.android.gms.measurement.internal.a.s(this.f1654b, str2, e10, str2, interfaceC0859q);
            }
        }
        e10.p();
    }
}
