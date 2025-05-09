package M6;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment;
import com.luminary.business.presentation.ui.fragments.newcard.confirmorder.ConfirmOrderFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.bank.NewPaymentBankFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f2628b;

    public /* synthetic */ j(BaseFragment baseFragment, int i) {
        this.f2627a = i;
        this.f2628b = baseFragment;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i9, int i10, int i11) {
        View childAt;
        View childAt2;
        switch (this.f2627a) {
            case 0:
                RegisterFragment registerFragment = (RegisterFragment) this.f2628b;
                if (registerFragment.f11669r0) {
                    F8.o.b(registerFragment.u0().f29759p);
                    registerFragment.u0().f29760q.setVisibility(0);
                    break;
                }
                break;
            case 1:
                NestedScrollView nestedScrollView = view instanceof NestedScrollView ? (NestedScrollView) view : null;
                if (nestedScrollView != null && (childAt = nestedScrollView.getChildAt(0)) != null) {
                    int measuredHeight = childAt.getMeasuredHeight() - ((NestedScrollView) view).getMeasuredHeight();
                    ConfirmOrderFragment confirmOrderFragment = (ConfirmOrderFragment) this.f2628b;
                    if (i9 != measuredHeight) {
                        if (confirmOrderFragment.f12409q0) {
                            confirmOrderFragment.u0().f29186o.setVisibility(4);
                            confirmOrderFragment.u0().f29187p.setVisibility(0);
                            break;
                        }
                    } else {
                        confirmOrderFragment.u0().f29186o.setVisibility(0);
                        F8.o.b(confirmOrderFragment.u0().f29187p);
                        break;
                    }
                }
                break;
            case 2:
                NewPaymentBankFragment newPaymentBankFragment = (NewPaymentBankFragment) this.f2628b;
                if (newPaymentBankFragment.u0().f28576u.computeVerticalScrollOffset() <= 200) {
                    CustomToolbarView.State state = CustomToolbarView.State.f13256a;
                    if (state != newPaymentBankFragment.f11464f0 || newPaymentBankFragment.f11467i0) {
                        newPaymentBankFragment.f11464f0 = state;
                        newPaymentBankFragment.L0();
                        break;
                    }
                } else {
                    CustomToolbarView.State state2 = CustomToolbarView.State.f13257b;
                    if (state2 != newPaymentBankFragment.f11464f0 || newPaymentBankFragment.f11467i0) {
                        newPaymentBankFragment.f11464f0 = state2;
                        newPaymentBankFragment.L0();
                        break;
                    }
                }
                break;
            default:
                NestedScrollView nestedScrollView2 = view instanceof NestedScrollView ? (NestedScrollView) view : null;
                if (nestedScrollView2 != null && (childAt2 = nestedScrollView2.getChildAt(0)) != null) {
                    int measuredHeight2 = childAt2.getMeasuredHeight() - ((NestedScrollView) view).getMeasuredHeight();
                    PaymentDetailsFragment paymentDetailsFragment = (PaymentDetailsFragment) this.f2628b;
                    if (i9 != measuredHeight2) {
                        if (paymentDetailsFragment.f12802o0) {
                            paymentDetailsFragment.u0().f28756o.setVisibility(4);
                            paymentDetailsFragment.u0().f28757p.setVisibility(0);
                            break;
                        }
                    } else {
                        paymentDetailsFragment.u0().f28756o.setVisibility(0);
                        F8.o.b(paymentDetailsFragment.u0().f28757p);
                        break;
                    }
                }
                break;
        }
    }
}
