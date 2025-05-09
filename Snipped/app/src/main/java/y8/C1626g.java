package y8;

import O9.p;
import ca.InterfaceC0635a;
import ca.InterfaceC0651q;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.l;
import com.google.android.material.datepicker.n;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.views.dialogs.SortStatisticsDialog;
import com.luminary.mobile.R;
import java.util.Calendar;
import u7.C1522a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1626g implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SortStatisticsDialog f31142b;

    public /* synthetic */ C1626g(SortStatisticsDialog sortStatisticsDialog, int i) {
        this.f31141a = i;
        this.f31142b = sortStatisticsDialog;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f31141a) {
            case 0:
                this.f31142b.dismiss();
                break;
            case 1:
                SortStatisticsDialog sortStatisticsDialog = this.f31142b;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q = sortStatisticsDialog.f13229r;
                if (interfaceC0651q != null) {
                    interfaceC0651q.invoke(SortStatisticsDialog.StatisticType.f13235e, null, null);
                }
                sortStatisticsDialog.dismiss();
                break;
            case 2:
                SortStatisticsDialog sortStatisticsDialog2 = this.f31142b;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q2 = sortStatisticsDialog2.f13229r;
                if (interfaceC0651q2 != null) {
                    interfaceC0651q2.invoke(SortStatisticsDialog.StatisticType.f13236f, null, null);
                }
                sortStatisticsDialog2.dismiss();
                break;
            case 3:
                SortStatisticsDialog sortStatisticsDialog3 = this.f31142b;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q3 = sortStatisticsDialog3.f13229r;
                if (interfaceC0651q3 != null) {
                    interfaceC0651q3.invoke(SortStatisticsDialog.StatisticType.f13232b, null, null);
                }
                sortStatisticsDialog3.dismiss();
                break;
            case 4:
                SortStatisticsDialog sortStatisticsDialog4 = this.f31142b;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q4 = sortStatisticsDialog4.f13229r;
                if (interfaceC0651q4 != null) {
                    interfaceC0651q4.invoke(SortStatisticsDialog.StatisticType.f13237g, null, null);
                }
                sortStatisticsDialog4.dismiss();
                break;
            case 5:
                Calendar calendar = Calendar.getInstance();
                calendar.get(1);
                calendar.get(2);
                calendar.get(5);
                l.d dVar = new l.d(new RangeDateSelector());
                dVar.f9478b = R.style.my_dialog_theme_for_range_picker;
                com.google.android.material.datepicker.l a10 = dVar.a();
                SortStatisticsDialog sortStatisticsDialog5 = this.f31142b;
                final C1522a c1522a = new C1522a(sortStatisticsDialog5, 3);
                a10.f9454f0.add(new n() { // from class: y8.i
                    @Override // com.google.android.material.datepicker.n
                    public final void a(Object obj) {
                        c1522a.invoke(obj);
                    }
                });
                a10.show(((MainActivity) sortStatisticsDialog5.f13228q).getSupportFragmentManager(), "");
                break;
            case 6:
                SortStatisticsDialog sortStatisticsDialog6 = this.f31142b;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q5 = sortStatisticsDialog6.f13229r;
                if (interfaceC0651q5 != null) {
                    interfaceC0651q5.invoke(SortStatisticsDialog.StatisticType.f13233c, null, null);
                }
                sortStatisticsDialog6.dismiss();
                break;
            default:
                SortStatisticsDialog sortStatisticsDialog7 = this.f31142b;
                InterfaceC0651q<? super SortStatisticsDialog.StatisticType, ? super Long, ? super Long, p> interfaceC0651q6 = sortStatisticsDialog7.f13229r;
                if (interfaceC0651q6 != null) {
                    interfaceC0651q6.invoke(SortStatisticsDialog.StatisticType.f13234d, null, null);
                }
                sortStatisticsDialog7.dismiss();
                break;
        }
        return p.f3034a;
    }
}
