package org.commonmark.internal;

import Na.b;
import Na.h;
import Na.m;
import Qa.t;
import Sa.e;

/* compiled from: ParagraphParser.java */
/* loaded from: classes3.dex */
public final class a extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f25527a = new t();

    /* renamed from: b, reason: collision with root package name */
    public final LinkReferenceDefinitionParser f25528b = new LinkReferenceDefinitionParser();

    @Override // Sa.a, Sa.c
    public final void c() {
        if (this.f25528b.f25513b.length() == 0) {
            this.f25527a.f();
        }
    }

    @Override // Sa.c
    public final b e(e eVar) {
        h hVar = (h) eVar;
        if (hVar.f2893h) {
            return null;
        }
        return b.a(hVar.f2887b);
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f25527a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0106, code lost:
    
        if (r6 == r7) goto L21;
     */
    @Override // Sa.a, Sa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.a.g(java.lang.CharSequence):void");
    }

    @Override // Sa.a, Sa.c
    public final void h(m mVar) {
        StringBuilder sb2 = this.f25528b.f25513b;
        if (sb2.length() > 0) {
            mVar.f(sb2.toString(), this.f25527a);
        }
    }
}
