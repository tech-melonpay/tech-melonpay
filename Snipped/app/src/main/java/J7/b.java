package J7;

import X2.d;
import X2.h;
import X2.o;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ca.InterfaceC0635a;
import com.chuckerteam.chucker.internal.ui.MainActivity;
import com.chuckerteam.chucker.internal.ui.transaction.e;
import com.google.android.material.datepicker.l;
import com.luminary.business.presentation.ui.fragments.cards.details.CardDetailsFragment;
import com.luminary.business.presentation.ui.fragments.crypto.exchange_list.ExchangeListController;
import com.luminary.business.presentation.ui.fragments.loans.history.LoansHistoryController;
import com.luminary.business.presentation.ui.fragments.statements.StatementsSelectorDialog;
import com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment;
import com.luminary.business.presentation.ui.fragments.support.SupportController;
import com.luminary.business.presentation.ui.views.CodeTextView;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;
import com.luminary.mobile.R;
import com.sumsub.sns.core.widget.SNSDateInputLayout;
import com.sumsub.sns.core.widget.SNSDateTimeInputLayout;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataFileFieldView;
import com.sumsub.sns.presentation.screen.questionnary.SNSQuestionnaireFragment;
import com.sumsub.sns.prooface.presentation.SNSLiveness3dFaceFragment;
import p8.C1116a;
import y8.DialogC1630k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2194b;

    public /* synthetic */ b(Object obj, int i) {
        this.f2193a = i;
        this.f2194b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f2194b;
        switch (this.f2193a) {
            case 0:
                LoansHistoryController.buildModels$lambda$6$lambda$5$lambda$4((LoansHistoryController) obj, view);
                break;
            case 1:
                int i = MainActivity.f8665o;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addFlags(268435456);
                MainActivity mainActivity = (MainActivity) obj;
                intent.setData(Uri.fromParts("package", mainActivity.getPackageName(), null));
                mainActivity.startActivity(intent);
                break;
            case 2:
                ((e.b) obj).f8783f.invoke();
                break;
            case 3:
                CardDetailsFragment cardDetailsFragment = (CardDetailsFragment) obj;
                U4.b.g(cardDetailsFragment).j(new W6.e(null, cardDetailsFragment.W0().f3834a));
                break;
            case 4:
                d dVar = (d) obj;
                EditText editText = dVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.q();
                    break;
                }
                break;
            case 5:
                ((h) obj).u();
                break;
            case 6:
                o oVar = (o) obj;
                EditText editText2 = oVar.f4021f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = oVar.f4021f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        oVar.f4021f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        oVar.f4021f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        oVar.f4021f.setSelection(selectionEnd);
                    }
                    oVar.q();
                    break;
                }
                break;
            case 7:
                l lVar = (l) obj;
                lVar.f9450F0.setEnabled(lVar.o0().Q());
                lVar.f9448D0.toggle();
                lVar.s0 = lVar.s0 == 1 ? 0 : 1;
                lVar.s0(lVar.f9448D0);
                lVar.r0();
                break;
            case 8:
                com.sumsub.sns.camera.photo.presentation.a.a((com.sumsub.sns.camera.photo.presentation.a) obj, view);
                break;
            case 9:
                com.sumsub.sns.camera.photo.presentation.document.a.a((com.sumsub.sns.camera.photo.presentation.document.a) obj, view);
                break;
            case 10:
                com.sumsub.sns.camera.video.presentation.a.a((com.sumsub.sns.camera.video.presentation.a) obj, view);
                break;
            case 11:
                com.sumsub.sns.core.presentation.b.a((com.sumsub.sns.core.presentation.b) obj, view);
                break;
            case 12:
                ((SNSDateInputLayout) obj).showCalendar();
                break;
            case 13:
                ((SNSDateTimeInputLayout) obj).showCalendar();
                break;
            case 14:
                SNSApplicantDataFileFieldView.m61populateViewItems$lambda9$lambda8((SNSApplicantDataFileFieldView) obj, view);
                break;
            case 15:
                com.sumsub.sns.internal.core.common.l.a((InterfaceC0635a) obj, view);
                break;
            case 16:
                com.sumsub.sns.presentation.screen.error.a.a((com.sumsub.sns.presentation.screen.error.a) obj, view);
                break;
            case 17:
                com.sumsub.sns.presentation.screen.intro.a.a((com.sumsub.sns.presentation.screen.intro.a) obj, view);
                break;
            case 18:
                com.sumsub.sns.presentation.screen.preview.applicantdata.a.a((com.sumsub.sns.presentation.screen.preview.applicantdata.a) obj, view);
                break;
            case 19:
                SNSQuestionnaireFragment.a((SNSQuestionnaireFragment) obj, view);
                break;
            case 20:
                SNSLiveness3dFaceFragment.a((SNSLiveness3dFaceFragment) obj, view);
                break;
            case 21:
                StatisticsFragment statisticsFragment = (StatisticsFragment) obj;
                if (statisticsFragment.isAdded()) {
                    StatementsSelectorDialog statementsSelectorDialog = new StatementsSelectorDialog(statisticsFragment.requireContext(), StatementsSelectorDialog.DialogType.f13045c);
                    statementsSelectorDialog.f13040u = new C1116a(statisticsFragment, 2);
                    statementsSelectorDialog.show();
                    StatementsSelectorDialog.l(statementsSelectorDialog, statisticsFragment.f13098u0);
                    statementsSelectorDialog.m(statisticsFragment.getString(R.string.select_account));
                    break;
                }
                break;
            case 22:
                ExchangeListController.buildModels$lambda$9$lambda$8$lambda$6((ExchangeListController) obj, view);
                break;
            case 23:
                SupportController.buildModels$lambda$2$lambda$1$lambda$0((SupportController.a) obj, view);
                break;
            case 24:
                int i9 = CodeTextView.f13162k;
                CodeTextView codeTextView = (CodeTextView) obj;
                codeTextView.setSelection(codeTextView.getText().length());
                View.OnClickListener onClickListener = codeTextView.f13171j;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 25:
                ((SelectorDialog) obj).dismiss();
                break;
            default:
                DialogC1630k dialogC1630k = (DialogC1630k) obj;
                InterfaceC0635a<? extends Object> interfaceC0635a = dialogC1630k.f31150s;
                if (interfaceC0635a != null) {
                    interfaceC0635a.invoke();
                }
                dialogC1630k.dismiss();
                break;
        }
    }
}
