package T7;

import C.v;
import O9.p;
import P9.s;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavController;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.entity.company.CompanyDetailsUI;
import com.luminary.business.presentation.ui.fragments.newcompany.crypto_info.CryptoInformationFragment;
import com.luminary.mobile.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC0646l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoInformationFragment f3577b;

    public /* synthetic */ a(CryptoInformationFragment cryptoInformationFragment, int i) {
        this.f3576a = i;
        this.f3577b = cryptoInformationFragment;
    }

    @Override // ca.InterfaceC0646l
    public final Object invoke(Object obj) {
        List<String> list;
        List<String> list2;
        switch (this.f3576a) {
            case 0:
                CryptoInformationFragment cryptoInformationFragment = this.f3577b;
                NavController g10 = U4.b.g(cryptoInformationFragment);
                Parcelable parcelable = cryptoInformationFragment.U0().f12446k1;
                if (parcelable == null) {
                    parcelable = null;
                }
                Bundle g11 = v.g(g10);
                if (Parcelable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                    g11.putParcelable("companyDetails", parcelable);
                } else {
                    if (!Serializable.class.isAssignableFrom(CompanyDetailsUI.class)) {
                        throw new UnsupportedOperationException(CompanyDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    g11.putSerializable("companyDetails", (Serializable) parcelable);
                }
                g10.i(R.id.action_cryptoInformationFragment_to_outgoingPaymentsFragment, g11);
                return p.f3034a;
            case 1:
                String str = (String) obj;
                CryptoInformationFragment cryptoInformationFragment2 = this.f3577b;
                cryptoInformationFragment2.f12582t0.add(str);
                cryptoInformationFragment2.u0().f29861r.setText(str);
                cryptoInformationFragment2.f12582t0 = new ArrayList<>(s.F(cryptoInformationFragment2.f12582t0));
                CompanyDetailsUI companyDetailsUI = cryptoInformationFragment2.U0().f12446k1;
                if (companyDetailsUI == null) {
                    companyDetailsUI = null;
                }
                CompanyDetailsUI.CompanyUI companyUI = companyDetailsUI.f11192a;
                if (companyUI != null) {
                    companyUI.f11260w0 = cryptoInformationFragment2.f12582t0;
                }
                cryptoInformationFragment2.W0(cryptoInformationFragment2.u0().f29862s, cryptoInformationFragment2.f12582t0);
                cryptoInformationFragment2.X0();
                return p.f3034a;
            default:
                CryptoInformationFragment cryptoInformationFragment3 = this.f3577b;
                if (cryptoInformationFragment3.f12581r0.isEmpty()) {
                    cryptoInformationFragment3.u0().f29863t.setText("");
                    CompanyDetailsUI companyDetailsUI2 = cryptoInformationFragment3.U0().f12446k1;
                    if (companyDetailsUI2 == null) {
                        companyDetailsUI2 = null;
                    }
                    CompanyDetailsUI.CompanyUI companyUI2 = companyDetailsUI2.f11192a;
                    if (companyUI2 != null && (list2 = companyUI2.f11256u0) != null) {
                        for (String str2 : list2) {
                            cryptoInformationFragment3.f12581r0.add(new Pair<>(cryptoInformationFragment3.U0().i0(str2), str2));
                        }
                    }
                }
                if (cryptoInformationFragment3.f12580q0.isEmpty()) {
                    cryptoInformationFragment3.u0().f29867x.setText("");
                    CompanyDetailsUI companyDetailsUI3 = cryptoInformationFragment3.U0().f12446k1;
                    CompanyDetailsUI.CompanyUI companyUI3 = (companyDetailsUI3 != null ? companyDetailsUI3 : null).f11192a;
                    if (companyUI3 != null && (list = companyUI3.f11258v0) != null) {
                        for (String str3 : list) {
                            cryptoInformationFragment3.f12580q0.add(new Pair<>(cryptoInformationFragment3.U0().i0(str3), str3));
                        }
                    }
                }
                cryptoInformationFragment3.V0(cryptoInformationFragment3.u0().f29864u, cryptoInformationFragment3.f12581r0);
                cryptoInformationFragment3.V0(cryptoInformationFragment3.u0().f29868y, cryptoInformationFragment3.f12580q0);
                return p.f3034a;
        }
    }
}
