package D7;

import B6.i;
import M6.w;
import O7.h;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.Quadruple;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Triple;
import u5.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f964e;

    public /* synthetic */ d(i iVar, String str, Object obj, Object obj2, int i) {
        this.f960a = i;
        this.f962c = iVar;
        this.f961b = str;
        this.f963d = obj;
        this.f964e = obj2;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        String num2;
        switch (this.f960a) {
            case 0:
                g gVar = (g) this.f962c;
                u5.d u6 = gVar.f974W0.u();
                if (u6 != null && (num = u6.f30237a) != null && (num2 = num.toString()) != null) {
                    gVar.l();
                    gVar.f973V0.a(new f(gVar, 0), new Quadruple(num2, this.f961b, (String) this.f963d, (String) this.f964e));
                }
                break;
            case 1:
                w wVar = (w) this.f962c;
                wVar.l();
                UploadFileUI uploadFileUI = (UploadFileUI) this.f963d;
                wVar.f2704e1.a(new J8.c(2, wVar, (InterfaceC0635a) this.f964e), new Pair(this.f961b, new j(uploadFileUI.f11315a, uploadFileUI.f11317c.name(), uploadFileUI.f11316b, uploadFileUI.f11320f, uploadFileUI.f11318d, uploadFileUI.f11319e)));
                break;
            case 2:
                NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) this.f962c;
                newCompanyViewModel.l();
                String str = this.f961b;
                newCompanyViewModel.f12432W0.a(new h(newCompanyViewModel, (UploadFileUI) this.f964e, str, 1), new Pair(str, (u5.b) this.f963d));
                break;
            case 3:
                NewCompanyViewModel newCompanyViewModel2 = (NewCompanyViewModel) this.f962c;
                newCompanyViewModel2.l();
                newCompanyViewModel2.f12433X0.a(new O7.e(newCompanyViewModel2, 1), new Triple(this.f961b, (String) this.f963d, (u5.b) this.f964e));
                break;
            default:
                b8.h hVar = (b8.h) this.f962c;
                String valueOf = String.valueOf(hVar.f8456T0.h());
                B5.b bVar = new B5.b(this.f961b, (BigDecimal) this.f964e, ((String) this.f963d).toUpperCase(Locale.ROOT));
                hVar.k();
                hVar.f8465c1.a(new b8.b(hVar, 11), new Pair(valueOf, bVar));
                break;
        }
        return p.f3034a;
    }

    public /* synthetic */ d(b8.h hVar, String str, BigDecimal bigDecimal, String str2) {
        this.f960a = 4;
        this.f962c = hVar;
        this.f961b = str;
        this.f964e = bigDecimal;
        this.f963d = str2;
    }
}
