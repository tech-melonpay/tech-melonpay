package Na;

import Na.h;

/* compiled from: BlockQuoteParser.java */
/* loaded from: classes3.dex */
public final class c extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final Qa.b f2863a = new Qa.b();

    /* compiled from: BlockQuoteParser.java */
    public static class a extends Sa.b {
        @Override // Sa.d
        public final d a(Sa.e eVar, h.a aVar) {
            char charAt;
            int i = ((h) eVar).f2890e;
            if (!c.i(eVar, i)) {
                return null;
            }
            h hVar = (h) eVar;
            int i9 = hVar.f2888c + hVar.f2892g;
            int i10 = i9 + 1;
            CharSequence charSequence = hVar.f2886a;
            int i11 = i + 1;
            if (i11 < charSequence.length() && ((charAt = charSequence.charAt(i11)) == '\t' || charAt == ' ')) {
                i10 = i9 + 2;
            }
            d dVar = new d(new c());
            dVar.f2866c = i10;
            return dVar;
        }
    }

    public static boolean i(Sa.e eVar, int i) {
        CharSequence charSequence = ((h) eVar).f2886a;
        return ((h) eVar).f2892g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // Sa.c
    public final b e(Sa.e eVar) {
        char charAt;
        int i = ((h) eVar).f2890e;
        if (!i(eVar, i)) {
            return null;
        }
        h hVar = (h) eVar;
        int i9 = hVar.f2888c + hVar.f2892g;
        int i10 = i9 + 1;
        CharSequence charSequence = hVar.f2886a;
        int i11 = i + 1;
        if (i11 < charSequence.length() && ((charAt = charSequence.charAt(i11)) == '\t' || charAt == ' ')) {
            i10 = i9 + 2;
        }
        return new b(-1, i10, false);
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2863a;
    }
}
