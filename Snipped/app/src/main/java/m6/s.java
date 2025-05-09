package M6;

import ca.InterfaceC0635a;
import java.util.Date;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B6.i f2660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2663g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2664h;
    public final /* synthetic */ Object i;

    public /* synthetic */ s(B6.i iVar, String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f2657a = i;
        this.f2660d = iVar;
        this.f2658b = str;
        this.f2659c = str2;
        this.f2661e = obj;
        this.f2662f = obj2;
        this.f2663g = obj3;
        this.f2664h = obj4;
        this.i = obj5;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2657a) {
            case 0:
                w wVar = (w) this.f2660d;
                wVar.l();
                Long valueOf = Long.valueOf(((Date) this.i).getTime() / 1000);
                String str = this.f2658b;
                String str2 = this.f2659c;
                String str3 = (String) this.f2661e;
                String str4 = (String) this.f2662f;
                String str5 = (String) this.f2663g;
                String str6 = (String) this.f2664h;
                wVar.f2693T0.a(new q(wVar, str3, str6, 0), new I5.m(str, str2, str3, str4, str5, str6, valueOf, null, null, null, null, null, null));
                break;
            default:
                m7.k kVar = (m7.k) this.f2660d;
                kVar.f24002X0.a(new m7.i(kVar, 4), new Pair(Integer.valueOf(kVar.f23998T0.h()), new v5.f(this.f2658b, this.f2659c, (Double) this.f2661e, (Integer) this.f2662f, (Integer) this.f2663g, (Long) this.f2664h, (Long) this.i)));
                break;
        }
        return O9.p.f3034a;
    }
}
