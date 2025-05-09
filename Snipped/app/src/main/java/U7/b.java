package U7;

import C.v;
import O9.p;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.newcompany.outgoingpayments.OutgoingPaymentsFragment;
import com.luminary.mobile.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutgoingPaymentsFragment f3673b;

    public /* synthetic */ b(OutgoingPaymentsFragment outgoingPaymentsFragment, int i) {
        this.f3672a = i;
        this.f3673b = outgoingPaymentsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f3672a) {
            case 0:
                this.f3673b.u0().f29467n.callOnClick();
                break;
            case 1:
                OutgoingPaymentsFragment outgoingPaymentsFragment = this.f3673b;
                NavController g10 = U4.b.g(outgoingPaymentsFragment);
                String str = outgoingPaymentsFragment.f12596q0.name() + "1";
                g10.getClass();
                g10.i(R.id.action_outgoingPaymentsFragment_to_countrySelectFragment, v.i("isCountryCode", "fieldName", str, false));
                break;
            case 2:
                OutgoingPaymentsFragment outgoingPaymentsFragment2 = this.f3673b;
                NavController g11 = U4.b.g(outgoingPaymentsFragment2);
                String str2 = outgoingPaymentsFragment2.f12596q0.name() + "2";
                g11.getClass();
                g11.i(R.id.action_outgoingPaymentsFragment_to_countrySelectFragment, v.i("isCountryCode", "fieldName", str2, false));
                break;
            case 3:
                OutgoingPaymentsFragment outgoingPaymentsFragment3 = this.f3673b;
                NavController g12 = U4.b.g(outgoingPaymentsFragment3);
                String str3 = outgoingPaymentsFragment3.f12596q0.name() + "3";
                g12.getClass();
                g12.i(R.id.action_outgoingPaymentsFragment_to_countrySelectFragment, v.i("isCountryCode", "fieldName", str3, false));
                break;
            case 4:
                OutgoingPaymentsFragment outgoingPaymentsFragment4 = this.f3673b;
                outgoingPaymentsFragment4.V0(outgoingPaymentsFragment4.getString(R.string.nature_of_your_relationship), outgoingPaymentsFragment4.getString(R.string.nature_of_your_relationship_description));
                break;
            case 5:
                OutgoingPaymentsFragment outgoingPaymentsFragment5 = this.f3673b;
                outgoingPaymentsFragment5.V0(outgoingPaymentsFragment5.getString(R.string.nature_of_your_relationship), outgoingPaymentsFragment5.getString(R.string.nature_of_your_relationship_description));
                break;
            case 6:
                OutgoingPaymentsFragment outgoingPaymentsFragment6 = this.f3673b;
                outgoingPaymentsFragment6.V0(outgoingPaymentsFragment6.getString(R.string.nature_of_your_relationship), outgoingPaymentsFragment6.getString(R.string.nature_of_your_relationship_description));
                break;
            case 7:
                OutgoingPaymentsFragment outgoingPaymentsFragment7 = this.f3673b;
                outgoingPaymentsFragment7.V0(outgoingPaymentsFragment7.getString(R.string.nature_of_your_relationship), outgoingPaymentsFragment7.getString(R.string.nature_of_your_relationship_description));
                break;
            case 8:
                OutgoingPaymentsFragment outgoingPaymentsFragment8 = this.f3673b;
                outgoingPaymentsFragment8.V0(outgoingPaymentsFragment8.getString(R.string.nature_of_your_relationship), outgoingPaymentsFragment8.getString(R.string.nature_of_your_relationship_description));
                break;
            case 9:
                OutgoingPaymentsFragment outgoingPaymentsFragment9 = this.f3673b;
                outgoingPaymentsFragment9.V0(outgoingPaymentsFragment9.getString(R.string.nature_of_your_relationship), outgoingPaymentsFragment9.getString(R.string.nature_of_your_relationship_description));
                break;
            case 10:
                androidx.appcompat.app.b bVar = this.f3673b.f12602x0;
                if (bVar != null) {
                    bVar.dismiss();
                }
                break;
            case 11:
                OutgoingPaymentsFragment outgoingPaymentsFragment10 = this.f3673b;
                outgoingPaymentsFragment10.V0(outgoingPaymentsFragment10.getString(R.string.current_and_future_partners), outgoingPaymentsFragment10.getString(R.string.current_and_future_partners_description));
                break;
            case 12:
                OutgoingPaymentsFragment outgoingPaymentsFragment11 = this.f3673b;
                outgoingPaymentsFragment11.V0(outgoingPaymentsFragment11.getString(R.string.current_and_future_partners), outgoingPaymentsFragment11.getString(R.string.current_and_future_partners_description));
                break;
            case 13:
                OutgoingPaymentsFragment outgoingPaymentsFragment12 = this.f3673b;
                outgoingPaymentsFragment12.V0(outgoingPaymentsFragment12.getString(R.string.current_and_future_partners), outgoingPaymentsFragment12.getString(R.string.current_and_future_partners_description));
                break;
            case 14:
                OutgoingPaymentsFragment outgoingPaymentsFragment13 = this.f3673b;
                outgoingPaymentsFragment13.V0(outgoingPaymentsFragment13.getString(R.string.current_and_future_partners), outgoingPaymentsFragment13.getString(R.string.current_and_future_partners_description));
                break;
            case 15:
                OutgoingPaymentsFragment outgoingPaymentsFragment14 = this.f3673b;
                outgoingPaymentsFragment14.V0(outgoingPaymentsFragment14.getString(R.string.current_and_future_partners), outgoingPaymentsFragment14.getString(R.string.current_and_future_partners_description));
                break;
            default:
                OutgoingPaymentsFragment outgoingPaymentsFragment15 = this.f3673b;
                outgoingPaymentsFragment15.V0(outgoingPaymentsFragment15.getString(R.string.current_and_future_partners), outgoingPaymentsFragment15.getString(R.string.current_and_future_partners_description));
                break;
        }
        return p.f3034a;
    }
}
