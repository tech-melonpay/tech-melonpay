package Na;

/* compiled from: FencedCodeBlockParser.java */
/* loaded from: classes3.dex */
public final class i extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final Qa.g f2901a;

    /* renamed from: b, reason: collision with root package name */
    public String f2902b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f2903c;

    /* compiled from: FencedCodeBlockParser.java */
    public static class a extends Sa.b {
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        
            if (r4 != (-1)) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
        @Override // Sa.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Na.d a(Sa.e r12, Na.h.a r13) {
            /*
                r11 = this;
                r13 = 0
                r0 = 1
                Na.h r12 = (Na.h) r12
                int r1 = r12.f2892g
                r2 = 4
                r3 = 0
                if (r1 < r2) goto Lb
                return r3
            Lb:
                int r2 = r12.f2890e
                java.lang.CharSequence r12 = r12.f2886a
                int r4 = r12.length()
                r6 = r13
                r7 = r6
                r5 = r2
            L16:
                r8 = 126(0x7e, float:1.77E-43)
                r9 = 96
                if (r5 >= r4) goto L2a
                char r10 = r12.charAt(r5)
                if (r10 == r9) goto L27
                if (r10 == r8) goto L25
                goto L2a
            L25:
                int r7 = r7 + r0
                goto L28
            L27:
                int r6 = r6 + r0
            L28:
                int r5 = r5 + r0
                goto L16
            L2a:
                r4 = 3
                if (r6 < r4) goto L4a
                if (r7 != 0) goto L4a
                int r4 = r2 + r6
                int r5 = r12.length()
            L35:
                if (r4 >= r5) goto L44
                char r7 = r12.charAt(r4)
                if (r7 != r9) goto L42
                r12 = -1
                if (r4 == r12) goto L44
            L40:
                r12 = r3
                goto L53
            L42:
                int r4 = r4 + r0
                goto L35
            L44:
                Na.i r12 = new Na.i
                r12.<init>(r9, r6, r1)
                goto L53
            L4a:
                if (r7 < r4) goto L40
                if (r6 != 0) goto L40
                Na.i r12 = new Na.i
                r12.<init>(r8, r7, r1)
            L53:
                if (r12 == 0) goto L66
                Sa.c[] r0 = new Sa.c[r0]
                r0[r13] = r12
                Na.d r13 = new Na.d
                r13.<init>(r0)
                Qa.g r12 = r12.f2901a
                int r12 = r12.f3212g
                int r2 = r2 + r12
                r13.f2865b = r2
                return r13
            L66:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Na.i.a.a(Sa.e, Na.h$a):Na.d");
        }
    }

    public i(char c2, int i, int i9) {
        Qa.g gVar = new Qa.g();
        this.f2901a = gVar;
        this.f2903c = new StringBuilder();
        gVar.f3211f = c2;
        gVar.f3212g = i;
        gVar.f3213h = i9;
    }

    @Override // Sa.a, Sa.c
    public final void c() {
        String a10 = Pa.a.a(this.f2902b.trim());
        Qa.g gVar = this.f2901a;
        gVar.i = a10;
        gVar.f3214j = this.f2903c.toString();
    }

    @Override // Sa.c
    public final b e(Sa.e eVar) {
        h hVar = (h) eVar;
        int i = hVar.f2890e;
        int i9 = hVar.f2887b;
        CharSequence charSequence = hVar.f2886a;
        int i10 = hVar.f2892g;
        Qa.g gVar = this.f2901a;
        if (i10 < 4) {
            char c2 = gVar.f3211f;
            int i11 = gVar.f3212g;
            int A10 = Ja.a.A(c2, i, charSequence.length(), charSequence) - i;
            if (A10 >= i11 && Ja.a.B(charSequence, i + A10, charSequence.length()) == charSequence.length()) {
                return new b(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i12 = gVar.f3213h; i12 > 0 && i9 < length && charSequence.charAt(i9) == ' '; i12--) {
            i9++;
        }
        return b.a(i9);
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2901a;
    }

    @Override // Sa.a, Sa.c
    public final void g(CharSequence charSequence) {
        if (this.f2902b == null) {
            this.f2902b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f2903c;
        sb2.append(charSequence);
        sb2.append('\n');
    }
}
