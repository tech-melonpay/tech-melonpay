package M6;

import android.os.Build;
import androidx.navigation.NavController;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterAddressFragment;
import com.luminary.business.presentation.ui.fragments.newcompany.NewCompanyViewModel;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import t6.AbstractC1451u5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RegisterAddressFragment f2606b;

    public /* synthetic */ b(RegisterAddressFragment registerAddressFragment, int i) {
        this.f2605a = i;
        this.f2606b = registerAddressFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f2605a) {
            case 0:
                RegisterAddressFragment registerAddressFragment = this.f2606b;
                if (registerAddressFragment.a1(true, true, true)) {
                    AbstractC1451u5 u02 = registerAddressFragment.u0();
                    w W02 = registerAddressFragment.W0();
                    v vVar = new v(W02, null, null, null, null, null, null, null, registerAddressFragment.f11632q0, String.valueOf((registerAddressFragment.X0() ? u02.f29668H : u02.f29686v).getText()), String.valueOf((registerAddressFragment.X0() ? u02.f29671K : u02.f29681q).getText()), String.valueOf((registerAddressFragment.X0() ? u02.f29673M : u02.f29662B).getText()), String.valueOf((registerAddressFragment.X0() ? u02.f29675O : u02.f29679o).getText()), String.valueOf(registerAddressFragment.u0().f29690z.getText()), registerAddressFragment.f11635u0, registerAddressFragment.f11636v0);
                    W02.f2691D1 = vVar;
                    vVar.invoke();
                }
                break;
            case 1:
                this.f2606b.f11634t0.a(FilePickerContractor.FileTypeEnum.PDF);
                break;
            case 2:
                this.f2606b.f11634t0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 3:
                int i = Build.VERSION.SDK_INT;
                RegisterAddressFragment registerAddressFragment2 = this.f2606b;
                if (i < 29) {
                    registerAddressFragment2.f11638x0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    registerAddressFragment2.f11639y0.a("android.permission.CAMERA");
                }
                break;
            case 4:
                this.f2606b.u0().f29683s.callOnClick();
                break;
            case 5:
                NewCompanyViewModel.UploadFileType uploadFileType = NewCompanyViewModel.UploadFileType.f12466f;
                RegisterAddressFragment registerAddressFragment3 = this.f2606b;
                registerAddressFragment3.s0 = uploadFileType;
                F8.e.a(registerAddressFragment3, null, new b(registerAddressFragment3, 1), new b(registerAddressFragment3, 2), new b(registerAddressFragment3, 3));
                break;
            case 6:
                NewCompanyViewModel.UploadFileType uploadFileType2 = NewCompanyViewModel.UploadFileType.f12468h;
                RegisterAddressFragment registerAddressFragment4 = this.f2606b;
                registerAddressFragment4.s0 = uploadFileType2;
                F8.e.a(registerAddressFragment4, null, new b(registerAddressFragment4, 1), new b(registerAddressFragment4, 2), new b(registerAddressFragment4, 3));
                break;
            case 7:
                RegisterAddressFragment registerAddressFragment5 = this.f2606b;
                registerAddressFragment5.f11635u0 = null;
                registerAddressFragment5.u0().f29666F.setText(R.string.empty);
                F8.o.b(registerAddressFragment5.u0().f29663C);
                registerAddressFragment5.u0().f29664D.setVisibility(0);
                break;
            case 8:
                RegisterAddressFragment registerAddressFragment6 = this.f2606b;
                registerAddressFragment6.f11636v0 = null;
                registerAddressFragment6.u0().R.setText("");
                F8.o.b(registerAddressFragment6.u0().f29676P);
                registerAddressFragment6.u0().f29677Q.setVisibility(0);
                break;
            default:
                NavController g10 = U4.b.g(this.f2606b);
                g10.i(R.id.action_registerAddressFragment_to_countrySelect, C.v.h(g10, "isCountryCode", false, "fieldName", ""));
                break;
        }
        return O9.p.f3034a;
    }
}
