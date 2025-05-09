package com.luminary.business.presentation.ui.fragments.invoices.invoices_new;

import B.e;
import B7.f;
import O9.p;
import P9.m;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.home.newhome.b;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import s6.C1208C;
import s6.C1209D;
import s6.n0;

/* compiled from: InvoicesNewController.kt */
/* loaded from: classes2.dex */
public final class InvoicesNewController extends Typed3EpoxyController<List<? extends b>, List<? extends b>, Integer> {
    private final Context context;
    private final InterfaceC0646l<String, p> onItemClick;
    private List<? extends b> stickyHeaders = EmptyList.f23104a;
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public InvoicesNewController(Context context, TabLayout.d dVar, InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.context = context;
        this.tabChangeListener = dVar;
        this.onItemClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(InvoicesNewController invoicesNewController, Integer num, C1209D c1209d, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_invoices);
        tabLayout.a(invoicesNewController.tabChangeListener);
        TabLayout.g h9 = tabLayout.h(num.intValue());
        if (h9 != null) {
            h9.a();
        }
    }

    private final void invoicesToShow(List<? extends b> list) {
        boolean z10;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof b.c) {
                    arrayList.add(obj);
                }
            }
            z10 = arrayList.isEmpty();
        } else {
            z10 = false;
        }
        if (list != null) {
            int i = 0;
            for (Object obj2 : list) {
                int i9 = i + 1;
                if (i < 0) {
                    m.t();
                    throw null;
                }
                b bVar = (b) obj2;
                if (bVar instanceof b.c) {
                    n0 n0Var = new n0();
                    b.c cVar = (b.c) bVar;
                    n0Var.a("section_header_" + cVar.f12267a + "_" + System.currentTimeMillis());
                    n0Var.d(cVar.f12267a);
                    Boolean bool = Boolean.FALSE;
                    n0Var.b(bool);
                    n0Var.c(bool);
                    add(n0Var);
                } else if (bVar instanceof b.a) {
                    C1208C c1208c = new C1208C();
                    b.a aVar = (b.a) bVar;
                    c1208c.d("transaction_" + aVar.f12265a.f11371a);
                    Context context = this.context;
                    TransactionUI transactionUI = aVar.f12265a;
                    c1208c.h(D9.b.S(transactionUI, context));
                    c1208c.j(D9.b.U(D9.b.R(transactionUI, this.context)));
                    c1208c.e(Boolean.valueOf(transactionUI.f11388s));
                    c1208c.n(D9.b.A0(transactionUI));
                    c1208c.c(D9.b.f(transactionUI));
                    Date date = transactionUI.f11382m;
                    c1208c.b(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : "");
                    c1208c.f(Boolean.valueOf(D9.b.a0(transactionUI)));
                    c1208c.k();
                    c1208c.m(Boolean.valueOf(D9.b.y0(transactionUI)));
                    c1208c.l(Boolean.valueOf(!D9.b.b0(transactionUI)));
                    c1208c.o(Integer.valueOf(transactionUI.f11389t ? R.drawable.ic_invoice_added : R.drawable.ic_invoice_add));
                    c1208c.i(new f(4, (b.a) bVar, this));
                    c1208c.g(Boolean.valueOf(i == list.size() - 1 || (s.M(i9, list) instanceof b.c)));
                    c1208c.a(Integer.valueOf((z10 && i == 0) ? R.drawable.cell_bg_transaction_top : ((s.M(i9, list) instanceof b.c) || i == list.size() - 1) ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                    add(c1208c);
                } else if (!(bVar instanceof b.C0130b)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = i9;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoicesToShow$lambda$7$lambda$6$lambda$5(b bVar, InvoicesNewController invoicesNewController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = ((b.a) bVar).f12265a.f11371a;
        if (str == null || (interfaceC0646l = invoicesNewController.onItemClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof b.c;
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void setupStickyHeaderView(View view) {
        View findViewById;
        if (!(view instanceof ViewGroup) || (findViewById = view.findViewById(R.id.constraint_layout)) == null) {
            return;
        }
        findViewById.setBackgroundResource(R.drawable.cell_bg_full_16);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void teardownStickyHeaderView(View view) {
        View findViewById;
        if (!(view instanceof ViewGroup) || (findViewById = view.findViewById(R.id.constraint_layout)) == null) {
            return;
        }
        findViewById.setBackgroundResource(R.drawable.cell_bg_transaction_top);
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public void buildModels(List<? extends b> list, List<? extends b> list2, Integer num) {
        if (num != null) {
            C1209D c1209d = new C1209D();
            c1209d.a();
            c1209d.b(new e(2, this, num));
            add(c1209d);
        }
        if (num != null && num.intValue() == 0) {
            invoicesToShow(list);
        } else if (num != null && num.intValue() == 1) {
            invoicesToShow(list2);
        }
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public void setData(List<? extends b> list, List<? extends b> list2, Integer num) {
        this.stickyHeaders = (num != null && num.intValue() == 0) ? list == null ? EmptyList.f23104a : list : list2 == null ? EmptyList.f23104a : list2;
        super.setData((InvoicesNewController) list, list2, (List<? extends b>) num);
    }
}
