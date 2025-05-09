package y8;

import android.view.View;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.presentation.ui.fragments.exchange_old.exchangeaccountlist.ExchangeAccountListController;
import com.luminary.business.presentation.ui.views.dialogs.SelectorDialog;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC1624e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31138c;

    public /* synthetic */ ViewOnClickListenerC1624e(int i, Object obj, Object obj2) {
        this.f31136a = i;
        this.f31137b = obj;
        this.f31138c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31136a) {
            case 0:
                SelectorDialog.SelectorController.buildModels$lambda$2$lambda$1$lambda$0((SelectorDialog.SelectorController) this.f31137b, (String) this.f31138c, view);
                break;
            default:
                ExchangeAccountListController.buildModels$lambda$4$lambda$3$lambda$2((BankAccountDomain) this.f31137b, (ExchangeAccountListController) this.f31138c, view);
                break;
        }
    }
}
