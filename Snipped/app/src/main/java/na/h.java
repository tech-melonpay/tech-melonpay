package Na;

import Na.c;
import Na.i;
import Na.j;
import Na.k;
import Na.l;
import Na.n;
import Na.q;
import Qa.r;
import Qa.t;
import Qa.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.commonmark.internal.LinkReferenceDefinitionParser;

/* compiled from: DocumentParser.java */
/* loaded from: classes3.dex */
public final class h implements Sa.e {

    /* renamed from: p, reason: collision with root package name */
    public static final LinkedHashSet f2884p = new LinkedHashSet(Arrays.asList(Qa.b.class, Qa.i.class, Qa.g.class, Qa.j.class, x.class, Qa.p.class, Qa.m.class));

    /* renamed from: q, reason: collision with root package name */
    public static final Map<Class<? extends Qa.a>, Sa.d> f2885q;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2886a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2889d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2893h;
    public final List<Sa.d> i;

    /* renamed from: j, reason: collision with root package name */
    public final Ra.a f2894j;

    /* renamed from: k, reason: collision with root package name */
    public final List<Ta.a> f2895k;

    /* renamed from: l, reason: collision with root package name */
    public final g f2896l;

    /* renamed from: b, reason: collision with root package name */
    public int f2887b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2888c = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2890e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f2891f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f2892g = 0;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f2897m = new LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2898n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f2899o = new LinkedHashSet();

    /* compiled from: DocumentParser.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Sa.c f2900a;

        public a(Sa.c cVar) {
            this.f2900a = cVar;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Qa.b.class, new c.a());
        hashMap.put(Qa.i.class, new j.a());
        hashMap.put(Qa.g.class, new i.a());
        hashMap.put(Qa.j.class, new k.a());
        hashMap.put(x.class, new q.a());
        hashMap.put(Qa.p.class, new n.a());
        hashMap.put(Qa.m.class, new l.a());
        f2885q = Collections.unmodifiableMap(hashMap);
    }

    public h(ArrayList arrayList, Ra.b bVar, ArrayList arrayList2) {
        this.i = arrayList;
        this.f2894j = bVar;
        this.f2895k = arrayList2;
        g gVar = new g();
        this.f2896l = gVar;
        this.f2898n.add(gVar);
        this.f2899o.add(gVar);
    }

    public final void a(Sa.c cVar) {
        while (!h().b(cVar.f())) {
            e(h());
        }
        h().f().b(cVar.f());
        this.f2898n.add(cVar);
        this.f2899o.add(cVar);
    }

    public final void b(org.commonmark.internal.a aVar) {
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = aVar.f25528b;
        linkReferenceDefinitionParser.a();
        Iterator it = linkReferenceDefinitionParser.f25514c.iterator();
        while (it.hasNext()) {
            Qa.o oVar = (Qa.o) it.next();
            t tVar = aVar.f25527a;
            tVar.getClass();
            oVar.f();
            r rVar = tVar.f3230d;
            oVar.f3230d = rVar;
            if (rVar != null) {
                rVar.f3231e = oVar;
            }
            oVar.f3231e = tVar;
            tVar.f3230d = oVar;
            r rVar2 = tVar.f3227a;
            oVar.f3227a = rVar2;
            if (oVar.f3230d == null) {
                rVar2.f3228b = oVar;
            }
            LinkedHashMap linkedHashMap = this.f2897m;
            String str = oVar.f3223f;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, oVar);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.f2889d) {
            int i = this.f2887b + 1;
            CharSequence charSequence = this.f2886a;
            CharSequence subSequence2 = charSequence.subSequence(i, charSequence.length());
            int i9 = 4 - (this.f2888c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i9);
            for (int i10 = 0; i10 < i9; i10++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f2886a;
            subSequence = charSequence2.subSequence(this.f2887b, charSequence2.length());
        }
        h().g(subSequence);
    }

    public final void d() {
        if (this.f2886a.charAt(this.f2887b) != '\t') {
            this.f2887b++;
            this.f2888c++;
        } else {
            this.f2887b++;
            int i = this.f2888c;
            this.f2888c = (4 - (i % 4)) + i;
        }
    }

    public final void e(Sa.c cVar) {
        if (h() == cVar) {
            this.f2898n.remove(r0.size() - 1);
        }
        if (cVar instanceof org.commonmark.internal.a) {
            b((org.commonmark.internal.a) cVar);
        }
        cVar.c();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((Sa.c) arrayList.get(size));
        }
    }

    public final void g() {
        int i = this.f2887b;
        int i9 = this.f2888c;
        this.f2893h = true;
        int length = this.f2886a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.f2886a.charAt(i);
            if (charAt == '\t') {
                i++;
                i9 += 4 - (i9 % 4);
            } else if (charAt != ' ') {
                this.f2893h = false;
                break;
            } else {
                i++;
                i9++;
            }
        }
        this.f2890e = i;
        this.f2891f = i9;
        this.f2892g = i9 - this.f2888c;
    }

    public final Sa.c h() {
        return (Sa.c) com.google.android.gms.measurement.internal.a.f(1, this.f2898n);
    }

    public final void i(String str) {
        d dVar;
        int length = str.length();
        StringBuilder sb2 = null;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str, 0, i);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(charAt);
            }
        }
        if (sb2 != null) {
            str = sb2.toString();
        }
        this.f2886a = str;
        this.f2887b = 0;
        this.f2888c = 0;
        this.f2889d = false;
        ArrayList arrayList = this.f2898n;
        int i9 = 1;
        for (Sa.c cVar : arrayList.subList(1, arrayList.size())) {
            g();
            b e10 = cVar.e(this);
            if (!(e10 instanceof b)) {
                break;
            }
            if (e10.f2862c) {
                e(cVar);
                return;
            }
            int i10 = e10.f2860a;
            if (i10 != -1) {
                k(i10);
            } else {
                int i11 = e10.f2861b;
                if (i11 != -1) {
                    j(i11);
                }
            }
            i9++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i9, arrayList.size()));
        r12 = (Sa.c) arrayList.get(i9 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = (r12.f() instanceof t) || r12.a();
        while (true) {
            if (!z10) {
                break;
            }
            g();
            if (this.f2893h || (this.f2892g < 4 && Character.isLetter(Character.codePointAt(this.f2886a, this.f2890e)))) {
                break;
            }
            a aVar = new a(r12);
            Iterator<Sa.d> it = this.i.iterator();
            while (true) {
                if (it.hasNext()) {
                    dVar = it.next().a(this, aVar);
                    if (dVar instanceof d) {
                        break;
                    }
                } else {
                    dVar = null;
                    break;
                }
            }
            if (dVar == null) {
                k(this.f2890e);
                break;
            }
            if (!isEmpty) {
                f(arrayList2);
                isEmpty = true;
            }
            int i12 = dVar.f2865b;
            if (i12 != -1) {
                k(i12);
            } else {
                int i13 = dVar.f2866c;
                if (i13 != -1) {
                    j(i13);
                }
            }
            if (dVar.f2867d) {
                Sa.c h9 = h();
                ArrayList arrayList3 = this.f2898n;
                arrayList3.remove(arrayList3.size() - 1);
                this.f2899o.remove(h9);
                if (h9 instanceof org.commonmark.internal.a) {
                    b((org.commonmark.internal.a) h9);
                }
                h9.f().f();
            }
            Sa.c[] cVarArr = dVar.f2864a;
            for (Sa.c cVar2 : cVarArr) {
                a(cVar2);
                z10 = cVar2.a();
            }
        }
        k(this.f2890e);
        if (!isEmpty && !this.f2893h && h().d()) {
            c();
            return;
        }
        if (!isEmpty) {
            f(arrayList2);
        }
        if (!cVar2.a()) {
            c();
        } else {
            if (this.f2893h) {
                return;
            }
            a(new org.commonmark.internal.a());
            c();
        }
    }

    public final void j(int i) {
        int i9;
        int i10 = this.f2891f;
        if (i >= i10) {
            this.f2887b = this.f2890e;
            this.f2888c = i10;
        }
        int length = this.f2886a.length();
        while (true) {
            i9 = this.f2888c;
            if (i9 >= i || this.f2887b == length) {
                break;
            } else {
                d();
            }
        }
        if (i9 <= i) {
            this.f2889d = false;
            return;
        }
        this.f2887b--;
        this.f2888c = i;
        this.f2889d = true;
    }

    public final void k(int i) {
        int i9 = this.f2890e;
        if (i >= i9) {
            this.f2887b = i9;
            this.f2888c = this.f2891f;
        }
        int length = this.f2886a.length();
        while (true) {
            int i10 = this.f2887b;
            if (i10 >= i || i10 == length) {
                break;
            } else {
                d();
            }
        }
        this.f2889d = false;
    }
}
