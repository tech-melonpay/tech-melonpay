package E7;

import O9.p;
import ca.InterfaceC0635a;
import kotlin.Triple;
import t8.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B6.i f1085e;

    public /* synthetic */ f(h hVar, String str, String str2, boolean z10) {
        this.f1081a = 0;
        this.f1085e = hVar;
        this.f1082b = str;
        this.f1083c = str2;
        this.f1084d = z10;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f1081a) {
            case 0:
                h hVar = (h) this.f1085e;
                hVar.l();
                Triple triple = new Triple(this.f1082b, this.f1083c, Boolean.valueOf(this.f1084d));
                hVar.f1091W0.a(new g(hVar, 0), triple);
                break;
            default:
                j jVar = (j) this.f1085e;
                jVar.l();
                boolean z10 = this.f1084d;
                Triple triple2 = new Triple(this.f1082b, this.f1083c, Boolean.valueOf(z10));
                jVar.f29958U0.a(new F7.d(jVar, z10, 2), triple2);
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ f(j jVar, String str, String str2) {
        this.f1081a = 1;
        this.f1085e = jVar;
        this.f1082b = str;
        this.f1083c = str2;
        this.f1084d = true;
    }
}
