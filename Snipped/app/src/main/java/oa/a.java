package Oa;

import Na.f;
import Qa.r;
import Qa.v;
import Qa.w;

/* compiled from: AsteriskDelimiterProcessor.java */
/* loaded from: classes3.dex */
public final class a implements Ta.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f3035a;

    public a(char c2) {
        this.f3035a = c2;
    }

    @Override // Ta.a
    public final int a(f fVar, f fVar2) {
        if (fVar.f2878d || fVar2.f2877c) {
            int i = fVar2.f2882h;
            if (i % 3 != 0 && (fVar.f2882h + i) % 3 == 0) {
                return 0;
            }
        }
        return (fVar.f2881g < 2 || fVar2.f2881g < 2) ? 1 : 2;
    }

    @Override // Ta.a
    public final void b(w wVar, w wVar2, int i) {
        String.valueOf(this.f3035a);
        r fVar = i == 1 ? new Qa.f() : new v();
        r rVar = wVar.f3231e;
        while (rVar != null && rVar != wVar2) {
            r rVar2 = rVar.f3231e;
            fVar.b(rVar);
            rVar = rVar2;
        }
        fVar.f();
        r rVar3 = wVar.f3231e;
        fVar.f3231e = rVar3;
        if (rVar3 != null) {
            rVar3.f3230d = fVar;
        }
        fVar.f3230d = wVar;
        wVar.f3231e = fVar;
        r rVar4 = wVar.f3227a;
        fVar.f3227a = rVar4;
        if (fVar.f3231e == null) {
            rVar4.f3229c = fVar;
        }
    }

    @Override // Ta.a
    public final char c() {
        return this.f3035a;
    }

    @Override // Ta.a
    public final int d() {
        return 1;
    }

    @Override // Ta.a
    public final char e() {
        return this.f3035a;
    }
}
