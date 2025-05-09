package com.luminary.business.presentation.ui.fragments.payments;

import B7.f;
import C.v;
import O9.p;
import P9.m;
import P9.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed4EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.domain.entity.transaction.PaymentType;
import com.luminary.business.presentation.entity.payment.PaymentTypeUI;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.fragments.home.newhome.b;
import com.luminary.business.presentation.ui.fragments.payments.PaymentsController;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import s6.C1235y;
import s6.T;
import s6.V;
import s6.W;
import s6.n0;
import s6.p0;

/* compiled from: PaymentsController.kt */
/* loaded from: classes2.dex */
public final class PaymentsController extends Typed4EpoxyController<List<? extends PaymentTypeUI>, List<? extends b>, List<? extends H5.b>, Integer> {
    private final Context context;
    private final InterfaceC0646l<String, p> onClick;
    private final InterfaceC0646l<PaymentTypeUI, p> onClickDetails;
    private List<? extends b> stickyHeaders = EmptyList.f23104a;
    private final TabLayout.d tabChangeListener;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsController(Context context, TabLayout.d dVar, InterfaceC0646l<? super String, p> interfaceC0646l, InterfaceC0646l<? super PaymentTypeUI, p> interfaceC0646l2) {
        this.context = context;
        this.tabChangeListener = dVar;
        this.onClick = interfaceC0646l;
        this.onClickDetails = interfaceC0646l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$14$lambda$13$lambda$12(PaymentsController paymentsController, PaymentTypeUI paymentTypeUI, View view) {
        InterfaceC0646l<PaymentTypeUI, p> interfaceC0646l = paymentsController.onClickDetails;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(paymentTypeUI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$19$lambda$18$lambda$17(b bVar, PaymentsController paymentsController, View view) {
        String str;
        InterfaceC0646l<String, p> interfaceC0646l;
        b.a aVar = (b.a) bVar;
        if (!D9.b.x0(aVar.f12265a) || (str = aVar.f12265a.f11371a) == null || (interfaceC0646l = paymentsController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(PaymentsController paymentsController, int i, W w2, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_home);
        tabLayout.a(paymentsController.tabChangeListener);
        TabLayout.g h9 = tabLayout.h(i);
        if (h9 != null) {
            h9.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$23$lambda$22$lambda$21(H5.b bVar, PaymentsController paymentsController, View view) {
        String l10;
        InterfaceC0646l<String, p> interfaceC0646l;
        Long l11 = bVar.f1496a;
        if (l11 == null || (l10 = l11.toString()) == null || (interfaceC0646l = paymentsController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(l10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$8$lambda$7$lambda$6(PaymentsController paymentsController, PaymentTypeUI paymentTypeUI, View view) {
        InterfaceC0646l<PaymentTypeUI, p> interfaceC0646l = paymentsController.onClickDetails;
        if (interfaceC0646l != null) {
            interfaceC0646l.invoke(paymentTypeUI);
        }
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends PaymentTypeUI> list, List<? extends b> list2, List<? extends H5.b> list3, Integer num) {
        buildModels2((List<PaymentTypeUI>) list, list2, (List<H5.b>) list3, num);
    }

    @Override // com.airbnb.epoxy.EpoxyController, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        if (i == 0) {
            return false;
        }
        return s.M(i - 1, this.stickyHeaders) instanceof b.c;
    }

    @Override // com.airbnb.epoxy.Typed4EpoxyController
    public /* bridge */ /* synthetic */ void setData(List<? extends PaymentTypeUI> list, List<? extends b> list2, List<? extends H5.b> list3, Integer num) {
        setData2((List<PaymentTypeUI>) list, list2, (List<H5.b>) list3, num);
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
    public void buildModels2(List<PaymentTypeUI> list, List<? extends b> list2, List<H5.b> list3, Integer num) {
        boolean z10;
        String valueOf;
        if (num != null) {
            int intValue = num.intValue();
            W w2 = new W();
            w2.a();
            w2.b(new J7.a(intValue, 3, this));
            add(w2);
        }
        if (list != null) {
            List<PaymentTypeUI> list4 = list;
            boolean z11 = list4 instanceof Collection;
            if (!z11 || !list4.isEmpty()) {
                Iterator<T> it = list4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((PaymentTypeUI) it.next()).f11325d == PaymentTypeUI.Type.f11326a) {
                        C1235y c1235y = new C1235y();
                        c1235y.a();
                        String string = this.context.getString(R.string.bank_account_lowercase);
                        c1235y.onMutation();
                        c1235y.f27038a = string;
                        Boolean bool = Boolean.FALSE;
                        c1235y.onMutation();
                        c1235y.f27040c = bool;
                        c1235y.onMutation();
                        c1235y.f27039b = bool;
                        add(c1235y);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list4) {
                            if (((PaymentTypeUI) obj).f11325d == PaymentTypeUI.Type.f11326a) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            final PaymentTypeUI paymentTypeUI = (PaymentTypeUI) it2.next();
                            T t3 = new T();
                            t3.a("card_details_" + paymentTypeUI.f11322a);
                            String string2 = this.context.getString(paymentTypeUI.f11322a);
                            t3.onMutation();
                            t3.f26727a = string2;
                            String string3 = this.context.getString(paymentTypeUI.f11323b);
                            t3.onMutation();
                            t3.f26728b = string3;
                            Integer valueOf2 = Integer.valueOf(paymentTypeUI.f11324c);
                            t3.onMutation();
                            t3.f26729c = valueOf2;
                            Boolean bool2 = Boolean.TRUE;
                            t3.onMutation();
                            t3.f26730d = bool2;
                            final int i = 0;
                            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: j8.a

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ PaymentsController f22545b;

                                {
                                    this.f22545b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i) {
                                        case 0:
                                            PaymentsController.buildModels$lambda$8$lambda$7$lambda$6(this.f22545b, paymentTypeUI, view);
                                            break;
                                        default:
                                            PaymentsController.buildModels$lambda$14$lambda$13$lambda$12(this.f22545b, paymentTypeUI, view);
                                            break;
                                    }
                                }
                            };
                            t3.onMutation();
                            t3.f26731e = onClickListener;
                            add(t3);
                        }
                    }
                }
            }
            if (!z11 || !list4.isEmpty()) {
                Iterator<T> it3 = list4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((PaymentTypeUI) it3.next()).f11325d == PaymentTypeUI.Type.f11327b) {
                        C1235y c1235y2 = new C1235y();
                        c1235y2.a();
                        String string4 = this.context.getString(R.string.bank_app_account_lowercase);
                        c1235y2.onMutation();
                        c1235y2.f27038a = string4;
                        Boolean bool3 = Boolean.FALSE;
                        c1235y2.onMutation();
                        c1235y2.f27040c = bool3;
                        c1235y2.onMutation();
                        c1235y2.f27039b = bool3;
                        add(c1235y2);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list4) {
                            if (((PaymentTypeUI) obj2).f11325d == PaymentTypeUI.Type.f11327b) {
                                arrayList2.add(obj2);
                            }
                        }
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            final PaymentTypeUI paymentTypeUI2 = (PaymentTypeUI) it4.next();
                            T t10 = new T();
                            t10.a("card_details_" + paymentTypeUI2.f11322a);
                            String string5 = this.context.getString(paymentTypeUI2.f11322a);
                            t10.onMutation();
                            t10.f26727a = string5;
                            String string6 = this.context.getString(paymentTypeUI2.f11323b);
                            t10.onMutation();
                            t10.f26728b = string6;
                            Integer valueOf3 = Integer.valueOf(paymentTypeUI2.f11324c);
                            t10.onMutation();
                            t10.f26729c = valueOf3;
                            Boolean bool4 = Boolean.TRUE;
                            t10.onMutation();
                            t10.f26730d = bool4;
                            final int i9 = 1;
                            View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: j8.a

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ PaymentsController f22545b;

                                {
                                    this.f22545b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i9) {
                                        case 0:
                                            PaymentsController.buildModels$lambda$8$lambda$7$lambda$6(this.f22545b, paymentTypeUI2, view);
                                            break;
                                        default:
                                            PaymentsController.buildModels$lambda$14$lambda$13$lambda$12(this.f22545b, paymentTypeUI2, view);
                                            break;
                                    }
                                }
                            };
                            t10.onMutation();
                            t10.f26731e = onClickListener2;
                            add(t10);
                        }
                    }
                }
            }
        }
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof b.c) {
                    arrayList3.add(obj3);
                }
            }
            z10 = arrayList3.isEmpty();
        } else {
            z10 = false;
        }
        Integer num2 = null;
        if (list2 != null) {
            int i10 = 0;
            for (Object obj4 : list2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    m.t();
                    throw null;
                }
                b bVar = (b) obj4;
                if (bVar instanceof b.c) {
                    n0 n0Var = new n0();
                    b.c cVar = (b.c) bVar;
                    n0Var.a("section_header_" + cVar.f12267a + "_" + System.currentTimeMillis());
                    n0Var.d(cVar.f12267a);
                    Boolean bool5 = Boolean.FALSE;
                    n0Var.b(bool5);
                    n0Var.c(bool5);
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
                    p0Var.o(D9.b.A0(transactionUI));
                    p0Var.d(D9.b.f(transactionUI));
                    Date date = transactionUI.f11382m;
                    p0Var.c(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : "");
                    p0Var.g(Boolean.valueOf(D9.b.a0(transactionUI)));
                    p0Var.l(Boolean.valueOf(D9.b.a0(transactionUI)));
                    p0Var.b(D9.b.B(transactionUI, this.context));
                    p0Var.o(D9.b.A0(transactionUI));
                    p0Var.n(Boolean.valueOf(D9.b.y0(transactionUI)));
                    p0Var.m(Boolean.valueOf(!D9.b.b0(transactionUI)));
                    p0Var.p(Integer.valueOf(D9.b.I0(transactionUI)));
                    p0Var.j(new f(22, (b.a) bVar, this));
                    p0Var.h(Boolean.valueOf(i10 == list2.size() - 1 || (s.M(i11, list2) instanceof b.c)));
                    p0Var.a(Integer.valueOf((z10 && i10 == 0) ? R.drawable.cell_bg_transaction_top : ((s.M(i11, list2) instanceof b.c) || i10 == list2.size() - 1) ? R.drawable.cell_bg_transaction_bottom : R.drawable.cell_bg_middle));
                    add(p0Var);
                }
                i10 = i11;
            }
        }
        if (list3 != null) {
            int i12 = 0;
            for (Object obj5 : list3) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    m.t();
                    throw null;
                }
                H5.b bVar2 = (H5.b) obj5;
                V v10 = new V();
                v10.a("payment_template_" + bVar2.f1496a);
                v10.onMutation();
                v10.f26733a = bVar2.f1499d;
                String U = D9.b.U(bVar2.f1500e);
                v10.onMutation();
                v10.f26735c = U;
                PaymentType paymentType = bVar2.f1502g;
                int ordinal = paymentType.ordinal();
                Integer valueOf4 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 8 ? num2 : Integer.valueOf(R.drawable.ic_international) : Integer.valueOf(R.drawable.ic_international) : Integer.valueOf(R.drawable.ic_euro) : Integer.valueOf(R.drawable.ic_gb) : Integer.valueOf(R.drawable.ic_bank_email_payment_small);
                v10.onMutation();
                v10.f26736d = valueOf4;
                int ordinal2 = paymentType.ordinal();
                String str = bVar2.i;
                String str2 = bVar2.f1503h;
                if (ordinal2 == 0) {
                    valueOf = (str == null || str.length() == 0) ? String.valueOf(str2) : v.p(str2, " ", str);
                } else if (ordinal2 == 1) {
                    valueOf = bVar2.f1506l + " " + bVar2.f1505k;
                } else if (ordinal2 != 2) {
                    String str3 = bVar2.f1520z;
                    valueOf = ordinal2 != 3 ? ordinal2 != 8 ? "" : (str3 == null || str3.length() == 0) ? String.valueOf(str2) : v.p(str2, " ", str3) : (str3 == null || str3.length() == 0) ? String.valueOf(str2) : v.p(str2, " ", str3);
                } else {
                    valueOf = (str == null || str.length() == 0) ? String.valueOf(str2) : s3.b.n(new StringBuilder(), bVar2.f1504j, " ", str);
                }
                v10.onMutation();
                v10.f26734b = valueOf;
                f fVar = new f(23, bVar2, this);
                v10.onMutation();
                v10.f26737e = fVar;
                Boolean valueOf5 = Boolean.valueOf(i12 == 0);
                v10.onMutation();
                v10.f26738f = valueOf5;
                Boolean valueOf6 = Boolean.valueOf(paymentType == PaymentType.f11147a);
                v10.onMutation();
                v10.f26739g = valueOf6;
                add(v10);
                i12 = i13;
                num2 = null;
            }
        }
    }

    /* renamed from: setData, reason: avoid collision after fix types in other method */
    public void setData2(List<PaymentTypeUI> list, List<? extends b> list2, List<H5.b> list3, Integer num) {
        this.stickyHeaders = list2 == null ? EmptyList.f23104a : list2;
        super.setData((PaymentsController) list, (List<PaymentTypeUI>) list2, (List<? extends b>) list3, (List<H5.b>) num);
    }
}
