package t;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1255g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1257i f27216b;

    public /* synthetic */ RunnableC1255g(C1257i c1257i, int i) {
        this.f27215a = i;
        this.f27216b = c1257i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27215a) {
            case 0:
                C1257i c1257i = this.f27216b;
                c1257i.a(c1257i.f27254l.f31211h);
                break;
            default:
                this.f27216b.j();
                break;
        }
    }
}
