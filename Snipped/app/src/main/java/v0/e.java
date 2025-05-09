package v0;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f30526a = new d(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final d f30527b = new d(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final d f30528c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f30529d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30530a = new a();

        @Override // v0.e.b
        public final int a(int i, CharSequence charSequence) {
            int i9 = 2;
            for (int i10 = 0; i10 < i && i9 == 2; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                d dVar = e.f30526a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i9 = 2;
                                break;
                        }
                    }
                    i9 = 0;
                }
                i9 = 1;
            }
            return i9;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public interface b {
        int a(int i, CharSequence charSequence);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static abstract class c implements v0.d {

        /* renamed from: a, reason: collision with root package name */
        public final b f30531a;

        public c(a aVar) {
            this.f30531a = aVar;
        }

        public abstract boolean a();

        public final boolean b(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f30531a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(i, charSequence);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    public static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f30532b;

        public d(a aVar, boolean z10) {
            super(aVar);
            this.f30532b = z10;
        }

        @Override // v0.e.c
        public final boolean a() {
            return this.f30532b;
        }
    }

    static {
        a aVar = a.f30530a;
        f30528c = new d(aVar, false);
        f30529d = new d(aVar, true);
    }
}
