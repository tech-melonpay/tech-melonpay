package Na;

/* compiled from: ListBlockParser.java */
/* loaded from: classes3.dex */
public final class n extends Sa.a {

    /* renamed from: a, reason: collision with root package name */
    public final Qa.p f2935a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2936b;

    /* renamed from: c, reason: collision with root package name */
    public int f2937c;

    /* compiled from: ListBlockParser.java */
    public static class a extends Sa.b {
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        
            if (r8.length() == 0) goto L9;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
        @Override // Sa.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Na.d a(Sa.e r17, Na.h.a r18) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Na.n.a.a(Sa.e, Na.h$a):Na.d");
        }
    }

    /* compiled from: ListBlockParser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Qa.p f2938a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2939b;

        public b(Qa.p pVar, int i) {
            this.f2938a = pVar;
            this.f2939b = i;
        }
    }

    /* compiled from: ListBlockParser.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Qa.p f2940a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2941b;

        public c(Qa.p pVar, int i) {
            this.f2940a = pVar;
            this.f2941b = i;
        }
    }

    public n(Qa.p pVar) {
        this.f2935a = pVar;
    }

    @Override // Sa.a, Sa.c
    public final boolean a() {
        return true;
    }

    @Override // Sa.a, Sa.c
    public final boolean b(Qa.a aVar) {
        if (!(aVar instanceof Qa.q)) {
            return false;
        }
        if (this.f2936b && this.f2937c == 1) {
            this.f2935a.f3226f = false;
            this.f2936b = false;
        }
        return true;
    }

    @Override // Sa.c
    public final Na.b e(Sa.e eVar) {
        h hVar = (h) eVar;
        if (hVar.f2893h) {
            this.f2936b = true;
            this.f2937c = 0;
        } else if (this.f2936b) {
            this.f2937c++;
        }
        return Na.b.a(hVar.f2887b);
    }

    @Override // Sa.c
    public final Qa.a f() {
        return this.f2935a;
    }
}
