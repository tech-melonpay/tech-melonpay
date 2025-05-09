package com.luminary.business.presentation.ui.fragments.home.newhome;

import B7.c;
import F8.l;
import F8.o;
import O9.p;
import P9.m;
import P9.n;
import P9.s;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.account.FeeDomain;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeController;
import com.luminary.business.presentation.ui.fragments.home.newhome.b;
import com.luminary.mobile.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import s6.C1213b;
import s6.C1216e;
import s6.C1230t;
import s6.n0;
import s6.p0;

/* compiled from: NewHomeController.kt */
/* loaded from: classes2.dex */
public final class NewHomeController extends Typed2EpoxyController<List<? extends BankAccountDomain>, List<? extends b>> {
    private final Context context;
    private final InterfaceC0646l<String, p> onAccountClick;
    private final InterfaceC0646l<String, p> onAccountRefreshClick;
    private final InterfaceC0635a<Object> onFeeAll;
    private final InterfaceC0646l<FeeDomain, p> onFeeClick;
    private final InterfaceC0635a<Object> onOpenTransactionsAll;
    private final InterfaceC0646l<String, p> onTransactionClick;
    private List<? extends b> stickyHeaders = EmptyList.f23104a;

    /* JADX WARN: Multi-variable type inference failed */
    public NewHomeController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l, InterfaceC0646l<? super String, p> interfaceC0646l2, InterfaceC0646l<? super String, p> interfaceC0646l3, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2, InterfaceC0646l<? super FeeDomain, p> interfaceC0646l4) {
        this.context = context;
        this.onAccountClick = interfaceC0646l;
        this.onAccountRefreshClick = interfaceC0646l2;
        this.onTransactionClick = interfaceC0646l3;
        this.onOpenTransactionsAll = interfaceC0635a;
        this.onFeeAll = interfaceC0635a2;
        this.onFeeClick = interfaceC0646l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$12$lambda$11(b bVar, NewHomeController newHomeController, View view) {
        String str;
        InterfaceC0646l<String, p> interfaceC0646l;
        b.a aVar = (b.a) bVar;
        if (!D9.b.x0(aVar.f12265a) || (str = aVar.f12265a.f11371a) == null || (interfaceC0646l = newHomeController.onTransactionClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$9$lambda$8(b bVar, NewHomeController newHomeController, View view) {
        if (f.b(((b.c) bVar).f12267a, newHomeController.context.getString(R.string.outstanding_fees))) {
            InterfaceC0635a<Object> interfaceC0635a = newHomeController.onFeeAll;
            if (interfaceC0635a != null) {
                interfaceC0635a.invoke();
                return;
            }
            return;
        }
        InterfaceC0635a<Object> interfaceC0635a2 = newHomeController.onOpenTransactionsAll;
        if (interfaceC0635a2 != null) {
            interfaceC0635a2.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$4$lambda$1(BankAccountDomain bankAccountDomain, NewHomeController newHomeController, View view) {
        String num;
        InterfaceC0646l<String, p> interfaceC0646l;
        Integer num2 = bankAccountDomain.f10694a;
        if (num2 == null || (num = num2.toString()) == null || (interfaceC0646l = newHomeController.onAccountRefreshClick) == null) {
            return;
        }
        interfaceC0646l.invoke(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$4$lambda$3(BankAccountDomain bankAccountDomain, NewHomeController newHomeController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bankAccountDomain.f10700g;
        if (str == null || (interfaceC0646l = newHomeController.onAccountClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends BankAccountDomain> list, List<? extends b> list2) {
        buildModels2((List<BankAccountDomain>) list, list2);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof b.c;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void setData(List<? extends BankAccountDomain> list, List<? extends b> list2) {
        setData2((List<BankAccountDomain>) list, list2);
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

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<BankAccountDomain> list, List<? extends b> list2) {
        int i;
        Object obj;
        boolean z10;
        if (list != null) {
            C1230t c1230t = new C1230t();
            c1230t.b();
            c1230t.onMutation();
            c1230t.f27009a = 10;
            c1230t.onMutation();
            c1230t.f27010b = 1;
            C1230t c1230t2 = new C1230t();
            c1230t2.b();
            c1230t2.onMutation();
            c1230t2.f27009a = 1;
            c1230t2.onMutation();
            c1230t2.f27010b = 1;
            int i9 = Resources.getSystem().getDisplayMetrics().widthPixels;
            List<BankAccountDomain> list3 = list;
            ArrayList arrayList = new ArrayList(n.u(list3, 10));
            for (final BankAccountDomain bankAccountDomain : list3) {
                C1216e c1216e = new C1216e();
                c1216e.a("account_" + bankAccountDomain.f10700g);
                SpannedString a10 = F8.b.a(bankAccountDomain, 18, 12);
                c1216e.onMutation();
                c1216e.f26816a = a10;
                c1216e.onMutation();
                c1216e.f26817b = bankAccountDomain.i;
                Boolean bool = Boolean.FALSE;
                c1216e.onMutation();
                c1216e.f26823h = bool;
                c1216e.onMutation();
                c1216e.i = bool;
                Integer g10 = F8.b.g(bankAccountDomain, this.context);
                c1216e.onMutation();
                c1216e.f26820e = g10;
                Boolean bool2 = Boolean.TRUE;
                c1216e.onMutation();
                c1216e.f26821f = bool2;
                Integer valueOf = Integer.valueOf(list.size() > 1 ? -2 : ((int) D9.b.F(i9)) - 32);
                c1216e.onMutation();
                c1216e.f26822g = valueOf;
                final int i10 = 0;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: B7.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                NewHomeController.buildModels$lambda$6$lambda$4$lambda$1(bankAccountDomain, this, view);
                                break;
                            default:
                                NewHomeController.buildModels$lambda$6$lambda$4$lambda$3(bankAccountDomain, this, view);
                                break;
                        }
                    }
                };
                c1216e.onMutation();
                c1216e.f26819d = onClickListener;
                final int i11 = 1;
                l g11 = o.g(new View.OnClickListener() { // from class: B7.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                NewHomeController.buildModels$lambda$6$lambda$4$lambda$1(bankAccountDomain, this, view);
                                break;
                            default:
                                NewHomeController.buildModels$lambda$6$lambda$4$lambda$3(bankAccountDomain, this, view);
                                break;
                        }
                    }
                });
                c1216e.onMutation();
                c1216e.f26818c = g11;
                arrayList.add(c1216e);
            }
            C1213b c1213b = new C1213b();
            c1213b.a("account_Carousel");
            C6.a aVar = new C6.a(s.U(s.U(Collections.singletonList(c1230t2), arrayList), Collections.singletonList(c1230t)));
            c1213b.onMutation();
            c1213b.f26782a = aVar;
            add(c1213b);
        }
        Iterator<T> it = this.stickyHeaders.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = R.string.outstanding_fees;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            b bVar = (b) obj;
            if ((bVar instanceof b.c) && !f.b(((b.c) bVar).f12267a, this.context.getString(R.string.outstanding_fees))) {
                break;
            }
        }
        b bVar2 = (b) obj;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof b.c) {
                    arrayList2.add(obj2);
                }
            }
            z10 = arrayList2.isEmpty();
        } else {
            z10 = false;
        }
        if (list2 != null) {
            int i12 = 0;
            for (Object obj3 : list2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    m.t();
                    throw null;
                }
                b bVar3 = (b) obj3;
                if (bVar3 instanceof b.c) {
                    n0 n0Var = new n0();
                    b.c cVar = (b.c) bVar3;
                    n0Var.a("section_header_" + cVar.f12267a + "_" + System.currentTimeMillis());
                    String str = cVar.f12267a;
                    n0Var.d(str);
                    n0Var.b(Boolean.FALSE);
                    n0Var.c(Boolean.valueOf((bVar2 != null && f.b(bVar3, bVar2)) || f.b(str, this.context.getString(i))));
                    final b.c cVar2 = (b.c) bVar3;
                    final int i14 = 0;
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: B7.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    NewHomeController.buildModels$lambda$15$lambda$9$lambda$8(cVar2, this, view);
                                    break;
                                default:
                                    NewHomeController.buildModels$lambda$15$lambda$12$lambda$11(cVar2, this, view);
                                    break;
                            }
                        }
                    };
                    n0Var.onMutation();
                    n0Var.f26938d = onClickListener2;
                    add(n0Var);
                } else if (bVar3 instanceof b.a) {
                    p0 p0Var = new p0();
                    b.a aVar2 = (b.a) bVar3;
                    p0Var.e("transaction_" + aVar2.f12265a.f11371a);
                    Context context = this.context;
                    TransactionUI transactionUI = aVar2.f12265a;
                    p0Var.i(D9.b.S(transactionUI, context));
                    p0Var.k(D9.b.U(D9.b.R(transactionUI, this.context)));
                    p0Var.f(Boolean.valueOf(transactionUI.f11388s));
                    Date date = transactionUI.f11382m;
                    p0Var.c(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : this.context.getString(R.string.pending));
                    p0Var.b(D9.b.B(transactionUI, this.context));
                    p0Var.g(Boolean.valueOf(D9.b.a0(transactionUI)));
                    p0Var.l(Boolean.valueOf(D9.b.a0(transactionUI)));
                    p0Var.o(D9.b.A0(transactionUI));
                    p0Var.d(D9.b.f(transactionUI));
                    p0Var.n(Boolean.valueOf(D9.b.y0(transactionUI)));
                    p0Var.m(Boolean.valueOf(!D9.b.b0(transactionUI)));
                    p0Var.p(Integer.valueOf(D9.b.I0(transactionUI)));
                    final b.a aVar3 = (b.a) bVar3;
                    final int i15 = 1;
                    p0Var.j(new View.OnClickListener() { // from class: B7.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    NewHomeController.buildModels$lambda$15$lambda$9$lambda$8(aVar3, this, view);
                                    break;
                                default:
                                    NewHomeController.buildModels$lambda$15$lambda$12$lambda$11(aVar3, this, view);
                                    break;
                            }
                        }
                    });
                    p0Var.h(Boolean.valueOf(i12 == list2.size() - 1 || (s.M(i13, list2) instanceof b.c)));
                    p0Var.a(Integer.valueOf((z10 && i12 == 0) ? R.drawable.cell_bg_transaction_top : ((s.M(i13, list2) instanceof b.c) || i12 == list2.size() - 1) ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                    add(p0Var);
                } else {
                    if (!(bVar3 instanceof b.C0130b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.C0130b c0130b = (b.C0130b) bVar3;
                    Double d10 = c0130b.f12266a.f10739c;
                    double abs = Math.abs(d10 != null ? d10.doubleValue() : 0.0d);
                    String plainString = new BigDecimal(String.valueOf(abs)).toPlainString();
                    String v10 = plainString != null ? D9.b.v(plainString) : null;
                    String plainString2 = new BigDecimal(String.valueOf(abs)).toPlainString();
                    FeeDomain feeDomain = c0130b.f12266a;
                    SpannedString v02 = D9.b.v0("-", v10, plainString2 != null ? D9.b.u(plainString2, feeDomain.f10738b) : null, feeDomain.f10738b, 15, 10, false, true, false, 256);
                    p0 p0Var2 = new p0();
                    p0Var2.e("fee_" + System.currentTimeMillis());
                    p0Var2.i(this.context.getString(R.string.monthly_fee));
                    p0Var2.k(feeDomain.f10740d);
                    Date date2 = feeDomain.f10744h;
                    p0Var2.c(date2 != null ? D9.b.F0(date2, "HH:mm, EEE dd MMM") : null);
                    p0Var2.o(new SpannedString(""));
                    p0Var2.d(v02);
                    String str2 = feeDomain.f10738b;
                    p0Var2.b(str2 != null ? D9.b.M(this.context, str2) : null);
                    p0Var2.p(Integer.valueOf(R.drawable.ic_percent));
                    p0Var2.j(new c(0));
                    p0Var2.h(Boolean.valueOf(i12 == list2.size() - 1 || (s.M(i13, list2) instanceof b.c)));
                    p0Var2.a(Integer.valueOf((z10 && i12 == 0) ? R.drawable.cell_bg_transaction_top : ((s.M(i13, list2) instanceof b.c) || i12 == list2.size() - 1) ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                    add(p0Var2);
                }
                i12 = i13;
                i = R.string.outstanding_fees;
            }
        }
    }

    /* renamed from: setData, reason: avoid collision after fix types in other method */
    public void setData2(List<BankAccountDomain> list, List<? extends b> list2) {
        this.stickyHeaders = list2 == null ? EmptyList.f23104a : list2;
        super.setData((NewHomeController) list, (List<BankAccountDomain>) list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$15$lambda$14$lambda$13(View view) {
    }
}
