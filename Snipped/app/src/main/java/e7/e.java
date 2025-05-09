package E7;

import O9.p;
import ca.InterfaceC0635a;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1080c;

    public /* synthetic */ e(h hVar, String str, int i) {
        this.f1078a = i;
        this.f1079b = hVar;
        this.f1080c = str;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        String num2;
        switch (this.f1078a) {
            case 0:
                h hVar = this.f1079b;
                u5.d u6 = hVar.f1089U0.u();
                if (u6 != null && (num = u6.f30237a) != null && (num2 = num.toString()) != null) {
                    hVar.l();
                    hVar.f1090V0.a(new g(hVar, 3), new Pair(num2, this.f1080c));
                }
                break;
            default:
                h hVar2 = this.f1079b;
                hVar2.l();
                hVar2.f1088T0.a(new g(hVar2, 2), this.f1080c);
                break;
        }
        return p.f3034a;
    }
}
