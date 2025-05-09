package Na;

import Qa.t;

/* compiled from: ListItemParser.java */
/* loaded from: classes3.dex */
public final class o extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final Qa.q f2942a = new Qa.q();

    /* renamed from: b, reason: collision with root package name */
    public final int f2943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2944c;

    public o(int i) {
        this.f2943b = i;
    }

    @Override // Sa.a, Sa.c
    public final boolean a() {
        return true;
    }

    @Override // Sa.a, Sa.c
    public final boolean b(Qa.a aVar) {
        if (!this.f2944c) {
            return true;
        }
        Qa.a aVar2 = (Qa.a) this.f2942a.f3227a;
        if (!(aVar2 instanceof Qa.p)) {
            return true;
        }
        ((Qa.p) aVar2).f3226f = false;
        return true;
    }

    @Override // Sa.c
    public final b e(Sa.e eVar) {
        h hVar = (h) eVar;
        if (hVar.f2893h) {
            if (this.f2942a.f3228b == null) {
                return null;
            }
            Qa.a f10 = hVar.h().f();
            this.f2944c = (f10 instanceof t) || (f10 instanceof Qa.q);
            return b.a(hVar.f2890e);
        }
        int i = hVar.f2892g;
        int i9 = this.f2943b;
        if (i >= i9) {
            return new b(-1, hVar.f2888c + i9, false);
        }
        return null;
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2942a;
    }
}
