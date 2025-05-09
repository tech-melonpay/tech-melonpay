package M6;

import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.UploadFileUI;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UploadFileUI f2649c;

    public /* synthetic */ p(w wVar, UploadFileUI uploadFileUI, int i) {
        this.f2647a = i;
        this.f2648b = wVar;
        this.f2649c = uploadFileUI;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f2647a) {
            case 0:
                w wVar = this.f2648b;
                wVar.k();
                ((J5.a) obj).a(new n(wVar, 5), new p(wVar, this.f2649c, 1));
                break;
            default:
                w wVar2 = this.f2648b;
                long y10 = wVar2.f2702c1.y();
                UploadFileUI uploadFileUI = this.f2649c;
                if (uploadFileUI != null) {
                    D7.d dVar = new D7.d(wVar2, String.valueOf(y10), uploadFileUI, new l(wVar2, 3), 1);
                    wVar2.f2689B1 = dVar;
                    dVar.invoke();
                } else {
                    wVar2.f2702c1.J();
                    wVar2.f2722x1.setValue(null);
                }
                break;
        }
        return O9.p.f3034a;
    }
}
