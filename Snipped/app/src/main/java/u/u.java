package u;

import u.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.a f30072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30073c;

    public /* synthetic */ u(v.a aVar, String str, int i) {
        this.f30071a = i;
        this.f30072b = aVar;
        this.f30073c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30071a) {
            case 0:
                this.f30072b.f30077b.onCameraAvailable(this.f30073c);
                break;
            default:
                this.f30072b.f30077b.onCameraUnavailable(this.f30073c);
                break;
        }
    }
}
