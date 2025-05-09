package com.luminary.business.presentation.ui.fragments.company.list;

import B7.f;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.domain.entity.company.CorporateDetailsDomain;
import com.luminary.business.presentation.ui.fragments.company.list.a;
import com.luminary.mobile.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import s6.C1225n;
import s6.C1226o;

/* compiled from: CompaniesListController.kt */
/* loaded from: classes2.dex */
public final class CompaniesListController extends TypedEpoxyController<List<? extends com.luminary.business.presentation.ui.fragments.company.list.a>> {
    private final Context context;
    private final InterfaceC0646l<Integer, p> onClick;

    /* compiled from: CompaniesListController.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11865a;

        static {
            int[] iArr = new int[CorporateDetailsDomain.StatusIdentification.values().length];
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar2 = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CorporateDetailsDomain.StatusIdentification.a aVar3 = CorporateDetailsDomain.StatusIdentification.f10854a;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11865a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompaniesListController(Context context, InterfaceC0646l<? super Integer, p> interfaceC0646l) {
        this.context = context;
        this.onClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$4$lambda$3$lambda$2(com.luminary.business.presentation.ui.fragments.company.list.a aVar, CompaniesListController companiesListController, View view) {
        Integer num;
        CorporateDetailsDomain.a aVar2 = ((a.C0118a) aVar).f11902a.f10804a;
        if (aVar2 == null || (num = aVar2.f10889a) == null) {
            return;
        }
        int intValue = num.intValue();
        InterfaceC0646l<Integer, p> interfaceC0646l = companiesListController.onClick;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(Integer.valueOf(intValue));
        }
    }

    private final int getIconByStatus(CorporateDetailsDomain.StatusIdentification statusIdentification) {
        return a.f11865a[statusIdentification.ordinal()] == 2 ? R.drawable.ic_arrow_right : R.color.transparent;
    }

    private final String getTextByStatus(CorporateDetailsDomain.StatusIdentification statusIdentification) {
        int ordinal = statusIdentification.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 3 ? "" : this.context.getString(R.string.info_required) : this.context.getString(R.string.under_review) : this.context.getString(R.string.approved);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(List<? extends com.luminary.business.presentation.ui.fragments.company.list.a> list) {
        CorporateDetailsDomain.StatusIdentification statusIdentification;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                com.luminary.business.presentation.ui.fragments.company.list.a aVar = (com.luminary.business.presentation.ui.fragments.company.list.a) obj;
                if (aVar instanceof a.b) {
                    a.b bVar = (a.b) aVar;
                    String textByStatus = getTextByStatus(bVar.f11903a);
                    C1225n c1225n = new C1225n();
                    c1225n.a("company_" + bVar.f11903a + System.currentTimeMillis());
                    c1225n.b(Boolean.valueOf(i == 0));
                    c1225n.c(textByStatus);
                    add(c1225n);
                } else {
                    if (!(aVar instanceof a.C0118a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.C0118a c0118a = (a.C0118a) aVar;
                    CorporateDetailsDomain.a aVar2 = c0118a.f11902a.f10804a;
                    Integer valueOf = (aVar2 == null || (statusIdentification = aVar2.f10896d0) == null) ? null : Integer.valueOf(getIconByStatus(statusIdentification));
                    C1226o c1226o = new C1226o();
                    CorporateDetailsDomain corporateDetailsDomain = c0118a.f11902a;
                    CorporateDetailsDomain.a aVar3 = corporateDetailsDomain.f10804a;
                    Integer num = aVar3 != null ? aVar3.f10889a : null;
                    c1226o.c("company_" + num + System.currentTimeMillis());
                    CorporateDetailsDomain.a aVar4 = corporateDetailsDomain.f10804a;
                    c1226o.e(aVar4 != null ? aVar4.f10937z : null);
                    c1226o.a(corporateDetailsDomain.i);
                    c1226o.b(valueOf);
                    c1226o.d(new f(11, (a.C0118a) aVar, this));
                    add(c1226o);
                }
                i = i9;
            }
        }
    }
}
