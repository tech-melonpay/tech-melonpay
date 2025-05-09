package M6;

import J5.a;
import android.util.Base64;
import ca.InterfaceC0646l;
import ka.C0956a;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2653d;

    public /* synthetic */ q(w wVar, String str, String str2, int i) {
        this.f2650a = i;
        this.f2651b = wVar;
        this.f2652c = str;
        this.f2653d = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        int i = 1;
        String str = this.f2653d;
        String str2 = this.f2652c;
        w wVar = this.f2651b;
        switch (this.f2650a) {
            case 0:
                J5.a aVar = (J5.a) obj;
                q qVar = new q(wVar, str2, str, i);
                aVar.getClass();
                if (aVar instanceof a.C0026a) {
                    J5.b bVar = (J5.b) ((a.C0026a) aVar).f2145a;
                    wVar.k();
                    if (wVar.a(bVar)) {
                        wVar.f413E0 = wVar.f418J0;
                    }
                    wVar.d(bVar);
                    O9.p pVar = O9.p.f3034a;
                } else {
                    if (!(aVar instanceof a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar.invoke(((a.b) aVar).f2146a);
                }
                return O9.p.f3034a;
            default:
                I5.k kVar = (I5.k) obj;
                wVar.k();
                K5.a aVar2 = wVar.f2702c1;
                aVar2.V("default");
                aVar2.q(Base64.encodeToString((str2 + com.sumsub.sns.internal.core.data.model.p.f15541a + str).getBytes(C0956a.f23054b), 0));
                wVar.f2721w1 = kVar;
                wVar.f2694U0.a(new J8.c(i, wVar, kVar), aVar2.D());
                return O9.p.f3034a;
        }
    }
}
