package Na;

import Na.h;
import Qa.t;
import java.util.ArrayList;

/* compiled from: IndentedCodeBlockParser.java */
/* loaded from: classes3.dex */
public final class l extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final Qa.m f2911a = new Qa.m();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2912b = new ArrayList();

    /* compiled from: IndentedCodeBlockParser.java */
    public static class a extends Sa.b {
        @Override // Sa.d
        public final d a(Sa.e eVar, h.a aVar) {
            h hVar = (h) eVar;
            if (hVar.f2892g < 4 || hVar.f2893h || (hVar.h().f() instanceof t)) {
                return null;
            }
            d dVar = new d(new l());
            dVar.f2866c = hVar.f2888c + 4;
            return dVar;
        }
    }

    @Override // Sa.a, Sa.c
    public final void c() {
        int i;
        ArrayList arrayList = this.f2912b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) arrayList.get(size);
                int length = charSequence.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    char charAt = charSequence.charAt(i9);
                    if (charAt != ' ') {
                        switch (charAt) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (i9 == -1) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    i9++;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb2.append((CharSequence) arrayList.get(i));
            sb2.append('\n');
        }
        this.f2911a.f3220f = sb2.toString();
    }

    @Override // Sa.c
    public final b e(Sa.e eVar) {
        h hVar = (h) eVar;
        if (hVar.f2892g >= 4) {
            return new b(-1, hVar.f2888c + 4, false);
        }
        if (hVar.f2893h) {
            return b.a(hVar.f2890e);
        }
        return null;
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2911a;
    }

    @Override // Sa.a, Sa.c
    public final void g(CharSequence charSequence) {
        this.f2912b.add(charSequence);
    }
}
