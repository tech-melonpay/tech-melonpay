package S6;

import B6.i;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.Quintuple;
import p8.C1117b;
import p8.C1118c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f3386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f3388f;

    public /* synthetic */ d(f fVar, int i, String str, String str2) {
        this.f3383a = 0;
        this.f3388f = fVar;
        this.f3384b = i;
        this.f3385c = str;
        this.f3386d = "";
        this.f3387e = str2;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f3383a) {
            case 0:
                f fVar = (f) this.f3388f;
                String valueOf = String.valueOf(fVar.f3392U0.h());
                fVar.l();
                t5.i iVar = new t5.i(this.f3384b, valueOf, this.f3385c, this.f3386d, this.f3387e);
                fVar.f3391T0.a(new e(fVar, 0), iVar);
                break;
            default:
                C1118c c1118c = (C1118c) this.f3388f;
                int h9 = c1118c.f25714U0.h();
                Integer valueOf2 = Integer.valueOf(this.f3384b);
                Integer valueOf3 = Integer.valueOf(h9);
                Quintuple quintuple = new Quintuple(this.f3385c, valueOf2, this.f3386d, valueOf3, this.f3387e);
                c1118c.f25713T0.a(new C1117b(c1118c, 0), quintuple);
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ d(C1118c c1118c, int i, String str, String str2, String str3) {
        this.f3383a = 1;
        this.f3388f = c1118c;
        this.f3384b = i;
        this.f3385c = str;
        this.f3386d = str2;
        this.f3387e = str3;
    }
}
