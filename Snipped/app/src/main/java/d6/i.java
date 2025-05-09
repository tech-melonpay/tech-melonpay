package D6;

import O9.p;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o6.j;

/* compiled from: AccountDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends B6.i {

    /* renamed from: T0, reason: collision with root package name */
    public final j f947T0;

    /* renamed from: U0, reason: collision with root package name */
    public final K5.a f948U0;

    /* renamed from: V0, reason: collision with root package name */
    public final C0559z<List<TransactionUI>> f949V0 = new C0559z<>();

    /* renamed from: W0, reason: collision with root package name */
    public final ArrayList<TransactionUI> f950W0 = new ArrayList<>();

    /* renamed from: X0, reason: collision with root package name */
    public final J8.d<p> f951X0 = new J8.d<>();

    /* renamed from: Y0, reason: collision with root package name */
    public int f952Y0 = 1;

    public i(j jVar, K5.a aVar) {
        this.f947T0 = jVar;
        this.f948U0 = aVar;
    }

    public final void m(final String str, final Date date, final Date date2, final SortDialog.Direction direction, final SortDialog.Status status) {
        InterfaceC0635a<p> interfaceC0635a = new InterfaceC0635a() { // from class: D6.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                i iVar = i.this;
                iVar.l();
                int h9 = iVar.f948U0.h();
                SortDialog.Status status2 = SortDialog.Status.f13217a;
                SortDialog.Status status3 = status;
                String str2 = status3 == status2 ? "desc" : status3 == SortDialog.Status.f13218b ? "asc" : null;
                String str3 = status3 == SortDialog.Status.f13220d ? "asc" : status3 == SortDialog.Status.f13219c ? "desc" : null;
                String valueOf = String.valueOf(h9);
                int i = iVar.f952Y0;
                Date date3 = date;
                String F02 = date3 != null ? D9.b.F0(date3, "yyyy-MM-dd'T'HH:mm:ss") : null;
                Date date4 = date2;
                String F03 = date4 != null ? D9.b.F0(date4, "yyyy-MM-dd'T'HH:mm:ss") : null;
                SortDialog.Direction direction2 = SortDialog.Direction.f13213a;
                SortDialog.Direction direction3 = direction;
                iVar.f947T0.a(new C7.a(iVar, 1), new H5.a(valueOf, str, i, null, F02, F03, direction3 != direction2 ? direction3 == SortDialog.Direction.f13214b ? "DEBIT" : "CREDIT" : null, str2, str3, null, null, 1536));
                return p.f3034a;
            }
        };
        this.f418J0 = interfaceC0635a;
        interfaceC0635a.invoke();
    }
}
