package X2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.luminary.business.presentation.ui.fragments.newpayment.to_bank_account.NewPaymentToBankAccountBankInfoFragment;
import com.luminary.mobile.R;
import com.sumsub.sns.core.widget.SNSDateInputLayout;
import com.sumsub.sns.core.widget.SNSDateTimeInputLayout;
import k0.C0913a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3949b;

    public /* synthetic */ a(Object obj, int i) {
        this.f3948a = i;
        this.f3949b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f3948a) {
            case 0:
                d dVar = (d) this.f3949b;
                dVar.t(dVar.u());
                break;
            case 1:
                h hVar = (h) this.f3949b;
                hVar.f3972l = z10;
                hVar.q();
                if (!z10) {
                    hVar.t(false);
                    hVar.f3973m = false;
                    break;
                }
                break;
            case 2:
                for (EditText editText : (EditText[]) this.f3949b) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) C0913a.getSystemService(view.getContext(), InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
            case 3:
                SNSDateInputLayout.m41addView$lambda0((SNSDateInputLayout) this.f3949b, view, z10);
                break;
            case 4:
                SNSDateTimeInputLayout.m44addView$lambda0((SNSDateTimeInputLayout) this.f3949b, view, z10);
                break;
            default:
                if (!z10) {
                    NewPaymentToBankAccountBankInfoFragment newPaymentToBankAccountBankInfoFragment = (NewPaymentToBankAccountBankInfoFragment) this.f3949b;
                    if (s3.b.w("^[^0-9]+$", String.valueOf(newPaymentToBankAccountBankInfoFragment.u0().f29076z.getText()))) {
                        newPaymentToBankAccountBankInfoFragment.u0().f29075y.setError(null);
                        break;
                    } else {
                        newPaymentToBankAccountBankInfoFragment.u0().f29075y.setErrorWithoutFocus(newPaymentToBankAccountBankInfoFragment.getString(R.string.invalid_city));
                        break;
                    }
                }
                break;
        }
    }
}
