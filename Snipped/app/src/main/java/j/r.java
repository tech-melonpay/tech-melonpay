package J;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2083b;

    public /* synthetic */ r(j jVar, int i) {
        this.f2082a = i;
        this.f2083b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2082a) {
            case 0:
                this.f2083b.getClass();
                break;
            default:
                this.f2083b.c();
                break;
        }
    }
}
