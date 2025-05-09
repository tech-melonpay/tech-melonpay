package com.luminary.business.presentation.ui.fragments.loans.history;

import A5.b;
import J7.a;
import P9.m;
import android.content.Context;
import android.view.View;
import ca.InterfaceC0635a;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.material.tabs.TabLayout;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import s6.C1211F;
import s6.G;
import s6.H;
import s6.I;
import s6.J;

/* compiled from: LoansHistoryController.kt */
/* loaded from: classes2.dex */
public final class LoansHistoryController extends Typed2EpoxyController<List<? extends b>, Integer> {
    private final Context context;
    private final InterfaceC0635a<Object> onClick;
    private final TabLayout.d tabChangeListener;

    public LoansHistoryController(TabLayout.d dVar, Context context, InterfaceC0635a<? extends Object> interfaceC0635a) {
        this.tabChangeListener = dVar;
        this.context = context;
        this.onClick = interfaceC0635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$2$lambda$1$lambda$0(LoansHistoryController loansHistoryController, int i, J j10, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i9) {
        TabLayout tabLayout = (TabLayout) dataBindingHolder.getDataBinding().f1148d.findViewById(R.id.tab_home);
        tabLayout.a(loansHistoryController.tabChangeListener);
        TabLayout.g h9 = tabLayout.h(i);
        if (h9 != null) {
            h9.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildModels$lambda$6$lambda$5$lambda$4(LoansHistoryController loansHistoryController, View view) {
        InterfaceC0635a<Object> interfaceC0635a = loansHistoryController.onClick;
        if (interfaceC0635a != null) {
            interfaceC0635a.invoke();
        }
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends b> list, Integer num) {
        buildModels2((List<b>) list, num);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(List<b> list, Integer num) {
        Object obj;
        if (num != null) {
            int intValue = num.intValue();
            J j10 = new J();
            j10.a("loans_tab_" + intValue);
            j10.b(new a(intValue, 0, this));
            add(j10);
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (f.b(((b) obj).f91l, Boolean.FALSE)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b bVar = (b) obj;
            if (bVar != null) {
                I i = new I();
                i.c("loan_" + bVar.f81a);
                i.f(D9.b.O(bVar, this.context));
                i.a(D9.b.d(bVar));
                i.b();
                i.d(Boolean.valueOf(D9.b.W(bVar) != R.drawable.ic_status_decline_loan));
                Date date = bVar.f89j;
                i.e(date != null ? D9.b.F0(date, "dd MMM yyyy") : null);
                i.i(this.context.getString(D9.b.V(bVar)));
                i.h(Integer.valueOf(D9.b.W(bVar)));
                i.g(new J7.b(this, 0));
                add(i);
            }
        }
        if (list != null) {
            List<b> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (f.b(((b) it2.next()).f91l, Boolean.TRUE)) {
                        G g10 = new G();
                        g10.a();
                        g10.b(this.context.getString(R.string.history));
                        add(g10);
                        break;
                    }
                }
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (f.b(((b) obj2).f91l, Boolean.TRUE)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it3 = arrayList.iterator();
            int i9 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i10 = i9 + 1;
                if (i9 < 0) {
                    m.t();
                    throw null;
                }
                b bVar2 = (b) next;
                if (i9 != list.size() - 1) {
                    H h9 = new H();
                    h9.c("loan_" + bVar2.f81a);
                    h9.f(D9.b.O(bVar2, this.context));
                    h9.a(D9.b.d(bVar2));
                    h9.b();
                    h9.d(Boolean.valueOf(D9.b.W(bVar2) != R.drawable.ic_status_decline_loan));
                    Date date2 = bVar2.f89j;
                    h9.e(date2 != null ? D9.b.F0(date2, "dd MMM yyyy") : null);
                    h9.h(this.context.getString(D9.b.V(bVar2)));
                    h9.g(Integer.valueOf(D9.b.W(bVar2)));
                    add(h9);
                } else {
                    C1211F c1211f = new C1211F();
                    c1211f.c("loan_" + bVar2.f81a);
                    c1211f.f(D9.b.O(bVar2, this.context));
                    c1211f.a(D9.b.d(bVar2));
                    c1211f.b();
                    c1211f.d(Boolean.valueOf(D9.b.W(bVar2) != R.drawable.ic_status_decline_loan));
                    Date date3 = bVar2.f89j;
                    c1211f.e(date3 != null ? D9.b.F0(date3, "dd MMM yyyy") : null);
                    c1211f.h(this.context.getString(D9.b.V(bVar2)));
                    c1211f.g(Integer.valueOf(D9.b.W(bVar2)));
                    add(c1211f);
                }
                i9 = i10;
            }
        }
    }
}
