package E6;

import B6.i;
import O7.h;
import O9.p;
import ca.InterfaceC0635a;
import com.luminary.business.domain.Quadruple;
import com.luminary.business.domain.entity.payments.PaymentDomain;
import com.luminary.business.domain.entity.templates.CheckTemplatesRequestDomain;
import com.luminary.business.presentation.entity.company.UploadFileUI;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import j8.e;
import java.io.Serializable;
import java.util.Date;
import kotlin.Pair;
import kotlin.Triple;
import s7.C1239c;
import s7.C1240d;
import u5.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f1061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1063f;

    public /* synthetic */ c(i iVar, Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.f1058a = i;
        this.f1059b = iVar;
        this.f1060c = obj;
        this.f1061d = serializable;
        this.f1062e = obj2;
        this.f1063f = obj3;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Integer num;
        Integer num2;
        String num3;
        Integer num4;
        switch (this.f1058a) {
            case 0:
                d dVar = (d) this.f1059b;
                dVar.l();
                u5.d u6 = dVar.f1065U0.u();
                String num5 = (u6 == null || (num = u6.f30237a) == null) ? null : num.toString();
                SortDialog.Status status = SortDialog.Status.f13217a;
                SortDialog.Status status2 = (SortDialog.Status) this.f1060c;
                String str = status2 == status ? "desc" : status2 == SortDialog.Status.f13218b ? "asc" : null;
                String str2 = status2 == SortDialog.Status.f13220d ? "asc" : status2 == SortDialog.Status.f13219c ? "desc" : null;
                if (num5 == null) {
                    num5 = "";
                }
                String str3 = num5;
                int i = dVar.f1068X0;
                Date date = (Date) this.f1061d;
                String F02 = date != null ? D9.b.F0(date, "yyyy-MM-dd'T'HH:mm:ss") : null;
                Date date2 = (Date) this.f1062e;
                String F03 = date2 != null ? D9.b.F0(date2, "yyyy-MM-dd'T'HH:mm:ss") : null;
                SortDialog.Direction direction = SortDialog.Direction.f13213a;
                SortDialog.Direction direction2 = (SortDialog.Direction) this.f1063f;
                dVar.f1064T0.a(new C7.a(dVar, 2), new H5.a(str3, null, i, null, F02, F03, direction2 != direction ? direction2 == SortDialog.Direction.f13214b ? "DEBIT" : "CREDIT" : null, str, str2, null, null, 1536));
                break;
            case 1:
                NewCompanyViewModel newCompanyViewModel = (NewCompanyViewModel) this.f1059b;
                newCompanyViewModel.l();
                String str4 = (String) this.f1060c;
                newCompanyViewModel.f12433X0.a(new h(newCompanyViewModel, (UploadFileUI) this.f1063f, str4, 0), new Triple(str4, (String) this.f1061d, (u5.b) this.f1062e));
                break;
            case 2:
                NewCompanyViewModel newCompanyViewModel2 = (NewCompanyViewModel) this.f1059b;
                newCompanyViewModel2.l();
                UploadFileUI uploadFileUI = (UploadFileUI) this.f1061d;
                newCompanyViewModel2.f12435Z0.a(new H6.h(newCompanyViewModel2, (InterfaceC0635a) this.f1062e, (InterfaceC0635a) this.f1063f, 1), new Pair((String) this.f1060c, new j(uploadFileUI.f11315a, uploadFileUI.f11317c.name(), uploadFileUI.f11316b, uploadFileUI.f11320f, uploadFileUI.f11318d, uploadFileUI.f11319e)));
                break;
            case 3:
                b8.h hVar = (b8.h) this.f1059b;
                hVar.l();
                hVar.f8467e1.a(new b8.b(hVar, 3), new CheckTemplatesRequestDomain(String.valueOf(hVar.f8456T0.h()), (String) this.f1060c, (String) this.f1061d, (String) this.f1062e, (String) this.f1063f));
                break;
            case 4:
                b8.h hVar2 = (b8.h) this.f1059b;
                u5.d u10 = hVar2.f8456T0.u();
                if (u10 != null && (num2 = u10.f30237a) != null && (num3 = num2.toString()) != null) {
                    hVar2.l();
                    hVar2.f8466d1.a(new J8.c(7, hVar2, (PaymentDomain) this.f1063f), new Quadruple(num3, (String) this.f1060c, (String) this.f1061d, (String) this.f1062e));
                }
                break;
            case 5:
                com.luminary.business.presentation.ui.fragments.payments.a aVar = (com.luminary.business.presentation.ui.fragments.payments.a) this.f1059b;
                aVar.l();
                u5.d u11 = aVar.f12955V0.u();
                String num6 = (u11 == null || (num4 = u11.f30237a) == null) ? null : num4.toString();
                SortDialog.Status status3 = SortDialog.Status.f13217a;
                SortDialog.Status status4 = (SortDialog.Status) this.f1060c;
                String str5 = status4 == status3 ? "desc" : status4 == SortDialog.Status.f13218b ? "asc" : null;
                String str6 = status4 == SortDialog.Status.f13220d ? "asc" : status4 == SortDialog.Status.f13219c ? "desc" : null;
                if (num6 == null) {
                    num6 = "";
                }
                String str7 = num6;
                int i9 = aVar.f12962c1;
                Date date3 = (Date) this.f1061d;
                String F04 = date3 != null ? D9.b.F0(date3, "yyyy-MM-dd'T'HH:mm:ss") : null;
                Date date4 = (Date) this.f1062e;
                String F05 = date4 != null ? D9.b.F0(date4, "yyyy-MM-dd'T'HH:mm:ss") : null;
                SortDialog.Direction direction3 = SortDialog.Direction.f13213a;
                SortDialog.Direction direction4 = (SortDialog.Direction) this.f1063f;
                aVar.f12953T0.a(new e(aVar, 0), new H5.a(str7, null, i9, null, F04, F05, direction4 != direction3 ? direction4 == SortDialog.Direction.f13214b ? "DEBIT" : "CREDIT" : null, str5, str6, null, null, 1536));
                break;
            default:
                C1240d c1240d = (C1240d) this.f1059b;
                c1240d.l();
                c1240d.f27054V0.a(new C1239c(c1240d, 0), new v5.d(c1240d.f27052T0.h(), (String) this.f1060c, (String) this.f1061d, (String) this.f1062e, (String) this.f1063f));
                break;
        }
        return p.f3034a;
    }
}
