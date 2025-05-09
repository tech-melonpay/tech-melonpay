package B7;

import U1.e;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.entity.company.TeamMemberUI;
import com.luminary.business.presentation.ui.fragments.accountdetails.AccountDetailsController;
import com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsController;
import com.luminary.business.presentation.ui.fragments.auth.register.country.CountrySelectController;
import com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsController;
import com.luminary.business.presentation.ui.fragments.company.list.CompaniesListController;
import com.luminary.business.presentation.ui.fragments.crypto.all_exchanges.AllExchangesController;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.CryptoAccountDetailsController;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListController;
import com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.SavedPaymentsController;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeCryptoController;
import com.luminary.business.presentation.ui.fragments.hub.HubController;
import com.luminary.business.presentation.ui.fragments.hub.HubFragment;
import com.luminary.business.presentation.ui.fragments.invoices.invoices_new.InvoicesNewController;
import com.luminary.business.presentation.ui.fragments.newcard.NewCardListController;
import com.luminary.business.presentation.ui.fragments.newcompany.teammembers.TeamMembersController;
import com.luminary.business.presentation.ui.fragments.payments.PaymentsController;
import com.luminary.business.presentation.ui.fragments.plans.SelectPlansFragment;
import com.luminary.business.presentation.ui.fragments.settings.SettingsController;
import com.sumsub.sns.core.presentation.support.b;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.core.widget.autocompletePhone.bottomsheet.SNSPickerDialog;
import com.sumsub.sns.internal.camera.photo.presentation.a;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.presentation.screen.verification.SNSVerificationStepViewModel;
import com.sumsub.sns.internal.videoident.presentation.SNSViewState;
import com.sumsub.sns.internal.videoident.presentation.a;
import com.sumsub.sns.videoident.presentation.LanguageItemAdapter;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;
import k8.C0954c;
import v6.C1546a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f447c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f445a = i;
        this.f446b = obj;
        this.f447c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f445a) {
            case 0:
                NewHomeCryptoController.buildModels$lambda$14$lambda$13$lambda$12((com.luminary.business.presentation.ui.fragments.home.newhome.a) this.f446b, (NewHomeCryptoController) this.f447c, view);
                break;
            case 1:
                HubController.buildModels$lambda$3$lambda$2$lambda$0((HubController) this.f446b, (HubFragment.Apps) this.f447c, view);
                break;
            case 2:
                AccountDetailsController.buildModels$lambda$15$lambda$14$lambda$13((com.luminary.business.presentation.ui.fragments.home.newhome.b) this.f446b, (AccountDetailsController) this.f447c, view);
                break;
            case 3:
                AllTransactionsController.buildModels$lambda$6$lambda$5$lambda$4((com.luminary.business.presentation.ui.fragments.home.newhome.b) this.f446b, (AllTransactionsController) this.f447c, view);
                break;
            case 4:
                InvoicesNewController.invoicesToShow$lambda$7$lambda$6$lambda$5((com.luminary.business.presentation.ui.fragments.home.newhome.b) this.f446b, (InvoicesNewController) this.f447c, view);
                break;
            case 5:
                NewCardListController.buildModels$lambda$11$lambda$10$lambda$9((BankAccountDomain) this.f446b, (NewCardListController) this.f447c, view);
                break;
            case 6:
                CountrySelectController.buildModels$lambda$3$lambda$2$lambda$1$lambda$0((CountrySelectController) this.f446b, (u5.f) this.f447c, view);
                break;
            case 7:
                Long l10 = ((e.a) this.f446b).f3648f;
                if (l10 != null) {
                    ((U1.e) this.f447c).f3641e.invoke(Long.valueOf(l10.longValue()));
                    break;
                }
                break;
            case 8:
                Snackbar snackbar = (Snackbar) this.f446b;
                snackbar.getClass();
                ((View.OnClickListener) this.f447c).onClick(view);
                snackbar.b(1);
                break;
            case 9:
                TeamMembersController.buildModels$lambda$3$lambda$2$lambda$1((TeamMemberUI) this.f446b, (TeamMembersController) this.f447c, view);
                break;
            case 10:
                CardTransactionsController.buildModels$lambda$6$lambda$5$lambda$4((com.luminary.business.presentation.ui.fragments.cards.transactions.a) this.f446b, (CardTransactionsController) this.f447c, view);
                break;
            case 11:
                CompaniesListController.buildModels$lambda$4$lambda$3$lambda$2((com.luminary.business.presentation.ui.fragments.company.list.a) this.f446b, (CompaniesListController) this.f447c, view);
                break;
            case 12:
                com.sumsub.sns.camera.photo.presentation.a.a((com.sumsub.sns.camera.photo.presentation.a) this.f446b, (a.b) this.f447c, view);
                break;
            case 13:
                com.sumsub.sns.core.presentation.base.adapter.holders.a.a((com.sumsub.sns.core.presentation.base.adapter.holders.a) this.f446b, (com.sumsub.sns.internal.core.presentation.base.adapter.a) this.f447c, view);
                break;
            case 14:
                com.sumsub.sns.core.presentation.screen.verification.a.a((com.sumsub.sns.core.presentation.screen.verification.a) this.f446b, (SNSVerificationStepViewModel.e.c) this.f447c, view);
                break;
            case 15:
                com.sumsub.sns.core.presentation.support.a.a((b.a) this.f446b, (com.sumsub.sns.core.presentation.support.a) this.f447c, view);
                break;
            case 16:
                SNSApplicantDataFileFieldView.m60populateViewItems$lambda7$lambda6$lambda5((SNSApplicantDataFileFieldView) this.f446b, (SNSApplicantDataFileFieldView.Attachment) this.f447c, view);
                break;
            case 17:
                SNSPickerDialog.m71bindItemViewHolder$lambda10((SNSPickerDialog) this.f446b, (SNSPickerDialog.Item) this.f447c, view);
                break;
            case 18:
                com.sumsub.sns.presentation.screen.error.b.a((Control) this.f446b, (com.sumsub.sns.presentation.screen.error.b) this.f447c, view);
                break;
            case 19:
                LanguageItemAdapter.LanguageItemViewHolder.m76bind$lambda0((LanguageItemAdapter) this.f446b, (a.c.b) this.f447c, view);
                break;
            case 20:
                SNSVideoIdentFragment.m90updateBottomPrimaryButton$lambda65((SNSViewState.e) this.f446b, (SNSVideoIdentFragment) this.f447c, view);
                break;
            case 21:
                AllExchangesController.buildModels$lambda$6$lambda$5$lambda$4((com.luminary.business.presentation.ui.fragments.home.newhome.a) this.f446b, (AllExchangesController) this.f447c, view);
                break;
            case 22:
                PaymentsController.buildModels$lambda$19$lambda$18$lambda$17((com.luminary.business.presentation.ui.fragments.home.newhome.b) this.f446b, (PaymentsController) this.f447c, view);
                break;
            case 23:
                PaymentsController.buildModels$lambda$23$lambda$22$lambda$21((H5.b) this.f446b, (PaymentsController) this.f447c, view);
                break;
            case 24:
                Integer num = ((C5.a) this.f446b).f664a;
                if (num != null) {
                    int intValue = num.intValue();
                    C0954c c0954c = ((SelectPlansFragment) this.f447c).f12966q0;
                    if (c0954c == null) {
                        c0954c = null;
                    }
                    c0954c.invoke(Integer.valueOf(intValue));
                    break;
                }
                break;
            case 25:
                CryptoAccountDetailsController.buildModels$lambda$16$lambda$15$lambda$14((com.luminary.business.presentation.ui.fragments.home.newhome.a) this.f446b, (CryptoAccountDetailsController) this.f447c, view);
                break;
            case 26:
                SettingsController.buildModels$lambda$15$lambda$14$lambda$12((C1546a) this.f446b, (SettingsController) this.f447c, view);
                break;
            case 27:
                ExchangeListController.buildModels$lambda$21$lambda$20$lambda$19((com.luminary.business.presentation.ui.fragments.home.newhome.a) this.f446b, (ExchangeListController) this.f447c, view);
                break;
            default:
                SavedPaymentsController.buildModels$lambda$3$lambda$2$lambda$1((H5.b) this.f446b, (SavedPaymentsController) this.f447c, view);
                break;
        }
    }
}
