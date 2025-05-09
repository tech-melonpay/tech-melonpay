package C2;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.luminary.business.presentation.ui.fragments.auth.register.RegisterFragment;
import com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.CreateExchangeDetailsFragment;
import com.luminary.business.presentation.ui.fragments.newpayment.paymentdetails.PaymentDetailsFragment;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataMutilselectFieldView;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataRadioGroupView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f660b;

    public /* synthetic */ a(Object obj, int i) {
        this.f659a = i;
        this.f660b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f659a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f660b).i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    break;
                }
                break;
            case 1:
                ((RegisterFragment) this.f660b).T0();
                break;
            case 2:
                SNSApplicantDataMutilselectFieldView.m62_set_items_$lambda5$lambda4$lambda3((SNSApplicantDataMutilselectFieldView) this.f660b, compoundButton, z10);
                break;
            case 3:
                SNSApplicantDataRadioGroupView.m63_set_items_$lambda4$lambda3$lambda2((SNSApplicantDataRadioGroupView) this.f660b, compoundButton, z10);
                break;
            case 4:
                ((PaymentDetailsFragment) this.f660b).u0().f28743D.setEnabled(z10);
                break;
            default:
                ((CreateExchangeDetailsFragment) this.f660b).u0().f29579u.setEnabled(z10);
                break;
        }
    }
}
