package t;

import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.camera2.internal.p f27241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.camera2.internal.o f27242c;

    public /* synthetic */ h0(androidx.camera.camera2.internal.p pVar, androidx.camera.camera2.internal.o oVar, int i) {
        this.f27240a = i;
        this.f27241b = pVar;
        this.f27242c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27240a) {
            case 0:
                androidx.camera.camera2.internal.p pVar = this.f27241b;
                androidx.camera.camera2.internal.o oVar = this.f27242c;
                androidx.camera.camera2.internal.k kVar = pVar.f5279b;
                synchronized (kVar.f5260b) {
                    kVar.f5261c.remove(pVar);
                    kVar.f5262d.remove(pVar);
                }
                pVar.p(oVar);
                Objects.requireNonNull(pVar.f5283f);
                pVar.f5283f.l(oVar);
                return;
            default:
                androidx.camera.camera2.internal.p pVar2 = this.f27241b;
                Objects.requireNonNull(pVar2.f5283f);
                pVar2.f5283f.p(this.f27242c);
                return;
        }
    }
}
