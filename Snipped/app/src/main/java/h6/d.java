package H6;

import C.v;
import android.util.Base64;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ForgotPasswordFragment;
import com.luminary.mobile.R;
import com.sumsub.sns.internal.core.data.model.p;
import ka.C0956a;
import t6.V3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordFragment f1528b;

    public /* synthetic */ d(ForgotPasswordFragment forgotPasswordFragment, int i) {
        this.f1527a = i;
        this.f1528b = forgotPasswordFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f1527a) {
            case 0:
                ForgotPasswordFragment forgotPasswordFragment = this.f1528b;
                forgotPasswordFragment.U0();
                String j02 = D9.b.j0(forgotPasswordFragment.requireContext(), String.valueOf(forgotPasswordFragment.u0().f28593p.getText()));
                if (j02.length() > 0) {
                    forgotPasswordFragment.u0().f28594q.setError(j02);
                } else if (kotlin.jvm.internal.f.b(String.valueOf(forgotPasswordFragment.u0().f28596s.getText()), String.valueOf(forgotPasswordFragment.u0().f28593p.getText()))) {
                    i iVar = (i) forgotPasswordFragment.f11555o0.getValue();
                    Fa.h hVar = forgotPasswordFragment.f11556p0;
                    String str = ((e) hVar.getValue()).f1530b;
                    String str2 = ((e) hVar.getValue()).f1529a;
                    String valueOf = String.valueOf(forgotPasswordFragment.u0().f28593p.getText());
                    String encodeToString = Base64.encodeToString(v.p(str, p.f15541a, str2).getBytes(C0956a.f23054b), 0);
                    K5.a aVar = iVar.f1544X0;
                    aVar.q(encodeToString);
                    String D2 = aVar.D();
                    iVar.f1543W0.a(new h(iVar, str2, valueOf, 0), D2);
                } else {
                    V3 u02 = forgotPasswordFragment.u0();
                    u02.f28595r.setError(forgotPasswordFragment.getString(R.string.password_mismatch));
                }
                return O9.p.f3034a;
            case 1:
                this.f1528b.u0().f28591n.callOnClick();
                return O9.p.f3034a;
            default:
                return Boolean.valueOf(U4.b.g(this.f1528b).m(R.id.welcomeFragment, false));
        }
    }
}
