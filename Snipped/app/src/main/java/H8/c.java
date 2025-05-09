package h8;

import android.view.View;
import android.widget.EditText;
import ca.InterfaceC0646l;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment;
import com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout;
import com.luminary.mobile.R;
import t6.AbstractC1350h5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21205c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f21203a = i;
        this.f21204b = obj;
        this.f21205c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f21203a) {
            case 0:
                if (!z10) {
                    AbstractC1350h5 abstractC1350h5 = (AbstractC1350h5) this.f21205c;
                    CustomTextInputLayout customTextInputLayout = abstractC1350h5.f29062E;
                    String string = ((NewPaymentToBankAccountBankInfoFragment) this.f21204b).getString(R.string.invalid_bic_swift);
                    if (!s3.b.w("^[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}([A-Z0-9]{3})?$", String.valueOf(abstractC1350h5.f29063F.getText()))) {
                        customTextInputLayout.setErrorWithoutFocus(string);
                        break;
                    } else {
                        customTextInputLayout.setError(null);
                        break;
                    }
                }
                break;
            case 1:
                if (!z10) {
                    AbstractC1350h5 abstractC1350h52 = (AbstractC1350h5) this.f21205c;
                    CustomTextInputLayout customTextInputLayout2 = abstractC1350h52.f29068r;
                    String string2 = ((NewPaymentToBankAccountBankInfoFragment) this.f21204b).getString(R.string.invalid_bic_swift);
                    if (!s3.b.w("^[A-Z]{4}[A-Z]{2}[A-Z0-9]{2}([A-Z0-9]{3})?$", String.valueOf(abstractC1350h52.f29069s.getText()))) {
                        customTextInputLayout2.setErrorWithoutFocus(string2);
                        break;
                    } else {
                        customTextInputLayout2.setError(null);
                        break;
                    }
                }
                break;
            default:
                if (!z10) {
                    ((InterfaceC0646l) this.f21204b).invoke(((EditText) this.f21205c).getText().toString());
                    break;
                }
                break;
        }
    }
}
