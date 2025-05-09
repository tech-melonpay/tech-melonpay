package androidx.lifecycle;

/* compiled from: Runnable.kt */
/* loaded from: classes.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f7065b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f7066c;

    public /* synthetic */ Y(Lifecycle lifecycle, Z z10, int i) {
        this.f7064a = i;
        this.f7065b = lifecycle;
        this.f7066c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7064a) {
            case 0:
                this.f7065b.c(this.f7066c);
                break;
            default:
                this.f7065b.a(this.f7066c);
                break;
        }
    }
}
