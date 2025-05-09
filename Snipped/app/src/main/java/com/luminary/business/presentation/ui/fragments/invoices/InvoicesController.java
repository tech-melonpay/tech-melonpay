package com.luminary.business.presentation.ui.fragments.invoices;

import F5.b;
import F8.k;
import O9.p;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0646l;
import com.airbnb.epoxy.TypedEpoxyController;
import com.luminary.business.presentation.ui.fragments.invoices.InvoicesController;
import com.luminary.mobile.R;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import s6.n0;
import s6.o0;
import s6.p0;
import s6.q0;

/* compiled from: InvoicesController.kt */
/* loaded from: classes2.dex */
public final class InvoicesController extends TypedEpoxyController<List<? extends Pair<? extends String, ? extends List<? extends b>>>> {
    private final Context context;
    private final InterfaceC0646l<String, p> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public InvoicesController(Context context, InterfaceC0646l<? super String, p> interfaceC0646l) {
        this.context = context;
        this.onClick = interfaceC0646l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$10$lambda$3$lambda$2(b bVar, InvoicesController invoicesController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bVar.f1188a;
        if (str == null || (interfaceC0646l = invoicesController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$10$lambda$6$lambda$5(b bVar, InvoicesController invoicesController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bVar.f1188a;
        if (str == null || (interfaceC0646l = invoicesController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$11$lambda$10$lambda$9$lambda$8(b bVar, InvoicesController invoicesController, View view) {
        InterfaceC0646l<String, p> interfaceC0646l;
        String str = bVar.f1188a;
        if (str == null || (interfaceC0646l = invoicesController.onClick) == null) {
            return;
        }
        interfaceC0646l.invoke(str);
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends Pair<? extends String, ? extends List<? extends b>>> list) {
        buildModels2((List<? extends Pair<String, ? extends List<b>>>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [D7.a] */
    /* JADX WARN: Type inference failed for: r6v3, types: [D7.a] */
    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<? extends Pair<String, ? extends List<b>>> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.f23089a;
                if (obj != null) {
                    n0 n0Var = new n0();
                    n0Var.a("section_header_" + obj);
                    n0Var.d((String) obj);
                    n0Var.b(Boolean.FALSE);
                    add(n0Var);
                }
                int i = 0;
                for (Object obj2 : (Iterable) pair.f23090b) {
                    int i9 = i + 1;
                    if (i < 0) {
                        m.t();
                        throw null;
                    }
                    final b bVar = (b) obj2;
                    int i10 = R.drawable.ic_transaction_out;
                    if (i == 0 && obj == null) {
                        q0 q0Var = new q0();
                        q0Var.c("transaction_" + bVar.f1188a);
                        String P4 = D9.b.P(bVar);
                        if (P4 == null) {
                            P4 = "";
                        }
                        q0Var.f(P4);
                        q0Var.h(D9.b.U(D9.b.P(bVar)));
                        q0Var.d(Boolean.valueOf(D9.b.c0(bVar)));
                        q0Var.l(D9.b.A0(k.a(bVar)));
                        q0Var.b(D9.b.f(k.a(bVar)));
                        Date date = bVar.f1191d;
                        q0Var.a(date != null ? D9.b.F0(date, "HH:mm, EEE dd MMM") : "");
                        q0Var.e();
                        q0Var.i();
                        q0Var.k();
                        q0Var.j();
                        if (D9.b.c0(bVar)) {
                            i10 = R.drawable.ic_transaction_income;
                        }
                        q0Var.m(Integer.valueOf(i10));
                        final int i11 = 0;
                        q0Var.g(new View.OnClickListener() { // from class: D7.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i11) {
                                    case 0:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$3$lambda$2(bVar, this, view);
                                        break;
                                    case 1:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$6$lambda$5(bVar, this, view);
                                        break;
                                    default:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$9$lambda$8(bVar, this, view);
                                        break;
                                }
                            }
                        });
                        add(q0Var);
                    } else if (i != ((List) r0).size() - 1) {
                        p0 p0Var = new p0();
                        p0Var.e("transaction_" + bVar.f1188a);
                        String P10 = D9.b.P(bVar);
                        if (P10 == null) {
                            P10 = "";
                        }
                        p0Var.i(P10);
                        p0Var.k(D9.b.U(D9.b.P(bVar)));
                        p0Var.f(Boolean.valueOf(D9.b.c0(bVar)));
                        p0Var.o(D9.b.A0(k.a(bVar)));
                        p0Var.d(D9.b.f(k.a(bVar)));
                        Date date2 = bVar.f1191d;
                        p0Var.c(date2 != null ? D9.b.F0(date2, "HH:mm, EEE dd MMM") : "");
                        Boolean bool = Boolean.FALSE;
                        p0Var.g(bool);
                        p0Var.l(bool);
                        Boolean bool2 = Boolean.TRUE;
                        p0Var.n(bool2);
                        p0Var.m(bool2);
                        if (D9.b.c0(bVar)) {
                            i10 = R.drawable.ic_transaction_income;
                        }
                        p0Var.p(Integer.valueOf(i10));
                        final int i12 = 1;
                        p0Var.j(new View.OnClickListener() { // from class: D7.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i12) {
                                    case 0:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$3$lambda$2(bVar, this, view);
                                        break;
                                    case 1:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$6$lambda$5(bVar, this, view);
                                        break;
                                    default:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$9$lambda$8(bVar, this, view);
                                        break;
                                }
                            }
                        });
                        add(p0Var);
                    } else {
                        o0 o0Var = new o0();
                        o0Var.c("transaction_" + bVar.f1188a);
                        String P11 = D9.b.P(bVar);
                        if (P11 == null) {
                            P11 = "";
                        }
                        o0Var.f(P11);
                        o0Var.h(D9.b.U(D9.b.P(bVar)));
                        o0Var.d(Boolean.valueOf(D9.b.c0(bVar)));
                        o0Var.l(D9.b.A0(k.a(bVar)));
                        o0Var.b(D9.b.f(k.a(bVar)));
                        Date date3 = bVar.f1191d;
                        o0Var.a(date3 != null ? D9.b.F0(date3, "HH:mm, EEE dd MMM") : "");
                        o0Var.e();
                        o0Var.i();
                        o0Var.k();
                        o0Var.j();
                        if (D9.b.c0(bVar)) {
                            i10 = R.drawable.ic_transaction_income;
                        }
                        o0Var.m(Integer.valueOf(i10));
                        final int i13 = 2;
                        o0Var.g(new View.OnClickListener() { // from class: D7.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i13) {
                                    case 0:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$3$lambda$2(bVar, this, view);
                                        break;
                                    case 1:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$6$lambda$5(bVar, this, view);
                                        break;
                                    default:
                                        InvoicesController.buildModels$lambda$11$lambda$10$lambda$9$lambda$8(bVar, this, view);
                                        break;
                                }
                            }
                        });
                        add(o0Var);
                    }
                    i = i9;
                }
            }
        }
    }
}
