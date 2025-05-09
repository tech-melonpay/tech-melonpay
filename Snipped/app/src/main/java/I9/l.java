package I9;

/* compiled from: TransportResult.java */
/* loaded from: classes2.dex */
public abstract class l {

    /* compiled from: TransportResult.java */
    public static final class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public final int f1943a;

        public a(int i) {
            this.f1943a = i;
        }

        @Override // I9.l
        public final int a() {
            return this.f1943a;
        }

        @Override // I9.l
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: TransportResult.java */
    public static final class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1944a = new b();

        @Override // I9.l
        public final int a() {
            return -1;
        }

        @Override // I9.l
        public final boolean b() {
            return true;
        }
    }

    public abstract int a();

    public abstract boolean b();
}
