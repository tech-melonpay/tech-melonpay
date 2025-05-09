package U8;

import C.N;
import U8.o;
import U8.t;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarkwonImpl.java */
/* loaded from: classes2.dex */
public final class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Ra.c f3690a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3691b;

    /* renamed from: c, reason: collision with root package name */
    public final List<i> f3692c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3693d;

    public h(Ra.c cVar, m mVar, List list, boolean z10) {
        this.f3690a = cVar;
        this.f3691b = mVar;
        this.f3692c = list;
        this.f3693d = z10;
    }

    @Override // U8.e
    public final SpannableStringBuilder a(String str) {
        List<i> list = this.f3692c;
        Iterator<i> it = list.iterator();
        String str2 = str;
        while (it.hasNext()) {
            str2 = it.next().processMarkdown(str2);
        }
        Ra.c cVar = this.f3690a;
        cVar.getClass();
        if (str2 == null) {
            throw new NullPointerException("input must not be null");
        }
        Na.h hVar = new Na.h(cVar.f3320a, cVar.f3322c, cVar.f3321b);
        int i = 0;
        while (true) {
            int length = str2.length();
            int i9 = i;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                }
                char charAt = str2.charAt(i9);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                break;
            }
            hVar.i(str2.substring(i, i9));
            i = i9 + 1;
            if (i < str2.length() && str2.charAt(i9) == '\r' && str2.charAt(i) == '\n') {
                i = i9 + 2;
            }
        }
        if (str2.length() > 0 && (i == 0 || i < str2.length())) {
            hVar.i(str2.substring(i));
        }
        hVar.f(hVar.f2898n);
        B1.f fVar = new B1.f(6, hVar.f2895k, hVar.f2897m);
        ((Ra.b) hVar.f2894j).getClass();
        Na.m mVar = new Na.m(fVar);
        Iterator it2 = hVar.f2899o.iterator();
        while (it2.hasNext()) {
            ((Sa.c) it2.next()).h(mVar);
        }
        Qa.r rVar = hVar.f2896l.f2883a;
        Iterator it3 = cVar.f3323d.iterator();
        while (it3.hasNext()) {
            rVar = ((Ra.d) it3.next()).a();
        }
        Iterator<i> it4 = list.iterator();
        while (it4.hasNext()) {
            it4.next().beforeRender(rVar);
        }
        m mVar2 = (m) this.f3691b;
        mVar2.getClass();
        N n10 = new N(6, (byte) 0);
        o.a aVar = (o.a) mVar2.f3696a;
        aVar.getClass();
        o oVar = new o(mVar2.f3697b, n10, new t(), Collections.unmodifiableMap(aVar.f3703a), new b());
        rVar.a(oVar);
        Iterator<i> it5 = list.iterator();
        while (it5.hasNext()) {
            it5.next().afterRender(rVar, oVar);
        }
        t tVar = oVar.f3700c;
        tVar.getClass();
        t.b bVar = new t.b(tVar.f3708a);
        Iterator it6 = tVar.f3709b.iterator();
        while (it6.hasNext()) {
            t.a aVar2 = (t.a) it6.next();
            bVar.setSpan(aVar2.f3710a, aVar2.f3711b, aVar2.f3712c, aVar2.f3713d);
        }
        return (TextUtils.isEmpty(bVar) && this.f3693d && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : bVar;
    }
}
