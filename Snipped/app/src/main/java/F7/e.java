package F7;

import B6.i;
import O9.p;
import P9.m;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o6.j;

/* compiled from: InvoicesNewViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: T0, reason: collision with root package name */
    public final j f1256T0;

    /* renamed from: U0, reason: collision with root package name */
    public final K5.a f1257U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0559z<List<TransactionUI>> f1258V0 = new C0559z<>();

    /* renamed from: W0, reason: collision with root package name */
    public final C0559z<List<TransactionUI>> f1259W0 = new C0559z<>();

    /* renamed from: X0, reason: collision with root package name */
    public final ArrayList<TransactionUI> f1260X0 = new ArrayList<>();

    /* renamed from: Y0, reason: collision with root package name */
    public final ArrayList<TransactionUI> f1261Y0 = new ArrayList<>();

    /* renamed from: Z0, reason: collision with root package name */
    public int f1262Z0 = 1;

    /* renamed from: a1, reason: collision with root package name */
    public int f1263a1 = 1;

    public e(j jVar, K5.a aVar) {
        this.f1256T0 = jVar;
        this.f1257U0 = aVar;
        SortDialog.Direction direction = SortDialog.Direction.f13213a;
        SortDialog.Status status = SortDialog.Status.f13217a;
        n(true, null, null, direction, status);
        n(false, null, null, direction, status);
    }

    public final void m(boolean z10) {
        if (z10) {
            this.f1262Z0 = 1;
            this.f1260X0.clear();
        } else {
            this.f1263a1 = 1;
            this.f1261Y0.clear();
        }
    }

    public final void n(final boolean z10, final Date date, final Date date2, final SortDialog.Direction direction, final SortDialog.Status status) {
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: F7.c
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                Integer num;
                String num2;
                SortDialog.Status status2 = SortDialog.Status.f13217a;
                SortDialog.Status status3 = SortDialog.Status.this;
                String str = status3 == status2 ? "desc" : status3 == SortDialog.Status.f13218b ? "asc" : null;
                String str2 = status3 == SortDialog.Status.f13220d ? "asc" : status3 == SortDialog.Status.f13219c ? "desc" : null;
                e eVar = this;
                u5.d u6 = eVar.f1257U0.u();
                if (u6 != null && (num = u6.f30237a) != null && (num2 = num.toString()) != null) {
                    eVar.l();
                    boolean z11 = z10;
                    int i = z11 ? eVar.f1262Z0 : eVar.f1263a1;
                    Boolean valueOf = Boolean.valueOf(z11);
                    Date date3 = date;
                    String F02 = date3 != null ? D9.b.F0(date3, "yyyy-MM-dd'T'HH:mm:ss") : null;
                    Date date4 = date2;
                    String F03 = date4 != null ? D9.b.F0(date4, "yyyy-MM-dd'T'HH:mm:ss") : null;
                    SortDialog.Direction direction2 = SortDialog.Direction.f13213a;
                    SortDialog.Direction direction3 = direction;
                    eVar.f1256T0.a(new d(eVar, z11, 0), new H5.a(num2, null, i, valueOf, F02, F03, direction3 != direction2 ? direction3 == SortDialog.Direction.f13214b ? "DEBIT" : "CREDIT" : null, str, str2, m.n("FX_ORDER", "FX_EXECUTION", "COMMISSION"), null, 1024));
                }
                return p.f3034a;
            }
        };
        this.f418J0 = interfaceC0635a;
        interfaceC0635a.invoke();
    }
}
