package M6;

import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.UploadFileUI;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2643a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UploadFileUI f2644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UploadFileUI f2645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2646d;

    public /* synthetic */ o(w wVar, UploadFileUI uploadFileUI, UploadFileUI uploadFileUI2) {
        this.f2646d = wVar;
        this.f2644b = uploadFileUI;
        this.f2645c = uploadFileUI2;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        switch (this.f2643a) {
            case 0:
                w wVar = this.f2646d;
                wVar.k();
                ((J5.a) obj).a(new n(wVar, 7), new o(this.f2644b, this.f2645c, wVar));
                break;
            default:
                final I5.k kVar = (I5.k) obj;
                UploadFileUI uploadFileUI = this.f2644b;
                final UploadFileUI uploadFileUI2 = this.f2645c;
                final w wVar2 = this.f2646d;
                if (uploadFileUI != null) {
                    final long y10 = wVar2.f2702c1.y();
                    D7.d dVar = new D7.d(wVar2, String.valueOf(y10), uploadFileUI, new InterfaceC0635a() { // from class: M6.u
                        @Override // ca.InterfaceC0635a
                        public final Object invoke() {
                            UploadFileUI uploadFileUI3 = UploadFileUI.this;
                            w wVar3 = wVar2;
                            I5.k kVar2 = kVar;
                            if (uploadFileUI3 == null) {
                                wVar3.f2709j1.postValue(kVar2);
                                wVar3.f2702c1.x(kVar2);
                            } else {
                                String valueOf = String.valueOf(y10);
                                t tVar = new t(wVar3, kVar2, 1);
                                wVar3.getClass();
                                D7.d dVar2 = new D7.d(wVar3, valueOf, uploadFileUI3, tVar, 1);
                                wVar3.f2689B1 = dVar2;
                                dVar2.invoke();
                            }
                            return O9.p.f3034a;
                        }
                    }, 1);
                    wVar2.f2689B1 = dVar;
                    dVar.invoke();
                } else if (uploadFileUI2 == null) {
                    wVar2.f2709j1.postValue(kVar);
                    wVar2.f2702c1.x(kVar);
                } else {
                    D7.d dVar2 = new D7.d(wVar2, String.valueOf(wVar2.f2702c1.y()), uploadFileUI2, new t(wVar2, kVar, 0), 1);
                    wVar2.f2689B1 = dVar2;
                    dVar2.invoke();
                }
                break;
        }
        return O9.p.f3034a;
    }

    public /* synthetic */ o(UploadFileUI uploadFileUI, UploadFileUI uploadFileUI2, w wVar) {
        this.f2644b = uploadFileUI;
        this.f2645c = uploadFileUI2;
        this.f2646d = wVar;
    }
}
