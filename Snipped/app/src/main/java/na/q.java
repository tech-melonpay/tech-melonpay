package Na;

import Na.h;
import Qa.x;

/* compiled from: ThematicBreakParser.java */
/* loaded from: classes3.dex */
public final class q extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final x f2948a = new x();

    /* compiled from: ThematicBreakParser.java */
    public static class a extends Sa.b {
        @Override // Sa.d
        public final d a(Sa.e eVar, h.a aVar) {
            h hVar = (h) eVar;
            if (hVar.f2892g >= 4) {
                return null;
            }
            int i = hVar.f2890e;
            CharSequence charSequence = hVar.f2886a;
            int length = charSequence.length();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i < length) {
                    char charAt = charSequence.charAt(i);
                    if (charAt != '\t' && charAt != ' ') {
                        if (charAt == '*') {
                            i11++;
                        } else if (charAt == '-') {
                            i9++;
                        } else {
                            if (charAt != '_') {
                                break;
                            }
                            i10++;
                        }
                    }
                    i++;
                } else if ((i9 >= 3 && i10 == 0 && i11 == 0) || ((i10 >= 3 && i9 == 0 && i11 == 0) || (i11 >= 3 && i9 == 0 && i10 == 0))) {
                    d dVar = new d(new q());
                    dVar.f2865b = charSequence.length();
                    return dVar;
                }
            }
            return null;
        }
    }

    @Override // Sa.c
    public final b e(Sa.e eVar) {
        return null;
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2948a;
    }
}
