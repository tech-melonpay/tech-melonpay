package com.luminary.business.presentation.ui.fragments.all_transactions;

import B7.c;
import B7.f;
import O9.p;
import P9.m;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.home.newhome.b;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.EmptyList;
import s6.C1230t;
import s6.n0;
import s6.p0;

/* compiled from: AllTransactionsController.kt */
/* loaded from: classes2.dex */
public final class AllTransactionsController extends TypedEpoxyController<List<? extends b>> {
    private final Context context;
    private final InterfaceC0646l<String, p> onTransactionClick;
    private List<? extends b> stickyHeaders = EmptyList.f23104a;

    /* JADX WARN: Multi-variable type inference failed */
    public AllTransactionsController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.context = context;
        this.onTransactionClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$5$lambda$4(b bVar, AllTransactionsController allTransactionsController, View view) {
        String str;
        InterfaceC0646l<String, p> interfaceC0646l;
        b.a aVar = (b.a) bVar;
        if (!D9.b.x0(aVar.f12265a) || (str = aVar.f12265a.f11371a) == null || (interfaceC0646l = allTransactionsController.onTransactionClick) == null) {
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

    public final void setDataForHeader(List<? extends b> list) {
        this.stickyHeaders = list == null ? EmptyList.f23104a : list;
        setData(list);
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

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(List<? extends b> list) {
        boolean z10;
        C1230t c1230t = new C1230t();
        c1230t.a();
        add(c1230t);
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
                    n0Var.c(bool);
                    n0Var.b(bool);
                    c cVar2 = new c(1);
                    n0Var.onMutation();
                    n0Var.f26938d = cVar2;
                    add(n0Var);
                } else if (bVar instanceof b.a) {
                    p0 p0Var = new p0();
                    b.a aVar = (b.a) bVar;
                    p0Var.e("transaction_" + aVar.f12265a.f11371a);
                    Context context = this.context;
                    TransactionUI transactionUI = aVar.f12265a;
                    p0Var.i(D9.b.S(transactionUI, context));
                    p0Var.k(D9.b.U(D9.b.R(transactionUI, this.context)));
                    p0Var.f(Boolean.valueOf(transactionUI.f11388s));
                    Date date = transactionUI.f11382m;
                    p0Var.c(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : this.context.getString(R.string.pending));
                    p0Var.g(Boolean.valueOf(D9.b.a0(transactionUI)));
                    p0Var.l(Boolean.valueOf(D9.b.a0(transactionUI)));
                    p0Var.o(D9.b.A0(transactionUI));
                    p0Var.b(D9.b.B(transactionUI, this.context));
                    p0Var.d(D9.b.f(transactionUI));
                    p0Var.n(Boolean.valueOf(D9.b.y0(transactionUI)));
                    p0Var.m(Boolean.valueOf(!D9.b.b0(transactionUI)));
                    p0Var.p(Integer.valueOf(D9.b.I0(transactionUI)));
                    p0Var.j(new f(3, (b.a) bVar, this));
                    p0Var.h(Boolean.valueOf(i == list.size() - 1 || (s.M(i9, list) instanceof b.c)));
                    p0Var.a(Integer.valueOf((z10 && i == 0) ? R.drawable.cell_bg_transaction_top : ((s.M(i9, list) instanceof b.c) || i == list.size() - 1) ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                    add(p0Var);
                }
                i = i9;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$2$lambda$1(View view) {
    }
}
