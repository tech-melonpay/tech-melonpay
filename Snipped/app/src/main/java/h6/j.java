package H6;

import O9.p;
import android.text.Editable;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.fragments.auth.forgotpassword.ResetPasswordFragment;
import com.luminary.mobile.R;
import t6.C5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ResetPasswordFragment f1549b;

    public /* synthetic */ j(ResetPasswordFragment resetPasswordFragment, int i) {
        this.f1548a = i;
        this.f1549b = resetPasswordFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        switch (this.f1548a) {
            case 0:
                ResetPasswordFragment resetPasswordFragment = this.f1549b;
                resetPasswordFragment.U0();
                Editable text = resetPasswordFragment.u0().f27694p.getText();
                if (text == null || text.length() == 0) {
                    C5 u02 = resetPasswordFragment.u0();
                    u02.f27695q.setError(resetPasswordFragment.getString(R.string.empty_password));
                } else {
                    String j02 = D9.b.j0(resetPasswordFragment.requireContext(), String.valueOf(resetPasswordFragment.u0().f27697s.getText()));
                    if (j02.length() > 0) {
                        resetPasswordFragment.u0().f27696r.setError(j02);
                    } else if (kotlin.jvm.internal.f.b(String.valueOf(resetPasswordFragment.u0().f27697s.getText()), String.valueOf(resetPasswordFragment.u0().f27699u.getText()))) {
                        i iVar = (i) resetPasswordFragment.f11566o0.getValue();
                        String valueOf = String.valueOf(resetPasswordFragment.u0().f27694p.getText());
                        String valueOf2 = String.valueOf(resetPasswordFragment.u0().f27697s.getText());
                        iVar.l();
                        I5.b bVar = new I5.b(valueOf, valueOf2);
                        iVar.f1540T0.a(new g(iVar, 0), bVar);
                    } else {
                        C5 u03 = resetPasswordFragment.u0();
                        u03.f27698t.setError(resetPasswordFragment.getString(R.string.password_mismatch));
                    }
                }
                return p.f3034a;
            case 1:
                this.f1549b.u0().f27692n.callOnClick();
                return p.f3034a;
            default:
                return Boolean.valueOf(U4.b.g(this.f1549b).m(R.id.welcomeFragment, false));
        }
    }
}
