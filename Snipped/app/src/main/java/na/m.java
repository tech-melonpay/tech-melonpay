package Na;

import C.v;
import Qa.r;
import Qa.w;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: InlineParserImpl.java */
/* loaded from: classes3.dex */
public final class m {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2913j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2914k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2915l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2916m = Pattern.compile("`+");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f2917n = Pattern.compile("^`+");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f2918o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f2919p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f2920q = Pattern.compile("^ *(?:\n *)?");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f2921r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f2922s = Pattern.compile("\\s+");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f2923t = Pattern.compile(" *$");

    /* renamed from: a, reason: collision with root package name */
    public final BitSet f2924a;

    /* renamed from: b, reason: collision with root package name */
    public final BitSet f2925b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2926c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.f f2927d;

    /* renamed from: e, reason: collision with root package name */
    public String f2928e;

    /* renamed from: f, reason: collision with root package name */
    public int f2929f;

    /* renamed from: g, reason: collision with root package name */
    public f f2930g;

    /* renamed from: h, reason: collision with root package name */
    public e f2931h;

    /* compiled from: InlineParserImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2932a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2933b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2934c;

        public a(int i, boolean z10, boolean z11) {
            this.f2932a = i;
            this.f2934c = z10;
            this.f2933b = z11;
        }
    }

    public m(B1.f fVar) {
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new Oa.a('*'), new Oa.a('_')), hashMap);
        b((List) fVar.f229b, hashMap);
        this.f2926c = hashMap;
        Set keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f2925b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f2924a = bitSet2;
        this.f2927d = fVar;
    }

    public static void a(char c2, Ta.a aVar, HashMap hashMap) {
        if (((Ta.a) hashMap.put(Character.valueOf(c2), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c2 + "'");
    }

    public static void b(List list, HashMap hashMap) {
        p pVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ta.a aVar = (Ta.a) it.next();
            char e10 = aVar.e();
            char c2 = aVar.c();
            if (e10 == c2) {
                Ta.a aVar2 = (Ta.a) hashMap.get(Character.valueOf(e10));
                if (aVar2 == null || aVar2.e() != aVar2.c()) {
                    a(e10, aVar, hashMap);
                } else {
                    if (aVar2 instanceof p) {
                        pVar = (p) aVar2;
                    } else {
                        p pVar2 = new p(e10);
                        pVar2.f(aVar2);
                        pVar = pVar2;
                    }
                    pVar.f(aVar);
                    hashMap.put(Character.valueOf(e10), pVar);
                }
            } else {
                a(e10, aVar, hashMap);
                a(c2, aVar, hashMap);
            }
        }
    }

    public static void d(w wVar, w wVar2, int i9) {
        if (wVar == null || wVar2 == null || wVar == wVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i9);
        sb2.append(wVar.f3234f);
        r rVar = wVar.f3231e;
        r rVar2 = wVar2.f3231e;
        while (rVar != rVar2) {
            sb2.append(((w) rVar).f3234f);
            r rVar3 = rVar.f3231e;
            rVar.f();
            rVar = rVar3;
        }
        wVar.f3234f = sb2.toString();
    }

    public static void e(r rVar, r rVar2) {
        w wVar = null;
        w wVar2 = null;
        int i9 = 0;
        while (rVar != null) {
            if (rVar instanceof w) {
                wVar2 = (w) rVar;
                if (wVar == null) {
                    wVar = wVar2;
                }
                i9 = wVar2.f3234f.length() + i9;
            } else {
                d(wVar, wVar2, i9);
                wVar = null;
                wVar2 = null;
                i9 = 0;
            }
            if (rVar == rVar2) {
                break;
            } else {
                rVar = rVar.f3231e;
            }
        }
        d(wVar, wVar2, i9);
    }

    public final String c(Pattern pattern) {
        if (this.f2929f >= this.f2928e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f2928e);
        matcher.region(this.f2929f, this.f2928e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f2929f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x04f7 A[LOOP:0: B:2:0x0014->B:7:0x04f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x04fe A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v12, types: [Qa.u] */
    /* JADX WARN: Type inference failed for: r3v13, types: [Qa.h] */
    /* JADX WARN: Type inference failed for: r3v59, types: [Qa.h] */
    /* JADX WARN: Type inference failed for: r3v6, types: [Qa.u] */
    /* JADX WARN: Type inference failed for: r4v15, types: [Qa.n, Qa.r] */
    /* JADX WARN: Type inference failed for: r4v16, types: [Qa.k] */
    /* JADX WARN: Type inference failed for: r4v18, types: [Qa.n, Qa.r] */
    /* JADX WARN: Type inference failed for: r5v15, types: [Qa.d] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r6v17, types: [Qa.n] */
    /* JADX WARN: Type inference failed for: r6v19, types: [Qa.l, Qa.r] */
    /* JADX WARN: Type inference failed for: r6v30, types: [Na.m$a] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r17, Qa.a r18) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Na.m.f(java.lang.String, Qa.a):void");
    }

    public final char g() {
        if (this.f2929f < this.f2928e.length()) {
            return this.f2928e.charAt(this.f2929f);
        }
        return (char) 0;
    }

    public final void h(f fVar) {
        boolean z10;
        r rVar;
        HashMap hashMap = new HashMap();
        f fVar2 = this.f2930g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f2879e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            HashMap hashMap2 = this.f2926c;
            char c2 = fVar2.f2876b;
            Ta.a aVar = (Ta.a) hashMap2.get(Character.valueOf(c2));
            if (!fVar2.f2878d || aVar == null) {
                fVar2 = fVar2.f2880f;
            } else {
                char e10 = aVar.e();
                f fVar4 = fVar2.f2879e;
                int i9 = 0;
                boolean z11 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c2))) {
                    if (fVar4.f2877c && fVar4.f2876b == e10) {
                        i9 = aVar.a(fVar4, fVar2);
                        z11 = true;
                        if (i9 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f2879e;
                }
                z10 = z11;
                z11 = false;
                if (z11) {
                    w wVar = fVar4.f2875a;
                    fVar4.f2881g -= i9;
                    fVar2.f2881g -= i9;
                    wVar.f3234f = v.j(i9, 0, wVar.f3234f);
                    w wVar2 = fVar2.f2875a;
                    wVar2.f3234f = v.j(i9, 0, wVar2.f3234f);
                    f fVar5 = fVar2.f2879e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        f fVar6 = fVar5.f2879e;
                        i(fVar5);
                        fVar5 = fVar6;
                    }
                    if (wVar != wVar2 && (rVar = wVar.f3231e) != wVar2) {
                        e(rVar, wVar2.f3230d);
                    }
                    aVar.b(wVar, wVar2, i9);
                    if (fVar4.f2881g == 0) {
                        fVar4.f2875a.f();
                        i(fVar4);
                    }
                    if (fVar2.f2881g == 0) {
                        f fVar7 = fVar2.f2880f;
                        wVar2.f();
                        i(fVar2);
                        fVar2 = fVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c2), fVar2.f2879e);
                        if (!fVar2.f2877c) {
                            i(fVar2);
                        }
                    }
                    fVar2 = fVar2.f2880f;
                }
            }
        }
        while (true) {
            f fVar8 = this.f2930g;
            if (fVar8 == null || fVar8 == fVar) {
                return;
            } else {
                i(fVar8);
            }
        }
    }

    public final void i(f fVar) {
        f fVar2 = fVar.f2879e;
        if (fVar2 != null) {
            fVar2.f2880f = fVar.f2880f;
        }
        f fVar3 = fVar.f2880f;
        if (fVar3 == null) {
            this.f2930g = fVar2;
        } else {
            fVar3.f2879e = fVar2;
        }
    }
}
