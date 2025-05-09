package q;

import q.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25758b;

    public /* synthetic */ e(g gVar, int i) {
        this.f25757a = i;
        this.f25758b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25757a) {
            case 0:
                this.f25758b.f25761f0.f25804T0 = false;
                break;
            case 1:
                k kVar = this.f25758b.f25761f0;
                if (kVar.f25810p == null) {
                    kVar.f25810p = new j();
                }
                kVar.f25810p.c();
                break;
            case 2:
                k kVar2 = this.f25758b.f25761f0;
                if (kVar2.f25810p == null) {
                    kVar2.f25810p = new j();
                }
                kVar2.f25810p.a();
                break;
            default:
                k kVar3 = this.f25758b.f25761f0;
                if (kVar3.f25810p == null) {
                    kVar3.f25810p = new j();
                }
                kVar3.f25810p.b();
                break;
        }
    }

    public /* synthetic */ e(g gVar, int i, CharSequence charSequence) {
        this.f25757a = 2;
        this.f25758b = gVar;
    }

    public /* synthetic */ e(g gVar, i.b bVar) {
        this.f25757a = 1;
        this.f25758b = gVar;
    }
}
