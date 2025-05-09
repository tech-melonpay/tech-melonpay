package B7;

import android.view.View;
import com.luminary.business.presentation.ui.fragments.all_transactions.AllTransactionsController;
import com.luminary.business.presentation.ui.fragments.cards.transactions.CardTransactionsController;
import com.luminary.business.presentation.ui.fragments.fee.fee_list.AllFeeController;
import com.luminary.business.presentation.ui.fragments.home.newhome.NewHomeController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f439a;

    public /* synthetic */ c(int i) {
        this.f439a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f439a) {
            case 0:
                NewHomeController.buildModels$lambda$15$lambda$14$lambda$13(view);
                break;
            case 1:
                AllTransactionsController.buildModels$lambda$6$lambda$2$lambda$1(view);
                break;
            case 2:
                CardTransactionsController.buildModels$lambda$6$lambda$2$lambda$1(view);
                break;
            default:
                AllFeeController.buildModels$lambda$3$lambda$2$lambda$1(view);
                break;
        }
    }
}
