package I6;

import M6.l;
import M6.w;
import com.luminary.business.presentation.ui.fragments.auth.kyc.KycFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KycFragment f1886b;

    public /* synthetic */ c(KycFragment kycFragment, int i) {
        this.f1885a = i;
        this.f1886b = kycFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1885a) {
            case 0:
                w U02 = this.f1886b.U0();
                l lVar = new l(U02, 2);
                U02.f2723y1 = lVar;
                lVar.invoke();
                break;
            default:
                this.f1886b.V0();
                break;
        }
    }
}
