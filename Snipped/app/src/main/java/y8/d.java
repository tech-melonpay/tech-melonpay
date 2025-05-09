package Y8;

import Qa.r;
import U8.g;
import U8.l;
import U8.o;
import Y8.b;
import Y8.j;
import Y8.m;
import c9.C0630a;
import c9.C0631b;
import c9.C0632c;
import c9.C0633d;
import c9.C0634e;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: HtmlPlugin.java */
/* loaded from: classes2.dex */
public final class d extends U8.a {

    /* renamed from: b, reason: collision with root package name */
    public h f4131b;

    /* renamed from: c, reason: collision with root package name */
    public Ha.c f4132c;

    /* renamed from: d, reason: collision with root package name */
    public final U4.b f4133d = new U4.b();

    /* renamed from: a, reason: collision with root package name */
    public final j.a f4130a = new j.a();

    /* compiled from: HtmlPlugin.java */
    public class a implements l.c<Qa.k> {
        public a() {
        }

        @Override // U8.l.c
        public final void a(r rVar, U8.l lVar) {
            d.a(d.this, lVar, ((Qa.k) rVar).f3217f);
        }
    }

    /* compiled from: HtmlPlugin.java */
    public class b implements l.c<Qa.j> {
        public b() {
        }

        @Override // U8.l.c
        public final void a(r rVar, U8.l lVar) {
            d.a(d.this, lVar, ((Qa.j) rVar).f3216f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0143, code lost:
    
        if (r5 != r4) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0145, code lost:
    
        r8.getClass();
        r4 = U4.b.A(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x014c, code lost:
    
        if (r4 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014e, code lost:
    
        r14.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0152, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0158, code lost:
    
        throw new java.lang.RuntimeException(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0159, code lost:
    
        r3.g(r14.f3708a.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0164, code lost:
    
        if (r5 != r3.f4139d) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0167, code lost:
    
        r0.f4149f = r2.contains(r3.f4136a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0173, code lost:
    
        if ("p".equals(r15) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0175, code lost:
    
        Y8.a.a(r14, '\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0178, code lost:
    
        r0.f4147d = r3.f4140e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0139, code lost:
    
        if ("pre".equals(r15) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013b, code lost:
    
        r0.f4148e = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013d, code lost:
    
        r4 = r14.length();
        r5 = r3.f4137b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(Y8.d r13, U8.l r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y8.d.a(Y8.d, U8.l, java.lang.String):void");
    }

    @Override // U8.a, U8.i
    public final void afterRender(r rVar, U8.l lVar) {
        Ha.c cVar = this.f4132c;
        if (cVar == null) {
            throw new IllegalStateException("Unexpected state, html-renderer is not defined");
        }
        cVar.K(lVar, this.f4131b);
    }

    @Override // U8.a, U8.i
    public final void configureConfiguration(g.a aVar) {
        j.a aVar2 = this.f4130a;
        aVar2.getClass();
        aVar2.a(new C0632c(new C0633d(new b.a())));
        aVar2.a(new C0631b(2));
        aVar2.a(new C0630a());
        aVar2.a(new C0631b(4));
        aVar2.a(new C0631b(5));
        aVar2.a(new C0631b(3));
        aVar2.a(new c9.g());
        aVar2.a(new c9.h());
        aVar2.a(new C0634e());
        aVar2.a(new C0631b(0));
        aVar2.a(new C0631b(1));
        this.f4131b = new h(this.f4133d, new m.a());
        if (aVar2.f4154b) {
            throw new IllegalStateException("Builder has been already built");
        }
        aVar2.f4154b = true;
        HashMap hashMap = aVar2.f4153a;
        this.f4132c = hashMap.size() > 0 ? new j(Collections.unmodifiableMap(hashMap)) : new k();
    }

    @Override // U8.a, U8.i
    public final void configureVisitor(l.b bVar) {
        o.a aVar = (o.a) bVar;
        aVar.a(Qa.j.class, new b());
        aVar.a(Qa.k.class, new a());
    }
}
