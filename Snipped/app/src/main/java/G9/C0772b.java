package g9;

import Na.f;
import Qa.r;
import Qa.w;
import U8.s;

/* compiled from: SimpleExtDelimiterProcessor.java */
/* renamed from: g9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0772b implements Ta.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f20839a = '@';

    /* renamed from: b, reason: collision with root package name */
    public final char f20840b = '$';

    /* renamed from: c, reason: collision with root package name */
    public final int f20841c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final s f20842d;

    public C0772b(com.sumsub.sns.internal.core.common.b bVar) {
        this.f20842d = bVar;
    }

    @Override // Ta.a
    public final int a(f fVar, f fVar2) {
        int i = fVar.f2881g;
        int i9 = this.f20841c;
        if (i < i9 || fVar2.f2881g < i9) {
            return 0;
        }
        return i9;
    }

    @Override // Ta.a
    public final void b(w wVar, w wVar2, int i) {
        c cVar = new c(this.f20842d);
        r rVar = wVar.f3231e;
        while (rVar != null && rVar != wVar2) {
            r rVar2 = rVar.f3231e;
            cVar.b(rVar);
            rVar = rVar2;
        }
        cVar.f();
        r rVar3 = wVar.f3231e;
        cVar.f3231e = rVar3;
        if (rVar3 != null) {
            rVar3.f3230d = cVar;
        }
        cVar.f3230d = wVar;
        wVar.f3231e = cVar;
        r rVar4 = wVar.f3227a;
        cVar.f3227a = rVar4;
        if (cVar.f3231e == null) {
            rVar4.f3229c = cVar;
        }
    }

    @Override // Ta.a
    public final char c() {
        return this.f20840b;
    }

    @Override // Ta.a
    public final int d() {
        return this.f20841c;
    }

    @Override // Ta.a
    public final char e() {
        return this.f20839a;
    }
}
