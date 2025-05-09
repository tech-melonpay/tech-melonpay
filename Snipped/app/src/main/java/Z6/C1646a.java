package z6;

import O9.p;
import android.content.Intent;
import android.os.Build;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.activity.passcode.PasscodeActivity;
import com.luminary.business.presentation.ui.base.BaseActivity;
import ka.C0970o;

/* compiled from: R8$$SyntheticClass */
/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1646a implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PasscodeActivity f31327b;

    public /* synthetic */ C1646a(PasscodeActivity passcodeActivity, int i) {
        this.f31326a = i;
        this.f31327b = passcodeActivity;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        PasscodeActivity passcodeActivity = this.f31327b;
        switch (this.f31326a) {
            case 0:
                int i = PasscodeActivity.f11423y;
                passcodeActivity.setResult(0);
                passcodeActivity.finish();
                break;
            case 1:
                int i9 = PasscodeActivity.f11423y;
                passcodeActivity.finish();
                break;
            case 2:
                int i10 = PasscodeActivity.f11423y;
                passcodeActivity.A("0");
                break;
            case 3:
                int i11 = PasscodeActivity.f11423y;
                passcodeActivity.A("1");
                break;
            case 4:
                int i12 = PasscodeActivity.f11423y;
                passcodeActivity.A("2");
                break;
            case 5:
                int i13 = PasscodeActivity.f11423y;
                passcodeActivity.A("3");
                break;
            case 6:
                int i14 = PasscodeActivity.f11423y;
                passcodeActivity.A("4");
                break;
            case 7:
                int i15 = PasscodeActivity.f11423y;
                passcodeActivity.A("5");
                break;
            case 8:
                int i16 = PasscodeActivity.f11423y;
                passcodeActivity.A("6");
                break;
            case 9:
                int i17 = PasscodeActivity.f11423y;
                passcodeActivity.A("7");
                break;
            case 10:
                int i18 = PasscodeActivity.f11423y;
                if (passcodeActivity.C().f31331U0.M()) {
                    passcodeActivity.finish();
                } else {
                    passcodeActivity.f11430v = true;
                    passcodeActivity.D();
                }
                break;
            case 11:
                int i19 = PasscodeActivity.f11423y;
                passcodeActivity.finish();
                break;
            case 12:
                int i20 = PasscodeActivity.f11423y;
                passcodeActivity.B(true);
                break;
            case 13:
                int i21 = PasscodeActivity.f11423y;
                passcodeActivity.B(true);
                break;
            case 14:
                int i22 = PasscodeActivity.f11423y;
                passcodeActivity.A("8");
                break;
            case 15:
                int i23 = PasscodeActivity.f11423y;
                passcodeActivity.A("9");
                break;
            case 16:
                int i24 = PasscodeActivity.f11423y;
                passcodeActivity.getClass();
                passcodeActivity.H(BaseActivity.VibrateType.f11460b);
                String x02 = C0970o.x0(passcodeActivity.f11429u);
                passcodeActivity.f11429u = x02;
                if (x02.length() > 0) {
                    passcodeActivity.E();
                }
                passcodeActivity.E();
                break;
            default:
                int i25 = PasscodeActivity.f11423y;
                passcodeActivity.C().f31331U0.p();
                Intent intent = new Intent(passcodeActivity, (Class<?>) MainActivity.class);
                passcodeActivity.finishAffinity();
                passcodeActivity.startActivity(intent);
                if (Build.VERSION.SDK_INT >= 34) {
                    passcodeActivity.overrideActivityTransition(0, 0, 0);
                } else {
                    passcodeActivity.overridePendingTransition(0, 0);
                }
                break;
        }
        return p.f3034a;
    }
}
