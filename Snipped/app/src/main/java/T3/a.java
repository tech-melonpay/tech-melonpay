package T3;

import B5.b;
import B5.d;
import B5.e;
import B5.f;
import B5.i;
import B5.j;
import a4.p;
import a4.r;
import a4.s;
import a4.t;
import a4.u;
import a4.w;
import com.google.gson.g;
import k5.InterfaceC0946a;

/* compiled from: PaymentsRemoteDateSource.kt */
/* loaded from: classes.dex */
public final class a implements InterfaceC0946a {

    /* renamed from: a, reason: collision with root package name */
    public final F4.a f3553a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3554b;

    public a(F4.a aVar, g gVar) {
        this.f3553a = aVar;
        this.f3554b = gVar;
    }

    @Override // k5.InterfaceC0946a
    public final J5.a a(String str) {
        return X4.a.a(this.f3553a.a(str), this.f3554b, true, new Q3.a(16));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a b(d dVar) {
        return X4.a.a(this.f3553a.d(new p(dVar.f307d, dVar.f304a, dVar.f305b, dVar.f306c)), this.f3554b, true, new Q3.a(17));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a c(String str, b bVar) {
        return X4.a.a(this.f3553a.b(str, new a4.g(bVar.f299a, bVar.f300b, bVar.f301c)), this.f3554b, true, new Q3.a(20));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a d(String str, i iVar) {
        String str2 = iVar.f357a;
        String str3 = iVar.f375t;
        String str4 = iVar.f376u;
        return X4.a.a(this.f3553a.h(str, new w(str2, iVar.f358b, iVar.f359c, iVar.f360d, iVar.f361e, iVar.f362f, iVar.f363g, iVar.f364h, iVar.i, iVar.f365j, iVar.f366k, iVar.f367l, iVar.f368m, iVar.f369n, iVar.f370o, iVar.f371p, iVar.f372q, iVar.f373r, iVar.f374s, str3, str4)), this.f3554b, true, new Q3.a(14));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a e(String str, e eVar) {
        return X4.a.a(this.f3553a.c(str, new r(eVar.f308a, eVar.f309b, eVar.f310c, eVar.f311d, eVar.f312e, eVar.f313f, eVar.f314g, eVar.f315h, eVar.i)), this.f3554b, true, new Q3.a(15));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a f(String str, f fVar) {
        String str2 = fVar.f316a;
        Boolean bool = fVar.f320e;
        String str3 = fVar.f321f;
        return X4.a.a(this.f3553a.f(str, new s(bool, str2, fVar.f317b, fVar.f319d, str3, fVar.f322g, fVar.f323h, fVar.f318c)), this.f3554b, true, new Q3.a(19));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a g(String str, B5.g gVar) {
        String str2 = gVar.f324a;
        Boolean bool = gVar.f328e;
        String str3 = gVar.f329f;
        return X4.a.a(this.f3553a.g(str, new t(bool, str2, gVar.f325b, gVar.f327d, str3, gVar.f330g, gVar.f331h, gVar.f326c)), this.f3554b, true, new Q3.a(13));
    }

    @Override // k5.InterfaceC0946a
    public final J5.a h(String str, j jVar) {
        String str2 = jVar.f377a;
        String str3 = jVar.f396u;
        String str4 = jVar.f397v;
        return X4.a.a(this.f3553a.e(str, new u(str2, jVar.f378b, jVar.f379c, jVar.f380d, jVar.f381e, jVar.f382f, jVar.f383g, jVar.f384h, jVar.i, jVar.f385j, jVar.f386k, jVar.f387l, jVar.f388m, jVar.f389n, jVar.f390o, jVar.f391p, jVar.f392q, jVar.f393r, jVar.f394s, jVar.f395t, str3, str4)), this.f3554b, true, new Q3.a(18));
    }
}
